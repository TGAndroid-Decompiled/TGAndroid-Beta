package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class d00 implements SurfaceTexture.OnFrameAvailableListener {
    public final int f25297a;
    public final DispatchQueue f25298b;

    public d00(DispatchQueue dispatchQueue, int i10) {
        this.f25297a = i10;
        this.f25298b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f25297a) {
            case 0:
                ((e00) this.f25298b).d(false, true, true);
                return;
            default:
                ((x50) this.f25298b).requestRender(true, false);
                return;
        }
    }
}
