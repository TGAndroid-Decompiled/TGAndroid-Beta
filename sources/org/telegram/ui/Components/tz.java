package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class tz implements Runnable {
    public final int f28634a;
    public final wz f28635b;

    public tz(wz wzVar, int i10) {
        this.f28634a = i10;
        this.f28635b = wzVar;
    }

    @Override
    public final void run() {
        switch (this.f28634a) {
            case 0:
                this.f28635b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                wz.b(this.f28635b);
                return;
            default:
                wz wzVar = this.f28635b;
                nv nvVar = wzVar.f30196b0;
                SurfaceTexture surfaceTexture = wzVar.f30204w;
                i71 i71Var = (i71) nvVar.f26801b;
                if (i71Var.f24935a != null) {
                    i71Var.f24935a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
