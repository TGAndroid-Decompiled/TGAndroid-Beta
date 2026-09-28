package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class wz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f30205a;
    public final DispatchQueue f30206b;

    public wz(DispatchQueue dispatchQueue, int i10) {
        this.f30205a = i10;
        this.f30206b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f30205a) {
            case 0:
                ((xz) this.f30206b).e(false, true, true);
                return;
            default:
                ((p50) this.f30206b).requestRender(true, false);
                return;
        }
    }
}
