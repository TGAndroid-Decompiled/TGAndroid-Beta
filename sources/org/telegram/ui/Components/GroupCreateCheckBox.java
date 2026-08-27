package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public class GroupCreateCheckBox extends View {

    public static final int f26406b = 0;

    public float f26407a;

    public float getProgress() {
        return this.f26407a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.g6.w0(null, 0, false);
        throw null;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() == 0 && this.f26407a != 0.0f) {
            getMeasuredWidth();
            getMeasuredHeight();
            AndroidUtilities.dp(30.0f);
            throw null;
        }
    }

    public void setProgress(float f10) {
        if (this.f26407a == f10) {
            return;
        }
        this.f26407a = f10;
        invalidate();
    }

    public void setCheckScale(float f10) {
    }

    public void setInnerRadDiff(int i10) {
    }
}
