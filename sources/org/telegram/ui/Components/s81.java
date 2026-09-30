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
public final class s81 extends AnimatorListenerAdapter {
    public final int f28160a;
    public final Object f28161b;

    public s81(Object obj, int i10) {
        this.f28160a = i10;
        this.f28161b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28160a) {
            case 26:
                ((org.telegram.ui.bf0) this.f28161b).f32414s = null;
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
        switch (this.f28160a) {
            case 0:
                x81 x81Var = (x81) this.f28161b;
                x81Var.J = false;
                x81Var.setEnabled(true);
                w81 w81Var = x81Var.f30334y;
                if (w81Var != null) {
                    ((l.d) w81Var).L(1.0f);
                }
                x81Var.invalidate();
                return;
            case 1:
                ((q91) this.f28161b).f27607e0 = null;
                return;
            case 2:
                ((s91) this.f28161b).K = null;
                return;
            case 3:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f28161b).view.setEnabled(true);
                return;
            case 4:
                org.telegram.ui.Components.voip.u uVar = ((org.telegram.ui.Components.voip.p) this.f28161b).f29449s0;
                if (uVar.f29585x0.getParent() != null) {
                    uVar.f29554a.removeView(uVar.f29585x0);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f28161b;
                if (x0Var.getParent() != null) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                    return;
                }
                return;
            case 6:
                fi1 fi1Var = (fi1) this.f28161b;
                if (!fi1Var.f29213a) {
                    fi1Var.V.v.S = true;
                    fi1Var.V.v.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.f28161b;
                r1Var.f29498i = false;
                r1Var.f29501l.setAlpha(35);
                r1Var.f29500k.setAlpha(102);
                r1Var.f29499j.setAlpha(35);
                r1Var.c();
                return;
            case 8:
                org.telegram.ui.Components.voip.v1 v1Var = ((org.telegram.ui.Components.voip.t1) this.f28161b).f29537c;
                v1Var.O = false;
                v1Var.requestLayout();
                return;
            case 9:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f28161b;
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
                t2Var.f29541b0 = null;
                return;
            case 10:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f28161b;
                if (w2Var.P) {
                    f7 = 1.0f;
                }
                w2Var.Q = f7;
                w2Var.a(w2Var.R, w2Var.S);
                return;
            case 11:
                ((org.telegram.ui.Components.voip.x2) this.f28161b).f29667c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.x2) this.f28161b).f29665a);
                if (((org.telegram.ui.Components.voip.x2) this.f28161b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.x2) this.f28161b).f29665a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.x2) this.f28161b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.x2) this.f28161b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.d3 d3Var = (org.telegram.ui.Components.voip.d3) this.f28161b;
                d3Var.J = false;
                d3Var.T.e = false;
                if (d3Var.U && (animatorSet = d3Var.Q) != null) {
                    animatorSet.cancel();
                    d3Var.Q.start();
                }
                d3Var.c();
                return;
            case 13:
                ((org.telegram.ui.Components.voip.l3) this.f28161b).e.setVisibility(8);
                return;
            case 14:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f28161b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.cu cuVar = (org.telegram.ui.cu) this.f28161b;
                if (animator.equals(cuVar.f32795n[0])) {
                    cuVar.f32795n[0] = null;
                    return;
                }
                return;
            case 16:
                org.telegram.ui.hv hvVar = (org.telegram.ui.hv) this.f28161b;
                org.telegram.ui.jv jvVar = hvVar.f34297n;
                org.telegram.ui.iv[] ivVarArr = jvVar.f34880f;
                jvVar.h = null;
                if (jvVar.f34883s) {
                    ivVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.iv ivVar = ivVarArr[0];
                    ivVarArr[0] = ivVarArr[1];
                    ivVarArr[1] = ivVar;
                    ivVar.setVisibility(8);
                    if (jvVar.f34880f[0].f34588f == jvVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jvVar.f34884w = z10;
                    jvVar.e.j(1.0f, jvVar.f34880f[0].f34588f);
                }
                jvVar.f34881n = false;
                hvVar.f34295c = false;
                hvVar.f34294b = false;
                org.telegram.ui.jv.f0(jvVar).setEnabled(true);
                jvVar.e.setEnabled(true);
                return;
            case 17:
                org.telegram.ui.tw twVar = (org.telegram.ui.tw) this.f28161b;
                org.telegram.ui.qy.q1(twVar.M, twVar.L, 0.0f);
                return;
            case 18:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.f28161b;
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
                org.telegram.ui.qy qyVar2 = ((org.telegram.ui.jy) this.f28161b).E0;
                qyVar2.f37043f3 = null;
                if (!qyVar2.j3) {
                    org.telegram.ui.py[] pyVarArr = qyVar2.f37034e0;
                    org.telegram.ui.py pyVar = pyVarArr[0];
                    org.telegram.ui.py pyVar2 = pyVarArr[1];
                    pyVarArr[0] = pyVar2;
                    pyVarArr[1] = pyVar;
                    qyVar2.f37138z0.g(1.0f, pyVar2.h);
                    qyVar2.T4(false);
                    qyVar2.f37034e0[0].d.getClass();
                    qyVar2.f37034e0[1].d.getClass();
                }
                qyVar2.f37034e0[1].setVisibility(8);
                org.telegram.ui.qy.f1(qyVar2, true);
                qyVar2.f37048g3 = false;
                qyVar2.f37074m3 = false;
                kVar = ((org.telegram.ui.ActionBar.m2) qyVar2).actionBar;
                kVar.setEnabled(true);
                qyVar2.f37138z0.setEnabled(true);
                qyVar2.r3(qyVar2.f37034e0[0]);
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.my) this.f28161b).setScrollEnabled(true);
                return;
            case 21:
                e90 e90Var = (e90) this.f28161b;
                FrameLayout frameLayout = e90Var.f23954b;
                ci.r6 r6Var = (ci.r6) e90Var.f23955c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.bi) e90Var.d);
                return;
            case 22:
                org.telegram.ui.d60 d60Var = ((org.telegram.ui.d50) this.f28161b).f32927o;
                org.telegram.ui.d60 d60Var2 = org.telegram.ui.d60.D3;
                d60Var.b1();
                org.telegram.ui.d60.m0(d60Var).invalidate();
                d60Var.Q.invalidate();
                if (d60Var.f33008s0) {
                    d60Var.f33008s0 = false;
                    d60Var.O0(true);
                    return;
                }
                return;
            case 23:
                super.onAnimationEnd(animator);
                org.telegram.ui.r50 r50Var = (org.telegram.ui.r50) this.f28161b;
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
                org.telegram.ui.f80 f80Var = (org.telegram.ui.f80) this.f28161b;
                f80Var.d = null;
                f80Var.f33576a = null;
                f80Var.f33577b = false;
                return;
            case 25:
                org.telegram.ui.cd0 cd0Var = (org.telegram.ui.cd0) this.f28161b;
                cd0Var.H = false;
                cd0Var.o0();
                return;
            case 26:
                org.telegram.ui.bf0 bf0Var = (org.telegram.ui.bf0) this.f28161b;
                if (bf0Var.f32414s != null && bf0Var.f32412n != null) {
                    bf0Var.f32413r.setVisibility(4);
                    bf0Var.f32414s = null;
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.ej0) this.f28161b).T.setVisibility(8);
                return;
            case 28:
                org.telegram.ui.yj0 yj0Var = (org.telegram.ui.yj0) this.f28161b;
                yj0Var.f40183f = 1.0f;
                yj0Var.invalidate();
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f28161b;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28160a) {
            case 3:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f28161b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
