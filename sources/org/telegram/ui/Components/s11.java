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
public final class s11 extends Drawable {
    public final Drawable f32334a;
    public final Paint f32335b = new Paint(1);
    public final RectF f32336c = new RectF();

    public s11(Context context) {
        this.f32334a = context.getResources().getDrawable(R.drawable.menu_topic_add).mutate();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f32335b;
        canvas.drawRoundRect(this.f32336c, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
        this.f32334a.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f32336c.set(rect);
        int centerX = rect.centerX() - AndroidUtilities.dp(12.0f);
        int centerY = rect.centerY() - AndroidUtilities.dp(12.0f);
        this.f32334a.setBounds(centerX, centerY, AndroidUtilities.dp(24.0f) + centerX, AndroidUtilities.dp(24.0f) + centerY);
    }

    @Override
    public final void setAlpha(int i9) {
        this.f32335b.setAlpha(i9);
        this.f32334a.setAlpha(i9);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
