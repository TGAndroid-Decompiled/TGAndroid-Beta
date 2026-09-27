package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class uz implements Runnable {
    public final int f28963a;
    public final xz f28964b;

    public uz(xz xzVar, int i10) {
        this.f28963a = i10;
        this.f28964b = xzVar;
    }

    @Override
    public final void run() {
        switch (this.f28963a) {
            case 0:
                this.f28964b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                xz.b(this.f28964b);
                return;
            default:
                xz xzVar = this.f28964b;
                nv nvVar = xzVar.f30511b0;
                SurfaceTexture surfaceTexture = xzVar.f30519w;
                k71 k71Var = (k71) nvVar.f26898b;
                if (k71Var.f25645a != null) {
                    k71Var.f25645a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
