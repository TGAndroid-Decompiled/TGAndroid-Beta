package org.telegram.p009ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.ActionBar.Theme;

public class RecordStatusDrawable extends StatusDrawable {
    Paint currentPaint;
    private float progress;
    private boolean isChat = false;
    private long lastUpdateTime = 0;
    private boolean started = false;
    private RectF rect = new RectF();
    int alpha = 255;

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public RecordStatusDrawable(boolean z) {
        if (z) {
            Paint paint = new Paint(1);
            this.currentPaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.currentPaint.setStrokeCap(Paint.Cap.ROUND);
            this.currentPaint.setStrokeWidth(AndroidUtilities.m35dp(2.0f));
        }
    }

    @Override
    public void setIsChat(boolean z) {
        this.isChat = z;
    }

    @Override
    public void setColor(int i) {
        Paint paint = this.currentPaint;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    private void update() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.lastUpdateTime;
        this.lastUpdateTime = currentTimeMillis;
        if (j > 50) {
            j = 50;
        }
        this.progress += ((float) j) / 800.0f;
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
        if (paint.getStrokeWidth() != AndroidUtilities.m35dp(2.0f)) {
            paint.setStrokeWidth(AndroidUtilities.m35dp(2.0f));
        }
        canvas.save();
        canvas.translate(0.0f, (getIntrinsicHeight() / 2) + AndroidUtilities.m35dp(this.isChat ? 1.0f : 2.0f));
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                paint.setAlpha((int) (this.alpha * this.progress));
            } else if (i == 3) {
                paint.setAlpha((int) (this.alpha * (1.0f - this.progress)));
            } else {
                paint.setAlpha(this.alpha);
            }
            float m35dp = (AndroidUtilities.m35dp(4.0f) * i) + (AndroidUtilities.m35dp(4.0f) * this.progress);
            float f = -m35dp;
            this.rect.set(f, f, m35dp, m35dp);
            canvas.drawArc(this.rect, -15.0f, 30.0f, false, paint);
        }
        canvas.restore();
        if (this.started) {
            update();
        }
    }

    @Override
    public void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.m35dp(18.0f);
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.m35dp(14.0f);
    }
}
