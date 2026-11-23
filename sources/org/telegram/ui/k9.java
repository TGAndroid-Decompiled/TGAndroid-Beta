package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class k9 implements Runnable {
    public final int f49248a;
    public final t9 f49249b;

    public k9(t9 t9Var, int i7) {
        this.f49248a = i7;
        this.f49249b = t9Var;
    }

    @Override
    public final void run() {
        float f10;
        float f11 = 0.0f;
        switch (this.f49248a) {
            case 0:
                this.f49249b.d0();
                return;
            case 1:
                t9 t9Var = this.f49249b;
                if (!t9Var.isFinishing()) {
                    t9Var.S = null;
                    t9Var.O = false;
                    t9Var.f52274e0.run();
                    if (!t9Var.O) {
                        org.telegram.messenger.g0.h3(new k9(t9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                t9 t9Var2 = this.f49249b;
                CameraView cameraView = t9Var2.d;
                if (cameraView != null) {
                    t9Var2.h0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f49249b.finishFragment();
                return;
            case 4:
                t9 t9Var3 = this.f49249b;
                s9 s9Var = t9Var3.N;
                if (s9Var != null) {
                    s9Var.J(t9Var3.S);
                }
                t9Var3.finishFragment();
                return;
            case 5:
                t9 t9Var4 = this.f49249b;
                t9Var4.V = new d6.i(20);
                Context context = org.telegram.messenger.t0.f26931b;
                ?? obj = new Object();
                obj.f7361a = 256;
                t9Var4.W = new u8.n(new com.google.android.gms.internal.vision.u2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                t9 t9Var5 = this.f49249b;
                if (t9Var5.h.getTag() != null) {
                    t9Var5.h.setTag(null);
                    t9Var5.h.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.nr.f37961f).start();
                    return;
                }
                return;
            case 7:
                t9 t9Var6 = this.f49249b;
                CameraView cameraView2 = t9Var6.d;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(t9Var6.d.getCameraSession());
                }
                org.telegram.messenger.g0.g3(new k9(t9Var6, 4));
                return;
            default:
                t9 t9Var7 = this.f49249b;
                float f12 = t9Var7.Z;
                if (t9Var7.O) {
                    f11 = 1.0f;
                }
                t9Var7.f52267a0 = f11;
                if (f12 != f11) {
                    ValueAnimator valueAnimator = t9Var7.Y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(t9Var7.Z, t9Var7.f52267a0);
                    t9Var7.Y = ofFloat;
                    ofFloat.addUpdateListener(new n9(t9Var7, 0));
                    t9Var7.Y.setDuration(Math.abs(t9Var7.Z - t9Var7.f52267a0) * 300.0f);
                    t9Var7.Y.setInterpolator(org.telegram.ui.Components.nr.f37961f);
                    t9Var7.Y.start();
                    r1.g gVar = t9Var7.f52269b0;
                    if (gVar != null) {
                        gVar.d();
                    }
                    if (t9Var7.O) {
                        f10 = t9Var7.f52271c0;
                    } else {
                        f10 = 1.0f - t9Var7.f52271c0;
                    }
                    r1.g gVar2 = new r1.g(new r1.f(f10 * 500.0f));
                    t9Var7.f52269b0 = gVar2;
                    gVar2.b(new l9(t9Var7, 1));
                    t9Var7.f52269b0.f56368m = new r1.h(500.0f);
                    t9Var7.f52269b0.f56368m.a(1.0f);
                    t9Var7.f52269b0.f56368m.b(500.0f);
                    t9Var7.f52269b0.h();
                    return;
                }
                return;
        }
    }
}
