package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class b00 implements Runnable {
    public final int f24758a;
    public final e00 f24759b;

    public b00(e00 e00Var, int i10) {
        this.f24758a = i10;
        this.f24759b = e00Var;
    }

    @Override
    public final void run() {
        switch (this.f24758a) {
            case 0:
                this.f24759b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                e00.b(this.f24759b);
                return;
            default:
                e00 e00Var = this.f24759b;
                tv tvVar = e00Var.f25704b0;
                SurfaceTexture surfaceTexture = e00Var.f25712w;
                q71 q71Var = (q71) tvVar.f30681b;
                if (q71Var.f29539a != null) {
                    q71Var.f29539a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
