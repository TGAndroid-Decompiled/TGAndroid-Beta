package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.xb1;
public final class xm0 extends AnimatorListenerAdapter {
    public final int f32909a;
    public final boolean f32910b;
    public final float f32911c;
    public final KeyEvent.Callback d;

    public xm0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f32909a = i10;
        this.d = callback;
        this.f32910b = z10;
        this.f32911c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f32909a) {
            case 0:
                an0 an0Var = (an0) this.d;
                xb1 xb1Var = an0Var.f24590e;
                an0Var.f24595h0 = null;
                boolean z10 = this.f32910b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                an0Var.f24596i0 = f7;
                for (int i10 = 0; i10 < xb1Var.getChildCount(); i10++) {
                    xb1Var.getChildAt(i10).invalidate();
                }
                xb1Var.invalidate();
                an0Var.p();
                if (!z10) {
                    float childCount = an0Var.f24598k0 * xb1Var.getChildCount();
                    float f10 = this.f32911c;
                    float scrollX = (an0Var.getScrollX() + f10) / (an0Var.f24597j0 * xb1Var.getChildCount());
                    float measuredWidth = (childCount - an0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    an0Var.f24599l0 = (an0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    an0Var.m0 = i11;
                    if (i11 < 0) {
                        an0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < xb1Var.getChildCount(); i12++) {
                        View childAt = xb1Var.getChildAt(i12);
                        if (childAt instanceof yx0) {
                            ((yx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    an0Var.f24594g0 = false;
                    an0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    xb1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f32910b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32909a) {
            case 1:
                super.onAnimationStart(animator);
                wh.l lVar = ((wh.m) this.d).f49142y;
                lVar.setVisibility(0);
                if (this.f32910b) {
                    float f7 = this.f32911c;
                    lVar.setScaleX(f7);
                    lVar.setScaleY(f7);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
