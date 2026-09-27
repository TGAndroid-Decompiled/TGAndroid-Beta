package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class lk extends ChatActivityEnterView {
    public int f35365o5;
    public int p5;
    public int f35366q5;
    public final xn f35367r5;

    public lk(xn xnVar, Activity activity, org.telegram.ui.Components.cw0 cw0Var, xn xnVar2, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, cw0Var, xnVar2, z10, e6Var);
        this.f35367r5 = xnVar;
    }

    @Override
    public final void A0(float f7) {
        this.f35367r5.q7();
    }

    @Override
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        xn xnVar = this.f35367r5;
        if (xnVar.Y != null) {
            if (xnVar.f39977x0 != null) {
                if (xnVar.Da <= 0.0f) {
                    lVar = ((org.telegram.ui.ActionBar.o2) xnVar).actionBar;
                    if (lVar != null) {
                        lVar2 = ((org.telegram.ui.ActionBar.o2) xnVar).actionBar;
                        if (lVar2.t()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f22037n3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.f35366q5 = this.E0.getScrollY();
            xnVar.X0.invalidate();
            xnVar.f39702b0 = xnVar.Y.getBackgroundTop();
        }
    }

    @Override
    public final void H0() {
        if (this.f35367r5.Ea != null) {
            return;
        }
        super.H0();
    }

    @Override
    public final boolean N0() {
        if (!this.f35367r5.N5) {
            return false;
        }
        return true;
    }

    public final void S1() {
        org.telegram.ui.ActionBar.l lVar;
        xn xnVar = this.f35367r5;
        lVar = ((org.telegram.ui.ActionBar.o2) xnVar).actionBar;
        if (!lVar.t() && !xnVar.A9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = xnVar.f39702b0;
            if (i10 != 0 && backgroundTop != i10 && this.f35365o5 == xnVar.X0.getMeasuredHeight()) {
                int i11 = (this.T1 + xnVar.f39702b0) - backgroundTop;
                setAnimatedTop(i11);
                this.f22095y1.invalidate();
                ValueAnimator valueAnimator = xnVar.f39882p9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    xnVar.f39882p9.cancel();
                }
                View view = this.G1;
                if (view != null && view.getVisibility() == 0) {
                    this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                xnVar.f39882p9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final lk f35095b;

                    {
                        this.f35095b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                lk lkVar = this.f35095b;
                                xn xnVar2 = lkVar.f35367r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                lkVar.setAnimatedTop((int) floatValue);
                                View view2 = lkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    lkVar.G1.setTranslationY(((1.0f - lkVar.getTopViewEnterProgress()) * lkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    xnVar2.o9();
                                    xnVar2.r9();
                                }
                                lkVar.f22095y1.invalidate();
                                lkVar.invalidate();
                                return;
                            default:
                                this.f35095b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                xnVar.f39882p9.addListener(new v4(this, 18));
                xnVar.f39882p9.setDuration(250L);
                xnVar.f39882p9.setInterpolator(ji.n.V);
                if (!xnVar.o9) {
                    xnVar.f39882p9.start();
                }
                xnVar.o9();
                xnVar.r9();
                xnVar.f39702b0 = 0;
            } else if (this.f35365o5 != xnVar.X0.getMeasuredHeight()) {
                xnVar.f39702b0 = 0;
            }
            if (this.f22037n3) {
                float scrollY = (this.f35366q5 - this.E0.getScrollY()) + (this.p5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.qf qfVar = this.E0;
                qfVar.setOffsetY(qfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final lk f35095b;

                    {
                        this.f35095b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                lk lkVar = this.f35095b;
                                xn xnVar2 = lkVar.f35367r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                lkVar.setAnimatedTop((int) floatValue);
                                View view2 = lkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    lkVar.G1.setTranslationY(((1.0f - lkVar.getTopViewEnterProgress()) * lkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    xnVar2.o9();
                                    xnVar2.r9();
                                }
                                lkVar.f22095y1.invalidate();
                                lkVar.invalidate();
                                return;
                            default:
                                this.f35095b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = xnVar.f39894q9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                xnVar.f39894q9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ji.n.V);
                ofFloat2.start();
                this.f22037n3 = false;
            }
            this.f35365o5 = xnVar.X0.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = xnVar.f39894q9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = xnVar.f39882p9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        xnVar.f39702b0 = 0;
        this.f22037n3 = false;
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
        xn xnVar = this.f35367r5;
        rf rfVar = xnVar.f39848mb;
        if (rfVar != null) {
            AndroidUtilities.runOnUIThread(rfVar);
            xnVar.f39848mb = null;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        xn xnVar = this.f35367r5;
        j6.l lVar = xnVar.Ac;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !xnVar.f39897qc) {
            z11 = true;
        }
        lVar.j(1, z10, z11);
    }
}
