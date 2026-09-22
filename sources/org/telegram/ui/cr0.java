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
    public final int f32854a;
    public final Object f32855b;

    public cr0(Object obj, int i10) {
        this.f32854a = i10;
        this.f32855b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32854a) {
            case 1:
                ((PhotoViewer) ((org.telegram.ui.Components.pk0) this.f32855b).f27072c).A2 = null;
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
        int i10 = this.f32854a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f32855b;
        switch (i10) {
            case 0:
                dr0 dr0Var = (dr0) obj;
                gr0 gr0Var = dr0Var.D0;
                er0[] er0VarArr = gr0Var.f33927n;
                gr0Var.f33928r = null;
                if (gr0Var.f33930w) {
                    er0VarArr[1].setVisibility(8);
                } else {
                    er0 er0Var = er0VarArr[0];
                    er0VarArr[0] = er0VarArr[1];
                    er0VarArr[1] = er0Var;
                    er0Var.setVisibility(8);
                    if (gr0Var.f33927n[0].e == gr0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    gr0Var.e = z10;
                    gr0Var.h.j(1.0f, gr0Var.f33927n[0].e);
                }
                gr0Var.f33929s = false;
                dr0Var.f33076y0 = false;
                dr0Var.f33075x0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) gr0Var).actionBar;
                kVar.setEnabled(true);
                gr0Var.h.setEnabled(true);
                return;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.pk0) obj).f27072c;
                if (photoViewer.A2 != null) {
                    pl0 pl0Var = new pl0(this, 17);
                    photoViewer.I2 = pl0Var;
                    AndroidUtilities.runOnUIThread(pl0Var, 860L);
                    return;
                }
                return;
            case 2:
                wt0 wt0Var = (wt0) obj;
                PhotoViewer photoViewer2 = wt0Var.f39387b;
                lg.p pVar = photoViewer2.C1.f28379b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f14098a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f28379b.J = true;
                photoViewer2.f31034p6 = null;
                photoViewer2.f31078u4 = wt0Var.f39386a;
                ci.j4 j4Var = photoViewer2.f1().L;
                if (photoViewer2.f31078u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j4Var.b(z11);
                ci.j4 j4Var2 = photoViewer2.K1;
                if (j4Var2 != null) {
                    if (photoViewer2.f31078u4 != 3) {
                        z13 = true;
                    }
                    j4Var2.b(z13);
                }
                if (photoViewer2.f31078u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f31026o6 = -1;
                photoViewer2.f30940e6 = 1.0f;
                photoViewer2.f30902a6 = 1.0f;
                photoViewer2.f30922c6 = 0.0f;
                photoViewer2.f30931d6 = 0.0f;
                photoViewer2.v3(1.0f);
                photoViewer2.f31067t2 = true;
                photoViewer2.f30934e0.invalidate();
                return;
            case 3:
                xt0 xt0Var = (xt0) obj;
                PhotoViewer photoViewer3 = xt0Var.f39691b;
                photoViewer3.I1.f25319i0.setVisibility(0);
                photoViewer3.f31034p6 = null;
                photoViewer3.f31078u4 = xt0Var.f39690a;
                ci.j4 j4Var3 = photoViewer3.f1().L;
                if (photoViewer3.f31078u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                j4Var3.b(z12);
                ci.j4 j4Var4 = photoViewer3.K1;
                if (j4Var4 != null) {
                    if (photoViewer3.f31078u4 != 3) {
                        z14 = true;
                    }
                    j4Var4.b(z14);
                }
                if (photoViewer3.f31078u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f31026o6 = -1;
                photoViewer3.f30940e6 = 1.0f;
                photoViewer3.f30902a6 = 1.0f;
                photoViewer3.f30922c6 = 0.0f;
                photoViewer3.f30931d6 = 0.0f;
                photoViewer3.v3(1.0f);
                photoViewer3.f31067t2 = true;
                photoViewer3.f30934e0.invalidate();
                return;
            case 4:
                ((PhotoViewer) ((bu0) obj).f32580q0).y3[0].setTag(null);
                return;
            case 5:
                ((cu0) obj).d.T1.f36353k0 = 1.0f;
                return;
            case 6:
                PhotoViewer photoViewer4 = ((cu0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f36353k0 = 1.0f;
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new pl0(this, 19));
                return;
            case 8:
                tt0 tt0Var = (tt0) obj;
                if (animator.equals(tt0Var.f37734c.U7)) {
                    tt0Var.f37734c.U7 = null;
                    return;
                }
                return;
            case 9:
                av0 av0Var = (av0) obj;
                if (av0Var.e == animator) {
                    av0Var.f31943c[1].setVisibility(8);
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
                premiumPreviewFragment.f31158d0.removeView(premiumPreviewFragment.f31174r0);
                premiumPreviewFragment.f31174r0 = null;
                super.onAnimationEnd(animator);
                return;
            case 13:
                ((ProfileActivity) ((org.telegram.ui.Components.pk0) obj).f27072c).D5 = null;
                return;
            case 14:
                b11 b11Var = (b11) obj;
                if (!b11Var.E) {
                    b11Var.setVisibility(8);
                    return;
                }
                return;
            case 15:
                x11 x11Var = (x11) obj;
                if (animator.equals(x11Var.f39465c)) {
                    x11Var.f39465c = null;
                    return;
                }
                return;
            case 16:
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
            case 17:
                ((x41) obj).d.f31434a0.f36353k0 = 1.0f;
                return;
            case 18:
                SecretMediaViewer secretMediaViewer = ((x41) obj).d;
                secretMediaViewer.f31434a0.setVisibility(4);
                secretMediaViewer.f31434a0.f36353k0 = 1.0f;
                return;
            case 19:
                h71 h71Var = ((x51) obj).e;
                h71Var.S0.G = 0.0f;
                h71Var.S0 = null;
                h71Var.f34132h0.invalidate();
                return;
            case 20:
                zg.f0.a();
                h71 h71Var2 = (h71) obj;
                e61 e61Var = h71Var2.f34132h0;
                e61 e61Var2 = h71Var2.f34132h0;
                e61Var.setLayerType(0, null);
                y51 y51Var = h71Var2.f34128f0;
                y51Var.setLayerType(0, null);
                h71Var2.f34125e0.setLayerType(0, null);
                h71Var2.f34118b0.setLayerType(0, null);
                org.telegram.ui.Components.kn knVar = h71Var2.f34143n0;
                if (knVar != null) {
                    knVar.setLayerType(0, null);
                }
                View view = h71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                y51Var.b();
                h71Var2.f34123d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                h71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new f01(globalInstance, 13));
                h71Var2.h();
                h71Var2.E(1.0f);
                for (int i11 = 0; i11 < e61Var2.getChildCount(); i11++) {
                    View childAt = e61Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < h71Var2.f34123d0.f26179b.getChildCount(); i12++) {
                    View childAt2 = h71Var2.f34123d0.f26179b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                h71Var2.f34123d0.f26179b.invalidate();
                h71Var2.f34138k0.invalidate();
                e61Var2.invalidate();
                return;
            case 21:
                ((za1) obj).f40111b0.setVisibility(8);
                return;
            case 22:
                wd1 wd1Var = ((kd1) obj).f35129a;
                if (!wd1Var.f38829p1.a()) {
                    wd1Var.R1.setVisibility(8);
                    return;
                }
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((ye1) obj).f39828a = null;
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((cg1) obj).setScrollEnabled(true);
                return;
            case 25:
                gh1 gh1Var = (gh1) obj;
                if (animator.equals(gh1Var.e.K)) {
                    gh1Var.e.K = null;
                    return;
                }
                return;
            case 26:
                yh1 yh1Var = (yh1) obj;
                yh1Var.d = null;
                yh1Var.f39881a = null;
                yh1Var.f39882b = false;
                yh1Var.f39884f.f31607c.setAllowDrawCursor(true);
                return;
            case 27:
                ni.i iVar = (ni.i) obj;
                ((pj1) iVar.f15261b).getClass();
                ((pj1) iVar.f15261b).f36593c.setVisibility(4);
                return;
            case 28:
                ((org.telegram.ui.web.d1) obj).f38922s.setVisibility(8);
                return;
            default:
                pg.d0 d0Var = (pg.d0) obj;
                d0Var.f40830a.getPainting().c(null, d0Var.f40830a.getCurrentColor(), true, null);
                d0Var.f40844r = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32854a) {
            case 2:
                wt0 wt0Var = (wt0) this.f32855b;
                wt0Var.f39387b.U0.setVisibility(0);
                wt0Var.f39387b.C1.setVisibility(0);
                return;
            case 3:
                return;
            case 14:
                ((b11) this.f32855b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
