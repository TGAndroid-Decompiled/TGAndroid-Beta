package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.mediarouter.app.MediaRouteChooserDialog;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.ui.PhotoViewer;

public final class GestureDetector2 {
    public static final int DOUBLE_TAP_TIMEOUT;
    public static final int TAP_TIMEOUT;
    public boolean mAlwaysInBiggerTapRegion;
    public boolean mAlwaysInTapRegion;
    public MotionEvent mCurrentDownEvent;
    public MotionEvent mCurrentMotionEvent;
    public boolean mDeferConfirmSingleTap;
    public OnDoubleTapListener mDoubleTapListener;
    public final int mDoubleTapSlopSquare;
    public final int mDoubleTapTouchSlopSquare;
    public float mDownFocusX;
    public float mDownFocusY;
    public final MediaRouteChooserDialog.AnonymousClass1 mHandler;
    public boolean mInLongPress;
    public boolean mIsDoubleTapping;
    public boolean mIsLongpressEnabled;
    public float mLastFocusX;
    public float mLastFocusY;
    public final OnGestureListener mListener;
    public final int mMaximumFlingVelocity;
    public final int mMinimumFlingVelocity;
    public MotionEvent mPreviousUpEvent;
    public boolean mStillDown;
    public final int mTouchSlopSquare;
    public VelocityTracker mVelocityTracker;

    public interface OnDoubleTapListener {
    }

    public interface OnGestureListener {
        boolean onDown(MotionEvent motionEvent);

        boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        void onLongPress(MotionEvent motionEvent);

        boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        boolean onSingleTapUp(MotionEvent motionEvent);

        void onUp();
    }

    static {
        ViewConfiguration.getLongPressTimeout();
        TAP_TIMEOUT = ViewConfiguration.getTapTimeout();
        DOUBLE_TAP_TIMEOUT = ViewConfiguration.getDoubleTapTimeout();
    }

    public GestureDetector2(Context context, PhotoViewer photoViewer) {
        this(context, (OnGestureListener) photoViewer);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        MotionEvent motionEvent2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        PhotoViewer.AnonymousClass79 anonymousClass79;
        MessageObject messageObject;
        PhotoViewer.AnonymousClass79 anonymousClass710;
        OnDoubleTapListener onDoubleTapListener;
        boolean zOnScroll;
        int i;
        boolean z6;
        int i2;
        int action = motionEvent.getAction();
        MotionEvent motionEvent3 = this.mCurrentMotionEvent;
        if (motionEvent3 != null) {
            motionEvent3.recycle();
        }
        this.mCurrentMotionEvent = MotionEvent.obtain(motionEvent);
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int i3 = action & 255;
        boolean z7 = i3 == 6;
        int actionIndex = z7 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float x = 0.0f;
        float y = 0.0f;
        for (int i4 = 0; i4 < pointerCount; i4++) {
            if (actionIndex != i4) {
                x += motionEvent.getX(i4);
                y += motionEvent.getY(i4);
            }
        }
        float f = z7 ? pointerCount - 1 : pointerCount;
        float f2 = x / f;
        float f3 = y / f;
        OnGestureListener onGestureListener = this.mListener;
        MediaRouteChooserDialog.AnonymousClass1 anonymousClass1 = this.mHandler;
        if (i3 != 0) {
            int i5 = this.mMaximumFlingVelocity;
            if (i3 == 1) {
                boolean zOnFling = false;
                this.mStillDown = false;
                onGestureListener.onUp();
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                if (!this.mIsDoubleTapping) {
                    if (this.mInLongPress) {
                        anonymousClass1.removeMessages(3);
                        this.mInLongPress = false;
                    } else if (this.mAlwaysInTapRegion) {
                        boolean zOnSingleTapUp = onGestureListener.onSingleTapUp(motionEvent);
                        if (this.mDeferConfirmSingleTap && (onDoubleTapListener = this.mDoubleTapListener) != null) {
                            ((PhotoViewer) onDoubleTapListener).onSingleTapConfirmed(motionEvent);
                        }
                        zOnFling = zOnSingleTapUp;
                    } else {
                        VelocityTracker velocityTracker = this.mVelocityTracker;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(1000, i5);
                        float yVelocity = velocityTracker.getYVelocity(pointerId);
                        float xVelocity = velocityTracker.getXVelocity(pointerId);
                        float fAbs = Math.abs(yVelocity);
                        float f4 = this.mMinimumFlingVelocity;
                        if (fAbs > f4 || Math.abs(xVelocity) > f4) {
                            zOnFling = onGestureListener.onFling(this.mCurrentDownEvent, motionEvent, xVelocity, yVelocity);
                        }
                    }
                    zOnFling = false;
                }
                MotionEvent motionEvent4 = this.mPreviousUpEvent;
                if (motionEvent4 != null) {
                    motionEvent4.recycle();
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
            if (i3 != 2) {
                if (i3 == 3) {
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
                    this.mInLongPress = false;
                    return false;
                }
                if (i3 == 5) {
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
                    this.mInLongPress = false;
                    return false;
                }
                if (i3 != 6) {
                    return false;
                }
                this.mLastFocusX = f2;
                this.mDownFocusX = f2;
                this.mLastFocusY = f3;
                this.mDownFocusY = f3;
                this.mVelocityTracker.computeCurrentVelocity(1000, i5);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = this.mVelocityTracker.getXVelocity(pointerId2);
                float yVelocity2 = this.mVelocityTracker.getYVelocity(pointerId2);
                for (int i6 = 0; i6 < pointerCount; i6++) {
                    if (i6 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i6);
                        if ((this.mVelocityTracker.getYVelocity(pointerId3) * yVelocity2) + (this.mVelocityTracker.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            this.mVelocityTracker.clear();
                            return false;
                        }
                    }
                }
                return false;
            }
            if (this.mInLongPress) {
                return false;
            }
            int i7 = Build.VERSION.SDK_INT;
            int classification = i7 >= 29 ? motionEvent.getClassification() : 0;
            boolean zHasMessages = anonymousClass1.hasMessages(2);
            float f5 = this.mLastFocusX - f2;
            float f6 = this.mLastFocusY - f3;
            if (!this.mIsDoubleTapping) {
                if (this.mAlwaysInTapRegion) {
                    int i8 = (int) (f2 - this.mDownFocusX);
                    int i9 = (int) (f3 - this.mDownFocusY);
                    int i10 = (i9 * i9) + (i8 * i8);
                    boolean z8 = i7 >= 29 && classification == 1;
                    int i11 = this.mTouchSlopSquare;
                    if (zHasMessages && z8) {
                        if (i10 > i11) {
                            anonymousClass1.removeMessages(2);
                            anonymousClass1.sendMessageDelayed(anonymousClass1.obtainMessage(2, 0, 0), (long) (ViewConfiguration.getLongPressTimeout() * 2.0f));
                            i2 = i11;
                        } else {
                            i2 = i11;
                        }
                        i = (int) (i2 * 4.0f);
                    } else {
                        zHasMessages = zHasMessages;
                        i = i11;
                    }
                    if (i10 > i) {
                        zOnScroll = onGestureListener.onScroll(this.mCurrentDownEvent, motionEvent, f5, f6);
                        this.mLastFocusX = f2;
                        this.mLastFocusY = f3;
                        z6 = false;
                        this.mAlwaysInTapRegion = false;
                        anonymousClass1.removeMessages(3);
                        anonymousClass1.removeMessages(1);
                        anonymousClass1.removeMessages(2);
                    } else {
                        z6 = false;
                        zOnScroll = false;
                    }
                    if (i10 > this.mDoubleTapTouchSlopSquare) {
                        this.mAlwaysInBiggerTapRegion = z6;
                    }
                } else {
                    zHasMessages = zHasMessages;
                    if (Math.abs(f5) >= 1.0f || Math.abs(f6) >= 1.0f) {
                        zOnScroll = onGestureListener.onScroll(this.mCurrentDownEvent, motionEvent, f5, f6);
                        this.mLastFocusX = f2;
                        this.mLastFocusY = f3;
                    }
                }
                if (i7 >= 29 && classification == 2 && zHasMessages) {
                    anonymousClass1.removeMessages(2);
                    anonymousClass1.sendMessage(anonymousClass1.obtainMessage(2, 0, 0));
                }
                return zOnScroll;
            }
            zHasMessages = zHasMessages;
            zOnScroll = false;
            if (i7 >= 29) {
                anonymousClass1.removeMessages(2);
                anonymousClass1.sendMessage(anonymousClass1.obtainMessage(2, 0, 0));
            }
            return zOnScroll;
        }
        this.mDeferConfirmSingleTap = false;
        OnDoubleTapListener onDoubleTapListener2 = this.mDoubleTapListener;
        if (onDoubleTapListener2 != null) {
            PhotoViewer photoViewer = (PhotoViewer) onDoubleTapListener2;
            if (photoViewer.checkImageView.getVisibility() != 0) {
                boolean[] zArr = photoViewer.drawPressedDrawable;
                if (!zArr[0] && !zArr[1]) {
                    float x2 = motionEvent.getX();
                    int iMin = Math.min(135, photoViewer.containerView.getMeasuredWidth() / 8);
                    if ((x2 < iMin || x2 > photoViewer.containerView.getMeasuredWidth() - iMin) && (messageObject = photoViewer.currentMessageObject) != null && ((!messageObject.isVideo() && ((anonymousClass710 = photoViewer.photoViewerWebView) == null || !anonymousClass710.isYouTube)) || SystemClock.elapsedRealtime() - photoViewer.lastPhotoSetTime < 500 || !photoViewer.canDoubleTapSeekVideo(motionEvent))) {
                        this.mDeferConfirmSingleTap = true;
                        z = false;
                    }
                }
            }
            boolean zHasMessages2 = anonymousClass1.hasMessages(3);
            if (zHasMessages2) {
                anonymousClass1.removeMessages(3);
            }
            MotionEvent motionEvent5 = this.mCurrentDownEvent;
            int i12 = DOUBLE_TAP_TIMEOUT;
            if (motionEvent5 != null && (motionEvent2 = this.mPreviousUpEvent) != null && zHasMessages2 && this.mAlwaysInBiggerTapRegion) {
                long eventTime = motionEvent.getEventTime() - motionEvent2.getEventTime();
                if (eventTime <= i12 && eventTime >= 40) {
                    int x3 = ((int) motionEvent5.getX()) - ((int) motionEvent.getX());
                    int y2 = ((int) motionEvent5.getY()) - ((int) motionEvent.getY());
                    if ((y2 * y2) + (x3 * x3) < this.mDoubleTapSlopSquare) {
                        this.mIsDoubleTapping = true;
                        OnDoubleTapListener onDoubleTapListener3 = this.mDoubleTapListener;
                        MotionEvent motionEvent6 = this.mCurrentDownEvent;
                        PhotoViewer photoViewer2 = (PhotoViewer) onDoubleTapListener3;
                        long j = 0;
                        if ((photoViewer2.videoPlayer != null || ((anonymousClass79 = photoViewer2.photoViewerWebView) != null && anonymousClass79.isYouTube)) && photoViewer2.videoPlayerControlVisible) {
                            long currentVideoPosition = photoViewer2.getCurrentVideoPosition();
                            long videoDuration = photoViewer2.getVideoDuration();
                            float x4 = motionEvent6.getX();
                            int containerViewWidth = photoViewer2.getContainerViewWidth(photoViewer2.currentEditMode) / 3;
                            float f7 = containerViewWidth * 2;
                            if (photoViewer2.canDoubleTapSeekVideo(motionEvent6)) {
                                long j2 = x4 >= f7 ? currentVideoPosition + 10000 : x4 < ((float) containerViewWidth) ? currentVideoPosition - 10000 : currentVideoPosition;
                                if (currentVideoPosition != j2) {
                                    if (j2 > videoDuration) {
                                        j = videoDuration;
                                    } else if (j2 < 0) {
                                        z2 = j2 >= -9000;
                                        if (z2) {
                                            photoViewer2.videoForwardDrawable.setOneShootAnimation(true);
                                            VideoForwardDrawable videoForwardDrawable = photoViewer2.videoForwardDrawable;
                                            if (x4 < containerViewWidth) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            videoForwardDrawable.setLeftSide(z3);
                                            VideoForwardDrawable videoForwardDrawable2 = photoViewer2.videoForwardDrawable;
                                            onGestureListener = onGestureListener;
                                            long j3 = videoForwardDrawable2.time + 10000;
                                            videoForwardDrawable2.time = j3;
                                            videoForwardDrawable2.timeStr = LocaleController.formatPluralString("Seconds", (int) (j3 / 1000), new Object[0]);
                                            photoViewer2.seekVideoOrWebTo(j);
                                            photoViewer2.containerView.invalidate();
                                            photoViewer2.videoPlayerSeekbar.setProgress(j / videoDuration, true);
                                            photoViewer2.videoPlayerSeekbarView.invalidate();
                                        } else {
                                            onGestureListener = onGestureListener;
                                        }
                                    } else {
                                        j = j2;
                                    }
                                    if (z2) {
                                        photoViewer2.videoForwardDrawable.setOneShootAnimation(true);
                                        VideoForwardDrawable videoForwardDrawable3 = photoViewer2.videoForwardDrawable;
                                        if (x4 < containerViewWidth) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        videoForwardDrawable3.setLeftSide(z3);
                                        VideoForwardDrawable videoForwardDrawable4 = photoViewer2.videoForwardDrawable;
                                        onGestureListener = onGestureListener;
                                        long j4 = videoForwardDrawable4.time + 10000;
                                        videoForwardDrawable4.time = j4;
                                        videoForwardDrawable4.timeStr = LocaleController.formatPluralString("Seconds", (int) (j4 / 1000), new Object[0]);
                                        photoViewer2.seekVideoOrWebTo(j);
                                        photoViewer2.containerView.invalidate();
                                        photoViewer2.videoPlayerSeekbar.setProgress(j / videoDuration, true);
                                        photoViewer2.videoPlayerSeekbarView.invalidate();
                                    } else {
                                        onGestureListener = onGestureListener;
                                    }
                                }
                                z4 = true;
                                this.mDoubleTapListener.getClass();
                                z = z4;
                            }
                        }
                        if (photoViewer2.canZoom && ((photoViewer2.scale != 1.0f || (photoViewer2.translationY == 0.0f && photoViewer2.translationX == 0.0f)) && photoViewer2.animationStartTime == 0 && photoViewer2.animationInProgress == 0)) {
                            PhotoViewer.PhotoProgressView photoProgressView = photoViewer2.photoProgressViews[0];
                            if (photoProgressView != null && photoProgressView.visible && photoProgressView.backgroundState != -1) {
                                if (Math.sqrt(Math.pow(((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) / 2.0f) - motionEvent6.getY(), 2.0d) + Math.pow((AndroidUtilities.displaySize.x / 2.0f) - motionEvent6.getX(), 2.0d)) < AndroidUtilities.dp(40.0f)) {
                                }
                                this.mDoubleTapListener.getClass();
                                z = z4;
                            }
                            if (photoViewer2.scale == 1.0f) {
                                float fM = TextureRenderer$$ExternalSyntheticOutline0.m(3.0f, photoViewer2.scale, (motionEvent6.getX() - (photoViewer2.getContainerViewWidth(photoViewer2.currentEditMode) / 2)) - photoViewer2.translationX, motionEvent6.getX() - (photoViewer2.getContainerViewWidth(photoViewer2.currentEditMode) / 2));
                                float fM2 = TextureRenderer$$ExternalSyntheticOutline0.m(3.0f, photoViewer2.scale, (motionEvent6.getY() - (photoViewer2.getContainerViewHeight(photoViewer2.currentEditMode, false) / 2)) - photoViewer2.translationY, motionEvent6.getY() - (photoViewer2.getContainerViewHeight(photoViewer2.currentEditMode, false) / 2));
                                photoViewer2.updateMinMax(3.0f);
                                float f8 = photoViewer2.minX;
                                if (fM < f8) {
                                    fM = f8;
                                } else {
                                    f8 = photoViewer2.maxX;
                                    if (fM > f8) {
                                        fM = f8;
                                    }
                                }
                                float f9 = photoViewer2.minY;
                                if (fM2 < f9) {
                                    fM2 = f9;
                                } else {
                                    f9 = photoViewer2.maxY;
                                    if (fM2 > f9) {
                                        fM2 = f9;
                                    }
                                }
                                z5 = true;
                                photoViewer2.animateTo(3.0f, fM, fM2, true);
                            } else {
                                z5 = true;
                                photoViewer2.animateTo(1.0f, 0.0f, 0.0f, true);
                            }
                            photoViewer2.doubleTap = z5;
                            photoViewer2.hidePressedDrawables();
                            z4 = true;
                            this.mDoubleTapListener.getClass();
                            z = z4;
                        }
                        z4 = false;
                        this.mDoubleTapListener.getClass();
                        z = z4;
                    }
                }
            }
            anonymousClass1.sendEmptyMessageDelayed(3, i12);
            z = false;
        } else {
            z = false;
        }
        this.mLastFocusX = f2;
        this.mDownFocusX = f2;
        this.mLastFocusY = f3;
        this.mDownFocusY = f3;
        MotionEvent motionEvent7 = this.mCurrentDownEvent;
        if (motionEvent7 != null) {
            motionEvent7.recycle();
        }
        this.mCurrentDownEvent = MotionEvent.obtain(motionEvent);
        this.mAlwaysInTapRegion = true;
        this.mAlwaysInBiggerTapRegion = true;
        this.mStillDown = true;
        this.mInLongPress = false;
        if (this.mIsLongpressEnabled) {
            anonymousClass1.removeMessages(2);
            anonymousClass1.sendMessageDelayed(anonymousClass1.obtainMessage(2, 0, 0), ViewConfiguration.getLongPressTimeout());
        }
        anonymousClass1.sendEmptyMessageAtTime(1, this.mCurrentDownEvent.getDownTime() + ((long) TAP_TIMEOUT));
        return onGestureListener.onDown(motionEvent) | z;
    }

    public final void setIsLongpressEnabled() {
        this.mIsLongpressEnabled = false;
    }

    public GestureDetector2(Context context, OnGestureListener onGestureListener) {
        int scaledTouchSlop;
        int scaledDoubleTapSlop;
        int touchSlop;
        this.mHandler = new MediaRouteChooserDialog.AnonymousClass1(this, 7);
        this.mListener = onGestureListener;
        if (onGestureListener instanceof OnDoubleTapListener) {
            this.mDoubleTapListener = (OnDoubleTapListener) onGestureListener;
        }
        this.mIsLongpressEnabled = true;
        if (context == null) {
            touchSlop = ViewConfiguration.getTouchSlop();
            this.mMinimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity();
            this.mMaximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity();
            scaledTouchSlop = touchSlop;
            scaledDoubleTapSlop = 100;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.mMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
            this.mMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            touchSlop = scaledTouchSlop2;
        }
        this.mTouchSlopSquare = scaledTouchSlop * scaledTouchSlop;
        this.mDoubleTapTouchSlopSquare = touchSlop * touchSlop;
        this.mDoubleTapSlopSquare = scaledDoubleTapSlop * scaledDoubleTapSlop;
    }
}
