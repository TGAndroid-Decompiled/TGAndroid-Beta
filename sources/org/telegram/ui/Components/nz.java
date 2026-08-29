package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class nz implements Runnable {
    public final int f31199a;
    public final qz f31200b;

    public nz(qz qzVar, int i10) {
        this.f31199a = i10;
        this.f31200b = qzVar;
    }

    @Override
    public final void run() {
        switch (this.f31199a) {
            case 0:
                this.f31200b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                qz.b(this.f31200b);
                return;
            default:
                qz qzVar = this.f31200b;
                cv cvVar = qzVar.X;
                SurfaceTexture surfaceTexture = qzVar.f32146w;
                l61 l61Var = (l61) cvVar.f27577b;
                if (l61Var.f30234a != null) {
                    l61Var.f30234a.U(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
