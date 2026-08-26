package org.telegram.ui;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.ManageChatUserCell;

public final class ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda2 implements ManageChatUserCell.ManageChatUserCellDelegate, SearchAdapterHelper.SearchAdapterHelperDelegate {
    public final ChatUsersActivity.SearchAdapter f$0;

    public ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda2(ChatUsersActivity.SearchAdapter searchAdapter) {
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
    public LongSparseArray getExcludeUsers() {
        return null;
    }

    @Override
    public void onDataSetChanged(int i) {
        this.f$0.lambda$new$0(i);
    }

    @Override
    public boolean onOptionsButtonCheck(ManageChatUserCell manageChatUserCell, boolean z) {
        return this.f$0.lambda$onCreateViewHolder$5(manageChatUserCell, z);
    }

    @Override
    public void onSetHashtags(ArrayList arrayList, HashMap map) {
    }
}
