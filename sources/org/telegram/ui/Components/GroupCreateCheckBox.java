package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public class GroupCreateCheckBox extends View implements org.telegram.ui.ActionBar.p6 {
    public float f26185a;

    public float getProgress() {
        return this.f26185a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateColors();
        throw null;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0 || this.f26185a == 0.0f) {
            return;
        }
        getMeasuredWidth();
        getMeasuredHeight();
        AndroidUtilities.dp(30.0f);
        throw null;
    }

    public void setProgress(float f7) {
        if (this.f26185a == f7) {
            return;
        }
        this.f26185a = f7;
        invalidate();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.y6.v0(0);
        throw null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCheckScale(float f7) {
    }

    public void setInnerRadDiff(int i10) {
    }
}
