package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class wd0 extends AnimatorListenerAdapter {
    public final int f32656a;
    public final Object f32657b;

    public wd0(Object obj, int i10) {
        this.f32656a = i10;
        this.f32657b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32656a) {
            case 4:
                ((th0) this.f32657b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32656a) {
            case 0:
                NumberTextView numberTextView = (NumberTextView) this.f32657b;
                numberTextView.d = null;
                numberTextView.f24205b.clear();
                return;
            case 1:
                ue0 ue0Var = (ue0) this.f32657b;
                ue0Var.O = null;
                ue0Var.f31481r.setText("");
                ci.j9.a(ue0Var.f31482s, false);
                ue0Var.setVisibility(8);
                ue0Var.T = 0.0f;
                ue0Var.g(0.0f);
                ue0Var.setAlpha(0.0f);
                ue0Var.i();
                return;
            case 2:
                AnimatorSet animatorSet = (AnimatorSet) this.f32657b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 3:
                lf lfVar = (lf) this.f32657b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.j9) lfVar.f28335c).f5289e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.j9) lfVar.f28335c).f5289e = null;
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                yh0 yh0Var = (yh0) this.f32657b;
                yh0Var.f33210f = false;
                yh0Var.F = null;
                return;
            case 6:
                ((oj0) this.f32657b).b();
                return;
            case 7:
                ((vk0) this.f32657b).h.setVisibility(8);
                return;
            case 8:
                rm0 rm0Var = (rm0) this.f32657b;
                View view = rm0Var.f30486a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (rm0Var.b1()) {
                    rm0Var.invalidate();
                    return;
                }
                return;
            case 9:
                pn0 pn0Var = (pn0) this.f32657b;
                if (pn0Var.f29820s != null) {
                    pn0Var.j();
                    pn0Var.f29820s.invalidate();
                    pn0Var.f29803e.invalidate();
                    pn0Var.invalidate();
                    pn0Var.f29820s = null;
                    return;
                }
                return;
            case 10:
                ((tn0) this.f32657b).d = false;
                return;
            case 11:
                ((ep0) this.f32657b).M0.setVisibility(8);
                return;
            case 12:
                cq0 cq0Var = (cq0) this.f32657b;
                if (animator == cq0Var.h) {
                    cq0Var.h = null;
                    return;
                }
                return;
            case 13:
                ((mr0) this.f32657b).f28881f = null;
                return;
            case 14:
                ur0 ur0Var = (ur0) this.f32657b;
                if (ur0Var.getParent() != null) {
                    ((ViewGroup) ur0Var.getParent()).removeView(ur0Var);
                    return;
                }
                return;
            case 15:
                xt0 xt0Var = (xt0) this.f32657b;
                View view2 = xt0Var.f33030c;
                view2.setAlpha(1.0f);
                s4.p0.x0(view2);
                xt0Var.f33028a.removeView(view2);
                return;
            case 16:
                jw0 jw0Var = (jw0) this.f32657b;
                if (jw0Var.f27812f == animator) {
                    jw0Var.f27812f = null;
                    return;
                }
                return;
            case 17:
                zx0 zx0Var = (zx0) this.f32657b;
                zx0.z1(zx0Var, ((Float) zx0Var.f33718n3.getAnimatedValue()).floatValue());
                zx0Var.f33718n3 = null;
                return;
            case 18:
                yy0 yy0Var = (yy0) this.f32657b;
                yy0Var.f33447x.setVisibility(8);
                yy0Var.F.setImageDrawable(null);
                return;
            case 19:
                int i10 = 0;
                while (true) {
                    ez0[] ez0VarArr = (ez0[]) this.f32657b;
                    if (i10 < ez0VarArr.length) {
                        ez0 ez0Var = ez0VarArr[i10];
                        if (ez0Var != null) {
                            ez0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 20:
                super.onAnimationEnd(animator);
                ((fz0) this.f32657b).H = null;
                return;
            case 21:
                ((iz0) this.f32657b).f27479e = false;
                return;
            case 22:
                ((t11) this.f32657b).setVisibility(4);
                return;
            case 23:
                ((e31) this.f32657b).setVisibility(8);
                return;
            case 24:
                ai.o4 o4Var = ((y31) this.f32657b).f33095f;
                o4Var.setScaleX(1.0f);
                o4Var.setScaleY(1.0f);
                o4Var.invalidate();
                return;
            case 25:
                c41 c41Var = (c41) this.f32657b;
                c41Var.K = 1.0f;
                c41Var.h.invalidate();
                return;
            case 26:
                ((m61) this.f32657b).L = null;
                return;
            case 27:
                UndoView undoView = (UndoView) this.f32657b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 28:
                r71 r71Var = (r71) this.f32657b;
                if (r71Var.f30411a.getTag() == null) {
                    r71Var.f30411a.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                s71 s71Var = (s71) this.f32657b;
                s71Var.f30701b = 0.0f;
                s71Var.setTranslationY(0.0f);
                s71Var.f30700a = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32656a) {
            case 10:
                tn0 tn0Var = (tn0) this.f32657b;
                tn0Var.d = true;
                if (tn0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) tn0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public wd0(xt0 xt0Var, s4.p0 p0Var) {
        this.f32656a = 15;
        this.f32657b = xt0Var;
    }

    private final void a(Animator animator) {
    }
}
