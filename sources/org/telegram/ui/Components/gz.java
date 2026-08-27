package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

public final class gz implements Runnable {

    public final int f28872a;

    public final jz f28873b;

    public gz(jz jzVar, int i10) {
        this.f28872a = i10;
        this.f28873b = jzVar;
    }

    @Override
    public final void run() {
        switch (this.f28872a) {
            case 0:
                this.f28873b.finish();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    looperMyLooper.quit();
                }
                break;
            case 1:
                jz.b(this.f28873b);
                break;
            default:
                jz jzVar = this.f28873b;
                vu vuVar = jzVar.X;
                SurfaceTexture surfaceTexture = jzVar.f29860w;
                a61 a61Var = (a61) vuVar.f34056b;
                if (a61Var.f26643a != null) {
                    a61Var.f26643a.U(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
