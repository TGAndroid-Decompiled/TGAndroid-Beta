package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
public final class qy implements SurfaceTexture.OnFrameAvailableListener {
    public final int f37426a;
    public final org.telegram.messenger.q5 f37427b;

    public qy(org.telegram.messenger.q5 q5Var, int i7) {
        this.f37426a = i7;
        this.f37427b = q5Var;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f37426a) {
            case 0:
                ((ry) this.f37427b).c(false, true, true);
                return;
            default:
                ((a40) this.f37427b).requestRender(true, false);
                return;
        }
    }
}
