package org.telegram.ui.Components.Paint.Views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.util.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Stories.StoryViewer;

public abstract class PipettePickerView extends View {
    public float appearProgress;
    public Bitmap bitmap;
    public Consumer colorListener;
    public final Paint colorPaint;
    public final RectF dstRect;
    public boolean isDisappeared;
    public final Paint linePaint;
    public int mColor;
    public final Paint outlinePaint;
    public final Path path;
    public float positionX;
    public float positionY;
    public final Rect srcRect;

    public PipettePickerView(Context context, Bitmap bitmap) {
        super(context);
        Paint paint = new Paint(1);
        this.outlinePaint = paint;
        Paint paint2 = new Paint(1);
        this.linePaint = paint2;
        Paint paint3 = new Paint(1);
        this.colorPaint = paint3;
        this.positionX = 0.5f;
        this.positionY = 0.5f;
        this.path = new Path();
        this.srcRect = new Rect();
        this.dstRect = new RectF();
        this.bitmap = bitmap;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint.setColor(-1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint2.setColor(-1711276033);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dp(12.0f));
    }

    public final void animateDisappear(boolean z) {
        if (this.isDisappeared) {
            return;
        }
        this.isDisappeared = true;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        duration.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 13));
        duration.addListener(new StoryViewer.AnonymousClass7(this, z, 4));
        duration.start();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ColorPickerBottomSheet.this.pipetteDelegate.onStopColorPipette();
        this.bitmap.recycle();
        this.bitmap = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float fMin = Math.min(getWidth(), getHeight()) * 0.2f;
        float width = this.positionX * getWidth();
        float height = this.positionY * getHeight();
        int iRound = Math.round(this.positionX * this.bitmap.getWidth());
        int iRound2 = Math.round(this.positionY * this.bitmap.getHeight());
        Bitmap bitmap = this.bitmap;
        int pixel = bitmap.getPixel(Utilities.clamp(iRound, bitmap.getWidth() - 1, 0), Utilities.clamp(iRound2, this.bitmap.getHeight() - 1, 0));
        this.mColor = pixel;
        Paint paint = this.colorPaint;
        paint.setColor(pixel);
        float f = this.appearProgress;
        if (f == 0.0f || f == 1.0f) {
            canvas.save();
        } else {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(width - fMin, height - fMin, width + fMin, height + fMin);
            canvas.saveLayerAlpha(rectF, (int) (this.appearProgress * 255.0f), 31);
        }
        float f2 = (this.appearProgress * 0.5f) + 0.5f;
        canvas.scale(f2, f2, width, height);
        Path path = this.path;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, height, fMin, direction);
        canvas.clipPath(path);
        int iRound3 = Math.round(3.5f);
        int i = iRound - iRound3;
        int i2 = iRound2 - iRound3;
        int i3 = iRound + iRound3;
        int i4 = iRound2 + iRound3;
        Rect rect = this.srcRect;
        rect.set(i, i2, i3, i4);
        RectF rectF2 = this.dstRect;
        rectF2.set(width - fMin, height - fMin, width + fMin, height + fMin);
        canvas.drawBitmap(this.bitmap, rect, rectF2, (Paint) null);
        float strokeWidth = fMin - (paint.getStrokeWidth() / 2.0f);
        canvas.drawCircle(width, height, strokeWidth, paint);
        float strokeWidth2 = strokeWidth - (paint.getStrokeWidth() / 2.0f);
        Paint paint2 = this.outlinePaint;
        float strokeWidth3 = strokeWidth2 - (paint2.getStrokeWidth() / 2.0f);
        canvas.drawCircle(width, height, strokeWidth3, paint2);
        float strokeWidth4 = strokeWidth3 - (paint2.getStrokeWidth() / 2.0f);
        path.rewind();
        path.addCircle(width, height, strokeWidth4, direction);
        canvas.clipPath(path);
        float f3 = (strokeWidth4 * 2.0f) / 8.0f;
        path.rewind();
        for (float f4 = -3.5f; f4 < 4.5f; f4 += 1.0f) {
            float f5 = (f4 * f3) + width;
            path.moveTo(f5, height - strokeWidth4);
            path.lineTo(f5, height + strokeWidth4);
        }
        for (float f6 = -3.5f; f6 < 4.5f; f6 += 1.0f) {
            float f7 = (f6 * f3) + height;
            path.moveTo(width - strokeWidth4, f7);
            path.lineTo(width + strokeWidth4, f7);
        }
        canvas.drawPath(path, this.linePaint);
        float f8 = f3 / 2.0f;
        rectF2.set(width - f8, height - f8, width + f8, height + f8);
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint2);
        canvas.restore();
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == 0 || i2 == 0 || i3 == 0 || i4 == 0 || !isLaidOut()) {
            return;
        }
        this.positionX = (i3 * this.positionX) / i;
        this.positionY = (i4 * this.positionY) / i2;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.positionX = motionEvent.getX() / getWidth();
            this.positionY = motionEvent.getY() / getHeight();
            invalidate();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 1) {
            animateDisappear(true);
        } else if (actionMasked == 2) {
            this.positionX = motionEvent.getX() / getWidth();
            this.positionY = motionEvent.getY() / getHeight();
            invalidate();
        } else if (actionMasked == 3) {
            animateDisappear(false);
        }
        return true;
    }

    public void setColorListener(Consumer consumer) {
        this.colorListener = consumer;
    }
}
