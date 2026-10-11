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
public final class k91 extends AnimatorListenerAdapter {
    public final int f27889a;
    public final Object f27890b;

    public k91(Object obj, int i10) {
        this.f27889a = i10;
        this.f27890b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27889a) {
            case 26:
                ((org.telegram.ui.ff0) this.f27890b).f37669s = null;
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
        switch (this.f27889a) {
            case 0:
                p91 p91Var = (p91) this.f27890b;
                p91Var.J = false;
                p91Var.setEnabled(true);
                o91 o91Var = p91Var.f29685y;
                if (o91Var != null) {
                    ((m2.t) o91Var).D(1.0f);
                }
                p91Var.invalidate();
                return;
            case 1:
                ((ia1) this.f27890b).f27254e0 = null;
                return;
            case 2:
                ((ka1) this.f27890b).K = null;
                return;
            case 3:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f27890b).view.setEnabled(true);
                return;
            case 4:
                org.telegram.ui.Components.voip.v vVar = ((org.telegram.ui.Components.voip.q) this.f27890b).f32208s0;
                if (vVar.f32342x0.getParent() != null) {
                    vVar.f32310a.removeView(vVar.f32342x0);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f27890b;
                if (y0Var.getParent() != null) {
                    ((ViewGroup) y0Var.getParent()).removeView(y0Var);
                    return;
                }
                return;
            case 6:
                ni1 ni1Var = (ni1) this.f27890b;
                if (!ni1Var.f31958a) {
                    ni1Var.V.v.S = true;
                    ni1Var.V.v.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.f27890b;
                r1Var.f32237i = false;
                r1Var.f32240l.setAlpha(35);
                r1Var.f32239k.setAlpha(102);
                r1Var.f32238j.setAlpha(35);
                r1Var.c();
                return;
            case 8:
                org.telegram.ui.Components.voip.v1 v1Var = ((org.telegram.ui.Components.voip.t1) this.f27890b).f32268c;
                v1Var.O = false;
                v1Var.requestLayout();
                return;
            case 9:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f27890b;
                t2Var.N = 0.0f;
                t2Var.O = 0.0f;
                org.telegram.ui.Components.voip.s2 s2Var = t2Var.d;
                s2Var.setScaleX(t2Var.T);
                s2Var.setScaleY(t2Var.T);
                TextureView textureView = t2Var.f32276e;
                if (textureView != null) {
                    textureView.setScaleX(t2Var.U);
                    textureView.setScaleY(t2Var.U);
                }
                t2Var.setTranslationY(0.0f);
                t2Var.setTranslationX(0.0f);
                t2Var.W = t2Var.V;
                t2Var.f32272b0 = null;
                return;
            case 10:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f27890b;
                if (w2Var.P) {
                    f7 = 1.0f;
                }
                w2Var.Q = f7;
                w2Var.a(w2Var.R, w2Var.S);
                return;
            case 11:
                ((org.telegram.ui.Components.voip.x2) this.f27890b).f32408c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.x2) this.f27890b).f32406a);
                if (((org.telegram.ui.Components.voip.x2) this.f27890b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.x2) this.f27890b).f32406a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.x2) this.f27890b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.x2) this.f27890b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.d3 d3Var = (org.telegram.ui.Components.voip.d3) this.f27890b;
                d3Var.J = false;
                d3Var.T.f32234e = false;
                if (d3Var.U && (animatorSet = d3Var.Q) != null) {
                    animatorSet.cancel();
                    d3Var.Q.start();
                }
                d3Var.c();
                return;
            case 13:
                ((org.telegram.ui.Components.voip.l3) this.f27890b).f32094e.setVisibility(8);
                return;
            case 14:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f27890b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.eu euVar = (org.telegram.ui.eu) this.f27890b;
                if (animator.equals(euVar.f37457n[0])) {
                    euVar.f37457n[0] = null;
                    return;
                }
                return;
            case 16:
                org.telegram.ui.jv jvVar = (org.telegram.ui.jv) this.f27890b;
                org.telegram.ui.lv lvVar = jvVar.f39132n;
                org.telegram.ui.kv[] kvVarArr = lvVar.f39737f;
                lvVar.h = null;
                if (lvVar.f39740s) {
                    kvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.kv kvVar = kvVarArr[0];
                    kvVarArr[0] = kvVarArr[1];
                    kvVarArr[1] = kvVar;
                    kvVar.setVisibility(8);
                    if (lvVar.f39737f[0].f39426f == lvVar.f39736e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    lvVar.f39741w = z10;
                    lvVar.f39736e.j(1.0f, lvVar.f39737f[0].f39426f);
                }
                lvVar.f39738n = false;
                jvVar.f39129c = false;
                jvVar.f39128b = false;
                org.telegram.ui.lv.f0(lvVar).setEnabled(true);
                lvVar.f39736e.setEnabled(true);
                return;
            case 17:
                org.telegram.ui.vw vwVar = (org.telegram.ui.vw) this.f27890b;
                org.telegram.ui.sy.n1(vwVar.M, vwVar.L, 0.0f);
                return;
            case 18:
                org.telegram.ui.sy syVar = (org.telegram.ui.sy) this.f27890b;
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
                org.telegram.ui.sy syVar2 = ((org.telegram.ui.ly) this.f27890b).E0;
                syVar2.f41916f3 = null;
                if (!syVar2.j3) {
                    org.telegram.ui.ry[] ryVarArr = syVar2.f41907e0;
                    org.telegram.ui.ry ryVar = ryVarArr[0];
                    org.telegram.ui.ry ryVar2 = ryVarArr[1];
                    ryVarArr[0] = ryVar2;
                    ryVarArr[1] = ryVar;
                    syVar2.f42011z0.g(1.0f, ryVar2.h);
                    syVar2.Q4(false);
                    syVar2.f41907e0[0].d.getClass();
                    syVar2.f41907e0[1].d.getClass();
                }
                syVar2.f41907e0[1].setVisibility(8);
                org.telegram.ui.sy.c1(syVar2, true);
                syVar2.f41921g3 = false;
                syVar2.f41947m3 = false;
                kVar = ((org.telegram.ui.ActionBar.m2) syVar2).actionBar;
                kVar.setEnabled(true);
                syVar2.f42011z0.setEnabled(true);
                syVar2.o3(syVar2.f41907e0[0]);
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.oy) this.f27890b).setScrollEnabled(true);
                return;
            case 21:
                u90 u90Var = (u90) this.f27890b;
                FrameLayout frameLayout = u90Var.f31355b;
                ci.r6 r6Var = (ci.r6) u90Var.f31356c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ei) u90Var.d);
                return;
            case 22:
                org.telegram.ui.g60 g60Var = ((org.telegram.ui.g50) this.f27890b).f37865o;
                org.telegram.ui.g60 g60Var2 = org.telegram.ui.g60.D3;
                g60Var.c1();
                org.telegram.ui.g60.n0(g60Var).invalidate();
                g60Var.Q.invalidate();
                if (g60Var.f37943s0) {
                    g60Var.f37943s0 = false;
                    g60Var.P0(true);
                    return;
                }
                return;
            case 23:
                super.onAnimationEnd(animator);
                org.telegram.ui.u50 u50Var = (org.telegram.ui.u50) this.f27890b;
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
                org.telegram.ui.j80 j80Var = (org.telegram.ui.j80) this.f27890b;
                j80Var.d = null;
                j80Var.f38937a = null;
                j80Var.f38938b = false;
                return;
            case 25:
                org.telegram.ui.gd0 gd0Var = (org.telegram.ui.gd0) this.f27890b;
                gd0Var.H = false;
                gd0Var.n0();
                return;
            case 26:
                org.telegram.ui.ff0 ff0Var = (org.telegram.ui.ff0) this.f27890b;
                if (ff0Var.f37669s != null && ff0Var.f37667n != null) {
                    ff0Var.f37668r.setVisibility(4);
                    ff0Var.f37669s = null;
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.kj0) this.f27890b).T.setVisibility(8);
                return;
            case 28:
                org.telegram.ui.ek0 ek0Var = (org.telegram.ui.ek0) this.f27890b;
                ek0Var.f37388f = 1.0f;
                ek0Var.invalidate();
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f27890b;
                if (animator.equals(notificationsCustomSettingsActivity.f33858e)) {
                    notificationsCustomSettingsActivity.f33858e = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27889a) {
            case 3:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f27890b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
