package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class b00 implements Runnable {
    public final int f26716a;
    public final e00 f26717b;

    public b00(e00 e00Var, int i10) {
        this.f26716a = i10;
        this.f26717b = e00Var;
    }

    @Override
    public final void run() {
        switch (this.f26716a) {
            case 0:
                this.f26717b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                e00.b(this.f26717b);
                return;
            default:
                e00 e00Var = this.f26717b;
                tv tvVar = e00Var.f27668b0;
                SurfaceTexture surfaceTexture = e00Var.f27676w;
                h81 h81Var = (h81) tvVar.f33164b;
                if (h81Var.f28859a != null) {
                    h81Var.f28859a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
