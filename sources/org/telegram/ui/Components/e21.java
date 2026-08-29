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
public final class e21 extends Drawable {
    public final Drawable f27912a;
    public final Paint f27913b = new Paint(1);
    public final RectF f27914c = new RectF();

    public e21(Context context) {
        this.f27912a = context.getResources().getDrawable(R.drawable.menu_topic_add).mutate();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f27913b;
        canvas.drawRoundRect(this.f27914c, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
        this.f27912a.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f27914c.set(rect);
        int centerX = rect.centerX() - AndroidUtilities.dp(12.0f);
        int centerY = rect.centerY() - AndroidUtilities.dp(12.0f);
        this.f27912a.setBounds(centerX, centerY, AndroidUtilities.dp(24.0f) + centerX, AndroidUtilities.dp(24.0f) + centerY);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27913b.setAlpha(i10);
        this.f27912a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
