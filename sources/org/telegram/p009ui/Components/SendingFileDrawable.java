package org.telegram.p009ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.ActionBar.Theme;

public class SendingFileDrawable extends StatusDrawable {
    Paint currentPaint;
    private float progress;
    private boolean isChat = false;
    private long lastUpdateTime = 0;
    private boolean started = false;

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public SendingFileDrawable(boolean z) {
        if (z) {
            Paint paint = new Paint(1);
            this.currentPaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.currentPaint.setStrokeCap(Paint.Cap.ROUND);
            this.currentPaint.setStrokeWidth(AndroidUtilities.m34dp(2.0f));
        }
    }

    @Override
    public void setColor(int i) {
        Paint paint = this.currentPaint;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    @Override
    public void setIsChat(boolean z) {
        this.isChat = z;
    }

    private void update() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.lastUpdateTime;
        this.lastUpdateTime = currentTimeMillis;
        if (j > 50) {
            j = 50;
        }
        this.progress += ((float) j) / 500.0f;
        while (true) {
            float f = this.progress;
            if (f > 1.0f) {
                this.progress = f - 1.0f;
            } else {
                invalidateSelf();
                return;
            }
        }
    }

    @Override
    public void start() {
        this.lastUpdateTime = System.currentTimeMillis();
        this.started = true;
        invalidateSelf();
    }

    @Override
    public void stop() {
        this.started = false;
    }

    @Override
    public void draw(Canvas canvas) {
        Paint paint = this.currentPaint;
        if (paint == null) {
            paint = Theme.chat_statusRecordPaint;
        }
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                paint.setAlpha((int) (this.progress * 255.0f));
            } else if (i == 2) {
                paint.setAlpha((int) ((1.0f - this.progress) * 255.0f));
            } else {
                paint.setAlpha(255);
            }
            float dp = (AndroidUtilities.m34dp(5.0f) * i) + (AndroidUtilities.m34dp(5.0f) * this.progress);
            float f = 7.0f;
            canvas.drawLine(dp, AndroidUtilities.m34dp(this.isChat ? 3.0f : 4.0f), dp + AndroidUtilities.m34dp(4.0f), AndroidUtilities.m34dp(this.isChat ? 7.0f : 8.0f), paint);
            float dp2 = AndroidUtilities.m34dp(this.isChat ? 11.0f : 12.0f);
            float dp3 = dp + AndroidUtilities.m34dp(4.0f);
            if (!this.isChat) {
                f = 8.0f;
            }
            canvas.drawLine(dp, dp2, dp3, AndroidUtilities.m34dp(f), paint);
        }
        if (this.started) {
            update();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.m34dp(18.0f);
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.m34dp(14.0f);
    }
}
