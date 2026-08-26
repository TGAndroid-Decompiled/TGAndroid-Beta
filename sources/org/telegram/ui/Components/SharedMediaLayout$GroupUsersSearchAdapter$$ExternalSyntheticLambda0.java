package org.telegram.ui.Components;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.ManageChatUserCell;

public final class SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda0 implements SearchAdapterHelper.SearchAdapterHelperDelegate, ManageChatUserCell.ManageChatUserCellDelegate {
    public final SharedMediaLayout.GroupUsersSearchAdapter f$0;

    public SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda0(SharedMediaLayout.GroupUsersSearchAdapter groupUsersSearchAdapter) {
        this.f$0 = groupUsersSearchAdapter;
    }

    @Override
    public boolean canApplySearchResults(int i) {
        return true;
    }

    @Override
    public LongSparseArray getExcludeCallParticipants() {
        return null;
    }

    @Override
    public void getExcludeUsers() {
    }

    @Override
    public void onDataSetChanged(int i) {
        SharedMediaLayout.GroupUsersSearchAdapter groupUsersSearchAdapter = this.f$0;
        groupUsersSearchAdapter.notifyDataSetChanged();
        if (i != 1) {
            return;
        }
        int i2 = groupUsersSearchAdapter.searchCount - 1;
        groupUsersSearchAdapter.searchCount = i2;
        if (i2 != 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            SharedMediaLayout.MediaPage[] mediaPageArr = sharedMediaLayout.mediaPages;
            if (i3 >= mediaPageArr.length) {
                return;
            }
            SharedMediaLayout.MediaPage mediaPage = mediaPageArr[i3];
            if (mediaPage.selectedType == 7) {
                if (groupUsersSearchAdapter.totalCount == 0) {
                    mediaPage.emptyView.showProgress(false, true);
                } else {
                    sharedMediaLayout.animateItemsEnter(mediaPage.listView, 0, null);
                }
            }
            i3++;
        }
    }

    @Override
    public boolean onOptionsButtonCheck(ManageChatUserCell manageChatUserCell, boolean z) {
        Object obj;
        SharedMediaLayout.GroupUsersSearchAdapter groupUsersSearchAdapter = this.f$0;
        TLObject item = groupUsersSearchAdapter.getItem(((Integer) manageChatUserCell.getTag()).intValue());
        if (!(item instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) item;
        boolean z2 = !z;
        if (channelParticipant != null) {
            obj = channelParticipant;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
            tL_chatChannelParticipant.channelParticipant = channelParticipant;
            tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
            tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
            tL_chatChannelParticipant.date = channelParticipant.date;
            obj = tL_chatChannelParticipant;
        }
        obj = channelParticipant;
        return SharedMediaLayout.this.delegate.onMemberClick((TLRPC.ChatParticipant) obj, true, z2, manageChatUserCell);
    }

    @Override
    public void onSetHashtags(ArrayList arrayList) {
    }
}
