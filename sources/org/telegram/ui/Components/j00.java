package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class j00 implements Runnable {
    public final int f27488a;
    public final m00 f27489b;

    public j00(m00 m00Var, int i10) {
        this.f27488a = i10;
        this.f27489b = m00Var;
    }

    @Override
    public final void run() {
        switch (this.f27488a) {
            case 0:
                this.f27489b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                m00.b(this.f27489b);
                return;
            default:
                m00 m00Var = this.f27489b;
                cw cwVar = m00Var.f28568b0;
                SurfaceTexture surfaceTexture = m00Var.f28577w;
                a81 a81Var = (a81) cwVar.f25420b;
                if (a81Var.f24508a != null) {
                    a81Var.f24508a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
