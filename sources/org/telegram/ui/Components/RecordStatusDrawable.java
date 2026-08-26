package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public final class RecordStatusDrawable extends StatusDrawable {
    public final int $r8$classId;
    public int alpha;
    public final Paint currentPaint;
    public boolean isChat;
    public long lastUpdateTime;
    public float progress;
    public final Object rect;
    public boolean started;

    public RecordStatusDrawable() {
        this.$r8$classId = 1;
        this.lastUpdateTime = 0L;
        this.isChat = false;
        this.started = true;
        Paint paint = new Paint(1);
        this.currentPaint = paint;
        this.rect = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.2f));
    }

    @Override
    public final void draw(Canvas canvas) {
        float fDp;
        float fDpf2;
        Canvas canvas2 = canvas;
        switch (this.$r8$classId) {
            case 0:
                Paint paint = this.currentPaint;
                if (paint == null) {
                    paint = Theme.chat_statusRecordPaint;
                }
                Paint paint2 = paint;
                if (paint2.getStrokeWidth() != AndroidUtilities.dp(2.0f)) {
                    paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
                }
                canvas2.save();
                canvas2.translate(0.0f, AndroidUtilities.dp(this.isChat ? 1.0f : 2.0f) + (AndroidUtilities.dp(14.0f) / 2));
                int i = 0;
                while (i < 4) {
                    if (i == 0) {
                        paint2.setAlpha((int) (this.alpha * this.progress));
                    } else if (i == 3) {
                        paint2.setAlpha((int) ((1.0f - this.progress) * this.alpha));
                    } else {
                        paint2.setAlpha(this.alpha);
                    }
                    float fDp2 = (AndroidUtilities.dp(4.0f) * this.progress) + (AndroidUtilities.dp(4.0f) * i);
                    RectF rectF = (RectF) this.rect;
                    float f = -fDp2;
                    rectF.set(f, f, fDp2, fDp2);
                    canvas2.drawArc(rectF, -15.0f, 30.0f, false, paint2);
                    i++;
                    canvas2 = canvas;
                }
                canvas.restore();
                if (this.started) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = jCurrentTimeMillis - this.lastUpdateTime;
                    this.lastUpdateTime = jCurrentTimeMillis;
                    if (j > 50) {
                        j = 50;
                    }
                    this.progress = (j / 800.0f) + this.progress;
                    while (true) {
                        float f2 = this.progress;
                        if (f2 <= 1.0f) {
                            invalidateLimited();
                        } else {
                            this.progress = f2 - 1.0f;
                        }
                    }
                }
                break;
            default:
                float fMin = Math.min(this.progress, 1.0f);
                float interpolation = CubicBezierInterpolator.EASE_IN.getInterpolation(fMin < 0.3f ? fMin / 0.3f : 1.0f);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
                float interpolation2 = cubicBezierInterpolator.getInterpolation(fMin < 0.3f ? 0.0f : (fMin - 0.3f) / 0.7f);
                if (this.started) {
                    fDp = DiffUtil.m(1.0f, interpolation, AndroidUtilities.dp(7.0f) - AndroidUtilities.dp(2.1f), AndroidUtilities.dp(2.1f) * interpolation);
                    fDpf2 = (1.0f - cubicBezierInterpolator.getInterpolation(this.progress / 2.0f)) * AndroidUtilities.dpf2(1.5f);
                } else {
                    fDp = ((AndroidUtilities.dp(7.0f) - AndroidUtilities.dp(2.1f)) * interpolation) + ((1.0f - interpolation) * AndroidUtilities.dp(2.1f));
                    fDpf2 = AndroidUtilities.dpf2(1.5f) * CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.progress / 2.0f);
                }
                float fDp3 = AndroidUtilities.dp(11.0f) / 2.0f;
                float fDpf3 = AndroidUtilities.dpf2(2.0f);
                float fDpf4 = (AndroidUtilities.dpf2(0.5f) * interpolation) - (AndroidUtilities.dpf2(0.5f) * interpolation2);
                Paint paint3 = this.currentPaint;
                if (paint3 == null) {
                    paint3 = Theme.chat_statusRecordPaint;
                }
                Paint paint4 = (Paint) this.rect;
                if (paint4 == null) {
                    paint4 = Theme.chat_statusPaint;
                }
                if (paint3.getStrokeWidth() != AndroidUtilities.dp(0.8f)) {
                    paint3.setStrokeWidth(AndroidUtilities.dp(0.8f));
                }
                for (int i2 = 0; i2 < 2; i2++) {
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.dpf2(0.2f) + (paint3.getStrokeWidth() / 2.0f) + fDpf2 + (AndroidUtilities.dp(9.0f) * i2) + getBounds().left, AndroidUtilities.dpf2(2.0f) + (paint3.getStrokeWidth() / 2.0f) + getBounds().top);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(0.0f, fDpf4, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(11.0f) - fDpf4);
                    canvas2.drawOval(rectF2, paint3);
                    canvas2.drawCircle(fDp, fDp3, fDpf3, paint4);
                    canvas2.restore();
                }
                if (this.isChat) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    long j2 = jCurrentTimeMillis2 - this.lastUpdateTime;
                    this.lastUpdateTime = jCurrentTimeMillis2;
                    if (j2 > 50) {
                        j2 = 50;
                    }
                    float f3 = (j2 / 500.0f) + this.progress;
                    this.progress = f3;
                    if (f3 >= 2.0f) {
                        this.progress = 0.0f;
                        this.started = !this.started;
                    }
                    invalidateLimited();
                }
                break;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.$r8$classId) {
            case 0:
                return AndroidUtilities.dp(14.0f);
            default:
                return AndroidUtilities.dp(18.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.$r8$classId) {
            case 0:
                return AndroidUtilities.dp(18.0f);
            default:
                return AndroidUtilities.dp(20.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.$r8$classId) {
        }
        return 0;
    }

    @Override
    public final void setAlpha(int i) {
        switch (this.$r8$classId) {
            case 0:
                this.alpha = i;
                break;
        }
    }

    @Override
    public final void setColor(int i) {
        switch (this.$r8$classId) {
            case 0:
                Paint paint = this.currentPaint;
                if (paint != null) {
                    paint.setColor(i);
                }
                break;
            default:
                if (this.alpha != i) {
                    ((Paint) this.rect).setColor(i);
                    this.currentPaint.setColor(i);
                }
                this.alpha = i;
                break;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i = this.$r8$classId;
    }

    @Override
    public final void setIsChat(boolean z) {
        switch (this.$r8$classId) {
            case 0:
                this.isChat = z;
                break;
        }
    }

    @Override
    public final void start() {
        switch (this.$r8$classId) {
            case 0:
                this.lastUpdateTime = System.currentTimeMillis();
                this.started = true;
                invalidateSelf();
                break;
            default:
                this.lastUpdateTime = System.currentTimeMillis();
                this.isChat = true;
                invalidateSelf();
                break;
        }
    }

    @Override
    public final void stop() {
        switch (this.$r8$classId) {
            case 0:
                this.started = false;
                break;
            default:
                this.isChat = false;
                break;
        }
    }

    public RecordStatusDrawable(boolean z) {
        this.$r8$classId = 0;
        this.isChat = false;
        this.lastUpdateTime = 0L;
        this.started = false;
        this.rect = new RectF();
        this.alpha = 255;
        if (z) {
            Paint paint = new Paint(1);
            this.currentPaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    private final void setAlpha$org$telegram$ui$Components$ChoosingStickerStatusDrawable(int i) {
    }

    private final void setColorFilter$org$telegram$ui$Components$ChoosingStickerStatusDrawable(ColorFilter colorFilter) {
    }

    private final void setColorFilter$org$telegram$ui$Components$RecordStatusDrawable(ColorFilter colorFilter) {
    }

    private final void setIsChat$org$telegram$ui$Components$ChoosingStickerStatusDrawable(boolean z) {
    }
}
