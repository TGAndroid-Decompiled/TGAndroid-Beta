package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class xz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f33121a;
    public final DispatchQueue f33122b;

    public xz(DispatchQueue dispatchQueue, int i10) {
        this.f33121a = i10;
        this.f33122b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f33121a) {
            case 0:
                ((yz) this.f33122b).e(false, true, true);
                return;
            default:
                ((q50) this.f33122b).requestRender(true, false);
                return;
        }
    }
}
