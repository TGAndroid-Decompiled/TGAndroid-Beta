package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class vz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f29814a;
    public final DispatchQueue f29815b;

    public vz(DispatchQueue dispatchQueue, int i10) {
        this.f29814a = i10;
        this.f29815b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f29814a) {
            case 0:
                ((wz) this.f29815b).e(false, true, true);
                return;
            default:
                ((n50) this.f29815b).requestRender(true, false);
                return;
        }
    }
}
