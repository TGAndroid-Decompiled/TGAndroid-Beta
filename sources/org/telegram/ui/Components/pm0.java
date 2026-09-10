package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.gc1;
public final class pm0 extends AnimatorListenerAdapter {
    public final int f26213a;
    public final boolean f26214b;
    public final float f26215c;
    public final KeyEvent.Callback d;

    public pm0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f26213a = i10;
        this.d = callback;
        this.f26214b = z10;
        this.f26215c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f26213a) {
            case 0:
                sm0 sm0Var = (sm0) this.d;
                gc1 gc1Var = sm0Var.e;
                sm0Var.f27111h0 = null;
                boolean z10 = this.f26214b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                sm0Var.f27112i0 = f7;
                for (int i10 = 0; i10 < gc1Var.getChildCount(); i10++) {
                    gc1Var.getChildAt(i10).invalidate();
                }
                gc1Var.invalidate();
                sm0Var.p();
                if (!z10) {
                    float childCount = sm0Var.f27114k0 * gc1Var.getChildCount();
                    float f10 = this.f26215c;
                    float scrollX = (sm0Var.getScrollX() + f10) / (sm0Var.f27113j0 * gc1Var.getChildCount());
                    float measuredWidth = (childCount - sm0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    sm0Var.f27115l0 = (sm0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    sm0Var.m0 = i11;
                    if (i11 < 0) {
                        sm0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < gc1Var.getChildCount(); i12++) {
                        View childAt = gc1Var.getChildAt(i12);
                        if (childAt instanceof ox0) {
                            ((ox0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    sm0Var.f27110g0 = false;
                    sm0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    gc1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f26214b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f26213a) {
            case 1:
                super.onAnimationStart(animator);
                vh.n nVar = ((vh.o) this.d).f43397y;
                nVar.setVisibility(0);
                if (this.f26214b) {
                    float f7 = this.f26215c;
                    nVar.setScaleX(f7);
                    nVar.setScaleY(f7);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
