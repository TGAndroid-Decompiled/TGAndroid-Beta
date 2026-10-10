package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ok extends ChatActivityEnterView {
    public int f40593o5;
    public int p5;
    public int f40594q5;
    public final zn f40595r5;

    public ok(zn znVar, Activity activity, org.telegram.ui.Components.tw0 tw0Var, zn znVar2, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, tw0Var, znVar2, z10, e6Var);
        this.f40595r5 = znVar;
    }

    @Override
    public final void A0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        zn znVar = this.f40595r5;
        if (znVar.Y != null) {
            if (znVar.f45034x0 != null) {
                if (znVar.Ea <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                        if (kVar2.t()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f23937n3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.f40594q5 = this.E0.getScrollY();
            znVar.X0.invalidate();
            znVar.f44758b0 = znVar.Y.getBackgroundTop();
        }
    }

    @Override
    public final void F0() {
        if (this.f40595r5.Fa != null) {
            return;
        }
        super.F0();
    }

    @Override
    public final boolean L0() {
        if (!this.f40595r5.N5) {
            return false;
        }
        return true;
    }

    public final void S1() {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.f40595r5;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (!kVar.t() && !znVar.F9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = znVar.f44758b0;
            if (i10 != 0 && backgroundTop != i10 && this.f40593o5 == znVar.X0.getMeasuredHeight()) {
                int i11 = (this.T1 + znVar.f44758b0) - backgroundTop;
                setAnimatedTop(i11);
                this.f23995y1.invalidate();
                ValueAnimator valueAnimator = znVar.f44938p9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    znVar.f44938p9.cancel();
                }
                View view = this.G1;
                if (view != null && view.getVisibility() == 0) {
                    this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                znVar.f44938p9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final ok f40275b;

                    {
                        this.f40275b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                ok okVar = this.f40275b;
                                zn znVar2 = okVar.f40595r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                okVar.setAnimatedTop((int) floatValue);
                                View view2 = okVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    okVar.G1.setTranslationY(((1.0f - okVar.getTopViewEnterProgress()) * okVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    znVar2.t9();
                                    znVar2.w9();
                                }
                                okVar.f23995y1.invalidate();
                                okVar.invalidate();
                                return;
                            default:
                                this.f40275b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                znVar.f44938p9.addListener(new t4(this, 19));
                znVar.f44938p9.setDuration(250L);
                znVar.f44938p9.setInterpolator(ji.n.V);
                if (!znVar.o9) {
                    znVar.f44938p9.start();
                }
                znVar.t9();
                znVar.w9();
                znVar.f44758b0 = 0;
            } else if (this.f40593o5 != znVar.X0.getMeasuredHeight()) {
                znVar.f44758b0 = 0;
            }
            if (this.f23937n3) {
                float scrollY = (this.f40594q5 - this.E0.getScrollY()) + (this.p5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.sf sfVar = this.E0;
                sfVar.setOffsetY(sfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final ok f40275b;

                    {
                        this.f40275b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                ok okVar = this.f40275b;
                                zn znVar2 = okVar.f40595r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                okVar.setAnimatedTop((int) floatValue);
                                View view2 = okVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    okVar.G1.setTranslationY(((1.0f - okVar.getTopViewEnterProgress()) * okVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    znVar2.t9();
                                    znVar2.w9();
                                }
                                okVar.f23995y1.invalidate();
                                okVar.invalidate();
                                return;
                            default:
                                this.f40275b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = znVar.f44950q9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                znVar.f44950q9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ji.n.V);
                ofFloat2.start();
                this.f23937n3 = false;
            }
            this.f40593o5 = znVar.X0.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = znVar.f44950q9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = znVar.f44938p9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        znVar.f44758b0 = 0;
        this.f23937n3 = false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void o0(boolean z10) {
        super.o0(z10);
        zn znVar = this.f40595r5;
        rf rfVar = znVar.nb;
        if (rfVar != null) {
            AndroidUtilities.runOnUIThread(rfVar);
            znVar.nb = null;
        }
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
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        zn znVar = this.f40595r5;
        j6.l lVar = znVar.Bc;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !znVar.f44967rc) {
            z11 = true;
        }
        lVar.i(1, z10, z11);
    }

    @Override
    public final void y0(float f7) {
        this.f40595r5.t7();
    }
}
