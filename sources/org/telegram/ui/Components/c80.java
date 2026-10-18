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
    public final int f25138a;
    public final Object f25139b;

    public c80(Object obj, int i10) {
        this.f25138a = i10;
        this.f25139b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25138a) {
            case 9:
                ((kh0) this.f25139b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25138a) {
            case 0:
                i80 i80Var = (i80) this.f25139b;
                g80 g80Var = i80Var.f27145x;
                if (g80Var != null) {
                    g80Var.setProgress(1.0f);
                    i80Var.f27145x.invalidate();
                }
                i80Var.m0 = null;
                return;
            case 1:
                t00 t00Var = (t00) this.f25139b;
                ((r80) t00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) t00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 2:
                e90 e90Var = (e90) this.f25139b;
                if (!e90Var.f25896f) {
                    e90Var.f25895c.setVisibility(8);
                    return;
                }
                return;
            case 3:
                m90 m90Var = (m90) this.f25139b;
                FrameLayout frameLayout = m90Var.f28482b;
                ei.g6 g6Var = (ei.g6) m90Var.f28483c;
                if (g6Var.getParent() != null) {
                    frameLayout.removeView(g6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ca) m90Var.d);
                return;
            case 4:
                ic0 ic0Var = (ic0) this.f25139b;
                ic0Var.f27192c0.h = null;
                ic0Var.f(ic0Var.S, ic0Var.R);
                return;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.f25139b;
                numberTextView.d = null;
                numberTextView.f24253b.clear();
                return;
            case 6:
                le0 le0Var = (le0) this.f25139b;
                le0Var.S = null;
                le0Var.f28224r.setText("");
                ei.x8.a(le0Var.f28225s, false);
                le0Var.setVisibility(8);
                le0Var.f28212a0 = 0.0f;
                le0Var.g(0.0f);
                le0Var.setAlpha(0.0f);
                le0Var.i();
                return;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.f25139b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 8:
                hf hfVar = (hf) this.f25139b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ei.x8) hfVar.f26885c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ei.x8) hfVar.f26885c).e = null;
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                ph0 ph0Var = (ph0) this.f25139b;
                ph0Var.f29312f = false;
                ph0Var.F = null;
                return;
            case 11:
                ((ej0) this.f25139b).b();
                return;
            case 12:
                ((mk0) this.f25139b).h.setVisibility(8);
                return;
            case 13:
                im0 im0Var = (im0) this.f25139b;
                View view = im0Var.f27266a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (im0Var.b1()) {
                    im0Var.invalidate();
                    return;
                }
                return;
            case 14:
                gn0 gn0Var = (gn0) this.f25139b;
                if (gn0Var.f26625s != null) {
                    gn0Var.j();
                    gn0Var.f26625s.invalidate();
                    gn0Var.e.invalidate();
                    gn0Var.invalidate();
                    gn0Var.f26625s = null;
                    return;
                }
                return;
            case 15:
                ((kn0) this.f25139b).d = false;
                return;
            case 16:
                ((vo0) this.f25139b).M0.setVisibility(8);
                return;
            case 17:
                sp0 sp0Var = (sp0) this.f25139b;
                if (animator == sp0Var.h) {
                    sp0Var.h = null;
                    return;
                }
                return;
            case 18:
                ((cr0) this.f25139b).f25365f = null;
                return;
            case 19:
                kr0 kr0Var = (kr0) this.f25139b;
                if (kr0Var.getParent() != null) {
                    ((ViewGroup) kr0Var.getParent()).removeView(kr0Var);
                    return;
                }
                return;
            case 20:
                nt0 nt0Var = (nt0) this.f25139b;
                View view2 = nt0Var.f28825c;
                view2.setAlpha(1.0f);
                s4.n0.x0(view2);
                nt0Var.f28823a.removeView(view2);
                return;
            case 21:
                zv0 zv0Var = (zv0) this.f25139b;
                if (zv0Var.f33042f == animator) {
                    zv0Var.f33042f = null;
                    return;
                }
                return;
            case 22:
                px0 px0Var = (px0) this.f25139b;
                px0.z1(px0Var, ((Float) px0Var.f29465n3.getAnimatedValue()).floatValue());
                px0Var.f29465n3 = null;
                return;
            case 23:
                oy0 oy0Var = (oy0) this.f25139b;
                oy0Var.f29113x.setVisibility(8);
                oy0Var.F.setImageDrawable(null);
                return;
            case 24:
                int i10 = 0;
                while (true) {
                    uy0[] uy0VarArr = (uy0[]) this.f25139b;
                    if (i10 < uy0VarArr.length) {
                        uy0 uy0Var = uy0VarArr[i10];
                        if (uy0Var != null) {
                            uy0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 25:
                super.onAnimationEnd(animator);
                ((vy0) this.f25139b).H = null;
                return;
            case 26:
                ((yy0) this.f25139b).e = false;
                return;
            case 27:
                ((k11) this.f25139b).setVisibility(4);
                return;
            case 28:
                ((t21) this.f25139b).setVisibility(8);
                return;
            default:
                ci.i3 i3Var = ((k31) this.f25139b).f27730f;
                i3Var.setScaleX(1.0f);
                i3Var.setScaleY(1.0f);
                i3Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25138a) {
            case 15:
                kn0 kn0Var = (kn0) this.f25139b;
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

    public c80(nt0 nt0Var, s4.n0 n0Var) {
        this.f25138a = 20;
        this.f25139b = nt0Var;
    }

    private final void a(Animator animator) {
    }
}
