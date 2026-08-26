package org.telegram.ui;

public final class SelectAnimatedEmojiDialog$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final SelectAnimatedEmojiDialog f$0;

    public SelectAnimatedEmojiDialog$$ExternalSyntheticLambda2(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, int i) {
        this.$r8$classId = i;
        this.f$0 = selectAnimatedEmojiDialog;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onShow$37();
                break;
            case 1:
                this.f$0.lambda$onShow$38();
                break;
            case 2:
                this.f$0.lambda$search$12();
                break;
            case 3:
                this.f$0.lambda$new$34();
                break;
            default:
                this.f$0.lambda$new$35();
                break;
        }
    }
}
