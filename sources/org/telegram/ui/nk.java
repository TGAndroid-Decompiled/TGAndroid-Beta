package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class nk extends ChatActivityEnterView {
    public int f36120n5;
    public int f36121o5;
    public int p5;
    public final bo f36122q5;

    public nk(bo boVar, Activity activity, org.telegram.ui.Components.qv0 qv0Var, bo boVar2, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, qv0Var, boVar2, z10, f6Var);
        this.f36122q5 = boVar;
    }

    @Override
    public final void A0(float f7) {
        this.f36122q5.q7();
    }

    @Override
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        bo boVar = this.f36122q5;
        if (boVar.Y != null) {
            if (boVar.f32502x0 != null) {
                if (boVar.Da <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
                        if (kVar2.s()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f21816m3 = true;
            this.f36121o5 = this.E0.getMeasuredHeight();
            this.p5 = this.E0.getScrollY();
            boVar.X0.invalidate();
            boVar.f32227b0 = boVar.Y.getBackgroundTop();
        }
    }

    @Override
    public final void H0() {
        if (this.f36122q5.Ea != null) {
            return;
        }
        super.H0();
    }

    @Override
    public final boolean N0() {
        if (!this.f36122q5.N5) {
            return false;
        }
        return true;
    }

    public final void T1() {
        org.telegram.ui.ActionBar.k kVar;
        bo boVar = this.f36122q5;
        kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
        if (!kVar.s() && !boVar.A9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = boVar.f32227b0;
            if (i10 != 0 && backgroundTop != i10 && this.f36120n5 == boVar.X0.getMeasuredHeight()) {
                int i11 = (this.S1 + boVar.f32227b0) - backgroundTop;
                setAnimatedTop(i11);
                this.f21874x1.invalidate();
                ValueAnimator valueAnimator = boVar.f32407p9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    boVar.f32407p9.cancel();
                }
                View view = this.F1;
                if (view != null && view.getVisibility() == 0) {
                    this.F1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.F1.getLayoutParams().height) + this.S1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                boVar.f32407p9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final nk f35831b;

                    {
                        this.f35831b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                nk nkVar = this.f35831b;
                                bo boVar2 = nkVar.f36122q5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                nkVar.setAnimatedTop((int) floatValue);
                                View view2 = nkVar.F1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    nkVar.F1.setTranslationY(((1.0f - nkVar.getTopViewEnterProgress()) * nkVar.F1.getLayoutParams().height) + floatValue);
                                } else {
                                    boVar2.o9();
                                    boVar2.r9();
                                }
                                nkVar.f21874x1.invalidate();
                                nkVar.invalidate();
                                return;
                            default:
                                this.f35831b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                boVar.f32407p9.addListener(new t4(this, 18));
                boVar.f32407p9.setDuration(250L);
                boVar.f32407p9.setInterpolator(ji.n.V);
                if (!boVar.o9) {
                    boVar.f32407p9.start();
                }
                boVar.o9();
                boVar.r9();
                boVar.f32227b0 = 0;
            } else if (this.f36120n5 != boVar.X0.getMeasuredHeight()) {
                boVar.f32227b0 = 0;
            }
            if (this.f21816m3) {
                float scrollY = (this.p5 - this.E0.getScrollY()) + (this.f36121o5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.of ofVar = this.E0;
                ofVar.setOffsetY(ofVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final nk f35831b;

                    {
                        this.f35831b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                nk nkVar = this.f35831b;
                                bo boVar2 = nkVar.f36122q5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                nkVar.setAnimatedTop((int) floatValue);
                                View view2 = nkVar.F1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    nkVar.F1.setTranslationY(((1.0f - nkVar.getTopViewEnterProgress()) * nkVar.F1.getLayoutParams().height) + floatValue);
                                } else {
                                    boVar2.o9();
                                    boVar2.r9();
                                }
                                nkVar.f21874x1.invalidate();
                                nkVar.invalidate();
                                return;
                            default:
                                this.f35831b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = boVar.f32419q9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                boVar.f32419q9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ji.n.V);
                ofFloat2.start();
                this.f21816m3 = false;
            }
            this.f36120n5 = boVar.X0.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = boVar.f32419q9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = boVar.f32407p9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        boVar.f32227b0 = 0;
        this.f21816m3 = false;
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
        bo boVar = this.f36122q5;
        sf sfVar = boVar.nb;
        if (sfVar != null) {
            AndroidUtilities.runOnUIThread(sfVar);
            boVar.nb = null;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        bo boVar = this.f36122q5;
        j6.l lVar = boVar.Bc;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !boVar.f32436rc) {
            z11 = true;
        }
        lVar.j(1, z10, z11);
    }
}
