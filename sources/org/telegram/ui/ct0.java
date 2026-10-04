package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ct0 extends ViewOutlineProvider {
    public final int f35552a;
    public final float f35553b;
    public final Object f35554c;

    public ct0(Object obj, float f7, int i10) {
        this.f35552a = i10;
        this.f35554c = obj;
        this.f35553b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f35552a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f35553b) * ((Float) ((ValueAnimator) this.f35554c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f35553b) * (1.0f - ((PhotoViewer) this.f35554c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
