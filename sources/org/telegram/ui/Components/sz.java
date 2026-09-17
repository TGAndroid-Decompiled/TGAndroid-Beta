package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class sz implements Runnable {
    public final int f30479a;
    public final vz f30480b;

    public sz(vz vzVar, int i10) {
        this.f30479a = i10;
        this.f30480b = vzVar;
    }

    @Override
    public final void run() {
        switch (this.f30479a) {
            case 0:
                this.f30480b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                vz.b(this.f30480b);
                return;
            default:
                vz vzVar = this.f30480b;
                kv kvVar = vzVar.f32054b0;
                SurfaceTexture surfaceTexture = vzVar.f32063w;
                u61 u61Var = (u61) kvVar.f27936b;
                if (u61Var.f30848a != null) {
                    u61Var.f30848a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
