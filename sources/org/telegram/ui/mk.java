package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class mk extends ChatActivityEnterView {
    public int f39716t5;
    public int f39717u5;
    public int f39718v5;
    public final un f39719w5;

    public mk(un unVar, Activity activity, org.telegram.ui.Components.uu0 uu0Var, un unVar2, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity, uu0Var, unVar2, z10, p6Var);
        this.f39719w5 = unVar;
    }

    @Override
    public final void A0(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        un unVar = this.f39719w5;
        if (unVar.Z != null) {
            if (unVar.f42492z0 != null) {
                if (unVar.Xa <= 0.0f) {
                    lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                    if (lVar != null) {
                        lVar2 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                        if (lVar2.u()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f23755n3 = true;
            this.f39717u5 = this.E0.getMeasuredHeight();
            this.f39718v5 = this.E0.getScrollY();
            unVar.l1.invalidate();
            unVar.f42206c0 = unVar.Z.getBackgroundTop();
        }
    }

    @Override
    public final void F0() {
        if (this.f39719w5.Ya != null) {
            return;
        }
        super.F0();
    }

    @Override
    public final boolean L0() {
        if (!this.f39719w5.f42225d6) {
            return false;
        }
        return true;
    }

    public final void S1() {
        org.telegram.ui.ActionBar.l lVar;
        un unVar = this.f39719w5;
        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        if (!lVar.u() && !unVar.M9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = unVar.f42206c0;
            if (i10 != 0 && backgroundTop != i10 && this.f39716t5 == unVar.l1.getMeasuredHeight()) {
                int i11 = (this.T1 + unVar.f42206c0) - backgroundTop;
                setAnimatedTop(i11);
                this.f23817y1.invalidate();
                ValueAnimator valueAnimator = unVar.I9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    unVar.I9.cancel();
                }
                View view = this.G1;
                if (view != null && view.getVisibility() == 0) {
                    this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                unVar.I9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final mk f39255b;

                    {
                        this.f39255b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                mk mkVar = this.f39255b;
                                un unVar2 = mkVar.f39719w5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                mkVar.setAnimatedTop((int) floatValue);
                                View view2 = mkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    mkVar.G1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    unVar2.A9();
                                    unVar2.C9();
                                }
                                mkVar.f23817y1.invalidate();
                                mkVar.invalidate();
                                return;
                            default:
                                this.f39255b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                unVar.I9.addListener(new s9(this, 16));
                unVar.I9.setDuration(250L);
                unVar.I9.setInterpolator(ci.o.V);
                if (!unVar.H9) {
                    unVar.I9.start();
                }
                unVar.A9();
                unVar.C9();
                unVar.f42206c0 = 0;
            } else if (this.f39716t5 != unVar.l1.getMeasuredHeight()) {
                unVar.f42206c0 = 0;
            }
            if (this.f23755n3) {
                float scrollY = (this.f39718v5 - this.E0.getScrollY()) + (this.f39717u5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.se seVar = this.E0;
                seVar.setOffsetY(seVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final mk f39255b;

                    {
                        this.f39255b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                mk mkVar = this.f39255b;
                                un unVar2 = mkVar.f39719w5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                mkVar.setAnimatedTop((int) floatValue);
                                View view2 = mkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    mkVar.G1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    unVar2.A9();
                                    unVar2.C9();
                                }
                                mkVar.f23817y1.invalidate();
                                mkVar.invalidate();
                                return;
                            default:
                                this.f39255b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = unVar.J9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                unVar.J9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ci.o.V);
                ofFloat2.start();
                this.f23755n3 = false;
            }
            this.f39716t5 = unVar.l1.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = unVar.J9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = unVar.I9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        unVar.f42206c0 = 0;
        this.f23755n3 = false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void m0(boolean z10) {
        super.m0(z10);
        un unVar = this.f39719w5;
        mf mfVar = unVar.Ib;
        if (mfVar != null) {
            org.telegram.messenger.i0.g3(mfVar);
            unVar.Ib = null;
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
        un unVar = this.f39719w5;
        j6.m mVar = unVar.Xc;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !unVar.Nc) {
            z11 = true;
        }
        mVar.h(1, z10, z11);
    }

    @Override
    public final void y0(float f7) {
        this.f39719w5.y7();
    }
}
