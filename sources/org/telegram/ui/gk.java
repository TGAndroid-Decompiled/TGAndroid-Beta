package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class gk extends ChatActivityEnterView {
    public int f37622s5;
    public int f37623t5;
    public int f37624u5;
    public final sn f37625v5;

    public gk(sn snVar, Activity activity, org.telegram.ui.Components.ow0 ow0Var, sn snVar2, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, ow0Var, snVar2, z10, g6Var);
        this.f37625v5 = snVar;
    }

    @Override
    public final void A0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        sn snVar = this.f37625v5;
        if (snVar.Y != null) {
            if (snVar.f41737x0 != null) {
                if (snVar.Qa <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                        if (kVar2.s()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f24133n3 = true;
            this.f37623t5 = this.E0.getMeasuredHeight();
            this.f37624u5 = this.E0.getScrollY();
            snVar.f41561j1.invalidate();
            snVar.f41461b0 = snVar.Y.getBackgroundTop();
        }
    }

    @Override
    public final void F0() {
        if (this.f37625v5.Ra != null) {
            return;
        }
        super.F0();
    }

    @Override
    public final boolean L0() {
        if (!this.f37625v5.Z5) {
            return false;
        }
        return true;
    }

    public final void Q1() {
        org.telegram.ui.ActionBar.k kVar;
        sn snVar = this.f37625v5;
        kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
        if (!kVar.s() && !snVar.F9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = snVar.f41461b0;
            if (i10 != 0 && backgroundTop != i10 && this.f37622s5 == snVar.f41561j1.getMeasuredHeight()) {
                int i11 = (this.T1 + snVar.f41461b0) - backgroundTop;
                setAnimatedTop(i11);
                this.f24194y1.invalidate();
                ValueAnimator valueAnimator = snVar.B9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    snVar.B9.cancel();
                }
                View view = this.G1;
                if (view != null && view.getVisibility() == 0) {
                    this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                snVar.B9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final gk f37365b;

                    {
                        this.f37365b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                gk gkVar = this.f37365b;
                                sn snVar2 = gkVar.f37625v5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                gkVar.setAnimatedTop((int) floatValue);
                                View view2 = gkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    gkVar.G1.setTranslationY(((1.0f - gkVar.getTopViewEnterProgress()) * gkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    snVar2.t9();
                                    snVar2.w9();
                                }
                                gkVar.f24194y1.invalidate();
                                gkVar.invalidate();
                                return;
                            default:
                                this.f37365b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                snVar.B9.addListener(new m.a(this, 24));
                snVar.B9.setDuration(250L);
                snVar.B9.setInterpolator(li.m.V);
                if (!snVar.A9) {
                    snVar.B9.start();
                }
                snVar.t9();
                snVar.w9();
                snVar.f41461b0 = 0;
            } else if (this.f37622s5 != snVar.f41561j1.getMeasuredHeight()) {
                snVar.f41461b0 = 0;
            }
            if (this.f24133n3) {
                float scrollY = (this.f37624u5 - this.E0.getScrollY()) + (this.f37623t5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.pf pfVar = this.E0;
                pfVar.setOffsetY(pfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final gk f37365b;

                    {
                        this.f37365b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                gk gkVar = this.f37365b;
                                sn snVar2 = gkVar.f37625v5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                gkVar.setAnimatedTop((int) floatValue);
                                View view2 = gkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    gkVar.G1.setTranslationY(((1.0f - gkVar.getTopViewEnterProgress()) * gkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    snVar2.t9();
                                    snVar2.w9();
                                }
                                gkVar.f24194y1.invalidate();
                                gkVar.invalidate();
                                return;
                            default:
                                this.f37365b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = snVar.C9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                snVar.C9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(li.m.V);
                ofFloat2.start();
                this.f24133n3 = false;
            }
            this.f37622s5 = snVar.f41561j1.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = snVar.C9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = snVar.B9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        snVar.f41461b0 = 0;
        this.f24133n3 = false;
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
        sn snVar = this.f37625v5;
        kf kfVar = snVar.Ab;
        if (kfVar != null) {
            AndroidUtilities.runOnUIThread(kfVar);
            snVar.Ab = null;
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
        sn snVar = this.f37625v5;
        j6.l lVar = snVar.Pc;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !snVar.Fc) {
            z11 = true;
        }
        lVar.h(1, z10, z11);
    }

    @Override
    public final void y0(float f7) {
        this.f37625v5.t7();
    }
}
