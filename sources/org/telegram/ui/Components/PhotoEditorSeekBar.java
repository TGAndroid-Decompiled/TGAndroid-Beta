package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class PhotoEditorSeekBar extends View {
    public PhotoEditorSeekBarDelegate delegate;
    public final Paint innerPaint;
    public int maxValue;
    public int minValue;
    public final Paint outerPaint;
    public boolean pressed;
    public float progress;
    public int thumbDX;
    public final int thumbSize;

    public interface PhotoEditorSeekBarDelegate {
        void onProgressChanged(int i, int i2);
    }

    public PhotoEditorSeekBar(Context context) {
        super(context);
        Paint paint = new Paint();
        this.innerPaint = paint;
        Paint paint2 = new Paint(1);
        this.outerPaint = paint2;
        this.thumbSize = AndroidUtilities.dp(16.0f);
        this.thumbDX = 0;
        this.progress = 0.0f;
        this.pressed = false;
        paint.setColor(-11711155);
        paint2.setColor(-1);
    }

    public int getProgress() {
        int i = this.minValue;
        return (int) ((this.progress * (this.maxValue - i)) + i);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight();
        int i = this.thumbSize;
        int i2 = (measuredHeight - i) / 2;
        int measuredWidth = (int) ((getMeasuredWidth() - i) * this.progress);
        int i3 = i / 2;
        float f = i3;
        canvas.drawRect(f, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() - i3, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), this.innerPaint);
        int i4 = this.minValue;
        Paint paint = this.outerPaint;
        if (i4 == 0) {
            canvas.drawRect(f, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), measuredWidth, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
        } else {
            if (this.progress > 0.5f) {
                canvas.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.dp(1.0f), (getMeasuredHeight() - i) / 2, getMeasuredWidth() / 2, (getMeasuredHeight() + i) / 2, paint);
                canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), measuredWidth, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
            } else {
                canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() - i) / 2, AndroidUtilities.dp(1.0f) + (getMeasuredWidth() / 2), (getMeasuredHeight() + i) / 2, paint);
                canvas.drawRect(measuredWidth, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() / 2, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint);
            }
            paint = paint;
        }
        canvas.drawCircle(measuredWidth + i3, i3 + i2, f, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int measuredWidth = getMeasuredWidth();
            int i = this.thumbSize;
            float f = (int) ((measuredWidth - i) * this.progress);
            float measuredWidth2 = 0.0f;
            if (motionEvent.getAction() == 0) {
                float measuredHeight = (getMeasuredHeight() - i) / 2;
                if (f - measuredHeight <= x && x <= i + f + measuredHeight && y >= 0.0f && y <= getMeasuredHeight()) {
                    this.pressed = true;
                    this.thumbDX = (int) (x - f);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.pressed) {
                    this.pressed = false;
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 2 && this.pressed) {
                float f2 = (int) (x - this.thumbDX);
                if (f2 >= 0.0f) {
                    measuredWidth2 = f2 > ((float) (getMeasuredWidth() - i)) ? getMeasuredWidth() - i : f2;
                }
                this.progress = measuredWidth2 / (getMeasuredWidth() - i);
                PhotoEditorSeekBarDelegate photoEditorSeekBarDelegate = this.delegate;
                if (photoEditorSeekBarDelegate != null) {
                    photoEditorSeekBarDelegate.onProgressChanged(((Integer) getTag()).intValue(), getProgress());
                }
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void setDelegate(PhotoEditorSeekBarDelegate photoEditorSeekBarDelegate) {
        this.delegate = photoEditorSeekBarDelegate;
    }

    public void setProgress(int i) {
        int i2 = this.minValue;
        if (i < i2) {
            i = i2;
        } else {
            int i3 = this.maxValue;
            if (i > i3) {
                i = i3;
            }
        }
        this.progress = (i - i2) / (this.maxValue - i2);
        invalidate();
        PhotoEditorSeekBarDelegate photoEditorSeekBarDelegate = this.delegate;
        if (photoEditorSeekBarDelegate != null) {
            photoEditorSeekBarDelegate.onProgressChanged(((Integer) getTag()).intValue(), getProgress());
        }
    }
}
