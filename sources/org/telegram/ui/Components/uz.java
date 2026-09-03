package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class uz implements Runnable {
    public final int f31712a;
    public final xz f31713b;

    public uz(xz xzVar, int i10) {
        this.f31712a = i10;
        this.f31713b = xzVar;
    }

    @Override
    public final void run() {
        switch (this.f31712a) {
            case 0:
                this.f31713b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                xz.b(this.f31713b);
                return;
            default:
                xz xzVar = this.f31713b;
                hv hvVar = xzVar.Y;
                SurfaceTexture surfaceTexture = xzVar.f33259w;
                x61 x61Var = (x61) hvVar.f27638b;
                if (x61Var.f32957a != null) {
                    x61Var.f32957a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
