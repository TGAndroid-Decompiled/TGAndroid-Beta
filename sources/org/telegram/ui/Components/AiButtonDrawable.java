package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public class AiButtonDrawable extends Drawable {
    private final AnimatedFloat animation = new AnimatedFloat(new AiButtonDrawable$$ExternalSyntheticLambda0(this, 0), 0, 1200, CubicBezierInterpolator.EASE_OUT_QUINT);
    private final Drawable base;
    private final Drawable star;

    public AiButtonDrawable(Context context) {
        this.base = context.getResources().getDrawable(R.drawable.input_ai).mutate();
        this.star = context.getResources().getDrawable(R.drawable.input_ai_star).mutate();
    }

    public void animate() {
        this.animation.force(0.0f);
        invalidateSelf();
    }

    @Override
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.base.setBounds(bounds);
        this.base.draw(canvas);
        float f = this.animation.set(1.0f);
        float fWidth = (bounds.width() * 0.352f) + bounds.left;
        float fHeight = (bounds.height() * 0.248f) + bounds.top;
        float fWidth2 = bounds.width() * 0.105f * ((float) (1.0d - Math.sin(((double) AndroidUtilities.cascade(f, 0.0f, 2.0f, 1.5f)) * 3.141592653589793d)));
        float fWidth3 = (bounds.width() * 0.215f) + bounds.left;
        float fHeight2 = (bounds.height() * 0.43f) + bounds.top;
        float fWidth4 = bounds.width() * 0.09f * ((float) (1.0d - Math.sin(((double) AndroidUtilities.cascade(f, 1.0f, 2.0f, 1.5f)) * 3.141592653589793d)));
        this.star.setBounds((int) (fWidth - fWidth2), (int) (fHeight - fWidth2), (int) (fWidth + fWidth2), (int) (fHeight + fWidth2));
        this.star.draw(canvas);
        this.star.setBounds((int) (fWidth3 - fWidth4), (int) (fHeight2 - fWidth4), (int) (fWidth3 + fWidth4), (int) (fHeight2 + fWidth4));
        this.star.draw(canvas);
    }

    @Override
    public int getIntrinsicHeight() {
        return this.base.getIntrinsicHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        return this.base.getIntrinsicWidth();
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
        this.base.setAlpha(i);
        this.star.setAlpha(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.base.setColorFilter(colorFilter);
        this.star.setColorFilter(colorFilter);
    }
}
