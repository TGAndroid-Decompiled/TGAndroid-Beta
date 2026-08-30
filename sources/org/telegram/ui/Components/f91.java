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
import org.telegram.ui.th1;
import org.webrtc.OrientationHelper;
public final class f91 extends AnimatorListenerAdapter {
    public final int f24825a;
    public final Object f24826b;

    public f91(Object obj, int i10) {
        this.f24825a = i10;
        this.f24826b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24825a) {
            case 24:
                ((org.telegram.ui.ze0) this.f24826b).f40784s = null;
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
        switch (this.f24825a) {
            case 0:
                ((h91) this.f24826b).H = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f24826b).view.setEnabled(true);
                return;
            case 2:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.f24826b).f29821p0;
                if (tVar.f29945u0.getParent() != null) {
                    tVar.f29919a.removeView(tVar.f29945u0);
                    return;
                }
                return;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.f24826b;
                if (u0Var.getParent() != null) {
                    ((ViewGroup) u0Var.getParent()).removeView(u0Var);
                    return;
                }
                return;
            case 4:
                th1 th1Var = (th1) this.f24826b;
                if (!th1Var.f29553a) {
                    th1Var.S.v.P = true;
                    th1Var.S.v.invalidate();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.f24826b;
                n1Var.f29801i = false;
                n1Var.f29804l.setAlpha(35);
                n1Var.f29803k.setAlpha(102);
                n1Var.f29802j.setAlpha(35);
                n1Var.c();
                return;
            case 6:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.f24826b).f29868c;
                s1Var.L = false;
                s1Var.requestLayout();
                return;
            case 7:
                org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) this.f24826b;
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
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f24826b;
                if (v2Var.M) {
                    f10 = 1.0f;
                }
                v2Var.N = f10;
                v2Var.a(v2Var.O, v2Var.P);
                return;
            case 9:
                ((org.telegram.ui.Components.voip.w2) this.f24826b).f30018c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.w2) this.f24826b).f30016a);
                if (((org.telegram.ui.Components.voip.w2) this.f24826b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.w2) this.f24826b).f30016a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.w2) this.f24826b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.w2) this.f24826b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.voip.c3 c3Var = (org.telegram.ui.Components.voip.c3) this.f24826b;
                c3Var.G = false;
                c3Var.Q.e = false;
                if (c3Var.R && (animatorSet = c3Var.N) != null) {
                    animatorSet.cancel();
                    c3Var.N.start();
                }
                c3Var.c();
                return;
            case 11:
                ((org.telegram.ui.Components.voip.k3) this.f24826b).e.setVisibility(8);
                return;
            case 12:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f24826b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 13:
                org.telegram.ui.eu euVar = (org.telegram.ui.eu) this.f24826b;
                if (animator.equals(euVar.f34086n[0])) {
                    euVar.f34086n[0] = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.iv ivVar = (org.telegram.ui.iv) this.f24826b;
                org.telegram.ui.kv kvVar = ivVar.f35171n;
                org.telegram.ui.jv[] jvVarArr = kvVar.f35821f;
                kvVar.h = null;
                if (kvVar.f35824s) {
                    jvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.jv jvVar = jvVarArr[0];
                    jvVarArr[0] = jvVarArr[1];
                    jvVarArr[1] = jvVar;
                    jvVar.setVisibility(8);
                    if (kvVar.f35821f[0].f35514f == kvVar.e.getFirstTabId()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    kvVar.f35825w = z4;
                    kvVar.e.j(1.0f, kvVar.f35821f[0].f35514f);
                }
                kvVar.f35822n = false;
                ivVar.f35169c = false;
                ivVar.f35168b = false;
                org.telegram.ui.kv.f0(kvVar).setEnabled(true);
                kvVar.e.setEnabled(true);
                return;
            case 15:
                org.telegram.ui.sw swVar = (org.telegram.ui.sw) this.f24826b;
                org.telegram.ui.oy.q1(swVar.M, swVar.L, 0.0f);
                return;
            case 16:
                org.telegram.ui.oy oyVar = (org.telegram.ui.oy) this.f24826b;
                boolean z11 = oyVar.D0;
                if (z11) {
                    f10 = 1.0f;
                }
                oyVar.E0 = f10;
                if (!z11) {
                    oyVar.B0.setVisibility(8);
                }
                View view = oyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.oy oyVar2 = ((org.telegram.ui.hy) this.f24826b).B0;
                oyVar2.c3 = null;
                if (!oyVar2.f37038g3) {
                    org.telegram.ui.ny[] nyVarArr = oyVar2.f37009b0;
                    org.telegram.ui.ny nyVar = nyVarArr[0];
                    org.telegram.ui.ny nyVar2 = nyVarArr[1];
                    nyVarArr[0] = nyVar2;
                    nyVarArr[1] = nyVar;
                    oyVar2.f37115w0.g(1.0f, nyVar2.h);
                    oyVar2.T4(false);
                    oyVar2.f37009b0[0].d.getClass();
                    oyVar2.f37009b0[1].d.getClass();
                }
                oyVar2.f37009b0[1].setVisibility(8);
                org.telegram.ui.oy.f1(oyVar2, true);
                oyVar2.f37022d3 = false;
                oyVar2.f37053j3 = false;
                kVar = ((org.telegram.ui.ActionBar.p2) oyVar2).actionBar;
                kVar.setEnabled(true);
                oyVar2.f37115w0.setEnabled(true);
                oyVar2.r3(oyVar2.f37009b0[0]);
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.ky) this.f24826b).setScrollEnabled(true);
                return;
            case 19:
                t80 t80Var = (t80) this.f24826b;
                FrameLayout frameLayout = t80Var.f28931b;
                eg.i0 i0Var = (eg.i0) t80Var.f28932c;
                if (i0Var.getParent() != null) {
                    frameLayout.removeView(i0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ai) t80Var.d);
                return;
            case 20:
                org.telegram.ui.c60 c60Var = ((org.telegram.ui.d50) this.f24826b).f33517o;
                org.telegram.ui.c60 c60Var2 = org.telegram.ui.c60.A3;
                c60Var.b1();
                org.telegram.ui.c60.m0(c60Var).invalidate();
                c60Var.N.invalidate();
                if (c60Var.f33158p0) {
                    c60Var.f33158p0 = false;
                    c60Var.O0(true);
                    return;
                }
                return;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.q50 q50Var = (org.telegram.ui.q50) this.f24826b;
                q50Var.G = null;
                org.telegram.ui.c60 c60Var3 = q50Var.L;
                c60Var3.N.invalidate();
                c60Var3.X1.invalidate();
                org.telegram.ui.c60.y0(c60Var3).invalidate();
                org.telegram.ui.c60.J0(c60Var3);
                q50Var.H.clear();
                q50Var.I.clear();
                return;
            case 22:
                org.telegram.ui.b80 b80Var = (org.telegram.ui.b80) this.f24826b;
                b80Var.d = null;
                b80Var.f32839a = null;
                b80Var.f32840b = false;
                return;
            case 23:
                org.telegram.ui.ad0 ad0Var = (org.telegram.ui.ad0) this.f24826b;
                ad0Var.E = false;
                ad0Var.o0();
                return;
            case 24:
                org.telegram.ui.ze0 ze0Var = (org.telegram.ui.ze0) this.f24826b;
                if (ze0Var.f40784s != null && ze0Var.f40782n != null) {
                    ze0Var.f40783r.setVisibility(4);
                    ze0Var.f40784s = null;
                    return;
                }
                return;
            case 25:
                ((org.telegram.ui.aj0) this.f24826b).Q.setVisibility(8);
                return;
            case 26:
                org.telegram.ui.uj0 uj0Var = (org.telegram.ui.uj0) this.f24826b;
                uj0Var.f38958f = 1.0f;
                uj0Var.invalidate();
                return;
            case 27:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f24826b;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
            case 28:
                org.telegram.ui.gp0 gp0Var = (org.telegram.ui.gp0) this.f24826b;
                org.telegram.ui.kc kcVar = gp0Var.L;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) gp0Var.L.getParent()).removeView(gp0Var.L);
                    }
                    gp0Var.L = null;
                }
                gp0Var.N = null;
                super.onAnimationEnd(animator);
                return;
            default:
                org.telegram.ui.hq0 hq0Var = (org.telegram.ui.hq0) this.f24826b;
                org.telegram.ui.kq0 kq0Var = hq0Var.A0;
                org.telegram.ui.iq0[] iq0VarArr = kq0Var.f35792n;
                kq0Var.f35793r = null;
                if (kq0Var.f35795w) {
                    iq0VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.iq0 iq0Var = iq0VarArr[0];
                    iq0VarArr[0] = iq0VarArr[1];
                    iq0VarArr[1] = iq0Var;
                    iq0Var.setVisibility(8);
                    if (kq0Var.f35792n[0].e == kq0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    kq0Var.e = z10;
                    kq0Var.h.j(1.0f, kq0Var.f35792n[0].e);
                }
                kq0Var.f35794s = false;
                hq0Var.f34935v0 = false;
                hq0Var.f34934u0 = false;
                org.telegram.ui.kq0.c0(kq0Var).setEnabled(true);
                kq0Var.h.setEnabled(true);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f24825a) {
            case 1:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f24826b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
