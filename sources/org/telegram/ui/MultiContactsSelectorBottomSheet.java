package org.telegram.ui;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.adapters.SelectorAdapter;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorBtnCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorHeaderCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda9;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.recyclerview.LinearSmoothScrollerCustom;

public class MultiContactsSelectorBottomSheet extends BottomSheetWithRecyclerListView {
    private static final int BOTTOM_HEIGHT_DP = 60;
    private static MultiContactsSelectorBottomSheet instance;
    private final ButtonWithCounterView actionButton;
    private final HashMap<Long, TLRPC.User> allSelectedObjects;
    private final SelectorBtnCell buttonContainer;
    private final List<TLRPC.TL_contact> contacts;
    private final List<String> contactsLetters;
    private final Map<String, List<TLRPC.TL_contact>> contactsMap;
    private Boolean filterBots;
    private Boolean filterPremium;
    private final List<TLRPC.User> foundUsers;
    private final SelectorHeaderCell headerView;
    private final List<TLRPC.TL_topPeer> hints;
    private final ArrayList<SelectorAdapter.Item> items;
    private int lastRequestId;
    private int listPaddingTop;
    private int maxCount;
    private final ArrayList<SelectorAdapter.Item> oldItems;
    private String query;
    private float recipientsBtnExtraSpace;
    private ReplacementSpan recipientsBtnSpaceSpan;
    private final Runnable remoteSearchRunnable;
    private final SelectorSearchCell searchField;
    private final View sectionCell;
    private final HashSet<Long> selectedIds;
    private SelectorAdapter selectorAdapter;
    private SelectorListener selectorListener;

    public interface SelectorListener {
        void onUserSelected(List<Long> list);
    }

    public MultiContactsSelectorBottomSheet(BaseFragment baseFragment, boolean z, int i, Boolean bool, Boolean bool2, SelectorListener selectorListener) {
        super(baseFragment, z, false, false, baseFragment.getResourceProvider());
        this.oldItems = new ArrayList<>();
        ArrayList<SelectorAdapter.Item> arrayList = new ArrayList<>();
        this.items = arrayList;
        HashSet<Long> hashSet = new HashSet<>();
        this.selectedIds = hashSet;
        ArrayList arrayList2 = new ArrayList();
        this.contacts = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.hints = arrayList3;
        this.foundUsers = new ArrayList();
        HashMap map = new HashMap();
        this.contactsMap = map;
        ArrayList arrayList4 = new ArrayList();
        this.contactsLetters = arrayList4;
        this.allSelectedObjects = new LinkedHashMap();
        this.listPaddingTop = AndroidUtilities.dp(120.0f);
        this.lastRequestId = -1;
        this.remoteSearchRunnable = new Runnable() {
            @Override
            public void run() {
                String str = MultiContactsSelectorBottomSheet.this.query;
                if (str != null) {
                    MultiContactsSelectorBottomSheet.this.loadData(str);
                }
            }
        };
        this.maxCount = i;
        this.filterBots = bool;
        this.filterPremium = bool2;
        this.selectorListener = selectorListener;
        this.actionBar.setTitle(getTitle());
        SelectorHeaderCell selectorHeaderCell = new SelectorHeaderCell(getContext(), this.resourcesProvider) {
            @Override
            public int getHeaderHeight() {
                return getResources().getConfiguration().orientation == 2 ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(54.0f);
            }
        };
        this.headerView = selectorHeaderCell;
        selectorHeaderCell.setOnCloseClickListener(new MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda0(this, 0));
        selectorHeaderCell.setText(getTitle());
        selectorHeaderCell.setCloseImageVisible(false);
        selectorHeaderCell.backDrawable.setRotation(0.0f, false);
        createRecipientsBtnSpaceSpan();
        SelectorSearchCell selectorSearchCell = new SelectorSearchCell(getContext(), this.resourcesProvider, null) {
            private boolean isKeyboardVisible;

            @Override
            public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
                super.onLayout(z2, i2, i3, i4, i5);
                MultiContactsSelectorBottomSheet.this.listPaddingTop = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
                SelectorAdapter selectorAdapter = MultiContactsSelectorBottomSheet.this.selectorAdapter;
                ArrayList arrayList5 = selectorAdapter.items;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    selectorAdapter.lambda$onBindViewHolder$31(selectorAdapter.items.size() - 1);
                }
                if (this.isKeyboardVisible != MultiContactsSelectorBottomSheet.this.isKeyboardVisible()) {
                    boolean zIsKeyboardVisible = MultiContactsSelectorBottomSheet.this.isKeyboardVisible();
                    this.isKeyboardVisible = zIsKeyboardVisible;
                    if (zIsKeyboardVisible) {
                        MultiContactsSelectorBottomSheet.this.scrollToTop(true);
                    }
                }
            }
        };
        this.searchField = selectorSearchCell;
        int i2 = Theme.key_dialogBackground;
        selectorSearchCell.setBackgroundColor(getThemedColor(i2));
        selectorSearchCell.setOnSearchTextChange(new PollItemMenu$$ExternalSyntheticLambda15(this, 13));
        selectorSearchCell.setHintText(LocaleController.getString(R.string.Search), false);
        View view = new View(getContext()) {
            @Override
            public void onDraw(Canvas canvas) {
                canvas.drawColor(MultiContactsSelectorBottomSheet.this.getThemedColor(Theme.key_graySection));
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
            public float calculateCounterWidth(float f, float f2) {
                boolean z2 = MultiContactsSelectorBottomSheet.this.recipientsBtnExtraSpace == 0.0f;
                MultiContactsSelectorBottomSheet.this.recipientsBtnExtraSpace = f;
                if (z2) {
                    MultiContactsSelectorBottomSheet.this.createRecipientsBtnSpaceSpan();
                    MultiContactsSelectorBottomSheet.this.updateActionButton(false);
                }
                return f;
            }
        };
        this.actionButton = buttonWithCounterView;
        buttonWithCounterView.setOnClickListener(new MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda2(this, 0));
        selectorBtnCell.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i6 = this.backgroundPaddingLeft;
        viewGroup4.addView(selectorBtnCell, LayoutHelper.createFrameMarginPx(-1, -2.0f, 87, i6, 0, i6, 0));
        SelectorAdapter selectorAdapter = this.selectorAdapter;
        RecyclerListView recyclerListView = this.recyclerListView;
        selectorAdapter.items = arrayList;
        selectorAdapter.listView = recyclerListView;
        int i7 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i7, 0, i7, AndroidUtilities.dp(60.0f));
        this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
                if (i8 == 1) {
                    AndroidUtilities.hideKeyboard(MultiContactsSelectorBottomSheet.this.searchField.getEditText());
                }
            }
        });
        this.recyclerListView.setOnItemClickListener(new LaunchActivity$$ExternalSyntheticLambda23(this, i, 7));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.recyclerListView.lambda$onCellEnter$52(defaultItemAnimator);
        this.recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.State state) {
                super.getItemOffsets(rect, view2, recyclerView, state);
                if (recyclerView.getChildAdapterPosition(view2) == MultiContactsSelectorBottomSheet.this.items.size()) {
                    rect.bottom = MultiContactsSelectorBottomSheet.this.listPaddingTop;
                }
            }
        });
        selectorSearchCell.setText("");
        selectorSearchCell.spansContainer.removeAllSpans(false);
        selectorSearchCell.updateSpans(false, hashSet, new MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda0(this, 1), null);
        selectorHeaderCell.setText(getTitle());
        updateActionButton(false);
        arrayList2.addAll(ContactsController.getInstance(this.currentAccount).contacts);
        map.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
        arrayList4.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
        arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).hints);
        Boolean bool3 = this.filterBots;
        if (bool3 != null && bool3.booleanValue()) {
            arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).webapps);
        }
        updateList(false, true);
        fixNavigationBar();
    }

    private void clearSearchAfterSelect() {
        if (isSearching()) {
            this.query = null;
            this.searchField.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.remoteSearchRunnable);
            updateItems(true, true);
        }
    }

    public void createRecipientsBtnSpaceSpan() {
        this.recipientsBtnSpaceSpan = new ReplacementSpan() {
            @Override
            public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            }

            @Override
            public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                return (int) MultiContactsSelectorBottomSheet.this.recipientsBtnExtraSpace;
            }
        };
    }

    private boolean filter(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        if (this.filterBots != null && UserObject.isBot(user) != this.filterBots.booleanValue()) {
            return false;
        }
        Boolean bool = this.filterPremium;
        return bool == null || user.premium == bool.booleanValue();
    }

    private boolean isSearching() {
        return !TextUtils.isEmpty(this.query);
    }

    public void lambda$loadData$0(HashSet hashSet, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLRPC.User user = (TLRPC.User) it.next();
                if (user != null && !hashSet.contains(Long.valueOf(user.id)) && filter(user)) {
                    this.foundUsers.add(user);
                    hashSet.add(Long.valueOf(user.id));
                }
            }
        }
        updateList(true, true);
    }

    private void lambda$loadData$1(String str, List list) {
        int iSendRequest;
        HashSet hashSet = new HashSet();
        this.foundUsers.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLRPC.User user = (TLRPC.User) it.next();
                if (user != null && !hashSet.contains(Long.valueOf(user.id)) && filter(user)) {
                    this.foundUsers.add(user);
                    hashSet.add(Long.valueOf(user.id));
                }
            }
        }
        Boolean bool = this.filterBots;
        if (bool == null || !bool.booleanValue()) {
            updateList(true, true);
            return;
        }
        OAuthSheet$$ExternalSyntheticLambda1 oAuthSheet$$ExternalSyntheticLambda1 = new OAuthSheet$$ExternalSyntheticLambda1(23, this, hashSet);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        if (str == null || str.isEmpty()) {
            AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda9(oAuthSheet$$ExternalSyntheticLambda1, 1));
            iSendRequest = 0;
        } else {
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.q = str;
            tL_contacts_search.limit = 50;
            iSendRequest = connectionsManager.sendRequest(tL_contacts_search, new StarGiftSheet$$ExternalSyntheticLambda0(15, messagesController, oAuthSheet$$ExternalSyntheticLambda1));
        }
        this.lastRequestId = iSendRequest;
    }

    public void lambda$new$2(View view) {
        next();
    }

    public void lambda$new$3() {
        updateList(true, false);
    }

    public void lambda$new$4(int i, View view, int i2, float f, float f2) {
        if (view instanceof SelectorUserCell) {
            TLRPC.User user = ((SelectorUserCell) view).getUser();
            long j = user.id;
            if (this.selectedIds.contains(Long.valueOf(j))) {
                this.selectedIds.remove(Long.valueOf(j));
            } else {
                this.selectedIds.add(Long.valueOf(j));
                this.allSelectedObjects.put(Long.valueOf(j), user);
            }
            if (this.selectedIds.size() == i + 1) {
                this.selectedIds.remove(Long.valueOf(j));
                showMaximumUsersToast();
            } else {
                this.searchField.updateSpans(true, this.selectedIds, new MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda0(this, 2), null);
                updateList(true, false);
                clearSearchAfterSelect();
            }
        }
    }

    public void lambda$new$5() {
        updateList(true, false);
    }

    public void lambda$updateSectionCell$6(View view) {
        this.selectedIds.clear();
        this.searchField.spansContainer.removeAllSpans(true);
        updateList(true, false);
    }

    public void loadData(String str) {
        TLRPC.User user;
        if (this.lastRequestId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.lastRequestId, true);
            this.lastRequestId = -1;
        }
        Boolean bool = this.filterBots;
        boolean z = bool != null && bool.booleanValue();
        int i = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.TL_contact> arrayList2 = ContactsController.getInstance(i).contacts;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            ContactsController.getInstance(i).loadContacts(false, 0L);
        }
        MessagesController messagesController = MessagesController.getInstance(i);
        String lowerCase = str.toLowerCase();
        String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
        if (arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                TLRPC.TL_contact tL_contact = arrayList2.get(i2);
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && ((z || !user.bot) && !UserObject.isService(user.id) && !UserObject.isUserSelf(user))) {
                    String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                    String strTranslitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (lowerCase2.startsWith(lowerCase) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", lowerCase, lowerCase2) || strTranslitSafe2.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, strTranslitSafe2)) {
                        arrayList.add(user);
                    } else if (user.usernames != null) {
                        for (int i3 = 0; i3 < user.usernames.size(); i3++) {
                            TLRPC.TL_username tL_username = user.usernames.get(i3);
                            if (tL_username != null && tL_username.active) {
                                String lowerCase3 = tL_username.username.toLowerCase();
                                if (lowerCase3.startsWith(lowerCase) || SavedMessagesController$$ExternalSyntheticOutline0.m("_", lowerCase, lowerCase3) || lowerCase3.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, lowerCase3)) {
                                    arrayList.add(user);
                                    break;
                                }
                            }
                        }
                    } else {
                        String str2 = user.username;
                        if (str2 != null) {
                            String lowerCase4 = str2.toLowerCase();
                            if (lowerCase4.startsWith(lowerCase) || SavedMessagesController$$ExternalSyntheticOutline0.m("_", lowerCase, lowerCase4) || lowerCase4.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, lowerCase4)) {
                                arrayList.add(user);
                            }
                        }
                    }
                }
            }
        }
        lambda$loadData$1(str, arrayList);
    }

    private void next() {
        if (this.selectedIds.size() == 0 || this.selectorListener == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (TLRPC.User user : this.allSelectedObjects.values()) {
            if (this.selectedIds.contains(Long.valueOf(user.id))) {
                arrayList.add(Long.valueOf(user.id));
            }
        }
        this.selectorListener.onUserSelected(arrayList);
        lambda$showGiftOfferSheet$15();
    }

    public void onSearch(String str) {
        this.query = str;
        AndroidUtilities.cancelRunOnUIThread(this.remoteSearchRunnable);
        AndroidUtilities.runOnUIThread(this.remoteSearchRunnable, 100L);
    }

    public static MultiContactsSelectorBottomSheet open(Boolean bool, Boolean bool2, int i, SelectorListener selectorListener) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return null;
        }
        MultiContactsSelectorBottomSheet multiContactsSelectorBottomSheet = instance;
        if (multiContactsSelectorBottomSheet != null) {
            return multiContactsSelectorBottomSheet;
        }
        MultiContactsSelectorBottomSheet multiContactsSelectorBottomSheet2 = new MultiContactsSelectorBottomSheet(lastFragment, true, i, bool, bool2, selectorListener);
        multiContactsSelectorBottomSheet2.show();
        instance = multiContactsSelectorBottomSheet2;
        return multiContactsSelectorBottomSheet2;
    }

    private void showMaximumUsersToast() {
        BulletinFactory.of(this.container, this.resourcesProvider).createSimpleBulletin(R.raw.chats_infotip, LocaleController.formatPluralString("BotMultiContactsSelectorLimit", this.maxCount, new Object[0])).show(true);
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public void updateActionButton(boolean z) {
        this.actionButton.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.selectedIds.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.recipientsBtnSpaceSpan, 0, 1, 33);
            Boolean bool = this.filterBots;
            if (bool == null || !bool.booleanValue()) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ChooseUsers));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(this.maxCount > 1 ? R.string.ChooseBots : R.string.ChooseBot));
            }
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftPremiumProceedBtn));
        }
        this.actionButton.setCount(this.selectedIds.size(), true);
        this.actionButton.setText(spannableStringBuilder, z, false);
        this.actionButton.setEnabled(true);
    }

    private void updateCheckboxes(boolean z) {
        int childAdapterPosition;
        int i = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < this.recyclerListView.getChildCount(); i3++) {
            View childAt = this.recyclerListView.getChildAt(i3);
            if ((childAt instanceof SelectorUserCell) && (childAdapterPosition = this.recyclerListView.getChildAdapterPosition(childAt)) > 0) {
                if (i == -1) {
                    i = childAdapterPosition;
                }
                int i4 = childAdapterPosition - 1;
                if (i4 >= 0 && i4 < this.items.size()) {
                    SelectorAdapter.Item item = this.items.get(i4);
                    SelectorUserCell selectorUserCell = (SelectorUserCell) childAt;
                    selectorUserCell.setChecked(item.checked, z);
                    TLRPC.Chat chat = item.chat;
                    if (chat != null) {
                        selectorUserCell.setCheckboxAlpha(this.selectorAdapter.getParticipantsCount$2(chat) > 200 ? 0.3f : 1.0f, z);
                    } else {
                        selectorUserCell.setCheckboxAlpha(1.0f, z);
                    }
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

    private void updateList(boolean z, boolean z2) {
        updateItems(z, z2);
        updateCheckboxes(z);
        updateActionButton(z);
    }

    private void updateSectionCell(boolean z) {
        HashSet<Long> hashSet = this.selectedIds;
        if (hashSet == null) {
            return;
        }
        if (hashSet.size() <= 0) {
            GraySectionCell graySectionCell = this.selectorAdapter.topSectionCell;
            if (graySectionCell != null) {
                graySectionCell.setRightText(null);
                return;
            }
            return;
        }
        SelectorAdapter selectorAdapter = this.selectorAdapter;
        MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda2 multiContactsSelectorBottomSheet$$ExternalSyntheticLambda2 = new MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda2(this, 1);
        GraySectionCell graySectionCell2 = selectorAdapter.topSectionCell;
        if (graySectionCell2 != null) {
            graySectionCell2.setRightText(LocaleController.getString(R.string.UsersDeselectAll), multiContactsSelectorBottomSheet$$ExternalSyntheticLambda2);
        }
    }

    @Override
    public RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        SelectorAdapter selectorAdapter = new SelectorAdapter(getContext(), true, this.resourcesProvider);
        this.selectorAdapter = selectorAdapter;
        selectorAdapter.isGreenSelector = true;
        return selectorAdapter;
    }

    @Override
    public void lambda$showGiftOfferSheet$15() {
        AndroidUtilities.hideKeyboard(this.searchField.getEditText());
        super.lambda$showGiftOfferSheet$15();
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        instance = null;
        AndroidUtilities.cancelRunOnUIThread(this.remoteSearchRunnable);
    }

    @Override
    public CharSequence getTitle() {
        Boolean bool = this.filterBots;
        if (bool == null || !bool.booleanValue()) {
            return LocaleController.getString(R.string.ChooseUsers);
        }
        return LocaleController.getString(this.maxCount > 1 ? R.string.ChooseBots : R.string.ChooseBot);
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateItems(false, true);
    }

    @Override
    public void onPreDraw(Canvas canvas, int i, float f) {
        this.headerView.setTranslationY(Math.max(i, (((this.headerView.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight) + AndroidUtilities.dp(8.0f));
        this.searchField.setTranslationY(this.headerView.getTranslationY() + this.headerView.getMeasuredHeight());
        this.sectionCell.setTranslationY(this.searchField.getTranslationY() + this.searchField.getMeasuredHeight());
        this.recyclerListView.setTranslationY((this.sectionCell.getMeasuredHeight() + (this.searchField.getMeasuredHeight() + this.headerView.getMeasuredHeight())) - AndroidUtilities.dp(8.0f));
    }

    public void scrollToTop(boolean z) {
        if (!z) {
            this.recyclerListView.scrollToPosition(0);
            return;
        }
        LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(getContext(), 2, 0.6f);
        linearSmoothScrollerCustom.setTargetPosition(1);
        linearSmoothScrollerCustom.setOffset(AndroidUtilities.dp(36.0f));
        this.recyclerListView.getLayoutManager().startSmoothScroll(linearSmoothScrollerCustom);
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    public void updateItems(boolean z, boolean z2) {
        int iDp;
        int iDp2;
        SelectorAdapter selectorAdapter;
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.items.clear();
        if (isSearching()) {
            iDp2 = 0;
            for (TLRPC.User user : this.foundUsers) {
                iDp2 += AndroidUtilities.dp(56.0f);
                this.items.add(SelectorAdapter.Item.asUser(user, this.selectedIds.contains(Long.valueOf(user.id))));
            }
        } else {
            if (this.hints.isEmpty()) {
                iDp = 0;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<TLRPC.TL_topPeer> it = this.hints.iterator();
                iDp = 0;
                while (it.hasNext()) {
                    TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(it.next().peer.user_id));
                    if (!user2.self && !user2.bot && !UserObject.isService(user2.id) && !UserObject.isDeleted(user2) && filter(user2)) {
                        iDp += AndroidUtilities.dp(56.0f);
                        arrayList.add(SelectorAdapter.Item.asUser(user2, this.selectedIds.contains(Long.valueOf(user2.id))));
                    }
                }
                if (!arrayList.isEmpty()) {
                    iDp += AndroidUtilities.dp(32.0f);
                    ArrayList<SelectorAdapter.Item> arrayList2 = this.items;
                    String string = LocaleController.getString(R.string.GiftPremiumFrequentContacts);
                    SelectorAdapter.Item item = new SelectorAdapter.Item(8, false);
                    item.text = string;
                    arrayList2.add(item);
                    this.items.addAll(arrayList);
                }
            }
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            Boolean bool = this.filterBots;
            if (bool != null && bool.booleanValue()) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
                int size = allDialogs.size();
                int i = 0;
                while (i < size) {
                    TLRPC.Dialog dialog = allDialogs.get(i);
                    i++;
                    TLRPC.Dialog dialog2 = dialog;
                    if (dialog2.id >= 0) {
                        TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog2.id));
                        if (filter(user3)) {
                            iDp += AndroidUtilities.dp(56.0f);
                            arrayList3.add(SelectorAdapter.Item.asUser(user3, this.selectedIds.contains(Long.valueOf(user3.id))));
                        }
                    }
                }
                if (!arrayList3.isEmpty()) {
                    iDp += AndroidUtilities.dp(32.0f);
                    ArrayList<SelectorAdapter.Item> arrayList4 = this.items;
                    String string2 = LocaleController.getString(R.string.SearchApps);
                    SelectorAdapter.Item item2 = new SelectorAdapter.Item(8, false);
                    item2.text = string2;
                    arrayList4.add(item2);
                    this.items.addAll(arrayList3);
                }
            }
            iDp2 = iDp;
            for (String str : this.contactsLetters) {
                ArrayList arrayList5 = new ArrayList();
                List<TLRPC.TL_contact> list = this.contactsMap.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        if (tL_contact.user_id != clientUserId) {
                            TLRPC.User user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
                            if (filter(user4)) {
                                iDp2 += AndroidUtilities.dp(56.0f);
                                arrayList5.add(SelectorAdapter.Item.asUser(user4, this.selectedIds.contains(Long.valueOf(user4.id))));
                            }
                        }
                    }
                    if (!arrayList5.isEmpty()) {
                        iDp2 += AndroidUtilities.dp(32.0f);
                        ArrayList<SelectorAdapter.Item> arrayList6 = this.items;
                        String upperCase = str.toUpperCase();
                        SelectorAdapter.Item item3 = new SelectorAdapter.Item(7, false);
                        item3.text = upperCase;
                        arrayList6.add(item3);
                        this.items.addAll(arrayList5);
                    }
                }
            }
        }
        if (this.items.isEmpty()) {
            this.items.add(new SelectorAdapter.Item(5, false));
            iDp2 += AndroidUtilities.dp(150.0f);
        }
        int i2 = (int) (AndroidUtilities.displaySize.y * 0.6f);
        ArrayList<SelectorAdapter.Item> arrayList7 = this.items;
        int iMax = Math.max(0, i2 - iDp2);
        SelectorAdapter.Item item4 = new SelectorAdapter.Item(-1, false);
        item4.padHeight = iMax;
        arrayList7.add(item4);
        updateSectionCell(z);
        if (!z2 || (selectorAdapter = this.selectorAdapter) == null) {
            return;
        }
        if (z) {
            selectorAdapter.setItems(this.oldItems, this.items);
        } else {
            selectorAdapter.notifyDataSetChanged();
        }
    }
}
