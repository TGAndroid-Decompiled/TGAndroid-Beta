package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class oy implements Runnable {
    public final int f36810a;
    public final ry f36811b;

    public oy(ry ryVar, int i7) {
        this.f36810a = i7;
        this.f36811b = ryVar;
    }

    @Override
    public final void run() {
        switch (this.f36810a) {
            case 0:
                this.f36811b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                ry.a(this.f36811b);
                return;
            default:
                ry ryVar = this.f36811b;
                ax axVar = ryVar.f37875b0;
                SurfaceTexture surfaceTexture = ryVar.f37885x;
                c51 c51Var = (c51) axVar.f31929b;
                if (c51Var.f32420a != null) {
                    c51Var.f32420a.y0(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
