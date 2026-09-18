package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class sz implements Runnable {
    public final int f27960a;
    public final vz f27961b;

    public sz(vz vzVar, int i10) {
        this.f27960a = i10;
        this.f27961b = vzVar;
    }

    @Override
    public final void run() {
        switch (this.f27960a) {
            case 0:
                this.f27961b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                vz.b(this.f27961b);
                return;
            default:
                vz vzVar = this.f27961b;
                lv lvVar = vzVar.f29437b0;
                SurfaceTexture surfaceTexture = vzVar.f29445w;
                v61 v61Var = (v61) lvVar.f25979b;
                if (v61Var.f28639a != null) {
                    v61Var.f28639a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
