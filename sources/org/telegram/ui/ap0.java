package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ap0 extends AnimatorListenerAdapter {
    public final int f32119a;
    public final Object f32120b;

    public ap0(Object obj, int i10) {
        this.f32119a = i10;
        this.f32120b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32119a) {
            case 2:
                ((PhotoViewer) ((org.telegram.ui.Components.cl0) this.f32120b).f23359c).A2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        org.telegram.ui.ActionBar.l lVar;
        boolean z11;
        boolean z12;
        int i10 = this.f32119a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f32120b;
        switch (i10) {
            case 0:
                wp0 wp0Var = (wp0) obj;
                mc mcVar = wp0Var.X;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) wp0Var.X.getParent()).removeView(wp0Var.X);
                    }
                    wp0Var.X = null;
                }
                wp0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 1:
                yq0 yq0Var = (yq0) obj;
                br0 br0Var = yq0Var.D0;
                zq0[] zq0VarArr = br0Var.f32423n;
                br0Var.f32424r = null;
                if (br0Var.f32426w) {
                    zq0VarArr[1].setVisibility(8);
                } else {
                    zq0 zq0Var = zq0VarArr[0];
                    zq0VarArr[0] = zq0VarArr[1];
                    zq0VarArr[1] = zq0Var;
                    zq0Var.setVisibility(8);
                    if (br0Var.f32423n[0].e == br0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    br0Var.e = z10;
                    br0Var.h.j(1.0f, br0Var.f32423n[0].e);
                }
                br0Var.f32425s = false;
                yq0Var.f40299y0 = false;
                yq0Var.f40298x0 = false;
                lVar = ((org.telegram.ui.ActionBar.o2) br0Var).actionBar;
                lVar.setEnabled(true);
                br0Var.h.setEnabled(true);
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.cl0) obj).f23359c;
                if (photoViewer.A2 != null) {
                    ml0 ml0Var = new ml0(this, 17);
                    photoViewer.I2 = ml0Var;
                    AndroidUtilities.runOnUIThread(ml0Var, 860L);
                    return;
                }
                return;
            case 3:
                rt0 rt0Var = (rt0) obj;
                PhotoViewer photoViewer2 = rt0Var.f37237b;
                lg.p pVar = photoViewer2.C1.f24054b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f14325a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f24054b.J = true;
                photoViewer2.f31325p6 = null;
                photoViewer2.f31369u4 = rt0Var.f37236a;
                ci.i4 i4Var = photoViewer2.f1().L;
                if (photoViewer2.f31369u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i4Var.b(z11);
                ci.i4 i4Var2 = photoViewer2.K1;
                if (i4Var2 != null) {
                    if (photoViewer2.f31369u4 != 3) {
                        z13 = true;
                    }
                    i4Var2.b(z13);
                }
                if (photoViewer2.f31369u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f31317o6 = -1;
                photoViewer2.f31231e6 = 1.0f;
                photoViewer2.f31193a6 = 1.0f;
                photoViewer2.f31213c6 = 0.0f;
                photoViewer2.f31222d6 = 0.0f;
                photoViewer2.v3(1.0f);
                photoViewer2.f31358t2 = true;
                photoViewer2.f31225e0.invalidate();
                return;
            case 4:
                st0 st0Var = (st0) obj;
                PhotoViewer photoViewer3 = st0Var.f37579b;
                photoViewer3.I1.f28568i0.setVisibility(0);
                photoViewer3.f31325p6 = null;
                photoViewer3.f31369u4 = st0Var.f37578a;
                ci.i4 i4Var3 = photoViewer3.f1().L;
                if (photoViewer3.f31369u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i4Var3.b(z12);
                ci.i4 i4Var4 = photoViewer3.K1;
                if (i4Var4 != null) {
                    if (photoViewer3.f31369u4 != 3) {
                        z14 = true;
                    }
                    i4Var4.b(z14);
                }
                if (photoViewer3.f31369u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f31317o6 = -1;
                photoViewer3.f31231e6 = 1.0f;
                photoViewer3.f31193a6 = 1.0f;
                photoViewer3.f31213c6 = 0.0f;
                photoViewer3.f31222d6 = 0.0f;
                photoViewer3.v3(1.0f);
                photoViewer3.f31358t2 = true;
                photoViewer3.f31225e0.invalidate();
                return;
            case 5:
                ((PhotoViewer) ((wt0) obj).f39459q0).y3[0].setTag(null);
                return;
            case 6:
                ((xt0) obj).d.T1.f34858k0 = 1.0f;
                return;
            case 7:
                PhotoViewer photoViewer4 = ((xt0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f34858k0 = 1.0f;
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ml0(this, 19));
                return;
            case 9:
                ot0 ot0Var = (ot0) obj;
                if (animator.equals(ot0Var.f36252c.U7)) {
                    ot0Var.f36252c.U7 = null;
                    return;
                }
                return;
            case 10:
                vu0 vu0Var = (vu0) obj;
                if (vu0Var.e == animator) {
                    vu0Var.f38709c[1].setVisibility(8);
                    vu0Var.e = null;
                    return;
                }
                return;
            case 11:
                kv0 kv0Var = (kv0) obj;
                if (kv0Var.C != null) {
                    kv0Var.C = null;
                    kv0Var.b();
                    return;
                }
                return;
            case 12:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    return;
                }
                return;
            case 13:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f31449d0.removeView(premiumPreviewFragment.f31465r0);
                premiumPreviewFragment.f31465r0 = null;
                super.onAnimationEnd(animator);
                return;
            case 14:
                ((ProfileActivity) ((org.telegram.ui.Components.cl0) obj).f23359c).D5 = null;
                return;
            case 15:
                t01 t01Var = (t01) obj;
                if (!t01Var.E) {
                    t01Var.setVisibility(8);
                    return;
                }
                return;
            case 16:
                p11 p11Var = (p11) obj;
                if (animator.equals(p11Var.f36294c)) {
                    p11Var.f36294c = null;
                    return;
                }
                return;
            case 17:
                x21 x21Var = (x21) obj;
                ci.sb sbVar = x21Var.O;
                if (sbVar != null) {
                    if (sbVar.getParent() != null) {
                        ((ViewGroup) x21Var.O.getParent()).removeView(x21Var.O);
                    }
                    x21Var.O = null;
                }
                x21Var.N = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                ((t41) obj).d.f31725a0.f34858k0 = 1.0f;
                return;
            case 19:
                SecretMediaViewer secretMediaViewer = ((t41) obj).d;
                secretMediaViewer.f31725a0.setVisibility(4);
                secretMediaViewer.f31725a0.f34858k0 = 1.0f;
                return;
            case 20:
                c71 c71Var = ((s51) obj).e;
                c71Var.S0.G = 0.0f;
                c71Var.S0 = null;
                c71Var.f32585h0.invalidate();
                return;
            case 21:
                zg.f0.a();
                c71 c71Var2 = (c71) obj;
                z51 z51Var = c71Var2.f32585h0;
                z51 z51Var2 = c71Var2.f32585h0;
                z51Var.setLayerType(0, null);
                t51 t51Var = c71Var2.f32581f0;
                t51Var.setLayerType(0, null);
                c71Var2.f32578e0.setLayerType(0, null);
                c71Var2.f32571b0.setLayerType(0, null);
                org.telegram.ui.Components.mn mnVar = c71Var2.f32596n0;
                if (mnVar != null) {
                    mnVar.setLayerType(0, null);
                }
                View view = c71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                t51Var.b();
                c71Var2.f32576d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                c71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new xz0(globalInstance, 13));
                c71Var2.h();
                c71Var2.E(1.0f);
                for (int i11 = 0; i11 < z51Var2.getChildCount(); i11++) {
                    View childAt = z51Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < c71Var2.f32576d0.f22722b.getChildCount(); i12++) {
                    View childAt2 = c71Var2.f32576d0.f22722b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                c71Var2.f32576d0.f22722b.invalidate();
                c71Var2.f32591k0.invalidate();
                z51Var2.invalidate();
                return;
            case 22:
                ((ra1) obj).f37055a0.setVisibility(8);
                return;
            case 23:
                pd1 pd1Var = ((dd1) obj).f32940a;
                if (!pd1Var.f36433p1.a()) {
                    pd1Var.R1.setVisibility(8);
                    return;
                }
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((qe1) obj).f36727a = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((uf1) obj).setScrollEnabled(true);
                return;
            case 26:
                yg1 yg1Var = (yg1) obj;
                if (animator.equals(yg1Var.e.K)) {
                    yg1Var.e.K = null;
                    return;
                }
                return;
            case 27:
                oh1 oh1Var = (oh1) obj;
                oh1Var.d = null;
                oh1Var.f36211a = null;
                oh1Var.f36212b = false;
                oh1Var.f36214f.f31898c.setAllowDrawCursor(true);
                return;
            case 28:
                org.telegram.ui.Components.xf0 xf0Var = (org.telegram.ui.Components.xf0) obj;
                ((fj1) xf0Var.f30402b).getClass();
                ((fj1) xf0Var.f30402b).f33577c.setVisibility(4);
                return;
            default:
                ((org.telegram.ui.web.c1) obj).f38981s.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32119a) {
            case 3:
                rt0 rt0Var = (rt0) this.f32120b;
                rt0Var.f37237b.U0.setVisibility(0);
                rt0Var.f37237b.C1.setVisibility(0);
                return;
            case 4:
                return;
            case 15:
                ((t01) this.f32120b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
