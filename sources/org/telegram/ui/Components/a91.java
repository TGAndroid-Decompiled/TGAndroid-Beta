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
import org.telegram.ui.fi1;
import org.webrtc.OrientationHelper;
public final class a91 extends AnimatorListenerAdapter {
    public final int f24498a;
    public final Object f24499b;

    public a91(Object obj, int i10) {
        this.f24498a = i10;
        this.f24499b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24498a) {
            case 26:
                ((org.telegram.ui.ff0) this.f24499b).f36297s = null;
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
        switch (this.f24498a) {
            case 0:
                f91 f91Var = (f91) this.f24499b;
                f91Var.J = false;
                f91Var.setEnabled(true);
                e91 e91Var = f91Var.f26425y;
                if (e91Var != null) {
                    ((n2.c) e91Var).k(1.0f);
                }
                f91Var.invalidate();
                return;
            case 1:
                ((z91) this.f24499b).f33454e0 = null;
                return;
            case 2:
                ((ba1) this.f24499b).K = null;
                return;
            case 3:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.f24499b).view.setEnabled(true);
                return;
            case 4:
                org.telegram.ui.Components.voip.u uVar = ((org.telegram.ui.Components.voip.p) this.f24499b).f32062s0;
                if (uVar.f32209x0.getParent() != null) {
                    uVar.f32177a.removeView(uVar.f32209x0);
                    return;
                }
                return;
            case 5:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f24499b;
                if (x0Var.getParent() != null) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                    return;
                }
                return;
            case 6:
                fi1 fi1Var = (fi1) this.f24499b;
                if (!fi1Var.f31809a) {
                    fi1Var.V.v.S = true;
                    fi1Var.V.v.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.f24499b;
                r1Var.f32115i = false;
                r1Var.f32118l.setAlpha(35);
                r1Var.f32117k.setAlpha(102);
                r1Var.f32116j.setAlpha(35);
                r1Var.c();
                return;
            case 8:
                org.telegram.ui.Components.voip.v1 v1Var = ((org.telegram.ui.Components.voip.t1) this.f24499b).f32159c;
                v1Var.O = false;
                v1Var.requestLayout();
                return;
            case 9:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f24499b;
                t2Var.N = 0.0f;
                t2Var.O = 0.0f;
                org.telegram.ui.Components.voip.s2 s2Var = t2Var.d;
                s2Var.setScaleX(t2Var.T);
                s2Var.setScaleY(t2Var.T);
                TextureView textureView = t2Var.f32167e;
                if (textureView != null) {
                    textureView.setScaleX(t2Var.U);
                    textureView.setScaleY(t2Var.U);
                }
                t2Var.setTranslationY(0.0f);
                t2Var.setTranslationX(0.0f);
                t2Var.W = t2Var.V;
                t2Var.f32163b0 = null;
                return;
            case 10:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f24499b;
                if (w2Var.P) {
                    f7 = 1.0f;
                }
                w2Var.Q = f7;
                w2Var.a(w2Var.R, w2Var.S);
                return;
            case 11:
                ((org.telegram.ui.Components.voip.x2) this.f24499b).f32298c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.x2) this.f24499b).f32296a);
                if (((org.telegram.ui.Components.voip.x2) this.f24499b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.x2) this.f24499b).f32296a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.x2) this.f24499b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.x2) this.f24499b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.voip.d3 d3Var = (org.telegram.ui.Components.voip.d3) this.f24499b;
                d3Var.J = false;
                d3Var.T.f32112e = false;
                if (d3Var.U && (animatorSet = d3Var.Q) != null) {
                    animatorSet.cancel();
                    d3Var.Q.start();
                }
                d3Var.c();
                return;
            case 13:
                ((org.telegram.ui.Components.voip.l3) this.f24499b).f31976e.setVisibility(8);
                return;
            case 14:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f24499b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.hu huVar = (org.telegram.ui.hu) this.f24499b;
                if (animator.equals(huVar.f37178n[0])) {
                    huVar.f37178n[0] = null;
                    return;
                }
                return;
            case 16:
                org.telegram.ui.lv lvVar = (org.telegram.ui.lv) this.f24499b;
                org.telegram.ui.nv nvVar = lvVar.f38351n;
                org.telegram.ui.mv[] mvVarArr = nvVar.f39055f;
                nvVar.h = null;
                if (nvVar.f39058s) {
                    mvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.mv mvVar = mvVarArr[0];
                    mvVarArr[0] = mvVarArr[1];
                    mvVarArr[1] = mvVar;
                    mvVar.setVisibility(8);
                    if (nvVar.f39055f[0].f38770f == nvVar.f39054e.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    nvVar.f39059w = z10;
                    nvVar.f39054e.j(1.0f, nvVar.f39055f[0].f38770f);
                }
                nvVar.f39056n = false;
                lvVar.f38348c = false;
                lvVar.f38347b = false;
                org.telegram.ui.nv.f0(nvVar).setEnabled(true);
                nvVar.f39054e.setEnabled(true);
                return;
            case 17:
                org.telegram.ui.vw vwVar = (org.telegram.ui.vw) this.f24499b;
                org.telegram.ui.uy.u1(vwVar.M, vwVar.L, 0.0f);
                return;
            case 18:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.f24499b;
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
            case 19:
                org.telegram.ui.uy uyVar2 = ((org.telegram.ui.ny) this.f24499b).E0;
                uyVar2.f41409f3 = null;
                if (!uyVar2.j3) {
                    org.telegram.ui.ty[] tyVarArr = uyVar2.f41400e0;
                    org.telegram.ui.ty tyVar = tyVarArr[0];
                    org.telegram.ui.ty tyVar2 = tyVarArr[1];
                    tyVarArr[0] = tyVar2;
                    tyVarArr[1] = tyVar;
                    uyVar2.f41503z0.g(1.0f, tyVar2.h);
                    uyVar2.c5(false);
                    uyVar2.f41400e0[0].d.getClass();
                    uyVar2.f41400e0[1].d.getClass();
                }
                uyVar2.f41400e0[1].setVisibility(8);
                org.telegram.ui.uy.j1(uyVar2, true);
                uyVar2.f41414g3 = false;
                uyVar2.f41440m3 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) uyVar2).actionBar;
                kVar.setEnabled(true);
                uyVar2.f41503z0.setEnabled(true);
                uyVar2.A3(uyVar2.f41400e0[0]);
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.qy) this.f24499b).setScrollEnabled(true);
                return;
            case 21:
                f90 f90Var = (f90) this.f24499b;
                FrameLayout frameLayout = f90Var.f26394b;
                ci.r6 r6Var = (ci.r6) f90Var.f26395c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.g7) f90Var.d);
                return;
            case 22:
                org.telegram.ui.h60 h60Var = ((org.telegram.ui.i50) this.f24499b).f37287o;
                org.telegram.ui.h60 h60Var2 = org.telegram.ui.h60.D3;
                h60Var.b1();
                org.telegram.ui.h60.m0(h60Var).invalidate();
                h60Var.Q.invalidate();
                if (h60Var.f36953s0) {
                    h60Var.f36953s0 = false;
                    h60Var.O0(true);
                    return;
                }
                return;
            case 23:
                super.onAnimationEnd(animator);
                org.telegram.ui.v50 v50Var = (org.telegram.ui.v50) this.f24499b;
                v50Var.G = null;
                org.telegram.ui.h60 h60Var3 = v50Var.L;
                h60Var3.Q.invalidate();
                h60Var3.a2.invalidate();
                org.telegram.ui.h60.y0(h60Var3).invalidate();
                org.telegram.ui.h60.J0(h60Var3);
                v50Var.H.clear();
                v50Var.I.clear();
                return;
            case 24:
                org.telegram.ui.j80 j80Var = (org.telegram.ui.j80) this.f24499b;
                j80Var.d = null;
                j80Var.f37601a = null;
                j80Var.f37602b = false;
                return;
            case 25:
                org.telegram.ui.gd0 gd0Var = (org.telegram.ui.gd0) this.f24499b;
                gd0Var.H = false;
                gd0Var.o0();
                return;
            case 26:
                org.telegram.ui.ff0 ff0Var = (org.telegram.ui.ff0) this.f24499b;
                if (ff0Var.f36297s != null && ff0Var.f36295n != null) {
                    ff0Var.f36296r.setVisibility(4);
                    ff0Var.f36297s = null;
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.hj0) this.f24499b).T.setVisibility(8);
                return;
            case 28:
                org.telegram.ui.ck0 ck0Var = (org.telegram.ui.ck0) this.f24499b;
                ck0Var.f35504f = 1.0f;
                ck0Var.invalidate();
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f24499b;
                if (animator.equals(notificationsCustomSettingsActivity.f33827e)) {
                    notificationsCustomSettingsActivity.f33827e = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f24498a) {
            case 3:
                super.onAnimationStart(animator);
                ((TransitionValues) this.f24499b).view.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
