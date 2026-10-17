package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class n9 implements Runnable {
    public final int f39376a;
    public final y9 f39377b;

    public n9(y9 y9Var, int i10) {
        this.f39376a = i10;
        this.f39377b = y9Var;
    }

    @Override
    public final void run() {
        float f7;
        float f10 = 0.0f;
        switch (this.f39376a) {
            case 0:
                this.f39377b.Y();
                return;
            case 1:
                y9 y9Var = this.f39377b;
                if (!y9Var.isFinishing()) {
                    y9Var.S = null;
                    y9Var.O = false;
                    y9Var.f43358f0.run();
                    if (!y9Var.O) {
                        AndroidUtilities.runOnUIThread(new n9(y9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                y9 y9Var2 = this.f39377b;
                CameraView cameraView = y9Var2.d;
                if (cameraView != null) {
                    y9Var2.c0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f39377b.finishFragment();
                return;
            case 4:
                y9 y9Var3 = this.f39377b;
                x9 x9Var = y9Var3.N;
                if (x9Var != null) {
                    x9Var.E(y9Var3.S);
                }
                y9Var3.finishFragment();
                return;
            case 5:
                y9 y9Var4 = this.f39377b;
                y9Var4.V = new a6.i(23);
                Context context = ApplicationLoader.applicationContext;
                ?? obj = new Object();
                obj.f7391a = 256;
                y9Var4.W = new r8.n(new com.google.android.gms.internal.vision.t2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                y9 y9Var5 = this.f39377b;
                if (y9Var5.h.getTag() != null) {
                    y9Var5.h.setTag(null);
                    y9Var5.h.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.bs.f25030f).start();
                    return;
                }
                return;
            case 7:
                y9 y9Var6 = this.f39377b;
                CameraView cameraView2 = y9Var6.d;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(y9Var6.d.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new n9(y9Var6, 4));
                return;
            default:
                y9 y9Var7 = this.f39377b;
                float f11 = y9Var7.f43350a0;
                if (y9Var7.O) {
                    f10 = 1.0f;
                }
                y9Var7.f43352b0 = f10;
                if (f11 != f10) {
                    ValueAnimator valueAnimator = y9Var7.Z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(y9Var7.f43350a0, y9Var7.f43352b0);
                    y9Var7.Z = ofFloat;
                    ofFloat.addUpdateListener(new q9(y9Var7, 0));
                    y9Var7.Z.setDuration(Math.abs(y9Var7.f43350a0 - y9Var7.f43352b0) * 300.0f);
                    y9Var7.Z.setInterpolator(org.telegram.ui.Components.bs.f25030f);
                    y9Var7.Z.start();
                    o1.k kVar = y9Var7.f43354c0;
                    if (kVar != null) {
                        kVar.c();
                    }
                    if (y9Var7.O) {
                        f7 = y9Var7.f43355d0;
                    } else {
                        f7 = 1.0f - y9Var7.f43355d0;
                    }
                    o1.k kVar2 = new o1.k(new o1.j(f7 * 500.0f));
                    y9Var7.f43354c0 = kVar2;
                    kVar2.b(new o9(y9Var7, 1));
                    y9Var7.f43354c0.f17555u = new o1.l(500.0f);
                    y9Var7.f43354c0.f17555u.a(1.0f);
                    y9Var7.f43354c0.f17555u.b(500.0f);
                    y9Var7.f43354c0.h();
                    return;
                }
                return;
        }
    }
}
