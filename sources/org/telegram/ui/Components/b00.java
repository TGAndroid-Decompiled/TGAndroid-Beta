package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class b00 implements Runnable {
    public final int f24761a;
    public final e00 f24762b;

    public b00(e00 e00Var, int i10) {
        this.f24761a = i10;
        this.f24762b = e00Var;
    }

    @Override
    public final void run() {
        switch (this.f24761a) {
            case 0:
                this.f24762b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                e00.b(this.f24762b);
                return;
            default:
                e00 e00Var = this.f24762b;
                tv tvVar = e00Var.f25768b0;
                SurfaceTexture surfaceTexture = e00Var.f25776w;
                p71 p71Var = (p71) tvVar.f30724b;
                if (p71Var.f29226a != null) {
                    p71Var.f29226a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
