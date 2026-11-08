package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class py implements Runnable {
    public final int f37118a;
    public final sy f37119b;

    public py(sy syVar, int i7) {
        this.f37118a = i7;
        this.f37119b = syVar;
    }

    @Override
    public final void run() {
        switch (this.f37118a) {
            case 0:
                this.f37119b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                sy.a(this.f37119b);
                return;
            default:
                sy syVar = this.f37119b;
                bx bxVar = syVar.f38162b0;
                SurfaceTexture surfaceTexture = syVar.f38172x;
                h51 h51Var = (h51) bxVar.f32375b;
                if (h51Var.f34115a != null) {
                    h51Var.f34115a.y0(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
