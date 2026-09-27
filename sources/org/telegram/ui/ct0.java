package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ct0 extends ViewOutlineProvider {
    public final int f32790a;
    public final float f32791b;
    public final Object f32792c;

    public ct0(Object obj, float f7, int i10) {
        this.f32790a = i10;
        this.f32792c = obj;
        this.f32791b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f32790a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f32791b) * ((Float) ((ValueAnimator) this.f32792c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f32791b) * (1.0f - ((PhotoViewer) this.f32792c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
