package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class sz implements Runnable {
    public final int f30451a;
    public final vz f30452b;

    public sz(vz vzVar, int i10) {
        this.f30451a = i10;
        this.f30452b = vzVar;
    }

    @Override
    public final void run() {
        switch (this.f30451a) {
            case 0:
                this.f30452b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                vz.b(this.f30452b);
                return;
            default:
                vz vzVar = this.f30452b;
                kv kvVar = vzVar.f32026b0;
                SurfaceTexture surfaceTexture = vzVar.f32035w;
                u61 u61Var = (u61) kvVar.f27908b;
                if (u61Var.f30820a != null) {
                    u61Var.f30820a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
