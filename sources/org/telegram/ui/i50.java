package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class i50 extends AnimatorListenerAdapter {
    public final int f40146a;
    public final Object f40147b;

    public i50(Object obj, int i10) {
        this.f40146a = i10;
        this.f40147b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40146a) {
            case 3:
                ((re0) this.f40147b).f43128s = null;
                return;
            case 10:
                ((PhotoViewer) ((org.telegram.ui.Components.ll0) this.f40147b).f30226c).A2 = null;
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
        int i10 = this.f40146a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f40147b;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                j50 j50Var = (j50) obj;
                j50Var.G = null;
                v50 v50Var = j50Var.L;
                v50Var.Q.invalidate();
                v50Var.a2.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
                viewGroup.invalidate();
                v50.J0(v50Var);
                j50Var.H.clear();
                j50Var.I.clear();
                return;
            case 1:
                v70 v70Var = (v70) obj;
                v70Var.f44727a = null;
                v70Var.f44728b = false;
                return;
            case 2:
                pc0 pc0Var = (pc0) obj;
                pc0Var.H = false;
                pc0Var.p0();
                return;
            case 3:
                re0 re0Var = (re0) obj;
                if (re0Var.f43128s != null && re0Var.f43126n != null) {
                    re0Var.f43127r.setVisibility(4);
                    re0Var.f43128s = null;
                    return;
                }
                return;
            case 4:
                ((vi0) obj).T.setVisibility(8);
                return;
            case 5:
                xj0 xj0Var = (xj0) obj;
                if (xj0Var.M >= 1.0f) {
                    xj0Var.f45787w.setVisibility(8);
                    return;
                }
                return;
            case 6:
                zj0 zj0Var = (zj0) obj;
                zj0Var.f46305f = 1.0f;
                zj0Var.invalidate();
                return;
            case 7:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
            case 8:
                rp0 rp0Var = (rp0) obj;
                mc mcVar = rp0Var.X;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) rp0Var.X.getParent()).removeView(rp0Var.X);
                    }
                    rp0Var.X = null;
                }
                rp0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 9:
                tq0 tq0Var = (tq0) obj;
                vq0 vq0Var = tq0Var.f43891s0;
                org.telegram.ui.ActionBar.q5[] q5VarArr = vq0Var.f44886n;
                vq0Var.f44887r = null;
                if (vq0Var.f44889w) {
                    q5VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.q5 q5Var = q5VarArr[0];
                    q5VarArr[0] = q5VarArr[1];
                    q5VarArr[1] = q5Var;
                    q5Var.setVisibility(8);
                    if (vq0Var.f44886n[0].f22987b == vq0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    vq0Var.e = z10;
                    vq0Var.h.i(1.0f, vq0Var.f44886n[0].f22987b);
                }
                vq0Var.f44888s = false;
                tq0Var.f43886n0 = false;
                tq0Var.m0 = false;
                kVar = ((org.telegram.ui.ActionBar.r2) vq0Var).actionBar;
                kVar.setEnabled(true);
                vq0Var.h.setEnabled(true);
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ll0) obj).f30226c;
                if (photoViewer.A2 != null) {
                    lj0 lj0Var = new lj0(this, 20);
                    photoViewer.I2 = lj0Var;
                    AndroidUtilities.runOnUIThread(lj0Var, 860L);
                    return;
                }
                return;
            case 11:
                jt0 jt0Var = (jt0) obj;
                PhotoViewer photoViewer2 = jt0Var.f40744b;
                ng.p pVar = photoViewer2.C1.f31283b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f18843a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f31283b.J = true;
                photoViewer2.f35745p6 = null;
                photoViewer2.f35788u4 = jt0Var.f40743a;
                fi.z3 z3Var = photoViewer2.g1().L;
                if (photoViewer2.f35788u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z3Var.b(z11);
                fi.z3 z3Var2 = photoViewer2.K1;
                if (z3Var2 != null) {
                    if (photoViewer2.f35788u4 != 3) {
                        z13 = true;
                    }
                    z3Var2.b(z13);
                }
                if (photoViewer2.f35788u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f35736o6 = -1;
                photoViewer2.f35649e6 = 1.0f;
                photoViewer2.f35611a6 = 1.0f;
                photoViewer2.f35631c6 = 0.0f;
                photoViewer2.f35640d6 = 0.0f;
                photoViewer2.y3(1.0f);
                photoViewer2.f35777t2 = true;
                photoViewer2.f35643e0.invalidate();
                return;
            case 12:
                kt0 kt0Var = (kt0) obj;
                PhotoViewer photoViewer3 = kt0Var.f41068b;
                photoViewer3.I1.f27838i0.setVisibility(0);
                photoViewer3.f35745p6 = null;
                photoViewer3.f35788u4 = kt0Var.f41067a;
                fi.z3 z3Var3 = photoViewer3.g1().L;
                if (photoViewer3.f35788u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z3Var3.b(z12);
                fi.z3 z3Var4 = photoViewer3.K1;
                if (z3Var4 != null) {
                    if (photoViewer3.f35788u4 != 3) {
                        z14 = true;
                    }
                    z3Var4.b(z14);
                }
                if (photoViewer3.f35788u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f35736o6 = -1;
                photoViewer3.f35649e6 = 1.0f;
                photoViewer3.f35611a6 = 1.0f;
                photoViewer3.f35631c6 = 0.0f;
                photoViewer3.f35640d6 = 0.0f;
                photoViewer3.y3(1.0f);
                photoViewer3.f35777t2 = true;
                photoViewer3.f35643e0.invalidate();
                return;
            case 13:
                ((PhotoViewer) ((ot0) obj).f42286q0).y3[0].setTag(null);
                return;
            case 14:
                ((pt0) obj).d.T1.f38167k0 = 1.0f;
                return;
            case 15:
                PhotoViewer photoViewer4 = ((pt0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f38167k0 = 1.0f;
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new lj0(this, 22));
                return;
            case 17:
                gt0 gt0Var = (gt0) obj;
                if (animator.equals(gt0Var.f39779c.U7)) {
                    gt0Var.f39779c.U7 = null;
                    return;
                }
                return;
            case 18:
                nu0 nu0Var = (nu0) obj;
                if (nu0Var.e == animator) {
                    nu0Var.f41999c[1].setVisibility(8);
                    nu0Var.e = null;
                    return;
                }
                return;
            case 19:
                cv0 cv0Var = (cv0) obj;
                if (cv0Var.C != null) {
                    cv0Var.C = null;
                    cv0Var.b();
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
                premiumPreviewFragment.f35868d0.removeView(premiumPreviewFragment.f35887t0);
                premiumPreviewFragment.f35887t0 = null;
                super.onAnimationEnd(animator);
                return;
            case 22:
                ((mz0) obj).f41726b.J5 = null;
                return;
            case 23:
                k01 k01Var = (k01) obj;
                if (!k01Var.E) {
                    k01Var.setVisibility(8);
                    return;
                }
                return;
            case 24:
                h11 h11Var = (h11) obj;
                if (animator.equals(h11Var.d)) {
                    h11Var.d = null;
                    return;
                }
                return;
            case 25:
                ((r31) obj).d.f36149a0.f38167k0 = 1.0f;
                return;
            case 26:
                SecretMediaViewer secretMediaViewer = ((r31) obj).d;
                secretMediaViewer.f36149a0.setVisibility(4);
                secretMediaViewer.f36149a0.f38167k0 = 1.0f;
                return;
            case 27:
                c61 c61Var = ((s41) obj).e;
                c61Var.S0.G = 0.0f;
                c61Var.S0 = null;
                c61Var.f38296h0.invalidate();
                return;
            case 28:
                bh.m0.a();
                c61 c61Var2 = (c61) obj;
                z41 z41Var = c61Var2.f38296h0;
                z41 z41Var2 = c61Var2.f38296h0;
                z41Var.setLayerType(0, null);
                t41 t41Var = c61Var2.f38292f0;
                t41Var.setLayerType(0, null);
                c61Var2.f38289e0.setLayerType(0, null);
                c61Var2.f38282b0.setLayerType(0, null);
                org.telegram.ui.Components.vn vnVar = c61Var2.f38307n0;
                if (vnVar != null) {
                    vnVar.setLayerType(0, null);
                }
                View view = c61Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                t41Var.b();
                c61Var2.f38287d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                c61Var2.X1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new my0(globalInstance, 16));
                c61Var2.h();
                c61Var2.E(1.0f);
                for (int i11 = 0; i11 < z41Var2.getChildCount(); i11++) {
                    View childAt = z41Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < c61Var2.f38287d0.f33111b.getChildCount(); i12++) {
                    View childAt2 = c61Var2.f38287d0.f33111b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                c61Var2.f38287d0.f33111b.invalidate();
                c61Var2.f38302k0.invalidate();
                z41Var2.invalidate();
                return;
            default:
                ((w91) obj).f45018a0.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40146a) {
            case 11:
                jt0 jt0Var = (jt0) this.f40147b;
                jt0Var.f40744b.U0.setVisibility(0);
                jt0Var.f40744b.C1.setVisibility(0);
                return;
            case 12:
                return;
            case 23:
                ((k01) this.f40147b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
