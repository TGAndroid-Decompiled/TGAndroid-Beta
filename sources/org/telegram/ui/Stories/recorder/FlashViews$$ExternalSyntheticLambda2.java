package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.AndroidUtilities;

public final class FlashViews$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final FlashViews f$0;
    public final HintView2$$ExternalSyntheticLambda0 f$1;

    public FlashViews$$ExternalSyntheticLambda2(FlashViews flashViews, HintView2$$ExternalSyntheticLambda0 hintView2$$ExternalSyntheticLambda0, int i) {
        this.$r8$classId = i;
        this.f$0 = flashViews;
        this.f$1 = hintView2$$ExternalSyntheticLambda0;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                FlashViews flashViews = this.f$0;
                flashViews.getClass();
                AndroidUtilities.runOnUIThread(new FlashViews$$ExternalSyntheticLambda2(flashViews, this.f$1, 1), 320L);
                break;
            default:
                FlashViews flashViews2 = this.f$0;
                flashViews2.getClass();
                this.f$1.run(new HintView2$$ExternalSyntheticLambda0(flashViews2, 4));
                break;
        }
    }
}
