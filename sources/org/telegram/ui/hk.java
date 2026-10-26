package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class hk extends ChatActivityEnterView {
    public int f40028s5;
    public int f40029t5;
    public int f40030u5;
    public final un f40031v5;

    public hk(un unVar, Activity activity, org.telegram.ui.Components.vw0 vw0Var, un unVar2, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, vw0Var, unVar2, z10, u6Var);
        this.f40031v5 = unVar;
    }

    @Override
    public final void A0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        un unVar = this.f40031v5;
        if (unVar.Y != null) {
            if (unVar.f44471x0 != null) {
                if (unVar.Qa <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                        if (kVar2.q()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f25926n3 = true;
            this.f40029t5 = this.E0.getMeasuredHeight();
            this.f40030u5 = this.E0.getScrollY();
            unVar.f44295j1.invalidate();
            unVar.f44193b0 = unVar.Y.getBackgroundTop();
        }
    }

    @Override
    public final void F0() {
        if (this.f40031v5.Ra != null) {
            return;
        }
        super.F0();
    }

    @Override
    public final boolean L0() {
        if (!this.f40031v5.Z5) {
            return false;
        }
        return true;
    }

    public final void Q1() {
        org.telegram.ui.ActionBar.k kVar;
        un unVar = this.f40031v5;
        kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
        if (!kVar.q() && !unVar.J9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = unVar.f44193b0;
            if (i10 != 0 && backgroundTop != i10 && this.f40028s5 == unVar.f44295j1.getMeasuredHeight()) {
                int i11 = (this.T1 + unVar.f44193b0) - backgroundTop;
                setAnimatedTop(i11);
                this.f25987y1.invalidate();
                ValueAnimator valueAnimator = unVar.B9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    unVar.B9.cancel();
                }
                View view = this.G1;
                if (view != null && view.getVisibility() == 0) {
                    this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                unVar.B9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final hk f39713b;

                    {
                        this.f39713b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                hk hkVar = this.f39713b;
                                un unVar2 = hkVar.f40031v5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                hkVar.setAnimatedTop((int) floatValue);
                                View view2 = hkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    hkVar.G1.setTranslationY(((1.0f - hkVar.getTopViewEnterProgress()) * hkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    unVar2.x9();
                                    unVar2.z9();
                                }
                                hkVar.f25987y1.invalidate();
                                hkVar.invalidate();
                                return;
                            default:
                                this.f39713b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                unVar.B9.addListener(new kg.e(this, 26));
                unVar.B9.setDuration(250L);
                unVar.B9.setInterpolator(mi.m.V);
                if (!unVar.A9) {
                    unVar.B9.start();
                }
                unVar.x9();
                unVar.z9();
                unVar.f44193b0 = 0;
            } else if (this.f40028s5 != unVar.f44295j1.getMeasuredHeight()) {
                unVar.f44193b0 = 0;
            }
            if (this.f25926n3) {
                float scrollY = (this.f40030u5 - this.E0.getScrollY()) + (this.f40029t5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.pf pfVar = this.E0;
                pfVar.setOffsetY(pfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final hk f39713b;

                    {
                        this.f39713b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                hk hkVar = this.f39713b;
                                un unVar2 = hkVar.f40031v5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                hkVar.setAnimatedTop((int) floatValue);
                                View view2 = hkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    hkVar.G1.setTranslationY(((1.0f - hkVar.getTopViewEnterProgress()) * hkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    unVar2.x9();
                                    unVar2.z9();
                                }
                                hkVar.f25987y1.invalidate();
                                hkVar.invalidate();
                                return;
                            default:
                                this.f39713b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = unVar.C9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                unVar.C9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(mi.m.V);
                ofFloat2.start();
                this.f25926n3 = false;
            }
            this.f40028s5 = unVar.f44295j1.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = unVar.C9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = unVar.B9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        unVar.f44193b0 = 0;
        this.f25926n3 = false;
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
        un unVar = this.f40031v5;
        kf kfVar = unVar.Jb;
        if (kfVar != null) {
            AndroidUtilities.runOnUIThread(kfVar);
            unVar.Jb = null;
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
        un unVar = this.f40031v5;
        k6.m mVar = unVar.Yc;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !unVar.Oc) {
            z11 = true;
        }
        mVar.h(1, z10, z11);
    }

    @Override
    public final void y0(float f7) {
        this.f40031v5.x7();
    }
}
