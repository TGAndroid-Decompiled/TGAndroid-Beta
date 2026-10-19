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
    public final int f25113a;
    public final Object f25114b;

    public c80(Object obj, int i10) {
        this.f25113a = i10;
        this.f25114b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25113a) {
            case 9:
                ((kh0) this.f25114b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25113a) {
            case 0:
                i80 i80Var = (i80) this.f25114b;
                g80 g80Var = i80Var.f27140x;
                if (g80Var != null) {
                    g80Var.setProgress(1.0f);
                    i80Var.f27140x.invalidate();
                }
                i80Var.m0 = null;
                return;
            case 1:
                t00 t00Var = (t00) this.f25114b;
                ((r80) t00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) t00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 2:
                e90 e90Var = (e90) this.f25114b;
                if (!e90Var.f25870f) {
                    e90Var.f25869c.setVisibility(8);
                    return;
                }
                return;
            case 3:
                m90 m90Var = (m90) this.f25114b;
                FrameLayout frameLayout = m90Var.f28490b;
                ei.g6 g6Var = (ei.g6) m90Var.f28491c;
                if (g6Var.getParent() != null) {
                    frameLayout.removeView(g6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ca) m90Var.d);
                return;
            case 4:
                ic0 ic0Var = (ic0) this.f25114b;
                ic0Var.f27202c0.h = null;
                ic0Var.f(ic0Var.S, ic0Var.R);
                return;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.f25114b;
                numberTextView.d = null;
                numberTextView.f24249b.clear();
                return;
            case 6:
                le0 le0Var = (le0) this.f25114b;
                le0Var.S = null;
                le0Var.f28204r.setText("");
                ei.x8.a(le0Var.f28205s, false);
                le0Var.setVisibility(8);
                le0Var.f28192a0 = 0.0f;
                le0Var.g(0.0f);
                le0Var.setAlpha(0.0f);
                le0Var.i();
                return;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.f25114b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 8:
                hf hfVar = (hf) this.f25114b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ei.x8) hfVar.f26873c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ei.x8) hfVar.f26873c).e = null;
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                ph0 ph0Var = (ph0) this.f25114b;
                ph0Var.f29277f = false;
                ph0Var.F = null;
                return;
            case 11:
                ((ej0) this.f25114b).b();
                return;
            case 12:
                ((mk0) this.f25114b).h.setVisibility(8);
                return;
            case 13:
                im0 im0Var = (im0) this.f25114b;
                View view = im0Var.f27276a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (im0Var.b1()) {
                    im0Var.invalidate();
                    return;
                }
                return;
            case 14:
                gn0 gn0Var = (gn0) this.f25114b;
                if (gn0Var.f26647s != null) {
                    gn0Var.j();
                    gn0Var.f26647s.invalidate();
                    gn0Var.e.invalidate();
                    gn0Var.invalidate();
                    gn0Var.f26647s = null;
                    return;
                }
                return;
            case 15:
                ((kn0) this.f25114b).d = false;
                return;
            case 16:
                ((vo0) this.f25114b).M0.setVisibility(8);
                return;
            case 17:
                sp0 sp0Var = (sp0) this.f25114b;
                if (animator == sp0Var.h) {
                    sp0Var.h = null;
                    return;
                }
                return;
            case 18:
                ((dr0) this.f25114b).f25627f = null;
                return;
            case 19:
                lr0 lr0Var = (lr0) this.f25114b;
                if (lr0Var.getParent() != null) {
                    ((ViewGroup) lr0Var.getParent()).removeView(lr0Var);
                    return;
                }
                return;
            case 20:
                ot0 ot0Var = (ot0) this.f25114b;
                View view2 = ot0Var.f29094c;
                view2.setAlpha(1.0f);
                s4.n0.x0(view2);
                ot0Var.f29092a.removeView(view2);
                return;
            case 21:
                aw0 aw0Var = (aw0) this.f25114b;
                if (aw0Var.f24726f == animator) {
                    aw0Var.f24726f = null;
                    return;
                }
                return;
            case 22:
                qx0 qx0Var = (qx0) this.f25114b;
                qx0.z1(qx0Var, ((Float) qx0Var.f29749n3.getAnimatedValue()).floatValue());
                qx0Var.f29749n3 = null;
                return;
            case 23:
                py0 py0Var = (py0) this.f25114b;
                py0Var.f29443x.setVisibility(8);
                py0Var.F.setImageDrawable(null);
                return;
            case 24:
                int i10 = 0;
                while (true) {
                    vy0[] vy0VarArr = (vy0[]) this.f25114b;
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
                ((wy0) this.f25114b).H = null;
                return;
            case 26:
                ((zy0) this.f25114b).e = false;
                return;
            case 27:
                ((l11) this.f25114b).setVisibility(4);
                return;
            case 28:
                ((u21) this.f25114b).setVisibility(8);
                return;
            default:
                ci.i3 i3Var = ((l31) this.f25114b).f28067f;
                i3Var.setScaleX(1.0f);
                i3Var.setScaleY(1.0f);
                i3Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25113a) {
            case 15:
                kn0 kn0Var = (kn0) this.f25114b;
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
        this.f25113a = 20;
        this.f25114b = ot0Var;
    }

    private final void a(Animator animator) {
    }
}
