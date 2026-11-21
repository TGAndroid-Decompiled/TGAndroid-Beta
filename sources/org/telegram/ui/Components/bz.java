package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class bz implements Runnable {
    public final int f33951a;
    public final ez f33952b;

    public bz(ez ezVar, int i7) {
        this.f33951a = i7;
        this.f33952b = ezVar;
    }

    @Override
    public final void run() {
        switch (this.f33951a) {
            case 0:
                this.f33952b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                ez.a(this.f33952b);
                return;
            default:
                ez ezVar = this.f33952b;
                ky kyVar = ezVar.f35025c0;
                SurfaceTexture surfaceTexture = ezVar.f35034x;
                y51 y51Var = (y51) kyVar.f37035b;
                if (y51Var.f42329a != null) {
                    y51Var.f42329a.y0(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
