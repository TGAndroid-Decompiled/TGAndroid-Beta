package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ht0 extends ViewOutlineProvider {
    public final int f34340a;
    public final float f34341b;
    public final Object f34342c;

    public ht0(Object obj, float f7, int i10) {
        this.f34340a = i10;
        this.f34342c = obj;
        this.f34341b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f34340a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f34341b) * ((Float) ((ValueAnimator) this.f34342c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f34341b) * (1.0f - ((PhotoViewer) this.f34342c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
