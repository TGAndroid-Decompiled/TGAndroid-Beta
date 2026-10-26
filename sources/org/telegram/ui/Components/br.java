package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class br extends Drawable {
    public final Drawable f26951a;
    public final Paint f26952b;
    public final float f26953c;

    public br(Context context, float f7) {
        Paint paint = new Paint(1);
        this.f26952b = paint;
        this.f26951a = context.getResources().getDrawable(R.drawable.msg_filled_menu_groups);
        paint.setColor(org.telegram.ui.ActionBar.y6.o1(0.1552f, -16777216));
        this.f26953c = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7 = this.f26953c;
        canvas.drawRoundRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, f7, f7, this.f26952b);
        ag.v.e(this.f26951a, getBounds().exactCenterX(), getBounds().exactCenterY(), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), 17);
        this.f26951a.draw(canvas);
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
