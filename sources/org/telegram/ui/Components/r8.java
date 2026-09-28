package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class r8 extends AnimatorListenerAdapter {
    public final int f27919a;
    public final Object f27920b;

    public r8(Object obj, int i10) {
        this.f27919a = i10;
        this.f27920b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27919a) {
            case 9:
                ((yl) this.f27920b).f30674a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27919a) {
            case 0:
                e9 e9Var = ((s8) this.f27920b).f28161b;
                e9Var.f23959f = false;
                e9Var.e.setVisibility(8);
                return;
            case 1:
                j9 j9Var = (j9) this.f27920b;
                if (j9Var.f25375f != null) {
                    j9Var.e = 1.0f;
                    j9Var.n();
                    if (j9Var.f25376g) {
                        j9Var.f25376g = false;
                        Runnable runnable = j9Var.f25378j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f25375f = null;
                return;
            case 2:
                ((sf) this.f27920b).f28211f.f21960b0.setVisibility(8);
                return;
            case 3:
                ((vg) this.f27920b).f29096d0 = 1.0f;
                return;
            case 4:
                ((di) this.f27920b).f23666c.f29981s.setVisibility(8);
                return;
            case 5:
                ((fi) this.f27920b).d.v.setVisibility(8);
                return;
            case 6:
                wi wiVar = (wi) this.f27920b;
                wiVar.Z0 = null;
                if (!wiVar.f29975q1) {
                    if (wiVar.X0.getTag() == null && wiVar.Q0 == 0 && !wiVar.T0) {
                        wiVar.f29926a1.setVisibility(4);
                    }
                    wiVar.f29952i1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var = wiVar.f29939e1;
                if (u0Var != null) {
                    u0Var.setVisibility(4);
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                qk qkVar = (qk) this.f27920b;
                qkVar.f27749s.setVisibility(8);
                qkVar.f27747n = 0;
                fk fkVar = qkVar.f27748r;
                fkVar.setAlpha(1.0f);
                fkVar.setScaleX(1.0f);
                fkVar.setScaleY(1.0f);
                fkVar.setTranslationX(0.0f);
                fkVar.invalidate();
                return;
            case 8:
                pk pkVar = (pk) this.f27920b;
                if (pkVar.X.H.getTag() == null) {
                    pkVar.X.H.setVisibility(4);
                }
                pkVar.X.I = null;
                return;
            case 9:
                yl ylVar = (yl) this.f27920b;
                if (animator.equals(ylVar.f30674a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ylVar.f30674a;
                    chatAttachAlertPhotoLayout.f22129c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 10:
                rm rmVar = (rm) this.f27920b;
                sm smVar = rmVar.P;
                smVar.J = null;
                smVar.K = false;
                rmVar.invalidate();
                return;
            case 11:
                op opVar = (op) this.f27920b;
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
                CheckBox checkBox = (CheckBox) this.f27920b;
                if (animator.equals(checkBox.f22177s)) {
                    checkBox.f22177s = null;
                }
                if (!checkBox.f22179x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f27920b;
                if (animator.equals(checkBoxBase.f22193p)) {
                    checkBoxBase.f22193p = null;
                }
                if (!checkBoxBase.f22194q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 14:
                oq oqVar = (oq) this.f27920b;
                if (oqVar.K == oqVar.L) {
                    oqVar.G.setVisibility(4);
                }
                oqVar.f27171y = null;
                return;
            case 15:
                xq xqVar = (xq) this.f27920b;
                xqVar.f30454l = 1.0f;
                xqVar.f30457o = null;
                xqVar.f30458p = null;
                xqVar.f30459q = null;
                View view = xqVar.H;
                if (view != null) {
                    if (xqVar.h == 0 && xqVar.G) {
                        view.setVisibility(8);
                    }
                    xqVar.H.invalidate();
                }
                xqVar.f30448c = -1;
                return;
            case 16:
                lu luVar = (lu) this.f27920b;
                luVar.O = false;
                luVar.d.setTranslationY(0.0f);
                luVar.d.setAlpha(0.0f);
                luVar.c(0.0f);
                luVar.R = 0.0f;
                luVar.j();
                return;
            case 17:
                ((tu) this.f27920b).f28626a.O = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((lv) this.f27920b).d = null;
                return;
            case 19:
                ((mz) this.f27920b).W = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((vy) this.f27920b).f29768n = null;
                return;
            case 21:
                ((k00) this.f27920b).a();
                return;
            case 22:
                m00 m00Var = (m00) this.f27920b;
                m00Var.U = m00Var.f26190c0;
                m00Var.f26188b0 = m00Var.f26194f0;
                m00Var.V = m00Var.f26191d0;
                m00Var.W = m00Var.f26192e0;
                m00Var.f26190c0 = -1;
                m00Var.f26191d0 = -1;
                m00Var.f26192e0 = -1;
                m00Var.f26194f0 = -1;
                return;
            case 23:
                a10 a10Var = (a10) this.f27920b;
                a10Var.f22497s = 1.0f;
                a10Var.invalidate();
                return;
            case 24:
                d60 d60Var = (d60) this.f27920b;
                if (animator == d60Var.W) {
                    d60Var.c(true);
                    d60Var.setVisibility(4);
                    return;
                }
                return;
            case 25:
                a80 a80Var = (a80) this.f27920b;
                y70 y70Var = a80Var.f22606x;
                if (y70Var != null) {
                    y70Var.setProgress(1.0f);
                    a80Var.f22606x.invalidate();
                }
                a80Var.m0 = null;
                return;
            case 26:
                n00 n00Var = (n00) this.f27920b;
                ((j80) n00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) n00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 27:
                x80 x80Var = (x80) this.f27920b;
                if (!x80Var.f30317f) {
                    x80Var.f30316c.setVisibility(8);
                    return;
                }
                return;
            case 28:
                e90 e90Var = (e90) this.f27920b;
                FrameLayout frameLayout = e90Var.f23967b;
                ci.r6 r6Var = (ci.r6) e90Var.f23968c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.fa) e90Var.d);
                return;
            default:
                bc0 bc0Var = (bc0) this.f27920b;
                bc0Var.f22950c0.h = null;
                bc0Var.e(bc0Var.S, bc0Var.R);
                return;
        }
    }
}
