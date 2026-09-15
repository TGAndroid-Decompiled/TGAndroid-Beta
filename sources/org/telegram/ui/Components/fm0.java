package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.bc1;
public final class fm0 extends AnimatorListenerAdapter {
    public final int f24017a;
    public final boolean f24018b;
    public final float f24019c;
    public final KeyEvent.Callback d;

    public fm0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f24017a = i10;
        this.d = callback;
        this.f24018b = z10;
        this.f24019c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f24017a) {
            case 0:
                im0 im0Var = (im0) this.d;
                bc1 bc1Var = im0Var.e;
                im0Var.f25065h0 = null;
                boolean z10 = this.f24018b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                im0Var.f25066i0 = f7;
                for (int i10 = 0; i10 < bc1Var.getChildCount(); i10++) {
                    bc1Var.getChildAt(i10).invalidate();
                }
                bc1Var.invalidate();
                im0Var.p();
                if (!z10) {
                    float childCount = im0Var.f25068k0 * bc1Var.getChildCount();
                    float f10 = this.f24019c;
                    float scrollX = (im0Var.getScrollX() + f10) / (im0Var.f25067j0 * bc1Var.getChildCount());
                    float measuredWidth = (childCount - im0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    im0Var.f25069l0 = (im0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    im0Var.m0 = i11;
                    if (i11 < 0) {
                        im0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < bc1Var.getChildCount(); i12++) {
                        View childAt = bc1Var.getChildAt(i12);
                        if (childAt instanceof dx0) {
                            ((dx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    im0Var.f25064g0 = false;
                    im0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    bc1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f24018b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f24017a) {
            case 1:
                super.onAnimationStart(animator);
                wh.l lVar = ((wh.m) this.d).f45110y;
                lVar.setVisibility(0);
                if (this.f24018b) {
                    float f7 = this.f24019c;
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
