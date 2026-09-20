package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class dd0 extends AnimatorListenerAdapter {
    public final int f23574a;
    public final Object f23575b;

    public dd0(Object obj, int i10) {
        this.f23574a = i10;
        this.f23575b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f23574a) {
            case 4:
                ((zg0) this.f23575b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23574a) {
            case 0:
                NumberTextView numberTextView = (NumberTextView) this.f23575b;
                numberTextView.d = null;
                numberTextView.f22292b.clear();
                return;
            case 1:
                ae0 ae0Var = (ae0) this.f23575b;
                ae0Var.setVisibility(8);
                ae0Var.h();
                ae0Var.P = 0.0f;
                ae0Var.f(0.0f);
                ae0Var.setAlpha(0.0f);
                return;
            case 2:
                AnimatorSet animatorSet = (AnimatorSet) this.f23575b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 3:
                hf hfVar = (hf) this.f23575b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.m9) hfVar.f24657c).e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.m9) hfVar.f24657c).e = null;
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                eh0 eh0Var = (eh0) this.f23575b;
                eh0Var.f23853f = false;
                eh0Var.F = null;
                return;
            case 6:
                ((si0) this.f23575b).b();
                return;
            case 7:
                ((zj0) this.f23575b).h.setVisibility(8);
                return;
            case 8:
                vl0 vl0Var = (vl0) this.f23575b;
                View view = vl0Var.f29181c1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (vl0Var.c1()) {
                    vl0Var.invalidate();
                    return;
                }
                return;
            case 9:
                um0 um0Var = (um0) this.f23575b;
                if (um0Var.f28728s != null) {
                    um0Var.j();
                    um0Var.f28728s.invalidate();
                    um0Var.e.invalidate();
                    um0Var.invalidate();
                    um0Var.f28728s = null;
                    return;
                }
                return;
            case 10:
                ((ym0) this.f23575b).d = false;
                return;
            case 11:
                ((lo0) this.f23575b).N0.setVisibility(8);
                return;
            case 12:
                jp0 jp0Var = (jp0) this.f23575b;
                if (animator == jp0Var.h) {
                    jp0Var.h = null;
                    return;
                }
                return;
            case 13:
                ((tq0) this.f23575b).e = null;
                return;
            case 14:
                br0 br0Var = (br0) this.f23575b;
                if (br0Var.getParent() != null) {
                    ((ViewGroup) br0Var.getParent()).removeView(br0Var);
                    return;
                }
                return;
            case 15:
                et0 et0Var = (et0) this.f23575b;
                View view2 = et0Var.f23933c;
                view2.setAlpha(1.0f);
                s4.o0.x0(view2);
                et0Var.f23931a.removeView(view2);
                return;
            case 16:
                qv0 qv0Var = (qv0) this.f23575b;
                if (qv0Var.f27676f == animator) {
                    qv0Var.f27676f = null;
                    return;
                }
                return;
            case 17:
                hx0 hx0Var = (hx0) this.f23575b;
                hx0.z1(hx0Var, ((Float) hx0Var.f24786p3.getAnimatedValue()).floatValue());
                hx0Var.f24786p3 = null;
                return;
            case 18:
                gy0 gy0Var = (gy0) this.f23575b;
                gy0Var.f24502x.setVisibility(8);
                gy0Var.F.setImageDrawable(null);
                return;
            case 19:
                int i10 = 0;
                while (true) {
                    ny0[] ny0VarArr = (ny0[]) this.f23575b;
                    if (i10 < ny0VarArr.length) {
                        ny0 ny0Var = ny0VarArr[i10];
                        if (ny0Var != null) {
                            ny0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 20:
                super.onAnimationEnd(animator);
                ((oy0) this.f23575b).H = null;
                return;
            case 21:
                ((ry0) this.f23575b).e = false;
                return;
            case 22:
                ((b11) this.f23575b).setVisibility(4);
                return;
            case 23:
                ((m21) this.f23575b).setVisibility(8);
                return;
            case 24:
                ai.n4 n4Var = ((g31) this.f23575b).f24243f;
                n4Var.setScaleX(1.0f);
                n4Var.setScaleY(1.0f);
                n4Var.invalidate();
                return;
            case 25:
                k31 k31Var = (k31) this.f23575b;
                k31Var.K = 1.0f;
                k31Var.h.invalidate();
                return;
            case 26:
                ((s51) this.f23575b).L = null;
                return;
            case 27:
                UndoView undoView = (UndoView) this.f23575b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 28:
                z61 z61Var = (z61) this.f23575b;
                if (z61Var.f30767a.getTag() == null) {
                    z61Var.f30767a.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                a71 a71Var = (a71) this.f23575b;
                a71Var.f22580b = 0.0f;
                a71Var.setTranslationY(0.0f);
                a71Var.f22579a = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f23574a) {
            case 10:
                ym0 ym0Var = (ym0) this.f23575b;
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

    public dd0(et0 et0Var, s4.o0 o0Var) {
        this.f23574a = 15;
        this.f23575b = et0Var;
    }

    private final void a(Animator animator) {
    }
}
