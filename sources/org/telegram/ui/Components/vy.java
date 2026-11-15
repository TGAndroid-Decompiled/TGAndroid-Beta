package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
public final class vy implements SurfaceTexture.OnFrameAvailableListener {
    public final int f41181a;
    public final org.telegram.messenger.q5 f41182b;

    public vy(org.telegram.messenger.q5 q5Var, int i7) {
        this.f41181a = i7;
        this.f41182b = q5Var;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f41181a) {
            case 0:
                ((wy) this.f41182b).c(false, true, true);
                return;
            default:
                ((d40) this.f41182b).requestRender(true, false);
                return;
        }
    }
}
