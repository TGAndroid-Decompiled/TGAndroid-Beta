package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
public final class c80 extends AnimatorListenerAdapter {
    public final int f25111a;
    public final Object f25112b;

    public c80(Object obj, int i10) {
        this.f25111a = i10;
        this.f25112b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25111a) {
            case 9:
                ((kh0) this.f25112b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25111a) {
            case 0:
                i80 i80Var = (i80) this.f25112b;
                g80 g80Var = i80Var.f27138x;
                if (g80Var != null) {
                    g80Var.setProgress(1.0f);
                    i80Var.f27138x.invalidate();
                }
                i80Var.m0 = null;
                return;
            case 1:
                t00 t00Var = (t00) this.f25112b;
                ((r80) t00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) t00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 2:
                e90 e90Var = (e90) this.f25112b;
                if (!e90Var.f25868f) {
                    e90Var.f25867c.setVisibility(8);
                    return;
                }
                return;
            case 3:
                m90 m90Var = (m90) this.f25112b;
                FrameLayout frameLayout = m90Var.f28488b;
                ei.g6 g6Var = (ei.g6) m90Var.f28489c;
                if (g6Var.getParent() != null) {
                    frameLayout.removeView(g6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ca) m90Var.d);
                return;
            case 4:
                ic0 ic0Var = (ic0) this.f25112b;
                ic0Var.f27200c0.h = null;
                ic0Var.f(ic0Var.S, ic0Var.R);
                return;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.f25112b;
                numberTextView.d = null;
                numberTextView.f24247b.clear();
                return;
            case 6:
                le0 le0Var = (le0) this.f25112b;
                le0Var.S = null;
                le0Var.f28202r.setText("");
                ei.x8.a(le0Var.f28203s, false);
                le0Var.setVisibility(8);
                le0Var.f28190a0 = 0.0f;
                le0Var.g(0.0f);
                le0Var.setAlpha(0.0f);
                le0Var.i();
                return;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.f25112b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 8:
                hf hfVar = (hf) this.f25112b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ei.x8) hfVar.f26871c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ei.x8) hfVar.f26871c).e = null;
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                ph0 ph0Var = (ph0) this.f25112b;
                ph0Var.f29275f = false;
                ph0Var.F = null;
                return;
            case 11:
                ((ej0) this.f25112b).b();
                return;
            case 12:
                ((mk0) this.f25112b).h.setVisibility(8);
                return;
            case 13:
                im0 im0Var = (im0) this.f25112b;
                View view = im0Var.f27274a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (im0Var.b1()) {
                    im0Var.invalidate();
                    return;
                }
                return;
            case 14:
                gn0 gn0Var = (gn0) this.f25112b;
                if (gn0Var.f26645s != null) {
                    gn0Var.j();
                    gn0Var.f26645s.invalidate();
                    gn0Var.e.invalidate();
                    gn0Var.invalidate();
                    gn0Var.f26645s = null;
                    return;
                }
                return;
            case 15:
                ((kn0) this.f25112b).d = false;
                return;
            case 16:
                ((vo0) this.f25112b).M0.setVisibility(8);
                return;
            case 17:
                sp0 sp0Var = (sp0) this.f25112b;
                if (animator == sp0Var.h) {
                    sp0Var.h = null;
                    return;
                }
                return;
            case 18:
                ((dr0) this.f25112b).f25625f = null;
                return;
            case 19:
                lr0 lr0Var = (lr0) this.f25112b;
                if (lr0Var.getParent() != null) {
                    ((ViewGroup) lr0Var.getParent()).removeView(lr0Var);
                    return;
                }
                return;
            case 20:
                ot0 ot0Var = (ot0) this.f25112b;
                View view2 = ot0Var.f29092c;
                view2.setAlpha(1.0f);
                s4.n0.x0(view2);
                ot0Var.f29090a.removeView(view2);
                return;
            case 21:
                aw0 aw0Var = (aw0) this.f25112b;
                if (aw0Var.f24724f == animator) {
                    aw0Var.f24724f = null;
                    return;
                }
                return;
            case 22:
                qx0 qx0Var = (qx0) this.f25112b;
                qx0.z1(qx0Var, ((Float) qx0Var.f29747n3.getAnimatedValue()).floatValue());
                qx0Var.f29747n3 = null;
                return;
            case 23:
                py0 py0Var = (py0) this.f25112b;
                py0Var.f29441x.setVisibility(8);
                py0Var.F.setImageDrawable(null);
                return;
            case 24:
                int i10 = 0;
                while (true) {
                    vy0[] vy0VarArr = (vy0[]) this.f25112b;
                    if (i10 < vy0VarArr.length) {
                        vy0 vy0Var = vy0VarArr[i10];
                        if (vy0Var != null) {
                            vy0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 25:
                super.onAnimationEnd(animator);
                ((wy0) this.f25112b).H = null;
                return;
            case 26:
                ((zy0) this.f25112b).e = false;
                return;
            case 27:
                ((l11) this.f25112b).setVisibility(4);
                return;
            case 28:
                ((u21) this.f25112b).setVisibility(8);
                return;
            default:
                ci.i3 i3Var = ((l31) this.f25112b).f28065f;
                i3Var.setScaleX(1.0f);
                i3Var.setScaleY(1.0f);
                i3Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25111a) {
            case 15:
                kn0 kn0Var = (kn0) this.f25112b;
                kn0Var.d = true;
                if (kn0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) kn0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public c80(ot0 ot0Var, s4.n0 n0Var) {
        this.f25111a = 20;
        this.f25112b = ot0Var;
    }

    private final void a(Animator animator) {
    }
}
