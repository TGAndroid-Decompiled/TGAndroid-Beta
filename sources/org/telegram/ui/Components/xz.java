package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class xz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f32999a;
    public final DispatchQueue f33000b;

    public xz(DispatchQueue dispatchQueue, int i10) {
        this.f32999a = i10;
        this.f33000b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f32999a) {
            case 0:
                ((yz) this.f33000b).e(false, true, true);
                return;
            default:
                ((q50) this.f33000b).requestRender(true, false);
                return;
        }
    }
}
