package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class gt0 extends ViewOutlineProvider {
    public final int f36778a;
    public final float f36779b;
    public final Object f36780c;

    public gt0(Object obj, float f7, int i10) {
        this.f36778a = i10;
        this.f36780c = obj;
        this.f36779b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f36778a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f36779b) * ((Float) ((ValueAnimator) this.f36780c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f36779b) * (1.0f - ((PhotoViewer) this.f36780c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
