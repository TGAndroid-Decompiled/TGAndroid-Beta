package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class b00 implements Runnable {
    public final int f24765a;
    public final e00 f24766b;

    public b00(e00 e00Var, int i10) {
        this.f24765a = i10;
        this.f24766b = e00Var;
    }

    @Override
    public final void run() {
        switch (this.f24765a) {
            case 0:
                this.f24766b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                e00.b(this.f24766b);
                return;
            default:
                e00 e00Var = this.f24766b;
                tv tvVar = e00Var.f25683b0;
                SurfaceTexture surfaceTexture = e00Var.f25691w;
                r71 r71Var = (r71) tvVar.f30683b;
                if (r71Var.f29863a != null) {
                    r71Var.f29863a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
