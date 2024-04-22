package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.DefaultItemAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$ChannelParticipant;
import org.telegram.tgnet.TLRPC$TL_channelAdminLogEventsFilter;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorBtnCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
public class AdminLogFilterAlert2 extends BottomSheetWithRecyclerListView {
    private final ButtonWithCounterView actionButton;
    private UniversalAdapter adapter;
    private final SelectorBtnCell buttonContainer;
    private ArrayList<TLRPC$ChannelParticipant> currentAdmins;
    private TLRPC$TL_channelAdminLogEventsFilter currentFilter;
    private AdminLogFilterAlertDelegate delegate;
    private boolean isMegagroup;
    private boolean sectionMembersExpanded;
    private boolean sectionMessagesExpanded;
    private boolean sectionSettingsExpanded;
    private LongSparseArray<TLRPC$User> selectedAdmins;

    public interface AdminLogFilterAlertDelegate {
        void didSelectRights(TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter, LongSparseArray<TLRPC$User> longSparseArray);
    }

    public AdminLogFilterAlert2(BaseFragment baseFragment, TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter, LongSparseArray<TLRPC$User> longSparseArray, boolean z) {
        super(baseFragment, false, false);
        this.currentFilter = new TLRPC$TL_channelAdminLogEventsFilter();
        this.sectionMembersExpanded = false;
        this.sectionSettingsExpanded = false;
        this.sectionMessagesExpanded = false;
        this.topPadding = 0.6f;
        fixNavigationBar();
        setSlidingActionBar();
        setShowHandle(true);
        if (tLRPC$TL_channelAdminLogEventsFilter != null) {
            TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter2 = this.currentFilter;
            tLRPC$TL_channelAdminLogEventsFilter2.join = tLRPC$TL_channelAdminLogEventsFilter.join;
            tLRPC$TL_channelAdminLogEventsFilter2.leave = tLRPC$TL_channelAdminLogEventsFilter.leave;
            tLRPC$TL_channelAdminLogEventsFilter2.invite = tLRPC$TL_channelAdminLogEventsFilter.invite;
            tLRPC$TL_channelAdminLogEventsFilter2.ban = tLRPC$TL_channelAdminLogEventsFilter.ban;
            tLRPC$TL_channelAdminLogEventsFilter2.unban = tLRPC$TL_channelAdminLogEventsFilter.unban;
            tLRPC$TL_channelAdminLogEventsFilter2.kick = tLRPC$TL_channelAdminLogEventsFilter.kick;
            tLRPC$TL_channelAdminLogEventsFilter2.unkick = tLRPC$TL_channelAdminLogEventsFilter.unkick;
            tLRPC$TL_channelAdminLogEventsFilter2.promote = tLRPC$TL_channelAdminLogEventsFilter.promote;
            tLRPC$TL_channelAdminLogEventsFilter2.demote = tLRPC$TL_channelAdminLogEventsFilter.demote;
            tLRPC$TL_channelAdminLogEventsFilter2.info = tLRPC$TL_channelAdminLogEventsFilter.info;
            tLRPC$TL_channelAdminLogEventsFilter2.settings = tLRPC$TL_channelAdminLogEventsFilter.settings;
            tLRPC$TL_channelAdminLogEventsFilter2.pinned = tLRPC$TL_channelAdminLogEventsFilter.pinned;
            tLRPC$TL_channelAdminLogEventsFilter2.edit = tLRPC$TL_channelAdminLogEventsFilter.edit;
            tLRPC$TL_channelAdminLogEventsFilter2.delete = tLRPC$TL_channelAdminLogEventsFilter.delete;
            tLRPC$TL_channelAdminLogEventsFilter2.group_call = tLRPC$TL_channelAdminLogEventsFilter.group_call;
            tLRPC$TL_channelAdminLogEventsFilter2.invites = tLRPC$TL_channelAdminLogEventsFilter.invites;
        } else {
            TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter3 = this.currentFilter;
            tLRPC$TL_channelAdminLogEventsFilter3.join = true;
            tLRPC$TL_channelAdminLogEventsFilter3.leave = true;
            tLRPC$TL_channelAdminLogEventsFilter3.invite = true;
            tLRPC$TL_channelAdminLogEventsFilter3.ban = true;
            tLRPC$TL_channelAdminLogEventsFilter3.unban = true;
            tLRPC$TL_channelAdminLogEventsFilter3.kick = true;
            tLRPC$TL_channelAdminLogEventsFilter3.unkick = true;
            tLRPC$TL_channelAdminLogEventsFilter3.promote = true;
            tLRPC$TL_channelAdminLogEventsFilter3.demote = true;
            tLRPC$TL_channelAdminLogEventsFilter3.info = true;
            tLRPC$TL_channelAdminLogEventsFilter3.settings = true;
            tLRPC$TL_channelAdminLogEventsFilter3.pinned = true;
            tLRPC$TL_channelAdminLogEventsFilter3.edit = true;
            tLRPC$TL_channelAdminLogEventsFilter3.delete = true;
            tLRPC$TL_channelAdminLogEventsFilter3.group_call = true;
            tLRPC$TL_channelAdminLogEventsFilter3.invites = true;
        }
        if (longSparseArray != null) {
            this.selectedAdmins = longSparseArray.m2clone();
        }
        this.isMegagroup = z;
        this.adapter.update(false);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
            }

            @Override
            public void onDoubleTap(View view, int i, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i, float f, float f2) {
                AdminLogFilterAlert2.this.lambda$new$0(view, i, f, f2);
            }
        });
        SelectorBtnCell selectorBtnCell = new SelectorBtnCell(getContext(), this.resourcesProvider, null);
        this.buttonContainer = selectorBtnCell;
        selectorBtnCell.setClickable(true);
        selectorBtnCell.setOrientation(1);
        selectorBtnCell.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        selectorBtnCell.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), this.resourcesProvider);
        this.actionButton = buttonWithCounterView;
        buttonWithCounterView.setText(LocaleController.getString(R.string.EventLogFilterApply), false);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AdminLogFilterAlert2.this.lambda$new$1(view);
            }
        });
        selectorBtnCell.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i = this.backgroundPaddingLeft;
        viewGroup.addView(selectorBtnCell, LayoutHelper.createFrameMarginPx(-1, -2.0f, 87, i, 0, i, 0));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i2 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i2, 0, i2, AndroidUtilities.dp(68.0f));
    }

    public void lambda$new$0(View view, int i, float f, float f2) {
        onClick(this.adapter.getItem(i - 1), view, f);
    }

    public void lambda$new$1(View view) {
        TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter = this.currentFilter;
        if (tLRPC$TL_channelAdminLogEventsFilter.join && tLRPC$TL_channelAdminLogEventsFilter.leave && tLRPC$TL_channelAdminLogEventsFilter.invite && tLRPC$TL_channelAdminLogEventsFilter.ban && tLRPC$TL_channelAdminLogEventsFilter.unban && tLRPC$TL_channelAdminLogEventsFilter.kick && tLRPC$TL_channelAdminLogEventsFilter.unkick && tLRPC$TL_channelAdminLogEventsFilter.promote && tLRPC$TL_channelAdminLogEventsFilter.demote && tLRPC$TL_channelAdminLogEventsFilter.info && tLRPC$TL_channelAdminLogEventsFilter.settings && tLRPC$TL_channelAdminLogEventsFilter.pinned && tLRPC$TL_channelAdminLogEventsFilter.edit && tLRPC$TL_channelAdminLogEventsFilter.delete && tLRPC$TL_channelAdminLogEventsFilter.group_call && tLRPC$TL_channelAdminLogEventsFilter.invites) {
            this.currentFilter = null;
        }
        LongSparseArray<TLRPC$User> longSparseArray = this.selectedAdmins;
        if (longSparseArray != null && this.currentAdmins != null && longSparseArray.size() >= this.currentAdmins.size()) {
            this.selectedAdmins = null;
        }
        this.delegate.didSelectRights(this.currentFilter, this.selectedAdmins);
        dismiss();
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.EventLog);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                AdminLogFilterAlert2.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    private String getGroupCount(int i) {
        int i2 = 0;
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter = this.currentFilter;
            sb.append(((tLRPC$TL_channelAdminLogEventsFilter.promote || tLRPC$TL_channelAdminLogEventsFilter.demote) ? 1 : 0) + ((this.isMegagroup && (tLRPC$TL_channelAdminLogEventsFilter.kick || tLRPC$TL_channelAdminLogEventsFilter.ban || tLRPC$TL_channelAdminLogEventsFilter.unkick || tLRPC$TL_channelAdminLogEventsFilter.unban)) ? 1 : 0) + ((tLRPC$TL_channelAdminLogEventsFilter.invite || tLRPC$TL_channelAdminLogEventsFilter.join) ? 1 : 1) + (tLRPC$TL_channelAdminLogEventsFilter.leave ? 1 : 0));
            sb.append("/");
            sb.append(this.isMegagroup ? 4 : 3);
            return sb.toString();
        } else if (i == 1) {
            StringBuilder sb2 = new StringBuilder();
            TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter2 = this.currentFilter;
            sb2.append(((tLRPC$TL_channelAdminLogEventsFilter2.info || tLRPC$TL_channelAdminLogEventsFilter2.settings) ? 1 : 1) + (tLRPC$TL_channelAdminLogEventsFilter2.invites ? 1 : 0) + (tLRPC$TL_channelAdminLogEventsFilter2.group_call ? 1 : 0));
            sb2.append("/3");
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter3 = this.currentFilter;
            sb3.append((tLRPC$TL_channelAdminLogEventsFilter3.delete ? 1 : 0) + (tLRPC$TL_channelAdminLogEventsFilter3.edit ? 1 : 0) + (tLRPC$TL_channelAdminLogEventsFilter3.pinned ? 1 : 0));
            sb3.append("/3");
            return sb3.toString();
        }
    }

    private View.OnClickListener getGroupClick(final int i) {
        return new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AdminLogFilterAlert2.this.lambda$getGroupClick$2(i, view);
            }
        };
    }

    public void lambda$getGroupClick$2(int i, View view) {
        saveScrollPosition();
        if (i == 0) {
            this.sectionMembersExpanded = !this.sectionMembersExpanded;
        } else if (i == 1) {
            this.sectionSettingsExpanded = !this.sectionSettingsExpanded;
        } else if (i == 2) {
            this.sectionMessagesExpanded = !this.sectionMessagesExpanded;
        }
        this.adapter.update(true);
        applyScrolledPosition();
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        if (this.currentFilter == null) {
            return;
        }
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.EventLogFilterByActions)));
        UItem asRoundGroupCheckbox = UItem.asRoundGroupCheckbox(2, LocaleController.getString(R.string.EventLogFilterSectionMembers), getGroupCount(0));
        TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter = this.currentFilter;
        arrayList.add(asRoundGroupCheckbox.setChecked(tLRPC$TL_channelAdminLogEventsFilter.promote || tLRPC$TL_channelAdminLogEventsFilter.demote || (this.isMegagroup && (tLRPC$TL_channelAdminLogEventsFilter.kick || tLRPC$TL_channelAdminLogEventsFilter.ban || tLRPC$TL_channelAdminLogEventsFilter.unkick || tLRPC$TL_channelAdminLogEventsFilter.unban)) || tLRPC$TL_channelAdminLogEventsFilter.invite || tLRPC$TL_channelAdminLogEventsFilter.join || tLRPC$TL_channelAdminLogEventsFilter.leave).setCollapsed(!this.sectionMembersExpanded).setClickCallback(getGroupClick(0)));
        if (this.sectionMembersExpanded) {
            UItem pad = UItem.asRoundCheckbox(3, LocaleController.getString(R.string.EventLogFilterSectionAdmin)).pad();
            TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter2 = this.currentFilter;
            arrayList.add(pad.setChecked(tLRPC$TL_channelAdminLogEventsFilter2.promote || tLRPC$TL_channelAdminLogEventsFilter2.demote));
            if (this.isMegagroup) {
                UItem pad2 = UItem.asRoundCheckbox(4, LocaleController.getString(R.string.EventLogFilterNewRestrictions)).pad();
                TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter3 = this.currentFilter;
                arrayList.add(pad2.setChecked(tLRPC$TL_channelAdminLogEventsFilter3.kick || tLRPC$TL_channelAdminLogEventsFilter3.ban || tLRPC$TL_channelAdminLogEventsFilter3.unkick || tLRPC$TL_channelAdminLogEventsFilter3.unban));
            }
            UItem pad3 = UItem.asRoundCheckbox(5, LocaleController.getString(R.string.EventLogFilterNewMembers)).pad();
            TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter4 = this.currentFilter;
            arrayList.add(pad3.setChecked(tLRPC$TL_channelAdminLogEventsFilter4.invite || tLRPC$TL_channelAdminLogEventsFilter4.join));
            arrayList.add(UItem.asRoundCheckbox(6, LocaleController.getString(R.string.EventLogFilterLeavingMembers2)).pad().setChecked(this.currentFilter.leave));
        }
        UItem asRoundGroupCheckbox2 = UItem.asRoundGroupCheckbox(7, LocaleController.getString(this.isMegagroup ? R.string.EventLogFilterSectionGroupSettings : R.string.EventLogFilterSectionChannelSettings), getGroupCount(1));
        TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter5 = this.currentFilter;
        arrayList.add(asRoundGroupCheckbox2.setChecked(tLRPC$TL_channelAdminLogEventsFilter5.info || tLRPC$TL_channelAdminLogEventsFilter5.settings || tLRPC$TL_channelAdminLogEventsFilter5.invites || tLRPC$TL_channelAdminLogEventsFilter5.group_call).setCollapsed(!this.sectionSettingsExpanded).setClickCallback(getGroupClick(1)));
        if (this.sectionSettingsExpanded) {
            UItem pad4 = UItem.asRoundCheckbox(8, LocaleController.getString(this.isMegagroup ? R.string.EventLogFilterGroupInfo : R.string.EventLogFilterChannelInfo)).pad();
            TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter6 = this.currentFilter;
            arrayList.add(pad4.setChecked(tLRPC$TL_channelAdminLogEventsFilter6.info || tLRPC$TL_channelAdminLogEventsFilter6.settings));
            arrayList.add(UItem.asRoundCheckbox(9, LocaleController.getString(R.string.EventLogFilterInvites)).pad().setChecked(this.currentFilter.invites));
            arrayList.add(UItem.asRoundCheckbox(10, LocaleController.getString(R.string.EventLogFilterCalls)).pad().setChecked(this.currentFilter.group_call));
        }
        UItem asRoundGroupCheckbox3 = UItem.asRoundGroupCheckbox(11, LocaleController.getString(R.string.EventLogFilterSectionMessages), getGroupCount(2));
        TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter7 = this.currentFilter;
        arrayList.add(asRoundGroupCheckbox3.setChecked(tLRPC$TL_channelAdminLogEventsFilter7.delete || tLRPC$TL_channelAdminLogEventsFilter7.edit || tLRPC$TL_channelAdminLogEventsFilter7.pinned).setCollapsed(!this.sectionMessagesExpanded).setClickCallback(getGroupClick(2)));
        if (this.sectionMessagesExpanded) {
            arrayList.add(UItem.asRoundCheckbox(12, LocaleController.getString(R.string.EventLogFilterDeletedMessages)).pad().setChecked(this.currentFilter.delete));
            arrayList.add(UItem.asRoundCheckbox(13, LocaleController.getString(R.string.EventLogFilterEditedMessages)).pad().setChecked(this.currentFilter.edit));
            arrayList.add(UItem.asRoundCheckbox(14, LocaleController.getString(R.string.EventLogFilterPinnedMessages)).pad().setChecked(this.currentFilter.pinned));
        }
        arrayList.add(UItem.asShadow(null));
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.EventLogFilterByAdmins)));
        UItem asRoundCheckbox = UItem.asRoundCheckbox(15, LocaleController.getString(R.string.EventLogFilterByAdminsAll));
        LongSparseArray<TLRPC$User> longSparseArray = this.selectedAdmins;
        int size = longSparseArray == null ? 0 : longSparseArray.size();
        ArrayList<TLRPC$ChannelParticipant> arrayList2 = this.currentAdmins;
        arrayList.add(asRoundCheckbox.setChecked(size >= (arrayList2 == null ? 0 : arrayList2.size())));
        if (this.currentAdmins != null) {
            for (int i = 0; i < this.currentAdmins.size(); i++) {
                long peerDialogId = DialogObject.getPeerDialogId(this.currentAdmins.get(i).peer);
                UItem pad5 = UItem.asUserCheckbox((-1) - i, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId))).pad();
                LongSparseArray<TLRPC$User> longSparseArray2 = this.selectedAdmins;
                arrayList.add(pad5.setChecked(longSparseArray2 != null && longSparseArray2.containsKey(peerDialogId)));
            }
        }
    }

    public void onClick(UItem uItem, View view, float f) {
        ArrayList<TLRPC$ChannelParticipant> arrayList;
        if (uItem == null) {
            return;
        }
        int i = uItem.viewType;
        if (i == 41 || i == 35) {
            saveScrollPosition();
            boolean z = uItem.viewType == 41 && (!LocaleController.isRTL ? f <= ((float) AndroidUtilities.dp(60.0f)) : f >= ((float) (view.getMeasuredWidth() - AndroidUtilities.dp(60.0f))));
            CheckBoxCell checkBoxCell = (CheckBoxCell) view;
            if (!z) {
                checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
            }
            switch (uItem.id) {
                case 2:
                    if (z) {
                        this.sectionMembersExpanded = !this.sectionMembersExpanded;
                        break;
                    } else {
                        TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter = this.currentFilter;
                        boolean isChecked = checkBoxCell.isChecked();
                        tLRPC$TL_channelAdminLogEventsFilter.leave = isChecked;
                        tLRPC$TL_channelAdminLogEventsFilter.join = isChecked;
                        tLRPC$TL_channelAdminLogEventsFilter.invite = isChecked;
                        tLRPC$TL_channelAdminLogEventsFilter.demote = isChecked;
                        tLRPC$TL_channelAdminLogEventsFilter.promote = isChecked;
                        if (this.isMegagroup) {
                            TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter2 = this.currentFilter;
                            boolean isChecked2 = checkBoxCell.isChecked();
                            tLRPC$TL_channelAdminLogEventsFilter2.unban = isChecked2;
                            tLRPC$TL_channelAdminLogEventsFilter2.unkick = isChecked2;
                            tLRPC$TL_channelAdminLogEventsFilter2.ban = isChecked2;
                            tLRPC$TL_channelAdminLogEventsFilter2.kick = isChecked2;
                            break;
                        }
                    }
                    break;
                case 3:
                    TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter3 = this.currentFilter;
                    boolean isChecked3 = checkBoxCell.isChecked();
                    tLRPC$TL_channelAdminLogEventsFilter3.demote = isChecked3;
                    tLRPC$TL_channelAdminLogEventsFilter3.promote = isChecked3;
                    break;
                case 4:
                    TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter4 = this.currentFilter;
                    boolean isChecked4 = checkBoxCell.isChecked();
                    tLRPC$TL_channelAdminLogEventsFilter4.unban = isChecked4;
                    tLRPC$TL_channelAdminLogEventsFilter4.unkick = isChecked4;
                    tLRPC$TL_channelAdminLogEventsFilter4.ban = isChecked4;
                    tLRPC$TL_channelAdminLogEventsFilter4.kick = isChecked4;
                    break;
                case 5:
                    TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter5 = this.currentFilter;
                    boolean isChecked5 = checkBoxCell.isChecked();
                    tLRPC$TL_channelAdminLogEventsFilter5.join = isChecked5;
                    tLRPC$TL_channelAdminLogEventsFilter5.invite = isChecked5;
                    break;
                case 6:
                    this.currentFilter.leave = checkBoxCell.isChecked();
                    break;
                case 7:
                    if (z) {
                        this.sectionSettingsExpanded = !this.sectionSettingsExpanded;
                        break;
                    } else {
                        TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter6 = this.currentFilter;
                        boolean isChecked6 = checkBoxCell.isChecked();
                        tLRPC$TL_channelAdminLogEventsFilter6.group_call = isChecked6;
                        tLRPC$TL_channelAdminLogEventsFilter6.invites = isChecked6;
                        tLRPC$TL_channelAdminLogEventsFilter6.settings = isChecked6;
                        tLRPC$TL_channelAdminLogEventsFilter6.info = isChecked6;
                        break;
                    }
                case 8:
                    TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter7 = this.currentFilter;
                    boolean isChecked7 = checkBoxCell.isChecked();
                    tLRPC$TL_channelAdminLogEventsFilter7.settings = isChecked7;
                    tLRPC$TL_channelAdminLogEventsFilter7.info = isChecked7;
                    break;
                case 9:
                    this.currentFilter.invites = checkBoxCell.isChecked();
                    break;
                case 10:
                    this.currentFilter.group_call = checkBoxCell.isChecked();
                    break;
                case 11:
                    if (z) {
                        this.sectionMessagesExpanded = !this.sectionMessagesExpanded;
                        break;
                    } else {
                        TLRPC$TL_channelAdminLogEventsFilter tLRPC$TL_channelAdminLogEventsFilter8 = this.currentFilter;
                        boolean isChecked8 = checkBoxCell.isChecked();
                        tLRPC$TL_channelAdminLogEventsFilter8.pinned = isChecked8;
                        tLRPC$TL_channelAdminLogEventsFilter8.edit = isChecked8;
                        tLRPC$TL_channelAdminLogEventsFilter8.delete = isChecked8;
                        break;
                    }
                case 12:
                    this.currentFilter.delete = checkBoxCell.isChecked();
                    break;
                case 13:
                    this.currentFilter.edit = checkBoxCell.isChecked();
                    break;
                case 14:
                    this.currentFilter.pinned = checkBoxCell.isChecked();
                    break;
                case 15:
                    if (this.selectedAdmins == null) {
                        this.selectedAdmins = new LongSparseArray<>();
                    }
                    this.selectedAdmins.clear();
                    if (checkBoxCell.isChecked() && (arrayList = this.currentAdmins) != null) {
                        Iterator<TLRPC$ChannelParticipant> it = arrayList.iterator();
                        while (it.hasNext()) {
                            long peerDialogId = DialogObject.getPeerDialogId(it.next().peer);
                            this.selectedAdmins.put(peerDialogId, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)));
                        }
                        break;
                    }
                    break;
            }
            this.adapter.update(true);
        }
        int i2 = uItem.id;
        if (i2 < 0) {
            CheckBoxCell checkBoxCell2 = (CheckBoxCell) view;
            int i3 = (-i2) - 1;
            if (i3 < 0 || i3 >= this.currentAdmins.size()) {
                return;
            }
            long peerDialogId2 = DialogObject.getPeerDialogId(this.currentAdmins.get(i3).peer);
            TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId2));
            if (this.selectedAdmins == null) {
                this.selectedAdmins = new LongSparseArray<>();
            }
            if (this.selectedAdmins.containsKey(peerDialogId2)) {
                this.selectedAdmins.remove(peerDialogId2);
                checkBoxCell2.setChecked(false, true);
            } else {
                this.selectedAdmins.put(peerDialogId2, user);
                checkBoxCell2.setChecked(true, true);
            }
            this.adapter.update(true);
        }
    }

    public void setCurrentAdmins(ArrayList<TLRPC$ChannelParticipant> arrayList) {
        this.currentAdmins = arrayList;
        if (arrayList != null && this.selectedAdmins == null) {
            this.selectedAdmins = new LongSparseArray<>();
            Iterator<TLRPC$ChannelParticipant> it = this.currentAdmins.iterator();
            while (it.hasNext()) {
                long peerDialogId = DialogObject.getPeerDialogId(it.next().peer);
                this.selectedAdmins.put(peerDialogId, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)));
            }
        }
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(true);
        }
    }

    public void setAdminLogFilterAlertDelegate(AdminLogFilterAlertDelegate adminLogFilterAlertDelegate) {
        this.delegate = adminLogFilterAlertDelegate;
    }

    @Override
    public void onSmoothContainerViewLayout(float f) {
        super.onSmoothContainerViewLayout(f);
        this.buttonContainer.setTranslationY(-f);
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return !this.recyclerListView.canScrollVertically(-1);
    }
}
