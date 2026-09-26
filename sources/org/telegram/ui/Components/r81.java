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
public final class r81 extends AnimatorListenerAdapter {
    public final int f27863a;
    public final Object f27864b;

    public r81(Object obj, int i10) {
        this.f27863a = i10;
        this.f27864b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27863a) {
            case 26:
                ((org.telegram.ui.bf0) this.f27864b).f32410s = null;
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
        switch (this.f27863a) {
            case 0:
                w81 w81Var = (w81) this.f27864b;
                w81Var.J = false;
                w81Var.setEnabled(true);
                v81 v81Var = w81Var.f29957y;
                if (v81Var != null) {
                    ((l.d) v81Var).L(1.0f);
                }
                w81Var.invalidate();
                return;
            case 1:
                ((p91) this.f27864b).f27289e0 = null;
                return;
            case 2:
                ((r91) this.f27864b).K = null;
                return;
            case 3:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f27864b).view.setEnabled(true);
                return;
            case 4:
                org.telegram.ui.Components.voip.u uVar = ((org.telegram.ui.Components.voip.p) this.f27864b).f29454s0;
                if (uVar.f29590x0.getParent() != null) {
                    uVar.f29559a.removeView(uVar.f29590x0);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f27864b;
                if (x0Var.getParent() != null) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                    return;
                }
                return;
            case 6:
                fi1 fi1Var = (fi1) this.f27864b;
                if (!fi1Var.f29218a) {
                    fi1Var.V.v.S = true;
                    fi1Var.V.v.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.f27864b;
                r1Var.f29503i = false;
                r1Var.f29506l.setAlpha(35);
                r1Var.f29505k.setAlpha(102);
                r1Var.f29504j.setAlpha(35);
                r1Var.c();
                return;
            case 8:
                org.telegram.ui.Components.voip.v1 v1Var = ((org.telegram.ui.Components.voip.t1) this.f27864b).f29542c;
                v1Var.O = false;
                v1Var.requestLayout();
                return;
            case 9:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f27864b;
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
                t2Var.f29546b0 = null;
                return;
            case 10:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f27864b;
                if (w2Var.P) {
                    f7 = 1.0f;
                }
                w2Var.Q = f7;
                w2Var.a(w2Var.R, w2Var.S);
                return;
            case 11:
                ((org.telegram.ui.Components.voip.x2) this.f27864b).f29672c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.x2) this.f27864b).f29670a);
                if (((org.telegram.ui.Components.voip.x2) this.f27864b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.x2) this.f27864b).f29670a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.x2) this.f27864b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.x2) this.f27864b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.d3 d3Var = (org.telegram.ui.Components.voip.d3) this.f27864b;
                d3Var.J = false;
                d3Var.T.e = false;
                if (d3Var.U && (animatorSet = d3Var.Q) != null) {
                    animatorSet.cancel();
                    d3Var.Q.start();
                }
                d3Var.c();
                return;
            case 13:
                ((org.telegram.ui.Components.voip.l3) this.f27864b).e.setVisibility(8);
                return;
            case 14:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f27864b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.cu cuVar = (org.telegram.ui.cu) this.f27864b;
                if (animator.equals(cuVar.f32794n[0])) {
                    cuVar.f32794n[0] = null;
                    return;
                }
                return;
            case 16:
                org.telegram.ui.hv hvVar = (org.telegram.ui.hv) this.f27864b;
                org.telegram.ui.jv jvVar = hvVar.f34293n;
                org.telegram.ui.iv[] ivVarArr = jvVar.f34876f;
                jvVar.h = null;
                if (jvVar.f34879s) {
                    ivVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.iv ivVar = ivVarArr[0];
                    ivVarArr[0] = ivVarArr[1];
                    ivVarArr[1] = ivVar;
                    ivVar.setVisibility(8);
                    if (jvVar.f34876f[0].f34585f == jvVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jvVar.f34880w = z10;
                    jvVar.e.j(1.0f, jvVar.f34876f[0].f34585f);
                }
                jvVar.f34877n = false;
                hvVar.f34291c = false;
                hvVar.f34290b = false;
                org.telegram.ui.jv.f0(jvVar).setEnabled(true);
                jvVar.e.setEnabled(true);
                return;
            case 17:
                org.telegram.ui.tw twVar = (org.telegram.ui.tw) this.f27864b;
                org.telegram.ui.qy.q1(twVar.M, twVar.L, 0.0f);
                return;
            case 18:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.f27864b;
                boolean z11 = qyVar.G0;
                if (z11) {
                    f7 = 1.0f;
                }
                qyVar.H0 = f7;
                if (!z11) {
                    qyVar.E0.setVisibility(8);
                }
                View view = qyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.qy qyVar2 = ((org.telegram.ui.jy) this.f27864b).E0;
                qyVar2.f37041f3 = null;
                if (!qyVar2.j3) {
                    org.telegram.ui.py[] pyVarArr = qyVar2.f37032e0;
                    org.telegram.ui.py pyVar = pyVarArr[0];
                    org.telegram.ui.py pyVar2 = pyVarArr[1];
                    pyVarArr[0] = pyVar2;
                    pyVarArr[1] = pyVar;
                    qyVar2.f37136z0.g(1.0f, pyVar2.h);
                    qyVar2.T4(false);
                    qyVar2.f37032e0[0].d.getClass();
                    qyVar2.f37032e0[1].d.getClass();
                }
                qyVar2.f37032e0[1].setVisibility(8);
                org.telegram.ui.qy.f1(qyVar2, true);
                qyVar2.f37046g3 = false;
                qyVar2.f37072m3 = false;
                kVar = ((org.telegram.ui.ActionBar.m2) qyVar2).actionBar;
                kVar.setEnabled(true);
                qyVar2.f37136z0.setEnabled(true);
                qyVar2.r3(qyVar2.f37032e0[0]);
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.my) this.f27864b).setScrollEnabled(true);
                return;
            case 21:
                d90 d90Var = (d90) this.f27864b;
                FrameLayout frameLayout = d90Var.f23637b;
                ci.r6 r6Var = (ci.r6) d90Var.f23638c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.bi) d90Var.d);
                return;
            case 22:
                org.telegram.ui.d60 d60Var = ((org.telegram.ui.d50) this.f27864b).f32926o;
                org.telegram.ui.d60 d60Var2 = org.telegram.ui.d60.D3;
                d60Var.b1();
                org.telegram.ui.d60.m0(d60Var).invalidate();
                d60Var.Q.invalidate();
                if (d60Var.f33007s0) {
                    d60Var.f33007s0 = false;
                    d60Var.O0(true);
                    return;
                }
                return;
            case 23:
                super.onAnimationEnd(animator);
                org.telegram.ui.r50 r50Var = (org.telegram.ui.r50) this.f27864b;
                r50Var.G = null;
                org.telegram.ui.d60 d60Var3 = r50Var.L;
                d60Var3.Q.invalidate();
                d60Var3.a2.invalidate();
                org.telegram.ui.d60.y0(d60Var3).invalidate();
                org.telegram.ui.d60.J0(d60Var3);
                r50Var.H.clear();
                r50Var.I.clear();
                return;
            case 24:
                org.telegram.ui.f80 f80Var = (org.telegram.ui.f80) this.f27864b;
                f80Var.d = null;
                f80Var.f33574a = null;
                f80Var.f33575b = false;
                return;
            case 25:
                org.telegram.ui.cd0 cd0Var = (org.telegram.ui.cd0) this.f27864b;
                cd0Var.H = false;
                cd0Var.o0();
                return;
            case 26:
                org.telegram.ui.bf0 bf0Var = (org.telegram.ui.bf0) this.f27864b;
                if (bf0Var.f32410s != null && bf0Var.f32408n != null) {
                    bf0Var.f32409r.setVisibility(4);
                    bf0Var.f32410s = null;
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.dj0) this.f27864b).T.setVisibility(8);
                return;
            case 28:
                org.telegram.ui.yj0 yj0Var = (org.telegram.ui.yj0) this.f27864b;
                yj0Var.f40182f = 1.0f;
                yj0Var.invalidate();
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f27864b;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27863a) {
            case 3:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f27864b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
