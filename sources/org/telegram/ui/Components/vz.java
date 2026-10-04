package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class vz implements Runnable {
    public final int f32382a;
    public final yz f32383b;

    public vz(yz yzVar, int i10) {
        this.f32382a = i10;
        this.f32383b = yzVar;
    }

    @Override
    public final void run() {
        switch (this.f32382a) {
            case 0:
                this.f32383b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                yz.b(this.f32383b);
                return;
            default:
                yz yzVar = this.f32383b;
                pv pvVar = yzVar.f33300b0;
                SurfaceTexture surfaceTexture = yzVar.f33309w;
                t71 t71Var = (t71) pvVar.f29752b;
                if (t71Var.f30989a != null) {
                    t71Var.f30989a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
