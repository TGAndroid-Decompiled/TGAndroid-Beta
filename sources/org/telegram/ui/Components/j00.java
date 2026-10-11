package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class j00 implements Runnable {
    public final int f27504a;
    public final m00 f27505b;

    public j00(m00 m00Var, int i10) {
        this.f27504a = i10;
        this.f27505b = m00Var;
    }

    @Override
    public final void run() {
        switch (this.f27504a) {
            case 0:
                this.f27505b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                m00.b(this.f27505b);
                return;
            default:
                m00 m00Var = this.f27505b;
                cw cwVar = m00Var.f28488b0;
                SurfaceTexture surfaceTexture = m00Var.f28497w;
                b81 b81Var = (b81) cwVar.f25331b;
                if (b81Var.f24879a != null) {
                    b81Var.f24879a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
