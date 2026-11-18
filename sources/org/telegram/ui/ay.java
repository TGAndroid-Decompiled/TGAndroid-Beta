package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ay extends AnimatorListenerAdapter {
    public final int f45691a;
    public final Object f45692b;

    public ay(Object obj, int i7) {
        this.f45691a = i7;
        this.f45692b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f45691a) {
            case 5:
                ((pc0) this.f45692b).f50810s = null;
                return;
            case 11:
                ((PhotoViewer) ((org.telegram.ui.Components.h60) this.f45692b).f35759c).B2 = null;
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
        int i7 = this.f45691a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f45692b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.a80 a80Var = (org.telegram.ui.Components.a80) obj;
                FrameLayout frameLayout = a80Var.f33263b;
                hi.m5 m5Var = (hi.m5) a80Var.f33264c;
                if (m5Var.getParent() != null) {
                    frameLayout.removeView(m5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((d7) a80Var.d);
                return;
            case 1:
                f40 f40Var = ((h30) obj).f48137o;
                f40 f40Var2 = f40.C5;
                f40Var.e1();
                f40Var.f30190b.invalidate();
                f40Var.L1.invalidate();
                if (f40Var.f47450n2) {
                    f40Var.f47450n2 = false;
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
                f40Var3.f30190b.invalidate();
                f40.Q0(f40Var3);
                t30Var.H.clear();
                t30Var.I.clear();
                return;
            case 3:
                z50 z50Var = (z50) obj;
                z50Var.f54392a = null;
                z50Var.f54393b = false;
                return;
            case 4:
                qa0 qa0Var = (qa0) obj;
                qa0Var.E = false;
                qa0Var.y0();
                return;
            case 5:
                pc0 pc0Var = (pc0) obj;
                if (pc0Var.f50810s != null && pc0Var.f50808n != null) {
                    pc0Var.f50809r.setVisibility(4);
                    pc0Var.f50810s = null;
                    return;
                }
                return;
            case 6:
                ((og0) obj).U.setVisibility(8);
                return;
            case 7:
                hh0 hh0Var = (hh0) obj;
                hh0Var.f48357f = 1.0f;
                hh0Var.invalidate();
                return;
            case 8:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.f43119e)) {
                    notificationsCustomSettingsActivity.f43119e = null;
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
                lm0Var.f49592a0 = null;
                super.onAnimationEnd(animator);
                return;
            case 10:
                en0 en0Var = (en0) obj;
                fn0 fn0Var = en0Var.f47273n0;
                org.telegram.ui.ActionBar.z4[] z4VarArr = fn0Var.f47728n;
                fn0Var.f47729r = null;
                if (fn0Var.f47732x) {
                    z4VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.z4 z4Var = z4VarArr[0];
                    z4VarArr[0] = z4VarArr[1];
                    z4VarArr[1] = z4Var;
                    z4Var.setVisibility(8);
                    if (fn0Var.f47728n[0].f30317b == fn0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fn0Var.f47726e = z10;
                    fn0Var.h.i(1.0f, fn0Var.f47728n[0].f30317b);
                }
                fn0Var.f47730s = false;
                en0Var.f47269i0 = false;
                en0Var.f47268h0 = false;
                fn0.h0(fn0Var).setEnabled(true);
                fn0Var.h.setEnabled(true);
                return;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.h60) obj).f35759c;
                if (photoViewer.B2 != null) {
                    if0 if0Var = new if0(this, 21);
                    photoViewer.I2 = if0Var;
                    org.telegram.messenger.g0.h3(if0Var, 860L);
                    return;
                }
                return;
            case 12:
                rp0 rp0Var = (rp0) obj;
                PhotoViewer photoViewer2 = rp0Var.f51715b;
                og.o oVar = photoViewer2.D1.f38763b;
                oVar.q();
                CropAreaView cropAreaView = oVar.f21893a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.D1.f38763b.K = true;
                photoViewer2.f43298p6 = null;
                photoViewer2.f43341u4 = rp0Var.f51714a;
                hi.p3 p3Var = photoViewer2.b1().M;
                if (photoViewer2.f43341u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                p3Var.b(z11);
                hi.p3 p3Var2 = photoViewer2.L1;
                if (p3Var2 != null) {
                    if (photoViewer2.f43341u4 != 3) {
                        z13 = true;
                    }
                    p3Var2.b(z13);
                }
                if (photoViewer2.f43341u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f43289o6 = -1;
                photoViewer2.f43204e6 = 1.0f;
                photoViewer2.f43166a6 = 1.0f;
                photoViewer2.f43186c6 = 0.0f;
                photoViewer2.f43194d6 = 0.0f;
                photoViewer2.u3(1.0f);
                photoViewer2.f43339u2 = true;
                photoViewer2.f43208f0.invalidate();
                return;
            case 13:
                sp0 sp0Var = (sp0) obj;
                PhotoViewer photoViewer3 = sp0Var.f52049b;
                photoViewer3.J1.f34398j0.setVisibility(0);
                photoViewer3.f43298p6 = null;
                photoViewer3.f43341u4 = sp0Var.f52048a;
                hi.p3 p3Var3 = photoViewer3.b1().M;
                if (photoViewer3.f43341u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                p3Var3.b(z12);
                hi.p3 p3Var4 = photoViewer3.L1;
                if (p3Var4 != null) {
                    if (photoViewer3.f43341u4 != 3) {
                        z14 = true;
                    }
                    p3Var4.b(z14);
                }
                if (photoViewer3.f43341u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f43289o6 = -1;
                photoViewer3.f43204e6 = 1.0f;
                photoViewer3.f43166a6 = 1.0f;
                photoViewer3.f43186c6 = 0.0f;
                photoViewer3.f43194d6 = 0.0f;
                photoViewer3.u3(1.0f);
                photoViewer3.f43339u2 = true;
                photoViewer3.f43208f0.invalidate();
                return;
            case 14:
                ((PhotoViewer) ((wp0) obj).f53444r0).f43379y3[0].setTag(null);
                return;
            case 15:
                ((xp0) obj).d.U1.f49042l0 = 1.0f;
                return;
            case 16:
                PhotoViewer photoViewer4 = ((xp0) obj).d;
                photoViewer4.U1.setVisibility(4);
                photoViewer4.U1.f49042l0 = 1.0f;
                return;
            case 17:
                org.telegram.messenger.g0.g3(new if0(this, 23));
                return;
            case 18:
                op0 op0Var = (op0) obj;
                if (animator.equals(op0Var.f50607c.U7)) {
                    op0Var.f50607c.U7 = null;
                    return;
                }
                return;
            case 19:
                tq0 tq0Var = (tq0) obj;
                if (tq0Var.f52331e == animator) {
                    tq0Var.f52330c[1].setVisibility(8);
                    tq0Var.f52331e = null;
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
                ((dv0) obj).f46981b.V5 = null;
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
                ((jz0) obj).d.Z.f49042l0 = 1.0f;
                return;
            case 26:
                SecretMediaViewer secretMediaViewer = ((jz0) obj).d;
                secretMediaViewer.Z.setVisibility(4);
                secretMediaViewer.Z.f49042l0 = 1.0f;
                return;
            case 27:
                r11 r11Var = ((i01) obj).f48514e;
                r11Var.T0.H = 0.0f;
                r11Var.T0 = null;
                r11Var.f51398i0.invalidate();
                return;
            case 28:
                ch.f0.a();
                r11 r11Var2 = (r11) obj;
                p01 p01Var = r11Var2.f51398i0;
                p01 p01Var2 = r11Var2.f51398i0;
                p01Var.setLayerType(0, null);
                j01 j01Var = r11Var2.f51394g0;
                j01Var.setLayerType(0, null);
                r11Var2.f51392f0.setLayerType(0, null);
                r11Var2.f51384c0.setLayerType(0, null);
                org.telegram.ui.Components.jn jnVar = r11Var2.f51408o0;
                if (jnVar != null) {
                    jnVar.setLayerType(0, null);
                }
                View view = r11Var2.f51407n0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                j01Var.b();
                r11Var2.f51389e0.m(false);
                org.telegram.messenger.ks.e().k(99, 512);
                r11Var2.Y1.e();
                org.telegram.messenger.g0.g3(new ru0(org.telegram.messenger.ks.e(), 15));
                r11Var2.h();
                r11Var2.E(1.0f);
                for (int i10 = 0; i10 < p01Var2.getChildCount(); i10++) {
                    View childAt = p01Var2.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i11 = 0; i11 < r11Var2.f51389e0.f36144b.getChildCount(); i11++) {
                    View childAt2 = r11Var2.f51389e0.f36144b.getChildAt(i11);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                r11Var2.f51389e0.f36144b.invalidate();
                r11Var2.f51404l0.invalidate();
                p01Var2.invalidate();
                return;
            default:
                ((c51) obj).f46399b0.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f45691a) {
            case 12:
                rp0 rp0Var = (rp0) this.f45692b;
                rp0Var.f51715b.V0.setVisibility(0);
                rp0Var.f51715b.D1.setVisibility(0);
                return;
            case 13:
                return;
            case 23:
                ((mw0) this.f45692b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
