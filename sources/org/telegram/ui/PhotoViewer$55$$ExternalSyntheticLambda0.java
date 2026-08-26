package org.telegram.ui;

public final class PhotoViewer$55$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final PhotoViewer.AnonymousClass55 f$0;

    public PhotoViewer$55$$ExternalSyntheticLambda0(PhotoViewer.AnonymousClass55 anonymousClass55, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass55;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onRenderedFirstFrame$1();
                break;
            case 1:
                this.f$0.lambda$onSurfaceTextureUpdated$3();
                break;
            default:
                this.f$0.lambda$onRenderedFirstFrame$2();
                break;
        }
    }
}
