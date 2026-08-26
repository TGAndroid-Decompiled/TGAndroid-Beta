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

    private final void onTouchEnd$org$telegram$ui$ChatUsersActivity$ListAdapter$$ExternalSyntheticLambda2() {
    }

    private final void onTouchEnd$org$telegram$ui$ChatUsersActivity$ListAdapter$$ExternalSyntheticLambda3() {
    }

    @Override
    public void onOptionSelected(int i) {
        switch (this.$r8$classId) {
            case 0:
                ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
                if (chatUsersActivity.info != null) {
                    int i2 = chatUsersActivity.selectedSlowmode;
                    boolean z = (i2 > 0 && i == 0) || (i2 == 0 && i > 0);
                    chatUsersActivity.selectedSlowmode = i;
                    if (z) {
                        ChatUsersActivity.DiffCallback diffCallbackSaveState = chatUsersActivity.saveState();
                        chatUsersActivity.updateRows$4();
                        chatUsersActivity.updateListAnimated(diffCallbackSaveState);
                    }
                    chatUsersActivity.listViewAdapter.notifyItemChanged(chatUsersActivity.slowmodeInfoRow);
                    break;
                }
                break;
            default:
                ChatUsersActivity.this.notRestrictBoosters = i + 1;
                break;
        }
    }

    @Override
    public boolean onOptionsButtonCheck(ManageChatUserCell manageChatUserCell, boolean z) {
        ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
        return chatUsersActivity.createMenuForParticipant(chatUsersActivity.listViewAdapter.getItem(((Integer) manageChatUserCell.getTag()).intValue()), !z, manageChatUserCell);
    }

    @Override
    public void onTouchEnd() {
        int i = this.$r8$classId;
    }
}
