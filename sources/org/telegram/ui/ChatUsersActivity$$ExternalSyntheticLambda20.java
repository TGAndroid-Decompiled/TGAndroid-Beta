package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RecyclerListView;

public final class ChatUsersActivity$$ExternalSyntheticLambda20 implements MessagesStorage.LongCallback, AlertDialog.OnButtonClickListener, RecyclerListView.OnItemClickListenerExtended, RecyclerListView.OnItemLongClickListener {
    public final int $r8$classId;
    public final ChatUsersActivity f$0;

    public ChatUsersActivity$$ExternalSyntheticLambda20(ChatUsersActivity chatUsersActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatUsersActivity;
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.lambda$checkDiscard$26(alertDialog, i);
                break;
            default:
                this.f$0.lambda$checkDiscard$27(alertDialog, i);
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        this.f$0.lambda$createView$6(view, i, f, f2);
    }

    @Override
    public void run(long j) {
        this.f$0.lambda$processDone$28(j);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return this.f$0.lambda$createView$7(view, i);
    }
}
