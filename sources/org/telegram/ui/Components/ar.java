package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ar extends Drawable {
    public final Drawable f24704a;
    public final Paint f24705b;
    public final float f24706c;

    public ar(Context context, float f7) {
        Paint paint = new Paint(1);
        this.f24705b = paint;
        this.f24704a = context.getResources().getDrawable(R.drawable.msg_filled_menu_groups);
        paint.setColor(org.telegram.ui.ActionBar.h6.m1(0.1552f, -16777216));
        this.f24706c = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7 = this.f24706c;
        canvas.drawRoundRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, f7, f7, this.f24705b);
        zf.p.e(this.f24704a, getBounds().exactCenterX(), getBounds().exactCenterY(), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), 17);
        this.f24704a.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
