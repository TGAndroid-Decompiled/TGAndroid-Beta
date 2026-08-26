package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Cells.CheckBoxCell;

public final class ChatActivity$$ExternalSyntheticLambda204 implements View.OnClickListener {
    public final int $r8$classId;
    public final CheckBoxCell[] f$0;

    public ChatActivity$$ExternalSyntheticLambda204(CheckBoxCell[] checkBoxCellArr, int i) {
        this.$r8$classId = i;
        this.f$0 = checkBoxCellArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity.lambda$showRequestUrlAlert$384(this.f$0, view);
                break;
            case 1:
                GroupCallActivity.lambda$onLeaveClick$67(this.f$0, view);
                break;
            case 2:
                GroupCreateActivity.lambda$onDonePressed$15(this.f$0, view);
                break;
            default:
                ProfileActivity.lambda$createView$21(this.f$0, view);
                break;
        }
    }
}
