package org.telegram.ui;

import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Components.SlideChooseView;

public final class ChatUsersActivity$ListAdapter$$ExternalSyntheticLambda2 implements SlideChooseView.Callback, ManageChatUserCell.ManageChatUserCellDelegate {
    public final int $r8$classId;
    public final ChatUsersActivity.ListAdapter f$0;

    public ChatUsersActivity$ListAdapter$$ExternalSyntheticLambda2(ChatUsersActivity.ListAdapter listAdapter, int i) {
        this.$r8$classId = i;
        this.f$0 = listAdapter;
    }

    @Override
    public void onOptionSelected(int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onCreateViewHolder$1(i);
                break;
            default:
                this.f$0.lambda$onCreateViewHolder$2(i);
                break;
        }
    }

    @Override
    public boolean onOptionsButtonCheck(ManageChatUserCell manageChatUserCell, boolean z) {
        return this.f$0.lambda$onCreateViewHolder$0(manageChatUserCell, z);
    }

    @Override
    public void onTouchEnd() {
        int i = this.$r8$classId;
        SlideChooseView.Callback.CC.$default$onTouchEnd(this);
    }
}
