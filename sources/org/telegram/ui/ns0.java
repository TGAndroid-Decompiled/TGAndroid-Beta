package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ns0 extends ViewOutlineProvider {
    public final int f39682a;
    public final float f39683b;
    public final Object f39684c;

    public ns0(Object obj, float f7, int i10) {
        this.f39682a = i10;
        this.f39684c = obj;
        this.f39683b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f39682a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f39683b) * ((Float) ((ValueAnimator) this.f39684c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f39683b) * (1.0f - ((PhotoViewer) this.f39684c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
