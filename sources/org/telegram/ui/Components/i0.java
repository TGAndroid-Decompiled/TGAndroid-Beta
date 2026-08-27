package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class i0 extends Drawable {

    public final Drawable f29191a;

    public final Drawable f29192b;

    public final y5 f29193c = new y5(new h0(this, 0), 1200, er.h, 0);

    public i0(Context context) {
        this.f29191a = context.getResources().getDrawable(R.drawable.input_ai).mutate();
        this.f29192b = context.getResources().getDrawable(R.drawable.input_ai_star).mutate();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.f29191a;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        float fD = this.f29193c.d(1.0f, false);
        float fWidth = (bounds.width() * 0.352f) + bounds.left;
        float fHeight = (bounds.height() * 0.248f) + bounds.top;
        float fWidth2 = bounds.width() * 0.105f * ((float) (1.0d - Math.sin(((double) AndroidUtilities.cascade(fD, 0.0f, 2.0f, 1.5f)) * 3.141592653589793d)));
        float fWidth3 = (bounds.width() * 0.215f) + bounds.left;
        float fHeight2 = (bounds.height() * 0.43f) + bounds.top;
        float fWidth4 = bounds.width() * 0.09f * ((float) (1.0d - Math.sin(((double) AndroidUtilities.cascade(fD, 1.0f, 2.0f, 1.5f)) * 3.141592653589793d)));
        int i10 = (int) (fWidth - fWidth2);
        int i11 = (int) (fHeight - fWidth2);
        int i12 = (int) (fWidth + fWidth2);
        int i13 = (int) (fHeight + fWidth2);
        Drawable drawable2 = this.f29192b;
        drawable2.setBounds(i10, i11, i12, i13);
        drawable2.draw(canvas);
        drawable2.setBounds((int) (fWidth3 - fWidth4), (int) (fHeight2 - fWidth4), (int) (fWidth3 + fWidth4), (int) (fHeight2 + fWidth4));
        drawable2.draw(canvas);
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f29191a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f29191a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f29191a.setAlpha(i10);
        this.f29192b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29191a.setColorFilter(colorFilter);
        this.f29192b.setColorFilter(colorFilter);
    }
}
