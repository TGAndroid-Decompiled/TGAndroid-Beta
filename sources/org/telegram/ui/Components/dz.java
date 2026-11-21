package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
public final class dz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f34619a;
    public final org.telegram.messenger.r5 f34620b;

    public dz(org.telegram.messenger.r5 r5Var, int i7) {
        this.f34619a = i7;
        this.f34620b = r5Var;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f34619a) {
            case 0:
                ((ez) this.f34620b).c(false, true, true);
                return;
            default:
                ((o40) this.f34620b).requestRender(true, false);
                return;
        }
    }
}
