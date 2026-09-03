package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class a9 extends AnimatorListenerAdapter {
    public final int f23341a;
    public final Object f23342b;

    public a9(Object obj, int i10) {
        this.f23341a = i10;
        this.f23342b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23341a) {
            case 8:
                ((sl) this.f23342b).f28759a.L = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23341a) {
            case 0:
                c9 c9Var = (c9) this.f23342b;
                if (c9Var.f23878f != null) {
                    c9Var.e = 1.0f;
                    c9Var.n();
                    if (c9Var.f23879g) {
                        c9Var.f23879g = false;
                        Runnable runnable = c9Var.f23881j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    c9Var.f();
                }
                c9Var.f23878f = null;
                return;
            case 1:
                ((hf) this.f23342b).f25396f.V.setVisibility(8);
                return;
            case 2:
                ((lg) this.f23342b).f26656a0 = 1.0f;
                return;
            case 3:
                ((sh) this.f23342b).f28744c.f26734s.setVisibility(8);
                return;
            case 4:
                ((uh) this.f23342b).d.v.setVisibility(8);
                return;
            case 5:
                li liVar = (li) this.f23342b;
                liVar.W0 = null;
                if (!liVar.f26719n1) {
                    if (liVar.U0.getTag() == null && liVar.N0 == 0 && !liVar.Q0) {
                        liVar.X0.setVisibility(4);
                    }
                    liVar.f26696f1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.w0 w0Var = liVar.f26682b1;
                if (w0Var != null) {
                    w0Var.setVisibility(4);
                    return;
                }
                return;
            case 6:
                super.onAnimationEnd(animator);
                hk hkVar = (hk) this.f23342b;
                hkVar.f25437s.setVisibility(8);
                hkVar.f25435n = 0;
                vj vjVar = hkVar.f25436r;
                vjVar.setAlpha(1.0f);
                vjVar.setScaleX(1.0f);
                vjVar.setScaleY(1.0f);
                vjVar.setTranslationX(0.0f);
                vjVar.invalidate();
                return;
            case 7:
                gk gkVar = (gk) this.f23342b;
                if (gkVar.U.E.getTag() == null) {
                    gkVar.U.E.setVisibility(4);
                }
                gkVar.U.F = null;
                return;
            case 8:
                sl slVar = (sl) this.f23342b;
                if (animator.equals(slVar.f28759a.L)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = slVar.f28759a;
                    chatAttachAlertPhotoLayout.W = true;
                    chatAttachAlertPhotoLayout.L = null;
                    return;
                }
                return;
            case 9:
                mm mmVar = (mm) this.f23342b;
                nm nmVar = mmVar.M;
                nmVar.G = null;
                nmVar.H = false;
                mmVar.invalidate();
                return;
            case 10:
                jp jpVar = (jp) this.f23342b;
                to toVar = jpVar.O;
                if (toVar != null) {
                    if (toVar.getParent() != null) {
                        ((ViewGroup) jpVar.O.getParent()).removeView(jpVar.O);
                    }
                    jpVar.O = null;
                }
                jpVar.Q = null;
                super.onAnimationEnd(animator);
                return;
            case 11:
                CheckBox checkBox = (CheckBox) this.f23342b;
                if (animator.equals(checkBox.f22921s)) {
                    checkBox.f22921s = null;
                }
                if (!checkBox.f22923x) {
                    checkBox.D = null;
                    return;
                }
                return;
            case 12:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f23342b;
                if (animator.equals(checkBoxBase.f22937p)) {
                    checkBoxBase.f22937p = null;
                }
                if (!checkBoxBase.f22938q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 13:
                jq jqVar = (jq) this.f23342b;
                if (jqVar.H == jqVar.I) {
                    jqVar.D.setVisibility(4);
                }
                jqVar.f26034y = null;
                return;
            case 14:
                sq sqVar = (sq) this.f23342b;
                sqVar.f28783l = 1.0f;
                sqVar.f28786o = null;
                sqVar.f28787p = null;
                sqVar.f28788q = null;
                View view = sqVar.H;
                if (view != null) {
                    if (sqVar.h == 0 && sqVar.G) {
                        view.setVisibility(8);
                    }
                    sqVar.H.invalidate();
                }
                sqVar.f28777c = -1;
                return;
            case 15:
                cu cuVar = (cu) this.f23342b;
                cuVar.L = false;
                cuVar.d.setTranslationY(0.0f);
                cuVar.d.setAlpha(0.0f);
                cuVar.c(0.0f);
                cuVar.O = 0.0f;
                cuVar.j();
                return;
            case 16:
                ((ku) this.f23342b).f26398a.L = false;
                return;
            case 17:
                super.onAnimationEnd(animator);
                ((cv) this.f23342b).d = null;
                return;
            case 18:
                ((kz) this.f23342b).T = null;
                return;
            case 19:
                super.onAnimationEnd(animator);
                ((sy) this.f23342b).f28835n = null;
                return;
            case 20:
                ((i00) this.f23342b).a();
                return;
            case 21:
                k00 k00Var = (k00) this.f23342b;
                k00Var.R = k00Var.W;
                k00Var.V = k00Var.f26095c0;
                k00Var.S = k00Var.f26091a0;
                k00Var.T = k00Var.f26093b0;
                k00Var.W = -1;
                k00Var.f26091a0 = -1;
                k00Var.f26093b0 = -1;
                k00Var.f26095c0 = -1;
                return;
            case 22:
                z00 z00Var = (z00) this.f23342b;
                z00Var.f31212s = 1.0f;
                z00Var.invalidate();
                return;
            case 23:
                p70 p70Var = (p70) this.f23342b;
                n70 n70Var = p70Var.f27781x;
                if (n70Var != null) {
                    n70Var.setProgress(1.0f);
                    p70Var.f27781x.invalidate();
                }
                p70Var.m0 = null;
                return;
            case 24:
                l00 l00Var = (l00) this.f23342b;
                ((z70) l00Var.e).B = false;
                TextView[] textViewArr = (TextView[]) l00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 25:
                m80 m80Var = (m80) this.f23342b;
                if (!m80Var.f26987f) {
                    m80Var.f26986c.setVisibility(8);
                    return;
                }
                return;
            case 26:
                t80 t80Var = (t80) this.f23342b;
                FrameLayout frameLayout = t80Var.f28944b;
                eg.i0 i0Var = (eg.i0) t80Var.f28945c;
                if (i0Var.getParent() != null) {
                    frameLayout.removeView(i0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.aa) t80Var.d);
                return;
            case 27:
                rb0 rb0Var = (rb0) this.f23342b;
                rb0Var.W.h = null;
                rb0Var.e(rb0Var.P, rb0Var.O);
                return;
            case 28:
                NumberTextView numberTextView = (NumberTextView) this.f23342b;
                numberTextView.d = null;
                numberTextView.f23034b.clear();
                return;
            default:
                wd0 wd0Var = (wd0) this.f23342b;
                wd0Var.setVisibility(8);
                wd0Var.h();
                wd0Var.M = 0.0f;
                wd0Var.f(0.0f);
                wd0Var.setAlpha(0.0f);
                return;
        }
    }
}
