package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;
public final class n00 implements SurfaceTexture.OnFrameAvailableListener {
    public final int f28705a;
    public final DispatchQueue f28706b;

    public n00(DispatchQueue dispatchQueue, int i10) {
        this.f28705a = i10;
        this.f28706b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f28705a) {
            case 0:
                ((o00) this.f28706b).e(false, true, true);
                return;
            default:
                ((i60) this.f28706b).requestRender(true, false);
                return;
        }
    }
}
