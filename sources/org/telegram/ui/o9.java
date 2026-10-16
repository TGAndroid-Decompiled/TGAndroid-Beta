package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class o9 implements Runnable {
    public final int f38571a;
    public final z9 f38572b;

    public o9(z9 z9Var, int i10) {
        this.f38571a = i10;
        this.f38572b = z9Var;
    }

    @Override
    public final void run() {
        float f7;
        float f10 = 0.0f;
        switch (this.f38571a) {
            case 0:
                this.f38572b.Y();
                return;
            case 1:
                z9 z9Var = this.f38572b;
                if (!z9Var.isFinishing()) {
                    z9Var.R = null;
                    z9Var.N = false;
                    z9Var.f42228e0.run();
                    if (!z9Var.N) {
                        AndroidUtilities.runOnUIThread(new o9(z9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                z9 z9Var2 = this.f38572b;
                CameraView cameraView = z9Var2.f42225c;
                if (cameraView != null) {
                    z9Var2.c0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f38572b.finishFragment();
                return;
            case 4:
                z9 z9Var3 = this.f38572b;
                y9 y9Var = z9Var3.M;
                if (y9Var != null) {
                    y9Var.K(z9Var3.R);
                }
                z9Var3.finishFragment();
                return;
            case 5:
                z9 z9Var4 = this.f38572b;
                z9Var4.U = new a4.l(24);
                Context context = ApplicationLoader.applicationContext;
                ?? obj = new Object();
                obj.f5935a = 256;
                z9Var4.V = new r8.n(new com.google.android.gms.internal.vision.t2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                z9 z9Var5 = this.f38572b;
                if (z9Var5.f42229f.getTag() != null) {
                    z9Var5.f42229f.setTag(null);
                    z9Var5.f42229f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.es.f24465f).start();
                    return;
                }
                return;
            case 7:
                z9 z9Var6 = this.f38572b;
                CameraView cameraView2 = z9Var6.f42225c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(z9Var6.f42225c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new o9(z9Var6, 4));
                return;
            default:
                z9 z9Var7 = this.f38572b;
                float f11 = z9Var7.Z;
                if (z9Var7.N) {
                    f10 = 1.0f;
                }
                z9Var7.f42222a0 = f10;
                if (f11 != f10) {
                    ValueAnimator valueAnimator = z9Var7.Y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(z9Var7.Z, z9Var7.f42222a0);
                    z9Var7.Y = ofFloat;
                    ofFloat.addUpdateListener(new r9(z9Var7, 0));
                    z9Var7.Y.setDuration(Math.abs(z9Var7.Z - z9Var7.f42222a0) * 300.0f);
                    z9Var7.Y.setInterpolator(org.telegram.ui.Components.es.f24465f);
                    z9Var7.Y.start();
                    o1.k kVar = z9Var7.f42224b0;
                    if (kVar != null) {
                        kVar.c();
                    }
                    if (z9Var7.N) {
                        f7 = z9Var7.f42226c0;
                    } else {
                        f7 = 1.0f - z9Var7.f42226c0;
                    }
                    o1.k kVar2 = new o1.k(new o1.j(f7 * 500.0f));
                    z9Var7.f42224b0 = kVar2;
                    kVar2.b(new p9(z9Var7, 1));
                    z9Var7.f42224b0.f16161u = new o1.l(500.0f);
                    z9Var7.f42224b0.f16161u.a(1.0f);
                    z9Var7.f42224b0.f16161u.b(500.0f);
                    z9Var7.f42224b0.h();
                    return;
                }
                return;
        }
    }
}
