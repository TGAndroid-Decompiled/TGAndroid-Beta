package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ns0 extends ViewOutlineProvider {
    public final int f39676a;
    public final float f39677b;
    public final Object f39678c;

    public ns0(Object obj, float f7, int i10) {
        this.f39676a = i10;
        this.f39678c = obj;
        this.f39677b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f39676a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f39677b) * ((Float) ((ValueAnimator) this.f39678c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f39677b) * (1.0f - ((PhotoViewer) this.f39678c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
