package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class uz implements Runnable {
    public final int f28935a;
    public final xz f28936b;

    public uz(xz xzVar, int i10) {
        this.f28935a = i10;
        this.f28936b = xzVar;
    }

    @Override
    public final void run() {
        switch (this.f28935a) {
            case 0:
                this.f28936b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                xz.b(this.f28936b);
                return;
            default:
                xz xzVar = this.f28936b;
                nv nvVar = xzVar.f30495b0;
                SurfaceTexture surfaceTexture = xzVar.f30503w;
                j71 j71Var = (j71) nvVar.f26880b;
                if (j71Var.f25278a != null) {
                    j71Var.f25278a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
