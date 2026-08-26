package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public final class RoundStatusDrawable extends StatusDrawable {
    public final Paint currentPaint;
    public float progress;
    public boolean isChat = false;
    public long lastUpdateTime = 0;
    public boolean started = false;
    public int progressDirection = 1;

    public RoundStatusDrawable(boolean z) {
        if (z) {
            this.currentPaint = new Paint(1);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.currentPaint;
        if (paint == null) {
            paint = Theme.chat_statusPaint;
        }
        paint.setAlpha(((int) (this.progress * 200.0f)) + 55);
        canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.isChat ? 8.0f : 9.0f), AndroidUtilities.dp(4.0f), paint);
        if (this.started) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.lastUpdateTime;
            this.lastUpdateTime = jCurrentTimeMillis;
            if (j > 50) {
                j = 50;
            }
            float f = this.progress;
            int i = this.progressDirection;
            float f2 = ((((long) i) * j) / 400.0f) + f;
            this.progress = f2;
            if (i > 0 && f2 >= 1.0f) {
                this.progressDirection = -1;
                this.progress = 1.0f;
            } else if (i < 0 && f2 <= 0.0f) {
                this.progressDirection = 1;
                this.progress = 0.0f;
            }
            invalidateLimited();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(10.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColor(int i) {
        Paint paint = this.currentPaint;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public final void setIsChat(boolean z) {
        this.isChat = z;
    }

    @Override
    public final void start() {
        this.lastUpdateTime = System.currentTimeMillis();
        this.started = true;
        invalidateSelf();
    }

    @Override
    public final void stop() {
        this.started = false;
    }
}
