package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class sz implements Runnable {
    public final int f28346a;
    public final vz f28347b;

    public sz(vz vzVar, int i10) {
        this.f28346a = i10;
        this.f28347b = vzVar;
    }

    @Override
    public final void run() {
        switch (this.f28346a) {
            case 0:
                this.f28347b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                vz.b(this.f28347b);
                return;
            default:
                vz vzVar = this.f28347b;
                mv mvVar = vzVar.f29837b0;
                SurfaceTexture surfaceTexture = vzVar.f29845w;
                l71 l71Var = (l71) mvVar.f26549b;
                if (l71Var.f26010a != null) {
                    l71Var.f26010a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
