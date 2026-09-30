package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class xz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f30532a;
    public final DispatchQueue f30533b;

    public xz(DispatchQueue dispatchQueue, int i10) {
        this.f30532a = i10;
        this.f30533b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f30532a) {
            case 0:
                ((yz) this.f30533b).e(false, true, true);
                return;
            default:
                ((q50) this.f30533b).requestRender(true, false);
                return;
        }
    }
}
