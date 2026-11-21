package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
public final class s60 extends AnimatorListenerAdapter {
    public final int f39497a;
    public final Object f39498b;

    public s60(Object obj, int i7) {
        this.f39497a = i7;
        this.f39498b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39497a) {
            case 9:
                ((ff0) this.f39498b).f35220r1 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39497a) {
            case 0:
                a70 a70Var = (a70) this.f39498b;
                w60 w60Var = a70Var.f33390x;
                if (w60Var != null) {
                    w60Var.setProgress(1.0f);
                    a70Var.f33390x.invalidate();
                }
                a70Var.f33379p0 = null;
                return;
            case 1:
                org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) this.f39498b;
                ((i70) x0Var.f32311e).B1 = false;
                TextView[] textViewArr = (TextView[]) x0Var.f32309b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 2:
                v70 v70Var = (v70) this.f39498b;
                if (!v70Var.f40701f) {
                    v70Var.f40699c.setVisibility(8);
                    return;
                }
                return;
            case 3:
                c80 c80Var = (c80) this.f39498b;
                FrameLayout frameLayout = c80Var.f34119b;
                hi.l5 l5Var = (hi.l5) c80Var.f34120c;
                if (l5Var.getParent() != null) {
                    frameLayout.removeView(l5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ActionBar.h1) c80Var.d);
                return;
            case 4:
                qa0 qa0Var = (qa0) this.f39498b;
                qa0Var.f38864d0.h = null;
                qa0Var.f(qa0Var.T, qa0Var.S);
                return;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.f39498b;
                numberTextView.d = null;
                numberTextView.f33023b.clear();
                return;
            case 6:
                qc0 qc0Var = (qc0) this.f39498b;
                qc0Var.T = null;
                qc0Var.f38893r.setText("");
                hi.x7.a(qc0Var.f38894s, false);
                qc0Var.setVisibility(8);
                qc0Var.f38881b0 = 0.0f;
                qc0Var.h(0.0f);
                qc0Var.setAlpha(0.0f);
                qc0Var.j();
                return;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.f39498b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 8:
                we weVar = (we) this.f39498b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((hi.x7) weVar.f41790c).f15756e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((hi.x7) weVar.f41790c).f15756e = null;
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                kf0 kf0Var = (kf0) this.f39498b;
                kf0Var.f36899f = false;
                kf0Var.G = null;
                return;
            case 11:
                ((zg0) this.f39498b).b();
                return;
            case 12:
                ((gi0) this.f39498b).h.setVisibility(8);
                return;
            case 13:
                ((Runnable) this.f39498b).run();
                return;
            case 14:
                ek0 ek0Var = (ek0) this.f39498b;
                View view = ek0Var.f34851b1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (ek0Var.b1()) {
                    ek0Var.invalidate();
                    return;
                }
                return;
            case 15:
                gl0 gl0Var = (gl0) this.f39498b;
                if (gl0Var.f35610s != null) {
                    gl0Var.j();
                    gl0Var.f35610s.invalidate();
                    gl0Var.f35593e.invalidate();
                    gl0Var.invalidate();
                    gl0Var.f35610s = null;
                    return;
                }
                return;
            case 16:
                ((kl0) this.f39498b).d = false;
                return;
            case 17:
                ((um0) this.f39498b).P0.setVisibility(8);
                return;
            case 18:
                rn0 rn0Var = (rn0) this.f39498b;
                if (animator == rn0Var.h) {
                    rn0Var.h = null;
                    return;
                }
                return;
            case 19:
                ((oo0) this.f39498b).f38323f = null;
                return;
            case 20:
                bi.t2 t2Var = (bi.t2) this.f39498b;
                if (t2Var.getParent() != null) {
                    ((ViewGroup) t2Var.getParent()).removeView(t2Var);
                    return;
                }
                return;
            case 21:
                kr0 kr0Var = (kr0) this.f39498b;
                View view2 = kr0Var.f36960c;
                view2.setAlpha(1.0f);
                v4.p0.x0(view2);
                kr0Var.f36958a.removeView(view2);
                return;
            case 22:
                ut0 ut0Var = (ut0) this.f39498b;
                if (ut0Var.f40593f == animator) {
                    ut0Var.f40593f = null;
                    return;
                }
                return;
            case 23:
                lv0 lv0Var = (lv0) this.f39498b;
                lv0.B1(lv0Var, ((Float) lv0Var.f37302x3.getAnimatedValue()).floatValue());
                lv0Var.f37302x3 = null;
                return;
            case 24:
                kw0 kw0Var = (kw0) this.f39498b;
                kw0Var.f37028x1.setVisibility(8);
                kw0Var.A1.setImageDrawable(null);
                return;
            case 25:
                int i7 = 0;
                while (true) {
                    qw0[] qw0VarArr = (qw0[]) this.f39498b;
                    if (i7 < qw0VarArr.length) {
                        qw0 qw0Var = qw0VarArr[i7];
                        if (qw0Var != null) {
                            qw0Var.d = false;
                        }
                        i7++;
                    } else {
                        return;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((rw0) this.f39498b).I = null;
                return;
            case 27:
                ((uw0) this.f39498b).f40606e = false;
                return;
            case 28:
                ((ez0) this.f39498b).setVisibility(4);
                return;
            default:
                ((p01) this.f39498b).setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39497a) {
            case 16:
                kl0 kl0Var = (kl0) this.f39498b;
                kl0Var.d = true;
                if (kl0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) kl0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public s60(kr0 kr0Var, v4.p0 p0Var) {
        this.f39497a = 21;
        this.f39498b = kr0Var;
    }

    private final void a(Animator animator) {
    }
}
