package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;

public class TransformableLoginButtonView extends View {
    private static final float ARROW_BACK_SIZE = 9.0f;
    private static final float ARROW_IN = 0.4f;
    private static final float ARROW_PADDING = 21.0f;
    private static final float BUTTON_RADIUS_DP = 6.0f;
    private static final float BUTTON_TEXT_IN = 0.6f;
    private static final float CIRCLE_RADIUS_DP = 32.0f;
    private static final float LEFT_CHECK_LINE = 8.0f;
    private static final float RIGHT_CHECK_LINE = 16.0f;
    public static final int TRANSFORM_ARROW_CHECK = 1;
    public static final int TRANSFORM_OPEN_ARROW = 0;
    private final Paint backgroundPaint;
    private String buttonText;
    private float buttonWidth;
    private boolean drawBackground;
    private final Paint outlinePaint;
    private float progress;
    private final RectF rect;
    private Drawable rippleDrawable;
    private TextPaint textPaint;
    private int transformType;

    @Retention(RetentionPolicy.SOURCE)
    public @interface TransformType {
    }

    public TransformableLoginButtonView(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint(1);
        this.outlinePaint = paint2;
        this.drawBackground = true;
        this.transformType = 0;
        this.rect = new RectF();
        paint.setColor(Theme.getColor(null, Theme.key_chats_actionBackground, false));
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (this.drawBackground) {
            float fDp = AndroidUtilities.dp(((this.transformType == 0 ? this.progress : 1.0f) * 26.0f) + 6.0f);
            this.rect.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRoundRect(this.rect, fDp, fDp, this.backgroundPaint);
        }
        int i = this.transformType;
        if (i == 0) {
            TextPaint textPaint = this.textPaint;
            if (textPaint != null && this.buttonText != null) {
                int alpha = textPaint.getAlpha();
                this.textPaint.setAlpha((int) ((1.0f - (Math.min(0.6f, this.progress) / 0.6f)) * alpha));
                canvas2.drawText(this.buttonText, (getWidth() - this.buttonWidth) / 2.0f, ((this.textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f)) - AndroidUtilities.dp(1.75f), this.textPaint);
                this.textPaint.setAlpha(alpha);
            }
            float fMax = (Math.max(0.4f, this.progress) - 0.4f) / 0.6f;
            if (fMax != 0.0f) {
                float fDp2 = AndroidUtilities.dp(21.0f) + (OKLCH.m$3(21.0f, 2, getWidth()) * fMax);
                float height = getHeight() / 2.0f;
                canvas2.drawLine(AndroidUtilities.dp(21.0f), height, fDp2, height, this.outlinePaint);
                double dDp = AndroidUtilities.dp(9.0f) * fMax;
                float fCos = (float) (((double) fDp2) - (Math.cos(0.7853981633974483d) * dDp));
                float fSin = (float) (Math.sin(0.7853981633974483d) * dDp);
                canvas2 = canvas;
                canvas2.drawLine(fDp2, height, fCos, height - fSin, this.outlinePaint);
                canvas2.drawLine(fDp2, height, fCos, height + fSin, this.outlinePaint);
            }
        } else if (i == 1) {
            float fDp3 = AndroidUtilities.dp(21.0f);
            float width = getWidth() - AndroidUtilities.dp(21.0f);
            float height2 = getHeight() / 2.0f;
            canvas2.save();
            canvas2.translate((-AndroidUtilities.dp(2.0f)) * this.progress, 0.0f);
            canvas2.rotate(this.progress * 90.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas2.drawLine(fDp3 + ((width - fDp3) * this.progress), height2, width, height2, this.outlinePaint);
            int iDp = AndroidUtilities.dp((this.progress * (-1.0f)) + 9.0f);
            int iDp2 = AndroidUtilities.dp((this.progress * 7.0f) + 9.0f);
            double d = width;
            double d2 = iDp;
            double d3 = height2;
            canvas.drawLine(width, height2, (float) (d - (Math.cos(0.7853981633974483d) * d2)), (float) ((Math.sin(0.7853981633974483d) * d2) + d3), this.outlinePaint);
            double d4 = iDp2;
            canvas2 = canvas;
            canvas2.drawLine(width, height2, (float) (d - (Math.cos(0.7853981633974483d) * d4)), (float) (d3 - (Math.sin(0.7853981633974483d) * d4)), this.outlinePaint);
            canvas2.restore();
        }
        Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            this.rippleDrawable.setHotspotBounds(0, 0, getWidth(), getHeight());
            this.rippleDrawable.draw(canvas2);
        }
    }

    @Override
    public void setBackgroundColor(int i) {
        this.backgroundPaint.setColor(i);
        invalidate();
    }

    public void setButtonText(TextPaint textPaint, String str) {
        this.textPaint = textPaint;
        this.buttonText = str;
        this.outlinePaint.setColor(textPaint.getColor());
        this.buttonWidth = textPaint.measureText(str);
    }

    public void setColor(int i) {
        this.outlinePaint.setColor(i);
        invalidate();
    }

    public void setDrawBackground(boolean z) {
        this.drawBackground = z;
    }

    public void setProgress(float f) {
        this.progress = f;
        invalidate();
    }

    public void setRippleDrawable(Drawable drawable) {
        this.rippleDrawable = drawable;
        invalidate();
    }

    public void setTransformType(int i) {
        this.transformType = i;
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        Drawable drawable2 = this.rippleDrawable;
        return drawable2 != null && drawable == drawable2;
    }
}
