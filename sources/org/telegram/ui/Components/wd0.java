package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
public final class wd0 extends AnimatorListenerAdapter {
    public final int f32625a;
    public final Object f32626b;

    public wd0(Object obj, int i10) {
        this.f32625a = i10;
        this.f32626b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32625a) {
            case 4:
                ((uh0) this.f32626b).h = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32625a) {
            case 0:
                NumberTextView numberTextView = (NumberTextView) this.f32626b;
                numberTextView.d = null;
                numberTextView.f24193b.clear();
                return;
            case 1:
                ue0 ue0Var = (ue0) this.f32626b;
                ue0Var.O = null;
                ue0Var.f31413r.setText("");
                ci.j9.a(ue0Var.f31414s, false);
                ue0Var.setVisibility(8);
                ue0Var.T = 0.0f;
                ue0Var.g(0.0f);
                ue0Var.setAlpha(0.0f);
                ue0Var.i();
                return;
            case 2:
                AnimatorSet animatorSet = (AnimatorSet) this.f32626b;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 3:
                lf lfVar = (lf) this.f32626b;
                AnimatorSet animatorSet2 = (AnimatorSet) ((ci.j9) lfVar.f28332c).f5288e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ((ci.j9) lfVar.f28332c).f5288e = null;
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                zh0 zh0Var = (zh0) this.f32626b;
                zh0Var.f33532f = false;
                zh0Var.F = null;
                return;
            case 6:
                ((pj0) this.f32626b).b();
                return;
            case 7:
                ((wk0) this.f32626b).h.setVisibility(8);
                return;
            case 8:
                sm0 sm0Var = (sm0) this.f32626b;
                View view = sm0Var.f30782a1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (sm0Var.b1()) {
                    sm0Var.invalidate();
                    return;
                }
                return;
            case 9:
                qn0 qn0Var = (qn0) this.f32626b;
                if (qn0Var.f30210s != null) {
                    qn0Var.j();
                    qn0Var.f30210s.invalidate();
                    qn0Var.f30193e.invalidate();
                    qn0Var.invalidate();
                    qn0Var.f30210s = null;
                    return;
                }
                return;
            case 10:
                ((un0) this.f32626b).d = false;
                return;
            case 11:
                ((fp0) this.f32626b).M0.setVisibility(8);
                return;
            case 12:
                dq0 dq0Var = (dq0) this.f32626b;
                if (animator == dq0Var.h) {
                    dq0Var.h = null;
                    return;
                }
                return;
            case 13:
                ((nr0) this.f32626b).f29130f = null;
                return;
            case 14:
                vr0 vr0Var = (vr0) this.f32626b;
                if (vr0Var.getParent() != null) {
                    ((ViewGroup) vr0Var.getParent()).removeView(vr0Var);
                    return;
                }
                return;
            case 15:
                yt0 yt0Var = (yt0) this.f32626b;
                View view2 = yt0Var.f33334c;
                view2.setAlpha(1.0f);
                s4.p0.x0(view2);
                yt0Var.f33332a.removeView(view2);
                return;
            case 16:
                kw0 kw0Var = (kw0) this.f32626b;
                if (kw0Var.f28102f == animator) {
                    kw0Var.f28102f = null;
                    return;
                }
                return;
            case 17:
                ay0 ay0Var = (ay0) this.f32626b;
                ay0.z1(ay0Var, ((Float) ay0Var.f24628n3.getAnimatedValue()).floatValue());
                ay0Var.f24628n3 = null;
                return;
            case 18:
                zy0 zy0Var = (zy0) this.f32626b;
                zy0Var.f33715x.setVisibility(8);
                zy0Var.F.setImageDrawable(null);
                return;
            case 19:
                int i10 = 0;
                while (true) {
                    fz0[] fz0VarArr = (fz0[]) this.f32626b;
                    if (i10 < fz0VarArr.length) {
                        fz0 fz0Var = fz0VarArr[i10];
                        if (fz0Var != null) {
                            fz0Var.d = false;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            case 20:
                super.onAnimationEnd(animator);
                ((gz0) this.f32626b).H = null;
                return;
            case 21:
                ((jz0) this.f32626b).f27784e = false;
                return;
            case 22:
                ((u11) this.f32626b).setVisibility(4);
                return;
            case 23:
                ((f31) this.f32626b).setVisibility(8);
                return;
            case 24:
                ai.o4 o4Var = ((z31) this.f32626b).f33404f;
                o4Var.setScaleX(1.0f);
                o4Var.setScaleY(1.0f);
                o4Var.invalidate();
                return;
            case 25:
                d41 d41Var = (d41) this.f32626b;
                d41Var.K = 1.0f;
                d41Var.h.invalidate();
                return;
            case 26:
                ((n61) this.f32626b).L = null;
                return;
            case 27:
                UndoView undoView = (UndoView) this.f32626b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                return;
            case 28:
                s71 s71Var = (s71) this.f32626b;
                if (s71Var.f30660a.getTag() == null) {
                    s71Var.f30660a.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                t71 t71Var = (t71) this.f32626b;
                t71Var.f31047b = 0.0f;
                t71Var.setTranslationY(0.0f);
                t71Var.f31046a = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32625a) {
            case 10:
                un0 un0Var = (un0) this.f32626b;
                un0Var.d = true;
                if (un0Var.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) un0Var.getParent()).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public wd0(yt0 yt0Var, s4.p0 p0Var) {
        this.f32625a = 15;
        this.f32626b = yt0Var;
    }

    private final void a(Animator animator) {
    }
}
