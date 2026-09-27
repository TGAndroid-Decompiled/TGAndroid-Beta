package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class o9 implements Runnable {
    public final int f36159a;
    public final x9 f36160b;

    public o9(x9 x9Var, int i10) {
        this.f36159a = i10;
        this.f36160b = x9Var;
    }

    @Override
    public final void run() {
        float f7;
        float f10 = 0.0f;
        switch (this.f36159a) {
            case 0:
                this.f36160b.Y();
                return;
            case 1:
                x9 x9Var = this.f36160b;
                if (!x9Var.isFinishing()) {
                    x9Var.Q = null;
                    x9Var.M = false;
                    x9Var.f39573c0.run();
                    if (!x9Var.M) {
                        AndroidUtilities.runOnUIThread(new o9(x9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                x9 x9Var2 = this.f36160b;
                CameraView cameraView = x9Var2.f39572c;
                if (cameraView != null) {
                    x9Var2.c0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f36160b.finishFragment();
                return;
            case 4:
                x9 x9Var3 = this.f36160b;
                w9 w9Var = x9Var3.L;
                if (w9Var != null) {
                    w9Var.K(x9Var3.Q);
                }
                x9Var3.finishFragment();
                return;
            case 5:
                x9 x9Var4 = this.f36160b;
                x9Var4.T = new a4.m(15);
                Context context = ApplicationLoader.applicationContext;
                ?? obj = new Object();
                obj.f7048a = 256;
                x9Var4.U = new r8.n(new com.google.android.gms.internal.vision.u2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                x9 x9Var5 = this.f36160b;
                if (x9Var5.f39576f.getTag() != null) {
                    x9Var5.f39576f.setTag(null);
                    x9Var5.f39576f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.sr.f28359f).start();
                    return;
                }
                return;
            case 7:
                x9 x9Var6 = this.f36160b;
                CameraView cameraView2 = x9Var6.f39572c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(x9Var6.f39572c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new o9(x9Var6, 4));
                return;
            default:
                x9 x9Var7 = this.f36160b;
                float f11 = x9Var7.X;
                if (x9Var7.M) {
                    f10 = 1.0f;
                }
                x9Var7.Y = f10;
                if (f11 != f10) {
                    ValueAnimator valueAnimator = x9Var7.W;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(x9Var7.X, x9Var7.Y);
                    x9Var7.W = ofFloat;
                    ofFloat.addUpdateListener(new r9(x9Var7, 0));
                    x9Var7.W.setDuration(Math.abs(x9Var7.X - x9Var7.Y) * 300.0f);
                    x9Var7.W.setInterpolator(org.telegram.ui.Components.sr.f28359f);
                    x9Var7.W.start();
                    o1.k kVar = x9Var7.Z;
                    if (kVar != null) {
                        kVar.c();
                    }
                    if (x9Var7.M) {
                        f7 = x9Var7.f39569a0;
                    } else {
                        f7 = 1.0f - x9Var7.f39569a0;
                    }
                    o1.k kVar2 = new o1.k(new o1.j(f7 * 500.0f));
                    x9Var7.Z = kVar2;
                    kVar2.b(new p9(x9Var7, 1));
                    x9Var7.Z.f15572u = new o1.l(500.0f);
                    x9Var7.Z.f15572u.a(1.0f);
                    x9Var7.Z.f15572u.b(500.0f);
                    x9Var7.Z.f();
                    return;
                }
                return;
        }
    }
}
