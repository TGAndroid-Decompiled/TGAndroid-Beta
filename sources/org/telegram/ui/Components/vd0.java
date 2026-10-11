package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class vd0 extends AnimatorListenerAdapter {
    public final int f31864a;
    public final Object f31865b;

    public vd0(Object obj, int i10) {
        this.f31864a = i10;
        this.f31865b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31864a) {
            case 4:
                ((th0) this.f31865b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31864a) {
            case 0:
                NumberTextView numberTextView = (NumberTextView) this.f31865b;
                numberTextView.d = null;
                numberTextView.f24229b.clear();
                return;
            case 1:
                te0 te0Var = (te0) this.f31865b;
                te0Var.O = null;
                te0Var.f31230r.setText("");
                ci.j9.a(te0Var.f31231s, false);
                te0Var.setVisibility(8);
                te0Var.T = 0.0f;
                te0Var.g(0.0f);
                te0Var.setAlpha(0.0f);
                te0Var.i();
                return;
            case 2:
                AnimatorSet animatorSet = (AnimatorSet) this.f31865b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 3:
                lf lfVar = (lf) this.f31865b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.j9) lfVar.f28376c).f5288e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.j9) lfVar.f28376c).f5288e = null;
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                yh0 yh0Var = (yh0) this.f31865b;
                yh0Var.f33264f = false;
                yh0Var.F = null;
                return;
            case 6:
                ((oj0) this.f31865b).b();
                return;
            case 7:
                ((vk0) this.f31865b).h.setVisibility(8);
                return;
            case 8:
                rm0 rm0Var = (rm0) this.f31865b;
                View view = rm0Var.f30545a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (rm0Var.b1()) {
                    rm0Var.invalidate();
                    return;
                }
                return;
            case 9:
                pn0 pn0Var = (pn0) this.f31865b;
                if (pn0Var.f29923s != null) {
                    pn0Var.j();
                    pn0Var.f29923s.invalidate();
                    pn0Var.f29906e.invalidate();
                    pn0Var.invalidate();
                    pn0Var.f29923s = null;
                    return;
                }
                return;
            case 10:
                ((tn0) this.f31865b).d = false;
                return;
            case 11:
                ((ep0) this.f31865b).M0.setVisibility(8);
                return;
            case 12:
                cq0 cq0Var = (cq0) this.f31865b;
                if (animator == cq0Var.h) {
                    cq0Var.h = null;
                    return;
                }
                return;
            case 13:
                ((mr0) this.f31865b).f28921f = null;
                return;
            case 14:
                ur0 ur0Var = (ur0) this.f31865b;
                if (ur0Var.getParent() != null) {
                    ((ViewGroup) ur0Var.getParent()).removeView(ur0Var);
                    return;
                }
                return;
            case 15:
                xt0 xt0Var = (xt0) this.f31865b;
                View view2 = xt0Var.f33068c;
                view2.setAlpha(1.0f);
                s4.p0.x0(view2);
                xt0Var.f33066a.removeView(view2);
                return;
            case 16:
                jw0 jw0Var = (jw0) this.f31865b;
                if (jw0Var.f27871f == animator) {
                    jw0Var.f27871f = null;
                    return;
                }
                return;
            case 17:
                zx0 zx0Var = (zx0) this.f31865b;
                zx0.z1(zx0Var, ((Float) zx0Var.f33742n3.getAnimatedValue()).floatValue());
                zx0Var.f33742n3 = null;
                return;
            case 18:
                yy0 yy0Var = (yy0) this.f31865b;
                yy0Var.f33501x.setVisibility(8);
                yy0Var.F.setImageDrawable(null);
                return;
            case 19:
                int i10 = 0;
                while (true) {
                    ez0[] ez0VarArr = (ez0[]) this.f31865b;
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
                ((fz0) this.f31865b).H = null;
                return;
            case 21:
                ((iz0) this.f31865b).f27536e = false;
                return;
            case 22:
                ((t11) this.f31865b).setVisibility(4);
                return;
            case 23:
                ((e31) this.f31865b).setVisibility(8);
                return;
            case 24:
                ai.o4 o4Var = ((y31) this.f31865b).f33133f;
                o4Var.setScaleX(1.0f);
                o4Var.setScaleY(1.0f);
                o4Var.invalidate();
                return;
            case 25:
                c41 c41Var = (c41) this.f31865b;
                c41Var.K = 1.0f;
                c41Var.h.invalidate();
                return;
            case 26:
                ((m61) this.f31865b).L = null;
                return;
            case 27:
                UndoView undoView = (UndoView) this.f31865b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 28:
                r71 r71Var = (r71) this.f31865b;
                if (r71Var.f30445a.getTag() == null) {
                    r71Var.f30445a.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                s71 s71Var = (s71) this.f31865b;
                s71Var.f30788b = 0.0f;
                s71Var.setTranslationY(0.0f);
                s71Var.f30787a = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f31864a) {
            case 10:
                tn0 tn0Var = (tn0) this.f31865b;
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

    public vd0(xt0 xt0Var, s4.p0 p0Var) {
        this.f31864a = 15;
        this.f31865b = xt0Var;
    }

    private final void a(Animator animator) {
    }
}
