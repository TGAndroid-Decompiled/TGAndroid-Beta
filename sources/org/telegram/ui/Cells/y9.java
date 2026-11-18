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
import org.telegram.ui.bc;
import org.telegram.ui.bc1;
import org.telegram.ui.bh;
import org.telegram.ui.bx;
import org.telegram.ui.cu;
import org.telegram.ui.cx;
import org.telegram.ui.du;
import org.telegram.ui.eu;
import org.telegram.ui.gv;
import org.telegram.ui.ih;
import org.telegram.ui.il;
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
    public final int f32490a;
    public final Object f32491b;

    public y9(Object obj, int i7) {
        this.f32490a = i7;
        this.f32491b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        AnimatorSet animatorSet;
        boolean z10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f32490a) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.ActionBar.i1 i1Var = (org.telegram.ui.ActionBar.i1) this.f32491b;
                ((aa) ((z9) i1Var.f29008b).f32526b).getTransitionParams().e();
                ((aa) ((z9) i1Var.f29008b).f32526b).getTransitionParams().h = false;
                ((aa) ((z9) i1Var.f29008b).f32526b).getTransitionParams().L1 = 1.0f;
                return;
            case 1:
                org.telegram.ui.g3 g3Var = (org.telegram.ui.g3) this.f32491b;
                if (animator.equals(((lb) g3Var.f47853b).S)) {
                    ((lb) g3Var.f47853b).S = null;
                    return;
                }
                return;
            case 2:
                lb lbVar = (lb) this.f32491b;
                if (animator.equals(lbVar.S)) {
                    lbVar.S = null;
                    return;
                }
                return;
            case 3:
                ((sb) this.f32491b).I.setVisibility(8);
                return;
            case 4:
                qc qcVar = (qc) this.f32491b;
                bc bcVar = qcVar.f51177n0;
                if (bcVar != null) {
                    if (bcVar.getParent() != null) {
                        ((ViewGroup) qcVar.f51177n0.getParent()).removeView(qcVar.f51177n0);
                    }
                    qcVar.f51177n0 = null;
                }
                qcVar.f51179p0 = null;
                super.onAnimationEnd(animator);
                return;
            case 5:
                ih ihVar = (ih) this.f32491b;
                if (ihVar.f48727a) {
                    ihVar.d.setTranslationY(0.0f);
                }
                if (ihVar.f48728b) {
                    ihVar.f48730e.setTranslationY(0.0f);
                }
                if (ihVar.f48731f) {
                    ihVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.q9 q9Var = ihVar.f48729c;
                if (q9Var != null) {
                    q9Var.setTranslationY(0.0f);
                }
                ihVar.f48732n.W2[1] = null;
                return;
            case 6:
                rj rjVar = (rj) this.f32491b;
                rjVar.setAnimatedTop(0);
                View view = rjVar.f32692u2;
                if (view != null && view.getVisibility() == 0) {
                    rjVar.f32692u2.setTranslationY(((1.0f - rjVar.getTopViewEnterProgress()) * rjVar.f32692u2.getLayoutParams().height) + rjVar.H2);
                }
                rjVar.f51612r7.M9 = null;
                return;
            case 7:
                ah.l lVar = (ah.l) this.f32491b;
                e50 e50Var = ((il) lVar.f1083c).f48749c.R.f46135q3;
                if (e50Var != null) {
                    e50Var.setIsMessageTransition(false);
                    ((il) lVar.f1083c).f48749c.R.f46135q3.d(true);
                    ((il) lVar.f1083c).f48749c.R.f46135q3.setVisibility(4);
                    return;
                }
                return;
            case 8:
                il ilVar = (il) this.f32491b;
                kl klVar = ilVar.f48749c;
                ArrayList arrayList = klVar.R.F6;
                r1 r1Var = ilVar.f48748b;
                arrayList.remove(r1Var);
                View view2 = klVar.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    klVar.R.A0.invalidate();
                }
                r1Var.setAlpha(1.0f);
                r1Var.getTransitionParams().f32446y0 = false;
                return;
            case 9:
                yo yoVar = (yo) this.f32491b;
                yoVar.M = 0.0f;
                yoVar.L = 1.0f;
                View view3 = yoVar.f54200b0;
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
                yp ypVar = (yp) this.f32491b;
                View view4 = ypVar.f54223b;
                view4.setAlpha(1.0f);
                v4.p0.x0(view4);
                ((rq) ypVar.d).f51722c.removeView(view4);
                return;
            case 11:
                org.telegram.ui.Components.voip.y yVar = ((org.telegram.ui.Components.voip.u) this.f32491b).f41244t0;
                if (yVar.f41359y0.getParent() != null) {
                    yVar.f41325a.removeView(yVar.f41359y0);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.a0 a0Var = (org.telegram.ui.Components.voip.a0) this.f32491b;
                a0Var.f40757s = null;
                a0Var.f40756r = 1.0f;
                a0Var.b();
                a0Var.e();
                return;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) this.f32491b;
                if (w0Var.getParent() != null) {
                    ((ViewGroup) w0Var.getParent()).removeView(w0Var);
                    return;
                }
                return;
            case 14:
                bc1 bc1Var = (bc1) this.f32491b;
                if (!bc1Var.f40788a) {
                    bc1Var.W.f48292w.T = true;
                    bc1Var.W.f48292w.invalidate();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.voip.l1 l1Var = (org.telegram.ui.Components.voip.l1) this.f32491b;
                l1Var.f41024i = false;
                l1Var.f41027l.setAlpha(35);
                l1Var.f41026k.setAlpha(102);
                l1Var.f41025j.setAlpha(35);
                l1Var.c();
                return;
            case 16:
                org.telegram.ui.Components.voip.q1 q1Var = ((org.telegram.ui.Components.voip.o1) this.f32491b).f41105c;
                q1Var.P = false;
                q1Var.requestLayout();
                return;
            case 17:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) this.f32491b;
                n2Var.O = 0.0f;
                n2Var.P = 0.0f;
                org.telegram.ui.Components.voip.m2 m2Var = n2Var.d;
                m2Var.setScaleX(n2Var.U);
                m2Var.setScaleY(n2Var.U);
                TextureView textureView = n2Var.f41081e;
                if (textureView != null) {
                    textureView.setScaleX(n2Var.V);
                    textureView.setScaleY(n2Var.V);
                }
                n2Var.setTranslationY(0.0f);
                n2Var.setTranslationX(0.0f);
                n2Var.f41075a0 = n2Var.W;
                n2Var.f41079c0 = null;
                return;
            case 18:
                org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) this.f32491b;
                if (q2Var.Q) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                q2Var.R = f10;
                q2Var.a(q2Var.S, q2Var.T);
                return;
            case 19:
                ((org.telegram.ui.Components.voip.r2) this.f32491b).f41192c.e();
                org.telegram.messenger.g0.O3(((org.telegram.ui.Components.voip.r2) this.f32491b).f41190a);
                if (((org.telegram.ui.Components.voip.r2) this.f32491b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.r2) this.f32491b).f41190a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.r2) this.f32491b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.r2) this.f32491b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.voip.x2 x2Var = (org.telegram.ui.Components.voip.x2) this.f32491b;
                x2Var.K = false;
                x2Var.U.f41021e = false;
                if (x2Var.V && (animatorSet = x2Var.R) != null) {
                    animatorSet.cancel();
                    x2Var.R.start();
                }
                x2Var.c();
                return;
            case 21:
                ((org.telegram.ui.Components.voip.e3) this.f32491b).f40859e.setVisibility(8);
                return;
            case 22:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f32491b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 23:
                zs zsVar = (zs) this.f32491b;
                if (animator.equals(zsVar.f54583n[0])) {
                    zsVar.f54583n[0] = null;
                    return;
                }
                return;
            case 24:
                cu cuVar = (cu) this.f32491b;
                eu euVar = cuVar.f46620n;
                du[] duVarArr = euVar.f47315f;
                euVar.h = null;
                if (euVar.f47318s) {
                    duVarArr[1].setVisibility(8);
                } else {
                    du duVar = duVarArr[0];
                    duVarArr[0] = duVarArr[1];
                    duVarArr[1] = duVar;
                    duVar.setVisibility(8);
                    if (euVar.f47315f[0].f46975f == euVar.f47314e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    euVar.f47320x = z10;
                    euVar.f47314e.i(1.0f, euVar.f47315f[0].f46975f);
                }
                euVar.f47316n = false;
                cuVar.f46617c = false;
                cuVar.f46616b = false;
                eu.k0(euVar).setEnabled(true);
                euVar.f47314e.setEnabled(true);
                return;
            case 25:
                gv gvVar = (gv) this.f32491b;
                cx.v1(gvVar.M, gvVar.L, 0.0f);
                return;
            case 26:
                cx cxVar = (cx) this.f32491b;
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
                cx cxVar2 = ((vw) this.f32491b).f52861o0;
                cxVar2.f46681i3 = null;
                if (!cxVar2.f46698m3) {
                    bx[] bxVarArr = cxVar2.f46663f0;
                    bx bxVar = bxVarArr[0];
                    bx bxVar2 = bxVarArr[1];
                    bxVarArr[0] = bxVar2;
                    bxVarArr[1] = bxVar;
                    cxVar2.A0.h(1.0f, bxVar2.h);
                    cxVar2.n5(false);
                    cxVar2.C5(-1, true);
                    cxVar2.f46663f0[0].d.getClass();
                    cxVar2.f46663f0[1].d.getClass();
                }
                cxVar2.f46663f0[1].setVisibility(8);
                cx.i1(cxVar2, true);
                cxVar2.j3 = false;
                cxVar2.f46712p3 = false;
                kVar = ((org.telegram.ui.ActionBar.h2) cxVar2).actionBar;
                kVar.setEnabled(true);
                cxVar2.A0.setEnabled(true);
                cxVar2.C3(cxVar2.f46663f0[0]);
                return;
            case 28:
                super.onAnimationEnd(animator);
                ((yw) this.f32491b).setScrollEnabled(true);
                return;
            default:
                qx qxVar = (qx) this.f32491b;
                if (qxVar.f51317w == animator) {
                    qxVar.f51317w = null;
                    return;
                }
                return;
        }
    }

    public y9(yp ypVar, v4.p0 p0Var) {
        this.f32490a = 10;
        this.f32491b = ypVar;
    }
}
