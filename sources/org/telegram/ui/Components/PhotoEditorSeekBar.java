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
        return (int) (this.minValue + (this.progress * (this.maxValue - r0)));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int measuredWidth;
        int measuredHeight = (getMeasuredHeight() - this.thumbSize) / 2;
        int measuredWidth2 = getMeasuredWidth();
        int i = this.thumbSize;
        int i2 = (int) ((measuredWidth2 - i) * this.progress);
        canvas.drawRect(i / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() - (this.thumbSize / 2), (getMeasuredHeight() / 2) + AndroidUtilities.dp(1.0f), this.innerPaint);
        if (this.minValue == 0) {
            measuredWidth = this.thumbSize;
        } else {
            if (this.progress <= 0.5f) {
                canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() - this.thumbSize) / 2, (getMeasuredWidth() / 2) + AndroidUtilities.dp(1.0f), (getMeasuredHeight() + this.thumbSize) / 2, this.outerPaint);
                canvas.drawRect(i2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() / 2, (getMeasuredHeight() / 2) + AndroidUtilities.dp(1.0f), this.outerPaint);
                canvas.drawCircle(i2 + r3, measuredHeight + r3, this.thumbSize / 2, this.outerPaint);
            }
            canvas.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.dp(1.0f), (getMeasuredHeight() - this.thumbSize) / 2, getMeasuredWidth() / 2, (getMeasuredHeight() + this.thumbSize) / 2, this.outerPaint);
            measuredWidth = getMeasuredWidth();
        }
        canvas.drawRect(measuredWidth / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), i2, (getMeasuredHeight() / 2) + AndroidUtilities.dp(1.0f), this.outerPaint);
        canvas.drawCircle(i2 + r3, measuredHeight + r3, this.thumbSize / 2, this.outerPaint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float measuredWidth = (int) ((getMeasuredWidth() - this.thumbSize) * this.progress);
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
            return false;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.pressed) {
                this.pressed = false;
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 2 && this.pressed) {
            float f2 = (int) (x - this.thumbDX);
            this.progress = (f2 >= 0.0f ? f2 > ((float) (getMeasuredWidth() - this.thumbSize)) ? getMeasuredWidth() - this.thumbSize : f2 : 0.0f) / (getMeasuredWidth() - this.thumbSize);
            PhotoEditorSeekBarDelegate photoEditorSeekBarDelegate = this.delegate;
            if (photoEditorSeekBarDelegate != null) {
                photoEditorSeekBarDelegate.onProgressChanged(((Integer) getTag()).intValue(), getProgress());
            }
            invalidate();
            return true;
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
