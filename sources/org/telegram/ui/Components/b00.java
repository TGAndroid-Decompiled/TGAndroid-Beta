package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class b00 implements SurfaceTexture.OnFrameAvailableListener {
    public final int f24859a;
    public final DispatchQueue f24860b;

    public b00(DispatchQueue dispatchQueue, int i10) {
        this.f24859a = i10;
        this.f24860b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f24859a) {
            case 0:
                ((c00) this.f24860b).d(false, true, true);
                return;
            default:
                ((v50) this.f24860b).requestRender(true, false);
                return;
        }
    }
}
