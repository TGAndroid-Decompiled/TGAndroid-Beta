package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ok extends ChatActivityEnterView {
    public int f35507n5;
    public int f35508o5;
    public int p5;
    public final eo f35509q5;

    public ok(eo eoVar, Activity activity, org.telegram.ui.Components.aw0 aw0Var, eo eoVar2, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, aw0Var, eoVar2, z10, f6Var);
        this.f35509q5 = eoVar;
    }

    @Override
    public final void A0(float f7) {
        this.f35509q5.q7();
    }

    @Override
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        eo eoVar = this.f35509q5;
        if (eoVar.Y != null) {
            if (eoVar.f32542x0 != null) {
                if (eoVar.Da <= 0.0f) {
                    lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                    if (lVar != null) {
                        lVar2 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                        if (lVar2.s()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f20891m3 = true;
            this.f35508o5 = this.E0.getMeasuredHeight();
            this.p5 = this.E0.getScrollY();
            eoVar.X0.invalidate();
            eoVar.f32268b0 = eoVar.Y.getBackgroundTop();
        }
    }

    @Override
    public final void H0() {
        if (this.f35509q5.Ea != null) {
            return;
        }
        super.H0();
    }

    @Override
    public final boolean N0() {
        if (!this.f35509q5.N5) {
            return false;
        }
        return true;
    }

    public final void T1() {
        org.telegram.ui.ActionBar.l lVar;
        eo eoVar = this.f35509q5;
        lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        if (!lVar.s() && !eoVar.A9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = eoVar.f32268b0;
            if (i10 != 0 && backgroundTop != i10 && this.f35507n5 == eoVar.X0.getMeasuredHeight()) {
                int i11 = (this.S1 + eoVar.f32268b0) - backgroundTop;
                setAnimatedTop(i11);
                this.f20949x1.invalidate();
                ValueAnimator valueAnimator = eoVar.f32447p9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    eoVar.f32447p9.cancel();
                }
                View view = this.F1;
                if (view != null && view.getVisibility() == 0) {
                    this.F1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.F1.getLayoutParams().height) + this.S1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                eoVar.f32447p9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final ok f35302b;

                    {
                        this.f35302b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                ok okVar = this.f35302b;
                                eo eoVar2 = okVar.f35509q5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                okVar.setAnimatedTop((int) floatValue);
                                View view2 = okVar.F1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    okVar.F1.setTranslationY(((1.0f - okVar.getTopViewEnterProgress()) * okVar.F1.getLayoutParams().height) + floatValue);
                                } else {
                                    eoVar2.o9();
                                    eoVar2.r9();
                                }
                                okVar.f20949x1.invalidate();
                                okVar.invalidate();
                                return;
                            default:
                                this.f35302b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                eoVar.f32447p9.addListener(new org.telegram.ui.Cells.v5(this, 8));
                eoVar.f32447p9.setDuration(250L);
                eoVar.f32447p9.setInterpolator(ii.n.V);
                if (!eoVar.o9) {
                    eoVar.f32447p9.start();
                }
                eoVar.o9();
                eoVar.r9();
                eoVar.f32268b0 = 0;
            } else if (this.f35507n5 != eoVar.X0.getMeasuredHeight()) {
                eoVar.f32268b0 = 0;
            }
            if (this.f20891m3) {
                float scrollY = (this.p5 - this.E0.getScrollY()) + (this.f35508o5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.rf rfVar = this.E0;
                rfVar.setOffsetY(rfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final ok f35302b;

                    {
                        this.f35302b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                ok okVar = this.f35302b;
                                eo eoVar2 = okVar.f35509q5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                okVar.setAnimatedTop((int) floatValue);
                                View view2 = okVar.F1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    okVar.F1.setTranslationY(((1.0f - okVar.getTopViewEnterProgress()) * okVar.F1.getLayoutParams().height) + floatValue);
                                } else {
                                    eoVar2.o9();
                                    eoVar2.r9();
                                }
                                okVar.f20949x1.invalidate();
                                okVar.invalidate();
                                return;
                            default:
                                this.f35302b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = eoVar.f32459q9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                eoVar.f32459q9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ii.n.V);
                ofFloat2.start();
                this.f20891m3 = false;
            }
            this.f35507n5 = eoVar.X0.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = eoVar.f32459q9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = eoVar.f32447p9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        eoVar.f32268b0 = 0;
        this.f20891m3 = false;
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
        eo eoVar = this.f35509q5;
        sf sfVar = eoVar.nb;
        if (sfVar != null) {
            AndroidUtilities.runOnUIThread(sfVar);
            eoVar.nb = null;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        eo eoVar = this.f35509q5;
        j6.l lVar = eoVar.Bc;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !eoVar.f32476rc) {
            z11 = true;
        }
        lVar.j(1, z10, z11);
    }
}
