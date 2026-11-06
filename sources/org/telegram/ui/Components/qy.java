package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
public final class qy implements SurfaceTexture.OnFrameAvailableListener {
    public final int f37424a;
    public final org.telegram.messenger.q5 f37425b;

    public qy(org.telegram.messenger.q5 q5Var, int i7) {
        this.f37424a = i7;
        this.f37425b = q5Var;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f37424a) {
            case 0:
                ((ry) this.f37425b).c(false, true, true);
                return;
            default:
                ((a40) this.f37425b).requestRender(true, false);
                return;
        }
    }
}
