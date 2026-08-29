package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class e50 extends AnimatorListenerAdapter {
    public final int f37700a;
    public final Object f37701b;

    public e50(Object obj, int i10) {
        this.f37700a = i10;
        this.f37701b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37700a) {
            case 3:
                ((pe0) this.f37701b).f41392s = null;
                return;
            case 9:
                ((PhotoViewer) ((org.telegram.ui.Components.ok0) this.f37701b).f31382c).f35848w2 = null;
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
        org.telegram.ui.ActionBar.l lVar;
        boolean z11;
        boolean z12;
        int i10 = this.f37700a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f37701b;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                f50 f50Var = (f50) obj;
                f50Var.G = null;
                r50 r50Var = f50Var.L;
                r50Var.M.invalidate();
                r50Var.W1.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
                viewGroup.invalidate();
                r50.J0(r50Var);
                f50Var.H.clear();
                f50Var.I.clear();
                return;
            case 1:
                r70 r70Var = (r70) obj;
                r70Var.d = null;
                r70Var.f41986a = null;
                r70Var.f41987b = false;
                return;
            case 2:
                rc0 rc0Var = (rc0) obj;
                rc0Var.D = false;
                rc0Var.o0();
                return;
            case 3:
                pe0 pe0Var = (pe0) obj;
                if (pe0Var.f41392s != null && pe0Var.f41390n != null) {
                    pe0Var.f41391r.setVisibility(4);
                    pe0Var.f41392s = null;
                    return;
                }
                return;
            case 4:
                ((si0) obj).P.setVisibility(8);
                return;
            case 5:
                mj0 mj0Var = (mj0) obj;
                mj0Var.f40584f = 1.0f;
                mj0Var.invalidate();
                return;
            case 6:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.f35613e)) {
                    notificationsCustomSettingsActivity.f35613e = null;
                    return;
                }
                return;
            case 7:
                yo0 yo0Var = (yo0) obj;
                fc fcVar = yo0Var.K;
                if (fcVar != null) {
                    if (fcVar.getParent() != null) {
                        ((ViewGroup) yo0Var.K.getParent()).removeView(yo0Var.K);
                    }
                    yo0Var.K = null;
                }
                yo0Var.M = null;
                super.onAnimationEnd(animator);
                return;
            case 8:
                bq0 bq0Var = (bq0) obj;
                eq0 eq0Var = bq0Var.f36890z0;
                cq0[] cq0VarArr = eq0Var.f37891n;
                eq0Var.f37892r = null;
                if (eq0Var.f37894w) {
                    cq0VarArr[1].setVisibility(8);
                } else {
                    cq0 cq0Var = cq0VarArr[0];
                    cq0VarArr[0] = cq0VarArr[1];
                    cq0VarArr[1] = cq0Var;
                    cq0Var.setVisibility(8);
                    if (eq0Var.f37891n[0].f37196e == eq0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    eq0Var.f37889e = z10;
                    eq0Var.h.j(1.0f, eq0Var.f37891n[0].f37196e);
                }
                eq0Var.f37893s = false;
                bq0Var.f36885u0 = false;
                bq0Var.f36884t0 = false;
                lVar = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
                lVar.setEnabled(true);
                eq0Var.h.setEnabled(true);
                return;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ok0) obj).f31382c;
                if (photoViewer.f35848w2 != null) {
                    vk0 vk0Var = new vk0(this, 18);
                    photoViewer.E2 = vk0Var;
                    AndroidUtilities.runOnUIThread(vk0Var, 860L);
                    return;
                }
                return;
            case 10:
                ss0 ss0Var = (ss0) obj;
                PhotoViewer photoViewer2 = ss0Var.f42458b;
                wf.n nVar = photoViewer2.f35866y1.f31657b;
                nVar.q();
                CropAreaView cropAreaView = nVar.f49953a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.f35866y1.f31657b.F = true;
                photoViewer2.f35752l6 = null;
                photoViewer2.f35795q4 = ss0Var.f42457a;
                nh.w3 w3Var = photoViewer2.f1().H;
                if (photoViewer2.f35795q4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w3Var.b(z11);
                nh.w3 w3Var2 = photoViewer2.G1;
                if (w3Var2 != null) {
                    if (photoViewer2.f35795q4 != 3) {
                        z13 = true;
                    }
                    w3Var2.b(z13);
                }
                if (photoViewer2.f35795q4 != 3) {
                    photoViewer2.V5 = 0.0f;
                }
                photoViewer2.f35744k6 = -1;
                photoViewer2.f35652a6 = 1.0f;
                photoViewer2.W5 = 1.0f;
                photoViewer2.Y5 = 0.0f;
                photoViewer2.Z5 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.f35784p2 = true;
                photoViewer2.f35647a0.invalidate();
                return;
            case 11:
                ts0 ts0Var = (ts0) obj;
                PhotoViewer photoViewer3 = ts0Var.f43095b;
                photoViewer3.E1.f28030e0.setVisibility(0);
                photoViewer3.f35752l6 = null;
                photoViewer3.f35795q4 = ts0Var.f43094a;
                nh.w3 w3Var3 = photoViewer3.f1().H;
                if (photoViewer3.f35795q4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                w3Var3.b(z12);
                nh.w3 w3Var4 = photoViewer3.G1;
                if (w3Var4 != null) {
                    if (photoViewer3.f35795q4 != 3) {
                        z14 = true;
                    }
                    w3Var4.b(z14);
                }
                if (photoViewer3.f35795q4 != 3) {
                    photoViewer3.V5 = 0.0f;
                }
                photoViewer3.f35744k6 = -1;
                photoViewer3.f35652a6 = 1.0f;
                photoViewer3.W5 = 1.0f;
                photoViewer3.Y5 = 0.0f;
                photoViewer3.Z5 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.f35784p2 = true;
                photoViewer3.f35647a0.invalidate();
                return;
            case 12:
                ((PhotoViewer) ((xs0) obj).m0).f35830u3[0].setTag(null);
                return;
            case 13:
                ((ys0) obj).d.P1.f40012g0 = 1.0f;
                return;
            case 14:
                PhotoViewer photoViewer4 = ((ys0) obj).d;
                photoViewer4.P1.setVisibility(4);
                photoViewer4.P1.f40012g0 = 1.0f;
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new vk0(this, 20));
                return;
            case 16:
                ps0 ps0Var = (ps0) obj;
                if (animator.equals(ps0Var.f41458c.P7)) {
                    ps0Var.f41458c.P7 = null;
                    return;
                }
                return;
            case 17:
                wt0 wt0Var = (wt0) obj;
                if (wt0Var.f44377e == animator) {
                    wt0Var.f44376c[1].setVisibility(8);
                    wt0Var.f44377e = null;
                    return;
                }
                return;
            case 18:
                lu0 lu0Var = (lu0) obj;
                if (lu0Var.C != null) {
                    lu0Var.C = null;
                    lu0Var.b();
                    return;
                }
                return;
            case 19:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.U;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.U = null;
                    return;
                }
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.Z.removeView(premiumPreviewFragment.f35923n0);
                premiumPreviewFragment.f35923n0 = null;
                super.onAnimationEnd(animator);
                return;
            case 21:
                ((ProfileActivity) ((org.telegram.ui.Components.ok0) obj).f31382c).f36160z5 = null;
                return;
            case 22:
                wz0 wz0Var = (wz0) obj;
                if (!wz0Var.A) {
                    wz0Var.setVisibility(8);
                    return;
                }
                return;
            case 23:
                t01 t01Var = (t01) obj;
                if (animator.equals(t01Var.f42513c)) {
                    t01Var.f42513c = null;
                    return;
                }
                return;
            case 24:
                z11 z11Var = (z11) obj;
                nh.pa paVar = z11Var.K;
                if (paVar != null) {
                    if (paVar.getParent() != null) {
                        ((ViewGroup) z11Var.K.getParent()).removeView(z11Var.K);
                    }
                    z11Var.K = null;
                }
                z11Var.J = null;
                super.onAnimationEnd(animator);
                return;
            case 25:
                ((u31) obj).d.W.f40012g0 = 1.0f;
                return;
            case 26:
                SecretMediaViewer secretMediaViewer = ((u31) obj).d;
                secretMediaViewer.W.setVisibility(4);
                secretMediaViewer.W.f40012g0 = 1.0f;
                return;
            case 27:
                d61 d61Var = ((t41) obj).f42550e;
                d61Var.O0.C = 0.0f;
                d61Var.O0 = null;
                d61Var.f37326d0.invalidate();
                return;
            case 28:
                kg.g0.a();
                d61 d61Var2 = (d61) obj;
                a51 a51Var = d61Var2.f37326d0;
                a51 a51Var2 = d61Var2.f37326d0;
                a51Var.setLayerType(0, null);
                u41 u41Var = d61Var2.f37321b0;
                u41Var.setLayerType(0, null);
                d61Var2.f37318a0.setLayerType(0, null);
                d61Var2.U.setLayerType(0, null);
                org.telegram.ui.Components.fn fnVar = d61Var2.f37340j0;
                if (fnVar != null) {
                    fnVar.setLayerType(0, null);
                }
                View view = d61Var2.f37338i0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                u41Var.b();
                d61Var2.W.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                d61Var2.S1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new ky0(globalInstance, 15));
                d61Var2.h();
                d61Var2.E(1.0f);
                for (int i11 = 0; i11 < a51Var2.getChildCount(); i11++) {
                    View childAt = a51Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < d61Var2.W.f30108b.getChildCount(); i12++) {
                    View childAt2 = d61Var2.W.f30108b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                d61Var2.W.f30108b.invalidate();
                d61Var2.f37334g0.invalidate();
                a51Var2.invalidate();
                return;
            default:
                ((t91) obj).X.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37700a) {
            case 10:
                ss0 ss0Var = (ss0) this.f37701b;
                ss0Var.f42458b.Q0.setVisibility(0);
                ss0Var.f42458b.f35866y1.setVisibility(0);
                return;
            case 11:
                return;
            case 22:
                ((wz0) this.f37701b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
