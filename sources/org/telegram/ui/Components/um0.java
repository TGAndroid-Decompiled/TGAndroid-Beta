package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ub1;
public final class um0 extends AnimatorListenerAdapter {
    public final int f28895a;
    public final boolean f28896b;
    public final float f28897c;
    public final KeyEvent.Callback d;

    public um0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f28895a = i10;
        this.d = callback;
        this.f28896b = z10;
        this.f28897c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f28895a) {
            case 0:
                xm0 xm0Var = (xm0) this.d;
                ub1 ub1Var = xm0Var.e;
                xm0Var.f30366h0 = null;
                boolean z10 = this.f28896b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                xm0Var.f30367i0 = f7;
                for (int i10 = 0; i10 < ub1Var.getChildCount(); i10++) {
                    ub1Var.getChildAt(i10).invalidate();
                }
                ub1Var.invalidate();
                xm0Var.p();
                if (!z10) {
                    float childCount = xm0Var.f30369k0 * ub1Var.getChildCount();
                    float f10 = this.f28897c;
                    float scrollX = (xm0Var.getScrollX() + f10) / (xm0Var.f30368j0 * ub1Var.getChildCount());
                    float measuredWidth = (childCount - xm0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    xm0Var.f30370l0 = (xm0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    xm0Var.m0 = i11;
                    if (i11 < 0) {
                        xm0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < ub1Var.getChildCount(); i12++) {
                        View childAt = ub1Var.getChildAt(i12);
                        if (childAt instanceof qx0) {
                            ((qx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    xm0Var.f30365g0 = false;
                    xm0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    ub1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f28896b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28895a) {
            case 1:
                super.onAnimationStart(animator);
                wh.l lVar = ((wh.m) this.d).f45496y;
                lVar.setVisibility(0);
                if (this.f28896b) {
                    float f7 = this.f28897c;
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
