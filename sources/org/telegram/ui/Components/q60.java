package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
public final class q60 extends AnimatorListenerAdapter {
    public final int f38717a;
    public final Object f38718b;

    public q60(Object obj, int i7) {
        this.f38717a = i7;
        this.f38718b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38717a) {
            case 9:
                ((df0) this.f38718b).f34424r1 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38717a) {
            case 0:
                y60 y60Var = (y60) this.f38718b;
                u60 u60Var = y60Var.f42381x;
                if (u60Var != null) {
                    u60Var.setProgress(1.0f);
                    y60Var.f42381x.invalidate();
                }
                y60Var.f42370p0 = null;
                return;
            case 1:
                org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) this.f38718b;
                ((g70) x0Var.f32283e).B1 = false;
                TextView[] textViewArr = (TextView[]) x0Var.f32281b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 2:
                t70 t70Var = (t70) this.f38718b;
                if (!t70Var.f39935f) {
                    t70Var.f39933c.setVisibility(8);
                    return;
                }
                return;
            case 3:
                a80 a80Var = (a80) this.f38718b;
                FrameLayout frameLayout = a80Var.f33263b;
                hi.m5 m5Var = (hi.m5) a80Var.f33264c;
                if (m5Var.getParent() != null) {
                    frameLayout.removeView(m5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ActionBar.i1) a80Var.d);
                return;
            case 4:
                oa0 oa0Var = (oa0) this.f38718b;
                oa0Var.f38045d0.h = null;
                oa0Var.f(oa0Var.T, oa0Var.S);
                return;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.f38718b;
                numberTextView.d = null;
                numberTextView.f32990b.clear();
                return;
            case 6:
                pc0 pc0Var = (pc0) this.f38718b;
                pc0Var.T = null;
                pc0Var.f38375r.setText("");
                hi.y7.a(pc0Var.f38376s, false);
                pc0Var.setVisibility(8);
                pc0Var.f38363b0 = 0.0f;
                pc0Var.h(0.0f);
                pc0Var.setAlpha(0.0f);
                pc0Var.j();
                return;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.f38718b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 8:
                we weVar = (we) this.f38718b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((hi.y7) weVar.f41704c).f15776e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((hi.y7) weVar.f41704c).f15776e = null;
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                if0 if0Var = (if0) this.f38718b;
                if0Var.f36116f = false;
                if0Var.G = null;
                return;
            case 11:
                ((xg0) this.f38718b).b();
                return;
            case 12:
                ((ei0) this.f38718b).h.setVisibility(8);
                return;
            case 13:
                ((Runnable) this.f38718b).run();
                return;
            case 14:
                ck0 ck0Var = (ck0) this.f38718b;
                View view = ck0Var.f34050b1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (ck0Var.b1()) {
                    ck0Var.invalidate();
                    return;
                }
                return;
            case 15:
                el0 el0Var = (el0) this.f38718b;
                if (el0Var.f34759s != null) {
                    el0Var.j();
                    el0Var.f34759s.invalidate();
                    el0Var.f34742e.invalidate();
                    el0Var.invalidate();
                    el0Var.f34759s = null;
                    return;
                }
                return;
            case 16:
                ((il0) this.f38718b).d = false;
                return;
            case 17:
                ((rm0) this.f38718b).P0.setVisibility(8);
                return;
            case 18:
                pn0 pn0Var = (pn0) this.f38718b;
                if (animator == pn0Var.h) {
                    pn0Var.h = null;
                    return;
                }
                return;
            case 19:
                ((mo0) this.f38718b).f37594f = null;
                return;
            case 20:
                bi.p2 p2Var = (bi.p2) this.f38718b;
                if (p2Var.getParent() != null) {
                    ((ViewGroup) p2Var.getParent()).removeView(p2Var);
                    return;
                }
                return;
            case 21:
                ir0 ir0Var = (ir0) this.f38718b;
                View view2 = ir0Var.f36179c;
                view2.setAlpha(1.0f);
                v4.p0.x0(view2);
                ir0Var.f36177a.removeView(view2);
                return;
            case 22:
                rt0 rt0Var = (rt0) this.f38718b;
                if (rt0Var.f39308f == animator) {
                    rt0Var.f39308f = null;
                    return;
                }
                return;
            case 23:
                iv0 iv0Var = (iv0) this.f38718b;
                iv0.B1(iv0Var, ((Float) iv0Var.f36228x3.getAnimatedValue()).floatValue());
                iv0Var.f36228x3 = null;
                return;
            case 24:
                iw0 iw0Var = (iw0) this.f38718b;
                iw0Var.f36259x1.setVisibility(8);
                iw0Var.A1.setImageDrawable(null);
                return;
            case 25:
                int i7 = 0;
                while (true) {
                    ow0[] ow0VarArr = (ow0[]) this.f38718b;
                    if (i7 < ow0VarArr.length) {
                        ow0 ow0Var = ow0VarArr[i7];
                        if (ow0Var != null) {
                            ow0Var.d = false;
                        }
                        i7++;
                    } else {
                        return;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((pw0) this.f38718b).I = null;
                return;
            case 27:
                ((sw0) this.f38718b).f39856e = false;
                return;
            case 28:
                ((cz0) this.f38718b).setVisibility(4);
                return;
            default:
                ((n01) this.f38718b).setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38717a) {
            case 16:
                il0 il0Var = (il0) this.f38718b;
                il0Var.d = true;
                if (il0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) il0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public q60(ir0 ir0Var, v4.p0 p0Var) {
        this.f38717a = 21;
        this.f38718b = ir0Var;
    }

    private final void a(Animator animator) {
    }
}
