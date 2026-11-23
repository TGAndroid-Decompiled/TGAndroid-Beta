package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class yy implements Runnable {
    public final int f42586a;
    public final bz f42587b;

    public yy(bz bzVar, int i7) {
        this.f42586a = i7;
        this.f42587b = bzVar;
    }

    @Override
    public final void run() {
        switch (this.f42586a) {
            case 0:
                this.f42587b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                bz.a(this.f42587b);
                return;
            default:
                bz bzVar = this.f42587b;
                hy hyVar = bzVar.f33848c0;
                SurfaceTexture surfaceTexture = bzVar.f33857x;
                x51 x51Var = (x51) hyVar.f35848b;
                if (x51Var.f41849a != null) {
                    x51Var.f41849a.y0(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
