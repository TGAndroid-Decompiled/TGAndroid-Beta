package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.ui.ActionBar.Theme;

public class CommunityAvatarDrawable extends Drawable {
    private final Drawable drawable;
    private final Paint paint;
    private float radius;

    @Override
    public int getOpacity() {
        return -3;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public CommunityAvatarDrawable(Context context, float f) {
        Paint paint = new Paint(1);
        this.paint = paint;
        this.drawable = context.getResources().getDrawable(R.drawable.msg_filled_menu_groups);
        paint.setColor(Theme.multAlpha(-16777216, 0.1552f));
        this.radius = f;
    }

    @Override
    public void draw(Canvas canvas) {
        float f = getBounds().left;
        float f2 = getBounds().top;
        float f3 = getBounds().right;
        float f4 = getBounds().bottom;
        float f5 = this.radius;
        canvas.drawRoundRect(f, f2, f3, f4, f5, f5, this.paint);
        DrawableUtils.setBounds(this.drawable, getBounds().exactCenterX(), getBounds().exactCenterY(), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), 17);
        this.drawable.draw(canvas);
    }
}
