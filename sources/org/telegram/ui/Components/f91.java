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
import org.telegram.ui.bi1;
import org.webrtc.OrientationHelper;
public final class f91 extends AnimatorListenerAdapter {
    public final int f26828a;
    public final Object f26829b;

    public f91(Object obj, int i10) {
        this.f26828a = i10;
        this.f26829b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26828a) {
            case 24:
                ((org.telegram.ui.af0) this.f26829b).f35164s = null;
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
        switch (this.f26828a) {
            case 0:
                ((h91) this.f26829b).H = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f26829b).view.setEnabled(true);
                return;
            case 2:
                org.telegram.ui.Components.voip.u uVar = ((org.telegram.ui.Components.voip.p) this.f26829b).f32258p0;
                if (uVar.f32392u0.getParent() != null) {
                    uVar.f32365a.removeView(uVar.f32392u0);
                    return;
                }
                return;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f26829b;
                if (v0Var.getParent() != null) {
                    ((ViewGroup) v0Var.getParent()).removeView(v0Var);
                    return;
                }
                return;
            case 4:
                bi1 bi1Var = (bi1) this.f26829b;
                if (!bi1Var.f31970a) {
                    bi1Var.S.v.P = true;
                    bi1Var.S.v.invalidate();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.f26829b;
                o1Var.f32238i = false;
                o1Var.f32241l.setAlpha(35);
                o1Var.f32240k.setAlpha(102);
                o1Var.f32239j.setAlpha(35);
                o1Var.c();
                return;
            case 6:
                org.telegram.ui.Components.voip.t1 t1Var = ((org.telegram.ui.Components.voip.r1) this.f26829b).f32310c;
                t1Var.L = false;
                t1Var.requestLayout();
                return;
            case 7:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f26829b;
                t2Var.K = 0.0f;
                t2Var.L = 0.0f;
                org.telegram.ui.Components.voip.s2 s2Var = t2Var.d;
                s2Var.setScaleX(t2Var.Q);
                s2Var.setScaleY(t2Var.Q);
                TextureView textureView = t2Var.f32357e;
                if (textureView != null) {
                    textureView.setScaleX(t2Var.R);
                    textureView.setScaleY(t2Var.R);
                }
                t2Var.setTranslationY(0.0f);
                t2Var.setTranslationX(0.0f);
                t2Var.T = t2Var.S;
                t2Var.V = null;
                return;
            case 8:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f26829b;
                if (w2Var.M) {
                    f10 = 1.0f;
                }
                w2Var.N = f10;
                w2Var.a(w2Var.O, w2Var.P);
                return;
            case 9:
                ((org.telegram.ui.Components.voip.x2) this.f26829b).f32471c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.x2) this.f26829b).f32469a);
                if (((org.telegram.ui.Components.voip.x2) this.f26829b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.x2) this.f26829b).f32469a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.x2) this.f26829b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.x2) this.f26829b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.voip.d3 d3Var = (org.telegram.ui.Components.voip.d3) this.f26829b;
                d3Var.G = false;
                d3Var.Q.f32235e = false;
                if (d3Var.R && (animatorSet = d3Var.N) != null) {
                    animatorSet.cancel();
                    d3Var.N.start();
                }
                d3Var.c();
                return;
            case 11:
                ((org.telegram.ui.Components.voip.l3) this.f26829b).f32188e.setVisibility(8);
                return;
            case 12:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f26829b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 13:
                org.telegram.ui.fu fuVar = (org.telegram.ui.fu) this.f26829b;
                if (animator.equals(fuVar.f36915n[0])) {
                    fuVar.f36915n[0] = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.jv jvVar = (org.telegram.ui.jv) this.f26829b;
                org.telegram.ui.lv lvVar = jvVar.f38132n;
                org.telegram.ui.kv[] kvVarArr = lvVar.f38788f;
                lvVar.h = null;
                if (lvVar.f38791s) {
                    kvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.kv kvVar = kvVarArr[0];
                    kvVarArr[0] = kvVarArr[1];
                    kvVarArr[1] = kvVar;
                    kvVar.setVisibility(8);
                    if (lvVar.f38788f[0].f38431f == lvVar.f38787e.getFirstTabId()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    lvVar.f38792w = z4;
                    lvVar.f38787e.j(1.0f, lvVar.f38788f[0].f38431f);
                }
                lvVar.f38789n = false;
                jvVar.f38129c = false;
                jvVar.f38128b = false;
                org.telegram.ui.lv.f0(lvVar).setEnabled(true);
                lvVar.f38787e.setEnabled(true);
                return;
            case 15:
                org.telegram.ui.tw twVar = (org.telegram.ui.tw) this.f26829b;
                org.telegram.ui.py.q1(twVar.M, twVar.L, 0.0f);
                return;
            case 16:
                org.telegram.ui.py pyVar = (org.telegram.ui.py) this.f26829b;
                boolean z11 = pyVar.D0;
                if (z11) {
                    f10 = 1.0f;
                }
                pyVar.E0 = f10;
                if (!z11) {
                    pyVar.B0.setVisibility(8);
                }
                View view = pyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.py pyVar2 = ((org.telegram.ui.iy) this.f26829b).B0;
                pyVar2.c3 = null;
                if (!pyVar2.f40185g3) {
                    org.telegram.ui.oy[] oyVarArr = pyVar2.f40155b0;
                    org.telegram.ui.oy oyVar = oyVarArr[0];
                    org.telegram.ui.oy oyVar2 = oyVarArr[1];
                    oyVarArr[0] = oyVar2;
                    oyVarArr[1] = oyVar;
                    pyVar2.f40262w0.g(1.0f, oyVar2.h);
                    pyVar2.T4(false);
                    pyVar2.f40155b0[0].d.getClass();
                    pyVar2.f40155b0[1].d.getClass();
                }
                pyVar2.f40155b0[1].setVisibility(8);
                org.telegram.ui.py.f1(pyVar2, true);
                pyVar2.f40168d3 = false;
                pyVar2.f40200j3 = false;
                kVar = ((org.telegram.ui.ActionBar.p2) pyVar2).actionBar;
                kVar.setEnabled(true);
                pyVar2.f40262w0.setEnabled(true);
                pyVar2.r3(pyVar2.f40155b0[0]);
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.ly) this.f26829b).setScrollEnabled(true);
                return;
            case 19:
                u80 u80Var = (u80) this.f26829b;
                FrameLayout frameLayout = u80Var.f31556b;
                fg.i0 i0Var = (fg.i0) u80Var.f31557c;
                if (i0Var.getParent() != null) {
                    frameLayout.removeView(i0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ai) u80Var.d);
                return;
            case 20:
                org.telegram.ui.d60 d60Var = ((org.telegram.ui.e50) this.f26829b).f36371o;
                org.telegram.ui.d60 d60Var2 = org.telegram.ui.d60.A3;
                d60Var.b1();
                org.telegram.ui.d60.m0(d60Var).invalidate();
                d60Var.N.invalidate();
                if (d60Var.f36051p0) {
                    d60Var.f36051p0 = false;
                    d60Var.O0(true);
                    return;
                }
                return;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.r50 r50Var = (org.telegram.ui.r50) this.f26829b;
                r50Var.G = null;
                org.telegram.ui.d60 d60Var3 = r50Var.L;
                d60Var3.N.invalidate();
                d60Var3.X1.invalidate();
                org.telegram.ui.d60.y0(d60Var3).invalidate();
                org.telegram.ui.d60.J0(d60Var3);
                r50Var.H.clear();
                r50Var.I.clear();
                return;
            case 22:
                org.telegram.ui.c80 c80Var = (org.telegram.ui.c80) this.f26829b;
                c80Var.d = null;
                c80Var.f35712a = null;
                c80Var.f35713b = false;
                return;
            case 23:
                org.telegram.ui.bd0 bd0Var = (org.telegram.ui.bd0) this.f26829b;
                bd0Var.E = false;
                bd0Var.o0();
                return;
            case 24:
                org.telegram.ui.af0 af0Var = (org.telegram.ui.af0) this.f26829b;
                if (af0Var.f35164s != null && af0Var.f35162n != null) {
                    af0Var.f35163r.setVisibility(4);
                    af0Var.f35164s = null;
                    return;
                }
                return;
            case 25:
                ((org.telegram.ui.bj0) this.f26829b).Q.setVisibility(8);
                return;
            case 26:
                org.telegram.ui.wj0 wj0Var = (org.telegram.ui.wj0) this.f26829b;
                wj0Var.f42797f = 1.0f;
                wj0Var.invalidate();
                return;
            case 27:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f26829b;
                if (animator.equals(notificationsCustomSettingsActivity.f34187e)) {
                    notificationsCustomSettingsActivity.f34187e = null;
                    return;
                }
                return;
            case 28:
                org.telegram.ui.np0 np0Var = (org.telegram.ui.np0) this.f26829b;
                org.telegram.ui.jc jcVar = np0Var.U;
                if (jcVar != null) {
                    if (jcVar.getParent() != null) {
                        ((ViewGroup) np0Var.U.getParent()).removeView(np0Var.U);
                    }
                    np0Var.U = null;
                }
                np0Var.W = null;
                super.onAnimationEnd(animator);
                return;
            default:
                org.telegram.ui.oq0 oq0Var = (org.telegram.ui.oq0) this.f26829b;
                org.telegram.ui.rq0 rq0Var = oq0Var.A0;
                org.telegram.ui.pq0[] pq0VarArr = rq0Var.f40916n;
                rq0Var.f40917r = null;
                if (rq0Var.f40919w) {
                    pq0VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.pq0 pq0Var = pq0VarArr[0];
                    pq0VarArr[0] = pq0VarArr[1];
                    pq0VarArr[1] = pq0Var;
                    pq0Var.setVisibility(8);
                    if (rq0Var.f40916n[0].f40106e == rq0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rq0Var.f40914e = z10;
                    rq0Var.h.j(1.0f, rq0Var.f40916n[0].f40106e);
                }
                rq0Var.f40918s = false;
                oq0Var.f39781v0 = false;
                oq0Var.f39780u0 = false;
                org.telegram.ui.rq0.c0(rq0Var).setEnabled(true);
                rq0Var.h.setEnabled(true);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f26828a) {
            case 1:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f26829b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
