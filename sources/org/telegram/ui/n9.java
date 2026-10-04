package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class n9 implements Runnable {
    public final int f38847a;
    public final w9 f38848b;

    public n9(w9 w9Var, int i10) {
        this.f38847a = i10;
        this.f38848b = w9Var;
    }

    @Override
    public final void run() {
        float f7;
        float f10 = 0.0f;
        switch (this.f38847a) {
            case 0:
                this.f38848b.X();
                return;
            case 1:
                w9 w9Var = this.f38848b;
                if (!w9Var.isFinishing()) {
                    w9Var.Q = null;
                    w9Var.M = false;
                    w9Var.f41966c0.run();
                    if (!w9Var.M) {
                        AndroidUtilities.runOnUIThread(new n9(w9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                w9 w9Var2 = this.f38848b;
                CameraView cameraView = w9Var2.f41965c;
                if (cameraView != null) {
                    w9Var2.c0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f38848b.finishFragment();
                return;
            case 4:
                w9 w9Var3 = this.f38848b;
                v9 v9Var = w9Var3.L;
                if (v9Var != null) {
                    v9Var.L(w9Var3.Q);
                }
                w9Var3.finishFragment();
                return;
            case 5:
                w9 w9Var4 = this.f38848b;
                w9Var4.T = new a6.m(20);
                Context context = ApplicationLoader.applicationContext;
                ?? obj = new Object();
                obj.f7615a = 256;
                w9Var4.U = new r8.n(new com.google.android.gms.internal.vision.u2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                w9 w9Var5 = this.f38848b;
                if (w9Var5.f41970f.getTag() != null) {
                    w9Var5.f41970f.setTag(null);
                    w9Var5.f41970f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.tr.f31141f).start();
                    return;
                }
                return;
            case 7:
                w9 w9Var6 = this.f38848b;
                CameraView cameraView2 = w9Var6.f41965c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(w9Var6.f41965c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new n9(w9Var6, 4));
                return;
            default:
                w9 w9Var7 = this.f38848b;
                float f11 = w9Var7.X;
                if (w9Var7.M) {
                    f10 = 1.0f;
                }
                w9Var7.Y = f10;
                if (f11 != f10) {
                    ValueAnimator valueAnimator = w9Var7.W;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(w9Var7.X, w9Var7.Y);
                    w9Var7.W = ofFloat;
                    ofFloat.addUpdateListener(new q9(w9Var7, 0));
                    w9Var7.W.setDuration(Math.abs(w9Var7.X - w9Var7.Y) * 300.0f);
                    w9Var7.W.setInterpolator(org.telegram.ui.Components.tr.f31141f);
                    w9Var7.W.start();
                    o1.k kVar = w9Var7.Z;
                    if (kVar != null) {
                        kVar.c();
                    }
                    if (w9Var7.M) {
                        f7 = w9Var7.f41962a0;
                    } else {
                        f7 = 1.0f - w9Var7.f41962a0;
                    }
                    o1.k kVar2 = new o1.k(new o1.j(f7 * 500.0f));
                    w9Var7.Z = kVar2;
                    kVar2.b(new o9(w9Var7, 1));
                    w9Var7.Z.f16984u = new o1.l(500.0f);
                    w9Var7.Z.f16984u.a(1.0f);
                    w9Var7.Z.f16984u.b(500.0f);
                    w9Var7.Z.f();
                    return;
                }
                return;
        }
    }
}
