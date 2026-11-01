package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
public final class fz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f26235a;
    public final org.telegram.messenger.s5 f26236b;

    public fz(org.telegram.messenger.s5 s5Var, int i10) {
        this.f26235a = i10;
        this.f26236b = s5Var;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f26235a) {
            case 0:
                ((gz) this.f26236b).c(false, true, true);
                return;
            default:
                ((r40) this.f26236b).requestRender(true, false);
                return;
        }
    }
}
