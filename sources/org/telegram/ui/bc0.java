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
    public final int f36823a;
    public final Object f36824b;

    public bc0(Object obj, int i9) {
        this.f36823a = i9;
        this.f36824b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36823a) {
            case 1:
                ((qe0) this.f36824b).f41778s = null;
                return;
            case 7:
                ((PhotoViewer) ((org.telegram.ui.Components.su0) this.f36824b).f32556c).f35781w2 = null;
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
        int i9 = this.f36823a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f36824b;
        switch (i9) {
            case 0:
                pc0 pc0Var = (pc0) obj;
                pc0Var.D = false;
                pc0Var.n0();
                return;
            case 1:
                qe0 qe0Var = (qe0) obj;
                if (qe0Var.f41778s != null && qe0Var.f41776n != null) {
                    qe0Var.f41777r.setVisibility(4);
                    qe0Var.f41778s = null;
                    return;
                }
                return;
            case 2:
                ((ti0) obj).P.setVisibility(8);
                return;
            case 3:
                pj0 pj0Var = (pj0) obj;
                pj0Var.f41551f = 1.0f;
                pj0Var.invalidate();
                return;
            case 4:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.f35546e)) {
                    notificationsCustomSettingsActivity.f35546e = null;
                    return;
                }
                return;
            case 5:
                zo0 zo0Var = (zo0) obj;
                gc gcVar = zo0Var.K;
                if (gcVar != null) {
                    if (gcVar.getParent() != null) {
                        ((ViewGroup) zo0Var.K.getParent()).removeView(zo0Var.K);
                    }
                    zo0Var.K = null;
                }
                zo0Var.M = null;
                super.onAnimationEnd(animator);
                return;
            case 6:
                bq0 bq0Var = (bq0) obj;
                eq0 eq0Var = bq0Var.f36962z0;
                cq0[] cq0VarArr = eq0Var.f38013n;
                eq0Var.f38014r = null;
                if (eq0Var.f38016w) {
                    cq0VarArr[1].setVisibility(8);
                } else {
                    cq0 cq0Var = cq0VarArr[0];
                    cq0VarArr[0] = cq0VarArr[1];
                    cq0VarArr[1] = cq0Var;
                    cq0Var.setVisibility(8);
                    if (eq0Var.f38013n[0].f37291e == eq0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    eq0Var.f38011e = z10;
                    eq0Var.h.j(1.0f, eq0Var.f38013n[0].f37291e);
                }
                eq0Var.f38015s = false;
                bq0Var.f36957u0 = false;
                bq0Var.f36956t0 = false;
                kVar = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
                kVar.setEnabled(true);
                eq0Var.h.setEnabled(true);
                return;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.su0) obj).f32556c;
                if (photoViewer.f35781w2 != null) {
                    zk0 zk0Var = new zk0(this, 18);
                    photoViewer.E2 = zk0Var;
                    AndroidUtilities.runOnUIThread(zk0Var, 860L);
                    return;
                }
                return;
            case 8:
                ts0 ts0Var = (ts0) obj;
                PhotoViewer photoViewer2 = ts0Var.f43056b;
                tf.n nVar = photoViewer2.f35799y1.f27183b;
                nVar.q();
                CropAreaView cropAreaView = nVar.f47904a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.f35799y1.f27183b.F = true;
                photoViewer2.f35686l6 = null;
                photoViewer2.f35727q4 = ts0Var.f43055a;
                kh.b4 b4Var = photoViewer2.f1().H;
                if (photoViewer2.f35727q4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                b4Var.b(z11);
                kh.b4 b4Var2 = photoViewer2.G1;
                if (b4Var2 != null) {
                    if (photoViewer2.f35727q4 != 3) {
                        z13 = true;
                    }
                    b4Var2.b(z13);
                }
                if (photoViewer2.f35727q4 != 3) {
                    photoViewer2.V5 = 0.0f;
                }
                photoViewer2.f35678k6 = -1;
                photoViewer2.f35584a6 = 1.0f;
                photoViewer2.W5 = 1.0f;
                photoViewer2.Y5 = 0.0f;
                photoViewer2.Z5 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.f35717p2 = true;
                photoViewer2.f35580a0.invalidate();
                return;
            case 9:
                us0 us0Var = (us0) obj;
                PhotoViewer photoViewer3 = us0Var.f43308b;
                photoViewer3.E1.f31898e0.setVisibility(0);
                photoViewer3.f35686l6 = null;
                photoViewer3.f35727q4 = us0Var.f43307a;
                kh.b4 b4Var3 = photoViewer3.f1().H;
                if (photoViewer3.f35727q4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                b4Var3.b(z12);
                kh.b4 b4Var4 = photoViewer3.G1;
                if (b4Var4 != null) {
                    if (photoViewer3.f35727q4 != 3) {
                        z14 = true;
                    }
                    b4Var4.b(z14);
                }
                if (photoViewer3.f35727q4 != 3) {
                    photoViewer3.V5 = 0.0f;
                }
                photoViewer3.f35678k6 = -1;
                photoViewer3.f35584a6 = 1.0f;
                photoViewer3.W5 = 1.0f;
                photoViewer3.Y5 = 0.0f;
                photoViewer3.Z5 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.f35717p2 = true;
                photoViewer3.f35580a0.invalidate();
                return;
            case 10:
                ((PhotoViewer) ((zs0) obj).m0).f35764u3[0].setTag(null);
                return;
            case 11:
                ((at0) obj).d.P1.f40524g0 = 1.0f;
                return;
            case 12:
                PhotoViewer photoViewer4 = ((at0) obj).d;
                photoViewer4.P1.setVisibility(4);
                photoViewer4.P1.f40524g0 = 1.0f;
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new zk0(this, 20));
                return;
            case 14:
                qs0 qs0Var = (qs0) obj;
                if (animator.equals(qs0Var.f42186c.P7)) {
                    qs0Var.f42186c.P7 = null;
                    return;
                }
                return;
            case 15:
                yt0 yt0Var = (yt0) obj;
                if (yt0Var.f44947e == animator) {
                    yt0Var.f44946c[1].setVisibility(8);
                    yt0Var.f44947e = null;
                    return;
                }
                return;
            case 16:
                nu0 nu0Var = (nu0) obj;
                if (nu0Var.C != null) {
                    nu0Var.C = null;
                    nu0Var.b();
                    return;
                }
                return;
            case 17:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.U;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.U = null;
                    return;
                }
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.Z.removeView(premiumPreviewFragment.f35857n0);
                premiumPreviewFragment.f35857n0 = null;
                super.onAnimationEnd(animator);
                return;
            case 19:
                ((ProfileActivity) ((org.telegram.ui.Components.su0) obj).f32556c).f36095z5 = null;
                return;
            case 20:
                wz0 wz0Var = (wz0) obj;
                if (!wz0Var.A) {
                    wz0Var.setVisibility(8);
                    return;
                }
                return;
            case 21:
                s01 s01Var = (s01) obj;
                if (animator.equals(s01Var.f42521c)) {
                    s01Var.f42521c = null;
                    return;
                }
                return;
            case 22:
                y11 y11Var = (y11) obj;
                kh.eb ebVar = y11Var.K;
                if (ebVar != null) {
                    if (ebVar.getParent() != null) {
                        ((ViewGroup) y11Var.K.getParent()).removeView(y11Var.K);
                    }
                    y11Var.K = null;
                }
                y11Var.J = null;
                super.onAnimationEnd(animator);
                return;
            case 23:
                ((s31) obj).d.W.f40524g0 = 1.0f;
                return;
            case 24:
                SecretMediaViewer secretMediaViewer = ((s31) obj).d;
                secretMediaViewer.W.setVisibility(4);
                secretMediaViewer.W.f40524g0 = 1.0f;
                return;
            case 25:
                b61 b61Var = ((r41) obj).f42269e;
                b61Var.O0.C = 0.0f;
                b61Var.O0 = null;
                b61Var.f36669d0.invalidate();
                return;
            case 26:
                hg.h0.a();
                b61 b61Var2 = (b61) obj;
                y41 y41Var = b61Var2.f36669d0;
                y41 y41Var2 = b61Var2.f36669d0;
                y41Var.setLayerType(0, null);
                s41 s41Var = b61Var2.f36664b0;
                s41Var.setLayerType(0, null);
                b61Var2.f36661a0.setLayerType(0, null);
                b61Var2.U.setLayerType(0, null);
                org.telegram.ui.Components.an anVar = b61Var2.f36683j0;
                if (anVar != null) {
                    anVar.setLayerType(0, null);
                }
                View view = b61Var2.f36681i0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                s41Var.b();
                b61Var2.W.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                b61Var2.S1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new ky0(globalInstance, 15));
                b61Var2.h();
                b61Var2.E(1.0f);
                for (int i10 = 0; i10 < y41Var2.getChildCount(); i10++) {
                    View childAt = y41Var2.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i11 = 0; i11 < b61Var2.W.f34720b.getChildCount(); i11++) {
                    View childAt2 = b61Var2.W.f34720b.getChildAt(i11);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                b61Var2.W.f34720b.invalidate();
                b61Var2.f36677g0.invalidate();
                y41Var2.invalidate();
                return;
            case 27:
                ((s91) obj).X.setVisibility(8);
                return;
            case 28:
                oc1 oc1Var = ((cc1) obj).f37167a;
                if (!oc1Var.l1.a()) {
                    oc1Var.N1.setVisibility(8);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                ((pd1) obj).f41493a = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36823a) {
            case 8:
                ts0 ts0Var = (ts0) this.f36824b;
                ts0Var.f43056b.Q0.setVisibility(0);
                ts0Var.f43056b.f35799y1.setVisibility(0);
                return;
            case 9:
                return;
            case 20:
                ((wz0) this.f36824b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
