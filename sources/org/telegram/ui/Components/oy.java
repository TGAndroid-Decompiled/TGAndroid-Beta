package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
public final class oy implements SurfaceTexture.OnFrameAvailableListener {
    public final int f36982a;
    public final org.telegram.messenger.q5 f36983b;

    public oy(org.telegram.messenger.q5 q5Var, int i3) {
        this.f36982a = i3;
        this.f36983b = q5Var;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f36982a) {
            case 0:
                ((py) this.f36983b).c(false, true, true);
                return;
            default:
                ((w30) this.f36983b).requestRender(true, false);
                return;
        }
    }
}
