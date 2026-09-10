package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
public final class rm extends AnimatorListenerAdapter {
    public final int f26690a;
    public final Object f26691b;

    public rm(Object obj, int i10) {
        this.f26690a = i10;
        this.f26691b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f26690a) {
            case 23:
                ((zg0) this.f26691b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26690a) {
            case 0:
                wm wmVar = (wm) this.f26691b;
                xm xmVar = wmVar.P;
                xmVar.J = null;
                xmVar.K = false;
                wmVar.invalidate();
                return;
            case 1:
                sp spVar = (sp) this.f26691b;
                bi.gd gdVar = spVar.R;
                if (gdVar != null) {
                    if (gdVar.getParent() != null) {
                        ((ViewGroup) spVar.R.getParent()).removeView(spVar.R);
                    }
                    spVar.R = null;
                }
                spVar.T = null;
                super.onAnimationEnd(animator);
                return;
            case 2:
                CheckBox checkBox = (CheckBox) this.f26691b;
                if (animator.equals(checkBox.f21040s)) {
                    checkBox.f21040s = null;
                }
                if (!checkBox.f21042x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 3:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f26691b;
                if (animator.equals(checkBoxBase.f21056p)) {
                    checkBoxBase.f21056p = null;
                }
                if (!checkBoxBase.f21057q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 4:
                sq sqVar = (sq) this.f26691b;
                if (sqVar.K == sqVar.L) {
                    sqVar.G.setVisibility(4);
                }
                sqVar.f27164y = null;
                return;
            case 5:
                br brVar = (br) this.f26691b;
                brVar.f21877l = 1.0f;
                brVar.f21880o = null;
                brVar.f21881p = null;
                brVar.f21882q = null;
                View view = brVar.H;
                if (view != null) {
                    if (brVar.h == 0 && brVar.G) {
                        view.setVisibility(8);
                    }
                    brVar.H.invalidate();
                }
                brVar.f21871c = -1;
                return;
            case 6:
                nu nuVar = (nu) this.f26691b;
                nuVar.O = false;
                nuVar.d.setTranslationY(0.0f);
                nuVar.d.setAlpha(0.0f);
                nuVar.c(0.0f);
                nuVar.R = 0.0f;
                nuVar.j();
                return;
            case 7:
                ((vu) this.f26691b).f28598a.O = false;
                return;
            case 8:
                super.onAnimationEnd(animator);
                ((nv) this.f26691b).d = null;
                return;
            case 9:
                ((rz) this.f26691b).W = null;
                return;
            case 10:
                super.onAnimationEnd(animator);
                ((az) this.f26691b).f21662n = null;
                return;
            case 11:
                ((p00) this.f26691b).a();
                return;
            case 12:
                r00 r00Var = (r00) this.f26691b;
                r00Var.U = r00Var.f26517c0;
                r00Var.f26515b0 = r00Var.f26521f0;
                r00Var.V = r00Var.f26518d0;
                r00Var.W = r00Var.f26519e0;
                r00Var.f26517c0 = -1;
                r00Var.f26518d0 = -1;
                r00Var.f26519e0 = -1;
                r00Var.f26521f0 = -1;
                return;
            case 13:
                g10 g10Var = (g10) this.f26691b;
                g10Var.f23201s = 1.0f;
                g10Var.invalidate();
                return;
            case 14:
                w70 w70Var = (w70) this.f26691b;
                u70 u70Var = w70Var.f28705x;
                if (u70Var != null) {
                    u70Var.setProgress(1.0f);
                    w70Var.f28705x.invalidate();
                }
                w70Var.m0 = null;
                return;
            case 15:
                s00 s00Var = (s00) this.f26691b;
                ((f80) s00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) s00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 16:
                u80 u80Var = (u80) this.f26691b;
                if (!u80Var.f27609f) {
                    u80Var.f27608c.setVisibility(8);
                    return;
                }
                return;
            case 17:
                b90 b90Var = (b90) this.f26691b;
                FrameLayout frameLayout = b90Var.f21766b;
                bi.s7 s7Var = (bi.s7) b90Var.f21767c;
                if (s7Var.getParent() != null) {
                    frameLayout.removeView(s7Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ha) b90Var.d);
                return;
            case 18:
                yb0 yb0Var = (yb0) this.f26691b;
                yb0Var.f29295c0.h = null;
                yb0Var.e(yb0Var.S, yb0Var.R);
                return;
            case 19:
                NumberTextView numberTextView = (NumberTextView) this.f26691b;
                numberTextView.d = null;
                numberTextView.f21156b.clear();
                return;
            case 20:
                be0 be0Var = (be0) this.f26691b;
                be0Var.setVisibility(8);
                be0Var.h();
                be0Var.P = 0.0f;
                be0Var.f(0.0f);
                be0Var.setAlpha(0.0f);
                return;
            case 21:
                AnimatorSet animatorSet = (AnimatorSet) this.f26691b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 22:
                kf kfVar = (kf) this.f26691b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((bi.oa) kfVar.f24706c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((bi.oa) kfVar.f24706c).e = null;
                    return;
                }
                return;
            case 23:
                return;
            case 24:
                eh0 eh0Var = (eh0) this.f26691b;
                eh0Var.f22705f = false;
                eh0Var.F = null;
                return;
            case 25:
                ((si0) this.f26691b).b();
                return;
            case 26:
                ((zj0) this.f26691b).h.setVisibility(8);
                return;
            case 27:
                vl0 vl0Var = (vl0) this.f26691b;
                View view2 = vl0Var.f27961c1;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                if (vl0Var.a1()) {
                    vl0Var.invalidate();
                    return;
                }
                return;
            case 28:
                sm0 sm0Var = (sm0) this.f26691b;
                if (sm0Var.f27123s != null) {
                    sm0Var.j();
                    sm0Var.f27123s.invalidate();
                    sm0Var.e.invalidate();
                    sm0Var.invalidate();
                    sm0Var.f27123s = null;
                    return;
                }
                return;
            default:
                ((wm0) this.f26691b).d = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f26690a) {
            case 29:
                wm0 wm0Var = (wm0) this.f26691b;
                wm0Var.d = true;
                if (wm0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) wm0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
