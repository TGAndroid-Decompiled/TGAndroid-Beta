package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.xb1;
public final class xm0 extends AnimatorListenerAdapter {
    public final int f32902a;
    public final boolean f32903b;
    public final float f32904c;
    public final KeyEvent.Callback d;

    public xm0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f32902a = i10;
        this.d = callback;
        this.f32903b = z10;
        this.f32904c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f32902a) {
            case 0:
                an0 an0Var = (an0) this.d;
                xb1 xb1Var = an0Var.f24585e;
                an0Var.f24590h0 = null;
                boolean z10 = this.f32903b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                an0Var.f24591i0 = f7;
                for (int i10 = 0; i10 < xb1Var.getChildCount(); i10++) {
                    xb1Var.getChildAt(i10).invalidate();
                }
                xb1Var.invalidate();
                an0Var.p();
                if (!z10) {
                    float childCount = an0Var.f24593k0 * xb1Var.getChildCount();
                    float f10 = this.f32904c;
                    float scrollX = (an0Var.getScrollX() + f10) / (an0Var.f24592j0 * xb1Var.getChildCount());
                    float measuredWidth = (childCount - an0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    an0Var.f24594l0 = (an0Var.getScrollX() + f10) - f11;
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
                    an0Var.f24589g0 = false;
                    an0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    xb1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f32903b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32902a) {
            case 1:
                super.onAnimationStart(animator);
                wh.l lVar = ((wh.m) this.d).f49133y;
                lVar.setVisibility(0);
                if (this.f32903b) {
                    float f7 = this.f32904c;
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
