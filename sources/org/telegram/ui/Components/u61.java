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
import org.telegram.ui.wi1;
import org.webrtc.OrientationHelper;
public final class u61 extends AnimatorListenerAdapter {
    public final int f29590a;
    public final Object f29591b;

    public u61(Object obj, int i10) {
        this.f29590a = i10;
        this.f29591b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29590a) {
            case 29:
                ((org.telegram.ui.mf0) this.f29591b).f38248s = null;
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
        switch (this.f29590a) {
            case 0:
                UndoView undoView = (UndoView) this.f29591b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 1:
                n71 n71Var = (n71) this.f29591b;
                if (n71Var.f27600a.getTag() == null) {
                    n71Var.f27600a.setVisibility(4);
                    return;
                }
                return;
            case 2:
                super.onAnimationEnd(animator);
                o71 o71Var = (o71) this.f29591b;
                o71Var.f27900b = 0.0f;
                o71Var.setTranslationY(0.0f);
                o71Var.f27899a = null;
                return;
            case 3:
                j91 j91Var = (j91) this.f29591b;
                j91Var.J = false;
                j91Var.setEnabled(true);
                i91 i91Var = j91Var.f26299y;
                if (i91Var != null) {
                    ((l2.f) i91Var).j(1.0f);
                }
                j91Var.invalidate();
                return;
            case 4:
                ((ca1) this.f29591b).f23997e0 = null;
                return;
            case 5:
                ((ea1) this.f29591b).K = null;
                return;
            case 6:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f29591b).view.setEnabled(true);
                return;
            case 7:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.f29591b).f30365s0;
                if (tVar.f30507x0.getParent() != null) {
                    tVar.f30476a.removeView(tVar.f30507x0);
                    return;
                }
                return;
            case 8:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f29591b;
                if (v0Var.getParent() != null) {
                    ((ViewGroup) v0Var.getParent()).removeView(v0Var);
                    return;
                }
                return;
            case 9:
                wi1 wi1Var = (wi1) this.f29591b;
                if (!wi1Var.f30105a) {
                    wi1Var.V.v.S = true;
                    wi1Var.V.v.invalidate();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.f29591b;
                o1Var.f30381i = false;
                o1Var.f30384l.setAlpha(35);
                o1Var.f30383k.setAlpha(102);
                o1Var.f30382j.setAlpha(35);
                o1Var.c();
                return;
            case 11:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.f29591b).f30412c;
                s1Var.O = false;
                s1Var.requestLayout();
                return;
            case 12:
                org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) this.f29591b;
                r2Var.N = 0.0f;
                r2Var.O = 0.0f;
                org.telegram.ui.Components.voip.q2 q2Var = r2Var.d;
                q2Var.setScaleX(r2Var.T);
                q2Var.setScaleY(r2Var.T);
                TextureView textureView = r2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(r2Var.U);
                    textureView.setScaleY(r2Var.U);
                }
                r2Var.setTranslationY(0.0f);
                r2Var.setTranslationX(0.0f);
                r2Var.W = r2Var.V;
                r2Var.f30423b0 = null;
                return;
            case 13:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.f29591b;
                if (u2Var.P) {
                    f7 = 1.0f;
                }
                u2Var.Q = f7;
                u2Var.a(u2Var.R, u2Var.S);
                return;
            case 14:
                ((org.telegram.ui.Components.voip.v2) this.f29591b).f30562c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.v2) this.f29591b).f30560a);
                if (((org.telegram.ui.Components.voip.v2) this.f29591b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.v2) this.f29591b).f30560a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.v2) this.f29591b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.v2) this.f29591b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.voip.b3 b3Var = (org.telegram.ui.Components.voip.b3) this.f29591b;
                b3Var.J = false;
                b3Var.T.e = false;
                if (b3Var.U && (animatorSet = b3Var.Q) != null) {
                    animatorSet.cancel();
                    b3Var.Q.start();
                }
                b3Var.c();
                return;
            case 16:
                ((org.telegram.ui.Components.voip.j3) this.f29591b).e.setVisibility(8);
                return;
            case 17:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f29591b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 18:
                org.telegram.ui.lu luVar = (org.telegram.ui.lu) this.f29591b;
                if (animator.equals(luVar.f38090n[0])) {
                    luVar.f38090n[0] = null;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.qv qvVar = (org.telegram.ui.qv) this.f29591b;
                org.telegram.ui.sv svVar = qvVar.f39547n;
                org.telegram.ui.rv[] rvVarArr = svVar.f40220f;
                svVar.h = null;
                if (svVar.f40223s) {
                    rvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.rv rvVar = rvVarArr[0];
                    rvVarArr[0] = rvVarArr[1];
                    rvVarArr[1] = rvVar;
                    rvVar.setVisibility(8);
                    if (svVar.f40220f[0].f39874f == svVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    svVar.f40224w = z10;
                    svVar.e.j(1.0f, svVar.f40220f[0].f39874f);
                }
                svVar.f40221n = false;
                qvVar.f39545c = false;
                qvVar.f39544b = false;
                org.telegram.ui.sv.f0(svVar).setEnabled(true);
                svVar.e.setEnabled(true);
                return;
            case 20:
                org.telegram.ui.bx bxVar = (org.telegram.ui.bx) this.f29591b;
                org.telegram.ui.yy.n1(bxVar.M, bxVar.L, 0.0f);
                return;
            case 21:
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) this.f29591b;
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
                org.telegram.ui.yy yyVar2 = ((org.telegram.ui.ry) this.f29591b).E0;
                yyVar2.f42334f3 = null;
                if (!yyVar2.f42354j3) {
                    org.telegram.ui.xy[] xyVarArr = yyVar2.f42325e0;
                    org.telegram.ui.xy xyVar = xyVarArr[0];
                    org.telegram.ui.xy xyVar2 = xyVarArr[1];
                    xyVarArr[0] = xyVar2;
                    xyVarArr[1] = xyVar;
                    yyVar2.f42430z0.g(1.0f, xyVar2.h);
                    yyVar2.Q4(false);
                    yyVar2.f42325e0[0].d.getClass();
                    yyVar2.f42325e0[1].d.getClass();
                }
                yyVar2.f42325e0[1].setVisibility(8);
                org.telegram.ui.yy.c1(yyVar2, true);
                yyVar2.f42339g3 = false;
                yyVar2.f42366m3 = false;
                kVar = ((org.telegram.ui.ActionBar.m2) yyVar2).actionBar;
                kVar.setEnabled(true);
                yyVar2.f42430z0.setEnabled(true);
                yyVar2.o3(yyVar2.f42325e0[0]);
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.uy) this.f29591b).setScrollEnabled(true);
                return;
            case 24:
                s90 s90Var = (s90) this.f29591b;
                FrameLayout frameLayout = s90Var.f29068b;
                di.p6 p6Var = (di.p6) s90Var.f29069c;
                if (p6Var.getParent() != null) {
                    frameLayout.removeView(p6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ii) s90Var.d);
                return;
            case 25:
                org.telegram.ui.n60 n60Var = ((org.telegram.ui.n50) this.f29591b).f38428o;
                org.telegram.ui.n60 n60Var2 = org.telegram.ui.n60.D3;
                n60Var.c1();
                org.telegram.ui.n60.n0(n60Var).invalidate();
                n60Var.Q.invalidate();
                if (n60Var.f38516s0) {
                    n60Var.f38516s0 = false;
                    n60Var.P0(true);
                    return;
                }
                return;
            case 26:
                super.onAnimationEnd(animator);
                org.telegram.ui.b60 b60Var = (org.telegram.ui.b60) this.f29591b;
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
                org.telegram.ui.o80 o80Var = (org.telegram.ui.o80) this.f29591b;
                o80Var.d = null;
                o80Var.f38883a = null;
                o80Var.f38884b = false;
                return;
            case 28:
                org.telegram.ui.nd0 nd0Var = (org.telegram.ui.nd0) this.f29591b;
                nd0Var.H = false;
                nd0Var.n0();
                return;
            default:
                org.telegram.ui.mf0 mf0Var = (org.telegram.ui.mf0) this.f29591b;
                if (mf0Var.f38248s != null && mf0Var.f38246n != null) {
                    mf0Var.f38247r.setVisibility(4);
                    mf0Var.f38248s = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29590a) {
            case 6:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f29591b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
