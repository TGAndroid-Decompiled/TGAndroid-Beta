package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class hd0 extends AnimatorListenerAdapter {
    public final int f27115a;
    public final Object f27116b;

    public hd0(Object obj, int i10) {
        this.f27115a = i10;
        this.f27116b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27115a) {
            case 4:
                ((ch0) this.f27116b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27115a) {
            case 0:
                NumberTextView numberTextView = (NumberTextView) this.f27116b;
                numberTextView.d = null;
                numberTextView.f24202b.clear();
                return;
            case 1:
                ee0 ee0Var = (ee0) this.f27116b;
                ee0Var.setVisibility(8);
                ee0Var.h();
                ee0Var.P = 0.0f;
                ee0Var.f(0.0f);
                ee0Var.setAlpha(0.0f);
                return;
            case 2:
                AnimatorSet animatorSet = (AnimatorSet) this.f27116b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 3:
                kf kfVar = (kf) this.f27116b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.i9) kfVar.f28089c).f5177e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.i9) kfVar.f28089c).f5177e = null;
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                hh0 hh0Var = (hh0) this.f27116b;
                hh0Var.f27141f = false;
                hh0Var.F = null;
                return;
            case 6:
                ((vi0) this.f27116b).b();
                return;
            case 7:
                ((ck0) this.f27116b).h.setVisibility(8);
                return;
            case 8:
                zl0 zl0Var = (zl0) this.f27116b;
                View view = zl0Var.f33526c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (zl0Var.c1()) {
                    zl0Var.invalidate();
                    return;
                }
                return;
            case 9:
                an0 an0Var = (an0) this.f27116b;
                if (an0Var.f24607s != null) {
                    an0Var.j();
                    an0Var.f24607s.invalidate();
                    an0Var.f24590e.invalidate();
                    an0Var.invalidate();
                    an0Var.f24607s = null;
                    return;
                }
                return;
            case 10:
                ((en0) this.f27116b).d = false;
                return;
            case 11:
                ((qo0) this.f27116b).O0.setVisibility(8);
                return;
            case 12:
                pp0 pp0Var = (pp0) this.f27116b;
                if (animator == pp0Var.h) {
                    pp0Var.h = null;
                    return;
                }
                return;
            case 13:
                ((yq0) this.f27116b).f33243e = null;
                return;
            case 14:
                gr0 gr0Var = (gr0) this.f27116b;
                if (gr0Var.getParent() != null) {
                    ((ViewGroup) gr0Var.getParent()).removeView(gr0Var);
                    return;
                }
                return;
            case 15:
                kt0 kt0Var = (kt0) this.f27116b;
                View view2 = kt0Var.f28202c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                kt0Var.f28200a.removeView(view2);
                return;
            case 16:
                bw0 bw0Var = (bw0) this.f27116b;
                if (bw0Var.f25077f == animator) {
                    bw0Var.f25077f = null;
                    return;
                }
                return;
            case 17:
                rx0 rx0Var = (rx0) this.f27116b;
                rx0.A1(rx0Var, ((Float) rx0Var.f30544w3.getAnimatedValue()).floatValue());
                rx0Var.f30544w3 = null;
                return;
            case 18:
                qy0 qy0Var = (qy0) this.f27116b;
                qy0Var.f30219x.setVisibility(8);
                qy0Var.F.setImageDrawable(null);
                return;
            case 19:
                int i10 = 0;
                while (true) {
                    xy0[] xy0VarArr = (xy0[]) this.f27116b;
                    if (i10 < xy0VarArr.length) {
                        xy0 xy0Var = xy0VarArr[i10];
                        if (xy0Var != null) {
                            xy0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 20:
                super.onAnimationEnd(animator);
                ((yy0) this.f27116b).H = null;
                return;
            case 21:
                ((bz0) this.f27116b).f25087e = false;
                return;
            case 22:
                ((l11) this.f27116b).setVisibility(4);
                return;
            case 23:
                ((w21) this.f27116b).setVisibility(8);
                return;
            case 24:
                ai.n4 n4Var = ((q31) this.f27116b).f29890f;
                n4Var.setScaleX(1.0f);
                n4Var.setScaleY(1.0f);
                n4Var.invalidate();
                return;
            case 25:
                u31 u31Var = (u31) this.f27116b;
                u31Var.K = 1.0f;
                u31Var.h.invalidate();
                return;
            case 26:
                ((c61) this.f27116b).L = null;
                return;
            case 27:
                UndoView undoView = (UndoView) this.f27116b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 28:
                k71 k71Var = (k71) this.f27116b;
                if (k71Var.f27983a.getTag() == null) {
                    k71Var.f27983a.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                l71 l71Var = (l71) this.f27116b;
                l71Var.f28304b = 0.0f;
                l71Var.setTranslationY(0.0f);
                l71Var.f28303a = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27115a) {
            case 10:
                en0 en0Var = (en0) this.f27116b;
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

    public hd0(kt0 kt0Var, s4.o0 o0Var) {
        this.f27115a = 15;
        this.f27116b = kt0Var;
    }

    private final void a(Animator animator) {
    }
}
