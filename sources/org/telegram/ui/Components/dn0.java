package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.sa1;
public final class dn0 extends AnimatorListenerAdapter {
    public final int f25632a;
    public final boolean f25633b;
    public final float f25634c;
    public final KeyEvent.Callback d;

    public dn0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f25632a = i10;
        this.d = callback;
        this.f25633b = z10;
        this.f25634c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f25632a) {
            case 0:
                gn0 gn0Var = (gn0) this.d;
                sa1 sa1Var = gn0Var.e;
                gn0Var.f26613h0 = null;
                boolean z10 = this.f25633b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                gn0Var.f26614i0 = f7;
                for (int i10 = 0; i10 < sa1Var.getChildCount(); i10++) {
                    sa1Var.getChildAt(i10).invalidate();
                }
                sa1Var.invalidate();
                gn0Var.p();
                if (!z10) {
                    float childCount = gn0Var.f26616k0 * sa1Var.getChildCount();
                    float f10 = this.f25634c;
                    float scrollX = (gn0Var.getScrollX() + f10) / (gn0Var.f26615j0 * sa1Var.getChildCount());
                    float measuredWidth = (childCount - gn0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f10 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    gn0Var.f26617l0 = (gn0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    gn0Var.m0 = i11;
                    if (i11 < 0) {
                        gn0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < sa1Var.getChildCount(); i12++) {
                        View childAt = sa1Var.getChildAt(i12);
                        if (childAt instanceof wx0) {
                            ((wx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    gn0Var.f26612g0 = false;
                    gn0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    sa1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f25633b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25632a) {
            case 1:
                super.onAnimationStart(animator);
                xh.i iVar = ((xh.j) this.d).f49903y;
                iVar.setVisibility(0);
                if (this.f25633b) {
                    float f7 = this.f25634c;
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
