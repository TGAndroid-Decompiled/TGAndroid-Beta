package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class uz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f28530a;
    public final DispatchQueue f28531b;

    public uz(DispatchQueue dispatchQueue, int i10) {
        this.f28530a = i10;
        this.f28531b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f28530a) {
            case 0:
                ((vz) this.f28531b).e(false, true, true);
                return;
            default:
                ((n50) this.f28531b).requestRender(true, false);
                return;
        }
    }
}
