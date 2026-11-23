package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class bz implements Runnable {
    public final int f33908a;
    public final ez f33909b;

    public bz(ez ezVar, int i7) {
        this.f33908a = i7;
        this.f33909b = ezVar;
    }

    @Override
    public final void run() {
        switch (this.f33908a) {
            case 0:
                this.f33909b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                ez.a(this.f33909b);
                return;
            default:
                ez ezVar = this.f33909b;
                ky kyVar = ezVar.f34998c0;
                SurfaceTexture surfaceTexture = ezVar.f35007x;
                y51 y51Var = (y51) kyVar.f36994b;
                if (y51Var.f42299a != null) {
                    y51Var.f42299a.y0(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
