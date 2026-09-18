package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class sz implements Runnable {
    public final int f28257a;
    public final vz f28258b;

    public sz(vz vzVar, int i10) {
        this.f28257a = i10;
        this.f28258b = vzVar;
    }

    @Override
    public final void run() {
        switch (this.f28257a) {
            case 0:
                this.f28258b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                vz.b(this.f28258b);
                return;
            default:
                vz vzVar = this.f28258b;
                lv lvVar = vzVar.f29792b0;
                SurfaceTexture surfaceTexture = vzVar.f29800w;
                j71 j71Var = (j71) lvVar.f26250b;
                if (j71Var.f25193a != null) {
                    j71Var.f25193a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
