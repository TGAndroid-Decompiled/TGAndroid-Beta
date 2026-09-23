package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class tz implements Runnable {
    public final int f28338a;
    public final wz f28339b;

    public tz(wz wzVar, int i10) {
        this.f28338a = i10;
        this.f28339b = wzVar;
    }

    @Override
    public final void run() {
        switch (this.f28338a) {
            case 0:
                this.f28339b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                wz.b(this.f28339b);
                return;
            default:
                wz wzVar = this.f28339b;
                mv mvVar = wzVar.f29837b0;
                SurfaceTexture surfaceTexture = wzVar.f29845w;
                t61 t61Var = (t61) mvVar.f26280b;
                if (t61Var.f28101a != null) {
                    t61Var.f28101a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
