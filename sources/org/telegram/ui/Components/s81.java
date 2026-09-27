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
import org.telegram.ui.di1;
import org.webrtc.OrientationHelper;
public final class s81 extends AnimatorListenerAdapter {
    public final int f28198a;
    public final Object f28199b;

    public s81(Object obj, int i10) {
        this.f28198a = i10;
        this.f28199b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28198a) {
            case 26:
                ((org.telegram.ui.ef0) this.f28199b).f33255s = null;
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
        org.telegram.ui.ActionBar.l lVar;
        float f7 = 0.0f;
        switch (this.f28198a) {
            case 0:
                x81 x81Var = (x81) this.f28199b;
                x81Var.J = false;
                x81Var.setEnabled(true);
                w81 w81Var = x81Var.f30377y;
                if (w81Var != null) {
                    ((l.d) w81Var).H(1.0f);
                }
                x81Var.invalidate();
                return;
            case 1:
                ((q91) this.f28199b).f27658e0 = null;
                return;
            case 2:
                ((s91) this.f28199b).K = null;
                return;
            case 3:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f28199b).view.setEnabled(true);
                return;
            case 4:
                org.telegram.ui.Components.voip.u uVar = ((org.telegram.ui.Components.voip.p) this.f28199b).f29480s0;
                if (uVar.f29616x0.getParent() != null) {
                    uVar.f29585a.removeView(uVar.f29616x0);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f28199b;
                if (x0Var.getParent() != null) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                    return;
                }
                return;
            case 6:
                di1 di1Var = (di1) this.f28199b;
                if (!di1Var.f29244a) {
                    di1Var.V.v.S = true;
                    di1Var.V.v.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.f28199b;
                r1Var.f29529i = false;
                r1Var.f29532l.setAlpha(35);
                r1Var.f29531k.setAlpha(102);
                r1Var.f29530j.setAlpha(35);
                r1Var.c();
                return;
            case 8:
                org.telegram.ui.Components.voip.v1 v1Var = ((org.telegram.ui.Components.voip.t1) this.f28199b).f29568c;
                v1Var.O = false;
                v1Var.requestLayout();
                return;
            case 9:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f28199b;
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
                t2Var.f29572b0 = null;
                return;
            case 10:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f28199b;
                if (w2Var.P) {
                    f7 = 1.0f;
                }
                w2Var.Q = f7;
                w2Var.a(w2Var.R, w2Var.S);
                return;
            case 11:
                ((org.telegram.ui.Components.voip.x2) this.f28199b).f29698c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.x2) this.f28199b).f29696a);
                if (((org.telegram.ui.Components.voip.x2) this.f28199b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.x2) this.f28199b).f29696a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.x2) this.f28199b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.x2) this.f28199b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.d3 d3Var = (org.telegram.ui.Components.voip.d3) this.f28199b;
                d3Var.J = false;
                d3Var.T.e = false;
                if (d3Var.U && (animatorSet = d3Var.Q) != null) {
                    animatorSet.cancel();
                    d3Var.Q.start();
                }
                d3Var.c();
                return;
            case 13:
                ((org.telegram.ui.Components.voip.l3) this.f28199b).e.setVisibility(8);
                return;
            case 14:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f28199b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.fu fuVar = (org.telegram.ui.fu) this.f28199b;
                if (animator.equals(fuVar.f33632n[0])) {
                    fuVar.f33632n[0] = null;
                    return;
                }
                return;
            case 16:
                org.telegram.ui.jv jvVar = (org.telegram.ui.jv) this.f28199b;
                org.telegram.ui.lv lvVar = jvVar.f34866n;
                org.telegram.ui.kv[] kvVarArr = lvVar.f35456f;
                lvVar.h = null;
                if (lvVar.f35459s) {
                    kvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.kv kvVar = kvVarArr[0];
                    kvVarArr[0] = kvVarArr[1];
                    kvVarArr[1] = kvVar;
                    kvVar.setVisibility(8);
                    if (lvVar.f35456f[0].f35163f == lvVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    lvVar.f35460w = z10;
                    lvVar.e.j(1.0f, lvVar.f35456f[0].f35163f);
                }
                lvVar.f35457n = false;
                jvVar.f34864c = false;
                jvVar.f34863b = false;
                org.telegram.ui.lv.f0(lvVar).setEnabled(true);
                lvVar.e.setEnabled(true);
                return;
            case 17:
                org.telegram.ui.tw twVar = (org.telegram.ui.tw) this.f28199b;
                org.telegram.ui.ty.u1(twVar.M, twVar.L, 0.0f);
                return;
            case 18:
                org.telegram.ui.ty tyVar = (org.telegram.ui.ty) this.f28199b;
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
                org.telegram.ui.ty tyVar2 = ((org.telegram.ui.my) this.f28199b).E0;
                tyVar2.f37985f3 = null;
                if (!tyVar2.j3) {
                    org.telegram.ui.sy[] syVarArr = tyVar2.f37976e0;
                    org.telegram.ui.sy syVar = syVarArr[0];
                    org.telegram.ui.sy syVar2 = syVarArr[1];
                    syVarArr[0] = syVar2;
                    syVarArr[1] = syVar;
                    tyVar2.f38079z0.g(1.0f, syVar2.h);
                    tyVar2.c5(false);
                    tyVar2.f37976e0[0].d.getClass();
                    tyVar2.f37976e0[1].d.getClass();
                }
                tyVar2.f37976e0[1].setVisibility(8);
                org.telegram.ui.ty.j1(tyVar2, true);
                tyVar2.f37990g3 = false;
                tyVar2.f38016m3 = false;
                lVar = ((org.telegram.ui.ActionBar.o2) tyVar2).actionBar;
                lVar.setEnabled(true);
                tyVar2.f38079z0.setEnabled(true);
                tyVar2.A3(tyVar2.f37976e0[0]);
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.py) this.f28199b).setScrollEnabled(true);
                return;
            case 21:
                e90 e90Var = (e90) this.f28199b;
                FrameLayout frameLayout = e90Var.f23990b;
                ci.r6 r6Var = (ci.r6) e90Var.f23991c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.h7) e90Var.d);
                return;
            case 22:
                org.telegram.ui.g60 g60Var = ((org.telegram.ui.g50) this.f28199b).f33718o;
                org.telegram.ui.g60 g60Var2 = org.telegram.ui.g60.D3;
                g60Var.b1();
                org.telegram.ui.g60.m0(g60Var).invalidate();
                g60Var.Q.invalidate();
                if (g60Var.f33799s0) {
                    g60Var.f33799s0 = false;
                    g60Var.O0(true);
                    return;
                }
                return;
            case 23:
                super.onAnimationEnd(animator);
                org.telegram.ui.u50 u50Var = (org.telegram.ui.u50) this.f28199b;
                u50Var.G = null;
                org.telegram.ui.g60 g60Var3 = u50Var.L;
                g60Var3.Q.invalidate();
                g60Var3.a2.invalidate();
                org.telegram.ui.g60.y0(g60Var3).invalidate();
                org.telegram.ui.g60.J0(g60Var3);
                u50Var.H.clear();
                u50Var.I.clear();
                return;
            case 24:
                org.telegram.ui.i80 i80Var = (org.telegram.ui.i80) this.f28199b;
                i80Var.d = null;
                i80Var.f34388a = null;
                i80Var.f34389b = false;
                return;
            case 25:
                org.telegram.ui.fd0 fd0Var = (org.telegram.ui.fd0) this.f28199b;
                fd0Var.H = false;
                fd0Var.o0();
                return;
            case 26:
                org.telegram.ui.ef0 ef0Var = (org.telegram.ui.ef0) this.f28199b;
                if (ef0Var.f33255s != null && ef0Var.f33253n != null) {
                    ef0Var.f33254r.setVisibility(4);
                    ef0Var.f33255s = null;
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.gj0) this.f28199b).T.setVisibility(8);
                return;
            case 28:
                org.telegram.ui.ak0 ak0Var = (org.telegram.ui.ak0) this.f28199b;
                ak0Var.f32093f = 1.0f;
                ak0Var.invalidate();
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f28199b;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28198a) {
            case 3:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f28199b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
