package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class uz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f31049a;
    public final DispatchQueue f31050b;

    public uz(DispatchQueue dispatchQueue, int i10) {
        this.f31049a = i10;
        this.f31050b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f31049a) {
            case 0:
                ((vz) this.f31050b).e(false, true, true);
                return;
            default:
                ((n50) this.f31050b).requestRender(true, false);
                return;
        }
    }
}
