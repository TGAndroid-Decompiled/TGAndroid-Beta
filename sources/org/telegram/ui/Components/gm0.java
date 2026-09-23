package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ub1;
public final class gm0 extends AnimatorListenerAdapter {
    public final int f24369a;
    public final boolean f24370b;
    public final float f24371c;
    public final KeyEvent.Callback d;

    public gm0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f24369a = i10;
        this.d = callback;
        this.f24370b = z10;
        this.f24371c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f24369a) {
            case 0:
                jm0 jm0Var = (jm0) this.d;
                ub1 ub1Var = jm0Var.e;
                jm0Var.f25361h0 = null;
                boolean z10 = this.f24370b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                jm0Var.f25362i0 = f7;
                for (int i10 = 0; i10 < ub1Var.getChildCount(); i10++) {
                    ub1Var.getChildAt(i10).invalidate();
                }
                ub1Var.invalidate();
                jm0Var.p();
                if (!z10) {
                    float childCount = jm0Var.f25364k0 * ub1Var.getChildCount();
                    float f10 = this.f24371c;
                    float scrollX = (jm0Var.getScrollX() + f10) / (jm0Var.f25363j0 * ub1Var.getChildCount());
                    float measuredWidth = (childCount - jm0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    jm0Var.f25365l0 = (jm0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    jm0Var.m0 = i11;
                    if (i11 < 0) {
                        jm0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < ub1Var.getChildCount(); i12++) {
                        View childAt = ub1Var.getChildAt(i12);
                        if (childAt instanceof cx0) {
                            ((cx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    jm0Var.f25360g0 = false;
                    jm0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    ub1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f24370b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f24369a) {
            case 1:
                super.onAnimationStart(animator);
                wh.l lVar = ((wh.m) this.d).f45060y;
                lVar.setVisibility(0);
                if (this.f24370b) {
                    float f7 = this.f24371c;
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
