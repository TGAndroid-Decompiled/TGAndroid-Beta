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
import org.telegram.ui.mi1;
import org.webrtc.OrientationHelper;
public final class v81 extends AnimatorListenerAdapter {
    public final int f28664a;
    public final Object f28665b;

    public v81(Object obj, int i10) {
        this.f28664a = i10;
        this.f28665b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28664a) {
            case 25:
                ((org.telegram.ui.hf0) this.f28665b).f34266s = null;
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
        switch (this.f28664a) {
            case 0:
                ((c91) this.f28665b).f23024e0 = null;
                return;
            case 1:
                ((e91) this.f28665b).K = null;
                return;
            case 2:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f28665b).view.setEnabled(true);
                return;
            case 3:
                org.telegram.ui.Components.voip.u uVar = ((org.telegram.ui.Components.voip.p) this.f28665b).f29148s0;
                if (uVar.f29271x0.getParent() != null) {
                    uVar.f29240a.removeView(uVar.f29271x0);
                    return;
                }
                return;
            case 4:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f28665b;
                if (x0Var.getParent() != null) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                    return;
                }
                return;
            case 5:
                mi1 mi1Var = (mi1) this.f28665b;
                if (!mi1Var.f28905a) {
                    mi1Var.V.v.S = true;
                    mi1Var.V.v.invalidate();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.voip.q1 q1Var = (org.telegram.ui.Components.voip.q1) this.f28665b;
                q1Var.f29174i = false;
                q1Var.f29177l.setAlpha(35);
                q1Var.f29176k.setAlpha(102);
                q1Var.f29175j.setAlpha(35);
                q1Var.c();
                return;
            case 7:
                org.telegram.ui.Components.voip.u1 u1Var = ((org.telegram.ui.Components.voip.s1) this.f28665b).f29202c;
                u1Var.O = false;
                u1Var.requestLayout();
                return;
            case 8:
                org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) this.f28665b;
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
                s2Var.f29206b0 = null;
                return;
            case 9:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f28665b;
                if (v2Var.P) {
                    f7 = 1.0f;
                }
                v2Var.Q = f7;
                v2Var.a(v2Var.R, v2Var.S);
                return;
            case 10:
                ((org.telegram.ui.Components.voip.w2) this.f28665b).f29333c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.w2) this.f28665b).f29331a);
                if (((org.telegram.ui.Components.voip.w2) this.f28665b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.w2) this.f28665b).f29331a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.w2) this.f28665b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.w2) this.f28665b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.voip.c3 c3Var = (org.telegram.ui.Components.voip.c3) this.f28665b;
                c3Var.J = false;
                c3Var.T.e = false;
                if (c3Var.U && (animatorSet = c3Var.Q) != null) {
                    animatorSet.cancel();
                    c3Var.Q.start();
                }
                c3Var.c();
                return;
            case 12:
                ((org.telegram.ui.Components.voip.k3) this.f28665b).e.setVisibility(8);
                return;
            case 13:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f28665b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.gu guVar = (org.telegram.ui.gu) this.f28665b;
                if (animator.equals(guVar.f34021n[0])) {
                    guVar.f34021n[0] = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.lv lvVar = (org.telegram.ui.lv) this.f28665b;
                org.telegram.ui.nv nvVar = lvVar.f35567n;
                org.telegram.ui.mv[] mvVarArr = nvVar.f36050f;
                nvVar.h = null;
                if (nvVar.f36053s) {
                    mvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.mv mvVar = mvVarArr[0];
                    mvVarArr[0] = mvVarArr[1];
                    mvVarArr[1] = mvVar;
                    mvVar.setVisibility(8);
                    if (nvVar.f36050f[0].f35813f == nvVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    nvVar.f36054w = z10;
                    nvVar.e.j(1.0f, nvVar.f36050f[0].f35813f);
                }
                nvVar.f36051n = false;
                lvVar.f35565c = false;
                lvVar.f35564b = false;
                org.telegram.ui.nv.f0(nvVar).setEnabled(true);
                nvVar.e.setEnabled(true);
                return;
            case 16:
                org.telegram.ui.xw xwVar = (org.telegram.ui.xw) this.f28665b;
                org.telegram.ui.uy.q1(xwVar.M, xwVar.L, 0.0f);
                return;
            case 17:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.f28665b;
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
            case 18:
                org.telegram.ui.uy uyVar2 = ((org.telegram.ui.ny) this.f28665b).E0;
                uyVar2.f38216f3 = null;
                if (!uyVar2.j3) {
                    org.telegram.ui.ty[] tyVarArr = uyVar2.f38207e0;
                    org.telegram.ui.ty tyVar = tyVarArr[0];
                    org.telegram.ui.ty tyVar2 = tyVarArr[1];
                    tyVarArr[0] = tyVar2;
                    tyVarArr[1] = tyVar;
                    uyVar2.f38312z0.g(1.0f, tyVar2.h);
                    uyVar2.T4(false);
                    uyVar2.f38207e0[0].d.getClass();
                    uyVar2.f38207e0[1].d.getClass();
                }
                uyVar2.f38207e0[1].setVisibility(8);
                org.telegram.ui.uy.f1(uyVar2, true);
                uyVar2.f38221g3 = false;
                uyVar2.f38247m3 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) uyVar2).actionBar;
                kVar.setEnabled(true);
                uyVar2.f38312z0.setEnabled(true);
                uyVar2.r3(uyVar2.f38207e0[0]);
                return;
            case 19:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.qy) this.f28665b).setScrollEnabled(true);
                return;
            case 20:
                r80 r80Var = (r80) this.f28665b;
                FrameLayout frameLayout = r80Var.f27605b;
                ci.s6 s6Var = (ci.s6) r80Var.f27606c;
                if (s6Var.getParent() != null) {
                    frameLayout.removeView(s6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ei) r80Var.d);
                return;
            case 21:
                org.telegram.ui.i60 i60Var = ((org.telegram.ui.i50) this.f28665b).f34406o;
                org.telegram.ui.i60 i60Var2 = org.telegram.ui.i60.D3;
                i60Var.b1();
                org.telegram.ui.i60.m0(i60Var).invalidate();
                i60Var.Q.invalidate();
                if (i60Var.f34483s0) {
                    i60Var.f34483s0 = false;
                    i60Var.O0(true);
                    return;
                }
                return;
            case 22:
                super.onAnimationEnd(animator);
                org.telegram.ui.w50 w50Var = (org.telegram.ui.w50) this.f28665b;
                w50Var.G = null;
                org.telegram.ui.i60 i60Var3 = w50Var.L;
                i60Var3.Q.invalidate();
                i60Var3.a2.invalidate();
                org.telegram.ui.i60.y0(i60Var3).invalidate();
                org.telegram.ui.i60.J0(i60Var3);
                w50Var.H.clear();
                w50Var.I.clear();
                return;
            case 23:
                org.telegram.ui.k80 k80Var = (org.telegram.ui.k80) this.f28665b;
                k80Var.d = null;
                k80Var.f35053a = null;
                k80Var.f35054b = false;
                return;
            case 24:
                org.telegram.ui.id0 id0Var = (org.telegram.ui.id0) this.f28665b;
                id0Var.H = false;
                id0Var.o0();
                return;
            case 25:
                org.telegram.ui.hf0 hf0Var = (org.telegram.ui.hf0) this.f28665b;
                if (hf0Var.f34266s != null && hf0Var.f34264n != null) {
                    hf0Var.f34265r.setVisibility(4);
                    hf0Var.f34266s = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.jj0) this.f28665b).T.setVisibility(8);
                return;
            case 27:
                org.telegram.ui.ek0 ek0Var = (org.telegram.ui.ek0) this.f28665b;
                ek0Var.f33366f = 1.0f;
                ek0Var.invalidate();
                return;
            case 28:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f28665b;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
            default:
                org.telegram.ui.aq0 aq0Var = (org.telegram.ui.aq0) this.f28665b;
                org.telegram.ui.lc lcVar = aq0Var.X;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) aq0Var.X.getParent()).removeView(aq0Var.X);
                    }
                    aq0Var.X = null;
                }
                aq0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28664a) {
            case 2:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f28665b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
