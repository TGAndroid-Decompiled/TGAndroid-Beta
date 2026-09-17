package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class l9 implements Runnable {
    public final int f38234a;
    public final u9 f38235b;

    public l9(u9 u9Var, int i10) {
        this.f38234a = i10;
        this.f38235b = u9Var;
    }

    @Override
    public final void run() {
        float f7;
        float f10 = 0.0f;
        switch (this.f38234a) {
            case 0:
                this.f38235b.Y();
                return;
            case 1:
                u9 u9Var = this.f38235b;
                if (!u9Var.isFinishing()) {
                    u9Var.Q = null;
                    u9Var.M = false;
                    u9Var.f40983c0.run();
                    if (!u9Var.M) {
                        AndroidUtilities.runOnUIThread(new l9(u9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                u9 u9Var2 = this.f38235b;
                CameraView cameraView = u9Var2.f40982c;
                if (cameraView != null) {
                    u9Var2.c0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f38235b.finishFragment();
                return;
            case 4:
                u9 u9Var3 = this.f38235b;
                t9 t9Var = u9Var3.L;
                if (t9Var != null) {
                    t9Var.K(u9Var3.Q);
                }
                u9Var3.finishFragment();
                return;
            case 5:
                u9 u9Var4 = this.f38235b;
                u9Var4.T = new a6.m(20);
                Context context = ApplicationLoader.applicationContext;
                ?? obj = new Object();
                obj.f6087a = 256;
                u9Var4.U = new r8.n(new com.google.android.gms.internal.vision.u2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                u9 u9Var5 = this.f38235b;
                if (u9Var5.f40987f.getTag() != null) {
                    u9Var5.f40987f.setTag(null);
                    u9Var5.f40987f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.pr.f29467f).start();
                    return;
                }
                return;
            case 7:
                u9 u9Var6 = this.f38235b;
                CameraView cameraView2 = u9Var6.f40982c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(u9Var6.f40982c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new l9(u9Var6, 4));
                return;
            default:
                u9 u9Var7 = this.f38235b;
                float f11 = u9Var7.X;
                if (u9Var7.M) {
                    f10 = 1.0f;
                }
                u9Var7.Y = f10;
                if (f11 != f10) {
                    ValueAnimator valueAnimator = u9Var7.W;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(u9Var7.X, u9Var7.Y);
                    u9Var7.W = ofFloat;
                    ofFloat.addUpdateListener(new o9(u9Var7, 0));
                    u9Var7.W.setDuration(Math.abs(u9Var7.X - u9Var7.Y) * 300.0f);
                    u9Var7.W.setInterpolator(org.telegram.ui.Components.pr.f29467f);
                    u9Var7.W.start();
                    o1.k kVar = u9Var7.Z;
                    if (kVar != null) {
                        kVar.c();
                    }
                    if (u9Var7.M) {
                        f7 = u9Var7.f40979a0;
                    } else {
                        f7 = 1.0f - u9Var7.f40979a0;
                    }
                    o1.k kVar2 = new o1.k(new o1.j(f7 * 500.0f));
                    u9Var7.Z = kVar2;
                    kVar2.b(new m9(u9Var7, 1));
                    u9Var7.Z.f16825u = new o1.l(500.0f);
                    u9Var7.Z.f16825u.a(1.0f);
                    u9Var7.Z.f16825u.b(500.0f);
                    u9Var7.Z.f();
                    return;
                }
                return;
        }
    }
}
