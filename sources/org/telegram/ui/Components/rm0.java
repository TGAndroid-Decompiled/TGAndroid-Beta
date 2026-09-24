package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ub1;
public final class rm0 extends AnimatorListenerAdapter {
    public final int f27997a;
    public final boolean f27998b;
    public final float f27999c;
    public final KeyEvent.Callback d;

    public rm0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f27997a = i10;
        this.d = callback;
        this.f27998b = z10;
        this.f27999c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f27997a) {
            case 0:
                um0 um0Var = (um0) this.d;
                ub1 ub1Var = um0Var.e;
                um0Var.f28811h0 = null;
                boolean z10 = this.f27998b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                um0Var.f28812i0 = f7;
                for (int i10 = 0; i10 < ub1Var.getChildCount(); i10++) {
                    ub1Var.getChildAt(i10).invalidate();
                }
                ub1Var.invalidate();
                um0Var.p();
                if (!z10) {
                    float childCount = um0Var.f28814k0 * ub1Var.getChildCount();
                    float f10 = this.f27999c;
                    float scrollX = (um0Var.getScrollX() + f10) / (um0Var.f28813j0 * ub1Var.getChildCount());
                    float measuredWidth = (childCount - um0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    um0Var.f28815l0 = (um0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    um0Var.m0 = i11;
                    if (i11 < 0) {
                        um0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < ub1Var.getChildCount(); i12++) {
                        View childAt = ub1Var.getChildAt(i12);
                        if (childAt instanceof nx0) {
                            ((nx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    um0Var.f28810g0 = false;
                    um0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    ub1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f27998b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27997a) {
            case 1:
                super.onAnimationStart(animator);
                wh.l lVar = ((wh.m) this.d).f45374y;
                lVar.setVisibility(0);
                if (this.f27998b) {
                    float f7 = this.f27999c;
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
