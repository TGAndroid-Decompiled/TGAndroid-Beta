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
import org.telegram.ui.ch1;
import org.webrtc.OrientationHelper;
public final class n31 extends AnimatorListenerAdapter {
    public final int f28649a;
    public final Object f28650b;

    public n31(Object obj, int i10) {
        this.f28649a = i10;
        this.f28650b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        float f7 = 0.0f;
        switch (this.f28649a) {
            case 0:
                p31 p31Var = (p31) this.f28650b;
                p31Var.K = 1.0f;
                p31Var.h.invalidate();
                return;
            case 1:
                ((b61) this.f28650b).L = null;
                return;
            case 2:
                UndoView undoView = (UndoView) this.f28650b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 3:
                g71 g71Var = (g71) this.f28650b;
                if (g71Var.f26493a.getTag() == null) {
                    g71Var.f26493a.setVisibility(4);
                    return;
                }
                return;
            case 4:
                super.onAnimationEnd(animator);
                h71 h71Var = (h71) this.f28650b;
                h71Var.f26788b = 0.0f;
                h71Var.setTranslationY(0.0f);
                h71Var.f26787a = null;
                return;
            case 5:
                b91 b91Var = (b91) this.f28650b;
                b91Var.J = false;
                b91Var.setEnabled(true);
                a91 a91Var = b91Var.f24871y;
                if (a91Var != null) {
                    ((l2.f) a91Var).z(1.0f);
                }
                b91Var.invalidate();
                return;
            case 6:
                ((u91) this.f28650b).f30933e0 = null;
                return;
            case 7:
                ((w91) this.f28650b).K = null;
                return;
            case 8:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f28650b).view.setEnabled(true);
                return;
            case 9:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.f28650b).f31639s0;
                if (tVar.f31778x0.getParent() != null) {
                    tVar.f31747a.removeView(tVar.f31778x0);
                    return;
                }
                return;
            case 10:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f28650b;
                if (v0Var.getParent() != null) {
                    ((ViewGroup) v0Var.getParent()).removeView(v0Var);
                    return;
                }
                return;
            case 11:
                ch1 ch1Var = (ch1) this.f28650b;
                if (!ch1Var.f31386a) {
                    ch1Var.V.v.S = true;
                    ch1Var.V.v.invalidate();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.f28650b;
                o1Var.f31655i = false;
                o1Var.f31658l.setAlpha(35);
                o1Var.f31657k.setAlpha(102);
                o1Var.f31656j.setAlpha(35);
                o1Var.c();
                return;
            case 13:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.f28650b).f31682c;
                s1Var.O = false;
                s1Var.requestLayout();
                return;
            case 14:
                org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) this.f28650b;
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
                q2Var.f31686b0 = null;
                return;
            case 15:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f28650b;
                if (t2Var.P) {
                    f7 = 1.0f;
                }
                t2Var.Q = f7;
                t2Var.a(t2Var.R, t2Var.S);
                return;
            case 16:
                ((org.telegram.ui.Components.voip.u2) this.f28650b).f31813c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.u2) this.f28650b).f31811a);
                if (((org.telegram.ui.Components.voip.u2) this.f28650b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.u2) this.f28650b).f31811a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.u2) this.f28650b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.u2) this.f28650b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.voip.a3 a3Var = (org.telegram.ui.Components.voip.a3) this.f28650b;
                a3Var.J = false;
                a3Var.T.e = false;
                if (a3Var.U && (animatorSet = a3Var.Q) != null) {
                    animatorSet.cancel();
                    a3Var.Q.start();
                }
                a3Var.c();
                return;
            case 18:
                ((org.telegram.ui.Components.voip.i3) this.f28650b).e.setVisibility(8);
                return;
            case 19:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f28650b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.vt vtVar = (org.telegram.ui.vt) this.f28650b;
                if (animator.equals(vtVar.f42269n[0])) {
                    vtVar.f42269n[0] = null;
                    return;
                }
                return;
            case 21:
                org.telegram.ui.av avVar = (org.telegram.ui.av) this.f28650b;
                org.telegram.ui.cv cvVar = avVar.f35487n;
                org.telegram.ui.bv[] bvVarArr = cvVar.f35985f;
                cvVar.h = null;
                if (cvVar.f35988s) {
                    bvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.bv bvVar = bvVarArr[0];
                    bvVarArr[0] = bvVarArr[1];
                    bvVarArr[1] = bvVar;
                    bvVar.setVisibility(8);
                    if (cvVar.f35985f[0].f35718f == cvVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cvVar.f35989w = z10;
                    cvVar.e.j(1.0f, cvVar.f35985f[0].f35718f);
                }
                cvVar.f35986n = false;
                avVar.f35485c = false;
                avVar.f35484b = false;
                org.telegram.ui.cv.f0(cvVar).setEnabled(true);
                cvVar.e.setEnabled(true);
                return;
            case 22:
                org.telegram.ui.hw hwVar = (org.telegram.ui.hw) this.f28650b;
                org.telegram.ui.ey.n1(hwVar.M, hwVar.L, 0.0f);
                return;
            case 23:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.f28650b;
                boolean z11 = eyVar.G0;
                if (z11) {
                    f7 = 1.0f;
                }
                eyVar.H0 = f7;
                if (!z11) {
                    eyVar.E0.setVisibility(8);
                }
                View view = eyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.ey eyVar2 = ((org.telegram.ui.wx) this.f28650b).E0;
                eyVar2.f36651g3 = null;
                if (!eyVar2.f36671k3) {
                    org.telegram.ui.dy[] dyVarArr = eyVar2.f36637e0;
                    org.telegram.ui.dy dyVar = dyVarArr[0];
                    org.telegram.ui.dy dyVar2 = dyVarArr[1];
                    dyVarArr[0] = dyVar2;
                    dyVarArr[1] = dyVar;
                    eyVar2.f36743z0.g(1.0f, dyVar2.h);
                    eyVar2.R4(false);
                    eyVar2.f36637e0[0].d.getClass();
                    eyVar2.f36637e0[1].d.getClass();
                }
                eyVar2.f36637e0[1].setVisibility(8);
                org.telegram.ui.ey.c1(eyVar2, true);
                eyVar2.f36656h3 = false;
                eyVar2.f36684n3 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) eyVar2).actionBar;
                kVar.setEnabled(true);
                eyVar2.f36743z0.setEnabled(true);
                eyVar2.p3(eyVar2.f36637e0[0]);
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.zx) this.f28650b).setScrollEnabled(true);
                return;
            case 26:
                m90 m90Var = (m90) this.f28650b;
                FrameLayout frameLayout = m90Var.f28475b;
                ei.g6 g6Var = (ei.g6) m90Var.f28476c;
                if (g6Var.getParent() != null) {
                    frameLayout.removeView(g6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.xh) m90Var.d);
                return;
            case 27:
                org.telegram.ui.s50 s50Var = ((org.telegram.ui.s40) this.f28650b).f40890o;
                org.telegram.ui.s50 s50Var2 = org.telegram.ui.s50.D3;
                s50Var.c1();
                org.telegram.ui.s50.n0(s50Var).invalidate();
                s50Var.Q.invalidate();
                if (s50Var.f40970s0) {
                    s50Var.f40970s0 = false;
                    s50Var.P0(true);
                    return;
                }
                return;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.g50 g50Var = (org.telegram.ui.g50) this.f28650b;
                g50Var.G = null;
                org.telegram.ui.s50 s50Var3 = g50Var.L;
                s50Var3.Q.invalidate();
                s50Var3.a2.invalidate();
                org.telegram.ui.s50.z0(s50Var3).invalidate();
                org.telegram.ui.s50.K0(s50Var3);
                g50Var.H.clear();
                g50Var.I.clear();
                return;
            default:
                org.telegram.ui.s70 s70Var = (org.telegram.ui.s70) this.f28650b;
                s70Var.d = null;
                s70Var.f41012a = null;
                s70Var.f41013b = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28649a) {
            case 8:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f28650b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
