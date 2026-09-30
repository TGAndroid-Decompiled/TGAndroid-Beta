package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class r8 extends AnimatorListenerAdapter {
    public final int f27866a;
    public final Object f27867b;

    public r8(Object obj, int i10) {
        this.f27866a = i10;
        this.f27867b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27866a) {
            case 9:
                ((zl) this.f27867b).f30981a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27866a) {
            case 0:
                e9 e9Var = ((s8) this.f27867b).f28215b;
                e9Var.f23919f = false;
                e9Var.e.setVisibility(8);
                return;
            case 1:
                j9 j9Var = (j9) this.f27867b;
                if (j9Var.f25351f != null) {
                    j9Var.e = 1.0f;
                    j9Var.n();
                    if (j9Var.f25352g) {
                        j9Var.f25352g = false;
                        Runnable runnable = j9Var.f25354j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f25351f = null;
                return;
            case 2:
                ((tf) this.f27867b).f28499f.f21982b0.setVisibility(8);
                return;
            case 3:
                ((wg) this.f27867b).f29943d0 = 1.0f;
                return;
            case 4:
                ((ei) this.f27867b).f23986c.f30309s.setVisibility(8);
                return;
            case 5:
                ((gi) this.f27867b).d.v.setVisibility(8);
                return;
            case 6:
                xi xiVar = (xi) this.f27867b;
                xiVar.Z0 = null;
                if (!xiVar.f30303q1) {
                    if (xiVar.X0.getTag() == null && xiVar.Q0 == 0 && !xiVar.T0) {
                        xiVar.f30254a1.setVisibility(4);
                    }
                    xiVar.f30280i1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var = xiVar.f30267e1;
                if (u0Var != null) {
                    u0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                rk rkVar = (rk) this.f27867b;
                rkVar.f28046s.setVisibility(8);
                rkVar.f28044n = 0;
                gk gkVar = rkVar.f28045r;
                gkVar.setAlpha(1.0f);
                gkVar.setScaleX(1.0f);
                gkVar.setScaleY(1.0f);
                gkVar.setTranslationX(0.0f);
                gkVar.invalidate();
                return;
            case 8:
                qk qkVar = (qk) this.f27867b;
                if (qkVar.X.H.getTag() == null) {
                    qkVar.X.H.setVisibility(4);
                }
                qkVar.X.I = null;
                return;
            case 9:
                zl zlVar = (zl) this.f27867b;
                if (animator.equals(zlVar.f30981a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = zlVar.f30981a;
                    chatAttachAlertPhotoLayout.f22151c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                sm smVar = (sm) this.f27867b;
                tm tmVar = smVar.P;
                tmVar.J = null;
                tmVar.K = false;
                smVar.invalidate();
                return;
            case 11:
                pp ppVar = (pp) this.f27867b;
                ci.tb tbVar = ppVar.R;
                if (tbVar != null) {
                    if (tbVar.getParent() != null) {
                        ((ViewGroup) ppVar.R.getParent()).removeView(ppVar.R);
                    }
                    ppVar.R = null;
                }
                ppVar.T = null;
                super.onAnimationEnd(animator);
                return;
            case 12:
                CheckBox checkBox = (CheckBox) this.f27867b;
                if (animator.equals(checkBox.f22199s)) {
                    checkBox.f22199s = null;
                }
                if (!checkBox.f22201x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f27867b;
                if (animator.equals(checkBoxBase.f22215p)) {
                    checkBoxBase.f22215p = null;
                }
                if (!checkBoxBase.f22216q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                pq pqVar = (pq) this.f27867b;
                if (pqVar.K == pqVar.L) {
                    pqVar.G.setVisibility(4);
                }
                pqVar.f27457y = null;
                return;
            case 15:
                yq yqVar = (yq) this.f27867b;
                yqVar.f30783l = 1.0f;
                yqVar.f30786o = null;
                yqVar.f30787p = null;
                yqVar.f30788q = null;
                View view = yqVar.H;
                if (view != null) {
                    if (yqVar.h == 0 && yqVar.G) {
                        view.setVisibility(8);
                    }
                    yqVar.H.invalidate();
                }
                yqVar.f30777c = -1;
                return;
            case 16:
                mu muVar = (mu) this.f27867b;
                muVar.O = false;
                muVar.d.setTranslationY(0.0f);
                muVar.d.setAlpha(0.0f);
                muVar.c(0.0f);
                muVar.R = 0.0f;
                muVar.j();
                return;
            case 17:
                ((uu) this.f27867b).f28927a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((mv) this.f27867b).d = null;
                return;
            case 19:
                ((nz) this.f27867b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((wy) this.f27867b).f30090n = null;
                return;
            case 21:
                ((l00) this.f27867b).a();
                return;
            case 22:
                n00 n00Var = (n00) this.f27867b;
                n00Var.U = n00Var.f26481c0;
                n00Var.f26479b0 = n00Var.f26485f0;
                n00Var.V = n00Var.f26482d0;
                n00Var.W = n00Var.f26483e0;
                n00Var.f26481c0 = -1;
                n00Var.f26482d0 = -1;
                n00Var.f26483e0 = -1;
                n00Var.f26485f0 = -1;
                return;
            case 23:
                b10 b10Var = (b10) this.f27867b;
                b10Var.f22775s = 1.0f;
                b10Var.invalidate();
                return;
            case 24:
                e60 e60Var = (e60) this.f27867b;
                if (animator == e60Var.W) {
                    e60Var.c(true);
                    e60Var.setVisibility(4);
                    return;
                }
                return;
            case 25:
                b80 b80Var = (b80) this.f27867b;
                z70 z70Var = b80Var.f22876x;
                if (z70Var != null) {
                    z70Var.setProgress(1.0f);
                    b80Var.f22876x.invalidate();
                }
                b80Var.m0 = null;
                return;
            case 26:
                o00 o00Var = (o00) this.f27867b;
                ((k80) o00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) o00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 27:
                y80 y80Var = (y80) this.f27867b;
                if (!y80Var.f30665f) {
                    y80Var.f30664c.setVisibility(8);
                    return;
                }
                return;
            case 28:
                f90 f90Var = (f90) this.f27867b;
                FrameLayout frameLayout = f90Var.f24251b;
                ci.r6 r6Var = (ci.r6) f90Var.f24252c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.fa) f90Var.d);
                return;
            default:
                cc0 cc0Var = (cc0) this.f27867b;
                cc0Var.f23264c0.h = null;
                cc0Var.e(cc0Var.S, cc0Var.R);
                return;
        }
    }
}
