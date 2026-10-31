package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class k9 implements Runnable {
    public final int f38723a;
    public final u9 f38724b;

    public k9(u9 u9Var, int i10) {
        this.f38723a = i10;
        this.f38724b = u9Var;
    }

    @Override
    public final void run() {
        float f7;
        float f10 = 0.0f;
        switch (this.f38723a) {
            case 0:
                this.f38724b.c0();
                return;
            case 1:
                u9 u9Var = this.f38724b;
                if (!u9Var.isFinishing()) {
                    u9Var.R = null;
                    u9Var.N = false;
                    u9Var.f42083d0.run();
                    if (!u9Var.N) {
                        org.telegram.messenger.i0.h3(new k9(u9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                u9 u9Var2 = this.f38724b;
                CameraView cameraView = u9Var2.d;
                if (cameraView != null) {
                    u9Var2.g0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f38724b.finishFragment();
                return;
            case 4:
                u9 u9Var3 = this.f38724b;
                t9 t9Var = u9Var3.M;
                if (t9Var != null) {
                    t9Var.L(u9Var3.R);
                }
                u9Var3.finishFragment();
                return;
            case 5:
                u9 u9Var4 = this.f38724b;
                u9Var4.U = new vh.w3();
                Context context = org.telegram.messenger.w0.f19025b;
                ?? obj = new Object();
                obj.f5383a = 256;
                u9Var4.V = new r8.n(new com.google.android.gms.internal.vision.t2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                u9 u9Var5 = this.f38724b;
                if (u9Var5.h.getTag() != null) {
                    u9Var5.h.setTag(null);
                    u9Var5.h.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.gr.f26495f).start();
                    return;
                }
                return;
            case 7:
                u9 u9Var6 = this.f38724b;
                CameraView cameraView2 = u9Var6.d;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(u9Var6.d.getCameraSession());
                }
                org.telegram.messenger.i0.g3(new k9(u9Var6, 4));
                return;
            default:
                u9 u9Var7 = this.f38724b;
                float f11 = u9Var7.Y;
                if (u9Var7.N) {
                    f10 = 1.0f;
                }
                u9Var7.Z = f10;
                if (f11 != f10) {
                    ValueAnimator valueAnimator = u9Var7.X;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(u9Var7.Y, u9Var7.Z);
                    u9Var7.X = ofFloat;
                    ofFloat.addUpdateListener(new n9(u9Var7, 0));
                    u9Var7.X.setDuration(Math.abs(u9Var7.Y - u9Var7.Z) * 300.0f);
                    u9Var7.X.setInterpolator(org.telegram.ui.Components.gr.f26495f);
                    u9Var7.X.start();
                    o1.j jVar = u9Var7.f42078a0;
                    if (jVar != null) {
                        jVar.d();
                    }
                    if (u9Var7.N) {
                        f7 = u9Var7.f42080b0;
                    } else {
                        f7 = 1.0f - u9Var7.f42080b0;
                    }
                    o1.j jVar2 = new o1.j(new o1.i(f7 * 500.0f));
                    u9Var7.f42078a0 = jVar2;
                    jVar2.b(new l9(u9Var7, 1));
                    u9Var7.f42078a0.f13957m = new o1.k(500.0f);
                    u9Var7.f42078a0.f13957m.a(1.0f);
                    u9Var7.f42078a0.f13957m.b(500.0f);
                    u9Var7.f42078a0.h();
                    return;
                }
                return;
        }
    }
}
