package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class uz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f28851a;
    public final DispatchQueue f28852b;

    public uz(DispatchQueue dispatchQueue, int i10) {
        this.f28851a = i10;
        this.f28852b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f28851a) {
            case 0:
                ((vz) this.f28852b).e(false, true, true);
                return;
            default:
                ((m50) this.f28852b).requestRender(true, false);
                return;
        }
    }
}
