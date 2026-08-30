package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jk extends ChatActivityEnterView {
    public int f35364k5;
    public int f35365l5;
    public int f35366m5;
    public final xn f35367n5;

    public jk(xn xnVar, Activity activity, org.telegram.ui.Components.qv0 qv0Var, xn xnVar2, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, qv0Var, xnVar2, z4, f6Var);
        this.f35367n5 = xnVar;
    }

    @Override
    public final void A0(float f10) {
        this.f35367n5.q7();
    }

    @Override
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        xn xnVar = this.f35367n5;
        if (xnVar.V != null) {
            if (xnVar.f40193u0 != null) {
                if (xnVar.Aa <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                        if (kVar2.s()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f22789j3 = true;
            this.f35365l5 = this.B0.getMeasuredHeight();
            this.f35366m5 = this.B0.getScrollY();
            xnVar.U0.invalidate();
            xnVar.Y = xnVar.V.getBackgroundTop();
        }
    }

    @Override
    public final void H0() {
        if (this.f35367n5.Ba != null) {
            return;
        }
        super.H0();
    }

    @Override
    public final boolean N0() {
        if (!this.f35367n5.K5) {
            return false;
        }
        return true;
    }

    public final void T1() {
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.f35367n5;
        kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        if (!kVar.s() && !xnVar.A9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = xnVar.Y;
            if (i10 != 0 && backgroundTop != i10 && this.f35364k5 == xnVar.U0.getMeasuredHeight()) {
                int i11 = (this.P1 + xnVar.Y) - backgroundTop;
                setAnimatedTop(i11);
                this.f22843u1.invalidate();
                ValueAnimator valueAnimator = xnVar.m9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    xnVar.m9.cancel();
                }
                View view = this.C1;
                if (view != null && view.getVisibility() == 0) {
                    this.C1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.C1.getLayoutParams().height) + this.P1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                xnVar.m9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final jk f35134b;

                    {
                        this.f35134b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                jk jkVar = this.f35134b;
                                xn xnVar2 = jkVar.f35367n5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                jkVar.setAnimatedTop((int) floatValue);
                                View view2 = jkVar.C1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    jkVar.C1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.C1.getLayoutParams().height) + floatValue);
                                } else {
                                    xnVar2.o9();
                                    xnVar2.r9();
                                }
                                jkVar.f22843u1.invalidate();
                                jkVar.invalidate();
                                return;
                            default:
                                this.f35134b.B0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                xnVar.m9.addListener(new s5(this, 17));
                xnVar.m9.setDuration(250L);
                xnVar.m9.setInterpolator(wh.n.V);
                if (!xnVar.f40092l9) {
                    xnVar.m9.start();
                }
                xnVar.o9();
                xnVar.r9();
                xnVar.Y = 0;
            } else if (this.f35364k5 != xnVar.U0.getMeasuredHeight()) {
                xnVar.Y = 0;
            }
            if (this.f22789j3) {
                float scrollY = (this.f35366m5 - this.B0.getScrollY()) + (this.f35365l5 - this.B0.getMeasuredHeight());
                org.telegram.ui.Components.ff ffVar = this.B0;
                ffVar.setOffsetY(ffVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.B0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final jk f35134b;

                    {
                        this.f35134b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                jk jkVar = this.f35134b;
                                xn xnVar2 = jkVar.f35367n5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                jkVar.setAnimatedTop((int) floatValue);
                                View view2 = jkVar.C1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    jkVar.C1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.C1.getLayoutParams().height) + floatValue);
                                } else {
                                    xnVar2.o9();
                                    xnVar2.r9();
                                }
                                jkVar.f22843u1.invalidate();
                                jkVar.invalidate();
                                return;
                            default:
                                this.f35134b.B0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = xnVar.f40117n9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                xnVar.f40117n9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(wh.n.V);
                ofFloat2.start();
                this.f22789j3 = false;
            }
            this.f35364k5 = xnVar.U0.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = xnVar.f40117n9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = xnVar.m9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        xnVar.Y = 0;
        this.f22789j3 = false;
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
    public final void q0(boolean z4) {
        super.q0(z4);
        xn xnVar = this.f35367n5;
        lf lfVar = xnVar.f40082kb;
        if (lfVar != null) {
            AndroidUtilities.runOnUIThread(lfVar);
            xnVar.f40082kb = null;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z4;
        super.setVisibility(i10);
        xn xnVar = this.f35367n5;
        h5.u uVar = xnVar.f40260yc;
        boolean z10 = false;
        if (i10 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (getMeasuredWidth() > 0 && !xnVar.f40131oc) {
            z10 = true;
        }
        uVar.h(1, z4, z10);
    }
}
