package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class k0 extends Drawable {
    public final Drawable f24527a;
    public final Drawable f24528b;
    public final d6 f24529c = new d6(new j0(this, 0), 1200, wr.h, 0);

    public k0(Context context) {
        this.f24527a = context.getResources().getDrawable(R.drawable.input_ai).mutate();
        this.f24528b = context.getResources().getDrawable(R.drawable.input_ai_star).mutate();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.f24527a;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        float d = this.f24529c.d(1.0f, false);
        float width = (bounds.width() * 0.352f) + bounds.left;
        float height = (bounds.height() * 0.248f) + bounds.top;
        float width2 = bounds.width() * 0.105f * ((float) (1.0d - Math.sin(AndroidUtilities.cascade(d, 0.0f, 2.0f, 1.5f) * 3.141592653589793d)));
        float width3 = (bounds.width() * 0.215f) + bounds.left;
        float height2 = (bounds.height() * 0.43f) + bounds.top;
        float width4 = bounds.width() * 0.09f * ((float) (1.0d - Math.sin(AndroidUtilities.cascade(d, 1.0f, 2.0f, 1.5f) * 3.141592653589793d)));
        int i10 = (int) (height + width2);
        Drawable drawable2 = this.f24528b;
        drawable2.setBounds((int) (width - width2), (int) (height - width2), (int) (width + width2), i10);
        drawable2.draw(canvas);
        drawable2.setBounds((int) (width3 - width4), (int) (height2 - width4), (int) (width3 + width4), (int) (height2 + width4));
        drawable2.draw(canvas);
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f24527a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f24527a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f24527a.setAlpha(i10);
        this.f24528b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24527a.setColorFilter(colorFilter);
        this.f24528b.setColorFilter(colorFilter);
    }
}
