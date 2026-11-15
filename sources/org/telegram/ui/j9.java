package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class j9 implements Runnable {
    public final int f48262a;
    public final t9 f48263b;

    public j9(t9 t9Var, int i7) {
        this.f48262a = i7;
        this.f48263b = t9Var;
    }

    @Override
    public final void run() {
        float f10;
        float f11 = 0.0f;
        switch (this.f48262a) {
            case 0:
                this.f48263b.d0();
                return;
            case 1:
                t9 t9Var = this.f48263b;
                if (!t9Var.isFinishing()) {
                    t9Var.S = null;
                    t9Var.O = false;
                    t9Var.f51501e0.run();
                    if (!t9Var.O) {
                        org.telegram.messenger.g0.i3(new j9(t9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                t9 t9Var2 = this.f48263b;
                CameraView cameraView = t9Var2.d;
                if (cameraView != null) {
                    t9Var2.h0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f48263b.finishFragment();
                return;
            case 4:
                t9 t9Var3 = this.f48263b;
                s9 s9Var = t9Var3.N;
                if (s9Var != null) {
                    s9Var.M(t9Var3.S);
                }
                t9Var3.finishFragment();
                return;
            case 5:
                t9 t9Var4 = this.f48263b;
                t9Var4.V = new cb.c(24);
                Context context = org.telegram.messenger.t0.f26609b;
                ?? obj = new Object();
                obj.f7049a = 256;
                t9Var4.W = new u8.n(new com.google.android.gms.internal.vision.u2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                t9 t9Var5 = this.f48263b;
                if (t9Var5.h.getTag() != null) {
                    t9Var5.h.setTag(null);
                    t9Var5.h.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.er.f34419f).start();
                    return;
                }
                return;
            case 7:
                t9 t9Var6 = this.f48263b;
                CameraView cameraView2 = t9Var6.d;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(t9Var6.d.getCameraSession());
                }
                org.telegram.messenger.g0.h3(new j9(t9Var6, 4));
                return;
            default:
                t9 t9Var7 = this.f48263b;
                float f12 = t9Var7.Z;
                if (t9Var7.O) {
                    f11 = 1.0f;
                }
                t9Var7.f51494a0 = f11;
                if (f12 != f11) {
                    ValueAnimator valueAnimator = t9Var7.Y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(t9Var7.Z, t9Var7.f51494a0);
                    t9Var7.Y = ofFloat;
                    ofFloat.addUpdateListener(new m9(t9Var7, 0));
                    t9Var7.Y.setDuration(Math.abs(t9Var7.Z - t9Var7.f51494a0) * 300.0f);
                    t9Var7.Y.setInterpolator(org.telegram.ui.Components.er.f34419f);
                    t9Var7.Y.start();
                    r1.g gVar = t9Var7.f51496b0;
                    if (gVar != null) {
                        gVar.d();
                    }
                    if (t9Var7.O) {
                        f10 = t9Var7.f51498c0;
                    } else {
                        f10 = 1.0f - t9Var7.f51498c0;
                    }
                    r1.g gVar2 = new r1.g(new r1.f(f10 * 500.0f));
                    t9Var7.f51496b0 = gVar2;
                    gVar2.b(new k9(t9Var7, 1));
                    t9Var7.f51496b0.f55748m = new r1.h(500.0f);
                    t9Var7.f51496b0.f55748m.a(1.0f);
                    t9Var7.f51496b0.f55748m.b(500.0f);
                    t9Var7.f51496b0.h();
                    return;
                }
                return;
        }
    }
}
