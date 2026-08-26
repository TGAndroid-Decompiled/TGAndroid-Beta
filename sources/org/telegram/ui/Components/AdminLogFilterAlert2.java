package org.telegram.ui.Components;

import android.view.ViewGroup;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.DefaultItemAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.ChannelAdminLogActivity;
import org.telegram.ui.ChannelAdminLogActivity$$ExternalSyntheticLambda0;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda356;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda68;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.GradientHeaderActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class AdminLogFilterAlert2 extends BottomSheetWithRecyclerListView {
    public UniversalAdapter adapter;
    public final GradientHeaderActivity.AnonymousClass5 buttonContainer;
    public ArrayList currentAdmins;
    public TLRPC.TL_channelAdminLogEventsFilter currentFilter;
    public ChannelAdminLogActivity$$ExternalSyntheticLambda0 delegate;
    public final boolean isMegagroup;
    public boolean sectionMembersExpanded;
    public boolean sectionMessagesExpanded;
    public boolean sectionSettingsExpanded;
    public LongSparseArray selectedAdmins;

    public AdminLogFilterAlert2(ChannelAdminLogActivity channelAdminLogActivity, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, LongSparseArray longSparseArray, boolean z) {
        super(channelAdminLogActivity.getParentActivity(), channelAdminLogActivity, false, false, false, false, true, 2, channelAdminLogActivity.getResourceProvider());
        this.currentFilter = new TLRPC.TL_channelAdminLogEventsFilter();
        this.sectionMembersExpanded = false;
        this.sectionSettingsExpanded = false;
        this.sectionMessagesExpanded = false;
        this.topPadding = 0.35f;
        fixNavigationBar();
        int i = Theme.key_dialogBackgroundGray;
        setBackgroundColor(Theme.getColor(i, this.resourcesProvider));
        setSlidingActionBar();
        this.showHandle = true;
        if (tL_channelAdminLogEventsFilter != null) {
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.currentFilter;
            tL_channelAdminLogEventsFilter2.join = tL_channelAdminLogEventsFilter.join;
            tL_channelAdminLogEventsFilter2.leave = tL_channelAdminLogEventsFilter.leave;
            tL_channelAdminLogEventsFilter2.edit_rank = tL_channelAdminLogEventsFilter.edit_rank;
            tL_channelAdminLogEventsFilter2.invite = tL_channelAdminLogEventsFilter.invite;
            tL_channelAdminLogEventsFilter2.ban = tL_channelAdminLogEventsFilter.ban;
            tL_channelAdminLogEventsFilter2.unban = tL_channelAdminLogEventsFilter.unban;
            tL_channelAdminLogEventsFilter2.kick = tL_channelAdminLogEventsFilter.kick;
            tL_channelAdminLogEventsFilter2.unkick = tL_channelAdminLogEventsFilter.unkick;
            tL_channelAdminLogEventsFilter2.promote = tL_channelAdminLogEventsFilter.promote;
            tL_channelAdminLogEventsFilter2.demote = tL_channelAdminLogEventsFilter.demote;
            tL_channelAdminLogEventsFilter2.info = tL_channelAdminLogEventsFilter.info;
            tL_channelAdminLogEventsFilter2.settings = tL_channelAdminLogEventsFilter.settings;
            tL_channelAdminLogEventsFilter2.pinned = tL_channelAdminLogEventsFilter.pinned;
            tL_channelAdminLogEventsFilter2.edit = tL_channelAdminLogEventsFilter.edit;
            tL_channelAdminLogEventsFilter2.delete = tL_channelAdminLogEventsFilter.delete;
            tL_channelAdminLogEventsFilter2.group_call = tL_channelAdminLogEventsFilter.group_call;
            tL_channelAdminLogEventsFilter2.invites = tL_channelAdminLogEventsFilter.invites;
        } else {
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.currentFilter;
            tL_channelAdminLogEventsFilter3.join = true;
            tL_channelAdminLogEventsFilter3.leave = true;
            tL_channelAdminLogEventsFilter3.edit_rank = true;
            tL_channelAdminLogEventsFilter3.invite = true;
            tL_channelAdminLogEventsFilter3.ban = true;
            tL_channelAdminLogEventsFilter3.unban = true;
            tL_channelAdminLogEventsFilter3.kick = true;
            tL_channelAdminLogEventsFilter3.unkick = true;
            tL_channelAdminLogEventsFilter3.promote = true;
            tL_channelAdminLogEventsFilter3.demote = true;
            tL_channelAdminLogEventsFilter3.info = true;
            tL_channelAdminLogEventsFilter3.settings = true;
            tL_channelAdminLogEventsFilter3.pinned = true;
            tL_channelAdminLogEventsFilter3.edit = true;
            tL_channelAdminLogEventsFilter3.delete = true;
            tL_channelAdminLogEventsFilter3.group_call = true;
            tL_channelAdminLogEventsFilter3.invites = true;
        }
        if (longSparseArray != null) {
            this.selectedAdmins = longSparseArray.m20clone();
        }
        this.isMegagroup = z;
        this.adapter.update(false);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.mSupportsChangeAnimations = false;
        defaultItemAnimator.delayAnimations = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        this.recyclerListView.setOnItemClickListener(new ChatActivity$$ExternalSyntheticLambda356(this, 23));
        GradientHeaderActivity.AnonymousClass5 anonymousClass5 = new GradientHeaderActivity.AnonymousClass5(getContext(), this.resourcesProvider, (RecyclerListView) null);
        this.buttonContainer = anonymousClass5;
        anonymousClass5.setClickable(true);
        anonymousClass5.setOrientation(1);
        anonymousClass5.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        anonymousClass5.setBackgroundColor(Theme.getColor(i, this.resourcesProvider));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), this.resourcesProvider, true);
        buttonWithCounterView.setRoundRadius(24);
        buttonWithCounterView.setText(LocaleController.getString(R.string.EventLogFilterApply), false, true);
        buttonWithCounterView.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, 3));
        anonymousClass5.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i2 = this.backgroundPaddingLeft;
        viewGroup.addView(anonymousClass5, LayoutHelper.createFrameMarginPx(-2.0f, 87, i2, 0, i2, 0));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i3 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i3, 0, i3, AndroidUtilities.dp(68.0f));
        this.recyclerListView.setSections();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return !this.recyclerListView.canScrollVertically(-1);
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new CallLogActivity$$ExternalSyntheticLambda3(this, 20), this.resourcesProvider);
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    public final void fillItems$1(ArrayList arrayList, UniversalAdapter universalAdapter) {
        if (this.currentFilter == null) {
            return;
        }
        UItem uItem = new UItem(7);
        uItem.text = null;
        arrayList.add(uItem);
        String string = LocaleController.getString(R.string.EventLogFilterByActions);
        UItem uItem2 = new UItem(0);
        uItem2.text = string;
        arrayList.add(uItem2);
        boolean z = this.isMegagroup;
        String string2 = LocaleController.getString(z ? R.string.EventLogFilterSectionMembers : R.string.EventLogFilterSectionSubscribers);
        String groupCount = getGroupCount(0);
        UItem uItem3 = new UItem(41);
        uItem3.id = 2;
        uItem3.text = string2;
        uItem3.animatedText = groupCount;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.currentFilter;
        uItem3.setChecked(tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote || (z && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) || tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join || tL_channelAdminLogEventsFilter.leave || tL_channelAdminLogEventsFilter.edit_rank);
        uItem3.collapsed = !this.sectionMembersExpanded;
        uItem3.clickCallback = new ChatActivity$$ExternalSyntheticLambda68(this, 0, 1);
        arrayList.add(uItem3);
        if (this.sectionMembersExpanded) {
            UItem uItemAsRoundCheckbox = UItem.asRoundCheckbox(3, LocaleController.getString(R.string.EventLogFilterSectionAdmin));
            uItemAsRoundCheckbox.pad = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.currentFilter;
            uItemAsRoundCheckbox.setChecked(tL_channelAdminLogEventsFilter2.promote || tL_channelAdminLogEventsFilter2.demote);
            arrayList.add(uItemAsRoundCheckbox);
            if (z) {
                UItem uItemAsRoundCheckbox2 = UItem.asRoundCheckbox(4, LocaleController.getString(R.string.EventLogFilterNewRestrictions));
                uItemAsRoundCheckbox2.pad = 1;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.currentFilter;
                uItemAsRoundCheckbox2.setChecked(tL_channelAdminLogEventsFilter3.kick || tL_channelAdminLogEventsFilter3.ban || tL_channelAdminLogEventsFilter3.unkick || tL_channelAdminLogEventsFilter3.unban);
                arrayList.add(uItemAsRoundCheckbox2);
            }
            UItem uItemAsRoundCheckbox3 = UItem.asRoundCheckbox(5, LocaleController.getString(z ? R.string.EventLogFilterNewMembers : R.string.EventLogFilterNewSubscribers));
            uItemAsRoundCheckbox3.pad = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = this.currentFilter;
            uItemAsRoundCheckbox3.setChecked(tL_channelAdminLogEventsFilter4.invite || tL_channelAdminLogEventsFilter4.join);
            arrayList.add(uItemAsRoundCheckbox3);
            UItem uItemAsRoundCheckbox4 = UItem.asRoundCheckbox(6, LocaleController.getString(z ? R.string.EventLogFilterLeavingMembers2 : R.string.EventLogFilterLeavingSubscribers2));
            uItemAsRoundCheckbox4.pad = 1;
            uItemAsRoundCheckbox4.setChecked(this.currentFilter.leave);
            arrayList.add(uItemAsRoundCheckbox4);
            if (z) {
                UItem uItemAsRoundCheckbox5 = UItem.asRoundCheckbox(7, LocaleController.getString(R.string.EventLogFilterMembersRank));
                uItemAsRoundCheckbox5.pad = 1;
                uItemAsRoundCheckbox5.setChecked(this.currentFilter.edit_rank);
                arrayList.add(uItemAsRoundCheckbox5);
            }
        }
        String string3 = LocaleController.getString(z ? R.string.EventLogFilterSectionGroupSettings : R.string.EventLogFilterSectionChannelSettings);
        String groupCount2 = getGroupCount(1);
        UItem uItem4 = new UItem(41);
        uItem4.id = 8;
        uItem4.text = string3;
        uItem4.animatedText = groupCount2;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = this.currentFilter;
        uItem4.setChecked(tL_channelAdminLogEventsFilter5.info || tL_channelAdminLogEventsFilter5.settings || tL_channelAdminLogEventsFilter5.invites || tL_channelAdminLogEventsFilter5.group_call);
        uItem4.collapsed = !this.sectionSettingsExpanded;
        uItem4.clickCallback = new ChatActivity$$ExternalSyntheticLambda68(this, 1, 1);
        arrayList.add(uItem4);
        if (this.sectionSettingsExpanded) {
            UItem uItemAsRoundCheckbox6 = UItem.asRoundCheckbox(9, LocaleController.getString(z ? R.string.EventLogFilterGroupInfo : R.string.EventLogFilterChannelInfo));
            uItemAsRoundCheckbox6.pad = 1;
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = this.currentFilter;
            uItemAsRoundCheckbox6.setChecked(tL_channelAdminLogEventsFilter6.info || tL_channelAdminLogEventsFilter6.settings);
            arrayList.add(uItemAsRoundCheckbox6);
            UItem uItemAsRoundCheckbox7 = UItem.asRoundCheckbox(10, LocaleController.getString(R.string.EventLogFilterInvites));
            uItemAsRoundCheckbox7.pad = 1;
            uItemAsRoundCheckbox7.setChecked(this.currentFilter.invites);
            arrayList.add(uItemAsRoundCheckbox7);
            UItem uItemAsRoundCheckbox8 = UItem.asRoundCheckbox(11, LocaleController.getString(R.string.EventLogFilterCalls));
            uItemAsRoundCheckbox8.pad = 1;
            uItemAsRoundCheckbox8.setChecked(this.currentFilter.group_call);
            arrayList.add(uItemAsRoundCheckbox8);
        }
        String string4 = LocaleController.getString(R.string.EventLogFilterSectionMessages);
        String groupCount3 = getGroupCount(2);
        UItem uItem5 = new UItem(41);
        uItem5.id = 12;
        uItem5.text = string4;
        uItem5.animatedText = groupCount3;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = this.currentFilter;
        uItem5.setChecked(tL_channelAdminLogEventsFilter7.delete || tL_channelAdminLogEventsFilter7.edit || tL_channelAdminLogEventsFilter7.pinned);
        uItem5.collapsed = !this.sectionMessagesExpanded;
        uItem5.clickCallback = new ChatActivity$$ExternalSyntheticLambda68(this, 2, 1);
        arrayList.add(uItem5);
        if (this.sectionMessagesExpanded) {
            UItem uItemAsRoundCheckbox9 = UItem.asRoundCheckbox(13, LocaleController.getString(R.string.EventLogFilterDeletedMessages));
            uItemAsRoundCheckbox9.pad = 1;
            uItemAsRoundCheckbox9.setChecked(this.currentFilter.delete);
            arrayList.add(uItemAsRoundCheckbox9);
            UItem uItemAsRoundCheckbox10 = UItem.asRoundCheckbox(14, LocaleController.getString(R.string.EventLogFilterEditedMessages));
            uItemAsRoundCheckbox10.pad = 1;
            uItemAsRoundCheckbox10.setChecked(this.currentFilter.edit);
            arrayList.add(uItemAsRoundCheckbox10);
            UItem uItemAsRoundCheckbox11 = UItem.asRoundCheckbox(15, LocaleController.getString(R.string.EventLogFilterPinnedMessages));
            uItemAsRoundCheckbox11.pad = 1;
            uItemAsRoundCheckbox11.setChecked(this.currentFilter.pinned);
            arrayList.add(uItemAsRoundCheckbox11);
        }
        UItem uItem6 = new UItem(7);
        uItem6.text = null;
        arrayList.add(uItem6);
        String string5 = LocaleController.getString(R.string.EventLogFilterByAdmins);
        UItem uItem7 = new UItem(0);
        uItem7.text = string5;
        arrayList.add(uItem7);
        UItem uItemAsRoundCheckbox12 = UItem.asRoundCheckbox(16, LocaleController.getString(R.string.EventLogFilterByAdminsAll));
        LongSparseArray longSparseArray = this.selectedAdmins;
        int size = longSparseArray == null ? 0 : longSparseArray.size();
        ArrayList arrayList2 = this.currentAdmins;
        uItemAsRoundCheckbox12.setChecked(size >= (arrayList2 == null ? 0 : arrayList2.size()));
        arrayList.add(uItemAsRoundCheckbox12);
        if (this.currentAdmins != null) {
            for (int i = 0; i < this.currentAdmins.size(); i++) {
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) this.currentAdmins.get(i)).peer);
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                UItem uItem8 = new UItem(37);
                uItem8.id = (-1) - i;
                uItem8.object = user;
                uItem8.pad = 1;
                LongSparseArray longSparseArray2 = this.selectedAdmins;
                uItem8.setChecked(longSparseArray2 != null && longSparseArray2.containsKey(peerDialogId));
                arrayList.add(uItem8);
            }
        }
    }

    public final String getGroupCount(int i) {
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.currentFilter;
            int i2 = (tL_channelAdminLogEventsFilter.promote || tL_channelAdminLogEventsFilter.demote) ? 1 : 0;
            boolean z = this.isMegagroup;
            sb.append(i2 + ((z && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) ? 1 : 0) + ((tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join) ? 1 : 0) + (tL_channelAdminLogEventsFilter.leave ? 1 : 0) + (tL_channelAdminLogEventsFilter.edit_rank ? 1 : 0));
            sb.append("/");
            sb.append(z ? 5 : 3);
            return sb.toString();
        }
        if (i != 1) {
            StringBuilder sb2 = new StringBuilder();
            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.currentFilter;
            sb2.append((tL_channelAdminLogEventsFilter2.delete ? 1 : 0) + (tL_channelAdminLogEventsFilter2.edit ? 1 : 0) + (tL_channelAdminLogEventsFilter2.pinned ? 1 : 0));
            sb2.append("/3");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = this.currentFilter;
        sb3.append(((tL_channelAdminLogEventsFilter3.info || tL_channelAdminLogEventsFilter3.settings) ? 1 : 0) + (tL_channelAdminLogEventsFilter3.invites ? 1 : 0) + (tL_channelAdminLogEventsFilter3.group_call ? 1 : 0));
        sb3.append("/3");
        return sb3.toString();
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.EventLog);
    }

    public final void lambda$new$0(android.view.View r9, float r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AdminLogFilterAlert2.lambda$new$0(android.view.View, float, int):void");
    }

    @Override
    public final void onSmoothContainerViewLayout(float f) {
        super.onSmoothContainerViewLayout(f);
        this.buttonContainer.setTranslationY(-f);
    }

    public final void setCurrentAdmins(ArrayList arrayList) {
        this.currentAdmins = arrayList;
        if (arrayList != null && this.selectedAdmins == null) {
            this.selectedAdmins = new LongSparseArray();
            ArrayList arrayList2 = this.currentAdmins;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.ChannelParticipant) obj).peer);
                this.selectedAdmins.put(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)), peerDialogId);
            }
        }
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(true);
        }
    }
}
