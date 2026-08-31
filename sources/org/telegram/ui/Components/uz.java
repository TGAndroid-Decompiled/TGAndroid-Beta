package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class uz implements Runnable {
    public final int f31756a;
    public final xz f31757b;

    public uz(xz xzVar, int i10) {
        this.f31756a = i10;
        this.f31757b = xzVar;
    }

    @Override
    public final void run() {
        switch (this.f31756a) {
            case 0:
                this.f31757b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                xz.b(this.f31757b);
                return;
            default:
                xz xzVar = this.f31757b;
                hv hvVar = xzVar.Y;
                SurfaceTexture surfaceTexture = xzVar.f33221w;
                y61 y61Var = (y61) hvVar.f27591b;
                if (y61Var.f33383a != null) {
                    y61Var.f33383a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
