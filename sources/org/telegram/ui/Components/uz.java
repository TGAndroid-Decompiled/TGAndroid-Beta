package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class uz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f28919a;
    public final DispatchQueue f28920b;

    public uz(DispatchQueue dispatchQueue, int i10) {
        this.f28919a = i10;
        this.f28920b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f28919a) {
            case 0:
                ((vz) this.f28920b).e(false, true, true);
                return;
            default:
                ((m50) this.f28920b).requestRender(true, false);
                return;
        }
    }
}
