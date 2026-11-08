package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
public final class ok0 extends AnimatorListenerAdapter {
    public final int f36656a;
    public final boolean f36657b;
    public final float f36658c;
    public final KeyEvent.Callback d;

    public ok0(KeyEvent.Callback callback, boolean z9, float f10, int i7) {
        this.f36656a = i7;
        this.d = callback;
        this.f36657b = z9;
        this.f36658c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f36656a) {
            case 0:
                rk0 rk0Var = (rk0) this.d;
                org.telegram.ui.c61 c61Var = rk0Var.f37700e;
                rk0Var.f37705h0 = null;
                boolean z9 = this.f36657b;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                rk0Var.f37706i0 = f10;
                for (int i7 = 0; i7 < c61Var.getChildCount(); i7++) {
                    c61Var.getChildAt(i7).invalidate();
                }
                c61Var.invalidate();
                rk0Var.p();
                if (!z9) {
                    float childCount = rk0Var.f37708k0 * c61Var.getChildCount();
                    float f11 = this.f36658c;
                    float scrollX = (rk0Var.getScrollX() + f11) / (rk0Var.f37707j0 * c61Var.getChildCount());
                    float measuredWidth = (childCount - rk0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f11 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f12 = childCount * scrollX;
                    if (f12 - f11 < 0.0f) {
                        f12 = f11;
                    }
                    rk0Var.f37709l0 = (rk0Var.getScrollX() + f11) - f12;
                    int i10 = (int) (f12 - f11);
                    rk0Var.m0 = i10;
                    if (i10 < 0) {
                        rk0Var.m0 = 0;
                    }
                    for (int i11 = 0; i11 < c61Var.getChildCount(); i11++) {
                        View childAt = c61Var.getChildAt(i11);
                        if (childAt instanceof fv0) {
                            ((fv0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = org.telegram.messenger.g0.L(33.0f);
                    }
                    rk0Var.f37704g0 = false;
                    rk0Var.getLayoutParams().height = org.telegram.messenger.g0.L(36.0f);
                    c61Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f36657b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36656a) {
            case 1:
                super.onAnimationStart(animator);
                yh.k kVar = ((yh.l) this.d).D;
                kVar.setVisibility(0);
                if (this.f36657b) {
                    float f10 = this.f36658c;
                    kVar.setScaleX(f10);
                    kVar.setScaleY(f10);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
