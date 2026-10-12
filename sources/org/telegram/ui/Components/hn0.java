package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ic1;
public final class hn0 extends AnimatorListenerAdapter {
    public final int f25713a;
    public final boolean f25714b;
    public final float f25715c;
    public final KeyEvent.Callback d;

    public hn0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f25713a = i10;
        this.d = callback;
        this.f25714b = z10;
        this.f25715c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f25713a) {
            case 0:
                kn0 kn0Var = (kn0) this.d;
                ic1 ic1Var = kn0Var.e;
                kn0Var.f26745h0 = null;
                boolean z10 = this.f25714b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                kn0Var.f26746i0 = f7;
                for (int i10 = 0; i10 < ic1Var.getChildCount(); i10++) {
                    ic1Var.getChildAt(i10).invalidate();
                }
                ic1Var.invalidate();
                kn0Var.p();
                if (!z10) {
                    float childCount = kn0Var.f26748k0 * ic1Var.getChildCount();
                    float f10 = this.f25715c;
                    float scrollX = (kn0Var.getScrollX() + f10) / (kn0Var.f26747j0 * ic1Var.getChildCount());
                    float measuredWidth = (childCount - kn0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f10 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    kn0Var.f26749l0 = (kn0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    kn0Var.m0 = i11;
                    if (i11 < 0) {
                        kn0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < ic1Var.getChildCount(); i12++) {
                        View childAt = ic1Var.getChildAt(i12);
                        if (childAt instanceof by0) {
                            ((by0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    kn0Var.f26744g0 = false;
                    kn0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    ic1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f25714b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25713a) {
            case 1:
                super.onAnimationStart(animator);
                xh.j jVar = ((xh.k) this.d).f48474y;
                jVar.setVisibility(0);
                if (this.f25714b) {
                    float f7 = this.f25715c;
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
