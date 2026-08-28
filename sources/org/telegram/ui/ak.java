package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ak extends ChatActivityEnterView {
    public int f36510j5;
    public int f36511k5;
    public int f36512l5;
    public final qn f36513m5;

    public ak(qn qnVar, Activity activity, org.telegram.ui.Components.xu0 xu0Var, qn qnVar2, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity, xu0Var, qnVar2, z10, b6Var);
        this.f36513m5 = qnVar;
    }

    @Override
    public final void B0(int i9, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        qn qnVar = this.f36513m5;
        if (qnVar.U != null) {
            if (qnVar.f42077t0 != null) {
                if (qnVar.f42163za <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                        if (kVar2.s()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f26129i3 = true;
            this.f36511k5 = this.A0.getMeasuredHeight();
            this.f36512l5 = this.A0.getScrollY();
            qnVar.T0.invalidate();
            qnVar.X = qnVar.U.getBackgroundTop();
        }
    }

    @Override
    public final void G0() {
        if (this.f36513m5.Aa != null) {
            return;
        }
        super.G0();
    }

    @Override
    public final boolean N0() {
        if (!this.f36513m5.J5) {
            return false;
        }
        return true;
    }

    public final void T1() {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.f36513m5;
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        if (!kVar.s() && !qnVar.A9()) {
            int backgroundTop = getBackgroundTop();
            int i9 = qnVar.X;
            if (i9 != 0 && backgroundTop != i9 && this.f36510j5 == qnVar.T0.getMeasuredHeight()) {
                int i10 = (this.O1 + qnVar.X) - backgroundTop;
                setAnimatedTop(i10);
                this.f26183t1.invalidate();
                ValueAnimator valueAnimator = qnVar.f41986l9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    qnVar.f41986l9.cancel();
                }
                View view = this.B1;
                if (view != null && view.getVisibility() == 0) {
                    this.B1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.B1.getLayoutParams().height) + this.O1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i10, 0.0f);
                qnVar.f41986l9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final ak f45167b;

                    {
                        this.f45167b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                ak akVar = this.f45167b;
                                qn qnVar2 = akVar.f36513m5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                akVar.setAnimatedTop((int) floatValue);
                                View view2 = akVar.B1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    akVar.B1.setTranslationY(((1.0f - akVar.getTopViewEnterProgress()) * akVar.B1.getLayoutParams().height) + floatValue);
                                } else {
                                    qnVar2.o9();
                                    qnVar2.r9();
                                }
                                akVar.f26183t1.invalidate();
                                akVar.invalidate();
                                return;
                            default:
                                this.f45167b.A0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                qnVar.f41986l9.addListener(new mh.x(this, 24));
                qnVar.f41986l9.setDuration(250L);
                qnVar.f41986l9.setInterpolator(rh.m.V);
                if (!qnVar.f41975k9) {
                    qnVar.f41986l9.start();
                }
                qnVar.o9();
                qnVar.r9();
                qnVar.X = 0;
            } else if (this.f36510j5 != qnVar.T0.getMeasuredHeight()) {
                qnVar.X = 0;
            }
            if (this.f26129i3) {
                float scrollY = (this.f36512l5 - this.A0.getScrollY()) + (this.f36511k5 - this.A0.getMeasuredHeight());
                org.telegram.ui.Components.ff ffVar = this.A0;
                ffVar.setOffsetY(ffVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.A0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final ak f45167b;

                    {
                        this.f45167b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                ak akVar = this.f45167b;
                                qn qnVar2 = akVar.f36513m5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                akVar.setAnimatedTop((int) floatValue);
                                View view2 = akVar.B1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    akVar.B1.setTranslationY(((1.0f - akVar.getTopViewEnterProgress()) * akVar.B1.getLayoutParams().height) + floatValue);
                                } else {
                                    qnVar2.o9();
                                    qnVar2.r9();
                                }
                                akVar.f26183t1.invalidate();
                                akVar.invalidate();
                                return;
                            default:
                                this.f45167b.A0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = qnVar.f41998m9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                qnVar.f41998m9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(rh.m.V);
                ofFloat2.start();
                this.f26129i3 = false;
            }
            this.f36510j5 = qnVar.T0.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = qnVar.f41998m9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = qnVar.f41986l9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        qnVar.X = 0;
        this.f26129i3 = false;
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
    public final void p0(boolean z10) {
        super.p0(z10);
        qn qnVar = this.f36513m5;
        gf gfVar = qnVar.f41965jb;
        if (gfVar != null) {
            AndroidUtilities.runOnUIThread(gfVar);
            qnVar.f41965jb = null;
        }
    }

    @Override
    public final void setVisibility(int i9) {
        boolean z10;
        super.setVisibility(i9);
        qn qnVar = this.f36513m5;
        d5.w wVar = qnVar.f42139xc;
        boolean z11 = false;
        if (i9 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !qnVar.f42014nc) {
            z11 = true;
        }
        wVar.j(1, z10, z11);
    }

    @Override
    public final void z0(float f10) {
        this.f36513m5.q7();
    }
}
