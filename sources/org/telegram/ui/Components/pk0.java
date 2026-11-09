package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
public final class pk0 extends AnimatorListenerAdapter {
    public final int f37033a;
    public final boolean f37034b;
    public final float f37035c;
    public final KeyEvent.Callback d;

    public pk0(KeyEvent.Callback callback, boolean z9, float f10, int i7) {
        this.f37033a = i7;
        this.d = callback;
        this.f37034b = z9;
        this.f37035c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f37033a) {
            case 0:
                sk0 sk0Var = (sk0) this.d;
                org.telegram.ui.d61 d61Var = sk0Var.f38101e;
                sk0Var.f38106h0 = null;
                boolean z9 = this.f37034b;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                sk0Var.f38107i0 = f10;
                for (int i7 = 0; i7 < d61Var.getChildCount(); i7++) {
                    d61Var.getChildAt(i7).invalidate();
                }
                d61Var.invalidate();
                sk0Var.p();
                if (!z9) {
                    float childCount = sk0Var.f38109k0 * d61Var.getChildCount();
                    float f11 = this.f37035c;
                    float scrollX = (sk0Var.getScrollX() + f11) / (sk0Var.f38108j0 * d61Var.getChildCount());
                    float measuredWidth = (childCount - sk0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f11 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f12 = childCount * scrollX;
                    if (f12 - f11 < 0.0f) {
                        f12 = f11;
                    }
                    sk0Var.f38110l0 = (sk0Var.getScrollX() + f11) - f12;
                    int i10 = (int) (f12 - f11);
                    sk0Var.m0 = i10;
                    if (i10 < 0) {
                        sk0Var.m0 = 0;
                    }
                    for (int i11 = 0; i11 < d61Var.getChildCount(); i11++) {
                        View childAt = d61Var.getChildAt(i11);
                        if (childAt instanceof hv0) {
                            ((hv0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = org.telegram.messenger.g0.L(33.0f);
                    }
                    sk0Var.f38105g0 = false;
                    sk0Var.getLayoutParams().height = org.telegram.messenger.g0.L(36.0f);
                    d61Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f37034b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37033a) {
            case 1:
                super.onAnimationStart(animator);
                yh.k kVar = ((yh.l) this.d).D;
                kVar.setVisibility(0);
                if (this.f37034b) {
                    float f10 = this.f37035c;
                    kVar.setScaleX(f10);
                    kVar.setScaleY(f10);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
