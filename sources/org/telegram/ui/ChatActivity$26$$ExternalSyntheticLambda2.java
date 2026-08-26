package org.telegram.ui;

public final class ChatActivity$26$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$26$$ExternalSyntheticLambda2(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void run() {
        ChatActivity chatActivity = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity.access$25900(chatActivity);
                break;
            case 1:
                ChatActivity.access$25900(chatActivity);
                break;
            case 2:
                int i = ChatActivity.SKELETON_LIGHT_OVERLAY_ALPHA;
                chatActivity.resetProgressDialogLoading();
                break;
            case 3:
                int i2 = ChatActivity.SKELETON_LIGHT_OVERLAY_ALPHA;
                chatActivity.resetProgressDialogLoading();
                break;
            case 4:
                int i3 = ChatActivity.SKELETON_LIGHT_OVERLAY_ALPHA;
                chatActivity.resetProgressDialogLoading();
                break;
            case 5:
                int i4 = ChatActivity.SKELETON_LIGHT_OVERLAY_ALPHA;
                chatActivity.resetProgressDialogLoading();
                break;
            case 6:
                int i5 = ChatActivity.SKELETON_LIGHT_OVERLAY_ALPHA;
                chatActivity.resetProgressDialogLoading();
                break;
            case 7:
                int i6 = ChatActivity.SKELETON_LIGHT_OVERLAY_ALPHA;
                chatActivity.resetProgressDialogLoading();
                break;
            case 8:
                int i7 = ChatActivity.SKELETON_LIGHT_OVERLAY_ALPHA;
                chatActivity.resetProgressDialogLoading();
                break;
            case 9:
                int i8 = ChatActivity.SKELETON_LIGHT_OVERLAY_ALPHA;
                chatActivity.resetProgressDialogLoading();
                break;
            case 10:
                if (chatActivity.getParentLayout() != null) {
                    TopicsFragment.prepareToSwitchAnimation(chatActivity);
                }
                break;
            default:
                chatActivity.startFireworks();
                break;
        }
    }
}
