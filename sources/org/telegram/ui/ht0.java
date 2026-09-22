package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ht0 extends ViewOutlineProvider {
    public final int f34353a;
    public final float f34354b;
    public final Object f34355c;

    public ht0(Object obj, float f7, int i10) {
        this.f34353a = i10;
        this.f34355c = obj;
        this.f34354b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f34353a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f34354b) * ((Float) ((ValueAnimator) this.f34355c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f34354b) * (1.0f - ((PhotoViewer) this.f34355c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
