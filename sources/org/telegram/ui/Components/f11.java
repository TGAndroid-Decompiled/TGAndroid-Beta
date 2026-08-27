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
import org.telegram.ui.eh1;
import org.webrtc.OrientationHelper;

public final class f11 extends AnimatorListenerAdapter {

    public final int f28228a;

    public final Object f28229b;

    public f11(Object obj, int i10) {
        this.f28228a = i10;
        this.f28229b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        switch (this.f28228a) {
            case 0:
                ((g11) this.f28229b).setVisibility(8);
                break;
            case 1:
                jh.a3 a3Var = ((y11) this.f28229b).f34782f;
                a3Var.setScaleX(1.0f);
                a3Var.setScaleY(1.0f);
                a3Var.invalidate();
                break;
            case 2:
                c21 c21Var = (c21) this.f28229b;
                c21Var.G = 1.0f;
                c21Var.h.invalidate();
                break;
            case 3:
                ((j41) this.f28229b).H = null;
                break;
            case 4:
                UndoView undoView = (UndoView) this.f28229b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 5:
                r51 r51Var = (r51) this.f28229b;
                if (r51Var.f32088a.getTag() == null) {
                    r51Var.f32088a.setVisibility(4);
                }
                break;
            case 6:
                super.onAnimationEnd(animator);
                s51 s51Var = (s51) this.f28229b;
                s51Var.f32339b = 0.0f;
                s51Var.setTranslationY(0.0f);
                s51Var.f32338a = null;
                break;
            case 7:
                o71 o71Var = (o71) this.f28229b;
                o71Var.F = false;
                o71Var.setEnabled(true);
                n71 n71Var = o71Var.f31227y;
                if (n71Var != null) {
                    ((m5.o) n71Var).x(1.0f);
                }
                o71Var.invalidate();
                break;
            case 8:
                ((i81) this.f28229b).f29296a0 = null;
                break;
            case 9:
                ((k81) this.f28229b).G = null;
                break;
            case 10:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f28229b).view.setEnabled(true);
                break;
            case 11:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.f28229b).f33776o0;
                if (tVar.f33897t0.getParent() != null) {
                    tVar.f33871a.removeView(tVar.f33897t0);
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.f28229b;
                if (u0Var.getParent() != null) {
                    ((ViewGroup) u0Var.getParent()).removeView(u0Var);
                }
                break;
            case 13:
                eh1 eh1Var = (eh1) this.f28229b;
                if (!eh1Var.f33475a) {
                    eh1Var.R.v.O = true;
                    eh1Var.R.v.invalidate();
                }
                break;
            case 14:
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.f28229b;
                n1Var.f33742i = false;
                n1Var.f33745l.setAlpha(35);
                n1Var.f33744k.setAlpha(102);
                n1Var.f33743j.setAlpha(35);
                n1Var.c();
                break;
            case 15:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.f28229b).f33815c;
                s1Var.K = false;
                s1Var.requestLayout();
                break;
            case 16:
                org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) this.f28229b;
                r2Var.J = 0.0f;
                r2Var.K = 0.0f;
                org.telegram.ui.Components.voip.q2 q2Var = r2Var.d;
                q2Var.setScaleX(r2Var.P);
                q2Var.setScaleY(r2Var.P);
                TextureView textureView = r2Var.f33827e;
                if (textureView != null) {
                    textureView.setScaleX(r2Var.Q);
                    textureView.setScaleY(r2Var.Q);
                }
                r2Var.setTranslationY(0.0f);
                r2Var.setTranslationX(0.0f);
                r2Var.S = r2Var.R;
                r2Var.U = null;
                break;
            case 17:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.f28229b;
                u2Var.M = u2Var.L ? 1.0f : 0.0f;
                u2Var.a(u2Var.N, u2Var.O);
                break;
            case 18:
                ((org.telegram.ui.Components.voip.v2) this.f28229b).f33959c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.v2) this.f28229b).f33957a);
                if (((org.telegram.ui.Components.voip.v2) this.f28229b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.v2) this.f28229b).f33957a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.v2) this.f28229b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.v2) this.f28229b);
                        break;
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                }
                break;
            case 19:
                org.telegram.ui.Components.voip.b3 b3Var = (org.telegram.ui.Components.voip.b3) this.f28229b;
                b3Var.F = false;
                b3Var.P.f33739e = false;
                if (b3Var.Q && (animatorSet = b3Var.M) != null) {
                    animatorSet.cancel();
                    b3Var.M.start();
                }
                b3Var.c();
                break;
            case 20:
                ((org.telegram.ui.Components.voip.j3) this.f28229b).f33641e.setVisibility(8);
                break;
            case 21:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f28229b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                }
                break;
            case 22:
                org.telegram.ui.yt ytVar = (org.telegram.ui.yt) this.f28229b;
                if (animator.equals(ytVar.f44896n[0])) {
                    ytVar.f44896n[0] = null;
                }
                break;
            case 23:
                org.telegram.ui.cv cvVar = (org.telegram.ui.cv) this.f28229b;
                org.telegram.ui.ev evVar = cvVar.f37175n;
                org.telegram.ui.dv[] dvVarArr = evVar.f37857f;
                evVar.h = null;
                if (evVar.f37860s) {
                    dvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.dv dvVar = dvVarArr[0];
                    dvVarArr[0] = dvVarArr[1];
                    dvVarArr[1] = dvVar;
                    dvVar.setVisibility(8);
                    evVar.f37861w = evVar.f37857f[0].f37557f == evVar.f37856e.getFirstTabId();
                    evVar.f37856e.j(1.0f, evVar.f37857f[0].f37557f);
                }
                evVar.f37858n = false;
                cvVar.f37172c = false;
                cvVar.f37171b = false;
                ((org.telegram.ui.ActionBar.n2) evVar).actionBar.setEnabled(true);
                evVar.f37856e.setEnabled(true);
                break;
            case 24:
                org.telegram.ui.kw kwVar = (org.telegram.ui.kw) this.f28229b;
                org.telegram.ui.gy.q1(kwVar.M, kwVar.L, 0.0f);
                break;
            case 25:
                org.telegram.ui.gy gyVar = (org.telegram.ui.gy) this.f28229b;
                boolean z10 = gyVar.C0;
                gyVar.D0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    gyVar.A0.setVisibility(8);
                }
                View view = gyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                break;
            case 26:
                org.telegram.ui.gy gyVar2 = ((org.telegram.ui.yx) this.f28229b).A0;
                gyVar2.f38505b3 = null;
                if (!gyVar2.f38528f3) {
                    org.telegram.ui.fy[] fyVarArr = gyVar2.f38498a0;
                    org.telegram.ui.fy fyVar = fyVarArr[0];
                    org.telegram.ui.fy fyVar2 = fyVarArr[1];
                    fyVarArr[0] = fyVar2;
                    fyVarArr[1] = fyVar;
                    gyVar2.f38604v0.g(1.0f, fyVar2.h);
                    gyVar2.T4(false);
                    gyVar2.f38498a0[0].d.getClass();
                    gyVar2.f38498a0[1].d.getClass();
                }
                gyVar2.f38498a0[1].setVisibility(8);
                org.telegram.ui.gy.f1(gyVar2, true);
                gyVar2.f38511c3 = false;
                gyVar2.f38543i3 = false;
                ((org.telegram.ui.ActionBar.n2) gyVar2).actionBar.setEnabled(true);
                gyVar2.f38604v0.setEnabled(true);
                gyVar2.r3(gyVar2.f38498a0[0]);
                break;
            case 27:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.cy) this.f28229b).setScrollEnabled(true);
                break;
            case 28:
                e80 e80Var = (e80) this.f28229b;
                FrameLayout frameLayout = e80Var.f27970b;
                ag.t0 t0Var = (ag.t0) e80Var.f27971c;
                if (t0Var.getParent() != null) {
                    frameLayout.removeView(t0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.uh) e80Var.d);
                break;
            default:
                org.telegram.ui.s50 s50Var = ((org.telegram.ui.s40) this.f28229b).f42404o;
                org.telegram.ui.s50 s50Var2 = org.telegram.ui.s50.f42409z3;
                s50Var.b1();
                ((org.telegram.ui.ActionBar.e3) s50Var).containerView.invalidate();
                s50Var.M.invalidate();
                if (s50Var.f42467o0) {
                    s50Var.f42467o0 = false;
                    s50Var.O0(true);
                }
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28228a) {
            case 10:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f28229b).view.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
