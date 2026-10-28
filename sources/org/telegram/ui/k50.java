package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class k50 extends AnimatorListenerAdapter {
    public final int f40660a;
    public final Object f40661b;

    public k50(Object obj, int i10) {
        this.f40660a = i10;
        this.f40661b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40660a) {
            case 3:
                ((te0) this.f40661b).f43616s = null;
                return;
            case 10:
                ((PhotoViewer) ((org.telegram.ui.Components.ml0) this.f40661b).f30559c).A2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        boolean z12;
        int i10 = this.f40660a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f40661b;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                l50 l50Var = (l50) obj;
                l50Var.G = null;
                x50 x50Var = l50Var.L;
                x50Var.Q.invalidate();
                x50Var.a2.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
                viewGroup.invalidate();
                x50.J0(x50Var);
                l50Var.H.clear();
                l50Var.I.clear();
                return;
            case 1:
                x70 x70Var = (x70) obj;
                x70Var.f45618a = null;
                x70Var.f45619b = false;
                return;
            case 2:
                rc0 rc0Var = (rc0) obj;
                rc0Var.H = false;
                rc0Var.p0();
                return;
            case 3:
                te0 te0Var = (te0) obj;
                if (te0Var.f43616s != null && te0Var.f43614n != null) {
                    te0Var.f43615r.setVisibility(4);
                    te0Var.f43616s = null;
                    return;
                }
                return;
            case 4:
                ((xi0) obj).T.setVisibility(8);
                return;
            case 5:
                zj0 zj0Var = (zj0) obj;
                if (zj0Var.M >= 1.0f) {
                    zj0Var.f46294w.setVisibility(8);
                    return;
                }
                return;
            case 6:
                bk0 bk0Var = (bk0) obj;
                bk0Var.f38050f = 1.0f;
                bk0Var.invalidate();
                return;
            case 7:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
            case 8:
                tp0 tp0Var = (tp0) obj;
                mc mcVar = tp0Var.X;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) tp0Var.X.getParent()).removeView(tp0Var.X);
                    }
                    tp0Var.X = null;
                }
                tp0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 9:
                vq0 vq0Var = (vq0) obj;
                xq0 xq0Var = vq0Var.f44406s0;
                org.telegram.ui.ActionBar.q5[] q5VarArr = xq0Var.f45764n;
                xq0Var.f45765r = null;
                if (xq0Var.f45767w) {
                    q5VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.q5 q5Var = q5VarArr[0];
                    q5VarArr[0] = q5VarArr[1];
                    q5VarArr[1] = q5Var;
                    q5Var.setVisibility(8);
                    if (xq0Var.f45764n[0].f22990b == xq0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xq0Var.e = z10;
                    xq0Var.h.i(1.0f, xq0Var.f45764n[0].f22990b);
                }
                xq0Var.f45766s = false;
                vq0Var.f44401n0 = false;
                vq0Var.m0 = false;
                kVar = ((org.telegram.ui.ActionBar.r2) xq0Var).actionBar;
                kVar.setEnabled(true);
                xq0Var.h.setEnabled(true);
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ml0) obj).f30559c;
                if (photoViewer.A2 != null) {
                    nj0 nj0Var = new nj0(this, 20);
                    photoViewer.I2 = nj0Var;
                    AndroidUtilities.runOnUIThread(nj0Var, 860L);
                    return;
                }
                return;
            case 11:
                lt0 lt0Var = (lt0) obj;
                PhotoViewer photoViewer2 = lt0Var.f41262b;
                ng.p pVar = photoViewer2.C1.f31597b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f18842a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f31597b.J = true;
                photoViewer2.f35772p6 = null;
                photoViewer2.f35815u4 = lt0Var.f41261a;
                fi.z3 z3Var = photoViewer2.h1().L;
                if (photoViewer2.f35815u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z3Var.b(z11);
                fi.z3 z3Var2 = photoViewer2.K1;
                if (z3Var2 != null) {
                    if (photoViewer2.f35815u4 != 3) {
                        z13 = true;
                    }
                    z3Var2.b(z13);
                }
                if (photoViewer2.f35815u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f35763o6 = -1;
                photoViewer2.f35676e6 = 1.0f;
                photoViewer2.f35638a6 = 1.0f;
                photoViewer2.f35658c6 = 0.0f;
                photoViewer2.f35667d6 = 0.0f;
                photoViewer2.z3(1.0f);
                photoViewer2.f35804t2 = true;
                photoViewer2.f35670e0.invalidate();
                return;
            case 12:
                mt0 mt0Var = (mt0) obj;
                PhotoViewer photoViewer3 = mt0Var.f41569b;
                photoViewer3.I1.f28133i0.setVisibility(0);
                photoViewer3.f35772p6 = null;
                photoViewer3.f35815u4 = mt0Var.f41568a;
                fi.z3 z3Var3 = photoViewer3.h1().L;
                if (photoViewer3.f35815u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z3Var3.b(z12);
                fi.z3 z3Var4 = photoViewer3.K1;
                if (z3Var4 != null) {
                    if (photoViewer3.f35815u4 != 3) {
                        z14 = true;
                    }
                    z3Var4.b(z14);
                }
                if (photoViewer3.f35815u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f35763o6 = -1;
                photoViewer3.f35676e6 = 1.0f;
                photoViewer3.f35638a6 = 1.0f;
                photoViewer3.f35658c6 = 0.0f;
                photoViewer3.f35667d6 = 0.0f;
                photoViewer3.z3(1.0f);
                photoViewer3.f35804t2 = true;
                photoViewer3.f35670e0.invalidate();
                return;
            case 13:
                ((PhotoViewer) ((qt0) obj).f42790q0).y3[0].setTag(null);
                return;
            case 14:
                ((rt0) obj).d.T1.f38687k0 = 1.0f;
                return;
            case 15:
                PhotoViewer photoViewer4 = ((rt0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f38687k0 = 1.0f;
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new nj0(this, 22));
                return;
            case 17:
                it0 it0Var = (it0) obj;
                if (animator.equals(it0Var.f40270c.U7)) {
                    it0Var.f40270c.U7 = null;
                    return;
                }
                return;
            case 18:
                pu0 pu0Var = (pu0) obj;
                if (pu0Var.e == animator) {
                    pu0Var.f42505c[1].setVisibility(8);
                    pu0Var.e = null;
                    return;
                }
                return;
            case 19:
                ev0 ev0Var = (ev0) obj;
                if (ev0Var.C != null) {
                    ev0Var.C = null;
                    ev0Var.b();
                    return;
                }
                return;
            case 20:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    return;
                }
                return;
            case 21:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f35895d0.removeView(premiumPreviewFragment.f35914t0);
                premiumPreviewFragment.f35914t0 = null;
                super.onAnimationEnd(animator);
                return;
            case 22:
                ((oz0) obj).f42264b.J5 = null;
                return;
            case 23:
                m01 m01Var = (m01) obj;
                if (!m01Var.E) {
                    m01Var.setVisibility(8);
                    return;
                }
                return;
            case 24:
                j11 j11Var = (j11) obj;
                if (animator.equals(j11Var.d)) {
                    j11Var.d = null;
                    return;
                }
                return;
            case 25:
                ((u31) obj).d.f36176a0.f38687k0 = 1.0f;
                return;
            case 26:
                SecretMediaViewer secretMediaViewer = ((u31) obj).d;
                secretMediaViewer.f36176a0.setVisibility(4);
                secretMediaViewer.f36176a0.f38687k0 = 1.0f;
                return;
            case 27:
                f61 f61Var = ((v41) obj).e;
                f61Var.S0.G = 0.0f;
                f61Var.S0 = null;
                f61Var.f39202h0.invalidate();
                return;
            case 28:
                bh.m0.a();
                f61 f61Var2 = (f61) obj;
                c51 c51Var = f61Var2.f39202h0;
                c51 c51Var2 = f61Var2.f39202h0;
                c51Var.setLayerType(0, null);
                w41 w41Var = f61Var2.f39198f0;
                w41Var.setLayerType(0, null);
                f61Var2.f39195e0.setLayerType(0, null);
                f61Var2.f39188b0.setLayerType(0, null);
                org.telegram.ui.Components.vn vnVar = f61Var2.f39213n0;
                if (vnVar != null) {
                    vnVar.setLayerType(0, null);
                }
                View view = f61Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                w41Var.b();
                f61Var2.f39193d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                f61Var2.X1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new oy0(globalInstance, 16));
                f61Var2.h();
                f61Var2.E(1.0f);
                for (int i11 = 0; i11 < c51Var2.getChildCount(); i11++) {
                    View childAt = c51Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < f61Var2.f39193d0.f33435b.getChildCount(); i12++) {
                    View childAt2 = f61Var2.f39193d0.f33435b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                f61Var2.f39193d0.f33435b.invalidate();
                f61Var2.f39208k0.invalidate();
                c51Var2.invalidate();
                return;
            default:
                ((y91) obj).f45909a0.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40660a) {
            case 11:
                lt0 lt0Var = (lt0) this.f40661b;
                lt0Var.f41262b.U0.setVisibility(0);
                lt0Var.f41262b.C1.setVisibility(0);
                return;
            case 12:
                return;
            case 23:
                ((m01) this.f40661b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
