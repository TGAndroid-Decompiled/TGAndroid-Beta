package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ht0 extends ViewOutlineProvider {
    public final int f34234a;
    public final float f34235b;
    public final Object f34236c;

    public ht0(Object obj, float f7, int i10) {
        this.f34234a = i10;
        this.f34236c = obj;
        this.f34235b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f34234a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f34235b) * ((Float) ((ValueAnimator) this.f34236c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f34235b) * (1.0f - ((PhotoViewer) this.f34236c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
