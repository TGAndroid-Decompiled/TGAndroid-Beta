package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.vb1;
public final class xm0 extends AnimatorListenerAdapter {
    public final int f33000a;
    public final boolean f33001b;
    public final float f33002c;
    public final KeyEvent.Callback d;

    public xm0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f33000a = i10;
        this.d = callback;
        this.f33001b = z10;
        this.f33002c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f33000a) {
            case 0:
                an0 an0Var = (an0) this.d;
                vb1 vb1Var = an0Var.f24656e;
                an0Var.f24661h0 = null;
                boolean z10 = this.f33001b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                an0Var.f24662i0 = f7;
                for (int i10 = 0; i10 < vb1Var.getChildCount(); i10++) {
                    vb1Var.getChildAt(i10).invalidate();
                }
                vb1Var.invalidate();
                an0Var.p();
                if (!z10) {
                    float childCount = an0Var.f24664k0 * vb1Var.getChildCount();
                    float f10 = this.f33002c;
                    float scrollX = (an0Var.getScrollX() + f10) / (an0Var.f24663j0 * vb1Var.getChildCount());
                    float measuredWidth = (childCount - an0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    an0Var.f24665l0 = (an0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    an0Var.m0 = i11;
                    if (i11 < 0) {
                        an0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < vb1Var.getChildCount(); i12++) {
                        View childAt = vb1Var.getChildAt(i12);
                        if (childAt instanceof zx0) {
                            ((zx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    an0Var.f24660g0 = false;
                    an0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    vb1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f33001b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33000a) {
            case 1:
                super.onAnimationStart(animator);
                wh.l lVar = ((wh.m) this.d).f49149y;
                lVar.setVisibility(0);
                if (this.f33001b) {
                    float f7 = this.f33002c;
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
