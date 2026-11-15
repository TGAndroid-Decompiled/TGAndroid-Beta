package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.ui.Components.w40;
import org.telegram.ui.au;
import org.telegram.ui.bc;
import org.telegram.ui.bh;
import org.telegram.ui.bu;
import org.telegram.ui.cu;
import org.telegram.ui.dv;
import org.telegram.ui.hl;
import org.telegram.ui.jh;
import org.telegram.ui.jl;
import org.telegram.ui.lb;
import org.telegram.ui.nx;
import org.telegram.ui.qc;
import org.telegram.ui.qj;
import org.telegram.ui.qq;
import org.telegram.ui.rw;
import org.telegram.ui.sb;
import org.telegram.ui.uw;
import org.telegram.ui.wo;
import org.telegram.ui.xp;
import org.telegram.ui.xw;
import org.telegram.ui.yb1;
import org.telegram.ui.ys;
import org.telegram.ui.yw;
import org.webrtc.OrientationHelper;
public final class w9 extends AnimatorListenerAdapter {
    public final int f31904a;
    public final Object f31905b;

    public w9(Object obj, int i7) {
        this.f31904a = i7;
        this.f31905b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        AnimatorSet animatorSet;
        boolean z10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f31904a) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) this.f31905b;
                ((y9) ((x9) h1Var.f28631b).f32048b).getTransitionParams().e();
                ((y9) ((x9) h1Var.f28631b).f32048b).getTransitionParams().h = false;
                ((y9) ((x9) h1Var.f28631b).f32048b).getTransitionParams().L1 = 1.0f;
                return;
            case 1:
                org.telegram.ui.g3 g3Var = (org.telegram.ui.g3) this.f31905b;
                if (animator.equals(((lb) g3Var.f47288b).S)) {
                    ((lb) g3Var.f47288b).S = null;
                    return;
                }
                return;
            case 2:
                lb lbVar = (lb) this.f31905b;
                if (animator.equals(lbVar.S)) {
                    lbVar.S = null;
                    return;
                }
                return;
            case 3:
                ((sb) this.f31905b).I.setVisibility(8);
                return;
            case 4:
                qc qcVar = (qc) this.f31905b;
                bc bcVar = qcVar.f50570n0;
                if (bcVar != null) {
                    if (bcVar.getParent() != null) {
                        ((ViewGroup) qcVar.f50570n0.getParent()).removeView(qcVar.f50570n0);
                    }
                    qcVar.f50570n0 = null;
                }
                qcVar.f50572p0 = null;
                super.onAnimationEnd(animator);
                return;
            case 5:
                jh jhVar = (jh) this.f31905b;
                if (jhVar.f48349a) {
                    jhVar.d.setTranslationY(0.0f);
                }
                if (jhVar.f48350b) {
                    jhVar.f48352e.setTranslationY(0.0f);
                }
                if (jhVar.f48353f) {
                    jhVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.i9 i9Var = jhVar.f48351c;
                if (i9Var != null) {
                    i9Var.setTranslationY(0.0f);
                }
                jhVar.f48354n.W2[1] = null;
                return;
            case 6:
                qj qjVar = (qj) this.f31905b;
                qjVar.setAnimatedTop(0);
                View view = qjVar.f32254o2;
                if (view != null && view.getVisibility() == 0) {
                    qjVar.f32254o2.setTranslationY(((1.0f - qjVar.getTopViewEnterProgress()) * qjVar.f32254o2.getLayoutParams().height) + qjVar.B2);
                }
                qjVar.R6.L9 = null;
                return;
            case 7:
                ah.l lVar = (ah.l) this.f31905b;
                w40 w40Var = ((hl) lVar.f1084c).f47738c.R.f45329q3;
                if (w40Var != null) {
                    w40Var.setIsMessageTransition(false);
                    ((hl) lVar.f1084c).f47738c.R.f45329q3.d(true);
                    ((hl) lVar.f1084c).f47738c.R.f45329q3.setVisibility(4);
                    return;
                }
                return;
            case 8:
                hl hlVar = (hl) this.f31905b;
                jl jlVar = hlVar.f47738c;
                ArrayList arrayList = jlVar.R.E6;
                q1 q1Var = hlVar.f47737b;
                arrayList.remove(q1Var);
                View view2 = jlVar.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    jlVar.R.A0.invalidate();
                }
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().f32016y0 = false;
                return;
            case 9:
                wo woVar = (wo) this.f31905b;
                woVar.M = 0.0f;
                woVar.L = 1.0f;
                View view3 = woVar.f52944b0;
                if (view3 != null) {
                    view3.invalidate();
                }
                woVar.U.invalidate();
                bh bhVar = woVar.Z;
                if (bhVar != null) {
                    bhVar.run();
                    woVar.Z = null;
                    return;
                }
                return;
            case 10:
                xp xpVar = (xp) this.f31905b;
                View view4 = xpVar.f53276b;
                view4.setAlpha(1.0f);
                v4.o0.x0(view4);
                ((qq) xpVar.d).f50715c.removeView(view4);
                return;
            case 11:
                org.telegram.ui.Components.voip.z zVar = ((org.telegram.ui.Components.voip.v) this.f31905b).f40997t0;
                if (zVar.f41112y0.getParent() != null) {
                    zVar.f41078a.removeView(zVar.f41112y0);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.b0 b0Var = (org.telegram.ui.Components.voip.b0) this.f31905b;
                b0Var.f40509s = null;
                b0Var.f40508r = 1.0f;
                b0Var.b();
                b0Var.e();
                return;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f31905b;
                if (x0Var.getParent() != null) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                    return;
                }
                return;
            case 14:
                yb1 yb1Var = (yb1) this.f31905b;
                if (!yb1Var.f40538a) {
                    yb1Var.W.f46721w.T = true;
                    yb1Var.W.f46721w.invalidate();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.voip.m1 m1Var = (org.telegram.ui.Components.voip.m1) this.f31905b;
                m1Var.f40781i = false;
                m1Var.f40784l.setAlpha(35);
                m1Var.f40783k.setAlpha(102);
                m1Var.f40782j.setAlpha(35);
                m1Var.c();
                return;
            case 16:
                org.telegram.ui.Components.voip.r1 r1Var = ((org.telegram.ui.Components.voip.p1) this.f31905b).f40864c;
                r1Var.P = false;
                r1Var.requestLayout();
                return;
            case 17:
                org.telegram.ui.Components.voip.o2 o2Var = (org.telegram.ui.Components.voip.o2) this.f31905b;
                o2Var.O = 0.0f;
                o2Var.P = 0.0f;
                org.telegram.ui.Components.voip.n2 n2Var = o2Var.d;
                n2Var.setScaleX(o2Var.U);
                n2Var.setScaleY(o2Var.U);
                TextureView textureView = o2Var.f40833e;
                if (textureView != null) {
                    textureView.setScaleX(o2Var.V);
                    textureView.setScaleY(o2Var.V);
                }
                o2Var.setTranslationY(0.0f);
                o2Var.setTranslationX(0.0f);
                o2Var.f40827a0 = o2Var.W;
                o2Var.f40831c0 = null;
                return;
            case 18:
                org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) this.f31905b;
                if (r2Var.Q) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                r2Var.R = f10;
                r2Var.a(r2Var.S, r2Var.T);
                return;
            case 19:
                ((org.telegram.ui.Components.voip.s2) this.f31905b).f40944c.e();
                org.telegram.messenger.g0.P3(((org.telegram.ui.Components.voip.s2) this.f31905b).f40942a);
                if (((org.telegram.ui.Components.voip.s2) this.f31905b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.s2) this.f31905b).f40942a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.s2) this.f31905b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.s2) this.f31905b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.voip.y2 y2Var = (org.telegram.ui.Components.voip.y2) this.f31905b;
                y2Var.K = false;
                y2Var.U.f40778e = false;
                if (y2Var.V && (animatorSet = y2Var.R) != null) {
                    animatorSet.cancel();
                    y2Var.R.start();
                }
                y2Var.c();
                return;
            case 21:
                ((org.telegram.ui.Components.voip.f3) this.f31905b).f40612e.setVisibility(8);
                return;
            case 22:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f31905b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 23:
                ys ysVar = (ys) this.f31905b;
                if (animator.equals(ysVar.f53620n[0])) {
                    ysVar.f53620n[0] = null;
                    return;
                }
                return;
            case 24:
                au auVar = (au) this.f31905b;
                cu cuVar = auVar.f45513n;
                bu[] buVarArr = cuVar.f46249f;
                cuVar.h = null;
                if (cuVar.f46252s) {
                    buVarArr[1].setVisibility(8);
                } else {
                    bu buVar = buVarArr[0];
                    buVarArr[0] = buVarArr[1];
                    buVarArr[1] = buVar;
                    buVar.setVisibility(8);
                    if (cuVar.f46249f[0].f45837f == cuVar.f46248e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cuVar.f46254x = z10;
                    cuVar.f46248e.i(1.0f, cuVar.f46249f[0].f45837f);
                }
                cuVar.f46250n = false;
                auVar.f45510c = false;
                auVar.f45509b = false;
                cu.k0(cuVar).setEnabled(true);
                cuVar.f46248e.setEnabled(true);
                return;
            case 25:
                dv dvVar = (dv) this.f31905b;
                yw.u1(dvVar.M, dvVar.L, 0.0f);
                return;
            case 26:
                yw ywVar = (yw) this.f31905b;
                boolean z11 = ywVar.H0;
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ywVar.I0 = f11;
                if (!z11) {
                    ywVar.F0.setVisibility(8);
                }
                View view5 = ywVar.fragmentView;
                if (view5 != null) {
                    view5.invalidate();
                    return;
                }
                return;
            case 27:
                yw ywVar2 = ((rw) this.f31905b).f51042o0;
                ywVar2.f53691i3 = null;
                if (!ywVar2.f53708m3) {
                    xw[] xwVarArr = ywVar2.f53673f0;
                    xw xwVar = xwVarArr[0];
                    xw xwVar2 = xwVarArr[1];
                    xwVarArr[0] = xwVar2;
                    xwVarArr[1] = xwVar;
                    ywVar2.A0.g(1.0f, xwVar2.h);
                    ywVar2.f5(false);
                    ywVar2.f53673f0[0].d.getClass();
                    ywVar2.f53673f0[1].d.getClass();
                }
                ywVar2.f53673f0[1].setVisibility(8);
                yw.j1(ywVar2, true);
                ywVar2.j3 = false;
                ywVar2.f53722p3 = false;
                kVar = ((org.telegram.ui.ActionBar.e2) ywVar2).actionBar;
                kVar.setEnabled(true);
                ywVar2.A0.setEnabled(true);
                ywVar2.C3(ywVar2.f53673f0[0]);
                return;
            case 28:
                super.onAnimationEnd(animator);
                ((uw) this.f31905b).setScrollEnabled(true);
                return;
            default:
                nx nxVar = (nx) this.f31905b;
                if (nxVar.f49716w == animator) {
                    nxVar.f49716w = null;
                    return;
                }
                return;
        }
    }

    public w9(xp xpVar, v4.o0 o0Var) {
        this.f31904a = 10;
        this.f31905b = xpVar;
    }
}
