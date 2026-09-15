package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class cr0 extends AnimatorListenerAdapter {
    public final int f32847a;
    public final Object f32848b;

    public cr0(Object obj, int i10) {
        this.f32847a = i10;
        this.f32848b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32847a) {
            case 1:
                ((PhotoViewer) ((org.telegram.ui.Components.pk0) this.f32848b).f27075c).A2 = null;
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
        int i10 = this.f32847a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f32848b;
        switch (i10) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                gr0 gr0Var = dr0Var.D0;
                er0[] er0VarArr = gr0Var.f33994n;
                gr0Var.f33995r = null;
                if (gr0Var.f33997w) {
                    er0VarArr[1].setVisibility(8);
                } else {
                    er0 er0Var = er0VarArr[0];
                    er0VarArr[0] = er0VarArr[1];
                    er0VarArr[1] = er0Var;
                    er0Var.setVisibility(8);
                    if (gr0Var.f33994n[0].e == gr0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    gr0Var.e = z10;
                    gr0Var.h.j(1.0f, gr0Var.f33994n[0].e);
                }
                gr0Var.f33996s = false;
                dr0Var.f33115y0 = false;
                dr0Var.f33114x0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) gr0Var).actionBar;
                kVar.setEnabled(true);
                gr0Var.h.setEnabled(true);
                return;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.pk0) obj).f27075c;
                if (photoViewer.A2 != null) {
                    pl0 pl0Var = new pl0(this, 17);
                    photoViewer.I2 = pl0Var;
                    AndroidUtilities.runOnUIThread(pl0Var, 860L);
                    return;
                }
                return;
            case 2:
                wt0 wt0Var = (wt0) obj;
                PhotoViewer photoViewer2 = wt0Var.f39391b;
                lg.p pVar = photoViewer2.C1.f28382b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f14097a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f28382b.J = true;
                photoViewer2.f31036p6 = null;
                photoViewer2.f31080u4 = wt0Var.f39390a;
                ci.j4 j4Var = photoViewer2.f1().L;
                if (photoViewer2.f31080u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j4Var.b(z11);
                ci.j4 j4Var2 = photoViewer2.K1;
                if (j4Var2 != null) {
                    if (photoViewer2.f31080u4 != 3) {
                        z13 = true;
                    }
                    j4Var2.b(z13);
                }
                if (photoViewer2.f31080u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f31028o6 = -1;
                photoViewer2.f30942e6 = 1.0f;
                photoViewer2.f30904a6 = 1.0f;
                photoViewer2.f30924c6 = 0.0f;
                photoViewer2.f30933d6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.f31069t2 = true;
                photoViewer2.f30936e0.invalidate();
                return;
            case 3:
                xt0 xt0Var = (xt0) obj;
                PhotoViewer photoViewer3 = xt0Var.f39678b;
                photoViewer3.I1.f25322i0.setVisibility(0);
                photoViewer3.f31036p6 = null;
                photoViewer3.f31080u4 = xt0Var.f39677a;
                ci.j4 j4Var3 = photoViewer3.f1().L;
                if (photoViewer3.f31080u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                j4Var3.b(z12);
                ci.j4 j4Var4 = photoViewer3.K1;
                if (j4Var4 != null) {
                    if (photoViewer3.f31080u4 != 3) {
                        z14 = true;
                    }
                    j4Var4.b(z14);
                }
                if (photoViewer3.f31080u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f31028o6 = -1;
                photoViewer3.f30942e6 = 1.0f;
                photoViewer3.f30904a6 = 1.0f;
                photoViewer3.f30924c6 = 0.0f;
                photoViewer3.f30933d6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.f31069t2 = true;
                photoViewer3.f30936e0.invalidate();
                return;
            case 4:
                ((PhotoViewer) ((bu0) obj).f32587q0).y3[0].setTag(null);
                return;
            case 5:
                ((cu0) obj).d.T1.f36350k0 = 1.0f;
                return;
            case 6:
                PhotoViewer photoViewer4 = ((cu0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f36350k0 = 1.0f;
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new pl0(this, 19));
                return;
            case 8:
                tt0 tt0Var = (tt0) obj;
                if (animator.equals(tt0Var.f37785c.T7)) {
                    tt0Var.f37785c.T7 = null;
                    return;
                }
                return;
            case 9:
                av0 av0Var = (av0) obj;
                if (av0Var.e == animator) {
                    av0Var.f31960c[1].setVisibility(8);
                    av0Var.e = null;
                    return;
                }
                return;
            case 10:
                pv0 pv0Var = (pv0) obj;
                if (pv0Var.C != null) {
                    pv0Var.C = null;
                    pv0Var.b();
                    return;
                }
                return;
            case 11:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    return;
                }
                return;
            case 12:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f31160d0.removeView(premiumPreviewFragment.f31176r0);
                premiumPreviewFragment.f31176r0 = null;
                super.onAnimationEnd(animator);
                return;
            case 13:
                ((ProfileActivity) ((org.telegram.ui.Components.pk0) obj).f27075c).D5 = null;
                return;
            case 14:
                a11 a11Var = (a11) obj;
                if (!a11Var.E) {
                    a11Var.setVisibility(8);
                    return;
                }
                return;
            case 15:
                w11 w11Var = (w11) obj;
                if (animator.equals(w11Var.f38744c)) {
                    w11Var.f38744c = null;
                    return;
                }
                return;
            case 16:
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
            case 17:
                ((w41) obj).d.f31437a0.f36350k0 = 1.0f;
                return;
            case 18:
                SecretMediaViewer secretMediaViewer = ((w41) obj).d;
                secretMediaViewer.f31437a0.setVisibility(4);
                secretMediaViewer.f31437a0.f36350k0 = 1.0f;
                return;
            case 19:
                g71 g71Var = ((w51) obj).e;
                g71Var.S0.G = 0.0f;
                g71Var.S0 = null;
                g71Var.f33796h0.invalidate();
                return;
            case 20:
                zg.f0.a();
                g71 g71Var2 = (g71) obj;
                d61 d61Var = g71Var2.f33796h0;
                d61 d61Var2 = g71Var2.f33796h0;
                d61Var.setLayerType(0, null);
                x51 x51Var = g71Var2.f33792f0;
                x51Var.setLayerType(0, null);
                g71Var2.f33789e0.setLayerType(0, null);
                g71Var2.f33782b0.setLayerType(0, null);
                org.telegram.ui.Components.kn knVar = g71Var2.f33807n0;
                if (knVar != null) {
                    knVar.setLayerType(0, null);
                }
                View view = g71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                x51Var.b();
                g71Var2.f33787d0.m(false);
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
                for (int i12 = 0; i12 < g71Var2.f33787d0.f26180b.getChildCount(); i12++) {
                    View childAt2 = g71Var2.f33787d0.f26180b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                g71Var2.f33787d0.f26180b.invalidate();
                g71Var2.f33802k0.invalidate();
                d61Var2.invalidate();
                return;
            case 21:
                ((ya1) obj).f39798b0.setVisibility(8);
                return;
            case 22:
                vd1 vd1Var = ((jd1) obj).f34857a;
                if (!vd1Var.f38556p1.a()) {
                    vd1Var.R1.setVisibility(8);
                    return;
                }
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((xe1) obj).f39606a = null;
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((bg1) obj).setScrollEnabled(true);
                return;
            case 25:
                fh1 fh1Var = (fh1) obj;
                if (animator.equals(fh1Var.e.K)) {
                    fh1Var.e.K = null;
                    return;
                }
                return;
            case 26:
                xh1 xh1Var = (xh1) obj;
                xh1Var.d = null;
                xh1Var.f39624a = null;
                xh1Var.f39625b = false;
                xh1Var.f39627f.f31610c.setAllowDrawCursor(true);
                return;
            case 27:
                ni.i iVar = (ni.i) obj;
                ((oj1) iVar.f15263b).getClass();
                ((oj1) iVar.f15263b).f36237c.setVisibility(4);
                return;
            case 28:
                ((org.telegram.ui.web.d1) obj).f38916s.setVisibility(8);
                return;
            default:
                pg.d0 d0Var = (pg.d0) obj;
                d0Var.f40834a.getPainting().c(null, d0Var.f40834a.getCurrentColor(), true, null);
                d0Var.f40848r = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32847a) {
            case 2:
                wt0 wt0Var = (wt0) this.f32848b;
                wt0Var.f39391b.U0.setVisibility(0);
                wt0Var.f39391b.C1.setVisibility(0);
                return;
            case 3:
                return;
            case 14:
                ((a11) this.f32848b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
