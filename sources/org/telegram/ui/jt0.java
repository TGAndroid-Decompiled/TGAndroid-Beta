package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class jt0 extends ViewOutlineProvider {
    public final int f34932a;
    public final float f34933b;
    public final Object f34934c;

    public jt0(Object obj, float f7, int i10) {
        this.f34932a = i10;
        this.f34934c = obj;
        this.f34933b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f34932a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f34933b) * ((Float) ((ValueAnimator) this.f34934c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f34933b) * (1.0f - ((PhotoViewer) this.f34934c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
