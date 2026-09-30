package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class wz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f30190a;
    public final DispatchQueue f30191b;

    public wz(DispatchQueue dispatchQueue, int i10) {
        this.f30190a = i10;
        this.f30191b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f30190a) {
            case 0:
                ((xz) this.f30191b).e(false, true, true);
                return;
            default:
                ((p50) this.f30191b).requestRender(true, false);
                return;
        }
    }
}
