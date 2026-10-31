package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class l40 extends AnimatorListenerAdapter {
    public final int f39051a;
    public final float f39052b;
    public final Runnable f39053c;
    public final Object d;

    public l40(Object obj, float f7, Runnable runnable, int i10) {
        this.f39051a = i10;
        this.d = obj;
        this.f39052b = f7;
        this.f39053c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f39051a;
        Runnable runnable = this.f39053c;
        float f7 = this.f39052b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                m40 m40Var = (m40) obj;
                m40Var.h = f7;
                m40Var.f39468a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.f33571p6 = null;
                photoViewer.f33485f6 = 0.0f;
                photoViewer.f33448b6 = 0.0f;
                photoViewer.f33493g6 = 0.0f;
                float u22 = photoViewer.u2(false);
                photoViewer.f33476e6 = u22;
                photoViewer.f33438a6 = u22;
                photoViewer.f33470e0.invalidate();
                CropAreaView cropAreaView = photoViewer.C1.f24615b.f6583a;
                float u23 = photoViewer.u2(false);
                cropAreaView.f23968n0 = 0.0f;
                cropAreaView.f23969o0 = u23;
                cropAreaView.f23970p0 = 0.0f;
                cropAreaView.f23971q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f24616c.setRotated(false);
                if (Math.abs(f7) > 0.0f) {
                    org.telegram.ui.Components.be0 be0Var = photoViewer.C1;
                    eg.f fVar = be0Var.f24616c;
                    if (fVar != null) {
                        fVar.b(0.0f);
                        fVar.setRotated(false);
                    }
                    if (be0Var.f24615b.m(f7)) {
                        org.telegram.ui.ActionBar.a7.t(photoViewer.f33443b1, org.telegram.ui.ActionBar.t6.f21125ng, photoViewer.f33622v2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f33443b1.setColorFilter((ColorFilter) null);
                    }
                }
                org.telegram.messenger.ye yeVar = photoViewer.X4.f43638c;
                if (yeVar != null) {
                    yeVar.f19365b = 0.0f;
                    yeVar.f19364a = 0.0f;
                    yeVar.f19367f = 1.0f;
                    yeVar.e = 1.0f;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                rh.i4 i4Var = (rh.i4) obj;
                i4Var.D = f7;
                i4Var.invalidate();
                if (animator == i4Var.E && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                th.d1 d1Var = (th.d1) obj;
                d1Var.f48869n = f7;
                d1Var.invalidate();
                if (animator == d1Var.f48870r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                vh.z1 z1Var = (vh.z1) obj;
                z1Var.h = f7;
                z1Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                vh.o8 o8Var = (vh.o8) obj;
                o8Var.L = null;
                o8Var.I = f7;
                o8Var.j();
                o8Var.f51657r.invalidate();
                o8Var.f51644n.invalidate();
                runnable.run();
                o8Var.P.e();
                org.telegram.messenger.zs.e().k(99, 512);
                org.telegram.messenger.zs.e().o();
                o8Var.n();
                Runnable runnable2 = o8Var.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    o8Var.Q = null;
                }
                o8Var.f51657r.invalidate();
                o8Var.f51628h0.invalidate();
                return;
        }
    }
}
