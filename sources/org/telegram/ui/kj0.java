package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class kj0 extends AnimatorListenerAdapter {
    public final int f37442a;
    public final Object f37443b;

    public kj0(Object obj, int i10) {
        this.f37442a = i10;
        this.f37443b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37442a) {
            case 5:
                ((PhotoViewer) ((org.telegram.ui.Components.ql0) this.f37443b).f28324c).A2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        boolean z12;
        int i10 = this.f37442a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f37443b;
        switch (i10) {
            case 0:
                ((pj0) obj).T.setVisibility(8);
                return;
            case 1:
                jk0 jk0Var = (jk0) obj;
                jk0Var.f37086f = 1.0f;
                jk0Var.invalidate();
                return;
            case 2:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
            case 3:
                eq0 eq0Var = (eq0) obj;
                qc qcVar = eq0Var.X;
                if (qcVar != null) {
                    if (qcVar.getParent() != null) {
                        ((ViewGroup) eq0Var.X.getParent()).removeView(eq0Var.X);
                    }
                    eq0Var.X = null;
                }
                eq0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 4:
                hr0 hr0Var = (hr0) obj;
                kr0 kr0Var = hr0Var.D0;
                ir0[] ir0VarArr = kr0Var.f37495n;
                kr0Var.f37496r = null;
                if (kr0Var.f37498w) {
                    ir0VarArr[1].setVisibility(8);
                } else {
                    ir0 ir0Var = ir0VarArr[0];
                    ir0VarArr[0] = ir0VarArr[1];
                    ir0VarArr[1] = ir0Var;
                    ir0Var.setVisibility(8);
                    if (kr0Var.f37495n[0].e == kr0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    kr0Var.e = z10;
                    kr0Var.h.j(1.0f, kr0Var.f37495n[0].e);
                }
                kr0Var.f37497s = false;
                hr0Var.f36640y0 = false;
                hr0Var.f36639x0 = false;
                kVar = ((org.telegram.ui.ActionBar.m2) kr0Var).actionBar;
                kVar.setEnabled(true);
                kr0Var.h.setEnabled(true);
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ql0) obj).f28324c;
                if (photoViewer.A2 != null) {
                    xk0 xk0Var = new xk0(this, 18);
                    photoViewer.I2 = xk0Var;
                    AndroidUtilities.runOnUIThread(xk0Var, 860L);
                    return;
                }
                return;
            case 6:
                cu0 cu0Var = (cu0) obj;
                PhotoViewer photoViewer2 = cu0Var.f34795b;
                mg.p pVar = photoViewer2.C1.f29367b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f15559a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f29367b.J = true;
                photoViewer2.f32029p6 = null;
                photoViewer2.f32073u4 = cu0Var.f34794a;
                di.h4 h4Var = photoViewer2.f1().L;
                if (photoViewer2.f32073u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h4Var.b(z11);
                di.h4 h4Var2 = photoViewer2.K1;
                if (h4Var2 != null) {
                    if (photoViewer2.f32073u4 != 3) {
                        z13 = true;
                    }
                    h4Var2.b(z13);
                }
                if (photoViewer2.f32073u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f32021o6 = -1;
                photoViewer2.f31934e6 = 1.0f;
                photoViewer2.f31896a6 = 1.0f;
                photoViewer2.f31916c6 = 0.0f;
                photoViewer2.f31925d6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.f32062t2 = true;
                photoViewer2.f31928e0.invalidate();
                return;
            case 7:
                du0 du0Var = (du0) obj;
                PhotoViewer photoViewer3 = du0Var.f35141b;
                photoViewer3.I1.f26006i0.setVisibility(0);
                photoViewer3.f32029p6 = null;
                photoViewer3.f32073u4 = du0Var.f35140a;
                di.h4 h4Var3 = photoViewer3.f1().L;
                if (photoViewer3.f32073u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h4Var3.b(z12);
                di.h4 h4Var4 = photoViewer3.K1;
                if (h4Var4 != null) {
                    if (photoViewer3.f32073u4 != 3) {
                        z14 = true;
                    }
                    h4Var4.b(z14);
                }
                if (photoViewer3.f32073u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f32021o6 = -1;
                photoViewer3.f31934e6 = 1.0f;
                photoViewer3.f31896a6 = 1.0f;
                photoViewer3.f31916c6 = 0.0f;
                photoViewer3.f31925d6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.f32062t2 = true;
                photoViewer3.f31928e0.invalidate();
                return;
            case 8:
                ((PhotoViewer) ((hu0) obj).f36655q0).y3[0].setTag(null);
                return;
            case 9:
                ((iu0) obj).d.T1.f40488k0 = 1.0f;
                return;
            case 10:
                PhotoViewer photoViewer4 = ((iu0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f40488k0 = 1.0f;
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new xk0(this, 20));
                return;
            case 12:
                zt0 zt0Var = (zt0) obj;
                if (animator.equals(zt0Var.f42421c.U7)) {
                    zt0Var.f42421c.U7 = null;
                    return;
                }
                return;
            case 13:
                gv0 gv0Var = (gv0) obj;
                if (gv0Var.e == animator) {
                    gv0Var.f36313c[1].setVisibility(8);
                    gv0Var.e = null;
                    return;
                }
                return;
            case 14:
                vv0 vv0Var = (vv0) obj;
                if (vv0Var.C != null) {
                    vv0Var.C = null;
                    vv0Var.b();
                    return;
                }
                return;
            case 15:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    return;
                }
                return;
            case 16:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f32153d0.removeView(premiumPreviewFragment.f32169r0);
                premiumPreviewFragment.f32169r0 = null;
                super.onAnimationEnd(animator);
                return;
            case 17:
                ((ProfileActivity) ((org.telegram.ui.Components.ql0) obj).f28324c).D5 = null;
                return;
            case 18:
                f11 f11Var = (f11) obj;
                if (!f11Var.E) {
                    f11Var.setVisibility(8);
                    return;
                }
                return;
            case 19:
                c21 c21Var = (c21) obj;
                if (animator.equals(c21Var.f34431c)) {
                    c21Var.f34431c = null;
                    return;
                }
                return;
            case 20:
                k31 k31Var = (k31) obj;
                di.sb sbVar = k31Var.O;
                if (sbVar != null) {
                    if (sbVar.getParent() != null) {
                        ((ViewGroup) k31Var.O.getParent()).removeView(k31Var.O);
                    }
                    k31Var.O = null;
                }
                k31Var.N = null;
                super.onAnimationEnd(animator);
                return;
            case 21:
                ((g51) obj).d.f32430a0.f40488k0 = 1.0f;
                return;
            case 22:
                SecretMediaViewer secretMediaViewer = ((g51) obj).d;
                secretMediaViewer.f32430a0.setVisibility(4);
                secretMediaViewer.f32430a0.f40488k0 = 1.0f;
                return;
            case 23:
                r71 r71Var = ((h61) obj).e;
                r71Var.S0.G = 0.0f;
                r71Var.S0 = null;
                r71Var.f39330h0.invalidate();
                return;
            case 24:
                ah.x0.a();
                r71 r71Var2 = (r71) obj;
                o61 o61Var = r71Var2.f39330h0;
                o61 o61Var2 = r71Var2.f39330h0;
                o61Var.setLayerType(0, null);
                i61 i61Var = r71Var2.f39326f0;
                i61Var.setLayerType(0, null);
                r71Var2.f39323e0.setLayerType(0, null);
                r71Var2.f39316b0.setLayerType(0, null);
                org.telegram.ui.Components.xn xnVar = r71Var2.f39341n0;
                if (xnVar != null) {
                    xnVar.setLayerType(0, null);
                }
                View view = r71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                i61Var.b();
                r71Var2.f39321d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                r71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new tz0(globalInstance, 14));
                r71Var2.h();
                r71Var2.E(1.0f);
                for (int i11 = 0; i11 < o61Var2.getChildCount(); i11++) {
                    View childAt = o61Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < r71Var2.f39321d0.f27691b.getChildCount(); i12++) {
                    View childAt2 = r71Var2.f39321d0.f27691b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                r71Var2.f39321d0.f27691b.invalidate();
                r71Var2.f39336k0.invalidate();
                o61Var2.invalidate();
                return;
            case 25:
                ((hb1) obj).f36478b0.setVisibility(8);
                return;
            case 26:
                ce1 ce1Var = ((qd1) obj).f39114a;
                if (!ce1Var.f34620p1.a()) {
                    ce1Var.R1.setVisibility(8);
                    return;
                }
                return;
            case 27:
                super.onAnimationEnd(animator);
                ((ef1) obj).f35287a = null;
                return;
            case 28:
                super.onAnimationEnd(animator);
                ((ig1) obj).setScrollEnabled(true);
                return;
            default:
                nh1 nh1Var = (nh1) obj;
                if (animator.equals(nh1Var.d.K)) {
                    nh1Var.d.K = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37442a) {
            case 6:
                cu0 cu0Var = (cu0) this.f37443b;
                cu0Var.f34795b.U0.setVisibility(0);
                cu0Var.f34795b.C1.setVisibility(0);
                return;
            case 7:
                return;
            case 18:
                ((f11) this.f37443b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
