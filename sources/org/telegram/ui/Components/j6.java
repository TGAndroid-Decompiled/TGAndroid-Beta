package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public final class j6 extends AnimatorListenerAdapter {
    public final int f27384a;
    public final Object f27385b;

    public j6(Object obj, int i10) {
        this.f27384a = i10;
        this.f27385b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27384a) {
            case 12:
                ((wl) this.f27385b).f32305a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27384a) {
            case 0:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f27385b;
                animatedPhoneNumberEditText.f23682n = null;
                animatedPhoneNumberEditText.f23681f.clear();
                return;
            case 1:
                super.onAnimationEnd(animator);
                p6 p6Var = (p6) this.f27385b;
                p6Var.c();
                p6Var.f29319k = null;
                p6Var.h = 0.0f;
                p6Var.f29321m = 0.0f;
                p6Var.invalidateSelf();
                Runnable runnable = p6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                p6Var.f29323o = null;
                CharSequence charSequence = p6Var.f29324p;
                if (charSequence != null) {
                    p6Var.q(charSequence, true, p6Var.f29325q);
                    p6Var.f29324p = null;
                    p6Var.f29325q = false;
                    return;
                }
                pg pgVar = p6Var.C;
                if (pgVar != null) {
                    pgVar.run();
                    return;
                }
                return;
            case 2:
                x9 x9Var = (x9) this.f27385b;
                x9Var.setVisibility(8);
                x9Var.setImageDrawable(null);
                x9Var.setAlpha(1.0f);
                return;
            case 3:
                f9 f9Var = ((t8) this.f27385b).f30580b;
                f9Var.f25997f = false;
                f9Var.f25996e.setVisibility(8);
                return;
            case 4:
                k9 k9Var = (k9) this.f27385b;
                if (k9Var.f27787f != null) {
                    k9Var.f27786e = 1.0f;
                    k9Var.n();
                    if (k9Var.f27788g) {
                        k9Var.f27788g = false;
                        Runnable runnable2 = k9Var.f27790j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    k9Var.f();
                }
                k9Var.f27787f = null;
                return;
            case 5:
                ((sf) this.f27385b).f30301f.f23696b0.setVisibility(8);
                return;
            case 6:
                ((vg) this.f27385b).f31255d0 = 1.0f;
                return;
            case 7:
                ((ci) this.f27385b).f25038c.f31345s.setVisibility(8);
                return;
            case 8:
                ((ei) this.f27385b).d.v.setVisibility(8);
                return;
            case 9:
                vi viVar = (vi) this.f27385b;
                viVar.Z0 = null;
                if (!viVar.f31339q1) {
                    if (viVar.X0.getTag() == null && viVar.Q0 == 0 && !viVar.T0) {
                        viVar.f31289a1.setVisibility(4);
                    }
                    viVar.f31316i1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var = viVar.f31303e1;
                if (v0Var != null) {
                    v0Var.setVisibility(4);
                    return;
                }
                return;
            case 10:
                super.onAnimationEnd(animator);
                ok okVar = (ok) this.f27385b;
                okVar.f29120s.setVisibility(8);
                okVar.f29118n = 0;
                dk dkVar = okVar.f29119r;
                dkVar.setAlpha(1.0f);
                dkVar.setScaleX(1.0f);
                dkVar.setScaleY(1.0f);
                dkVar.setTranslationX(0.0f);
                dkVar.invalidate();
                return;
            case 11:
                nk nkVar = (nk) this.f27385b;
                if (nkVar.X.H.getTag() == null) {
                    nkVar.X.H.setVisibility(4);
                }
                nkVar.X.I = null;
                return;
            case 12:
                wl wlVar = (wl) this.f27385b;
                if (animator.equals(wlVar.f32305a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wlVar.f32305a;
                    chatAttachAlertPhotoLayout.f23867c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 13:
                pm pmVar = (pm) this.f27385b;
                qm qmVar = pmVar.P;
                qmVar.J = null;
                qmVar.K = false;
                pmVar.invalidate();
                return;
            case 14:
                lp lpVar = (lp) this.f27385b;
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
                CheckBox checkBox = (CheckBox) this.f27385b;
                if (animator.equals(checkBox.f23916s)) {
                    checkBox.f23916s = null;
                }
                if (!checkBox.f23918x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 16:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f27385b;
                if (animator.equals(checkBoxBase.f23933p)) {
                    checkBoxBase.f23933p = null;
                }
                if (!checkBoxBase.f23934q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 17:
                lq lqVar = (lq) this.f27385b;
                if (lqVar.K == lqVar.L) {
                    lqVar.G.setVisibility(4);
                }
                lqVar.f28317y = null;
                return;
            case 18:
                uq uqVar = (uq) this.f27385b;
                uqVar.f30971l = 1.0f;
                uqVar.f30974o = null;
                uqVar.f30975p = null;
                uqVar.f30976q = null;
                View view = uqVar.H;
                if (view != null) {
                    if (uqVar.h == 0 && uqVar.G) {
                        view.setVisibility(8);
                    }
                    uqVar.H.invalidate();
                }
                uqVar.f30964c = -1;
                return;
            case 19:
                hu huVar = (hu) this.f27385b;
                huVar.O = false;
                huVar.d.setTranslationY(0.0f);
                huVar.d.setAlpha(0.0f);
                huVar.c(0.0f);
                huVar.R = 0.0f;
                huVar.j();
                return;
            case 20:
                ((pu) this.f27385b).f29517a.O = false;
                return;
            case 21:
                super.onAnimationEnd(animator);
                ((iv) this.f27385b).d = null;
                return;
            case 22:
                ((kz) this.f27385b).W = null;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((ty) this.f27385b).f30768n = null;
                return;
            case 24:
                ((i00) this.f27385b).a();
                return;
            case 25:
                k00 k00Var = (k00) this.f27385b;
                k00Var.U = k00Var.f27636c0;
                k00Var.f27634b0 = k00Var.f27641f0;
                k00Var.V = k00Var.f27637d0;
                k00Var.W = k00Var.f27639e0;
                k00Var.f27636c0 = -1;
                k00Var.f27637d0 = -1;
                k00Var.f27639e0 = -1;
                k00Var.f27641f0 = -1;
                return;
            case 26:
                y00 y00Var = (y00) this.f27385b;
                y00Var.f32830s = 1.0f;
                y00Var.invalidate();
                return;
            case 27:
                n70 n70Var = (n70) this.f27385b;
                l70 l70Var = n70Var.f28691x;
                if (l70Var != null) {
                    l70Var.setProgress(1.0f);
                    n70Var.f28691x.invalidate();
                }
                n70Var.m0 = null;
                return;
            case 28:
                l00 l00Var = (l00) this.f27385b;
                ((w70) l00Var.f28048e).E = false;
                TextView[] textViewArr = (TextView[]) l00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            default:
                k80 k80Var = (k80) this.f27385b;
                if (!k80Var.f27779f) {
                    k80Var.f27777c.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
