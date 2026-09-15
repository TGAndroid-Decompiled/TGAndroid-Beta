package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class qq extends Drawable {
    public final Drawable f27418a;
    public final Paint f27419b;
    public final float f27420c;

    public qq(Context context, float f7) {
        Paint paint = new Paint(1);
        this.f27419b = paint;
        this.f27418a = context.getResources().getDrawable(R.drawable.msg_filled_menu_groups);
        paint.setColor(org.telegram.ui.ActionBar.i6.l1(0.1552f, -16777216));
        this.f27420c = f7;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7 = this.f27420c;
        canvas.drawRoundRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, f7, f7, this.f27419b);
        yf.p.e(this.f27418a, getBounds().exactCenterX(), getBounds().exactCenterY(), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), 17);
        this.f27418a.draw(canvas);
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
