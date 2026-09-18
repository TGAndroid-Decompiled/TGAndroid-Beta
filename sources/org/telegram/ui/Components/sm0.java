package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.bc1;
public final class sm0 extends AnimatorListenerAdapter {
    public final int f28196a;
    public final boolean f28197b;
    public final float f28198c;
    public final KeyEvent.Callback d;

    public sm0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f28196a = i10;
        this.d = callback;
        this.f28197b = z10;
        this.f28198c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f28196a) {
            case 0:
                vm0 vm0Var = (vm0) this.d;
                bc1 bc1Var = vm0Var.e;
                vm0Var.f29119h0 = null;
                boolean z10 = this.f28197b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                vm0Var.f29120i0 = f7;
                for (int i10 = 0; i10 < bc1Var.getChildCount(); i10++) {
                    bc1Var.getChildAt(i10).invalidate();
                }
                bc1Var.invalidate();
                vm0Var.p();
                if (!z10) {
                    float childCount = vm0Var.f29122k0 * bc1Var.getChildCount();
                    float f10 = this.f28198c;
                    float scrollX = (vm0Var.getScrollX() + f10) / (vm0Var.f29121j0 * bc1Var.getChildCount());
                    float measuredWidth = (childCount - vm0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    vm0Var.f29123l0 = (vm0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    vm0Var.m0 = i11;
                    if (i11 < 0) {
                        vm0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < bc1Var.getChildCount(); i12++) {
                        View childAt = bc1Var.getChildAt(i12);
                        if (childAt instanceof px0) {
                            ((px0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    vm0Var.f29118g0 = false;
                    vm0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    bc1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f28197b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28196a) {
            case 1:
                super.onAnimationStart(animator);
                wh.l lVar = ((wh.m) this.d).f45361y;
                lVar.setVisibility(0);
                if (this.f28197b) {
                    float f7 = this.f28198c;
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
