package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class uz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f29305a;
    public final DispatchQueue f29306b;

    public uz(DispatchQueue dispatchQueue, int i10) {
        this.f29305a = i10;
        this.f29306b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f29305a) {
            case 0:
                ((vz) this.f29306b).e(false, true, true);
                return;
            default:
                ((p50) this.f29306b).requestRender(true, false);
                return;
        }
    }
}
