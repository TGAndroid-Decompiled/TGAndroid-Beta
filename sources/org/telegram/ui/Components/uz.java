package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class uz implements Runnable {
    public final int f28905a;
    public final xz f28906b;

    public uz(xz xzVar, int i10) {
        this.f28905a = i10;
        this.f28906b = xzVar;
    }

    @Override
    public final void run() {
        switch (this.f28905a) {
            case 0:
                this.f28906b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                xz.b(this.f28906b);
                return;
            default:
                xz xzVar = this.f28906b;
                nv nvVar = xzVar.f30507b0;
                SurfaceTexture surfaceTexture = xzVar.f30515w;
                k71 k71Var = (k71) nvVar.f26864b;
                if (k71Var.f25618a != null) {
                    k71Var.f25618a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
