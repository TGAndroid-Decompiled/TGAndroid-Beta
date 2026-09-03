package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class uz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f29320a;
    public final DispatchQueue f29321b;

    public uz(DispatchQueue dispatchQueue, int i10) {
        this.f29320a = i10;
        this.f29321b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f29320a) {
            case 0:
                ((vz) this.f29321b).e(false, true, true);
                return;
            default:
                ((q50) this.f29321b).requestRender(true, false);
                return;
        }
    }
}
