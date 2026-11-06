package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class oy implements Runnable {
    public final int f36709a;
    public final ry f36710b;

    public oy(ry ryVar, int i7) {
        this.f36709a = i7;
        this.f36710b = ryVar;
    }

    @Override
    public final void run() {
        switch (this.f36709a) {
            case 0:
                this.f36710b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                ry.a(this.f36710b);
                return;
            default:
                ry ryVar = this.f36710b;
                ax axVar = ryVar.f37778b0;
                SurfaceTexture surfaceTexture = ryVar.f37788x;
                h51 h51Var = (h51) axVar.f31937b;
                if (h51Var.f34178a != null) {
                    h51Var.f34178a.y0(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
