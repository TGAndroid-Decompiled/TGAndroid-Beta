package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class GroupCreateCheckBox extends View {
    public static final int f24008b = 0;
    public float f24009a;

    public float getProgress() {
        return this.f24009a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.j6.u0(0);
        throw null;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0 || this.f24009a == 0.0f) {
            return;
        }
        getMeasuredWidth();
        getMeasuredHeight();
        AndroidUtilities.dp(30.0f);
        throw null;
    }

    public void setProgress(float f7) {
        if (this.f24009a == f7) {
            return;
        }
        this.f24009a = f7;
        invalidate();
    }

    public void setCheckScale(float f7) {
    }

    public void setInnerRadDiff(int i10) {
    }
}
