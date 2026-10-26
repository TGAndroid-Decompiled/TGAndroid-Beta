package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class p9 implements Runnable {
    public final int f42401a;
    public final y9 f42402b;

    public p9(y9 y9Var, int i10) {
        this.f42401a = i10;
        this.f42402b = y9Var;
    }

    @Override
    public final void run() {
        float f7;
        float f10 = 0.0f;
        switch (this.f42401a) {
            case 0:
                this.f42402b.Z();
                return;
            case 1:
                y9 y9Var = this.f42402b;
                if (!y9Var.isFinishing()) {
                    y9Var.R = null;
                    y9Var.N = false;
                    y9Var.f45999d0.run();
                    if (!y9Var.N) {
                        AndroidUtilities.runOnUIThread(new p9(y9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                y9 y9Var2 = this.f42402b;
                CameraView cameraView = y9Var2.d;
                if (cameraView != null) {
                    y9Var2.d0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f42402b.finishFragment();
                return;
            case 4:
                y9 y9Var3 = this.f42402b;
                x9 x9Var = y9Var3.M;
                if (x9Var != null) {
                    x9Var.H(y9Var3.R);
                }
                y9Var3.finishFragment();
                return;
            case 5:
                y9 y9Var4 = this.f42402b;
                y9Var4.U = new za.c(28);
                Context context = ApplicationLoader.applicationContext;
                ?? obj = new Object();
                obj.f7500a = 256;
                y9Var4.V = new s8.n(new com.google.android.gms.internal.vision.t2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                y9 y9Var5 = this.f42402b;
                if (y9Var5.h.getTag() != null) {
                    y9Var5.h.setTag(null);
                    y9Var5.h.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.ds.f27586f).start();
                    return;
                }
                return;
            case 7:
                y9 y9Var6 = this.f42402b;
                CameraView cameraView2 = y9Var6.d;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(y9Var6.d.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new p9(y9Var6, 4));
                return;
            default:
                y9 y9Var7 = this.f42402b;
                float f11 = y9Var7.Y;
                if (y9Var7.N) {
                    f10 = 1.0f;
                }
                y9Var7.Z = f10;
                if (f11 != f10) {
                    ValueAnimator valueAnimator = y9Var7.X;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(y9Var7.Y, y9Var7.Z);
                    y9Var7.X = ofFloat;
                    ofFloat.addUpdateListener(new s9(y9Var7, 0));
                    y9Var7.X.setDuration(Math.abs(y9Var7.Y - y9Var7.Z) * 300.0f);
                    y9Var7.X.setInterpolator(org.telegram.ui.Components.ds.f27586f);
                    y9Var7.X.start();
                    o1.j jVar = y9Var7.f45994a0;
                    if (jVar != null) {
                        jVar.c();
                    }
                    if (y9Var7.N) {
                        f7 = y9Var7.f45996b0;
                    } else {
                        f7 = 1.0f - y9Var7.f45996b0;
                    }
                    o1.j jVar2 = new o1.j(new ac.a(f7 * 500.0f));
                    y9Var7.f45994a0 = jVar2;
                    jVar2.b(new q9(y9Var7, 1));
                    y9Var7.f45994a0.f18969u = new o1.k(500.0f);
                    y9Var7.f45994a0.f18969u.a(1.0f);
                    y9Var7.f45994a0.f18969u.b(500.0f);
                    y9Var7.f45994a0.h();
                    return;
                }
                return;
        }
    }
}
