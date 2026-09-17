package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class uz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f31050a;
    public final DispatchQueue f31051b;

    public uz(DispatchQueue dispatchQueue, int i10) {
        this.f31050a = i10;
        this.f31051b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f31050a) {
            case 0:
                ((vz) this.f31051b).e(false, true, true);
                return;
            default:
                ((n50) this.f31051b).requestRender(true, false);
                return;
        }
    }
}
