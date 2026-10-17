package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class d00 implements SurfaceTexture.OnFrameAvailableListener {
    public final int f25416a;
    public final DispatchQueue f25417b;

    public d00(DispatchQueue dispatchQueue, int i10) {
        this.f25416a = i10;
        this.f25417b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f25416a) {
            case 0:
                ((e00) this.f25417b).d(false, true, true);
                return;
            default:
                ((x50) this.f25417b).requestRender(true, false);
                return;
        }
    }
}
