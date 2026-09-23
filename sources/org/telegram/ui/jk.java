package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jk extends ChatActivityEnterView {
    public int f34467o5;
    public int p5;
    public int f34468q5;
    public final xn f34469r5;

    public jk(xn xnVar, Activity activity, org.telegram.ui.Components.pv0 pv0Var, xn xnVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, pv0Var, xnVar2, z10, d6Var);
        this.f34469r5 = xnVar;
    }

    @Override
    public final void B0(float f7) {
        this.f34469r5.q7();
    }

    @Override
    public final void D0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        xn xnVar = this.f34469r5;
        if (xnVar.Y != null) {
            if (xnVar.f39596x0 != null) {
                if (xnVar.Da <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                        if (kVar2.s()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f21776m3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.f34468q5 = this.E0.getScrollY();
            xnVar.X0.invalidate();
            xnVar.f39322b0 = xnVar.Y.getBackgroundTop();
        }
    }

    @Override
    public final void I0() {
        if (this.f34469r5.Ea != null) {
            return;
        }
        super.I0();
    }

    @Override
    public final boolean O0() {
        if (!this.f34469r5.N5) {
            return false;
        }
        return true;
    }

    public final void U1() {
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.f34469r5;
        kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
        if (!kVar.s() && !xnVar.A9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = xnVar.f39322b0;
            if (i10 != 0 && backgroundTop != i10 && this.f34467o5 == xnVar.X0.getMeasuredHeight()) {
                int i11 = (this.S1 + xnVar.f39322b0) - backgroundTop;
                setAnimatedTop(i11);
                this.f21835x1.invalidate();
                ValueAnimator valueAnimator = xnVar.f39501p9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    xnVar.f39501p9.cancel();
                }
                View view = this.F1;
                if (view != null && view.getVisibility() == 0) {
                    this.F1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.F1.getLayoutParams().height) + this.S1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                xnVar.f39501p9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final jk f34155b;

                    {
                        this.f34155b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                jk jkVar = this.f34155b;
                                xn xnVar2 = jkVar.f34469r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                jkVar.setAnimatedTop((int) floatValue);
                                View view2 = jkVar.F1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    jkVar.F1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.F1.getLayoutParams().height) + floatValue);
                                } else {
                                    xnVar2.o9();
                                    xnVar2.r9();
                                }
                                jkVar.f21835x1.invalidate();
                                jkVar.invalidate();
                                return;
                            default:
                                this.f34155b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                xnVar.f39501p9.addListener(new u4(this, 18));
                xnVar.f39501p9.setDuration(250L);
                xnVar.f39501p9.setInterpolator(ji.n.V);
                if (!xnVar.o9) {
                    xnVar.f39501p9.start();
                }
                xnVar.o9();
                xnVar.r9();
                xnVar.f39322b0 = 0;
            } else if (this.f34467o5 != xnVar.X0.getMeasuredHeight()) {
                xnVar.f39322b0 = 0;
            }
            if (this.f21776m3) {
                float scrollY = (this.f34468q5 - this.E0.getScrollY()) + (this.p5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.pf pfVar = this.E0;
                pfVar.setOffsetY(pfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final jk f34155b;

                    {
                        this.f34155b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                jk jkVar = this.f34155b;
                                xn xnVar2 = jkVar.f34469r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                jkVar.setAnimatedTop((int) floatValue);
                                View view2 = jkVar.F1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    jkVar.F1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.F1.getLayoutParams().height) + floatValue);
                                } else {
                                    xnVar2.o9();
                                    xnVar2.r9();
                                }
                                jkVar.f21835x1.invalidate();
                                jkVar.invalidate();
                                return;
                            default:
                                this.f34155b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = xnVar.f39513q9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                xnVar.f39513q9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ji.n.V);
                ofFloat2.start();
                this.f21776m3 = false;
            }
            this.f34467o5 = xnVar.X0.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = xnVar.f39513q9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = xnVar.f39501p9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        xnVar.f39322b0 = 0;
        this.f21776m3 = false;
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
    public final void r0(boolean z10) {
        super.r0(z10);
        xn xnVar = this.f34469r5;
        pf pfVar = xnVar.f39467mb;
        if (pfVar != null) {
            AndroidUtilities.runOnUIThread(pfVar);
            xnVar.f39467mb = null;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        xn xnVar = this.f34469r5;
        j6.l lVar = xnVar.Ac;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !xnVar.f39516qc) {
            z11 = true;
        }
        lVar.j(1, z10, z11);
    }
}
