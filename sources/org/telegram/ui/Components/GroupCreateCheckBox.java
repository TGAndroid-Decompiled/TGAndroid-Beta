package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class GroupCreateCheckBox extends View {
    public static final int f26421b = 0;
    public float f26422a;

    public float getProgress() {
        return this.f26422a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.g6.u0(0);
        throw null;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0 || this.f26422a == 0.0f) {
            return;
        }
        getMeasuredWidth();
        getMeasuredHeight();
        AndroidUtilities.dp(30.0f);
        throw null;
    }

    public void setProgress(float f9) {
        if (this.f26422a == f9) {
            return;
        }
        this.f26422a = f9;
        invalidate();
    }

    public void setCheckScale(float f9) {
    }

    public void setInnerRadDiff(int i10) {
    }
}
