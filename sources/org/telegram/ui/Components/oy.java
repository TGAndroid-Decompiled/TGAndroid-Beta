package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class oy implements Runnable {
    public final int f36725a;
    public final ry f36726b;

    public oy(ry ryVar, int i7) {
        this.f36725a = i7;
        this.f36726b = ryVar;
    }

    @Override
    public final void run() {
        switch (this.f36725a) {
            case 0:
                this.f36726b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                ry.a(this.f36726b);
                return;
            default:
                ry ryVar = this.f36726b;
                ax axVar = ryVar.f37759b0;
                SurfaceTexture surfaceTexture = ryVar.f37769x;
                i51 i51Var = (i51) axVar.f32025b;
                if (i51Var.f34533a != null) {
                    i51Var.f34533a.y0(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
