package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class lj0 extends AnimatorListenerAdapter {
    public final int f38030a;
    public final Object f38031b;

    public lj0(Object obj, int i10) {
        this.f38030a = i10;
        this.f38031b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38030a) {
            case 5:
                ((PhotoViewer) ((org.telegram.ui.Components.ql0) this.f38031b).f28643c).A2 = null;
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
        int i10 = this.f38030a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f38031b;
        switch (i10) {
            case 0:
                ((qj0) obj).T.setVisibility(8);
                return;
            case 1:
                kk0 kk0Var = (kk0) obj;
                kk0Var.f37677f = 1.0f;
                kk0Var.invalidate();
                return;
            case 2:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
            case 3:
                gq0 gq0Var = (gq0) obj;
                rc rcVar = gq0Var.X;
                if (rcVar != null) {
                    if (rcVar.getParent() != null) {
                        ((ViewGroup) gq0Var.X.getParent()).removeView(gq0Var.X);
                    }
                    gq0Var.X = null;
                }
                gq0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 4:
                jr0 jr0Var = (jr0) obj;
                mr0 mr0Var = jr0Var.D0;
                kr0[] kr0VarArr = mr0Var.f38322n;
                mr0Var.f38323r = null;
                if (mr0Var.f38325w) {
                    kr0VarArr[1].setVisibility(8);
                } else {
                    kr0 kr0Var = kr0VarArr[0];
                    kr0VarArr[0] = kr0VarArr[1];
                    kr0VarArr[1] = kr0Var;
                    kr0Var.setVisibility(8);
                    if (mr0Var.f38322n[0].e == mr0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    mr0Var.e = z10;
                    mr0Var.h.j(1.0f, mr0Var.f38322n[0].e);
                }
                mr0Var.f38324s = false;
                jr0Var.f37425y0 = false;
                jr0Var.f37424x0 = false;
                kVar = ((org.telegram.ui.ActionBar.m2) mr0Var).actionBar;
                kVar.setEnabled(true);
                mr0Var.h.setEnabled(true);
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ql0) obj).f28643c;
                if (photoViewer.A2 != null) {
                    yk0 yk0Var = new yk0(this, 18);
                    photoViewer.I2 = yk0Var;
                    AndroidUtilities.runOnUIThread(yk0Var, 860L);
                    return;
                }
                return;
            case 6:
                du0 du0Var = (du0) obj;
                PhotoViewer photoViewer2 = du0Var.f35392b;
                mg.p pVar = photoViewer2.C1.f29369b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f15824a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f29369b.J = true;
                photoViewer2.f32327p6 = null;
                photoViewer2.f32371u4 = du0Var.f35391a;
                di.h4 h4Var = photoViewer2.f1().L;
                if (photoViewer2.f32371u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h4Var.b(z11);
                di.h4 h4Var2 = photoViewer2.K1;
                if (h4Var2 != null) {
                    if (photoViewer2.f32371u4 != 3) {
                        z13 = true;
                    }
                    h4Var2.b(z13);
                }
                if (photoViewer2.f32371u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f32319o6 = -1;
                photoViewer2.f32232e6 = 1.0f;
                photoViewer2.f32194a6 = 1.0f;
                photoViewer2.f32214c6 = 0.0f;
                photoViewer2.f32223d6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.f32360t2 = true;
                photoViewer2.f32226e0.invalidate();
                return;
            case 7:
                eu0 eu0Var = (eu0) obj;
                PhotoViewer photoViewer3 = eu0Var.f35675b;
                photoViewer3.I1.f25955i0.setVisibility(0);
                photoViewer3.f32327p6 = null;
                photoViewer3.f32371u4 = eu0Var.f35674a;
                di.h4 h4Var3 = photoViewer3.f1().L;
                if (photoViewer3.f32371u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h4Var3.b(z12);
                di.h4 h4Var4 = photoViewer3.K1;
                if (h4Var4 != null) {
                    if (photoViewer3.f32371u4 != 3) {
                        z14 = true;
                    }
                    h4Var4.b(z14);
                }
                if (photoViewer3.f32371u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f32319o6 = -1;
                photoViewer3.f32232e6 = 1.0f;
                photoViewer3.f32194a6 = 1.0f;
                photoViewer3.f32214c6 = 0.0f;
                photoViewer3.f32223d6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.f32360t2 = true;
                photoViewer3.f32226e0.invalidate();
                return;
            case 8:
                ((PhotoViewer) ((iu0) obj).f37204q0).y3[0].setTag(null);
                return;
            case 9:
                ((ju0) obj).d.T1.f41082k0 = 1.0f;
                return;
            case 10:
                PhotoViewer photoViewer4 = ((ju0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f41082k0 = 1.0f;
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new yk0(this, 20));
                return;
            case 12:
                au0 au0Var = (au0) obj;
                if (animator.equals(au0Var.f34344c.U7)) {
                    au0Var.f34344c.U7 = null;
                    return;
                }
                return;
            case 13:
                hv0 hv0Var = (hv0) obj;
                if (hv0Var.e == animator) {
                    hv0Var.f36966c[1].setVisibility(8);
                    hv0Var.e = null;
                    return;
                }
                return;
            case 14:
                wv0 wv0Var = (wv0) obj;
                if (wv0Var.C != null) {
                    wv0Var.C = null;
                    wv0Var.b();
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
                premiumPreviewFragment.f32451d0.removeView(premiumPreviewFragment.f32467r0);
                premiumPreviewFragment.f32467r0 = null;
                super.onAnimationEnd(animator);
                return;
            case 17:
                ((ProfileActivity) ((org.telegram.ui.Components.ql0) obj).f28643c).D5 = null;
                return;
            case 18:
                g11 g11Var = (g11) obj;
                if (!g11Var.E) {
                    g11Var.setVisibility(8);
                    return;
                }
                return;
            case 19:
                c21 c21Var = (c21) obj;
                if (animator.equals(c21Var.f34709c)) {
                    c21Var.f34709c = null;
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
                ((g51) obj).d.f32728a0.f41082k0 = 1.0f;
                return;
            case 22:
                SecretMediaViewer secretMediaViewer = ((g51) obj).d;
                secretMediaViewer.f32728a0.setVisibility(4);
                secretMediaViewer.f32728a0.f41082k0 = 1.0f;
                return;
            case 23:
                r71 r71Var = ((h61) obj).e;
                r71Var.S0.G = 0.0f;
                r71Var.S0 = null;
                r71Var.f39637h0.invalidate();
                return;
            case 24:
                ah.x0.a();
                r71 r71Var2 = (r71) obj;
                o61 o61Var = r71Var2.f39637h0;
                o61 o61Var2 = r71Var2.f39637h0;
                o61Var.setLayerType(0, null);
                i61 i61Var = r71Var2.f39633f0;
                i61Var.setLayerType(0, null);
                r71Var2.f39630e0.setLayerType(0, null);
                r71Var2.f39623b0.setLayerType(0, null);
                org.telegram.ui.Components.xn xnVar = r71Var2.f39648n0;
                if (xnVar != null) {
                    xnVar.setLayerType(0, null);
                }
                View view = r71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                i61Var.b();
                r71Var2.f39628d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                r71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new uz0(globalInstance, 14));
                r71Var2.h();
                r71Var2.E(1.0f);
                for (int i11 = 0; i11 < o61Var2.getChildCount(); i11++) {
                    View childAt = o61Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < r71Var2.f39628d0.f28000b.getChildCount(); i12++) {
                    View childAt2 = r71Var2.f39628d0.f28000b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                r71Var2.f39628d0.f28000b.invalidate();
                r71Var2.f39643k0.invalidate();
                o61Var2.invalidate();
                return;
            case 25:
                ((hb1) obj).f36689b0.setVisibility(8);
                return;
            case 26:
                ce1 ce1Var = ((qd1) obj).f39392a;
                if (!ce1Var.f34896p1.a()) {
                    ce1Var.R1.setVisibility(8);
                    return;
                }
                return;
            case 27:
                super.onAnimationEnd(animator);
                ((ff1) obj).f35823a = null;
                return;
            case 28:
                super.onAnimationEnd(animator);
                ((jg1) obj).setScrollEnabled(true);
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
        switch (this.f38030a) {
            case 6:
                du0 du0Var = (du0) this.f38031b;
                du0Var.f35392b.U0.setVisibility(0);
                du0Var.f35392b.C1.setVisibility(0);
                return;
            case 7:
                return;
            case 18:
                ((g11) this.f38031b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
