package org.telegram.ui;

import org.telegram.ui.Components.FilterGLThread;
import org.telegram.ui.Components.FilterShaders;

public final class LoginActivity$$ExternalSyntheticLambda25 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;
    public final boolean f$2;
    public final boolean f$3;

    public LoginActivity$$ExternalSyntheticLambda25(Object obj, boolean z, boolean z2, boolean z3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = z2;
        this.f$3 = z3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((LoginActivity) this.f$0).showEditDoneProgress(this.f$1, this.f$2, this.f$3);
                break;
            default:
                FilterGLThread filterGLThread = (FilterGLThread) this.f$0;
                if (this.f$1) {
                    FilterShaders filterShaders = filterGLThread.filterShaders;
                    filterShaders.needUpdateBlurTexture = true;
                    filterShaders.needUpdateSkinTexture = true;
                }
                if (this.f$2) {
                    filterGLThread.updateSurface = true;
                } else {
                    filterGLThread.getClass();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f$3 || Math.abs(filterGLThread.lastRenderCallTime - jCurrentTimeMillis) > 30) {
                    filterGLThread.lastRenderCallTime = jCurrentTimeMillis;
                    filterGLThread.drawRunnable.run();
                }
                break;
        }
    }
}
