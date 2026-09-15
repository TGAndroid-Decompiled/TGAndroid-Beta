package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class sz implements Runnable {
    public final int f27997a;
    public final vz f27998b;

    public sz(vz vzVar, int i10) {
        this.f27997a = i10;
        this.f27998b = vzVar;
    }

    @Override
    public final void run() {
        switch (this.f27997a) {
            case 0:
                this.f27998b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                vz.b(this.f27998b);
                return;
            default:
                vz vzVar = this.f27998b;
                lv lvVar = vzVar.f29487b0;
                SurfaceTexture surfaceTexture = vzVar.f29495w;
                u61 u61Var = (u61) lvVar.f26011b;
                if (u61Var.f28299a != null) {
                    u61Var.f28299a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
