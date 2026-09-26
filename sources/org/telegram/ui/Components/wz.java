package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class wz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f30222a;
    public final DispatchQueue f30223b;

    public wz(DispatchQueue dispatchQueue, int i10) {
        this.f30222a = i10;
        this.f30223b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f30222a) {
            case 0:
                ((xz) this.f30223b).e(false, true, true);
                return;
            default:
                ((o50) this.f30223b).requestRender(true, false);
                return;
        }
    }
}
