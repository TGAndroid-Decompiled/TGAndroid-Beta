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

public final class v11 extends Drawable {

    public final Drawable f33251a;

    public final Paint f33252b = new Paint(1);

    public final RectF f33253c = new RectF();

    public v11(Context context) {
        this.f33251a = context.getResources().getDrawable(R.drawable.menu_topic_add).mutate();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.drawRoundRect(this.f33253c, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.f33252b);
        this.f33251a.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f33253c.set(rect);
        int iCenterX = rect.centerX() - AndroidUtilities.dp(12.0f);
        int iCenterY = rect.centerY() - AndroidUtilities.dp(12.0f);
        this.f33251a.setBounds(iCenterX, iCenterY, AndroidUtilities.dp(24.0f) + iCenterX, AndroidUtilities.dp(24.0f) + iCenterY);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f33252b.setAlpha(i10);
        this.f33251a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
