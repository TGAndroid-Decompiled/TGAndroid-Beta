package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mn0 extends AnimatorListenerAdapter {
    public final int f30673a;
    public final boolean f30674b;
    public final float f30675c;
    public final KeyEvent.Callback d;

    public mn0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f30673a = i10;
        this.d = callback;
        this.f30674b = z10;
        this.f30675c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f30673a) {
            case 0:
                pn0 pn0Var = (pn0) this.d;
                org.telegram.ui.xa1 xa1Var = pn0Var.e;
                pn0Var.f31622h0 = null;
                boolean z10 = this.f30674b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                pn0Var.f31623i0 = f7;
                for (int i10 = 0; i10 < xa1Var.getChildCount(); i10++) {
                    xa1Var.getChildAt(i10).invalidate();
                }
                xa1Var.invalidate();
                pn0Var.p();
                if (!z10) {
                    float childCount = pn0Var.f31625k0 * xa1Var.getChildCount();
                    float f10 = this.f30675c;
                    float scrollX = (pn0Var.getScrollX() + f10) / (pn0Var.f31624j0 * xa1Var.getChildCount());
                    float measuredWidth = (childCount - pn0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f10 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    pn0Var.f31626l0 = (pn0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    pn0Var.m0 = i11;
                    if (i11 < 0) {
                        pn0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < xa1Var.getChildCount(); i12++) {
                        View childAt = xa1Var.getChildAt(i12);
                        if (childAt instanceof jy0) {
                            ((jy0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    pn0Var.f31621g0 = false;
                    pn0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    xa1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f30674b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f30673a) {
            case 1:
                super.onAnimationStart(animator);
                yh.i iVar = ((yh.j) this.d).f52609y;
                iVar.setVisibility(0);
                if (this.f30674b) {
                    float f7 = this.f30675c;
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
