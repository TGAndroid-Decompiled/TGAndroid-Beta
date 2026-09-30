package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class uz implements Runnable {
    public final int f28898a;
    public final xz f28899b;

    public uz(xz xzVar, int i10) {
        this.f28898a = i10;
        this.f28899b = xzVar;
    }

    @Override
    public final void run() {
        switch (this.f28898a) {
            case 0:
                this.f28899b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                xz.b(this.f28899b);
                return;
            default:
                xz xzVar = this.f28899b;
                ov ovVar = xzVar.f30505b0;
                SurfaceTexture surfaceTexture = xzVar.f30513w;
                k71 k71Var = (k71) ovVar.f27190b;
                if (k71Var.f25617a != null) {
                    k71Var.f25617a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
