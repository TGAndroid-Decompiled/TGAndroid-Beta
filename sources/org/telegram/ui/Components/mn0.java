package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cc1;
public final class mn0 extends AnimatorListenerAdapter {
    public final int f28895a;
    public final boolean f28896b;
    public final float f28897c;
    public final KeyEvent.Callback d;

    public mn0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
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
                pn0 pn0Var = (pn0) this.d;
                cc1 cc1Var = pn0Var.f29906e;
                pn0Var.f29911h0 = null;
                boolean z10 = this.f28896b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                pn0Var.f29912i0 = f7;
                for (int i10 = 0; i10 < cc1Var.getChildCount(); i10++) {
                    cc1Var.getChildAt(i10).invalidate();
                }
                cc1Var.invalidate();
                pn0Var.p();
                if (!z10) {
                    float childCount = pn0Var.f29914k0 * cc1Var.getChildCount();
                    float f10 = this.f28897c;
                    float scrollX = (pn0Var.getScrollX() + f10) / (pn0Var.f29913j0 * cc1Var.getChildCount());
                    float measuredWidth = (childCount - pn0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f10 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    pn0Var.f29915l0 = (pn0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    pn0Var.m0 = i11;
                    if (i11 < 0) {
                        pn0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < cc1Var.getChildCount(); i12++) {
                        View childAt = cc1Var.getChildAt(i12);
                        if (childAt instanceof gy0) {
                            ((gy0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    pn0Var.f29910g0 = false;
                    pn0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    cc1Var.requestLayout();
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
                wh.j jVar = ((wh.k) this.d).f50549y;
                jVar.setVisibility(0);
                if (this.f28896b) {
                    float f7 = this.f28897c;
                    jVar.setScaleX(f7);
                    jVar.setScaleY(f7);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
