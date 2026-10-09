package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ep0 extends AnimatorListenerAdapter {
    public final int f37305a;
    public final Object f37306b;

    public ep0(Object obj, int i10) {
        this.f37305a = i10;
        this.f37306b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37305a) {
            case 2:
                ((PhotoViewer) ((org.telegram.ui.Components.ul0) this.f37306b).f31536c).A2 = null;
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
        int i10 = this.f37305a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f37306b;
        switch (i10) {
            case 0:
                aq0 aq0Var = (aq0) obj;
                lc lcVar = aq0Var.X;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) aq0Var.X.getParent()).removeView(aq0Var.X);
                    }
                    aq0Var.X = null;
                }
                aq0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 1:
                dr0 dr0Var = (dr0) obj;
                gr0 gr0Var = dr0Var.D0;
                er0[] er0VarArr = gr0Var.f38089n;
                gr0Var.f38090r = null;
                if (gr0Var.f38092w) {
                    er0VarArr[1].setVisibility(8);
                } else {
                    er0 er0Var = er0VarArr[0];
                    er0VarArr[0] = er0VarArr[1];
                    er0VarArr[1] = er0Var;
                    er0Var.setVisibility(8);
                    if (gr0Var.f38089n[0].f37317e == gr0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    gr0Var.f38087e = z10;
                    gr0Var.h.j(1.0f, gr0Var.f38089n[0].f37317e);
                }
                gr0Var.f38091s = false;
                dr0Var.f37069y0 = false;
                dr0Var.f37068x0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) gr0Var).actionBar;
                kVar.setEnabled(true);
                gr0Var.h.setEnabled(true);
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ul0) obj).f31536c;
                if (photoViewer.A2 != null) {
                    tk0 tk0Var = new tk0(this, 18);
                    photoViewer.I2 = tk0Var;
                    AndroidUtilities.runOnUIThread(tk0Var, 860L);
                    return;
                }
                return;
            case 3:
                xt0 xt0Var = (xt0) obj;
                PhotoViewer photoViewer2 = xt0Var.f44150b;
                lg.p pVar = photoViewer2.C1.f31768b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f15572a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f31768b.J = true;
                photoViewer2.f34004p6 = null;
                photoViewer2.f34048u4 = xt0Var.f44149a;
                ci.h4 h4Var = photoViewer2.f1().L;
                if (photoViewer2.f34048u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h4Var.b(z11);
                ci.h4 h4Var2 = photoViewer2.K1;
                if (h4Var2 != null) {
                    if (photoViewer2.f34048u4 != 3) {
                        z13 = true;
                    }
                    h4Var2.b(z13);
                }
                if (photoViewer2.f34048u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f33996o6 = -1;
                photoViewer2.f33910e6 = 1.0f;
                photoViewer2.f33871a6 = 1.0f;
                photoViewer2.f33891c6 = 0.0f;
                photoViewer2.f33900d6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.f34037t2 = true;
                photoViewer2.f33904e0.invalidate();
                return;
            case 4:
                yt0 yt0Var = (yt0) obj;
                PhotoViewer photoViewer3 = yt0Var.f44408b;
                photoViewer3.I1.f27984i0.setVisibility(0);
                photoViewer3.f34004p6 = null;
                photoViewer3.f34048u4 = yt0Var.f44407a;
                ci.h4 h4Var3 = photoViewer3.f1().L;
                if (photoViewer3.f34048u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h4Var3.b(z12);
                ci.h4 h4Var4 = photoViewer3.K1;
                if (h4Var4 != null) {
                    if (photoViewer3.f34048u4 != 3) {
                        z14 = true;
                    }
                    h4Var4.b(z14);
                }
                if (photoViewer3.f34048u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f33996o6 = -1;
                photoViewer3.f33910e6 = 1.0f;
                photoViewer3.f33871a6 = 1.0f;
                photoViewer3.f33891c6 = 0.0f;
                photoViewer3.f33900d6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.f34037t2 = true;
                photoViewer3.f33904e0.invalidate();
                return;
            case 5:
                ((PhotoViewer) ((cu0) obj).f36740q0).y3[0].setTag(null);
                return;
            case 6:
                ((du0) obj).d.T1.f40894k0 = 1.0f;
                return;
            case 7:
                PhotoViewer photoViewer4 = ((du0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f40894k0 = 1.0f;
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new tk0(this, 20));
                return;
            case 9:
                ut0 ut0Var = (ut0) obj;
                if (animator.equals(ut0Var.f42554c.U7)) {
                    ut0Var.f42554c.U7 = null;
                    return;
                }
                return;
            case 10:
                bv0 bv0Var = (bv0) obj;
                if (bv0Var.f36442e == animator) {
                    bv0Var.f36441c[1].setVisibility(8);
                    bv0Var.f36442e = null;
                    return;
                }
                return;
            case 11:
                qv0 qv0Var = (qv0) obj;
                if (qv0Var.C != null) {
                    qv0Var.C = null;
                    qv0Var.b();
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
                premiumPreviewFragment.f34131d0.removeView(premiumPreviewFragment.f34148r0);
                premiumPreviewFragment.f34148r0 = null;
                super.onAnimationEnd(animator);
                return;
            case 14:
                ((ProfileActivity) ((org.telegram.ui.Components.ul0) obj).f31536c).D5 = null;
                return;
            case 15:
                z01 z01Var = (z01) obj;
                if (!z01Var.E) {
                    z01Var.setVisibility(8);
                    return;
                }
                return;
            case 16:
                v11 v11Var = (v11) obj;
                if (animator.equals(v11Var.f42605c)) {
                    v11Var.f42605c = null;
                    return;
                }
                return;
            case 17:
                d31 d31Var = (d31) obj;
                ci.tb tbVar = d31Var.O;
                if (tbVar != null) {
                    if (tbVar.getParent() != null) {
                        ((ViewGroup) d31Var.O.getParent()).removeView(d31Var.O);
                    }
                    d31Var.O = null;
                }
                d31Var.N = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                ((z41) obj).d.f34413a0.f40894k0 = 1.0f;
                return;
            case 19:
                SecretMediaViewer secretMediaViewer = ((z41) obj).d;
                secretMediaViewer.f34413a0.setVisibility(4);
                secretMediaViewer.f34413a0.f40894k0 = 1.0f;
                return;
            case 20:
                k71 k71Var = ((a61) obj).f35855e;
                k71Var.S0.G = 0.0f;
                k71Var.S0 = null;
                k71Var.f39132h0.invalidate();
                return;
            case 21:
                zg.d0.a();
                k71 k71Var2 = (k71) obj;
                h61 h61Var = k71Var2.f39132h0;
                h61 h61Var2 = k71Var2.f39132h0;
                h61Var.setLayerType(0, null);
                b61 b61Var = k71Var2.f39128f0;
                b61Var.setLayerType(0, null);
                k71Var2.f39125e0.setLayerType(0, null);
                k71Var2.f39117b0.setLayerType(0, null);
                org.telegram.ui.Components.ao aoVar = k71Var2.f39143n0;
                if (aoVar != null) {
                    aoVar.setLayerType(0, null);
                }
                View view = k71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                b61Var.b();
                k71Var2.f39122d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                k71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new nz0(globalInstance, 14));
                k71Var2.h();
                k71Var2.E(1.0f);
                for (int i11 = 0; i11 < h61Var2.getChildCount(); i11++) {
                    View childAt = h61Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < k71Var2.f39122d0.f30856b.getChildCount(); i12++) {
                    View childAt2 = k71Var2.f39122d0.f30856b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                k71Var2.f39122d0.f30856b.invalidate();
                k71Var2.f39138k0.invalidate();
                h61Var2.invalidate();
                return;
            case 22:
                ((bb1) obj).f36207b0.setVisibility(8);
                return;
            case 23:
                xd1 xd1Var = ((ld1) obj).f39546a;
                if (!xd1Var.f43981p1.a()) {
                    xd1Var.R1.setVisibility(8);
                    return;
                }
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((ze1) obj).f44576a = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((dg1) obj).setScrollEnabled(true);
                return;
            case 26:
                hh1 hh1Var = (hh1) obj;
                if (animator.equals(hh1Var.d.K)) {
                    hh1Var.d.K = null;
                    return;
                }
                return;
            case 27:
                zh1 zh1Var = (zh1) obj;
                zh1Var.d = null;
                zh1Var.f44663a = null;
                zh1Var.f44664b = false;
                zh1Var.f44667f.f34594c.setAllowDrawCursor(true);
                return;
            case 28:
                ((org.telegram.ui.Wallet.x2) obj).K = null;
                return;
            default:
                ((org.telegram.ui.Wallet.d3) obj).f();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37305a) {
            case 3:
                xt0 xt0Var = (xt0) this.f37306b;
                xt0Var.f44150b.U0.setVisibility(0);
                xt0Var.f44150b.C1.setVisibility(0);
                return;
            case 4:
                return;
            case 15:
                ((z01) this.f37306b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
