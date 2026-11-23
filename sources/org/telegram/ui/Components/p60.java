package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
public final class p60 extends AnimatorListenerAdapter {
    public final int f38390a;
    public final Object f38391b;

    public p60(Object obj, int i7) {
        this.f38390a = i7;
        this.f38391b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38390a) {
            case 9:
                ((ef0) this.f38391b).f34706r1 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38390a) {
            case 0:
                x60 x60Var = (x60) this.f38391b;
                t60 t60Var = x60Var.f41898x;
                if (t60Var != null) {
                    t60Var.setProgress(1.0f);
                    x60Var.f41898x.invalidate();
                }
                x60Var.f41887p0 = null;
                return;
            case 1:
                org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) this.f38391b;
                ((f70) x0Var.f32382e).B1 = false;
                TextView[] textViewArr = (TextView[]) x0Var.f32380b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 2:
                s70 s70Var = (s70) this.f38391b;
                if (!s70Var.f39522f) {
                    s70Var.f39520c.setVisibility(8);
                    return;
                }
                return;
            case 3:
                z70 z70Var = (z70) this.f38391b;
                FrameLayout frameLayout = z70Var.f42738b;
                hi.w5 w5Var = (hi.w5) z70Var.f42739c;
                if (w5Var.getParent() != null) {
                    frameLayout.removeView(w5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ActionBar.h1) z70Var.d);
                return;
            case 4:
                na0 na0Var = (na0) this.f38391b;
                na0Var.f37742d0.h = null;
                na0Var.f(na0Var.T, na0Var.S);
                return;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.f38391b;
                numberTextView.d = null;
                numberTextView.f33090b.clear();
                return;
            case 6:
                oc0 oc0Var = (oc0) this.f38391b;
                oc0Var.T = null;
                oc0Var.f38122r.setText("");
                hi.s8.a(oc0Var.f38123s, false);
                oc0Var.setVisibility(8);
                oc0Var.f38110b0 = 0.0f;
                oc0Var.h(0.0f);
                oc0Var.setAlpha(0.0f);
                oc0Var.j();
                return;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.f38391b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 8:
                xe xeVar = (xe) this.f38391b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((hi.s8) xeVar.f41989c).f15403e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((hi.s8) xeVar.f41989c).f15403e = null;
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                jf0 jf0Var = (jf0) this.f38391b;
                jf0Var.f36402f = false;
                jf0Var.G = null;
                return;
            case 11:
                ((yg0) this.f38391b).b();
                return;
            case 12:
                ((gi0) this.f38391b).h.setVisibility(8);
                return;
            case 13:
                ((Runnable) this.f38391b).run();
                return;
            case 14:
                ek0 ek0Var = (ek0) this.f38391b;
                View view = ek0Var.f34743b1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (ek0Var.b1()) {
                    ek0Var.invalidate();
                    return;
                }
                return;
            case 15:
                gl0 gl0Var = (gl0) this.f38391b;
                if (gl0Var.f35493s != null) {
                    gl0Var.j();
                    gl0Var.f35493s.invalidate();
                    gl0Var.f35476e.invalidate();
                    gl0Var.invalidate();
                    gl0Var.f35493s = null;
                    return;
                }
                return;
            case 16:
                ((kl0) this.f38391b).d = false;
                return;
            case 17:
                ((tm0) this.f38391b).P0.setVisibility(8);
                return;
            case 18:
                qn0 qn0Var = (qn0) this.f38391b;
                if (animator == qn0Var.h) {
                    qn0Var.h = null;
                    return;
                }
                return;
            case 19:
                ((no0) this.f38391b).f37879f = null;
                return;
            case 20:
                bi.v2 v2Var = (bi.v2) this.f38391b;
                if (v2Var.getParent() != null) {
                    ((ViewGroup) v2Var.getParent()).removeView(v2Var);
                    return;
                }
                return;
            case 21:
                jr0 jr0Var = (jr0) this.f38391b;
                View view2 = jr0Var.f36501c;
                view2.setAlpha(1.0f);
                v4.p0.x0(view2);
                jr0Var.f36499a.removeView(view2);
                return;
            case 22:
                tt0 tt0Var = (tt0) this.f38391b;
                if (tt0Var.f40156f == animator) {
                    tt0Var.f40156f = null;
                    return;
                }
                return;
            case 23:
                kv0 kv0Var = (kv0) this.f38391b;
                kv0.B1(kv0Var, ((Float) kv0Var.f36915x3.getAnimatedValue()).floatValue());
                kv0Var.f36915x3 = null;
                return;
            case 24:
                jw0 jw0Var = (jw0) this.f38391b;
                jw0Var.f36553x1.setVisibility(8);
                jw0Var.A1.setImageDrawable(null);
                return;
            case 25:
                int i7 = 0;
                while (true) {
                    pw0[] pw0VarArr = (pw0[]) this.f38391b;
                    if (i7 < pw0VarArr.length) {
                        pw0 pw0Var = pw0VarArr[i7];
                        if (pw0Var != null) {
                            pw0Var.d = false;
                        }
                        i7++;
                    } else {
                        return;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((qw0) this.f38391b).I = null;
                return;
            case 27:
                ((tw0) this.f38391b).f40176e = false;
                return;
            case 28:
                ((dz0) this.f38391b).setVisibility(4);
                return;
            default:
                ((n01) this.f38391b).setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38390a) {
            case 16:
                kl0 kl0Var = (kl0) this.f38391b;
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

    public p60(jr0 jr0Var, v4.p0 p0Var) {
        this.f38390a = 21;
        this.f38391b = jr0Var;
    }

    private final void a(Animator animator) {
    }
}
