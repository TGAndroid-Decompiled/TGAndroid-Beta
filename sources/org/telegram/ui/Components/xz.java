package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class xz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f33000a;
    public final DispatchQueue f33001b;

    public xz(DispatchQueue dispatchQueue, int i10) {
        this.f33000a = i10;
        this.f33001b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f33000a) {
            case 0:
                ((yz) this.f33001b).e(false, true, true);
                return;
            default:
                ((q50) this.f33001b).requestRender(true, false);
                return;
        }
    }
}
