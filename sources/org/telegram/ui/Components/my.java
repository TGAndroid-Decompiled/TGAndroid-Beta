package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class my implements Runnable {
    public final int f36268a;
    public final py f36269b;

    public my(py pyVar, int i3) {
        this.f36268a = i3;
        this.f36269b = pyVar;
    }

    @Override
    public final void run() {
        switch (this.f36268a) {
            case 0:
                this.f36269b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                py.a(this.f36269b);
                return;
            default:
                py pyVar = this.f36269b;
                zw zwVar = pyVar.f37273c0;
                SurfaceTexture surfaceTexture = pyVar.f37282x;
                b51 b51Var = (b51) zwVar.f41140b;
                if (b51Var.f32087a != null) {
                    b51Var.f32087a.y0(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
