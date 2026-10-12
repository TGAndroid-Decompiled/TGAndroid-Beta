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
    public final int f38112a;
    public final Object f38113b;

    public gp0(Object obj, int i10) {
        this.f38112a = i10;
        this.f38113b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38112a) {
            case 2:
                ((PhotoViewer) ((org.telegram.ui.Components.am0) this.f38113b).f24437c).A2 = null;
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
        int i10 = this.f38112a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f38113b;
        switch (i10) {
            case 0:
                cq0 cq0Var = (cq0) obj;
                pc pcVar = cq0Var.X;
                if (pcVar != null) {
                    if (pcVar.getParent() != null) {
                        ((ViewGroup) cq0Var.X.getParent()).removeView(cq0Var.X);
                    }
                    cq0Var.X = null;
                }
                cq0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 1:
                fr0 fr0Var = (fr0) obj;
                ir0 ir0Var = fr0Var.D0;
                gr0[] gr0VarArr = ir0Var.f38979n;
                ir0Var.f38980r = null;
                if (ir0Var.f38982w) {
                    gr0VarArr[1].setVisibility(8);
                } else {
                    gr0 gr0Var = gr0VarArr[0];
                    gr0VarArr[0] = gr0VarArr[1];
                    gr0VarArr[1] = gr0Var;
                    gr0Var.setVisibility(8);
                    if (ir0Var.f38979n[0].f38125e == ir0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ir0Var.f38977e = z10;
                    ir0Var.h.j(1.0f, ir0Var.f38979n[0].f38125e);
                }
                ir0Var.f38981s = false;
                fr0Var.f37831y0 = false;
                fr0Var.f37830x0 = false;
                kVar = ((org.telegram.ui.ActionBar.m2) ir0Var).actionBar;
                kVar.setEnabled(true);
                ir0Var.h.setEnabled(true);
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.am0) obj).f24437c;
                if (photoViewer.A2 != null) {
                    uk0 uk0Var = new uk0(this, 18);
                    photoViewer.I2 = uk0Var;
                    AndroidUtilities.runOnUIThread(uk0Var, 860L);
                    return;
                }
                return;
            case 3:
                yt0 yt0Var = (yt0) obj;
                PhotoViewer photoViewer2 = yt0Var.f44558b;
                lg.p pVar = photoViewer2.C1.f33342b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f15318a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f33342b.J = true;
                photoViewer2.f33841p6 = null;
                photoViewer2.f33885u4 = yt0Var.f44557a;
                ci.h4 h4Var = photoViewer2.f1().L;
                if (photoViewer2.f33885u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h4Var.b(z11);
                ci.h4 h4Var2 = photoViewer2.K1;
                if (h4Var2 != null) {
                    if (photoViewer2.f33885u4 != 3) {
                        z13 = true;
                    }
                    h4Var2.b(z13);
                }
                if (photoViewer2.f33885u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f33833o6 = -1;
                photoViewer2.f33747e6 = 1.0f;
                photoViewer2.f33708a6 = 1.0f;
                photoViewer2.f33728c6 = 0.0f;
                photoViewer2.f33737d6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.f33874t2 = true;
                photoViewer2.f33741e0.invalidate();
                return;
            case 4:
                zt0 zt0Var = (zt0) obj;
                PhotoViewer photoViewer3 = zt0Var.f44917b;
                photoViewer3.I1.f29188i0.setVisibility(0);
                photoViewer3.f33841p6 = null;
                photoViewer3.f33885u4 = zt0Var.f44916a;
                ci.h4 h4Var3 = photoViewer3.f1().L;
                if (photoViewer3.f33885u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h4Var3.b(z12);
                ci.h4 h4Var4 = photoViewer3.K1;
                if (h4Var4 != null) {
                    if (photoViewer3.f33885u4 != 3) {
                        z14 = true;
                    }
                    h4Var4.b(z14);
                }
                if (photoViewer3.f33885u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f33833o6 = -1;
                photoViewer3.f33747e6 = 1.0f;
                photoViewer3.f33708a6 = 1.0f;
                photoViewer3.f33728c6 = 0.0f;
                photoViewer3.f33737d6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.f33874t2 = true;
                photoViewer3.f33741e0.invalidate();
                return;
            case 5:
                ((PhotoViewer) ((du0) obj).f36906q0).y3[0].setTag(null);
                return;
            case 6:
                ((eu0) obj).d.T1.f41730k0 = 1.0f;
                return;
            case 7:
                PhotoViewer photoViewer4 = ((eu0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f41730k0 = 1.0f;
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new uk0(this, 20));
                return;
            case 9:
                vt0 vt0Var = (vt0) obj;
                if (animator.equals(vt0Var.f42850c.U7)) {
                    vt0Var.f42850c.U7 = null;
                    return;
                }
                return;
            case 10:
                dv0 dv0Var = (dv0) obj;
                if (dv0Var.f36910e == animator) {
                    dv0Var.f36909c[1].setVisibility(8);
                    dv0Var.f36910e = null;
                    return;
                }
                return;
            case 11:
                sv0 sv0Var = (sv0) obj;
                if (sv0Var.C != null) {
                    sv0Var.C = null;
                    sv0Var.b();
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
                premiumPreviewFragment.f33968d0.removeView(premiumPreviewFragment.f33985r0);
                premiumPreviewFragment.f33985r0 = null;
                super.onAnimationEnd(animator);
                return;
            case 14:
                ((ProfileActivity) ((org.telegram.ui.Components.am0) obj).f24437c).D5 = null;
                return;
            case 15:
                b11 b11Var = (b11) obj;
                if (!b11Var.E) {
                    b11Var.setVisibility(8);
                    return;
                }
                return;
            case 16:
                x11 x11Var = (x11) obj;
                if (animator.equals(x11Var.f43717c)) {
                    x11Var.f43717c = null;
                    return;
                }
                return;
            case 17:
                f31 f31Var = (f31) obj;
                ci.tb tbVar = f31Var.O;
                if (tbVar != null) {
                    if (tbVar.getParent() != null) {
                        ((ViewGroup) f31Var.O.getParent()).removeView(f31Var.O);
                    }
                    f31Var.O = null;
                }
                f31Var.N = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                ((b51) obj).d.f34250a0.f41730k0 = 1.0f;
                return;
            case 19:
                SecretMediaViewer secretMediaViewer = ((b51) obj).d;
                secretMediaViewer.f34250a0.setVisibility(4);
                secretMediaViewer.f34250a0.f41730k0 = 1.0f;
                return;
            case 20:
                n71 n71Var = ((d61) obj).f36665e;
                n71Var.S0.G = 0.0f;
                n71Var.S0 = null;
                n71Var.f40272h0.invalidate();
                return;
            case 21:
                zg.d0.a();
                n71 n71Var2 = (n71) obj;
                k61 k61Var = n71Var2.f40272h0;
                k61 k61Var2 = n71Var2.f40272h0;
                k61Var.setLayerType(0, null);
                e61 e61Var = n71Var2.f40268f0;
                e61Var.setLayerType(0, null);
                n71Var2.f40265e0.setLayerType(0, null);
                n71Var2.f40257b0.setLayerType(0, null);
                org.telegram.ui.Components.co coVar = n71Var2.f40283n0;
                if (coVar != null) {
                    coVar.setLayerType(0, null);
                }
                View view = n71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                e61Var.b();
                n71Var2.f40262d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                n71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new pz0(globalInstance, 14));
                n71Var2.h();
                n71Var2.E(1.0f);
                for (int i11 = 0; i11 < k61Var2.getChildCount(); i11++) {
                    View childAt = k61Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < n71Var2.f40262d0.f33139b.getChildCount(); i12++) {
                    View childAt2 = n71Var2.f40262d0.f33139b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                n71Var2.f40262d0.f33139b.invalidate();
                n71Var2.f40278k0.invalidate();
                k61Var2.invalidate();
                return;
            case 22:
                ((db1) obj).f36725b0.setVisibility(8);
                return;
            case 23:
                zd1 zd1Var = ((nd1) obj).f40387a;
                if (!zd1Var.f44773p1.a()) {
                    zd1Var.R1.setVisibility(8);
                    return;
                }
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((bf1) obj).f36154a = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((fg1) obj).setScrollEnabled(true);
                return;
            case 26:
                jh1 jh1Var = (jh1) obj;
                if (animator.equals(jh1Var.d.K)) {
                    jh1Var.d.K = null;
                    return;
                }
                return;
            case 27:
                bi1 bi1Var = (bi1) obj;
                bi1Var.d = null;
                bi1Var.f36179a = null;
                bi1Var.f36180b = false;
                bi1Var.f36183f.f34431c.setAllowDrawCursor(true);
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
        switch (this.f38112a) {
            case 3:
                yt0 yt0Var = (yt0) this.f38113b;
                yt0Var.f44558b.U0.setVisibility(0);
                yt0Var.f44558b.C1.setVisibility(0);
                return;
            case 4:
                return;
            case 15:
                ((b11) this.f38113b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
