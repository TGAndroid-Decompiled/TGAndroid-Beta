package org.telegram.ui;

public final class SelectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow f$0;

    public SelectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1(SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow, int i) {
        this.$r8$classId = i;
        this.f$0 = selectAnimatedEmojiDialogWindow;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$dismiss$1();
                break;
            default:
                this.f$0.dismiss();
                break;
        }
    }
}
