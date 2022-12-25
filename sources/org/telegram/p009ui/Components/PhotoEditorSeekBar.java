package org.telegram.p009ui.Components;

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
        this.thumbSize = AndroidUtilities.m35dp(16.0f);
        this.thumbDX = 0;
        this.progress = 0.0f;
        this.pressed = false;
        this.innerPaint.setColor(-11711155);
        this.outerPaint.setColor(-1);
    }

    public void setDelegate(PhotoEditorSeekBarDelegate photoEditorSeekBarDelegate) {
        this.delegate = photoEditorSeekBarDelegate;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float measuredWidth = (int) ((getMeasuredWidth() - this.thumbSize) * this.progress);
        float f = 0.0f;
        if (motionEvent.getAction() == 0) {
            int measuredHeight = getMeasuredHeight();
            int i = this.thumbSize;
            float f2 = (measuredHeight - i) / 2;
            if (measuredWidth - f2 <= x && x <= i + measuredWidth + f2 && y >= 0.0f && y <= getMeasuredHeight()) {
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
            float f3 = (int) (x - this.thumbDX);
            if (f3 >= 0.0f) {
                f = f3 > ((float) (getMeasuredWidth() - this.thumbSize)) ? getMeasuredWidth() - this.thumbSize : f3;
            }
            this.progress = f / (getMeasuredWidth() - this.thumbSize);
            PhotoEditorSeekBarDelegate photoEditorSeekBarDelegate = this.delegate;
            if (photoEditorSeekBarDelegate != null) {
                photoEditorSeekBarDelegate.onProgressChanged(((Integer) getTag()).intValue(), getProgress());
            }
            invalidate();
            return true;
        }
        return false;
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

    public int getProgress() {
        int i = this.minValue;
        return (int) (i + (this.progress * (this.maxValue - i)));
    }

    public void setMinMax(int i, int i2) {
        this.minValue = i;
        this.maxValue = i2;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int measuredHeight = (getMeasuredHeight() - this.thumbSize) / 2;
        int measuredWidth = getMeasuredWidth();
        int i = this.thumbSize;
        int i2 = (int) ((measuredWidth - i) * this.progress);
        canvas.drawRect(i / 2, (getMeasuredHeight() / 2) - AndroidUtilities.m35dp(1.0f), getMeasuredWidth() - (this.thumbSize / 2), (getMeasuredHeight() / 2) + AndroidUtilities.m35dp(1.0f), this.innerPaint);
        if (this.minValue == 0) {
            canvas.drawRect(this.thumbSize / 2, (getMeasuredHeight() / 2) - AndroidUtilities.m35dp(1.0f), i2, (getMeasuredHeight() / 2) + AndroidUtilities.m35dp(1.0f), this.outerPaint);
        } else if (this.progress > 0.5f) {
            canvas.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.m35dp(1.0f), (getMeasuredHeight() - this.thumbSize) / 2, getMeasuredWidth() / 2, (getMeasuredHeight() + this.thumbSize) / 2, this.outerPaint);
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - AndroidUtilities.m35dp(1.0f), i2, (getMeasuredHeight() / 2) + AndroidUtilities.m35dp(1.0f), this.outerPaint);
        } else {
            canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() - this.thumbSize) / 2, (getMeasuredWidth() / 2) + AndroidUtilities.m35dp(1.0f), (getMeasuredHeight() + this.thumbSize) / 2, this.outerPaint);
            canvas.drawRect(i2, (getMeasuredHeight() / 2) - AndroidUtilities.m35dp(1.0f), getMeasuredWidth() / 2, (getMeasuredHeight() / 2) + AndroidUtilities.m35dp(1.0f), this.outerPaint);
        }
        int i3 = this.thumbSize;
        canvas.drawCircle(i2 + (i3 / 2), measuredHeight + (i3 / 2), i3 / 2, this.outerPaint);
    }
}
