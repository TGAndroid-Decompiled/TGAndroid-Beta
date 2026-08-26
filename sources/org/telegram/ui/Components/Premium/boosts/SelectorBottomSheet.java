package org.telegram.ui.Components.Premium.boosts;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DefaultItemAnimator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AppIconsSelectorCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.boosts.adapters.SelectorAdapter;
import org.telegram.ui.Components.Premium.boosts.cells.BoostTypeCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorBtnCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorCountryCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorHeaderCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda15;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.BotStorage$$ExternalSyntheticLambda5;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda48;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;
import org.telegram.ui.recyclerview.LinearSmoothScrollerCustom;

public final class SelectorBottomSheet extends BottomSheetWithRecyclerListView {
    public final ButtonWithCounterView actionButton;
    public final LinkedHashMap allSelectedObjects;
    public final Paint backgroundPaint;
    public final ArrayList countriesLetters;
    public final ArrayList countriesList;
    public final HashMap countriesMap;
    public final TLRPC.Chat currentChat;
    public final SelectorHeaderCell headerView;
    public final ArrayList items;
    public int listPaddingTop;
    public final ArrayList oldItems;
    public BoostPagerBottomSheet$$ExternalSyntheticLambda0 onCloseClick;
    public final HashSet openedIds;
    public final ArrayList peers;
    public String query;
    public final PeerStoriesView.AnonymousClass34 remoteSearchRunnable;
    public final AnonymousClass2 searchField;
    public final GraySectionCell sectionCell;
    public final HashSet selectedIds;
    public BoostPagerBottomSheet.AnonymousClass4 selectedObjectsListener;
    public SelectorAdapter selectorAdapter;
    public final AnimatedFloat statusBarT;
    public int top;
    public int type;
    public final ArrayList users;

    public SelectorBottomSheet(BaseFragment baseFragment, long j) {
        super(baseFragment, false, false);
        this.backgroundPaint = new Paint(1);
        this.oldItems = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.items = arrayList;
        this.selectedIds = new HashSet();
        this.openedIds = new HashSet();
        this.peers = new ArrayList();
        this.users = new ArrayList();
        this.countriesMap = new HashMap();
        this.countriesLetters = new ArrayList();
        this.countriesList = new ArrayList();
        this.allSelectedObjects = new LinkedHashMap();
        this.listPaddingTop = AndroidUtilities.dp(134.0f);
        this.remoteSearchRunnable = new PeerStoriesView.AnonymousClass34(this, 2);
        this.backgroundPaddingLeft = 0;
        this.currentChat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        ((ViewGroup) this.actionBar.getParent()).removeView(this.actionBar);
        ViewGroup viewGroup = this.containerView;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.statusBarT = new AnimatedFloat(viewGroup, 0L, 350L, cubicBezierInterpolator);
        SelectorHeaderCell selectorHeaderCell = new SelectorHeaderCell(getContext(), this.resourcesProvider);
        this.headerView = selectorHeaderCell;
        selectorHeaderCell.setOnCloseClickListener(new SelectorBottomSheet$$ExternalSyntheticLambda0(this, 7));
        selectorHeaderCell.setText(getTitle());
        selectorHeaderCell.setCloseImageVisible(true);
        selectorHeaderCell.backDrawable.setRotation(0.0f, false);
        ?? r5 = new SelectorSearchCell(getContext(), this.resourcesProvider) {
            @Override
            public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                int iDp = AndroidUtilities.dp(78.0f) + getMeasuredHeight();
                SelectorBottomSheet selectorBottomSheet = SelectorBottomSheet.this;
                selectorBottomSheet.listPaddingTop = iDp;
                SelectorAdapter selectorAdapter = selectorBottomSheet.selectorAdapter;
                ArrayList arrayList2 = selectorAdapter.items;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    return;
                }
                selectorAdapter.lambda$onBindViewHolder$31(selectorAdapter.items.size() - 1);
            }
        };
        this.searchField = r5;
        int i = Theme.key_dialogBackground;
        r5.setBackgroundColor(getThemedColor(i));
        r5.setOnSearchTextChange(new SelectorBottomSheet$$ExternalSyntheticLambda3(this, 0));
        this.sectionCell = new GraySectionCell(getContext(), 16, this.resourcesProvider);
        updateSection();
        ViewGroup viewGroup2 = this.containerView;
        int i2 = this.backgroundPaddingLeft;
        viewGroup2.addView(selectorHeaderCell, LayoutHelper.createFrameMarginPx(-1, -2.0f, 55, i2, 0, i2, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i3 = this.backgroundPaddingLeft;
        viewGroup3.addView((View) r5, LayoutHelper.createFrameMarginPx(-1, -2.0f, 55, i3, 0, i3, 0));
        SelectorBtnCell selectorBtnCell = new SelectorBtnCell(getContext(), this.resourcesProvider, null);
        selectorBtnCell.setClickable(true);
        selectorBtnCell.setOrientation(1);
        selectorBtnCell.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        selectorBtnCell.setBackgroundColor(Theme.getColor(i, this.resourcesProvider));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), true, this.resourcesProvider);
        this.actionButton = buttonWithCounterView;
        buttonWithCounterView.setOnClickListener(new SelectorBottomSheet$$ExternalSyntheticLambda4(this, 0));
        selectorBtnCell.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i4 = this.backgroundPaddingLeft;
        viewGroup4.addView(selectorBtnCell, LayoutHelper.createFrameMarginPx(-1, -2.0f, 87, i4, 0, i4, 0));
        SelectorAdapter selectorAdapter = this.selectorAdapter;
        RecyclerListView recyclerListView = this.recyclerListView;
        selectorAdapter.items = arrayList;
        selectorAdapter.listView = recyclerListView;
        int i5 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i5, 0, i5, AndroidUtilities.dp(60.0f));
        this.recyclerListView.addOnScrollListener(new StarGiftSheet.AnonymousClass8(this, 6));
        this.recyclerListView.setOnItemClickListener(new GiftSheet$$ExternalSyntheticLambda6(this, 7));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(cubicBezierInterpolator);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.recyclerListView.lambda$onCellEnter$52(defaultItemAnimator);
        this.recyclerListView.addItemDecoration(new AppIconsSelectorCell.AnonymousClass2(this, 1));
        updateList$1(false, true);
        loadData(1, null, true);
        loadData(3, null, true);
    }

    public static boolean matchLocal(TLRPC.TL_help_country tL_help_country, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (tL_help_country == null) {
            return false;
        }
        String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
        if (lowerCase.startsWith(str) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str, lowerCase)) {
            return true;
        }
        String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
        return lowerCase2.startsWith(str) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str, lowerCase2);
    }

    public final void clearSearchAfterSelectChannel() {
        if (TextUtils.isEmpty(this.query)) {
            return;
        }
        this.query = null;
        setText("");
        AndroidUtilities.cancelRunOnUIThread(this.remoteSearchRunnable);
        ArrayList arrayList = this.peers;
        arrayList.clear();
        arrayList.addAll(BoostRepository.getMyChannels(this.currentChat.id));
        updateList$1(false, false);
        updateList$1(true, true);
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        SelectorAdapter selectorAdapter = new SelectorAdapter(getContext(), true, this.resourcesProvider);
        this.selectorAdapter = selectorAdapter;
        return selectorAdapter;
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        BoostPagerBottomSheet$$ExternalSyntheticLambda0 boostPagerBottomSheet$$ExternalSyntheticLambda0 = this.onCloseClick;
        if (boostPagerBottomSheet$$ExternalSyntheticLambda0 != null) {
            boostPagerBottomSheet$$ExternalSyntheticLambda0.run();
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.remoteSearchRunnable);
    }

    @Override
    public final CharSequence getTitle() {
        int i = this.type;
        if (i == 1) {
            return LocaleController.getString(R.string.GiftPremium);
        }
        if (i != 2) {
            return i != 3 ? "" : LocaleController.getString(R.string.BoostingSelectCountry);
        }
        return LocaleController.getString(R.string.BoostingAddChannelOrGroup);
    }

    public final boolean hasChanges() {
        String string;
        HashSet hashSet = this.selectedIds;
        int size = hashSet.size();
        HashSet hashSet2 = this.openedIds;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            return false;
        }
        int i = this.type;
        Context context = getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        SelectorBottomSheet$$ExternalSyntheticLambda0 selectorBottomSheet$$ExternalSyntheticLambda0 = new SelectorBottomSheet$$ExternalSyntheticLambda0(this, 0);
        SelectorBottomSheet$$ExternalSyntheticLambda0 selectorBottomSheet$$ExternalSyntheticLambda1 = new SelectorBottomSheet$$ExternalSyntheticLambda0(this, 6);
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        builder.setTitle(LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges));
        if (i == 1) {
            string = LocaleController.getString("BoostingApplyChangesUsers", R.string.BoostingApplyChangesUsers);
        } else if (i != 2) {
            string = i != 3 ? "" : LocaleController.getString("BoostingApplyChangesCountries", R.string.BoostingApplyChangesCountries);
        } else {
            string = LocaleController.getString("BoostingApplyChangesChannels", R.string.BoostingApplyChangesChannels);
        }
        builder.setMessage(string);
        builder.setPositiveButton(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new GiftSheet$$ExternalSyntheticLambda6(selectorBottomSheet$$ExternalSyntheticLambda0, 3));
        builder.setNegativeButton(LocaleController.getString("Discard", R.string.Discard), new GiftSheet$$ExternalSyntheticLambda6(selectorBottomSheet$$ExternalSyntheticLambda1, 5));
        builder.show();
        return true;
    }

    public final void lambda$new$5$1(View view) {
        TLRPC.Chat chat;
        long j;
        long jHashCode;
        boolean z = view instanceof TextCell;
        LinkedHashMap linkedHashMap = this.allSelectedObjects;
        HashSet<Long> hashSet = this.selectedIds;
        AnonymousClass2 anonymousClass2 = this.searchField;
        if (!z) {
            if (view instanceof SelectorUserCell) {
                SelectorUserCell selectorUserCell = (SelectorUserCell) view;
                TLRPC.User user = selectorUserCell.getUser();
                TLRPC.Chat chat2 = selectorUserCell.getChat();
                long j2 = user != null ? user.id : -chat2.id;
                if (hashSet.contains(Long.valueOf(j2))) {
                    hashSet.remove(Long.valueOf(j2));
                } else {
                    hashSet.add(Long.valueOf(j2));
                    Long lValueOf = Long.valueOf(j2);
                    if (user == null) {
                        chat = user;
                        chat = chat2;
                    }
                    chat = user;
                    linkedHashMap.put(lValueOf, chat);
                }
                if (hashSet.size() != 11 || this.type != 1) {
                    j = 1;
                    if (hashSet.size() != MessagesController.getInstance(UserConfig.selectedAccount).giveawayAddPeersMax + 1 || this.type != 2) {
                        anonymousClass2.updateSpans(true, hashSet, new SelectorBottomSheet$$ExternalSyntheticLambda0(this, 1), null);
                        updateList$1(true, false);
                        if (chat2 != null && !ChatObject.isPublic(chat2) && hashSet.contains(Long.valueOf(j2))) {
                            Context context = getBaseFragment().getContext();
                            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                            RichEditor$$ExternalSyntheticLambda48 richEditor$$ExternalSyntheticLambda48 = new RichEditor$$ExternalSyntheticLambda48(this, j2, 9);
                            SelectorBottomSheet$$ExternalSyntheticLambda0 selectorBottomSheet$$ExternalSyntheticLambda0 = new SelectorBottomSheet$$ExternalSyntheticLambda0(this, 2);
                            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                            AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
                            boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat2);
                            builder.setTitle(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannel : R.string.BoostingGiveawayPrivateGroup));
                            builder.setMessage(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannelWarning : R.string.BoostingGiveawayPrivateGroupWarning));
                            builder.setPositiveButton(LocaleController.getString("Add", R.string.Add), new RateCallLayout$$ExternalSyntheticLambda1(2, atomicBoolean, selectorBottomSheet$$ExternalSyntheticLambda0));
                            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new LivePlayer$$ExternalSyntheticLambda1(3));
                            builder.setOnDismissListener(new BotStorage$$ExternalSyntheticLambda5(4, atomicBoolean, richEditor$$ExternalSyntheticLambda48));
                            builder.show();
                        } else if (chat2 != null) {
                            clearSearchAfterSelectChannel();
                        }
                    }
                }
                hashSet.remove(Long.valueOf(j2));
                showMaximumUsersToast$1();
                return;
            }
            if (view instanceof SelectorCountryCell) {
                jHashCode = ((SelectorCountryCell) view).getCountry().default_name.hashCode();
                if (hashSet.contains(Long.valueOf(jHashCode))) {
                    hashSet.remove(Long.valueOf(jHashCode));
                } else {
                    hashSet.add(Long.valueOf(jHashCode));
                }
                if (hashSet.size() != MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + j && this.type == 3) {
                    hashSet.remove(Long.valueOf(jHashCode));
                    showMaximumUsersToast$1();
                    return;
                }
                anonymousClass2.updateSpans(true, hashSet, new SelectorBottomSheet$$ExternalSyntheticLambda0(this, 3), this.countriesList);
                if (!TextUtils.isEmpty(this.query)) {
                    updateList$1(true, false);
                    return;
                }
                this.query = null;
                anonymousClass2.setText("");
                updateList$1(false, false);
                updateList$1(true, true);
            }
        }
        linkedHashMap.clear();
        save(true);
        j = 1;
        if (view instanceof SelectorCountryCell) {
            jHashCode = ((SelectorCountryCell) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(jHashCode))) {
                hashSet.remove(Long.valueOf(jHashCode));
            } else {
                hashSet.add(Long.valueOf(jHashCode));
            }
            if (hashSet.size() != MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + j) {
            }
            anonymousClass2.updateSpans(true, hashSet, new SelectorBottomSheet$$ExternalSyntheticLambda0(this, 3), this.countriesList);
            if (!TextUtils.isEmpty(this.query)) {
                updateList$1(true, false);
                return;
            }
            this.query = null;
            anonymousClass2.setText("");
            updateList$1(false, false);
            updateList$1(true, true);
        }
    }

    public final void loadData(int i, String str, boolean z) {
        TLRPC.Chat chat = this.currentChat;
        if (i == 1) {
            long j = chat.id;
            SelectorBottomSheet$$ExternalSyntheticLambda7 selectorBottomSheet$$ExternalSyntheticLambda7 = new SelectorBottomSheet$$ExternalSyntheticLambda7(this, z, 1);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = messagesController.getInputChannel(j);
            TLRPC.ChannelParticipantsFilter tL_channelParticipantsRecent = str == null ? new TLRPC.TL_channelParticipantsRecent() : new TLRPC.TL_channelParticipantsSearch();
            tL_channels_getParticipants.filter = tL_channelParticipantsRecent;
            if (str == null) {
                str = "";
            }
            tL_channelParticipantsRecent.q = str;
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.limit = 50;
            connectionsManager.sendRequest(tL_channels_getParticipants, new StarGiftSheet$$ExternalSyntheticLambda0(14, messagesController, selectorBottomSheet$$ExternalSyntheticLambda7));
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            SelectorBottomSheet$$ExternalSyntheticLambda7 selectorBottomSheet$$ExternalSyntheticLambda8 = new SelectorBottomSheet$$ExternalSyntheticLambda7(this, z, 0);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
            connectionsManager2.sendRequest(tL_help_getCountriesList, new RichMediaUploader$$ExternalSyntheticLambda0(selectorBottomSheet$$ExternalSyntheticLambda8, 12));
            return;
        }
        long j2 = chat.id;
        SelectorBottomSheet$$ExternalSyntheticLambda3 selectorBottomSheet$$ExternalSyntheticLambda3 = new SelectorBottomSheet$$ExternalSyntheticLambda3(this, 1);
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        tL_contacts_search.limit = 50;
        connectionsManager3.sendRequest(tL_contacts_search, new LivePlayer$$ExternalSyntheticLambda15(messagesController2, j2, selectorBottomSheet$$ExternalSyntheticLambda3, 2));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateItems(false, true);
    }

    @Override
    public final void onPreDraw(Canvas canvas, int i, float f) {
        this.top = i;
        float f2 = AndroidUtilities.statusBarHeight;
        SelectorHeaderCell selectorHeaderCell = this.headerView;
        selectorHeaderCell.setTranslationY(Math.max(i, (((selectorHeaderCell.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + f2));
        float translationY = selectorHeaderCell.getTranslationY() + selectorHeaderCell.getMeasuredHeight();
        AnonymousClass2 anonymousClass2 = this.searchField;
        anonymousClass2.setTranslationY(translationY);
        this.recyclerListView.setTranslationY((anonymousClass2.getMeasuredHeight() + selectorHeaderCell.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        Paint paint = this.backgroundPaint;
        paint.setColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
        int iMax = Math.max(0, i);
        boolean z = iMax < AndroidUtilities.statusBarHeight;
        AnimatedFloat animatedFloat = this.statusBarT;
        int iLerp = AndroidUtilities.lerp(iMax, 0, animatedFloat.set(z));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.backgroundPaddingLeft, iLerp, this.containerView.getWidth() - this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + this.containerView.getHeight());
        float fDp = (1.0f - animatedFloat.get()) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, fDp, fDp, paint);
    }

    public final void prepare(int i, ArrayList arrayList) {
        this.type = i;
        this.query = null;
        HashSet hashSet = this.openedIds;
        hashSet.clear();
        HashSet<Long> hashSet2 = this.selectedIds;
        hashSet2.clear();
        ArrayList arrayList2 = this.peers;
        arrayList2.clear();
        LinkedHashMap linkedHashMap = this.allSelectedObjects;
        linkedHashMap.clear();
        if (i == 1) {
            arrayList2.addAll(this.users);
        } else if (i == 2) {
            arrayList2.addAll(BoostRepository.getMyChannels(this.currentChat.id));
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                TLObject tLObject = (TLObject) obj;
                long jHashCode = tLObject instanceof TLRPC.TL_inputPeerChat ? -((TLRPC.TL_inputPeerChat) tLObject).chat_id : 0L;
                if (tLObject instanceof TLRPC.TL_inputPeerChannel) {
                    jHashCode = -((TLRPC.TL_inputPeerChannel) tLObject).channel_id;
                }
                if (tLObject instanceof TLRPC.Chat) {
                    jHashCode = -((TLRPC.Chat) tLObject).id;
                }
                if (tLObject instanceof TLRPC.User) {
                    jHashCode = ((TLRPC.User) tLObject).id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    jHashCode = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(jHashCode));
                linkedHashMap.put(Long.valueOf(jHashCode), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        AnonymousClass2 anonymousClass2 = this.searchField;
        anonymousClass2.setText("");
        anonymousClass2.spansContainer.removeAllSpans(false);
        anonymousClass2.updateSpans(false, hashSet2, new SelectorBottomSheet$$ExternalSyntheticLambda0(this, 5), this.countriesList);
        updateSection();
        updateList$1(false, true);
        this.headerView.setText(getTitle());
        updateActionButton$3(false);
        scrollToTop(false);
    }

    public final void save(boolean z) {
        HashSet hashSet = this.selectedIds;
        if (hashSet.size() != 0 || z) {
            int i = this.type;
            LinkedHashMap linkedHashMap = this.allSelectedObjects;
            if (i == 1) {
                ArrayList arrayList = new ArrayList();
                for (TLObject tLObject : linkedHashMap.values()) {
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(user);
                        }
                    }
                }
                BoostPagerBottomSheet.AnonymousClass4 anonymousClass4 = this.selectedObjectsListener;
                if (anonymousClass4 != null) {
                    BoostPagerBottomSheet.this.viewPager.scrollToPosition(0);
                    BoostViaGiftsBottomSheet boostViaGiftsBottomSheet = anonymousClass4.val$leftSheet;
                    ArrayList arrayList2 = boostViaGiftsBottomSheet.selectedUsers;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    if (arrayList.isEmpty()) {
                        int i2 = BoostTypeCell.$r8$clinit;
                        boostViaGiftsBottomSheet.selectedBoostSubType = 0;
                    } else {
                        int i3 = BoostTypeCell.$r8$clinit;
                        boostViaGiftsBottomSheet.selectedBoostSubType = 1;
                    }
                    boostViaGiftsBottomSheet.selectedSliderIndex = 0;
                    boostViaGiftsBottomSheet.updateRows(false, true);
                    boostViaGiftsBottomSheet.updateActionButton(true);
                    boostViaGiftsBottomSheet.updateTitle();
                    return;
                }
                return;
            }
            if (i == 2) {
                ArrayList arrayList3 = new ArrayList();
                for (TLObject tLObject2 : linkedHashMap.values()) {
                    if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (hashSet.contains(Long.valueOf(-chat.id))) {
                            arrayList3.add(chat);
                        }
                    }
                }
                BoostPagerBottomSheet.AnonymousClass4 anonymousClass5 = this.selectedObjectsListener;
                if (anonymousClass5 != null) {
                    BoostPagerBottomSheet boostPagerBottomSheet = BoostPagerBottomSheet.this;
                    boostPagerBottomSheet.viewPager.scrollToPosition(0);
                    boolean z2 = !boostPagerBottomSheet.isKeyboardVisible();
                    BoostViaGiftsBottomSheet boostViaGiftsBottomSheet2 = anonymousClass5.val$leftSheet;
                    ArrayList arrayList4 = boostViaGiftsBottomSheet2.selectedChats;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    boostViaGiftsBottomSheet2.updateRows(z2, true);
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = this.countriesList;
            int size = arrayList6.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList6.get(i4);
                i4++;
                TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                if (hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()))) {
                    arrayList5.add(tL_help_country);
                }
            }
            BoostPagerBottomSheet.AnonymousClass4 anonymousClass6 = this.selectedObjectsListener;
            if (anonymousClass6 != null) {
                BoostPagerBottomSheet.this.viewPager.scrollToPosition(0);
                BoostViaGiftsBottomSheet boostViaGiftsBottomSheet3 = anonymousClass6.val$leftSheet;
                ArrayList arrayList7 = boostViaGiftsBottomSheet3.selectedCountries;
                arrayList7.clear();
                arrayList7.addAll(arrayList5);
                boostViaGiftsBottomSheet3.updateRows(false, true);
            }
        }
    }

    public final void scrollToTop(boolean z) {
        if (!z) {
            this.recyclerListView.scrollToPosition(0);
            return;
        }
        LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(getContext(), 2, 0.6f);
        linearSmoothScrollerCustom.setTargetPosition(1);
        linearSmoothScrollerCustom.setOffset(AndroidUtilities.dp(38.0f));
        this.recyclerListView.getLayoutManager().startSmoothScroll(linearSmoothScrollerCustom);
    }

    public final void showMaximumUsersToast$1() {
        String string;
        int i = this.type;
        if (i == 1) {
            string = LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        } else if (i != 2) {
            string = i != 3 ? "" : LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
        } else {
            string = LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayAddPeersMax, new Object[0]);
        }
        BoostPagerBottomSheet.AnonymousClass4 anonymousClass4 = this.selectedObjectsListener;
        if (anonymousClass4 != null) {
            BulletinFactory.of(BoostPagerBottomSheet.this.container, anonymousClass4.val$resourcesProvider).createSimpleBulletin(R.raw.chats_infotip, string).show(true);
        }
    }

    public final void updateActionButton$3(boolean z) {
        String string;
        ButtonWithCounterView buttonWithCounterView = this.actionButton;
        buttonWithCounterView.setShowZero(false);
        int i = this.type;
        if (i != 1) {
            string = (i == 2 || i == 3) ? LocaleController.getString(R.string.Save) : "";
        } else {
            string = LocaleController.getString(R.string.BoostingSaveRecipients);
        }
        buttonWithCounterView.setText(string, z);
        HashSet hashSet = this.selectedIds;
        buttonWithCounterView.setCount(hashSet.size(), z);
        buttonWithCounterView.setEnabled(hashSet.size() > 0);
    }

    public final void updateItems(boolean z, boolean z2) {
        int iDp;
        SelectorAdapter selectorAdapter;
        ArrayList<? extends AdapterWithDiffUtils.Item> arrayList = this.oldItems;
        arrayList.clear();
        ArrayList<? extends AdapterWithDiffUtils.Item> arrayList2 = this.items;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.type == 1) {
            int i = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            SelectorAdapter.Item item = new SelectorAdapter.Item(9, false);
            item.id = 1;
            item.resId = i;
            item.text = string;
            arrayList2.add(item);
        }
        SelectorAdapter.Item item2 = new SelectorAdapter.Item(10, false);
        GraySectionCell graySectionCell = this.sectionCell;
        item2.view = graySectionCell;
        arrayList2.add(item2);
        int i2 = this.type;
        HashSet hashSet = this.selectedIds;
        if (i2 == 3) {
            ArrayList arrayList3 = this.countriesLetters;
            int size = arrayList3.size();
            int i3 = 0;
            iDp = 0;
            while (i3 < size) {
                Object obj = arrayList3.get(i3);
                i3++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.countriesMap.get(str)) {
                    if (TextUtils.isEmpty(this.query) || matchLocal(tL_help_country, AndroidUtilities.translitSafe(this.query).toLowerCase())) {
                        iDp += AndroidUtilities.dp(44.0f);
                        boolean zContains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        SelectorAdapter.Item item3 = new SelectorAdapter.Item(6, true);
                        item3.country = tL_help_country;
                        item3.checked = zContains;
                        arrayList4.add(item3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    iDp += AndroidUtilities.dp(32.0f);
                    String upperCase = str.toUpperCase();
                    SelectorAdapter.Item item4 = new SelectorAdapter.Item(7, false);
                    item4.text = upperCase;
                    arrayList2.add(item4);
                    arrayList2.addAll(arrayList4);
                }
                arrayList3 = arrayList5;
            }
        } else {
            iDp = 0;
        }
        ArrayList arrayList6 = this.peers;
        int size2 = arrayList6.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList6.get(i4);
            i4++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            iDp += AndroidUtilities.dp(56.0f);
            boolean zContains2 = hashSet.contains(Long.valueOf(DialogObject.getPeerDialogId(inputPeer)));
            SelectorAdapter.Item item5 = new SelectorAdapter.Item(3, true);
            item5.peer = inputPeer;
            item5.user = null;
            item5.chat = null;
            item5.checked = zContains2;
            arrayList2.add(item5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new SelectorAdapter.Item(5, false));
            iDp += AndroidUtilities.dp(150.0f);
        }
        int iMax = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - iDp);
        SelectorAdapter.Item item6 = new SelectorAdapter.Item(-1, false);
        item6.padHeight = iMax;
        arrayList2.add(item6);
        if (hashSet.size() > 0 && this.type != 3) {
            graySectionCell.setRightText(LocaleController.getString(R.string.UsersDeselectAll), new SelectorBottomSheet$$ExternalSyntheticLambda4(this, 1));
        } else if (z) {
            graySectionCell.setRightText(null);
        } else {
            graySectionCell.rightTextView.setText(null, false);
            GraySectionCell.AnonymousClass1 anonymousClass1 = graySectionCell.rightTextView;
            anonymousClass1.setOnClickListener(null);
            anonymousClass1.setVisibility(0);
        }
        if (!z2 || (selectorAdapter = this.selectorAdapter) == null) {
            return;
        }
        if (z) {
            selectorAdapter.setItems(arrayList, arrayList2);
        } else {
            selectorAdapter.notifyDataSetChanged();
        }
    }

    public final void updateList$1(boolean z, boolean z2) {
        updateItems(z, z2);
        for (int i = 0; i < this.recyclerListView.getChildCount(); i++) {
            View childAt = this.recyclerListView.getChildAt(i);
            if (childAt instanceof SelectorUserCell) {
                int childAdapterPosition = this.recyclerListView.getChildAdapterPosition(childAt) - 1;
                if (childAdapterPosition >= 0) {
                    ArrayList arrayList = this.items;
                    if (childAdapterPosition < arrayList.size()) {
                        SelectorAdapter.Item item = (SelectorAdapter.Item) arrayList.get(childAdapterPosition);
                        SelectorUserCell selectorUserCell = (SelectorUserCell) childAt;
                        selectorUserCell.setChecked(item.checked, z);
                        TLRPC.Chat chat = item.chat;
                        if (chat != null) {
                            selectorUserCell.setCheckboxAlpha(this.selectorAdapter.getParticipantsCount$2(chat) > 200 ? 0.3f : 1.0f, z);
                        } else {
                            selectorUserCell.setCheckboxAlpha(1.0f, z);
                        }
                        if (childAt instanceof SelectorCountryCell) {
                            SelectorCountryCell selectorCountryCell = (SelectorCountryCell) childAt;
                            selectorCountryCell.setChecked(this.selectedIds.contains(Long.valueOf(selectorCountryCell.getCountry().default_name.hashCode())), true);
                        }
                    }
                }
            } else if (childAt instanceof SelectorCountryCell) {
                SelectorCountryCell selectorCountryCell2 = (SelectorCountryCell) childAt;
                selectorCountryCell2.setChecked(this.selectedIds.contains(Long.valueOf(selectorCountryCell2.getCountry().default_name.hashCode())), true);
            }
        }
        updateActionButton$3(z);
    }

    public final void updateSection() {
        String pluralStringComma;
        int i = this.type;
        GraySectionCell graySectionCell = this.sectionCell;
        if (i == 1) {
            TLRPC.Chat chat = this.currentChat;
            pluralStringComma = LocaleController.formatPluralStringComma(ChatObject.isChannelAndNotMegaGroup(chat) ? "Subscribers" : "Members", Math.max(0, this.selectorAdapter.getParticipantsCount$2(chat) - 1));
            graySectionCell.setLayerHeight(32);
        } else if (i == 2) {
            pluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToGroupChannelPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayAddPeersMax, new Object[0]);
            graySectionCell.setLayerHeight(32);
        } else if (i != 3) {
            pluralStringComma = "";
        } else {
            pluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
            graySectionCell.setLayerHeight(1);
        }
        graySectionCell.setText(pluralStringComma);
    }
}
