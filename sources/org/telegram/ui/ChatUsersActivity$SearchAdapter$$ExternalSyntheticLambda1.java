package org.telegram.ui;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.ManageChatUserCell;

public final class ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda1 implements ManageChatUserCell.ManageChatUserCellDelegate, SearchAdapterHelper.SearchAdapterHelperDelegate {
    public final ChatUsersActivity.SearchAdapter f$0;

    public ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda1(ChatUsersActivity.SearchAdapter searchAdapter) {
        this.f$0 = searchAdapter;
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
        ChatUsersActivity.SearchAdapter searchAdapter = this.f$0;
        if (searchAdapter.searchAdapterHelper.isSearchInProgress()) {
            return;
        }
        int i2 = searchAdapter.totalCount;
        searchAdapter.notifyDataSetChanged();
        int i3 = searchAdapter.totalCount;
        ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
        if (i3 > i2) {
            chatUsersActivity.showItemsAnimated(i2);
        }
        if (searchAdapter.searchInProgress || searchAdapter.totalCount != 0 || i == 0) {
            return;
        }
        chatUsersActivity.emptyView.showProgress(false, true);
    }

    @Override
    public boolean onOptionsButtonCheck(ManageChatUserCell manageChatUserCell, boolean z) {
        ChatUsersActivity.SearchAdapter searchAdapter = this.f$0;
        TLObject item = searchAdapter.getItem(((Integer) manageChatUserCell.getTag()).intValue());
        if (!(item instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return ChatUsersActivity.this.createMenuForParticipant((TLRPC.ChannelParticipant) item, !z, manageChatUserCell);
    }

    @Override
    public void onSetHashtags(ArrayList arrayList) {
    }
}
