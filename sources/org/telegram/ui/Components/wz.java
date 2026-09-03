package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class wz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f32859a;
    public final DispatchQueue f32860b;

    public wz(DispatchQueue dispatchQueue, int i10) {
        this.f32859a = i10;
        this.f32860b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f32859a) {
            case 0:
                ((xz) this.f32860b).e(false, true, true);
                return;
            default:
                ((r50) this.f32860b).requestRender(true, false);
                return;
        }
    }
}
