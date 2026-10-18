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
    public final int f28656a;
    public final Object f28657b;

    public n31(Object obj, int i10) {
        this.f28656a = i10;
        this.f28657b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        float f7 = 0.0f;
        switch (this.f28656a) {
            case 0:
                p31 p31Var = (p31) this.f28657b;
                p31Var.K = 1.0f;
                p31Var.h.invalidate();
                return;
            case 1:
                ((b61) this.f28657b).L = null;
                return;
            case 2:
                UndoView undoView = (UndoView) this.f28657b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 3:
                g71 g71Var = (g71) this.f28657b;
                if (g71Var.f26500a.getTag() == null) {
                    g71Var.f26500a.setVisibility(4);
                    return;
                }
                return;
            case 4:
                super.onAnimationEnd(animator);
                h71 h71Var = (h71) this.f28657b;
                h71Var.f26795b = 0.0f;
                h71Var.setTranslationY(0.0f);
                h71Var.f26794a = null;
                return;
            case 5:
                b91 b91Var = (b91) this.f28657b;
                b91Var.J = false;
                b91Var.setEnabled(true);
                a91 a91Var = b91Var.f24878y;
                if (a91Var != null) {
                    ((l2.f) a91Var).z(1.0f);
                }
                b91Var.invalidate();
                return;
            case 6:
                ((u91) this.f28657b).f30940e0 = null;
                return;
            case 7:
                ((w91) this.f28657b).K = null;
                return;
            case 8:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f28657b).view.setEnabled(true);
                return;
            case 9:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.f28657b).f31646s0;
                if (tVar.f31785x0.getParent() != null) {
                    tVar.f31754a.removeView(tVar.f31785x0);
                    return;
                }
                return;
            case 10:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f28657b;
                if (v0Var.getParent() != null) {
                    ((ViewGroup) v0Var.getParent()).removeView(v0Var);
                    return;
                }
                return;
            case 11:
                ch1 ch1Var = (ch1) this.f28657b;
                if (!ch1Var.f31393a) {
                    ch1Var.V.v.S = true;
                    ch1Var.V.v.invalidate();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.f28657b;
                o1Var.f31662i = false;
                o1Var.f31665l.setAlpha(35);
                o1Var.f31664k.setAlpha(102);
                o1Var.f31663j.setAlpha(35);
                o1Var.c();
                return;
            case 13:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.f28657b).f31689c;
                s1Var.O = false;
                s1Var.requestLayout();
                return;
            case 14:
                org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) this.f28657b;
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
                q2Var.f31693b0 = null;
                return;
            case 15:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f28657b;
                if (t2Var.P) {
                    f7 = 1.0f;
                }
                t2Var.Q = f7;
                t2Var.a(t2Var.R, t2Var.S);
                return;
            case 16:
                ((org.telegram.ui.Components.voip.u2) this.f28657b).f31820c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.u2) this.f28657b).f31818a);
                if (((org.telegram.ui.Components.voip.u2) this.f28657b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.u2) this.f28657b).f31818a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.u2) this.f28657b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.u2) this.f28657b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.voip.a3 a3Var = (org.telegram.ui.Components.voip.a3) this.f28657b;
                a3Var.J = false;
                a3Var.T.e = false;
                if (a3Var.U && (animatorSet = a3Var.Q) != null) {
                    animatorSet.cancel();
                    a3Var.Q.start();
                }
                a3Var.c();
                return;
            case 18:
                ((org.telegram.ui.Components.voip.i3) this.f28657b).e.setVisibility(8);
                return;
            case 19:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f28657b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.vt vtVar = (org.telegram.ui.vt) this.f28657b;
                if (animator.equals(vtVar.f42296n[0])) {
                    vtVar.f42296n[0] = null;
                    return;
                }
                return;
            case 21:
                org.telegram.ui.av avVar = (org.telegram.ui.av) this.f28657b;
                org.telegram.ui.cv cvVar = avVar.f35526n;
                org.telegram.ui.bv[] bvVarArr = cvVar.f36013f;
                cvVar.h = null;
                if (cvVar.f36016s) {
                    bvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.bv bvVar = bvVarArr[0];
                    bvVarArr[0] = bvVarArr[1];
                    bvVarArr[1] = bvVar;
                    bvVar.setVisibility(8);
                    if (cvVar.f36013f[0].f35764f == cvVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cvVar.f36017w = z10;
                    cvVar.e.j(1.0f, cvVar.f36013f[0].f35764f);
                }
                cvVar.f36014n = false;
                avVar.f35524c = false;
                avVar.f35523b = false;
                org.telegram.ui.cv.f0(cvVar).setEnabled(true);
                cvVar.e.setEnabled(true);
                return;
            case 22:
                org.telegram.ui.hw hwVar = (org.telegram.ui.hw) this.f28657b;
                org.telegram.ui.ey.n1(hwVar.M, hwVar.L, 0.0f);
                return;
            case 23:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.f28657b;
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
                org.telegram.ui.ey eyVar2 = ((org.telegram.ui.wx) this.f28657b).E0;
                eyVar2.f36667g3 = null;
                if (!eyVar2.f36687k3) {
                    org.telegram.ui.dy[] dyVarArr = eyVar2.f36653e0;
                    org.telegram.ui.dy dyVar = dyVarArr[0];
                    org.telegram.ui.dy dyVar2 = dyVarArr[1];
                    dyVarArr[0] = dyVar2;
                    dyVarArr[1] = dyVar;
                    eyVar2.f36759z0.g(1.0f, dyVar2.h);
                    eyVar2.R4(false);
                    eyVar2.f36653e0[0].d.getClass();
                    eyVar2.f36653e0[1].d.getClass();
                }
                eyVar2.f36653e0[1].setVisibility(8);
                org.telegram.ui.ey.c1(eyVar2, true);
                eyVar2.f36672h3 = false;
                eyVar2.f36700n3 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) eyVar2).actionBar;
                kVar.setEnabled(true);
                eyVar2.f36759z0.setEnabled(true);
                eyVar2.p3(eyVar2.f36653e0[0]);
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.zx) this.f28657b).setScrollEnabled(true);
                return;
            case 26:
                m90 m90Var = (m90) this.f28657b;
                FrameLayout frameLayout = m90Var.f28482b;
                ei.g6 g6Var = (ei.g6) m90Var.f28483c;
                if (g6Var.getParent() != null) {
                    frameLayout.removeView(g6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.xh) m90Var.d);
                return;
            case 27:
                org.telegram.ui.s50 s50Var = ((org.telegram.ui.s40) this.f28657b).f40928o;
                org.telegram.ui.s50 s50Var2 = org.telegram.ui.s50.D3;
                s50Var.c1();
                org.telegram.ui.s50.n0(s50Var).invalidate();
                s50Var.Q.invalidate();
                if (s50Var.f41008s0) {
                    s50Var.f41008s0 = false;
                    s50Var.P0(true);
                    return;
                }
                return;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.g50 g50Var = (org.telegram.ui.g50) this.f28657b;
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
                org.telegram.ui.s70 s70Var = (org.telegram.ui.s70) this.f28657b;
                s70Var.d = null;
                s70Var.f41050a = null;
                s70Var.f41051b = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28656a) {
            case 8:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f28657b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
