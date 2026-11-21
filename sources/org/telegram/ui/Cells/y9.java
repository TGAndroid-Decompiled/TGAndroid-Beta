package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.ui.Components.h50;
import org.telegram.ui.bc;
import org.telegram.ui.bc1;
import org.telegram.ui.bh;
import org.telegram.ui.bx;
import org.telegram.ui.cu;
import org.telegram.ui.cx;
import org.telegram.ui.du;
import org.telegram.ui.eu;
import org.telegram.ui.gv;
import org.telegram.ui.il;
import org.telegram.ui.jh;
import org.telegram.ui.kl;
import org.telegram.ui.lb;
import org.telegram.ui.qc;
import org.telegram.ui.qx;
import org.telegram.ui.rj;
import org.telegram.ui.rq;
import org.telegram.ui.sb;
import org.telegram.ui.vw;
import org.telegram.ui.yo;
import org.telegram.ui.yp;
import org.telegram.ui.yw;
import org.telegram.ui.zs;
import org.webrtc.OrientationHelper;
public final class y9 extends AnimatorListenerAdapter {
    public final int f32518a;
    public final Object f32519b;

    public y9(Object obj, int i7) {
        this.f32518a = i7;
        this.f32519b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        AnimatorSet animatorSet;
        boolean z10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f32518a) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) this.f32519b;
                ((aa) ((z9) h1Var.f28992b).f32554b).getTransitionParams().e();
                ((aa) ((z9) h1Var.f28992b).f32554b).getTransitionParams().h = false;
                ((aa) ((z9) h1Var.f28992b).f32554b).getTransitionParams().L1 = 1.0f;
                return;
            case 1:
                org.telegram.ui.g3 g3Var = (org.telegram.ui.g3) this.f32519b;
                if (animator.equals(((lb) g3Var.f47923b).S)) {
                    ((lb) g3Var.f47923b).S = null;
                    return;
                }
                return;
            case 2:
                lb lbVar = (lb) this.f32519b;
                if (animator.equals(lbVar.S)) {
                    lbVar.S = null;
                    return;
                }
                return;
            case 3:
                ((sb) this.f32519b).I.setVisibility(8);
                return;
            case 4:
                qc qcVar = (qc) this.f32519b;
                bc bcVar = qcVar.f51223n0;
                if (bcVar != null) {
                    if (bcVar.getParent() != null) {
                        ((ViewGroup) qcVar.f51223n0.getParent()).removeView(qcVar.f51223n0);
                    }
                    qcVar.f51223n0 = null;
                }
                qcVar.f51225p0 = null;
                super.onAnimationEnd(animator);
                return;
            case 5:
                jh jhVar = (jh) this.f32519b;
                if (jhVar.f48990a) {
                    jhVar.d.setTranslationY(0.0f);
                }
                if (jhVar.f48991b) {
                    jhVar.f48993e.setTranslationY(0.0f);
                }
                if (jhVar.f48994f) {
                    jhVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.q9 q9Var = jhVar.f48992c;
                if (q9Var != null) {
                    q9Var.setTranslationY(0.0f);
                }
                jhVar.f48995n.W2[1] = null;
                return;
            case 6:
                rj rjVar = (rj) this.f32519b;
                rjVar.setAnimatedTop(0);
                View view = rjVar.f32740w2;
                if (view != null && view.getVisibility() == 0) {
                    rjVar.f32740w2.setTranslationY(((1.0f - rjVar.getTopViewEnterProgress()) * rjVar.f32740w2.getLayoutParams().height) + rjVar.J2);
                }
                rjVar.f51587w7.M9 = null;
                return;
            case 7:
                ah.l lVar = (ah.l) this.f32519b;
                h50 h50Var = ((il) lVar.f1083c).f48771c.R.f46158q3;
                if (h50Var != null) {
                    h50Var.setIsMessageTransition(false);
                    ((il) lVar.f1083c).f48771c.R.f46158q3.d(true);
                    ((il) lVar.f1083c).f48771c.R.f46158q3.setVisibility(4);
                    return;
                }
                return;
            case 8:
                il ilVar = (il) this.f32519b;
                kl klVar = ilVar.f48771c;
                ArrayList arrayList = klVar.R.F6;
                r1 r1Var = ilVar.f48770b;
                arrayList.remove(r1Var);
                View view2 = klVar.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    klVar.R.A0.invalidate();
                }
                r1Var.setAlpha(1.0f);
                r1Var.getTransitionParams().f32474y0 = false;
                return;
            case 9:
                yo yoVar = (yo) this.f32519b;
                yoVar.M = 0.0f;
                yoVar.L = 1.0f;
                View view3 = yoVar.f54242b0;
                if (view3 != null) {
                    view3.invalidate();
                }
                yoVar.U.invalidate();
                bh bhVar = yoVar.Z;
                if (bhVar != null) {
                    bhVar.run();
                    yoVar.Z = null;
                    return;
                }
                return;
            case 10:
                yp ypVar = (yp) this.f32519b;
                View view4 = ypVar.f54265b;
                view4.setAlpha(1.0f);
                v4.p0.x0(view4);
                ((rq) ypVar.d).f51697c.removeView(view4);
                return;
            case 11:
                org.telegram.ui.Components.voip.y yVar = ((org.telegram.ui.Components.voip.u) this.f32519b).f41379t0;
                if (yVar.f41494y0.getParent() != null) {
                    yVar.f41460a.removeView(yVar.f41494y0);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.a0 a0Var = (org.telegram.ui.Components.voip.a0) this.f32519b;
                a0Var.f40892s = null;
                a0Var.f40891r = 1.0f;
                a0Var.b();
                a0Var.e();
                return;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) this.f32519b;
                if (w0Var.getParent() != null) {
                    ((ViewGroup) w0Var.getParent()).removeView(w0Var);
                    return;
                }
                return;
            case 14:
                bc1 bc1Var = (bc1) this.f32519b;
                if (!bc1Var.f40923a) {
                    bc1Var.W.f48366w.T = true;
                    bc1Var.W.f48366w.invalidate();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.voip.l1 l1Var = (org.telegram.ui.Components.voip.l1) this.f32519b;
                l1Var.f41159i = false;
                l1Var.f41162l.setAlpha(35);
                l1Var.f41161k.setAlpha(102);
                l1Var.f41160j.setAlpha(35);
                l1Var.c();
                return;
            case 16:
                org.telegram.ui.Components.voip.q1 q1Var = ((org.telegram.ui.Components.voip.o1) this.f32519b).f41240c;
                q1Var.P = false;
                q1Var.requestLayout();
                return;
            case 17:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) this.f32519b;
                n2Var.O = 0.0f;
                n2Var.P = 0.0f;
                org.telegram.ui.Components.voip.m2 m2Var = n2Var.d;
                m2Var.setScaleX(n2Var.U);
                m2Var.setScaleY(n2Var.U);
                TextureView textureView = n2Var.f41216e;
                if (textureView != null) {
                    textureView.setScaleX(n2Var.V);
                    textureView.setScaleY(n2Var.V);
                }
                n2Var.setTranslationY(0.0f);
                n2Var.setTranslationX(0.0f);
                n2Var.f41210a0 = n2Var.W;
                n2Var.f41214c0 = null;
                return;
            case 18:
                org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) this.f32519b;
                if (q2Var.Q) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                q2Var.R = f10;
                q2Var.a(q2Var.S, q2Var.T);
                return;
            case 19:
                ((org.telegram.ui.Components.voip.r2) this.f32519b).f41327c.e();
                org.telegram.messenger.g0.O3(((org.telegram.ui.Components.voip.r2) this.f32519b).f41325a);
                if (((org.telegram.ui.Components.voip.r2) this.f32519b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.r2) this.f32519b).f41325a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.r2) this.f32519b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.r2) this.f32519b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.voip.x2 x2Var = (org.telegram.ui.Components.voip.x2) this.f32519b;
                x2Var.K = false;
                x2Var.U.f41156e = false;
                if (x2Var.V && (animatorSet = x2Var.R) != null) {
                    animatorSet.cancel();
                    x2Var.R.start();
                }
                x2Var.c();
                return;
            case 21:
                ((org.telegram.ui.Components.voip.e3) this.f32519b).f40994e.setVisibility(8);
                return;
            case 22:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f32519b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 23:
                zs zsVar = (zs) this.f32519b;
                if (animator.equals(zsVar.f54630n[0])) {
                    zsVar.f54630n[0] = null;
                    return;
                }
                return;
            case 24:
                cu cuVar = (cu) this.f32519b;
                eu euVar = cuVar.f46676n;
                du[] duVarArr = euVar.f47384f;
                euVar.h = null;
                if (euVar.f47387s) {
                    duVarArr[1].setVisibility(8);
                } else {
                    du duVar = duVarArr[0];
                    duVarArr[0] = duVarArr[1];
                    duVarArr[1] = duVar;
                    duVar.setVisibility(8);
                    if (euVar.f47384f[0].f47041f == euVar.f47383e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    euVar.f47389x = z10;
                    euVar.f47383e.i(1.0f, euVar.f47384f[0].f47041f);
                }
                euVar.f47385n = false;
                cuVar.f46673c = false;
                cuVar.f46672b = false;
                eu.k0(euVar).setEnabled(true);
                euVar.f47383e.setEnabled(true);
                return;
            case 25:
                gv gvVar = (gv) this.f32519b;
                cx.v1(gvVar.M, gvVar.L, 0.0f);
                return;
            case 26:
                cx cxVar = (cx) this.f32519b;
                boolean z11 = cxVar.H0;
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                cxVar.I0 = f11;
                if (!z11) {
                    cxVar.F0.setVisibility(8);
                }
                View view5 = cxVar.fragmentView;
                if (view5 != null) {
                    view5.invalidate();
                    return;
                }
                return;
            case 27:
                cx cxVar2 = ((vw) this.f32519b).f52902o0;
                cxVar2.f46737i3 = null;
                if (!cxVar2.f46754m3) {
                    bx[] bxVarArr = cxVar2.f46719f0;
                    bx bxVar = bxVarArr[0];
                    bx bxVar2 = bxVarArr[1];
                    bxVarArr[0] = bxVar2;
                    bxVarArr[1] = bxVar;
                    cxVar2.A0.h(1.0f, bxVar2.h);
                    cxVar2.n5(false);
                    cxVar2.C5(-1, true);
                    cxVar2.f46719f0[0].d.getClass();
                    cxVar2.f46719f0[1].d.getClass();
                }
                cxVar2.f46719f0[1].setVisibility(8);
                cx.i1(cxVar2, true);
                cxVar2.j3 = false;
                cxVar2.f46768p3 = false;
                kVar = ((org.telegram.ui.ActionBar.g2) cxVar2).actionBar;
                kVar.setEnabled(true);
                cxVar2.A0.setEnabled(true);
                cxVar2.C3(cxVar2.f46719f0[0]);
                return;
            case 28:
                super.onAnimationEnd(animator);
                ((yw) this.f32519b).setScrollEnabled(true);
                return;
            default:
                qx qxVar = (qx) this.f32519b;
                if (qxVar.f51371w == animator) {
                    qxVar.f51371w = null;
                    return;
                }
                return;
        }
    }

    public y9(yp ypVar, v4.p0 p0Var) {
        this.f32518a = 10;
        this.f32519b = ypVar;
    }
}
