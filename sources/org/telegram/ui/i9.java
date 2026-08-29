package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class i9 implements Runnable {
    public final int f39155a;
    public final r9 f39156b;

    public i9(r9 r9Var, int i10) {
        this.f39155a = i10;
        this.f39156b = r9Var;
    }

    @Override
    public final void run() {
        float f9;
        float f10 = 0.0f;
        switch (this.f39155a) {
            case 0:
                this.f39156b.Y();
                return;
            case 1:
                r9 r9Var = this.f39156b;
                if (!r9Var.isFinishing()) {
                    r9Var.M = null;
                    r9Var.I = false;
                    r9Var.Y.run();
                    if (!r9Var.I) {
                        AndroidUtilities.runOnUIThread(new i9(r9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                r9 r9Var2 = this.f39156b;
                CameraView cameraView = r9Var2.f42003c;
                if (cameraView != null) {
                    r9Var2.c0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f39156b.finishFragment();
                return;
            case 4:
                r9 r9Var3 = this.f39156b;
                q9 q9Var = r9Var3.H;
                if (q9Var != null) {
                    q9Var.J(r9Var3.M);
                }
                r9Var3.finishFragment();
                return;
            case 5:
                r9 r9Var4 = this.f39156b;
                r9Var4.P = new nh.d6(19);
                Context context = ApplicationLoader.applicationContext;
                ?? obj = new Object();
                obj.f4889a = 256;
                r9Var4.Q = new d8.n(new com.google.android.gms.internal.vision.t2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                r9 r9Var5 = this.f39156b;
                if (r9Var5.f42005f.getTag() != null) {
                    r9Var5.f42005f.setTag(null);
                    r9Var5.f42005f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.jr.f29800f).start();
                    return;
                }
                return;
            case 7:
                r9 r9Var6 = this.f39156b;
                CameraView cameraView2 = r9Var6.f42003c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(r9Var6.f42003c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new i9(r9Var6, 4));
                return;
            default:
                r9 r9Var7 = this.f39156b;
                float f11 = r9Var7.T;
                if (r9Var7.I) {
                    f10 = 1.0f;
                }
                r9Var7.U = f10;
                if (f11 != f10) {
                    ValueAnimator valueAnimator = r9Var7.S;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(r9Var7.T, r9Var7.U);
                    r9Var7.S = ofFloat;
                    ofFloat.addUpdateListener(new l9(r9Var7, 0));
                    r9Var7.S.setDuration(Math.abs(r9Var7.T - r9Var7.U) * 300.0f);
                    r9Var7.S.setInterpolator(org.telegram.ui.Components.jr.f29800f);
                    r9Var7.S.start();
                    o1.k kVar = r9Var7.V;
                    if (kVar != null) {
                        kVar.c();
                    }
                    if (r9Var7.I) {
                        f9 = r9Var7.W;
                    } else {
                        f9 = 1.0f - r9Var7.W;
                    }
                    o1.k kVar2 = new o1.k(new ib.a(f9 * 500.0f));
                    r9Var7.V = kVar2;
                    kVar2.b(new j9(r9Var7, 1));
                    r9Var7.V.f19045u = new o1.l(500.0f);
                    r9Var7.V.f19045u.a(1.0f);
                    r9Var7.V.f19045u.b(500.0f);
                    r9Var7.V.f();
                    return;
                }
                return;
        }
    }
}
