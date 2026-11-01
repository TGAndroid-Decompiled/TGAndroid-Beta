package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class k40 extends AnimatorListenerAdapter {
    public final int f38647a;
    public final float f38648b;
    public final Runnable f38649c;
    public final Object d;

    public k40(Object obj, float f7, Runnable runnable, int i10) {
        this.f38647a = i10;
        this.d = obj;
        this.f38648b = f7;
        this.f38649c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f38647a;
        Runnable runnable = this.f38649c;
        float f7 = this.f38648b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                l40 l40Var = (l40) obj;
                l40Var.h = f7;
                l40Var.f39072a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.f33578p6 = null;
                photoViewer.f33492f6 = 0.0f;
                photoViewer.f33455b6 = 0.0f;
                photoViewer.f33500g6 = 0.0f;
                float u22 = photoViewer.u2(false);
                photoViewer.f33483e6 = u22;
                photoViewer.f33445a6 = u22;
                photoViewer.f33477e0.invalidate();
                CropAreaView cropAreaView = photoViewer.C1.f24715b.f6583a;
                float u23 = photoViewer.u2(false);
                cropAreaView.f23969n0 = 0.0f;
                cropAreaView.f23970o0 = u23;
                cropAreaView.f23971p0 = 0.0f;
                cropAreaView.f23972q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f24716c.setRotated(false);
                if (Math.abs(f7) > 0.0f) {
                    org.telegram.ui.Components.be0 be0Var = photoViewer.C1;
                    eg.f fVar = be0Var.f24716c;
                    if (fVar != null) {
                        fVar.b(0.0f);
                        fVar.setRotated(false);
                    }
                    if (be0Var.f24715b.m(f7)) {
                        org.telegram.ui.ActionBar.a7.t(photoViewer.f33450b1, org.telegram.ui.ActionBar.t6.f21126ng, photoViewer.f33629v2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f33450b1.setColorFilter((ColorFilter) null);
                    }
                }
                org.telegram.messenger.ze zeVar = photoViewer.X4.f43155c;
                if (zeVar != null) {
                    zeVar.f19693b = 0.0f;
                    zeVar.f19692a = 0.0f;
                    zeVar.f19695f = 1.0f;
                    zeVar.e = 1.0f;
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
                d1Var.f48883n = f7;
                d1Var.invalidate();
                if (animator == d1Var.f48884r && runnable != null) {
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
                o8Var.f51672r.invalidate();
                o8Var.f51659n.invalidate();
                runnable.run();
                o8Var.P.e();
                org.telegram.messenger.at.e().k(99, 512);
                org.telegram.messenger.at.e().o();
                o8Var.n();
                Runnable runnable2 = o8Var.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    o8Var.Q = null;
                }
                o8Var.f51672r.invalidate();
                o8Var.f51643h0.invalidate();
                return;
        }
    }
}
