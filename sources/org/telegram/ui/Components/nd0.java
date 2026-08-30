package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class nd0 extends AnimatorListenerAdapter {
    public final int f27233a;
    public final Object f27234b;

    public nd0(Object obj, int i10) {
        this.f27233a = i10;
        this.f27234b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27233a) {
            case 2:
                ((vg0) this.f27234b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27233a) {
            case 0:
                AnimatorSet animatorSet = (AnimatorSet) this.f27234b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 1:
                ye yeVar = (ye) this.f27234b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((rd0) yeVar.f31002c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((rd0) yeVar.f31002c).e = null;
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                ah0 ah0Var = (ah0) this.f27234b;
                ah0Var.f23396f = false;
                ah0Var.C = null;
                return;
            case 4:
                ((pi0) this.f27234b).b();
                return;
            case 5:
                ((yj0) this.f27234b).h.setVisibility(8);
                return;
            case 6:
                sl0 sl0Var = (sl0) this.f27234b;
                View view = sl0Var.Z0;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (sl0Var.b1()) {
                    sl0Var.invalidate();
                    return;
                }
                return;
            case 7:
                pm0 pm0Var = (pm0) this.f27234b;
                if (pm0Var.f27955s != null) {
                    pm0Var.j();
                    pm0Var.f27955s.invalidate();
                    pm0Var.e.invalidate();
                    pm0Var.invalidate();
                    pm0Var.f27955s = null;
                    return;
                }
                return;
            case 8:
                ((um0) this.f27234b).d = false;
                return;
            case 9:
                ((do0) this.f27234b).J0.setVisibility(8);
                return;
            case 10:
                ap0 ap0Var = (ap0) this.f27234b;
                if (animator == ap0Var.h) {
                    ap0Var.h = null;
                    return;
                }
                return;
            case 11:
                ((kq0) this.f27234b).e = null;
                return;
            case 12:
                sq0 sq0Var = (sq0) this.f27234b;
                if (sq0Var.getParent() != null) {
                    ((ViewGroup) sq0Var.getParent()).removeView(sq0Var);
                    return;
                }
                return;
            case 13:
                ss0 ss0Var = (ss0) this.f27234b;
                View view2 = ss0Var.f28813c;
                view2.setAlpha(1.0f);
                f2.v0.x0(view2);
                ss0Var.f28811a.removeView(view2);
                return;
            case 14:
                fv0 fv0Var = (fv0) this.f27234b;
                if (fv0Var.f24966f == animator) {
                    fv0Var.f24966f = null;
                    return;
                }
                return;
            case 15:
                xw0 xw0Var = (xw0) this.f27234b;
                xw0.y1(xw0Var, ((Float) xw0Var.f30757m3.getAnimatedValue()).floatValue());
                xw0Var.f30757m3 = null;
                return;
            case 16:
                xx0 xx0Var = (xx0) this.f27234b;
                xx0Var.f30790x.setVisibility(8);
                xx0Var.C.setImageDrawable(null);
                return;
            case 17:
                int i10 = 0;
                while (true) {
                    ey0[] ey0VarArr = (ey0[]) this.f27234b;
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
                ((fy0) this.f27234b).E = null;
                return;
            case 19:
                ((iy0) this.f27234b).e = false;
                return;
            case 20:
                ((r01) this.f27234b).setVisibility(4);
                return;
            case 21:
                ((a21) this.f27234b).setVisibility(8);
                return;
            case 22:
                nh.a3 a3Var = ((r21) this.f27234b).f28372f;
                a3Var.setScaleX(1.0f);
                a3Var.setScaleY(1.0f);
                a3Var.invalidate();
                return;
            case 23:
                v21 v21Var = (v21) this.f27234b;
                v21Var.H = 1.0f;
                v21Var.h.invalidate();
                return;
            case 24:
                ((e51) this.f27234b).I = null;
                return;
            case 25:
                UndoView undoView = (UndoView) this.f27234b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 26:
                n61 n61Var = (n61) this.f27234b;
                if (n61Var.f27205a.getTag() == null) {
                    n61Var.f27205a.setVisibility(4);
                    return;
                }
                return;
            case 27:
                super.onAnimationEnd(animator);
                o61 o61Var = (o61) this.f27234b;
                o61Var.f27456b = 0.0f;
                o61Var.setTranslationY(0.0f);
                o61Var.f27455a = null;
                return;
            case 28:
                k81 k81Var = (k81) this.f27234b;
                k81Var.G = false;
                k81Var.setEnabled(true);
                j81 j81Var = k81Var.f26229y;
                if (j81Var != null) {
                    ((o2.o) j81Var).q(1.0f);
                }
                k81Var.invalidate();
                return;
            default:
                ((e91) this.f27234b).f24527b0 = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27233a) {
            case 8:
                um0 um0Var = (um0) this.f27234b;
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

    public nd0(ss0 ss0Var, f2.v0 v0Var) {
        this.f27233a = 13;
        this.f27234b = ss0Var;
    }

    private final void a(Animator animator) {
    }
}
