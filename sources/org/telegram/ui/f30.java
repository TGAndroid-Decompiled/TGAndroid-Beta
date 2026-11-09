package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class f30 extends AnimatorListenerAdapter {
    public final int f45570a;
    public final Object f45571b;

    public f30(Object obj, int i7) {
        this.f45570a = i7;
        this.f45571b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f45570a) {
            case 4:
                ((rc0) this.f45571b).f49448s = null;
                return;
            case 10:
                ((PhotoViewer) ((org.telegram.ui.Components.w50) this.f45571b).f39919c).A2 = null;
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
        int i7 = this.f45570a;
        boolean z12 = false;
        boolean z13 = false;
        Object obj = this.f45571b;
        switch (i7) {
            case 0:
                e40 e40Var = ((g30) obj).f45858o;
                e40 e40Var2 = e40.f45182u5;
                e40Var.d1();
                e40Var.f28624b.invalidate();
                e40Var.H1.invalidate();
                if (e40Var.f45225j2) {
                    e40Var.f45225j2 = false;
                    e40Var.Q0(true);
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                s30 s30Var = (s30) obj;
                s30Var.G = null;
                e40 e40Var3 = s30Var.L;
                e40Var3.H1.invalidate();
                e40Var3.R3.invalidate();
                e40Var3.f28624b.invalidate();
                e40.P0(e40Var3);
                s30Var.H.clear();
                s30Var.I.clear();
                return;
            case 2:
                a60 a60Var = (a60) obj;
                a60Var.f43593a = null;
                a60Var.f43594b = false;
                return;
            case 3:
                ra0 ra0Var = (ra0) obj;
                ra0Var.D = false;
                ra0Var.y0();
                return;
            case 4:
                rc0 rc0Var = (rc0) obj;
                if (rc0Var.f49448s != null && rc0Var.f49446n != null) {
                    rc0Var.f49447r.setVisibility(4);
                    rc0Var.f49448s = null;
                    return;
                }
                return;
            case 5:
                ((lg0) obj).T.setVisibility(8);
                return;
            case 6:
                eh0 eh0Var = (eh0) obj;
                eh0Var.f45447f = 1.0f;
                eh0Var.invalidate();
                return;
            case 7:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.f41313e)) {
                    notificationsCustomSettingsActivity.f41313e = null;
                    return;
                }
                return;
            case 8:
                jm0 jm0Var = (jm0) obj;
                cc ccVar = jm0Var.X;
                if (ccVar != null) {
                    if (ccVar.getParent() != null) {
                        ((ViewGroup) jm0Var.X.getParent()).removeView(jm0Var.X);
                    }
                    jm0Var.X = null;
                }
                jm0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 9:
                bn0 bn0Var = (bn0) obj;
                cn0 cn0Var = bn0Var.m0;
                org.telegram.ui.ActionBar.x4[] x4VarArr = cn0Var.f44717n;
                cn0Var.f44718r = null;
                if (cn0Var.f44721x) {
                    x4VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.x4 x4Var = x4VarArr[0];
                    x4VarArr[0] = x4VarArr[1];
                    x4VarArr[1] = x4Var;
                    x4Var.setVisibility(8);
                    if (cn0Var.f44717n[0].f28749b == cn0Var.h.getFirstTabId()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    cn0Var.f44715e = z9;
                    cn0Var.h.i(1.0f, cn0Var.f44717n[0].f28749b);
                }
                cn0Var.f44719s = false;
                bn0Var.f44075h0 = false;
                bn0Var.f44074g0 = false;
                cn0.h0(cn0Var).setEnabled(true);
                cn0Var.h.setEnabled(true);
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.w50) obj).f39919c;
                if (photoViewer.A2 != null) {
                    gf0 gf0Var = new gf0(this, 21);
                    photoViewer.H2 = gf0Var;
                    org.telegram.messenger.g0.i3(gf0Var, 860L);
                    return;
                }
                return;
            case 11:
                sp0 sp0Var = (sp0) obj;
                PhotoViewer photoViewer2 = sp0Var.f49972b;
                og.o oVar = photoViewer2.C1.f33932b;
                oVar.q();
                CropAreaView cropAreaView = oVar.f21007a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f33932b.J = true;
                photoViewer2.f41482o6 = null;
                photoViewer2.f41526t4 = sp0Var.f49971a;
                fi.q3 q3Var = photoViewer2.a1().L;
                if (photoViewer2.f41526t4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q3Var.b(z10);
                fi.q3 q3Var2 = photoViewer2.K1;
                if (q3Var2 != null) {
                    if (photoViewer2.f41526t4 != 3) {
                        z12 = true;
                    }
                    q3Var2.b(z12);
                }
                if (photoViewer2.f41526t4 != 3) {
                    photoViewer2.Y5 = 0.0f;
                }
                photoViewer2.f41474n6 = -1;
                photoViewer2.f41387d6 = 1.0f;
                photoViewer2.Z5 = 1.0f;
                photoViewer2.f41369b6 = 0.0f;
                photoViewer2.f41379c6 = 0.0f;
                photoViewer2.t3(1.0f);
                photoViewer2.f41524t2 = true;
                photoViewer2.f41391e0.invalidate();
                return;
            case 12:
                tp0 tp0Var = (tp0) obj;
                PhotoViewer photoViewer3 = tp0Var.f50216b;
                photoViewer3.I1.f38367i0.setVisibility(0);
                photoViewer3.f41482o6 = null;
                photoViewer3.f41526t4 = tp0Var.f50215a;
                fi.q3 q3Var3 = photoViewer3.a1().L;
                if (photoViewer3.f41526t4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                q3Var3.b(z11);
                fi.q3 q3Var4 = photoViewer3.K1;
                if (q3Var4 != null) {
                    if (photoViewer3.f41526t4 != 3) {
                        z13 = true;
                    }
                    q3Var4.b(z13);
                }
                if (photoViewer3.f41526t4 != 3) {
                    photoViewer3.Y5 = 0.0f;
                }
                photoViewer3.f41474n6 = -1;
                photoViewer3.f41387d6 = 1.0f;
                photoViewer3.Z5 = 1.0f;
                photoViewer3.f41369b6 = 0.0f;
                photoViewer3.f41379c6 = 0.0f;
                photoViewer3.t3(1.0f);
                photoViewer3.f41524t2 = true;
                photoViewer3.f41391e0.invalidate();
                return;
            case 13:
                ((PhotoViewer) ((xp0) obj).f51746q0).f41562x3[0].setTag(null);
                return;
            case 14:
                ((yp0) obj).d.T1.f47349k0 = 1.0f;
                return;
            case 15:
                PhotoViewer photoViewer4 = ((yp0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f47349k0 = 1.0f;
                return;
            case 16:
                org.telegram.messenger.g0.h3(new gf0(this, 23));
                return;
            case 17:
                pp0 pp0Var = (pp0) obj;
                if (animator.equals(pp0Var.f48777c.T7)) {
                    pp0Var.f48777c.T7 = null;
                    return;
                }
                return;
            case 18:
                vq0 vq0Var = (vq0) obj;
                if (vq0Var.f50751e == animator) {
                    vq0Var.f50750c[1].setVisibility(8);
                    vq0Var.f50751e = null;
                    return;
                }
                return;
            case 19:
                hr0 hr0Var = (hr0) obj;
                if (hr0Var.C != null) {
                    hr0Var.C = null;
                    hr0Var.b();
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
                ((fv0) obj).f45797b.R5 = null;
                return;
            case 22:
                mw0 mw0Var = (mw0) obj;
                if (!mw0Var.E) {
                    mw0Var.setVisibility(8);
                    return;
                }
                return;
            case 23:
                kx0 kx0Var = (kx0) obj;
                if (animator.equals(kx0Var.d)) {
                    kx0Var.d = null;
                    return;
                }
                return;
            case 24:
                ((kz0) obj).d.Y.f47349k0 = 1.0f;
                return;
            case 25:
                SecretMediaViewer secretMediaViewer = ((kz0) obj).d;
                secretMediaViewer.Y.setVisibility(4);
                secretMediaViewer.Y.f47349k0 = 1.0f;
                return;
            case 26:
                s11 s11Var = ((j01) obj).f46808e;
                s11Var.S0.G = 0.0f;
                s11Var.S0 = null;
                s11Var.f49680h0.invalidate();
                return;
            case 27:
                ch.e0.a();
                s11 s11Var2 = (s11) obj;
                q01 q01Var = s11Var2.f49680h0;
                q01 q01Var2 = s11Var2.f49680h0;
                q01Var.setLayerType(0, null);
                k01 k01Var = s11Var2.f49676f0;
                k01Var.setLayerType(0, null);
                s11Var2.f49673e0.setLayerType(0, null);
                s11Var2.f49665b0.setLayerType(0, null);
                org.telegram.ui.Components.tm tmVar = s11Var2.f49691n0;
                if (tmVar != null) {
                    tmVar.setLayerType(0, null);
                }
                View view = s11Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                k01Var.b();
                s11Var2.f49670d0.m(false);
                org.telegram.messenger.qs.e().k(99, 512);
                s11Var2.X1.e();
                org.telegram.messenger.g0.h3(new tu0(org.telegram.messenger.qs.e(), 15));
                s11Var2.h();
                s11Var2.E(1.0f);
                for (int i10 = 0; i10 < q01Var2.getChildCount(); i10++) {
                    View childAt = q01Var2.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i11 = 0; i11 < s11Var2.f49670d0.f40097b.getChildCount(); i11++) {
                    View childAt2 = s11Var2.f49670d0.f40097b.getChildAt(i11);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                s11Var2.f49670d0.f40097b.invalidate();
                s11Var2.f49686k0.invalidate();
                q01Var2.invalidate();
                return;
            case 28:
                ((d51) obj).f44826a0.setVisibility(8);
                return;
            default:
                w71 w71Var = ((l71) obj).f47493a;
                if (!w71Var.f50948q1.a()) {
                    w71Var.S1.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f45570a) {
            case 11:
                sp0 sp0Var = (sp0) this.f45571b;
                sp0Var.f49972b.U0.setVisibility(0);
                sp0Var.f49972b.C1.setVisibility(0);
                return;
            case 12:
                return;
            case 22:
                ((mw0) this.f45571b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
