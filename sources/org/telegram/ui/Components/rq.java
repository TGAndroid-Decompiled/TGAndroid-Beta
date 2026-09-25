package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class rq extends Drawable {
    public final Drawable f28026a;
    public final Paint f28027b;
    public final float f28028c;

    public rq(Context context, float f7) {
        Paint paint = new Paint(1);
        this.f28027b = paint;
        this.f28026a = context.getResources().getDrawable(R.drawable.msg_filled_menu_groups);
        paint.setColor(org.telegram.ui.ActionBar.h6.l1(0.1552f, -16777216));
        this.f28028c = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7 = this.f28028c;
        canvas.drawRoundRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, f7, f7, this.f28027b);
        yf.p.e(this.f28026a, getBounds().exactCenterX(), getBounds().exactCenterY(), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), 17);
        this.f28026a.draw(canvas);
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
