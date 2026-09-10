package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class zz implements Runnable {
    public final int f29842a;
    public final c00 f29843b;

    public zz(c00 c00Var, int i10) {
        this.f29842a = i10;
        this.f29843b = c00Var;
    }

    @Override
    public final void run() {
        switch (this.f29842a) {
            case 0:
                this.f29843b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                c00.b(this.f29843b);
                return;
            default:
                c00 c00Var = this.f29843b;
                pv pvVar = c00Var.f21934b0;
                SurfaceTexture surfaceTexture = c00Var.f21942w;
                h71 h71Var = (h71) pvVar.f26252b;
                if (h71Var.f23537a != null) {
                    h71Var.f23537a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
