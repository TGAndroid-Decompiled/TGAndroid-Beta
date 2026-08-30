package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class m9 implements Runnable {
    public final int f36234a;
    public final v9 f36235b;

    public m9(v9 v9Var, int i10) {
        this.f36234a = i10;
        this.f36235b = v9Var;
    }

    @Override
    public final void run() {
        float f10;
        float f11 = 0.0f;
        switch (this.f36234a) {
            case 0:
                this.f36235b.Y();
                return;
            case 1:
                v9 v9Var = this.f36235b;
                if (!v9Var.isFinishing()) {
                    v9Var.N = null;
                    v9Var.J = false;
                    v9Var.Z.run();
                    if (!v9Var.J) {
                        AndroidUtilities.runOnUIThread(new m9(v9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                v9 v9Var2 = this.f36235b;
                CameraView cameraView = v9Var2.f39111c;
                if (cameraView != null) {
                    v9Var2.c0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f36235b.finishFragment();
                return;
            case 4:
                v9 v9Var3 = this.f36235b;
                u9 u9Var = v9Var3.I;
                if (u9Var != null) {
                    u9Var.K(v9Var3.N);
                }
                v9Var3.finishFragment();
                return;
            case 5:
                v9 v9Var4 = this.f36235b;
                v9Var4.Q = new ph.j5(7);
                Context context = ApplicationLoader.applicationContext;
                ?? obj = new Object();
                obj.f3758a = 256;
                v9Var4.R = new f8.n(new com.google.android.gms.internal.vision.t2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                v9 v9Var5 = this.f36235b;
                if (v9Var5.f39112f.getTag() != null) {
                    v9Var5.f39112f.setTag(null);
                    v9Var5.f39112f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.nr.f27346f).start();
                    return;
                }
                return;
            case 7:
                v9 v9Var6 = this.f36235b;
                CameraView cameraView2 = v9Var6.f39111c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(v9Var6.f39111c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new m9(v9Var6, 4));
                return;
            default:
                v9 v9Var7 = this.f36235b;
                float f12 = v9Var7.U;
                if (v9Var7.J) {
                    f11 = 1.0f;
                }
                v9Var7.V = f11;
                if (f12 != f11) {
                    ValueAnimator valueAnimator = v9Var7.T;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(v9Var7.U, v9Var7.V);
                    v9Var7.T = ofFloat;
                    ofFloat.addUpdateListener(new p9(v9Var7, 0));
                    v9Var7.T.setDuration(Math.abs(v9Var7.U - v9Var7.V) * 300.0f);
                    v9Var7.T.setInterpolator(org.telegram.ui.Components.nr.f27346f);
                    v9Var7.T.start();
                    o1.j jVar = v9Var7.W;
                    if (jVar != null) {
                        jVar.c();
                    }
                    if (v9Var7.J) {
                        f10 = v9Var7.X;
                    } else {
                        f10 = 1.0f - v9Var7.X;
                    }
                    o1.j jVar2 = new o1.j(new kb.a(f10 * 500.0f));
                    v9Var7.W = jVar2;
                    jVar2.b(new n9(v9Var7, 1));
                    v9Var7.W.f16198u = new o1.k(500.0f);
                    v9Var7.W.f16198u.a(1.0f);
                    v9Var7.W.f16198u.b(500.0f);
                    v9Var7.W.f();
                    return;
                }
                return;
        }
    }
}
