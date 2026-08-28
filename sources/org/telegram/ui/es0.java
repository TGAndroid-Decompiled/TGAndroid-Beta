package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class es0 extends ViewOutlineProvider {
    public final int f38020a;
    public final float f38021b;
    public final Object f38022c;

    public es0(Object obj, float f10, int i9) {
        this.f38020a = i9;
        this.f38022c = obj;
        this.f38021b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f38020a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f38021b) * ((Float) ((ValueAnimator) this.f38022c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f38021b) * (1.0f - ((PhotoViewer) this.f38022c).S) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
