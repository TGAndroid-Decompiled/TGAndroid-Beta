package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class m9 implements Runnable {
    public final int f35630a;
    public final v9 f35631b;

    public m9(v9 v9Var, int i10) {
        this.f35630a = i10;
        this.f35631b = v9Var;
    }

    @Override
    public final void run() {
        float f7;
        float f10 = 0.0f;
        switch (this.f35630a) {
            case 0:
                this.f35631b.Y();
                return;
            case 1:
                v9 v9Var = this.f35631b;
                if (!v9Var.isFinishing()) {
                    v9Var.Q = null;
                    v9Var.M = false;
                    v9Var.f38442c0.run();
                    if (!v9Var.M) {
                        AndroidUtilities.runOnUIThread(new m9(v9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                v9 v9Var2 = this.f35631b;
                CameraView cameraView = v9Var2.f38441c;
                if (cameraView != null) {
                    v9Var2.c0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f35631b.finishFragment();
                return;
            case 4:
                v9 v9Var3 = this.f35631b;
                u9 u9Var = v9Var3.L;
                if (u9Var != null) {
                    u9Var.K(v9Var3.Q);
                }
                v9Var3.finishFragment();
                return;
            case 5:
                v9 v9Var4 = this.f35631b;
                v9Var4.T = new a4.m(16);
                Context context = ApplicationLoader.applicationContext;
                ?? obj = new Object();
                obj.f7065a = 256;
                v9Var4.U = new r8.n(new com.google.android.gms.internal.vision.u2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                v9 v9Var5 = this.f35631b;
                if (v9Var5.f38445f.getTag() != null) {
                    v9Var5.f38445f.setTag(null);
                    v9Var5.f38445f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.qr.f27642f).start();
                    return;
                }
                return;
            case 7:
                v9 v9Var6 = this.f35631b;
                CameraView cameraView2 = v9Var6.f38441c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(v9Var6.f38441c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new m9(v9Var6, 4));
                return;
            default:
                v9 v9Var7 = this.f35631b;
                float f11 = v9Var7.X;
                if (v9Var7.M) {
                    f10 = 1.0f;
                }
                v9Var7.Y = f10;
                if (f11 != f10) {
                    ValueAnimator valueAnimator = v9Var7.W;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(v9Var7.X, v9Var7.Y);
                    v9Var7.W = ofFloat;
                    ofFloat.addUpdateListener(new p9(v9Var7, 0));
                    v9Var7.W.setDuration(Math.abs(v9Var7.X - v9Var7.Y) * 300.0f);
                    v9Var7.W.setInterpolator(org.telegram.ui.Components.qr.f27642f);
                    v9Var7.W.start();
                    o1.k kVar = v9Var7.Z;
                    if (kVar != null) {
                        kVar.c();
                    }
                    if (v9Var7.M) {
                        f7 = v9Var7.f38438a0;
                    } else {
                        f7 = 1.0f - v9Var7.f38438a0;
                    }
                    o1.k kVar2 = new o1.k(new o1.j(f7 * 500.0f));
                    v9Var7.Z = kVar2;
                    kVar2.b(new n9(v9Var7, 1));
                    v9Var7.Z.f15522u = new o1.l(500.0f);
                    v9Var7.Z.f15522u.a(1.0f);
                    v9Var7.Z.f15522u.b(500.0f);
                    v9Var7.Z.f();
                    return;
                }
                return;
        }
    }
}
