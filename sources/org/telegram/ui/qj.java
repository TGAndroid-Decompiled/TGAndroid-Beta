package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qj extends ChatActivityEnterView {
    public int f49246t5;
    public int f49247u5;
    public int f49248v5;
    public final an f49249w5;

    public qj(an anVar, Activity activity, org.telegram.ui.Components.rt0 rt0Var, an anVar2, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, rt0Var, anVar2, z9, f6Var);
        this.f49249w5 = anVar;
    }

    @Override
    public final void A0(float f10) {
        this.f49249w5.E7();
    }

    @Override
    public final void C0(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        an anVar = this.f49249w5;
        if (anVar.Z != null) {
            if (anVar.f44043z0 != null) {
                if (anVar.Xa <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                        if (kVar2.v()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f31095n3 = true;
            this.f49247u5 = this.E0.getMeasuredHeight();
            this.f49248v5 = this.E0.getScrollY();
            anVar.l1.invalidate();
            anVar.f43751c0 = anVar.Z.getBackgroundTop();
        }
    }

    @Override
    public final void H0() {
        if (this.f49249w5.Ya != null) {
            return;
        }
        super.H0();
    }

    @Override
    public final boolean N0() {
        if (!this.f49249w5.f43770d6) {
            return false;
        }
        return true;
    }

    public final void V1() {
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.f49249w5;
        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        if (!kVar.v() && !anVar.W9()) {
            int backgroundTop = getBackgroundTop();
            int i7 = anVar.f43751c0;
            if (i7 != 0 && backgroundTop != i7 && this.f49246t5 == anVar.l1.getMeasuredHeight()) {
                int i10 = (this.T1 + anVar.f43751c0) - backgroundTop;
                setAnimatedTop(i10);
                this.f31157y1.invalidate();
                ValueAnimator valueAnimator = anVar.I9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    anVar.I9.cancel();
                }
                View view = this.G1;
                if (view != null && view.getVisibility() == 0) {
                    this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i10, 0.0f);
                anVar.I9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final qj f48843b;

                    {
                        this.f48843b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                qj qjVar = this.f48843b;
                                an anVar2 = qjVar.f49249w5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                qjVar.setAnimatedTop((int) floatValue);
                                View view2 = qjVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    qjVar.G1.setTranslationY(((1.0f - qjVar.getTopViewEnterProgress()) * qjVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    anVar2.K9();
                                    anVar2.M9();
                                }
                                qjVar.f31157y1.invalidate();
                                qjVar.invalidate();
                                return;
                            default:
                                this.f48843b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                anVar.I9.addListener(new va(this, 5));
                anVar.I9.setDuration(250L);
                anVar.I9.setInterpolator(mi.l.V);
                if (!anVar.H9) {
                    anVar.I9.start();
                }
                anVar.K9();
                anVar.M9();
                anVar.f43751c0 = 0;
            } else if (this.f49246t5 != anVar.l1.getMeasuredHeight()) {
                anVar.f43751c0 = 0;
            }
            if (this.f31095n3) {
                float scrollY = (this.f49248v5 - this.E0.getScrollY()) + (this.f49247u5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.xe xeVar = this.E0;
                xeVar.setOffsetY(xeVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final qj f48843b;

                    {
                        this.f48843b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                qj qjVar = this.f48843b;
                                an anVar2 = qjVar.f49249w5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                qjVar.setAnimatedTop((int) floatValue);
                                View view2 = qjVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    qjVar.G1.setTranslationY(((1.0f - qjVar.getTopViewEnterProgress()) * qjVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    anVar2.K9();
                                    anVar2.M9();
                                }
                                qjVar.f31157y1.invalidate();
                                qjVar.invalidate();
                                return;
                            default:
                                this.f48843b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = anVar.J9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                anVar.J9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(mi.l.V);
                ofFloat2.start();
                this.f31095n3 = false;
            }
            this.f49246t5 = anVar.l1.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = anVar.J9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = anVar.I9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        anVar.f43751c0 = 0;
        this.f31095n3 = false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void o0(boolean z9) {
        super.o0(z9);
        an anVar = this.f49249w5;
        af afVar = anVar.Nb;
        if (afVar != null) {
            org.telegram.messenger.g0.h3(afVar);
            anVar.Nb = null;
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
    public final void setVisibility(int i7) {
        boolean z9;
        super.setVisibility(i7);
        an anVar = this.f49249w5;
        m6.n nVar = anVar.f43803fd;
        boolean z10 = false;
        if (i7 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getMeasuredWidth() > 0 && !anVar.Vc) {
            z10 = true;
        }
        nVar.h(1, z9, z10);
    }
}
