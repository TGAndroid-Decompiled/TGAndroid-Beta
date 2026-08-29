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
public final class p11 extends AnimatorListenerAdapter {
    public final int f31548a;
    public final Object f31549b;

    public p11(Object obj, int i10) {
        this.f31548a = i10;
        this.f31549b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        boolean z10;
        org.telegram.ui.ActionBar.l lVar;
        float f9 = 0.0f;
        switch (this.f31548a) {
            case 0:
                ((q11) this.f31549b).setVisibility(8);
                return;
            case 1:
                lh.z2 z2Var = ((h21) this.f31549b).f29041f;
                z2Var.setScaleX(1.0f);
                z2Var.setScaleY(1.0f);
                z2Var.invalidate();
                return;
            case 2:
                l21 l21Var = (l21) this.f31549b;
                l21Var.G = 1.0f;
                l21Var.h.invalidate();
                return;
            case 3:
                ((s41) this.f31549b).H = null;
                return;
            case 4:
                UndoView undoView = (UndoView) this.f31549b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 5:
                c61 c61Var = (c61) this.f31549b;
                if (c61Var.f27351a.getTag() == null) {
                    c61Var.f27351a.setVisibility(4);
                    return;
                }
                return;
            case 6:
                super.onAnimationEnd(animator);
                d61 d61Var = (d61) this.f31549b;
                d61Var.f27679b = 0.0f;
                d61Var.setTranslationY(0.0f);
                d61Var.f27678a = null;
                return;
            case 7:
                y71 y71Var = (y71) this.f31549b;
                y71Var.F = false;
                y71Var.setEnabled(true);
                x71 x71Var = y71Var.f34963y;
                if (x71Var != null) {
                    ((n) x71Var).j(1.0f);
                }
                y71Var.invalidate();
                return;
            case 8:
                ((s81) this.f31549b).f32570a0 = null;
                return;
            case 9:
                ((u81) this.f31549b).G = null;
                return;
            case 10:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f31549b).view.setEnabled(true);
                return;
            case 11:
                org.telegram.ui.Components.voip.u uVar = ((org.telegram.ui.Components.voip.p) this.f31549b).f33918o0;
                if (uVar.f34040t0.getParent() != null) {
                    uVar.f34014a.removeView(uVar.f34040t0);
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f31549b;
                if (v0Var.getParent() != null) {
                    ((ViewGroup) v0Var.getParent()).removeView(v0Var);
                    return;
                }
                return;
            case 13:
                hh1 hh1Var = (hh1) this.f31549b;
                if (!hh1Var.f33620a) {
                    hh1Var.R.v.O = true;
                    hh1Var.R.v.invalidate();
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.f31549b;
                o1Var.f33889i = false;
                o1Var.f33892l.setAlpha(35);
                o1Var.f33891k.setAlpha(102);
                o1Var.f33890j.setAlpha(35);
                o1Var.c();
                return;
            case 15:
                org.telegram.ui.Components.voip.t1 t1Var = ((org.telegram.ui.Components.voip.r1) this.f31549b).f33968c;
                t1Var.K = false;
                t1Var.requestLayout();
                return;
            case 16:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.f31549b;
                u2Var.J = 0.0f;
                u2Var.K = 0.0f;
                org.telegram.ui.Components.voip.t2 t2Var = u2Var.d;
                t2Var.setScaleX(u2Var.P);
                t2Var.setScaleY(u2Var.P);
                TextureView textureView = u2Var.f34057e;
                if (textureView != null) {
                    textureView.setScaleX(u2Var.Q);
                    textureView.setScaleY(u2Var.Q);
                }
                u2Var.setTranslationY(0.0f);
                u2Var.setTranslationX(0.0f);
                u2Var.S = u2Var.R;
                u2Var.U = null;
                return;
            case 17:
                org.telegram.ui.Components.voip.x2 x2Var = (org.telegram.ui.Components.voip.x2) this.f31549b;
                if (x2Var.L) {
                    f9 = 1.0f;
                }
                x2Var.M = f9;
                x2Var.a(x2Var.N, x2Var.O);
                return;
            case 18:
                ((org.telegram.ui.Components.voip.y2) this.f31549b).f34140c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.y2) this.f31549b).f34138a);
                if (((org.telegram.ui.Components.voip.y2) this.f31549b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.y2) this.f31549b).f34138a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.y2) this.f31549b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.y2) this.f31549b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.voip.e3 e3Var = (org.telegram.ui.Components.voip.e3) this.f31549b;
                e3Var.F = false;
                e3Var.P.f33886e = false;
                if (e3Var.Q && (animatorSet = e3Var.M) != null) {
                    animatorSet.cancel();
                    e3Var.M.start();
                }
                e3Var.c();
                return;
            case 20:
                ((org.telegram.ui.Components.voip.m3) this.f31549b).f33858e.setVisibility(8);
                return;
            case 21:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f31549b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 22:
                org.telegram.ui.wt wtVar = (org.telegram.ui.wt) this.f31549b;
                if (animator.equals(wtVar.f44372n[0])) {
                    wtVar.f44372n[0] = null;
                    return;
                }
                return;
            case 23:
                org.telegram.ui.av avVar = (org.telegram.ui.av) this.f31549b;
                org.telegram.ui.cv cvVar = avVar.f36610n;
                org.telegram.ui.bv[] bvVarArr = cvVar.f37222f;
                cvVar.h = null;
                if (cvVar.f37225s) {
                    bvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.bv bvVar = bvVarArr[0];
                    bvVarArr[0] = bvVarArr[1];
                    bvVarArr[1] = bvVar;
                    bvVar.setVisibility(8);
                    if (cvVar.f37222f[0].f36927f == cvVar.f37221e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cvVar.f37226w = z10;
                    cvVar.f37221e.j(1.0f, cvVar.f37222f[0].f36927f);
                }
                cvVar.f37223n = false;
                avVar.f36607c = false;
                avVar.f36606b = false;
                org.telegram.ui.cv.f0(cvVar).setEnabled(true);
                cvVar.f37221e.setEnabled(true);
                return;
            case 24:
                org.telegram.ui.jw jwVar = (org.telegram.ui.jw) this.f31549b;
                org.telegram.ui.fy.q1(jwVar.M, jwVar.L, 0.0f);
                return;
            case 25:
                org.telegram.ui.fy fyVar = (org.telegram.ui.fy) this.f31549b;
                boolean z11 = fyVar.C0;
                if (z11) {
                    f9 = 1.0f;
                }
                fyVar.D0 = f9;
                if (!z11) {
                    fyVar.A0.setVisibility(8);
                }
                View view = fyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.fy fyVar2 = ((org.telegram.ui.xx) this.f31549b).A0;
                fyVar2.f38264b3 = null;
                if (!fyVar2.f38286f3) {
                    org.telegram.ui.ey[] eyVarArr = fyVar2.f38256a0;
                    org.telegram.ui.ey eyVar = eyVarArr[0];
                    org.telegram.ui.ey eyVar2 = eyVarArr[1];
                    eyVarArr[0] = eyVar2;
                    eyVarArr[1] = eyVar;
                    fyVar2.f38362v0.g(1.0f, eyVar2.h);
                    fyVar2.T4(false);
                    fyVar2.f38256a0[0].d.getClass();
                    fyVar2.f38256a0[1].d.getClass();
                }
                fyVar2.f38256a0[1].setVisibility(8);
                org.telegram.ui.fy.f1(fyVar2, true);
                fyVar2.c3 = false;
                fyVar2.f38301i3 = false;
                lVar = ((org.telegram.ui.ActionBar.o2) fyVar2).actionBar;
                lVar.setEnabled(true);
                fyVar2.f38362v0.setEnabled(true);
                fyVar2.r3(fyVar2.f38256a0[0]);
                return;
            case 27:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.ay) this.f31549b).setScrollEnabled(true);
                return;
            case 28:
                n80 n80Var = (n80) this.f31549b;
                FrameLayout frameLayout = n80Var.f30927b;
                cg.i0 i0Var = (cg.i0) n80Var.f30928c;
                if (i0Var.getParent() != null) {
                    frameLayout.removeView(i0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.vh) n80Var.d);
                return;
            default:
                org.telegram.ui.r50 r50Var = ((org.telegram.ui.r40) this.f31549b).f41864o;
                org.telegram.ui.r50 r50Var2 = org.telegram.ui.r50.f41867z3;
                r50Var.b1();
                org.telegram.ui.r50.m0(r50Var).invalidate();
                r50Var.M.invalidate();
                if (r50Var.f41925o0) {
                    r50Var.f41925o0 = false;
                    r50Var.O0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f31548a) {
            case 10:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f31549b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
