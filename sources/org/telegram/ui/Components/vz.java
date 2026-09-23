package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class vz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f29437a;
    public final DispatchQueue f29438b;

    public vz(DispatchQueue dispatchQueue, int i10) {
        this.f29437a = i10;
        this.f29438b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f29437a) {
            case 0:
                ((wz) this.f29438b).e(false, true, true);
                return;
            default:
                ((o50) this.f29438b).requestRender(true, false);
                return;
        }
    }
}
