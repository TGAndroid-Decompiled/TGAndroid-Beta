package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class bz implements Runnable {
    public final int f33944a;
    public final ez f33945b;

    public bz(ez ezVar, int i7) {
        this.f33944a = i7;
        this.f33945b = ezVar;
    }

    @Override
    public final void run() {
        switch (this.f33944a) {
            case 0:
                this.f33945b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                ez.a(this.f33945b);
                return;
            default:
                ez ezVar = this.f33945b;
                ky kyVar = ezVar.f35023c0;
                SurfaceTexture surfaceTexture = ezVar.f35032x;
                y51 y51Var = (y51) kyVar.f37037b;
                if (y51Var.f42321a != null) {
                    y51Var.f42321a.y0(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
