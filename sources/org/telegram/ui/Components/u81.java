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
import org.telegram.ui.fi1;
import org.webrtc.OrientationHelper;
public final class u81 extends AnimatorListenerAdapter {
    public final int f28434a;
    public final Object f28435b;

    public u81(Object obj, int i10) {
        this.f28434a = i10;
        this.f28435b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28434a) {
            case 25:
                ((org.telegram.ui.cf0) this.f28435b).f32335s = null;
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
        switch (this.f28434a) {
            case 0:
                ((b91) this.f28435b).f22626e0 = null;
                return;
            case 1:
                ((d91) this.f28435b).K = null;
                return;
            case 2:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f28435b).view.setEnabled(true);
                return;
            case 3:
                org.telegram.ui.Components.voip.u uVar = ((org.telegram.ui.Components.voip.p) this.f28435b).f29119s0;
                if (uVar.f29242x0.getParent() != null) {
                    uVar.f29211a.removeView(uVar.f29242x0);
                    return;
                }
                return;
            case 4:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f28435b;
                if (x0Var.getParent() != null) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                    return;
                }
                return;
            case 5:
                fi1 fi1Var = (fi1) this.f28435b;
                if (!fi1Var.f28876a) {
                    fi1Var.V.v.S = true;
                    fi1Var.V.v.invalidate();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.voip.q1 q1Var = (org.telegram.ui.Components.voip.q1) this.f28435b;
                q1Var.f29145i = false;
                q1Var.f29148l.setAlpha(35);
                q1Var.f29147k.setAlpha(102);
                q1Var.f29146j.setAlpha(35);
                q1Var.c();
                return;
            case 7:
                org.telegram.ui.Components.voip.u1 u1Var = ((org.telegram.ui.Components.voip.s1) this.f28435b).f29173c;
                u1Var.O = false;
                u1Var.requestLayout();
                return;
            case 8:
                org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) this.f28435b;
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
                s2Var.f29177b0 = null;
                return;
            case 9:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f28435b;
                if (v2Var.P) {
                    f7 = 1.0f;
                }
                v2Var.Q = f7;
                v2Var.a(v2Var.R, v2Var.S);
                return;
            case 10:
                ((org.telegram.ui.Components.voip.w2) this.f28435b).f29304c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.w2) this.f28435b).f29302a);
                if (((org.telegram.ui.Components.voip.w2) this.f28435b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.w2) this.f28435b).f29302a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.w2) this.f28435b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.w2) this.f28435b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.voip.c3 c3Var = (org.telegram.ui.Components.voip.c3) this.f28435b;
                c3Var.J = false;
                c3Var.T.e = false;
                if (c3Var.U && (animatorSet = c3Var.Q) != null) {
                    animatorSet.cancel();
                    c3Var.Q.start();
                }
                c3Var.c();
                return;
            case 12:
                ((org.telegram.ui.Components.voip.k3) this.f28435b).e.setVisibility(8);
                return;
            case 13:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f28435b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.du duVar = (org.telegram.ui.du) this.f28435b;
                if (animator.equals(duVar.f32719n[0])) {
                    duVar.f32719n[0] = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.iv ivVar = (org.telegram.ui.iv) this.f28435b;
                org.telegram.ui.kv kvVar = ivVar.f34251n;
                org.telegram.ui.jv[] jvVarArr = kvVar.f34806f;
                kvVar.h = null;
                if (kvVar.f34809s) {
                    jvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.jv jvVar = jvVarArr[0];
                    jvVarArr[0] = jvVarArr[1];
                    jvVarArr[1] = jvVar;
                    jvVar.setVisibility(8);
                    if (kvVar.f34806f[0].f34517f == kvVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    kvVar.f34810w = z10;
                    kvVar.e.j(1.0f, kvVar.f34806f[0].f34517f);
                }
                kvVar.f34807n = false;
                ivVar.f34249c = false;
                ivVar.f34248b = false;
                org.telegram.ui.kv.f0(kvVar).setEnabled(true);
                kvVar.e.setEnabled(true);
                return;
            case 16:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) this.f28435b;
                org.telegram.ui.ry.q1(uwVar.M, uwVar.L, 0.0f);
                return;
            case 17:
                org.telegram.ui.ry ryVar = (org.telegram.ui.ry) this.f28435b;
                boolean z11 = ryVar.G0;
                if (z11) {
                    f7 = 1.0f;
                }
                ryVar.H0 = f7;
                if (!z11) {
                    ryVar.E0.setVisibility(8);
                }
                View view = ryVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 18:
                org.telegram.ui.ry ryVar2 = ((org.telegram.ui.ky) this.f28435b).E0;
                ryVar2.f36987f3 = null;
                if (!ryVar2.j3) {
                    org.telegram.ui.qy[] qyVarArr = ryVar2.f36978e0;
                    org.telegram.ui.qy qyVar = qyVarArr[0];
                    org.telegram.ui.qy qyVar2 = qyVarArr[1];
                    qyVarArr[0] = qyVar2;
                    qyVarArr[1] = qyVar;
                    ryVar2.f37082z0.g(1.0f, qyVar2.h);
                    ryVar2.T4(false);
                    ryVar2.f36978e0[0].d.getClass();
                    ryVar2.f36978e0[1].d.getClass();
                }
                ryVar2.f36978e0[1].setVisibility(8);
                org.telegram.ui.ry.f1(ryVar2, true);
                ryVar2.f36992g3 = false;
                ryVar2.f37018m3 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) ryVar2).actionBar;
                kVar.setEnabled(true);
                ryVar2.f37082z0.setEnabled(true);
                ryVar2.r3(ryVar2.f36978e0[0]);
                return;
            case 19:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.ny) this.f28435b).setScrollEnabled(true);
                return;
            case 20:
                s80 s80Var = (s80) this.f28435b;
                FrameLayout frameLayout = s80Var.f27873b;
                ci.r6 r6Var = (ci.r6) s80Var.f27874c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.bi) s80Var.d);
                return;
            case 21:
                org.telegram.ui.f60 f60Var = ((org.telegram.ui.f50) this.f28435b).f33091o;
                org.telegram.ui.f60 f60Var2 = org.telegram.ui.f60.D3;
                f60Var.b1();
                org.telegram.ui.f60.m0(f60Var).invalidate();
                f60Var.Q.invalidate();
                if (f60Var.f33172s0) {
                    f60Var.f33172s0 = false;
                    f60Var.O0(true);
                    return;
                }
                return;
            case 22:
                super.onAnimationEnd(animator);
                org.telegram.ui.t50 t50Var = (org.telegram.ui.t50) this.f28435b;
                t50Var.G = null;
                org.telegram.ui.f60 f60Var3 = t50Var.L;
                f60Var3.Q.invalidate();
                f60Var3.a2.invalidate();
                org.telegram.ui.f60.y0(f60Var3).invalidate();
                org.telegram.ui.f60.J0(f60Var3);
                t50Var.H.clear();
                t50Var.I.clear();
                return;
            case 23:
                org.telegram.ui.h80 h80Var = (org.telegram.ui.h80) this.f28435b;
                h80Var.d = null;
                h80Var.f33772a = null;
                h80Var.f33773b = false;
                return;
            case 24:
                org.telegram.ui.dd0 dd0Var = (org.telegram.ui.dd0) this.f28435b;
                dd0Var.H = false;
                dd0Var.o0();
                return;
            case 25:
                org.telegram.ui.cf0 cf0Var = (org.telegram.ui.cf0) this.f28435b;
                if (cf0Var.f32335s != null && cf0Var.f32333n != null) {
                    cf0Var.f32334r.setVisibility(4);
                    cf0Var.f32335s = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.ej0) this.f28435b).T.setVisibility(8);
                return;
            case 27:
                org.telegram.ui.yj0 yj0Var = (org.telegram.ui.yj0) this.f28435b;
                yj0Var.f39849f = 1.0f;
                yj0Var.invalidate();
                return;
            case 28:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f28435b;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
            default:
                org.telegram.ui.up0 up0Var = (org.telegram.ui.up0) this.f28435b;
                org.telegram.ui.kc kcVar = up0Var.X;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) up0Var.X.getParent()).removeView(up0Var.X);
                    }
                    up0Var.X = null;
                }
                up0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28434a) {
            case 2:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f28435b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
