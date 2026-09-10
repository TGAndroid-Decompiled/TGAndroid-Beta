package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import bi.b5;
import bi.s7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
import org.telegram.ui.bq0;
import org.telegram.ui.bu0;
import org.telegram.ui.bv0;
import org.telegram.ui.dr0;
import org.telegram.ui.er0;
import org.telegram.ui.gi;
import org.telegram.ui.gk0;
import org.telegram.ui.gr0;
import org.telegram.ui.hf0;
import org.telegram.ui.hu;
import org.telegram.ui.id0;
import org.telegram.ui.j50;
import org.telegram.ui.j60;
import org.telegram.ui.j80;
import org.telegram.ui.kj0;
import org.telegram.ui.nc;
import org.telegram.ui.nv;
import org.telegram.ui.ov;
import org.telegram.ui.pv;
import org.telegram.ui.py;
import org.telegram.ui.ql0;
import org.telegram.ui.st0;
import org.telegram.ui.sy;
import org.telegram.ui.vt0;
import org.telegram.ui.vy;
import org.telegram.ui.wt0;
import org.telegram.ui.wy;
import org.telegram.ui.x50;
import org.telegram.ui.zw;
import org.webrtc.OrientationHelper;
public final class v2 extends AnimatorListenerAdapter {
    public final int f28500a;
    public final Object f28501b;

    public v2(Object obj, int i10) {
        this.f28500a = i10;
        this.f28501b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28500a) {
            case 15:
                ((hf0) this.f28501b).f33378s = null;
                return;
            case 21:
                ((PhotoViewer) ((vv0) this.f28501b).f28603c).A2 = null;
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
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z11;
        org.telegram.ui.ActionBar.l lVar2;
        boolean z12;
        boolean z13;
        float f7 = 0.0f;
        boolean z14 = false;
        switch (this.f28500a) {
            case 0:
                ((w2) this.f28501b).f28523c.unlock();
                AndroidUtilities.unlockOrientation(((w2) this.f28501b).f28521a);
                if (((w2) this.f28501b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((w2) this.f28501b).f28521a.getSystemService("window");
                    ((w2) this.f28501b).setVisibility(8);
                    try {
                        windowManager.removeView((w2) this.f28501b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 1:
                c3 c3Var = (c3) this.f28501b;
                c3Var.J = false;
                c3Var.T.e = false;
                if (c3Var.U && (animatorSet = c3Var.Q) != null) {
                    animatorSet.cancel();
                    c3Var.Q.start();
                }
                c3Var.c();
                return;
            case 2:
                ((k3) this.f28501b).e.setVisibility(8);
                return;
            case 3:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f28501b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 4:
                hu huVar = (hu) this.f28501b;
                if (animator.equals(huVar.f33461n[0])) {
                    huVar.f33461n[0] = null;
                    return;
                }
                return;
            case 5:
                nv nvVar = (nv) this.f28501b;
                pv pvVar = nvVar.f35348n;
                ov[] ovVarArr = pvVar.f35910f;
                pvVar.h = null;
                if (pvVar.f35913s) {
                    ovVarArr[1].setVisibility(8);
                } else {
                    ov ovVar = ovVarArr[0];
                    ovVarArr[0] = ovVarArr[1];
                    ovVarArr[1] = ovVar;
                    ovVar.setVisibility(8);
                    if (pvVar.f35910f[0].f35619f == pvVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pvVar.f35914w = z10;
                    pvVar.e.j(1.0f, pvVar.f35910f[0].f35619f);
                }
                pvVar.f35911n = false;
                nvVar.f35346c = false;
                nvVar.f35345b = false;
                pv.f0(pvVar).setEnabled(true);
                pvVar.e.setEnabled(true);
                return;
            case 6:
                zw zwVar = (zw) this.f28501b;
                wy.q1(zwVar.M, zwVar.L, 0.0f);
                return;
            case 7:
                wy wyVar = (wy) this.f28501b;
                boolean z15 = wyVar.G0;
                if (z15) {
                    f7 = 1.0f;
                }
                wyVar.H0 = f7;
                if (!z15) {
                    wyVar.E0.setVisibility(8);
                }
                View view = wyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 8:
                wy wyVar2 = ((py) this.f28501b).E0;
                wyVar2.f38440f3 = null;
                if (!wyVar2.j3) {
                    vy[] vyVarArr = wyVar2.f38431e0;
                    vy vyVar = vyVarArr[0];
                    vy vyVar2 = vyVarArr[1];
                    vyVarArr[0] = vyVar2;
                    vyVarArr[1] = vyVar;
                    wyVar2.f38536z0.g(1.0f, vyVar2.h);
                    wyVar2.T4(false);
                    wyVar2.f38431e0[0].d.getClass();
                    wyVar2.f38431e0[1].d.getClass();
                }
                wyVar2.f38431e0[1].setVisibility(8);
                wy.f1(wyVar2, true);
                wyVar2.f38445g3 = false;
                wyVar2.f38471m3 = false;
                lVar = ((org.telegram.ui.ActionBar.p2) wyVar2).actionBar;
                lVar.setEnabled(true);
                wyVar2.f38536z0.setEnabled(true);
                wyVar2.r3(wyVar2.f38431e0[0]);
                return;
            case 9:
                super.onAnimationEnd(animator);
                ((sy) this.f28501b).setScrollEnabled(true);
                return;
            case 10:
                b90 b90Var = (b90) this.f28501b;
                FrameLayout frameLayout = b90Var.f21766b;
                s7 s7Var = (s7) b90Var.f21767c;
                if (s7Var.getParent() != null) {
                    frameLayout.removeView(s7Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((gi) b90Var.d);
                return;
            case 11:
                j60 j60Var = ((j50) this.f28501b).f33930o;
                j60 j60Var2 = j60.D3;
                j60Var.b1();
                viewGroup = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
                viewGroup.invalidate();
                j60Var.Q.invalidate();
                if (j60Var.f34009s0) {
                    j60Var.f34009s0 = false;
                    j60Var.O0(true);
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                x50 x50Var = (x50) this.f28501b;
                x50Var.G = null;
                j60 j60Var3 = x50Var.L;
                j60Var3.Q.invalidate();
                j60Var3.a2.invalidate();
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) j60Var3).containerView;
                viewGroup2.invalidate();
                j60.J0(j60Var3);
                x50Var.H.clear();
                x50Var.I.clear();
                return;
            case 13:
                j80 j80Var = (j80) this.f28501b;
                j80Var.d = null;
                j80Var.f34049a = null;
                j80Var.f34050b = false;
                return;
            case 14:
                id0 id0Var = (id0) this.f28501b;
                id0Var.H = false;
                id0Var.o0();
                return;
            case 15:
                hf0 hf0Var = (hf0) this.f28501b;
                if (hf0Var.f33378s != null && hf0Var.f33376n != null) {
                    hf0Var.f33377r.setVisibility(4);
                    hf0Var.f33378s = null;
                    return;
                }
                return;
            case 16:
                ((kj0) this.f28501b).T.setVisibility(8);
                return;
            case 17:
                gk0 gk0Var = (gk0) this.f28501b;
                gk0Var.f33131f = 1.0f;
                gk0Var.invalidate();
                return;
            case 18:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f28501b;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
            case 19:
                bq0 bq0Var = (bq0) this.f28501b;
                nc ncVar = bq0Var.X;
                if (ncVar != null) {
                    if (ncVar.getParent() != null) {
                        ((ViewGroup) bq0Var.X.getParent()).removeView(bq0Var.X);
                    }
                    bq0Var.X = null;
                }
                bq0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 20:
                dr0 dr0Var = (dr0) this.f28501b;
                gr0 gr0Var = dr0Var.D0;
                er0[] er0VarArr = gr0Var.f33170n;
                gr0Var.f33171r = null;
                if (gr0Var.f33173w) {
                    er0VarArr[1].setVisibility(8);
                } else {
                    er0 er0Var = er0VarArr[0];
                    er0VarArr[0] = er0VarArr[1];
                    er0VarArr[1] = er0Var;
                    er0Var.setVisibility(8);
                    if (gr0Var.f33170n[0].e == gr0Var.h.getFirstTabId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    gr0Var.e = z11;
                    gr0Var.h.j(1.0f, gr0Var.f33170n[0].e);
                }
                gr0Var.f33172s = false;
                dr0Var.f31965y0 = false;
                dr0Var.f31964x0 = false;
                lVar2 = ((org.telegram.ui.ActionBar.p2) gr0Var).actionBar;
                lVar2.setEnabled(true);
                gr0Var.h.setEnabled(true);
                return;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) ((vv0) this.f28501b).f28603c;
                if (photoViewer.A2 != null) {
                    ql0 ql0Var = new ql0(this, 17);
                    photoViewer.I2 = ql0Var;
                    AndroidUtilities.runOnUIThread(ql0Var, 860L);
                    return;
                }
                return;
            case 22:
                vt0 vt0Var = (vt0) this.f28501b;
                PhotoViewer photoViewer2 = vt0Var.f37623b;
                kg.p pVar = photoViewer2.C1.f22405b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f12495a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f22405b.J = true;
                photoViewer2.f30149p6 = null;
                photoViewer2.f30193u4 = vt0Var.f37622a;
                b5 b5Var = photoViewer2.f1().L;
                if (photoViewer2.f30193u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                b5Var.b(z12);
                b5 b5Var2 = photoViewer2.K1;
                if (b5Var2 != null) {
                    if (photoViewer2.f30193u4 != 3) {
                        z14 = true;
                    }
                    b5Var2.b(z14);
                }
                if (photoViewer2.f30193u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f30141o6 = -1;
                photoViewer2.f30055e6 = 1.0f;
                photoViewer2.f30017a6 = 1.0f;
                photoViewer2.f30037c6 = 0.0f;
                photoViewer2.f30046d6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.f30182t2 = true;
                photoViewer2.f30049e0.invalidate();
                return;
            case 23:
                wt0 wt0Var = (wt0) this.f28501b;
                PhotoViewer photoViewer3 = wt0Var.f38390b;
                photoViewer3.I1.f27023i0.setVisibility(0);
                photoViewer3.f30149p6 = null;
                photoViewer3.f30193u4 = wt0Var.f38389a;
                b5 b5Var3 = photoViewer3.f1().L;
                if (photoViewer3.f30193u4 != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                b5Var3.b(z13);
                b5 b5Var4 = photoViewer3.K1;
                if (b5Var4 != null) {
                    if (photoViewer3.f30193u4 != 3) {
                        z14 = true;
                    }
                    b5Var4.b(z14);
                }
                if (photoViewer3.f30193u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f30141o6 = -1;
                photoViewer3.f30055e6 = 1.0f;
                photoViewer3.f30017a6 = 1.0f;
                photoViewer3.f30037c6 = 0.0f;
                photoViewer3.f30046d6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.f30182t2 = true;
                photoViewer3.f30049e0.invalidate();
                return;
            case 24:
                ((PhotoViewer) ((au0) this.f28501b).f31079q0).y3[0].setTag(null);
                return;
            case 25:
                ((bu0) this.f28501b).d.T1.f35612k0 = 1.0f;
                return;
            case 26:
                PhotoViewer photoViewer4 = ((bu0) this.f28501b).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f35612k0 = 1.0f;
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new ql0(this, 19));
                return;
            case 28:
                st0 st0Var = (st0) this.f28501b;
                if (animator.equals(st0Var.f36755c.T7)) {
                    st0Var.f36755c.T7 = null;
                    return;
                }
                return;
            default:
                bv0 bv0Var = (bv0) this.f28501b;
                if (bv0Var.e == animator) {
                    bv0Var.f31417c[1].setVisibility(8);
                    bv0Var.e = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28500a) {
            case 22:
                vt0 vt0Var = (vt0) this.f28501b;
                vt0Var.f37623b.U0.setVisibility(0);
                vt0Var.f37623b.C1.setVisibility(0);
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
