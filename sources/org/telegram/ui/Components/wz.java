package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class wz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f30204a;
    public final DispatchQueue f30205b;

    public wz(DispatchQueue dispatchQueue, int i10) {
        this.f30204a = i10;
        this.f30205b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f30204a) {
            case 0:
                ((xz) this.f30205b).e(false, true, true);
                return;
            default:
                ((p50) this.f30205b).requestRender(true, false);
                return;
        }
    }
}
