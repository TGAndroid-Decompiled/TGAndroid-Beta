package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class kq extends Drawable {
    public final Drawable f30129a;
    public final Paint f30130b;
    public final float f30131c;

    public kq(Context context, float f9) {
        Paint paint = new Paint(1);
        this.f30130b = paint;
        this.f30129a = context.getResources().getDrawable(R.drawable.msg_filled_menu_groups);
        paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1552f, -16777216));
        this.f30131c = f9;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f9 = this.f30131c;
        canvas.drawRoundRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, f9, f9, this.f30130b);
        jf.r.e(this.f30129a, getBounds().exactCenterX(), getBounds().exactCenterY(), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), 17);
        this.f30129a.draw(canvas);
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
