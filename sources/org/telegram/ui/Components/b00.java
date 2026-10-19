package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class b00 implements Runnable {
    public final int f24756a;
    public final e00 f24757b;

    public b00(e00 e00Var, int i10) {
        this.f24756a = i10;
        this.f24757b = e00Var;
    }

    @Override
    public final void run() {
        switch (this.f24756a) {
            case 0:
                this.f24757b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                e00.b(this.f24757b);
                return;
            default:
                e00 e00Var = this.f24757b;
                tv tvVar = e00Var.f25702b0;
                SurfaceTexture surfaceTexture = e00Var.f25710w;
                q71 q71Var = (q71) tvVar.f30679b;
                if (q71Var.f29537a != null) {
                    q71Var.f29537a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
