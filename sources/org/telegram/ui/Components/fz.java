package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
public final class fz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f26172a;
    public final org.telegram.messenger.s5 f26173b;

    public fz(org.telegram.messenger.s5 s5Var, int i10) {
        this.f26172a = i10;
        this.f26173b = s5Var;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f26172a) {
            case 0:
                ((gz) this.f26173b).c(false, true, true);
                return;
            default:
                ((r40) this.f26173b).requestRender(true, false);
                return;
        }
    }
}
