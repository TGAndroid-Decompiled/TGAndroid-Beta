package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jk extends ChatActivityEnterView {
    public int f37725o5;
    public int p5;
    public int f37726q5;
    public final yn f37727r5;

    public jk(yn ynVar, Activity activity, org.telegram.ui.Components.mw0 mw0Var, yn ynVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, mw0Var, ynVar2, z10, d6Var);
        this.f37727r5 = ynVar;
    }

    @Override
    public final void A0(float f7) {
        this.f37727r5.q7();
    }

    @Override
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        yn ynVar = this.f37727r5;
        if (ynVar.W != null) {
            if (ynVar.f43526v0 != null) {
                if (ynVar.Ba <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                        if (kVar2.s()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f23937n3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.f37726q5 = this.E0.getScrollY();
            ynVar.V0.invalidate();
            ynVar.Z = ynVar.W.getBackgroundTop();
        }
    }

    @Override
    public final void H0() {
        if (this.f37727r5.Ca != null) {
            return;
        }
        super.H0();
    }

    @Override
    public final boolean N0() {
        if (!this.f37727r5.L5) {
            return false;
        }
        return true;
    }

    public final void T1() {
        org.telegram.ui.ActionBar.k kVar;
        yn ynVar = this.f37727r5;
        kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        if (!kVar.s() && !ynVar.z9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = ynVar.Z;
            if (i10 != 0 && backgroundTop != i10 && this.f37725o5 == ynVar.V0.getMeasuredHeight()) {
                int i11 = (this.T1 + ynVar.Z) - backgroundTop;
                setAnimatedTop(i11);
                this.f23995y1.invalidate();
                ValueAnimator valueAnimator = ynVar.f43435n9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    ynVar.f43435n9.cancel();
                }
                View view = this.G1;
                if (view != null && view.getVisibility() == 0) {
                    this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                ynVar.f43435n9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final jk f37442b;

                    {
                        this.f37442b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                jk jkVar = this.f37442b;
                                yn ynVar2 = jkVar.f37727r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                jkVar.setAnimatedTop((int) floatValue);
                                View view2 = jkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    jkVar.G1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    ynVar2.o9();
                                    ynVar2.q9();
                                }
                                jkVar.f23995y1.invalidate();
                                jkVar.invalidate();
                                return;
                            default:
                                this.f37442b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ynVar.f43435n9.addListener(new u4(this, 18));
                ynVar.f43435n9.setDuration(250L);
                ynVar.f43435n9.setInterpolator(ji.n.V);
                if (!ynVar.f43421m9) {
                    ynVar.f43435n9.start();
                }
                ynVar.o9();
                ynVar.q9();
                ynVar.Z = 0;
            } else if (this.f37725o5 != ynVar.V0.getMeasuredHeight()) {
                ynVar.Z = 0;
            }
            if (this.f23937n3) {
                float scrollY = (this.f37726q5 - this.E0.getScrollY()) + (this.p5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.rf rfVar = this.E0;
                rfVar.setOffsetY(rfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final jk f37442b;

                    {
                        this.f37442b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                jk jkVar = this.f37442b;
                                yn ynVar2 = jkVar.f37727r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                jkVar.setAnimatedTop((int) floatValue);
                                View view2 = jkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    jkVar.G1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    ynVar2.o9();
                                    ynVar2.q9();
                                }
                                jkVar.f23995y1.invalidate();
                                jkVar.invalidate();
                                return;
                            default:
                                this.f37442b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = ynVar.o9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ynVar.o9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ji.n.V);
                ofFloat2.start();
                this.f23937n3 = false;
            }
            this.f37725o5 = ynVar.V0.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = ynVar.o9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = ynVar.f43435n9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ynVar.Z = 0;
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
        yn ynVar = this.f37727r5;
        yf yfVar = ynVar.f43400kb;
        if (yfVar != null) {
            AndroidUtilities.runOnUIThread(yfVar);
            ynVar.f43400kb = null;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        yn ynVar = this.f37727r5;
        j6.l lVar = ynVar.f43576yc;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !ynVar.f43448oc) {
            z11 = true;
        }
        lVar.j(1, z10, z11);
    }
}
