package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class q31 extends Drawable {
    public final Drawable f28503a;
    public final Paint f28504b = new Paint(1);
    public final RectF f28505c = new RectF();

    public q31(Context context) {
        this.f28503a = context.getResources().getDrawable(R.drawable.menu_topic_add).mutate();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f28504b;
        canvas.drawRoundRect(this.f28505c, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
        this.f28503a.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f28505c.set(rect);
        int centerX = rect.centerX() - AndroidUtilities.dp(12.0f);
        int centerY = rect.centerY() - AndroidUtilities.dp(12.0f);
        this.f28503a.setBounds(centerX, centerY, AndroidUtilities.dp(24.0f) + centerX, AndroidUtilities.dp(24.0f) + centerY);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28504b.setAlpha(i10);
        this.f28503a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
