package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class oq extends Drawable {
    public final Drawable f27642a;
    public final Paint f27643b;
    public final float f27644c;

    public oq(Context context, float f10) {
        Paint paint = new Paint(1);
        this.f27643b = paint;
        this.f27642a = context.getResources().getDrawable(R.drawable.msg_filled_menu_groups);
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1552f, -16777216));
        this.f27644c = f10;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10 = this.f27644c;
        canvas.drawRoundRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, f10, f10, this.f27643b);
        lf.r.e(this.f27642a, getBounds().exactCenterX(), getBounds().exactCenterY(), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), 17);
        this.f27642a.draw(canvas);
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
