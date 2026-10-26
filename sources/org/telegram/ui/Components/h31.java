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
import org.telegram.ui.ih1;
import org.webrtc.OrientationHelper;
public final class h31 extends AnimatorListenerAdapter {
    public final int f28798a;
    public final Object f28799b;

    public h31(Object obj, int i10) {
        this.f28798a = i10;
        this.f28799b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        float f7 = 0.0f;
        switch (this.f28798a) {
            case 0:
                ((i31) this.f28799b).setVisibility(8);
                return;
            case 1:
                di.h3 h3Var = ((z31) this.f28799b).f35201f;
                h3Var.setScaleX(1.0f);
                h3Var.setScaleY(1.0f);
                h3Var.invalidate();
                return;
            case 2:
                d41 d41Var = (d41) this.f28799b;
                d41Var.L = 1.0f;
                d41Var.h.invalidate();
                return;
            case 3:
                ((p61) this.f28799b).L = null;
                return;
            case 4:
                UndoView undoView = (UndoView) this.f28799b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 5:
                y71 y71Var = (y71) this.f28799b;
                if (y71Var.f34969a.getTag() == null) {
                    y71Var.f34969a.setVisibility(4);
                    return;
                }
                return;
            case 6:
                super.onAnimationEnd(animator);
                z71 z71Var = (z71) this.f28799b;
                z71Var.f35240b = 0.0f;
                z71Var.setTranslationY(0.0f);
                z71Var.f35239a = null;
                return;
            case 7:
                t91 t91Var = (t91) this.f28799b;
                t91Var.J = false;
                t91Var.setEnabled(true);
                s91 s91Var = t91Var.f32948y;
                if (s91Var != null) {
                    ((jg.i) s91Var).e0(1.0f);
                }
                t91Var.invalidate();
                return;
            case 8:
                ((ma1) this.f28799b).f30495e0 = null;
                return;
            case 9:
                ((fc1) this.f28799b).K = null;
                return;
            case 10:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f28799b).view.setEnabled(true);
                return;
            case 11:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.f28799b).f33979s0;
                if (tVar.f34105x0.getParent() != null) {
                    tVar.f34074a.removeView(tVar.f34105x0);
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f28799b;
                if (v0Var.getParent() != null) {
                    ((ViewGroup) v0Var.getParent()).removeView(v0Var);
                    return;
                }
                return;
            case 13:
                ih1 ih1Var = (ih1) this.f28799b;
                if (!ih1Var.f33734a) {
                    ih1Var.V.v.S = true;
                    ih1Var.V.v.invalidate();
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.f28799b;
                r1Var.f34048i = false;
                r1Var.f34051l.setAlpha(35);
                r1Var.f34050k.setAlpha(102);
                r1Var.f34049j.setAlpha(35);
                r1Var.c();
                return;
            case 15:
                org.telegram.ui.Components.voip.v1 v1Var = ((org.telegram.ui.Components.voip.t1) this.f28799b).f34111c;
                v1Var.O = false;
                v1Var.requestLayout();
                return;
            case 16:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f28799b;
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
                t2Var.f34115b0 = null;
                return;
            case 17:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f28799b;
                if (w2Var.P) {
                    f7 = 1.0f;
                }
                w2Var.Q = f7;
                w2Var.a(w2Var.R, w2Var.S);
                return;
            case 18:
                ((org.telegram.ui.Components.voip.x2) this.f28799b).f34208c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.x2) this.f28799b).f34206a);
                if (((org.telegram.ui.Components.voip.x2) this.f28799b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.x2) this.f28799b).f34206a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.x2) this.f28799b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.x2) this.f28799b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.voip.d3 d3Var = (org.telegram.ui.Components.voip.d3) this.f28799b;
                d3Var.J = false;
                d3Var.T.e = false;
                if (d3Var.U && (animatorSet = d3Var.Q) != null) {
                    animatorSet.cancel();
                    d3Var.Q.start();
                }
                d3Var.c();
                return;
            case 20:
                ((org.telegram.ui.Components.voip.l3) this.f28799b).e.setVisibility(8);
                return;
            case 21:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f28799b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 22:
                org.telegram.ui.ut utVar = (org.telegram.ui.ut) this.f28799b;
                if (animator.equals(utVar.f44531n[0])) {
                    utVar.f44531n[0] = null;
                    return;
                }
                return;
            case 23:
                org.telegram.ui.xu xuVar = (org.telegram.ui.xu) this.f28799b;
                org.telegram.ui.zu zuVar = xuVar.f45860n;
                org.telegram.ui.yu[] yuVarArr = zuVar.f46366f;
                zuVar.h = null;
                if (zuVar.f46369s) {
                    yuVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.yu yuVar = yuVarArr[0];
                    yuVarArr[0] = yuVarArr[1];
                    yuVarArr[1] = yuVar;
                    yuVar.setVisibility(8);
                    if (zuVar.f46366f[0].f46114f == zuVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zuVar.f46370w = z10;
                    zuVar.e.i(1.0f, zuVar.f46366f[0].f46114f);
                }
                zuVar.f46367n = false;
                xuVar.f45858c = false;
                xuVar.f45857b = false;
                org.telegram.ui.zu.g0(zuVar).setEnabled(true);
                zuVar.e.setEnabled(true);
                return;
            case 24:
                org.telegram.ui.cw cwVar = (org.telegram.ui.cw) this.f28799b;
                org.telegram.ui.cy.r1(cwVar.M, cwVar.L, 0.0f);
                return;
            case 25:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) this.f28799b;
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
            case 26:
                org.telegram.ui.cy cyVar2 = ((org.telegram.ui.tx) this.f28799b).f43930t0;
                cyVar2.f38600g3 = null;
                if (!cyVar2.f38620k3) {
                    org.telegram.ui.ay[] ayVarArr = cyVar2.f38586e0;
                    org.telegram.ui.ay ayVar = ayVarArr[0];
                    org.telegram.ui.ay ayVar2 = ayVarArr[1];
                    ayVarArr[0] = ayVar2;
                    ayVarArr[1] = ayVar;
                    cyVar2.f38693z0.g(1.0f, ayVar2.h);
                    cyVar2.b5(false);
                    cyVar2.f38586e0[0].d.getClass();
                    cyVar2.f38586e0[1].d.getClass();
                }
                cyVar2.f38586e0[1].setVisibility(8);
                org.telegram.ui.cy.g1(cyVar2, true);
                cyVar2.f38605h3 = false;
                cyVar2.f38633n3 = false;
                kVar = ((org.telegram.ui.ActionBar.r2) cyVar2).actionBar;
                kVar.setEnabled(true);
                cyVar2.f38693z0.setEnabled(true);
                cyVar2.z3(cyVar2.f38586e0[0]);
                return;
            case 27:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.wx) this.f28799b).setScrollEnabled(true);
                return;
            case 28:
                n90 n90Var = (n90) this.f28799b;
                FrameLayout frameLayout = n90Var.f30929b;
                fi.f6 f6Var = (fi.f6) n90Var.f30930c;
                if (f6Var.getParent() != null) {
                    frameLayout.removeView(f6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.i7) n90Var.d);
                return;
            default:
                org.telegram.ui.v50 v50Var = ((org.telegram.ui.v40) this.f28799b).f44604o;
                org.telegram.ui.v50 v50Var2 = org.telegram.ui.v50.D3;
                v50Var.b1();
                org.telegram.ui.v50.m0(v50Var).invalidate();
                v50Var.Q.invalidate();
                if (v50Var.f44684s0) {
                    v50Var.f44684s0 = false;
                    v50Var.O0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28798a) {
            case 10:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f28799b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
