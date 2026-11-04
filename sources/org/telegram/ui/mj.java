package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class mj extends ChatActivityEnterView {
    public int f47681u5;
    public int f47682v5;
    public int f47683w5;
    public final wm f47684x5;

    public mj(wm wmVar, Activity activity, org.telegram.ui.Components.qt0 qt0Var, wm wmVar2, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, qt0Var, wmVar2, z10, e6Var);
        this.f47684x5 = wmVar;
    }

    @Override
    public final void B0(int i3, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        wm wmVar = this.f47684x5;
        if (wmVar.f51237a0 != null) {
            if (wmVar.A0 != null) {
                if (wmVar.Ya <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                        if (kVar2.v()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f31170o3 = true;
            this.f47682v5 = this.F0.getMeasuredHeight();
            this.f47683w5 = this.F0.getScrollY();
            wmVar.m1.invalidate();
            wmVar.f51278d0 = wmVar.f51237a0.getBackgroundTop();
        }
    }

    @Override
    public final void G0() {
        if (this.f47684x5.Za != null) {
            return;
        }
        super.G0();
    }

    @Override
    public final boolean M0() {
        if (!this.f47684x5.f51299e6) {
            return false;
        }
        return true;
    }

    public final void U1() {
        org.telegram.ui.ActionBar.k kVar;
        wm wmVar = this.f47684x5;
        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        if (!kVar.v() && !wmVar.W9()) {
            int backgroundTop = getBackgroundTop();
            int i3 = wmVar.f51278d0;
            if (i3 != 0 && backgroundTop != i3 && this.f47681u5 == wmVar.m1.getMeasuredHeight()) {
                int i10 = (this.U1 + wmVar.f51278d0) - backgroundTop;
                setAnimatedTop(i10);
                this.f31232z1.invalidate();
                ValueAnimator valueAnimator = wmVar.J9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    wmVar.J9.cancel();
                }
                View view = this.H1;
                if (view != null && view.getVisibility() == 0) {
                    this.H1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.H1.getLayoutParams().height) + this.U1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i10, 0.0f);
                wmVar.J9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final mj f47347b;

                    {
                        this.f47347b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                mj mjVar = this.f47347b;
                                wm wmVar2 = mjVar.f47684x5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                mjVar.setAnimatedTop((int) floatValue);
                                View view2 = mjVar.H1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    mjVar.H1.setTranslationY(((1.0f - mjVar.getTopViewEnterProgress()) * mjVar.H1.getLayoutParams().height) + floatValue);
                                } else {
                                    wmVar2.K9();
                                    wmVar2.M9();
                                }
                                mjVar.f31232z1.invalidate();
                                mjVar.invalidate();
                                return;
                            default:
                                this.f47347b.F0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                wmVar.J9.addListener(new org.telegram.ui.Cells.w9(this, 6));
                wmVar.J9.setDuration(250L);
                wmVar.J9.setInterpolator(ni.l.V);
                if (!wmVar.I9) {
                    wmVar.J9.start();
                }
                wmVar.K9();
                wmVar.M9();
                wmVar.f51278d0 = 0;
            } else if (this.f47681u5 != wmVar.m1.getMeasuredHeight()) {
                wmVar.f51278d0 = 0;
            }
            if (this.f31170o3) {
                float scrollY = (this.f47683w5 - this.F0.getScrollY()) + (this.f47682v5 - this.F0.getMeasuredHeight());
                org.telegram.ui.Components.ve veVar = this.F0;
                veVar.setOffsetY(veVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.F0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final mj f47347b;

                    {
                        this.f47347b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                mj mjVar = this.f47347b;
                                wm wmVar2 = mjVar.f47684x5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                mjVar.setAnimatedTop((int) floatValue);
                                View view2 = mjVar.H1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    mjVar.H1.setTranslationY(((1.0f - mjVar.getTopViewEnterProgress()) * mjVar.H1.getLayoutParams().height) + floatValue);
                                } else {
                                    wmVar2.K9();
                                    wmVar2.M9();
                                }
                                mjVar.f31232z1.invalidate();
                                mjVar.invalidate();
                                return;
                            default:
                                this.f47347b.F0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = wmVar.K9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                wmVar.K9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ni.l.V);
                ofFloat2.start();
                this.f31170o3 = false;
            }
            this.f47681u5 = wmVar.m1.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = wmVar.K9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = wmVar.J9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        wmVar.f51278d0 = 0;
        this.f31170o3 = false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void n0(boolean z10) {
        super.n0(z10);
        wm wmVar = this.f47684x5;
        xe xeVar = wmVar.Ob;
        if (xeVar != null) {
            org.telegram.messenger.g0.h3(xeVar);
            wmVar.Ob = null;
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
    public final void setVisibility(int i3) {
        boolean z10;
        super.setVisibility(i3);
        wm wmVar = this.f47684x5;
        l6.n nVar = wmVar.f51333gd;
        boolean z11 = false;
        if (i3 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !wmVar.Wc) {
            z11 = true;
        }
        nVar.h(1, z10, z11);
    }

    @Override
    public final void z0(float f10) {
        this.f47684x5.E7();
    }
}
