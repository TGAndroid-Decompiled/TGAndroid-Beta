package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;

public final class TransformableLoginButtonView extends View {
    public final Paint backgroundPaint;
    public boolean drawBackground;
    public final Paint outlinePaint;
    public float progress;
    public final RectF rect;
    public Drawable rippleDrawable;
    public int transformType;

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
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (this.drawBackground) {
            float fDp = AndroidUtilities.dp(((this.transformType == 0 ? this.progress : 1.0f) * 26.0f) + 6.0f);
            RectF rectF = this.rect;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRoundRect(rectF, fDp, fDp, this.backgroundPaint);
        }
        int i = this.transformType;
        Paint paint = this.outlinePaint;
        if (i == 0) {
            float fMax = (Math.max(0.4f, this.progress) - 0.4f) / 0.6f;
            if (fMax != 0.0f) {
                float fM$3 = (OKLCH.m$3(21.0f, 2, getWidth()) * fMax) + AndroidUtilities.dp(21.0f);
                float height = getHeight() / 2.0f;
                canvas.drawLine(AndroidUtilities.dp(21.0f), height, fM$3, height, paint);
                double dDp = AndroidUtilities.dp(9.0f) * fMax;
                float fCos = (float) (((double) fM$3) - (Math.cos(0.7853981633974483d) * dDp));
                float fSin = (float) (Math.sin(0.7853981633974483d) * dDp);
                canvas2 = canvas;
                canvas2.drawLine(fM$3, height, fCos, height - fSin, paint);
                canvas2.drawLine(fM$3, height, fCos, height + fSin, paint);
            } else {
                canvas2 = canvas;
            }
        } else if (i == 1) {
            float fDp2 = AndroidUtilities.dp(21.0f);
            float width = getWidth() - AndroidUtilities.dp(21.0f);
            float height2 = getHeight() / 2.0f;
            canvas2.save();
            canvas2.translate((-AndroidUtilities.dp(2.0f)) * this.progress, 0.0f);
            canvas2.rotate(this.progress * 90.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas2.drawLine(fDp2 + ((width - fDp2) * this.progress), height2, width, height2, paint);
            int iDp = AndroidUtilities.dp((this.progress * (-1.0f)) + 9.0f);
            int iDp2 = AndroidUtilities.dp((this.progress * 7.0f) + 9.0f);
            double d = width;
            double d2 = iDp;
            double d3 = height2;
            canvas.drawLine(width, height2, (float) (d - (Math.cos(0.7853981633974483d) * d2)), (float) ((Math.sin(0.7853981633974483d) * d2) + d3), paint);
            double d4 = iDp2;
            canvas2 = canvas;
            canvas2.drawLine(width, height2, (float) (d - (Math.cos(0.7853981633974483d) * d4)), (float) (d3 - (Math.sin(0.7853981633974483d) * d4)), paint);
            canvas.restore();
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
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        Drawable drawable2 = this.rippleDrawable;
        return drawable2 != null && drawable == drawable2;
    }
}
