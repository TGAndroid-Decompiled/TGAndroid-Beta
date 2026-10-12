package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class zd0 extends AnimatorListenerAdapter {
    public final int f33335a;
    public final Object f33336b;

    public zd0(Object obj, int i10) {
        this.f33335a = i10;
        this.f33336b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f33335a) {
            case 4:
                ((wh0) this.f33336b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33335a) {
            case 0:
                NumberTextView numberTextView = (NumberTextView) this.f33336b;
                numberTextView.d = null;
                numberTextView.f23978b.clear();
                return;
            case 1:
                xe0 xe0Var = (xe0) this.f33336b;
                xe0Var.O = null;
                xe0Var.f32746r.setText("");
                ci.j9.a(xe0Var.f32747s, false);
                xe0Var.setVisibility(8);
                xe0Var.T = 0.0f;
                xe0Var.g(0.0f);
                xe0Var.setAlpha(0.0f);
                xe0Var.i();
                return;
            case 2:
                AnimatorSet animatorSet = (AnimatorSet) this.f33336b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 3:
                lf lfVar = (lf) this.f33336b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.j9) lfVar.f28184c).f5287e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.j9) lfVar.f28184c).f5287e = null;
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                bi0 bi0Var = (bi0) this.f33336b;
                bi0Var.f24662f = false;
                bi0Var.F = null;
                return;
            case 6:
                ((pj0) this.f33336b).b();
                return;
            case 7:
                ((xk0) this.f33336b).h.setVisibility(8);
                return;
            case 8:
                wm0 wm0Var = (wm0) this.f33336b;
                View view = wm0Var.f32442a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (wm0Var.b1()) {
                    wm0Var.invalidate();
                    return;
                }
                return;
            case 9:
                un0 un0Var = (un0) this.f33336b;
                if (un0Var.f31231s != null) {
                    un0Var.j();
                    un0Var.f31231s.invalidate();
                    un0Var.f31214e.invalidate();
                    un0Var.invalidate();
                    un0Var.f31231s = null;
                    return;
                }
                return;
            case 10:
                ((yn0) this.f33336b).d = false;
                return;
            case 11:
                ((jp0) this.f33336b).M0.setVisibility(8);
                return;
            case 12:
                hq0 hq0Var = (hq0) this.f33336b;
                if (animator == hq0Var.h) {
                    hq0Var.h = null;
                    return;
                }
                return;
            case 13:
                ((rr0) this.f33336b).f30232f = null;
                return;
            case 14:
                zr0 zr0Var = (zr0) this.f33336b;
                if (zr0Var.getParent() != null) {
                    ((ViewGroup) zr0Var.getParent()).removeView(zr0Var);
                    return;
                }
                return;
            case 15:
                cu0 cu0Var = (cu0) this.f33336b;
                View view2 = cu0Var.f25021c;
                view2.setAlpha(1.0f);
                s4.p0.x0(view2);
                cu0Var.f25019a.removeView(view2);
                return;
            case 16:
                ow0 ow0Var = (ow0) this.f33336b;
                if (ow0Var.f29316f == animator) {
                    ow0Var.f29316f = null;
                    return;
                }
                return;
            case 17:
                ey0 ey0Var = (ey0) this.f33336b;
                ey0.z1(ey0Var, ((Float) ey0Var.f25817n3.getAnimatedValue()).floatValue());
                ey0Var.f25817n3 = null;
                return;
            case 18:
                dz0 dz0Var = (dz0) this.f33336b;
                dz0Var.f25504x.setVisibility(8);
                dz0Var.F.setImageDrawable(null);
                return;
            case 19:
                int i10 = 0;
                while (true) {
                    jz0[] jz0VarArr = (jz0[]) this.f33336b;
                    if (i10 < jz0VarArr.length) {
                        jz0 jz0Var = jz0VarArr[i10];
                        if (jz0Var != null) {
                            jz0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 20:
                super.onAnimationEnd(animator);
                ((kz0) this.f33336b).H = null;
                return;
            case 21:
                ((nz0) this.f33336b).f28987e = false;
                return;
            case 22:
                ((y11) this.f33336b).setVisibility(4);
                return;
            case 23:
                ((j31) this.f33336b).setVisibility(8);
                return;
            case 24:
                ai.o4 o4Var = ((c41) this.f33336b).f24811f;
                o4Var.setScaleX(1.0f);
                o4Var.setScaleY(1.0f);
                o4Var.invalidate();
                return;
            case 25:
                g41 g41Var = (g41) this.f33336b;
                g41Var.K = 1.0f;
                g41Var.h.invalidate();
                return;
            case 26:
                ((q61) this.f33336b).L = null;
                return;
            case 27:
                UndoView undoView = (UndoView) this.f33336b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 28:
                v71 v71Var = (v71) this.f33336b;
                if (v71Var.f31450a.getTag() == null) {
                    v71Var.f31450a.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                w71 w71Var = (w71) this.f33336b;
                w71Var.f32354b = 0.0f;
                w71Var.setTranslationY(0.0f);
                w71Var.f32353a = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33335a) {
            case 10:
                yn0 yn0Var = (yn0) this.f33336b;
                yn0Var.d = true;
                if (yn0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) yn0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public zd0(cu0 cu0Var, s4.p0 p0Var) {
        this.f33335a = 15;
        this.f33336b = cu0Var;
    }

    private final void a(Animator animator) {
    }
}
