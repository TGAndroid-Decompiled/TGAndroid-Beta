package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class ez implements Runnable {
    public final int f28218a;
    public final hz f28219b;

    public ez(hz hzVar, int i9) {
        this.f28218a = i9;
        this.f28219b = hzVar;
    }

    @Override
    public final void run() {
        switch (this.f28218a) {
            case 0:
                this.f28219b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                hz.b(this.f28219b);
                return;
            default:
                hz hzVar = this.f28219b;
                wu wuVar = hzVar.X;
                SurfaceTexture surfaceTexture = hzVar.f29242w;
                y51 y51Var = (y51) wuVar.f34373b;
                if (y51Var.f34861a != null) {
                    y51Var.f34861a.U(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
