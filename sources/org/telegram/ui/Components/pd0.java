package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class pd0 extends AnimatorListenerAdapter {
    public final int f30042a;
    public final Object f30043b;

    public pd0(Object obj, int i10) {
        this.f30042a = i10;
        this.f30043b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30042a) {
            case 2:
                ((xg0) this.f30043b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30042a) {
            case 0:
                AnimatorSet animatorSet = (AnimatorSet) this.f30043b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 1:
                ye yeVar = (ye) this.f30043b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((td0) yeVar.f33519c).f31344e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((td0) yeVar.f33519c).f31344e = null;
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                ch0 ch0Var = (ch0) this.f30043b;
                ch0Var.f25944f = false;
                ch0Var.C = null;
                return;
            case 4:
                ((ri0) this.f30043b).b();
                return;
            case 5:
                ((zj0) this.f30043b).h.setVisibility(8);
                return;
            case 6:
                sl0 sl0Var = (sl0) this.f30043b;
                View view = sl0Var.Z0;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (sl0Var.a1()) {
                    sl0Var.invalidate();
                    return;
                }
                return;
            case 7:
                pm0 pm0Var = (pm0) this.f30043b;
                if (pm0Var.f30150s != null) {
                    pm0Var.j();
                    pm0Var.f30150s.invalidate();
                    pm0Var.f30135e.invalidate();
                    pm0Var.invalidate();
                    pm0Var.f30150s = null;
                    return;
                }
                return;
            case 8:
                ((um0) this.f30043b).d = false;
                return;
            case 9:
                ((do0) this.f30043b).J0.setVisibility(8);
                return;
            case 10:
                ap0 ap0Var = (ap0) this.f30043b;
                if (animator == ap0Var.h) {
                    ap0Var.h = null;
                    return;
                }
                return;
            case 11:
                ((kq0) this.f30043b).f28485e = null;
                return;
            case 12:
                sq0 sq0Var = (sq0) this.f30043b;
                if (sq0Var.getParent() != null) {
                    ((ViewGroup) sq0Var.getParent()).removeView(sq0Var);
                    return;
                }
                return;
            case 13:
                ss0 ss0Var = (ss0) this.f30043b;
                View view2 = ss0Var.f31170c;
                view2.setAlpha(1.0f);
                f2.w0.x0(view2);
                ss0Var.f31168a.removeView(view2);
                return;
            case 14:
                fv0 fv0Var = (fv0) this.f30043b;
                if (fv0Var.f27016f == animator) {
                    fv0Var.f27016f = null;
                    return;
                }
                return;
            case 15:
                xw0 xw0Var = (xw0) this.f30043b;
                xw0.x1(xw0Var, ((Float) xw0Var.f33203m3.getAnimatedValue()).floatValue());
                xw0Var.f33203m3 = null;
                return;
            case 16:
                xx0 xx0Var = (xx0) this.f30043b;
                xx0Var.f33244x.setVisibility(8);
                xx0Var.C.setImageDrawable(null);
                return;
            case 17:
                int i10 = 0;
                while (true) {
                    ey0[] ey0VarArr = (ey0[]) this.f30043b;
                    if (i10 < ey0VarArr.length) {
                        ey0 ey0Var = ey0VarArr[i10];
                        if (ey0Var != null) {
                            ey0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 18:
                super.onAnimationEnd(animator);
                ((fy0) this.f30043b).E = null;
                return;
            case 19:
                ((iy0) this.f30043b).f27913e = false;
                return;
            case 20:
                ((r01) this.f30043b).setVisibility(4);
                return;
            case 21:
                ((a21) this.f30043b).setVisibility(8);
                return;
            case 22:
                oh.b3 b3Var = ((r21) this.f30043b).f30629f;
                b3Var.setScaleX(1.0f);
                b3Var.setScaleY(1.0f);
                b3Var.invalidate();
                return;
            case 23:
                v21 v21Var = (v21) this.f30043b;
                v21Var.H = 1.0f;
                v21Var.h.invalidate();
                return;
            case 24:
                ((d51) this.f30043b).I = null;
                return;
            case 25:
                UndoView undoView = (UndoView) this.f30043b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 26:
                o61 o61Var = (o61) this.f30043b;
                if (o61Var.f29674a.getTag() == null) {
                    o61Var.f29674a.setVisibility(4);
                    return;
                }
                return;
            case 27:
                super.onAnimationEnd(animator);
                p61 p61Var = (p61) this.f30043b;
                p61Var.f29995b = 0.0f;
                p61Var.setTranslationY(0.0f);
                p61Var.f29994a = null;
                return;
            case 28:
                k81 k81Var = (k81) this.f30043b;
                k81Var.G = false;
                k81Var.setEnabled(true);
                j81 j81Var = k81Var.f28346y;
                if (j81Var != null) {
                    ((oh.h4) j81Var).f0(1.0f);
                }
                k81Var.invalidate();
                return;
            default:
                ((e91) this.f30043b).f26519b0 = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f30042a) {
            case 8:
                um0 um0Var = (um0) this.f30043b;
                um0Var.d = true;
                if (um0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) um0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public pd0(ss0 ss0Var, f2.w0 w0Var) {
        this.f30042a = 13;
        this.f30043b = ss0Var;
    }

    private final void a(Animator animator) {
    }
}
