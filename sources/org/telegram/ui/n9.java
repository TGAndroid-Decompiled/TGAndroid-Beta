package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class n9 implements Runnable {
    public final int f40331a;
    public final y9 f40332b;

    public n9(y9 y9Var, int i10) {
        this.f40331a = i10;
        this.f40332b = y9Var;
    }

    @Override
    public final void run() {
        float f7;
        float f10 = 0.0f;
        switch (this.f40331a) {
            case 0:
                this.f40332b.Y();
                return;
            case 1:
                y9 y9Var = this.f40332b;
                if (!y9Var.isFinishing()) {
                    y9Var.R = null;
                    y9Var.N = false;
                    y9Var.f44339e0.run();
                    if (!y9Var.N) {
                        AndroidUtilities.runOnUIThread(new n9(y9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                y9 y9Var2 = this.f40332b;
                CameraView cameraView = y9Var2.f44335c;
                if (cameraView != null) {
                    y9Var2.c0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f40332b.finishFragment();
                return;
            case 4:
                y9 y9Var3 = this.f40332b;
                x9 x9Var = y9Var3.M;
                if (x9Var != null) {
                    x9Var.K(y9Var3.R);
                }
                y9Var3.finishFragment();
                return;
            case 5:
                y9 y9Var4 = this.f40332b;
                y9Var4.U = new a6.m(21);
                Context context = ApplicationLoader.applicationContext;
                ?? obj = new Object();
                obj.f7663a = 256;
                y9Var4.V = new r8.n(new com.google.android.gms.internal.vision.u2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                y9 y9Var5 = this.f40332b;
                if (y9Var5.f44340f.getTag() != null) {
                    y9Var5.f44340f.setTag(null);
                    y9Var5.f44340f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.js.f27634f).start();
                    return;
                }
                return;
            case 7:
                y9 y9Var6 = this.f40332b;
                CameraView cameraView2 = y9Var6.f44335c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(y9Var6.f44335c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new n9(y9Var6, 4));
                return;
            default:
                y9 y9Var7 = this.f40332b;
                float f11 = y9Var7.Z;
                if (y9Var7.N) {
                    f10 = 1.0f;
                }
                y9Var7.f44332a0 = f10;
                if (f11 != f10) {
                    ValueAnimator valueAnimator = y9Var7.Y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(y9Var7.Z, y9Var7.f44332a0);
                    y9Var7.Y = ofFloat;
                    ofFloat.addUpdateListener(new q9(y9Var7, 0));
                    y9Var7.Y.setDuration(Math.abs(y9Var7.Z - y9Var7.f44332a0) * 300.0f);
                    y9Var7.Y.setInterpolator(org.telegram.ui.Components.js.f27634f);
                    y9Var7.Y.start();
                    o1.k kVar = y9Var7.f44334b0;
                    if (kVar != null) {
                        kVar.c();
                    }
                    if (y9Var7.N) {
                        f7 = y9Var7.f44336c0;
                    } else {
                        f7 = 1.0f - y9Var7.f44336c0;
                    }
                    o1.k kVar2 = new o1.k(new o1.j(f7 * 500.0f));
                    y9Var7.f44334b0 = kVar2;
                    kVar2.b(new o9(y9Var7, 1));
                    y9Var7.f44334b0.f16691u = new o1.l(500.0f);
                    y9Var7.f44334b0.f16691u.a(1.0f);
                    y9Var7.f44334b0.f16691u.b(500.0f);
                    y9Var7.f44334b0.h();
                    return;
                }
                return;
        }
    }
}
