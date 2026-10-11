package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cc1;
public final class nn0 extends AnimatorListenerAdapter {
    public final int f29095a;
    public final boolean f29096b;
    public final float f29097c;
    public final KeyEvent.Callback d;

    public nn0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f29095a = i10;
        this.d = callback;
        this.f29096b = z10;
        this.f29097c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f29095a) {
            case 0:
                qn0 qn0Var = (qn0) this.d;
                cc1 cc1Var = qn0Var.f30193e;
                qn0Var.f30198h0 = null;
                boolean z10 = this.f29096b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                qn0Var.f30199i0 = f7;
                for (int i10 = 0; i10 < cc1Var.getChildCount(); i10++) {
                    cc1Var.getChildAt(i10).invalidate();
                }
                cc1Var.invalidate();
                qn0Var.p();
                if (!z10) {
                    float childCount = qn0Var.f30201k0 * cc1Var.getChildCount();
                    float f10 = this.f29097c;
                    float scrollX = (qn0Var.getScrollX() + f10) / (qn0Var.f30200j0 * cc1Var.getChildCount());
                    float measuredWidth = (childCount - qn0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f10 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    qn0Var.f30202l0 = (qn0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    qn0Var.m0 = i11;
                    if (i11 < 0) {
                        qn0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < cc1Var.getChildCount(); i12++) {
                        View childAt = cc1Var.getChildAt(i12);
                        if (childAt instanceof hy0) {
                            ((hy0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    qn0Var.f30197g0 = false;
                    qn0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    cc1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f29096b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29095a) {
            case 1:
                super.onAnimationStart(animator);
                wh.j jVar = ((wh.k) this.d).f50515y;
                jVar.setVisibility(0);
                if (this.f29096b) {
                    float f7 = this.f29097c;
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
