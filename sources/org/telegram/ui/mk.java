package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class mk extends ChatActivityEnterView {
    public int f35767o5;
    public int p5;
    public int f35768q5;
    public final bo f35769r5;

    public mk(bo boVar, Activity activity, org.telegram.ui.Components.pv0 pv0Var, bo boVar2, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, pv0Var, boVar2, z10, e6Var);
        this.f35769r5 = boVar;
    }

    @Override
    public final void B0(float f7) {
        this.f35769r5.q7();
    }

    @Override
    public final void D0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        bo boVar = this.f35769r5;
        if (boVar.Y != null) {
            if (boVar.f32519x0 != null) {
                if (boVar.Da <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                        if (kVar2.s()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f21802m3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.f35768q5 = this.E0.getScrollY();
            boVar.X0.invalidate();
            boVar.f32245b0 = boVar.Y.getBackgroundTop();
        }
    }

    @Override
    public final void I0() {
        if (this.f35769r5.Ea != null) {
            return;
        }
        super.I0();
    }

    @Override
    public final boolean O0() {
        if (!this.f35769r5.N5) {
            return false;
        }
        return true;
    }

    public final void U1() {
        org.telegram.ui.ActionBar.k kVar;
        bo boVar = this.f35769r5;
        kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
        if (!kVar.s() && !boVar.A9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = boVar.f32245b0;
            if (i10 != 0 && backgroundTop != i10 && this.f35767o5 == boVar.X0.getMeasuredHeight()) {
                int i11 = (this.S1 + boVar.f32245b0) - backgroundTop;
                setAnimatedTop(i11);
                this.f21861x1.invalidate();
                ValueAnimator valueAnimator = boVar.f32424p9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    boVar.f32424p9.cancel();
                }
                View view = this.F1;
                if (view != null && view.getVisibility() == 0) {
                    this.F1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.F1.getLayoutParams().height) + this.S1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                boVar.f32424p9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final mk f35511b;

                    {
                        this.f35511b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                mk mkVar = this.f35511b;
                                bo boVar2 = mkVar.f35769r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                mkVar.setAnimatedTop((int) floatValue);
                                View view2 = mkVar.F1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    mkVar.F1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.F1.getLayoutParams().height) + floatValue);
                                } else {
                                    boVar2.o9();
                                    boVar2.r9();
                                }
                                mkVar.f21861x1.invalidate();
                                mkVar.invalidate();
                                return;
                            default:
                                this.f35511b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                boVar.f32424p9.addListener(new t4(this, 18));
                boVar.f32424p9.setDuration(250L);
                boVar.f32424p9.setInterpolator(ji.n.V);
                if (!boVar.o9) {
                    boVar.f32424p9.start();
                }
                boVar.o9();
                boVar.r9();
                boVar.f32245b0 = 0;
            } else if (this.f35767o5 != boVar.X0.getMeasuredHeight()) {
                boVar.f32245b0 = 0;
            }
            if (this.f21802m3) {
                float scrollY = (this.f35768q5 - this.E0.getScrollY()) + (this.p5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.of ofVar = this.E0;
                ofVar.setOffsetY(ofVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final mk f35511b;

                    {
                        this.f35511b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                mk mkVar = this.f35511b;
                                bo boVar2 = mkVar.f35769r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                mkVar.setAnimatedTop((int) floatValue);
                                View view2 = mkVar.F1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    mkVar.F1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.F1.getLayoutParams().height) + floatValue);
                                } else {
                                    boVar2.o9();
                                    boVar2.r9();
                                }
                                mkVar.f21861x1.invalidate();
                                mkVar.invalidate();
                                return;
                            default:
                                this.f35511b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = boVar.f32436q9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                boVar.f32436q9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ji.n.V);
                ofFloat2.start();
                this.f21802m3 = false;
            }
            this.f35767o5 = boVar.X0.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = boVar.f32436q9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = boVar.f32424p9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        boVar.f32245b0 = 0;
        this.f21802m3 = false;
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
        bo boVar = this.f35769r5;
        qf qfVar = boVar.f32390mb;
        if (qfVar != null) {
            AndroidUtilities.runOnUIThread(qfVar);
            boVar.f32390mb = null;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        bo boVar = this.f35769r5;
        j6.l lVar = boVar.Ac;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !boVar.f32439qc) {
            z11 = true;
        }
        lVar.j(1, z10, z11);
    }
}
