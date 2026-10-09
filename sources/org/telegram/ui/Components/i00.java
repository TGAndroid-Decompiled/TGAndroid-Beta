package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
public final class i00 implements Runnable {
    public final int f27173a;
    public final l00 f27174b;

    public i00(l00 l00Var, int i10) {
        this.f27173a = i10;
        this.f27174b = l00Var;
    }

    @Override
    public final void run() {
        switch (this.f27173a) {
            case 0:
                this.f27174b.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                l00.b(this.f27174b);
                return;
            default:
                l00 l00Var = this.f27174b;
                bw bwVar = l00Var.f28191b0;
                SurfaceTexture surfaceTexture = l00Var.f28200w;
                z71 z71Var = (z71) bwVar.f25112b;
                if (z71Var.f33490a != null) {
                    z71Var.f33490a.T(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
