package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

public final class fs0 extends ViewOutlineProvider {

    public final int f38200a;

    public final float f38201b;

    public final Object f38202c;

    public fs0(Object obj, float f10, int i10) {
        this.f38200a = i10;
        this.f38202c = obj;
        this.f38201b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f38200a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f38201b) * ((Float) ((ValueAnimator) this.f38202c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                break;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f38201b) * (1.0f - ((PhotoViewer) this.f38202c).S) * AndroidUtilities.dp(10.0f));
                break;
        }
    }
}
