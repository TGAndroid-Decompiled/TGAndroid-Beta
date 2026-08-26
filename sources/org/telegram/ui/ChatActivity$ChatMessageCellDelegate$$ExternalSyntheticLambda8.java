package org.telegram.ui;

import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;

public final class ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity.ChatMessageCellDelegate f$0;

    public ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda8(ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = chatMessageCellDelegate;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = this.f$0;
                chatMessageCellDelegate.getClass();
                ChatActivity chatActivity = ChatActivity.this;
                chatActivity.showDialog(new PremiumFeatureBottomSheet((BaseFragment) chatActivity, 39, false));
                break;
            case 1:
                ChatActivity chatActivity2 = ChatActivity.this;
                chatActivity2.selectedObject = null;
                chatActivity2.selectedObjectGroup = null;
                break;
            case 2:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate2 = this.f$0;
                chatMessageCellDelegate2.getClass();
                ChatActivity chatActivity3 = ChatActivity.this;
                new PremiumFeatureBottomSheet((BaseFragment) chatActivity3, 8, true).show();
                chatActivity3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate3 = this.f$0;
                chatMessageCellDelegate3.getClass();
                ChatActivity chatActivity4 = ChatActivity.this;
                new PremiumFeatureBottomSheet((BaseFragment) chatActivity4, 8, true).show();
                chatActivity4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate4 = this.f$0;
                chatMessageCellDelegate4.getClass();
                ChatActivity chatActivity5 = ChatActivity.this;
                new PremiumFeatureBottomSheet((BaseFragment) chatActivity5, 8, true).show();
                chatActivity5.getMessagesController().pressTranscribeButton();
                break;
            case 5:
                ChatActivity chatActivity6 = ChatActivity.this;
                chatActivity6.selectedObject = null;
                chatActivity6.selectedObjectGroup = null;
                break;
            case 6:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate5 = this.f$0;
                chatMessageCellDelegate5.getClass();
                ChatActivity.this.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 7:
                ChatActivity.this.chatActivityEnterView.openKeyboard();
                break;
            case 8:
                ChatActivity.this.chatActivityEnterView.openKeyboard();
                break;
            default:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate6 = this.f$0;
                chatMessageCellDelegate6.getClass();
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.highlightSensitiveRow = true;
                ChatActivity.this.presentFragment(themeActivity);
                break;
        }
    }
}
