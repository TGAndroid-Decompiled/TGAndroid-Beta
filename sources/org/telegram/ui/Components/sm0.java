package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ub1;
public final class sm0 extends AnimatorListenerAdapter {
    public final int f28314a;
    public final boolean f28315b;
    public final float f28316c;
    public final KeyEvent.Callback d;

    public sm0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f28314a = i10;
        this.d = callback;
        this.f28315b = z10;
        this.f28316c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f28314a) {
            case 0:
                vm0 vm0Var = (vm0) this.d;
                ub1 ub1Var = vm0Var.e;
                vm0Var.f29135h0 = null;
                boolean z10 = this.f28315b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                vm0Var.f29136i0 = f7;
                for (int i10 = 0; i10 < ub1Var.getChildCount(); i10++) {
                    ub1Var.getChildAt(i10).invalidate();
                }
                ub1Var.invalidate();
                vm0Var.p();
                if (!z10) {
                    float childCount = vm0Var.f29138k0 * ub1Var.getChildCount();
                    float f10 = this.f28316c;
                    float scrollX = (vm0Var.getScrollX() + f10) / (vm0Var.f29137j0 * ub1Var.getChildCount());
                    float measuredWidth = (childCount - vm0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    vm0Var.f29139l0 = (vm0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    vm0Var.m0 = i11;
                    if (i11 < 0) {
                        vm0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < ub1Var.getChildCount(); i12++) {
                        View childAt = ub1Var.getChildAt(i12);
                        if (childAt instanceof ox0) {
                            ((ox0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    vm0Var.f29134g0 = false;
                    vm0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    ub1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f28315b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28314a) {
            case 1:
                super.onAnimationStart(animator);
                wh.l lVar = ((wh.m) this.d).f45387y;
                lVar.setVisibility(0);
                if (this.f28315b) {
                    float f7 = this.f28316c;
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
