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
import org.telegram.ui.ni1;
import org.webrtc.OrientationHelper;
public final class j91 extends AnimatorListenerAdapter {
    public final int f27678a;
    public final Object f27679b;

    public j91(Object obj, int i10) {
        this.f27678a = i10;
        this.f27679b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27678a) {
            case 26:
                ((org.telegram.ui.ff0) this.f27679b).f37703s = null;
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
        switch (this.f27678a) {
            case 0:
                o91 o91Var = (o91) this.f27679b;
                o91Var.J = false;
                o91Var.setEnabled(true);
                n91 n91Var = o91Var.f29457y;
                if (n91Var != null) {
                    ((m2.t) n91Var).D(1.0f);
                }
                o91Var.invalidate();
                return;
            case 1:
                ((ha1) this.f27679b).f27046e0 = null;
                return;
            case 2:
                ((ja1) this.f27679b).K = null;
                return;
            case 3:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f27679b).view.setEnabled(true);
                return;
            case 4:
                org.telegram.ui.Components.voip.v vVar = ((org.telegram.ui.Components.voip.q) this.f27679b).f32272s0;
                if (vVar.f32406x0.getParent() != null) {
                    vVar.f32374a.removeView(vVar.f32406x0);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f27679b;
                if (y0Var.getParent() != null) {
                    ((ViewGroup) y0Var.getParent()).removeView(y0Var);
                    return;
                }
                return;
            case 6:
                ni1 ni1Var = (ni1) this.f27679b;
                if (!ni1Var.f32022a) {
                    ni1Var.V.v.S = true;
                    ni1Var.V.v.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.f27679b;
                r1Var.f32301i = false;
                r1Var.f32304l.setAlpha(35);
                r1Var.f32303k.setAlpha(102);
                r1Var.f32302j.setAlpha(35);
                r1Var.c();
                return;
            case 8:
                org.telegram.ui.Components.voip.v1 v1Var = ((org.telegram.ui.Components.voip.t1) this.f27679b).f32332c;
                v1Var.O = false;
                v1Var.requestLayout();
                return;
            case 9:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f27679b;
                t2Var.N = 0.0f;
                t2Var.O = 0.0f;
                org.telegram.ui.Components.voip.s2 s2Var = t2Var.d;
                s2Var.setScaleX(t2Var.T);
                s2Var.setScaleY(t2Var.T);
                TextureView textureView = t2Var.f32340e;
                if (textureView != null) {
                    textureView.setScaleX(t2Var.U);
                    textureView.setScaleY(t2Var.U);
                }
                t2Var.setTranslationY(0.0f);
                t2Var.setTranslationX(0.0f);
                t2Var.W = t2Var.V;
                t2Var.f32336b0 = null;
                return;
            case 10:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f27679b;
                if (w2Var.P) {
                    f7 = 1.0f;
                }
                w2Var.Q = f7;
                w2Var.a(w2Var.R, w2Var.S);
                return;
            case 11:
                ((org.telegram.ui.Components.voip.x2) this.f27679b).f32472c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.x2) this.f27679b).f32470a);
                if (((org.telegram.ui.Components.voip.x2) this.f27679b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.x2) this.f27679b).f32470a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.x2) this.f27679b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.x2) this.f27679b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.d3 d3Var = (org.telegram.ui.Components.voip.d3) this.f27679b;
                d3Var.J = false;
                d3Var.T.f32298e = false;
                if (d3Var.U && (animatorSet = d3Var.Q) != null) {
                    animatorSet.cancel();
                    d3Var.Q.start();
                }
                d3Var.c();
                return;
            case 13:
                ((org.telegram.ui.Components.voip.l3) this.f27679b).f32158e.setVisibility(8);
                return;
            case 14:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f27679b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.eu euVar = (org.telegram.ui.eu) this.f27679b;
                if (animator.equals(euVar.f37491n[0])) {
                    euVar.f37491n[0] = null;
                    return;
                }
                return;
            case 16:
                org.telegram.ui.jv jvVar = (org.telegram.ui.jv) this.f27679b;
                org.telegram.ui.lv lvVar = jvVar.f39166n;
                org.telegram.ui.kv[] kvVarArr = lvVar.f39771f;
                lvVar.h = null;
                if (lvVar.f39774s) {
                    kvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.kv kvVar = kvVarArr[0];
                    kvVarArr[0] = kvVarArr[1];
                    kvVarArr[1] = kvVar;
                    kvVar.setVisibility(8);
                    if (lvVar.f39771f[0].f39460f == lvVar.f39770e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    lvVar.f39775w = z10;
                    lvVar.f39770e.j(1.0f, lvVar.f39771f[0].f39460f);
                }
                lvVar.f39772n = false;
                jvVar.f39163c = false;
                jvVar.f39162b = false;
                org.telegram.ui.lv.f0(lvVar).setEnabled(true);
                lvVar.f39770e.setEnabled(true);
                return;
            case 17:
                org.telegram.ui.vw vwVar = (org.telegram.ui.vw) this.f27679b;
                org.telegram.ui.sy.n1(vwVar.M, vwVar.L, 0.0f);
                return;
            case 18:
                org.telegram.ui.sy syVar = (org.telegram.ui.sy) this.f27679b;
                boolean z11 = syVar.G0;
                if (z11) {
                    f7 = 1.0f;
                }
                syVar.H0 = f7;
                if (!z11) {
                    syVar.E0.setVisibility(8);
                }
                View view = syVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.sy syVar2 = ((org.telegram.ui.ly) this.f27679b).E0;
                syVar2.f41950f3 = null;
                if (!syVar2.j3) {
                    org.telegram.ui.ry[] ryVarArr = syVar2.f41941e0;
                    org.telegram.ui.ry ryVar = ryVarArr[0];
                    org.telegram.ui.ry ryVar2 = ryVarArr[1];
                    ryVarArr[0] = ryVar2;
                    ryVarArr[1] = ryVar;
                    syVar2.f42045z0.g(1.0f, ryVar2.h);
                    syVar2.Q4(false);
                    syVar2.f41941e0[0].d.getClass();
                    syVar2.f41941e0[1].d.getClass();
                }
                syVar2.f41941e0[1].setVisibility(8);
                org.telegram.ui.sy.c1(syVar2, true);
                syVar2.f41955g3 = false;
                syVar2.f41981m3 = false;
                kVar = ((org.telegram.ui.ActionBar.m2) syVar2).actionBar;
                kVar.setEnabled(true);
                syVar2.f42045z0.setEnabled(true);
                syVar2.o3(syVar2.f41941e0[0]);
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.oy) this.f27679b).setScrollEnabled(true);
                return;
            case 21:
                t90 t90Var = (t90) this.f27679b;
                FrameLayout frameLayout = t90Var.f31181b;
                ci.r6 r6Var = (ci.r6) t90Var.f31182c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ei) t90Var.d);
                return;
            case 22:
                org.telegram.ui.g60 g60Var = ((org.telegram.ui.g50) this.f27679b).f37899o;
                org.telegram.ui.g60 g60Var2 = org.telegram.ui.g60.D3;
                g60Var.c1();
                org.telegram.ui.g60.n0(g60Var).invalidate();
                g60Var.Q.invalidate();
                if (g60Var.f37977s0) {
                    g60Var.f37977s0 = false;
                    g60Var.P0(true);
                    return;
                }
                return;
            case 23:
                super.onAnimationEnd(animator);
                org.telegram.ui.u50 u50Var = (org.telegram.ui.u50) this.f27679b;
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
                org.telegram.ui.j80 j80Var = (org.telegram.ui.j80) this.f27679b;
                j80Var.d = null;
                j80Var.f38971a = null;
                j80Var.f38972b = false;
                return;
            case 25:
                org.telegram.ui.gd0 gd0Var = (org.telegram.ui.gd0) this.f27679b;
                gd0Var.H = false;
                gd0Var.n0();
                return;
            case 26:
                org.telegram.ui.ff0 ff0Var = (org.telegram.ui.ff0) this.f27679b;
                if (ff0Var.f37703s != null && ff0Var.f37701n != null) {
                    ff0Var.f37702r.setVisibility(4);
                    ff0Var.f37703s = null;
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.kj0) this.f27679b).T.setVisibility(8);
                return;
            case 28:
                org.telegram.ui.ek0 ek0Var = (org.telegram.ui.ek0) this.f27679b;
                ek0Var.f37422f = 1.0f;
                ek0Var.invalidate();
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f27679b;
                if (animator.equals(notificationsCustomSettingsActivity.f33892e)) {
                    notificationsCustomSettingsActivity.f33892e = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27678a) {
            case 3:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f27679b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
