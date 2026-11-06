package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class oy implements Runnable {
    public final int f36688a;
    public final ry f36689b;

    public oy(ry ryVar, int i7) {
        this.f36688a = i7;
        this.f36689b = ryVar;
    }

    @Override
    public final void run() {
        switch (this.f36688a) {
            case 0:
                this.f36689b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                ry.a(this.f36689b);
                return;
            default:
                ry ryVar = this.f36689b;
                ax axVar = ryVar.f37818b0;
                SurfaceTexture surfaceTexture = ryVar.f37828x;
                g51 g51Var = (g51) axVar.f31941b;
                if (g51Var.f33797a != null) {
                    g51Var.f33797a.y0(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
