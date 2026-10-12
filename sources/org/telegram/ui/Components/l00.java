package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class l00 implements Runnable {
    public final int f27967a;
    public final o00 f27968b;

    public l00(o00 o00Var, int i10) {
        this.f27967a = i10;
        this.f27968b = o00Var;
    }

    @Override
    public final void run() {
        switch (this.f27967a) {
            case 0:
                this.f27968b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                o00.b(this.f27968b);
                return;
            default:
                o00 o00Var = this.f27968b;
                ew ewVar = o00Var.f29004b0;
                SurfaceTexture surfaceTexture = o00Var.f29013w;
                f81 f81Var = (f81) ewVar.f25794b;
                if (f81Var.f25965a != null) {
                    f81Var.f25965a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
