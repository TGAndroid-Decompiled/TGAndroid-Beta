package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class hd0 extends AnimatorListenerAdapter {
    public final int f27207a;
    public final Object f27208b;

    public hd0(Object obj, int i10) {
        this.f27207a = i10;
        this.f27208b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27207a) {
            case 4:
                ((ch0) this.f27208b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27207a) {
            case 0:
                NumberTextView numberTextView = (NumberTextView) this.f27208b;
                numberTextView.d = null;
                numberTextView.f24205b.clear();
                return;
            case 1:
                ee0 ee0Var = (ee0) this.f27208b;
                ee0Var.setVisibility(8);
                ee0Var.h();
                ee0Var.P = 0.0f;
                ee0Var.f(0.0f);
                ee0Var.setAlpha(0.0f);
                return;
            case 2:
                AnimatorSet animatorSet = (AnimatorSet) this.f27208b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 3:
                kf kfVar = (kf) this.f27208b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.i9) kfVar.f28175c).f5177e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.i9) kfVar.f28175c).f5177e = null;
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                hh0 hh0Var = (hh0) this.f27208b;
                hh0Var.f27233f = false;
                hh0Var.F = null;
                return;
            case 6:
                ((vi0) this.f27208b).b();
                return;
            case 7:
                ((ck0) this.f27208b).h.setVisibility(8);
                return;
            case 8:
                zl0 zl0Var = (zl0) this.f27208b;
                View view = zl0Var.f33534c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (zl0Var.b1()) {
                    zl0Var.invalidate();
                    return;
                }
                return;
            case 9:
                an0 an0Var = (an0) this.f27208b;
                if (an0Var.f24673s != null) {
                    an0Var.j();
                    an0Var.f24673s.invalidate();
                    an0Var.f24656e.invalidate();
                    an0Var.invalidate();
                    an0Var.f24673s = null;
                    return;
                }
                return;
            case 10:
                ((en0) this.f27208b).d = false;
                return;
            case 11:
                ((qo0) this.f27208b).O0.setVisibility(8);
                return;
            case 12:
                qp0 qp0Var = (qp0) this.f27208b;
                if (animator == qp0Var.h) {
                    qp0Var.h = null;
                    return;
                }
                return;
            case 13:
                ((ar0) this.f27208b).f24719e = null;
                return;
            case 14:
                hr0 hr0Var = (hr0) this.f27208b;
                if (hr0Var.getParent() != null) {
                    ((ViewGroup) hr0Var.getParent()).removeView(hr0Var);
                    return;
                }
                return;
            case 15:
                lt0 lt0Var = (lt0) this.f27208b;
                View view2 = lt0Var.f28538c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                lt0Var.f28536a.removeView(view2);
                return;
            case 16:
                cw0 cw0Var = (cw0) this.f27208b;
                if (cw0Var.f25543f == animator) {
                    cw0Var.f25543f = null;
                    return;
                }
                return;
            case 17:
                sx0 sx0Var = (sx0) this.f27208b;
                sx0.z1(sx0Var, ((Float) sx0Var.f30975w3.getAnimatedValue()).floatValue());
                sx0Var.f30975w3 = null;
                return;
            case 18:
                ry0 ry0Var = (ry0) this.f27208b;
                ry0Var.f30634x.setVisibility(8);
                ry0Var.F.setImageDrawable(null);
                return;
            case 19:
                int i10 = 0;
                while (true) {
                    yy0[] yy0VarArr = (yy0[]) this.f27208b;
                    if (i10 < yy0VarArr.length) {
                        yy0 yy0Var = yy0VarArr[i10];
                        if (yy0Var != null) {
                            yy0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 20:
                super.onAnimationEnd(animator);
                ((zy0) this.f27208b).H = null;
                return;
            case 21:
                ((cz0) this.f27208b).f25554e = false;
                return;
            case 22:
                ((m11) this.f27208b).setVisibility(4);
                return;
            case 23:
                ((x21) this.f27208b).setVisibility(8);
                return;
            case 24:
                ai.n4 n4Var = ((r31) this.f27208b).f30345f;
                n4Var.setScaleX(1.0f);
                n4Var.setScaleY(1.0f);
                n4Var.invalidate();
                return;
            case 25:
                v31 v31Var = (v31) this.f27208b;
                v31Var.K = 1.0f;
                v31Var.h.invalidate();
                return;
            case 26:
                ((d61) this.f27208b).L = null;
                return;
            case 27:
                UndoView undoView = (UndoView) this.f27208b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 28:
                l71 l71Var = (l71) this.f27208b;
                if (l71Var.f28391a.getTag() == null) {
                    l71Var.f28391a.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                m71 m71Var = (m71) this.f27208b;
                m71Var.f28622b = 0.0f;
                m71Var.setTranslationY(0.0f);
                m71Var.f28621a = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27207a) {
            case 10:
                en0 en0Var = (en0) this.f27208b;
                en0Var.d = true;
                if (en0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) en0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public hd0(lt0 lt0Var, s4.o0 o0Var) {
        this.f27207a = 15;
        this.f27208b = lt0Var;
    }

    private final void a(Animator animator) {
    }
}
