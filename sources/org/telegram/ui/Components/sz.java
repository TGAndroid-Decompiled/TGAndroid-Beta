package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class sz implements Runnable {
    public final int f27994a;
    public final vz f27995b;

    public sz(vz vzVar, int i10) {
        this.f27994a = i10;
        this.f27995b = vzVar;
    }

    @Override
    public final void run() {
        switch (this.f27994a) {
            case 0:
                this.f27995b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                vz.b(this.f27995b);
                return;
            default:
                vz vzVar = this.f27995b;
                lv lvVar = vzVar.f29484b0;
                SurfaceTexture surfaceTexture = vzVar.f29492w;
                u61 u61Var = (u61) lvVar.f26014b;
                if (u61Var.f28296a != null) {
                    u61Var.f28296a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
