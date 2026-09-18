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
    public final int f33911a;
    public final Object f33912b;

    public gp0(Object obj, int i10) {
        this.f33911a = i10;
        this.f33912b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33911a) {
            case 2:
                ((PhotoViewer) ((org.telegram.ui.Components.al0) this.f33912b).f22650c).A2 = null;
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
        int i10 = this.f33911a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f33912b;
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
                fr0[] fr0VarArr = hr0Var.f34219n;
                hr0Var.f34220r = null;
                if (hr0Var.f34222w) {
                    fr0VarArr[1].setVisibility(8);
                } else {
                    fr0 fr0Var = fr0VarArr[0];
                    fr0VarArr[0] = fr0VarArr[1];
                    fr0VarArr[1] = fr0Var;
                    fr0Var.setVisibility(8);
                    if (hr0Var.f34219n[0].e == hr0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    hr0Var.e = z10;
                    hr0Var.h.j(1.0f, hr0Var.f34219n[0].e);
                }
                hr0Var.f34221s = false;
                er0Var.f33347y0 = false;
                er0Var.f33346x0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) hr0Var).actionBar;
                kVar.setEnabled(true);
                hr0Var.h.setEnabled(true);
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.al0) obj).f22650c;
                if (photoViewer.A2 != null) {
                    sl0 sl0Var = new sl0(this, 17);
                    photoViewer.I2 = sl0Var;
                    AndroidUtilities.runOnUIThread(sl0Var, 860L);
                    return;
                }
                return;
            case 3:
                wt0 wt0Var = (wt0) obj;
                PhotoViewer photoViewer2 = wt0Var.f39241b;
                lg.p pVar = photoViewer2.C1.f23571b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f14256a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f23571b.J = true;
                photoViewer2.f31281p6 = null;
                photoViewer2.f31325u4 = wt0Var.f39240a;
                ci.j4 j4Var = photoViewer2.f1().L;
                if (photoViewer2.f31325u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j4Var.b(z11);
                ci.j4 j4Var2 = photoViewer2.K1;
                if (j4Var2 != null) {
                    if (photoViewer2.f31325u4 != 3) {
                        z13 = true;
                    }
                    j4Var2.b(z13);
                }
                if (photoViewer2.f31325u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f31273o6 = -1;
                photoViewer2.f31187e6 = 1.0f;
                photoViewer2.f31149a6 = 1.0f;
                photoViewer2.f31169c6 = 0.0f;
                photoViewer2.f31178d6 = 0.0f;
                photoViewer2.v3(1.0f);
                photoViewer2.f31314t2 = true;
                photoViewer2.f31181e0.invalidate();
                return;
            case 4:
                xt0 xt0Var = (xt0) obj;
                PhotoViewer photoViewer3 = xt0Var.f39629b;
                photoViewer3.I1.f28143i0.setVisibility(0);
                photoViewer3.f31281p6 = null;
                photoViewer3.f31325u4 = xt0Var.f39628a;
                ci.j4 j4Var3 = photoViewer3.f1().L;
                if (photoViewer3.f31325u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                j4Var3.b(z12);
                ci.j4 j4Var4 = photoViewer3.K1;
                if (j4Var4 != null) {
                    if (photoViewer3.f31325u4 != 3) {
                        z14 = true;
                    }
                    j4Var4.b(z14);
                }
                if (photoViewer3.f31325u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f31273o6 = -1;
                photoViewer3.f31187e6 = 1.0f;
                photoViewer3.f31149a6 = 1.0f;
                photoViewer3.f31169c6 = 0.0f;
                photoViewer3.f31178d6 = 0.0f;
                photoViewer3.v3(1.0f);
                photoViewer3.f31314t2 = true;
                photoViewer3.f31181e0.invalidate();
                return;
            case 5:
                ((PhotoViewer) ((bu0) obj).f32459q0).y3[0].setTag(null);
                return;
            case 6:
                ((cu0) obj).d.T1.f36250k0 = 1.0f;
                return;
            case 7:
                PhotoViewer photoViewer4 = ((cu0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f36250k0 = 1.0f;
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new sl0(this, 19));
                return;
            case 9:
                tt0 tt0Var = (tt0) obj;
                if (animator.equals(tt0Var.f37807c.U7)) {
                    tt0Var.f37807c.U7 = null;
                    return;
                }
                return;
            case 10:
                av0 av0Var = (av0) obj;
                if (av0Var.e == animator) {
                    av0Var.f32154c[1].setVisibility(8);
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
                premiumPreviewFragment.f31405d0.removeView(premiumPreviewFragment.f31421r0);
                premiumPreviewFragment.f31421r0 = null;
                super.onAnimationEnd(animator);
                return;
            case 14:
                ((ProfileActivity) ((org.telegram.ui.Components.al0) obj).f22650c).D5 = null;
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
                if (animator.equals(w11Var.f38668c)) {
                    w11Var.f38668c = null;
                    return;
                }
                return;
            case 17:
                d31 d31Var = (d31) obj;
                ci.wb wbVar = d31Var.O;
                if (wbVar != null) {
                    if (wbVar.getParent() != null) {
                        ((ViewGroup) d31Var.O.getParent()).removeView(d31Var.O);
                    }
                    d31Var.O = null;
                }
                d31Var.N = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                ((x41) obj).d.f31681a0.f36250k0 = 1.0f;
                return;
            case 19:
                SecretMediaViewer secretMediaViewer = ((x41) obj).d;
                secretMediaViewer.f31681a0.setVisibility(4);
                secretMediaViewer.f31681a0.f36250k0 = 1.0f;
                return;
            case 20:
                g71 g71Var = ((w51) obj).e;
                g71Var.S0.G = 0.0f;
                g71Var.S0 = null;
                g71Var.f33728h0.invalidate();
                return;
            case 21:
                zg.e0.a();
                g71 g71Var2 = (g71) obj;
                d61 d61Var = g71Var2.f33728h0;
                d61 d61Var2 = g71Var2.f33728h0;
                d61Var.setLayerType(0, null);
                x51 x51Var = g71Var2.f33724f0;
                x51Var.setLayerType(0, null);
                g71Var2.f33721e0.setLayerType(0, null);
                g71Var2.f33714b0.setLayerType(0, null);
                org.telegram.ui.Components.kn knVar = g71Var2.f33739n0;
                if (knVar != null) {
                    knVar.setLayerType(0, null);
                }
                View view = g71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                x51Var.b();
                g71Var2.f33719d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                g71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new e01(globalInstance, 13));
                g71Var2.h();
                g71Var2.E(1.0f);
                for (int i11 = 0; i11 < d61Var2.getChildCount(); i11++) {
                    View childAt = d61Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < g71Var2.f33719d0.f30846b.getChildCount(); i12++) {
                    View childAt2 = g71Var2.f33719d0.f30846b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                g71Var2.f33719d0.f30846b.invalidate();
                g71Var2.f33734k0.invalidate();
                d61Var2.invalidate();
                return;
            case 22:
                ((za1) obj).f40035b0.setVisibility(8);
                return;
            case 23:
                vd1 vd1Var = ((jd1) obj).f34846a;
                if (!vd1Var.f38510p1.a()) {
                    vd1Var.R1.setVisibility(8);
                    return;
                }
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((xe1) obj).f39445a = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((bg1) obj).setScrollEnabled(true);
                return;
            case 26:
                fh1 fh1Var = (fh1) obj;
                if (animator.equals(fh1Var.e.K)) {
                    fh1Var.e.K = null;
                    return;
                }
                return;
            case 27:
                vh1 vh1Var = (vh1) obj;
                vh1Var.d = null;
                vh1Var.f38557a = null;
                vh1Var.f38558b = false;
                vh1Var.f38560f.f31854c.setAllowDrawCursor(true);
                return;
            case 28:
                oi.i iVar = (oi.i) obj;
                ((nj1) iVar.f15722b).getClass();
                ((nj1) iVar.f15722b).f35969c.setVisibility(4);
                return;
            default:
                ((org.telegram.ui.web.d1) obj).f38874s.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33911a) {
            case 3:
                wt0 wt0Var = (wt0) this.f33912b;
                wt0Var.f39241b.U0.setVisibility(0);
                wt0Var.f39241b.C1.setVisibility(0);
                return;
            case 4:
                return;
            case 15:
                ((a11) this.f33912b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
