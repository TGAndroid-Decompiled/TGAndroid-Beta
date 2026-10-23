package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.qa1;
public final class en0 extends AnimatorListenerAdapter {
    public final int f25937a;
    public final boolean f25938b;
    public final float f25939c;
    public final KeyEvent.Callback d;

    public en0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f25937a = i10;
        this.d = callback;
        this.f25938b = z10;
        this.f25939c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f25937a) {
            case 0:
                hn0 hn0Var = (hn0) this.d;
                qa1 qa1Var = hn0Var.e;
                hn0Var.f26938h0 = null;
                boolean z10 = this.f25938b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                hn0Var.f26939i0 = f7;
                for (int i10 = 0; i10 < qa1Var.getChildCount(); i10++) {
                    qa1Var.getChildAt(i10).invalidate();
                }
                qa1Var.invalidate();
                hn0Var.p();
                if (!z10) {
                    float childCount = hn0Var.f26941k0 * qa1Var.getChildCount();
                    float f10 = this.f25939c;
                    float scrollX = (hn0Var.getScrollX() + f10) / (hn0Var.f26940j0 * qa1Var.getChildCount());
                    float measuredWidth = (childCount - hn0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f10 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    hn0Var.f26942l0 = (hn0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    hn0Var.m0 = i11;
                    if (i11 < 0) {
                        hn0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < qa1Var.getChildCount(); i12++) {
                        View childAt = qa1Var.getChildAt(i12);
                        if (childAt instanceof yx0) {
                            ((yx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    hn0Var.f26937g0 = false;
                    hn0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    qa1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f25938b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25937a) {
            case 1:
                super.onAnimationStart(animator);
                xh.i iVar = ((xh.j) this.d).f49866y;
                iVar.setVisibility(0);
                if (this.f25938b) {
                    float f7 = this.f25939c;
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
