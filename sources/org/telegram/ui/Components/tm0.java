package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.dc1;
public final class tm0 extends AnimatorListenerAdapter {
    public final int f28498a;
    public final boolean f28499b;
    public final float f28500c;
    public final KeyEvent.Callback d;

    public tm0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f28498a = i10;
        this.d = callback;
        this.f28499b = z10;
        this.f28500c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f28498a) {
            case 0:
                wm0 wm0Var = (wm0) this.d;
                dc1 dc1Var = wm0Var.e;
                wm0Var.f30055h0 = null;
                boolean z10 = this.f28499b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                wm0Var.f30056i0 = f7;
                for (int i10 = 0; i10 < dc1Var.getChildCount(); i10++) {
                    dc1Var.getChildAt(i10).invalidate();
                }
                dc1Var.invalidate();
                wm0Var.p();
                if (!z10) {
                    float childCount = wm0Var.f30058k0 * dc1Var.getChildCount();
                    float f10 = this.f28500c;
                    float scrollX = (wm0Var.getScrollX() + f10) / (wm0Var.f30057j0 * dc1Var.getChildCount());
                    float measuredWidth = (childCount - wm0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    wm0Var.f30059l0 = (wm0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    wm0Var.m0 = i11;
                    if (i11 < 0) {
                        wm0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < dc1Var.getChildCount(); i12++) {
                        View childAt = dc1Var.getChildAt(i12);
                        if (childAt instanceof qx0) {
                            ((qx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    wm0Var.f30054g0 = false;
                    wm0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    dc1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f28499b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28498a) {
            case 1:
                super.onAnimationStart(animator);
                wh.l lVar = ((wh.m) this.d).f45426y;
                lVar.setVisibility(0);
                if (this.f28499b) {
                    float f7 = this.f28500c;
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
