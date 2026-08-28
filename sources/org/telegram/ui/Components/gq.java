package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class gq extends Drawable {
    public final Drawable f28836a;
    public final Paint f28837b;
    public final float f28838c;

    public gq(Context context, float f10) {
        Paint paint = new Paint(1);
        this.f28837b = paint;
        this.f28836a = context.getResources().getDrawable(R.drawable.msg_filled_menu_groups);
        paint.setColor(org.telegram.ui.ActionBar.f6.l1(0.1552f, -16777216));
        this.f28838c = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10 = this.f28838c;
        canvas.drawRoundRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, f10, f10, this.f28837b);
        ff.s.e(this.f28836a, getBounds().exactCenterX(), getBounds().exactCenterY(), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), 17);
        this.f28836a.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
