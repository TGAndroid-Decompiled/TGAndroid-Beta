package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class a9 extends AnimatorListenerAdapter {
    public final int f23318a;
    public final Object f23319b;

    public a9(Object obj, int i10) {
        this.f23318a = i10;
        this.f23319b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23318a) {
            case 8:
                ((tl) this.f23319b).f28987a.L = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23318a) {
            case 0:
                c9 c9Var = (c9) this.f23319b;
                if (c9Var.f23925f != null) {
                    c9Var.e = 1.0f;
                    c9Var.n();
                    if (c9Var.f23926g) {
                        c9Var.f23926g = false;
                        Runnable runnable = c9Var.f23928j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    c9Var.f();
                }
                c9Var.f23925f = null;
                return;
            case 1:
                ((hf) this.f23319b).f25408f.V.setVisibility(8);
                return;
            case 2:
                ((lg) this.f23319b).f26639a0 = 1.0f;
                return;
            case 3:
                ((sh) this.f23319b).f28713c.f26738s.setVisibility(8);
                return;
            case 4:
                ((uh) this.f23319b).d.v.setVisibility(8);
                return;
            case 5:
                li liVar = (li) this.f23319b;
                liVar.W0 = null;
                if (!liVar.f26723n1) {
                    if (liVar.U0.getTag() == null && liVar.N0 == 0 && !liVar.Q0) {
                        liVar.X0.setVisibility(4);
                    }
                    liVar.f26700f1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.w0 w0Var = liVar.f26686b1;
                if (w0Var != null) {
                    w0Var.setVisibility(4);
                    return;
                }
                return;
            case 6:
                super.onAnimationEnd(animator);
                hk hkVar = (hk) this.f23319b;
                hkVar.f25435s.setVisibility(8);
                hkVar.f25433n = 0;
                vj vjVar = hkVar.f25434r;
                vjVar.setAlpha(1.0f);
                vjVar.setScaleX(1.0f);
                vjVar.setScaleY(1.0f);
                vjVar.setTranslationX(0.0f);
                vjVar.invalidate();
                return;
            case 7:
                gk gkVar = (gk) this.f23319b;
                if (gkVar.U.E.getTag() == null) {
                    gkVar.U.E.setVisibility(4);
                }
                gkVar.U.F = null;
                return;
            case 8:
                tl tlVar = (tl) this.f23319b;
                if (animator.equals(tlVar.f28987a.L)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tlVar.f28987a;
                    chatAttachAlertPhotoLayout.W = true;
                    chatAttachAlertPhotoLayout.L = null;
                    return;
                }
                return;
            case 9:
                nm nmVar = (nm) this.f23319b;
                om omVar = nmVar.M;
                omVar.G = null;
                omVar.H = false;
                nmVar.invalidate();
                return;
            case 10:
                kp kpVar = (kp) this.f23319b;
                uo uoVar = kpVar.O;
                if (uoVar != null) {
                    if (uoVar.getParent() != null) {
                        ((ViewGroup) kpVar.O.getParent()).removeView(kpVar.O);
                    }
                    kpVar.O = null;
                }
                kpVar.Q = null;
                super.onAnimationEnd(animator);
                return;
            case 11:
                CheckBox checkBox = (CheckBox) this.f23319b;
                if (animator.equals(checkBox.f22948s)) {
                    checkBox.f22948s = null;
                }
                if (!checkBox.f22950x) {
                    checkBox.D = null;
                    return;
                }
                return;
            case 12:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f23319b;
                if (animator.equals(checkBoxBase.f22964p)) {
                    checkBoxBase.f22964p = null;
                }
                if (!checkBoxBase.f22965q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 13:
                kq kqVar = (kq) this.f23319b;
                if (kqVar.H == kqVar.I) {
                    kqVar.D.setVisibility(4);
                }
                kqVar.f26364y = null;
                return;
            case 14:
                tq tqVar = (tq) this.f23319b;
                tqVar.f29011l = 1.0f;
                tqVar.f29014o = null;
                tqVar.f29015p = null;
                tqVar.f29016q = null;
                View view = tqVar.H;
                if (view != null) {
                    if (tqVar.h == 0 && tqVar.G) {
                        view.setVisibility(8);
                    }
                    tqVar.H.invalidate();
                }
                tqVar.f29005c = -1;
                return;
            case 15:
                du duVar = (du) this.f23319b;
                duVar.L = false;
                duVar.d.setTranslationY(0.0f);
                duVar.d.setAlpha(0.0f);
                duVar.c(0.0f);
                duVar.O = 0.0f;
                duVar.j();
                return;
            case 16:
                ((lu) this.f23319b).f26886a.L = false;
                return;
            case 17:
                super.onAnimationEnd(animator);
                ((dv) this.f23319b).d = null;
                return;
            case 18:
                ((kz) this.f23319b).T = null;
                return;
            case 19:
                super.onAnimationEnd(animator);
                ((sy) this.f23319b).f28832n = null;
                return;
            case 20:
                ((h00) this.f23319b).a();
                return;
            case 21:
                j00 j00Var = (j00) this.f23319b;
                j00Var.R = j00Var.W;
                j00Var.V = j00Var.f25819c0;
                j00Var.S = j00Var.f25815a0;
                j00Var.T = j00Var.f25817b0;
                j00Var.W = -1;
                j00Var.f25815a0 = -1;
                j00Var.f25817b0 = -1;
                j00Var.f25819c0 = -1;
                return;
            case 22:
                y00 y00Var = (y00) this.f23319b;
                y00Var.f30806s = 1.0f;
                y00Var.invalidate();
                return;
            case 23:
                o70 o70Var = (o70) this.f23319b;
                m70 m70Var = o70Var.f27493x;
                if (m70Var != null) {
                    m70Var.setProgress(1.0f);
                    o70Var.f27493x.invalidate();
                }
                o70Var.m0 = null;
                return;
            case 24:
                k00 k00Var = (k00) this.f23319b;
                ((y70) k00Var.e).B = false;
                TextView[] textViewArr = (TextView[]) k00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 25:
                m80 m80Var = (m80) this.f23319b;
                if (!m80Var.f26977f) {
                    m80Var.f26976c.setVisibility(8);
                    return;
                }
                return;
            case 26:
                t80 t80Var = (t80) this.f23319b;
                FrameLayout frameLayout = t80Var.f28931b;
                eg.i0 i0Var = (eg.i0) t80Var.f28932c;
                if (i0Var.getParent() != null) {
                    frameLayout.removeView(i0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ba) t80Var.d);
                return;
            case 27:
                qb0 qb0Var = (qb0) this.f23319b;
                qb0Var.W.h = null;
                qb0Var.e(qb0Var.P, qb0Var.O);
                return;
            case 28:
                NumberTextView numberTextView = (NumberTextView) this.f23319b;
                numberTextView.d = null;
                numberTextView.f23061b.clear();
                return;
            default:
                vd0 vd0Var = (vd0) this.f23319b;
                vd0Var.setVisibility(8);
                vd0Var.h();
                vd0Var.M = 0.0f;
                vd0Var.f(0.0f);
                vd0Var.setAlpha(0.0f);
                return;
        }
    }
}
