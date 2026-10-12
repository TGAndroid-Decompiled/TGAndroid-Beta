package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class jt0 extends ViewOutlineProvider {
    public final int f39279a;
    public final float f39280b;
    public final Object f39281c;

    public jt0(Object obj, float f7, int i10) {
        this.f39279a = i10;
        this.f39281c = obj;
        this.f39280b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f39279a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f39280b) * ((Float) ((ValueAnimator) this.f39281c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f39280b) * (1.0f - ((PhotoViewer) this.f39281c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
