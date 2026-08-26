package org.telegram.ui.Components;

public final class FilterGLThread$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final FilterGLThread f$0;

    public FilterGLThread$$ExternalSyntheticLambda2(FilterGLThread filterGLThread, int i) {
        this.$r8$classId = i;
        this.f$0 = filterGLThread;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$shutdown$8();
                break;
            case 1:
                this.f$0.lambda$new$5();
                break;
            default:
                this.f$0.lambda$initGL$3();
                break;
        }
    }
}
