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
import org.telegram.ui.recyclerview.LinearSmoothScrollerCustom;

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
        String string = data.toString();
        if (!string.startsWith("tg:premium_multigift") && !string.startsWith("tg://premium_multigift")) {
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
                UserSelectorBottomSheet.$r8$lambda$5iOPav8QqlW3dUo__kOKycxclNo(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$5iOPav8QqlW3dUo__kOKycxclNo(final UserSelectorBottomSheet userSelectorBottomSheet, final TLObject tLObject, TLRPC.TL_error tL_error) {
        userSelectorBottomSheet.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.m2661$r8$lambda$2JLkkUMBNB7wbbEXFBb_eqtjCM(this.f$0, tLObject);
            }
        });
    }

    public static void m2661$r8$lambda$2JLkkUMBNB7wbbEXFBb_eqtjCM(UserSelectorBottomSheet userSelectorBottomSheet, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        userSelectorBottomSheet.searchResult.clear();
        userSelectorBottomSheet.runningRequest = -1;
        if (tLObject instanceof TLRPC.TL_contacts_found) {
            TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
            MessagesController messagesController = MessagesController.getInstance(userSelectorBottomSheet.currentAccount);
            int i = 0;
            messagesController.putUsers(tL_contacts_found.users, false);
            messagesController.putChats(tL_contacts_found.chats, false);
            HashSet hashSet = new HashSet();
            ArrayList<TLRPC.Peer> arrayList = tL_contacts_found.my_results;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TLRPC.Peer peer = arrayList.get(i2);
                i2++;
                long peerDialogId = DialogObject.getPeerDialogId(peer);
                if (!hashSet.contains(Long.valueOf(peerDialogId)) && (userOrChat2 = messagesController.getUserOrChat(peerDialogId)) != null) {
                    userSelectorBottomSheet.searchResult.add(userOrChat2);
                    hashSet.add(Long.valueOf(peerDialogId));
                }
            }
            ArrayList<TLRPC.Peer> arrayList2 = tL_contacts_found.results;
            int size2 = arrayList2.size();
            while (i < size2) {
                TLRPC.Peer peer2 = arrayList2.get(i);
                i++;
                long peerDialogId2 = DialogObject.getPeerDialogId(peer2);
                if (!hashSet.contains(Long.valueOf(peerDialogId2)) && (userOrChat = messagesController.getUserOrChat(peerDialogId2)) != null) {
                    userSelectorBottomSheet.searchResult.add(userOrChat);
                    hashSet.add(Long.valueOf(peerDialogId2));
                }
            }
        }
        userSelectorBottomSheet.updateList(true, true);
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
                    this.f$0.searchField.setHintText(LocaleController.getString(R.string.Search), true);
                }
            }, 10L);
            return;
        }
        if (this.isHintSearchText) {
            this.isHintSearchText = false;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.searchField.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                }
            }, 10L);
        }
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
        float f;
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
                    boolean zIsKeyboardVisible = UserSelectorBottomSheet.this.isKeyboardVisible();
                    this.isKeyboardVisible = zIsKeyboardVisible;
                    if (zIsKeyboardVisible) {
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
                this.f$0.onSearch((String) obj);
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
                    UserSelectorBottomSheet.m2660$r8$lambda$QCy2m6YxxkXfCM8aJZsv7DVncM(this.f$0, view2);
                }
            });
            selectorBtnCell.addView(linearLayout, LayoutHelper.createLinear(-2, -2, 17, 0, 0, 0, 8));
        }
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), resourcesProvider) {
            @Override
            protected float calculateCounterWidth(float f2, float f3) {
                boolean z2 = UserSelectorBottomSheet.this.recipientsBtnExtraSpace == 0.0f;
                UserSelectorBottomSheet.this.recipientsBtnExtraSpace = f2;
                if (z2) {
                    UserSelectorBottomSheet.this.createRecipientsBtnSpaceSpan();
                    UserSelectorBottomSheet.this.updateActionButton(false);
                }
                return f2;
            }
        };
        this.actionButton = buttonWithCounterView;
        if (i2 == 4) {
            f = 0.0f;
            selectorBtnCell.setAlpha(0.0f);
            selectorBtnCell.setVisibility(8);
        } else {
            f = 0.0f;
        }
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.next();
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
        recyclerListView.setPadding(i9, 0, i9, AndroidUtilities.dp(i2 != 1 ? 60.0f : f));
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
            public void onDoubleTap(View view2, int i10, float f2, float f3) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view2, i10, f2, f3);
            }

            @Override
            public final void onItemClick(View view2, int i10, float f2, float f3) {
                UserSelectorBottomSheet.$r8$lambda$8kKdpjh_0OuQcaYsmX2ybR91oXc(this.f$0, i2, resourcesProvider, i, view2, i10, f2, f3);
            }
        });
        if (i2 == 4) {
            this.recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListenerExtended() {
                @Override
                public final boolean onItemClick(View view2, int i10, float f2, float f3) {
                    return UserSelectorBottomSheet.$r8$lambda$ITcvWT8lL3QlYzl2CrKlh5boNpU(this.f$0, i2, view2, i10, f2, f3);
                }

                @Override
                public void onLongClickRelease() {
                    RecyclerListView.OnItemLongClickListenerExtended.CC.$default$onLongClickRelease(this);
                }

                @Override
                public void onMove(float f2, float f3) {
                    RecyclerListView.OnItemLongClickListenerExtended.CC.$default$onMove(this, f2, f3);
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
                UserSelectorBottomSheet.m2664$r8$lambda$OVnsOhLy9pDu8q_q2MqWFXG1og(this.f$0);
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
                    UserSelectorBottomSheet.$r8$lambda$0B1faahw0cZUwrRfI5NcL5hgzP0(this.f$0, (List) obj);
                }
            });
        }
        if (i2 == 0 || i2 == 2) {
            StarsController.getInstance(i).loadStarGifts();
        }
    }

    public static void m2660$r8$lambda$QCy2m6YxxkXfCM8aJZsv7DVncM(UserSelectorBottomSheet userSelectorBottomSheet, View view) {
        CheckBox2 checkBox2 = userSelectorBottomSheet.videoCheckbox;
        checkBox2.setChecked(!checkBox2.isChecked(), true);
    }

    public static void $r8$lambda$8kKdpjh_0OuQcaYsmX2ybR91oXc(final UserSelectorBottomSheet userSelectorBottomSheet, int i, Theme.ResourcesProvider resourcesProvider, int i2, View view, int i3, float f, float f2) {
        boolean z = false;
        userSelectorBottomSheet.getClass();
        if (view instanceof TextCell) {
            if (i == 4) {
                Runnable runnable = userSelectorBottomSheet.onShareCallLinkListener;
                if (runnable != null) {
                    runnable.run();
                    userSelectorBottomSheet.dismiss();
                    return;
                }
                return;
            }
            userSelectorBottomSheet.openBirthdaySetup();
            return;
        }
        if (view instanceof SelectorUserCell) {
            SelectorUserCell selectorUserCell = (SelectorUserCell) view;
            TLRPC.User user = selectorUserCell.getUser();
            TLRPC.Chat chat = selectorUserCell.getChat();
            if (user == null && chat == null && i == 3) {
                Utilities.Callback callback = userSelectorBottomSheet.onUserSelectedListener;
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
                Utilities.Callback callback2 = userSelectorBottomSheet.onUserSelectedListener;
                if (callback2 != null) {
                    callback2.run(Long.valueOf(j));
                    return;
                }
                return;
            }
            if (i == 1) {
                SelectorSearchCell selectorSearchCell = userSelectorBottomSheet.searchField;
                if (selectorSearchCell != null) {
                    AndroidUtilities.hideKeyboard(selectorSearchCell.getEditText());
                }
                StarsIntroActivity.GiftStarsSheet giftStarsSheet = new StarsIntroActivity.GiftStarsSheet(userSelectorBottomSheet.getContext(), resourcesProvider, user, new UserSelectorBottomSheet$$ExternalSyntheticLambda3(userSelectorBottomSheet));
                if (!AndroidUtilities.isTablet()) {
                    giftStarsSheet.makeAttached(userSelectorBottomSheet.attachedFragment);
                }
                giftStarsSheet.show();
                return;
            }
            if (i == 0 || i == 2) {
                if (UserObject.areGiftsDisabled(j)) {
                    BulletinFactory.of(userSelectorBottomSheet.container, resourcesProvider).createSimpleBulletin(R.raw.error, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j)))).show();
                    return;
                }
                GiftSheet giftSheet = new GiftSheet(userSelectorBottomSheet.getContext(), i2, j, BoostRepository.filterGiftOptionsByBilling(BoostRepository.filterGiftOptions(userSelectorBottomSheet.paymentOptions, 1)), new UserSelectorBottomSheet$$ExternalSyntheticLambda12(userSelectorBottomSheet));
                BirthdayController.BirthdayState birthdayState = userSelectorBottomSheet.birthdays;
                if (birthdayState != null && birthdayState.contains(j)) {
                    z = true;
                }
                giftSheet.setBirthday(z).show();
                return;
            }
            if (i == 4 && userSelectorBottomSheet.selectedIds.isEmpty()) {
                userSelectorBottomSheet.selectedIds.add(Long.valueOf(j));
                Utilities.Callback2 callback3 = userSelectorBottomSheet.onUsersSelectedListener;
                if (callback3 != null) {
                    CheckBox2 checkBox2 = userSelectorBottomSheet.videoCheckbox;
                    if (checkBox2 != null && checkBox2.isChecked()) {
                        z = true;
                    }
                    callback3.run(Boolean.valueOf(z), userSelectorBottomSheet.selectedIds);
                    userSelectorBottomSheet.onUsersSelectedListener = null;
                }
                userSelectorBottomSheet.dismiss();
                return;
            }
            boolean z2 = (i == 4 && userSelectorBottomSheet.selectedIds.isEmpty()) ? false : true;
            if (userSelectorBottomSheet.selectedIds.contains(Long.valueOf(j))) {
                userSelectorBottomSheet.selectedIds.remove(Long.valueOf(j));
            } else {
                userSelectorBottomSheet.selectedIds.add(Long.valueOf(j));
                userSelectorBottomSheet.allSelectedObjects.put(Long.valueOf(j), user);
            }
            if (userSelectorBottomSheet.selectedIds.size() == userSelectorBottomSheet.getLimit() + 1) {
                userSelectorBottomSheet.selectedIds.remove(Long.valueOf(j));
                userSelectorBottomSheet.showMaximumUsersToast();
                return;
            }
            boolean z3 = (i == 4 && userSelectorBottomSheet.selectedIds.isEmpty()) ? false : true;
            if (z2 != z3) {
                userSelectorBottomSheet.buttonContainer.setVisibility(0);
                userSelectorBottomSheet.buttonContainer.animate().alpha(z3 ? 1.0f : 0.0f).translationY(z3 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).withEndAction(!z3 ? new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.buttonContainer.setVisibility(8);
                    }
                } : null).start();
                userSelectorBottomSheet.selectorAdapter.setCallButtonsVisible(!z3);
            }
            userSelectorBottomSheet.checkEditTextHint();
            userSelectorBottomSheet.searchField.updateSpans(true, userSelectorBottomSheet.selectedIds, new Runnable() {
                @Override
                public final void run() {
                    UserSelectorBottomSheet.m2659$r8$lambda$5XBYufr0uXpSzhX_pYwoMOYcnI(this.f$0);
                }
            }, null);
            userSelectorBottomSheet.updateList(true, true);
            userSelectorBottomSheet.clearSearchAfterSelect();
        }
    }

    public static void m2659$r8$lambda$5XBYufr0uXpSzhX_pYwoMOYcnI(UserSelectorBottomSheet userSelectorBottomSheet) {
        userSelectorBottomSheet.checkEditTextHint();
        userSelectorBottomSheet.updateList(true, false);
    }

    public static boolean $r8$lambda$ITcvWT8lL3QlYzl2CrKlh5boNpU(final UserSelectorBottomSheet userSelectorBottomSheet, int i, View view, int i2, float f, float f2) {
        userSelectorBottomSheet.getClass();
        if (!(view instanceof SelectorUserCell)) {
            return false;
        }
        SelectorUserCell selectorUserCell = (SelectorUserCell) view;
        TLRPC.User user = selectorUserCell.getUser();
        long j = user != null ? user.id : -selectorUserCell.getChat().id;
        boolean z = (i == 4 && userSelectorBottomSheet.selectedIds.isEmpty()) ? false : true;
        if (userSelectorBottomSheet.selectedIds.contains(Long.valueOf(j))) {
            userSelectorBottomSheet.selectedIds.remove(Long.valueOf(j));
        } else {
            userSelectorBottomSheet.selectedIds.add(Long.valueOf(j));
            userSelectorBottomSheet.allSelectedObjects.put(Long.valueOf(j), user);
        }
        if (userSelectorBottomSheet.selectedIds.size() == userSelectorBottomSheet.getLimit() + 1) {
            userSelectorBottomSheet.selectedIds.remove(Long.valueOf(j));
            userSelectorBottomSheet.showMaximumUsersToast();
            return true;
        }
        boolean z2 = (i == 4 && userSelectorBottomSheet.selectedIds.isEmpty()) ? false : true;
        if (z != z2) {
            userSelectorBottomSheet.buttonContainer.setVisibility(0);
            userSelectorBottomSheet.buttonContainer.animate().alpha(z2 ? 1.0f : 0.0f).translationY(z2 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).withEndAction(!z2 ? new Runnable() {
                @Override
                public final void run() {
                    this.f$0.buttonContainer.setVisibility(8);
                }
            } : null).start();
            userSelectorBottomSheet.selectorAdapter.setCallButtonsVisible(!z2);
        }
        userSelectorBottomSheet.checkEditTextHint();
        userSelectorBottomSheet.searchField.updateSpans(true, userSelectorBottomSheet.selectedIds, new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.$r8$lambda$CVcUtRSXCoulwDJffJQ4I3J1ASs(this.f$0);
            }
        }, null);
        userSelectorBottomSheet.updateList(true, true);
        userSelectorBottomSheet.clearSearchAfterSelect();
        return true;
    }

    public static void $r8$lambda$CVcUtRSXCoulwDJffJQ4I3J1ASs(UserSelectorBottomSheet userSelectorBottomSheet) {
        userSelectorBottomSheet.checkEditTextHint();
        userSelectorBottomSheet.updateList(true, false);
    }

    public static void m2664$r8$lambda$OVnsOhLy9pDu8q_q2MqWFXG1og(UserSelectorBottomSheet userSelectorBottomSheet) {
        userSelectorBottomSheet.checkEditTextHint();
        userSelectorBottomSheet.updateList(true, false);
    }

    public static void $r8$lambda$0B1faahw0cZUwrRfI5NcL5hgzP0(UserSelectorBottomSheet userSelectorBottomSheet, List list) {
        userSelectorBottomSheet.paymentOptions.clear();
        userSelectorBottomSheet.paymentOptions.addAll(list);
        if (userSelectorBottomSheet.actionButton.isLoading()) {
            userSelectorBottomSheet.actionButton.setLoading(false);
            if (userSelectorBottomSheet.recyclerListView.isAttachedToWindow()) {
                userSelectorBottomSheet.next();
            }
        }
    }

    public void initContacts(boolean z) {
        if (this.contacts.isEmpty()) {
            this.contacts.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.contactsMap.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.contactsLetters.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z) {
                updateItems(true, true);
            }
        }
    }

    public void initHints(boolean z) {
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

    public void next() {
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
                    dismiss();
                    return;
                }
                List listFilterGiftOptionsByBilling = BoostRepository.filterGiftOptionsByBilling(BoostRepository.filterGiftOptions(this.paymentOptions, arrayList.size()));
                if (arrayList.size() == 1) {
                    long j = ((TLRPC.User) arrayList.get(0)).id;
                    if (UserObject.areGiftsDisabled(j)) {
                        BulletinFactory.of(this.container, this.resourcesProvider).createSimpleBulletin(R.raw.error, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j)))).show();
                        return;
                    }
                    GiftSheet giftSheet = new GiftSheet(getContext(), this.currentAccount, j, listFilterGiftOptionsByBilling, new UserSelectorBottomSheet$$ExternalSyntheticLambda12(this));
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

    private void updateCheckboxes(boolean z) {
        int childAdapterPosition;
        int childAdapterPosition2;
        int i = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < this.recyclerListView.getChildCount(); i3++) {
            View childAt = this.recyclerListView.getChildAt(i3);
            if ((childAt instanceof SelectorUserCell) && (childAdapterPosition2 = (childAdapterPosition = this.recyclerListView.getChildAdapterPosition(childAt)) - 1) >= 0 && childAdapterPosition2 < this.items.size()) {
                if (i == -1) {
                    i = childAdapterPosition;
                }
                SelectorAdapter.Item item = (SelectorAdapter.Item) this.items.get(childAdapterPosition2);
                SelectorUserCell selectorUserCell = (SelectorUserCell) childAt;
                selectorUserCell.setChecked(item.checked, z);
                TLRPC.Chat chat = item.chat;
                if (chat != null) {
                    selectorUserCell.setCheckboxAlpha(this.selectorAdapter.getParticipantsCount(chat) > 200 ? 0.3f : 1.0f, z);
                } else {
                    selectorUserCell.setCheckboxAlpha(1.0f, z);
                }
                i2 = childAdapterPosition;
            }
        }
        if (z) {
            this.selectorAdapter.notifyItemRangeChanged(0, i);
            SelectorAdapter selectorAdapter = this.selectorAdapter;
            selectorAdapter.notifyItemRangeChanged(i2, selectorAdapter.getItemCount() - i2);
        }
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
                    UserSelectorBottomSheet.m2667$r8$lambda$cCklPGnT7INa8urQ_glO51JQvA(this.f$0, j, view);
                }
            }, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    UserSelectorBottomSheet.$r8$lambda$_JONRs_oWbd0iXglXbbIV4ay_Fw(this.f$0, j, view);
                }
            });
        }
        return item.withOptions(openOptions(item.user));
    }

    public static void m2667$r8$lambda$cCklPGnT7INa8urQ_glO51JQvA(UserSelectorBottomSheet userSelectorBottomSheet, long j, View view) {
        userSelectorBottomSheet.selectedIds.add(Long.valueOf(j));
        Utilities.Callback2 callback2 = userSelectorBottomSheet.onUsersSelectedListener;
        if (callback2 != null) {
            callback2.run(Boolean.FALSE, userSelectorBottomSheet.selectedIds);
            userSelectorBottomSheet.onUsersSelectedListener = null;
        }
        userSelectorBottomSheet.dismiss();
    }

    public static void $r8$lambda$_JONRs_oWbd0iXglXbbIV4ay_Fw(UserSelectorBottomSheet userSelectorBottomSheet, long j, View view) {
        userSelectorBottomSheet.selectedIds.add(Long.valueOf(j));
        Utilities.Callback2 callback2 = userSelectorBottomSheet.onUsersSelectedListener;
        if (callback2 != null) {
            callback2.run(Boolean.TRUE, userSelectorBottomSheet.selectedIds);
            userSelectorBottomSheet.onUsersSelectedListener = null;
        }
        userSelectorBottomSheet.dismiss();
    }

    private int addSection(ArrayList arrayList, CharSequence charSequence, ArrayList arrayList2, boolean z) {
        int i = 0;
        if (arrayList2.isEmpty()) {
            return 0;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int iDp = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user != null && !user.bot && !UserObject.isService(user.id)) {
                long j = user.id;
                if (j != this.userId && !this.excludeUserIds.contains(Long.valueOf(j))) {
                    this.selectedIds.contains(Long.valueOf(user.id));
                    iDp += AndroidUtilities.dp(56.0f);
                    arrayList3.add(decorate(SelectorAdapter.Item.asUser(user, this.selectedIds.contains(Long.valueOf(user.id)))));
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return iDp;
        }
        int iDp2 = iDp + AndroidUtilities.dp(32.0f);
        arrayList.add(SelectorAdapter.Item.asTopSection(charSequence));
        arrayList.addAll(arrayList3);
        return iDp2;
    }

    public void updateItems(boolean z, boolean z2) {
        int iDp;
        TLRPC.User currentUser;
        int iDp2;
        BirthdayController.BirthdayState birthdayState;
        TLRPC.User user;
        BirthdayController.BirthdayState birthdayState2;
        SelectorAdapter selectorAdapter;
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.items.clear();
        if (isSearching()) {
            ArrayList arrayList = this.searchResult;
            int size = arrayList.size();
            int i = 0;
            iDp2 = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    if (!user2.bot && !UserObject.isService(user2.id)) {
                        long j = user2.id;
                        iDp2 += AndroidUtilities.dp(56.0f);
                        if (!this.excludeUserIds.contains(Long.valueOf(user2.id))) {
                            this.items.add(decorate(SelectorAdapter.Item.asUser(user2, this.selectedIds.contains(Long.valueOf(j)))));
                        }
                    }
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (this.type == 3 && ChatObject.isChannelAndNotMegaGroup(chat)) {
                        long j2 = -chat.id;
                        iDp2 += AndroidUtilities.dp(56.0f);
                        if (!this.excludeUserIds.contains(Long.valueOf(-chat.id))) {
                            this.items.add(SelectorAdapter.Item.asChat(chat, this.selectedIds.contains(Long.valueOf(j2))));
                        }
                    }
                }
            }
        } else {
            if (this.includeTonOption && this.type == 3) {
                if (this.tonIcon == null) {
                    CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createCircleDrawable(AndroidUtilities.dp(46.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)), getContext().getResources().getDrawable(R.drawable.mini_gram_72).mutate());
                    combinedDrawable.setIconSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                    this.tonIcon = combinedDrawable;
                }
                ArrayList arrayList2 = this.items;
                Drawable drawable = this.tonIcon;
                String string = LocaleController.getString(R.string.Gift2ExportTONTitle);
                int i2 = this.tonDays;
                arrayList2.add(SelectorAdapter.Item.asCustomUser(2, drawable, string, i2 > 0 ? LocaleController.formatPluralString("Gift2ExportTONUnlocksIn", i2, new Object[0]) : ""));
            }
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
            if (userFull == null) {
                MessagesController.getInstance(this.currentAccount).loadFullUser(UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0, true);
            }
            int i3 = this.type;
            if ((i3 == 0 || i3 == 2) && userFull != null && userFull.birthday == null) {
                iDp = AndroidUtilities.dp(50.0f);
                this.items.add(SelectorAdapter.Item.asButton(1, R.drawable.menu_birthday, LocaleController.getString(R.string.GiftsBirthdaySetup)));
            } else {
                iDp = 0;
            }
            if (this.onShareCallLinkListener != null && this.type == 4) {
                this.items.add(SelectorAdapter.Item.asButton(3, R.drawable.msg2_link2, LocaleController.getString(R.string.VoipConferenceShareLink)));
            }
            if (this.birthdays != null) {
                iDp = iDp + addSection(this.items, LocaleController.getString(R.string.BirthdayToday), this.birthdays.today, true) + addSection(this.items, LocaleController.getString(R.string.BirthdayYesterday), this.birthdays.yesterday, true) + addSection(this.items, LocaleController.getString(R.string.BirthdayTomorrow), this.birthdays.tomorrow, true);
            }
            int i4 = this.type;
            if ((i4 == 0 || i4 == 2) && (currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser()) != null) {
                this.items.add(SelectorAdapter.Item.asTopSection(LocaleController.getString(R.string.Gift2MyselfSection)));
                SelectorAdapter.Item itemAsUser = SelectorAdapter.Item.asUser(currentUser, this.selectedIds.contains(Long.valueOf(currentUser.id)));
                itemAsUser.subtext = LocaleController.getString(R.string.Gift2Myself);
                this.items.add(itemAsUser);
            }
            final ArrayList arrayList3 = new ArrayList();
            SelectorAdapter.Item itemAsTopSection = null;
            if (!this.hints.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                Iterator it = this.hints.iterator();
                while (it.hasNext()) {
                    TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.TL_topPeer) it.next()).peer.user_id));
                    if (user3 != null) {
                        long j3 = user3.id;
                        if (j3 != this.userId && !user3.self && !user3.bot && !UserObject.isService(j3) && !UserObject.isDeleted(user3) && ((birthdayState2 = this.birthdays) == null || !birthdayState2.contains(user3.id))) {
                            if (!this.excludeUserIds.contains(Long.valueOf(user3.id))) {
                                if (this.selectedIds.contains(Long.valueOf(user3.id))) {
                                    arrayList3.add(Long.valueOf(user3.id));
                                }
                                iDp += AndroidUtilities.dp(56.0f);
                                arrayList4.add(decorate(SelectorAdapter.Item.asUser(user3, this.selectedIds.contains(Long.valueOf(user3.id)))));
                            }
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    iDp += AndroidUtilities.dp(32.0f);
                    itemAsTopSection = SelectorAdapter.Item.asTopSection(LocaleController.getString(R.string.GiftPremiumFrequentContacts));
                    this.items.add(itemAsTopSection);
                    this.items.addAll(arrayList4);
                }
            }
            for (String str : this.contactsLetters) {
                ArrayList arrayList5 = new ArrayList();
                for (TLRPC.TL_contact tL_contact : (List) this.contactsMap.get(str)) {
                    long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                    long j4 = tL_contact.user_id;
                    if (j4 != clientUserId && j4 != this.userId && ((birthdayState = this.birthdays) == null || !birthdayState.contains(j4))) {
                        if (!this.excludeUserIds.contains(Long.valueOf(tL_contact.user_id)) && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id))) != null && !user.bot && !UserObject.isService(user.id)) {
                            iDp += AndroidUtilities.dp(56.0f);
                            if (this.selectedIds.contains(Long.valueOf(user.id))) {
                                arrayList3.add(Long.valueOf(user.id));
                            }
                            arrayList5.add(decorate(SelectorAdapter.Item.asUser(user, this.selectedIds.contains(Long.valueOf(user.id)))));
                        }
                    }
                }
                if (!arrayList5.isEmpty()) {
                    iDp += AndroidUtilities.dp(32.0f);
                    this.items.add(SelectorAdapter.Item.asLetter(str.toUpperCase()));
                    this.items.addAll(arrayList5);
                }
            }
            if (itemAsTopSection != null && arrayList3.size() > 0 && !this.selectedIds.isEmpty()) {
                itemAsTopSection.withRightText(LocaleController.getString(R.string.DeselectAll), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        UserSelectorBottomSheet.$r8$lambda$c7IXqtqABYg68CS6vsYCnckBkrA(this.f$0, arrayList3, view);
                    }
                });
            }
            iDp2 = iDp;
        }
        if (this.items.isEmpty()) {
            this.items.add(SelectorAdapter.Item.asNoUsers());
            iDp2 += AndroidUtilities.dp(150.0f);
        }
        this.items.add(SelectorAdapter.Item.asPad(Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - iDp2)));
        if (!z2 || (selectorAdapter = this.selectorAdapter) == null) {
            return;
        }
        if (z) {
            selectorAdapter.setItems(this.oldItems, this.items);
        } else {
            selectorAdapter.notifyDataSetChanged();
        }
    }

    public static void $r8$lambda$c7IXqtqABYg68CS6vsYCnckBkrA(final UserSelectorBottomSheet userSelectorBottomSheet, ArrayList arrayList, View view) {
        userSelectorBottomSheet.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Long l = (Long) obj;
            l.getClass();
            userSelectorBottomSheet.selectedIds.remove(l);
            userSelectorBottomSheet.allSelectedObjects.remove(l);
        }
        userSelectorBottomSheet.checkEditTextHint();
        userSelectorBottomSheet.searchField.updateSpans(true, userSelectorBottomSheet.selectedIds, new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.$r8$lambda$MKup2kYen_qxKi642wjpMY6OkQA(this.f$0);
            }
        }, null);
        userSelectorBottomSheet.updateList(true, true);
        userSelectorBottomSheet.clearSearchAfterSelect();
    }

    public static void $r8$lambda$MKup2kYen_qxKi642wjpMY6OkQA(UserSelectorBottomSheet userSelectorBottomSheet) {
        userSelectorBottomSheet.checkEditTextHint();
        userSelectorBottomSheet.updateList(true, false);
    }

    public View.OnClickListener openOptions(final TLRPC.User user) {
        if (this.type == 3) {
            return null;
        }
        return new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                UserSelectorBottomSheet userSelectorBottomSheet = this.f$0;
                TLRPC.User user2 = user;
                ItemOptions.makeOptions(userSelectorBottomSheet.container, userSelectorBottomSheet.resourcesProvider, (View) view.getParent()).add(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable() {
                    @Override
                    public final void run() {
                        UserSelectorBottomSheet.$r8$lambda$zOcU9y4C0DOW2euf1Z5Rco_mUic(userSelectorBottomSheet, user2);
                    }
                }).add(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() {
                    @Override
                    public final void run() {
                        UserSelectorBottomSheet.m2663$r8$lambda$KTm_RzEGg85h2YWkNV_TbOqsVI(userSelectorBottomSheet, user2);
                    }
                }).show();
            }
        };
    }

    public static void $r8$lambda$zOcU9y4C0DOW2euf1Z5Rco_mUic(UserSelectorBottomSheet userSelectorBottomSheet, TLRPC.User user) {
        if (user == null) {
            userSelectorBottomSheet.getClass();
            return;
        }
        BaseFragment baseFragment = userSelectorBottomSheet.getBaseFragment();
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

    public static void m2663$r8$lambda$KTm_RzEGg85h2YWkNV_TbOqsVI(UserSelectorBottomSheet userSelectorBottomSheet, TLRPC.User user) {
        if (user == null) {
            userSelectorBottomSheet.getClass();
            return;
        }
        BaseFragment baseFragment = userSelectorBottomSheet.getBaseFragment();
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
    public void dismiss() {
        AndroidUtilities.hideKeyboard(this.searchField.getEditText());
        super.dismiss();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.giftsToUserSent) {
            dismiss();
            return;
        }
        if (i == NotificationCenter.contactsDidLoad) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.initContacts(true);
                }
            });
        } else if (i == NotificationCenter.reloadHints) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.initHints(true);
                }
            });
        } else if (i == NotificationCenter.userInfoDidLoad) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.updateItems(true, true);
                }
            });
        }
    }

    private void openBirthdaySetup() {
        AlertsCreator.createBirthdayPickerDialog(getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                UserSelectorBottomSheet.m2666$r8$lambda$XvVa3k7_RvHz84AThKMa6JQQuM(this.f$0, (TL_account.TL_birthday) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.$r8$lambda$Shasi9nP4fsIXQugTkdHsIww4dw(this.f$0);
            }
        }, false, false, this.resourcesProvider).show();
    }

    public static void m2666$r8$lambda$XvVa3k7_RvHz84AThKMa6JQQuM(final UserSelectorBottomSheet userSelectorBottomSheet, TL_account.TL_birthday tL_birthday) {
        userSelectorBottomSheet.getClass();
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        final TLRPC.UserFull userFull = MessagesController.getInstance(userSelectorBottomSheet.currentAccount).getUserFull(UserConfig.getInstance(userSelectorBottomSheet.currentAccount).getClientUserId());
        final TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        ConnectionsManager.getInstance(userSelectorBottomSheet.currentAccount).sendRequest(updatebirthday, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                UserSelectorBottomSheet.$r8$lambda$WdnFYVVN26cDj_ocEinpOtpz1pQ(this.f$0, userFull, tL_birthday2, tLObject, tL_error);
            }
        }, 1024);
        MessagesController.getInstance(userSelectorBottomSheet.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(userSelectorBottomSheet.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(userSelectorBottomSheet.currentAccount).postNotificationName(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        userSelectorBottomSheet.updateItems(true, true);
    }

    public static void $r8$lambda$WdnFYVVN26cDj_ocEinpOtpz1pQ(final UserSelectorBottomSheet userSelectorBottomSheet, final TLRPC.UserFull userFull, final TL_account.TL_birthday tL_birthday, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        userSelectorBottomSheet.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.$r8$lambda$U3G6GjWZQIACj9w13bhGTU0uDyQ(this.f$0, tLObject, userFull, tL_birthday, tL_error);
            }
        });
    }

    public static void $r8$lambda$U3G6GjWZQIACj9w13bhGTU0uDyQ(UserSelectorBottomSheet userSelectorBottomSheet, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        userSelectorBottomSheet.getClass();
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            BulletinFactory.of(userSelectorBottomSheet.bulletinContainer, userSelectorBottomSheet.resourcesProvider).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.PrivacyBirthdaySetDone)).setDuration(5000).show();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            MessagesStorage.getInstance(userSelectorBottomSheet.currentAccount).updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (userSelectorBottomSheet.getContext() != null) {
                new AlertDialog.Builder(userSelectorBottomSheet.getContext(), userSelectorBottomSheet.resourcesProvider).setTitle(LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle)).setMessage(LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                return;
            }
            return;
        }
        BulletinFactory.of(userSelectorBottomSheet.bulletinContainer, userSelectorBottomSheet.resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UnknownError)).show();
    }

    public static void $r8$lambda$Shasi9nP4fsIXQugTkdHsIww4dw(UserSelectorBottomSheet userSelectorBottomSheet) {
        if (userSelectorBottomSheet.getBaseFragment() == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        userSelectorBottomSheet.getBaseFragment().showAsSheet(new PrivacyControlActivity(11), bottomSheetParams);
    }
}
