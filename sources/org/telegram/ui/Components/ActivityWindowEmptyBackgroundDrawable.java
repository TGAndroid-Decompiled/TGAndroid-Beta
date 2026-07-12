package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

public class ActivityWindowEmptyBackgroundDrawable extends Drawable {
    private int mAlpha = 255;
    private ColorFilter mColorFilter;

    @Override
    public void draw(Canvas canvas) {
    }

    @Override
    public int getOpacity() {
        return -1;
    }

    @Override
    public void setAlpha(int i) {
        this.mAlpha = i;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.mColorFilter = colorFilter;
    }

    @Override
    public ColorFilter getColorFilter() {
        return this.mColorFilter;
    }

    @Override
    public int getAlpha() {
        return this.mAlpha;
    }
}
