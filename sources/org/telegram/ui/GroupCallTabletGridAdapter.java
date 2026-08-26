package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.voip.GroupCallGridCell;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;

public final class GroupCallTabletGridAdapter extends RecyclerListView.SelectionAdapter {
    public final GroupCallActivity activity;
    public ArrayList attachedRenderers;
    public final int currentAccount;
    public ChatObject.Call groupCall;
    public GroupCallActivity.AnonymousClass28 renderersContainer;
    public final ArrayList videoParticipants = new ArrayList();
    public boolean visible = false;

    public GroupCallTabletGridAdapter(ChatObject.Call call, int i, GroupCallActivity groupCallActivity) {
        this.groupCall = call;
        this.currentAccount = i;
        this.activity = groupCallActivity;
    }

    public final void attachRenderer$1(GroupCallGridCell groupCallGridCell, boolean z) {
        if (z && groupCallGridCell.getRenderer() == null) {
            groupCallGridCell.setRenderer(GroupCallMiniTextureView.getOrCreate(this.attachedRenderers, this.renderersContainer, null, null, groupCallGridCell, groupCallGridCell.getParticipant(), this.groupCall, this.activity));
        } else {
            if (z || groupCallGridCell.getRenderer() == null) {
                return;
            }
            groupCallGridCell.getRenderer().setTabletGridView(null);
            groupCallGridCell.setRenderer(null);
        }
    }

    @Override
    public final int getItemCount() {
        return this.videoParticipants.size();
    }

    public final int getItemHeight() {
        RecyclerListView recyclerListView = this.activity.tabletVideoGridView;
        int size = this.videoParticipants.size();
        if (size <= 1) {
            return recyclerListView.getMeasuredHeight();
        }
        return size <= 4 ? recyclerListView.getMeasuredHeight() / 2 : (int) (recyclerListView.getMeasuredHeight() / 2.5f);
    }

    @Override
    public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return false;
    }

    @Override
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        GroupCallGridCell groupCallGridCell = (GroupCallGridCell) viewHolder.itemView;
        ChatObject.VideoParticipant participant = groupCallGridCell.getParticipant();
        ArrayList arrayList = this.videoParticipants;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i)).participant;
        int size = arrayList.size();
        if (size > 1 && size != 2) {
            i2 = 3;
            if (size == 3 && i != 0 && i != 1) {
                i2 = 6;
            }
        } else {
            i2 = 6;
        }
        groupCallGridCell.spanCount = i2;
        groupCallGridCell.gridAdapter = this;
        if (groupCallGridCell.getMeasuredHeight() != getItemHeight()) {
            groupCallGridCell.requestLayout();
        }
        AccountInstance.getInstance(this.currentAccount);
        MessageObject.getPeerId(this.groupCall.selfPeer);
        groupCallGridCell.participant = videoParticipant;
        if (participant != null && !participant.equals(videoParticipant) && groupCallGridCell.attached && groupCallGridCell.getRenderer() != null) {
            attachRenderer$1(groupCallGridCell, false);
            attachRenderer$1(groupCallGridCell, true);
        } else if (groupCallGridCell.getRenderer() != null) {
            groupCallGridCell.getRenderer().updateAttachState(true);
        }
    }

    @Override
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new RecyclerListView.Holder(new GroupCallGridCell(viewGroup.getContext()) {
            @Override
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                GroupCallTabletGridAdapter groupCallTabletGridAdapter = GroupCallTabletGridAdapter.this;
                if (!groupCallTabletGridAdapter.visible || getParticipant() == null) {
                    return;
                }
                groupCallTabletGridAdapter.attachRenderer$1(this, true);
            }

            @Override
            public final void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                GroupCallTabletGridAdapter.this.attachRenderer$1(this, false);
            }
        });
    }

    public final void setRenderersPool(ArrayList arrayList, GroupCallActivity.AnonymousClass28 anonymousClass28) {
        this.attachedRenderers = arrayList;
        this.renderersContainer = anonymousClass28;
    }

    public final void setVisibility(RecyclerListView recyclerListView, boolean z, boolean z2) {
        this.visible = z;
        if (z2) {
            for (int i = 0; i < recyclerListView.getChildCount(); i++) {
                View childAt = recyclerListView.getChildAt(i);
                if (childAt instanceof GroupCallGridCell) {
                    GroupCallGridCell groupCallGridCell = (GroupCallGridCell) childAt;
                    if (groupCallGridCell.getParticipant() != null) {
                        attachRenderer$1(groupCallGridCell, z);
                    }
                }
            }
        }
    }

    public final void update(RecyclerListView recyclerListView, boolean z) {
        if (this.groupCall == null) {
            return;
        }
        ArrayList arrayList = this.videoParticipants;
        if (!z) {
            arrayList.clear();
            arrayList.addAll(this.groupCall.visibleVideoParticipants);
            this.mObservable.notifyChanged();
        } else {
            final ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.groupCall.visibleVideoParticipants);
            DiffUtil.calculateDiff(new DiffUtil() {
                @Override
                public final boolean areContentsTheSame(int i, int i2) {
                    return true;
                }

                @Override
                public final boolean areItemsTheSame(int i, int i2) {
                    ArrayList arrayList3 = arrayList2;
                    if (i >= arrayList3.size()) {
                        return false;
                    }
                    GroupCallTabletGridAdapter groupCallTabletGridAdapter = GroupCallTabletGridAdapter.this;
                    if (i2 < groupCallTabletGridAdapter.videoParticipants.size()) {
                        return ((ChatObject.VideoParticipant) arrayList3.get(i)).equals(groupCallTabletGridAdapter.videoParticipants.get(i2));
                    }
                    return false;
                }

                @Override
                public final int getNewListSize() {
                    return GroupCallTabletGridAdapter.this.videoParticipants.size();
                }

                @Override
                public final int getOldListSize() {
                    return arrayList2.size();
                }
            }, true).dispatchUpdatesTo(new GroupCallActivity.UpdateCallback(this, 1));
            AndroidUtilities.updateVisibleRows(recyclerListView);
        }
    }
}
