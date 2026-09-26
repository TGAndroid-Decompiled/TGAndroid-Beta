package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class r8 extends AnimatorListenerAdapter {
    public final int f27861a;
    public final Object f27862b;

    public r8(Object obj, int i10) {
        this.f27861a = i10;
        this.f27862b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27861a) {
            case 9:
                ((yl) this.f27862b).f30657a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27861a) {
            case 0:
                e9 e9Var = ((s8) this.f27862b).f28194b;
                e9Var.f23882f = false;
                e9Var.e.setVisibility(8);
                return;
            case 1:
                j9 j9Var = (j9) this.f27862b;
                if (j9Var.f25334f != null) {
                    j9Var.e = 1.0f;
                    j9Var.n();
                    if (j9Var.f25335g) {
                        j9Var.f25335g = false;
                        Runnable runnable = j9Var.f25337j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f25334f = null;
                return;
            case 2:
                ((sf) this.f27862b).f28259f.f21960b0.setVisibility(8);
                return;
            case 3:
                ((vg) this.f27862b).f29084d0 = 1.0f;
                return;
            case 4:
                ((di) this.f27862b).f23705c.f30059s.setVisibility(8);
                return;
            case 5:
                ((fi) this.f27862b).d.v.setVisibility(8);
                return;
            case 6:
                wi wiVar = (wi) this.f27862b;
                wiVar.Z0 = null;
                if (!wiVar.f30053q1) {
                    if (wiVar.X0.getTag() == null && wiVar.Q0 == 0 && !wiVar.T0) {
                        wiVar.f30004a1.setVisibility(4);
                    }
                    wiVar.f30030i1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var = wiVar.f30017e1;
                if (u0Var != null) {
                    u0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                qk qkVar = (qk) this.f27862b;
                qkVar.f27706s.setVisibility(8);
                qkVar.f27704n = 0;
                fk fkVar = qkVar.f27705r;
                fkVar.setAlpha(1.0f);
                fkVar.setScaleX(1.0f);
                fkVar.setScaleY(1.0f);
                fkVar.setTranslationX(0.0f);
                fkVar.invalidate();
                return;
            case 8:
                pk pkVar = (pk) this.f27862b;
                if (pkVar.X.H.getTag() == null) {
                    pkVar.X.H.setVisibility(4);
                }
                pkVar.X.I = null;
                return;
            case 9:
                yl ylVar = (yl) this.f27862b;
                if (animator.equals(ylVar.f30657a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ylVar.f30657a;
                    chatAttachAlertPhotoLayout.f22129c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                rm rmVar = (rm) this.f27862b;
                sm smVar = rmVar.P;
                smVar.J = null;
                smVar.K = false;
                rmVar.invalidate();
                return;
            case 11:
                op opVar = (op) this.f27862b;
                ci.tb tbVar = opVar.R;
                if (tbVar != null) {
                    if (tbVar.getParent() != null) {
                        ((ViewGroup) opVar.R.getParent()).removeView(opVar.R);
                    }
                    opVar.R = null;
                }
                opVar.T = null;
                super.onAnimationEnd(animator);
                return;
            case 12:
                CheckBox checkBox = (CheckBox) this.f27862b;
                if (animator.equals(checkBox.f22177s)) {
                    checkBox.f22177s = null;
                }
                if (!checkBox.f22179x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f27862b;
                if (animator.equals(checkBoxBase.f22193p)) {
                    checkBoxBase.f22193p = null;
                }
                if (!checkBoxBase.f22194q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                oq oqVar = (oq) this.f27862b;
                if (oqVar.K == oqVar.L) {
                    oqVar.G.setVisibility(4);
                }
                oqVar.f27100y = null;
                return;
            case 15:
                xq xqVar = (xq) this.f27862b;
                xqVar.f30441l = 1.0f;
                xqVar.f30444o = null;
                xqVar.f30445p = null;
                xqVar.f30446q = null;
                View view = xqVar.H;
                if (view != null) {
                    if (xqVar.h == 0 && xqVar.G) {
                        view.setVisibility(8);
                    }
                    xqVar.H.invalidate();
                }
                xqVar.f30435c = -1;
                return;
            case 16:
                lu luVar = (lu) this.f27862b;
                luVar.O = false;
                luVar.d.setTranslationY(0.0f);
                luVar.d.setAlpha(0.0f);
                luVar.c(0.0f);
                luVar.R = 0.0f;
                luVar.j();
                return;
            case 17:
                ((tu) this.f27862b).f28613a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((lv) this.f27862b).d = null;
                return;
            case 19:
                ((mz) this.f27862b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((vy) this.f27862b).f29791n = null;
                return;
            case 21:
                ((k00) this.f27862b).a();
                return;
            case 22:
                m00 m00Var = (m00) this.f27862b;
                m00Var.U = m00Var.f26231c0;
                m00Var.f26229b0 = m00Var.f26235f0;
                m00Var.V = m00Var.f26232d0;
                m00Var.W = m00Var.f26233e0;
                m00Var.f26231c0 = -1;
                m00Var.f26232d0 = -1;
                m00Var.f26233e0 = -1;
                m00Var.f26235f0 = -1;
                return;
            case 23:
                a10 a10Var = (a10) this.f27862b;
                a10Var.f22498s = 1.0f;
                a10Var.invalidate();
                return;
            case 24:
                c60 c60Var = (c60) this.f27862b;
                if (animator == c60Var.W) {
                    c60Var.c(true);
                    c60Var.setVisibility(4);
                    return;
                }
                return;
            case 25:
                z70 z70Var = (z70) this.f27862b;
                x70 x70Var = z70Var.f30843x;
                if (x70Var != null) {
                    x70Var.setProgress(1.0f);
                    z70Var.f30843x.invalidate();
                }
                z70Var.m0 = null;
                return;
            case 26:
                n00 n00Var = (n00) this.f27862b;
                ((i80) n00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) n00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 27:
                w80 w80Var = (w80) this.f27862b;
                if (!w80Var.f29926f) {
                    w80Var.f29925c.setVisibility(8);
                    return;
                }
                return;
            case 28:
                d90 d90Var = (d90) this.f27862b;
                FrameLayout frameLayout = d90Var.f23637b;
                ci.r6 r6Var = (ci.r6) d90Var.f23638c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.fa) d90Var.d);
                return;
            default:
                ac0 ac0Var = (ac0) this.f27862b;
                ac0Var.f22606c0.h = null;
                ac0Var.e(ac0Var.S, ac0Var.R);
                return;
        }
    }
}
