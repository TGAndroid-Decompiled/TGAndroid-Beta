package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class ty implements Runnable {
    public final int f39835a;
    public final wy f39836b;

    public ty(wy wyVar, int i7) {
        this.f39835a = i7;
        this.f39836b = wyVar;
    }

    @Override
    public final void run() {
        switch (this.f39835a) {
            case 0:
                this.f39836b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                wy.a(this.f39836b);
                return;
            default:
                wy wyVar = this.f39836b;
                gx gxVar = wyVar.f41473c0;
                SurfaceTexture surfaceTexture = wyVar.f41482x;
                k51 k51Var = (k51) gxVar.f35079b;
                if (k51Var.f36289a != null) {
                    k51Var.f36289a.y0(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
