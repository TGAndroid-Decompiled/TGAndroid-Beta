package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RecyclerListView;

public final class ChatUsersActivity$$ExternalSyntheticLambda2 implements AlertDialog.OnButtonClickListener, RecyclerListView.OnItemClickListenerExtended, RecyclerListView.OnItemLongClickListener, MessagesStorage.LongCallback {
    public final int $r8$classId;
    public final ChatUsersActivity f$0;

    public ChatUsersActivity$$ExternalSyntheticLambda2(ChatUsersActivity chatUsersActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatUsersActivity;
    }

    @Override
    public boolean hasDoubleTap(View view) {
        return false;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.processDone$7();
                break;
            default:
                this.f$0.lambda$checkDiscard$27(alertDialog, i);
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        this.f$0.lambda$createView$6(i, view);
    }

    @Override
    public void run(long j) {
        this.f$0.lambda$processDone$28(j);
    }

    @Override
    public boolean onItemClick(int i, View view) {
        ChatUsersActivity chatUsersActivity = this.f$0;
        if (chatUsersActivity.getParentActivity() != null) {
            RecyclerView.Adapter adapter = chatUsersActivity.listView.getAdapter();
            ChatUsersActivity.ListAdapter listAdapter = chatUsersActivity.listViewAdapter;
            if (adapter == listAdapter) {
                return chatUsersActivity.createMenuForParticipant(listAdapter.getItem(i), false, view);
            }
        }
        return false;
    }
}
