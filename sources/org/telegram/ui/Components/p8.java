package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class p8 extends AnimatorListenerAdapter {
    public final int f26965a;
    public final Object f26966b;

    public p8(Object obj, int i10) {
        this.f26965a = i10;
        this.f26966b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26965a) {
            case 9:
                ((wl) this.f26966b).f29733a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26965a) {
            case 0:
                c9 c9Var = ((q8) this.f26966b).f27278b;
                c9Var.f22984f = false;
                c9Var.e.setVisibility(8);
                return;
            case 1:
                h9 h9Var = (h9) this.f26966b;
                if (h9Var.f24621f != null) {
                    h9Var.e = 1.0f;
                    h9Var.n();
                    if (h9Var.f24622g) {
                        h9Var.f24622g = false;
                        Runnable runnable = h9Var.f24624j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    h9Var.f();
                }
                h9Var.f24621f = null;
                return;
            case 2:
                ((qf) this.f26966b).f27318f.f21735b0.setVisibility(8);
                return;
            case 3:
                ((tg) this.f26966b).f28113d0 = 1.0f;
                return;
            case 4:
                ((ci) this.f26966b).f23088c.f28786s.setVisibility(8);
                return;
            case 5:
                ((ei) this.f26966b).d.v.setVisibility(8);
                return;
            case 6:
                vi viVar = (vi) this.f26966b;
                viVar.Z0 = null;
                if (!viVar.f28780q1) {
                    if (viVar.X0.getTag() == null && viVar.Q0 == 0 && !viVar.T0) {
                        viVar.f28731a1.setVisibility(4);
                    }
                    viVar.f28757i1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var = viVar.f28744e1;
                if (v0Var != null) {
                    v0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                ok okVar = (ok) this.f26966b;
                okVar.f26822s.setVisibility(8);
                okVar.f26820n = 0;
                dk dkVar = okVar.f26821r;
                dkVar.setAlpha(1.0f);
                dkVar.setScaleX(1.0f);
                dkVar.setScaleY(1.0f);
                dkVar.setTranslationX(0.0f);
                dkVar.invalidate();
                return;
            case 8:
                nk nkVar = (nk) this.f26966b;
                if (nkVar.X.H.getTag() == null) {
                    nkVar.X.H.setVisibility(4);
                }
                nkVar.X.I = null;
                return;
            case 9:
                wl wlVar = (wl) this.f26966b;
                if (animator.equals(wlVar.f29733a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wlVar.f29733a;
                    chatAttachAlertPhotoLayout.f21904c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                pm pmVar = (pm) this.f26966b;
                qm qmVar = pmVar.P;
                qmVar.J = null;
                qmVar.K = false;
                pmVar.invalidate();
                return;
            case 11:
                mp mpVar = (mp) this.f26966b;
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
                CheckBox checkBox = (CheckBox) this.f26966b;
                if (animator.equals(checkBox.f21952s)) {
                    checkBox.f21952s = null;
                }
                if (!checkBox.f21954x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f26966b;
                if (animator.equals(checkBoxBase.f21968p)) {
                    checkBoxBase.f21968p = null;
                }
                if (!checkBoxBase.f21969q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                mq mqVar = (mq) this.f26966b;
                if (mqVar.K == mqVar.L) {
                    mqVar.G.setVisibility(4);
                }
                mqVar.f26226y = null;
                return;
            case 15:
                vq vqVar = (vq) this.f26966b;
                vqVar.f29398l = 1.0f;
                vqVar.f29401o = null;
                vqVar.f29402p = null;
                vqVar.f29403q = null;
                View view = vqVar.H;
                if (view != null) {
                    if (vqVar.h == 0 && vqVar.G) {
                        view.setVisibility(8);
                    }
                    vqVar.H.invalidate();
                }
                vqVar.f29392c = -1;
                return;
            case 16:
                ju juVar = (ju) this.f26966b;
                juVar.O = false;
                juVar.d.setTranslationY(0.0f);
                juVar.d.setAlpha(0.0f);
                juVar.c(0.0f);
                juVar.R = 0.0f;
                juVar.j();
                return;
            case 17:
                ((ru) this.f26966b).f27690a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((jv) this.f26966b).d = null;
                return;
            case 19:
                ((kz) this.f26966b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((ty) this.f26966b).f28204n = null;
                return;
            case 21:
                ((i00) this.f26966b).a();
                return;
            case 22:
                k00 k00Var = (k00) this.f26966b;
                k00Var.U = k00Var.f25467c0;
                k00Var.f25465b0 = k00Var.f25471f0;
                k00Var.V = k00Var.f25468d0;
                k00Var.W = k00Var.f25469e0;
                k00Var.f25467c0 = -1;
                k00Var.f25468d0 = -1;
                k00Var.f25469e0 = -1;
                k00Var.f25471f0 = -1;
                return;
            case 23:
                y00 y00Var = (y00) this.f26966b;
                y00Var.f30115s = 1.0f;
                y00Var.invalidate();
                return;
            case 24:
                n70 n70Var = (n70) this.f26966b;
                l70 l70Var = n70Var.f26371x;
                if (l70Var != null) {
                    l70Var.setProgress(1.0f);
                    n70Var.f26371x.invalidate();
                }
                n70Var.m0 = null;
                return;
            case 25:
                l00 l00Var = (l00) this.f26966b;
                ((w70) l00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) l00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 26:
                k80 k80Var = (k80) this.f26966b;
                if (!k80Var.f25563f) {
                    k80Var.f25562c.setVisibility(8);
                    return;
                }
                return;
            case 27:
                r80 r80Var = (r80) this.f26966b;
                FrameLayout frameLayout = r80Var.f27602b;
                ci.s6 s6Var = (ci.s6) r80Var.f27603c;
                if (s6Var.getParent() != null) {
                    frameLayout.removeView(s6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.fa) r80Var.d);
                return;
            case 28:
                pb0 pb0Var = (pb0) this.f26966b;
                pb0Var.f26998c0.h = null;
                pb0Var.e(pb0Var.S, pb0Var.R);
                return;
            default:
                NumberTextView numberTextView = (NumberTextView) this.f26966b;
                numberTextView.d = null;
                numberTextView.f22068b.clear();
                return;
        }
    }
}
