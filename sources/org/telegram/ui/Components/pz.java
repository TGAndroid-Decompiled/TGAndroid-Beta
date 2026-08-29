package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class pz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f31805a;
    public final DispatchQueue f31806b;

    public pz(DispatchQueue dispatchQueue, int i10) {
        this.f31805a = i10;
        this.f31806b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f31805a) {
            case 0:
                ((qz) this.f31806b).e(false, true, true);
                return;
            default:
                ((k50) this.f31806b).requestRender(true, false);
                return;
        }
    }
}
