package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class e00 implements Runnable {
    public final int f24241a;
    public final h00 f24242b;

    public e00(h00 h00Var, int i10) {
        this.f24241a = i10;
        this.f24242b = h00Var;
    }

    @Override
    public final void run() {
        switch (this.f24241a) {
            case 0:
                this.f24242b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                h00.b(this.f24242b);
                return;
            default:
                h00 h00Var = this.f24242b;
                xv xvVar = h00Var.f25136b0;
                SurfaceTexture surfaceTexture = h00Var.f25144w;
                y71 y71Var = (y71) xvVar.f31016b;
                if (y71Var.f31175a != null) {
                    y71Var.f31175a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
