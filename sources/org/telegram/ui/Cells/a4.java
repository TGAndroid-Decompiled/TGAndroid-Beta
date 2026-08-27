package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.R;

public final class a4 extends Drawable {

    public final Drawable[] f24059a;

    public a4(Context context) {
        this.f24059a = new Drawable[]{drawableMutate, context.getResources().getDrawable(R.drawable.verified_check).mutate()};
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.verified_area).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-9063442, PorterDuff.Mode.MULTIPLY));
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f24059a;
            if (i10 >= drawableArr.length) {
                return;
            }
            drawableArr[i10].setBounds(getBounds());
            drawableArr[i10].draw(canvas);
            i10++;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f24059a[0].getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f24059a[0].getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f24059a;
            if (i11 >= drawableArr.length) {
                return;
            }
            drawableArr[i11].setAlpha(i10);
            i11++;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
