package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class gt0 extends ViewOutlineProvider {
    public final int f38194a;
    public final float f38195b;
    public final Object f38196c;

    public gt0(Object obj, float f7, int i10) {
        this.f38194a = i10;
        this.f38196c = obj;
        this.f38195b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f38194a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f38195b) * ((Float) ((ValueAnimator) this.f38196c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f38195b) * (1.0f - ((PhotoViewer) this.f38196c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
