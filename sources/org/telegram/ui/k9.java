package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

public final class k9 implements Runnable {

    public final int f39655a;

    public final t9 f39656b;

    public k9(t9 t9Var, int i10) {
        this.f39655a = i10;
        this.f39656b = t9Var;
    }

    @Override
    public final void run() {
        int i10 = 0;
        switch (this.f39655a) {
            case 0:
                this.f39656b.Y();
                break;
            case 1:
                t9 t9Var = this.f39656b;
                if (!t9Var.isFinishing()) {
                    t9Var.M = null;
                    t9Var.I = false;
                    t9Var.Y.run();
                    if (!t9Var.I) {
                        AndroidUtilities.runOnUIThread(new k9(t9Var, 8), 500L);
                    }
                    break;
                }
                break;
            case 2:
                t9 t9Var2 = this.f39656b;
                CameraView cameraView = t9Var2.f42821c;
                if (cameraView != null) {
                    t9Var2.c0(cameraView.getTextureView().getBitmap());
                }
                break;
            case 3:
                this.f39656b.finishFragment();
                break;
            case 4:
                t9 t9Var3 = this.f39656b;
                s9 s9Var = t9Var3.H;
                if (s9Var != null) {
                    s9Var.C(t9Var3.M);
                }
                t9Var3.finishFragment();
                break;
            case 5:
                t9 t9Var4 = this.f39656b;
                t9Var4.P = new n2.b0(14);
                Context context = ApplicationLoader.applicationContext;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.f4317a = 256;
                t9Var4.Q = new c8.n(new com.google.android.gms.internal.vision.t2(context, x1Var));
                break;
            case 6:
                t9 t9Var5 = this.f39656b;
                if (t9Var5.f42823f.getTag() != null) {
                    t9Var5.f42823f.setTag(null);
                    t9Var5.f42823f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
                }
                break;
            case 7:
                t9 t9Var6 = this.f39656b;
                CameraView cameraView2 = t9Var6.f42821c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(t9Var6.f42821c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new k9(t9Var6, 4));
                break;
            default:
                t9 t9Var7 = this.f39656b;
                float f10 = t9Var7.T;
                float f11 = t9Var7.I ? 1.0f : 0.0f;
                t9Var7.U = f11;
                if (f10 != f11) {
                    ValueAnimator valueAnimator = t9Var7.S;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    int i11 = 1;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(t9Var7.T, t9Var7.U);
                    t9Var7.S = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new n9(t9Var7, i10));
                    t9Var7.S.setDuration((long) (Math.abs(t9Var7.T - t9Var7.U) * 300.0f));
                    t9Var7.S.setInterpolator(org.telegram.ui.Components.er.f28122f);
                    t9Var7.S.start();
                    o1.j jVar = t9Var7.V;
                    if (jVar != null) {
                        jVar.c();
                    }
                    o1.j jVar2 = new o1.j(new hb.a((t9Var7.I ? t9Var7.W : 1.0f - t9Var7.W) * 500.0f));
                    t9Var7.V = jVar2;
                    jVar2.b(new l9(t9Var7, i11));
                    t9Var7.V.f19147u = new o1.k(500.0f);
                    t9Var7.V.f19147u.a(1.0f);
                    t9Var7.V.f19147u.b(500.0f);
                    t9Var7.V.f();
                }
                break;
        }
    }
}
