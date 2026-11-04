package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
public final class sk0 extends AnimatorListenerAdapter {
    public final int f38046a;
    public final boolean f38047b;
    public final float f38048c;
    public final KeyEvent.Callback d;

    public sk0(KeyEvent.Callback callback, boolean z10, float f10, int i3) {
        this.f38046a = i3;
        this.d = callback;
        this.f38047b = z10;
        this.f38048c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f38046a) {
            case 0:
                vk0 vk0Var = (vk0) this.d;
                org.telegram.ui.s51 s51Var = vk0Var.f39152e;
                vk0Var.f39158i0 = null;
                boolean z10 = this.f38047b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                vk0Var.f39159j0 = f10;
                for (int i3 = 0; i3 < s51Var.getChildCount(); i3++) {
                    s51Var.getChildAt(i3).invalidate();
                }
                s51Var.invalidate();
                vk0Var.p();
                if (!z10) {
                    float childCount = vk0Var.f39161l0 * s51Var.getChildCount();
                    float f11 = this.f38048c;
                    float scrollX = (vk0Var.getScrollX() + f11) / (vk0Var.f39160k0 * s51Var.getChildCount());
                    float measuredWidth = (childCount - vk0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f11 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f12 = childCount * scrollX;
                    if (f12 - f11 < 0.0f) {
                        f12 = f11;
                    }
                    vk0Var.m0 = (vk0Var.getScrollX() + f11) - f12;
                    int i10 = (int) (f12 - f11);
                    vk0Var.f39163n0 = i10;
                    if (i10 < 0) {
                        vk0Var.f39163n0 = 0;
                    }
                    for (int i11 = 0; i11 < s51Var.getChildCount(); i11++) {
                        View childAt = s51Var.getChildAt(i11);
                        if (childAt instanceof ev0) {
                            ((ev0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = org.telegram.messenger.g0.L(33.0f);
                    }
                    vk0Var.f39157h0 = false;
                    vk0Var.getLayoutParams().height = org.telegram.messenger.g0.L(36.0f);
                    s51Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f38047b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38046a) {
            case 1:
                super.onAnimationStart(animator);
                zh.i iVar = ((zh.j) this.d).E;
                iVar.setVisibility(0);
                if (this.f38047b) {
                    float f10 = this.f38048c;
                    iVar.setScaleX(f10);
                    iVar.setScaleY(f10);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
