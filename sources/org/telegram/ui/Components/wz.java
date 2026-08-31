package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class wz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f32868a;
    public final DispatchQueue f32869b;

    public wz(DispatchQueue dispatchQueue, int i10) {
        this.f32868a = i10;
        this.f32869b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f32868a) {
            case 0:
                ((xz) this.f32869b).e(false, true, true);
                return;
            default:
                ((r50) this.f32869b).requestRender(true, false);
                return;
        }
    }
}
