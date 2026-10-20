package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class b00 implements Runnable {
    public final int f24762a;
    public final e00 f24763b;

    public b00(e00 e00Var, int i10) {
        this.f24762a = i10;
        this.f24763b = e00Var;
    }

    @Override
    public final void run() {
        switch (this.f24762a) {
            case 0:
                this.f24763b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                e00.b(this.f24763b);
                return;
            default:
                e00 e00Var = this.f24763b;
                tv tvVar = e00Var.f25680b0;
                SurfaceTexture surfaceTexture = e00Var.f25688w;
                r71 r71Var = (r71) tvVar.f30679b;
                if (r71Var.f29859a != null) {
                    r71Var.f29859a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
