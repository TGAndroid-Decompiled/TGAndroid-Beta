package org.telegram.ui.Components.Paint.Views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.CubicBezierInterpolator;
public class PipettePickerView extends View {
    private float appearProgress;
    private Bitmap bitmap;
    private Consumer<Integer> colorListener;
    private Paint colorPaint;
    private RectF dstRect;
    private boolean isDisappeared;
    private Paint linePaint;
    private int mColor;
    private Paint outlinePaint;
    private Path path;
    private float positionX;
    private float positionY;
    private Rect srcRect;

    protected void onStartPipette() {
    }

    protected void onStopPipette() {
    }

    public PipettePickerView(Context context, Bitmap bitmap) {
        super(context);
        this.outlinePaint = new Paint(1);
        this.linePaint = new Paint(1);
        this.colorPaint = new Paint(1);
        this.positionX = 0.5f;
        this.positionY = 0.5f;
        this.path = new Path();
        this.srcRect = new Rect();
        this.dstRect = new RectF();
        this.bitmap = bitmap;
        this.outlinePaint.setStyle(Paint.Style.STROKE);
        this.outlinePaint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        this.outlinePaint.setColor(-1);
        this.linePaint.setStyle(Paint.Style.STROKE);
        this.linePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.linePaint.setColor(-1711276033);
        this.colorPaint.setStyle(Paint.Style.STROKE);
        this.colorPaint.setStrokeWidth(AndroidUtilities.dp(12.0f));
    }

    public void setColorListener(Consumer<Integer> consumer) {
        this.colorListener = consumer;
    }

    public void animateShow() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PipettePickerView.this.lambda$animateShow$0(valueAnimator);
            }
        });
        duration.start();
        onStartPipette();
    }

    public void lambda$animateShow$0(ValueAnimator valueAnimator) {
        this.appearProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public void animateDisappear(final boolean z) {
        if (this.isDisappeared) {
            return;
        }
        this.isDisappeared = true;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PipettePickerView.this.lambda$animateDisappear$1(valueAnimator);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PipettePickerView.this.onStopPipette();
                if (z) {
                    PipettePickerView.this.colorListener.accept(Integer.valueOf(PipettePickerView.this.mColor));
                }
                if (PipettePickerView.this.getParent() != null) {
                    ((ViewGroup) PipettePickerView.this.getParent()).removeView(PipettePickerView.this);
                }
            }
        });
        duration.start();
    }

    public void lambda$animateDisappear$1(ValueAnimator valueAnimator) {
        this.appearProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onStopPipette();
        this.bitmap.recycle();
        this.bitmap = null;
    }

    @Override
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            updatePosition(motionEvent);
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 1) {
            animateDisappear(true);
        } else if (actionMasked == 2) {
            updatePosition(motionEvent);
        } else if (actionMasked == 3) {
            animateDisappear(false);
        }
        return true;
    }

    private void updatePosition(MotionEvent motionEvent) {
        this.positionX = motionEvent.getX() / getWidth();
        this.positionY = motionEvent.getY() / getHeight();
        invalidate();
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == 0 || i2 == 0 || i3 == 0 || i4 == 0 || !isLaidOut()) {
            return;
        }
        this.positionX = (i3 * this.positionX) / i;
        this.positionY = (i4 * this.positionY) / i2;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float min = Math.min(getWidth(), getHeight()) * 0.2f;
        float width = this.positionX * getWidth();
        float height = this.positionY * getHeight();
        int round = Math.round(this.positionX * this.bitmap.getWidth());
        int round2 = Math.round(this.positionY * this.bitmap.getHeight());
        Bitmap bitmap = this.bitmap;
        int pixel = bitmap.getPixel(Utilities.clamp(round, bitmap.getWidth(), 0), Utilities.clamp(round2, this.bitmap.getHeight(), 0));
        this.mColor = pixel;
        this.colorPaint.setColor(pixel);
        float f = this.appearProgress;
        if (f != 0.0f && f != 1.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(width - min, height - min, width + min, height + min);
            canvas.saveLayerAlpha(rectF, (int) (this.appearProgress * 255.0f), 31);
        } else {
            canvas.save();
        }
        float f2 = (this.appearProgress * 0.5f) + 0.5f;
        canvas.scale(f2, f2, width, height);
        this.path.rewind();
        this.path.addCircle(width, height, min, Path.Direction.CW);
        canvas.clipPath(this.path);
        int round3 = Math.round(3.5f);
        this.srcRect.set(round - round3, round2 - round3, round + round3, round2 + round3);
        this.dstRect.set(width - min, height - min, width + min, height + min);
        canvas.drawBitmap(this.bitmap, this.srcRect, this.dstRect, (Paint) null);
        float strokeWidth = min - (this.colorPaint.getStrokeWidth() / 2.0f);
        canvas.drawCircle(width, height, strokeWidth, this.colorPaint);
        float strokeWidth2 = (strokeWidth - (this.colorPaint.getStrokeWidth() / 2.0f)) - (this.outlinePaint.getStrokeWidth() / 2.0f);
        canvas.drawCircle(width, height, strokeWidth2, this.outlinePaint);
        float strokeWidth3 = strokeWidth2 - (this.outlinePaint.getStrokeWidth() / 2.0f);
        this.path.rewind();
        this.path.addCircle(width, height, strokeWidth3, Path.Direction.CW);
        canvas.clipPath(this.path);
        float f3 = (strokeWidth3 * 2.0f) / 8.0f;
        this.path.rewind();
        for (float f4 = -3.5f; f4 < 4.5f; f4 += 1.0f) {
            float f5 = (f4 * f3) + width;
            this.path.moveTo(f5, height - strokeWidth3);
            this.path.lineTo(f5, height + strokeWidth3);
        }
        for (float f6 = -3.5f; f6 < 4.5f; f6 += 1.0f) {
            float f7 = (f6 * f3) + height;
            this.path.moveTo(width - strokeWidth3, f7);
            this.path.lineTo(width + strokeWidth3, f7);
        }
        canvas.drawPath(this.path, this.linePaint);
        float f8 = f3 / 2.0f;
        this.dstRect.set(width - f8, height - f8, width + f8, height + f8);
        canvas.drawRoundRect(this.dstRect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), this.outlinePaint);
        canvas.restore();
    }
}
