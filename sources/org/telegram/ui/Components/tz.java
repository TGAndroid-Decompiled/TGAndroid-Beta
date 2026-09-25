package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class tz implements Runnable {
    public final int f28648a;
    public final wz f28649b;

    public tz(wz wzVar, int i10) {
        this.f28648a = i10;
        this.f28649b = wzVar;
    }

    @Override
    public final void run() {
        switch (this.f28648a) {
            case 0:
                this.f28649b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                wz.b(this.f28649b);
                return;
            default:
                wz wzVar = this.f28649b;
                mv mvVar = wzVar.f30211b0;
                SurfaceTexture surfaceTexture = wzVar.f30219w;
                i71 i71Var = (i71) mvVar.f26585b;
                if (i71Var.f24961a != null) {
                    i71Var.f24961a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
