package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jk extends ChatActivityEnterView {
    public int f34804o5;
    public int p5;
    public int f34805q5;
    public final wn f34806r5;

    public jk(wn wnVar, Activity activity, org.telegram.ui.Components.aw0 aw0Var, wn wnVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, aw0Var, wnVar2, z10, d6Var);
        this.f34806r5 = wnVar;
    }

    @Override
    public final void A0(float f7) {
        this.f34806r5.q7();
    }

    @Override
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        wn wnVar = this.f34806r5;
        if (wnVar.Y != null) {
            if (wnVar.f39680x0 != null) {
                if (wnVar.Da <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                        if (kVar2.s()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f22020n3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.f34805q5 = this.E0.getScrollY();
            wnVar.X0.invalidate();
            wnVar.f39406b0 = wnVar.Y.getBackgroundTop();
        }
    }

    @Override
    public final void H0() {
        if (this.f34806r5.Ea != null) {
            return;
        }
        super.H0();
    }

    @Override
    public final boolean N0() {
        if (!this.f34806r5.N5) {
            return false;
        }
        return true;
    }

    public final void T1() {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.f34806r5;
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        if (!kVar.s() && !wnVar.A9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = wnVar.f39406b0;
            if (i10 != 0 && backgroundTop != i10 && this.f34804o5 == wnVar.X0.getMeasuredHeight()) {
                int i11 = (this.T1 + wnVar.f39406b0) - backgroundTop;
                setAnimatedTop(i11);
                this.f22078y1.invalidate();
                ValueAnimator valueAnimator = wnVar.f39585p9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    wnVar.f39585p9.cancel();
                }
                View view = this.G1;
                if (view != null && view.getVisibility() == 0) {
                    this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                wnVar.f39585p9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final jk f34525b;

                    {
                        this.f34525b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                jk jkVar = this.f34525b;
                                wn wnVar2 = jkVar.f34806r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                jkVar.setAnimatedTop((int) floatValue);
                                View view2 = jkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    jkVar.G1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    wnVar2.o9();
                                    wnVar2.r9();
                                }
                                jkVar.f22078y1.invalidate();
                                jkVar.invalidate();
                                return;
                            default:
                                this.f34525b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                wnVar.f39585p9.addListener(new t4(this, 18));
                wnVar.f39585p9.setDuration(250L);
                wnVar.f39585p9.setInterpolator(ji.n.V);
                if (!wnVar.o9) {
                    wnVar.f39585p9.start();
                }
                wnVar.o9();
                wnVar.r9();
                wnVar.f39406b0 = 0;
            } else if (this.f34804o5 != wnVar.X0.getMeasuredHeight()) {
                wnVar.f39406b0 = 0;
            }
            if (this.f22020n3) {
                float scrollY = (this.f34805q5 - this.E0.getScrollY()) + (this.p5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.qf qfVar = this.E0;
                qfVar.setOffsetY(qfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final jk f34525b;

                    {
                        this.f34525b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                jk jkVar = this.f34525b;
                                wn wnVar2 = jkVar.f34806r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                jkVar.setAnimatedTop((int) floatValue);
                                View view2 = jkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    jkVar.G1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    wnVar2.o9();
                                    wnVar2.r9();
                                }
                                jkVar.f22078y1.invalidate();
                                jkVar.invalidate();
                                return;
                            default:
                                this.f34525b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = wnVar.f39597q9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                wnVar.f39597q9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ji.n.V);
                ofFloat2.start();
                this.f22020n3 = false;
            }
            this.f34804o5 = wnVar.X0.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = wnVar.f39597q9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = wnVar.f39585p9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        wnVar.f39406b0 = 0;
        this.f22020n3 = false;
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
        wn wnVar = this.f34806r5;
        of ofVar = wnVar.f39551mb;
        if (ofVar != null) {
            AndroidUtilities.runOnUIThread(ofVar);
            wnVar.f39551mb = null;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        wn wnVar = this.f34806r5;
        j6.l lVar = wnVar.Ac;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !wnVar.f39600qc) {
            z11 = true;
        }
        lVar.j(1, z10, z11);
    }
}
