package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class xz implements SurfaceTexture.OnFrameAvailableListener {
    public final int f33006a;
    public final DispatchQueue f33007b;

    public xz(DispatchQueue dispatchQueue, int i10) {
        this.f33006a = i10;
        this.f33007b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f33006a) {
            case 0:
                ((yz) this.f33007b).e(false, true, true);
                return;
            default:
                ((q50) this.f33007b).requestRender(true, false);
                return;
        }
    }
}
