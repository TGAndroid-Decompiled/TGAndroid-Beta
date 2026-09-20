package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class sz implements Runnable {
    public final int f28235a;
    public final vz f28236b;

    public sz(vz vzVar, int i10) {
        this.f28235a = i10;
        this.f28236b = vzVar;
    }

    @Override
    public final void run() {
        switch (this.f28235a) {
            case 0:
                this.f28236b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                vz.b(this.f28236b);
                return;
            default:
                vz vzVar = this.f28236b;
                mv mvVar = vzVar.f29863b0;
                SurfaceTexture surfaceTexture = vzVar.f29871w;
                i71 i71Var = (i71) mvVar.f26497b;
                if (i71Var.f24902a != null) {
                    i71Var.f24902a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
