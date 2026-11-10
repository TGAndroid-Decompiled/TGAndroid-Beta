package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class g30 extends AnimatorListenerAdapter {
    public final int f45926a;
    public final Object f45927b;

    public g30(Object obj, int i7) {
        this.f45926a = i7;
        this.f45927b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f45926a) {
            case 4:
                ((sc0) this.f45927b).f49826s = null;
                return;
            case 10:
                ((PhotoViewer) ((org.telegram.ui.Components.v50) this.f45927b).f38863c).A2 = null;
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
        int i7 = this.f45926a;
        boolean z12 = false;
        boolean z13 = false;
        Object obj = this.f45927b;
        switch (i7) {
            case 0:
                f40 f40Var = ((h30) obj).f46217o;
                f40 f40Var2 = f40.f45501x5;
                f40Var.d1();
                f40Var.f28672b.invalidate();
                f40Var.K1.invalidate();
                if (f40Var.f45551m2) {
                    f40Var.f45551m2 = false;
                    f40Var.Q0(true);
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                t30 t30Var = (t30) obj;
                t30Var.G = null;
                f40 f40Var3 = t30Var.L;
                f40Var3.K1.invalidate();
                f40Var3.U3.invalidate();
                f40Var3.f28672b.invalidate();
                f40.P0(f40Var3);
                t30Var.H.clear();
                t30Var.I.clear();
                return;
            case 2:
                b60 b60Var = (b60) obj;
                b60Var.f43934a = null;
                b60Var.f43935b = false;
                return;
            case 3:
                sa0 sa0Var = (sa0) obj;
                sa0Var.D = false;
                sa0Var.y0();
                return;
            case 4:
                sc0 sc0Var = (sc0) obj;
                if (sc0Var.f49826s != null && sc0Var.f49824n != null) {
                    sc0Var.f49825r.setVisibility(4);
                    sc0Var.f49826s = null;
                    return;
                }
                return;
            case 5:
                ((mg0) obj).T.setVisibility(8);
                return;
            case 6:
                fh0 fh0Var = (fh0) obj;
                fh0Var.f45774f = 1.0f;
                fh0Var.invalidate();
                return;
            case 7:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.f41304e)) {
                    notificationsCustomSettingsActivity.f41304e = null;
                    return;
                }
                return;
            case 8:
                km0 km0Var = (km0) obj;
                cc ccVar = km0Var.X;
                if (ccVar != null) {
                    if (ccVar.getParent() != null) {
                        ((ViewGroup) km0Var.X.getParent()).removeView(km0Var.X);
                    }
                    km0Var.X = null;
                }
                km0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 9:
                cn0 cn0Var = (cn0) obj;
                dn0 dn0Var = cn0Var.m0;
                org.telegram.ui.ActionBar.y4[] y4VarArr = dn0Var.f45019n;
                dn0Var.f45020r = null;
                if (dn0Var.f45023x) {
                    y4VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.y4 y4Var = y4VarArr[0];
                    y4VarArr[0] = y4VarArr[1];
                    y4VarArr[1] = y4Var;
                    y4Var.setVisibility(8);
                    if (dn0Var.f45019n[0].f28791b == dn0Var.h.getFirstTabId()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    dn0Var.f45017e = z9;
                    dn0Var.h.i(1.0f, dn0Var.f45019n[0].f28791b);
                }
                dn0Var.f45021s = false;
                cn0Var.f44755h0 = false;
                cn0Var.f44754g0 = false;
                dn0.h0(dn0Var).setEnabled(true);
                dn0Var.h.setEnabled(true);
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.v50) obj).f38863c;
                if (photoViewer.A2 != null) {
                    hf0 hf0Var = new hf0(this, 21);
                    photoViewer.H2 = hf0Var;
                    org.telegram.messenger.g0.i3(hf0Var, 860L);
                    return;
                }
                return;
            case 11:
                tp0 tp0Var = (tp0) obj;
                PhotoViewer photoViewer2 = tp0Var.f50321b;
                og.o oVar = photoViewer2.C1.f33527b;
                oVar.q();
                CropAreaView cropAreaView = oVar.f21012a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f33527b.J = true;
                photoViewer2.f41473o6 = null;
                photoViewer2.f41517t4 = tp0Var.f50320a;
                fi.q3 q3Var = photoViewer2.a1().L;
                if (photoViewer2.f41517t4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q3Var.b(z10);
                fi.q3 q3Var2 = photoViewer2.K1;
                if (q3Var2 != null) {
                    if (photoViewer2.f41517t4 != 3) {
                        z12 = true;
                    }
                    q3Var2.b(z12);
                }
                if (photoViewer2.f41517t4 != 3) {
                    photoViewer2.Y5 = 0.0f;
                }
                photoViewer2.f41465n6 = -1;
                photoViewer2.f41378d6 = 1.0f;
                photoViewer2.Z5 = 1.0f;
                photoViewer2.f41360b6 = 0.0f;
                photoViewer2.f41370c6 = 0.0f;
                photoViewer2.t3(1.0f);
                photoViewer2.f41515t2 = true;
                photoViewer2.f41382e0.invalidate();
                return;
            case 12:
                up0 up0Var = (up0) obj;
                PhotoViewer photoViewer3 = up0Var.f50543b;
                photoViewer3.I1.f37941i0.setVisibility(0);
                photoViewer3.f41473o6 = null;
                photoViewer3.f41517t4 = up0Var.f50542a;
                fi.q3 q3Var3 = photoViewer3.a1().L;
                if (photoViewer3.f41517t4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                q3Var3.b(z11);
                fi.q3 q3Var4 = photoViewer3.K1;
                if (q3Var4 != null) {
                    if (photoViewer3.f41517t4 != 3) {
                        z13 = true;
                    }
                    q3Var4.b(z13);
                }
                if (photoViewer3.f41517t4 != 3) {
                    photoViewer3.Y5 = 0.0f;
                }
                photoViewer3.f41465n6 = -1;
                photoViewer3.f41378d6 = 1.0f;
                photoViewer3.Z5 = 1.0f;
                photoViewer3.f41360b6 = 0.0f;
                photoViewer3.f41370c6 = 0.0f;
                photoViewer3.t3(1.0f);
                photoViewer3.f41515t2 = true;
                photoViewer3.f41382e0.invalidate();
                return;
            case 13:
                ((PhotoViewer) ((yp0) obj).f52099q0).f41553x3[0].setTag(null);
                return;
            case 14:
                ((zp0) obj).d.T1.f47673k0 = 1.0f;
                return;
            case 15:
                PhotoViewer photoViewer4 = ((zp0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f47673k0 = 1.0f;
                return;
            case 16:
                org.telegram.messenger.g0.h3(new hf0(this, 23));
                return;
            case 17:
                qp0 qp0Var = (qp0) obj;
                if (animator.equals(qp0Var.f49122c.T7)) {
                    qp0Var.f49122c.T7 = null;
                    return;
                }
                return;
            case 18:
                wq0 wq0Var = (wq0) obj;
                if (wq0Var.f51421e == animator) {
                    wq0Var.f51420c[1].setVisibility(8);
                    wq0Var.f51421e = null;
                    return;
                }
                return;
            case 19:
                ir0 ir0Var = (ir0) obj;
                if (ir0Var.C != null) {
                    ir0Var.C = null;
                    ir0Var.b();
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
                ((gv0) obj).f46164b.R5 = null;
                return;
            case 22:
                nw0 nw0Var = (nw0) obj;
                if (!nw0Var.E) {
                    nw0Var.setVisibility(8);
                    return;
                }
                return;
            case 23:
                lx0 lx0Var = (lx0) obj;
                if (animator.equals(lx0Var.d)) {
                    lx0Var.d = null;
                    return;
                }
                return;
            case 24:
                ((lz0) obj).d.Y.f47673k0 = 1.0f;
                return;
            case 25:
                SecretMediaViewer secretMediaViewer = ((lz0) obj).d;
                secretMediaViewer.Y.setVisibility(4);
                secretMediaViewer.Y.f47673k0 = 1.0f;
                return;
            case 26:
                t11 t11Var = ((k01) obj).f47131e;
                t11Var.S0.G = 0.0f;
                t11Var.S0 = null;
                t11Var.f50036h0.invalidate();
                return;
            case 27:
                ch.e0.a();
                t11 t11Var2 = (t11) obj;
                r01 r01Var = t11Var2.f50036h0;
                r01 r01Var2 = t11Var2.f50036h0;
                r01Var.setLayerType(0, null);
                l01 l01Var = t11Var2.f50032f0;
                l01Var.setLayerType(0, null);
                t11Var2.f50029e0.setLayerType(0, null);
                t11Var2.f50021b0.setLayerType(0, null);
                org.telegram.ui.Components.sm smVar = t11Var2.f50047n0;
                if (smVar != null) {
                    smVar.setLayerType(0, null);
                }
                View view = t11Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                l01Var.b();
                t11Var2.f50026d0.m(false);
                org.telegram.messenger.qs.e().k(99, 512);
                t11Var2.X1.e();
                org.telegram.messenger.g0.h3(new uu0(org.telegram.messenger.qs.e(), 15));
                t11Var2.h();
                t11Var2.E(1.0f);
                for (int i10 = 0; i10 < r01Var2.getChildCount(); i10++) {
                    View childAt = r01Var2.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i11 = 0; i11 < t11Var2.f50026d0.f39048b.getChildCount(); i11++) {
                    View childAt2 = t11Var2.f50026d0.f39048b.getChildAt(i11);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                t11Var2.f50026d0.f39048b.invalidate();
                t11Var2.f50042k0.invalidate();
                r01Var2.invalidate();
                return;
            case 28:
                ((e51) obj).f45139a0.setVisibility(8);
                return;
            default:
                x71 x71Var = ((m71) obj).f47820a;
                if (!x71Var.f51607q1.a()) {
                    x71Var.S1.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f45926a) {
            case 11:
                tp0 tp0Var = (tp0) this.f45927b;
                tp0Var.f50321b.U0.setVisibility(0);
                tp0Var.f50321b.C1.setVisibility(0);
                return;
            case 12:
                return;
            case 22:
                ((nw0) this.f45927b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
