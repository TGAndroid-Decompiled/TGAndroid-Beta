package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class g00 implements SurfaceTexture.OnFrameAvailableListener {
    public final int f24856a;
    public final DispatchQueue f24857b;

    public g00(DispatchQueue dispatchQueue, int i10) {
        this.f24856a = i10;
        this.f24857b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f24856a) {
            case 0:
                ((h00) this.f24857b).d(false, true, true);
                return;
            default:
                ((b60) this.f24857b).requestRender(true, false);
                return;
        }
    }
}
