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
    public final int f28796a;
    public final Object f28797b;

    public h31(Object obj, int i10) {
        this.f28796a = i10;
        this.f28797b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        float f7 = 0.0f;
        switch (this.f28796a) {
            case 0:
                ((i31) this.f28797b).setVisibility(8);
                return;
            case 1:
                di.h3 h3Var = ((z31) this.f28797b).f35198f;
                h3Var.setScaleX(1.0f);
                h3Var.setScaleY(1.0f);
                h3Var.invalidate();
                return;
            case 2:
                d41 d41Var = (d41) this.f28797b;
                d41Var.L = 1.0f;
                d41Var.h.invalidate();
                return;
            case 3:
                ((p61) this.f28797b).L = null;
                return;
            case 4:
                UndoView undoView = (UndoView) this.f28797b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 5:
                y71 y71Var = (y71) this.f28797b;
                if (y71Var.f34966a.getTag() == null) {
                    y71Var.f34966a.setVisibility(4);
                    return;
                }
                return;
            case 6:
                super.onAnimationEnd(animator);
                z71 z71Var = (z71) this.f28797b;
                z71Var.f35237b = 0.0f;
                z71Var.setTranslationY(0.0f);
                z71Var.f35236a = null;
                return;
            case 7:
                t91 t91Var = (t91) this.f28797b;
                t91Var.J = false;
                t91Var.setEnabled(true);
                s91 s91Var = t91Var.f32945y;
                if (s91Var != null) {
                    ((jg.i) s91Var).e0(1.0f);
                }
                t91Var.invalidate();
                return;
            case 8:
                ((ma1) this.f28797b).f30493e0 = null;
                return;
            case 9:
                ((fc1) this.f28797b).K = null;
                return;
            case 10:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f28797b).view.setEnabled(true);
                return;
            case 11:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.f28797b).f33976s0;
                if (tVar.f34102x0.getParent() != null) {
                    tVar.f34071a.removeView(tVar.f34102x0);
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f28797b;
                if (v0Var.getParent() != null) {
                    ((ViewGroup) v0Var.getParent()).removeView(v0Var);
                    return;
                }
                return;
            case 13:
                ih1 ih1Var = (ih1) this.f28797b;
                if (!ih1Var.f33731a) {
                    ih1Var.V.v.S = true;
                    ih1Var.V.v.invalidate();
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.f28797b;
                r1Var.f34045i = false;
                r1Var.f34048l.setAlpha(35);
                r1Var.f34047k.setAlpha(102);
                r1Var.f34046j.setAlpha(35);
                r1Var.c();
                return;
            case 15:
                org.telegram.ui.Components.voip.v1 v1Var = ((org.telegram.ui.Components.voip.t1) this.f28797b).f34108c;
                v1Var.O = false;
                v1Var.requestLayout();
                return;
            case 16:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f28797b;
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
                t2Var.f34112b0 = null;
                return;
            case 17:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f28797b;
                if (w2Var.P) {
                    f7 = 1.0f;
                }
                w2Var.Q = f7;
                w2Var.a(w2Var.R, w2Var.S);
                return;
            case 18:
                ((org.telegram.ui.Components.voip.x2) this.f28797b).f34205c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.x2) this.f28797b).f34203a);
                if (((org.telegram.ui.Components.voip.x2) this.f28797b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.x2) this.f28797b).f34203a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.x2) this.f28797b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.x2) this.f28797b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.voip.d3 d3Var = (org.telegram.ui.Components.voip.d3) this.f28797b;
                d3Var.J = false;
                d3Var.T.e = false;
                if (d3Var.U && (animatorSet = d3Var.Q) != null) {
                    animatorSet.cancel();
                    d3Var.Q.start();
                }
                d3Var.c();
                return;
            case 20:
                ((org.telegram.ui.Components.voip.l3) this.f28797b).e.setVisibility(8);
                return;
            case 21:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f28797b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 22:
                org.telegram.ui.ut utVar = (org.telegram.ui.ut) this.f28797b;
                if (animator.equals(utVar.f44528n[0])) {
                    utVar.f44528n[0] = null;
                    return;
                }
                return;
            case 23:
                org.telegram.ui.xu xuVar = (org.telegram.ui.xu) this.f28797b;
                org.telegram.ui.zu zuVar = xuVar.f45857n;
                org.telegram.ui.yu[] yuVarArr = zuVar.f46363f;
                zuVar.h = null;
                if (zuVar.f46366s) {
                    yuVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.yu yuVar = yuVarArr[0];
                    yuVarArr[0] = yuVarArr[1];
                    yuVarArr[1] = yuVar;
                    yuVar.setVisibility(8);
                    if (zuVar.f46363f[0].f46111f == zuVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zuVar.f46367w = z10;
                    zuVar.e.i(1.0f, zuVar.f46363f[0].f46111f);
                }
                zuVar.f46364n = false;
                xuVar.f45855c = false;
                xuVar.f45854b = false;
                org.telegram.ui.zu.g0(zuVar).setEnabled(true);
                zuVar.e.setEnabled(true);
                return;
            case 24:
                org.telegram.ui.cw cwVar = (org.telegram.ui.cw) this.f28797b;
                org.telegram.ui.cy.r1(cwVar.M, cwVar.L, 0.0f);
                return;
            case 25:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) this.f28797b;
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
                org.telegram.ui.cy cyVar2 = ((org.telegram.ui.tx) this.f28797b).f43927t0;
                cyVar2.f38597g3 = null;
                if (!cyVar2.f38617k3) {
                    org.telegram.ui.ay[] ayVarArr = cyVar2.f38583e0;
                    org.telegram.ui.ay ayVar = ayVarArr[0];
                    org.telegram.ui.ay ayVar2 = ayVarArr[1];
                    ayVarArr[0] = ayVar2;
                    ayVarArr[1] = ayVar;
                    cyVar2.f38690z0.g(1.0f, ayVar2.h);
                    cyVar2.b5(false);
                    cyVar2.f38583e0[0].d.getClass();
                    cyVar2.f38583e0[1].d.getClass();
                }
                cyVar2.f38583e0[1].setVisibility(8);
                org.telegram.ui.cy.g1(cyVar2, true);
                cyVar2.f38602h3 = false;
                cyVar2.f38630n3 = false;
                kVar = ((org.telegram.ui.ActionBar.r2) cyVar2).actionBar;
                kVar.setEnabled(true);
                cyVar2.f38690z0.setEnabled(true);
                cyVar2.z3(cyVar2.f38583e0[0]);
                return;
            case 27:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.wx) this.f28797b).setScrollEnabled(true);
                return;
            case 28:
                n90 n90Var = (n90) this.f28797b;
                FrameLayout frameLayout = n90Var.f30927b;
                fi.f6 f6Var = (fi.f6) n90Var.f30928c;
                if (f6Var.getParent() != null) {
                    frameLayout.removeView(f6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.i7) n90Var.d);
                return;
            default:
                org.telegram.ui.v50 v50Var = ((org.telegram.ui.v40) this.f28797b).f44601o;
                org.telegram.ui.v50 v50Var2 = org.telegram.ui.v50.D3;
                v50Var.b1();
                org.telegram.ui.v50.m0(v50Var).invalidate();
                v50Var.Q.invalidate();
                if (v50Var.f44681s0) {
                    v50Var.f44681s0 = false;
                    v50Var.O0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28796a) {
            case 10:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f28797b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
