package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class b00 implements Runnable {
    public final int f24766a;
    public final e00 f24767b;

    public b00(e00 e00Var, int i10) {
        this.f24766a = i10;
        this.f24767b = e00Var;
    }

    @Override
    public final void run() {
        switch (this.f24766a) {
            case 0:
                this.f24767b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                e00.b(this.f24767b);
                return;
            default:
                e00 e00Var = this.f24767b;
                tv tvVar = e00Var.f25684b0;
                SurfaceTexture surfaceTexture = e00Var.f25692w;
                r71 r71Var = (r71) tvVar.f30684b;
                if (r71Var.f29864a != null) {
                    r71Var.f29864a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
