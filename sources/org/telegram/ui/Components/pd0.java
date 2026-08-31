package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class pd0 extends AnimatorListenerAdapter {
    public final int f30029a;
    public final Object f30030b;

    public pd0(Object obj, int i10) {
        this.f30029a = i10;
        this.f30030b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30029a) {
            case 2:
                ((xg0) this.f30030b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30029a) {
            case 0:
                AnimatorSet animatorSet = (AnimatorSet) this.f30030b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 1:
                ye yeVar = (ye) this.f30030b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((td0) yeVar.f33498c).f31329e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((td0) yeVar.f33498c).f31329e = null;
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                ch0 ch0Var = (ch0) this.f30030b;
                ch0Var.f25967f = false;
                ch0Var.C = null;
                return;
            case 4:
                ((ri0) this.f30030b).b();
                return;
            case 5:
                ((ak0) this.f30030b).h.setVisibility(8);
                return;
            case 6:
                tl0 tl0Var = (tl0) this.f30030b;
                View view = tl0Var.Z0;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (tl0Var.b1()) {
                    tl0Var.invalidate();
                    return;
                }
                return;
            case 7:
                qm0 qm0Var = (qm0) this.f30030b;
                if (qm0Var.f30444s != null) {
                    qm0Var.j();
                    qm0Var.f30444s.invalidate();
                    qm0Var.f30429e.invalidate();
                    qm0Var.invalidate();
                    qm0Var.f30444s = null;
                    return;
                }
                return;
            case 8:
                ((vm0) this.f30030b).d = false;
                return;
            case 9:
                ((eo0) this.f30030b).J0.setVisibility(8);
                return;
            case 10:
                bp0 bp0Var = (bp0) this.f30030b;
                if (animator == bp0Var.h) {
                    bp0Var.h = null;
                    return;
                }
                return;
            case 11:
                ((lq0) this.f30030b).f28806e = null;
                return;
            case 12:
                tq0 tq0Var = (tq0) this.f30030b;
                if (tq0Var.getParent() != null) {
                    ((ViewGroup) tq0Var.getParent()).removeView(tq0Var);
                    return;
                }
                return;
            case 13:
                ts0 ts0Var = (ts0) this.f30030b;
                View view2 = ts0Var.f31449c;
                view2.setAlpha(1.0f);
                f2.w0.x0(view2);
                ts0Var.f31447a.removeView(view2);
                return;
            case 14:
                gv0 gv0Var = (gv0) this.f30030b;
                if (gv0Var.f27301f == animator) {
                    gv0Var.f27301f = null;
                    return;
                }
                return;
            case 15:
                yw0 yw0Var = (yw0) this.f30030b;
                yw0.y1(yw0Var, ((Float) yw0Var.f33605m3.getAnimatedValue()).floatValue());
                yw0Var.f33605m3 = null;
                return;
            case 16:
                yx0 yx0Var = (yx0) this.f30030b;
                yx0Var.f33638x.setVisibility(8);
                yx0Var.C.setImageDrawable(null);
                return;
            case 17:
                int i10 = 0;
                while (true) {
                    fy0[] fy0VarArr = (fy0[]) this.f30030b;
                    if (i10 < fy0VarArr.length) {
                        fy0 fy0Var = fy0VarArr[i10];
                        if (fy0Var != null) {
                            fy0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 18:
                super.onAnimationEnd(animator);
                ((gy0) this.f30030b).E = null;
                return;
            case 19:
                ((jy0) this.f30030b).f28229e = false;
                return;
            case 20:
                ((s01) this.f30030b).setVisibility(4);
                return;
            case 21:
                ((b21) this.f30030b).setVisibility(8);
                return;
            case 22:
                oh.b3 b3Var = ((s21) this.f30030b).f30962f;
                b3Var.setScaleX(1.0f);
                b3Var.setScaleY(1.0f);
                b3Var.invalidate();
                return;
            case 23:
                w21 w21Var = (w21) this.f30030b;
                w21Var.H = 1.0f;
                w21Var.h.invalidate();
                return;
            case 24:
                ((f51) this.f30030b).I = null;
                return;
            case 25:
                UndoView undoView = (UndoView) this.f30030b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 26:
                p61 p61Var = (p61) this.f30030b;
                if (p61Var.f29976a.getTag() == null) {
                    p61Var.f29976a.setVisibility(4);
                    return;
                }
                return;
            case 27:
                super.onAnimationEnd(animator);
                q61 q61Var = (q61) this.f30030b;
                q61Var.f30292b = 0.0f;
                q61Var.setTranslationY(0.0f);
                q61Var.f30291a = null;
                return;
            case 28:
                l81 l81Var = (l81) this.f30030b;
                l81Var.G = false;
                l81Var.setEnabled(true);
                k81 k81Var = l81Var.f28671y;
                if (k81Var != null) {
                    ((oh.h4) k81Var).f0(1.0f);
                }
                l81Var.invalidate();
                return;
            default:
                ((f91) this.f30030b).f26815b0 = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f30029a) {
            case 8:
                vm0 vm0Var = (vm0) this.f30030b;
                vm0Var.d = true;
                if (vm0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) vm0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public pd0(ts0 ts0Var, f2.w0 w0Var) {
        this.f30029a = 13;
        this.f30030b = ts0Var;
    }

    private final void a(Animator animator) {
    }
}
