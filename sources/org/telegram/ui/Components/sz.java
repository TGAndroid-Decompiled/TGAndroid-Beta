package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class sz implements Runnable {
    public final int f30452a;
    public final vz f30453b;

    public sz(vz vzVar, int i10) {
        this.f30452a = i10;
        this.f30453b = vzVar;
    }

    @Override
    public final void run() {
        switch (this.f30452a) {
            case 0:
                this.f30453b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                vz.b(this.f30453b);
                return;
            default:
                vz vzVar = this.f30453b;
                kv kvVar = vzVar.f32027b0;
                SurfaceTexture surfaceTexture = vzVar.f32036w;
                u61 u61Var = (u61) kvVar.f27909b;
                if (u61Var.f30821a != null) {
                    u61Var.f30821a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
