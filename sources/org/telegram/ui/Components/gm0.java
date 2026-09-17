package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.dc1;
public final class gm0 extends AnimatorListenerAdapter {
    public final int f24343a;
    public final boolean f24344b;
    public final float f24345c;
    public final KeyEvent.Callback d;

    public gm0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f24343a = i10;
        this.d = callback;
        this.f24344b = z10;
        this.f24345c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f24343a) {
            case 0:
                jm0 jm0Var = (jm0) this.d;
                dc1 dc1Var = jm0Var.e;
                jm0Var.f25338h0 = null;
                boolean z10 = this.f24344b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                jm0Var.f25339i0 = f7;
                for (int i10 = 0; i10 < dc1Var.getChildCount(); i10++) {
                    dc1Var.getChildAt(i10).invalidate();
                }
                dc1Var.invalidate();
                jm0Var.p();
                if (!z10) {
                    float childCount = jm0Var.f25341k0 * dc1Var.getChildCount();
                    float f10 = this.f24345c;
                    float scrollX = (jm0Var.getScrollX() + f10) / (jm0Var.f25340j0 * dc1Var.getChildCount());
                    float measuredWidth = (childCount - jm0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    jm0Var.f25342l0 = (jm0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    jm0Var.m0 = i11;
                    if (i11 < 0) {
                        jm0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < dc1Var.getChildCount(); i12++) {
                        View childAt = dc1Var.getChildAt(i12);
                        if (childAt instanceof ex0) {
                            ((ex0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    jm0Var.f25337g0 = false;
                    jm0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    dc1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f24344b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f24343a) {
            case 1:
                super.onAnimationStart(animator);
                wh.l lVar = ((wh.m) this.d).f45133y;
                lVar.setVisibility(0);
                if (this.f24344b) {
                    float f7 = this.f24345c;
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
