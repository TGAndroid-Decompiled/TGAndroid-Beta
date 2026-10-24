package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class zz implements Runnable {
    public final int f33377a;
    public final c00 f33378b;

    public zz(c00 c00Var, int i10) {
        this.f33377a = i10;
        this.f33378b = c00Var;
    }

    @Override
    public final void run() {
        switch (this.f33377a) {
            case 0:
                this.f33378b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                c00.b(this.f33378b);
                return;
            default:
                c00 c00Var = this.f33378b;
                rv rvVar = c00Var.f25137b0;
                SurfaceTexture surfaceTexture = c00Var.f25145w;
                y71 y71Var = (y71) rvVar.f30277b;
                if (y71Var.f32833a != null) {
                    y71Var.f32833a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
