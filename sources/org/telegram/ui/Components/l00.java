package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class l00 implements Runnable {
    public final int f27982a;
    public final o00 f27983b;

    public l00(o00 o00Var, int i10) {
        this.f27982a = i10;
        this.f27983b = o00Var;
    }

    @Override
    public final void run() {
        switch (this.f27982a) {
            case 0:
                this.f27983b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                o00.b(this.f27983b);
                return;
            default:
                o00 o00Var = this.f27983b;
                ew ewVar = o00Var.f29000b0;
                SurfaceTexture surfaceTexture = o00Var.f29009w;
                f81 f81Var = (f81) ewVar.f25792b;
                if (f81Var.f25963a != null) {
                    f81Var.f25963a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
