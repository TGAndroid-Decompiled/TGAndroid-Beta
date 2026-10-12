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
import org.telegram.ui.qi1;
import org.webrtc.OrientationHelper;
public final class o91 extends AnimatorListenerAdapter {
    public final int f29108a;
    public final Object f29109b;

    public o91(Object obj, int i10) {
        this.f29108a = i10;
        this.f29109b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29108a) {
            case 26:
                ((org.telegram.ui.hf0) this.f29109b).f38360s = null;
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
        switch (this.f29108a) {
            case 0:
                t91 t91Var = (t91) this.f29109b;
                t91Var.J = false;
                t91Var.setEnabled(true);
                s91 s91Var = t91Var.f30827y;
                if (s91Var != null) {
                    ((n4.l) s91Var).k(1.0f);
                }
                t91Var.invalidate();
                return;
            case 1:
                ((ma1) this.f29109b).f28511e0 = null;
                return;
            case 2:
                ((oa1) this.f29109b).K = null;
                return;
            case 3:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f29109b).view.setEnabled(true);
                return;
            case 4:
                org.telegram.ui.Components.voip.u uVar = ((org.telegram.ui.Components.voip.p) this.f29109b).f31885s0;
                if (uVar.f32027x0.getParent() != null) {
                    uVar.f31995a.removeView(uVar.f32027x0);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f29109b;
                if (y0Var.getParent() != null) {
                    ((ViewGroup) y0Var.getParent()).removeView(y0Var);
                    return;
                }
                return;
            case 6:
                qi1 qi1Var = (qi1) this.f29109b;
                if (!qi1Var.f31659a) {
                    qi1Var.V.v.S = true;
                    qi1Var.V.v.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.f29109b;
                r1Var.f31936i = false;
                r1Var.f31939l.setAlpha(35);
                r1Var.f31938k.setAlpha(102);
                r1Var.f31937j.setAlpha(35);
                r1Var.c();
                return;
            case 8:
                org.telegram.ui.Components.voip.v1 v1Var = ((org.telegram.ui.Components.voip.t1) this.f29109b).f31977c;
                v1Var.O = false;
                v1Var.requestLayout();
                return;
            case 9:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f29109b;
                t2Var.N = 0.0f;
                t2Var.O = 0.0f;
                org.telegram.ui.Components.voip.s2 s2Var = t2Var.d;
                s2Var.setScaleX(t2Var.T);
                s2Var.setScaleY(t2Var.T);
                TextureView textureView = t2Var.f31985e;
                if (textureView != null) {
                    textureView.setScaleX(t2Var.U);
                    textureView.setScaleY(t2Var.U);
                }
                t2Var.setTranslationY(0.0f);
                t2Var.setTranslationX(0.0f);
                t2Var.W = t2Var.V;
                t2Var.f31981b0 = null;
                return;
            case 10:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f29109b;
                if (w2Var.P) {
                    f7 = 1.0f;
                }
                w2Var.Q = f7;
                w2Var.a(w2Var.R, w2Var.S);
                return;
            case 11:
                ((org.telegram.ui.Components.voip.x2) this.f29109b).f32110c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.x2) this.f29109b).f32108a);
                if (((org.telegram.ui.Components.voip.x2) this.f29109b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.x2) this.f29109b).f32108a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.x2) this.f29109b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.x2) this.f29109b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.d3 d3Var = (org.telegram.ui.Components.voip.d3) this.f29109b;
                d3Var.J = false;
                d3Var.T.f31933e = false;
                if (d3Var.U && (animatorSet = d3Var.Q) != null) {
                    animatorSet.cancel();
                    d3Var.Q.start();
                }
                d3Var.c();
                return;
            case 13:
                ((org.telegram.ui.Components.voip.l3) this.f29109b).f31797e.setVisibility(8);
                return;
            case 14:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f29109b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.iu iuVar = (org.telegram.ui.iu) this.f29109b;
                if (animator.equals(iuVar.f38998n[0])) {
                    iuVar.f38998n[0] = null;
                    return;
                }
                return;
            case 16:
                org.telegram.ui.nv nvVar = (org.telegram.ui.nv) this.f29109b;
                org.telegram.ui.pv pvVar = nvVar.f40483n;
                org.telegram.ui.ov[] ovVarArr = pvVar.f41101f;
                pvVar.h = null;
                if (pvVar.f41104s) {
                    ovVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ov ovVar = ovVarArr[0];
                    ovVarArr[0] = ovVarArr[1];
                    ovVarArr[1] = ovVar;
                    ovVar.setVisibility(8);
                    if (pvVar.f41101f[0].f40782f == pvVar.f41100e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pvVar.f41105w = z10;
                    pvVar.f41100e.j(1.0f, pvVar.f41101f[0].f40782f);
                }
                pvVar.f41102n = false;
                nvVar.f40480c = false;
                nvVar.f40479b = false;
                org.telegram.ui.pv.f0(pvVar).setEnabled(true);
                pvVar.f41100e.setEnabled(true);
                return;
            case 17:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) this.f29109b;
                org.telegram.ui.vy.n1(ywVar.M, ywVar.L, 0.0f);
                return;
            case 18:
                org.telegram.ui.vy vyVar = (org.telegram.ui.vy) this.f29109b;
                boolean z11 = vyVar.G0;
                if (z11) {
                    f7 = 1.0f;
                }
                vyVar.H0 = f7;
                if (!z11) {
                    vyVar.E0.setVisibility(8);
                }
                View view = vyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.vy vyVar2 = ((org.telegram.ui.oy) this.f29109b).E0;
                vyVar2.f42912f3 = null;
                if (!vyVar2.j3) {
                    org.telegram.ui.uy[] uyVarArr = vyVar2.f42903e0;
                    org.telegram.ui.uy uyVar = uyVarArr[0];
                    org.telegram.ui.uy uyVar2 = uyVarArr[1];
                    uyVarArr[0] = uyVar2;
                    uyVarArr[1] = uyVar;
                    vyVar2.f43007z0.g(1.0f, uyVar2.h);
                    vyVar2.Q4(false);
                    vyVar2.f42903e0[0].d.getClass();
                    vyVar2.f42903e0[1].d.getClass();
                }
                vyVar2.f42903e0[1].setVisibility(8);
                org.telegram.ui.vy.c1(vyVar2, true);
                vyVar2.f42917g3 = false;
                vyVar2.f42943m3 = false;
                kVar = ((org.telegram.ui.ActionBar.m2) vyVar2).actionBar;
                kVar.setEnabled(true);
                vyVar2.f43007z0.setEnabled(true);
                vyVar2.o3(vyVar2.f42903e0[0]);
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.ry) this.f29109b).setScrollEnabled(true);
                return;
            case 21:
                x90 x90Var = (x90) this.f29109b;
                FrameLayout frameLayout = x90Var.f32688b;
                ci.r6 r6Var = (ci.r6) x90Var.f32689c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ii) x90Var.d);
                return;
            case 22:
                org.telegram.ui.i60 i60Var = ((org.telegram.ui.i50) this.f29109b).f38671o;
                org.telegram.ui.i60 i60Var2 = org.telegram.ui.i60.D3;
                i60Var.c1();
                org.telegram.ui.i60.n0(i60Var).invalidate();
                i60Var.Q.invalidate();
                if (i60Var.f38752s0) {
                    i60Var.f38752s0 = false;
                    i60Var.P0(true);
                    return;
                }
                return;
            case 23:
                super.onAnimationEnd(animator);
                org.telegram.ui.w50 w50Var = (org.telegram.ui.w50) this.f29109b;
                w50Var.G = null;
                org.telegram.ui.i60 i60Var3 = w50Var.L;
                i60Var3.Q.invalidate();
                i60Var3.a2.invalidate();
                org.telegram.ui.i60.z0(i60Var3).invalidate();
                org.telegram.ui.i60.K0(i60Var3);
                w50Var.H.clear();
                w50Var.I.clear();
                return;
            case 24:
                org.telegram.ui.m80 m80Var = (org.telegram.ui.m80) this.f29109b;
                m80Var.d = null;
                m80Var.f39939a = null;
                m80Var.f39940b = false;
                return;
            case 25:
                org.telegram.ui.id0 id0Var = (org.telegram.ui.id0) this.f29109b;
                id0Var.H = false;
                id0Var.n0();
                return;
            case 26:
                org.telegram.ui.hf0 hf0Var = (org.telegram.ui.hf0) this.f29109b;
                if (hf0Var.f38360s != null && hf0Var.f38358n != null) {
                    hf0Var.f38359r.setVisibility(4);
                    hf0Var.f38360s = null;
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.mj0) this.f29109b).T.setVisibility(8);
                return;
            case 28:
                org.telegram.ui.gk0 gk0Var = (org.telegram.ui.gk0) this.f29109b;
                gk0Var.f38082f = 1.0f;
                gk0Var.invalidate();
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f29109b;
                if (animator.equals(notificationsCustomSettingsActivity.f33667e)) {
                    notificationsCustomSettingsActivity.f33667e = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29108a) {
            case 3:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f29109b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
