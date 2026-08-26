package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public class VideoSeekBarView extends View {
    private SeekBarDelegate delegate;
    private Paint paint;
    private Paint paint2;
    private boolean pressed;
    private float progress;
    private int thumbDX;
    private int thumbHeight;
    private int thumbWidth;

    public interface SeekBarDelegate {
        void onSeekBarDrag(float f);
    }

    public VideoSeekBarView(Context context) {
        super(context);
        this.paint = new Paint();
        this.paint2 = new Paint(1);
        this.thumbWidth = AndroidUtilities.dp(12.0f);
        this.thumbHeight = AndroidUtilities.dp(12.0f);
        this.thumbDX = 0;
        this.progress = 0.0f;
        this.pressed = false;
        this.paint.setColor(-10724260);
        this.paint2.setColor(-1);
    }

    public float getProgress() {
        return this.progress;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredHeight = (getMeasuredHeight() - this.thumbHeight) / 2;
        int measuredWidth = getMeasuredWidth();
        int i = this.thumbWidth;
        int i2 = (int) ((measuredWidth - i) * this.progress);
        canvas.drawRect(i / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() - (this.thumbWidth / 2), AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), this.paint);
        int i3 = this.thumbWidth / 2;
        canvas.drawCircle(i2 + i3, (this.thumbHeight / 2) + measuredHeight, i3, this.paint2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        SeekBarDelegate seekBarDelegate;
        if (motionEvent == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float measuredWidth = (int) ((getMeasuredWidth() - this.thumbWidth) * this.progress);
        float measuredWidth2 = 0.0f;
        if (motionEvent.getAction() == 0) {
            int measuredHeight = getMeasuredHeight();
            int i = this.thumbWidth;
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
                if (motionEvent.getAction() == 1 && (seekBarDelegate = this.delegate) != null) {
                    seekBarDelegate.onSeekBarDrag(measuredWidth / (getMeasuredWidth() - this.thumbWidth));
                }
                this.pressed = false;
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 2 && this.pressed) {
            float f2 = (int) (x - this.thumbDX);
            if (f2 >= 0.0f) {
                measuredWidth2 = f2 > ((float) (getMeasuredWidth() - this.thumbWidth)) ? getMeasuredWidth() - this.thumbWidth : f2;
            }
            this.progress = measuredWidth2 / (getMeasuredWidth() - this.thumbWidth);
            invalidate();
            return true;
        }
        return false;
    }

    public void setDelegate(SeekBarDelegate seekBarDelegate) {
        this.delegate = seekBarDelegate;
    }

    public void setProgress(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        this.progress = f;
        invalidate();
    }
}
