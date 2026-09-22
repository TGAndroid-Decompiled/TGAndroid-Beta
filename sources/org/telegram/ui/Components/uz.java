package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class uz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f28527a;
    public final DispatchQueue f28528b;

    public uz(DispatchQueue dispatchQueue, int i10) {
        this.f28527a = i10;
        this.f28528b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f28527a) {
            case 0:
                ((vz) this.f28528b).e(false, true, true);
                return;
            default:
                ((n50) this.f28528b).requestRender(true, false);
                return;
        }
    }
}
