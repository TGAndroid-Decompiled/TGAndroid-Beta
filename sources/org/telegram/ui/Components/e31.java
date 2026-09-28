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
public final class e31 extends Drawable {
    public final Drawable f23847a;
    public final Paint f23848b = new Paint(1);
    public final RectF f23849c = new RectF();

    public e31(Context context) {
        this.f23847a = context.getResources().getDrawable(R.drawable.menu_topic_add).mutate();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f23848b;
        canvas.drawRoundRect(this.f23849c, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
        this.f23847a.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f23849c.set(rect);
        int centerX = rect.centerX() - AndroidUtilities.dp(12.0f);
        int centerY = rect.centerY() - AndroidUtilities.dp(12.0f);
        this.f23847a.setBounds(centerX, centerY, AndroidUtilities.dp(24.0f) + centerX, AndroidUtilities.dp(24.0f) + centerY);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f23848b.setAlpha(i10);
        this.f23847a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
