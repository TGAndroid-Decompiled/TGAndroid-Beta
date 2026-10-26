package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class b00 implements Runnable {
    public final int f26718a;
    public final e00 f26719b;

    public b00(e00 e00Var, int i10) {
        this.f26718a = i10;
        this.f26719b = e00Var;
    }

    @Override
    public final void run() {
        switch (this.f26718a) {
            case 0:
                this.f26719b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                e00.b(this.f26719b);
                return;
            default:
                e00 e00Var = this.f26719b;
                tv tvVar = e00Var.f27670b0;
                SurfaceTexture surfaceTexture = e00Var.f27678w;
                h81 h81Var = (h81) tvVar.f33167b;
                if (h81Var.f28861a != null) {
                    h81Var.f28861a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
