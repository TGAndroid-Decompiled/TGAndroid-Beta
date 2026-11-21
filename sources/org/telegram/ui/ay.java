package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ay extends AnimatorListenerAdapter {
    public final int f45727a;
    public final Object f45728b;

    public ay(Object obj, int i7) {
        this.f45727a = i7;
        this.f45728b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f45727a) {
            case 5:
                ((pc0) this.f45728b).f50851s = null;
                return;
            case 11:
                ((PhotoViewer) ((org.telegram.ui.Components.h10) this.f45728b).f35724c).B2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i7 = this.f45727a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f45728b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.c80 c80Var = (org.telegram.ui.Components.c80) obj;
                FrameLayout frameLayout = c80Var.f34119b;
                hi.l5 l5Var = (hi.l5) c80Var.f34120c;
                if (l5Var.getParent() != null) {
                    frameLayout.removeView(l5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((d7) c80Var.d);
                return;
            case 1:
                f40 f40Var = ((h30) obj).f48212o;
                f40 f40Var2 = f40.C5;
                f40Var.e1();
                f40Var.f30173b.invalidate();
                f40Var.L1.invalidate();
                if (f40Var.f47518n2) {
                    f40Var.f47518n2 = false;
                    f40Var.R0(true);
                    return;
                }
                return;
            case 2:
                super.onAnimationEnd(animator);
                t30 t30Var = (t30) obj;
                t30Var.G = null;
                f40 f40Var3 = t30Var.L;
                f40Var3.L1.invalidate();
                f40Var3.Z3.invalidate();
                f40Var3.f30173b.invalidate();
                f40.Q0(f40Var3);
                t30Var.H.clear();
                t30Var.I.clear();
                return;
            case 3:
                z50 z50Var = (z50) obj;
                z50Var.f54436a = null;
                z50Var.f54437b = false;
                return;
            case 4:
                qa0 qa0Var = (qa0) obj;
                qa0Var.E = false;
                qa0Var.y0();
                return;
            case 5:
                pc0 pc0Var = (pc0) obj;
                if (pc0Var.f50851s != null && pc0Var.f50849n != null) {
                    pc0Var.f50850r.setVisibility(4);
                    pc0Var.f50851s = null;
                    return;
                }
                return;
            case 6:
                ((og0) obj).U.setVisibility(8);
                return;
            case 7:
                hh0 hh0Var = (hh0) obj;
                hh0Var.f48400f = 1.0f;
                hh0Var.invalidate();
                return;
            case 8:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.f43160e)) {
                    notificationsCustomSettingsActivity.f43160e = null;
                    return;
                }
                return;
            case 9:
                lm0 lm0Var = (lm0) obj;
                bc bcVar = lm0Var.Y;
                if (bcVar != null) {
                    if (bcVar.getParent() != null) {
                        ((ViewGroup) lm0Var.Y.getParent()).removeView(lm0Var.Y);
                    }
                    lm0Var.Y = null;
                }
                lm0Var.f49643a0 = null;
                super.onAnimationEnd(animator);
                return;
            case 10:
                en0 en0Var = (en0) obj;
                fn0 fn0Var = en0Var.f47342n0;
                org.telegram.ui.ActionBar.y4[] y4VarArr = fn0Var.f47795n;
                fn0Var.f47796r = null;
                if (fn0Var.f47799x) {
                    y4VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.y4 y4Var = y4VarArr[0];
                    y4VarArr[0] = y4VarArr[1];
                    y4VarArr[1] = y4Var;
                    y4Var.setVisibility(8);
                    if (fn0Var.f47795n[0].f30300b == fn0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fn0Var.f47793e = z10;
                    fn0Var.h.i(1.0f, fn0Var.f47795n[0].f30300b);
                }
                fn0Var.f47797s = false;
                en0Var.f47338i0 = false;
                en0Var.f47337h0 = false;
                fn0.h0(fn0Var).setEnabled(true);
                fn0Var.h.setEnabled(true);
                return;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.h10) obj).f35724c;
                if (photoViewer.B2 != null) {
                    hf0 hf0Var = new hf0(this, 21);
                    photoViewer.I2 = hf0Var;
                    org.telegram.messenger.g0.h3(hf0Var, 860L);
                    return;
                }
                return;
            case 12:
                rp0 rp0Var = (rp0) obj;
                PhotoViewer photoViewer2 = rp0Var.f51690b;
                og.o oVar = photoViewer2.D1.f39154b;
                oVar.q();
                CropAreaView cropAreaView = oVar.f21918a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.D1.f39154b.K = true;
                photoViewer2.f43339p6 = null;
                photoViewer2.f43382u4 = rp0Var.f51689a;
                hi.o3 o3Var = photoViewer2.b1().M;
                if (photoViewer2.f43382u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                o3Var.b(z11);
                hi.o3 o3Var2 = photoViewer2.L1;
                if (o3Var2 != null) {
                    if (photoViewer2.f43382u4 != 3) {
                        z13 = true;
                    }
                    o3Var2.b(z13);
                }
                if (photoViewer2.f43382u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f43330o6 = -1;
                photoViewer2.f43245e6 = 1.0f;
                photoViewer2.f43207a6 = 1.0f;
                photoViewer2.f43227c6 = 0.0f;
                photoViewer2.f43235d6 = 0.0f;
                photoViewer2.u3(1.0f);
                photoViewer2.f43380u2 = true;
                photoViewer2.f43249f0.invalidate();
                return;
            case 13:
                sp0 sp0Var = (sp0) obj;
                PhotoViewer photoViewer3 = sp0Var.f52094b;
                photoViewer3.J1.f34759j0.setVisibility(0);
                photoViewer3.f43339p6 = null;
                photoViewer3.f43382u4 = sp0Var.f52093a;
                hi.o3 o3Var3 = photoViewer3.b1().M;
                if (photoViewer3.f43382u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                o3Var3.b(z12);
                hi.o3 o3Var4 = photoViewer3.L1;
                if (o3Var4 != null) {
                    if (photoViewer3.f43382u4 != 3) {
                        z14 = true;
                    }
                    o3Var4.b(z14);
                }
                if (photoViewer3.f43382u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f43330o6 = -1;
                photoViewer3.f43245e6 = 1.0f;
                photoViewer3.f43207a6 = 1.0f;
                photoViewer3.f43227c6 = 0.0f;
                photoViewer3.f43235d6 = 0.0f;
                photoViewer3.u3(1.0f);
                photoViewer3.f43380u2 = true;
                photoViewer3.f43249f0.invalidate();
                return;
            case 14:
                ((PhotoViewer) ((wp0) obj).f53490r0).f43420y3[0].setTag(null);
                return;
            case 15:
                ((xp0) obj).d.U1.f49075l0 = 1.0f;
                return;
            case 16:
                PhotoViewer photoViewer4 = ((xp0) obj).d;
                photoViewer4.U1.setVisibility(4);
                photoViewer4.U1.f49075l0 = 1.0f;
                return;
            case 17:
                org.telegram.messenger.g0.g3(new hf0(this, 23));
                return;
            case 18:
                op0 op0Var = (op0) obj;
                if (animator.equals(op0Var.f50640c.U7)) {
                    op0Var.f50640c.U7 = null;
                    return;
                }
                return;
            case 19:
                tq0 tq0Var = (tq0) obj;
                if (tq0Var.f52377e == animator) {
                    tq0Var.f52376c[1].setVisibility(8);
                    tq0Var.f52377e = null;
                    return;
                }
                return;
            case 20:
                fr0 fr0Var = (fr0) obj;
                if (fr0Var.C != null) {
                    fr0Var.C = null;
                    fr0Var.b();
                    return;
                }
                return;
            case 21:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Z;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Z = null;
                    return;
                }
                return;
            case 22:
                ((dv0) obj).f47047b.V5 = null;
                return;
            case 23:
                mw0 mw0Var = (mw0) obj;
                if (!mw0Var.F) {
                    mw0Var.setVisibility(8);
                    return;
                }
                return;
            case 24:
                jx0 jx0Var = (jx0) obj;
                if (animator.equals(jx0Var.d)) {
                    jx0Var.d = null;
                    return;
                }
                return;
            case 25:
                ((jz0) obj).d.Z.f49075l0 = 1.0f;
                return;
            case 26:
                SecretMediaViewer secretMediaViewer = ((jz0) obj).d;
                secretMediaViewer.Z.setVisibility(4);
                secretMediaViewer.Z.f49075l0 = 1.0f;
                return;
            case 27:
                s11 s11Var = ((j01) obj).f48857e;
                s11Var.T0.H = 0.0f;
                s11Var.T0 = null;
                s11Var.f51840i0.invalidate();
                return;
            case 28:
                ch.f0.a();
                s11 s11Var2 = (s11) obj;
                q01 q01Var = s11Var2.f51840i0;
                q01 q01Var2 = s11Var2.f51840i0;
                q01Var.setLayerType(0, null);
                k01 k01Var = s11Var2.f51836g0;
                k01Var.setLayerType(0, null);
                s11Var2.f51834f0.setLayerType(0, null);
                s11Var2.f51826c0.setLayerType(0, null);
                org.telegram.ui.Components.ln lnVar = s11Var2.f51850o0;
                if (lnVar != null) {
                    lnVar.setLayerType(0, null);
                }
                View view = s11Var2.f51849n0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                k01Var.b();
                s11Var2.f51831e0.m(false);
                org.telegram.messenger.ks.e().k(99, 512);
                s11Var2.Y1.e();
                org.telegram.messenger.g0.g3(new ru0(org.telegram.messenger.ks.e(), 15));
                s11Var2.h();
                s11Var2.E(1.0f);
                for (int i10 = 0; i10 < q01Var2.getChildCount(); i10++) {
                    View childAt = q01Var2.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i11 = 0; i11 < s11Var2.f51831e0.f36926b.getChildCount(); i11++) {
                    View childAt2 = s11Var2.f51831e0.f36926b.getChildAt(i11);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                s11Var2.f51831e0.f36926b.invalidate();
                s11Var2.f51846l0.invalidate();
                q01Var2.invalidate();
                return;
            default:
                ((c51) obj).f46431b0.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f45727a) {
            case 12:
                rp0 rp0Var = (rp0) this.f45728b;
                rp0Var.f51690b.V0.setVisibility(0);
                rp0Var.f51690b.D1.setVisibility(0);
                return;
            case 13:
                return;
            case 23:
                ((mw0) this.f45728b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
