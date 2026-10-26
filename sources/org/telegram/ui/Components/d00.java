package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class d00 implements SurfaceTexture.OnFrameAvailableListener {
    public final int f27325a;
    public final DispatchQueue f27326b;

    public d00(DispatchQueue dispatchQueue, int i10) {
        this.f27325a = i10;
        this.f27326b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f27325a) {
            case 0:
                ((e00) this.f27326b).d(false, true, true);
                return;
            default:
                ((z50) this.f27326b).requestRender(true, false);
                return;
        }
    }
}
