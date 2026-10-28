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
import org.telegram.ui.kh1;
import org.webrtc.OrientationHelper;
public final class i31 extends AnimatorListenerAdapter {
    public final int f29207a;
    public final Object f29208b;

    public i31(Object obj, int i10) {
        this.f29207a = i10;
        this.f29208b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        float f7 = 0.0f;
        switch (this.f29207a) {
            case 0:
                ((j31) this.f29208b).setVisibility(8);
                return;
            case 1:
                di.h3 h3Var = ((a41) this.f29208b).f26430f;
                h3Var.setScaleX(1.0f);
                h3Var.setScaleY(1.0f);
                h3Var.invalidate();
                return;
            case 2:
                e41 e41Var = (e41) this.f29208b;
                e41Var.L = 1.0f;
                e41Var.h.invalidate();
                return;
            case 3:
                ((q61) this.f29208b).L = null;
                return;
            case 4:
                UndoView undoView = (UndoView) this.f29208b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 5:
                z71 z71Var = (z71) this.f29208b;
                if (z71Var.f35286a.getTag() == null) {
                    z71Var.f35286a.setVisibility(4);
                    return;
                }
                return;
            case 6:
                super.onAnimationEnd(animator);
                a81 a81Var = (a81) this.f29208b;
                a81Var.f26458b = 0.0f;
                a81Var.setTranslationY(0.0f);
                a81Var.f26457a = null;
                return;
            case 7:
                u91 u91Var = (u91) this.f29208b;
                u91Var.J = false;
                u91Var.setEnabled(true);
                t91 t91Var = u91Var.f33322y;
                if (t91Var != null) {
                    ((jg.i) t91Var).e0(1.0f);
                }
                u91Var.invalidate();
                return;
            case 8:
                ((na1) this.f29208b).f30814e0 = null;
                return;
            case 9:
                ((kc1) this.f29208b).K = null;
                return;
            case 10:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f29208b).view.setEnabled(true);
                return;
            case 11:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.f29208b).f34084s0;
                if (tVar.f34210x0.getParent() != null) {
                    tVar.f34179a.removeView(tVar.f34210x0);
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f29208b;
                if (v0Var.getParent() != null) {
                    ((ViewGroup) v0Var.getParent()).removeView(v0Var);
                    return;
                }
                return;
            case 13:
                kh1 kh1Var = (kh1) this.f29208b;
                if (!kh1Var.f33839a) {
                    kh1Var.V.v.S = true;
                    kh1Var.V.v.invalidate();
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.f29208b;
                r1Var.f34153i = false;
                r1Var.f34156l.setAlpha(35);
                r1Var.f34155k.setAlpha(102);
                r1Var.f34154j.setAlpha(35);
                r1Var.c();
                return;
            case 15:
                org.telegram.ui.Components.voip.v1 v1Var = ((org.telegram.ui.Components.voip.t1) this.f29208b).f34216c;
                v1Var.O = false;
                v1Var.requestLayout();
                return;
            case 16:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f29208b;
                t2Var.N = 0.0f;
                t2Var.O = 0.0f;
                org.telegram.ui.Components.voip.s2 s2Var = t2Var.d;
                s2Var.setScaleX(t2Var.T);
                s2Var.setScaleY(t2Var.T);
                TextureView textureView = t2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(t2Var.U);
                    textureView.setScaleY(t2Var.U);
                }
                t2Var.setTranslationY(0.0f);
                t2Var.setTranslationX(0.0f);
                t2Var.W = t2Var.V;
                t2Var.f34220b0 = null;
                return;
            case 17:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f29208b;
                if (w2Var.P) {
                    f7 = 1.0f;
                }
                w2Var.Q = f7;
                w2Var.a(w2Var.R, w2Var.S);
                return;
            case 18:
                ((org.telegram.ui.Components.voip.x2) this.f29208b).f34313c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.x2) this.f29208b).f34311a);
                if (((org.telegram.ui.Components.voip.x2) this.f29208b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.x2) this.f29208b).f34311a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.x2) this.f29208b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.x2) this.f29208b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.voip.d3 d3Var = (org.telegram.ui.Components.voip.d3) this.f29208b;
                d3Var.J = false;
                d3Var.T.e = false;
                if (d3Var.U && (animatorSet = d3Var.Q) != null) {
                    animatorSet.cancel();
                    d3Var.Q.start();
                }
                d3Var.c();
                return;
            case 20:
                ((org.telegram.ui.Components.voip.l3) this.f29208b).e.setVisibility(8);
                return;
            case 21:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f29208b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 22:
                org.telegram.ui.wt wtVar = (org.telegram.ui.wt) this.f29208b;
                if (animator.equals(wtVar.f45399n[0])) {
                    wtVar.f45399n[0] = null;
                    return;
                }
                return;
            case 23:
                org.telegram.ui.zu zuVar = (org.telegram.ui.zu) this.f29208b;
                org.telegram.ui.bv bvVar = zuVar.f46364n;
                org.telegram.ui.av[] avVarArr = bvVar.f38108f;
                bvVar.h = null;
                if (bvVar.f38111s) {
                    avVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.av avVar = avVarArr[0];
                    avVarArr[0] = avVarArr[1];
                    avVarArr[1] = avVar;
                    avVar.setVisibility(8);
                    if (bvVar.f38108f[0].f37831f == bvVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bvVar.f38112w = z10;
                    bvVar.e.i(1.0f, bvVar.f38108f[0].f37831f);
                }
                bvVar.f38109n = false;
                zuVar.f46362c = false;
                zuVar.f46361b = false;
                org.telegram.ui.bv.g0(bvVar).setEnabled(true);
                bvVar.e.setEnabled(true);
                return;
            case 24:
                org.telegram.ui.ew ewVar = (org.telegram.ui.ew) this.f29208b;
                org.telegram.ui.ey.r1(ewVar.M, ewVar.L, 0.0f);
                return;
            case 25:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.f29208b;
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
            case 26:
                org.telegram.ui.ey eyVar2 = ((org.telegram.ui.wx) this.f29208b).f45420t0;
                eyVar2.f39012g3 = null;
                if (!eyVar2.f39032k3) {
                    org.telegram.ui.dy[] dyVarArr = eyVar2.f38998e0;
                    org.telegram.ui.dy dyVar = dyVarArr[0];
                    org.telegram.ui.dy dyVar2 = dyVarArr[1];
                    dyVarArr[0] = dyVar2;
                    dyVarArr[1] = dyVar;
                    eyVar2.f39105z0.g(1.0f, dyVar2.h);
                    eyVar2.b5(false);
                    eyVar2.f38998e0[0].d.getClass();
                    eyVar2.f38998e0[1].d.getClass();
                }
                eyVar2.f38998e0[1].setVisibility(8);
                org.telegram.ui.ey.g1(eyVar2, true);
                eyVar2.f39017h3 = false;
                eyVar2.f39045n3 = false;
                kVar = ((org.telegram.ui.ActionBar.r2) eyVar2).actionBar;
                kVar.setEnabled(true);
                eyVar2.f39105z0.setEnabled(true);
                eyVar2.z3(eyVar2.f38998e0[0]);
                return;
            case 27:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.zx) this.f29208b).setScrollEnabled(true);
                return;
            case 28:
                o90 o90Var = (o90) this.f29208b;
                FrameLayout frameLayout = o90Var.f31242b;
                fi.f6 f6Var = (fi.f6) o90Var.f31243c;
                if (f6Var.getParent() != null) {
                    frameLayout.removeView(f6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.i7) o90Var.d);
                return;
            default:
                org.telegram.ui.x50 x50Var = ((org.telegram.ui.x40) this.f29208b).f45473o;
                org.telegram.ui.x50 x50Var2 = org.telegram.ui.x50.D3;
                x50Var.b1();
                org.telegram.ui.x50.m0(x50Var).invalidate();
                x50Var.Q.invalidate();
                if (x50Var.f45565s0) {
                    x50Var.f45565s0 = false;
                    x50Var.O0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29207a) {
            case 10:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f29208b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
