package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class q8 extends AnimatorListenerAdapter {
    public final int f27522a;
    public final Object f27523b;

    public q8(Object obj, int i10) {
        this.f27522a = i10;
        this.f27523b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27522a) {
            case 9:
                ((wl) this.f27523b).f30038a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27522a) {
            case 0:
                d9 d9Var = ((r8) this.f27523b).f27845b;
                d9Var.f23609f = false;
                d9Var.e.setVisibility(8);
                return;
            case 1:
                i9 i9Var = (i9) this.f27523b;
                if (i9Var.f25038f != null) {
                    i9Var.e = 1.0f;
                    i9Var.n();
                    if (i9Var.f25039g) {
                        i9Var.f25039g = false;
                        Runnable runnable = i9Var.f25041j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    i9Var.f();
                }
                i9Var.f25038f = null;
                return;
            case 2:
                ((rf) this.f27523b).f27943f.f21975b0.setVisibility(8);
                return;
            case 3:
                ((ug) this.f27523b).f28764d0 = 1.0f;
                return;
            case 4:
                ((ci) this.f27523b).f23368c.f29135s.setVisibility(8);
                return;
            case 5:
                ((ei) this.f27523b).d.v.setVisibility(8);
                return;
            case 6:
                vi viVar = (vi) this.f27523b;
                viVar.Z0 = null;
                if (!viVar.f29129q1) {
                    if (viVar.X0.getTag() == null && viVar.Q0 == 0 && !viVar.T0) {
                        viVar.f29080a1.setVisibility(4);
                    }
                    viVar.f29106i1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var = viVar.f29093e1;
                if (v0Var != null) {
                    v0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                ok okVar = (ok) this.f27523b;
                okVar.f27118s.setVisibility(8);
                okVar.f27116n = 0;
                dk dkVar = okVar.f27117r;
                dkVar.setAlpha(1.0f);
                dkVar.setScaleX(1.0f);
                dkVar.setScaleY(1.0f);
                dkVar.setTranslationX(0.0f);
                dkVar.invalidate();
                return;
            case 8:
                nk nkVar = (nk) this.f27523b;
                if (nkVar.X.H.getTag() == null) {
                    nkVar.X.H.setVisibility(4);
                }
                nkVar.X.I = null;
                return;
            case 9:
                wl wlVar = (wl) this.f27523b;
                if (animator.equals(wlVar.f30038a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wlVar.f30038a;
                    chatAttachAlertPhotoLayout.f22144c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                pm pmVar = (pm) this.f27523b;
                qm qmVar = pmVar.P;
                qmVar.J = null;
                qmVar.K = false;
                pmVar.invalidate();
                return;
            case 11:
                mp mpVar = (mp) this.f27523b;
                ci.wb wbVar = mpVar.R;
                if (wbVar != null) {
                    if (wbVar.getParent() != null) {
                        ((ViewGroup) mpVar.R.getParent()).removeView(mpVar.R);
                    }
                    mpVar.R = null;
                }
                mpVar.T = null;
                super.onAnimationEnd(animator);
                return;
            case 12:
                CheckBox checkBox = (CheckBox) this.f27523b;
                if (animator.equals(checkBox.f22192s)) {
                    checkBox.f22192s = null;
                }
                if (!checkBox.f22194x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f27523b;
                if (animator.equals(checkBoxBase.f22208p)) {
                    checkBoxBase.f22208p = null;
                }
                if (!checkBoxBase.f22209q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                mq mqVar = (mq) this.f27523b;
                if (mqVar.K == mqVar.L) {
                    mqVar.G.setVisibility(4);
                }
                mqVar.f26529y = null;
                return;
            case 15:
                vq vqVar = (vq) this.f27523b;
                vqVar.f29766l = 1.0f;
                vqVar.f29769o = null;
                vqVar.f29770p = null;
                vqVar.f29771q = null;
                View view = vqVar.H;
                if (view != null) {
                    if (vqVar.h == 0 && vqVar.G) {
                        view.setVisibility(8);
                    }
                    vqVar.H.invalidate();
                }
                vqVar.f29760c = -1;
                return;
            case 16:
                ju juVar = (ju) this.f27523b;
                juVar.O = false;
                juVar.d.setTranslationY(0.0f);
                juVar.d.setAlpha(0.0f);
                juVar.c(0.0f);
                juVar.R = 0.0f;
                juVar.j();
                return;
            case 17:
                ((ru) this.f27523b).f28053a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((kv) this.f27523b).d = null;
                return;
            case 19:
                ((kz) this.f27523b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((ty) this.f27523b).f28560n = null;
                return;
            case 21:
                ((i00) this.f27523b).a();
                return;
            case 22:
                k00 k00Var = (k00) this.f27523b;
                k00Var.U = k00Var.f25528c0;
                k00Var.f25526b0 = k00Var.f25532f0;
                k00Var.V = k00Var.f25529d0;
                k00Var.W = k00Var.f25530e0;
                k00Var.f25528c0 = -1;
                k00Var.f25529d0 = -1;
                k00Var.f25530e0 = -1;
                k00Var.f25532f0 = -1;
                return;
            case 23:
                y00 y00Var = (y00) this.f27523b;
                y00Var.f30474s = 1.0f;
                y00Var.invalidate();
                return;
            case 24:
                b60 b60Var = (b60) this.f27523b;
                if (animator == b60Var.T) {
                    b60Var.c(true);
                    b60Var.setVisibility(4);
                    return;
                }
                return;
            case 25:
                y70 y70Var = (y70) this.f27523b;
                w70 w70Var = y70Var.f30572x;
                if (w70Var != null) {
                    w70Var.setProgress(1.0f);
                    y70Var.f30572x.invalidate();
                }
                y70Var.m0 = null;
                return;
            case 26:
                l00 l00Var = (l00) this.f27523b;
                ((h80) l00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) l00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 27:
                v80 v80Var = (v80) this.f27523b;
                if (!v80Var.f29027f) {
                    v80Var.f29026c.setVisibility(8);
                    return;
                }
                return;
            case 28:
                c90 c90Var = (c90) this.f27523b;
                FrameLayout frameLayout = c90Var.f23315b;
                ci.s6 s6Var = (ci.s6) c90Var.f23316c;
                if (s6Var.getParent() != null) {
                    frameLayout.removeView(s6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ga) c90Var.d);
                return;
            default:
                ac0 ac0Var = (ac0) this.f27523b;
                ac0Var.f22625c0.h = null;
                ac0Var.e(ac0Var.S, ac0Var.R);
                return;
        }
    }
}
