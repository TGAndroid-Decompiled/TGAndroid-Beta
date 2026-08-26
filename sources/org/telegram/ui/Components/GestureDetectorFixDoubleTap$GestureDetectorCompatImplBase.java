package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.mediarouter.app.MediaRouteChooserDialog;

public final class GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase {
    public static final int TAP_TIMEOUT = ViewConfiguration.getTapTimeout();
    public boolean mAlwaysInBiggerTapRegion;
    public boolean mAlwaysInTapRegion;
    public MotionEvent mCurrentDownEvent;
    public boolean mDeferConfirmSingleTap;
    public final GestureDetectorFixDoubleTap$OnGestureListener mDoubleTapListener;
    public final int mDoubleTapSlopSquare;
    public float mDownFocusX;
    public float mDownFocusY;
    public boolean mInLongPress;
    public boolean mIsDoubleTapping;
    public boolean mIsLongpressEnabled;
    public float mLastFocusX;
    public float mLastFocusY;
    public final GestureDetectorFixDoubleTap$OnGestureListener mListener;
    public final int mMaximumFlingVelocity;
    public final int mMinimumFlingVelocity;
    public MotionEvent mPreviousUpEvent;
    public boolean mStillDown;
    public final int mTouchSlopSquare;
    public VelocityTracker mVelocityTracker;
    public long mLongpressDuration = ViewConfiguration.getLongPressTimeout();
    public final MediaRouteChooserDialog.AnonymousClass1 mHandler = new MediaRouteChooserDialog.AnonymousClass1(this, 8);

    public GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase(Context context, GestureDetectorFixDoubleTap$OnGestureListener gestureDetectorFixDoubleTap$OnGestureListener) {
        this.mListener = gestureDetectorFixDoubleTap$OnGestureListener;
        this.mDoubleTapListener = gestureDetectorFixDoubleTap$OnGestureListener;
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        this.mIsLongpressEnabled = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
        this.mMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mTouchSlopSquare = scaledTouchSlop * scaledTouchSlop;
        this.mDoubleTapSlopSquare = scaledDoubleTapSlop * scaledDoubleTapSlop;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnDoubleTap;
        MotionEvent motionEvent2;
        boolean zOnFling;
        boolean zOnScroll;
        int action = motionEvent.getAction();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int i = action & 255;
        boolean z = i == 6;
        int actionIndex = z ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float x = 0.0f;
        float y = 0.0f;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (actionIndex != i2) {
                x += motionEvent.getX(i2);
                y += motionEvent.getY(i2);
            }
        }
        float f = z ? pointerCount - 1 : pointerCount;
        float f2 = x / f;
        float f3 = y / f;
        GestureDetectorFixDoubleTap$OnGestureListener gestureDetectorFixDoubleTap$OnGestureListener = this.mListener;
        GestureDetectorFixDoubleTap$OnGestureListener gestureDetectorFixDoubleTap$OnGestureListener2 = this.mDoubleTapListener;
        MediaRouteChooserDialog.AnonymousClass1 anonymousClass1 = this.mHandler;
        if (i == 0) {
            if (gestureDetectorFixDoubleTap$OnGestureListener2 == null || !gestureDetectorFixDoubleTap$OnGestureListener.hasDoubleTap()) {
                zOnDoubleTap = false;
            } else {
                boolean zHasMessages = anonymousClass1.hasMessages(3);
                if (zHasMessages) {
                    anonymousClass1.removeMessages(3);
                }
                MotionEvent motionEvent3 = this.mCurrentDownEvent;
                if (motionEvent3 != null && (motionEvent2 = this.mPreviousUpEvent) != null && zHasMessages && this.mAlwaysInBiggerTapRegion && motionEvent.getEventTime() - motionEvent2.getEventTime() <= 220) {
                    int x2 = ((int) motionEvent3.getX()) - ((int) motionEvent.getX());
                    int y2 = ((int) motionEvent3.getY()) - ((int) motionEvent.getY());
                    if ((y2 * y2) + (x2 * x2) < this.mDoubleTapSlopSquare) {
                        this.mIsDoubleTapping = true;
                        zOnDoubleTap = gestureDetectorFixDoubleTap$OnGestureListener2.onDoubleTap(this.mCurrentDownEvent) | gestureDetectorFixDoubleTap$OnGestureListener2.onDoubleTapEvent(motionEvent);
                    }
                }
                anonymousClass1.sendEmptyMessageDelayed(3, 220L);
                zOnDoubleTap = false;
            }
            this.mLastFocusX = f2;
            this.mDownFocusX = f2;
            this.mLastFocusY = f3;
            this.mDownFocusY = f3;
            MotionEvent motionEvent4 = this.mCurrentDownEvent;
            if (motionEvent4 != null) {
                motionEvent4.recycle();
            }
            this.mCurrentDownEvent = MotionEvent.obtain(motionEvent);
            this.mAlwaysInTapRegion = true;
            this.mAlwaysInBiggerTapRegion = true;
            this.mStillDown = true;
            this.mInLongPress = false;
            this.mDeferConfirmSingleTap = false;
            boolean z2 = this.mIsLongpressEnabled;
            int i3 = TAP_TIMEOUT;
            if (z2) {
                anonymousClass1.removeMessages(2);
                anonymousClass1.sendEmptyMessageAtTime(2, this.mCurrentDownEvent.getDownTime() + ((long) i3) + this.mLongpressDuration);
            }
            anonymousClass1.sendEmptyMessageAtTime(1, this.mCurrentDownEvent.getDownTime() + ((long) i3));
            return gestureDetectorFixDoubleTap$OnGestureListener.onDown(motionEvent) | zOnDoubleTap;
        }
        int i4 = this.mMaximumFlingVelocity;
        if (i == 1) {
            this.mStillDown = false;
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            if (this.mIsDoubleTapping) {
                zOnFling = gestureDetectorFixDoubleTap$OnGestureListener2.onDoubleTapEvent(motionEvent);
            } else {
                if (this.mInLongPress) {
                    anonymousClass1.removeMessages(3);
                    this.mInLongPress = false;
                } else if (this.mAlwaysInTapRegion) {
                    boolean zOnSingleTapUp = gestureDetectorFixDoubleTap$OnGestureListener.onSingleTapUp(motionEvent);
                    if (this.mDeferConfirmSingleTap && gestureDetectorFixDoubleTap$OnGestureListener2 != null) {
                        gestureDetectorFixDoubleTap$OnGestureListener2.onSingleTapConfirmed(motionEvent);
                    }
                    zOnFling = zOnSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = this.mVelocityTracker;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(1000, i4);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    float fAbs = Math.abs(yVelocity);
                    float f4 = this.mMinimumFlingVelocity;
                    if (fAbs > f4 || Math.abs(xVelocity) > f4) {
                        zOnFling = gestureDetectorFixDoubleTap$OnGestureListener.onFling(this.mCurrentDownEvent, motionEvent, xVelocity, yVelocity);
                    }
                }
                zOnFling = false;
            }
            MotionEvent motionEvent5 = this.mPreviousUpEvent;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            this.mPreviousUpEvent = motionEventObtain;
            VelocityTracker velocityTracker2 = this.mVelocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.mVelocityTracker = null;
            }
            this.mIsDoubleTapping = false;
            this.mDeferConfirmSingleTap = false;
            anonymousClass1.removeMessages(1);
            anonymousClass1.removeMessages(2);
            return zOnFling;
        }
        if (i != 2) {
            if (i == 3) {
                anonymousClass1.removeMessages(1);
                anonymousClass1.removeMessages(2);
                anonymousClass1.removeMessages(3);
                this.mVelocityTracker.recycle();
                this.mVelocityTracker = null;
                this.mIsDoubleTapping = false;
                this.mStillDown = false;
                this.mAlwaysInTapRegion = false;
                this.mAlwaysInBiggerTapRegion = false;
                this.mDeferConfirmSingleTap = false;
                if (this.mInLongPress) {
                    this.mInLongPress = false;
                    return false;
                }
            } else if (i == 5) {
                this.mLastFocusX = f2;
                this.mDownFocusX = f2;
                this.mLastFocusY = f3;
                this.mDownFocusY = f3;
                anonymousClass1.removeMessages(1);
                anonymousClass1.removeMessages(2);
                anonymousClass1.removeMessages(3);
                this.mIsDoubleTapping = false;
                this.mAlwaysInTapRegion = false;
                this.mAlwaysInBiggerTapRegion = false;
                this.mDeferConfirmSingleTap = false;
                if (this.mInLongPress) {
                    this.mInLongPress = false;
                    return false;
                }
            } else if (i == 6) {
                this.mLastFocusX = f2;
                this.mDownFocusX = f2;
                this.mLastFocusY = f3;
                this.mDownFocusY = f3;
                this.mVelocityTracker.computeCurrentVelocity(1000, i4);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = this.mVelocityTracker.getXVelocity(pointerId2);
                float yVelocity2 = this.mVelocityTracker.getYVelocity(pointerId2);
                for (int i5 = 0; i5 < pointerCount; i5++) {
                    if (i5 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i5);
                        if ((this.mVelocityTracker.getYVelocity(pointerId3) * yVelocity2) + (this.mVelocityTracker.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            this.mVelocityTracker.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!this.mInLongPress) {
            float f5 = this.mLastFocusX - f2;
            float f6 = this.mLastFocusY - f3;
            if (this.mIsDoubleTapping) {
                return gestureDetectorFixDoubleTap$OnGestureListener2.onDoubleTapEvent(motionEvent);
            }
            if (this.mAlwaysInTapRegion) {
                int i6 = (int) (f2 - this.mDownFocusX);
                int i7 = (int) (f3 - this.mDownFocusY);
                int i8 = (i7 * i7) + (i6 * i6);
                int i9 = this.mTouchSlopSquare;
                if (i8 > i9) {
                    zOnScroll = gestureDetectorFixDoubleTap$OnGestureListener.onScroll(this.mCurrentDownEvent, motionEvent, f5, f6);
                    this.mLastFocusX = f2;
                    this.mLastFocusY = f3;
                    this.mAlwaysInTapRegion = false;
                    anonymousClass1.removeMessages(3);
                    anonymousClass1.removeMessages(1);
                    anonymousClass1.removeMessages(2);
                } else {
                    zOnScroll = false;
                }
                if (i8 > i9) {
                    this.mAlwaysInBiggerTapRegion = false;
                }
                return zOnScroll;
            }
            if (Math.abs(f5) >= 1.0f || Math.abs(f6) >= 1.0f) {
                boolean zOnScroll2 = gestureDetectorFixDoubleTap$OnGestureListener.onScroll(this.mCurrentDownEvent, motionEvent, f5, f6);
                this.mLastFocusX = f2;
                this.mLastFocusY = f3;
                return zOnScroll2;
            }
        }
        return false;
    }
}
