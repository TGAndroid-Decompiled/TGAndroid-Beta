package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class k9 implements Runnable {
    public final int f39226a;
    public final v9 f39227b;

    public k9(v9 v9Var, int i10) {
        this.f39226a = i10;
        this.f39227b = v9Var;
    }

    @Override
    public final void run() {
        float f7;
        float f10 = 0.0f;
        switch (this.f39226a) {
            case 0:
                this.f39227b.Y();
                return;
            case 1:
                v9 v9Var = this.f39227b;
                if (!v9Var.isFinishing()) {
                    v9Var.R = null;
                    v9Var.N = false;
                    v9Var.f42763e0.run();
                    if (!v9Var.N) {
                        AndroidUtilities.runOnUIThread(new k9(v9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                v9 v9Var2 = this.f39227b;
                CameraView cameraView = v9Var2.f42759c;
                if (cameraView != null) {
                    v9Var2.c0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f39227b.finishFragment();
                return;
            case 4:
                v9 v9Var3 = this.f39227b;
                u9 u9Var = v9Var3.M;
                if (u9Var != null) {
                    u9Var.K(v9Var3.R);
                }
                v9Var3.finishFragment();
                return;
            case 5:
                v9 v9Var4 = this.f39227b;
                v9Var4.U = new pb.c();
                Context context = ApplicationLoader.applicationContext;
                ?? obj = new Object();
                obj.f7665a = 256;
                v9Var4.V = new r8.n(new com.google.android.gms.internal.vision.u2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                v9 v9Var5 = this.f39227b;
                if (v9Var5.f42764f.getTag() != null) {
                    v9Var5.f42764f.setTag(null);
                    v9Var5.f42764f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.is.f27443f).start();
                    return;
                }
                return;
            case 7:
                v9 v9Var6 = this.f39227b;
                CameraView cameraView2 = v9Var6.f42759c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(v9Var6.f42759c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new k9(v9Var6, 4));
                return;
            default:
                v9 v9Var7 = this.f39227b;
                float f11 = v9Var7.Z;
                if (v9Var7.N) {
                    f10 = 1.0f;
                }
                v9Var7.f42756a0 = f10;
                if (f11 != f10) {
                    ValueAnimator valueAnimator = v9Var7.Y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(v9Var7.Z, v9Var7.f42756a0);
                    v9Var7.Y = ofFloat;
                    ofFloat.addUpdateListener(new n9(v9Var7, 0));
                    v9Var7.Y.setDuration(Math.abs(v9Var7.Z - v9Var7.f42756a0) * 300.0f);
                    v9Var7.Y.setInterpolator(org.telegram.ui.Components.is.f27443f);
                    v9Var7.Y.start();
                    o1.k kVar = v9Var7.f42758b0;
                    if (kVar != null) {
                        kVar.c();
                    }
                    if (v9Var7.N) {
                        f7 = v9Var7.f42760c0;
                    } else {
                        f7 = 1.0f - v9Var7.f42760c0;
                    }
                    o1.k kVar2 = new o1.k(new o1.j(f7 * 500.0f));
                    v9Var7.f42758b0 = kVar2;
                    kVar2.b(new l9(v9Var7, 1));
                    v9Var7.f42758b0.f16942u = new o1.l(500.0f);
                    v9Var7.f42758b0.f16942u.a(1.0f);
                    v9Var7.f42758b0.f16942u.b(500.0f);
                    v9Var7.f42758b0.h();
                    return;
                }
                return;
        }
    }
}
