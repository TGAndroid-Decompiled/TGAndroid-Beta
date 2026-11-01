package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class dz implements Runnable {
    public final int f25641a;
    public final gz f25642b;

    public dz(gz gzVar, int i10) {
        this.f25641a = i10;
        this.f25642b = gzVar;
    }

    @Override
    public final void run() {
        switch (this.f25641a) {
            case 0:
                this.f25642b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                gz.a(this.f25642b);
                return;
            default:
                gz gzVar = this.f25642b;
                px pxVar = gzVar.f26591b0;
                SurfaceTexture surfaceTexture = gzVar.f26600x;
                l61 l61Var = (l61) pxVar.f29561b;
                if (l61Var.f28062a != null) {
                    l61Var.f28062a.y0(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
