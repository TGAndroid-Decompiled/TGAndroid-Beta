package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class bc0 extends AnimatorListenerAdapter {
    public final int f35667a;
    public final Object f35668b;

    public bc0(Object obj, int i10) {
        this.f35667a = i10;
        this.f35668b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35667a) {
            case 1:
                ((pe0) this.f35668b).f40117s = null;
                return;
            case 7:
                ((PhotoViewer) ((org.telegram.ui.Components.ml0) this.f35668b).f28556c).A2 = null;
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
        int i10 = this.f35667a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f35668b;
        switch (i10) {
            case 0:
                pc0 pc0Var = (pc0) obj;
                pc0Var.H = false;
                pc0Var.n0();
                return;
            case 1:
                pe0 pe0Var = (pe0) obj;
                if (pe0Var.f40117s != null && pe0Var.f40115n != null) {
                    pe0Var.f40116r.setVisibility(4);
                    pe0Var.f40117s = null;
                    return;
                }
                return;
            case 2:
                ((wi0) obj).T.setVisibility(8);
                return;
            case 3:
                qj0 qj0Var = (qj0) obj;
                qj0Var.f40455f = 1.0f;
                qj0Var.invalidate();
                return;
            case 4:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
            case 5:
                kp0 kp0Var = (kp0) obj;
                nc ncVar = kp0Var.X;
                if (ncVar != null) {
                    if (ncVar.getParent() != null) {
                        ((ViewGroup) kp0Var.X.getParent()).removeView(kp0Var.X);
                    }
                    kp0Var.X = null;
                }
                kp0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 6:
                nq0 nq0Var = (nq0) obj;
                qq0 qq0Var = nq0Var.D0;
                oq0[] oq0VarArr = qq0Var.f40509n;
                qq0Var.f40510r = null;
                if (qq0Var.f40512w) {
                    oq0VarArr[1].setVisibility(8);
                } else {
                    oq0 oq0Var = oq0VarArr[0];
                    oq0VarArr[0] = oq0VarArr[1];
                    oq0VarArr[1] = oq0Var;
                    oq0Var.setVisibility(8);
                    if (qq0Var.f40509n[0].e == qq0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qq0Var.e = z10;
                    qq0Var.h.j(1.0f, qq0Var.f40509n[0].e);
                }
                qq0Var.f40511s = false;
                nq0Var.f39543y0 = false;
                nq0Var.f39542x0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) qq0Var).actionBar;
                kVar.setEnabled(true);
                qq0Var.h.setEnabled(true);
                return;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ml0) obj).f28556c;
                if (photoViewer.A2 != null) {
                    ek0 ek0Var = new ek0(this, 18);
                    photoViewer.I2 = ek0Var;
                    AndroidUtilities.runOnUIThread(ek0Var, 860L);
                    return;
                }
                return;
            case 8:
                et0 et0Var = (et0) obj;
                PhotoViewer photoViewer2 = et0Var.f36613b;
                mg.p pVar = photoViewer2.C1.f28754b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f16918a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f28754b.J = true;
                photoViewer2.f33374p6 = null;
                photoViewer2.f33418u4 = et0Var.f36612a;
                ei.b4 b4Var = photoViewer2.f1().L;
                if (photoViewer2.f33418u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                b4Var.b(z11);
                ei.b4 b4Var2 = photoViewer2.K1;
                if (b4Var2 != null) {
                    if (photoViewer2.f33418u4 != 3) {
                        z13 = true;
                    }
                    b4Var2.b(z13);
                }
                if (photoViewer2.f33418u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f33366o6 = -1;
                photoViewer2.f33279e6 = 1.0f;
                photoViewer2.f33241a6 = 1.0f;
                photoViewer2.f33261c6 = 0.0f;
                photoViewer2.f33270d6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.f33407t2 = true;
                photoViewer2.f33273e0.invalidate();
                return;
            case 9:
                ft0 ft0Var = (ft0) obj;
                PhotoViewer photoViewer3 = ft0Var.f37011b;
                photoViewer3.I1.f25223i0.setVisibility(0);
                photoViewer3.f33374p6 = null;
                photoViewer3.f33418u4 = ft0Var.f37010a;
                ei.b4 b4Var3 = photoViewer3.f1().L;
                if (photoViewer3.f33418u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                b4Var3.b(z12);
                ei.b4 b4Var4 = photoViewer3.K1;
                if (b4Var4 != null) {
                    if (photoViewer3.f33418u4 != 3) {
                        z14 = true;
                    }
                    b4Var4.b(z14);
                }
                if (photoViewer3.f33418u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f33366o6 = -1;
                photoViewer3.f33279e6 = 1.0f;
                photoViewer3.f33241a6 = 1.0f;
                photoViewer3.f33261c6 = 0.0f;
                photoViewer3.f33270d6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.f33407t2 = true;
                photoViewer3.f33273e0.invalidate();
                return;
            case 10:
                ((PhotoViewer) ((jt0) obj).f38343q0).y3[0].setTag(null);
                return;
            case 11:
                ((kt0) obj).d.T1.f42952k0 = 1.0f;
                return;
            case 12:
                PhotoViewer photoViewer4 = ((kt0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f42952k0 = 1.0f;
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new ek0(this, 20));
                return;
            case 14:
                bt0 bt0Var = (bt0) obj;
                if (animator.equals(bt0Var.f35759c.U7)) {
                    bt0Var.f35759c.U7 = null;
                    return;
                }
                return;
            case 15:
                iu0 iu0Var = (iu0) obj;
                if (iu0Var.e == animator) {
                    iu0Var.f37997c[1].setVisibility(8);
                    iu0Var.e = null;
                    return;
                }
                return;
            case 16:
                xu0 xu0Var = (xu0) obj;
                if (xu0Var.C != null) {
                    xu0Var.C = null;
                    xu0Var.b();
                    return;
                }
                return;
            case 17:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    return;
                }
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f33498d0.removeView(premiumPreviewFragment.f33514r0);
                premiumPreviewFragment.f33514r0 = null;
                super.onAnimationEnd(animator);
                return;
            case 19:
                ((ProfileActivity) ((org.telegram.ui.Components.ml0) obj).f28556c).F5 = null;
                return;
            case 20:
                e01 e01Var = (e01) obj;
                if (!e01Var.E) {
                    e01Var.setVisibility(8);
                    return;
                }
                return;
            case 21:
                b11 b11Var = (b11) obj;
                if (animator.equals(b11Var.f35556c)) {
                    b11Var.f35556c = null;
                    return;
                }
                return;
            case 22:
                ((o31) obj).d.f33777a0.f42952k0 = 1.0f;
                return;
            case 23:
                SecretMediaViewer secretMediaViewer = ((o31) obj).d;
                secretMediaViewer.f33777a0.setVisibility(4);
                secretMediaViewer.f33777a0.f42952k0 = 1.0f;
                return;
            case 24:
                z51 z51Var = ((p41) obj).e;
                z51Var.S0.G = 0.0f;
                z51Var.S0 = null;
                z51Var.f43622h0.invalidate();
                return;
            case 25:
                ah.x0.a();
                z51 z51Var2 = (z51) obj;
                w41 w41Var = z51Var2.f43622h0;
                w41 w41Var2 = z51Var2.f43622h0;
                w41Var.setLayerType(0, null);
                q41 q41Var = z51Var2.f43618f0;
                q41Var.setLayerType(0, null);
                z51Var2.f43615e0.setLayerType(0, null);
                z51Var2.f43608b0.setLayerType(0, null);
                org.telegram.ui.Components.un unVar = z51Var2.f43633n0;
                if (unVar != null) {
                    unVar.setLayerType(0, null);
                }
                View view = z51Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                q41Var.b();
                z51Var2.f43613d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                z51Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new sy0(globalInstance, 14));
                z51Var2.h();
                z51Var2.E(1.0f);
                for (int i11 = 0; i11 < w41Var2.getChildCount(); i11++) {
                    View childAt = w41Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < z51Var2.f43613d0.f27951b.getChildCount(); i12++) {
                    View childAt2 = z51Var2.f43613d0.f27951b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                z51Var2.f43613d0.f27951b.invalidate();
                z51Var2.f43628k0.invalidate();
                w41Var2.invalidate();
                return;
            case 26:
                ((r91) obj).f40665b0.setVisibility(8);
                return;
            case 27:
                mc1 mc1Var = ((ac1) obj).f35411a;
                if (!mc1Var.f39165p1.a()) {
                    mc1Var.R1.setVisibility(8);
                    return;
                }
                return;
            case 28:
                super.onAnimationEnd(animator);
                ((nd1) obj).f39453a = null;
                return;
            default:
                super.onAnimationEnd(animator);
                ((re1) obj).setScrollEnabled(true);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35667a) {
            case 8:
                et0 et0Var = (et0) this.f35668b;
                et0Var.f36613b.U0.setVisibility(0);
                et0Var.f36613b.C1.setVisibility(0);
                return;
            case 9:
                return;
            case 20:
                ((e01) this.f35668b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
