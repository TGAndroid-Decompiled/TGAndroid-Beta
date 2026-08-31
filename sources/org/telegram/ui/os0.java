package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class os0 extends ViewOutlineProvider {
    public final int f39836a;
    public final float f39837b;
    public final Object f39838c;

    public os0(Object obj, float f10, int i10) {
        this.f39836a = i10;
        this.f39838c = obj;
        this.f39837b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f39836a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f39837b) * ((Float) ((ValueAnimator) this.f39838c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f39837b) * (1.0f - ((PhotoViewer) this.f39838c).T) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
