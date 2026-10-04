package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ct0 extends ViewOutlineProvider {
    public final int f35547a;
    public final float f35548b;
    public final Object f35549c;

    public ct0(Object obj, float f7, int i10) {
        this.f35547a = i10;
        this.f35549c = obj;
        this.f35548b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f35547a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f35548b) * ((Float) ((ValueAnimator) this.f35549c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f35548b) * (1.0f - ((PhotoViewer) this.f35549c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
