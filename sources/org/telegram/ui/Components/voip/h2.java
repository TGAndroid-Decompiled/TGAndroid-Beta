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
import org.telegram.ui.Components.iw0;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ar0;
import org.telegram.ui.ay;
import org.telegram.ui.b50;
import org.telegram.ui.br0;
import org.telegram.ui.bv;
import org.telegram.ui.c40;
import org.telegram.ui.cv;
import org.telegram.ui.ds0;
import org.telegram.ui.dv;
import org.telegram.ui.e7;
import org.telegram.ui.fr0;
import org.telegram.ui.gr0;
import org.telegram.ui.hw;
import org.telegram.ui.ic;
import org.telegram.ui.ii0;
import org.telegram.ui.mg0;
import org.telegram.ui.no0;
import org.telegram.ui.oo0;
import org.telegram.ui.p40;
import org.telegram.ui.py;
import org.telegram.ui.sh0;
import org.telegram.ui.tn0;
import org.telegram.ui.tx;
import org.telegram.ui.wd0;
import org.telegram.ui.wx;
import org.telegram.ui.x60;
import org.telegram.ui.xq0;
import org.telegram.ui.yb0;
import org.telegram.ui.yt;
import org.telegram.ui.zx;
public final class h2 extends AnimatorListenerAdapter {
    public final int f31464a;
    public final Object f31465b;

    public h2(Object obj, int i10) {
        this.f31464a = i10;
        this.f31465b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31464a) {
            case 15:
                ((wd0) this.f31465b).f42948s = null;
                return;
            case 21:
                ((PhotoViewer) ((iw0) this.f31465b).f27111c).A2 = null;
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
        int i10 = this.f31464a;
        float f7 = 0.0f;
        boolean z14 = false;
        Object obj = this.f31465b;
        switch (i10) {
            case 0:
                j2 j2Var = (j2) obj;
                j2Var.J = false;
                j2Var.T.e = false;
                if (j2Var.U && (animatorSet = j2Var.Q) != null) {
                    animatorSet.cancel();
                    j2Var.Q.start();
                }
                j2Var.c();
                return;
            case 1:
                ((r2) obj).e.setVisibility(8);
                return;
            case 2:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) obj;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 3:
                yt ytVar = (yt) obj;
                if (animator.equals(ytVar.f43889n[0])) {
                    ytVar.f43889n[0] = null;
                    return;
                }
                return;
            case 4:
                bv bvVar = (bv) obj;
                dv dvVar = bvVar.f36308n;
                cv[] cvVarArr = dvVar.f36841f;
                dvVar.h = null;
                if (dvVar.f36844s) {
                    cvVarArr[1].setVisibility(8);
                } else {
                    cv cvVar = cvVarArr[0];
                    cvVarArr[0] = cvVarArr[1];
                    cvVarArr[1] = cvVar;
                    cvVar.setVisibility(8);
                    if (dvVar.f36841f[0].f36556f == dvVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dvVar.f36846x = z10;
                    dvVar.e.i(1.0f, dvVar.f36841f[0].f36556f);
                }
                dvVar.f36842n = false;
                bvVar.f36306c = false;
                bvVar.f36305b = false;
                dv.j0(dvVar).setEnabled(true);
                dvVar.e.setEnabled(true);
                return;
            case 5:
                hw hwVar = (hw) obj;
                ay.t1(hwVar.M, hwVar.L, 0.0f);
                return;
            case 6:
                ay ayVar = (ay) obj;
                boolean z15 = ayVar.G0;
                if (z15) {
                    f7 = 1.0f;
                }
                ayVar.H0 = f7;
                if (!z15) {
                    ayVar.E0.setVisibility(8);
                }
                View view = ayVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                ay ayVar2 = ((tx) obj).f41967n0;
                ayVar2.f35808g3 = null;
                if (!ayVar2.f35828k3) {
                    zx[] zxVarArr = ayVar2.f35794e0;
                    zx zxVar = zxVarArr[0];
                    zx zxVar2 = zxVarArr[1];
                    zxVarArr[0] = zxVar2;
                    zxVarArr[1] = zxVar;
                    ayVar2.f35900z0.g(1.0f, zxVar2.h);
                    ayVar2.e5(false);
                    ayVar2.f35794e0[0].d.getClass();
                    ayVar2.f35794e0[1].d.getClass();
                }
                ayVar2.f35794e0[1].setVisibility(8);
                ay.i1(ayVar2, true);
                ayVar2.f35813h3 = false;
                ayVar2.f35841n3 = false;
                lVar = ((org.telegram.ui.ActionBar.k2) ayVar2).actionBar;
                lVar.setEnabled(true);
                ayVar2.f35900z0.setEnabled(true);
                ayVar2.B3(ayVar2.f35794e0[0]);
                return;
            case 8:
                super.onAnimationEnd(animator);
                ((wx) obj).setScrollEnabled(true);
                return;
            case 9:
                py pyVar = (py) obj;
                if (pyVar.f40812w == animator) {
                    pyVar.f40812w = null;
                    return;
                }
                return;
            case 10:
                f80 f80Var = (f80) obj;
                FrameLayout frameLayout = f80Var.f26010b;
                kg.f0 f0Var = (kg.f0) f80Var.f26011c;
                if (f0Var.getParent() != null) {
                    frameLayout.removeView(f0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((e7) f80Var.d);
                return;
            case 11:
                b50 b50Var = ((c40) obj).f36383o;
                b50 b50Var2 = b50.f35989u5;
                b50Var.d1();
                b50Var.f21586b.invalidate();
                b50Var.H1.invalidate();
                if (b50Var.f36032j2) {
                    b50Var.f36032j2 = false;
                    b50Var.Q0(true);
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                p40 p40Var = (p40) obj;
                p40Var.G = null;
                b50 b50Var3 = p40Var.L;
                b50Var3.H1.invalidate();
                b50Var3.R3.invalidate();
                b50Var3.f21586b.invalidate();
                b50.P0(b50Var3);
                p40Var.H.clear();
                p40Var.I.clear();
                return;
            case 13:
                x60 x60Var = (x60) obj;
                x60Var.f43452a = null;
                x60Var.f43453b = false;
                return;
            case 14:
                yb0 yb0Var = (yb0) obj;
                yb0Var.F = false;
                yb0Var.z0();
                return;
            case 15:
                wd0 wd0Var = (wd0) obj;
                if (wd0Var.f42948s != null && wd0Var.f42946n != null) {
                    wd0Var.f42947r.setVisibility(4);
                    wd0Var.f42948s = null;
                    return;
                }
                return;
            case 16:
                ((sh0) obj).T.setVisibility(8);
                return;
            case 17:
                ii0 ii0Var = (ii0) obj;
                ii0Var.f38267f = 1.0f;
                ii0Var.invalidate();
                return;
            case 18:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
            case 19:
                tn0 tn0Var = (tn0) obj;
                ic icVar = tn0Var.X;
                if (icVar != null) {
                    if (icVar.getParent() != null) {
                        ((ViewGroup) tn0Var.X.getParent()).removeView(tn0Var.X);
                    }
                    tn0Var.X = null;
                }
                tn0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 20:
                no0 no0Var = (no0) obj;
                oo0 oo0Var = no0Var.m0;
                h5[] h5VarArr = oo0Var.f40353n;
                oo0Var.f40354r = null;
                if (oo0Var.f40357x) {
                    h5VarArr[1].setVisibility(8);
                } else {
                    h5 h5Var = h5VarArr[0];
                    h5VarArr[0] = h5VarArr[1];
                    h5VarArr[1] = h5Var;
                    h5Var.setVisibility(8);
                    if (oo0Var.f40353n[0].f20379b == oo0Var.h.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    oo0Var.e = z11;
                    oo0Var.h.i(1.0f, oo0Var.f40353n[0].f20379b);
                }
                oo0Var.f40355s = false;
                no0Var.f40010h0 = false;
                no0Var.f40009g0 = false;
                oo0.g0(oo0Var).setEnabled(true);
                oo0Var.h.setEnabled(true);
                return;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) ((iw0) obj).f27111c;
                if (photoViewer.A2 != null) {
                    mg0 mg0Var = new mg0(this, 21);
                    photoViewer.I2 = mg0Var;
                    org.telegram.messenger.i0.h3(mg0Var, 860L);
                    return;
                }
                return;
            case 22:
                ar0 ar0Var = (ar0) obj;
                PhotoViewer photoViewer2 = ar0Var.f35701b;
                eg.q qVar = photoViewer2.C1.f24615b;
                qVar.q();
                CropAreaView cropAreaView = qVar.f6583a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f24615b.J = true;
                photoViewer2.f33571p6 = null;
                photoViewer2.f33615u4 = ar0Var.f35700a;
                vh.r2 r2Var = photoViewer2.h1().L;
                if (photoViewer2.f33615u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                r2Var.b(z12);
                vh.r2 r2Var2 = photoViewer2.K1;
                if (r2Var2 != null) {
                    if (photoViewer2.f33615u4 != 3) {
                        z14 = true;
                    }
                    r2Var2.b(z14);
                }
                if (photoViewer2.f33615u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f33563o6 = -1;
                photoViewer2.f33476e6 = 1.0f;
                photoViewer2.f33438a6 = 1.0f;
                photoViewer2.f33458c6 = 0.0f;
                photoViewer2.f33467d6 = 0.0f;
                photoViewer2.z3(1.0f);
                photoViewer2.f33604t2 = true;
                photoViewer2.f33470e0.invalidate();
                return;
            case 23:
                br0 br0Var = (br0) obj;
                PhotoViewer photoViewer3 = br0Var.f36298b;
                photoViewer3.I1.f29048i0.setVisibility(0);
                photoViewer3.f33571p6 = null;
                photoViewer3.f33615u4 = br0Var.f36297a;
                vh.r2 r2Var3 = photoViewer3.h1().L;
                if (photoViewer3.f33615u4 != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                r2Var3.b(z13);
                vh.r2 r2Var4 = photoViewer3.K1;
                if (r2Var4 != null) {
                    if (photoViewer3.f33615u4 != 3) {
                        z14 = true;
                    }
                    r2Var4.b(z14);
                }
                if (photoViewer3.f33615u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f33563o6 = -1;
                photoViewer3.f33476e6 = 1.0f;
                photoViewer3.f33438a6 = 1.0f;
                photoViewer3.f33458c6 = 0.0f;
                photoViewer3.f33467d6 = 0.0f;
                photoViewer3.z3(1.0f);
                photoViewer3.f33604t2 = true;
                photoViewer3.f33470e0.invalidate();
                return;
            case 24:
                ((PhotoViewer) ((fr0) obj).f37337q0).y3[0].setTag(null);
                return;
            case 25:
                ((gr0) obj).d.T1.f41928k0 = 1.0f;
                return;
            case 26:
                PhotoViewer photoViewer4 = ((gr0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f41928k0 = 1.0f;
                return;
            case 27:
                org.telegram.messenger.i0.g3(new mg0(this, 23));
                return;
            case 28:
                xq0 xq0Var = (xq0) obj;
                if (animator.equals(xq0Var.f43632c.U7)) {
                    xq0Var.f43632c.U7 = null;
                    return;
                }
                return;
            default:
                ds0 ds0Var = (ds0) obj;
                if (ds0Var.e == animator) {
                    ds0Var.f36819c[1].setVisibility(8);
                    ds0Var.e = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f31464a) {
            case 22:
                ar0 ar0Var = (ar0) this.f31465b;
                ar0Var.f35701b.U0.setVisibility(0);
                ar0Var.f35701b.C1.setVisibility(0);
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
