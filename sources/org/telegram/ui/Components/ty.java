package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class ty implements Runnable {
    public final int f39832a;
    public final wy f39833b;

    public ty(wy wyVar, int i7) {
        this.f39832a = i7;
        this.f39833b = wyVar;
    }

    @Override
    public final void run() {
        switch (this.f39832a) {
            case 0:
                this.f39833b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                wy.a(this.f39833b);
                return;
            default:
                wy wyVar = this.f39833b;
                gx gxVar = wyVar.f41476c0;
                SurfaceTexture surfaceTexture = wyVar.f41485x;
                k51 k51Var = (k51) gxVar.f35079b;
                if (k51Var.f36279a != null) {
                    k51Var.f36279a.y0(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
