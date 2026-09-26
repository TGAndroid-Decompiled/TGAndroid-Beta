package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class vz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f29829a;
    public final DispatchQueue f29830b;

    public vz(DispatchQueue dispatchQueue, int i10) {
        this.f29829a = i10;
        this.f29830b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f29829a) {
            case 0:
                ((wz) this.f29830b).e(false, true, true);
                return;
            default:
                ((n50) this.f29830b).requestRender(true, false);
                return;
        }
    }
}
