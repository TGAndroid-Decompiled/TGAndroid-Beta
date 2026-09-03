package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class o9 implements Runnable {
    public final int f36687a;
    public final x9 f36688b;

    public o9(x9 x9Var, int i10) {
        this.f36687a = i10;
        this.f36688b = x9Var;
    }

    @Override
    public final void run() {
        float f10;
        float f11 = 0.0f;
        switch (this.f36687a) {
            case 0:
                this.f36688b.Y();
                return;
            case 1:
                x9 x9Var = this.f36688b;
                if (!x9Var.isFinishing()) {
                    x9Var.N = null;
                    x9Var.J = false;
                    x9Var.Z.run();
                    if (!x9Var.J) {
                        AndroidUtilities.runOnUIThread(new o9(x9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                x9 x9Var2 = this.f36688b;
                CameraView cameraView = x9Var2.f39930c;
                if (cameraView != null) {
                    x9Var2.c0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f36688b.finishFragment();
                return;
            case 4:
                x9 x9Var3 = this.f36688b;
                w9 w9Var = x9Var3.I;
                if (w9Var != null) {
                    w9Var.K(x9Var3.N);
                }
                x9Var3.finishFragment();
                return;
            case 5:
                x9 x9Var4 = this.f36688b;
                x9Var4.Q = new o2.i(18);
                Context context = ApplicationLoader.applicationContext;
                ?? obj = new Object();
                obj.f3741a = 256;
                x9Var4.R = new f8.n(new com.google.android.gms.internal.vision.t2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                x9 x9Var5 = this.f36688b;
                if (x9Var5.f39931f.getTag() != null) {
                    x9Var5.f39931f.setTag(null);
                    x9Var5.f39931f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.mr.f27122f).start();
                    return;
                }
                return;
            case 7:
                x9 x9Var6 = this.f36688b;
                CameraView cameraView2 = x9Var6.f39930c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(x9Var6.f39930c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new o9(x9Var6, 4));
                return;
            default:
                x9 x9Var7 = this.f36688b;
                float f12 = x9Var7.U;
                if (x9Var7.J) {
                    f11 = 1.0f;
                }
                x9Var7.V = f11;
                if (f12 != f11) {
                    ValueAnimator valueAnimator = x9Var7.T;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(x9Var7.U, x9Var7.V);
                    x9Var7.T = ofFloat;
                    ofFloat.addUpdateListener(new r9(x9Var7, 0));
                    x9Var7.T.setDuration(Math.abs(x9Var7.U - x9Var7.V) * 300.0f);
                    x9Var7.T.setInterpolator(org.telegram.ui.Components.mr.f27122f);
                    x9Var7.T.start();
                    o1.j jVar = x9Var7.W;
                    if (jVar != null) {
                        jVar.c();
                    }
                    if (x9Var7.J) {
                        f10 = x9Var7.X;
                    } else {
                        f10 = 1.0f - x9Var7.X;
                    }
                    o1.j jVar2 = new o1.j(new kb.a(f10 * 500.0f));
                    x9Var7.W = jVar2;
                    jVar2.b(new p9(x9Var7, 1));
                    x9Var7.W.f16178u = new o1.k(500.0f);
                    x9Var7.W.f16178u.a(1.0f);
                    x9Var7.W.f16178u.b(500.0f);
                    x9Var7.W.f();
                    return;
                }
                return;
        }
    }
}
