package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class vz implements Runnable {
    public final int f32438a;
    public final yz f32439b;

    public vz(yz yzVar, int i10) {
        this.f32438a = i10;
        this.f32439b = yzVar;
    }

    @Override
    public final void run() {
        switch (this.f32438a) {
            case 0:
                this.f32439b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                yz.b(this.f32439b);
                return;
            default:
                yz yzVar = this.f32439b;
                pv pvVar = yzVar.f33376b0;
                SurfaceTexture surfaceTexture = yzVar.f33385w;
                u71 u71Var = (u71) pvVar.f29849b;
                if (u71Var.f31369a != null) {
                    u71Var.f31369a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
