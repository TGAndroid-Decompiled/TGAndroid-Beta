package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class uz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f28525a;
    public final DispatchQueue f28526b;

    public uz(DispatchQueue dispatchQueue, int i10) {
        this.f28525a = i10;
        this.f28526b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f28525a) {
            case 0:
                ((vz) this.f28526b).e(false, true, true);
                return;
            default:
                ((n50) this.f28526b).requestRender(true, false);
                return;
        }
    }
}
