package org.telegram.ui;

import org.telegram.ui.Stories.recorder.HintView2;

public final class PhotoViewer$$ExternalSyntheticLambda54 implements Runnable {
    public final int $r8$classId;
    public final PhotoViewer f$0;
    public final HintView2 f$1;

    public PhotoViewer$$ExternalSyntheticLambda54(PhotoViewer photoViewer, HintView2 hintView2, int i) {
        this.$r8$classId = i;
        this.f$0 = photoViewer;
        this.f$1 = hintView2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setParentActivity$36(this.f$1);
                break;
            default:
                this.f$0.lambda$setParentActivity$34(this.f$1);
                break;
        }
    }
}
