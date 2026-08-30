package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class sz implements Runnable {
    public final int f28838a;
    public final vz f28839b;

    public sz(vz vzVar, int i10) {
        this.f28838a = i10;
        this.f28839b = vzVar;
    }

    @Override
    public final void run() {
        switch (this.f28838a) {
            case 0:
                this.f28839b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                vz.b(this.f28839b);
                return;
            default:
                vz vzVar = this.f28839b;
                fv fvVar = vzVar.Y;
                SurfaceTexture surfaceTexture = vzVar.f30117w;
                w61 w61Var = (w61) fvVar.f24962b;
                if (w61Var.f30248a != null) {
                    w61Var.f30248a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
