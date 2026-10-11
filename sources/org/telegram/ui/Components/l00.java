package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class l00 implements SurfaceTexture.OnFrameAvailableListener {
    public final int f28168a;
    public final DispatchQueue f28169b;

    public l00(DispatchQueue dispatchQueue, int i10) {
        this.f28168a = i10;
        this.f28169b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f28168a) {
            case 0:
                ((m00) this.f28169b).e(false, true, true);
                return;
            default:
                ((f60) this.f28169b).requestRender(true, false);
                return;
        }
    }
}
