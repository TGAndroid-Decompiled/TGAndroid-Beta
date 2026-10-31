package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class dz implements Runnable {
    public final int f25568a;
    public final gz f25569b;

    public dz(gz gzVar, int i10) {
        this.f25568a = i10;
        this.f25569b = gzVar;
    }

    @Override
    public final void run() {
        switch (this.f25568a) {
            case 0:
                this.f25569b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                gz.a(this.f25569b);
                return;
            default:
                gz gzVar = this.f25569b;
                px pxVar = gzVar.f26544b0;
                SurfaceTexture surfaceTexture = gzVar.f26553x;
                k61 k61Var = (k61) pxVar.f29448b;
                if (k61Var.f27646a != null) {
                    k61Var.f27646a.y0(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
