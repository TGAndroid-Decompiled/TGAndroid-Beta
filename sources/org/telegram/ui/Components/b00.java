package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class b00 implements Runnable {
    public final int f24896a;
    public final e00 f24897b;

    public b00(e00 e00Var, int i10) {
        this.f24896a = i10;
        this.f24897b = e00Var;
    }

    @Override
    public final void run() {
        switch (this.f24896a) {
            case 0:
                this.f24897b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                e00.b(this.f24897b);
                return;
            default:
                e00 e00Var = this.f24897b;
                tv tvVar = e00Var.f25792b0;
                SurfaceTexture surfaceTexture = e00Var.f25800w;
                z71 z71Var = (z71) tvVar.f30915b;
                if (z71Var.f33157a != null) {
                    z71Var.f33157a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
