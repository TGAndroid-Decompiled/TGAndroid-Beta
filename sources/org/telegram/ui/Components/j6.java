package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public final class j6 extends AnimatorListenerAdapter {
    public final int f27357a;
    public final Object f27358b;

    public j6(Object obj, int i10) {
        this.f27357a = i10;
        this.f27358b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27357a) {
            case 12:
                ((wl) this.f27358b).f32278a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27357a) {
            case 0:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f27358b;
                animatedPhoneNumberEditText.f23655n = null;
                animatedPhoneNumberEditText.f23654f.clear();
                return;
            case 1:
                super.onAnimationEnd(animator);
                p6 p6Var = (p6) this.f27358b;
                p6Var.c();
                p6Var.f29292k = null;
                p6Var.h = 0.0f;
                p6Var.f29294m = 0.0f;
                p6Var.invalidateSelf();
                Runnable runnable = p6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                p6Var.f29296o = null;
                CharSequence charSequence = p6Var.f29297p;
                if (charSequence != null) {
                    p6Var.q(charSequence, true, p6Var.f29298q);
                    p6Var.f29297p = null;
                    p6Var.f29298q = false;
                    return;
                }
                pg pgVar = p6Var.C;
                if (pgVar != null) {
                    pgVar.run();
                    return;
                }
                return;
            case 2:
                x9 x9Var = (x9) this.f27358b;
                x9Var.setVisibility(8);
                x9Var.setImageDrawable(null);
                x9Var.setAlpha(1.0f);
                return;
            case 3:
                f9 f9Var = ((t8) this.f27358b).f30553b;
                f9Var.f25970f = false;
                f9Var.f25969e.setVisibility(8);
                return;
            case 4:
                k9 k9Var = (k9) this.f27358b;
                if (k9Var.f27760f != null) {
                    k9Var.f27759e = 1.0f;
                    k9Var.n();
                    if (k9Var.f27761g) {
                        k9Var.f27761g = false;
                        Runnable runnable2 = k9Var.f27763j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    k9Var.f();
                }
                k9Var.f27760f = null;
                return;
            case 5:
                ((sf) this.f27358b).f30274f.f23669b0.setVisibility(8);
                return;
            case 6:
                ((vg) this.f27358b).f31228d0 = 1.0f;
                return;
            case 7:
                ((ci) this.f27358b).f25011c.f31318s.setVisibility(8);
                return;
            case 8:
                ((ei) this.f27358b).d.v.setVisibility(8);
                return;
            case 9:
                vi viVar = (vi) this.f27358b;
                viVar.Z0 = null;
                if (!viVar.f31312q1) {
                    if (viVar.X0.getTag() == null && viVar.Q0 == 0 && !viVar.T0) {
                        viVar.f31262a1.setVisibility(4);
                    }
                    viVar.f31289i1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var = viVar.f31276e1;
                if (v0Var != null) {
                    v0Var.setVisibility(4);
                    return;
                }
                return;
            case 10:
                super.onAnimationEnd(animator);
                ok okVar = (ok) this.f27358b;
                okVar.f29093s.setVisibility(8);
                okVar.f29091n = 0;
                dk dkVar = okVar.f29092r;
                dkVar.setAlpha(1.0f);
                dkVar.setScaleX(1.0f);
                dkVar.setScaleY(1.0f);
                dkVar.setTranslationX(0.0f);
                dkVar.invalidate();
                return;
            case 11:
                nk nkVar = (nk) this.f27358b;
                if (nkVar.X.H.getTag() == null) {
                    nkVar.X.H.setVisibility(4);
                }
                nkVar.X.I = null;
                return;
            case 12:
                wl wlVar = (wl) this.f27358b;
                if (animator.equals(wlVar.f32278a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wlVar.f32278a;
                    chatAttachAlertPhotoLayout.f23840c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 13:
                pm pmVar = (pm) this.f27358b;
                qm qmVar = pmVar.P;
                qmVar.J = null;
                qmVar.K = false;
                pmVar.invalidate();
                return;
            case 14:
                lp lpVar = (lp) this.f27358b;
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
                CheckBox checkBox = (CheckBox) this.f27358b;
                if (animator.equals(checkBox.f23889s)) {
                    checkBox.f23889s = null;
                }
                if (!checkBox.f23891x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 16:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f27358b;
                if (animator.equals(checkBoxBase.f23906p)) {
                    checkBoxBase.f23906p = null;
                }
                if (!checkBoxBase.f23907q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 17:
                lq lqVar = (lq) this.f27358b;
                if (lqVar.K == lqVar.L) {
                    lqVar.G.setVisibility(4);
                }
                lqVar.f28290y = null;
                return;
            case 18:
                uq uqVar = (uq) this.f27358b;
                uqVar.f30944l = 1.0f;
                uqVar.f30947o = null;
                uqVar.f30948p = null;
                uqVar.f30949q = null;
                View view = uqVar.H;
                if (view != null) {
                    if (uqVar.h == 0 && uqVar.G) {
                        view.setVisibility(8);
                    }
                    uqVar.H.invalidate();
                }
                uqVar.f30937c = -1;
                return;
            case 19:
                hu huVar = (hu) this.f27358b;
                huVar.O = false;
                huVar.d.setTranslationY(0.0f);
                huVar.d.setAlpha(0.0f);
                huVar.c(0.0f);
                huVar.R = 0.0f;
                huVar.j();
                return;
            case 20:
                ((pu) this.f27358b).f29490a.O = false;
                return;
            case 21:
                super.onAnimationEnd(animator);
                ((iv) this.f27358b).d = null;
                return;
            case 22:
                ((kz) this.f27358b).W = null;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((ty) this.f27358b).f30741n = null;
                return;
            case 24:
                ((i00) this.f27358b).a();
                return;
            case 25:
                k00 k00Var = (k00) this.f27358b;
                k00Var.U = k00Var.f27609c0;
                k00Var.f27607b0 = k00Var.f27614f0;
                k00Var.V = k00Var.f27610d0;
                k00Var.W = k00Var.f27612e0;
                k00Var.f27609c0 = -1;
                k00Var.f27610d0 = -1;
                k00Var.f27612e0 = -1;
                k00Var.f27614f0 = -1;
                return;
            case 26:
                y00 y00Var = (y00) this.f27358b;
                y00Var.f32803s = 1.0f;
                y00Var.invalidate();
                return;
            case 27:
                n70 n70Var = (n70) this.f27358b;
                l70 l70Var = n70Var.f28664x;
                if (l70Var != null) {
                    l70Var.setProgress(1.0f);
                    n70Var.f28664x.invalidate();
                }
                n70Var.m0 = null;
                return;
            case 28:
                l00 l00Var = (l00) this.f27358b;
                ((w70) l00Var.f28021e).E = false;
                TextView[] textViewArr = (TextView[]) l00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            default:
                k80 k80Var = (k80) this.f27358b;
                if (!k80Var.f27752f) {
                    k80Var.f27750c.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
