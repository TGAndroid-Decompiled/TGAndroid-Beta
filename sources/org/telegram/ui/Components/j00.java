package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class j00 implements Runnable {
    public final int f27545a;
    public final m00 f27546b;

    public j00(m00 m00Var, int i10) {
        this.f27545a = i10;
        this.f27546b = m00Var;
    }

    @Override
    public final void run() {
        switch (this.f27545a) {
            case 0:
                this.f27546b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                m00.b(this.f27546b);
                return;
            default:
                m00 m00Var = this.f27546b;
                cw cwVar = m00Var.f28644b0;
                SurfaceTexture surfaceTexture = m00Var.f28653w;
                b81 b81Var = (b81) cwVar.f25482b;
                if (b81Var.f24934a != null) {
                    b81Var.f24934a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
