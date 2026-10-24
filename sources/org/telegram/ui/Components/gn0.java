package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ua1;
public final class gn0 extends AnimatorListenerAdapter {
    public final int f26732a;
    public final boolean f26733b;
    public final float f26734c;
    public final KeyEvent.Callback d;

    public gn0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f26732a = i10;
        this.d = callback;
        this.f26733b = z10;
        this.f26734c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f26732a) {
            case 0:
                jn0 jn0Var = (jn0) this.d;
                ua1 ua1Var = jn0Var.e;
                jn0Var.f27740h0 = null;
                boolean z10 = this.f26733b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                jn0Var.f27741i0 = f7;
                for (int i10 = 0; i10 < ua1Var.getChildCount(); i10++) {
                    ua1Var.getChildAt(i10).invalidate();
                }
                ua1Var.invalidate();
                jn0Var.p();
                if (!z10) {
                    float childCount = jn0Var.f27743k0 * ua1Var.getChildCount();
                    float f10 = this.f26734c;
                    float scrollX = (jn0Var.getScrollX() + f10) / (jn0Var.f27742j0 * ua1Var.getChildCount());
                    float measuredWidth = (childCount - jn0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f10 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    jn0Var.f27744l0 = (jn0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    jn0Var.m0 = i11;
                    if (i11 < 0) {
                        jn0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < ua1Var.getChildCount(); i12++) {
                        View childAt = ua1Var.getChildAt(i12);
                        if (childAt instanceof ay0) {
                            ((ay0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    jn0Var.f27739g0 = false;
                    jn0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    ua1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f26733b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f26732a) {
            case 1:
                super.onAnimationStart(animator);
                xh.i iVar = ((xh.j) this.d).f50305y;
                iVar.setVisibility(0);
                if (this.f26733b) {
                    float f7 = this.f26734c;
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
