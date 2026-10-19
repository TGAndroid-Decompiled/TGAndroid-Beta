package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.qa1;
public final class dn0 extends AnimatorListenerAdapter {
    public final int f25598a;
    public final boolean f25599b;
    public final float f25600c;
    public final KeyEvent.Callback d;

    public dn0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f25598a = i10;
        this.d = callback;
        this.f25599b = z10;
        this.f25600c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f25598a) {
            case 0:
                gn0 gn0Var = (gn0) this.d;
                qa1 qa1Var = gn0Var.e;
                gn0Var.f26635h0 = null;
                boolean z10 = this.f25599b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                gn0Var.f26636i0 = f7;
                for (int i10 = 0; i10 < qa1Var.getChildCount(); i10++) {
                    qa1Var.getChildAt(i10).invalidate();
                }
                qa1Var.invalidate();
                gn0Var.p();
                if (!z10) {
                    float childCount = gn0Var.f26638k0 * qa1Var.getChildCount();
                    float f10 = this.f25600c;
                    float scrollX = (gn0Var.getScrollX() + f10) / (gn0Var.f26637j0 * qa1Var.getChildCount());
                    float measuredWidth = (childCount - gn0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f10 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    gn0Var.f26639l0 = (gn0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    gn0Var.m0 = i11;
                    if (i11 < 0) {
                        gn0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < qa1Var.getChildCount(); i12++) {
                        View childAt = qa1Var.getChildAt(i12);
                        if (childAt instanceof xx0) {
                            ((xx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    gn0Var.f26634g0 = false;
                    gn0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    qa1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f25599b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25598a) {
            case 1:
                super.onAnimationStart(animator);
                xh.i iVar = ((xh.j) this.d).f49855y;
                iVar.setVisibility(0);
                if (this.f25599b) {
                    float f7 = this.f25600c;
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
