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
    public final int f27706a;
    public final Object f27707b;

    public k61(Object obj, int i10) {
        this.f27706a = i10;
        this.f27707b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27706a) {
            case 28:
                ((org.telegram.ui.hf0) this.f27707b).f36987s = null;
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
        switch (this.f27706a) {
            case 0:
                l61 l61Var = (l61) this.f27707b;
                if (l61Var.f28068a.getTag() == null) {
                    l61Var.f28068a.setVisibility(4);
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                m61 m61Var = (m61) this.f27707b;
                m61Var.f28395b = 0.0f;
                m61Var.setTranslationY(0.0f);
                m61Var.f28394a = null;
                return;
            case 2:
                h81 h81Var = (h81) this.f27707b;
                h81Var.J = false;
                h81Var.setEnabled(true);
                g81 g81Var = h81Var.f26659y;
                if (g81Var != null) {
                    ((k2.g0) g81Var).A(1.0f);
                }
                h81Var.invalidate();
                return;
            case 3:
                ((b91) this.f27707b).f24626e0 = null;
                return;
            case 4:
                ((d91) this.f27707b).K = null;
                return;
            case 5:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f27707b).view.setEnabled(true);
                return;
            case 6:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.f27707b).f31686s0;
                if (tVar.f31836x0.getParent() != null) {
                    tVar.f31804a.removeView(tVar.f31836x0);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f27707b;
                if (v0Var.getParent() != null) {
                    ((ViewGroup) v0Var.getParent()).removeView(v0Var);
                    return;
                }
                return;
            case 8:
                ni1 ni1Var = (ni1) this.f27707b;
                if (!ni1Var.f31414a) {
                    ni1Var.V.v.S = true;
                    ni1Var.V.v.invalidate();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.f27707b;
                o1Var.f31704i = false;
                o1Var.f31707l.setAlpha(35);
                o1Var.f31706k.setAlpha(102);
                o1Var.f31705j.setAlpha(35);
                o1Var.c();
                return;
            case 10:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.f27707b).f31734c;
                s1Var.O = false;
                s1Var.requestLayout();
                return;
            case 11:
                org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) this.f27707b;
                q2Var.N = 0.0f;
                q2Var.O = 0.0f;
                org.telegram.ui.Components.voip.p2 p2Var = q2Var.d;
                p2Var.setScaleX(q2Var.T);
                p2Var.setScaleY(q2Var.T);
                TextureView textureView = q2Var.f31742e;
                if (textureView != null) {
                    textureView.setScaleX(q2Var.U);
                    textureView.setScaleY(q2Var.U);
                }
                q2Var.setTranslationY(0.0f);
                q2Var.setTranslationX(0.0f);
                q2Var.W = q2Var.V;
                q2Var.f31738b0 = null;
                return;
            case 12:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f27707b;
                if (t2Var.P) {
                    f7 = 1.0f;
                }
                t2Var.Q = f7;
                t2Var.a(t2Var.R, t2Var.S);
                return;
            case 13:
                ((org.telegram.ui.Components.voip.u2) this.f27707b).f31874c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.u2) this.f27707b).f31872a);
                if (((org.telegram.ui.Components.voip.u2) this.f27707b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.u2) this.f27707b).f31872a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.u2) this.f27707b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.u2) this.f27707b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.voip.a3 a3Var = (org.telegram.ui.Components.voip.a3) this.f27707b;
                a3Var.J = false;
                a3Var.T.f31701e = false;
                if (a3Var.U && (animatorSet = a3Var.Q) != null) {
                    animatorSet.cancel();
                    a3Var.Q.start();
                }
                a3Var.c();
                return;
            case 15:
                ((org.telegram.ui.Components.voip.i3) this.f27707b).f31552e.setVisibility(8);
                return;
            case 16:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f27707b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 17:
                org.telegram.ui.hu huVar = (org.telegram.ui.hu) this.f27707b;
                if (animator.equals(huVar.f37111n[0])) {
                    huVar.f37111n[0] = null;
                    return;
                }
                return;
            case 18:
                org.telegram.ui.mv mvVar = (org.telegram.ui.mv) this.f27707b;
                org.telegram.ui.ov ovVar = mvVar.f38771n;
                org.telegram.ui.nv[] nvVarArr = ovVar.f39321f;
                ovVar.h = null;
                if (ovVar.f39324s) {
                    nvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.nv nvVar = nvVarArr[0];
                    nvVarArr[0] = nvVarArr[1];
                    nvVarArr[1] = nvVar;
                    nvVar.setVisibility(8);
                    if (ovVar.f39321f[0].f39039f == ovVar.f39320e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ovVar.f39325w = z10;
                    ovVar.f39320e.j(1.0f, ovVar.f39321f[0].f39039f);
                }
                ovVar.f39322n = false;
                mvVar.f38768c = false;
                mvVar.f38767b = false;
                org.telegram.ui.ov.f0(ovVar).setEnabled(true);
                ovVar.f39320e.setEnabled(true);
                return;
            case 19:
                org.telegram.ui.xw xwVar = (org.telegram.ui.xw) this.f27707b;
                org.telegram.ui.uy.q1(xwVar.M, xwVar.L, 0.0f);
                return;
            case 20:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.f27707b;
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
                org.telegram.ui.uy uyVar2 = ((org.telegram.ui.ny) this.f27707b).E0;
                uyVar2.f41268f3 = null;
                if (!uyVar2.j3) {
                    org.telegram.ui.ty[] tyVarArr = uyVar2.f41259e0;
                    org.telegram.ui.ty tyVar = tyVarArr[0];
                    org.telegram.ui.ty tyVar2 = tyVarArr[1];
                    tyVarArr[0] = tyVar2;
                    tyVarArr[1] = tyVar;
                    uyVar2.f41364z0.g(1.0f, tyVar2.h);
                    uyVar2.T4(false);
                    uyVar2.f41259e0[0].d.getClass();
                    uyVar2.f41259e0[1].d.getClass();
                }
                uyVar2.f41259e0[1].setVisibility(8);
                org.telegram.ui.uy.f1(uyVar2, true);
                uyVar2.f41273g3 = false;
                uyVar2.f41299m3 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) uyVar2).actionBar;
                kVar.setEnabled(true);
                uyVar2.f41364z0.setEnabled(true);
                uyVar2.r3(uyVar2.f41259e0[0]);
                return;
            case 22:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.qy) this.f27707b).setScrollEnabled(true);
                return;
            case 23:
                s80 s80Var = (s80) this.f27707b;
                FrameLayout frameLayout = s80Var.f30221b;
                di.r6 r6Var = (di.r6) s80Var.f30222c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ei) s80Var.d);
                return;
            case 24:
                org.telegram.ui.j60 j60Var = ((org.telegram.ui.j50) this.f27707b).f37508o;
                org.telegram.ui.j60 j60Var2 = org.telegram.ui.j60.D3;
                j60Var.b1();
                org.telegram.ui.j60.m0(j60Var).invalidate();
                j60Var.Q.invalidate();
                if (j60Var.f37587s0) {
                    j60Var.f37587s0 = false;
                    j60Var.O0(true);
                    return;
                }
                return;
            case 25:
                super.onAnimationEnd(animator);
                org.telegram.ui.x50 x50Var = (org.telegram.ui.x50) this.f27707b;
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
                org.telegram.ui.k80 k80Var = (org.telegram.ui.k80) this.f27707b;
                k80Var.d = null;
                k80Var.f37953a = null;
                k80Var.f37954b = false;
                return;
            case 27:
                org.telegram.ui.id0 id0Var = (org.telegram.ui.id0) this.f27707b;
                id0Var.H = false;
                id0Var.o0();
                return;
            case 28:
                org.telegram.ui.hf0 hf0Var = (org.telegram.ui.hf0) this.f27707b;
                if (hf0Var.f36987s != null && hf0Var.f36985n != null) {
                    hf0Var.f36986r.setVisibility(4);
                    hf0Var.f36987s = null;
                    return;
                }
                return;
            default:
                ((org.telegram.ui.lj0) this.f27707b).T.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27706a) {
            case 5:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f27707b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
