package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public class PhotoEditorSeekBar extends View {
    private PhotoEditorSeekBarDelegate delegate;
    private Paint innerPaint;
    private int maxValue;
    private int minValue;
    private Paint outerPaint;
    private boolean pressed;
    private float progress;
    private int thumbDX;
    private int thumbSize;

    public interface PhotoEditorSeekBarDelegate {
        void onProgressChanged(int i, int i2);
    }

    public PhotoEditorSeekBar(Context context) {
        super(context);
        this.innerPaint = new Paint();
        this.outerPaint = new Paint(1);
        this.thumbSize = AndroidUtilities.dp(16.0f);
        this.thumbDX = 0;
        this.progress = 0.0f;
        this.pressed = false;
        this.innerPaint.setColor(-11711155);
        this.outerPaint.setColor(-1);
    }

    public int getProgress() {
        int i = this.minValue;
        return (int) ((this.progress * (this.maxValue - i)) + i);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredHeight = (getMeasuredHeight() - this.thumbSize) / 2;
        int measuredWidth = getMeasuredWidth();
        int i = this.thumbSize;
        int i2 = (int) ((measuredWidth - i) * this.progress);
        canvas.drawRect(i / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() - (this.thumbSize / 2), AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), this.innerPaint);
        if (this.minValue == 0) {
            canvas.drawRect(this.thumbSize / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), i2, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), this.outerPaint);
        } else if (this.progress > 0.5f) {
            canvas.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.dp(1.0f), (getMeasuredHeight() - this.thumbSize) / 2, getMeasuredWidth() / 2, (getMeasuredHeight() + this.thumbSize) / 2, this.outerPaint);
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), i2, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), this.outerPaint);
        } else {
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() - this.thumbSize) / 2, AndroidUtilities.dp(1.0f) + (getMeasuredWidth() / 2), (getMeasuredHeight() + this.thumbSize) / 2, this.outerPaint);
            canvas.drawRect(i2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() / 2, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), this.outerPaint);
        }
        int i3 = this.thumbSize / 2;
        canvas.drawCircle(i2 + i3, measuredHeight + i3, i3, this.outerPaint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float measuredWidth = (int) ((getMeasuredWidth() - this.thumbSize) * this.progress);
            float measuredWidth2 = 0.0f;
            if (motionEvent.getAction() == 0) {
                int measuredHeight = getMeasuredHeight();
                int i = this.thumbSize;
                float f = (measuredHeight - i) / 2;
                if (measuredWidth - f <= x && x <= i + measuredWidth + f && y >= 0.0f && y <= getMeasuredHeight()) {
                    this.pressed = true;
                    this.thumbDX = (int) (x - measuredWidth);
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
                    measuredWidth2 = f2 > ((float) (getMeasuredWidth() - this.thumbSize)) ? getMeasuredWidth() - this.thumbSize : f2;
                }
                this.progress = measuredWidth2 / (getMeasuredWidth() - this.thumbSize);
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

    public void setMinMax(int i, int i2) {
        this.minValue = i;
        this.maxValue = i2;
    }

    public void setProgress(int i) {
        setProgress(i, true);
    }

    public void setProgress(int i, boolean z) {
        PhotoEditorSeekBarDelegate photoEditorSeekBarDelegate;
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
        if (!z || (photoEditorSeekBarDelegate = this.delegate) == null) {
            return;
        }
        photoEditorSeekBarDelegate.onProgressChanged(((Integer) getTag()).intValue(), getProgress());
    }
}
