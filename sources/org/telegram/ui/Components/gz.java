package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class gz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f28897a;
    public final DispatchQueue f28898b;

    public gz(DispatchQueue dispatchQueue, int i9) {
        this.f28897a = i9;
        this.f28898b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f28897a) {
            case 0:
                ((hz) this.f28898b).e(false, true, true);
                return;
            default:
                ((w40) this.f28898b).requestRender(true, false);
                return;
        }
    }
}
