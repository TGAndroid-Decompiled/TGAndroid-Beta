package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class uz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f28522a;
    public final DispatchQueue f28523b;

    public uz(DispatchQueue dispatchQueue, int i10) {
        this.f28522a = i10;
        this.f28523b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f28522a) {
            case 0:
                ((vz) this.f28523b).e(false, true, true);
                return;
            default:
                ((n50) this.f28523b).requestRender(true, false);
                return;
        }
    }
}
