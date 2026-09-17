package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class sz implements Runnable {
    public final int f27957a;
    public final vz f27958b;

    public sz(vz vzVar, int i10) {
        this.f27957a = i10;
        this.f27958b = vzVar;
    }

    @Override
    public final void run() {
        switch (this.f27957a) {
            case 0:
                this.f27958b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                vz.b(this.f27958b);
                return;
            default:
                vz vzVar = this.f27958b;
                lv lvVar = vzVar.f29434b0;
                SurfaceTexture surfaceTexture = vzVar.f29442w;
                v61 v61Var = (v61) lvVar.f25976b;
                if (v61Var.f28636a != null) {
                    v61Var.f28636a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
