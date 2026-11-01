package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a50;
import org.telegram.ui.av;
import org.telegram.ui.b40;
import org.telegram.ui.bv;
import org.telegram.ui.cs0;
import org.telegram.ui.cv;
import org.telegram.ui.dr0;
import org.telegram.ui.e7;
import org.telegram.ui.er0;
import org.telegram.ui.gi0;
import org.telegram.ui.gw;
import org.telegram.ui.ic;
import org.telegram.ui.kg0;
import org.telegram.ui.lo0;
import org.telegram.ui.mo0;
import org.telegram.ui.o40;
import org.telegram.ui.oy;
import org.telegram.ui.qh0;
import org.telegram.ui.rn0;
import org.telegram.ui.sx;
import org.telegram.ui.vd0;
import org.telegram.ui.vq0;
import org.telegram.ui.vx;
import org.telegram.ui.w60;
import org.telegram.ui.xb0;
import org.telegram.ui.xt;
import org.telegram.ui.yq0;
import org.telegram.ui.yx;
import org.telegram.ui.zq0;
import org.telegram.ui.zx;
public final class i2 extends AnimatorListenerAdapter {
    public final int f31549a;
    public final Object f31550b;

    public i2(Object obj, int i10) {
        this.f31549a = i10;
        this.f31550b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31549a) {
            case 15:
                ((vd0) this.f31550b).f42499s = null;
                return;
            case 21:
                ((PhotoViewer) ((jw0) this.f31550b).f27584c).A2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        boolean z10;
        org.telegram.ui.ActionBar.l lVar;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10 = this.f31549a;
        float f7 = 0.0f;
        boolean z14 = false;
        Object obj = this.f31550b;
        switch (i10) {
            case 0:
                k2 k2Var = (k2) obj;
                k2Var.J = false;
                k2Var.T.e = false;
                if (k2Var.U && (animatorSet = k2Var.Q) != null) {
                    animatorSet.cancel();
                    k2Var.Q.start();
                }
                k2Var.c();
                return;
            case 1:
                ((s2) obj).e.setVisibility(8);
                return;
            case 2:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) obj;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 3:
                xt xtVar = (xt) obj;
                if (animator.equals(xtVar.f43455n[0])) {
                    xtVar.f43455n[0] = null;
                    return;
                }
                return;
            case 4:
                av avVar = (av) obj;
                cv cvVar = avVar.f35841n;
                bv[] bvVarArr = cvVar.f36418f;
                cvVar.h = null;
                if (cvVar.f36421s) {
                    bvVarArr[1].setVisibility(8);
                } else {
                    bv bvVar = bvVarArr[0];
                    bvVarArr[0] = bvVarArr[1];
                    bvVarArr[1] = bvVar;
                    bvVar.setVisibility(8);
                    if (cvVar.f36418f[0].f36120f == cvVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cvVar.f36423x = z10;
                    cvVar.e.i(1.0f, cvVar.f36418f[0].f36120f);
                }
                cvVar.f36419n = false;
                avVar.f35839c = false;
                avVar.f35838b = false;
                cv.k0(cvVar).setEnabled(true);
                cvVar.e.setEnabled(true);
                return;
            case 5:
                gw gwVar = (gw) obj;
                zx.u1(gwVar.M, gwVar.L, 0.0f);
                return;
            case 6:
                zx zxVar = (zx) obj;
                boolean z15 = zxVar.G0;
                if (z15) {
                    f7 = 1.0f;
                }
                zxVar.H0 = f7;
                if (!z15) {
                    zxVar.E0.setVisibility(8);
                }
                View view = zxVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                zx zxVar2 = ((sx) obj).f41487n0;
                zxVar2.f44151g3 = null;
                if (!zxVar2.f44171k3) {
                    yx[] yxVarArr = zxVar2.f44137e0;
                    yx yxVar = yxVarArr[0];
                    yx yxVar2 = yxVarArr[1];
                    yxVarArr[0] = yxVar2;
                    yxVarArr[1] = yxVar;
                    zxVar2.f44243z0.g(1.0f, yxVar2.h);
                    zxVar2.f5(false);
                    zxVar2.f44137e0[0].d.getClass();
                    zxVar2.f44137e0[1].d.getClass();
                }
                zxVar2.f44137e0[1].setVisibility(8);
                zx.j1(zxVar2, true);
                zxVar2.f44156h3 = false;
                zxVar2.f44184n3 = false;
                lVar = ((org.telegram.ui.ActionBar.k2) zxVar2).actionBar;
                lVar.setEnabled(true);
                zxVar2.f44243z0.setEnabled(true);
                zxVar2.C3(zxVar2.f44137e0[0]);
                return;
            case 8:
                super.onAnimationEnd(animator);
                ((vx) obj).setScrollEnabled(true);
                return;
            case 9:
                oy oyVar = (oy) obj;
                if (oyVar.f40293w == animator) {
                    oyVar.f40293w = null;
                    return;
                }
                return;
            case 10:
                f80 f80Var = (f80) obj;
                FrameLayout frameLayout = f80Var.f26109b;
                kg.f0 f0Var = (kg.f0) f80Var.f26110c;
                if (f0Var.getParent() != null) {
                    frameLayout.removeView(f0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((e7) f80Var.d);
                return;
            case 11:
                a50 a50Var = ((b40) obj).f35936o;
                a50 a50Var2 = a50.f35573u5;
                a50Var.d1();
                a50Var.f21587b.invalidate();
                a50Var.H1.invalidate();
                if (a50Var.f35616j2) {
                    a50Var.f35616j2 = false;
                    a50Var.Q0(true);
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                o40 o40Var = (o40) obj;
                o40Var.G = null;
                a50 a50Var3 = o40Var.L;
                a50Var3.H1.invalidate();
                a50Var3.R3.invalidate();
                a50Var3.f21587b.invalidate();
                a50.P0(a50Var3);
                o40Var.H.clear();
                o40Var.I.clear();
                return;
            case 13:
                w60 w60Var = (w60) obj;
                w60Var.f42677a = null;
                w60Var.f42678b = false;
                return;
            case 14:
                xb0 xb0Var = (xb0) obj;
                xb0Var.F = false;
                xb0Var.A0();
                return;
            case 15:
                vd0 vd0Var = (vd0) obj;
                if (vd0Var.f42499s != null && vd0Var.f42497n != null) {
                    vd0Var.f42498r.setVisibility(4);
                    vd0Var.f42499s = null;
                    return;
                }
                return;
            case 16:
                ((qh0) obj).T.setVisibility(8);
                return;
            case 17:
                gi0 gi0Var = (gi0) obj;
                gi0Var.f37517f = 1.0f;
                gi0Var.invalidate();
                return;
            case 18:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
            case 19:
                rn0 rn0Var = (rn0) obj;
                ic icVar = rn0Var.X;
                if (icVar != null) {
                    if (icVar.getParent() != null) {
                        ((ViewGroup) rn0Var.X.getParent()).removeView(rn0Var.X);
                    }
                    rn0Var.X = null;
                }
                rn0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 20:
                lo0 lo0Var = (lo0) obj;
                mo0 mo0Var = lo0Var.m0;
                h5[] h5VarArr = mo0Var.f39589n;
                mo0Var.f39590r = null;
                if (mo0Var.f39593x) {
                    h5VarArr[1].setVisibility(8);
                } else {
                    h5 h5Var = h5VarArr[0];
                    h5VarArr[0] = h5VarArr[1];
                    h5VarArr[1] = h5Var;
                    h5Var.setVisibility(8);
                    if (mo0Var.f39589n[0].f20380b == mo0Var.h.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    mo0Var.e = z11;
                    mo0Var.h.i(1.0f, mo0Var.f39589n[0].f20380b);
                }
                mo0Var.f39591s = false;
                lo0Var.f39343h0 = false;
                lo0Var.f39342g0 = false;
                mo0.h0(mo0Var).setEnabled(true);
                mo0Var.h.setEnabled(true);
                return;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) ((jw0) obj).f27584c;
                if (photoViewer.A2 != null) {
                    kg0 kg0Var = new kg0(this, 21);
                    photoViewer.I2 = kg0Var;
                    org.telegram.messenger.i0.h3(kg0Var, 860L);
                    return;
                }
                return;
            case 22:
                yq0 yq0Var = (yq0) obj;
                PhotoViewer photoViewer2 = yq0Var.f43710b;
                eg.q qVar = photoViewer2.C1.f24715b;
                qVar.q();
                CropAreaView cropAreaView = qVar.f6583a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f24715b.J = true;
                photoViewer2.f33578p6 = null;
                photoViewer2.f33622u4 = yq0Var.f43709a;
                vh.r2 r2Var = photoViewer2.h1().L;
                if (photoViewer2.f33622u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                r2Var.b(z12);
                vh.r2 r2Var2 = photoViewer2.K1;
                if (r2Var2 != null) {
                    if (photoViewer2.f33622u4 != 3) {
                        z14 = true;
                    }
                    r2Var2.b(z14);
                }
                if (photoViewer2.f33622u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f33570o6 = -1;
                photoViewer2.f33483e6 = 1.0f;
                photoViewer2.f33445a6 = 1.0f;
                photoViewer2.f33465c6 = 0.0f;
                photoViewer2.f33474d6 = 0.0f;
                photoViewer2.z3(1.0f);
                photoViewer2.f33611t2 = true;
                photoViewer2.f33477e0.invalidate();
                return;
            case 23:
                zq0 zq0Var = (zq0) obj;
                PhotoViewer photoViewer3 = zq0Var.f44041b;
                photoViewer3.I1.f29109i0.setVisibility(0);
                photoViewer3.f33578p6 = null;
                photoViewer3.f33622u4 = zq0Var.f44040a;
                vh.r2 r2Var3 = photoViewer3.h1().L;
                if (photoViewer3.f33622u4 != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                r2Var3.b(z13);
                vh.r2 r2Var4 = photoViewer3.K1;
                if (r2Var4 != null) {
                    if (photoViewer3.f33622u4 != 3) {
                        z14 = true;
                    }
                    r2Var4.b(z14);
                }
                if (photoViewer3.f33622u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f33570o6 = -1;
                photoViewer3.f33483e6 = 1.0f;
                photoViewer3.f33445a6 = 1.0f;
                photoViewer3.f33465c6 = 0.0f;
                photoViewer3.f33474d6 = 0.0f;
                photoViewer3.z3(1.0f);
                photoViewer3.f33611t2 = true;
                photoViewer3.f33477e0.invalidate();
                return;
            case 24:
                ((PhotoViewer) ((dr0) obj).f36673q0).y3[0].setTag(null);
                return;
            case 25:
                ((er0) obj).d.T1.f41451k0 = 1.0f;
                return;
            case 26:
                PhotoViewer photoViewer4 = ((er0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f41451k0 = 1.0f;
                return;
            case 27:
                org.telegram.messenger.i0.g3(new kg0(this, 23));
                return;
            case 28:
                vq0 vq0Var = (vq0) obj;
                if (animator.equals(vq0Var.f42585c.U7)) {
                    vq0Var.f42585c.U7 = null;
                    return;
                }
                return;
            default:
                cs0 cs0Var = (cs0) obj;
                if (cs0Var.e == animator) {
                    cs0Var.f36396c[1].setVisibility(8);
                    cs0Var.e = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f31549a) {
            case 22:
                yq0 yq0Var = (yq0) this.f31550b;
                yq0Var.f43710b.U0.setVisibility(0);
                yq0Var.f43710b.C1.setVisibility(0);
                return;
            case 23:
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
