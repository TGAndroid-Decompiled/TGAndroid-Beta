package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class uz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f31022a;
    public final DispatchQueue f31023b;

    public uz(DispatchQueue dispatchQueue, int i10) {
        this.f31022a = i10;
        this.f31023b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f31022a) {
            case 0:
                ((vz) this.f31023b).e(false, true, true);
                return;
            default:
                ((n50) this.f31023b).requestRender(true, false);
                return;
        }
    }
}
