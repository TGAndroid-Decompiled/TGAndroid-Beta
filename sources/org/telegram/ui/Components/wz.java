package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class wz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f30208a;
    public final DispatchQueue f30209b;

    public wz(DispatchQueue dispatchQueue, int i10) {
        this.f30208a = i10;
        this.f30209b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f30208a) {
            case 0:
                ((xz) this.f30209b).e(false, true, true);
                return;
            default:
                ((p50) this.f30209b).requestRender(true, false);
                return;
        }
    }
}
