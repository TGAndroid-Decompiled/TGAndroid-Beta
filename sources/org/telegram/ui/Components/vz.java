package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class vz implements Runnable {
    public final int f32375a;
    public final yz f32376b;

    public vz(yz yzVar, int i10) {
        this.f32375a = i10;
        this.f32376b = yzVar;
    }

    @Override
    public final void run() {
        switch (this.f32375a) {
            case 0:
                this.f32376b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                yz.b(this.f32376b);
                return;
            default:
                yz yzVar = this.f32376b;
                pv pvVar = yzVar.f33293b0;
                SurfaceTexture surfaceTexture = yzVar.f33302w;
                t71 t71Var = (t71) pvVar.f29746b;
                if (t71Var.f30982a != null) {
                    t71Var.f30982a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
