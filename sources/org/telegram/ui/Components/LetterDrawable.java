package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;

public final class LetterDrawable extends Drawable {
    public static TextPaint namePaint;
    public static TextPaint namePaintSmallTopic;
    public static TextPaint namePaintTopic;
    public static final Paint paint = new Paint();
    public final int style;
    public float textHeight;
    public StaticLayout textLayout;
    public float textLeft;
    public final TextPaint textPaint;
    public float textWidth;
    public final RectF rect = new RectF();
    public final StringBuilder stringBuilder = new StringBuilder(5);
    public float scale = 1.0f;

    public LetterDrawable(int i, Theme.ResourcesProvider resourcesProvider) {
        this.style = i;
        if (i == 0) {
            if (namePaint == null) {
                namePaint = new TextPaint(1);
            }
            namePaint.setTextSize(AndroidUtilities.dp(28.0f));
            paint.setColor(Theme.getColor(Theme.key_sharedMedia_linkPlaceholder, resourcesProvider));
            namePaint.setColor(Theme.getColor(Theme.key_sharedMedia_linkPlaceholderText, resourcesProvider));
            this.textPaint = namePaint;
            return;
        }
        if (i == 1) {
            if (namePaintTopic == null) {
                namePaintTopic = new TextPaint(1);
            }
            namePaintTopic.setColor(-1);
            namePaintTopic.setTextSize(AndroidUtilities.dp(13.0f));
            namePaintTopic.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.textPaint = namePaintTopic;
            return;
        }
        if (namePaintSmallTopic == null) {
            namePaintSmallTopic = new TextPaint(1);
        }
        namePaintSmallTopic.setColor(-1);
        namePaintSmallTopic.setTextSize(Theme.chat_topicTextPaint.getTextSize() * 0.75f);
        namePaintSmallTopic.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        this.textPaint = namePaintSmallTopic;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.style == 0) {
            RectF rectF = this.rect;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        }
        canvas.save();
        float f = this.scale;
        if (f != 1.0f) {
            canvas.scale(f, f, bounds.centerX(), bounds.centerY());
        }
        if (this.textLayout != null) {
            float fWidth = bounds.width();
            canvas.translate(ImageReceiver$$ExternalSyntheticOutline0.m(fWidth, this.textWidth, 2.0f, bounds.left) - this.textLeft, ImageReceiver$$ExternalSyntheticOutline0.m(fWidth, this.textHeight, 2.0f, bounds.top));
            this.textLayout.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return 0;
    }

    @Override
    public final int getIntrinsicWidth() {
        return 0;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.textPaint.setAlpha(i);
        paint.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setTitle(String str) {
        StringBuilder sb = this.stringBuilder;
        sb.setLength(0);
        if (str != null && str.length() > 0) {
            sb.append(str.substring(0, 1));
        }
        if (sb.length() <= 0) {
            this.textLayout = null;
            return;
        }
        try {
            StaticLayout staticLayout = new StaticLayout(sb.toString().toUpperCase(), this.textPaint, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.textLayout = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.textLeft = this.textLayout.getLineLeft(0);
                this.textWidth = this.textLayout.getLineWidth(0);
                this.textHeight = this.textLayout.getLineBottom(0);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
