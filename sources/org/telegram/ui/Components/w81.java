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
import org.telegram.ui.mi1;
import org.webrtc.OrientationHelper;
public final class w81 extends AnimatorListenerAdapter {
    public final int f29613a;
    public final Object f29614b;

    public w81(Object obj, int i10) {
        this.f29613a = i10;
        this.f29614b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29613a) {
            case 25:
                ((org.telegram.ui.jf0) this.f29614b).f34874s = null;
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
        switch (this.f29613a) {
            case 0:
                ((d91) this.f29614b).f23274e0 = null;
                return;
            case 1:
                ((f91) this.f29614b).K = null;
                return;
            case 2:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f29614b).view.setEnabled(true);
                return;
            case 3:
                org.telegram.ui.Components.voip.u uVar = ((org.telegram.ui.Components.voip.p) this.f29614b).f29128s0;
                if (uVar.f29251x0.getParent() != null) {
                    uVar.f29220a.removeView(uVar.f29251x0);
                    return;
                }
                return;
            case 4:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f29614b;
                if (x0Var.getParent() != null) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                    return;
                }
                return;
            case 5:
                mi1 mi1Var = (mi1) this.f29614b;
                if (!mi1Var.f28885a) {
                    mi1Var.V.v.S = true;
                    mi1Var.V.v.invalidate();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.voip.q1 q1Var = (org.telegram.ui.Components.voip.q1) this.f29614b;
                q1Var.f29154i = false;
                q1Var.f29157l.setAlpha(35);
                q1Var.f29156k.setAlpha(102);
                q1Var.f29155j.setAlpha(35);
                q1Var.c();
                return;
            case 7:
                org.telegram.ui.Components.voip.u1 u1Var = ((org.telegram.ui.Components.voip.s1) this.f29614b).f29182c;
                u1Var.O = false;
                u1Var.requestLayout();
                return;
            case 8:
                org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) this.f29614b;
                s2Var.N = 0.0f;
                s2Var.O = 0.0f;
                org.telegram.ui.Components.voip.r2 r2Var = s2Var.d;
                r2Var.setScaleX(s2Var.T);
                r2Var.setScaleY(s2Var.T);
                TextureView textureView = s2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(s2Var.U);
                    textureView.setScaleY(s2Var.U);
                }
                s2Var.setTranslationY(0.0f);
                s2Var.setTranslationX(0.0f);
                s2Var.W = s2Var.V;
                s2Var.f29186b0 = null;
                return;
            case 9:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f29614b;
                if (v2Var.P) {
                    f7 = 1.0f;
                }
                v2Var.Q = f7;
                v2Var.a(v2Var.R, v2Var.S);
                return;
            case 10:
                ((org.telegram.ui.Components.voip.w2) this.f29614b).f29313c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.w2) this.f29614b).f29311a);
                if (((org.telegram.ui.Components.voip.w2) this.f29614b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.w2) this.f29614b).f29311a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.w2) this.f29614b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.w2) this.f29614b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.voip.c3 c3Var = (org.telegram.ui.Components.voip.c3) this.f29614b;
                c3Var.J = false;
                c3Var.T.e = false;
                if (c3Var.U && (animatorSet = c3Var.Q) != null) {
                    animatorSet.cancel();
                    c3Var.Q.start();
                }
                c3Var.c();
                return;
            case 12:
                ((org.telegram.ui.Components.voip.k3) this.f29614b).e.setVisibility(8);
                return;
            case 13:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f29614b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.ju juVar = (org.telegram.ui.ju) this.f29614b;
                if (animator.equals(juVar.f34941n[0])) {
                    juVar.f34941n[0] = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.nv nvVar = (org.telegram.ui.nv) this.f29614b;
                org.telegram.ui.pv pvVar = nvVar.f36171n;
                org.telegram.ui.ov[] ovVarArr = pvVar.f36742f;
                pvVar.h = null;
                if (pvVar.f36745s) {
                    ovVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ov ovVar = ovVarArr[0];
                    ovVarArr[0] = ovVarArr[1];
                    ovVarArr[1] = ovVar;
                    ovVar.setVisibility(8);
                    if (pvVar.f36742f[0].f36436f == pvVar.e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pvVar.f36746w = z10;
                    pvVar.e.j(1.0f, pvVar.f36742f[0].f36436f);
                }
                pvVar.f36743n = false;
                nvVar.f36169c = false;
                nvVar.f36168b = false;
                org.telegram.ui.pv.f0(pvVar).setEnabled(true);
                pvVar.e.setEnabled(true);
                return;
            case 16:
                org.telegram.ui.zw zwVar = (org.telegram.ui.zw) this.f29614b;
                org.telegram.ui.wy.q1(zwVar.M, zwVar.L, 0.0f);
                return;
            case 17:
                org.telegram.ui.wy wyVar = (org.telegram.ui.wy) this.f29614b;
                boolean z11 = wyVar.G0;
                if (z11) {
                    f7 = 1.0f;
                }
                wyVar.H0 = f7;
                if (!z11) {
                    wyVar.E0.setVisibility(8);
                }
                View view = wyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 18:
                org.telegram.ui.wy wyVar2 = ((org.telegram.ui.py) this.f29614b).E0;
                wyVar2.f39230f3 = null;
                if (!wyVar2.j3) {
                    org.telegram.ui.vy[] vyVarArr = wyVar2.f39221e0;
                    org.telegram.ui.vy vyVar = vyVarArr[0];
                    org.telegram.ui.vy vyVar2 = vyVarArr[1];
                    vyVarArr[0] = vyVar2;
                    vyVarArr[1] = vyVar;
                    wyVar2.f39325z0.g(1.0f, vyVar2.h);
                    wyVar2.T4(false);
                    wyVar2.f39221e0[0].d.getClass();
                    wyVar2.f39221e0[1].d.getClass();
                }
                wyVar2.f39221e0[1].setVisibility(8);
                org.telegram.ui.wy.f1(wyVar2, true);
                wyVar2.f39235g3 = false;
                wyVar2.f39261m3 = false;
                kVar = ((org.telegram.ui.ActionBar.o2) wyVar2).actionBar;
                kVar.setEnabled(true);
                wyVar2.f39325z0.setEnabled(true);
                wyVar2.r3(wyVar2.f39221e0[0]);
                return;
            case 19:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.sy) this.f29614b).setScrollEnabled(true);
                return;
            case 20:
                r80 r80Var = (r80) this.f29614b;
                FrameLayout frameLayout = r80Var.f27578b;
                ci.s6 s6Var = (ci.s6) r80Var.f27579c;
                if (s6Var.getParent() != null) {
                    frameLayout.removeView(s6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.g7) r80Var.d);
                return;
            case 21:
                org.telegram.ui.k60 k60Var = ((org.telegram.ui.k50) this.f29614b).f34998o;
                org.telegram.ui.k60 k60Var2 = org.telegram.ui.k60.D3;
                k60Var.b1();
                org.telegram.ui.k60.m0(k60Var).invalidate();
                k60Var.Q.invalidate();
                if (k60Var.f35090s0) {
                    k60Var.f35090s0 = false;
                    k60Var.O0(true);
                    return;
                }
                return;
            case 22:
                super.onAnimationEnd(animator);
                org.telegram.ui.y50 y50Var = (org.telegram.ui.y50) this.f29614b;
                y50Var.G = null;
                org.telegram.ui.k60 k60Var3 = y50Var.L;
                k60Var3.Q.invalidate();
                k60Var3.a2.invalidate();
                org.telegram.ui.k60.y0(k60Var3).invalidate();
                org.telegram.ui.k60.J0(k60Var3);
                y50Var.H.clear();
                y50Var.I.clear();
                return;
            case 23:
                org.telegram.ui.m80 m80Var = (org.telegram.ui.m80) this.f29614b;
                m80Var.d = null;
                m80Var.f35706a = null;
                m80Var.f35707b = false;
                return;
            case 24:
                org.telegram.ui.kd0 kd0Var = (org.telegram.ui.kd0) this.f29614b;
                kd0Var.H = false;
                kd0Var.o0();
                return;
            case 25:
                org.telegram.ui.jf0 jf0Var = (org.telegram.ui.jf0) this.f29614b;
                if (jf0Var.f34874s != null && jf0Var.f34872n != null) {
                    jf0Var.f34873r.setVisibility(4);
                    jf0Var.f34874s = null;
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.lj0) this.f29614b).T.setVisibility(8);
                return;
            case 27:
                org.telegram.ui.gk0 gk0Var = (org.telegram.ui.gk0) this.f29614b;
                gk0Var.f34012f = 1.0f;
                gk0Var.invalidate();
                return;
            case 28:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f29614b;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
            default:
                org.telegram.ui.cq0 cq0Var = (org.telegram.ui.cq0) this.f29614b;
                org.telegram.ui.nc ncVar = cq0Var.X;
                if (ncVar != null) {
                    if (ncVar.getParent() != null) {
                        ((ViewGroup) cq0Var.X.getParent()).removeView(cq0Var.X);
                    }
                    cq0Var.X = null;
                }
                cq0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29613a) {
            case 2:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f29614b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
