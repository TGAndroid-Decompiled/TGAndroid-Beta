package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class fk extends ChatActivityEnterView {
    public int f37023o5;
    public int p5;
    public int f37024q5;
    public final qn f37025r5;

    public fk(qn qnVar, Activity activity, org.telegram.ui.Components.lw0 lw0Var, qn qnVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, lw0Var, qnVar2, z10, d6Var);
        this.f37025r5 = qnVar;
    }

    @Override
    public final void A0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        qn qnVar = this.f37025r5;
        if (qnVar.Y != null) {
            if (qnVar.f40901x0 != null) {
                if (qnVar.Ea <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                        if (kVar2.t()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f23991n3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.f37024q5 = this.E0.getScrollY();
            qnVar.X0.invalidate();
            qnVar.f40625b0 = qnVar.Y.getBackgroundTop();
        }
    }

    @Override
    public final void F0() {
        if (this.f37025r5.Fa != null) {
            return;
        }
        super.F0();
    }

    @Override
    public final boolean L0() {
        if (!this.f37025r5.N5) {
            return false;
        }
        return true;
    }

    public final void Q1() {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.f37025r5;
        kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        if (!kVar.t() && !qnVar.F9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = qnVar.f40625b0;
            if (i10 != 0 && backgroundTop != i10 && this.f37023o5 == qnVar.X0.getMeasuredHeight()) {
                int i11 = (this.T1 + qnVar.f40625b0) - backgroundTop;
                setAnimatedTop(i11);
                this.f24049y1.invalidate();
                ValueAnimator valueAnimator = qnVar.p9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    qnVar.p9.cancel();
                }
                View view = this.G1;
                if (view != null && view.getVisibility() == 0) {
                    this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                qnVar.p9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final fk f36681b;

                    {
                        this.f36681b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                fk fkVar = this.f36681b;
                                qn qnVar2 = fkVar.f37025r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                fkVar.setAnimatedTop((int) floatValue);
                                View view2 = fkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    fkVar.G1.setTranslationY(((1.0f - fkVar.getTopViewEnterProgress()) * fkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    qnVar2.t9();
                                    qnVar2.w9();
                                }
                                fkVar.f24049y1.invalidate();
                                fkVar.invalidate();
                                return;
                            default:
                                this.f36681b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                qnVar.p9.addListener(new m.a(this, 24));
                qnVar.p9.setDuration(250L);
                qnVar.p9.setInterpolator(li.m.V);
                if (!qnVar.f40796o9) {
                    qnVar.p9.start();
                }
                qnVar.t9();
                qnVar.w9();
                qnVar.f40625b0 = 0;
            } else if (this.f37023o5 != qnVar.X0.getMeasuredHeight()) {
                qnVar.f40625b0 = 0;
            }
            if (this.f23991n3) {
                float scrollY = (this.f37024q5 - this.E0.getScrollY()) + (this.p5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.pf pfVar = this.E0;
                pfVar.setOffsetY(pfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final fk f36681b;

                    {
                        this.f36681b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                fk fkVar = this.f36681b;
                                qn qnVar2 = fkVar.f37025r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                fkVar.setAnimatedTop((int) floatValue);
                                View view2 = fkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    fkVar.G1.setTranslationY(((1.0f - fkVar.getTopViewEnterProgress()) * fkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    qnVar2.t9();
                                    qnVar2.w9();
                                }
                                fkVar.f24049y1.invalidate();
                                fkVar.invalidate();
                                return;
                            default:
                                this.f36681b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = qnVar.f40817q9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                qnVar.f40817q9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(li.m.V);
                ofFloat2.start();
                this.f23991n3 = false;
            }
            this.f37023o5 = qnVar.X0.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = qnVar.f40817q9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = qnVar.p9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        qnVar.f40625b0 = 0;
        this.f23991n3 = false;
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
        qn qnVar = this.f37025r5;
        kf kfVar = qnVar.f40785nb;
        if (kfVar != null) {
            AndroidUtilities.runOnUIThread(kfVar);
            qnVar.f40785nb = null;
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
        qn qnVar = this.f37025r5;
        j6.l lVar = qnVar.Cc;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !qnVar.f40848sc) {
            z11 = true;
        }
        lVar.h(1, z10, z11);
    }

    @Override
    public final void y0(float f7) {
        this.f37025r5.t7();
    }
}
