package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class GroupCreateCheckBox extends View {
    public static final int f24909b = 0;
    public float f24910a;

    public float getProgress() {
        return this.f24910a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.k6.u0(0);
        throw null;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0 || this.f24910a == 0.0f) {
            return;
        }
        getMeasuredWidth();
        getMeasuredHeight();
        AndroidUtilities.dp(30.0f);
        throw null;
    }

    public void setProgress(float f10) {
        if (this.f24910a == f10) {
            return;
        }
        this.f24910a = f10;
        invalidate();
    }

    public void setCheckScale(float f10) {
    }

    public void setInnerRadDiff(int i10) {
    }
}
