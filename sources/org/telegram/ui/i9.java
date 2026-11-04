package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class i9 implements Runnable {
    public final int f46196a;
    public final s9 f46197b;

    public i9(s9 s9Var, int i3) {
        this.f46196a = i3;
        this.f46197b = s9Var;
    }

    @Override
    public final void run() {
        float f10;
        float f11 = 0.0f;
        switch (this.f46196a) {
            case 0:
                this.f46197b.d0();
                return;
            case 1:
                s9 s9Var = this.f46197b;
                if (!s9Var.isFinishing()) {
                    s9Var.S = null;
                    s9Var.O = false;
                    s9Var.f49430e0.run();
                    if (!s9Var.O) {
                        org.telegram.messenger.g0.i3(new i9(s9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                s9 s9Var2 = this.f46197b;
                CameraView cameraView = s9Var2.d;
                if (cameraView != null) {
                    s9Var2.h0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f46197b.finishFragment();
                return;
            case 4:
                s9 s9Var3 = this.f46197b;
                r9 r9Var = s9Var3.N;
                if (r9Var != null) {
                    r9Var.M(s9Var3.S);
                }
                s9Var3.finishFragment();
                return;
            case 5:
                s9 s9Var4 = this.f46197b;
                s9Var4.V = new c6.i(9);
                Context context = org.telegram.messenger.t0.f25457b;
                ?? obj = new Object();
                obj.f7715a = 256;
                s9Var4.W = new t8.n(new com.google.android.gms.internal.vision.t2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                s9 s9Var5 = this.f46197b;
                if (s9Var5.h.getTag() != null) {
                    s9Var5.h.setTag(null);
                    s9Var5.h.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.xq.f40452f).start();
                    return;
                }
                return;
            case 7:
                s9 s9Var6 = this.f46197b;
                CameraView cameraView2 = s9Var6.d;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(s9Var6.d.getCameraSession());
                }
                org.telegram.messenger.g0.h3(new i9(s9Var6, 4));
                return;
            default:
                s9 s9Var7 = this.f46197b;
                float f12 = s9Var7.Z;
                if (s9Var7.O) {
                    f11 = 1.0f;
                }
                s9Var7.f49423a0 = f11;
                if (f12 != f11) {
                    ValueAnimator valueAnimator = s9Var7.Y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(s9Var7.Z, s9Var7.f49423a0);
                    s9Var7.Y = ofFloat;
                    ofFloat.addUpdateListener(new l9(s9Var7, 0));
                    s9Var7.Y.setDuration(Math.abs(s9Var7.Z - s9Var7.f49423a0) * 300.0f);
                    s9Var7.Y.setInterpolator(org.telegram.ui.Components.xq.f40452f);
                    s9Var7.Y.start();
                    q1.g gVar = s9Var7.f49425b0;
                    if (gVar != null) {
                        gVar.d();
                    }
                    if (s9Var7.O) {
                        f10 = s9Var7.f49427c0;
                    } else {
                        f10 = 1.0f - s9Var7.f49427c0;
                    }
                    q1.g gVar2 = new q1.g(new q1.f(f10 * 500.0f));
                    s9Var7.f49425b0 = gVar2;
                    gVar2.b(new j9(s9Var7, 1));
                    s9Var7.f49425b0.f53653m = new q1.h(500.0f);
                    s9Var7.f49425b0.f53653m.a(1.0f);
                    s9Var7.f49425b0.f53653m.b(500.0f);
                    s9Var7.f49425b0.h();
                    return;
                }
                return;
        }
    }
}
