package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.dc1;
public final class ln0 extends AnimatorListenerAdapter {
    public final int f28491a;
    public final boolean f28492b;
    public final float f28493c;
    public final KeyEvent.Callback d;

    public ln0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f28491a = i10;
        this.d = callback;
        this.f28492b = z10;
        this.f28493c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f28491a) {
            case 0:
                on0 on0Var = (on0) this.d;
                dc1 dc1Var = on0Var.f29525e;
                on0Var.f29530h0 = null;
                boolean z10 = this.f28492b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                on0Var.f29531i0 = f7;
                for (int i10 = 0; i10 < dc1Var.getChildCount(); i10++) {
                    dc1Var.getChildAt(i10).invalidate();
                }
                dc1Var.invalidate();
                on0Var.p();
                if (!z10) {
                    float childCount = on0Var.f29533k0 * dc1Var.getChildCount();
                    float f10 = this.f28493c;
                    float scrollX = (on0Var.getScrollX() + f10) / (on0Var.f29532j0 * dc1Var.getChildCount());
                    float measuredWidth = (childCount - on0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f10 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    on0Var.f29534l0 = (on0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    on0Var.m0 = i11;
                    if (i11 < 0) {
                        on0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < dc1Var.getChildCount(); i12++) {
                        View childAt = dc1Var.getChildAt(i12);
                        if (childAt instanceof fy0) {
                            ((fy0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    on0Var.f29529g0 = false;
                    on0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    dc1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f28492b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28491a) {
            case 1:
                super.onAnimationStart(animator);
                wh.j jVar = ((wh.k) this.d).f50427y;
                jVar.setVisibility(0);
                if (this.f28492b) {
                    float f7 = this.f28493c;
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
