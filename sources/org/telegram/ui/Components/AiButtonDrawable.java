package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class AiButtonDrawable extends Drawable {
    public final AnimatedFloat animation = new AnimatedFloat(new AiButtonDrawable$$ExternalSyntheticLambda0(this, 0), 1200, CubicBezierInterpolator.EASE_OUT_QUINT, 0);
    public final Drawable base;
    public final Drawable star;

    public AiButtonDrawable(Context context) {
        this.base = context.getResources().getDrawable(R.drawable.input_ai).mutate();
        this.star = context.getResources().getDrawable(R.drawable.input_ai_star).mutate();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.base;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        float f = this.animation.set(1.0f, false);
        float fWidth = (bounds.width() * 0.352f) + bounds.left;
        float fHeight = (bounds.height() * 0.248f) + bounds.top;
        float fWidth2 = bounds.width() * 0.105f * ((float) (1.0d - Math.sin(((double) AndroidUtilities.cascade(f, 0.0f, 2.0f, 1.5f)) * 3.141592653589793d)));
        float fWidth3 = (bounds.width() * 0.215f) + bounds.left;
        float fHeight2 = (bounds.height() * 0.43f) + bounds.top;
        float fWidth4 = bounds.width() * 0.09f * ((float) (1.0d - Math.sin(((double) AndroidUtilities.cascade(f, 1.0f, 2.0f, 1.5f)) * 3.141592653589793d)));
        int i = (int) (fWidth - fWidth2);
        int i2 = (int) (fHeight - fWidth2);
        int i3 = (int) (fWidth + fWidth2);
        int i4 = (int) (fHeight + fWidth2);
        Drawable drawable2 = this.star;
        drawable2.setBounds(i, i2, i3, i4);
        drawable2.draw(canvas);
        drawable2.setBounds((int) (fWidth3 - fWidth4), (int) (fHeight2 - fWidth4), (int) (fWidth3 + fWidth4), (int) (fHeight2 + fWidth4));
        drawable2.draw(canvas);
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.base.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.base.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.base.setAlpha(i);
        this.star.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.base.setColorFilter(colorFilter);
        this.star.setColorFilter(colorFilter);
    }
}
