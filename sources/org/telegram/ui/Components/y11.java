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
import org.telegram.ui.fh1;
import org.webrtc.OrientationHelper;
public final class y11 extends AnimatorListenerAdapter {
    public final int f34834a;
    public final Object f34835b;

    public y11(Object obj, int i9) {
        this.f34834a = i9;
        this.f34835b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        float f10 = 0.0f;
        switch (this.f34834a) {
            case 0:
                a21 a21Var = (a21) this.f34835b;
                a21Var.G = 1.0f;
                a21Var.h.invalidate();
                return;
            case 1:
                ((h41) this.f34835b).H = null;
                return;
            case 2:
                UndoView undoView = (UndoView) this.f34835b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 3:
                p51 p51Var = (p51) this.f34835b;
                if (p51Var.f31549a.getTag() == null) {
                    p51Var.f31549a.setVisibility(4);
                    return;
                }
                return;
            case 4:
                super.onAnimationEnd(animator);
                q51 q51Var = (q51) this.f34835b;
                q51Var.f31836b = 0.0f;
                q51Var.setTranslationY(0.0f);
                q51Var.f31835a = null;
                return;
            case 5:
                m71 m71Var = (m71) this.f34835b;
                m71Var.F = false;
                m71Var.setEnabled(true);
                l71 l71Var = m71Var.f30759y;
                if (l71Var != null) {
                    ((n2.p) l71Var).F(1.0f);
                }
                m71Var.invalidate();
                return;
            case 6:
                ((g81) this.f34835b).f28693a0 = null;
                return;
            case 7:
                ((i81) this.f34835b).G = null;
                return;
            case 8:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f34835b).view.setEnabled(true);
                return;
            case 9:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.f34835b).f33726o0;
                if (tVar.f33847t0.getParent() != null) {
                    tVar.f33821a.removeView(tVar.f33847t0);
                    return;
                }
                return;
            case 10:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.f34835b;
                if (u0Var.getParent() != null) {
                    ((ViewGroup) u0Var.getParent()).removeView(u0Var);
                    return;
                }
                return;
            case 11:
                fh1 fh1Var = (fh1) this.f34835b;
                if (!fh1Var.f33425a) {
                    fh1Var.R.v.O = true;
                    fh1Var.R.v.invalidate();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.f34835b;
                n1Var.f33692i = false;
                n1Var.f33695l.setAlpha(35);
                n1Var.f33694k.setAlpha(102);
                n1Var.f33693j.setAlpha(35);
                n1Var.c();
                return;
            case 13:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.f34835b).f33765c;
                s1Var.K = false;
                s1Var.requestLayout();
                return;
            case 14:
                org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) this.f34835b;
                r2Var.J = 0.0f;
                r2Var.K = 0.0f;
                org.telegram.ui.Components.voip.q2 q2Var = r2Var.d;
                q2Var.setScaleX(r2Var.P);
                q2Var.setScaleY(r2Var.P);
                TextureView textureView = r2Var.f33777e;
                if (textureView != null) {
                    textureView.setScaleX(r2Var.Q);
                    textureView.setScaleY(r2Var.Q);
                }
                r2Var.setTranslationY(0.0f);
                r2Var.setTranslationX(0.0f);
                r2Var.S = r2Var.R;
                r2Var.U = null;
                return;
            case 15:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.f34835b;
                if (u2Var.L) {
                    f10 = 1.0f;
                }
                u2Var.M = f10;
                u2Var.a(u2Var.N, u2Var.O);
                return;
            case 16:
                ((org.telegram.ui.Components.voip.v2) this.f34835b).f33909c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.v2) this.f34835b).f33907a);
                if (((org.telegram.ui.Components.voip.v2) this.f34835b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.v2) this.f34835b).f33907a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.v2) this.f34835b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.v2) this.f34835b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.voip.b3 b3Var = (org.telegram.ui.Components.voip.b3) this.f34835b;
                b3Var.F = false;
                b3Var.P.f33689e = false;
                if (b3Var.Q && (animatorSet = b3Var.M) != null) {
                    animatorSet.cancel();
                    b3Var.M.start();
                }
                b3Var.c();
                return;
            case 18:
                ((org.telegram.ui.Components.voip.j3) this.f34835b).f33591e.setVisibility(8);
                return;
            case 19:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f34835b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.vt vtVar = (org.telegram.ui.vt) this.f34835b;
                if (animator.equals(vtVar.f43583n[0])) {
                    vtVar.f43583n[0] = null;
                    return;
                }
                return;
            case 21:
                org.telegram.ui.zu zuVar = (org.telegram.ui.zu) this.f34835b;
                org.telegram.ui.bv bvVar = zuVar.f45255n;
                org.telegram.ui.av[] avVarArr = bvVar.f37000f;
                bvVar.h = null;
                if (bvVar.f37003s) {
                    avVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.av avVar = avVarArr[0];
                    avVarArr[0] = avVarArr[1];
                    avVarArr[1] = avVar;
                    avVar.setVisibility(8);
                    if (bvVar.f37000f[0].f36560f == bvVar.f36999e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bvVar.f37004w = z10;
                    bvVar.f36999e.j(1.0f, bvVar.f37000f[0].f36560f);
                }
                bvVar.f37001n = false;
                zuVar.f45252c = false;
                zuVar.f45251b = false;
                org.telegram.ui.bv.e0(bvVar).setEnabled(true);
                bvVar.f36999e.setEnabled(true);
                return;
            case 22:
                org.telegram.ui.hw hwVar = (org.telegram.ui.hw) this.f34835b;
                org.telegram.ui.dy.q1(hwVar.M, hwVar.L, 0.0f);
                return;
            case 23:
                org.telegram.ui.dy dyVar = (org.telegram.ui.dy) this.f34835b;
                boolean z11 = dyVar.C0;
                if (z11) {
                    f10 = 1.0f;
                }
                dyVar.D0 = f10;
                if (!z11) {
                    dyVar.A0.setVisibility(8);
                }
                View view = dyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.dy dyVar2 = ((org.telegram.ui.vx) this.f34835b).A0;
                dyVar2.f37636b3 = null;
                if (!dyVar2.f37659f3) {
                    org.telegram.ui.cy[] cyVarArr = dyVar2.f37629a0;
                    org.telegram.ui.cy cyVar = cyVarArr[0];
                    org.telegram.ui.cy cyVar2 = cyVarArr[1];
                    cyVarArr[0] = cyVar2;
                    cyVarArr[1] = cyVar;
                    dyVar2.f37735v0.g(1.0f, cyVar2.h);
                    dyVar2.T4(false);
                    dyVar2.f37629a0[0].d.getClass();
                    dyVar2.f37629a0[1].d.getClass();
                }
                dyVar2.f37629a0[1].setVisibility(8);
                org.telegram.ui.dy.f1(dyVar2, true);
                dyVar2.f37642c3 = false;
                dyVar2.f37674i3 = false;
                kVar = ((org.telegram.ui.ActionBar.o2) dyVar2).actionBar;
                kVar.setEnabled(true);
                dyVar2.f37735v0.setEnabled(true);
                dyVar2.r3(dyVar2.f37629a0[0]);
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.yx) this.f34835b).setScrollEnabled(true);
                return;
            case 26:
                a80 a80Var = (a80) this.f34835b;
                FrameLayout frameLayout = a80Var.f26721b;
                kh.h6 h6Var = (kh.h6) a80Var.f26722c;
                if (h6Var.getParent() != null) {
                    frameLayout.removeView(h6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.sh) a80Var.d);
                return;
            case 27:
                org.telegram.ui.o50 o50Var = ((org.telegram.ui.o40) this.f34835b).f40878o;
                org.telegram.ui.o50 o50Var2 = org.telegram.ui.o50.f40880z3;
                o50Var.b1();
                org.telegram.ui.o50.l0(o50Var).invalidate();
                o50Var.M.invalidate();
                if (o50Var.f40938o0) {
                    o50Var.f40938o0 = false;
                    o50Var.O0(true);
                    return;
                }
                return;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.c50 c50Var = (org.telegram.ui.c50) this.f34835b;
                c50Var.G = null;
                org.telegram.ui.o50 o50Var3 = c50Var.L;
                o50Var3.M.invalidate();
                o50Var3.W1.invalidate();
                org.telegram.ui.o50.x0(o50Var3).invalidate();
                org.telegram.ui.o50.I0(o50Var3);
                c50Var.H.clear();
                c50Var.I.clear();
                return;
            default:
                org.telegram.ui.p70 p70Var = (org.telegram.ui.p70) this.f34835b;
                p70Var.d = null;
                p70Var.f41351a = null;
                p70Var.f41352b = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f34834a) {
            case 8:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f34835b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
