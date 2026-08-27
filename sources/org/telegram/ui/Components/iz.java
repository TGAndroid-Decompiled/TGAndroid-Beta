package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;

public final class iz implements SurfaceTexture.OnFrameAvailableListener {

    public final int f29521a;

    public final DispatchQueue f29522b;

    public iz(DispatchQueue dispatchQueue, int i10) {
        this.f29521a = i10;
        this.f29522b = dispatchQueue;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.f29521a) {
            case 0:
                ((jz) this.f29522b).e(false, true, true);
                break;
            default:
                ((b50) this.f29522b).requestRender(true, false);
                break;
        }
    }
}
