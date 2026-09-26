package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class fd0 extends AnimatorListenerAdapter {
    public final int f24162a;
    public final Object f24163b;

    public fd0(Object obj, int i10) {
        this.f24162a = i10;
        this.f24163b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24162a) {
            case 4:
                ((ah0) this.f24163b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24162a) {
            case 0:
                NumberTextView numberTextView = (NumberTextView) this.f24163b;
                numberTextView.d = null;
                numberTextView.f22293b.clear();
                return;
            case 1:
                ce0 ce0Var = (ce0) this.f24163b;
                ce0Var.setVisibility(8);
                ce0Var.h();
                ce0Var.P = 0.0f;
                ce0Var.f(0.0f);
                ce0Var.setAlpha(0.0f);
                return;
            case 2:
                AnimatorSet animatorSet = (AnimatorSet) this.f24163b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 3:
                jf jfVar = (jf) this.f24163b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.j9) jfVar.f25413c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.j9) jfVar.f25413c).e = null;
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                fh0 fh0Var = (fh0) this.f24163b;
                fh0Var.f24189f = false;
                fh0Var.F = null;
                return;
            case 6:
                ((ti0) this.f24163b).b();
                return;
            case 7:
                ((ak0) this.f24163b).h.setVisibility(8);
                return;
            case 8:
                wl0 wl0Var = (wl0) this.f24163b;
                View view = wl0Var.f30088c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (wl0Var.b1()) {
                    wl0Var.invalidate();
                    return;
                }
                return;
            case 9:
                um0 um0Var = (um0) this.f24163b;
                if (um0Var.f28835s != null) {
                    um0Var.j();
                    um0Var.f28835s.invalidate();
                    um0Var.e.invalidate();
                    um0Var.invalidate();
                    um0Var.f28835s = null;
                    return;
                }
                return;
            case 10:
                ((ym0) this.f24163b).d = false;
                return;
            case 11:
                ((lo0) this.f24163b).M0.setVisibility(8);
                return;
            case 12:
                jp0 jp0Var = (jp0) this.f24163b;
                if (animator == jp0Var.h) {
                    jp0Var.h = null;
                    return;
                }
                return;
            case 13:
                ((tq0) this.f24163b).e = null;
                return;
            case 14:
                br0 br0Var = (br0) this.f24163b;
                if (br0Var.getParent() != null) {
                    ((ViewGroup) br0Var.getParent()).removeView(br0Var);
                    return;
                }
                return;
            case 15:
                et0 et0Var = (et0) this.f24163b;
                View view2 = et0Var.f23994c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                et0Var.f23992a.removeView(view2);
                return;
            case 16:
                qv0 qv0Var = (qv0) this.f24163b;
                if (qv0Var.f27777f == animator) {
                    qv0Var.f27777f = null;
                    return;
                }
                return;
            case 17:
                gx0 gx0Var = (gx0) this.f24163b;
                gx0.y1(gx0Var, ((Float) gx0Var.f24560p3.getAnimatedValue()).floatValue());
                gx0Var.f24560p3 = null;
                return;
            case 18:
                fy0 fy0Var = (fy0) this.f24163b;
                fy0Var.f24311x.setVisibility(8);
                fy0Var.F.setImageDrawable(null);
                return;
            case 19:
                int i10 = 0;
                while (true) {
                    my0[] my0VarArr = (my0[]) this.f24163b;
                    if (i10 < my0VarArr.length) {
                        my0 my0Var = my0VarArr[i10];
                        if (my0Var != null) {
                            my0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 20:
                super.onAnimationEnd(animator);
                ((ny0) this.f24163b).H = null;
                return;
            case 21:
                ((qy0) this.f24163b).e = false;
                return;
            case 22:
                ((a11) this.f24163b).setVisibility(4);
                return;
            case 23:
                ((l21) this.f24163b).setVisibility(8);
                return;
            case 24:
                ai.n4 n4Var = ((f31) this.f24163b).f24068f;
                n4Var.setScaleX(1.0f);
                n4Var.setScaleY(1.0f);
                n4Var.invalidate();
                return;
            case 25:
                j31 j31Var = (j31) this.f24163b;
                j31Var.K = 1.0f;
                j31Var.h.invalidate();
                return;
            case 26:
                ((r51) this.f24163b).L = null;
                return;
            case 27:
                UndoView undoView = (UndoView) this.f24163b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 28:
                y61 y61Var = (y61) this.f24163b;
                if (y61Var.f30518a.getTag() == null) {
                    y61Var.f30518a.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                z61 z61Var = (z61) this.f24163b;
                z61Var.f30800b = 0.0f;
                z61Var.setTranslationY(0.0f);
                z61Var.f30799a = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f24162a) {
            case 10:
                ym0 ym0Var = (ym0) this.f24163b;
                ym0Var.d = true;
                if (ym0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) ym0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public fd0(et0 et0Var, s4.o0 o0Var) {
        this.f24162a = 15;
        this.f24163b = et0Var;
    }

    private final void a(Animator animator) {
    }
}
