package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
public final class ry implements SurfaceTexture.OnFrameAvailableListener {
    public final int f37839a;
    public final org.telegram.messenger.q5 f37840b;

    public ry(org.telegram.messenger.q5 q5Var, int i7) {
        this.f37839a = i7;
        this.f37840b = q5Var;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f37839a) {
            case 0:
                ((sy) this.f37840b).c(false, true, true);
                return;
            default:
                ((b40) this.f37840b).requestRender(true, false);
                return;
        }
    }
}
