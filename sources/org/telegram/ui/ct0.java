package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ct0 extends ViewOutlineProvider {
    public final int f35546a;
    public final float f35547b;
    public final Object f35548c;

    public ct0(Object obj, float f7, int i10) {
        this.f35546a = i10;
        this.f35548c = obj;
        this.f35547b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f35546a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f35547b) * ((Float) ((ValueAnimator) this.f35548c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f35547b) * (1.0f - ((PhotoViewer) this.f35548c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
