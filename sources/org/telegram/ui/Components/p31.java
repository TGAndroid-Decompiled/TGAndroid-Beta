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
import org.telegram.ui.hh1;
import org.webrtc.OrientationHelper;
public final class p31 extends AnimatorListenerAdapter {
    public final int f29409a;
    public final Object f29410b;

    public p31(Object obj, int i10) {
        this.f29409a = i10;
        this.f29410b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        float f7 = 0.0f;
        switch (this.f29409a) {
            case 0:
                ci.h3 h3Var = ((r31) this.f29410b).f30065f;
                h3Var.setScaleX(1.0f);
                h3Var.setScaleY(1.0f);
                h3Var.invalidate();
                return;
            case 1:
                v31 v31Var = (v31) this.f29410b;
                v31Var.L = 1.0f;
                v31Var.h.invalidate();
                return;
            case 2:
                ((i61) this.f29410b).L = null;
                return;
            case 3:
                UndoView undoView = (UndoView) this.f29410b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 4:
                p71 p71Var = (p71) this.f29410b;
                if (p71Var.f29463a.getTag() == null) {
                    p71Var.f29463a.setVisibility(4);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                q71 q71Var = (q71) this.f29410b;
                q71Var.f29784b = 0.0f;
                q71Var.setTranslationY(0.0f);
                q71Var.f29783a = null;
                return;
            case 6:
                k91 k91Var = (k91) this.f29410b;
                k91Var.J = false;
                k91Var.setEnabled(true);
                j91 j91Var = k91Var.f27986y;
                if (j91Var != null) {
                    ((l2.f) j91Var).I(1.0f);
                }
                k91Var.invalidate();
                return;
            case 7:
                ((da1) this.f29410b).f25571e0 = null;
                return;
            case 8:
                ((fa1) this.f29410b).K = null;
                return;
            case 9:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f29410b).view.setEnabled(true);
                return;
            case 10:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.f29410b).f31785s0;
                if (tVar.f31924x0.getParent() != null) {
                    tVar.f31893a.removeView(tVar.f31924x0);
                    return;
                }
                return;
            case 11:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f29410b;
                if (v0Var.getParent() != null) {
                    ((ViewGroup) v0Var.getParent()).removeView(v0Var);
                    return;
                }
                return;
            case 12:
                hh1 hh1Var = (hh1) this.f29410b;
                if (!hh1Var.f31532a) {
                    hh1Var.V.v.S = true;
                    hh1Var.V.v.invalidate();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.f29410b;
                o1Var.f31801i = false;
                o1Var.f31804l.setAlpha(35);
                o1Var.f31803k.setAlpha(102);
                o1Var.f31802j.setAlpha(35);
                o1Var.c();
                return;
            case 14:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.f29410b).f31828c;
                s1Var.O = false;
                s1Var.requestLayout();
                return;
            case 15:
                org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) this.f29410b;
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
                q2Var.f31832b0 = null;
                return;
            case 16:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f29410b;
                if (t2Var.P) {
                    f7 = 1.0f;
                }
                t2Var.Q = f7;
                t2Var.a(t2Var.R, t2Var.S);
                return;
            case 17:
                ((org.telegram.ui.Components.voip.u2) this.f29410b).f31959c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.u2) this.f29410b).f31957a);
                if (((org.telegram.ui.Components.voip.u2) this.f29410b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.u2) this.f29410b).f31957a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.u2) this.f29410b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.u2) this.f29410b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.voip.a3 a3Var = (org.telegram.ui.Components.voip.a3) this.f29410b;
                a3Var.J = false;
                a3Var.T.e = false;
                if (a3Var.U && (animatorSet = a3Var.Q) != null) {
                    animatorSet.cancel();
                    a3Var.Q.start();
                }
                a3Var.c();
                return;
            case 19:
                ((org.telegram.ui.Components.voip.i3) this.f29410b).e.setVisibility(8);
                return;
            case 20:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f29410b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 21:
                org.telegram.ui.wt wtVar = (org.telegram.ui.wt) this.f29410b;
                if (animator.equals(wtVar.f43434n[0])) {
                    wtVar.f43434n[0] = null;
                    return;
                }
                return;
            case 22:
                org.telegram.ui.av avVar = (org.telegram.ui.av) this.f29410b;
                org.telegram.ui.cv cvVar = avVar.f35787n;
                org.telegram.ui.bv[] bvVarArr = cvVar.f36432f;
                cvVar.h = null;
                if (cvVar.f36435s) {
                    bvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.bv bvVar = bvVarArr[0];
                    bvVarArr[0] = bvVarArr[1];
                    bvVarArr[1] = bvVar;
                    bvVar.setVisibility(8);
                    if (cvVar.f36432f[0].f36175f == cvVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cvVar.f36436w = z10;
                    cvVar.e.i(1.0f, cvVar.f36432f[0].f36175f);
                }
                cvVar.f36433n = false;
                avVar.f35785c = false;
                avVar.f35784b = false;
                org.telegram.ui.cv.f0(cvVar).setEnabled(true);
                cvVar.e.setEnabled(true);
                return;
            case 23:
                org.telegram.ui.hw hwVar = (org.telegram.ui.hw) this.f29410b;
                org.telegram.ui.ey.m1(hwVar.M, hwVar.L, 0.0f);
                return;
            case 24:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.f29410b;
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
            case 25:
                org.telegram.ui.ey eyVar2 = ((org.telegram.ui.wx) this.f29410b).E0;
                eyVar2.f37073g3 = null;
                if (!eyVar2.f37093k3) {
                    org.telegram.ui.dy[] dyVarArr = eyVar2.f37059e0;
                    org.telegram.ui.dy dyVar = dyVarArr[0];
                    org.telegram.ui.dy dyVar2 = dyVarArr[1];
                    dyVarArr[0] = dyVar2;
                    dyVarArr[1] = dyVar;
                    eyVar2.f37167z0.g(1.0f, dyVar2.h);
                    eyVar2.R4(false);
                    eyVar2.f37059e0[0].d.getClass();
                    eyVar2.f37059e0[1].d.getClass();
                }
                eyVar2.f37059e0[1].setVisibility(8);
                org.telegram.ui.ey.b1(eyVar2, true);
                eyVar2.f37078h3 = false;
                eyVar2.f37106n3 = false;
                kVar = ((org.telegram.ui.ActionBar.o2) eyVar2).actionBar;
                kVar.setEnabled(true);
                eyVar2.f37167z0.setEnabled(true);
                eyVar2.p3(eyVar2.f37059e0[0]);
                return;
            case 26:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.zx) this.f29410b).setScrollEnabled(true);
                return;
            case 27:
                n90 n90Var = (n90) this.f29410b;
                FrameLayout frameLayout = n90Var.f28903b;
                ei.g6 g6Var = (ei.g6) n90Var.f28904c;
                if (g6Var.getParent() != null) {
                    frameLayout.removeView(g6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.vh) n90Var.d);
                return;
            case 28:
                org.telegram.ui.u50 u50Var = ((org.telegram.ui.t40) this.f29410b).f41867o;
                org.telegram.ui.u50 u50Var2 = org.telegram.ui.u50.D3;
                u50Var.b1();
                org.telegram.ui.u50.m0(u50Var).invalidate();
                u50Var.Q.invalidate();
                if (u50Var.f42245s0) {
                    u50Var.f42245s0 = false;
                    u50Var.O0(true);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                org.telegram.ui.i50 i50Var = (org.telegram.ui.i50) this.f29410b;
                i50Var.G = null;
                org.telegram.ui.u50 u50Var3 = i50Var.L;
                u50Var3.Q.invalidate();
                u50Var3.a2.invalidate();
                org.telegram.ui.u50.y0(u50Var3).invalidate();
                org.telegram.ui.u50.J0(u50Var3);
                i50Var.H.clear();
                i50Var.I.clear();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29409a) {
            case 9:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f29410b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
