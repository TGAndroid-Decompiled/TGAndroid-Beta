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
import org.telegram.ui.ah1;
import org.webrtc.OrientationHelper;
public final class o31 extends AnimatorListenerAdapter {
    public final int f28896a;
    public final Object f28897b;

    public o31(Object obj, int i10) {
        this.f28896a = i10;
        this.f28897b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        float f7 = 0.0f;
        switch (this.f28896a) {
            case 0:
                q31 q31Var = (q31) this.f28897b;
                q31Var.K = 1.0f;
                q31Var.h.invalidate();
                return;
            case 1:
                ((c61) this.f28897b).L = null;
                return;
            case 2:
                UndoView undoView = (UndoView) this.f28897b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 3:
                h71 h71Var = (h71) this.f28897b;
                if (h71Var.f26794a.getTag() == null) {
                    h71Var.f26794a.setVisibility(4);
                    return;
                }
                return;
            case 4:
                super.onAnimationEnd(animator);
                i71 i71Var = (i71) this.f28897b;
                i71Var.f27098b = 0.0f;
                i71Var.setTranslationY(0.0f);
                i71Var.f27097a = null;
                return;
            case 5:
                c91 c91Var = (c91) this.f28897b;
                c91Var.J = false;
                c91Var.setEnabled(true);
                b91 b91Var = c91Var.f25151y;
                if (b91Var != null) {
                    ((l2.f) b91Var).I(1.0f);
                }
                c91Var.invalidate();
                return;
            case 6:
                ((v91) this.f28897b).f31226e0 = null;
                return;
            case 7:
                ((x91) this.f28897b).K = null;
                return;
            case 8:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f28897b).view.setEnabled(true);
                return;
            case 9:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.f28897b).f31648s0;
                if (tVar.f31787x0.getParent() != null) {
                    tVar.f31756a.removeView(tVar.f31787x0);
                    return;
                }
                return;
            case 10:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f28897b;
                if (v0Var.getParent() != null) {
                    ((ViewGroup) v0Var.getParent()).removeView(v0Var);
                    return;
                }
                return;
            case 11:
                ah1 ah1Var = (ah1) this.f28897b;
                if (!ah1Var.f31395a) {
                    ah1Var.V.v.S = true;
                    ah1Var.V.v.invalidate();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.f28897b;
                o1Var.f31664i = false;
                o1Var.f31667l.setAlpha(35);
                o1Var.f31666k.setAlpha(102);
                o1Var.f31665j.setAlpha(35);
                o1Var.c();
                return;
            case 13:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.f28897b).f31691c;
                s1Var.O = false;
                s1Var.requestLayout();
                return;
            case 14:
                org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) this.f28897b;
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
                q2Var.f31695b0 = null;
                return;
            case 15:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f28897b;
                if (t2Var.P) {
                    f7 = 1.0f;
                }
                t2Var.Q = f7;
                t2Var.a(t2Var.R, t2Var.S);
                return;
            case 16:
                ((org.telegram.ui.Components.voip.u2) this.f28897b).f31822c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.u2) this.f28897b).f31820a);
                if (((org.telegram.ui.Components.voip.u2) this.f28897b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.u2) this.f28897b).f31820a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.u2) this.f28897b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.u2) this.f28897b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.voip.a3 a3Var = (org.telegram.ui.Components.voip.a3) this.f28897b;
                a3Var.J = false;
                a3Var.T.e = false;
                if (a3Var.U && (animatorSet = a3Var.Q) != null) {
                    animatorSet.cancel();
                    a3Var.Q.start();
                }
                a3Var.c();
                return;
            case 18:
                ((org.telegram.ui.Components.voip.i3) this.f28897b).e.setVisibility(8);
                return;
            case 19:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f28897b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.tt ttVar = (org.telegram.ui.tt) this.f28897b;
                if (animator.equals(ttVar.f41740n[0])) {
                    ttVar.f41740n[0] = null;
                    return;
                }
                return;
            case 21:
                org.telegram.ui.yu yuVar = (org.telegram.ui.yu) this.f28897b;
                org.telegram.ui.av avVar = yuVar.f43552n;
                org.telegram.ui.zu[] zuVarArr = avVar.f35424f;
                avVar.h = null;
                if (avVar.f35427s) {
                    zuVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.zu zuVar = zuVarArr[0];
                    zuVarArr[0] = zuVarArr[1];
                    zuVarArr[1] = zuVar;
                    zuVar.setVisibility(8);
                    if (avVar.f35424f[0].f43801f == avVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    avVar.f35428w = z10;
                    avVar.e.j(1.0f, avVar.f35424f[0].f43801f);
                }
                avVar.f35425n = false;
                yuVar.f43550c = false;
                yuVar.f43549b = false;
                org.telegram.ui.av.f0(avVar).setEnabled(true);
                avVar.e.setEnabled(true);
                return;
            case 22:
                org.telegram.ui.fw fwVar = (org.telegram.ui.fw) this.f28897b;
                org.telegram.ui.cy.n1(fwVar.M, fwVar.L, 0.0f);
                return;
            case 23:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) this.f28897b;
                boolean z11 = cyVar.G0;
                if (z11) {
                    f7 = 1.0f;
                }
                cyVar.H0 = f7;
                if (!z11) {
                    cyVar.E0.setVisibility(8);
                }
                View view = cyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.cy cyVar2 = ((org.telegram.ui.ux) this.f28897b).E0;
                cyVar2.f36099g3 = null;
                if (!cyVar2.f36119k3) {
                    org.telegram.ui.ay[] ayVarArr = cyVar2.f36085e0;
                    org.telegram.ui.ay ayVar = ayVarArr[0];
                    org.telegram.ui.ay ayVar2 = ayVarArr[1];
                    ayVarArr[0] = ayVar2;
                    ayVarArr[1] = ayVar;
                    cyVar2.f36191z0.g(1.0f, ayVar2.h);
                    cyVar2.R4(false);
                    cyVar2.f36085e0[0].d.getClass();
                    cyVar2.f36085e0[1].d.getClass();
                }
                cyVar2.f36085e0[1].setVisibility(8);
                org.telegram.ui.cy.c1(cyVar2, true);
                cyVar2.f36104h3 = false;
                cyVar2.f36132n3 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) cyVar2).actionBar;
                kVar.setEnabled(true);
                cyVar2.f36191z0.setEnabled(true);
                cyVar2.p3(cyVar2.f36085e0[0]);
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.xx) this.f28897b).setScrollEnabled(true);
                return;
            case 26:
                m90 m90Var = (m90) this.f28897b;
                FrameLayout frameLayout = m90Var.f28488b;
                ei.g6 g6Var = (ei.g6) m90Var.f28489c;
                if (g6Var.getParent() != null) {
                    frameLayout.removeView(g6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.vh) m90Var.d);
                return;
            case 27:
                org.telegram.ui.q50 q50Var = ((org.telegram.ui.q40) this.f28897b).f40363o;
                org.telegram.ui.q50 q50Var2 = org.telegram.ui.q50.D3;
                q50Var.c1();
                org.telegram.ui.q50.n0(q50Var).invalidate();
                q50Var.Q.invalidate();
                if (q50Var.f40444s0) {
                    q50Var.f40444s0 = false;
                    q50Var.P0(true);
                    return;
                }
                return;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.e50 e50Var = (org.telegram.ui.e50) this.f28897b;
                e50Var.G = null;
                org.telegram.ui.q50 q50Var3 = e50Var.L;
                q50Var3.Q.invalidate();
                q50Var3.a2.invalidate();
                org.telegram.ui.q50.z0(q50Var3).invalidate();
                org.telegram.ui.q50.K0(q50Var3);
                e50Var.H.clear();
                e50Var.I.clear();
                return;
            default:
                org.telegram.ui.q70 q70Var = (org.telegram.ui.q70) this.f28897b;
                q70Var.d = null;
                q70Var.f40488a = null;
                q70Var.f40489b = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28896a) {
            case 8:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f28897b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
