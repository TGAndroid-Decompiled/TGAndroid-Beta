package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class dp0 extends AnimatorListenerAdapter {
    public final int f37096a;
    public final Object f37097b;

    public dp0(Object obj, int i10) {
        this.f37096a = i10;
        this.f37097b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37096a) {
            case 2:
                ((PhotoViewer) ((org.telegram.ui.Components.vl0) this.f37097b).f31920c).A2 = null;
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
        int i10 = this.f37096a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f37097b;
        switch (i10) {
            case 0:
                zp0 zp0Var = (zp0) obj;
                kc kcVar = zp0Var.X;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) zp0Var.X.getParent()).removeView(zp0Var.X);
                    }
                    zp0Var.X = null;
                }
                zp0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 1:
                cr0 cr0Var = (cr0) obj;
                fr0 fr0Var = cr0Var.D0;
                dr0[] dr0VarArr = fr0Var.f37785n;
                fr0Var.f37786r = null;
                if (fr0Var.f37788w) {
                    dr0VarArr[1].setVisibility(8);
                } else {
                    dr0 dr0Var = dr0VarArr[0];
                    dr0VarArr[0] = dr0VarArr[1];
                    dr0VarArr[1] = dr0Var;
                    dr0Var.setVisibility(8);
                    if (fr0Var.f37785n[0].f37109e == fr0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fr0Var.f37783e = z10;
                    fr0Var.h.j(1.0f, fr0Var.f37785n[0].f37109e);
                }
                fr0Var.f37787s = false;
                cr0Var.f36844y0 = false;
                cr0Var.f36843x0 = false;
                kVar = ((org.telegram.ui.ActionBar.m2) fr0Var).actionBar;
                kVar.setEnabled(true);
                fr0Var.h.setEnabled(true);
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.vl0) obj).f31920c;
                if (photoViewer.A2 != null) {
                    sk0 sk0Var = new sk0(this, 18);
                    photoViewer.I2 = sk0Var;
                    AndroidUtilities.runOnUIThread(sk0Var, 860L);
                    return;
                }
                return;
            case 3:
                wt0 wt0Var = (wt0) obj;
                PhotoViewer photoViewer2 = wt0Var.f43909b;
                lg.p pVar = photoViewer2.C1.f32682b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f15611a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f32682b.J = true;
                photoViewer2.f34066p6 = null;
                photoViewer2.f34110u4 = wt0Var.f43908a;
                ci.h4 h4Var = photoViewer2.f1().L;
                if (photoViewer2.f34110u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h4Var.b(z11);
                ci.h4 h4Var2 = photoViewer2.K1;
                if (h4Var2 != null) {
                    if (photoViewer2.f34110u4 != 3) {
                        z13 = true;
                    }
                    h4Var2.b(z13);
                }
                if (photoViewer2.f34110u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f34058o6 = -1;
                photoViewer2.f33972e6 = 1.0f;
                photoViewer2.f33933a6 = 1.0f;
                photoViewer2.f33953c6 = 0.0f;
                photoViewer2.f33962d6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.f34099t2 = true;
                photoViewer2.f33966e0.invalidate();
                return;
            case 4:
                xt0 xt0Var = (xt0) obj;
                PhotoViewer photoViewer3 = xt0Var.f44215b;
                photoViewer3.I1.f28392i0.setVisibility(0);
                photoViewer3.f34066p6 = null;
                photoViewer3.f34110u4 = xt0Var.f44214a;
                ci.h4 h4Var3 = photoViewer3.f1().L;
                if (photoViewer3.f34110u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h4Var3.b(z12);
                ci.h4 h4Var4 = photoViewer3.K1;
                if (h4Var4 != null) {
                    if (photoViewer3.f34110u4 != 3) {
                        z14 = true;
                    }
                    h4Var4.b(z14);
                }
                if (photoViewer3.f34110u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f34058o6 = -1;
                photoViewer3.f33972e6 = 1.0f;
                photoViewer3.f33933a6 = 1.0f;
                photoViewer3.f33953c6 = 0.0f;
                photoViewer3.f33962d6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.f34099t2 = true;
                photoViewer3.f33966e0.invalidate();
                return;
            case 5:
                ((PhotoViewer) ((bu0) obj).f36493q0).y3[0].setTag(null);
                return;
            case 6:
                ((cu0) obj).d.T1.f40655k0 = 1.0f;
                return;
            case 7:
                PhotoViewer photoViewer4 = ((cu0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f40655k0 = 1.0f;
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new sk0(this, 20));
                return;
            case 9:
                st0 st0Var = (st0) obj;
                if (animator.equals(st0Var.f41887c.U7)) {
                    st0Var.f41887c.U7 = null;
                    return;
                }
                return;
            case 10:
                av0 av0Var = (av0) obj;
                if (av0Var.f36218e == animator) {
                    av0Var.f36217c[1].setVisibility(8);
                    av0Var.f36218e = null;
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
                premiumPreviewFragment.f34193d0.removeView(premiumPreviewFragment.f34210r0);
                premiumPreviewFragment.f34210r0 = null;
                super.onAnimationEnd(animator);
                return;
            case 14:
                ((ProfileActivity) ((org.telegram.ui.Components.vl0) obj).f31920c).D5 = null;
                return;
            case 15:
                y01 y01Var = (y01) obj;
                if (!y01Var.E) {
                    y01Var.setVisibility(8);
                    return;
                }
                return;
            case 16:
                u11 u11Var = (u11) obj;
                if (animator.equals(u11Var.f42349c)) {
                    u11Var.f42349c = null;
                    return;
                }
                return;
            case 17:
                c31 c31Var = (c31) obj;
                ci.tb tbVar = c31Var.O;
                if (tbVar != null) {
                    if (tbVar.getParent() != null) {
                        ((ViewGroup) c31Var.O.getParent()).removeView(c31Var.O);
                    }
                    c31Var.O = null;
                }
                c31Var.N = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                ((y41) obj).d.f34475a0.f40655k0 = 1.0f;
                return;
            case 19:
                SecretMediaViewer secretMediaViewer = ((y41) obj).d;
                secretMediaViewer.f34475a0.setVisibility(4);
                secretMediaViewer.f34475a0.f40655k0 = 1.0f;
                return;
            case 20:
                j71 j71Var = ((z51) obj).f44622e;
                j71Var.S0.G = 0.0f;
                j71Var.S0 = null;
                j71Var.f38928h0.invalidate();
                return;
            case 21:
                zg.d0.a();
                j71 j71Var2 = (j71) obj;
                g61 g61Var = j71Var2.f38928h0;
                g61 g61Var2 = j71Var2.f38928h0;
                g61Var.setLayerType(0, null);
                a61 a61Var = j71Var2.f38924f0;
                a61Var.setLayerType(0, null);
                j71Var2.f38921e0.setLayerType(0, null);
                j71Var2.f38913b0.setLayerType(0, null);
                org.telegram.ui.Components.ao aoVar = j71Var2.f38939n0;
                if (aoVar != null) {
                    aoVar.setLayerType(0, null);
                }
                View view = j71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                a61Var.b();
                j71Var2.f38918d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                j71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new mz0(globalInstance, 14));
                j71Var2.h();
                j71Var2.E(1.0f);
                for (int i11 = 0; i11 < g61Var2.getChildCount(); i11++) {
                    View childAt = g61Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < j71Var2.f38918d0.f31306b.getChildCount(); i12++) {
                    View childAt2 = j71Var2.f38918d0.f31306b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                j71Var2.f38918d0.f31306b.invalidate();
                j71Var2.f38934k0.invalidate();
                g61Var2.invalidate();
                return;
            case 22:
                ((ab1) obj).f35998b0.setVisibility(8);
                return;
            case 23:
                wd1 wd1Var = ((kd1) obj).f39340a;
                if (!wd1Var.f43403p1.a()) {
                    wd1Var.R1.setVisibility(8);
                    return;
                }
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((ye1) obj).f44380a = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((cg1) obj).setScrollEnabled(true);
                return;
            case 26:
                gh1 gh1Var = (gh1) obj;
                if (animator.equals(gh1Var.d.K)) {
                    gh1Var.d.K = null;
                    return;
                }
                return;
            case 27:
                yh1 yh1Var = (yh1) obj;
                yh1Var.d = null;
                yh1Var.f44467a = null;
                yh1Var.f44468b = false;
                yh1Var.f44471f.f34656c.setAllowDrawCursor(true);
                return;
            case 28:
                ((org.telegram.ui.Wallet.z2) obj).K = null;
                return;
            default:
                ((org.telegram.ui.Wallet.f3) obj).f();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37096a) {
            case 3:
                wt0 wt0Var = (wt0) this.f37097b;
                wt0Var.f43909b.U0.setVisibility(0);
                wt0Var.f43909b.C1.setVisibility(0);
                return;
            case 4:
                return;
            case 15:
                ((y01) this.f37097b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
