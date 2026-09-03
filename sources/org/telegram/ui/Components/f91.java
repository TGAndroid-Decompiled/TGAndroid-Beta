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
import org.telegram.ui.bi1;
import org.webrtc.OrientationHelper;
public final class f91 extends AnimatorListenerAdapter {
    public final int f24837a;
    public final Object f24838b;

    public f91(Object obj, int i10) {
        this.f24837a = i10;
        this.f24838b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24837a) {
            case 24:
                ((org.telegram.ui.bf0) this.f24838b).f32869s = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        boolean z4;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        float f10 = 0.0f;
        switch (this.f24837a) {
            case 0:
                ((h91) this.f24838b).H = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f24838b).view.setEnabled(true);
                return;
            case 2:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.f24838b).f29793p0;
                if (tVar.f29917u0.getParent() != null) {
                    tVar.f29891a.removeView(tVar.f29917u0);
                    return;
                }
                return;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.f24838b;
                if (u0Var.getParent() != null) {
                    ((ViewGroup) u0Var.getParent()).removeView(u0Var);
                    return;
                }
                return;
            case 4:
                bi1 bi1Var = (bi1) this.f24838b;
                if (!bi1Var.f29525a) {
                    bi1Var.S.v.P = true;
                    bi1Var.S.v.invalidate();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.f24838b;
                n1Var.f29773i = false;
                n1Var.f29776l.setAlpha(35);
                n1Var.f29775k.setAlpha(102);
                n1Var.f29774j.setAlpha(35);
                n1Var.c();
                return;
            case 6:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.f24838b).f29840c;
                s1Var.L = false;
                s1Var.requestLayout();
                return;
            case 7:
                org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) this.f24838b;
                s2Var.K = 0.0f;
                s2Var.L = 0.0f;
                org.telegram.ui.Components.voip.r2 r2Var = s2Var.d;
                r2Var.setScaleX(s2Var.Q);
                r2Var.setScaleY(s2Var.Q);
                TextureView textureView = s2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(s2Var.R);
                    textureView.setScaleY(s2Var.R);
                }
                s2Var.setTranslationY(0.0f);
                s2Var.setTranslationX(0.0f);
                s2Var.T = s2Var.S;
                s2Var.V = null;
                return;
            case 8:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f24838b;
                if (v2Var.M) {
                    f10 = 1.0f;
                }
                v2Var.N = f10;
                v2Var.a(v2Var.O, v2Var.P);
                return;
            case 9:
                ((org.telegram.ui.Components.voip.w2) this.f24838b).f29990c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.w2) this.f24838b).f29988a);
                if (((org.telegram.ui.Components.voip.w2) this.f24838b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.w2) this.f24838b).f29988a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.w2) this.f24838b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.w2) this.f24838b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.voip.c3 c3Var = (org.telegram.ui.Components.voip.c3) this.f24838b;
                c3Var.G = false;
                c3Var.Q.e = false;
                if (c3Var.R && (animatorSet = c3Var.N) != null) {
                    animatorSet.cancel();
                    c3Var.N.start();
                }
                c3Var.c();
                return;
            case 11:
                ((org.telegram.ui.Components.voip.k3) this.f24838b).e.setVisibility(8);
                return;
            case 12:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f24838b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 13:
                org.telegram.ui.gu guVar = (org.telegram.ui.gu) this.f24838b;
                if (animator.equals(guVar.f34510n[0])) {
                    guVar.f34510n[0] = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.kv kvVar = (org.telegram.ui.kv) this.f24838b;
                org.telegram.ui.mv mvVar = kvVar.f35593n;
                org.telegram.ui.lv[] lvVarArr = mvVar.f36224f;
                mvVar.h = null;
                if (mvVar.f36227s) {
                    lvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.lv lvVar = lvVarArr[0];
                    lvVarArr[0] = lvVarArr[1];
                    lvVarArr[1] = lvVar;
                    lvVar.setVisibility(8);
                    if (mvVar.f36224f[0].f35931f == mvVar.e.getFirstTabId()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    mvVar.f36228w = z4;
                    mvVar.e.j(1.0f, mvVar.f36224f[0].f35931f);
                }
                mvVar.f36225n = false;
                kvVar.f35591c = false;
                kvVar.f35590b = false;
                org.telegram.ui.mv.f0(mvVar).setEnabled(true);
                mvVar.e.setEnabled(true);
                return;
            case 15:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) this.f24838b;
                org.telegram.ui.qy.q1(uwVar.M, uwVar.L, 0.0f);
                return;
            case 16:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.f24838b;
                boolean z11 = qyVar.D0;
                if (z11) {
                    f10 = 1.0f;
                }
                qyVar.E0 = f10;
                if (!z11) {
                    qyVar.B0.setVisibility(8);
                }
                View view = qyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.qy qyVar2 = ((org.telegram.ui.jy) this.f24838b).B0;
                qyVar2.c3 = null;
                if (!qyVar2.f37556g3) {
                    org.telegram.ui.py[] pyVarArr = qyVar2.f37527b0;
                    org.telegram.ui.py pyVar = pyVarArr[0];
                    org.telegram.ui.py pyVar2 = pyVarArr[1];
                    pyVarArr[0] = pyVar2;
                    pyVarArr[1] = pyVar;
                    qyVar2.f37633w0.g(1.0f, pyVar2.h);
                    qyVar2.T4(false);
                    qyVar2.f37527b0[0].d.getClass();
                    qyVar2.f37527b0[1].d.getClass();
                }
                qyVar2.f37527b0[1].setVisibility(8);
                org.telegram.ui.qy.f1(qyVar2, true);
                qyVar2.f37540d3 = false;
                qyVar2.f37571j3 = false;
                kVar = ((org.telegram.ui.ActionBar.p2) qyVar2).actionBar;
                kVar.setEnabled(true);
                qyVar2.f37633w0.setEnabled(true);
                qyVar2.r3(qyVar2.f37527b0[0]);
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.my) this.f24838b).setScrollEnabled(true);
                return;
            case 19:
                t80 t80Var = (t80) this.f24838b;
                FrameLayout frameLayout = t80Var.f28944b;
                eg.i0 i0Var = (eg.i0) t80Var.f28945c;
                if (i0Var.getParent() != null) {
                    frameLayout.removeView(i0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ci) t80Var.d);
                return;
            case 20:
                org.telegram.ui.e60 e60Var = ((org.telegram.ui.f50) this.f24838b).f33951o;
                org.telegram.ui.e60 e60Var2 = org.telegram.ui.e60.A3;
                e60Var.b1();
                org.telegram.ui.e60.m0(e60Var).invalidate();
                e60Var.N.invalidate();
                if (e60Var.f33677p0) {
                    e60Var.f33677p0 = false;
                    e60Var.O0(true);
                    return;
                }
                return;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.s50 s50Var = (org.telegram.ui.s50) this.f24838b;
                s50Var.G = null;
                org.telegram.ui.e60 e60Var3 = s50Var.L;
                e60Var3.N.invalidate();
                e60Var3.X1.invalidate();
                org.telegram.ui.e60.y0(e60Var3).invalidate();
                org.telegram.ui.e60.J0(e60Var3);
                s50Var.H.clear();
                s50Var.I.clear();
                return;
            case 22:
                org.telegram.ui.d80 d80Var = (org.telegram.ui.d80) this.f24838b;
                d80Var.d = null;
                d80Var.f33368a = null;
                d80Var.f33369b = false;
                return;
            case 23:
                org.telegram.ui.cd0 cd0Var = (org.telegram.ui.cd0) this.f24838b;
                cd0Var.E = false;
                cd0Var.o0();
                return;
            case 24:
                org.telegram.ui.bf0 bf0Var = (org.telegram.ui.bf0) this.f24838b;
                if (bf0Var.f32869s != null && bf0Var.f32867n != null) {
                    bf0Var.f32868r.setVisibility(4);
                    bf0Var.f32869s = null;
                    return;
                }
                return;
            case 25:
                ((org.telegram.ui.cj0) this.f24838b).Q.setVisibility(8);
                return;
            case 26:
                org.telegram.ui.wj0 wj0Var = (org.telegram.ui.wj0) this.f24838b;
                wj0Var.f39717f = 1.0f;
                wj0Var.invalidate();
                return;
            case 27:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f24838b;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
            case 28:
                org.telegram.ui.np0 np0Var = (org.telegram.ui.np0) this.f24838b;
                org.telegram.ui.mc mcVar = np0Var.U;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) np0Var.U.getParent()).removeView(np0Var.U);
                    }
                    np0Var.U = null;
                }
                np0Var.W = null;
                super.onAnimationEnd(animator);
                return;
            default:
                org.telegram.ui.oq0 oq0Var = (org.telegram.ui.oq0) this.f24838b;
                org.telegram.ui.rq0 rq0Var = oq0Var.A0;
                org.telegram.ui.pq0[] pq0VarArr = rq0Var.f37950n;
                rq0Var.f37951r = null;
                if (rq0Var.f37953w) {
                    pq0VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.pq0 pq0Var = pq0VarArr[0];
                    pq0VarArr[0] = pq0VarArr[1];
                    pq0VarArr[1] = pq0Var;
                    pq0Var.setVisibility(8);
                    if (rq0Var.f37950n[0].e == rq0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rq0Var.e = z10;
                    rq0Var.h.j(1.0f, rq0Var.f37950n[0].e);
                }
                rq0Var.f37952s = false;
                oq0Var.f36866v0 = false;
                oq0Var.f36865u0 = false;
                org.telegram.ui.rq0.c0(rq0Var).setEnabled(true);
                rq0Var.h.setEnabled(true);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f24837a) {
            case 1:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f24838b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
