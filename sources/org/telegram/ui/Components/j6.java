package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public final class j6 extends AnimatorListenerAdapter {
    public final int f27358a;
    public final Object f27359b;

    public j6(Object obj, int i10) {
        this.f27358a = i10;
        this.f27359b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27358a) {
            case 12:
                ((wl) this.f27359b).f32279a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27358a) {
            case 0:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f27359b;
                animatedPhoneNumberEditText.f23656n = null;
                animatedPhoneNumberEditText.f23655f.clear();
                return;
            case 1:
                super.onAnimationEnd(animator);
                p6 p6Var = (p6) this.f27359b;
                p6Var.c();
                p6Var.f29293k = null;
                p6Var.h = 0.0f;
                p6Var.f29295m = 0.0f;
                p6Var.invalidateSelf();
                Runnable runnable = p6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                p6Var.f29297o = null;
                CharSequence charSequence = p6Var.f29298p;
                if (charSequence != null) {
                    p6Var.q(charSequence, true, p6Var.f29299q);
                    p6Var.f29298p = null;
                    p6Var.f29299q = false;
                    return;
                }
                pg pgVar = p6Var.C;
                if (pgVar != null) {
                    pgVar.run();
                    return;
                }
                return;
            case 2:
                x9 x9Var = (x9) this.f27359b;
                x9Var.setVisibility(8);
                x9Var.setImageDrawable(null);
                x9Var.setAlpha(1.0f);
                return;
            case 3:
                f9 f9Var = ((t8) this.f27359b).f30554b;
                f9Var.f25971f = false;
                f9Var.f25970e.setVisibility(8);
                return;
            case 4:
                k9 k9Var = (k9) this.f27359b;
                if (k9Var.f27761f != null) {
                    k9Var.f27760e = 1.0f;
                    k9Var.n();
                    if (k9Var.f27762g) {
                        k9Var.f27762g = false;
                        Runnable runnable2 = k9Var.f27764j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    k9Var.f();
                }
                k9Var.f27761f = null;
                return;
            case 5:
                ((sf) this.f27359b).f30275f.f23670b0.setVisibility(8);
                return;
            case 6:
                ((vg) this.f27359b).f31229d0 = 1.0f;
                return;
            case 7:
                ((ci) this.f27359b).f25012c.f31319s.setVisibility(8);
                return;
            case 8:
                ((ei) this.f27359b).d.v.setVisibility(8);
                return;
            case 9:
                vi viVar = (vi) this.f27359b;
                viVar.Z0 = null;
                if (!viVar.f31313q1) {
                    if (viVar.X0.getTag() == null && viVar.Q0 == 0 && !viVar.T0) {
                        viVar.f31263a1.setVisibility(4);
                    }
                    viVar.f31290i1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var = viVar.f31277e1;
                if (v0Var != null) {
                    v0Var.setVisibility(4);
                    return;
                }
                return;
            case 10:
                super.onAnimationEnd(animator);
                ok okVar = (ok) this.f27359b;
                okVar.f29094s.setVisibility(8);
                okVar.f29092n = 0;
                dk dkVar = okVar.f29093r;
                dkVar.setAlpha(1.0f);
                dkVar.setScaleX(1.0f);
                dkVar.setScaleY(1.0f);
                dkVar.setTranslationX(0.0f);
                dkVar.invalidate();
                return;
            case 11:
                nk nkVar = (nk) this.f27359b;
                if (nkVar.X.H.getTag() == null) {
                    nkVar.X.H.setVisibility(4);
                }
                nkVar.X.I = null;
                return;
            case 12:
                wl wlVar = (wl) this.f27359b;
                if (animator.equals(wlVar.f32279a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wlVar.f32279a;
                    chatAttachAlertPhotoLayout.f23841c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 13:
                pm pmVar = (pm) this.f27359b;
                qm qmVar = pmVar.P;
                qmVar.J = null;
                qmVar.K = false;
                pmVar.invalidate();
                return;
            case 14:
                lp lpVar = (lp) this.f27359b;
                di.xb xbVar = lpVar.R;
                if (xbVar != null) {
                    if (xbVar.getParent() != null) {
                        ((ViewGroup) lpVar.R.getParent()).removeView(lpVar.R);
                    }
                    lpVar.R = null;
                }
                lpVar.T = null;
                super.onAnimationEnd(animator);
                return;
            case 15:
                CheckBox checkBox = (CheckBox) this.f27359b;
                if (animator.equals(checkBox.f23890s)) {
                    checkBox.f23890s = null;
                }
                if (!checkBox.f23892x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 16:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f27359b;
                if (animator.equals(checkBoxBase.f23907p)) {
                    checkBoxBase.f23907p = null;
                }
                if (!checkBoxBase.f23908q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 17:
                lq lqVar = (lq) this.f27359b;
                if (lqVar.K == lqVar.L) {
                    lqVar.G.setVisibility(4);
                }
                lqVar.f28291y = null;
                return;
            case 18:
                uq uqVar = (uq) this.f27359b;
                uqVar.f30945l = 1.0f;
                uqVar.f30948o = null;
                uqVar.f30949p = null;
                uqVar.f30950q = null;
                View view = uqVar.H;
                if (view != null) {
                    if (uqVar.h == 0 && uqVar.G) {
                        view.setVisibility(8);
                    }
                    uqVar.H.invalidate();
                }
                uqVar.f30938c = -1;
                return;
            case 19:
                hu huVar = (hu) this.f27359b;
                huVar.O = false;
                huVar.d.setTranslationY(0.0f);
                huVar.d.setAlpha(0.0f);
                huVar.c(0.0f);
                huVar.R = 0.0f;
                huVar.j();
                return;
            case 20:
                ((pu) this.f27359b).f29491a.O = false;
                return;
            case 21:
                super.onAnimationEnd(animator);
                ((iv) this.f27359b).d = null;
                return;
            case 22:
                ((kz) this.f27359b).W = null;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((ty) this.f27359b).f30742n = null;
                return;
            case 24:
                ((i00) this.f27359b).a();
                return;
            case 25:
                k00 k00Var = (k00) this.f27359b;
                k00Var.U = k00Var.f27610c0;
                k00Var.f27608b0 = k00Var.f27615f0;
                k00Var.V = k00Var.f27611d0;
                k00Var.W = k00Var.f27613e0;
                k00Var.f27610c0 = -1;
                k00Var.f27611d0 = -1;
                k00Var.f27613e0 = -1;
                k00Var.f27615f0 = -1;
                return;
            case 26:
                y00 y00Var = (y00) this.f27359b;
                y00Var.f32804s = 1.0f;
                y00Var.invalidate();
                return;
            case 27:
                n70 n70Var = (n70) this.f27359b;
                l70 l70Var = n70Var.f28665x;
                if (l70Var != null) {
                    l70Var.setProgress(1.0f);
                    n70Var.f28665x.invalidate();
                }
                n70Var.m0 = null;
                return;
            case 28:
                l00 l00Var = (l00) this.f27359b;
                ((w70) l00Var.f28022e).E = false;
                TextView[] textViewArr = (TextView[]) l00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            default:
                k80 k80Var = (k80) this.f27359b;
                if (!k80Var.f27753f) {
                    k80Var.f27751c.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
