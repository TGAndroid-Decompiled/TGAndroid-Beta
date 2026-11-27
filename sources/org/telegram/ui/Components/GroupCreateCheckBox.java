package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Typeface;
import android.view.View;
import java.util.HashSet;
public class GroupCreateCheckBox extends View implements snb {
    public float a;

    public float getProgress() {
        return this.a;
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
        if (getVisibility() != 0 || this.a == 0.0f) {
            return;
        }
        getMeasuredWidth();
        getMeasuredHeight();
        Typeface typeface = hl.a;
        throw null;
    }

    public void setProgress(float f) {
        if (this.a == f) {
            return;
        }
        this.a = f;
        invalidate();
    }

    @Override
    public final void updateColors() {
        aob.u0(0);
        throw null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCheckScale(float f) {
    }

    public void setInnerRadDiff(int i) {
    }
}
