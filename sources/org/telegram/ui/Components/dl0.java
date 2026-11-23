package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
public final class dl0 extends AnimatorListenerAdapter {
    public final int f34522a;
    public final boolean f34523b;
    public final float f34524c;
    public final KeyEvent.Callback d;

    public dl0(KeyEvent.Callback callback, boolean z10, float f10, int i7) {
        this.f34522a = i7;
        this.d = callback;
        this.f34523b = z10;
        this.f34524c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f34522a) {
            case 0:
                gl0 gl0Var = (gl0) this.d;
                org.telegram.ui.d61 d61Var = gl0Var.f35612e;
                gl0Var.f35618i0 = null;
                boolean z10 = this.f34523b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                gl0Var.f35619j0 = f10;
                for (int i7 = 0; i7 < d61Var.getChildCount(); i7++) {
                    d61Var.getChildAt(i7).invalidate();
                }
                d61Var.invalidate();
                gl0Var.p();
                if (!z10) {
                    float childCount = gl0Var.f35621l0 * d61Var.getChildCount();
                    float f11 = this.f34524c;
                    float scrollX = (gl0Var.getScrollX() + f11) / (gl0Var.f35620k0 * d61Var.getChildCount());
                    float measuredWidth = (childCount - gl0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f11 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f12 = childCount * scrollX;
                    if (f12 - f11 < 0.0f) {
                        f12 = f11;
                    }
                    gl0Var.m0 = (gl0Var.getScrollX() + f11) - f12;
                    int i10 = (int) (f12 - f11);
                    gl0Var.f35623n0 = i10;
                    if (i10 < 0) {
                        gl0Var.f35623n0 = 0;
                    }
                    for (int i11 = 0; i11 < d61Var.getChildCount(); i11++) {
                        View childAt = d61Var.getChildAt(i11);
                        if (childAt instanceof sv0) {
                            ((sv0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = org.telegram.messenger.g0.L(33.0f);
                    }
                    gl0Var.f35617h0 = false;
                    gl0Var.getLayoutParams().height = org.telegram.messenger.g0.L(36.0f);
                    d61Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f34523b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f34522a) {
            case 1:
                super.onAnimationStart(animator);
                zh.j jVar = ((zh.k) this.d).E;
                jVar.setVisibility(0);
                if (this.f34523b) {
                    float f10 = this.f34524c;
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
