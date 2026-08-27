package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class eq extends Drawable {

    public final Drawable f28116a;

    public final Paint f28117b;

    public final float f28118c;

    public eq(Context context, float f10) {
        Paint paint = new Paint(1);
        this.f28117b = paint;
        this.f28116a = context.getResources().getDrawable(R.drawable.msg_filled_menu_groups);
        paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1552f, -16777216));
        this.f28118c = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10 = getBounds().left;
        float f11 = getBounds().top;
        float f12 = getBounds().right;
        float f13 = getBounds().bottom;
        float f14 = this.f28118c;
        canvas.drawRoundRect(f10, f11, f12, f13, f14, f14, this.f28117b);
        gf.s.e(this.f28116a, getBounds().exactCenterX(), getBounds().exactCenterY(), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), 17);
        this.f28116a.draw(canvas);
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
