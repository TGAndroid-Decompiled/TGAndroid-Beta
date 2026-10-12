package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class g00 implements SurfaceTexture.OnFrameAvailableListener {
    public final int f25158a;
    public final DispatchQueue f25159b;

    public g00(DispatchQueue dispatchQueue, int i10) {
        this.f25158a = i10;
        this.f25159b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f25158a) {
            case 0:
                ((h00) this.f25159b).d(false, true, true);
                return;
            default:
                ((a60) this.f25159b).requestRender(true, false);
                return;
        }
    }
}
