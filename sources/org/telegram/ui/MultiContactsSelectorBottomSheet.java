package org.telegram.ui;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
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
import org.telegram.ui.Components.MessageContainsEmojiButton;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.Premium.boosts.adapters.SelectorAdapter;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorHeaderCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.recyclerview.LinearSmoothScrollerCustom;

public final class MultiContactsSelectorBottomSheet extends BottomSheetWithRecyclerListView {
    public static MultiContactsSelectorBottomSheet instance;
    public final AnonymousClass6 actionButton;
    public final LinkedHashMap allSelectedObjects;
    public final ArrayList contactsLetters;
    public final HashMap contactsMap;
    public final Boolean filterBots;
    public final Boolean filterPremium;
    public final ArrayList foundUsers;
    public final AnonymousClass3 headerView;
    public final ArrayList hints;
    public final ArrayList items;
    public int lastRequestId;
    public int listPaddingTop;
    public final int maxCount;
    public final ArrayList oldItems;
    public String query;
    public float recipientsBtnExtraSpace;
    public AnonymousClass2 recipientsBtnSpaceSpan;
    public final LaunchActivity.AnonymousClass18 remoteSearchRunnable;
    public final AnonymousClass4 searchField;
    public final QrActivity.AnonymousClass2 sectionCell;
    public final HashSet selectedIds;
    public SelectorAdapter selectorAdapter;
    public final SelectorListener selectorListener;

    public final class AnonymousClass3 extends SelectorHeaderCell {
        @Override
        public final int getHeaderHeight() {
            return getResources().getConfiguration().orientation == 2 ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(54.0f);
        }
    }

    public interface SelectorListener {
        void onUserSelected(ArrayList arrayList);
    }

    public MultiContactsSelectorBottomSheet(BaseFragment baseFragment, int i, Boolean bool, Boolean bool2, SelectorListener selectorListener) {
        super(baseFragment.getParentActivity(), baseFragment, true, false, false, baseFragment.getResourceProvider());
        this.oldItems = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.items = arrayList;
        HashSet hashSet = new HashSet();
        this.selectedIds = hashSet;
        ArrayList arrayList2 = new ArrayList();
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
        this.remoteSearchRunnable = new LaunchActivity.AnonymousClass18(this, 16);
        this.maxCount = i;
        this.filterBots = bool;
        this.filterPremium = bool2;
        this.selectorListener = selectorListener;
        this.actionBar.setTitle(getTitle());
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(getContext(), this.resourcesProvider);
        this.headerView = anonymousClass3;
        anonymousClass3.setOnCloseClickListener(new MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda1(this, 0));
        anonymousClass3.setText(getTitle());
        anonymousClass3.setCloseImageVisible(false);
        anonymousClass3.backDrawable.setRotation(0.0f, false);
        this.recipientsBtnSpaceSpan = new AnonymousClass2(this, 0);
        ?? r12 = new SelectorSearchCell(getContext(), this.resourcesProvider) {
            public boolean isKeyboardVisible;

            @Override
            public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                super.onLayout(z, i2, i3, i4, i5);
                int iDp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
                MultiContactsSelectorBottomSheet multiContactsSelectorBottomSheet = MultiContactsSelectorBottomSheet.this;
                multiContactsSelectorBottomSheet.listPaddingTop = iDp;
                SelectorAdapter selectorAdapter = multiContactsSelectorBottomSheet.selectorAdapter;
                ArrayList arrayList5 = selectorAdapter.items;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    selectorAdapter.notifyItemChanged(selectorAdapter.items.size() - 1);
                }
                if (this.isKeyboardVisible != multiContactsSelectorBottomSheet.isKeyboardVisible()) {
                    boolean zIsKeyboardVisible = multiContactsSelectorBottomSheet.isKeyboardVisible();
                    this.isKeyboardVisible = zIsKeyboardVisible;
                    if (zIsKeyboardVisible) {
                        LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(multiContactsSelectorBottomSheet.getContext(), 2, 0.6f);
                        linearSmoothScrollerCustom.mTargetPosition = 1;
                        linearSmoothScrollerCustom.offset = AndroidUtilities.dp(36.0f);
                        multiContactsSelectorBottomSheet.recyclerListView.getLayoutManager().startSmoothScroll(linearSmoothScrollerCustom);
                    }
                }
            }
        };
        this.searchField = r12;
        int i2 = Theme.key_dialogBackground;
        r12.setBackgroundColor(getThemedColor(i2));
        r12.setOnSearchTextChange(new PollItemMenu$$ExternalSyntheticLambda14(this, 20));
        r12.editText.setHintText(LocaleController.getString(R.string.Search), false);
        QrActivity.AnonymousClass2 anonymousClass2 = new QrActivity.AnonymousClass2(this, getContext(), 23);
        this.sectionCell = anonymousClass2;
        ViewGroup viewGroup = this.containerView;
        int i3 = this.backgroundPaddingLeft;
        viewGroup.addView(anonymousClass3, 0, LayoutHelper.createFrameMarginPx(-2.0f, 55, i3, 0, i3, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i4 = this.backgroundPaddingLeft;
        viewGroup2.addView((View) r12, LayoutHelper.createFrameMarginPx(-2.0f, 55, i4, 0, i4, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i5 = this.backgroundPaddingLeft;
        viewGroup3.addView(anonymousClass2, LayoutHelper.createFrameMarginPx(1.0f, 55, i5, 0, i5, 0));
        GradientHeaderActivity.AnonymousClass5 anonymousClass5 = new GradientHeaderActivity.AnonymousClass5(getContext(), this.resourcesProvider, (RecyclerListView) null);
        anonymousClass5.setClickable(true);
        anonymousClass5.setOrientation(1);
        anonymousClass5.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        anonymousClass5.setBackgroundColor(Theme.getColor(i2, this.resourcesProvider));
        ?? r8 = new ButtonWithCounterView(getContext(), this.resourcesProvider) {
            @Override
            public final float calculateCounterWidth(float f, float f2) {
                MultiContactsSelectorBottomSheet multiContactsSelectorBottomSheet = MultiContactsSelectorBottomSheet.this;
                boolean z = multiContactsSelectorBottomSheet.recipientsBtnExtraSpace == 0.0f;
                multiContactsSelectorBottomSheet.recipientsBtnExtraSpace = f;
                if (z) {
                    multiContactsSelectorBottomSheet.recipientsBtnSpaceSpan = new AnonymousClass2(multiContactsSelectorBottomSheet, 0);
                    multiContactsSelectorBottomSheet.updateActionButton$4(false);
                }
                return f;
            }
        };
        this.actionButton = r8;
        r8.setOnClickListener(new MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda0(this, 1));
        anonymousClass5.addView((View) r8, LayoutHelper.createLinear(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i6 = this.backgroundPaddingLeft;
        viewGroup4.addView(anonymousClass5, LayoutHelper.createFrameMarginPx(-2.0f, 87, i6, 0, i6, 0));
        SelectorAdapter selectorAdapter = this.selectorAdapter;
        RecyclerListView recyclerListView = this.recyclerListView;
        selectorAdapter.items = arrayList;
        selectorAdapter.listView = recyclerListView;
        int i7 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i7, 0, i7, AndroidUtilities.dp(60.0f));
        this.recyclerListView.addOnScrollListener(new LocationActivity.AnonymousClass10(this, 29));
        this.recyclerListView.setOnItemClickListener(new LaunchActivity$$ExternalSyntheticLambda9(this, i, 13));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.delayAnimations = false;
        defaultItemAnimator.mSupportsChangeAnimations = false;
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        this.recyclerListView.addItemDecoration(new MessageSeenView.AnonymousClass2(this, 6));
        r12.setText("");
        r12.spansContainer.removeAllSpans(false);
        r12.updateSpans(false, hashSet, new MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda1(this, 1), null);
        anonymousClass3.setText(getTitle());
        updateActionButton$4(false);
        arrayList2.addAll(ContactsController.getInstance(this.currentAccount).contacts);
        map.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
        arrayList4.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
        arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).hints);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).webapps);
        }
        updateList$2(false, true);
        fixNavigationBar();
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        SelectorAdapter selectorAdapter = new SelectorAdapter(getContext(), this.resourcesProvider, true);
        this.selectorAdapter = selectorAdapter;
        selectorAdapter.isGreenSelector = true;
        return selectorAdapter;
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        AndroidUtilities.hideKeyboard(getEditText());
        super.lambda$showGiftOfferSheet$15();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        instance = null;
        AndroidUtilities.cancelRunOnUIThread(this.remoteSearchRunnable);
    }

    public final boolean filter(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.filterBots;
        if (bool != null && UserObject.isBot(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.filterPremium;
        return bool2 == null || user.premium == bool2.booleanValue();
    }

    @Override
    public final CharSequence getTitle() {
        Boolean bool = this.filterBots;
        if (bool == null || !bool.booleanValue()) {
            return LocaleController.getString(R.string.ChooseUsers);
        }
        return LocaleController.getString(this.maxCount > 1 ? R.string.ChooseBots : R.string.ChooseBot);
    }

    public final void lambda$new$2$17$1() {
        SelectorListener selectorListener;
        HashSet hashSet = this.selectedIds;
        if (hashSet.size() == 0 || (selectorListener = this.selectorListener) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (TLRPC.User user : this.allSelectedObjects.values()) {
            if (hashSet.contains(Long.valueOf(user.id))) {
                arrayList.add(Long.valueOf(user.id));
            }
        }
        selectorListener.onUserSelected(arrayList);
        AndroidUtilities.hideKeyboard(getEditText());
        super.lambda$showGiftOfferSheet$15();
    }

    public final void lambda$new$4(int i, View view) {
        if (view instanceof SelectorUserCell) {
            TLRPC.User user = ((SelectorUserCell) view).getUser();
            long j = user.id;
            HashSet hashSet = this.selectedIds;
            if (hashSet.contains(Long.valueOf(j))) {
                hashSet.remove(Long.valueOf(j));
            } else {
                hashSet.add(Long.valueOf(j));
                this.allSelectedObjects.put(Long.valueOf(j), user);
            }
            if (hashSet.size() == i + 1) {
                hashSet.remove(Long.valueOf(j));
                new BulletinFactory(this.container, this.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.chats_infotip, 36, LocaleController.formatPluralString("BotMultiContactsSelectorLimit", this.maxCount, new Object[0])).show(true);
                try {
                    this.container.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda1 multiContactsSelectorBottomSheet$$ExternalSyntheticLambda1 = new MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda1(this, 2);
            AnonymousClass4 anonymousClass4 = this.searchField;
            anonymousClass4.updateSpans(true, hashSet, multiContactsSelectorBottomSheet$$ExternalSyntheticLambda1, null);
            updateList$2(true, false);
            if (TextUtils.isEmpty(this.query)) {
                return;
            }
            this.query = null;
            anonymousClass4.setText("");
            AndroidUtilities.cancelRunOnUIThread(this.remoteSearchRunnable);
            updateItems(true, true);
        }
    }

    public final void loadData(String str) {
        TLRPC.User user;
        if (this.lastRequestId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.lastRequestId, true);
            this.lastRequestId = -1;
        }
        Boolean bool = this.filterBots;
        boolean z = bool != null && bool.booleanValue();
        OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13 = new OAuthSheet$$ExternalSyntheticLambda13(15, this, str);
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
        oAuthSheet$$ExternalSyntheticLambda13.run(arrayList);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateItems(false, true);
    }

    @Override
    public final void onPreDraw(Canvas canvas, int i) {
        float f = AndroidUtilities.statusBarHeight;
        AnonymousClass3 anonymousClass3 = this.headerView;
        anonymousClass3.setTranslationY(Math.max(i, (((anonymousClass3.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + f) + AndroidUtilities.dp(8.0f));
        float translationY = anonymousClass3.getTranslationY() + anonymousClass3.getMeasuredHeight();
        AnonymousClass4 anonymousClass4 = this.searchField;
        anonymousClass4.setTranslationY(translationY);
        float translationY2 = anonymousClass4.getTranslationY() + anonymousClass4.getMeasuredHeight();
        QrActivity.AnonymousClass2 anonymousClass2 = this.sectionCell;
        anonymousClass2.setTranslationY(translationY2);
        this.recyclerListView.setTranslationY((anonymousClass2.getMeasuredHeight() + (anonymousClass4.getMeasuredHeight() + anonymousClass3.getMeasuredHeight())) - AndroidUtilities.dp(8.0f));
    }

    public final void updateActionButton$4(boolean z) {
        AnonymousClass6 anonymousClass6 = this.actionButton;
        anonymousClass6.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.selectedIds;
        if (hashSet.size() == 0) {
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
        anonymousClass6.setCount(hashSet.size(), true);
        anonymousClass6.setText(spannableStringBuilder, z, false);
        anonymousClass6.setEnabled(true);
    }

    public final void updateItems(boolean z, boolean z2) {
        float f;
        int iDp;
        long j;
        float f2;
        int iDp2;
        long j2;
        SelectorAdapter selectorAdapter;
        ArrayList arrayList = this.oldItems;
        arrayList.clear();
        ArrayList arrayList2 = this.items;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        boolean zIsEmpty = TextUtils.isEmpty(this.query);
        HashSet hashSet = this.selectedIds;
        if (zIsEmpty) {
            ArrayList arrayList3 = this.hints;
            if (arrayList3.isEmpty()) {
                f = 32.0f;
                iDp = 0;
            } else {
                ArrayList arrayList4 = new ArrayList();
                int size = arrayList3.size();
                int i = 0;
                iDp = 0;
                while (i < size) {
                    Object obj = arrayList3.get(i);
                    i++;
                    int i2 = size;
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (!user.self && !user.bot && !UserObject.isService(user.id) && !UserObject.isDeleted(user) && filter(user)) {
                        iDp += AndroidUtilities.dp(56.0f);
                        arrayList4.add(SelectorAdapter.Item.asUser(user, hashSet.contains(Long.valueOf(user.id))));
                    }
                    size = i2;
                }
                f = 32.0f;
                if (!arrayList4.isEmpty()) {
                    iDp += AndroidUtilities.dp(32.0f);
                    String string = LocaleController.getString(R.string.GiftPremiumFrequentContacts);
                    SelectorAdapter.Item item = new SelectorAdapter.Item(8, false);
                    item.text = string;
                    arrayList2.add(item);
                    arrayList2.addAll(arrayList4);
                }
            }
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            Boolean bool = this.filterBots;
            if (bool == null || !bool.booleanValue()) {
                j = clientUserId;
                f2 = 56.0f;
            } else {
                ArrayList arrayList5 = new ArrayList();
                ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
                int size2 = allDialogs.size();
                int i3 = 0;
                while (i3 < size2) {
                    TLRPC.Dialog dialog = allDialogs.get(i3);
                    i3++;
                    TLRPC.Dialog dialog2 = dialog;
                    if (dialog2.id < 0) {
                        j2 = clientUserId;
                    } else {
                        j2 = clientUserId;
                        TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog2.id));
                        if (filter(user2)) {
                            iDp += AndroidUtilities.dp(56.0f);
                            arrayList5.add(SelectorAdapter.Item.asUser(user2, hashSet.contains(Long.valueOf(user2.id))));
                        }
                    }
                    clientUserId = j2;
                }
                j = clientUserId;
                f2 = 56.0f;
                if (!arrayList5.isEmpty()) {
                    iDp += AndroidUtilities.dp(f);
                    String string2 = LocaleController.getString(R.string.SearchApps);
                    SelectorAdapter.Item item2 = new SelectorAdapter.Item(8, false);
                    item2.text = string2;
                    arrayList2.add(item2);
                    arrayList2.addAll(arrayList5);
                }
            }
            ArrayList arrayList6 = this.contactsLetters;
            int size3 = arrayList6.size();
            iDp2 = iDp;
            int i4 = 0;
            while (i4 < size3) {
                Object obj2 = arrayList6.get(i4);
                i4++;
                String str = (String) obj2;
                ArrayList arrayList7 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.contactsMap.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        if (tL_contact.user_id != j) {
                            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
                            if (filter(user3)) {
                                iDp2 += AndroidUtilities.dp(f2);
                                arrayList7.add(SelectorAdapter.Item.asUser(user3, hashSet.contains(Long.valueOf(user3.id))));
                            }
                        }
                    }
                    if (!arrayList7.isEmpty()) {
                        iDp2 += AndroidUtilities.dp(f);
                        String upperCase = str.toUpperCase();
                        SelectorAdapter.Item item3 = new SelectorAdapter.Item(7, false);
                        item3.text = upperCase;
                        arrayList2.add(item3);
                        arrayList2.addAll(arrayList7);
                    }
                }
            }
        } else {
            ArrayList arrayList8 = this.foundUsers;
            int size4 = arrayList8.size();
            int i5 = 0;
            iDp2 = 0;
            while (i5 < size4) {
                Object obj3 = arrayList8.get(i5);
                i5++;
                TLRPC.User user4 = (TLRPC.User) obj3;
                iDp2 += AndroidUtilities.dp(56.0f);
                arrayList2.add(SelectorAdapter.Item.asUser(user4, hashSet.contains(Long.valueOf(user4.id))));
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new SelectorAdapter.Item(5, false));
            iDp2 += AndroidUtilities.dp(150.0f);
        }
        int iMax = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - iDp2);
        SelectorAdapter.Item item4 = new SelectorAdapter.Item(-1, false);
        item4.padHeight = iMax;
        arrayList2.add(item4);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                SelectorAdapter selectorAdapter2 = this.selectorAdapter;
                MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda0 multiContactsSelectorBottomSheet$$ExternalSyntheticLambda0 = new MultiContactsSelectorBottomSheet$$ExternalSyntheticLambda0(this, 0);
                GraySectionCell graySectionCell = selectorAdapter2.topSectionCell;
                if (graySectionCell != null) {
                    graySectionCell.setRightText(LocaleController.getString(R.string.UsersDeselectAll), multiContactsSelectorBottomSheet$$ExternalSyntheticLambda0);
                }
            } else {
                GraySectionCell graySectionCell2 = this.selectorAdapter.topSectionCell;
                if (graySectionCell2 != null) {
                    graySectionCell2.setRightText(null);
                }
            }
        }
        if (!z2 || (selectorAdapter = this.selectorAdapter) == null) {
            return;
        }
        if (z) {
            selectorAdapter.setItems(arrayList, arrayList2);
        } else {
            selectorAdapter.mObservable.notifyChanged();
        }
    }

    public final void updateList$2(boolean z, boolean z2) {
        int childAdapterPosition;
        updateItems(z, z2);
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            RecyclerListView recyclerListView = this.recyclerListView;
            if (i >= recyclerListView.getChildCount()) {
                break;
            }
            View childAt = recyclerListView.getChildAt(i);
            if ((childAt instanceof SelectorUserCell) && (childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt)) > 0) {
                if (i2 == -1) {
                    i2 = childAdapterPosition;
                }
                int i4 = childAdapterPosition - 1;
                if (i4 >= 0) {
                    ArrayList arrayList = this.items;
                    if (i4 < arrayList.size()) {
                        SelectorAdapter.Item item = (SelectorAdapter.Item) arrayList.get(i4);
                        SelectorUserCell selectorUserCell = (SelectorUserCell) childAt;
                        selectorUserCell.setChecked(item.checked, z);
                        TLRPC.Chat chat = item.chat;
                        if (chat != null) {
                            selectorUserCell.setCheckboxAlpha(this.selectorAdapter.getParticipantsCount$2(chat) > 200 ? 0.3f : 1.0f, z);
                        } else {
                            selectorUserCell.setCheckboxAlpha(1.0f, z);
                        }
                    }
                }
                i3 = childAdapterPosition;
            }
            i++;
        }
        if (z) {
            this.selectorAdapter.mObservable.notifyItemRangeChanged(0, i2, null);
            SelectorAdapter selectorAdapter = this.selectorAdapter;
            selectorAdapter.mObservable.notifyItemRangeChanged(i3, selectorAdapter.getItemCount() - i3, null);
        }
        updateActionButton$4(z);
    }

    public final class AnonymousClass2 extends ReplacementSpan {
        public final int $r8$classId;
        public final KeyEvent.Callback this$0;

        public AnonymousClass2(KeyEvent.Callback callback, int i) {
            this.$r8$classId = i;
            this.this$0 = callback;
        }

        @Override
        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            int i6 = this.$r8$classId;
        }

        @Override
        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            switch (this.$r8$classId) {
                case 0:
                    return (int) ((MultiContactsSelectorBottomSheet) this.this$0).recipientsBtnExtraSpace;
                case 1:
                    return ((MessageContainsEmojiButton) this.this$0).lastLineMargin;
                default:
                    return (int) ((UserSelectorBottomSheet) this.this$0).recipientsBtnExtraSpace;
            }
        }

        private final void draw$org$telegram$ui$Components$MessageContainsEmojiButton$2(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        }

        private final void draw$org$telegram$ui$Components$Premium$boosts$UserSelectorBottomSheet$3(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        }

        private final void draw$org$telegram$ui$MultiContactsSelectorBottomSheet$2(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        }
    }
}
