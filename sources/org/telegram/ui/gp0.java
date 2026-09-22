package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class gp0 extends AnimatorListenerAdapter {
    public final int f33963a;
    public final Object f33964b;

    public gp0(Object obj, int i10) {
        this.f33963a = i10;
        this.f33964b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33963a) {
            case 2:
                ((PhotoViewer) ((org.telegram.ui.Components.cl0) this.f33964b).f23401c).A2 = null;
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
        int i10 = this.f33963a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f33964b;
        switch (i10) {
            case 0:
                cq0 cq0Var = (cq0) obj;
                mc mcVar = cq0Var.X;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) cq0Var.X.getParent()).removeView(cq0Var.X);
                    }
                    cq0Var.X = null;
                }
                cq0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 1:
                er0 er0Var = (er0) obj;
                hr0 hr0Var = er0Var.D0;
                fr0[] fr0VarArr = hr0Var.f34287n;
                hr0Var.f34288r = null;
                if (hr0Var.f34290w) {
                    fr0VarArr[1].setVisibility(8);
                } else {
                    fr0 fr0Var = fr0VarArr[0];
                    fr0VarArr[0] = fr0VarArr[1];
                    fr0VarArr[1] = fr0Var;
                    fr0Var.setVisibility(8);
                    if (hr0Var.f34287n[0].e == hr0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    hr0Var.e = z10;
                    hr0Var.h.j(1.0f, hr0Var.f34287n[0].e);
                }
                hr0Var.f34289s = false;
                er0Var.f33416y0 = false;
                er0Var.f33415x0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) hr0Var).actionBar;
                kVar.setEnabled(true);
                hr0Var.h.setEnabled(true);
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.cl0) obj).f23401c;
                if (photoViewer.A2 != null) {
                    sl0 sl0Var = new sl0(this, 17);
                    photoViewer.I2 = sl0Var;
                    AndroidUtilities.runOnUIThread(sl0Var, 860L);
                    return;
                }
                return;
            case 3:
                wt0 wt0Var = (wt0) obj;
                PhotoViewer photoViewer2 = wt0Var.f39255b;
                lg.p pVar = photoViewer2.C1.f24217b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f14307a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f24217b.J = true;
                photoViewer2.f31342p6 = null;
                photoViewer2.f31386u4 = wt0Var.f39254a;
                ci.j4 j4Var = photoViewer2.f1().L;
                if (photoViewer2.f31386u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j4Var.b(z11);
                ci.j4 j4Var2 = photoViewer2.K1;
                if (j4Var2 != null) {
                    if (photoViewer2.f31386u4 != 3) {
                        z13 = true;
                    }
                    j4Var2.b(z13);
                }
                if (photoViewer2.f31386u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f31334o6 = -1;
                photoViewer2.f31248e6 = 1.0f;
                photoViewer2.f31210a6 = 1.0f;
                photoViewer2.f31230c6 = 0.0f;
                photoViewer2.f31239d6 = 0.0f;
                photoViewer2.v3(1.0f);
                photoViewer2.f31375t2 = true;
                photoViewer2.f31242e0.invalidate();
                return;
            case 4:
                xt0 xt0Var = (xt0) obj;
                PhotoViewer photoViewer3 = xt0Var.f39754b;
                photoViewer3.I1.f28735i0.setVisibility(0);
                photoViewer3.f31342p6 = null;
                photoViewer3.f31386u4 = xt0Var.f39753a;
                ci.j4 j4Var3 = photoViewer3.f1().L;
                if (photoViewer3.f31386u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                j4Var3.b(z12);
                ci.j4 j4Var4 = photoViewer3.K1;
                if (j4Var4 != null) {
                    if (photoViewer3.f31386u4 != 3) {
                        z14 = true;
                    }
                    j4Var4.b(z14);
                }
                if (photoViewer3.f31386u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f31334o6 = -1;
                photoViewer3.f31248e6 = 1.0f;
                photoViewer3.f31210a6 = 1.0f;
                photoViewer3.f31230c6 = 0.0f;
                photoViewer3.f31239d6 = 0.0f;
                photoViewer3.v3(1.0f);
                photoViewer3.f31375t2 = true;
                photoViewer3.f31242e0.invalidate();
                return;
            case 5:
                ((PhotoViewer) ((bu0) obj).f32567q0).y3[0].setTag(null);
                return;
            case 6:
                ((cu0) obj).d.T1.f36405k0 = 1.0f;
                return;
            case 7:
                PhotoViewer photoViewer4 = ((cu0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f36405k0 = 1.0f;
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new sl0(this, 19));
                return;
            case 9:
                tt0 tt0Var = (tt0) obj;
                if (animator.equals(tt0Var.f37882c.U7)) {
                    tt0Var.f37882c.U7 = null;
                    return;
                }
                return;
            case 10:
                av0 av0Var = (av0) obj;
                if (av0Var.e == animator) {
                    av0Var.f32189c[1].setVisibility(8);
                    av0Var.e = null;
                    return;
                }
                return;
            case 11:
                pv0 pv0Var = (pv0) obj;
                if (pv0Var.C != null) {
                    pv0Var.C = null;
                    pv0Var.b();
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
                premiumPreviewFragment.f31466d0.removeView(premiumPreviewFragment.f31482r0);
                premiumPreviewFragment.f31482r0 = null;
                super.onAnimationEnd(animator);
                return;
            case 14:
                ((ProfileActivity) ((org.telegram.ui.Components.cl0) obj).f23401c).D5 = null;
                return;
            case 15:
                a11 a11Var = (a11) obj;
                if (!a11Var.E) {
                    a11Var.setVisibility(8);
                    return;
                }
                return;
            case 16:
                w11 w11Var = (w11) obj;
                if (animator.equals(w11Var.f38669c)) {
                    w11Var.f38669c = null;
                    return;
                }
                return;
            case 17:
                e31 e31Var = (e31) obj;
                ci.wb wbVar = e31Var.O;
                if (wbVar != null) {
                    if (wbVar.getParent() != null) {
                        ((ViewGroup) e31Var.O.getParent()).removeView(e31Var.O);
                    }
                    e31Var.O = null;
                }
                e31Var.N = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                ((a51) obj).d.f31742a0.f36405k0 = 1.0f;
                return;
            case 19:
                SecretMediaViewer secretMediaViewer = ((a51) obj).d;
                secretMediaViewer.f31742a0.setVisibility(4);
                secretMediaViewer.f31742a0.f36405k0 = 1.0f;
                return;
            case 20:
                j71 j71Var = ((z51) obj).e;
                j71Var.S0.G = 0.0f;
                j71Var.S0 = null;
                j71Var.f34817h0.invalidate();
                return;
            case 21:
                zg.f0.a();
                j71 j71Var2 = (j71) obj;
                g61 g61Var = j71Var2.f34817h0;
                g61 g61Var2 = j71Var2.f34817h0;
                g61Var.setLayerType(0, null);
                a61 a61Var = j71Var2.f34813f0;
                a61Var.setLayerType(0, null);
                j71Var2.f34810e0.setLayerType(0, null);
                j71Var2.f34803b0.setLayerType(0, null);
                org.telegram.ui.Components.kn knVar = j71Var2.f34828n0;
                if (knVar != null) {
                    knVar.setLayerType(0, null);
                }
                View view = j71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                a61Var.b();
                j71Var2.f34808d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                j71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new e01(globalInstance, 13));
                j71Var2.h();
                j71Var2.E(1.0f);
                for (int i11 = 0; i11 < g61Var2.getChildCount(); i11++) {
                    View childAt = g61Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < j71Var2.f34808d0.f22703b.getChildCount(); i12++) {
                    View childAt2 = j71Var2.f34808d0.f22703b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                j71Var2.f34808d0.f22703b.invalidate();
                j71Var2.f34823k0.invalidate();
                g61Var2.invalidate();
                return;
            case 22:
                ((bb1) obj).f32334b0.setVisibility(8);
                return;
            case 23:
                xd1 xd1Var = ((ld1) obj).f35442a;
                if (!xd1Var.f39537p1.a()) {
                    xd1Var.R1.setVisibility(8);
                    return;
                }
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((ze1) obj).f40225a = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((dg1) obj).setScrollEnabled(true);
                return;
            case 26:
                hh1 hh1Var = (hh1) obj;
                if (animator.equals(hh1Var.e.K)) {
                    hh1Var.e.K = null;
                    return;
                }
                return;
            case 27:
                xh1 xh1Var = (xh1) obj;
                xh1Var.d = null;
                xh1Var.f39611a = null;
                xh1Var.f39612b = false;
                xh1Var.f39614f.f31915c.setAllowDrawCursor(true);
                return;
            case 28:
                oi.i iVar = (oi.i) obj;
                ((oj1) iVar.f15769b).getClass();
                ((oj1) iVar.f15769b).f36354c.setVisibility(4);
                return;
            default:
                ((org.telegram.ui.web.d1) obj).f38895s.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33963a) {
            case 3:
                wt0 wt0Var = (wt0) this.f33964b;
                wt0Var.f39255b.U0.setVisibility(0);
                wt0Var.f39255b.C1.setVisibility(0);
                return;
            case 4:
                return;
            case 15:
                ((a11) this.f33964b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
