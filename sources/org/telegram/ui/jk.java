package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jk extends ChatActivityEnterView {
    public int f40553s5;
    public int f40554t5;
    public int f40555u5;
    public final wn f40556v5;

    public jk(wn wnVar, Activity activity, org.telegram.ui.Components.ww0 ww0Var, wn wnVar2, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, ww0Var, wnVar2, z10, u6Var);
        this.f40556v5 = wnVar;
    }

    @Override
    public final void E0() {
        if (this.f40556v5.Va != null) {
            return;
        }
        super.E0();
    }

    @Override
    public final boolean K0() {
        if (!this.f40556v5.f45093d6) {
            return false;
        }
        return true;
    }

    public final void Q1() {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.f40556v5;
        kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        if (!kVar.q() && !wnVar.M9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = wnVar.f45058b0;
            if (i10 != 0 && backgroundTop != i10 && this.f40553s5 == wnVar.f45163j1.getMeasuredHeight()) {
                int i11 = (this.T1 + wnVar.f45058b0) - backgroundTop;
                setAnimatedTop(i11);
                this.f25989y1.invalidate();
                ValueAnimator valueAnimator = wnVar.F9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    wnVar.F9.cancel();
                }
                View view = this.G1;
                if (view != null && view.getVisibility() == 0) {
                    this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                wnVar.F9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final jk f40203b;

                    {
                        this.f40203b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                jk jkVar = this.f40203b;
                                wn wnVar2 = jkVar.f40556v5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                jkVar.setAnimatedTop((int) floatValue);
                                View view2 = jkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    jkVar.G1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    wnVar2.A9();
                                    wnVar2.C9();
                                }
                                jkVar.f25989y1.invalidate();
                                jkVar.invalidate();
                                return;
                            default:
                                this.f40203b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                wnVar.F9.addListener(new kg.e(this, 26));
                wnVar.F9.setDuration(250L);
                wnVar.F9.setInterpolator(mi.m.V);
                if (!wnVar.E9) {
                    wnVar.F9.start();
                }
                wnVar.A9();
                wnVar.C9();
                wnVar.f45058b0 = 0;
            } else if (this.f40553s5 != wnVar.f45163j1.getMeasuredHeight()) {
                wnVar.f45058b0 = 0;
            }
            if (this.f25928n3) {
                float scrollY = (this.f40555u5 - this.E0.getScrollY()) + (this.f40554t5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.pf pfVar = this.E0;
                pfVar.setOffsetY(pfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final jk f40203b;

                    {
                        this.f40203b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                jk jkVar = this.f40203b;
                                wn wnVar2 = jkVar.f40556v5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                jkVar.setAnimatedTop((int) floatValue);
                                View view2 = jkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    jkVar.G1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    wnVar2.A9();
                                    wnVar2.C9();
                                }
                                jkVar.f25989y1.invalidate();
                                jkVar.invalidate();
                                return;
                            default:
                                this.f40203b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = wnVar.G9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                wnVar.G9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(mi.m.V);
                ofFloat2.start();
                this.f25928n3 = false;
            }
            this.f40553s5 = wnVar.f45163j1.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = wnVar.G9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = wnVar.F9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        wnVar.f45058b0 = 0;
        this.f25928n3 = false;
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
        wn wnVar = this.f40556v5;
        jf jfVar = wnVar.Nb;
        if (jfVar != null) {
            AndroidUtilities.runOnUIThread(jfVar);
            wnVar.Nb = null;
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
        wn wnVar = this.f40556v5;
        k6.m mVar = wnVar.f45086cd;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !wnVar.Sc) {
            z11 = true;
        }
        mVar.h(1, z10, z11);
    }

    @Override
    public final void x0(float f7) {
        this.f40556v5.z7();
    }

    @Override
    public final void z0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        wn wnVar = this.f40556v5;
        if (wnVar.Y != null) {
            if (wnVar.f45339x0 != null) {
                if (wnVar.Ua <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                        if (kVar2.q()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f25928n3 = true;
            this.f40554t5 = this.E0.getMeasuredHeight();
            this.f40555u5 = this.E0.getScrollY();
            wnVar.f45163j1.invalidate();
            wnVar.f45058b0 = wnVar.Y.getBackgroundTop();
        }
    }
}
