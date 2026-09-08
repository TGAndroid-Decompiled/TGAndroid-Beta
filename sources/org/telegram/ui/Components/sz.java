package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class sz implements Runnable {
    public final int f30478a;
    public final vz f30479b;

    public sz(vz vzVar, int i10) {
        this.f30478a = i10;
        this.f30479b = vzVar;
    }

    @Override
    public final void run() {
        switch (this.f30478a) {
            case 0:
                this.f30479b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                vz.b(this.f30479b);
                return;
            default:
                vz vzVar = this.f30479b;
                kv kvVar = vzVar.f32053b0;
                SurfaceTexture surfaceTexture = vzVar.f32062w;
                u61 u61Var = (u61) kvVar.f27935b;
                if (u61Var.f30847a != null) {
                    u61Var.f30847a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
