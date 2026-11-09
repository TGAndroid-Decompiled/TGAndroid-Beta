package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class py implements Runnable {
    public final int f37126a;
    public final sy f37127b;

    public py(sy syVar, int i7) {
        this.f37126a = i7;
        this.f37127b = syVar;
    }

    @Override
    public final void run() {
        switch (this.f37126a) {
            case 0:
                this.f37127b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                sy.a(this.f37127b);
                return;
            default:
                sy syVar = this.f37127b;
                bx bxVar = syVar.f38175b0;
                SurfaceTexture surfaceTexture = syVar.f38185x;
                i51 i51Var = (i51) bxVar.f32442b;
                if (i51Var.f34576a != null) {
                    i51Var.f34576a.y0(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
