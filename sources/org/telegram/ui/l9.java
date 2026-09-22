package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class l9 implements Runnable {
    public final int f35357a;
    public final u9 f35358b;

    public l9(u9 u9Var, int i10) {
        this.f35357a = i10;
        this.f35358b = u9Var;
    }

    @Override
    public final void run() {
        float f7;
        float f10 = 0.0f;
        switch (this.f35357a) {
            case 0:
                this.f35358b.Y();
                return;
            case 1:
                u9 u9Var = this.f35358b;
                if (!u9Var.isFinishing()) {
                    u9Var.Q = null;
                    u9Var.M = false;
                    u9Var.f37854c0.run();
                    if (!u9Var.M) {
                        AndroidUtilities.runOnUIThread(new l9(u9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                u9 u9Var2 = this.f35358b;
                CameraView cameraView = u9Var2.f37853c;
                if (cameraView != null) {
                    u9Var2.c0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f35358b.finishFragment();
                return;
            case 4:
                u9 u9Var3 = this.f35358b;
                t9 t9Var = u9Var3.L;
                if (t9Var != null) {
                    t9Var.K(u9Var3.Q);
                }
                u9Var3.finishFragment();
                return;
            case 5:
                u9 u9Var4 = this.f35358b;
                u9Var4.T = new a4.m(15);
                Context context = ApplicationLoader.applicationContext;
                ?? obj = new Object();
                obj.f7061a = 256;
                u9Var4.U = new r8.n(new com.google.android.gms.internal.vision.u2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                u9 u9Var5 = this.f35358b;
                if (u9Var5.f37857f.getTag() != null) {
                    u9Var5.f37857f.setTag(null);
                    u9Var5.f37857f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.qr.f27420f).start();
                    return;
                }
                return;
            case 7:
                u9 u9Var6 = this.f35358b;
                CameraView cameraView2 = u9Var6.f37853c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(u9Var6.f37853c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new l9(u9Var6, 4));
                return;
            default:
                u9 u9Var7 = this.f35358b;
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
                    u9Var7.W.setInterpolator(org.telegram.ui.Components.qr.f27420f);
                    u9Var7.W.start();
                    o1.k kVar = u9Var7.Z;
                    if (kVar != null) {
                        kVar.c();
                    }
                    if (u9Var7.M) {
                        f7 = u9Var7.f37850a0;
                    } else {
                        f7 = 1.0f - u9Var7.f37850a0;
                    }
                    o1.k kVar2 = new o1.k(new o1.j(f7 * 500.0f));
                    u9Var7.Z = kVar2;
                    kVar2.b(new m9(u9Var7, 1));
                    u9Var7.Z.f15349u = new o1.l(500.0f);
                    u9Var7.Z.f15349u.a(1.0f);
                    u9Var7.Z.f15349u.b(500.0f);
                    u9Var7.Z.f();
                    return;
                }
                return;
        }
    }
}
