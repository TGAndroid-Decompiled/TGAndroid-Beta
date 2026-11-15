package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qj extends ChatActivityEnterView {
    public int O6;
    public int P6;
    public int Q6;
    public final an R6;

    public qj(an anVar, Activity activity, org.telegram.ui.Components.st0 st0Var, an anVar2, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, st0Var, anVar2, z10, e6Var);
        this.R6 = anVar;
    }

    @Override
    public final void C0(boolean z10) {
        super.C0(z10);
        an anVar = this.R6;
        ye yeVar = anVar.Qb;
        if (yeVar != null) {
            org.telegram.messenger.g0.h3(yeVar);
            anVar.Qb = null;
        }
    }

    @Override
    public final void P0(float f10) {
        this.R6.F7();
    }

    @Override
    public final void R0(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        an anVar = this.R6;
        if (anVar.f45117a0 != null) {
            if (anVar.A0 != null) {
                if (anVar.f45128ab <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                        if (kVar2.x()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.V3 = true;
            this.P6 = this.F0.getMeasuredHeight();
            this.Q6 = this.F0.getScrollY();
            anVar.f45277m1.invalidate();
            anVar.f45160d0 = anVar.f45117a0.getBackgroundTop();
        }
    }

    @Override
    public final void W0() {
        if (this.R6.f45143bb != null) {
            return;
        }
        super.W0();
    }

    @Override
    public final boolean c1() {
        if (!this.R6.f45179e6) {
            return false;
        }
        return true;
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
    public final void setVisibility(int i7) {
        boolean z10;
        super.setVisibility(i7);
        an anVar = this.R6;
        m6.n nVar = anVar.f45238id;
        boolean z11 = false;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !anVar.Yc) {
            z11 = true;
        }
        nVar.h(1, z10, z11);
    }

    public final void v2() {
        org.telegram.ui.ActionBar.k kVar;
        Interpolator interpolator;
        Interpolator interpolator2;
        an anVar = this.R6;
        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        if (!kVar.x() && !anVar.Y9()) {
            int backgroundTop = getBackgroundTop();
            int i7 = anVar.f45160d0;
            if (i7 != 0 && backgroundTop != i7 && this.O6 == anVar.f45277m1.getMeasuredHeight()) {
                int i10 = (this.B2 + anVar.f45160d0) - backgroundTop;
                setAnimatedTop(i10);
                this.f32201g2.invalidate();
                ValueAnimator valueAnimator = anVar.L9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    anVar.L9.cancel();
                }
                View view = this.f32254o2;
                if (view != null && view.getVisibility() == 0) {
                    this.f32254o2.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.f32254o2.getLayoutParams().height) + this.B2);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i10, 0.0f);
                anVar.L9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final qj f50279b;

                    {
                        this.f50279b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                qj qjVar = this.f50279b;
                                an anVar2 = qjVar.R6;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                qjVar.setAnimatedTop((int) floatValue);
                                View view2 = qjVar.f32254o2;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    qjVar.f32254o2.setTranslationY(((1.0f - qjVar.getTopViewEnterProgress()) * qjVar.f32254o2.getLayoutParams().height) + floatValue);
                                } else {
                                    anVar2.M9();
                                    anVar2.O9();
                                }
                                qjVar.f32201g2.invalidate();
                                qjVar.invalidate();
                                return;
                            default:
                                this.f50279b.F0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                anVar.L9.addListener(new org.telegram.ui.Cells.w9(this, 6));
                anVar.L9.setDuration(s0());
                ValueAnimator valueAnimator2 = anVar.L9;
                Interpolator interpolator3 = pi.k.V;
                if (this.f32325y1 > 0 && SystemClock.uptimeMillis() < this.f32325y1 && (interpolator2 = this.f32332z1) != null) {
                    interpolator3 = interpolator2;
                }
                valueAnimator2.setInterpolator(interpolator3);
                anVar.L9.setStartDelay(getLineAnimationDelay());
                if (!anVar.K9) {
                    anVar.L9.start();
                }
                anVar.M9();
                anVar.O9();
                anVar.f45160d0 = 0;
            } else if (this.O6 != anVar.f45277m1.getMeasuredHeight()) {
                anVar.f45160d0 = 0;
            }
            if (this.V3) {
                float scrollY = (this.Q6 - this.F0.getScrollY()) + (this.P6 - this.F0.getMeasuredHeight());
                org.telegram.ui.Components.xe xeVar = this.F0;
                xeVar.setOffsetY(xeVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.F0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final qj f50279b;

                    {
                        this.f50279b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                        switch (r2) {
                            case 0:
                                qj qjVar = this.f50279b;
                                an anVar2 = qjVar.R6;
                                float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                qjVar.setAnimatedTop((int) floatValue);
                                View view2 = qjVar.f32254o2;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    qjVar.f32254o2.setTranslationY(((1.0f - qjVar.getTopViewEnterProgress()) * qjVar.f32254o2.getLayoutParams().height) + floatValue);
                                } else {
                                    anVar2.M9();
                                    anVar2.O9();
                                }
                                qjVar.f32201g2.invalidate();
                                qjVar.invalidate();
                                return;
                            default:
                                this.f50279b.F0.setOffsetY(((Float) valueAnimator22.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator3 = anVar.M9;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                anVar.M9 = ofFloat2;
                ofFloat2.setDuration(s0());
                Interpolator interpolator4 = pi.k.V;
                if (this.f32325y1 > 0 && SystemClock.uptimeMillis() < this.f32325y1 && (interpolator = this.f32332z1) != null) {
                    interpolator4 = interpolator;
                }
                ofFloat2.setInterpolator(interpolator4);
                ofFloat2.setStartDelay(getLineAnimationDelay());
                ofFloat2.start();
                this.V3 = false;
            }
            this.O6 = anVar.f45277m1.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator4 = anVar.M9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = anVar.L9;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        anVar.f45160d0 = 0;
        this.V3 = false;
    }
}
