package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class vz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f29830a;
    public final DispatchQueue f29831b;

    public vz(DispatchQueue dispatchQueue, int i10) {
        this.f29830a = i10;
        this.f29831b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f29830a) {
            case 0:
                ((wz) this.f29831b).e(false, true, true);
                return;
            default:
                ((n50) this.f29831b).requestRender(true, false);
                return;
        }
    }
}
