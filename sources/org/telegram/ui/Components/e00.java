package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class e00 implements Runnable {
    public final int f24544a;
    public final h00 f24545b;

    public e00(h00 h00Var, int i10) {
        this.f24544a = i10;
        this.f24545b = h00Var;
    }

    @Override
    public final void run() {
        switch (this.f24544a) {
            case 0:
                this.f24545b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                h00.b(this.f24545b);
                return;
            default:
                h00 h00Var = this.f24545b;
                xv xvVar = h00Var.f25445b0;
                SurfaceTexture surfaceTexture = h00Var.f25453w;
                x71 x71Var = (x71) xvVar.f31335b;
                if (x71Var.f31188a != null) {
                    x71Var.f31188a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
