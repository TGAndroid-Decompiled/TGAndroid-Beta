package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class zy implements Runnable {
    public final int f42970a;
    public final cz f42971b;

    public zy(cz czVar, int i7) {
        this.f42970a = i7;
        this.f42971b = czVar;
    }

    @Override
    public final void run() {
        switch (this.f42970a) {
            case 0:
                this.f42971b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                cz.a(this.f42971b);
                return;
            default:
                cz czVar = this.f42971b;
                iy iyVar = czVar.f34208c0;
                SurfaceTexture surfaceTexture = czVar.f34217x;
                v51 v51Var = (v51) iyVar.f36266b;
                if (v51Var.f40500a != null) {
                    v51Var.f40500a.y0(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
