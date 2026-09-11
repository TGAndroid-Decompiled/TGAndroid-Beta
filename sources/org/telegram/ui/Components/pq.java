package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class pq extends Drawable {
    public final Drawable f29460a;
    public final Paint f29461b;
    public final float f29462c;

    public pq(Context context, float f7) {
        Paint paint = new Paint(1);
        this.f29461b = paint;
        this.f29460a = context.getResources().getDrawable(R.drawable.msg_filled_menu_groups);
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1552f, -16777216));
        this.f29462c = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7 = this.f29462c;
        canvas.drawRoundRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, f7, f7, this.f29461b);
        yf.p.e(this.f29460a, getBounds().exactCenterX(), getBounds().exactCenterY(), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), 17);
        this.f29460a.draw(canvas);
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
