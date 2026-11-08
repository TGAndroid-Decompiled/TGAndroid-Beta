package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
public final class ry implements SurfaceTexture.OnFrameAvailableListener {
    public final int f37804a;
    public final org.telegram.messenger.q5 f37805b;

    public ry(org.telegram.messenger.q5 q5Var, int i7) {
        this.f37804a = i7;
        this.f37805b = q5Var;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f37804a) {
            case 0:
                ((sy) this.f37805b).c(false, true, true);
                return;
            default:
                ((a40) this.f37805b).requestRender(true, false);
                return;
        }
    }
}
