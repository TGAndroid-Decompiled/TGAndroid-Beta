package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class mk extends ChatActivityEnterView {
    public int f38727n5;
    public int f38728o5;
    public int p5;
    public final co f38729q5;

    public mk(co coVar, Activity activity, org.telegram.ui.Components.ov0 ov0Var, co coVar2, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, ov0Var, coVar2, z10, f6Var);
        this.f38729q5 = coVar;
    }

    @Override
    public final void A0(float f7) {
        this.f38729q5.q7();
    }

    @Override
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        co coVar = this.f38729q5;
        if (coVar.Y != null) {
            if (coVar.f35473x0 != null) {
                if (coVar.Da <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                        if (kVar2.s()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f23737m3 = true;
            this.f38728o5 = this.E0.getMeasuredHeight();
            this.p5 = this.E0.getScrollY();
            coVar.X0.invalidate();
            coVar.f35198b0 = coVar.Y.getBackgroundTop();
        }
    }

    @Override
    public final void H0() {
        if (this.f38729q5.Ea != null) {
            return;
        }
        super.H0();
    }

    @Override
    public final boolean N0() {
        if (!this.f38729q5.N5) {
            return false;
        }
        return true;
    }

    public final void T1() {
        org.telegram.ui.ActionBar.k kVar;
        co coVar = this.f38729q5;
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        if (!kVar.s() && !coVar.A9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = coVar.f35198b0;
            if (i10 != 0 && backgroundTop != i10 && this.f38727n5 == coVar.X0.getMeasuredHeight()) {
                int i11 = (this.S1 + coVar.f35198b0) - backgroundTop;
                setAnimatedTop(i11);
                this.f23795x1.invalidate();
                ValueAnimator valueAnimator = coVar.f35378p9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    coVar.f35378p9.cancel();
                }
                View view = this.F1;
                if (view != null && view.getVisibility() == 0) {
                    this.F1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.F1.getLayoutParams().height) + this.S1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                coVar.f35378p9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final mk f38399b;

                    {
                        this.f38399b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                mk mkVar = this.f38399b;
                                co coVar2 = mkVar.f38729q5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                mkVar.setAnimatedTop((int) floatValue);
                                View view2 = mkVar.F1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    mkVar.F1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.F1.getLayoutParams().height) + floatValue);
                                } else {
                                    coVar2.o9();
                                    coVar2.r9();
                                }
                                mkVar.f23795x1.invalidate();
                                mkVar.invalidate();
                                return;
                            default:
                                this.f38399b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                coVar.f35378p9.addListener(new s0(this, 21));
                coVar.f35378p9.setDuration(250L);
                coVar.f35378p9.setInterpolator(ki.o.V);
                if (!coVar.o9) {
                    coVar.f35378p9.start();
                }
                coVar.o9();
                coVar.r9();
                coVar.f35198b0 = 0;
            } else if (this.f38727n5 != coVar.X0.getMeasuredHeight()) {
                coVar.f35198b0 = 0;
            }
            if (this.f23737m3) {
                float scrollY = (this.p5 - this.E0.getScrollY()) + (this.f38728o5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.qf qfVar = this.E0;
                qfVar.setOffsetY(qfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final mk f38399b;

                    {
                        this.f38399b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                mk mkVar = this.f38399b;
                                co coVar2 = mkVar.f38729q5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                mkVar.setAnimatedTop((int) floatValue);
                                View view2 = mkVar.F1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    mkVar.F1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.F1.getLayoutParams().height) + floatValue);
                                } else {
                                    coVar2.o9();
                                    coVar2.r9();
                                }
                                mkVar.f23795x1.invalidate();
                                mkVar.invalidate();
                                return;
                            default:
                                this.f38399b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = coVar.f35390q9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                coVar.f35390q9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ki.o.V);
                ofFloat2.start();
                this.f23737m3 = false;
            }
            this.f38727n5 = coVar.X0.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = coVar.f35390q9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = coVar.f35378p9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        coVar.f35198b0 = 0;
        this.f23737m3 = false;
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
        co coVar = this.f38729q5;
        qf qfVar = coVar.nb;
        if (qfVar != null) {
            AndroidUtilities.runOnUIThread(qfVar);
            coVar.nb = null;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        co coVar = this.f38729q5;
        j6.l lVar = coVar.Bc;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !coVar.f35407rc) {
            z11 = true;
        }
        lVar.j(1, z10, z11);
    }
}
