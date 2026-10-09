package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class k00 implements SurfaceTexture.OnFrameAvailableListener {
    public final int f27812a;
    public final DispatchQueue f27813b;

    public k00(DispatchQueue dispatchQueue, int i10) {
        this.f27812a = i10;
        this.f27813b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f27812a) {
            case 0:
                ((l00) this.f27813b).e(false, true, true);
                return;
            default:
                ((e60) this.f27813b).requestRender(true, false);
                return;
        }
    }
}
