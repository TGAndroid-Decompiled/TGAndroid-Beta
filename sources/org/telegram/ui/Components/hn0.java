package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.va1;
public final class hn0 extends AnimatorListenerAdapter {
    public final int f26988a;
    public final boolean f26989b;
    public final float f26990c;
    public final KeyEvent.Callback d;

    public hn0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f26988a = i10;
        this.d = callback;
        this.f26989b = z10;
        this.f26990c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f26988a) {
            case 0:
                kn0 kn0Var = (kn0) this.d;
                va1 va1Var = kn0Var.e;
                kn0Var.f28079h0 = null;
                boolean z10 = this.f26989b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                kn0Var.f28080i0 = f7;
                for (int i10 = 0; i10 < va1Var.getChildCount(); i10++) {
                    va1Var.getChildAt(i10).invalidate();
                }
                va1Var.invalidate();
                kn0Var.p();
                if (!z10) {
                    float childCount = kn0Var.f28082k0 * va1Var.getChildCount();
                    float f10 = this.f26990c;
                    float scrollX = (kn0Var.getScrollX() + f10) / (kn0Var.f28081j0 * va1Var.getChildCount());
                    float measuredWidth = (childCount - kn0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f10 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    kn0Var.f28083l0 = (kn0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    kn0Var.m0 = i11;
                    if (i11 < 0) {
                        kn0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < va1Var.getChildCount(); i12++) {
                        View childAt = va1Var.getChildAt(i12);
                        if (childAt instanceof by0) {
                            ((by0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    kn0Var.f28078g0 = false;
                    kn0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    va1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f26989b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f26988a) {
            case 1:
                super.onAnimationStart(animator);
                xh.i iVar = ((xh.j) this.d).f50306y;
                iVar.setVisibility(0);
                if (this.f26989b) {
                    float f7 = this.f26990c;
                    iVar.setScaleX(f7);
                    iVar.setScaleY(f7);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
