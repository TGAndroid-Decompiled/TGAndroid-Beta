package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class d00 implements SurfaceTexture.OnFrameAvailableListener {
    public final int f27307a;
    public final DispatchQueue f27308b;

    public d00(DispatchQueue dispatchQueue, int i10) {
        this.f27307a = i10;
        this.f27308b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f27307a) {
            case 0:
                ((e00) this.f27308b).d(false, true, true);
                return;
            default:
                ((z50) this.f27308b).requestRender(true, false);
                return;
        }
    }
}
