package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
public final class j9 implements Runnable {
    public final int f38978a;
    public final u9 f38979b;

    public j9(u9 u9Var, int i10) {
        this.f38978a = i10;
        this.f38979b = u9Var;
    }

    @Override
    public final void run() {
        float f7;
        float f10 = 0.0f;
        switch (this.f38978a) {
            case 0:
                this.f38979b.Y();
                return;
            case 1:
                u9 u9Var = this.f38979b;
                if (!u9Var.isFinishing()) {
                    u9Var.R = null;
                    u9Var.N = false;
                    u9Var.f42453e0.run();
                    if (!u9Var.N) {
                        AndroidUtilities.runOnUIThread(new j9(u9Var, 8), 500L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                u9 u9Var2 = this.f38979b;
                CameraView cameraView = u9Var2.f42449c;
                if (cameraView != null) {
                    u9Var2.c0(cameraView.getTextureView().getBitmap());
                    return;
                }
                return;
            case 3:
                this.f38979b.finishFragment();
                return;
            case 4:
                u9 u9Var3 = this.f38979b;
                t9 t9Var = u9Var3.M;
                if (t9Var != null) {
                    t9Var.K(u9Var3.R);
                }
                u9Var3.finishFragment();
                return;
            case 5:
                u9 u9Var4 = this.f38979b;
                u9Var4.U = new pb.c();
                Context context = ApplicationLoader.applicationContext;
                ?? obj = new Object();
                obj.f7664a = 256;
                u9Var4.V = new r8.n(new com.google.android.gms.internal.vision.u2(context, (com.google.android.gms.internal.vision.x1) obj));
                return;
            case 6:
                u9 u9Var5 = this.f38979b;
                if (u9Var5.f42454f.getTag() != null) {
                    u9Var5.f42454f.setTag(null);
                    u9Var5.f42454f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.is.f27500f).start();
                    return;
                }
                return;
            case 7:
                u9 u9Var6 = this.f38979b;
                CameraView cameraView2 = u9Var6.f42449c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(u9Var6.f42449c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new j9(u9Var6, 4));
                return;
            default:
                u9 u9Var7 = this.f38979b;
                float f11 = u9Var7.Z;
                if (u9Var7.N) {
                    f10 = 1.0f;
                }
                u9Var7.f42446a0 = f10;
                if (f11 != f10) {
                    ValueAnimator valueAnimator = u9Var7.Y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(u9Var7.Z, u9Var7.f42446a0);
                    u9Var7.Y = ofFloat;
                    ofFloat.addUpdateListener(new m9(u9Var7, 0));
                    u9Var7.Y.setDuration(Math.abs(u9Var7.Z - u9Var7.f42446a0) * 300.0f);
                    u9Var7.Y.setInterpolator(org.telegram.ui.Components.is.f27500f);
                    u9Var7.Y.start();
                    o1.k kVar = u9Var7.f42448b0;
                    if (kVar != null) {
                        kVar.c();
                    }
                    if (u9Var7.N) {
                        f7 = u9Var7.f42450c0;
                    } else {
                        f7 = 1.0f - u9Var7.f42450c0;
                    }
                    o1.k kVar2 = new o1.k(new o1.j(f7 * 500.0f));
                    u9Var7.f42448b0 = kVar2;
                    kVar2.b(new k9(u9Var7, 1));
                    u9Var7.f42448b0.f17024u = new o1.l(500.0f);
                    u9Var7.f42448b0.f17024u.a(1.0f);
                    u9Var7.f42448b0.f17024u.b(500.0f);
                    u9Var7.f42448b0.h();
                    return;
                }
                return;
        }
    }
}
