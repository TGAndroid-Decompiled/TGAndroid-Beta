package org.telegram.ui.community;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.ui.ActionBar.Theme;

public final class CommunityArrowDrawable extends Drawable {
    public int alpha = 255;
    public final Drawable arrowDrawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.settings_arrow).mutate();
    public int lastColor;

    @Override
    public final void draw(Canvas canvas) {
        float fExactCenterX = getBounds().exactCenterX();
        float fExactCenterY = getBounds().exactCenterY();
        int color = Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false);
        int color2 = Theme.getColor(null, Theme.key_windowBackgroundWhite, false);
        int i = this.lastColor;
        Drawable drawable = this.arrowDrawable;
        if (i != color2) {
            this.lastColor = color2;
            drawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
        }
        canvas.drawCircle(fExactCenterX, fExactCenterY, AndroidUtilities.dp(7.6666665f), Theme.fillingPaint(ColorUtils.setAlphaComponent(color2, this.alpha)));
        canvas.drawCircle(fExactCenterX, fExactCenterY, AndroidUtilities.dp(6.6666665f), Theme.fillingPaint(ColorUtils.setAlphaComponent(color, this.alpha)));
        DrawableUtils.setBounds(drawable, fExactCenterX, fExactCenterY, 17);
        canvas.translate(0.0f, AndroidUtilities.dp(0.66f));
        canvas.save();
        canvas.rotate(90.0f, fExactCenterX, fExactCenterY);
        DrawableUtils.drawWithScale(canvas, drawable, 0.8f);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.alpha;
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(13.333333f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(13.333333f);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i) {
        this.alpha = i;
        this.arrowDrawable.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
