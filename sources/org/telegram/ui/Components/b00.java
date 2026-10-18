package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class b00 implements Runnable {
    public final int f24754a;
    public final e00 f24755b;

    public b00(e00 e00Var, int i10) {
        this.f24754a = i10;
        this.f24755b = e00Var;
    }

    @Override
    public final void run() {
        switch (this.f24754a) {
            case 0:
                this.f24755b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                e00.b(this.f24755b);
                return;
            default:
                e00 e00Var = this.f24755b;
                tv tvVar = e00Var.f25761b0;
                SurfaceTexture surfaceTexture = e00Var.f25769w;
                p71 p71Var = (p71) tvVar.f30717b;
                if (p71Var.f29219a != null) {
                    p71Var.f29219a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
