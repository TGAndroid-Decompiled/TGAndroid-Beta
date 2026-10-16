package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.transition.TransitionValues;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.vi1;
import org.webrtc.OrientationHelper;
public final class v61 extends AnimatorListenerAdapter {
    public final int f29580a;
    public final Object f29581b;

    public v61(Object obj, int i10) {
        this.f29580a = i10;
        this.f29581b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29580a) {
            case 29:
                ((org.telegram.ui.lf0) this.f29581b).f37736s = null;
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
        org.telegram.ui.ActionBar.k kVar;
        float f7 = 0.0f;
        switch (this.f29580a) {
            case 0:
                UndoView undoView = (UndoView) this.f29581b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 1:
                o71 o71Var = (o71) this.f29581b;
                if (o71Var.f27593a.getTag() == null) {
                    o71Var.f27593a.setVisibility(4);
                    return;
                }
                return;
            case 2:
                super.onAnimationEnd(animator);
                p71 p71Var = (p71) this.f29581b;
                p71Var.f27920b = 0.0f;
                p71Var.setTranslationY(0.0f);
                p71Var.f27919a = null;
                return;
            case 3:
                k91 k91Var = (k91) this.f29581b;
                k91Var.J = false;
                k91Var.setEnabled(true);
                j91 j91Var = k91Var.f26331y;
                if (j91Var != null) {
                    ((m.h) j91Var).e(1.0f);
                }
                k91Var.invalidate();
                return;
            case 4:
                ((da1) this.f29581b).f24053e0 = null;
                return;
            case 5:
                ((fa1) this.f29581b).K = null;
                return;
            case 6:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f29581b).view.setEnabled(true);
                return;
            case 7:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.f29581b).f30037s0;
                if (tVar.f30176x0.getParent() != null) {
                    tVar.f30145a.removeView(tVar.f30176x0);
                    return;
                }
                return;
            case 8:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f29581b;
                if (v0Var.getParent() != null) {
                    ((ViewGroup) v0Var.getParent()).removeView(v0Var);
                    return;
                }
                return;
            case 9:
                vi1 vi1Var = (vi1) this.f29581b;
                if (!vi1Var.f29774a) {
                    vi1Var.V.v.S = true;
                    vi1Var.V.v.invalidate();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.f29581b;
                o1Var.f30053i = false;
                o1Var.f30056l.setAlpha(35);
                o1Var.f30055k.setAlpha(102);
                o1Var.f30054j.setAlpha(35);
                o1Var.c();
                return;
            case 11:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.f29581b).f30080c;
                s1Var.O = false;
                s1Var.requestLayout();
                return;
            case 12:
                org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) this.f29581b;
                q2Var.N = 0.0f;
                q2Var.O = 0.0f;
                org.telegram.ui.Components.voip.p2 p2Var = q2Var.d;
                p2Var.setScaleX(q2Var.T);
                p2Var.setScaleY(q2Var.T);
                TextureView textureView = q2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(q2Var.U);
                    textureView.setScaleY(q2Var.U);
                }
                q2Var.setTranslationY(0.0f);
                q2Var.setTranslationX(0.0f);
                q2Var.W = q2Var.V;
                q2Var.f30084b0 = null;
                return;
            case 13:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.f29581b;
                if (u2Var.P) {
                    f7 = 1.0f;
                }
                u2Var.Q = f7;
                u2Var.a(u2Var.R, u2Var.S);
                return;
            case 14:
                ((org.telegram.ui.Components.voip.v2) this.f29581b).f30231c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.v2) this.f29581b).f30229a);
                if (((org.telegram.ui.Components.voip.v2) this.f29581b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.v2) this.f29581b).f30229a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.v2) this.f29581b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.v2) this.f29581b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.voip.b3 b3Var = (org.telegram.ui.Components.voip.b3) this.f29581b;
                b3Var.J = false;
                b3Var.T.e = false;
                if (b3Var.U && (animatorSet = b3Var.Q) != null) {
                    animatorSet.cancel();
                    b3Var.Q.start();
                }
                b3Var.c();
                return;
            case 16:
                ((org.telegram.ui.Components.voip.j3) this.f29581b).e.setVisibility(8);
                return;
            case 17:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f29581b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 18:
                org.telegram.ui.lu luVar = (org.telegram.ui.lu) this.f29581b;
                if (animator.equals(luVar.f37829n[0])) {
                    luVar.f37829n[0] = null;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.qv qvVar = (org.telegram.ui.qv) this.f29581b;
                org.telegram.ui.sv svVar = qvVar.f39223n;
                org.telegram.ui.rv[] rvVarArr = svVar.f39952f;
                svVar.h = null;
                if (svVar.f39955s) {
                    rvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.rv rvVar = rvVarArr[0];
                    rvVarArr[0] = rvVarArr[1];
                    rvVarArr[1] = rvVar;
                    rvVar.setVisibility(8);
                    if (svVar.f39952f[0].f39594f == svVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    svVar.f39956w = z10;
                    svVar.e.j(1.0f, svVar.f39952f[0].f39594f);
                }
                svVar.f39953n = false;
                qvVar.f39221c = false;
                qvVar.f39220b = false;
                org.telegram.ui.sv.f0(svVar).setEnabled(true);
                svVar.e.setEnabled(true);
                return;
            case 20:
                org.telegram.ui.bx bxVar = (org.telegram.ui.bx) this.f29581b;
                org.telegram.ui.yy.n1(bxVar.M, bxVar.L, 0.0f);
                return;
            case 21:
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) this.f29581b;
                boolean z11 = yyVar.G0;
                if (z11) {
                    f7 = 1.0f;
                }
                yyVar.H0 = f7;
                if (!z11) {
                    yyVar.E0.setVisibility(8);
                }
                View view = yyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 22:
                org.telegram.ui.yy yyVar2 = ((org.telegram.ui.ry) this.f29581b).E0;
                yyVar2.f42018g3 = null;
                if (!yyVar2.f42038k3) {
                    org.telegram.ui.xy[] xyVarArr = yyVar2.f42004e0;
                    org.telegram.ui.xy xyVar = xyVarArr[0];
                    org.telegram.ui.xy xyVar2 = xyVarArr[1];
                    xyVarArr[0] = xyVar2;
                    xyVarArr[1] = xyVar;
                    yyVar2.f42110z0.g(1.0f, xyVar2.h);
                    yyVar2.R4(false);
                    yyVar2.f42004e0[0].d.getClass();
                    yyVar2.f42004e0[1].d.getClass();
                }
                yyVar2.f42004e0[1].setVisibility(8);
                org.telegram.ui.yy.c1(yyVar2, true);
                yyVar2.f42023h3 = false;
                yyVar2.f42051n3 = false;
                kVar = ((org.telegram.ui.ActionBar.m2) yyVar2).actionBar;
                kVar.setEnabled(true);
                yyVar2.f42110z0.setEnabled(true);
                yyVar2.p3(yyVar2.f42004e0[0]);
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.uy) this.f29581b).setScrollEnabled(true);
                return;
            case 24:
                s90 s90Var = (s90) this.f29581b;
                FrameLayout frameLayout = s90Var.f28772b;
                di.p6 p6Var = (di.p6) s90Var.f28773c;
                if (p6Var.getParent() != null) {
                    frameLayout.removeView(p6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ii) s90Var.d);
                return;
            case 25:
                org.telegram.ui.n60 n60Var = ((org.telegram.ui.n50) this.f29581b).f38143o;
                org.telegram.ui.n60 n60Var2 = org.telegram.ui.n60.D3;
                n60Var.c1();
                org.telegram.ui.n60.n0(n60Var).invalidate();
                n60Var.Q.invalidate();
                if (n60Var.f38231s0) {
                    n60Var.f38231s0 = false;
                    n60Var.P0(true);
                    return;
                }
                return;
            case 26:
                super.onAnimationEnd(animator);
                org.telegram.ui.b60 b60Var = (org.telegram.ui.b60) this.f29581b;
                b60Var.G = null;
                org.telegram.ui.n60 n60Var3 = b60Var.L;
                n60Var3.Q.invalidate();
                n60Var3.a2.invalidate();
                org.telegram.ui.n60.z0(n60Var3).invalidate();
                org.telegram.ui.n60.K0(n60Var3);
                b60Var.H.clear();
                b60Var.I.clear();
                return;
            case 27:
                org.telegram.ui.o80 o80Var = (org.telegram.ui.o80) this.f29581b;
                o80Var.d = null;
                o80Var.f38565a = null;
                o80Var.f38566b = false;
                return;
            case 28:
                org.telegram.ui.ld0 ld0Var = (org.telegram.ui.ld0) this.f29581b;
                ld0Var.H = false;
                ld0Var.n0();
                return;
            default:
                org.telegram.ui.lf0 lf0Var = (org.telegram.ui.lf0) this.f29581b;
                if (lf0Var.f37736s != null && lf0Var.f37734n != null) {
                    lf0Var.f37735r.setVisibility(4);
                    lf0Var.f37736s = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29580a) {
            case 6:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f29581b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
