package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
public final class tk0 extends AnimatorListenerAdapter {
    public final int f39711a;
    public final boolean f39712b;
    public final float f39713c;
    public final KeyEvent.Callback d;

    public tk0(KeyEvent.Callback callback, boolean z10, float f10, int i7) {
        this.f39711a = i7;
        this.d = callback;
        this.f39712b = z10;
        this.f39713c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f39711a) {
            case 0:
                wk0 wk0Var = (wk0) this.d;
                org.telegram.ui.z51 z51Var = wk0Var.f41380e;
                wk0Var.f41386i0 = null;
                boolean z10 = this.f39712b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                wk0Var.f41387j0 = f10;
                for (int i7 = 0; i7 < z51Var.getChildCount(); i7++) {
                    z51Var.getChildAt(i7).invalidate();
                }
                z51Var.invalidate();
                wk0Var.p();
                if (!z10) {
                    float childCount = wk0Var.f41389l0 * z51Var.getChildCount();
                    float f11 = this.f39713c;
                    float scrollX = (wk0Var.getScrollX() + f11) / (wk0Var.f41388k0 * z51Var.getChildCount());
                    float measuredWidth = (childCount - wk0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f11 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f12 = childCount * scrollX;
                    if (f12 - f11 < 0.0f) {
                        f12 = f11;
                    }
                    wk0Var.m0 = (wk0Var.getScrollX() + f11) - f12;
                    int i10 = (int) (f12 - f11);
                    wk0Var.f41391n0 = i10;
                    if (i10 < 0) {
                        wk0Var.f41391n0 = 0;
                    }
                    for (int i11 = 0; i11 < z51Var.getChildCount(); i11++) {
                        View childAt = z51Var.getChildAt(i11);
                        if (childAt instanceof hv0) {
                            ((hv0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = org.telegram.messenger.g0.L(33.0f);
                    }
                    wk0Var.f41385h0 = false;
                    wk0Var.getLayoutParams().height = org.telegram.messenger.g0.L(36.0f);
                    z51Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f39712b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39711a) {
            case 1:
                super.onAnimationStart(animator);
                zh.j jVar = ((zh.k) this.d).E;
                jVar.setVisibility(0);
                if (this.f39712b) {
                    float f10 = this.f39713c;
                    jVar.setScaleX(f10);
                    jVar.setScaleY(f10);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
