package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ct0 extends ViewOutlineProvider {
    public final int f35544a;
    public final float f35545b;
    public final Object f35546c;

    public ct0(Object obj, float f7, int i10) {
        this.f35544a = i10;
        this.f35546c = obj;
        this.f35545b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f35544a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f35545b) * ((Float) ((ValueAnimator) this.f35546c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f35545b) * (1.0f - ((PhotoViewer) this.f35546c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
