package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class nn0 extends AnimatorListenerAdapter {
    public final int f31013a;
    public final boolean f31014b;
    public final float f31015c;
    public final KeyEvent.Callback d;

    public nn0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f31013a = i10;
        this.d = callback;
        this.f31014b = z10;
        this.f31015c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f31013a) {
            case 0:
                qn0 qn0Var = (qn0) this.d;
                org.telegram.ui.za1 za1Var = qn0Var.e;
                qn0Var.f31958h0 = null;
                boolean z10 = this.f31014b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                qn0Var.f31959i0 = f7;
                for (int i10 = 0; i10 < za1Var.getChildCount(); i10++) {
                    za1Var.getChildAt(i10).invalidate();
                }
                za1Var.invalidate();
                qn0Var.p();
                if (!z10) {
                    float childCount = qn0Var.f31961k0 * za1Var.getChildCount();
                    float f10 = this.f31015c;
                    float scrollX = (qn0Var.getScrollX() + f10) / (qn0Var.f31960j0 * za1Var.getChildCount());
                    float measuredWidth = (childCount - qn0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f10 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    qn0Var.f31962l0 = (qn0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    qn0Var.m0 = i11;
                    if (i11 < 0) {
                        qn0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < za1Var.getChildCount(); i12++) {
                        View childAt = za1Var.getChildAt(i12);
                        if (childAt instanceof ky0) {
                            ((ky0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    qn0Var.f31957g0 = false;
                    qn0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    za1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f31014b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f31013a) {
            case 1:
                super.onAnimationStart(animator);
                yh.i iVar = ((yh.j) this.d).f52667y;
                iVar.setVisibility(0);
                if (this.f31014b) {
                    float f7 = this.f31015c;
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
