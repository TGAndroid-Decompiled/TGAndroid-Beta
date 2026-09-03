package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class lk extends ChatActivityEnterView {
    public int f35791k5;
    public int f35792l5;
    public int f35793m5;
    public final zn f35794n5;

    public lk(zn znVar, Activity activity, org.telegram.ui.Components.qv0 qv0Var, zn znVar2, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, qv0Var, znVar2, z4, f6Var);
        this.f35794n5 = znVar;
    }

    @Override
    public final void A0(float f10) {
        this.f35794n5.q7();
    }

    @Override
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        zn znVar = this.f35794n5;
        if (znVar.V != null) {
            if (znVar.f40759u0 != null) {
                if (znVar.Aa <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                        if (kVar2.s()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f22762j3 = true;
            this.f35792l5 = this.B0.getMeasuredHeight();
            this.f35793m5 = this.B0.getScrollY();
            znVar.U0.invalidate();
            znVar.Y = znVar.V.getBackgroundTop();
        }
    }

    @Override
    public final void H0() {
        if (this.f35794n5.Ba != null) {
            return;
        }
        super.H0();
    }

    @Override
    public final boolean N0() {
        if (!this.f35794n5.K5) {
            return false;
        }
        return true;
    }

    public final void T1() {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.f35794n5;
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        if (!kVar.s() && !znVar.A9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = znVar.Y;
            if (i10 != 0 && backgroundTop != i10 && this.f35791k5 == znVar.U0.getMeasuredHeight()) {
                int i11 = (this.P1 + znVar.Y) - backgroundTop;
                setAnimatedTop(i11);
                this.f22816u1.invalidate();
                ValueAnimator valueAnimator = znVar.m9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    znVar.m9.cancel();
                }
                View view = this.C1;
                if (view != null && view.getVisibility() == 0) {
                    this.C1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.C1.getLayoutParams().height) + this.P1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                znVar.m9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final lk f35552b;

                    {
                        this.f35552b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                lk lkVar = this.f35552b;
                                zn znVar2 = lkVar.f35794n5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                lkVar.setAnimatedTop((int) floatValue);
                                View view2 = lkVar.C1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    lkVar.C1.setTranslationY(((1.0f - lkVar.getTopViewEnterProgress()) * lkVar.C1.getLayoutParams().height) + floatValue);
                                } else {
                                    znVar2.o9();
                                    znVar2.r9();
                                }
                                lkVar.f22816u1.invalidate();
                                lkVar.invalidate();
                                return;
                            default:
                                this.f35552b.B0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                znVar.m9.addListener(new u5(this, 17));
                znVar.m9.setDuration(250L);
                znVar.m9.setInterpolator(wh.n.V);
                if (!znVar.f40658l9) {
                    znVar.m9.start();
                }
                znVar.o9();
                znVar.r9();
                znVar.Y = 0;
            } else if (this.f35791k5 != znVar.U0.getMeasuredHeight()) {
                znVar.Y = 0;
            }
            if (this.f22762j3) {
                float scrollY = (this.f35793m5 - this.B0.getScrollY()) + (this.f35792l5 - this.B0.getMeasuredHeight());
                org.telegram.ui.Components.ff ffVar = this.B0;
                ffVar.setOffsetY(ffVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.B0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final lk f35552b;

                    {
                        this.f35552b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                lk lkVar = this.f35552b;
                                zn znVar2 = lkVar.f35794n5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                lkVar.setAnimatedTop((int) floatValue);
                                View view2 = lkVar.C1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    lkVar.C1.setTranslationY(((1.0f - lkVar.getTopViewEnterProgress()) * lkVar.C1.getLayoutParams().height) + floatValue);
                                } else {
                                    znVar2.o9();
                                    znVar2.r9();
                                }
                                lkVar.f22816u1.invalidate();
                                lkVar.invalidate();
                                return;
                            default:
                                this.f35552b.B0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = znVar.f40683n9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                znVar.f40683n9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(wh.n.V);
                ofFloat2.start();
                this.f22762j3 = false;
            }
            this.f35791k5 = znVar.U0.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = znVar.f40683n9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = znVar.m9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        znVar.Y = 0;
        this.f22762j3 = false;
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
        zn znVar = this.f35794n5;
        nf nfVar = znVar.f40648kb;
        if (nfVar != null) {
            AndroidUtilities.runOnUIThread(nfVar);
            znVar.f40648kb = null;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z4;
        super.setVisibility(i10);
        zn znVar = this.f35794n5;
        h5.u uVar = znVar.f40826yc;
        boolean z10 = false;
        if (i10 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (getMeasuredWidth() > 0 && !znVar.f40697oc) {
            z10 = true;
        }
        uVar.h(1, z4, z10);
    }
}
