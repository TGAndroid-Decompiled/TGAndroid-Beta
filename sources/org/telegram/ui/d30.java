package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class d30 extends AnimatorListenerAdapter {
    public final int f44918a;
    public final Object f44919b;

    public d30(Object obj, int i7) {
        this.f44918a = i7;
        this.f44919b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f44918a) {
            case 4:
                ((pc0) this.f44919b).f48799s = null;
                return;
            case 10:
                ((PhotoViewer) ((org.telegram.ui.Components.v50) this.f44919b).f38868c).A2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i7 = this.f44918a;
        boolean z12 = false;
        boolean z13 = false;
        Object obj = this.f44919b;
        switch (i7) {
            case 0:
                c40 c40Var = ((e30) obj).f45160o;
                c40 c40Var2 = c40.f44519u5;
                c40Var.d1();
                c40Var.f28615b.invalidate();
                c40Var.H1.invalidate();
                if (c40Var.f44562j2) {
                    c40Var.f44562j2 = false;
                    c40Var.Q0(true);
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                q30 q30Var = (q30) obj;
                q30Var.G = null;
                c40 c40Var3 = q30Var.L;
                c40Var3.H1.invalidate();
                c40Var3.R3.invalidate();
                c40Var3.f28615b.invalidate();
                c40.P0(c40Var3);
                q30Var.H.clear();
                q30Var.I.clear();
                return;
            case 2:
                y50 y50Var = (y50) obj;
                y50Var.f52072a = null;
                y50Var.f52073b = false;
                return;
            case 3:
                pa0 pa0Var = (pa0) obj;
                pa0Var.D = false;
                pa0Var.y0();
                return;
            case 4:
                pc0 pc0Var = (pc0) obj;
                if (pc0Var.f48799s != null && pc0Var.f48797n != null) {
                    pc0Var.f48798r.setVisibility(4);
                    pc0Var.f48799s = null;
                    return;
                }
                return;
            case 5:
                ((jg0) obj).T.setVisibility(8);
                return;
            case 6:
                ch0 ch0Var = (ch0) obj;
                ch0Var.f44813f = 1.0f;
                ch0Var.invalidate();
                return;
            case 7:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.f41278e)) {
                    notificationsCustomSettingsActivity.f41278e = null;
                    return;
                }
                return;
            case 8:
                hm0 hm0Var = (hm0) obj;
                cc ccVar = hm0Var.X;
                if (ccVar != null) {
                    if (ccVar.getParent() != null) {
                        ((ViewGroup) hm0Var.X.getParent()).removeView(hm0Var.X);
                    }
                    hm0Var.X = null;
                }
                hm0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 9:
                zm0 zm0Var = (zm0) obj;
                an0 an0Var = zm0Var.m0;
                org.telegram.ui.ActionBar.x4[] x4VarArr = an0Var.f44030n;
                an0Var.f44031r = null;
                if (an0Var.f44034x) {
                    x4VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.x4 x4Var = x4VarArr[0];
                    x4VarArr[0] = x4VarArr[1];
                    x4VarArr[1] = x4Var;
                    x4Var.setVisibility(8);
                    if (an0Var.f44030n[0].f28745b == an0Var.h.getFirstTabId()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    an0Var.f44028e = z9;
                    an0Var.h.i(1.0f, an0Var.f44030n[0].f28745b);
                }
                an0Var.f44032s = false;
                zm0Var.f52607h0 = false;
                zm0Var.f52606g0 = false;
                an0.h0(an0Var).setEnabled(true);
                an0Var.h.setEnabled(true);
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.v50) obj).f38868c;
                if (photoViewer.A2 != null) {
                    ef0 ef0Var = new ef0(this, 21);
                    photoViewer.H2 = ef0Var;
                    org.telegram.messenger.g0.i3(ef0Var, 860L);
                    return;
                }
                return;
            case 11:
                pp0 pp0Var = (pp0) obj;
                PhotoViewer photoViewer2 = pp0Var.f48910b;
                og.o oVar = photoViewer2.C1.f33564b;
                oVar.q();
                CropAreaView cropAreaView = oVar.f21004a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f33564b.J = true;
                photoViewer2.f41447o6 = null;
                photoViewer2.f41491t4 = pp0Var.f48909a;
                fi.q3 q3Var = photoViewer2.a1().L;
                if (photoViewer2.f41491t4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q3Var.b(z10);
                fi.q3 q3Var2 = photoViewer2.K1;
                if (q3Var2 != null) {
                    if (photoViewer2.f41491t4 != 3) {
                        z12 = true;
                    }
                    q3Var2.b(z12);
                }
                if (photoViewer2.f41491t4 != 3) {
                    photoViewer2.Y5 = 0.0f;
                }
                photoViewer2.f41439n6 = -1;
                photoViewer2.f41352d6 = 1.0f;
                photoViewer2.Z5 = 1.0f;
                photoViewer2.f41334b6 = 0.0f;
                photoViewer2.f41344c6 = 0.0f;
                photoViewer2.t3(1.0f);
                photoViewer2.f41489t2 = true;
                photoViewer2.f41356e0.invalidate();
                return;
            case 12:
                qp0 qp0Var = (qp0) obj;
                PhotoViewer photoViewer3 = qp0Var.f49264b;
                photoViewer3.I1.f38038i0.setVisibility(0);
                photoViewer3.f41447o6 = null;
                photoViewer3.f41491t4 = qp0Var.f49263a;
                fi.q3 q3Var3 = photoViewer3.a1().L;
                if (photoViewer3.f41491t4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                q3Var3.b(z11);
                fi.q3 q3Var4 = photoViewer3.K1;
                if (q3Var4 != null) {
                    if (photoViewer3.f41491t4 != 3) {
                        z13 = true;
                    }
                    q3Var4.b(z13);
                }
                if (photoViewer3.f41491t4 != 3) {
                    photoViewer3.Y5 = 0.0f;
                }
                photoViewer3.f41439n6 = -1;
                photoViewer3.f41352d6 = 1.0f;
                photoViewer3.Z5 = 1.0f;
                photoViewer3.f41334b6 = 0.0f;
                photoViewer3.f41344c6 = 0.0f;
                photoViewer3.t3(1.0f);
                photoViewer3.f41489t2 = true;
                photoViewer3.f41356e0.invalidate();
                return;
            case 13:
                ((PhotoViewer) ((up0) obj).f50460q0).f41527x3[0].setTag(null);
                return;
            case 14:
                ((vp0) obj).d.T1.f46467k0 = 1.0f;
                return;
            case 15:
                PhotoViewer photoViewer4 = ((vp0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f46467k0 = 1.0f;
                return;
            case 16:
                org.telegram.messenger.g0.h3(new ef0(this, 23));
                return;
            case 17:
                mp0 mp0Var = (mp0) obj;
                if (animator.equals(mp0Var.f47839c.T7)) {
                    mp0Var.f47839c.T7 = null;
                    return;
                }
                return;
            case 18:
                sq0 sq0Var = (sq0) obj;
                if (sq0Var.f49797e == animator) {
                    sq0Var.f49796c[1].setVisibility(8);
                    sq0Var.f49797e = null;
                    return;
                }
                return;
            case 19:
                er0 er0Var = (er0) obj;
                if (er0Var.C != null) {
                    er0Var.C = null;
                    er0Var.b();
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
                ((cv0) obj).f44879b.P5 = null;
                return;
            case 22:
                kw0 kw0Var = (kw0) obj;
                if (!kw0Var.E) {
                    kw0Var.setVisibility(8);
                    return;
                }
                return;
            case 23:
                gx0 gx0Var = (gx0) obj;
                if (animator.equals(gx0Var.d)) {
                    gx0Var.d = null;
                    return;
                }
                return;
            case 24:
                ((hz0) obj).d.Y.f46467k0 = 1.0f;
                return;
            case 25:
                SecretMediaViewer secretMediaViewer = ((hz0) obj).d;
                secretMediaViewer.Y.setVisibility(4);
                secretMediaViewer.Y.f46467k0 = 1.0f;
                return;
            case 26:
                q11 q11Var = ((h01) obj).f46160e;
                q11Var.S0.G = 0.0f;
                q11Var.S0 = null;
                q11Var.f49008h0.invalidate();
                return;
            case 27:
                ch.e0.a();
                q11 q11Var2 = (q11) obj;
                o01 o01Var = q11Var2.f49008h0;
                o01 o01Var2 = q11Var2.f49008h0;
                o01Var.setLayerType(0, null);
                i01 i01Var = q11Var2.f49004f0;
                i01Var.setLayerType(0, null);
                q11Var2.f49001e0.setLayerType(0, null);
                q11Var2.f48993b0.setLayerType(0, null);
                org.telegram.ui.Components.tm tmVar = q11Var2.f49019n0;
                if (tmVar != null) {
                    tmVar.setLayerType(0, null);
                }
                View view = q11Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                i01Var.b();
                q11Var2.f48998d0.m(false);
                org.telegram.messenger.qs.e().k(99, 512);
                q11Var2.X1.e();
                org.telegram.messenger.g0.h3(new qu0(org.telegram.messenger.qs.e(), 15));
                q11Var2.h();
                q11Var2.E(1.0f);
                for (int i10 = 0; i10 < o01Var2.getChildCount(); i10++) {
                    View childAt = o01Var2.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i11 = 0; i11 < q11Var2.f48998d0.f38974b.getChildCount(); i11++) {
                    View childAt2 = q11Var2.f48998d0.f38974b.getChildAt(i11);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                q11Var2.f48998d0.f38974b.invalidate();
                q11Var2.f49014k0.invalidate();
                o01Var2.invalidate();
                return;
            case 28:
                ((c51) obj).f44644a0.setVisibility(8);
                return;
            default:
                u71 u71Var = ((j71) obj).f46842a;
                if (!u71Var.f50290q1.a()) {
                    u71Var.S1.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f44918a) {
            case 11:
                pp0 pp0Var = (pp0) this.f44919b;
                pp0Var.f48910b.U0.setVisibility(0);
                pp0Var.f48910b.C1.setVisibility(0);
                return;
            case 12:
                return;
            case 22:
                ((kw0) this.f44919b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
