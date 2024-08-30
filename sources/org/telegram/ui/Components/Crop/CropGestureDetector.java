package org.telegram.ui.Components.Crop;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;

public class CropGestureDetector {
    private ScaleGestureDetector mDetector;
    private boolean mIsDragging;
    private float mLastTouchX;
    private float mLastTouchY;
    private CropGestureListener mListener;
    private final float mMinimumVelocity;
    private VelocityTracker mVelocityTracker;
    private boolean started;
    private long touchTime;
    private final float mTouchSlop = AndroidUtilities.dp(1.0f);
    private int mActivePointerId = -1;
    private int mActivePointerIndex = 0;

    public interface CropGestureListener {
        void onDrag(float f, float f2);

        void onFling(float f, float f2, float f3, float f4);

        void onScale(float f, float f2, float f3);

        void onTapUp();
    }

    public CropGestureDetector(Context context) {
        this.mMinimumVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.mDetector = new ScaleGestureDetector(context, new ScaleGestureDetector.OnScaleGestureListener() {
            @Override
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                CropGestureDetector.this.mListener.onScale(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                return true;
            }

            @Override
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            @Override
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }
        });
    }

    float getActiveX(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.mActivePointerIndex);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    float getActiveY(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.mActivePointerIndex);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    public boolean isDragging() {
        return this.mIsDragging;
    }

    public boolean isScaling() {
        return this.mDetector.isInProgress();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.mDetector.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.touchTime = SystemClock.elapsedRealtime();
        } else if (action == 1 || action == 3) {
            if (!this.mIsDragging && SystemClock.elapsedRealtime() - this.touchTime < 800) {
                this.mListener.onTapUp();
            }
            this.mActivePointerId = -1;
        } else if (action == 6) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            if (motionEvent.getPointerId(action2) == this.mActivePointerId) {
                int i = action2 == 0 ? 1 : 0;
                this.mActivePointerId = motionEvent.getPointerId(i);
                this.mLastTouchX = motionEvent.getX(i);
                this.mLastTouchY = motionEvent.getY(i);
            }
        }
        int i2 = this.mActivePointerId;
        if (i2 == -1) {
            i2 = 0;
        }
        this.mActivePointerIndex = motionEvent.findPointerIndex(i2);
        int action3 = motionEvent.getAction();
        if (action3 != 0) {
            if (action3 == 1) {
                if (this.mIsDragging) {
                    if (this.mVelocityTracker != null) {
                        this.mLastTouchX = getActiveX(motionEvent);
                        this.mLastTouchY = getActiveY(motionEvent);
                        this.mVelocityTracker.addMovement(motionEvent);
                        this.mVelocityTracker.computeCurrentVelocity(1000);
                        float xVelocity = this.mVelocityTracker.getXVelocity();
                        float yVelocity = this.mVelocityTracker.getYVelocity();
                        if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.mMinimumVelocity) {
                            this.mListener.onFling(this.mLastTouchX, this.mLastTouchY, -xVelocity, -yVelocity);
                        }
                    }
                    this.mIsDragging = false;
                }
                VelocityTracker velocityTracker = this.mVelocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.mVelocityTracker = null;
                }
                this.started = false;
            } else if (action3 != 2) {
                if (action3 == 3) {
                    VelocityTracker velocityTracker2 = this.mVelocityTracker;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.mVelocityTracker = null;
                    }
                    this.started = false;
                    this.mIsDragging = false;
                }
            }
            return true;
        }
        if (!this.started) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.mVelocityTracker = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            this.mLastTouchX = getActiveX(motionEvent);
            this.mLastTouchY = getActiveY(motionEvent);
            this.mIsDragging = false;
            this.started = true;
            return true;
        }
        float activeX = getActiveX(motionEvent);
        float activeY = getActiveY(motionEvent);
        float f = activeX - this.mLastTouchX;
        float f2 = activeY - this.mLastTouchY;
        if (!this.mIsDragging) {
            this.mIsDragging = ((float) Math.sqrt((double) ((f * f) + (f2 * f2)))) >= this.mTouchSlop;
        }
        if (this.mIsDragging) {
            this.mListener.onDrag(f, f2);
            this.mLastTouchX = activeX;
            this.mLastTouchY = activeY;
            VelocityTracker velocityTracker3 = this.mVelocityTracker;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
        return true;
    }

    public void setOnGestureListener(CropGestureListener cropGestureListener) {
        this.mListener = cropGestureListener;
    }
}
