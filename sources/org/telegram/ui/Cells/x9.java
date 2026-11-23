package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.ui.Components.e50;
import org.telegram.ui.ax;
import org.telegram.ui.bc;
import org.telegram.ui.bu;
import org.telegram.ui.bx;
import org.telegram.ui.ch;
import org.telegram.ui.cu;
import org.telegram.ui.du;
import org.telegram.ui.fv;
import org.telegram.ui.il;
import org.telegram.ui.jh;
import org.telegram.ui.kl;
import org.telegram.ui.lb;
import org.telegram.ui.px;
import org.telegram.ui.qc;
import org.telegram.ui.rj;
import org.telegram.ui.rq;
import org.telegram.ui.sb;
import org.telegram.ui.uw;
import org.telegram.ui.xo;
import org.telegram.ui.xw;
import org.telegram.ui.yp;
import org.telegram.ui.ys;
import org.telegram.ui.zb1;
import org.webrtc.OrientationHelper;
public final class x9 extends AnimatorListenerAdapter {
    public final int f32436a;
    public final Object f32437b;

    public x9(Object obj, int i7) {
        this.f32436a = i7;
        this.f32437b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        AnimatorSet animatorSet;
        boolean z10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f32436a) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) this.f32437b;
                ((z9) ((y9) h1Var.f29053b).f32576b).getTransitionParams().e();
                ((z9) ((y9) h1Var.f29053b).f32576b).getTransitionParams().h = false;
                ((z9) ((y9) h1Var.f29053b).f32576b).getTransitionParams().L1 = 1.0f;
                return;
            case 1:
                org.telegram.ui.g3 g3Var = (org.telegram.ui.g3) this.f32437b;
                if (animator.equals(((lb) g3Var.f48038b).S)) {
                    ((lb) g3Var.f48038b).S = null;
                    return;
                }
                return;
            case 2:
                lb lbVar = (lb) this.f32437b;
                if (animator.equals(lbVar.S)) {
                    lbVar.S = null;
                    return;
                }
                return;
            case 3:
                ((sb) this.f32437b).I.setVisibility(8);
                return;
            case 4:
                qc qcVar = (qc) this.f32437b;
                bc bcVar = qcVar.f51419n0;
                if (bcVar != null) {
                    if (bcVar.getParent() != null) {
                        ((ViewGroup) qcVar.f51419n0.getParent()).removeView(qcVar.f51419n0);
                    }
                    qcVar.f51419n0 = null;
                }
                qcVar.f51421p0 = null;
                super.onAnimationEnd(animator);
                return;
            case 5:
                jh jhVar = (jh) this.f32437b;
                if (jhVar.f49121a) {
                    jhVar.d.setTranslationY(0.0f);
                }
                if (jhVar.f49122b) {
                    jhVar.f49124e.setTranslationY(0.0f);
                }
                if (jhVar.f49125f) {
                    jhVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.p9 p9Var = jhVar.f49123c;
                if (p9Var != null) {
                    p9Var.setTranslationY(0.0f);
                }
                jhVar.f49126n.W2[1] = null;
                return;
            case 6:
                rj rjVar = (rj) this.f32437b;
                rjVar.setAnimatedTop(0);
                View view = rjVar.f32807w2;
                if (view != null && view.getVisibility() == 0) {
                    rjVar.f32807w2.setTranslationY(((1.0f - rjVar.getTopViewEnterProgress()) * rjVar.f32807w2.getLayoutParams().height) + rjVar.J2);
                }
                rjVar.f51734w7.M9 = null;
                return;
            case 7:
                ah.l lVar = (ah.l) this.f32437b;
                e50 e50Var = ((il) lVar.f1083c).f48843c.R.f46330q3;
                if (e50Var != null) {
                    e50Var.setIsMessageTransition(false);
                    ((il) lVar.f1083c).f48843c.R.f46330q3.d(true);
                    ((il) lVar.f1083c).f48843c.R.f46330q3.setVisibility(4);
                    return;
                }
                return;
            case 8:
                il ilVar = (il) this.f32437b;
                kl klVar = ilVar.f48843c;
                ArrayList arrayList = klVar.R.F6;
                r1 r1Var = ilVar.f48842b;
                arrayList.remove(r1Var);
                View view2 = klVar.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    klVar.R.A0.invalidate();
                }
                r1Var.setAlpha(1.0f);
                r1Var.getTransitionParams().f32544y0 = false;
                return;
            case 9:
                xo xoVar = (xo) this.f32437b;
                xoVar.M = 0.0f;
                xoVar.L = 1.0f;
                View view3 = xoVar.f54014b0;
                if (view3 != null) {
                    view3.invalidate();
                }
                xoVar.U.invalidate();
                ch chVar = xoVar.Z;
                if (chVar != null) {
                    chVar.run();
                    xoVar.Z = null;
                    return;
                }
                return;
            case 10:
                yp ypVar = (yp) this.f32437b;
                View view4 = ypVar.f54410b;
                view4.setAlpha(1.0f);
                v4.p0.x0(view4);
                ((rq) ypVar.d).f51816c.removeView(view4);
                return;
            case 11:
                org.telegram.ui.Components.voip.z zVar = ((org.telegram.ui.Components.voip.v) this.f32437b).f41276t0;
                if (zVar.f41391y0.getParent() != null) {
                    zVar.f41357a.removeView(zVar.f41391y0);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.b0 b0Var = (org.telegram.ui.Components.voip.b0) this.f32437b;
                b0Var.f40788s = null;
                b0Var.f40787r = 1.0f;
                b0Var.b();
                b0Var.e();
                return;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f32437b;
                if (x0Var.getParent() != null) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                    return;
                }
                return;
            case 14:
                zb1 zb1Var = (zb1) this.f32437b;
                if (!zb1Var.f40817a) {
                    zb1Var.W.f47792w.T = true;
                    zb1Var.W.f47792w.invalidate();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.voip.m1 m1Var = (org.telegram.ui.Components.voip.m1) this.f32437b;
                m1Var.f41060i = false;
                m1Var.f41063l.setAlpha(35);
                m1Var.f41062k.setAlpha(102);
                m1Var.f41061j.setAlpha(35);
                m1Var.c();
                return;
            case 16:
                org.telegram.ui.Components.voip.r1 r1Var2 = ((org.telegram.ui.Components.voip.p1) this.f32437b).f41137c;
                r1Var2.P = false;
                r1Var2.requestLayout();
                return;
            case 17:
                org.telegram.ui.Components.voip.o2 o2Var = (org.telegram.ui.Components.voip.o2) this.f32437b;
                o2Var.O = 0.0f;
                o2Var.P = 0.0f;
                org.telegram.ui.Components.voip.n2 n2Var = o2Var.d;
                n2Var.setScaleX(o2Var.U);
                n2Var.setScaleY(o2Var.U);
                TextureView textureView = o2Var.f41113e;
                if (textureView != null) {
                    textureView.setScaleX(o2Var.V);
                    textureView.setScaleY(o2Var.V);
                }
                o2Var.setTranslationY(0.0f);
                o2Var.setTranslationX(0.0f);
                o2Var.f41107a0 = o2Var.W;
                o2Var.f41111c0 = null;
                return;
            case 18:
                org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) this.f32437b;
                if (r2Var.Q) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                r2Var.R = f10;
                r2Var.a(r2Var.S, r2Var.T);
                return;
            case 19:
                ((org.telegram.ui.Components.voip.s2) this.f32437b).f41224c.e();
                org.telegram.messenger.g0.O3(((org.telegram.ui.Components.voip.s2) this.f32437b).f41222a);
                if (((org.telegram.ui.Components.voip.s2) this.f32437b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.s2) this.f32437b).f41222a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.s2) this.f32437b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.s2) this.f32437b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.voip.y2 y2Var = (org.telegram.ui.Components.voip.y2) this.f32437b;
                y2Var.K = false;
                y2Var.U.f41057e = false;
                if (y2Var.V && (animatorSet = y2Var.R) != null) {
                    animatorSet.cancel();
                    y2Var.R.start();
                }
                y2Var.c();
                return;
            case 21:
                ((org.telegram.ui.Components.voip.f3) this.f32437b).f40891e.setVisibility(8);
                return;
            case 22:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f32437b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 23:
                ys ysVar = (ys) this.f32437b;
                if (animator.equals(ysVar.f54422n[0])) {
                    ysVar.f54422n[0] = null;
                    return;
                }
                return;
            case 24:
                bu buVar = (bu) this.f32437b;
                du duVar = buVar.f46508n;
                cu[] cuVarArr = duVar.f47231f;
                duVar.h = null;
                if (duVar.f47234s) {
                    cuVarArr[1].setVisibility(8);
                } else {
                    cu cuVar = cuVarArr[0];
                    cuVarArr[0] = cuVarArr[1];
                    cuVarArr[1] = cuVar;
                    cuVar.setVisibility(8);
                    if (duVar.f47231f[0].f46877f == duVar.f47230e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    duVar.f47236x = z10;
                    duVar.f47230e.i(1.0f, duVar.f47231f[0].f46877f);
                }
                duVar.f47232n = false;
                buVar.f46505c = false;
                buVar.f46504b = false;
                du.k0(duVar).setEnabled(true);
                duVar.f47230e.setEnabled(true);
                return;
            case 25:
                fv fvVar = (fv) this.f32437b;
                bx.v1(fvVar.M, fvVar.L, 0.0f);
                return;
            case 26:
                bx bxVar = (bx) this.f32437b;
                boolean z11 = bxVar.H0;
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                bxVar.I0 = f11;
                if (!z11) {
                    bxVar.F0.setVisibility(8);
                }
                View view5 = bxVar.fragmentView;
                if (view5 != null) {
                    view5.invalidate();
                    return;
                }
                return;
            case 27:
                bx bxVar2 = ((uw) this.f32437b).f52741o0;
                bxVar2.f46567i3 = null;
                if (!bxVar2.f46584m3) {
                    ax[] axVarArr = bxVar2.f46549f0;
                    ax axVar = axVarArr[0];
                    ax axVar2 = axVarArr[1];
                    axVarArr[0] = axVar2;
                    axVarArr[1] = axVar;
                    bxVar2.A0.h(1.0f, axVar2.h);
                    bxVar2.n5(false);
                    bxVar2.C5(-1, true);
                    bxVar2.f46549f0[0].d.getClass();
                    bxVar2.f46549f0[1].d.getClass();
                }
                bxVar2.f46549f0[1].setVisibility(8);
                bx.i1(bxVar2, true);
                bxVar2.j3 = false;
                bxVar2.f46598p3 = false;
                kVar = ((org.telegram.ui.ActionBar.g2) bxVar2).actionBar;
                kVar.setEnabled(true);
                bxVar2.A0.setEnabled(true);
                bxVar2.C3(bxVar2.f46549f0[0]);
                return;
            case 28:
                super.onAnimationEnd(animator);
                ((xw) this.f32437b).setScrollEnabled(true);
                return;
            default:
                px pxVar = (px) this.f32437b;
                if (pxVar.f51163w == animator) {
                    pxVar.f51163w = null;
                    return;
                }
                return;
        }
    }

    public x9(yp ypVar, v4.p0 p0Var) {
        this.f32436a = 10;
        this.f32437b = ypVar;
    }
}
