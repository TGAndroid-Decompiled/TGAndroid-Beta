package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class vz implements Runnable {
    public final int f29743a;
    public final yz f29744b;

    public vz(yz yzVar, int i10) {
        this.f29743a = i10;
        this.f29744b = yzVar;
    }

    @Override
    public final void run() {
        switch (this.f29743a) {
            case 0:
                this.f29744b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                yz.b(this.f29744b);
                return;
            default:
                yz yzVar = this.f29744b;
                ov ovVar = yzVar.f30835b0;
                SurfaceTexture surfaceTexture = yzVar.f30843w;
                l71 l71Var = (l71) ovVar.f27180b;
                if (l71Var.f25930a != null) {
                    l71Var.f25930a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
