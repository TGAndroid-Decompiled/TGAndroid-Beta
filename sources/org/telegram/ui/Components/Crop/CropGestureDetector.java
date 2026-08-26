package org.telegram.ui.Components.Crop;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Stories.LiveStoryPipOverlay;

public final class CropGestureDetector {
    public final ScaleGestureDetector mDetector;
    public boolean mIsDragging;
    public float mLastTouchX;
    public float mLastTouchY;
    public CropView mListener;
    public final float mMinimumVelocity;
    public VelocityTracker mVelocityTracker;
    public boolean started;
    public long touchTime;
    public final float mTouchSlop = AndroidUtilities.dp(1.0f);
    public int mActivePointerId = -1;
    public int mActivePointerIndex = 0;

    public CropGestureDetector(Context context) {
        this.mMinimumVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.mDetector = new ScaleGestureDetector(context, new LiveStoryPipOverlay.AnonymousClass3(this, 1));
    }

    public final void onTouchEvent(MotionEvent motionEvent) {
        float x;
        float y;
        float x2;
        float y2;
        float x3;
        float y3;
        CropView.CropViewListener cropViewListener;
        this.mDetector.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.touchTime = SystemClock.elapsedRealtime();
        } else if (action == 1 || action == 3) {
            if (!this.mIsDragging && SystemClock.elapsedRealtime() - this.touchTime < 800 && (cropViewListener = this.mListener.listener) != null) {
                cropViewListener.onTapUp();
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
                        try {
                            x3 = motionEvent.getX(this.mActivePointerIndex);
                        } catch (Exception unused) {
                            x3 = motionEvent.getX();
                        }
                        this.mLastTouchX = x3;
                        try {
                            y3 = motionEvent.getY(this.mActivePointerIndex);
                        } catch (Exception unused2) {
                            y3 = motionEvent.getY();
                        }
                        this.mLastTouchY = y3;
                        this.mVelocityTracker.addMovement(motionEvent);
                        this.mVelocityTracker.computeCurrentVelocity(1000);
                        if (Math.max(Math.abs(this.mVelocityTracker.getXVelocity()), Math.abs(this.mVelocityTracker.getYVelocity())) >= this.mMinimumVelocity) {
                            this.mListener.getClass();
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
                return;
            }
            if (action3 != 2) {
                if (action3 != 3) {
                    return;
                }
                VelocityTracker velocityTracker2 = this.mVelocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.mVelocityTracker = null;
                }
                this.started = false;
                this.mIsDragging = false;
                return;
            }
        }
        if (!this.started) {
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.mVelocityTracker = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            try {
                x2 = motionEvent.getX(this.mActivePointerIndex);
            } catch (Exception unused3) {
                x2 = motionEvent.getX();
            }
            this.mLastTouchX = x2;
            try {
                y2 = motionEvent.getY(this.mActivePointerIndex);
            } catch (Exception unused4) {
                y2 = motionEvent.getY();
            }
            this.mLastTouchY = y2;
            this.mIsDragging = false;
            this.started = true;
            return;
        }
        try {
            x = motionEvent.getX(this.mActivePointerIndex);
        } catch (Exception unused5) {
            x = motionEvent.getX();
        }
        try {
            y = motionEvent.getY(this.mActivePointerIndex);
        } catch (Exception unused6) {
            y = motionEvent.getY();
        }
        float f = x - this.mLastTouchX;
        float f2 = y - this.mLastTouchY;
        if (!this.mIsDragging) {
            this.mIsDragging = ((float) Math.sqrt((double) ((f2 * f2) + (f * f)))) >= this.mTouchSlop;
        }
        if (this.mIsDragging) {
            CropView cropView = this.mListener;
            if (!cropView.animating) {
                CropView.CropState.access$600(cropView.state, f, f2);
                cropView.updateMatrix(false);
            }
            this.mLastTouchX = x;
            this.mLastTouchY = y;
            VelocityTracker velocityTracker3 = this.mVelocityTracker;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }
}
