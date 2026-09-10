package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.R;
public final class c4 extends Drawable {
    public final Drawable[] f18964a;

    public c4(Context context) {
        this.f18964a = r0;
        Drawable mutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-9063442, PorterDuff.Mode.MULTIPLY));
        Drawable[] drawableArr = {mutate, context.getResources().getDrawable(R.drawable.verified_check).mutate()};
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f18964a;
            if (i10 < drawableArr.length) {
                drawableArr[i10].setBounds(getBounds());
                drawableArr[i10].draw(canvas);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f18964a[0].getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f18964a[0].getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f18964a;
            if (i11 < drawableArr.length) {
                drawableArr[i11].setAlpha(i10);
                i11++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
