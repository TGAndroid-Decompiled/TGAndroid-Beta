package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class hk extends ChatActivityEnterView {
    public int f37569o5;
    public int p5;
    public int f37570q5;
    public final sn f37571r5;

    public hk(sn snVar, Activity activity, org.telegram.ui.Components.jw0 jw0Var, sn snVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, jw0Var, snVar2, z10, d6Var);
        this.f37571r5 = snVar;
    }

    @Override
    public final void A0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        sn snVar = this.f37571r5;
        if (snVar.Y != null) {
            if (snVar.f41433x0 != null) {
                if (snVar.Ea <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                        if (kVar2.s()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f23987n3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.f37570q5 = this.E0.getScrollY();
            snVar.X0.invalidate();
            snVar.f41157b0 = snVar.Y.getBackgroundTop();
        }
    }

    @Override
    public final void F0() {
        if (this.f37571r5.Fa != null) {
            return;
        }
        super.F0();
    }

    @Override
    public final boolean L0() {
        if (!this.f37571r5.N5) {
            return false;
        }
        return true;
    }

    public final void S1() {
        org.telegram.ui.ActionBar.k kVar;
        sn snVar = this.f37571r5;
        kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
        if (!kVar.s() && !snVar.F9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = snVar.f41157b0;
            if (i10 != 0 && backgroundTop != i10 && this.f37569o5 == snVar.X0.getMeasuredHeight()) {
                int i11 = (this.T1 + snVar.f41157b0) - backgroundTop;
                setAnimatedTop(i11);
                this.f24045y1.invalidate();
                ValueAnimator valueAnimator = snVar.p9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    snVar.p9.cancel();
                }
                View view = this.G1;
                if (view != null && view.getVisibility() == 0) {
                    this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                snVar.p9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final hk f37265b;

                    {
                        this.f37265b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                hk hkVar = this.f37265b;
                                sn snVar2 = hkVar.f37571r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                hkVar.setAnimatedTop((int) floatValue);
                                View view2 = hkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    hkVar.G1.setTranslationY(((1.0f - hkVar.getTopViewEnterProgress()) * hkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    snVar2.t9();
                                    snVar2.w9();
                                }
                                hkVar.f24045y1.invalidate();
                                hkVar.invalidate();
                                return;
                            default:
                                this.f37265b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                snVar.p9.addListener(new m.a(this, 24));
                snVar.p9.setDuration(250L);
                snVar.p9.setInterpolator(li.m.V);
                if (!snVar.f41328o9) {
                    snVar.p9.start();
                }
                snVar.t9();
                snVar.w9();
                snVar.f41157b0 = 0;
            } else if (this.f37569o5 != snVar.X0.getMeasuredHeight()) {
                snVar.f41157b0 = 0;
            }
            if (this.f23987n3) {
                float scrollY = (this.f37570q5 - this.E0.getScrollY()) + (this.p5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.pf pfVar = this.E0;
                pfVar.setOffsetY(pfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final hk f37265b;

                    {
                        this.f37265b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                hk hkVar = this.f37265b;
                                sn snVar2 = hkVar.f37571r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                hkVar.setAnimatedTop((int) floatValue);
                                View view2 = hkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    hkVar.G1.setTranslationY(((1.0f - hkVar.getTopViewEnterProgress()) * hkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    snVar2.t9();
                                    snVar2.w9();
                                }
                                hkVar.f24045y1.invalidate();
                                hkVar.invalidate();
                                return;
                            default:
                                this.f37265b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = snVar.f41349q9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                snVar.f41349q9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(li.m.V);
                ofFloat2.start();
                this.f23987n3 = false;
            }
            this.f37569o5 = snVar.X0.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = snVar.f41349q9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = snVar.p9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        snVar.f41157b0 = 0;
        this.f23987n3 = false;
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
        sn snVar = this.f37571r5;
        mf mfVar = snVar.f41317nb;
        if (mfVar != null) {
            AndroidUtilities.runOnUIThread(mfVar);
            snVar.f41317nb = null;
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
        sn snVar = this.f37571r5;
        j6.l lVar = snVar.Bc;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !snVar.f41366rc) {
            z11 = true;
        }
        lVar.i(1, z10, z11);
    }

    @Override
    public final void y0(float f7) {
        this.f37571r5.t7();
    }
}
