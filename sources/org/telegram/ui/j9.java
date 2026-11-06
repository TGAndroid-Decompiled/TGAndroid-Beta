package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class j9 implements Runnable {
    public final int f46881a;
    public final s9 f46882b;

    public j9(s9 s9Var, int i7) {
        this.f46881a = i7;
        this.f46882b = s9Var;
    }

    @Override
    public final void run() {
        float f10;
        float f11 = 0.0f;
        switch (this.f46881a) {
            case 0:
                this.f46882b.d0();
                return;
            case 1:
                s9 s9Var = this.f46882b;
                if (!s9Var.isFinishing()) {
                    s9Var.R = null;
                    s9Var.N = false;
                    s9Var.f49671d0.run();
                    if (!s9Var.N) {
                        org.telegram.messenger.g0.i3(new j9(s9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                s9 s9Var2 = this.f46882b;
                CameraView cameraView = s9Var2.d;
                if (cameraView != null) {
                    s9Var2.h0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f46882b.finishFragment();
                return;
            case 4:
                s9 s9Var3 = this.f46882b;
                r9 r9Var = s9Var3.M;
                if (r9Var != null) {
                    r9Var.M(s9Var3.R);
                }
                s9Var3.finishFragment();
                return;
            case 5:
                s9 s9Var4 = this.f46882b;
                s9Var4.U = new aa.n(20);
                Context context = org.telegram.messenger.t0.f25555b;
                ?? obj = new Object();
                obj.f7660a = 256;
                s9Var4.V = new u8.n(new com.google.android.gms.internal.vision.t2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                s9 s9Var5 = this.f46882b;
                if (s9Var5.h.getTag() != null) {
                    s9Var5.h.setTag(null);
                    s9Var5.h.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.xq.f40310f).start();
                    return;
                }
                return;
            case 7:
                s9 s9Var6 = this.f46882b;
                CameraView cameraView2 = s9Var6.d;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(s9Var6.d.getCameraSession());
                }
                org.telegram.messenger.g0.h3(new j9(s9Var6, 4));
                return;
            default:
                s9 s9Var7 = this.f46882b;
                float f12 = s9Var7.Y;
                if (s9Var7.N) {
                    f11 = 1.0f;
                }
                s9Var7.Z = f11;
                if (f12 != f11) {
                    ValueAnimator valueAnimator = s9Var7.X;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(s9Var7.Y, s9Var7.Z);
                    s9Var7.X = ofFloat;
                    ofFloat.addUpdateListener(new m9(s9Var7, 0));
                    s9Var7.X.setDuration(Math.abs(s9Var7.Y - s9Var7.Z) * 300.0f);
                    s9Var7.X.setInterpolator(org.telegram.ui.Components.xq.f40310f);
                    s9Var7.X.start();
                    r1.g gVar = s9Var7.f49666a0;
                    if (gVar != null) {
                        gVar.d();
                    }
                    if (s9Var7.N) {
                        f10 = s9Var7.f49668b0;
                    } else {
                        f10 = 1.0f - s9Var7.f49668b0;
                    }
                    r1.g gVar2 = new r1.g(new r1.f(f10 * 500.0f));
                    s9Var7.f49666a0 = gVar2;
                    gVar2.b(new k9(s9Var7, 1));
                    s9Var7.f49666a0.f54150m = new r1.h(500.0f);
                    s9Var7.f49666a0.f54150m.a(1.0f);
                    s9Var7.f49666a0.f54150m.b(500.0f);
                    s9Var7.f49666a0.h();
                    return;
                }
                return;
        }
    }
}
