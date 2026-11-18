package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
public final class bl0 extends AnimatorListenerAdapter {
    public final int f33712a;
    public final boolean f33713b;
    public final float f33714c;
    public final KeyEvent.Callback d;

    public bl0(KeyEvent.Callback callback, boolean z10, float f10, int i7) {
        this.f33712a = i7;
        this.d = callback;
        this.f33713b = z10;
        this.f33714c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f33712a) {
            case 0:
                el0 el0Var = (el0) this.d;
                org.telegram.ui.d61 d61Var = el0Var.f34742e;
                el0Var.f34748i0 = null;
                boolean z10 = this.f33713b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                el0Var.f34749j0 = f10;
                for (int i7 = 0; i7 < d61Var.getChildCount(); i7++) {
                    d61Var.getChildAt(i7).invalidate();
                }
                d61Var.invalidate();
                el0Var.p();
                if (!z10) {
                    float childCount = el0Var.f34751l0 * d61Var.getChildCount();
                    float f11 = this.f33714c;
                    float scrollX = (el0Var.getScrollX() + f11) / (el0Var.f34750k0 * d61Var.getChildCount());
                    float measuredWidth = (childCount - el0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f11 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f12 = childCount * scrollX;
                    if (f12 - f11 < 0.0f) {
                        f12 = f11;
                    }
                    el0Var.m0 = (el0Var.getScrollX() + f11) - f12;
                    int i10 = (int) (f12 - f11);
                    el0Var.f34753n0 = i10;
                    if (i10 < 0) {
                        el0Var.f34753n0 = 0;
                    }
                    for (int i11 = 0; i11 < d61Var.getChildCount(); i11++) {
                        View childAt = d61Var.getChildAt(i11);
                        if (childAt instanceof pv0) {
                            ((pv0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = org.telegram.messenger.g0.L(33.0f);
                    }
                    el0Var.f34747h0 = false;
                    el0Var.getLayoutParams().height = org.telegram.messenger.g0.L(36.0f);
                    d61Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f33713b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33712a) {
            case 1:
                super.onAnimationStart(animator);
                zh.j jVar = ((zh.k) this.d).E;
                jVar.setVisibility(0);
                if (this.f33713b) {
                    float f10 = this.f33714c;
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
