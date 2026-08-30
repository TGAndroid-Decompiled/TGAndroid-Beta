package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ms0 extends ViewOutlineProvider {
    public final int f36376a;
    public final float f36377b;
    public final Object f36378c;

    public ms0(Object obj, float f10, int i10) {
        this.f36376a = i10;
        this.f36378c = obj;
        this.f36377b = f10;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f36376a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f36377b) * ((Float) ((ValueAnimator) this.f36378c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f36377b) * (1.0f - ((PhotoViewer) this.f36378c).T) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
