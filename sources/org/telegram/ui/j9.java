package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class j9 implements Runnable {
    public final int f39404a;
    public final s9 f39405b;

    public j9(s9 s9Var, int i9) {
        this.f39404a = i9;
        this.f39405b = s9Var;
    }

    @Override
    public final void run() {
        float f10;
        float f11 = 0.0f;
        switch (this.f39404a) {
            case 0:
                this.f39405b.X();
                return;
            case 1:
                s9 s9Var = this.f39405b;
                if (!s9Var.isFinishing()) {
                    s9Var.M = null;
                    s9Var.I = false;
                    s9Var.Y.run();
                    if (!s9Var.I) {
                        AndroidUtilities.runOnUIThread(new j9(s9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                s9 s9Var2 = this.f39405b;
                CameraView cameraView = s9Var2.f42596c;
                if (cameraView != null) {
                    s9Var2.b0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f39405b.finishFragment();
                return;
            case 4:
                s9 s9Var3 = this.f39405b;
                r9 r9Var = s9Var3.H;
                if (r9Var != null) {
                    r9Var.K(s9Var3.M);
                }
                s9Var3.finishFragment();
                return;
            case 5:
                s9 s9Var4 = this.f39405b;
                s9Var4.P = new m5.c0(9);
                Context context = ApplicationLoader.applicationContext;
                ?? obj = new Object();
                obj.f3875a = 256;
                s9Var4.Q = new b8.n(new com.google.android.gms.internal.vision.t2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                s9 s9Var5 = this.f39405b;
                if (s9Var5.f42598f.getTag() != null) {
                    s9Var5.f42598f.setTag(null);
                    s9Var5.f42598f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.gr.f28844f).start();
                    return;
                }
                return;
            case 7:
                s9 s9Var6 = this.f39405b;
                CameraView cameraView2 = s9Var6.f42596c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(s9Var6.f42596c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new j9(s9Var6, 4));
                return;
            default:
                s9 s9Var7 = this.f39405b;
                float f12 = s9Var7.T;
                if (s9Var7.I) {
                    f11 = 1.0f;
                }
                s9Var7.U = f11;
                if (f12 != f11) {
                    ValueAnimator valueAnimator = s9Var7.S;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(s9Var7.T, s9Var7.U);
                    s9Var7.S = ofFloat;
                    ofFloat.addUpdateListener(new m9(s9Var7, 0));
                    s9Var7.S.setDuration(Math.abs(s9Var7.T - s9Var7.U) * 300.0f);
                    s9Var7.S.setInterpolator(org.telegram.ui.Components.gr.f28844f);
                    s9Var7.S.start();
                    o1.j jVar = s9Var7.V;
                    if (jVar != null) {
                        jVar.c();
                    }
                    if (s9Var7.I) {
                        f10 = s9Var7.W;
                    } else {
                        f10 = 1.0f - s9Var7.W;
                    }
                    o1.j jVar2 = new o1.j(new gb.a(f10 * 500.0f));
                    s9Var7.V = jVar2;
                    jVar2.b(new k9(s9Var7, 1));
                    s9Var7.V.f18800u = new o1.k(500.0f);
                    s9Var7.V.f18800u.a(1.0f);
                    s9Var7.V.f18800u.b(500.0f);
                    s9Var7.V.f();
                    return;
                }
                return;
        }
    }
}
