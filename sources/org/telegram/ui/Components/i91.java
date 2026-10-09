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
import org.telegram.ui.pi1;
import org.webrtc.OrientationHelper;
public final class i91 extends AnimatorListenerAdapter {
    public final int f27296a;
    public final Object f27297b;

    public i91(Object obj, int i10) {
        this.f27296a = i10;
        this.f27297b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27296a) {
            case 26:
                ((org.telegram.ui.gf0) this.f27297b).f38005s = null;
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
        switch (this.f27296a) {
            case 0:
                n91 n91Var = (n91) this.f27297b;
                n91Var.J = false;
                n91Var.setEnabled(true);
                m91 m91Var = n91Var.f29122y;
                if (m91Var != null) {
                    ((m2.t) m91Var).D(1.0f);
                }
                n91Var.invalidate();
                return;
            case 1:
                ((ha1) this.f27297b).f27020e0 = null;
                return;
            case 2:
                ((ja1) this.f27297b).K = null;
                return;
            case 3:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f27297b).view.setEnabled(true);
                return;
            case 4:
                org.telegram.ui.Components.voip.u uVar = ((org.telegram.ui.Components.voip.p) this.f27297b).f32149s0;
                if (uVar.f32283x0.getParent() != null) {
                    uVar.f32251a.removeView(uVar.f32283x0);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f27297b;
                if (x0Var.getParent() != null) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                    return;
                }
                return;
            case 6:
                pi1 pi1Var = (pi1) this.f27297b;
                if (!pi1Var.f31889a) {
                    pi1Var.V.v.S = true;
                    pi1Var.V.v.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.q1 q1Var = (org.telegram.ui.Components.voip.q1) this.f27297b;
                q1Var.f32178i = false;
                q1Var.f32181l.setAlpha(35);
                q1Var.f32180k.setAlpha(102);
                q1Var.f32179j.setAlpha(35);
                q1Var.c();
                return;
            case 8:
                org.telegram.ui.Components.voip.u1 u1Var = ((org.telegram.ui.Components.voip.s1) this.f27297b).f32209c;
                u1Var.O = false;
                u1Var.requestLayout();
                return;
            case 9:
                org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) this.f27297b;
                s2Var.N = 0.0f;
                s2Var.O = 0.0f;
                org.telegram.ui.Components.voip.r2 r2Var = s2Var.d;
                r2Var.setScaleX(s2Var.T);
                r2Var.setScaleY(s2Var.T);
                TextureView textureView = s2Var.f32217e;
                if (textureView != null) {
                    textureView.setScaleX(s2Var.U);
                    textureView.setScaleY(s2Var.U);
                }
                s2Var.setTranslationY(0.0f);
                s2Var.setTranslationX(0.0f);
                s2Var.W = s2Var.V;
                s2Var.f32213b0 = null;
                return;
            case 10:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f27297b;
                if (v2Var.P) {
                    f7 = 1.0f;
                }
                v2Var.Q = f7;
                v2Var.a(v2Var.R, v2Var.S);
                return;
            case 11:
                ((org.telegram.ui.Components.voip.w2) this.f27297b).f32349c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.w2) this.f27297b).f32347a);
                if (((org.telegram.ui.Components.voip.w2) this.f27297b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.w2) this.f27297b).f32347a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.w2) this.f27297b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.w2) this.f27297b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.c3 c3Var = (org.telegram.ui.Components.voip.c3) this.f27297b;
                c3Var.J = false;
                c3Var.T.f32175e = false;
                if (c3Var.U && (animatorSet = c3Var.Q) != null) {
                    animatorSet.cancel();
                    c3Var.Q.start();
                }
                c3Var.c();
                return;
            case 13:
                ((org.telegram.ui.Components.voip.k3) this.f27297b).f32035e.setVisibility(8);
                return;
            case 14:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f27297b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.fu fuVar = (org.telegram.ui.fu) this.f27297b;
                if (animator.equals(fuVar.f37694n[0])) {
                    fuVar.f37694n[0] = null;
                    return;
                }
                return;
            case 16:
                org.telegram.ui.kv kvVar = (org.telegram.ui.kv) this.f27297b;
                org.telegram.ui.mv mvVar = kvVar.f39358n;
                org.telegram.ui.lv[] lvVarArr = mvVar.f39993f;
                mvVar.h = null;
                if (mvVar.f39996s) {
                    lvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.lv lvVar = lvVarArr[0];
                    lvVarArr[0] = lvVarArr[1];
                    lvVarArr[1] = lvVar;
                    lvVar.setVisibility(8);
                    if (mvVar.f39993f[0].f39683f == mvVar.f39992e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    mvVar.f39997w = z10;
                    mvVar.f39992e.j(1.0f, mvVar.f39993f[0].f39683f);
                }
                mvVar.f39994n = false;
                kvVar.f39355c = false;
                kvVar.f39354b = false;
                org.telegram.ui.mv.f0(mvVar).setEnabled(true);
                mvVar.f39992e.setEnabled(true);
                return;
            case 17:
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) this.f27297b;
                org.telegram.ui.ty.n1(wwVar.M, wwVar.L, 0.0f);
                return;
            case 18:
                org.telegram.ui.ty tyVar = (org.telegram.ui.ty) this.f27297b;
                boolean z11 = tyVar.G0;
                if (z11) {
                    f7 = 1.0f;
                }
                tyVar.H0 = f7;
                if (!z11) {
                    tyVar.E0.setVisibility(8);
                }
                View view = tyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ty tyVar2 = ((org.telegram.ui.my) this.f27297b).E0;
                tyVar2.f42181f3 = null;
                if (!tyVar2.j3) {
                    org.telegram.ui.sy[] syVarArr = tyVar2.f42172e0;
                    org.telegram.ui.sy syVar = syVarArr[0];
                    org.telegram.ui.sy syVar2 = syVarArr[1];
                    syVarArr[0] = syVar2;
                    syVarArr[1] = syVar;
                    tyVar2.f42276z0.g(1.0f, syVar2.h);
                    tyVar2.Q4(false);
                    tyVar2.f42172e0[0].d.getClass();
                    tyVar2.f42172e0[1].d.getClass();
                }
                tyVar2.f42172e0[1].setVisibility(8);
                org.telegram.ui.ty.c1(tyVar2, true);
                tyVar2.f42186g3 = false;
                tyVar2.f42212m3 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) tyVar2).actionBar;
                kVar.setEnabled(true);
                tyVar2.f42276z0.setEnabled(true);
                tyVar2.o3(tyVar2.f42172e0[0]);
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.py) this.f27297b).setScrollEnabled(true);
                return;
            case 21:
                t90 t90Var = (t90) this.f27297b;
                FrameLayout frameLayout = t90Var.f31095b;
                ci.r6 r6Var = (ci.r6) t90Var.f31096c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ei) t90Var.d);
                return;
            case 22:
                org.telegram.ui.g60 g60Var = ((org.telegram.ui.g50) this.f27297b).f37783o;
                org.telegram.ui.g60 g60Var2 = org.telegram.ui.g60.D3;
                g60Var.c1();
                org.telegram.ui.g60.n0(g60Var).invalidate();
                g60Var.Q.invalidate();
                if (g60Var.f37861s0) {
                    g60Var.f37861s0 = false;
                    g60Var.P0(true);
                    return;
                }
                return;
            case 23:
                super.onAnimationEnd(animator);
                org.telegram.ui.u50 u50Var = (org.telegram.ui.u50) this.f27297b;
                u50Var.G = null;
                org.telegram.ui.g60 g60Var3 = u50Var.L;
                g60Var3.Q.invalidate();
                g60Var3.a2.invalidate();
                org.telegram.ui.g60.z0(g60Var3).invalidate();
                org.telegram.ui.g60.K0(g60Var3);
                u50Var.H.clear();
                u50Var.I.clear();
                return;
            case 24:
                org.telegram.ui.k80 k80Var = (org.telegram.ui.k80) this.f27297b;
                k80Var.d = null;
                k80Var.f39173a = null;
                k80Var.f39174b = false;
                return;
            case 25:
                org.telegram.ui.hd0 hd0Var = (org.telegram.ui.hd0) this.f27297b;
                hd0Var.H = false;
                hd0Var.n0();
                return;
            case 26:
                org.telegram.ui.gf0 gf0Var = (org.telegram.ui.gf0) this.f27297b;
                if (gf0Var.f38005s != null && gf0Var.f38003n != null) {
                    gf0Var.f38004r.setVisibility(4);
                    gf0Var.f38005s = null;
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.lj0) this.f27297b).T.setVisibility(8);
                return;
            case 28:
                org.telegram.ui.fk0 fk0Var = (org.telegram.ui.fk0) this.f27297b;
                fk0Var.f37628f = 1.0f;
                fk0Var.invalidate();
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f27297b;
                if (animator.equals(notificationsCustomSettingsActivity.f33830e)) {
                    notificationsCustomSettingsActivity.f33830e = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27296a) {
            case 3:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f27297b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
