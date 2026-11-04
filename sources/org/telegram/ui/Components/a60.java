package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
public final class a60 extends AnimatorListenerAdapter {
    public final int f31731a;
    public final Object f31732b;

    public a60(Object obj, int i3) {
        this.f31731a = i3;
        this.f31732b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31731a) {
            case 9:
                ((se0) this.f31732b).f37992o1 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31731a) {
            case 0:
                f60 f60Var = (f60) this.f31732b;
                d60 d60Var = f60Var.f33751x;
                if (d60Var != null) {
                    d60Var.setProgress(1.0f);
                    f60Var.f33751x.invalidate();
                }
                f60Var.m0 = null;
                return;
            case 1:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.f31732b;
                ((o60) v0Var.f30709e).f36758y1 = false;
                TextView[] textViewArr = (TextView[]) v0Var.f30707b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 2:
                b70 b70Var = (b70) this.f31732b;
                if (!b70Var.f32110f) {
                    b70Var.f32108c.setVisibility(8);
                    return;
                }
                return;
            case 3:
                i70 i70Var = (i70) this.f31732b;
                FrameLayout frameLayout = i70Var.f34629b;
                gi.n5 n5Var = (gi.n5) i70Var.f34630c;
                if (n5Var.getParent() != null) {
                    frameLayout.removeView(n5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ActionBar.g1) i70Var.d);
                return;
            case 4:
                x90 x90Var = (x90) this.f31732b;
                x90Var.f40291d0.h = null;
                x90Var.f(x90Var.T, x90Var.S);
                return;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.f31732b;
                numberTextView.d = null;
                numberTextView.f31486b.clear();
                return;
            case 6:
                zb0 zb0Var = (zb0) this.f31732b;
                zb0Var.T = null;
                zb0Var.f41013r.setText("");
                gi.z7.a(zb0Var.f41014s, false);
                zb0Var.setVisibility(8);
                zb0Var.f41001b0 = 0.0f;
                zb0Var.h(0.0f);
                zb0Var.setAlpha(0.0f);
                zb0Var.j();
                return;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.f31732b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 8:
                oe oeVar = (oe) this.f31732b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((gi.z7) oeVar.f36815c).f14045e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((gi.z7) oeVar.f36815c).f14045e = null;
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                xe0 xe0Var = (xe0) this.f31732b;
                xe0Var.f40332f = false;
                xe0Var.G = null;
                return;
            case 11:
                ((ng0) this.f31732b).b();
                return;
            case 12:
                ((uh0) this.f31732b).h.setVisibility(8);
                return;
            case 13:
                ((Runnable) this.f31732b).run();
                return;
            case 14:
                tj0 tj0Var = (tj0) this.f31732b;
                View view = tj0Var.f38436b1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (tj0Var.b1()) {
                    tj0Var.invalidate();
                    return;
                }
                return;
            case 15:
                vk0 vk0Var = (vk0) this.f31732b;
                if (vk0Var.f39169s != null) {
                    vk0Var.j();
                    vk0Var.f39169s.invalidate();
                    vk0Var.f39152e.invalidate();
                    vk0Var.invalidate();
                    vk0Var.f39169s = null;
                    return;
                }
                return;
            case 16:
                ((zk0) this.f31732b).d = false;
                return;
            case 17:
                ((im0) this.f31732b).P0.setVisibility(8);
                return;
            case 18:
                fn0 fn0Var = (fn0) this.f31732b;
                if (animator == fn0Var.h) {
                    fn0Var.h = null;
                    return;
                }
                return;
            case 19:
                ((co0) this.f31732b).f32782f = null;
                return;
            case 20:
                ai.d2 d2Var = (ai.d2) this.f31732b;
                if (d2Var.getParent() != null) {
                    ((ViewGroup) d2Var.getParent()).removeView(d2Var);
                    return;
                }
                return;
            case 21:
                yq0 yq0Var = (yq0) this.f31732b;
                View view2 = yq0Var.f40807c;
                view2.setAlpha(1.0f);
                u4.o0.x0(view2);
                yq0Var.f40805a.removeView(view2);
                return;
            case 22:
                ht0 ht0Var = (ht0) this.f31732b;
                if (ht0Var.f34504f == animator) {
                    ht0Var.f34504f = null;
                    return;
                }
                return;
            case 23:
                xu0 xu0Var = (xu0) this.f31732b;
                xu0.B1(xu0Var, ((Float) xu0Var.f40500x3.getAnimatedValue()).floatValue());
                xu0Var.f40500x3 = null;
                return;
            case 24:
                xv0 xv0Var = (xv0) this.f31732b;
                xv0Var.f40528u1.setVisibility(8);
                xv0Var.f40531x1.setImageDrawable(null);
                return;
            case 25:
                int i3 = 0;
                while (true) {
                    dw0[] dw0VarArr = (dw0[]) this.f31732b;
                    if (i3 < dw0VarArr.length) {
                        dw0 dw0Var = dw0VarArr[i3];
                        if (dw0Var != null) {
                            dw0Var.d = false;
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((ew0) this.f31732b).I = null;
                return;
            case 27:
                ((hw0) this.f31732b).f34525e = false;
                return;
            case 28:
                ((sy0) this.f31732b).setVisibility(4);
                return;
            default:
                ((c01) this.f31732b).setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f31731a) {
            case 16:
                zk0 zk0Var = (zk0) this.f31732b;
                zk0Var.d = true;
                if (zk0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) zk0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public a60(yq0 yq0Var, u4.o0 o0Var) {
        this.f31731a = 21;
        this.f31732b = yq0Var;
    }

    private final void a(Animator animator) {
    }
}
