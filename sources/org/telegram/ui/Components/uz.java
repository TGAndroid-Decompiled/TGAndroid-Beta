package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class uz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f28877a;
    public final DispatchQueue f28878b;

    public uz(DispatchQueue dispatchQueue, int i10) {
        this.f28877a = i10;
        this.f28878b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f28877a) {
            case 0:
                ((vz) this.f28878b).e(false, true, true);
                return;
            default:
                ((m50) this.f28878b).requestRender(true, false);
                return;
        }
    }
}
