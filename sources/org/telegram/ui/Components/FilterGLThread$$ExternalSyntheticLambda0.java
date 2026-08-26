package org.telegram.ui.Components;

public final class FilterGLThread$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final FilterGLThread f$0;
    public final int f$1;
    public final int f$2;

    public FilterGLThread$$ExternalSyntheticLambda0(FilterGLThread filterGLThread, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = filterGLThread;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setVideoSize$4(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$setSurfaceTextureSize$9(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$updateUiBlurGradient$6(this.f$1, this.f$2);
                break;
        }
    }
}
