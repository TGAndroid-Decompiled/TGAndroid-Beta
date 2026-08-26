package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;

public final class RoundVideoPlayingDrawable extends Drawable {
    public float colorProgress;
    public final ChatMessageCell parentView;
    public Theme.ResourcesProvider resourcesProvider;
    public int timeColor;
    public long lastUpdateTime = 0;
    public boolean started = false;
    public final Paint paint = new Paint(1);
    public float progress1 = 0.47f;
    public float progress2 = 0.0f;
    public float progress3 = 0.32f;
    public int progress1Direction = 1;
    public int progress2Direction = 1;
    public int progress3Direction = 1;
    public int alpha = 255;

    public RoundVideoPlayingDrawable(ChatMessageCell chatMessageCell, Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        this.parentView = chatMessageCell;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.paint;
        paint.setColor(ColorUtils.blendARGB(this.colorProgress, Theme.getColor(Theme.key_chat_serviceText, this.resourcesProvider), this.timeColor));
        int i = this.alpha;
        if (i != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i));
        }
        int i2 = getBounds().left;
        int i3 = getBounds().top;
        int i4 = 0;
        while (i4 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i2, AndroidUtilities.dp((this.progress1 * 7.0f) + 2.0f) + i3, AndroidUtilities.dp(4.0f) + i2, AndroidUtilities.dp(10.0f) + i3, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i2, AndroidUtilities.dp((this.progress2 * 7.0f) + 2.0f) + i3, AndroidUtilities.dp(7.0f) + i2, AndroidUtilities.dp(10.0f) + i3, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i2, AndroidUtilities.dp((this.progress3 * 7.0f) + 2.0f) + i3, AndroidUtilities.dp(10.0f) + i2, AndroidUtilities.dp(10.0f) + i3, paint);
            i4++;
            canvas = canvas2;
        }
        if (this.started) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.lastUpdateTime;
            this.lastUpdateTime = jCurrentTimeMillis;
            if (j > 50) {
                j = 50;
            }
            float f = j;
            float f2 = ((f / 300.0f) * this.progress1Direction) + this.progress1;
            this.progress1 = f2;
            if (f2 > 1.0f) {
                this.progress1Direction = -1;
                this.progress1 = 1.0f;
            } else if (f2 < 0.0f) {
                this.progress1Direction = 1;
                this.progress1 = 0.0f;
            }
            float f3 = ((f / 310.0f) * this.progress2Direction) + this.progress2;
            this.progress2 = f3;
            if (f3 > 1.0f) {
                this.progress2Direction = -1;
                this.progress2 = 1.0f;
            } else if (f3 < 0.0f) {
                this.progress2Direction = 1;
                this.progress2 = 0.0f;
            }
            float f4 = ((f / 320.0f) * this.progress3Direction) + this.progress3;
            this.progress3 = f4;
            if (f4 > 1.0f) {
                this.progress3Direction = -1;
                this.progress3 = 1.0f;
            } else if (f4 < 0.0f) {
                this.progress3Direction = 1;
                this.progress3 = 0.0f;
            }
            this.parentView.invalidate();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void start() {
        if (this.started) {
            return;
        }
        this.lastUpdateTime = System.currentTimeMillis();
        this.started = true;
        this.parentView.invalidate();
    }

    public final void stop() {
        if (this.started) {
            this.started = false;
        }
    }
}
