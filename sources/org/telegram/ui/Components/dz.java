package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
public final class dz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f34614a;
    public final org.telegram.messenger.r5 f34615b;

    public dz(org.telegram.messenger.r5 r5Var, int i7) {
        this.f34614a = i7;
        this.f34615b = r5Var;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f34614a) {
            case 0:
                ((ez) this.f34615b).c(false, true, true);
                return;
            default:
                ((o40) this.f34615b).requestRender(true, false);
                return;
        }
    }
}
