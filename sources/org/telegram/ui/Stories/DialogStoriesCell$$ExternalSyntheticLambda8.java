package org.telegram.ui.Stories;

public final class DialogStoriesCell$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final DialogStoriesCell f$0;

    public DialogStoriesCell$$ExternalSyntheticLambda8(DialogStoriesCell dialogStoriesCell, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogStoriesCell;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$makePremiumHint$17();
                break;
            case 1:
                this.f$0.checkLoadMore();
                break;
            case 2:
                this.f$0.onMiniListClicked();
                break;
            case 3:
                this.f$0.lambda$new$0$8();
                break;
            default:
                this.f$0.lambda$updateCurrentState$15();
                break;
        }
    }
}
