package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cc1;
public final class fm0 extends AnimatorListenerAdapter {
    public final int f26156a;
    public final boolean f26157b;
    public final float f26158c;
    public final KeyEvent.Callback d;

    public fm0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f26156a = i10;
        this.d = callback;
        this.f26157b = z10;
        this.f26158c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f26156a) {
            case 0:
                im0 im0Var = (im0) this.d;
                cc1 cc1Var = im0Var.f27198e;
                im0Var.f27203h0 = null;
                boolean z10 = this.f26157b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                im0Var.f27204i0 = f7;
                for (int i10 = 0; i10 < cc1Var.getChildCount(); i10++) {
                    cc1Var.getChildAt(i10).invalidate();
                }
                cc1Var.invalidate();
                im0Var.p();
                if (!z10) {
                    float childCount = im0Var.f27206k0 * cc1Var.getChildCount();
                    float f10 = this.f26158c;
                    float scrollX = (im0Var.getScrollX() + f10) / (im0Var.f27205j0 * cc1Var.getChildCount());
                    float measuredWidth = (childCount - im0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    im0Var.f27207l0 = (im0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    im0Var.m0 = i11;
                    if (i11 < 0) {
                        im0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < cc1Var.getChildCount(); i12++) {
                        View childAt = cc1Var.getChildAt(i12);
                        if (childAt instanceof cx0) {
                            ((cx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    im0Var.f27202g0 = false;
                    im0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    cc1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f26157b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f26156a) {
            case 1:
                super.onAnimationStart(animator);
                xh.l lVar = ((xh.m) this.d).f49470y;
                lVar.setVisibility(0);
                if (this.f26157b) {
                    float f7 = this.f26158c;
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
