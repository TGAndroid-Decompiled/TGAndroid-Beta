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
import org.telegram.ui.ni1;
import org.webrtc.OrientationHelper;
public final class k61 extends AnimatorListenerAdapter {
    public final int f27734a;
    public final Object f27735b;

    public k61(Object obj, int i10) {
        this.f27734a = i10;
        this.f27735b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27734a) {
            case 28:
                ((org.telegram.ui.hf0) this.f27735b).f37015s = null;
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
        switch (this.f27734a) {
            case 0:
                l61 l61Var = (l61) this.f27735b;
                if (l61Var.f28096a.getTag() == null) {
                    l61Var.f28096a.setVisibility(4);
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                m61 m61Var = (m61) this.f27735b;
                m61Var.f28423b = 0.0f;
                m61Var.setTranslationY(0.0f);
                m61Var.f28422a = null;
                return;
            case 2:
                h81 h81Var = (h81) this.f27735b;
                h81Var.J = false;
                h81Var.setEnabled(true);
                g81 g81Var = h81Var.f26687y;
                if (g81Var != null) {
                    ((k2.g0) g81Var).A(1.0f);
                }
                h81Var.invalidate();
                return;
            case 3:
                ((b91) this.f27735b).f24654e0 = null;
                return;
            case 4:
                ((d91) this.f27735b).K = null;
                return;
            case 5:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f27735b).view.setEnabled(true);
                return;
            case 6:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.f27735b).f31714s0;
                if (tVar.f31864x0.getParent() != null) {
                    tVar.f31832a.removeView(tVar.f31864x0);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f27735b;
                if (v0Var.getParent() != null) {
                    ((ViewGroup) v0Var.getParent()).removeView(v0Var);
                    return;
                }
                return;
            case 8:
                ni1 ni1Var = (ni1) this.f27735b;
                if (!ni1Var.f31442a) {
                    ni1Var.V.v.S = true;
                    ni1Var.V.v.invalidate();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.f27735b;
                o1Var.f31732i = false;
                o1Var.f31735l.setAlpha(35);
                o1Var.f31734k.setAlpha(102);
                o1Var.f31733j.setAlpha(35);
                o1Var.c();
                return;
            case 10:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.f27735b).f31762c;
                s1Var.O = false;
                s1Var.requestLayout();
                return;
            case 11:
                org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) this.f27735b;
                q2Var.N = 0.0f;
                q2Var.O = 0.0f;
                org.telegram.ui.Components.voip.p2 p2Var = q2Var.d;
                p2Var.setScaleX(q2Var.T);
                p2Var.setScaleY(q2Var.T);
                TextureView textureView = q2Var.f31770e;
                if (textureView != null) {
                    textureView.setScaleX(q2Var.U);
                    textureView.setScaleY(q2Var.U);
                }
                q2Var.setTranslationY(0.0f);
                q2Var.setTranslationX(0.0f);
                q2Var.W = q2Var.V;
                q2Var.f31766b0 = null;
                return;
            case 12:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f27735b;
                if (t2Var.P) {
                    f7 = 1.0f;
                }
                t2Var.Q = f7;
                t2Var.a(t2Var.R, t2Var.S);
                return;
            case 13:
                ((org.telegram.ui.Components.voip.u2) this.f27735b).f31902c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.u2) this.f27735b).f31900a);
                if (((org.telegram.ui.Components.voip.u2) this.f27735b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.u2) this.f27735b).f31900a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.u2) this.f27735b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.u2) this.f27735b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.voip.a3 a3Var = (org.telegram.ui.Components.voip.a3) this.f27735b;
                a3Var.J = false;
                a3Var.T.f31729e = false;
                if (a3Var.U && (animatorSet = a3Var.Q) != null) {
                    animatorSet.cancel();
                    a3Var.Q.start();
                }
                a3Var.c();
                return;
            case 15:
                ((org.telegram.ui.Components.voip.i3) this.f27735b).f31580e.setVisibility(8);
                return;
            case 16:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f27735b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 17:
                org.telegram.ui.hu huVar = (org.telegram.ui.hu) this.f27735b;
                if (animator.equals(huVar.f37139n[0])) {
                    huVar.f37139n[0] = null;
                    return;
                }
                return;
            case 18:
                org.telegram.ui.mv mvVar = (org.telegram.ui.mv) this.f27735b;
                org.telegram.ui.ov ovVar = mvVar.f38799n;
                org.telegram.ui.nv[] nvVarArr = ovVar.f39349f;
                ovVar.h = null;
                if (ovVar.f39352s) {
                    nvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.nv nvVar = nvVarArr[0];
                    nvVarArr[0] = nvVarArr[1];
                    nvVarArr[1] = nvVar;
                    nvVar.setVisibility(8);
                    if (ovVar.f39349f[0].f39067f == ovVar.f39348e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ovVar.f39353w = z10;
                    ovVar.f39348e.j(1.0f, ovVar.f39349f[0].f39067f);
                }
                ovVar.f39350n = false;
                mvVar.f38796c = false;
                mvVar.f38795b = false;
                org.telegram.ui.ov.f0(ovVar).setEnabled(true);
                ovVar.f39348e.setEnabled(true);
                return;
            case 19:
                org.telegram.ui.xw xwVar = (org.telegram.ui.xw) this.f27735b;
                org.telegram.ui.uy.q1(xwVar.M, xwVar.L, 0.0f);
                return;
            case 20:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.f27735b;
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
            case 21:
                org.telegram.ui.uy uyVar2 = ((org.telegram.ui.ny) this.f27735b).E0;
                uyVar2.f41296f3 = null;
                if (!uyVar2.j3) {
                    org.telegram.ui.ty[] tyVarArr = uyVar2.f41287e0;
                    org.telegram.ui.ty tyVar = tyVarArr[0];
                    org.telegram.ui.ty tyVar2 = tyVarArr[1];
                    tyVarArr[0] = tyVar2;
                    tyVarArr[1] = tyVar;
                    uyVar2.f41392z0.g(1.0f, tyVar2.h);
                    uyVar2.T4(false);
                    uyVar2.f41287e0[0].d.getClass();
                    uyVar2.f41287e0[1].d.getClass();
                }
                uyVar2.f41287e0[1].setVisibility(8);
                org.telegram.ui.uy.f1(uyVar2, true);
                uyVar2.f41301g3 = false;
                uyVar2.f41327m3 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) uyVar2).actionBar;
                kVar.setEnabled(true);
                uyVar2.f41392z0.setEnabled(true);
                uyVar2.r3(uyVar2.f41287e0[0]);
                return;
            case 22:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.qy) this.f27735b).setScrollEnabled(true);
                return;
            case 23:
                s80 s80Var = (s80) this.f27735b;
                FrameLayout frameLayout = s80Var.f30249b;
                di.r6 r6Var = (di.r6) s80Var.f30250c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ei) s80Var.d);
                return;
            case 24:
                org.telegram.ui.j60 j60Var = ((org.telegram.ui.j50) this.f27735b).f37536o;
                org.telegram.ui.j60 j60Var2 = org.telegram.ui.j60.D3;
                j60Var.b1();
                org.telegram.ui.j60.m0(j60Var).invalidate();
                j60Var.Q.invalidate();
                if (j60Var.f37615s0) {
                    j60Var.f37615s0 = false;
                    j60Var.O0(true);
                    return;
                }
                return;
            case 25:
                super.onAnimationEnd(animator);
                org.telegram.ui.x50 x50Var = (org.telegram.ui.x50) this.f27735b;
                x50Var.G = null;
                org.telegram.ui.j60 j60Var3 = x50Var.L;
                j60Var3.Q.invalidate();
                j60Var3.a2.invalidate();
                org.telegram.ui.j60.y0(j60Var3).invalidate();
                org.telegram.ui.j60.J0(j60Var3);
                x50Var.H.clear();
                x50Var.I.clear();
                return;
            case 26:
                org.telegram.ui.k80 k80Var = (org.telegram.ui.k80) this.f27735b;
                k80Var.d = null;
                k80Var.f37981a = null;
                k80Var.f37982b = false;
                return;
            case 27:
                org.telegram.ui.id0 id0Var = (org.telegram.ui.id0) this.f27735b;
                id0Var.H = false;
                id0Var.o0();
                return;
            case 28:
                org.telegram.ui.hf0 hf0Var = (org.telegram.ui.hf0) this.f27735b;
                if (hf0Var.f37015s != null && hf0Var.f37013n != null) {
                    hf0Var.f37014r.setVisibility(4);
                    hf0Var.f37015s = null;
                    return;
                }
                return;
            default:
                ((org.telegram.ui.lj0) this.f27735b).T.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27734a) {
            case 5:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f27735b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
