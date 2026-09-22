package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class mk extends ChatActivityEnterView {
    public int f35783o5;
    public int p5;
    public int f35784q5;
    public final zn f35785r5;

    public mk(zn znVar, Activity activity, org.telegram.ui.Components.cw0 cw0Var, zn znVar2, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, cw0Var, znVar2, z10, f6Var);
        this.f35785r5 = znVar;
    }

    @Override
    public final void A0(float f7) {
        this.f35785r5.q7();
    }

    @Override
    public final void C0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        zn znVar = this.f35785r5;
        if (znVar.Y != null) {
            if (znVar.f40551x0 != null) {
                if (znVar.Da <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                        if (kVar2.s()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f22049n3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.f35784q5 = this.E0.getScrollY();
            znVar.X0.invalidate();
            znVar.f40276b0 = znVar.Y.getBackgroundTop();
        }
    }

    @Override
    public final void H0() {
        if (this.f35785r5.Ea != null) {
            return;
        }
        super.H0();
    }

    @Override
    public final boolean N0() {
        if (!this.f35785r5.N5) {
            return false;
        }
        return true;
    }

    public final void T1() {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.f35785r5;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (!kVar.s() && !znVar.A9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = znVar.f40276b0;
            if (i10 != 0 && backgroundTop != i10 && this.f35783o5 == znVar.X0.getMeasuredHeight()) {
                int i11 = (this.T1 + znVar.f40276b0) - backgroundTop;
                setAnimatedTop(i11);
                this.f22107y1.invalidate();
                ValueAnimator valueAnimator = znVar.f40456p9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    znVar.f40456p9.cancel();
                }
                View view = this.G1;
                if (view != null && view.getVisibility() == 0) {
                    this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                znVar.f40456p9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final mk f35489b;

                    {
                        this.f35489b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                mk mkVar = this.f35489b;
                                zn znVar2 = mkVar.f35785r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                mkVar.setAnimatedTop((int) floatValue);
                                View view2 = mkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    mkVar.G1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    znVar2.o9();
                                    znVar2.r9();
                                }
                                mkVar.f22107y1.invalidate();
                                mkVar.invalidate();
                                return;
                            default:
                                this.f35489b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                znVar.f40456p9.addListener(new t4(this, 18));
                znVar.f40456p9.setDuration(250L);
                znVar.f40456p9.setInterpolator(ji.n.V);
                if (!znVar.o9) {
                    znVar.f40456p9.start();
                }
                znVar.o9();
                znVar.r9();
                znVar.f40276b0 = 0;
            } else if (this.f35783o5 != znVar.X0.getMeasuredHeight()) {
                znVar.f40276b0 = 0;
            }
            if (this.f22049n3) {
                float scrollY = (this.f35784q5 - this.E0.getScrollY()) + (this.p5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.pf pfVar = this.E0;
                pfVar.setOffsetY(pfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final mk f35489b;

                    {
                        this.f35489b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                mk mkVar = this.f35489b;
                                zn znVar2 = mkVar.f35785r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                mkVar.setAnimatedTop((int) floatValue);
                                View view2 = mkVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    mkVar.G1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    znVar2.o9();
                                    znVar2.r9();
                                }
                                mkVar.f22107y1.invalidate();
                                mkVar.invalidate();
                                return;
                            default:
                                this.f35489b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = znVar.f40468q9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                znVar.f40468q9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ji.n.V);
                ofFloat2.start();
                this.f22049n3 = false;
            }
            this.f35783o5 = znVar.X0.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = znVar.f40468q9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = znVar.f40456p9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        znVar.f40276b0 = 0;
        this.f22049n3 = false;
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
        zn znVar = this.f35785r5;
        rf rfVar = znVar.f40422mb;
        if (rfVar != null) {
            AndroidUtilities.runOnUIThread(rfVar);
            znVar.f40422mb = null;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        zn znVar = this.f35785r5;
        j6.l lVar = znVar.Ac;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !znVar.f40471qc) {
            z11 = true;
        }
        lVar.j(1, z10, z11);
    }
}
