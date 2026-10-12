package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.fc1;
public final class rn0 extends AnimatorListenerAdapter {
    public final int f30192a;
    public final boolean f30193b;
    public final float f30194c;
    public final KeyEvent.Callback d;

    public rn0(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f30192a = i10;
        this.d = callback;
        this.f30193b = z10;
        this.f30194c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f30192a) {
            case 0:
                un0 un0Var = (un0) this.d;
                fc1 fc1Var = un0Var.f31206e;
                un0Var.f31211h0 = null;
                boolean z10 = this.f30193b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                un0Var.f31212i0 = f7;
                for (int i10 = 0; i10 < fc1Var.getChildCount(); i10++) {
                    fc1Var.getChildAt(i10).invalidate();
                }
                fc1Var.invalidate();
                un0Var.p();
                if (!z10) {
                    float childCount = un0Var.f31214k0 * fc1Var.getChildCount();
                    float f10 = this.f30194c;
                    float scrollX = (un0Var.getScrollX() + f10) / (un0Var.f31213j0 * fc1Var.getChildCount());
                    float measuredWidth = (childCount - un0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f10 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    un0Var.f31215l0 = (un0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    un0Var.m0 = i11;
                    if (i11 < 0) {
                        un0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < fc1Var.getChildCount(); i12++) {
                        View childAt = fc1Var.getChildAt(i12);
                        if (childAt instanceof ly0) {
                            ((ly0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    un0Var.f31210g0 = false;
                    un0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    fc1Var.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.f30193b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f30192a) {
            case 1:
                super.onAnimationStart(animator);
                wh.j jVar = ((wh.k) this.d).f50664y;
                jVar.setVisibility(0);
                if (this.f30193b) {
                    float f7 = this.f30194c;
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
