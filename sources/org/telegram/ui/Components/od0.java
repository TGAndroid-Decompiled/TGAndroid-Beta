package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class od0 extends AnimatorListenerAdapter {
    public final int f27516a;
    public final Object f27517b;

    public od0(Object obj, int i10) {
        this.f27516a = i10;
        this.f27517b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27516a) {
            case 2:
                ((wg0) this.f27517b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27516a) {
            case 0:
                AnimatorSet animatorSet = (AnimatorSet) this.f27517b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 1:
                ye yeVar = (ye) this.f27517b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((sd0) yeVar.f31006c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((sd0) yeVar.f31006c).e = null;
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                bh0 bh0Var = (bh0) this.f27517b;
                bh0Var.f23685f = false;
                bh0Var.C = null;
                return;
            case 4:
                ((qi0) this.f27517b).b();
                return;
            case 5:
                ((yj0) this.f27517b).h.setVisibility(8);
                return;
            case 6:
                rl0 rl0Var = (rl0) this.f27517b;
                View view = rl0Var.Z0;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (rl0Var.a1()) {
                    rl0Var.invalidate();
                    return;
                }
                return;
            case 7:
                om0 om0Var = (om0) this.f27517b;
                if (om0Var.f27615s != null) {
                    om0Var.j();
                    om0Var.f27615s.invalidate();
                    om0Var.e.invalidate();
                    om0Var.invalidate();
                    om0Var.f27615s = null;
                    return;
                }
                return;
            case 8:
                ((tm0) this.f27517b).d = false;
                return;
            case 9:
                ((co0) this.f27517b).J0.setVisibility(8);
                return;
            case 10:
                zo0 zo0Var = (zo0) this.f27517b;
                if (animator == zo0Var.h) {
                    zo0Var.h = null;
                    return;
                }
                return;
            case 11:
                ((kq0) this.f27517b).e = null;
                return;
            case 12:
                sq0 sq0Var = (sq0) this.f27517b;
                if (sq0Var.getParent() != null) {
                    ((ViewGroup) sq0Var.getParent()).removeView(sq0Var);
                    return;
                }
                return;
            case 13:
                ss0 ss0Var = (ss0) this.f27517b;
                View view2 = ss0Var.f28804c;
                view2.setAlpha(1.0f);
                f2.v0.x0(view2);
                ss0Var.f28802a.removeView(view2);
                return;
            case 14:
                fv0 fv0Var = (fv0) this.f27517b;
                if (fv0Var.f24972f == animator) {
                    fv0Var.f24972f = null;
                    return;
                }
                return;
            case 15:
                xw0 xw0Var = (xw0) this.f27517b;
                xw0.x1(xw0Var, ((Float) xw0Var.f30739m3.getAnimatedValue()).floatValue());
                xw0Var.f30739m3 = null;
                return;
            case 16:
                xx0 xx0Var = (xx0) this.f27517b;
                xx0Var.f30772x.setVisibility(8);
                xx0Var.C.setImageDrawable(null);
                return;
            case 17:
                int i10 = 0;
                while (true) {
                    ey0[] ey0VarArr = (ey0[]) this.f27517b;
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
                ((fy0) this.f27517b).E = null;
                return;
            case 19:
                ((iy0) this.f27517b).e = false;
                return;
            case 20:
                ((r01) this.f27517b).setVisibility(4);
                return;
            case 21:
                ((a21) this.f27517b).setVisibility(8);
                return;
            case 22:
                nh.a3 a3Var = ((r21) this.f27517b).f28388f;
                a3Var.setScaleX(1.0f);
                a3Var.setScaleY(1.0f);
                a3Var.invalidate();
                return;
            case 23:
                v21 v21Var = (v21) this.f27517b;
                v21Var.H = 1.0f;
                v21Var.h.invalidate();
                return;
            case 24:
                ((e51) this.f27517b).I = null;
                return;
            case 25:
                UndoView undoView = (UndoView) this.f27517b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 26:
                n61 n61Var = (n61) this.f27517b;
                if (n61Var.f27201a.getTag() == null) {
                    n61Var.f27201a.setVisibility(4);
                    return;
                }
                return;
            case 27:
                super.onAnimationEnd(animator);
                o61 o61Var = (o61) this.f27517b;
                o61Var.f27471b = 0.0f;
                o61Var.setTranslationY(0.0f);
                o61Var.f27470a = null;
                return;
            case 28:
                k81 k81Var = (k81) this.f27517b;
                k81Var.G = false;
                k81Var.setEnabled(true);
                j81 j81Var = k81Var.f26231y;
                if (j81Var != null) {
                    ((tp0) j81Var).n(1.0f);
                }
                k81Var.invalidate();
                return;
            default:
                ((e91) this.f27517b).f24533b0 = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27516a) {
            case 8:
                tm0 tm0Var = (tm0) this.f27517b;
                tm0Var.d = true;
                if (tm0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) tm0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public od0(ss0 ss0Var, f2.v0 v0Var) {
        this.f27516a = 13;
        this.f27517b = ss0Var;
    }

    private final void a(Animator animator) {
    }
}
