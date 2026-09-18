package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class lk extends ChatActivityEnterView {
    public int f35393n5;
    public int f35394o5;
    public int p5;
    public final zn f35395q5;

    public lk(zn znVar, Activity activity, org.telegram.ui.Components.bw0 bw0Var, zn znVar2, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, bw0Var, znVar2, z10, e6Var);
        this.f35395q5 = znVar;
    }

    @Override
    public final void A0(float f7) {
        this.f35395q5.q7();
    }

    @Override
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        zn znVar = this.f35395q5;
        if (znVar.Y != null) {
            if (znVar.f40488x0 != null) {
                if (znVar.Da <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                        if (kVar2.s()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f21992m3 = true;
            this.f35394o5 = this.E0.getMeasuredHeight();
            this.p5 = this.E0.getScrollY();
            znVar.X0.invalidate();
            znVar.f40213b0 = znVar.Y.getBackgroundTop();
        }
    }

    @Override
    public final void H0() {
        if (this.f35395q5.Ea != null) {
            return;
        }
        super.H0();
    }

    @Override
    public final boolean N0() {
        if (!this.f35395q5.N5) {
            return false;
        }
        return true;
    }

    public final void T1() {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.f35395q5;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (!kVar.s() && !znVar.A9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = znVar.f40213b0;
            if (i10 != 0 && backgroundTop != i10 && this.f35393n5 == znVar.X0.getMeasuredHeight()) {
                int i11 = (this.S1 + znVar.f40213b0) - backgroundTop;
                setAnimatedTop(i11);
                this.f22050x1.invalidate();
                ValueAnimator valueAnimator = znVar.f40393p9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    znVar.f40393p9.cancel();
                }
                View view = this.F1;
                if (view != null && view.getVisibility() == 0) {
                    this.F1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.F1.getLayoutParams().height) + this.S1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                znVar.f40393p9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final lk f35138b;

                    {
                        this.f35138b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                lk lkVar = this.f35138b;
                                zn znVar2 = lkVar.f35395q5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                lkVar.setAnimatedTop((int) floatValue);
                                View view2 = lkVar.F1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    lkVar.F1.setTranslationY(((1.0f - lkVar.getTopViewEnterProgress()) * lkVar.F1.getLayoutParams().height) + floatValue);
                                } else {
                                    znVar2.o9();
                                    znVar2.r9();
                                }
                                lkVar.f22050x1.invalidate();
                                lkVar.invalidate();
                                return;
                            default:
                                this.f35138b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                znVar.f40393p9.addListener(new t4(this, 18));
                znVar.f40393p9.setDuration(250L);
                znVar.f40393p9.setInterpolator(ji.n.V);
                if (!znVar.o9) {
                    znVar.f40393p9.start();
                }
                znVar.o9();
                znVar.r9();
                znVar.f40213b0 = 0;
            } else if (this.f35393n5 != znVar.X0.getMeasuredHeight()) {
                znVar.f40213b0 = 0;
            }
            if (this.f21992m3) {
                float scrollY = (this.p5 - this.E0.getScrollY()) + (this.f35394o5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.pf pfVar = this.E0;
                pfVar.setOffsetY(pfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final lk f35138b;

                    {
                        this.f35138b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                lk lkVar = this.f35138b;
                                zn znVar2 = lkVar.f35395q5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                lkVar.setAnimatedTop((int) floatValue);
                                View view2 = lkVar.F1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    lkVar.F1.setTranslationY(((1.0f - lkVar.getTopViewEnterProgress()) * lkVar.F1.getLayoutParams().height) + floatValue);
                                } else {
                                    znVar2.o9();
                                    znVar2.r9();
                                }
                                lkVar.f22050x1.invalidate();
                                lkVar.invalidate();
                                return;
                            default:
                                this.f35138b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = znVar.f40405q9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                znVar.f40405q9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ji.n.V);
                ofFloat2.start();
                this.f21992m3 = false;
            }
            this.f35393n5 = znVar.X0.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = znVar.f40405q9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = znVar.f40393p9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        znVar.f40213b0 = 0;
        this.f21992m3 = false;
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
        zn znVar = this.f35395q5;
        rf rfVar = znVar.f40359mb;
        if (rfVar != null) {
            AndroidUtilities.runOnUIThread(rfVar);
            znVar.f40359mb = null;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        zn znVar = this.f35395q5;
        j6.l lVar = znVar.Ac;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !znVar.f40408qc) {
            z11 = true;
        }
        lVar.j(1, z10, z11);
    }
}
