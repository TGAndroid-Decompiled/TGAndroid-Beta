package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
public final class vy implements SurfaceTexture.OnFrameAvailableListener {
    public final int f41184a;
    public final org.telegram.messenger.q5 f41185b;

    public vy(org.telegram.messenger.q5 q5Var, int i7) {
        this.f41184a = i7;
        this.f41185b = q5Var;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f41184a) {
            case 0:
                ((wy) this.f41185b).c(false, true, true);
                return;
            default:
                ((d40) this.f41185b).requestRender(true, false);
                return;
        }
    }
}
