package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class r8 extends AnimatorListenerAdapter {
    public final int f27920a;
    public final Object f27921b;

    public r8(Object obj, int i10) {
        this.f27920a = i10;
        this.f27921b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27920a) {
            case 9:
                ((yl) this.f27921b).f30679a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27920a) {
            case 0:
                e9 e9Var = ((s8) this.f27921b).f28197b;
                e9Var.f23982f = false;
                e9Var.e.setVisibility(8);
                return;
            case 1:
                j9 j9Var = (j9) this.f27921b;
                if (j9Var.f25390f != null) {
                    j9Var.e = 1.0f;
                    j9Var.n();
                    if (j9Var.f25391g) {
                        j9Var.f25391g = false;
                        Runnable runnable = j9Var.f25393j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f25390f = null;
                return;
            case 2:
                ((sf) this.f27921b).f28233f.f21963b0.setVisibility(8);
                return;
            case 3:
                ((vg) this.f27921b).f29116d0 = 1.0f;
                return;
            case 4:
                ((zh) this.f27921b).f30922c.f30001s.setVisibility(8);
                return;
            case 5:
                ((ci) this.f27921b).d.v.setVisibility(8);
                return;
            case 6:
                wi wiVar = (wi) this.f27921b;
                wiVar.Z0 = null;
                if (!wiVar.f29995q1) {
                    if (wiVar.X0.getTag() == null && wiVar.Q0 == 0 && !wiVar.T0) {
                        wiVar.f29946a1.setVisibility(4);
                    }
                    wiVar.f29972i1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.w0 w0Var = wiVar.f29959e1;
                if (w0Var != null) {
                    w0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                qk qkVar = (qk) this.f27921b;
                qkVar.f27763s.setVisibility(8);
                qkVar.f27761n = 0;
                fk fkVar = qkVar.f27762r;
                fkVar.setAlpha(1.0f);
                fkVar.setScaleX(1.0f);
                fkVar.setScaleY(1.0f);
                fkVar.setTranslationX(0.0f);
                fkVar.invalidate();
                return;
            case 8:
                pk pkVar = (pk) this.f27921b;
                if (pkVar.X.H.getTag() == null) {
                    pkVar.X.H.setVisibility(4);
                }
                pkVar.X.I = null;
                return;
            case 9:
                yl ylVar = (yl) this.f27921b;
                if (animator.equals(ylVar.f30679a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ylVar.f30679a;
                    chatAttachAlertPhotoLayout.f22132c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                rm rmVar = (rm) this.f27921b;
                sm smVar = rmVar.P;
                smVar.J = null;
                smVar.K = false;
                rmVar.invalidate();
                return;
            case 11:
                op opVar = (op) this.f27921b;
                ci.sb sbVar = opVar.R;
                if (sbVar != null) {
                    if (sbVar.getParent() != null) {
                        ((ViewGroup) opVar.R.getParent()).removeView(opVar.R);
                    }
                    opVar.R = null;
                }
                opVar.T = null;
                super.onAnimationEnd(animator);
                return;
            case 12:
                CheckBox checkBox = (CheckBox) this.f27921b;
                if (animator.equals(checkBox.f22180s)) {
                    checkBox.f22180s = null;
                }
                if (!checkBox.f22182x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f27921b;
                if (animator.equals(checkBoxBase.f22196p)) {
                    checkBoxBase.f22196p = null;
                }
                if (!checkBoxBase.f22197q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                oq oqVar = (oq) this.f27921b;
                if (oqVar.K == oqVar.L) {
                    oqVar.G.setVisibility(4);
                }
                oqVar.f27194y = null;
                return;
            case 15:
                xq xqVar = (xq) this.f27921b;
                xqVar.f30459l = 1.0f;
                xqVar.f30462o = null;
                xqVar.f30463p = null;
                xqVar.f30464q = null;
                View view = xqVar.H;
                if (view != null) {
                    if (xqVar.h == 0 && xqVar.G) {
                        view.setVisibility(8);
                    }
                    xqVar.H.invalidate();
                }
                xqVar.f30453c = -1;
                return;
            case 16:
                lu luVar = (lu) this.f27921b;
                luVar.O = false;
                luVar.d.setTranslationY(0.0f);
                luVar.d.setAlpha(0.0f);
                luVar.c(0.0f);
                luVar.R = 0.0f;
                luVar.j();
                return;
            case 17:
                ((tu) this.f27921b).f28690a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((lv) this.f27921b).d = null;
                return;
            case 19:
                ((mz) this.f27921b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((vy) this.f27921b).f29812n = null;
                return;
            case 21:
                ((k00) this.f27921b).a();
                return;
            case 22:
                m00 m00Var = (m00) this.f27921b;
                m00Var.U = m00Var.f26246c0;
                m00Var.f26244b0 = m00Var.f26250f0;
                m00Var.V = m00Var.f26247d0;
                m00Var.W = m00Var.f26248e0;
                m00Var.f26246c0 = -1;
                m00Var.f26247d0 = -1;
                m00Var.f26248e0 = -1;
                m00Var.f26250f0 = -1;
                return;
            case 23:
                a10 a10Var = (a10) this.f27921b;
                a10Var.f22500s = 1.0f;
                a10Var.invalidate();
                return;
            case 24:
                d60 d60Var = (d60) this.f27921b;
                if (animator == d60Var.W) {
                    d60Var.c(true);
                    d60Var.setVisibility(4);
                    return;
                }
                return;
            case 25:
                a80 a80Var = (a80) this.f27921b;
                y70 y70Var = a80Var.f22610x;
                if (y70Var != null) {
                    y70Var.setProgress(1.0f);
                    a80Var.f22610x.invalidate();
                }
                a80Var.m0 = null;
                return;
            case 26:
                n00 n00Var = (n00) this.f27921b;
                ((j80) n00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) n00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 27:
                x80 x80Var = (x80) this.f27921b;
                if (!x80Var.f30346f) {
                    x80Var.f30345c.setVisibility(8);
                    return;
                }
                return;
            case 28:
                e90 e90Var = (e90) this.f27921b;
                FrameLayout frameLayout = e90Var.f23990b;
                ci.r6 r6Var = (ci.r6) e90Var.f23991c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.fa) e90Var.d);
                return;
            default:
                ac0 ac0Var = (ac0) this.f27921b;
                ac0Var.f22650c0.h = null;
                ac0Var.e(ac0Var.S, ac0Var.R);
                return;
        }
    }
}
