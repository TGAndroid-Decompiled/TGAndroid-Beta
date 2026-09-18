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
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.li1;
import org.webrtc.OrientationHelper;
public final class r81 extends AnimatorListenerAdapter {
    public final int f27850a;
    public final Object f27851b;

    public r81(Object obj, int i10) {
        this.f27850a = i10;
        this.f27851b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27850a) {
            case 26:
                ((org.telegram.ui.if0) this.f27851b).f34517s = null;
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
        switch (this.f27850a) {
            case 0:
                w81 w81Var = (w81) this.f27851b;
                w81Var.J = false;
                w81Var.setEnabled(true);
                v81 v81Var = w81Var.f29986y;
                if (v81Var != null) {
                    ((l.d) v81Var).L(1.0f);
                }
                w81Var.invalidate();
                return;
            case 1:
                ((q91) this.f27851b).f27516e0 = null;
                return;
            case 2:
                ((s91) this.f27851b).K = null;
                return;
            case 3:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f27851b).view.setEnabled(true);
                return;
            case 4:
                org.telegram.ui.Components.voip.u uVar = ((org.telegram.ui.Components.voip.p) this.f27851b).f29444s0;
                if (uVar.f29567x0.getParent() != null) {
                    uVar.f29536a.removeView(uVar.f29567x0);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f27851b;
                if (x0Var.getParent() != null) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                    return;
                }
                return;
            case 6:
                li1 li1Var = (li1) this.f27851b;
                if (!li1Var.f29201a) {
                    li1Var.V.v.S = true;
                    li1Var.V.v.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.q1 q1Var = (org.telegram.ui.Components.voip.q1) this.f27851b;
                q1Var.f29470i = false;
                q1Var.f29473l.setAlpha(35);
                q1Var.f29472k.setAlpha(102);
                q1Var.f29471j.setAlpha(35);
                q1Var.c();
                return;
            case 8:
                org.telegram.ui.Components.voip.u1 u1Var = ((org.telegram.ui.Components.voip.s1) this.f27851b).f29498c;
                u1Var.O = false;
                u1Var.requestLayout();
                return;
            case 9:
                org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) this.f27851b;
                s2Var.N = 0.0f;
                s2Var.O = 0.0f;
                org.telegram.ui.Components.voip.r2 r2Var = s2Var.d;
                r2Var.setScaleX(s2Var.T);
                r2Var.setScaleY(s2Var.T);
                TextureView textureView = s2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(s2Var.U);
                    textureView.setScaleY(s2Var.U);
                }
                s2Var.setTranslationY(0.0f);
                s2Var.setTranslationX(0.0f);
                s2Var.W = s2Var.V;
                s2Var.f29502b0 = null;
                return;
            case 10:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f27851b;
                if (v2Var.P) {
                    f7 = 1.0f;
                }
                v2Var.Q = f7;
                v2Var.a(v2Var.R, v2Var.S);
                return;
            case 11:
                ((org.telegram.ui.Components.voip.w2) this.f27851b).f29629c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.w2) this.f27851b).f29627a);
                if (((org.telegram.ui.Components.voip.w2) this.f27851b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.w2) this.f27851b).f29627a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.w2) this.f27851b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.w2) this.f27851b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.c3 c3Var = (org.telegram.ui.Components.voip.c3) this.f27851b;
                c3Var.J = false;
                c3Var.T.e = false;
                if (c3Var.U && (animatorSet = c3Var.Q) != null) {
                    animatorSet.cancel();
                    c3Var.Q.start();
                }
                c3Var.c();
                return;
            case 13:
                ((org.telegram.ui.Components.voip.k3) this.f27851b).e.setVisibility(8);
                return;
            case 14:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f27851b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.iu iuVar = (org.telegram.ui.iu) this.f27851b;
                if (animator.equals(iuVar.f34625n[0])) {
                    iuVar.f34625n[0] = null;
                    return;
                }
                return;
            case 16:
                org.telegram.ui.mv mvVar = (org.telegram.ui.mv) this.f27851b;
                org.telegram.ui.ov ovVar = mvVar.f35748n;
                org.telegram.ui.nv[] nvVarArr = ovVar.f36258f;
                ovVar.h = null;
                if (ovVar.f36261s) {
                    nvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.nv nvVar = nvVarArr[0];
                    nvVarArr[0] = nvVarArr[1];
                    nvVarArr[1] = nvVar;
                    nvVar.setVisibility(8);
                    if (ovVar.f36258f[0].f36060f == ovVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ovVar.f36262w = z10;
                    ovVar.e.j(1.0f, ovVar.f36258f[0].f36060f);
                }
                ovVar.f36259n = false;
                mvVar.f35746c = false;
                mvVar.f35745b = false;
                org.telegram.ui.ov.f0(ovVar).setEnabled(true);
                ovVar.e.setEnabled(true);
                return;
            case 17:
                org.telegram.ui.xw xwVar = (org.telegram.ui.xw) this.f27851b;
                org.telegram.ui.uy.q1(xwVar.M, xwVar.L, 0.0f);
                return;
            case 18:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.f27851b;
                boolean z11 = uyVar.G0;
                if (z11) {
                    f7 = 1.0f;
                }
                uyVar.H0 = f7;
                if (!z11) {
                    uyVar.E0.setVisibility(8);
                }
                View view = uyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.uy uyVar2 = ((org.telegram.ui.ny) this.f27851b).E0;
                uyVar2.f38158f3 = null;
                if (!uyVar2.j3) {
                    org.telegram.ui.ty[] tyVarArr = uyVar2.f38149e0;
                    org.telegram.ui.ty tyVar = tyVarArr[0];
                    org.telegram.ui.ty tyVar2 = tyVarArr[1];
                    tyVarArr[0] = tyVar2;
                    tyVarArr[1] = tyVar;
                    uyVar2.f38253z0.g(1.0f, tyVar2.h);
                    uyVar2.T4(false);
                    uyVar2.f38149e0[0].d.getClass();
                    uyVar2.f38149e0[1].d.getClass();
                }
                uyVar2.f38149e0[1].setVisibility(8);
                org.telegram.ui.uy.f1(uyVar2, true);
                uyVar2.f38163g3 = false;
                uyVar2.f38189m3 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) uyVar2).actionBar;
                kVar.setEnabled(true);
                uyVar2.f38253z0.setEnabled(true);
                uyVar2.r3(uyVar2.f38149e0[0]);
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.qy) this.f27851b).setScrollEnabled(true);
                return;
            case 21:
                a90 a90Var = (a90) this.f27851b;
                FrameLayout frameLayout = a90Var.f22569b;
                ci.s6 s6Var = (ci.s6) a90Var.f22570c;
                if (s6Var.getParent() != null) {
                    frameLayout.removeView(s6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.f7) a90Var.d);
                return;
            case 22:
                org.telegram.ui.i60 i60Var = ((org.telegram.ui.i50) this.f27851b).f34312o;
                org.telegram.ui.i60 i60Var2 = org.telegram.ui.i60.D3;
                i60Var.b1();
                org.telegram.ui.i60.m0(i60Var).invalidate();
                i60Var.Q.invalidate();
                if (i60Var.f34402s0) {
                    i60Var.f34402s0 = false;
                    i60Var.O0(true);
                    return;
                }
                return;
            case 23:
                super.onAnimationEnd(animator);
                org.telegram.ui.w50 w50Var = (org.telegram.ui.w50) this.f27851b;
                w50Var.G = null;
                org.telegram.ui.i60 i60Var3 = w50Var.L;
                i60Var3.Q.invalidate();
                i60Var3.a2.invalidate();
                org.telegram.ui.i60.y0(i60Var3).invalidate();
                org.telegram.ui.i60.J0(i60Var3);
                w50Var.H.clear();
                w50Var.I.clear();
                return;
            case 24:
                org.telegram.ui.k80 k80Var = (org.telegram.ui.k80) this.f27851b;
                k80Var.d = null;
                k80Var.f35014a = null;
                k80Var.f35015b = false;
                return;
            case 25:
                org.telegram.ui.jd0 jd0Var = (org.telegram.ui.jd0) this.f27851b;
                jd0Var.H = false;
                jd0Var.o0();
                return;
            case 26:
                org.telegram.ui.if0 if0Var = (org.telegram.ui.if0) this.f27851b;
                if (if0Var.f34517s != null && if0Var.f34515n != null) {
                    if0Var.f34516r.setVisibility(4);
                    if0Var.f34517s = null;
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.kj0) this.f27851b).T.setVisibility(8);
                return;
            case 28:
                org.telegram.ui.gk0 gk0Var = (org.telegram.ui.gk0) this.f27851b;
                gk0Var.f33892f = 1.0f;
                gk0Var.invalidate();
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f27851b;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27850a) {
            case 3:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f27851b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
