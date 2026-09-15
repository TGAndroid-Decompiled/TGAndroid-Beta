package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class p8 extends AnimatorListenerAdapter {
    public final int f26968a;
    public final Object f26969b;

    public p8(Object obj, int i10) {
        this.f26968a = i10;
        this.f26969b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26968a) {
            case 9:
                ((wl) this.f26969b).f29736a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26968a) {
            case 0:
                c9 c9Var = ((q8) this.f26969b).f27281b;
                c9Var.f22986f = false;
                c9Var.e.setVisibility(8);
                return;
            case 1:
                h9 h9Var = (h9) this.f26969b;
                if (h9Var.f24618f != null) {
                    h9Var.e = 1.0f;
                    h9Var.n();
                    if (h9Var.f24619g) {
                        h9Var.f24619g = false;
                        Runnable runnable = h9Var.f24621j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    h9Var.f();
                }
                h9Var.f24618f = null;
                return;
            case 2:
                ((qf) this.f26969b).f27321f.f21739b0.setVisibility(8);
                return;
            case 3:
                ((tg) this.f26969b).f28116d0 = 1.0f;
                return;
            case 4:
                ((ci) this.f26969b).f23090c.f28789s.setVisibility(8);
                return;
            case 5:
                ((ei) this.f26969b).d.v.setVisibility(8);
                return;
            case 6:
                vi viVar = (vi) this.f26969b;
                viVar.Z0 = null;
                if (!viVar.f28783q1) {
                    if (viVar.X0.getTag() == null && viVar.Q0 == 0 && !viVar.T0) {
                        viVar.f28734a1.setVisibility(4);
                    }
                    viVar.f28760i1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var = viVar.f28747e1;
                if (v0Var != null) {
                    v0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                ok okVar = (ok) this.f26969b;
                okVar.f26825s.setVisibility(8);
                okVar.f26823n = 0;
                dk dkVar = okVar.f26824r;
                dkVar.setAlpha(1.0f);
                dkVar.setScaleX(1.0f);
                dkVar.setScaleY(1.0f);
                dkVar.setTranslationX(0.0f);
                dkVar.invalidate();
                return;
            case 8:
                nk nkVar = (nk) this.f26969b;
                if (nkVar.X.H.getTag() == null) {
                    nkVar.X.H.setVisibility(4);
                }
                nkVar.X.I = null;
                return;
            case 9:
                wl wlVar = (wl) this.f26969b;
                if (animator.equals(wlVar.f29736a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wlVar.f29736a;
                    chatAttachAlertPhotoLayout.f21907c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                pm pmVar = (pm) this.f26969b;
                qm qmVar = pmVar.P;
                qmVar.J = null;
                qmVar.K = false;
                pmVar.invalidate();
                return;
            case 11:
                mp mpVar = (mp) this.f26969b;
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
                CheckBox checkBox = (CheckBox) this.f26969b;
                if (animator.equals(checkBox.f21955s)) {
                    checkBox.f21955s = null;
                }
                if (!checkBox.f21957x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f26969b;
                if (animator.equals(checkBoxBase.f21971p)) {
                    checkBoxBase.f21971p = null;
                }
                if (!checkBoxBase.f21972q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                mq mqVar = (mq) this.f26969b;
                if (mqVar.K == mqVar.L) {
                    mqVar.G.setVisibility(4);
                }
                mqVar.f26227y = null;
                return;
            case 15:
                vq vqVar = (vq) this.f26969b;
                vqVar.f29401l = 1.0f;
                vqVar.f29404o = null;
                vqVar.f29405p = null;
                vqVar.f29406q = null;
                View view = vqVar.H;
                if (view != null) {
                    if (vqVar.h == 0 && vqVar.G) {
                        view.setVisibility(8);
                    }
                    vqVar.H.invalidate();
                }
                vqVar.f29395c = -1;
                return;
            case 16:
                ju juVar = (ju) this.f26969b;
                juVar.O = false;
                juVar.d.setTranslationY(0.0f);
                juVar.d.setAlpha(0.0f);
                juVar.c(0.0f);
                juVar.R = 0.0f;
                juVar.j();
                return;
            case 17:
                ((ru) this.f26969b).f27693a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((jv) this.f26969b).d = null;
                return;
            case 19:
                ((kz) this.f26969b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((ty) this.f26969b).f28207n = null;
                return;
            case 21:
                ((i00) this.f26969b).a();
                return;
            case 22:
                k00 k00Var = (k00) this.f26969b;
                k00Var.U = k00Var.f25470c0;
                k00Var.f25468b0 = k00Var.f25474f0;
                k00Var.V = k00Var.f25471d0;
                k00Var.W = k00Var.f25472e0;
                k00Var.f25470c0 = -1;
                k00Var.f25471d0 = -1;
                k00Var.f25472e0 = -1;
                k00Var.f25474f0 = -1;
                return;
            case 23:
                y00 y00Var = (y00) this.f26969b;
                y00Var.f30118s = 1.0f;
                y00Var.invalidate();
                return;
            case 24:
                n70 n70Var = (n70) this.f26969b;
                l70 l70Var = n70Var.f26372x;
                if (l70Var != null) {
                    l70Var.setProgress(1.0f);
                    n70Var.f26372x.invalidate();
                }
                n70Var.m0 = null;
                return;
            case 25:
                l00 l00Var = (l00) this.f26969b;
                ((w70) l00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) l00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 26:
                k80 k80Var = (k80) this.f26969b;
                if (!k80Var.f25566f) {
                    k80Var.f25565c.setVisibility(8);
                    return;
                }
                return;
            case 27:
                r80 r80Var = (r80) this.f26969b;
                FrameLayout frameLayout = r80Var.f27605b;
                ci.s6 s6Var = (ci.s6) r80Var.f27606c;
                if (s6Var.getParent() != null) {
                    frameLayout.removeView(s6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.fa) r80Var.d);
                return;
            case 28:
                pb0 pb0Var = (pb0) this.f26969b;
                pb0Var.f27001c0.h = null;
                pb0Var.e(pb0Var.S, pb0Var.R);
                return;
            default:
                NumberTextView numberTextView = (NumberTextView) this.f26969b;
                numberTextView.d = null;
                numberTextView.f22071b.clear();
                return;
        }
    }
}
