package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
public final class az implements SurfaceTexture.OnFrameAvailableListener {
    public final int f33583a;
    public final org.telegram.messenger.r5 f33584b;

    public az(org.telegram.messenger.r5 r5Var, int i7) {
        this.f33583a = i7;
        this.f33584b = r5Var;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f33583a) {
            case 0:
                ((bz) this.f33584b).c(false, true, true);
                return;
            default:
                ((l40) this.f33584b).requestRender(true, false);
                return;
        }
    }
}
