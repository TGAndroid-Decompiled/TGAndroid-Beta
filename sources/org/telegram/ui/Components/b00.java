package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class b00 implements SurfaceTexture.OnFrameAvailableListener {
    public final int f21669a;
    public final DispatchQueue f21670b;

    public b00(DispatchQueue dispatchQueue, int i10) {
        this.f21669a = i10;
        this.f21670b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f21669a) {
            case 0:
                ((c00) this.f21670b).e(false, true, true);
                return;
            default:
                ((x50) this.f21670b).requestRender(true, false);
                return;
        }
    }
}
