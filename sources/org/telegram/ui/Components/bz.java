package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
public final class bz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f33817a;
    public final org.telegram.messenger.r5 f33818b;

    public bz(org.telegram.messenger.r5 r5Var, int i7) {
        this.f33817a = i7;
        this.f33818b = r5Var;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f33817a) {
            case 0:
                ((cz) this.f33818b).c(false, true, true);
                return;
            default:
                ((l40) this.f33818b).requestRender(true, false);
                return;
        }
    }
}
