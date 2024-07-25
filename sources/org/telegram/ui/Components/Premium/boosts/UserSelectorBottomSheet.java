package org.telegram.ui.Components.Premium.boosts;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearSmoothScrollerCustom;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ContactsController;
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
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$TL_account_updateBirthday;
import org.telegram.tgnet.TLRPC$TL_birthday;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_contact;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_premiumGiftCodeOption;
import org.telegram.tgnet.TLRPC$TL_topPeer;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.adapters.SelectorAdapter;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorBtnCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorHeaderCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
public class UserSelectorBottomSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    private static UserSelectorBottomSheet instance;
    private final ButtonWithCounterView actionButton;
    private final HashMap<Long, TLRPC$User> allSelectedObjects;
    private BirthdayController.BirthdayState birthdays;
    private final FrameLayout bulletinContainer;
    private final SelectorBtnCell buttonContainer;
    private final List<TLRPC$TL_contact> contacts;
    private final List<String> contactsLetters;
    private final Map<String, List<TLRPC$TL_contact>> contactsMap;
    private final List<TLRPC$User> foundedUsers;
    private final SelectorHeaderCell headerView;
    private final List<TLRPC$TL_topPeer> hints;
    private boolean isHintSearchText;
    private final ArrayList<SelectorAdapter.Item> items;
    private int lastRequestId;
    private int listPaddingTop;
    private final ArrayList<SelectorAdapter.Item> oldItems;
    private final List<TLRPC$TL_premiumGiftCodeOption> paymentOptions;
    private String query;
    private float recipientsBtnExtraSpace;
    private ReplacementSpan recipientsBtnSpaceSpan;
    private final Runnable remoteSearchRunnable;
    private final SelectorSearchCell searchField;
    private final View sectionCell;
    private final HashSet<Long> selectedIds;
    private SelectorAdapter selectorAdapter;
    public int type;
    private long userId;

    protected int getType() {
        throw null;
    }

    public static void open() {
        open(0L, null);
    }

    public static void open(long j, BirthdayController.BirthdayState birthdayState) {
        open(0, j, birthdayState);
    }

    public static void open(final int i, long j, BirthdayController.BirthdayState birthdayState) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null && instance == null) {
            UserSelectorBottomSheet userSelectorBottomSheet = new UserSelectorBottomSheet(lastFragment, j, birthdayState, i, true) {
                @Override
                protected int getType() {
                    return i;
                }
            };
            if (!AndroidUtilities.hasDialogOnTop(lastFragment)) {
                userSelectorBottomSheet.makeAttached(lastFragment);
            }
            lastFragment.showDialog(userSelectorBottomSheet);
            instance = userSelectorBottomSheet;
        }
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
            if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null && path.startsWith("/premium_multigift")) {
                open();
                return true;
            }
            return false;
        } else if (scheme.equals("tg")) {
            String uri = data.toString();
            if (uri.startsWith("tg:premium_multigift") || uri.startsWith("tg://premium_multigift")) {
                open();
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public void loadData(String str) {
        this.lastRequestId = BoostRepository.searchContacts(this.lastRequestId, str, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                UserSelectorBottomSheet.this.lambda$loadData$0((List) obj);
            }
        });
    }

    public void lambda$loadData$0(List list) {
        this.foundedUsers.clear();
        this.foundedUsers.addAll(list);
        updateList(true, true);
    }

    private void checkEditTextHint() {
        if (!this.selectedIds.isEmpty() || this.type == 1) {
            if (this.isHintSearchText) {
                return;
            }
            this.isHintSearchText = true;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    UserSelectorBottomSheet.this.lambda$checkEditTextHint$1();
                }
            }, 10L);
        } else if (this.isHintSearchText) {
            this.isHintSearchText = false;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    UserSelectorBottomSheet.this.lambda$checkEditTextHint$2();
                }
            }, 10L);
        }
    }

    public void lambda$checkEditTextHint$1() {
        this.searchField.setHintText(LocaleController.getString(R.string.Search), true);
    }

    public void lambda$checkEditTextHint$2() {
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

    public UserSelectorBottomSheet(BaseFragment baseFragment, long j, BirthdayController.BirthdayState birthdayState, final int i, boolean z) {
        super(baseFragment, z, false, false, baseFragment.getResourceProvider());
        this.oldItems = new ArrayList<>();
        this.items = new ArrayList<>();
        this.selectedIds = new HashSet<>();
        this.contacts = new ArrayList();
        this.hints = new ArrayList();
        this.foundedUsers = new ArrayList();
        this.contactsMap = new HashMap();
        this.contactsLetters = new ArrayList();
        this.allSelectedObjects = new LinkedHashMap();
        this.listPaddingTop = AndroidUtilities.dp(120.0f);
        this.paymentOptions = new ArrayList();
        this.isHintSearchText = false;
        this.remoteSearchRunnable = new Runnable() {
            @Override
            public void run() {
                String str = UserSelectorBottomSheet.this.query;
                if (str != null) {
                    UserSelectorBottomSheet.this.loadData(str);
                }
            }
        };
        this.type = i;
        this.birthdays = birthdayState;
        if (birthdayState != null && !birthdayState.today.isEmpty() && i == 0) {
            Iterator<TLRPC$User> it = this.birthdays.today.iterator();
            while (it.hasNext()) {
                TLRPC$User next = it.next();
                this.selectedIds.add(Long.valueOf(next.id));
                this.allSelectedObjects.put(Long.valueOf(next.id), next);
            }
        }
        this.userId = j;
        if (j != 0 && !this.selectedIds.contains(Long.valueOf(j))) {
            TLRPC$User user = baseFragment.getMessagesController().getUser(Long.valueOf(j));
            this.selectedIds.add(Long.valueOf(user.id));
            this.allSelectedObjects.put(Long.valueOf(user.id), user);
        }
        SelectorHeaderCell selectorHeaderCell = new SelectorHeaderCell(this, getContext(), this.resourcesProvider) {
            @Override
            protected int getHeaderHeight() {
                if (getResources().getConfiguration().orientation == 2) {
                    return AndroidUtilities.dp(48.0f);
                }
                return AndroidUtilities.dp(54.0f);
            }
        };
        this.headerView = selectorHeaderCell;
        selectorHeaderCell.setOnCloseClickListener(new UserSelectorBottomSheet$$ExternalSyntheticLambda4(this));
        selectorHeaderCell.setText(getTitle());
        selectorHeaderCell.setCloseImageVisible(false);
        selectorHeaderCell.backDrawable.setRotation(0.0f, false);
        createRecipientsBtnSpaceSpan();
        SelectorSearchCell selectorSearchCell = new SelectorSearchCell(getContext(), this.resourcesProvider, null) {
            private boolean isKeyboardVisible;

            @Override
            protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
                super.onLayout(z2, i2, i3, i4, i5);
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
        int i2 = Theme.key_dialogBackground;
        selectorSearchCell.setBackgroundColor(getThemedColor(i2));
        selectorSearchCell.setOnSearchTextChange(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                UserSelectorBottomSheet.this.onSearch((String) obj);
            }
        });
        selectorSearchCell.setHintText(LocaleController.getString((!this.selectedIds.isEmpty() || i == 1) ? R.string.Search : R.string.GiftPremiumUsersSearchHint), false);
        View view = new View(getContext()) {
            @Override
            protected void onDraw(Canvas canvas) {
                canvas.drawColor(UserSelectorBottomSheet.this.getThemedColor(Theme.key_graySection));
            }
        };
        this.sectionCell = view;
        ViewGroup viewGroup = this.containerView;
        int i3 = this.backgroundPaddingLeft;
        viewGroup.addView(selectorHeaderCell, 0, LayoutHelper.createFrameMarginPx(-1, -2.0f, 55, i3, 0, i3, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i4 = this.backgroundPaddingLeft;
        viewGroup2.addView(selectorSearchCell, LayoutHelper.createFrameMarginPx(-1, -2.0f, 55, i4, 0, i4, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i5 = this.backgroundPaddingLeft;
        viewGroup3.addView(view, LayoutHelper.createFrameMarginPx(-1, 1.0f, 55, i5, 0, i5, 0));
        SelectorBtnCell selectorBtnCell = new SelectorBtnCell(getContext(), this.resourcesProvider, null);
        this.buttonContainer = selectorBtnCell;
        selectorBtnCell.setClickable(true);
        selectorBtnCell.setOrientation(1);
        selectorBtnCell.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        selectorBtnCell.setBackgroundColor(Theme.getColor(i2, this.resourcesProvider));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), this.resourcesProvider) {
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
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                UserSelectorBottomSheet.this.lambda$new$3(view2);
            }
        });
        selectorBtnCell.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 87));
        if (i != 1) {
            ViewGroup viewGroup4 = this.containerView;
            int i6 = this.backgroundPaddingLeft;
            viewGroup4.addView(selectorBtnCell, LayoutHelper.createFrameMarginPx(-1, -2.0f, 87, i6, 0, i6, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.bulletinContainer = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i7 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, LayoutHelper.createFrameMarginPx(-1, 300.0f, 87, i7, 0, i7, AndroidUtilities.dp(68.0f)));
        this.selectorAdapter.setData(this.items, this.recyclerListView);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i8 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i8, 0, i8, AndroidUtilities.dp(i != 1 ? 60.0f : 0.0f));
        this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i9) {
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(UserSelectorBottomSheet.this.searchField.getEditText());
                }
            }
        });
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view2, int i9) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view2, i9);
            }

            @Override
            public void onDoubleTap(View view2, int i9, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view2, i9, f, f2);
            }

            @Override
            public final void onItemClick(View view2, int i9, float f, float f2) {
                UserSelectorBottomSheet.this.lambda$new$5(i, view2, i9, f, f2);
            }
        });
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
        selectorSearchCell.updateSpans(false, this.selectedIds, new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.this.lambda$new$6();
            }
        }, null);
        selectorHeaderCell.setText(getTitle());
        updateActionButton(false);
        initContacts(false);
        initHints(false);
        updateList(false, true);
        fixNavigationBar();
        if (i == 0) {
            BoostRepository.loadGiftOptions(null, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    UserSelectorBottomSheet.this.lambda$new$7((List) obj);
                }
            });
        }
    }

    public void lambda$new$3(View view) {
        next();
    }

    public void lambda$new$5(int i, View view, int i2, float f, float f2) {
        if (view instanceof TextCell) {
            openBirthdaySetup();
        } else if (view instanceof SelectorUserCell) {
            TLRPC$User user = ((SelectorUserCell) view).getUser();
            if (i == 1) {
                SelectorSearchCell selectorSearchCell = this.searchField;
                if (selectorSearchCell != null) {
                    AndroidUtilities.hideKeyboard(selectorSearchCell.getEditText());
                }
                StarsIntroActivity.GiftStarsSheet giftStarsSheet = new StarsIntroActivity.GiftStarsSheet(getContext(), this.resourcesProvider, user, new UserSelectorBottomSheet$$ExternalSyntheticLambda4(this));
                giftStarsSheet.makeAttached(this.attachedFragment);
                giftStarsSheet.show();
                return;
            }
            long j = user.id;
            if (this.selectedIds.contains(Long.valueOf(j))) {
                this.selectedIds.remove(Long.valueOf(j));
            } else {
                this.selectedIds.add(Long.valueOf(j));
                this.allSelectedObjects.put(Long.valueOf(j), user);
            }
            if (this.selectedIds.size() == 11) {
                this.selectedIds.remove(Long.valueOf(j));
                showMaximumUsersToast();
                return;
            }
            checkEditTextHint();
            this.searchField.updateSpans(true, this.selectedIds, new Runnable() {
                @Override
                public final void run() {
                    UserSelectorBottomSheet.this.lambda$new$4();
                }
            }, null);
            updateList(true, true);
            clearSearchAfterSelect();
        }
    }

    public void lambda$new$4() {
        checkEditTextHint();
        updateList(true, false);
    }

    public void lambda$new$6() {
        checkEditTextHint();
        updateList(true, false);
    }

    public void lambda$new$7(List list) {
        this.paymentOptions.clear();
        this.paymentOptions.addAll(list);
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
        this.headerView.setTranslationY(Math.max(i, AndroidUtilities.statusBarHeight + (((this.headerView.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f)) + AndroidUtilities.dp(8.0f));
        this.searchField.setTranslationY(this.headerView.getTranslationY() + this.headerView.getMeasuredHeight());
        this.sectionCell.setTranslationY(this.searchField.getTranslationY() + this.searchField.getMeasuredHeight());
        this.recyclerListView.setTranslationY(((this.headerView.getMeasuredHeight() + this.searchField.getMeasuredHeight()) + this.sectionCell.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
    }

    private void next() {
        if (this.selectedIds.size() == 0 || this.paymentOptions.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (TLRPC$User tLRPC$User : this.allSelectedObjects.values()) {
            if (this.selectedIds.contains(Long.valueOf(tLRPC$User.id))) {
                arrayList.add(tLRPC$User);
            }
        }
        AndroidUtilities.hideKeyboard(this.searchField.getEditText());
        if (this.type == 1) {
            return;
        }
        PremiumPreviewGiftToUsersBottomSheet.show(arrayList, BoostRepository.filterGiftOptionsByBilling(BoostRepository.filterGiftOptions(this.paymentOptions, arrayList.size())));
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

    private void showMaximumUsersToast() {
        BulletinFactory.of(this.container, this.resourcesProvider).createSimpleBulletin(R.raw.chats_infotip, LocaleController.getString("BoostingSelectUpToWarningUsers", R.string.BoostingSelectUpToWarningUsers)).show(true);
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
            if ((childAt instanceof SelectorUserCell) && (childAdapterPosition = this.recyclerListView.getChildAdapterPosition(childAt)) - 1 >= 0 && childAdapterPosition2 < this.items.size()) {
                if (i == -1) {
                    i = childAdapterPosition;
                }
                SelectorAdapter.Item item = this.items.get(childAdapterPosition2);
                SelectorUserCell selectorUserCell = (SelectorUserCell) childAt;
                selectorUserCell.setChecked(item.checked, z);
                TLRPC$Chat tLRPC$Chat = item.chat;
                if (tLRPC$Chat != null) {
                    selectorUserCell.setCheckboxAlpha(this.selectorAdapter.getParticipantsCount(tLRPC$Chat) > 200 ? 0.3f : 1.0f, z);
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
        if (this.selectedIds.size() == 0) {
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
        this.actionButton.setEnabled(true);
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

    private int addSection(ArrayList<SelectorAdapter.Item> arrayList, CharSequence charSequence, final ArrayList<TLRPC$User> arrayList2, boolean z) {
        if (arrayList2.isEmpty()) {
            return 0;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<TLRPC$User> it = arrayList2.iterator();
        int i = 0;
        int i2 = 0;
        final boolean z2 = true;
        while (it.hasNext()) {
            TLRPC$User next = it.next();
            if (next != null && !next.bot && !UserObject.isService(next.id)) {
                long j = next.id;
                if (j != this.userId) {
                    if (!this.selectedIds.contains(Long.valueOf(j))) {
                        z2 = false;
                    }
                    i2++;
                    i += AndroidUtilities.dp(56.0f);
                    arrayList3.add(SelectorAdapter.Item.asUser(next, this.selectedIds.contains(Long.valueOf(next.id))).withOptions(openOptions(next)));
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i;
        }
        int dp = i + AndroidUtilities.dp(32.0f);
        SelectorAdapter.Item asTopSection = SelectorAdapter.Item.asTopSection(charSequence);
        if (z && i2 > 1) {
            asTopSection.withRightText(LocaleController.getString(z2 ? R.string.DeselectAll : R.string.SelectAll), new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    UserSelectorBottomSheet.this.lambda$addSection$9(z2, arrayList2, view);
                }
            });
        }
        arrayList.add(asTopSection);
        arrayList.addAll(arrayList3);
        return dp;
    }

    public void lambda$addSection$9(boolean z, ArrayList arrayList, View view) {
        if (z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLRPC$User tLRPC$User = (TLRPC$User) it.next();
                this.selectedIds.remove(Long.valueOf(tLRPC$User.id));
                this.allSelectedObjects.remove(Long.valueOf(tLRPC$User.id));
            }
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                TLRPC$User tLRPC$User2 = (TLRPC$User) it2.next();
                if (!this.selectedIds.contains(Long.valueOf(tLRPC$User2.id))) {
                    this.selectedIds.add(Long.valueOf(tLRPC$User2.id));
                    this.allSelectedObjects.put(Long.valueOf(tLRPC$User2.id), tLRPC$User2);
                }
            }
        }
        checkEditTextHint();
        this.searchField.updateSpans(true, this.selectedIds, new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.this.lambda$addSection$8();
            }
        }, null);
        updateList(true, true);
        clearSearchAfterSelect();
    }

    public void lambda$addSection$8() {
        checkEditTextHint();
        updateList(true, false);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void updateItems(boolean z, boolean z2) {
        int i;
        int i2;
        BirthdayController.BirthdayState birthdayState;
        BirthdayController.BirthdayState birthdayState2;
        SelectorAdapter selectorAdapter;
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.items.clear();
        if (isSearching()) {
            i2 = 0;
            for (TLRPC$User tLRPC$User : this.foundedUsers) {
                if (tLRPC$User != null && !tLRPC$User.bot && !UserObject.isService(tLRPC$User.id)) {
                    i2 += AndroidUtilities.dp(56.0f);
                    this.items.add(SelectorAdapter.Item.asUser(tLRPC$User, this.selectedIds.contains(Long.valueOf(tLRPC$User.id))).withOptions(openOptions(tLRPC$User)));
                }
            }
        } else {
            TLRPC$UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
            if (userFull == null) {
                MessagesController.getInstance(this.currentAccount).loadFullUser(UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0, true);
            }
            if (userFull == null || userFull.birthday != null) {
                i = 0;
            } else {
                i = AndroidUtilities.dp(50.0f) + 0;
                this.items.add(SelectorAdapter.Item.asButton(1, R.drawable.menu_birthday, LocaleController.getString(R.string.GiftsBirthdaySetup)));
            }
            if (this.userId >= 0) {
                MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.userId));
            }
            if (this.birthdays != null) {
                i = i + addSection(this.items, LocaleController.getString(R.string.BirthdayToday), this.birthdays.today, true) + addSection(this.items, LocaleController.getString(R.string.BirthdayYesterday), this.birthdays.yesterday, true) + addSection(this.items, LocaleController.getString(R.string.BirthdayTomorrow), this.birthdays.tomorrow, true);
            }
            SelectorAdapter.Item item = null;
            final ArrayList arrayList = new ArrayList();
            if (!this.hints.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC$TL_topPeer tLRPC$TL_topPeer : this.hints) {
                    TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tLRPC$TL_topPeer.peer.user_id));
                    if (user != null) {
                        long j = user.id;
                        if (j != this.userId && !user.self && !user.bot && !UserObject.isService(j) && !UserObject.isDeleted(user) && ((birthdayState2 = this.birthdays) == null || !birthdayState2.contains(user.id))) {
                            if (this.selectedIds.contains(Long.valueOf(user.id))) {
                                arrayList.add(Long.valueOf(user.id));
                            }
                            i += AndroidUtilities.dp(56.0f);
                            arrayList2.add(SelectorAdapter.Item.asUser(user, this.selectedIds.contains(Long.valueOf(user.id))).withOptions(openOptions(user)));
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    i += AndroidUtilities.dp(32.0f);
                    item = SelectorAdapter.Item.asTopSection(LocaleController.getString(R.string.GiftPremiumFrequentContacts));
                    this.items.add(item);
                    this.items.addAll(arrayList2);
                }
            }
            for (String str : this.contactsLetters) {
                ArrayList arrayList3 = new ArrayList();
                for (TLRPC$TL_contact tLRPC$TL_contact : this.contactsMap.get(str)) {
                    long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                    long j2 = tLRPC$TL_contact.user_id;
                    if (j2 != clientUserId && j2 != this.userId && ((birthdayState = this.birthdays) == null || !birthdayState.contains(j2))) {
                        TLRPC$User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tLRPC$TL_contact.user_id));
                        if (user2 != null && !user2.bot && !UserObject.isService(user2.id)) {
                            i += AndroidUtilities.dp(56.0f);
                            if (this.selectedIds.contains(Long.valueOf(user2.id))) {
                                arrayList.add(Long.valueOf(user2.id));
                            }
                            arrayList3.add(SelectorAdapter.Item.asUser(user2, this.selectedIds.contains(Long.valueOf(user2.id))).withOptions(openOptions(user2)));
                        }
                    }
                }
                if (!arrayList3.isEmpty()) {
                    i += AndroidUtilities.dp(32.0f);
                    this.items.add(SelectorAdapter.Item.asLetter(str.toUpperCase()));
                    this.items.addAll(arrayList3);
                }
            }
            if (item != null && arrayList.size() > 0 && !this.selectedIds.isEmpty()) {
                item.withRightText(LocaleController.getString(R.string.DeselectAll), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        UserSelectorBottomSheet.this.lambda$updateItems$11(arrayList, view);
                    }
                });
            }
            i2 = i;
        }
        if (this.items.isEmpty()) {
            this.items.add(SelectorAdapter.Item.asNoUsers());
            i2 += AndroidUtilities.dp(150.0f);
        }
        this.items.add(SelectorAdapter.Item.asPad(Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i2)));
        if (!z2 || (selectorAdapter = this.selectorAdapter) == null) {
            return;
        }
        if (z) {
            selectorAdapter.setItems(this.oldItems, this.items);
        } else {
            selectorAdapter.notifyDataSetChanged();
        }
    }

    public void lambda$updateItems$11(ArrayList arrayList, View view) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            this.selectedIds.remove(Long.valueOf(longValue));
            this.allSelectedObjects.remove(Long.valueOf(longValue));
        }
        checkEditTextHint();
        this.searchField.updateSpans(true, this.selectedIds, new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.this.lambda$updateItems$10();
            }
        }, null);
        updateList(true, true);
        clearSearchAfterSelect();
    }

    public void lambda$updateItems$10() {
        checkEditTextHint();
        updateList(true, false);
    }

    public View.OnClickListener openOptions(final TLRPC$User tLRPC$User) {
        return new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                UserSelectorBottomSheet.this.lambda$openOptions$14(tLRPC$User, view);
            }
        };
    }

    public void lambda$openOptions$14(final TLRPC$User tLRPC$User, View view) {
        ItemOptions.makeOptions(this.container, this.resourcesProvider, (View) view.getParent()).add(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.this.lambda$openOptions$12(tLRPC$User);
            }
        }).add(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.this.lambda$openOptions$13(tLRPC$User);
            }
        }).show();
    }

    public void lambda$openOptions$12(TLRPC$User tLRPC$User) {
        BaseFragment baseFragment = getBaseFragment();
        if (tLRPC$User == null || baseFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", tLRPC$User.id);
        baseFragment.showAsSheet(new ChatActivity(bundle), bottomSheetParams);
    }

    public void lambda$openOptions$13(TLRPC$User tLRPC$User) {
        BaseFragment baseFragment = getBaseFragment();
        if (tLRPC$User == null || baseFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", tLRPC$User.id);
        baseFragment.showAsSheet(new ProfileActivity(bundle), bottomSheetParams);
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateItems(false, true);
    }

    @Override
    protected CharSequence getTitle() {
        if (getType() == 1) {
            return LocaleController.getString(R.string.GiftStarsTitle);
        }
        return LocaleController.getString(R.string.GiftTelegramPremiumTitle);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        SelectorAdapter selectorAdapter = new SelectorAdapter(getContext(), getType() != 1, this.resourcesProvider);
        this.selectorAdapter = selectorAdapter;
        selectorAdapter.setGreenSelector(true);
        return this.selectorAdapter;
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
        } else if (i == NotificationCenter.contactsDidLoad) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    UserSelectorBottomSheet.this.lambda$didReceivedNotification$15();
                }
            });
        } else if (i == NotificationCenter.reloadHints) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    UserSelectorBottomSheet.this.lambda$didReceivedNotification$16();
                }
            });
        } else if (i == NotificationCenter.userInfoDidLoad) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    UserSelectorBottomSheet.this.lambda$didReceivedNotification$17();
                }
            });
        }
    }

    public void lambda$didReceivedNotification$15() {
        initContacts(true);
    }

    public void lambda$didReceivedNotification$16() {
        initHints(true);
    }

    public void lambda$didReceivedNotification$17() {
        updateItems(true, true);
    }

    private void openBirthdaySetup() {
        AlertsCreator.createBirthdayPickerDialog(getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                UserSelectorBottomSheet.this.lambda$openBirthdaySetup$20((TLRPC$TL_birthday) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.this.lambda$openBirthdaySetup$21();
            }
        }, this.resourcesProvider).show();
    }

    public void lambda$openBirthdaySetup$20(TLRPC$TL_birthday tLRPC$TL_birthday) {
        TLRPC$TL_account_updateBirthday tLRPC$TL_account_updateBirthday = new TLRPC$TL_account_updateBirthday();
        tLRPC$TL_account_updateBirthday.flags |= 1;
        tLRPC$TL_account_updateBirthday.birthday = tLRPC$TL_birthday;
        final TLRPC$UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
        final TLRPC$TL_birthday tLRPC$TL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tLRPC$TL_birthday;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_account_updateBirthday, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                UserSelectorBottomSheet.this.lambda$openBirthdaySetup$19(userFull, tLRPC$TL_birthday2, tLObject, tLRPC$TL_error);
            }
        }, 1024);
        MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        updateItems(true, true);
    }

    public void lambda$openBirthdaySetup$19(final TLRPC$UserFull tLRPC$UserFull, final TLRPC$TL_birthday tLRPC$TL_birthday, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                UserSelectorBottomSheet.this.lambda$openBirthdaySetup$18(tLObject, tLRPC$UserFull, tLRPC$TL_birthday, tLRPC$TL_error);
            }
        });
    }

    public void lambda$openBirthdaySetup$18(TLObject tLObject, TLRPC$UserFull tLRPC$UserFull, TLRPC$TL_birthday tLRPC$TL_birthday, TLRPC$TL_error tLRPC$TL_error) {
        String str;
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            BulletinFactory.of(this.bulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.PrivacyBirthdaySetDone)).setDuration(5000).show();
            return;
        }
        if (tLRPC$UserFull != null) {
            if (tLRPC$TL_birthday == null) {
                tLRPC$UserFull.flags2 &= -33;
            } else {
                tLRPC$UserFull.flags2 |= 32;
            }
            tLRPC$UserFull.birthday = tLRPC$TL_birthday;
            MessagesStorage.getInstance(this.currentAccount).updateUserInfo(tLRPC$UserFull, false);
        }
        if (tLRPC$TL_error != null && (str = tLRPC$TL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (getContext() != null) {
                new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle)).setMessage(LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                return;
            }
            return;
        }
        BulletinFactory.of(this.bulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UnknownError)).show();
    }

    public void lambda$openBirthdaySetup$21() {
        if (getBaseFragment() == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        getBaseFragment().showAsSheet(new PrivacyControlActivity(11), bottomSheetParams);
    }
}
