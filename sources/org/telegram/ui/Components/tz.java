package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class tz implements Runnable {
    public final int f28647a;
    public final wz f28648b;

    public tz(wz wzVar, int i10) {
        this.f28647a = i10;
        this.f28648b = wzVar;
    }

    @Override
    public final void run() {
        switch (this.f28647a) {
            case 0:
                this.f28648b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                wz.b(this.f28648b);
                return;
            default:
                wz wzVar = this.f28648b;
                mv mvVar = wzVar.f30210b0;
                SurfaceTexture surfaceTexture = wzVar.f30218w;
                i71 i71Var = (i71) mvVar.f26584b;
                if (i71Var.f24960a != null) {
                    i71Var.f24960a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
