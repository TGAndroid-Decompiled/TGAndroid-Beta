package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class b00 implements Runnable {
    public final int f26703a;
    public final e00 f26704b;

    public b00(e00 e00Var, int i10) {
        this.f26703a = i10;
        this.f26704b = e00Var;
    }

    @Override
    public final void run() {
        switch (this.f26703a) {
            case 0:
                this.f26704b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                e00.b(this.f26704b);
                return;
            default:
                e00 e00Var = this.f26704b;
                tv tvVar = e00Var.f27638b0;
                SurfaceTexture surfaceTexture = e00Var.f27646w;
                i81 i81Var = (i81) tvVar.f33156b;
                if (i81Var.f29237a != null) {
                    i81Var.f29237a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
