package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class sz implements Runnable {
    public final int f28841a;
    public final vz f28842b;

    public sz(vz vzVar, int i10) {
        this.f28841a = i10;
        this.f28842b = vzVar;
    }

    @Override
    public final void run() {
        switch (this.f28841a) {
            case 0:
                this.f28842b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                vz.b(this.f28842b);
                return;
            default:
                vz vzVar = this.f28842b;
                ev evVar = vzVar.Y;
                SurfaceTexture surfaceTexture = vzVar.f30081w;
                w61 w61Var = (w61) evVar.f24700b;
                if (w61Var.f30155a != null) {
                    w61Var.f30155a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
