package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class n9 implements Runnable {
    public final int f39478a;
    public final w9 f39479b;

    public n9(w9 w9Var, int i10) {
        this.f39478a = i10;
        this.f39479b = w9Var;
    }

    @Override
    public final void run() {
        float f7;
        float f10 = 0.0f;
        switch (this.f39478a) {
            case 0:
                this.f39479b.Y();
                return;
            case 1:
                w9 w9Var = this.f39479b;
                if (!w9Var.isFinishing()) {
                    w9Var.R = null;
                    w9Var.N = false;
                    w9Var.f42500d0.run();
                    if (!w9Var.N) {
                        AndroidUtilities.runOnUIThread(new n9(w9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                w9 w9Var2 = this.f39479b;
                CameraView cameraView = w9Var2.d;
                if (cameraView != null) {
                    w9Var2.c0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f39479b.finishFragment();
                return;
            case 4:
                w9 w9Var3 = this.f39479b;
                v9 v9Var = w9Var3.M;
                if (v9Var != null) {
                    v9Var.E(w9Var3.R);
                }
                w9Var3.finishFragment();
                return;
            case 5:
                w9 w9Var4 = this.f39479b;
                w9Var4.U = new a6.i(23);
                Context context = ApplicationLoader.applicationContext;
                ?? obj = new Object();
                obj.f7391a = 256;
                w9Var4.V = new r8.n(new com.google.android.gms.internal.vision.t2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                w9 w9Var5 = this.f39479b;
                if (w9Var5.h.getTag() != null) {
                    w9Var5.h.setTag(null);
                    w9Var5.h.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.bs.f25014f).start();
                    return;
                }
                return;
            case 7:
                w9 w9Var6 = this.f39479b;
                CameraView cameraView2 = w9Var6.d;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(w9Var6.d.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new n9(w9Var6, 4));
                return;
            default:
                w9 w9Var7 = this.f39479b;
                float f11 = w9Var7.Y;
                if (w9Var7.N) {
                    f10 = 1.0f;
                }
                w9Var7.Z = f10;
                if (f11 != f10) {
                    ValueAnimator valueAnimator = w9Var7.X;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(w9Var7.Y, w9Var7.Z);
                    w9Var7.X = ofFloat;
                    ofFloat.addUpdateListener(new q9(w9Var7, 0));
                    w9Var7.X.setDuration(Math.abs(w9Var7.Y - w9Var7.Z) * 300.0f);
                    w9Var7.X.setInterpolator(org.telegram.ui.Components.bs.f25014f);
                    w9Var7.X.start();
                    o1.k kVar = w9Var7.f42495a0;
                    if (kVar != null) {
                        kVar.c();
                    }
                    if (w9Var7.N) {
                        f7 = w9Var7.f42497b0;
                    } else {
                        f7 = 1.0f - w9Var7.f42497b0;
                    }
                    o1.k kVar2 = new o1.k(new o1.j(f7 * 500.0f));
                    w9Var7.f42495a0 = kVar2;
                    kVar2.b(new o9(w9Var7, 1));
                    w9Var7.f42495a0.f17561u = new o1.l(500.0f);
                    w9Var7.f42495a0.f17561u.a(1.0f);
                    w9Var7.f42495a0.f17561u.b(500.0f);
                    w9Var7.f42495a0.h();
                    return;
                }
                return;
        }
    }
}
