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
public final class t81 extends AnimatorListenerAdapter {
    public final int f28423a;
    public final Object f28424b;

    public t81(Object obj, int i10) {
        this.f28423a = i10;
        this.f28424b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28423a) {
            case 26:
                ((org.telegram.ui.jf0) this.f28424b).f34943s = null;
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
        switch (this.f28423a) {
            case 0:
                y81 y81Var = (y81) this.f28424b;
                y81Var.J = false;
                y81Var.setEnabled(true);
                x81 x81Var = y81Var.f30609y;
                if (x81Var != null) {
                    ((ki.e0) x81Var).i(1.0f);
                }
                y81Var.invalidate();
                return;
            case 1:
                ((r91) this.f28424b).f27897e0 = null;
                return;
            case 2:
                ((t91) this.f28424b).K = null;
                return;
            case 3:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f28424b).view.setEnabled(true);
                return;
            case 4:
                org.telegram.ui.Components.voip.u uVar = ((org.telegram.ui.Components.voip.p) this.f28424b).f29513s0;
                if (uVar.f29636x0.getParent() != null) {
                    uVar.f29605a.removeView(uVar.f29636x0);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f28424b;
                if (x0Var.getParent() != null) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                    return;
                }
                return;
            case 6:
                mi1 mi1Var = (mi1) this.f28424b;
                if (!mi1Var.f29270a) {
                    mi1Var.V.v.S = true;
                    mi1Var.V.v.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.q1 q1Var = (org.telegram.ui.Components.voip.q1) this.f28424b;
                q1Var.f29539i = false;
                q1Var.f29542l.setAlpha(35);
                q1Var.f29541k.setAlpha(102);
                q1Var.f29540j.setAlpha(35);
                q1Var.c();
                return;
            case 8:
                org.telegram.ui.Components.voip.u1 u1Var = ((org.telegram.ui.Components.voip.s1) this.f28424b).f29567c;
                u1Var.O = false;
                u1Var.requestLayout();
                return;
            case 9:
                org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) this.f28424b;
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
                s2Var.f29571b0 = null;
                return;
            case 10:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f28424b;
                if (v2Var.P) {
                    f7 = 1.0f;
                }
                v2Var.Q = f7;
                v2Var.a(v2Var.R, v2Var.S);
                return;
            case 11:
                ((org.telegram.ui.Components.voip.w2) this.f28424b).f29698c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.w2) this.f28424b).f29696a);
                if (((org.telegram.ui.Components.voip.w2) this.f28424b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.w2) this.f28424b).f29696a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.w2) this.f28424b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.w2) this.f28424b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.c3 c3Var = (org.telegram.ui.Components.voip.c3) this.f28424b;
                c3Var.J = false;
                c3Var.T.e = false;
                if (c3Var.U && (animatorSet = c3Var.Q) != null) {
                    animatorSet.cancel();
                    c3Var.Q.start();
                }
                c3Var.c();
                return;
            case 13:
                ((org.telegram.ui.Components.voip.k3) this.f28424b).e.setVisibility(8);
                return;
            case 14:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f28424b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.iu iuVar = (org.telegram.ui.iu) this.f28424b;
                if (animator.equals(iuVar.f34709n[0])) {
                    iuVar.f34709n[0] = null;
                    return;
                }
                return;
            case 16:
                org.telegram.ui.mv mvVar = (org.telegram.ui.mv) this.f28424b;
                org.telegram.ui.ov ovVar = mvVar.f35844n;
                org.telegram.ui.nv[] nvVarArr = ovVar.f36413f;
                ovVar.h = null;
                if (ovVar.f36416s) {
                    nvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.nv nvVar = nvVarArr[0];
                    nvVarArr[0] = nvVarArr[1];
                    nvVarArr[1] = nvVar;
                    nvVar.setVisibility(8);
                    if (ovVar.f36413f[0].f36155f == ovVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ovVar.f36417w = z10;
                    ovVar.e.j(1.0f, ovVar.f36413f[0].f36155f);
                }
                ovVar.f36414n = false;
                mvVar.f35842c = false;
                mvVar.f35841b = false;
                org.telegram.ui.ov.f0(ovVar).setEnabled(true);
                ovVar.e.setEnabled(true);
                return;
            case 17:
                org.telegram.ui.xw xwVar = (org.telegram.ui.xw) this.f28424b;
                org.telegram.ui.uy.q1(xwVar.M, xwVar.L, 0.0f);
                return;
            case 18:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.f28424b;
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
                org.telegram.ui.uy uyVar2 = ((org.telegram.ui.ny) this.f28424b).E0;
                uyVar2.f38286f3 = null;
                if (!uyVar2.j3) {
                    org.telegram.ui.ty[] tyVarArr = uyVar2.f38277e0;
                    org.telegram.ui.ty tyVar = tyVarArr[0];
                    org.telegram.ui.ty tyVar2 = tyVarArr[1];
                    tyVarArr[0] = tyVar2;
                    tyVarArr[1] = tyVar;
                    uyVar2.f38381z0.g(1.0f, tyVar2.h);
                    uyVar2.T4(false);
                    uyVar2.f38277e0[0].d.getClass();
                    uyVar2.f38277e0[1].d.getClass();
                }
                uyVar2.f38277e0[1].setVisibility(8);
                org.telegram.ui.uy.f1(uyVar2, true);
                uyVar2.f38291g3 = false;
                uyVar2.f38317m3 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) uyVar2).actionBar;
                kVar.setEnabled(true);
                uyVar2.f38381z0.setEnabled(true);
                uyVar2.r3(uyVar2.f38277e0[0]);
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.qy) this.f28424b).setScrollEnabled(true);
                return;
            case 21:
                c90 c90Var = (c90) this.f28424b;
                FrameLayout frameLayout = c90Var.f23315b;
                ci.s6 s6Var = (ci.s6) c90Var.f23316c;
                if (s6Var.getParent() != null) {
                    frameLayout.removeView(s6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.f7) c90Var.d);
                return;
            case 22:
                org.telegram.ui.i60 i60Var = ((org.telegram.ui.i50) this.f28424b).f34376o;
                org.telegram.ui.i60 i60Var2 = org.telegram.ui.i60.D3;
                i60Var.b1();
                org.telegram.ui.i60.m0(i60Var).invalidate();
                i60Var.Q.invalidate();
                if (i60Var.f34453s0) {
                    i60Var.f34453s0 = false;
                    i60Var.O0(true);
                    return;
                }
                return;
            case 23:
                super.onAnimationEnd(animator);
                org.telegram.ui.w50 w50Var = (org.telegram.ui.w50) this.f28424b;
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
                org.telegram.ui.k80 k80Var = (org.telegram.ui.k80) this.f28424b;
                k80Var.d = null;
                k80Var.f35080a = null;
                k80Var.f35081b = false;
                return;
            case 25:
                org.telegram.ui.kd0 kd0Var = (org.telegram.ui.kd0) this.f28424b;
                kd0Var.H = false;
                kd0Var.o0();
                return;
            case 26:
                org.telegram.ui.jf0 jf0Var = (org.telegram.ui.jf0) this.f28424b;
                if (jf0Var.f34943s != null && jf0Var.f34941n != null) {
                    jf0Var.f34942r.setVisibility(4);
                    jf0Var.f34943s = null;
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.mj0) this.f28424b).T.setVisibility(8);
                return;
            case 28:
                org.telegram.ui.hk0 hk0Var = (org.telegram.ui.hk0) this.f28424b;
                hk0Var.f34253f = 1.0f;
                hk0Var.invalidate();
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f28424b;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28423a) {
            case 3:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f28424b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
