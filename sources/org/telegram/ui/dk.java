package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class dk extends ChatActivityEnterView {
    public int f37552j5;
    public int f37553k5;
    public int f37554l5;
    public final tn f37555m5;

    public dk(tn tnVar, Activity activity, org.telegram.ui.Components.hv0 hv0Var, tn tnVar2, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, hv0Var, tnVar2, z10, c6Var);
        this.f37555m5 = tnVar;
    }

    @Override
    public final void A0(float f9) {
        this.f37555m5.q7();
    }

    @Override
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        tn tnVar = this.f37555m5;
        if (tnVar.U != null) {
            if (tnVar.f42973t0 != null) {
                if (tnVar.f43060za <= 0.0f) {
                    lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                    if (lVar != null) {
                        lVar2 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                        if (lVar2.s()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f26140i3 = true;
            this.f37553k5 = this.A0.getMeasuredHeight();
            this.f37554l5 = this.A0.getScrollY();
            tnVar.T0.invalidate();
            tnVar.X = tnVar.U.getBackgroundTop();
        }
    }

    @Override
    public final void H0() {
        if (this.f37555m5.Aa != null) {
            return;
        }
        super.H0();
    }

    @Override
    public final boolean N0() {
        if (!this.f37555m5.J5) {
            return false;
        }
        return true;
    }

    public final void T1() {
        org.telegram.ui.ActionBar.l lVar;
        tn tnVar = this.f37555m5;
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        if (!lVar.s() && !tnVar.A9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = tnVar.X;
            if (i10 != 0 && backgroundTop != i10 && this.f37552j5 == tnVar.T0.getMeasuredHeight()) {
                int i11 = (this.O1 + tnVar.X) - backgroundTop;
                setAnimatedTop(i11);
                this.f26194t1.invalidate();
                ValueAnimator valueAnimator = tnVar.f42884l9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    tnVar.f42884l9.cancel();
                }
                View view = this.B1;
                if (view != null && view.getVisibility() == 0) {
                    this.B1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.B1.getLayoutParams().height) + this.O1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                tnVar.f42884l9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final dk f37167b;

                    {
                        this.f37167b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                dk dkVar = this.f37167b;
                                tn tnVar2 = dkVar.f37555m5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                dkVar.setAnimatedTop((int) floatValue);
                                View view2 = dkVar.B1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    dkVar.B1.setTranslationY(((1.0f - dkVar.getTopViewEnterProgress()) * dkVar.B1.getLayoutParams().height) + floatValue);
                                } else {
                                    tnVar2.o9();
                                    tnVar2.r9();
                                }
                                dkVar.f26194t1.invalidate();
                                dkVar.invalidate();
                                return;
                            default:
                                this.f37167b.A0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                tnVar.f42884l9.addListener(new nh.q5(this, 26));
                tnVar.f42884l9.setDuration(250L);
                tnVar.f42884l9.setInterpolator(uh.m.V);
                if (!tnVar.k9) {
                    tnVar.f42884l9.start();
                }
                tnVar.o9();
                tnVar.r9();
                tnVar.X = 0;
            } else if (this.f37552j5 != tnVar.T0.getMeasuredHeight()) {
                tnVar.X = 0;
            }
            if (this.f26140i3) {
                float scrollY = (this.f37554l5 - this.A0.getScrollY()) + (this.f37553k5 - this.A0.getMeasuredHeight());
                org.telegram.ui.Components.jf jfVar = this.A0;
                jfVar.setOffsetY(jfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.A0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final dk f37167b;

                    {
                        this.f37167b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                dk dkVar = this.f37167b;
                                tn tnVar2 = dkVar.f37555m5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                dkVar.setAnimatedTop((int) floatValue);
                                View view2 = dkVar.B1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    dkVar.B1.setTranslationY(((1.0f - dkVar.getTopViewEnterProgress()) * dkVar.B1.getLayoutParams().height) + floatValue);
                                } else {
                                    tnVar2.o9();
                                    tnVar2.r9();
                                }
                                dkVar.f26194t1.invalidate();
                                dkVar.invalidate();
                                return;
                            default:
                                this.f37167b.A0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = tnVar.f42895m9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                tnVar.f42895m9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(uh.m.V);
                ofFloat2.start();
                this.f26140i3 = false;
            }
            this.f37552j5 = tnVar.T0.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = tnVar.f42895m9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = tnVar.f42884l9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        tnVar.X = 0;
        this.f26140i3 = false;
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
        tn tnVar = this.f37555m5;
        df dfVar = tnVar.f42862jb;
        if (dfVar != null) {
            AndroidUtilities.runOnUIThread(dfVar);
            tnVar.f42862jb = null;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        tn tnVar = this.f37555m5;
        f5.u uVar = tnVar.f43036xc;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !tnVar.f42911nc) {
            z11 = true;
        }
        uVar.j(1, z10, z11);
    }
}
