package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
public final class f60 extends AnimatorListenerAdapter {
    public final int f33594a;
    public final Object f33595b;

    public f60(Object obj, int i7) {
        this.f33594a = i7;
        this.f33595b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33594a) {
            case 9:
                ((re0) this.f33595b).n1 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33594a) {
            case 0:
                l60 l60Var = (l60) this.f33595b;
                j60 j60Var = l60Var.f35621x;
                if (j60Var != null) {
                    j60Var.setProgress(1.0f);
                    l60Var.f35621x.invalidate();
                }
                l60Var.m0 = null;
                return;
            case 1:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.f33595b;
                ((u60) v0Var.f30619e).f38639x1 = false;
                TextView[] textViewArr = (TextView[]) v0Var.f30617b;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 2:
                g70 g70Var = (g70) this.f33595b;
                if (!g70Var.f33894f) {
                    g70Var.f33892c.setVisibility(8);
                    return;
                }
                return;
            case 3:
                n70 n70Var = (n70) this.f33595b;
                FrameLayout frameLayout = n70Var.f36279b;
                fi.p5 p5Var = (fi.p5) n70Var.f36280c;
                if (p5Var.getParent() != null) {
                    frameLayout.removeView(p5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ActionBar.h1) n70Var.d);
                return;
            case 4:
                da0 da0Var = (da0) this.f33595b;
                da0Var.f32920c0.h = null;
                da0Var.f(da0Var.S, da0Var.R);
                return;
            case 5:
                NumberTextView numberTextView = (NumberTextView) this.f33595b;
                numberTextView.d = null;
                numberTextView.f31420b.clear();
                return;
            case 6:
                fc0 fc0Var = (fc0) this.f33595b;
                fc0Var.S = null;
                fc0Var.f33632r.setText("");
                fi.a8.a(fc0Var.f33633s, false);
                fc0Var.setVisibility(8);
                fc0Var.f33619a0 = 0.0f;
                fc0Var.h(0.0f);
                fc0Var.setAlpha(0.0f);
                fc0Var.j();
                return;
            case 7:
                AnimatorSet animatorSet = (AnimatorSet) this.f33595b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 8:
                qe qeVar = (qe) this.f33595b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((fi.a8) qeVar.f37298c).f11614e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((fi.a8) qeVar.f37298c).f11614e = null;
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                we0 we0Var = (we0) this.f33595b;
                we0Var.f40043f = false;
                we0Var.F = null;
                return;
            case 11:
                ((lg0) this.f33595b).b();
                return;
            case 12:
                ((sh0) this.f33595b).h.setVisibility(8);
                return;
            case 13:
                ((Runnable) this.f33595b).run();
                return;
            case 14:
                qj0 qj0Var = (qj0) this.f33595b;
                View view = qj0Var.f37357a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (qj0Var.b1()) {
                    qj0Var.invalidate();
                    return;
                }
                return;
            case 15:
                sk0 sk0Var = (sk0) this.f33595b;
                if (sk0Var.f38118s != null) {
                    sk0Var.j();
                    sk0Var.f38118s.invalidate();
                    sk0Var.f38101e.invalidate();
                    sk0Var.invalidate();
                    sk0Var.f38118s = null;
                    return;
                }
                return;
            case 16:
                ((wk0) this.f33595b).d = false;
                return;
            case 17:
                ((gm0) this.f33595b).O0.setVisibility(8);
                return;
            case 18:
                dn0 dn0Var = (dn0) this.f33595b;
                if (animator == dn0Var.h) {
                    dn0Var.h = null;
                    return;
                }
                return;
            case 19:
                ((bo0) this.f33595b).f32345f = null;
                return;
            case 20:
                di.b4 b4Var = (di.b4) this.f33595b;
                if (b4Var.getParent() != null) {
                    ((ViewGroup) b4Var.getParent()).removeView(b4Var);
                    return;
                }
                return;
            case 21:
                ar0 ar0Var = (ar0) this.f33595b;
                View view2 = ar0Var.f31959c;
                view2.setAlpha(1.0f);
                v4.n0.x0(view2);
                ar0Var.f31957a.removeView(view2);
                return;
            case 22:
                kt0 kt0Var = (kt0) this.f33595b;
                if (kt0Var.f35483f == animator) {
                    kt0Var.f35483f = null;
                    return;
                }
                return;
            case 23:
                av0 av0Var = (av0) this.f33595b;
                av0.B1(av0Var, ((Float) av0Var.f32002w3.getAnimatedValue()).floatValue());
                av0Var.f32002w3 = null;
                return;
            case 24:
                zv0 zv0Var = (zv0) this.f33595b;
                zv0Var.f41165t1.setVisibility(8);
                zv0Var.f41168w1.setImageDrawable(null);
                return;
            case 25:
                int i7 = 0;
                while (true) {
                    fw0[] fw0VarArr = (fw0[]) this.f33595b;
                    if (i7 < fw0VarArr.length) {
                        fw0 fw0Var = fw0VarArr[i7];
                        if (fw0Var != null) {
                            fw0Var.d = false;
                        }
                        i7++;
                    } else {
                        return;
                    }
                }
            case 26:
                super.onAnimationEnd(animator);
                ((gw0) this.f33595b).H = null;
                return;
            case 27:
                ((jw0) this.f33595b).f35170e = false;
                return;
            case 28:
                ((uy0) this.f33595b).setVisibility(4);
                return;
            default:
                ((e01) this.f33595b).setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33594a) {
            case 16:
                wk0 wk0Var = (wk0) this.f33595b;
                wk0Var.d = true;
                if (wk0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) wk0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public f60(ar0 ar0Var, v4.n0 n0Var) {
        this.f33594a = 21;
        this.f33595b = ar0Var;
    }

    private final void a(Animator animator) {
    }
}
