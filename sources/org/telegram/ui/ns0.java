package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ns0 extends ViewOutlineProvider {
    public final int f39685a;
    public final float f39686b;
    public final Object f39687c;

    public ns0(Object obj, float f7, int i10) {
        this.f39685a = i10;
        this.f39687c = obj;
        this.f39686b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f39685a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f39686b) * ((Float) ((ValueAnimator) this.f39687c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f39686b) * (1.0f - ((PhotoViewer) this.f39687c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
