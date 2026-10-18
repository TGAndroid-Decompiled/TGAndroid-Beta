package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class ps0 extends ViewOutlineProvider {
    public final int f40198a;
    public final float f40199b;
    public final Object f40200c;

    public ps0(Object obj, float f7, int i10) {
        this.f40198a = i10;
        this.f40200c = obj;
        this.f40199b = f7;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f40198a) {
            case 0:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40199b) * ((Float) ((ValueAnimator) this.f40200c).getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f));
                return;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / this.f40199b) * (1.0f - ((PhotoViewer) this.f40200c).W) * AndroidUtilities.dp(10.0f));
                return;
        }
    }
}
