package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ay extends AnimatorListenerAdapter {
    public final int f45675a;
    public final Object f45676b;

    public ay(Object obj, int i7) {
        this.f45675a = i7;
        this.f45676b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f45675a) {
            case 5:
                ((pc0) this.f45676b).f50828s = null;
                return;
            case 11:
                ((PhotoViewer) ((org.telegram.ui.Components.h10) this.f45676b).f35696c).B2 = null;
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
        int i7 = this.f45675a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f45676b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.c80 c80Var = (org.telegram.ui.Components.c80) obj;
                FrameLayout frameLayout = c80Var.f34077b;
                hi.m5 m5Var = (hi.m5) c80Var.f34078c;
                if (m5Var.getParent() != null) {
                    frameLayout.removeView(m5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((d7) c80Var.d);
                return;
            case 1:
                f40 f40Var = ((h30) obj).f48180o;
                f40 f40Var2 = f40.C5;
                f40Var.e1();
                f40Var.f30142b.invalidate();
                f40Var.L1.invalidate();
                if (f40Var.f47484n2) {
                    f40Var.f47484n2 = false;
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
                f40Var3.f30142b.invalidate();
                f40.Q0(f40Var3);
                t30Var.H.clear();
                t30Var.I.clear();
                return;
            case 3:
                z50 z50Var = (z50) obj;
                z50Var.f54403a = null;
                z50Var.f54404b = false;
                return;
            case 4:
                qa0 qa0Var = (qa0) obj;
                qa0Var.E = false;
                qa0Var.y0();
                return;
            case 5:
                pc0 pc0Var = (pc0) obj;
                if (pc0Var.f50828s != null && pc0Var.f50826n != null) {
                    pc0Var.f50827r.setVisibility(4);
                    pc0Var.f50828s = null;
                    return;
                }
                return;
            case 6:
                ((og0) obj).U.setVisibility(8);
                return;
            case 7:
                hh0 hh0Var = (hh0) obj;
                hh0Var.f48368f = 1.0f;
                hh0Var.invalidate();
                return;
            case 8:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.f43129e)) {
                    notificationsCustomSettingsActivity.f43129e = null;
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
                lm0Var.f49624a0 = null;
                super.onAnimationEnd(animator);
                return;
            case 10:
                en0 en0Var = (en0) obj;
                fn0 fn0Var = en0Var.f47315n0;
                org.telegram.ui.ActionBar.y4[] y4VarArr = fn0Var.f47767n;
                fn0Var.f47768r = null;
                if (fn0Var.f47771x) {
                    y4VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.y4 y4Var = y4VarArr[0];
                    y4VarArr[0] = y4VarArr[1];
                    y4VarArr[1] = y4Var;
                    y4Var.setVisibility(8);
                    if (fn0Var.f47767n[0].f30269b == fn0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fn0Var.f47765e = z10;
                    fn0Var.h.i(1.0f, fn0Var.f47767n[0].f30269b);
                }
                fn0Var.f47769s = false;
                en0Var.f47311i0 = false;
                en0Var.f47310h0 = false;
                fn0.h0(fn0Var).setEnabled(true);
                fn0Var.h.setEnabled(true);
                return;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.h10) obj).f35696c;
                if (photoViewer.B2 != null) {
                    hf0 hf0Var = new hf0(this, 21);
                    photoViewer.I2 = hf0Var;
                    org.telegram.messenger.g0.h3(hf0Var, 860L);
                    return;
                }
                return;
            case 12:
                sp0 sp0Var = (sp0) obj;
                PhotoViewer photoViewer2 = sp0Var.f52070b;
                og.o oVar = photoViewer2.D1.f39118b;
                oVar.q();
                CropAreaView cropAreaView = oVar.f21887a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.D1.f39118b.K = true;
                photoViewer2.f43308p6 = null;
                photoViewer2.f43351u4 = sp0Var.f52069a;
                hi.o3 o3Var = photoViewer2.b1().M;
                if (photoViewer2.f43351u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                o3Var.b(z11);
                hi.o3 o3Var2 = photoViewer2.L1;
                if (o3Var2 != null) {
                    if (photoViewer2.f43351u4 != 3) {
                        z13 = true;
                    }
                    o3Var2.b(z13);
                }
                if (photoViewer2.f43351u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f43299o6 = -1;
                photoViewer2.f43214e6 = 1.0f;
                photoViewer2.f43176a6 = 1.0f;
                photoViewer2.f43196c6 = 0.0f;
                photoViewer2.f43204d6 = 0.0f;
                photoViewer2.u3(1.0f);
                photoViewer2.f43349u2 = true;
                photoViewer2.f43218f0.invalidate();
                return;
            case 13:
                tp0 tp0Var = (tp0) obj;
                PhotoViewer photoViewer3 = tp0Var.f52317b;
                photoViewer3.J1.f34747j0.setVisibility(0);
                photoViewer3.f43308p6 = null;
                photoViewer3.f43351u4 = tp0Var.f52316a;
                hi.o3 o3Var3 = photoViewer3.b1().M;
                if (photoViewer3.f43351u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                o3Var3.b(z12);
                hi.o3 o3Var4 = photoViewer3.L1;
                if (o3Var4 != null) {
                    if (photoViewer3.f43351u4 != 3) {
                        z14 = true;
                    }
                    o3Var4.b(z14);
                }
                if (photoViewer3.f43351u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f43299o6 = -1;
                photoViewer3.f43214e6 = 1.0f;
                photoViewer3.f43176a6 = 1.0f;
                photoViewer3.f43196c6 = 0.0f;
                photoViewer3.f43204d6 = 0.0f;
                photoViewer3.u3(1.0f);
                photoViewer3.f43349u2 = true;
                photoViewer3.f43218f0.invalidate();
                return;
            case 14:
                ((PhotoViewer) ((xp0) obj).f53886r0).f43389y3[0].setTag(null);
                return;
            case 15:
                ((yp0) obj).d.U1.f49340l0 = 1.0f;
                return;
            case 16:
                PhotoViewer photoViewer4 = ((yp0) obj).d;
                photoViewer4.U1.setVisibility(4);
                photoViewer4.U1.f49340l0 = 1.0f;
                return;
            case 17:
                org.telegram.messenger.g0.g3(new hf0(this, 23));
                return;
            case 18:
                pp0 pp0Var = (pp0) obj;
                if (animator.equals(pp0Var.f50900c.U7)) {
                    pp0Var.f50900c.U7 = null;
                    return;
                }
                return;
            case 19:
                uq0 uq0Var = (uq0) obj;
                if (uq0Var.f52620e == animator) {
                    uq0Var.f52619c[1].setVisibility(8);
                    uq0Var.f52620e = null;
                    return;
                }
                return;
            case 20:
                gr0 gr0Var = (gr0) obj;
                if (gr0Var.C != null) {
                    gr0Var.C = null;
                    gr0Var.b();
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
                ((ev0) obj).f47355b.V5 = null;
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
                ((jz0) obj).d.Z.f49340l0 = 1.0f;
                return;
            case 26:
                SecretMediaViewer secretMediaViewer = ((jz0) obj).d;
                secretMediaViewer.Z.setVisibility(4);
                secretMediaViewer.Z.f49340l0 = 1.0f;
                return;
            case 27:
                r11 r11Var = ((i01) obj).f48528e;
                r11Var.T0.H = 0.0f;
                r11Var.T0 = null;
                r11Var.f51422i0.invalidate();
                return;
            case 28:
                ch.f0.a();
                r11 r11Var2 = (r11) obj;
                p01 p01Var = r11Var2.f51422i0;
                p01 p01Var2 = r11Var2.f51422i0;
                p01Var.setLayerType(0, null);
                j01 j01Var = r11Var2.f51418g0;
                j01Var.setLayerType(0, null);
                r11Var2.f51416f0.setLayerType(0, null);
                r11Var2.f51408c0.setLayerType(0, null);
                org.telegram.ui.Components.ln lnVar = r11Var2.f51432o0;
                if (lnVar != null) {
                    lnVar.setLayerType(0, null);
                }
                View view = r11Var2.f51431n0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                j01Var.b();
                r11Var2.f51413e0.m(false);
                org.telegram.messenger.ls.e().k(99, 512);
                r11Var2.Y1.e();
                org.telegram.messenger.g0.g3(new su0(org.telegram.messenger.ls.e(), 15));
                r11Var2.h();
                r11Var2.E(1.0f);
                for (int i10 = 0; i10 < p01Var2.getChildCount(); i10++) {
                    View childAt = p01Var2.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i11 = 0; i11 < r11Var2.f51413e0.f36895b.getChildCount(); i11++) {
                    View childAt2 = r11Var2.f51413e0.f36895b.getChildAt(i11);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                r11Var2.f51413e0.f36895b.invalidate();
                r11Var2.f51428l0.invalidate();
                p01Var2.invalidate();
                return;
            default:
                ((c51) obj).f46418b0.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f45675a) {
            case 12:
                sp0 sp0Var = (sp0) this.f45676b;
                sp0Var.f52070b.V0.setVisibility(0);
                sp0Var.f52070b.D1.setVisibility(0);
                return;
            case 13:
                return;
            case 23:
                ((mw0) this.f45676b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
