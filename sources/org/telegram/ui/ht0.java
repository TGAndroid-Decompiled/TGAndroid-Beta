package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ht0 extends ViewOutlineProvider {
    public final int f34302a;
    public final float f34303b;
    public final Object f34304c;

    public ht0(Object obj, float f7, int i10) {
        this.f34302a = i10;
        this.f34304c = obj;
        this.f34303b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f34302a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f34303b) * ((Float) ((ValueAnimator) this.f34304c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f34303b) * (1.0f - ((PhotoViewer) this.f34304c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
