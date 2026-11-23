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
    public final int f39445a;
    public final Object f39446b;

    public s60(Object obj, int i7) {
        this.f39445a = i7;
        this.f39446b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39445a) {
            case 9:
                ((ff0) this.f39446b).f35197r1 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39445a) {
            case 0:
                a70 a70Var = (a70) this.f39446b;
                w60 w60Var = a70Var.f33369x;
                if (w60Var != null) {
                    w60Var.setProgress(1.0f);
                    a70Var.f33369x.invalidate();
                }
                a70Var.f33358p0 = null;
                return;
            case 1:
                org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) this.f39446b;
                ((i70) x0Var.f32280e).B1 = false;
                TextView[] textViewArr = (TextView[]) x0Var.f32278b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 2:
                v70 v70Var = (v70) this.f39446b;
                if (!v70Var.f40654f) {
                    v70Var.f40652c.setVisibility(8);
                    return;
                }
                return;
            case 3:
                c80 c80Var = (c80) this.f39446b;
                FrameLayout frameLayout = c80Var.f34077b;
                hi.m5 m5Var = (hi.m5) c80Var.f34078c;
                if (m5Var.getParent() != null) {
                    frameLayout.removeView(m5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ActionBar.h1) c80Var.d);
                return;
            case 4:
                qa0 qa0Var = (qa0) this.f39446b;
                qa0Var.f38811d0.h = null;
                qa0Var.f(qa0Var.T, qa0Var.S);
                return;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.f39446b;
                numberTextView.d = null;
                numberTextView.f32992b.clear();
                return;
            case 6:
                qc0 qc0Var = (qc0) this.f39446b;
                qc0Var.T = null;
                qc0Var.f38840r.setText("");
                hi.y7.a(qc0Var.f38841s, false);
                qc0Var.setVisibility(8);
                qc0Var.f38828b0 = 0.0f;
                qc0Var.h(0.0f);
                qc0Var.setAlpha(0.0f);
                qc0Var.j();
                return;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.f39446b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 8:
                we weVar = (we) this.f39446b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((hi.y7) weVar.f41757c).f15732e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((hi.y7) weVar.f41757c).f15732e = null;
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                kf0 kf0Var = (kf0) this.f39446b;
                kf0Var.f36867f = false;
                kf0Var.G = null;
                return;
            case 11:
                ((zg0) this.f39446b).b();
                return;
            case 12:
                ((gi0) this.f39446b).h.setVisibility(8);
                return;
            case 13:
                ((Runnable) this.f39446b).run();
                return;
            case 14:
                ek0 ek0Var = (ek0) this.f39446b;
                View view = ek0Var.f34835b1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (ek0Var.b1()) {
                    ek0Var.invalidate();
                    return;
                }
                return;
            case 15:
                gl0 gl0Var = (gl0) this.f39446b;
                if (gl0Var.f35588s != null) {
                    gl0Var.j();
                    gl0Var.f35588s.invalidate();
                    gl0Var.f35571e.invalidate();
                    gl0Var.invalidate();
                    gl0Var.f35588s = null;
                    return;
                }
                return;
            case 16:
                ((kl0) this.f39446b).d = false;
                return;
            case 17:
                ((tm0) this.f39446b).P0.setVisibility(8);
                return;
            case 18:
                rn0 rn0Var = (rn0) this.f39446b;
                if (animator == rn0Var.h) {
                    rn0Var.h = null;
                    return;
                }
                return;
            case 19:
                ((oo0) this.f39446b).f38287f = null;
                return;
            case 20:
                bi.v2 v2Var = (bi.v2) this.f39446b;
                if (v2Var.getParent() != null) {
                    ((ViewGroup) v2Var.getParent()).removeView(v2Var);
                    return;
                }
                return;
            case 21:
                kr0 kr0Var = (kr0) this.f39446b;
                View view2 = kr0Var.f36930c;
                view2.setAlpha(1.0f);
                v4.o0.x0(view2);
                kr0Var.f36928a.removeView(view2);
                return;
            case 22:
                ut0 ut0Var = (ut0) this.f39446b;
                if (ut0Var.f40543f == animator) {
                    ut0Var.f40543f = null;
                    return;
                }
                return;
            case 23:
                lv0 lv0Var = (lv0) this.f39446b;
                lv0.B1(lv0Var, ((Float) lv0Var.f37268x3.getAnimatedValue()).floatValue());
                lv0Var.f37268x3 = null;
                return;
            case 24:
                kw0 kw0Var = (kw0) this.f39446b;
                kw0Var.f36987x1.setVisibility(8);
                kw0Var.A1.setImageDrawable(null);
                return;
            case 25:
                int i7 = 0;
                while (true) {
                    qw0[] qw0VarArr = (qw0[]) this.f39446b;
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
                ((rw0) this.f39446b).I = null;
                return;
            case 27:
                ((uw0) this.f39446b).f40550e = false;
                return;
            case 28:
                ((ez0) this.f39446b).setVisibility(4);
                return;
            default:
                ((o01) this.f39446b).setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39445a) {
            case 16:
                kl0 kl0Var = (kl0) this.f39446b;
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

    public s60(kr0 kr0Var, v4.o0 o0Var) {
        this.f39445a = 21;
        this.f39446b = kr0Var;
    }

    private final void a(Animator animator) {
    }
}
