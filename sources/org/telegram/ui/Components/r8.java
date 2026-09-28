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
                ((yl) this.f27921b).f30675a.O = null;
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
                e9 e9Var = ((s8) this.f27921b).f28162b;
                e9Var.f23960f = false;
                e9Var.e.setVisibility(8);
                return;
            case 1:
                j9 j9Var = (j9) this.f27921b;
                if (j9Var.f25376f != null) {
                    j9Var.e = 1.0f;
                    j9Var.n();
                    if (j9Var.f25377g) {
                        j9Var.f25377g = false;
                        Runnable runnable = j9Var.f25379j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f25376f = null;
                return;
            case 2:
                ((sf) this.f27921b).f28212f.f21961b0.setVisibility(8);
                return;
            case 3:
                ((vg) this.f27921b).f29097d0 = 1.0f;
                return;
            case 4:
                ((di) this.f27921b).f23667c.f29982s.setVisibility(8);
                return;
            case 5:
                ((fi) this.f27921b).d.v.setVisibility(8);
                return;
            case 6:
                wi wiVar = (wi) this.f27921b;
                wiVar.Z0 = null;
                if (!wiVar.f29976q1) {
                    if (wiVar.X0.getTag() == null && wiVar.Q0 == 0 && !wiVar.T0) {
                        wiVar.f29927a1.setVisibility(4);
                    }
                    wiVar.f29953i1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var = wiVar.f29940e1;
                if (u0Var != null) {
                    u0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                qk qkVar = (qk) this.f27921b;
                qkVar.f27750s.setVisibility(8);
                qkVar.f27748n = 0;
                fk fkVar = qkVar.f27749r;
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
                if (animator.equals(ylVar.f30675a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ylVar.f30675a;
                    chatAttachAlertPhotoLayout.f22130c0 = true;
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
                CheckBox checkBox = (CheckBox) this.f27921b;
                if (animator.equals(checkBox.f22178s)) {
                    checkBox.f22178s = null;
                }
                if (!checkBox.f22180x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f27921b;
                if (animator.equals(checkBoxBase.f22194p)) {
                    checkBoxBase.f22194p = null;
                }
                if (!checkBoxBase.f22195q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                oq oqVar = (oq) this.f27921b;
                if (oqVar.K == oqVar.L) {
                    oqVar.G.setVisibility(4);
                }
                oqVar.f27172y = null;
                return;
            case 15:
                xq xqVar = (xq) this.f27921b;
                xqVar.f30455l = 1.0f;
                xqVar.f30458o = null;
                xqVar.f30459p = null;
                xqVar.f30460q = null;
                View view = xqVar.H;
                if (view != null) {
                    if (xqVar.h == 0 && xqVar.G) {
                        view.setVisibility(8);
                    }
                    xqVar.H.invalidate();
                }
                xqVar.f30449c = -1;
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
                ((tu) this.f27921b).f28627a.O = false;
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
                ((vy) this.f27921b).f29769n = null;
                return;
            case 21:
                ((k00) this.f27921b).a();
                return;
            case 22:
                m00 m00Var = (m00) this.f27921b;
                m00Var.U = m00Var.f26191c0;
                m00Var.f26189b0 = m00Var.f26195f0;
                m00Var.V = m00Var.f26192d0;
                m00Var.W = m00Var.f26193e0;
                m00Var.f26191c0 = -1;
                m00Var.f26192d0 = -1;
                m00Var.f26193e0 = -1;
                m00Var.f26195f0 = -1;
                return;
            case 23:
                a10 a10Var = (a10) this.f27921b;
                a10Var.f22498s = 1.0f;
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
                y70 y70Var = a80Var.f22607x;
                if (y70Var != null) {
                    y70Var.setProgress(1.0f);
                    a80Var.f22607x.invalidate();
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
                if (!x80Var.f30318f) {
                    x80Var.f30317c.setVisibility(8);
                    return;
                }
                return;
            case 28:
                e90 e90Var = (e90) this.f27921b;
                FrameLayout frameLayout = e90Var.f23968b;
                ci.r6 r6Var = (ci.r6) e90Var.f23969c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.fa) e90Var.d);
                return;
            default:
                bc0 bc0Var = (bc0) this.f27921b;
                bc0Var.f22951c0.h = null;
                bc0Var.e(bc0Var.S, bc0Var.R);
                return;
        }
    }
}
