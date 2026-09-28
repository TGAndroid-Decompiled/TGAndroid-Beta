package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class uz implements Runnable {
    public final int f28904a;
    public final xz f28905b;

    public uz(xz xzVar, int i10) {
        this.f28904a = i10;
        this.f28905b = xzVar;
    }

    @Override
    public final void run() {
        switch (this.f28904a) {
            case 0:
                this.f28905b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                xz.b(this.f28905b);
                return;
            default:
                xz xzVar = this.f28905b;
                nv nvVar = xzVar.f30506b0;
                SurfaceTexture surfaceTexture = xzVar.f30514w;
                k71 k71Var = (k71) nvVar.f26863b;
                if (k71Var.f25617a != null) {
                    k71Var.f25617a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
