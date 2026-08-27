package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

public final class ck extends ChatActivityEnterView {

    public int f37104j5;

    public int f37105k5;

    public int f37106l5;

    public final rn f37107m5;

    public ck(rn rnVar, Activity activity, org.telegram.ui.Components.zu0 zu0Var, rn rnVar2, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, zu0Var, rnVar2, z10, c6Var);
        this.f37107m5 = rnVar;
    }

    @Override
    public final void A0(float f10) {
        this.f37107m5.q7();
    }

    @Override
    public final void C0(int i10, int i11) {
        rn rnVar = this.f37107m5;
        if (rnVar.U != null) {
            if (rnVar.f42213t0 != null) {
                if (rnVar.f42300za > 0.0f) {
                    return;
                }
                if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar != null && ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.t()) {
                    return;
                }
            }
            this.f26125i3 = true;
            this.f37105k5 = this.A0.getMeasuredHeight();
            this.f37106l5 = this.A0.getScrollY();
            rnVar.T0.invalidate();
            rnVar.X = rnVar.U.getBackgroundTop();
        }
    }

    @Override
    public final void H0() {
        if (this.f37107m5.Aa != null) {
            return;
        }
        super.H0();
    }

    @Override
    public final boolean N0() {
        return this.f37107m5.J5;
    }

    public final void S1() {
        rn rnVar = this.f37107m5;
        final int i10 = 0;
        if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar.t() || rnVar.A9()) {
            ValueAnimator valueAnimator = rnVar.f42134m9;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = rnVar.f42123l9;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            rnVar.X = 0;
            this.f26125i3 = false;
            return;
        }
        int backgroundTop = getBackgroundTop();
        int i11 = rnVar.X;
        final int i12 = 1;
        if (i11 != 0 && backgroundTop != i11 && this.f37104j5 == rnVar.T0.getMeasuredHeight()) {
            int i13 = (this.O1 + rnVar.X) - backgroundTop;
            setAnimatedTop(i13);
            this.f26179t1.invalidate();
            ValueAnimator valueAnimator3 = rnVar.f42123l9;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
                rnVar.f42123l9.cancel();
            }
            View view = this.B1;
            if (view != null && view.getVisibility() == 0) {
                this.B1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.B1.getLayoutParams().height) + this.O1);
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i13, 0.0f);
            rnVar.f42123l9 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                public final ck f36846b;

                {
                    this.f36846b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i10) {
                        case 0:
                            ck ckVar = this.f36846b;
                            rn rnVar2 = ckVar.f37107m5;
                            float fFloatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            ckVar.setAnimatedTop((int) fFloatValue);
                            View view2 = ckVar.B1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                rnVar2.o9();
                                rnVar2.r9();
                            } else {
                                ckVar.B1.setTranslationY(((1.0f - ckVar.getTopViewEnterProgress()) * ckVar.B1.getLayoutParams().height) + fFloatValue);
                            }
                            ckVar.f26179t1.invalidate();
                            ckVar.invalidate();
                            break;
                        default:
                            this.f36846b.A0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            rnVar.f42123l9.addListener(new lh.h9(this, 26));
            rnVar.f42123l9.setDuration(250L);
            rnVar.f42123l9.setInterpolator(sh.m.V);
            if (!rnVar.f42112k9) {
                rnVar.f42123l9.start();
            }
            rnVar.o9();
            rnVar.r9();
            rnVar.X = 0;
        } else if (this.f37104j5 != rnVar.T0.getMeasuredHeight()) {
            rnVar.X = 0;
        }
        if (this.f26125i3) {
            float scrollY = (this.f37106l5 - this.A0.getScrollY()) + (this.f37105k5 - this.A0.getMeasuredHeight());
            org.telegram.ui.Components.bf bfVar = this.A0;
            bfVar.setOffsetY(bfVar.getOffsetY() - scrollY);
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.A0.getOffsetY(), 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                public final ck f36846b;

                {
                    this.f36846b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i12) {
                        case 0:
                            ck ckVar = this.f36846b;
                            rn rnVar2 = ckVar.f37107m5;
                            float fFloatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            ckVar.setAnimatedTop((int) fFloatValue);
                            View view2 = ckVar.B1;
                            if (view2 == null || view2.getVisibility() != 0) {
                                rnVar2.o9();
                                rnVar2.r9();
                            } else {
                                ckVar.B1.setTranslationY(((1.0f - ckVar.getTopViewEnterProgress()) * ckVar.B1.getLayoutParams().height) + fFloatValue);
                            }
                            ckVar.f26179t1.invalidate();
                            ckVar.invalidate();
                            break;
                        default:
                            this.f36846b.A0.setOffsetY(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                            break;
                    }
                }
            });
            ValueAnimator valueAnimator4 = rnVar.f42134m9;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            rnVar.f42134m9 = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.setDuration(250L);
            valueAnimatorOfFloat2.setInterpolator(sh.m.V);
            valueAnimatorOfFloat2.start();
            this.f26125i3 = false;
        }
        this.f37104j5 = rnVar.T0.getMeasuredHeight();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void q0(boolean z10) {
        super.q0(z10);
        rn rnVar = this.f37107m5;
        gf gfVar = rnVar.f42101jb;
        if (gfVar != null) {
            AndroidUtilities.runOnUIThread(gfVar);
            rnVar.f42101jb = null;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        rn rnVar = this.f37107m5;
        d5.x xVar = rnVar.f42275xc;
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (getMeasuredWidth() > 0 && !rnVar.f42150nc) {
            z10 = true;
        }
        xVar.j(1, z11, z10);
    }
}
