package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class vz implements Runnable {
    public final int f32376a;
    public final yz f32377b;

    public vz(yz yzVar, int i10) {
        this.f32376a = i10;
        this.f32377b = yzVar;
    }

    @Override
    public final void run() {
        switch (this.f32376a) {
            case 0:
                this.f32377b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                yz.b(this.f32377b);
                return;
            default:
                yz yzVar = this.f32377b;
                pv pvVar = yzVar.f33294b0;
                SurfaceTexture surfaceTexture = yzVar.f33303w;
                t71 t71Var = (t71) pvVar.f29747b;
                if (t71Var.f30983a != null) {
                    t71Var.f30983a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
