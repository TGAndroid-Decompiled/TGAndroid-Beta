package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.ui.ActionBar.Theme;

public final class CommunityAvatarDrawable extends Drawable {
    public final Drawable drawable;
    public final Paint paint;
    public final float radius;

    public CommunityAvatarDrawable(Context context, float f) {
        Paint paint = new Paint(1);
        this.paint = paint;
        this.drawable = context.getResources().getDrawable(R.drawable.msg_filled_menu_groups);
        paint.setColor(Theme.multAlpha(0.1552f, -16777216));
        this.radius = f;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f = getBounds().left;
        float f2 = getBounds().top;
        float f3 = getBounds().right;
        float f4 = getBounds().bottom;
        Paint paint = this.paint;
        float f5 = this.radius;
        canvas.drawRoundRect(f, f2, f3, f4, f5, f5, paint);
        float fExactCenterX = getBounds().exactCenterX();
        float fExactCenterY = getBounds().exactCenterY();
        int iDp = AndroidUtilities.dp(36.0f);
        int iDp2 = AndroidUtilities.dp(36.0f);
        Drawable drawable = this.drawable;
        if (drawable != null) {
            Rect rect = DrawableUtils.tmpRect;
            DrawableUtils.setBounds(rect, fExactCenterX, fExactCenterY, iDp, iDp2, 17);
            drawable.setBounds(rect);
        } else {
            Rect rect2 = DrawableUtils.tmpRect;
        }
        drawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
