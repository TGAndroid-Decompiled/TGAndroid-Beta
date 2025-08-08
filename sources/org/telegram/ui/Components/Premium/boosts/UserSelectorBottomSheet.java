package org.telegram.ui.Components.Premium.boosts;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearSmoothScrollerCustom;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.adapters.SelectorAdapter;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorBtnCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorHeaderCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class UserSelectorBottomSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    private static UserSelectorBottomSheet instance;
    private final ButtonWithCounterView actionButton;
    private final HashMap allSelectedObjects;
    private BirthdayController.BirthdayState birthdays;
    private final FrameLayout bulletinContainer;
    private final SelectorBtnCell buttonContainer;
    private final List contacts;
    private final List contactsLetters;
    private final Map contactsMap;
    private String customTitle;
    private final HashSet excludeUserIds;
    private final SelectorHeaderCell headerView;
    private final List hints;
    private boolean includeTonOption;
    private boolean isHintSearchText;
    private final ArrayList items;
    private int listPaddingTop;
    private final ArrayList oldItems;
    private Runnable onShareCallLinkListener;
    private Utilities.Callback onUserSelectedListener;
    private Utilities.Callback2 onUsersSelectedListener;
    private final List paymentOptions;
    private String query;
    private float recipientsBtnExtraSpace;
    private ReplacementSpan recipientsBtnSpaceSpan;
    private final Runnable remoteSearchRunnable;
    private int runningRequest;
    private final SelectorSearchCell searchField;
    private final ArrayList searchResult;
    private final View sectionCell;
    private final HashSet selectedIds;
    private SelectorAdapter selectorAdapter;
    private int tonDays;
    private Drawable tonIcon;
    public int type;
    private long userId;
    private CheckBox2 videoCheckbox;

    public static UserSelectorBottomSheet open() {
        return open(0L, null);
    }

    public static UserSelectorBottomSheet open(long j, BirthdayController.BirthdayState birthdayState) {
        return open(0, j, birthdayState);
    }

    public static UserSelectorBottomSheet open(final int i, long j, BirthdayController.BirthdayState birthdayState) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return null;
        }
        UserSelectorBottomSheet userSelectorBottomSheet = instance;
        if (userSelectorBottomSheet != null) {
            return userSelectorBottomSheet;
        }
        UserSelectorBottomSheet userSelectorBottomSheet2 = new UserSelectorBottomSheet(lastFragment.getContext(), lastFragment.getCurrentAccount(), j, birthdayState, i, true, lastFragment.getResourceProvider()) {
        };
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(lastFragment)) {
            userSelectorBottomSheet2.makeAttached(lastFragment);
        }
        lastFragment.showDialog(userSelectorBottomSheet2);
        instance = userSelectorBottomSheet2;
        return userSelectorBottomSheet2;
    }

    public static boolean handleIntent(Intent intent, Browser.Progress progress) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data == null || (scheme = data.getScheme()) == null) {
            return false;
        }
        if (scheme.equals("http") || scheme.equals("https")) {
            String lowerCase = data.getHost().toLowerCase();
            if ((!lowerCase.equals("telegram.me") && !lowerCase.equals("t.me") && !lowerCase.equals("telegram.dog")) || (path = data.getPath()) == null || !path.startsWith("/premium_multigift")) {
                return false;
            }
            open();
            return true;
        }
        if (!scheme.equals("tg")) {
            return false;
        }
        String uri = data.toString();
        if (!uri.startsWith("tg:premium_multigift") && !uri.startsWith("tg://premium_multigift")) {
            return false;
        }
        open();
        return true;
    }

    private void cancelSearch() {
        if (this.runningRequest >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.runningRequest, true);
            this.runningRequest = -1;
        }
    }

    public void search(String str) {
        cancelSearch();
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        this.runningRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                UserSelectorBottomSheet.this.lambda$search$1(tLObject, tL_error);
            }
        });
    }

    public void lambda$search$1(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.this.lambda$search$0(tLObject);
            }
        });
    }

    public void lambda$search$0(TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        this.searchResult.clear();
        this.runningRequest = -1;
        if (tLObject instanceof TLRPC.TL_contacts_found) {
            TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            messagesController.putUsers(tL_contacts_found.users, false);
            messagesController.putChats(tL_contacts_found.chats, false);
            HashSet hashSet = new HashSet();
            Iterator<TLRPC.Peer> it = tL_contacts_found.my_results.iterator();
            while (it.hasNext()) {
                long peerDialogId = DialogObject.getPeerDialogId(it.next());
                if (!hashSet.contains(Long.valueOf(peerDialogId)) && (userOrChat2 = messagesController.getUserOrChat(peerDialogId)) != null) {
                    this.searchResult.add(userOrChat2);
                    hashSet.add(Long.valueOf(peerDialogId));
                }
            }
            Iterator<TLRPC.Peer> it2 = tL_contacts_found.results.iterator();
            while (it2.hasNext()) {
                long peerDialogId2 = DialogObject.getPeerDialogId(it2.next());
                if (!hashSet.contains(Long.valueOf(peerDialogId2)) && (userOrChat = messagesController.getUserOrChat(peerDialogId2)) != null) {
                    this.searchResult.add(userOrChat);
                    hashSet.add(Long.valueOf(peerDialogId2));
                }
            }
        }
        updateList(true, true);
    }

    private void checkEditTextHint() {
        int i;
        if (!this.selectedIds.isEmpty() || (i = this.type) == 1 || i == 2 || i == 3 || i == 4) {
            if (this.isHintSearchText) {
                return;
            }
            this.isHintSearchText = true;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    UserSelectorBottomSheet.this.lambda$checkEditTextHint$2();
                }
            }, 10L);
            return;
        }
        if (this.isHintSearchText) {
            this.isHintSearchText = false;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    UserSelectorBottomSheet.this.lambda$checkEditTextHint$3();
                }
            }, 10L);
        }
    }

    public void lambda$checkEditTextHint$2() {
        this.searchField.setHintText(LocaleController.getString(R.string.Search), true);
    }

    public void lambda$checkEditTextHint$3() {
        this.searchField.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
    }

    public void createRecipientsBtnSpaceSpan() {
        this.recipientsBtnSpaceSpan = new ReplacementSpan() {
            @Override
            public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            }

            @Override
            public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                return (int) UserSelectorBottomSheet.this.recipientsBtnExtraSpace;
            }
        };
    }

    public UserSelectorBottomSheet(Context context, final int i, long j, BirthdayController.BirthdayState birthdayState, final int i2, boolean z, final Theme.ResourcesProvider resourcesProvider) {
        super(context, null, z, false, false, resourcesProvider);
        this.oldItems = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.items = arrayList;
        HashSet hashSet = new HashSet();
        this.selectedIds = hashSet;
        this.contacts = new ArrayList();
        this.hints = new ArrayList();
        this.searchResult = new ArrayList();
        this.contactsMap = new HashMap();
        this.contactsLetters = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.allSelectedObjects = linkedHashMap;
        this.listPaddingTop = AndroidUtilities.dp(120.0f);
        this.paymentOptions = new ArrayList();
        this.isHintSearchText = false;
        this.remoteSearchRunnable = new Runnable() {
            @Override
            public void run() {
                String str = UserSelectorBottomSheet.this.query;
                if (str != null) {
                    UserSelectorBottomSheet.this.search(str);
                }
            }
        };
        this.runningRequest = -1;
        this.excludeUserIds = new HashSet();
        this.currentAccount = i;
        int i3 = Theme.key_dialogBackground;
        fixNavigationBar(Theme.getColor(i3, resourcesProvider));
        this.drawDoubleNavigationBar = false;
        this.type = i2;
        this.birthdays = birthdayState;
        SelectorAdapter selectorAdapter = this.selectorAdapter;
        if (selectorAdapter != null) {
            selectorAdapter.setNeedChecks2(needChecks());
        }
        this.userId = j;
        if (j != 0 && !hashSet.contains(Long.valueOf(j))) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            hashSet.add(Long.valueOf(user.id));
            linkedHashMap.put(Long.valueOf(user.id), user);
        }
        SelectorHeaderCell selectorHeaderCell = new SelectorHeaderCell(getContext(), resourcesProvider) {
            @Override
            protected int getHeaderHeight() {
                if (getResources().getConfiguration().orientation == 2) {
                    return AndroidUtilities.dp(48.0f);
                }
                return AndroidUtilities.dp(54.0f);
            }
        };
        this.headerView = selectorHeaderCell;
        selectorHeaderCell.setOnCloseClickListener(new UserSelectorBottomSheet$$ExternalSyntheticLambda3(this));
        selectorHeaderCell.setText(getTitle());
        selectorHeaderCell.setCloseImageVisible(false);
        selectorHeaderCell.backDrawable.setRotation(0.0f, false);
        createRecipientsBtnSpaceSpan();
        SelectorSearchCell selectorSearchCell = new SelectorSearchCell(getContext(), resourcesProvider, null) {
            private boolean isKeyboardVisible;

            @Override
            protected void onLayout(boolean z2, int i4, int i5, int i6, int i7) {
                super.onLayout(z2, i4, i5, i6, i7);
                UserSelectorBottomSheet.this.listPaddingTop = getMeasuredHeight() + AndroidUtilities.dp(64.0f);
                UserSelectorBottomSheet.this.selectorAdapter.notifyChangedLast();
                if (this.isKeyboardVisible != UserSelectorBottomSheet.this.isKeyboardVisible()) {
                    boolean isKeyboardVisible = UserSelectorBottomSheet.this.isKeyboardVisible();
                    this.isKeyboardVisible = isKeyboardVisible;
                    if (isKeyboardVisible) {
                        UserSelectorBottomSheet.this.scrollToTop(true);
                    }
                }
            }
        };
        this.searchField = selectorSearchCell;
        selectorSearchCell.setBackgroundColor(getThemedColor(i3));
        selectorSearchCell.setOnSearchTextChange(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                UserSelectorBottomSheet.this.onSearch((String) obj);
            }
        });
        selectorSearchCell.setHintText(LocaleController.getString((!hashSet.isEmpty() || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) ? R.string.Search : R.string.GiftPremiumUsersSearchHint), false);
        View view = new View(getContext()) {
            @Override
            protected void onDraw(Canvas canvas) {
                canvas.drawColor(UserSelectorBottomSheet.this.getThemedColor(Theme.key_graySection));
            }
        };
        this.sectionCell = view;
        ViewGroup viewGroup = this.containerView;
        int i4 = this.backgroundPaddingLeft;
        viewGroup.addView(selectorHeaderCell, 0, LayoutHelper.createFrameMarginPx(-1, -2.0f, 55, i4, 0, i4, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i5 = this.backgroundPaddingLeft;
        viewGroup2.addView(selectorSearchCell, LayoutHelper.createFrameMarginPx(-1, -2.0f, 55, i5, 0, i5, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i6 = this.backgroundPaddingLeft;
        viewGroup3.addView(view, LayoutHelper.createFrameMarginPx(-1, 1.0f, 55, i6, 0, i6, 0));
        SelectorBtnCell selectorBtnCell = new SelectorBtnCell(getContext(), resourcesProvider, null);
        this.buttonContainer = selectorBtnCell;
        selectorBtnCell.setClickable(true);
        selectorBtnCell.setOrientation(1);
        selectorBtnCell.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        selectorBtnCell.setBackgroundColor(Theme.getColor(i3, resourcesProvider));
        if (i2 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(Theme.createRadSelectorDrawable(getThemedColor(Theme.key_listSelector), 6, 6));
            CheckBox2 checkBox2 = new CheckBox2(context, 24, resourcesProvider);
            this.videoCheckbox = checkBox2;
            checkBox2.setColor(Theme.key_featuredStickers_addButton, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
            this.videoCheckbox.setDrawUnchecked(true);
            this.videoCheckbox.setChecked(false, false);
            this.videoCheckbox.setDrawBackgroundAsArc(10);
            linearLayout.addView(this.videoCheckbox, LayoutHelper.createLinear(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
            ScaleStateListAnimator.apply(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    UserSelectorBottomSheet.this.lambda$new$4(view2);
                }
            });
            selectorBtnCell.addView(linearLayout, LayoutHelper.createLinear(-2, -2, 17, 0, 0, 0, 8));
        }
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), resourcesProvider) {
            @Override
            protected float calculateCounterWidth(float f, float f2) {
                boolean z2 = UserSelectorBottomSheet.this.recipientsBtnExtraSpace == 0.0f;
                UserSelectorBottomSheet.this.recipientsBtnExtraSpace = f;
                if (z2) {
                    UserSelectorBottomSheet.this.createRecipientsBtnSpaceSpan();
                    UserSelectorBottomSheet.this.updateActionButton(false);
                }
                return f;
            }
        };
        this.actionButton = buttonWithCounterView;
        if (i2 == 4) {
            selectorBtnCell.setAlpha(0.0f);
            selectorBtnCell.setVisibility(8);
        }
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                UserSelectorBottomSheet.this.lambda$new$5(view2);
            }
        });
        selectorBtnCell.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 87));
        if (i2 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i7 = this.backgroundPaddingLeft;
            viewGroup4.addView(selectorBtnCell, LayoutHelper.createFrameMarginPx(-1, -2.0f, 87, i7, 0, i7, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.bulletinContainer = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i8 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, LayoutHelper.createFrameMarginPx(-1, 300.0f, 87, i8, 0, i8, AndroidUtilities.dp(68.0f)));
        this.selectorAdapter.setData(arrayList, this.recyclerListView);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i9 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i9, 0, i9, AndroidUtilities.dp(i2 != 1 ? 60.0f : 0.0f));
        this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(UserSelectorBottomSheet.this.searchField.getEditText());
                }
            }
        });
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view2, int i10) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view2, i10);
            }

            @Override
            public void onDoubleTap(View view2, int i10, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view2, i10, f, f2);
            }

            @Override
            public final void onItemClick(View view2, int i10, float f, float f2) {
                UserSelectorBottomSheet.this.lambda$new$8(i2, resourcesProvider, i, view2, i10, f, f2);
            }
        });
        if (i2 == 4) {
            this.recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListenerExtended() {
                @Override
                public final boolean onItemClick(View view2, int i10, float f, float f2) {
                    boolean lambda$new$11;
                    lambda$new$11 = UserSelectorBottomSheet.this.lambda$new$11(i2, view2, i10, f, f2);
                    return lambda$new$11;
                }

                @Override
                public void onLongClickRelease() {
                    RecyclerListView.OnItemLongClickListenerExtended.CC.$default$onLongClickRelease(this);
                }

                @Override
                public void onMove(float f, float f2) {
                    RecyclerListView.OnItemLongClickListenerExtended.CC.$default$onMove(this, f, f2);
                }
            });
        }
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        this.recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.State state) {
                super.getItemOffsets(rect, view2, recyclerView, state);
                if (recyclerView.getChildAdapterPosition(view2) == UserSelectorBottomSheet.this.items.size()) {
                    rect.bottom = UserSelectorBottomSheet.this.listPaddingTop;
                }
            }
        });
        selectorSearchCell.setText("");
        selectorSearchCell.spansContainer.removeAllSpans(false);
        selectorSearchCell.updateSpans(false, hashSet, new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.this.lambda$new$12();
            }
        }, null);
        selectorHeaderCell.setText(getTitle());
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setTitle(getTitle());
        }
        updateActionButton(false);
        initContacts(false);
        initHints(false);
        updateList(false, true);
        if (i2 == 0 || i2 == 2) {
            BoostRepository.loadGiftOptions(i, null, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    UserSelectorBottomSheet.this.lambda$new$13((List) obj);
                }
            });
        }
        if (i2 == 0 || i2 == 2) {
            StarsController.getInstance(i).loadStarGifts();
        }
    }

    public void lambda$new$4(View view) {
        this.videoCheckbox.setChecked(!r3.isChecked(), true);
    }

    public void lambda$new$5(View view) {
        next();
    }

    public void lambda$new$8(int i, Theme.ResourcesProvider resourcesProvider, int i2, View view, int i3, float f, float f2) {
        boolean z = false;
        if (view instanceof TextCell) {
            if (i == 4) {
                Runnable runnable = this.onShareCallLinkListener;
                if (runnable != null) {
                    runnable.run();
                    lambda$new$0();
                    return;
                }
                return;
            }
            openBirthdaySetup();
            return;
        }
        if (view instanceof SelectorUserCell) {
            SelectorUserCell selectorUserCell = (SelectorUserCell) view;
            TLRPC.User user = selectorUserCell.getUser();
            TLRPC.Chat chat = selectorUserCell.getChat();
            if (user == null && chat == null && i == 3) {
                Utilities.Callback callback = this.onUserSelectedListener;
                if (callback != null) {
                    callback.run(-99L);
                    return;
                }
                return;
            }
            if (user == null && chat == null) {
                return;
            }
            long j = user != null ? user.id : -chat.id;
            if (i == 3) {
                Utilities.Callback callback2 = this.onUserSelectedListener;
                if (callback2 != null) {
                    callback2.run(Long.valueOf(j));
                    return;
                }
                return;
            }
            if (i == 1) {
                SelectorSearchCell selectorSearchCell = this.searchField;
                if (selectorSearchCell != null) {
                    AndroidUtilities.hideKeyboard(selectorSearchCell.getEditText());
                }
                StarsIntroActivity.GiftStarsSheet giftStarsSheet = new StarsIntroActivity.GiftStarsSheet(getContext(), resourcesProvider, user, new UserSelectorBottomSheet$$ExternalSyntheticLambda3(this));
                if (!AndroidUtilities.isTablet()) {
                    giftStarsSheet.makeAttached(this.attachedFragment);
                }
                giftStarsSheet.show();
                return;
            }
            if (i == 0 || i == 2) {
                if (UserObject.areGiftsDisabled(j)) {
                    BulletinFactory.of(this.container, resourcesProvider).createSimpleBulletin(R.raw.error, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j)))).show();
                    return;
                }
                GiftSheet giftSheet = new GiftSheet(getContext(), i2, j, BoostRepository.filterGiftOptionsByBilling(BoostRepository.filterGiftOptions(this.paymentOptions, 1)), new UserSelectorBottomSheet$$ExternalSyntheticLambda3(this));
                BirthdayController.BirthdayState birthdayState = this.birthdays;
                if (birthdayState != null && birthdayState.contains(j)) {
                    z = true;
                }
                giftSheet.setBirthday(z).show();
                return;
            }
            if (i == 4 && this.selectedIds.isEmpty()) {
                this.selectedIds.add(Long.valueOf(j));
                Utilities.Callback2 callback22 = this.onUsersSelectedListener;
                if (callback22 != null) {
                    CheckBox2 checkBox2 = this.videoCheckbox;
                    if (checkBox2 != null && checkBox2.isChecked()) {
                        z = true;
                    }
                    callback22.run(Boolean.valueOf(z), this.selectedIds);
                    this.onUsersSelectedListener = null;
                }
                lambda$new$0();
                return;
            }
            boolean z2 = (i == 4 && this.selectedIds.isEmpty()) ? false : true;
            if (this.selectedIds.contains(Long.valueOf(j))) {
                this.selectedIds.remove(Long.valueOf(j));
            } else {
                this.selectedIds.add(Long.valueOf(j));
                this.allSelectedObjects.put(Long.valueOf(j), user);
            }
            if (this.selectedIds.size() == getLimit() + 1) {
                this.selectedIds.remove(Long.valueOf(j));
                showMaximumUsersToast();
                return;
            }
            boolean z3 = (i == 4 && this.selectedIds.isEmpty()) ? false : true;
            if (z2 != z3) {
                this.buttonContainer.setVisibility(0);
                this.buttonContainer.animate().alpha(z3 ? 1.0f : 0.0f).translationY(z3 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).withEndAction(!z3 ? new Runnable() {
                    @Override
                    public final void run() {
                        UserSelectorBottomSheet.this.lambda$new$6();
                    }
                } : null).start();
                this.selectorAdapter.setCallButtonsVisible(!z3);
            }
            checkEditTextHint();
            this.searchField.updateSpans(true, this.selectedIds, new Runnable() {
                @Override
                public final void run() {
                    UserSelectorBottomSheet.this.lambda$new$7();
                }
            }, null);
            updateList(true, true);
            clearSearchAfterSelect();
        }
    }

    public void lambda$new$6() {
        this.buttonContainer.setVisibility(8);
    }

    public void lambda$new$7() {
        checkEditTextHint();
        updateList(true, false);
    }

    public boolean lambda$new$11(int i, View view, int i2, float f, float f2) {
        if (!(view instanceof SelectorUserCell)) {
            return false;
        }
        SelectorUserCell selectorUserCell = (SelectorUserCell) view;
        TLRPC.User user = selectorUserCell.getUser();
        long j = user != null ? user.id : -selectorUserCell.getChat().id;
        boolean z = (i == 4 && this.selectedIds.isEmpty()) ? false : true;
        if (this.selectedIds.contains(Long.valueOf(j))) {
            this.selectedIds.remove(Long.valueOf(j));
        } else {
            this.selectedIds.add(Long.valueOf(j));
            this.allSelectedObjects.put(Long.valueOf(j), user);
        }
        if (this.selectedIds.size() == getLimit() + 1) {
            this.selectedIds.remove(Long.valueOf(j));
            showMaximumUsersToast();
            return true;
        }
        boolean z2 = (i == 4 && this.selectedIds.isEmpty()) ? false : true;
        if (z != z2) {
            this.buttonContainer.setVisibility(0);
            this.buttonContainer.animate().alpha(z2 ? 1.0f : 0.0f).translationY(z2 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).withEndAction(!z2 ? new Runnable() {
                @Override
                public final void run() {
                    UserSelectorBottomSheet.this.lambda$new$9();
                }
            } : null).start();
            this.selectorAdapter.setCallButtonsVisible(!z2);
        }
        checkEditTextHint();
        this.searchField.updateSpans(true, this.selectedIds, new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.this.lambda$new$10();
            }
        }, null);
        updateList(true, true);
        clearSearchAfterSelect();
        return true;
    }

    public void lambda$new$9() {
        this.buttonContainer.setVisibility(8);
    }

    public void lambda$new$10() {
        checkEditTextHint();
        updateList(true, false);
    }

    public void lambda$new$12() {
        checkEditTextHint();
        updateList(true, false);
    }

    public void lambda$new$13(List list) {
        this.paymentOptions.clear();
        this.paymentOptions.addAll(list);
        if (this.actionButton.isLoading()) {
            this.actionButton.setLoading(false);
            if (this.recyclerListView.isAttachedToWindow()) {
                next();
            }
        }
    }

    private void initContacts(boolean z) {
        if (this.contacts.isEmpty()) {
            this.contacts.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.contactsMap.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.contactsLetters.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z) {
                updateItems(true, true);
            }
        }
    }

    private void initHints(boolean z) {
        if (this.hints.isEmpty()) {
            this.hints.addAll(MediaDataController.getInstance(this.currentAccount).hints);
            if (z) {
                updateItems(true, true);
            }
        }
    }

    @Override
    protected void onPreDraw(Canvas canvas, int i, float f) {
        this.headerView.setTranslationY(Math.max(i, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f));
        this.searchField.setTranslationY(this.headerView.getTranslationY() + this.headerView.getMeasuredHeight());
        this.sectionCell.setTranslationY(this.searchField.getTranslationY() + this.searchField.getMeasuredHeight());
        this.recyclerListView.setTranslationY(((this.headerView.getMeasuredHeight() + this.searchField.getMeasuredHeight()) + this.sectionCell.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
    }

    private void next() {
        int i;
        boolean z = false;
        if (this.selectedIds.size() != 0) {
            if (!this.paymentOptions.isEmpty() || (i = this.type) == 0 || i == 2 || i == 4) {
                ArrayList arrayList = new ArrayList();
                for (TLRPC.User user : this.allSelectedObjects.values()) {
                    if (this.selectedIds.contains(Long.valueOf(user.id))) {
                        arrayList.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.searchField.getEditText());
                int i2 = this.type;
                if (i2 == 1) {
                    return;
                }
                if (i2 == 4) {
                    Utilities.Callback2 callback2 = this.onUsersSelectedListener;
                    if (callback2 != null) {
                        CheckBox2 checkBox2 = this.videoCheckbox;
                        if (checkBox2 != null && checkBox2.isChecked()) {
                            z = true;
                        }
                        callback2.run(Boolean.valueOf(z), this.selectedIds);
                        this.onUsersSelectedListener = null;
                    }
                    lambda$new$0();
                    return;
                }
                List filterGiftOptionsByBilling = BoostRepository.filterGiftOptionsByBilling(BoostRepository.filterGiftOptions(this.paymentOptions, arrayList.size()));
                if (arrayList.size() == 1) {
                    long j = ((TLRPC.User) arrayList.get(0)).id;
                    if (UserObject.areGiftsDisabled(j)) {
                        BulletinFactory.of(this.container, this.resourcesProvider).createSimpleBulletin(R.raw.error, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j)))).show();
                        return;
                    }
                    GiftSheet giftSheet = new GiftSheet(getContext(), this.currentAccount, j, filterGiftOptionsByBilling, new UserSelectorBottomSheet$$ExternalSyntheticLambda3(this));
                    BirthdayController.BirthdayState birthdayState = this.birthdays;
                    if (birthdayState != null && birthdayState.contains(j)) {
                        z = true;
                    }
                    giftSheet.setBirthday(z).show();
                }
            }
        }
    }

    public void scrollToTop(boolean z) {
        if (z) {
            LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(getContext(), 2, 0.6f);
            linearSmoothScrollerCustom.setTargetPosition(1);
            linearSmoothScrollerCustom.setOffset(AndroidUtilities.dp(36.0f));
            this.recyclerListView.getLayoutManager().startSmoothScroll(linearSmoothScrollerCustom);
            return;
        }
        this.recyclerListView.scrollToPosition(0);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.giftsToUserSent);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.reloadHints);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.giftsToUserSent);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.reloadHints);
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        instance = null;
        AndroidUtilities.cancelRunOnUIThread(this.remoteSearchRunnable);
    }

    protected int getLimit() {
        if (this.type == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.excludeUserIds.size()) - 1);
        }
        return 10;
    }

    private void showMaximumUsersToast() {
        String string;
        if (this.type == 4) {
            string = LocaleController.formatPluralStringComma("UserSelectorLimit", getLimit());
        } else {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        }
        BulletinFactory.of(this.container, this.resourcesProvider).createSimpleBulletin(R.raw.chats_infotip, string).show(true);
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    private void updateList(boolean z, boolean z2) {
        updateItems(z, z2);
        updateCheckboxes(z);
        updateActionButton(z);
    }

    private void updateCheckboxes(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet.updateCheckboxes(boolean):void");
    }

    public void updateActionButton(boolean z) {
        this.actionButton.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.type == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (this.selectedIds.size() == 0) {
            if (LocaleController.isRTL) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.recipientsBtnSpaceSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.recipientsBtnSpaceSpan, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
            }
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumProceedBtn", R.string.GiftPremiumProceedBtn));
        }
        this.actionButton.setCount(this.selectedIds.size(), true);
        this.actionButton.setText(spannableStringBuilder, z, false);
        this.actionButton.setEnabled(this.selectedIds.size() > 0);
    }

    public void onSearch(String str) {
        this.query = str;
        AndroidUtilities.cancelRunOnUIThread(this.remoteSearchRunnable);
        AndroidUtilities.runOnUIThread(this.remoteSearchRunnable, 350L);
    }

    private void clearSearchAfterSelect() {
        if (isSearching()) {
            this.query = null;
            this.searchField.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.remoteSearchRunnable);
            updateItems(true, true);
        }
    }

    private boolean isSearching() {
        return !TextUtils.isEmpty(this.query);
    }

    private SelectorAdapter.Item decorate(SelectorAdapter.Item item) {
        if (this.type == 4) {
            TLRPC.User user = item.user;
            if (user == null) {
                return item;
            }
            final long j = user.id;
            return item.withCall(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    UserSelectorBottomSheet.this.lambda$decorate$14(j, view);
                }
            }, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    UserSelectorBottomSheet.this.lambda$decorate$15(j, view);
                }
            });
        }
        return item.withOptions(openOptions(item.user));
    }

    public void lambda$decorate$14(long j, View view) {
        this.selectedIds.add(Long.valueOf(j));
        Utilities.Callback2 callback2 = this.onUsersSelectedListener;
        if (callback2 != null) {
            callback2.run(Boolean.FALSE, this.selectedIds);
            this.onUsersSelectedListener = null;
        }
        lambda$new$0();
    }

    public void lambda$decorate$15(long j, View view) {
        this.selectedIds.add(Long.valueOf(j));
        Utilities.Callback2 callback2 = this.onUsersSelectedListener;
        if (callback2 != null) {
            callback2.run(Boolean.TRUE, this.selectedIds);
            this.onUsersSelectedListener = null;
        }
        lambda$new$0();
    }

    private int addSection(ArrayList arrayList, CharSequence charSequence, ArrayList arrayList2, boolean z) {
        int i = 0;
        if (arrayList2.isEmpty()) {
            return 0;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            if (user != null && !user.bot && !UserObject.isService(user.id)) {
                long j = user.id;
                if (j != this.userId && !this.excludeUserIds.contains(Long.valueOf(j))) {
                    this.selectedIds.contains(Long.valueOf(user.id));
                    i += AndroidUtilities.dp(56.0f);
                    arrayList3.add(decorate(SelectorAdapter.Item.asUser(user, this.selectedIds.contains(Long.valueOf(user.id)))));
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i;
        }
        int dp = i + AndroidUtilities.dp(32.0f);
        arrayList.add(SelectorAdapter.Item.asTopSection(charSequence));
        arrayList.addAll(arrayList3);
        return dp;
    }

    public void updateItems(boolean z, boolean z2) {
        int dp;
        TLRPC.User currentUser;
        int i;
        BirthdayController.BirthdayState birthdayState;
        TLRPC.User user;
        BirthdayController.BirthdayState birthdayState2;
        SelectorAdapter selectorAdapter;
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.items.clear();
        if (isSearching()) {
            Iterator it = this.searchResult.iterator();
            i = 0;
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    if (!user2.bot && !UserObject.isService(user2.id)) {
                        long j = user2.id;
                        i += AndroidUtilities.dp(56.0f);
                        if (!this.excludeUserIds.contains(Long.valueOf(user2.id))) {
                            this.items.add(decorate(SelectorAdapter.Item.asUser(user2, this.selectedIds.contains(Long.valueOf(j)))));
                        }
                    }
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (this.type == 3 && ChatObject.isChannelAndNotMegaGroup(chat)) {
                        long j2 = -chat.id;
                        i += AndroidUtilities.dp(56.0f);
                        if (!this.excludeUserIds.contains(Long.valueOf(-chat.id))) {
                            this.items.add(SelectorAdapter.Item.asChat(chat, this.selectedIds.contains(Long.valueOf(j2))));
                        }
                    }
                }
            }
        } else {
            if (this.includeTonOption && this.type == 3) {
                if (this.tonIcon == null) {
                    CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createCircleDrawable(AndroidUtilities.dp(46.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)), getContext().getResources().getDrawable(R.drawable.ton).mutate());
                    combinedDrawable.setIconSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                    this.tonIcon = combinedDrawable;
                }
                ArrayList arrayList = this.items;
                Drawable drawable = this.tonIcon;
                String string = LocaleController.getString(R.string.Gift2ExportTONTitle);
                int i2 = this.tonDays;
                arrayList.add(SelectorAdapter.Item.asCustomUser(2, drawable, string, i2 > 0 ? LocaleController.formatPluralString("Gift2ExportTONUnlocksIn", i2, new Object[0]) : ""));
            }
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
            if (userFull == null) {
                MessagesController.getInstance(this.currentAccount).loadFullUser(UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0, true);
            }
            int i3 = this.type;
            if ((i3 == 0 || i3 == 2) && userFull != null && userFull.birthday == null) {
                dp = AndroidUtilities.dp(50.0f);
                this.items.add(SelectorAdapter.Item.asButton(1, R.drawable.menu_birthday, LocaleController.getString(R.string.GiftsBirthdaySetup)));
            } else {
                dp = 0;
            }
            if (this.onShareCallLinkListener != null && this.type == 4) {
                this.items.add(SelectorAdapter.Item.asButton(3, R.drawable.msg2_link2, LocaleController.getString(R.string.VoipConferenceShareLink)));
            }
            if (this.birthdays != null) {
                dp = dp + addSection(this.items, LocaleController.getString(R.string.BirthdayToday), this.birthdays.today, true) + addSection(this.items, LocaleController.getString(R.string.BirthdayYesterday), this.birthdays.yesterday, true) + addSection(this.items, LocaleController.getString(R.string.BirthdayTomorrow), this.birthdays.tomorrow, true);
            }
            int i4 = this.type;
            if ((i4 == 0 || i4 == 2) && (currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser()) != null) {
                this.items.add(SelectorAdapter.Item.asTopSection(LocaleController.getString(R.string.Gift2MyselfSection)));
                SelectorAdapter.Item asUser = SelectorAdapter.Item.asUser(currentUser, this.selectedIds.contains(Long.valueOf(currentUser.id)));
                asUser.subtext = LocaleController.getString(R.string.Gift2Myself);
                this.items.add(asUser);
            }
            final ArrayList arrayList2 = new ArrayList();
            SelectorAdapter.Item item = null;
            if (!this.hints.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = this.hints.iterator();
                while (it2.hasNext()) {
                    TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.TL_topPeer) it2.next()).peer.user_id));
                    if (user3 != null) {
                        long j3 = user3.id;
                        if (j3 != this.userId && !user3.self && !user3.bot && !UserObject.isService(j3) && !UserObject.isDeleted(user3) && ((birthdayState2 = this.birthdays) == null || !birthdayState2.contains(user3.id))) {
                            if (!this.excludeUserIds.contains(Long.valueOf(user3.id))) {
                                if (this.selectedIds.contains(Long.valueOf(user3.id))) {
                                    arrayList2.add(Long.valueOf(user3.id));
                                }
                                dp += AndroidUtilities.dp(56.0f);
                                arrayList3.add(decorate(SelectorAdapter.Item.asUser(user3, this.selectedIds.contains(Long.valueOf(user3.id)))));
                            }
                        }
                    }
                }
                if (!arrayList3.isEmpty()) {
                    dp += AndroidUtilities.dp(32.0f);
                    item = SelectorAdapter.Item.asTopSection(LocaleController.getString(R.string.GiftPremiumFrequentContacts));
                    this.items.add(item);
                    this.items.addAll(arrayList3);
                }
            }
            for (String str : this.contactsLetters) {
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_contact tL_contact : (List) this.contactsMap.get(str)) {
                    long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                    long j4 = tL_contact.user_id;
                    if (j4 != clientUserId && j4 != this.userId && ((birthdayState = this.birthdays) == null || !birthdayState.contains(j4))) {
                        if (!this.excludeUserIds.contains(Long.valueOf(tL_contact.user_id)) && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id))) != null && !user.bot && !UserObject.isService(user.id)) {
                            dp += AndroidUtilities.dp(56.0f);
                            if (this.selectedIds.contains(Long.valueOf(user.id))) {
                                arrayList2.add(Long.valueOf(user.id));
                            }
                            arrayList4.add(decorate(SelectorAdapter.Item.asUser(user, this.selectedIds.contains(Long.valueOf(user.id)))));
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    dp += AndroidUtilities.dp(32.0f);
                    this.items.add(SelectorAdapter.Item.asLetter(str.toUpperCase()));
                    this.items.addAll(arrayList4);
                }
            }
            if (item != null && arrayList2.size() > 0 && !this.selectedIds.isEmpty()) {
                item.withRightText(LocaleController.getString(R.string.DeselectAll), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        UserSelectorBottomSheet.this.lambda$updateItems$19(arrayList2, view);
                    }
                });
            }
            i = dp;
        }
        if (this.items.isEmpty()) {
            this.items.add(SelectorAdapter.Item.asNoUsers());
            i += AndroidUtilities.dp(150.0f);
        }
        this.items.add(SelectorAdapter.Item.asPad(Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i)));
        if (!z2 || (selectorAdapter = this.selectorAdapter) == null) {
            return;
        }
        if (z) {
            selectorAdapter.setItems(this.oldItems, this.items);
        } else {
            selectorAdapter.notifyDataSetChanged();
        }
    }

    public void lambda$updateItems$19(ArrayList arrayList, View view) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            l.longValue();
            this.selectedIds.remove(l);
            this.allSelectedObjects.remove(l);
        }
        checkEditTextHint();
        this.searchField.updateSpans(true, this.selectedIds, new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.this.lambda$updateItems$18();
            }
        }, null);
        updateList(true, true);
        clearSearchAfterSelect();
    }

    public void lambda$updateItems$18() {
        checkEditTextHint();
        updateList(true, false);
    }

    public View.OnClickListener openOptions(final TLRPC.User user) {
        if (this.type == 3) {
            return null;
        }
        return new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                UserSelectorBottomSheet.this.lambda$openOptions$22(user, view);
            }
        };
    }

    public void lambda$openOptions$22(final TLRPC.User user, View view) {
        ItemOptions.makeOptions(this.container, this.resourcesProvider, (View) view.getParent()).add(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.this.lambda$openOptions$20(user);
            }
        }).add(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.this.lambda$openOptions$21(user);
            }
        }).show();
    }

    public void lambda$openOptions$20(TLRPC.User user) {
        if (user == null) {
            return;
        }
        BaseFragment baseFragment = getBaseFragment();
        if (baseFragment == null) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            if (safeLastFragment == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            safeLastFragment.showAsSheet(new ChatActivity(bundle), bottomSheetParams);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("user_id", user.id);
        baseFragment.presentFragment(new ChatActivity(bundle2));
    }

    public void lambda$openOptions$21(TLRPC.User user) {
        if (user == null) {
            return;
        }
        BaseFragment baseFragment = getBaseFragment();
        if (baseFragment == null) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment == null) {
                return;
            }
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            safeLastFragment.showAsSheet(new ProfileActivity(bundle), bottomSheetParams);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("user_id", user.id);
        baseFragment.presentFragment(new ProfileActivity(bundle2));
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateItems(false, true);
    }

    public void setTitle(String str) {
        this.customTitle = str;
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setTitle(getTitle());
        }
        SelectorHeaderCell selectorHeaderCell = this.headerView;
        if (selectorHeaderCell != null) {
            selectorHeaderCell.setText(getTitle());
        }
    }

    public UserSelectorBottomSheet setOnShareCallLinkListener(Runnable runnable) {
        this.onShareCallLinkListener = runnable;
        updateItems(false, true);
        return this;
    }

    public void setOnUserSelector(Utilities.Callback callback) {
        this.onUserSelectedListener = callback;
    }

    public UserSelectorBottomSheet exceptUsers(long... jArr) {
        for (long j : jArr) {
            this.excludeUserIds.add(Long.valueOf(j));
        }
        updateItems(false, true);
        return this;
    }

    public UserSelectorBottomSheet exceptUsers(Collection collection) {
        this.excludeUserIds.addAll(collection);
        updateItems(false, true);
        return this;
    }

    public UserSelectorBottomSheet setOnUsersSelector(Utilities.Callback2 callback2) {
        this.onUsersSelectedListener = callback2;
        return this;
    }

    public void addTONOption(int i) {
        this.includeTonOption = true;
        this.tonDays = i;
        updateItems(false, true);
    }

    @Override
    protected CharSequence getTitle() {
        String str = this.customTitle;
        if (str != null) {
            return str;
        }
        int i = this.type;
        if (i != 0) {
            if (i == 1) {
                return LocaleController.getString(R.string.GiftStarsTitle);
            }
            if (i != 2) {
                if (i == 4) {
                    return LocaleController.getString(R.string.VoipConferenceAddPeople);
                }
                return LocaleController.getString(R.string.GiftTelegramPremiumTitle);
            }
        }
        return LocaleController.getString(R.string.GiftTelegramPremiumOrStarsTitle);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        SelectorAdapter selectorAdapter = new SelectorAdapter(getContext(), false, this.resourcesProvider);
        this.selectorAdapter = selectorAdapter;
        selectorAdapter.setGreenSelector(true);
        return this.selectorAdapter;
    }

    protected boolean needChecks() {
        return this.type == 4;
    }

    @Override
    public void lambda$new$0() {
        AndroidUtilities.hideKeyboard(this.searchField.getEditText());
        super.lambda$new$0();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.giftsToUserSent) {
            lambda$new$0();
            return;
        }
        if (i == NotificationCenter.contactsDidLoad) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    UserSelectorBottomSheet.this.lambda$didReceivedNotification$23();
                }
            });
        } else if (i == NotificationCenter.reloadHints) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    UserSelectorBottomSheet.this.lambda$didReceivedNotification$24();
                }
            });
        } else if (i == NotificationCenter.userInfoDidLoad) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    UserSelectorBottomSheet.this.lambda$didReceivedNotification$25();
                }
            });
        }
    }

    public void lambda$didReceivedNotification$23() {
        initContacts(true);
    }

    public void lambda$didReceivedNotification$24() {
        initHints(true);
    }

    public void lambda$didReceivedNotification$25() {
        updateItems(true, true);
    }

    private void openBirthdaySetup() {
        AlertsCreator.createBirthdayPickerDialog(getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                UserSelectorBottomSheet.this.lambda$openBirthdaySetup$28((TL_account.TL_birthday) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.this.lambda$openBirthdaySetup$29();
            }
        }, this.resourcesProvider).show();
    }

    public void lambda$openBirthdaySetup$28(TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        final TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
        final TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatebirthday, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                UserSelectorBottomSheet.this.lambda$openBirthdaySetup$27(userFull, tL_birthday2, tLObject, tL_error);
            }
        }, 1024);
        MessagesController.getInstance(this.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        updateItems(true, true);
    }

    public void lambda$openBirthdaySetup$27(final TLRPC.UserFull userFull, final TL_account.TL_birthday tL_birthday, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.this.lambda$openBirthdaySetup$26(tLObject, userFull, tL_birthday, tL_error);
            }
        });
    }

    public void lambda$openBirthdaySetup$26(TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            BulletinFactory.of(this.bulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.PrivacyBirthdaySetDone)).setDuration(5000).show();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            MessagesStorage.getInstance(this.currentAccount).updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (getContext() != null) {
                new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle)).setMessage(LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                return;
            }
            return;
        }
        BulletinFactory.of(this.bulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UnknownError)).show();
    }

    public void lambda$openBirthdaySetup$29() {
        if (getBaseFragment() == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        getBaseFragment().showAsSheet(new PrivacyControlActivity(11), bottomSheetParams);
    }
}
