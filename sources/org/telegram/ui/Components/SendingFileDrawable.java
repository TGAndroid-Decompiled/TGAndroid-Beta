package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public final class SendingFileDrawable extends StatusDrawable {
    public final Paint currentPaint;
    public float progress;
    public boolean isChat = false;
    public long lastUpdateTime = 0;
    public boolean started = false;

    public SendingFileDrawable(boolean z) {
        if (z) {
            Paint paint = new Paint(1);
            this.currentPaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.currentPaint;
        if (paint == null) {
            paint = Theme.chat_statusRecordPaint;
        }
        Paint paint2 = paint;
        int i = 0;
        while (i < 3) {
            if (i == 0) {
                paint2.setAlpha((int) (this.progress * 255.0f));
            } else if (i == 2) {
                paint2.setAlpha((int) ((1.0f - this.progress) * 255.0f));
            } else {
                paint2.setAlpha(255);
            }
            float fDp = (AndroidUtilities.dp(5.0f) * i) + (AndroidUtilities.dp(5.0f) * this.progress);
            float f = 8.0f;
            Canvas canvas2 = canvas;
            canvas2.drawLine(fDp, AndroidUtilities.dp(this.isChat ? 3.0f : 4.0f), fDp + AndroidUtilities.dp(4.0f), AndroidUtilities.dp(this.isChat ? 7.0f : 8.0f), paint2);
            float fDp2 = AndroidUtilities.dp(this.isChat ? 11.0f : 12.0f);
            float fDp3 = fDp + AndroidUtilities.dp(4.0f);
            if (this.isChat) {
                f = 7.0f;
            }
            canvas2.drawLine(fDp, fDp2, fDp3, AndroidUtilities.dp(f), paint2);
            i++;
            canvas = canvas2;
        }
        if (!this.started) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.lastUpdateTime;
        this.lastUpdateTime = jCurrentTimeMillis;
        if (j > 50) {
            j = 50;
        }
        this.progress = (j / 500.0f) + this.progress;
        while (true) {
            float f2 = this.progress;
            if (f2 <= 1.0f) {
                invalidateLimited();
                return;
            }
            this.progress = f2 - 1.0f;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(14.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(18.0f);
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
