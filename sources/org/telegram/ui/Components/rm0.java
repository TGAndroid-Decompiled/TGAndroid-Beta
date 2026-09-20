package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.dc1;
public final class rm0 extends AnimatorListenerAdapter {
    public final int f27925a;
    public final boolean f27926b;
    public final float f27927c;
    public final KeyEvent.Callback d;

    public rm0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f27925a = i10;
        this.d = callback;
        this.f27926b = z10;
        this.f27927c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f27925a) {
            case 0:
                um0 um0Var = (um0) this.d;
                dc1 dc1Var = um0Var.e;
                um0Var.f28716h0 = null;
                boolean z10 = this.f27926b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                um0Var.f28717i0 = f7;
                for (int i10 = 0; i10 < dc1Var.getChildCount(); i10++) {
                    dc1Var.getChildAt(i10).invalidate();
                }
                dc1Var.invalidate();
                um0Var.p();
                if (!z10) {
                    float childCount = um0Var.f28719k0 * dc1Var.getChildCount();
                    float f10 = this.f27927c;
                    float scrollX = (um0Var.getScrollX() + f10) / (um0Var.f28718j0 * dc1Var.getChildCount());
                    float measuredWidth = (childCount - um0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    um0Var.f28720l0 = (um0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    um0Var.m0 = i11;
                    if (i11 < 0) {
                        um0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < dc1Var.getChildCount(); i12++) {
                        View childAt = dc1Var.getChildAt(i12);
                        if (childAt instanceof ox0) {
                            ((ox0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    um0Var.f28715g0 = false;
                    um0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    dc1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f27926b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27925a) {
            case 1:
                super.onAnimationStart(animator);
                wh.l lVar = ((wh.m) this.d).f45405y;
                lVar.setVisibility(0);
                if (this.f27926b) {
                    float f7 = this.f27927c;
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
