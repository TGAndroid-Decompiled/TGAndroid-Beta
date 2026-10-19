package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class d00 implements SurfaceTexture.OnFrameAvailableListener {
    public final int f25376a;
    public final DispatchQueue f25377b;

    public d00(DispatchQueue dispatchQueue, int i10) {
        this.f25376a = i10;
        this.f25377b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f25376a) {
            case 0:
                ((e00) this.f25377b).d(false, true, true);
                return;
            default:
                ((x50) this.f25377b).requestRender(true, false);
                return;
        }
    }
}
