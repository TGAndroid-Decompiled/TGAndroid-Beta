package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class r8 extends AnimatorListenerAdapter {
    public final int f27845a;
    public final Object f27846b;

    public r8(Object obj, int i10) {
        this.f27845a = i10;
        this.f27846b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27845a) {
            case 9:
                ((wl) this.f27846b).f30060a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27845a) {
            case 0:
                e9 e9Var = ((s8) this.f27846b).f28087b;
                e9Var.f23816f = false;
                e9Var.e.setVisibility(8);
                return;
            case 1:
                j9 j9Var = (j9) this.f27846b;
                if (j9Var.f25250f != null) {
                    j9Var.e = 1.0f;
                    j9Var.n();
                    if (j9Var.f25251g) {
                        j9Var.f25251g = false;
                        Runnable runnable = j9Var.f25253j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f25250f = null;
                return;
            case 2:
                ((rf) this.f27846b).f27883f.f21925b0.setVisibility(8);
                return;
            case 3:
                ((ug) this.f27846b).f28693d0 = 1.0f;
                return;
            case 4:
                ((ci) this.f27846b).f23276c.f29060s.setVisibility(8);
                return;
            case 5:
                ((ei) this.f27846b).d.v.setVisibility(8);
                return;
            case 6:
                vi viVar = (vi) this.f27846b;
                viVar.Z0 = null;
                if (!viVar.f29054q1) {
                    if (viVar.X0.getTag() == null && viVar.Q0 == 0 && !viVar.T0) {
                        viVar.f29005a1.setVisibility(4);
                    }
                    viVar.f29031i1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var = viVar.f29018e1;
                if (v0Var != null) {
                    v0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                ok okVar = (ok) this.f27846b;
                okVar.f26969s.setVisibility(8);
                okVar.f26967n = 0;
                dk dkVar = okVar.f26968r;
                dkVar.setAlpha(1.0f);
                dkVar.setScaleX(1.0f);
                dkVar.setScaleY(1.0f);
                dkVar.setTranslationX(0.0f);
                dkVar.invalidate();
                return;
            case 8:
                nk nkVar = (nk) this.f27846b;
                if (nkVar.X.H.getTag() == null) {
                    nkVar.X.H.setVisibility(4);
                }
                nkVar.X.I = null;
                return;
            case 9:
                wl wlVar = (wl) this.f27846b;
                if (animator.equals(wlVar.f30060a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wlVar.f30060a;
                    chatAttachAlertPhotoLayout.f22093c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                pm pmVar = (pm) this.f27846b;
                qm qmVar = pmVar.P;
                qmVar.J = null;
                qmVar.K = false;
                pmVar.invalidate();
                return;
            case 11:
                mp mpVar = (mp) this.f27846b;
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
                CheckBox checkBox = (CheckBox) this.f27846b;
                if (animator.equals(checkBox.f22141s)) {
                    checkBox.f22141s = null;
                }
                if (!checkBox.f22143x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f27846b;
                if (animator.equals(checkBoxBase.f22157p)) {
                    checkBoxBase.f22157p = null;
                }
                if (!checkBoxBase.f22158q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                mq mqVar = (mq) this.f27846b;
                if (mqVar.K == mqVar.L) {
                    mqVar.G.setVisibility(4);
                }
                mqVar.f26508y = null;
                return;
            case 15:
                vq vqVar = (vq) this.f27846b;
                vqVar.f29697l = 1.0f;
                vqVar.f29700o = null;
                vqVar.f29701p = null;
                vqVar.f29702q = null;
                View view = vqVar.H;
                if (view != null) {
                    if (vqVar.h == 0 && vqVar.G) {
                        view.setVisibility(8);
                    }
                    vqVar.H.invalidate();
                }
                vqVar.f29691c = -1;
                return;
            case 16:
                ju juVar = (ju) this.f27846b;
                juVar.O = false;
                juVar.d.setTranslationY(0.0f);
                juVar.d.setAlpha(0.0f);
                juVar.c(0.0f);
                juVar.R = 0.0f;
                juVar.j();
                return;
            case 17:
                ((ru) this.f27846b).f27969a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((jv) this.f27846b).d = null;
                return;
            case 19:
                ((kz) this.f27846b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((ty) this.f27846b).f28503n = null;
                return;
            case 21:
                ((i00) this.f27846b).a();
                return;
            case 22:
                k00 k00Var = (k00) this.f27846b;
                k00Var.U = k00Var.f25493c0;
                k00Var.f25491b0 = k00Var.f25497f0;
                k00Var.V = k00Var.f25494d0;
                k00Var.W = k00Var.f25495e0;
                k00Var.f25493c0 = -1;
                k00Var.f25494d0 = -1;
                k00Var.f25495e0 = -1;
                k00Var.f25497f0 = -1;
                return;
            case 23:
                y00 y00Var = (y00) this.f27846b;
                y00Var.f30431s = 1.0f;
                y00Var.invalidate();
                return;
            case 24:
                a60 a60Var = (a60) this.f27846b;
                if (animator == a60Var.P) {
                    a60Var.d(true);
                    a60Var.setVisibility(4);
                    return;
                }
                return;
            case 25:
                w70 w70Var = (w70) this.f27846b;
                u70 u70Var = w70Var.f29928x;
                if (u70Var != null) {
                    u70Var.setProgress(1.0f);
                    w70Var.f29928x.invalidate();
                }
                w70Var.m0 = null;
                return;
            case 26:
                l00 l00Var = (l00) this.f27846b;
                ((f80) l00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) l00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 27:
                t80 t80Var = (t80) this.f27846b;
                if (!t80Var.f28350f) {
                    t80Var.f28349c.setVisibility(8);
                    return;
                }
                return;
            case 28:
                a90 a90Var = (a90) this.f27846b;
                FrameLayout frameLayout = a90Var.f22569b;
                ci.s6 s6Var = (ci.s6) a90Var.f22570c;
                if (s6Var.getParent() != null) {
                    frameLayout.removeView(s6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.fa) a90Var.d);
                return;
            default:
                yb0 yb0Var = (yb0) this.f27846b;
                yb0Var.f30537c0.h = null;
                yb0Var.e(yb0Var.S, yb0Var.R);
                return;
        }
    }
}
