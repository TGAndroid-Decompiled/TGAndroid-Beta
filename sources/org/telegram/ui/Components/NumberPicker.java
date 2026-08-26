package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.EmojiAnimationsOverlay;
import org.telegram.ui.LaunchActivity;

public class NumberPicker extends LinearLayout {
    public static final CubicBezierInterpolator interpolator = new CubicBezierInterpolator(0.0f, 0.5f, 0.5f, 1.0f);
    public int SELECTOR_MIDDLE_ITEM_INDEX;
    public int SELECTOR_WHEEL_ITEM_COUNT;
    public Integer allItemsCount;
    public Utilities.CallbackReturn contentDescriptionCallback;
    public boolean drawDividers;
    public final Scroller mAdjustScroller;
    public int mBottomSelectionDividerBottom;
    public ChangeCurrentByOneFromLongPressCommand mChangeCurrentByOneFromLongPressCommand;
    public final boolean mComputeMaxWidth;
    public int mCurrentScrollOffset;
    public boolean mDecrementVirtualButtonPressed;
    public String[] mDisplayedValues;
    public int mFantomValue;
    public final Scroller mFlingScroller;
    public Formatter mFormatter;
    public boolean mIncrementVirtualButtonPressed;
    public int mInitialScrollOffset;
    public final TextView mInputText;
    public long mLastDownEventTime;
    public float mLastDownEventY;
    public float mLastDownOrMoveEventY;
    public int mLastHandledDownDpadKeyCode;
    public long mLongPressUpdateInterval;
    public final int mMaxHeight;
    public int mMaxValue;
    public boolean mMaxValueSet;
    public int mMaxWidth;
    public final int mMaximumFlingVelocity;
    public final int mMinHeight;
    public int mMinValue;
    public boolean mMinValueSet;
    public final int mMinWidth;
    public final int mMinimumFlingVelocity;
    public OnScrollListener mOnScrollListener;
    public OnValueChangeListener mOnValueChangeListener;
    public final EmojiAnimationsOverlay.AnonymousClass1 mPressedStateHelper;
    public int mPreviousScrollerY;
    public int mScrollState;
    public final Paint mSelectionDivider;
    public final int mSelectionDividerHeight;
    public int mSelectorElementHeight;
    public final SparseArray mSelectorIndexToStringCache;
    public int[] mSelectorIndices;
    public int mSelectorTextGapHeight;
    public final Paint mSelectorWheelPaint;
    public final int mTextSize;
    public int mTopSelectionDividerTop;
    public final int mTouchSlop;
    public int mValue;
    public VelocityTracker mVelocityTracker;
    public boolean mWrapSelectorWheel;
    public boolean mWrapSelectorWheelSetting;
    public int textOffset;
    public int thisGravity;

    public final class ChangeCurrentByOneFromLongPressCommand implements Runnable {
        public boolean mIncrement;

        public ChangeCurrentByOneFromLongPressCommand() {
        }

        @Override
        public final void run() {
            boolean z = this.mIncrement;
            NumberPicker numberPicker = NumberPicker.this;
            numberPicker.changeValueByOne(z);
            numberPicker.postDelayed(this, numberPicker.mLongPressUpdateInterval);
        }
    }

    public interface Formatter {
        String format(int i);
    }

    public interface OnScrollListener {
        void onScrollStateChange(int i);
    }

    public interface OnValueChangeListener {
        void onValueChange(NumberPicker numberPicker, int i);
    }

    public NumberPicker(LaunchActivity launchActivity) {
        this(launchActivity, 18, null);
    }

    public final void changeValueByOne(boolean z) {
        this.mInputText.setVisibility(4);
        Scroller scroller = this.mFlingScroller;
        if (!moveToFinalScrollerPosition(scroller)) {
            moveToFinalScrollerPosition(this.mAdjustScroller);
        }
        this.mPreviousScrollerY = 0;
        if (z) {
            scroller.startScroll(-this.mSelectorElementHeight, 300);
        } else {
            scroller.startScroll(this.mSelectorElementHeight, 300);
        }
        invalidate();
    }

    @Override
    public final void computeScroll() {
        Scroller scroller;
        Scroller scroller2 = this.mFlingScroller;
        if (scroller2.mFinished) {
            scroller = this.mAdjustScroller;
            if (scroller.mFinished) {
                return;
            }
        } else {
            scroller = scroller2;
        }
        scroller.computeScrollOffset();
        int i = scroller.mCurrY;
        if (this.mPreviousScrollerY == 0) {
            this.mPreviousScrollerY = scroller.mStartY;
        }
        scrollBy(0, i - this.mPreviousScrollerY);
        this.mPreviousScrollerY = i;
        if (!scroller.mFinished) {
            invalidate();
            return;
        }
        if (scroller == scroller2) {
            if (!ensureScrollWheelAdjusted()) {
                updateInputTextView();
            }
            onScrollStateChange(0);
        } else if (this.mScrollState != 1) {
            updateInputTextView();
        }
    }

    @Override
    public final int computeVerticalScrollExtent() {
        return getHeight();
    }

    @Override
    public final int computeVerticalScrollOffset() {
        return this.mCurrentScrollOffset;
    }

    @Override
    public final int computeVerticalScrollRange() {
        return ((this.mMaxValue - this.mMinValue) + 1) * this.mSelectorElementHeight;
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.NumberPicker.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            removeAllCallbacks();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            removeAllCallbacks();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    public final void ensureCachedScrollSelectorValue(int i) {
        String str;
        SparseArray sparseArray = this.mSelectorIndexToStringCache;
        if (((String) sparseArray.get(i)) != null) {
            return;
        }
        int i2 = this.mMinValue;
        if (i < i2 || i > this.mMaxValue) {
            str = "";
        } else {
            String[] strArr = this.mDisplayedValues;
            if (strArr != null) {
                str = strArr[i - i2];
            } else {
                Formatter formatter = this.mFormatter;
                str = formatter != null ? formatter.format(i) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i));
            }
        }
        sparseArray.put(i, str);
    }

    public final boolean ensureScrollWheelAdjusted() {
        int i = this.mInitialScrollOffset - this.mCurrentScrollOffset;
        if (i == 0) {
            return false;
        }
        this.mPreviousScrollerY = 0;
        int iAbs = Math.abs(i);
        int i2 = this.mSelectorElementHeight;
        if (iAbs > i2 / 2) {
            if (i > 0) {
                i2 = -i2;
            }
            i += i2;
        }
        this.mAdjustScroller.startScroll(i, 800);
        invalidate();
        return true;
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    public CharSequence getContentDescription(int i) {
        return this.mInputText.getText();
    }

    public String[] getDisplayedValues() {
        return this.mDisplayedValues;
    }

    public int getItemsCount() {
        return this.SELECTOR_WHEEL_ITEM_COUNT;
    }

    public int getMaxValue() {
        return this.mMaxValue;
    }

    public int getMinValue() {
        return this.mMinValue;
    }

    @Override
    public int getSolidColor() {
        return 0;
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 0.9f;
    }

    public int getValue() {
        return this.mValue;
    }

    public boolean getWrapSelectorWheel() {
        return this.mWrapSelectorWheel;
    }

    public final int getWrappedSelectorIndex(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!this.mMaxValueSet || i <= (i5 = this.mMaxValue) || (i7 = i5 - (i6 = this.mMinValue)) == 0) {
            return (!this.mMinValueSet || i >= (i2 = this.mMinValue) || (i4 = (i3 = this.mMaxValue) - i2) == 0) ? i : (i3 - ((i2 - i) % i4)) + 1;
        }
        return (((i - i5) % i7) + i6) - 1;
    }

    public final void initializeSelectorWheelIndices() {
        this.mSelectorIndexToStringCache.clear();
        int[] iArr = this.mSelectorIndices;
        int value = getValue();
        for (int i = 0; i < this.mSelectorIndices.length; i++) {
            int wrappedSelectorIndex = (i - this.SELECTOR_MIDDLE_ITEM_INDEX) + value;
            if (this.mWrapSelectorWheel) {
                wrappedSelectorIndex = getWrappedSelectorIndex(wrappedSelectorIndex);
            }
            iArr[i] = wrappedSelectorIndex;
            ensureCachedScrollSelectorValue(wrappedSelectorIndex);
        }
    }

    public final boolean moveToFinalScrollerPosition(Scroller scroller) {
        scroller.mFinished = true;
        int i = scroller.mFinalY - scroller.mCurrY;
        int i2 = this.mInitialScrollOffset - ((this.mCurrentScrollOffset + i) % this.mSelectorElementHeight);
        if (i2 == 0) {
            return false;
        }
        int iAbs = Math.abs(i2);
        int i3 = this.mSelectorElementHeight;
        if (iAbs > i3 / 2) {
            i2 = i2 > 0 ? i2 - i3 : i2 + i3;
        }
        scrollBy(0, i + i2);
        return true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllCallbacks();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float width;
        float measuredHeight;
        boolean z;
        int alpha;
        int i = this.thisGravity;
        int i2 = 3;
        Paint paint = this.mSelectorWheelPaint;
        if (i == 5) {
            paint.setTextAlign(Paint.Align.RIGHT);
            width = getWidth();
        } else if (i == 3) {
            paint.setTextAlign(Paint.Align.LEFT);
            width = 0.0f;
        } else {
            paint.setTextAlign(Paint.Align.CENTER);
            width = getWidth() / 2.0f;
        }
        float f = width + this.textOffset;
        float f2 = this.mCurrentScrollOffset;
        int[] iArr = this.mSelectorIndices;
        int i3 = 0;
        while (i3 < iArr.length) {
            String str = (String) this.mSelectorIndexToStringCache.get(iArr[i3]);
            if (str != null && (i3 != this.SELECTOR_MIDDLE_ITEM_INDEX || this.mInputText.getVisibility() != 0)) {
                if (this.SELECTOR_WHEEL_ITEM_COUNT > i2) {
                    float measuredHeight2 = getMeasuredHeight() / 2.0f;
                    float measuredHeight3 = getMeasuredHeight() * 0.5f;
                    float textSize = f2 - (paint.getTextSize() / 2.0f);
                    if (textSize < measuredHeight2) {
                        measuredHeight = textSize / measuredHeight3;
                        z = true;
                    } else {
                        measuredHeight = (getMeasuredHeight() - textSize) / measuredHeight3;
                        z = false;
                    }
                    float interpolation = interpolator.getInterpolation(Utilities.clamp(measuredHeight, 1.0f, 0.0f));
                    float textSize2 = paint.getTextSize() * (1.0f - interpolation);
                    if (!z) {
                        textSize2 = -textSize2;
                    }
                    canvas.save();
                    canvas.translate(0.0f, textSize2);
                    canvas.scale((0.2f * interpolation) + 0.8f, interpolation, f, textSize);
                    if (interpolation < 0.1f) {
                        alpha = paint.getAlpha();
                        paint.setAlpha((int) ((alpha * interpolation) / 0.1f));
                    } else {
                        alpha = -1;
                    }
                    canvas.drawText(str, f, f2, paint);
                    canvas.restore();
                    if (alpha != -1) {
                        paint.setAlpha(alpha);
                    }
                } else {
                    canvas.drawText(str, f, f2, paint);
                }
            }
            f2 += this.mSelectorElementHeight;
            i3++;
            i2 = 3;
        }
        if (this.drawDividers) {
            int i4 = this.mTopSelectionDividerTop;
            int i5 = this.mSelectionDividerHeight;
            Paint paint2 = this.mSelectionDivider;
            canvas.drawRect(0.0f, i4, getRight(), i4 + i5, paint2);
            int i6 = this.mBottomSelectionDividerBottom;
            canvas.drawRect(0.0f, i6 - i5, getRight(), i6, paint2);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        removeAllCallbacks();
        this.mInputText.setVisibility(4);
        float y = motionEvent.getY();
        this.mLastDownEventY = y;
        this.mLastDownOrMoveEventY = y;
        this.mLastDownEventTime = motionEvent.getEventTime();
        float f = this.mLastDownEventY;
        float f2 = this.mTopSelectionDividerTop;
        EmojiAnimationsOverlay.AnonymousClass1 anonymousClass1 = this.mPressedStateHelper;
        if (f < f2) {
            if (this.mScrollState == 0) {
                anonymousClass1.cancel();
                anonymousClass1.val$animation = 1;
                anonymousClass1.val$messageId = 2;
                ((NumberPicker) anonymousClass1.this$0).postDelayed(anonymousClass1, ViewConfiguration.getTapTimeout());
            }
        } else if (f > this.mBottomSelectionDividerBottom && this.mScrollState == 0) {
            anonymousClass1.cancel();
            anonymousClass1.val$animation = 1;
            anonymousClass1.val$messageId = 1;
            ((NumberPicker) anonymousClass1.this$0).postDelayed(anonymousClass1, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        Scroller scroller = this.mFlingScroller;
        boolean z = scroller.mFinished;
        Scroller scroller2 = this.mAdjustScroller;
        if (!z) {
            scroller.mFinished = true;
            scroller2.mFinished = true;
            onScrollStateChange(0);
            return true;
        }
        if (!scroller2.mFinished) {
            scroller.mFinished = true;
            scroller2.mFinished = true;
            return true;
        }
        float f3 = this.mLastDownEventY;
        if (f3 < this.mTopSelectionDividerTop) {
            long longPressTimeout = ViewConfiguration.getLongPressTimeout();
            Runnable runnable = this.mChangeCurrentByOneFromLongPressCommand;
            if (runnable == null) {
                this.mChangeCurrentByOneFromLongPressCommand = new ChangeCurrentByOneFromLongPressCommand();
            } else {
                removeCallbacks(runnable);
            }
            ChangeCurrentByOneFromLongPressCommand changeCurrentByOneFromLongPressCommand = this.mChangeCurrentByOneFromLongPressCommand;
            changeCurrentByOneFromLongPressCommand.mIncrement = false;
            postDelayed(changeCurrentByOneFromLongPressCommand, longPressTimeout);
            return true;
        }
        if (f3 > this.mBottomSelectionDividerBottom) {
            long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
            Runnable runnable2 = this.mChangeCurrentByOneFromLongPressCommand;
            if (runnable2 == null) {
                this.mChangeCurrentByOneFromLongPressCommand = new ChangeCurrentByOneFromLongPressCommand();
            } else {
                removeCallbacks(runnable2);
            }
            ChangeCurrentByOneFromLongPressCommand changeCurrentByOneFromLongPressCommand2 = this.mChangeCurrentByOneFromLongPressCommand;
            changeCurrentByOneFromLongPressCommand2.mIncrement = true;
            postDelayed(changeCurrentByOneFromLongPressCommand2, longPressTimeout2);
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        TextView textView = this.mInputText;
        int measuredWidth2 = textView.getMeasuredWidth();
        int measuredHeight2 = textView.getMeasuredHeight();
        int i5 = (measuredWidth - measuredWidth2) / 2;
        int i6 = (measuredHeight - measuredHeight2) / 2;
        textView.layout(i5, i6, measuredWidth2 + i5, measuredHeight2 + i6);
        if (z) {
            initializeSelectorWheelIndices();
            int[] iArr = this.mSelectorIndices;
            int length = iArr.length;
            int i7 = this.mTextSize;
            int bottom = (int) (((((getBottom() - getTop()) + i7) - (length * i7)) / iArr.length) + 0.5f);
            this.mSelectorTextGapHeight = bottom;
            this.mSelectorElementHeight = bottom + i7;
            int top = (textView.getTop() + textView.getBaseline()) - (this.mSelectorElementHeight * this.SELECTOR_MIDDLE_ITEM_INDEX);
            this.mInitialScrollOffset = top;
            this.mCurrentScrollOffset = top;
            updateInputTextView();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i7) / 2);
            this.mTopSelectionDividerTop = ((getHeight() - i7) - this.mSelectorTextGapHeight) / 2;
            this.mBottomSelectionDividerBottom = ((getHeight() + i7) + this.mSelectorTextGapHeight) / 2;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int i3 = this.mMaxWidth;
        if (i3 == -1) {
            iMakeMeasureSpec = i;
        } else {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
            } else if (mode != 0) {
                if (mode != 1073741824) {
                    throw new IllegalArgumentException(DiffUtil.m(mode, "Unknown measure mode: "));
                }
                iMakeMeasureSpec = i;
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            }
        }
        int i4 = this.mMaxHeight;
        if (i4 == -1) {
            iMakeMeasureSpec2 = i2;
        } else {
            int size2 = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(size2, i4), 1073741824);
            } else if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    throw new IllegalArgumentException(DiffUtil.m(mode2, "Unknown measure mode: "));
                }
                iMakeMeasureSpec2 = i2;
            } else {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.mMinWidth;
        if (i5 != -1) {
            measuredWidth = Math.max(i5, measuredWidth);
            int mode3 = View.MeasureSpec.getMode(i);
            int size3 = View.MeasureSpec.getSize(i);
            if (mode3 != Integer.MIN_VALUE) {
                if (mode3 == 1073741824) {
                    measuredWidth = size3;
                }
            } else if (size3 < measuredWidth) {
                measuredWidth = size3 | 16777216;
            }
        }
        int measuredHeight = getMeasuredHeight();
        int i6 = this.mMinHeight;
        if (i6 != -1) {
            measuredHeight = Math.max(i6, measuredHeight);
            int mode4 = View.MeasureSpec.getMode(i2);
            int size4 = View.MeasureSpec.getSize(i2);
            if (mode4 != Integer.MIN_VALUE) {
                if (mode4 == 1073741824) {
                    measuredHeight = size4;
                }
            } else if (size4 < measuredHeight) {
                measuredHeight = size4 | 16777216;
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    public final void onScrollStateChange(int i) {
        String str;
        if (this.mScrollState == i) {
            return;
        }
        this.mScrollState = i;
        OnScrollListener onScrollListener = this.mOnScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChange(i);
        }
        if (i == 0) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
            if (accessibilityManager.isTouchExplorationEnabled()) {
                String[] strArr = this.mDisplayedValues;
                if (strArr == null) {
                    int i2 = this.mValue;
                    Formatter formatter = this.mFormatter;
                    str = formatter != null ? formatter.format(i2) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
                } else {
                    str = strArr[this.mValue - this.mMinValue];
                }
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(16384);
                accessibilityEventObtain.getText().add(str);
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.mTouchSlop;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                return true;
            }
            float y = motionEvent.getY();
            if (this.mScrollState == 1) {
                scrollBy(0, (int) (y - this.mLastDownOrMoveEventY));
                invalidate();
            } else if (((int) Math.abs(y - this.mLastDownEventY)) > i) {
                removeAllCallbacks();
                onScrollStateChange(1);
            }
            this.mLastDownOrMoveEventY = y;
            return true;
        }
        ChangeCurrentByOneFromLongPressCommand changeCurrentByOneFromLongPressCommand = this.mChangeCurrentByOneFromLongPressCommand;
        if (changeCurrentByOneFromLongPressCommand != null) {
            removeCallbacks(changeCurrentByOneFromLongPressCommand);
        }
        EmojiAnimationsOverlay.AnonymousClass1 anonymousClass1 = this.mPressedStateHelper;
        anonymousClass1.cancel();
        VelocityTracker velocityTracker = this.mVelocityTracker;
        velocityTracker.computeCurrentVelocity(1000, this.mMaximumFlingVelocity);
        int yVelocity = (int) velocityTracker.getYVelocity();
        if (Math.abs(yVelocity) > this.mMinimumFlingVelocity) {
            this.mPreviousScrollerY = 0;
            if (yVelocity > 0) {
                this.mFlingScroller.fling(0, 0, 0, yVelocity, 0, 0, 0, Integer.MAX_VALUE);
            } else {
                this.mFlingScroller.fling(0, Integer.MAX_VALUE, 0, yVelocity, 0, 0, 0, Integer.MAX_VALUE);
            }
            invalidate();
            onScrollStateChange(2);
        } else {
            int y2 = (int) motionEvent.getY();
            int iAbs = (int) Math.abs(y2 - this.mLastDownEventY);
            long eventTime = motionEvent.getEventTime() - this.mLastDownEventTime;
            if (iAbs > i || eventTime >= ViewConfiguration.getTapTimeout()) {
                ensureScrollWheelAdjusted();
            } else {
                int i2 = (y2 / this.mSelectorElementHeight) - this.SELECTOR_MIDDLE_ITEM_INDEX;
                NumberPicker numberPicker = (NumberPicker) anonymousClass1.this$0;
                if (i2 > 0) {
                    changeValueByOne(true);
                    anonymousClass1.cancel();
                    anonymousClass1.val$animation = 2;
                    anonymousClass1.val$messageId = 1;
                    numberPicker.post(anonymousClass1);
                } else if (i2 < 0) {
                    changeValueByOne(false);
                    anonymousClass1.cancel();
                    anonymousClass1.val$animation = 2;
                    anonymousClass1.val$messageId = 2;
                    numberPicker.post(anonymousClass1);
                }
            }
            onScrollStateChange(0);
        }
        this.mVelocityTracker.recycle();
        this.mVelocityTracker = null;
        return true;
    }

    public final void removeAllCallbacks() {
        ChangeCurrentByOneFromLongPressCommand changeCurrentByOneFromLongPressCommand = this.mChangeCurrentByOneFromLongPressCommand;
        if (changeCurrentByOneFromLongPressCommand != null) {
            removeCallbacks(changeCurrentByOneFromLongPressCommand);
        }
        this.mPressedStateHelper.cancel();
    }

    @Override
    public final void scrollBy(int i, int i2) {
        int[] iArr = this.mSelectorIndices;
        boolean z = this.mWrapSelectorWheel;
        if (!z && i2 > 0 && iArr[this.SELECTOR_MIDDLE_ITEM_INDEX] <= this.mMinValue) {
            int i3 = this.mCurrentScrollOffset + i2;
            int i4 = this.mInitialScrollOffset;
            if (i3 > i4) {
                this.mCurrentScrollOffset = i4;
                return;
            }
        }
        if (!z && i2 < 0 && iArr[this.SELECTOR_MIDDLE_ITEM_INDEX] >= this.mMaxValue) {
            int i5 = this.mCurrentScrollOffset + i2;
            int i6 = this.mInitialScrollOffset;
            if (i5 < i6) {
                this.mCurrentScrollOffset = i6;
                return;
            }
        }
        this.mCurrentScrollOffset += i2;
        while (true) {
            int i7 = this.mCurrentScrollOffset;
            if (i7 - this.mInitialScrollOffset <= this.mSelectorTextGapHeight) {
                break;
            }
            this.mCurrentScrollOffset = i7 - this.mSelectorElementHeight;
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            int i8 = iArr[1] - 1;
            if (this.mWrapSelectorWheel && i8 < this.mMinValue) {
                i8 = this.mMaxValue;
            }
            iArr[0] = i8;
            ensureCachedScrollSelectorValue(i8);
            if (!this.mWrapSelectorWheel && iArr[this.SELECTOR_MIDDLE_ITEM_INDEX] <= this.mMinValue) {
                int i9 = this.mCurrentScrollOffset;
                int i10 = this.mInitialScrollOffset;
                if (i9 > i10) {
                    this.mCurrentScrollOffset = i10;
                }
            }
        }
        while (true) {
            int i11 = this.mCurrentScrollOffset;
            if (i11 - this.mInitialScrollOffset >= (-this.mSelectorTextGapHeight)) {
                setValueInternal(iArr[this.SELECTOR_MIDDLE_ITEM_INDEX], true);
                return;
            }
            this.mCurrentScrollOffset = i11 + this.mSelectorElementHeight;
            System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
            int i12 = iArr[iArr.length - 2] + 1;
            if (this.mWrapSelectorWheel && i12 > this.mMaxValue) {
                i12 = this.mMinValue;
            }
            iArr[iArr.length - 1] = i12;
            ensureCachedScrollSelectorValue(i12);
            if (!this.mWrapSelectorWheel && iArr[this.SELECTOR_MIDDLE_ITEM_INDEX] >= this.mMaxValue) {
                int i13 = this.mCurrentScrollOffset;
                int i14 = this.mInitialScrollOffset;
                if (i13 < i14) {
                    this.mCurrentScrollOffset = i14;
                }
            }
        }
    }

    public void setAllItemsCount(int i) {
        this.allItemsCount = Integer.valueOf(i);
        setWrapSelectorWheel(this.mWrapSelectorWheelSetting);
    }

    public void setContentDescriptionCallback(Utilities.CallbackReturn<Integer, CharSequence> callbackReturn) {
        this.contentDescriptionCallback = callbackReturn;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.mDisplayedValues == strArr) {
            return;
        }
        this.mDisplayedValues = strArr;
        updateInputTextView();
        initializeSelectorWheelIndices();
        tryComputeMaxWidth();
    }

    public void setDrawDividers(boolean z) {
        this.drawDividers = z;
        invalidate();
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.mInputText.setEnabled(z);
    }

    public void setFormatter(Formatter formatter) {
        if (formatter == this.mFormatter) {
            return;
        }
        this.mFormatter = formatter;
        initializeSelectorWheelIndices();
        updateInputTextView();
    }

    @Override
    public void setGravity(int i) {
        this.thisGravity = i;
        super.setGravity(i);
    }

    public void setItemCount(int i) {
        if (this.SELECTOR_WHEEL_ITEM_COUNT == i) {
            return;
        }
        this.SELECTOR_WHEEL_ITEM_COUNT = i;
        this.SELECTOR_MIDDLE_ITEM_INDEX = i / 2;
        this.mSelectorIndices = new int[i];
        initializeSelectorWheelIndices();
    }

    public void setMaxValue(int i) {
        OnScrollListener onScrollListener;
        this.mMaxValueSet = true;
        if (this.mMaxValue == i) {
            return;
        }
        if (i < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.mMaxValue = i;
        if (i < this.mValue) {
            int i2 = this.mFantomValue;
            if (i >= i2) {
                this.mValue = i2;
            } else {
                this.mValue = i;
            }
        }
        setWrapSelectorWheel(this.mWrapSelectorWheelSetting);
        initializeSelectorWheelIndices();
        updateInputTextView();
        tryComputeMaxWidth();
        invalidate();
        if (this.mScrollState != 0 || (onScrollListener = this.mOnScrollListener) == null) {
            return;
        }
        onScrollListener.onScrollStateChange(0);
    }

    public void setMinValue(int i) {
        OnScrollListener onScrollListener;
        this.mMinValueSet = true;
        if (this.mMinValue == i) {
            return;
        }
        if (i < 0) {
            throw new IllegalArgumentException("minValue must be >= 0");
        }
        this.mMinValue = i;
        if (i > this.mValue) {
            int i2 = this.mFantomValue;
            if (i <= i2) {
                this.mValue = i2;
            } else {
                this.mValue = i;
            }
        }
        setWrapSelectorWheel(this.mWrapSelectorWheelSetting);
        initializeSelectorWheelIndices();
        updateInputTextView();
        tryComputeMaxWidth();
        invalidate();
        if (this.mScrollState != 0 || (onScrollListener = this.mOnScrollListener) == null) {
            return;
        }
        onScrollListener.onScrollStateChange(0);
    }

    public void setOnLongPressUpdateInterval(long j) {
        this.mLongPressUpdateInterval = j;
    }

    public void setOnScrollListener(OnScrollListener onScrollListener) {
        this.mOnScrollListener = onScrollListener;
    }

    public void setOnValueChangedListener(OnValueChangeListener onValueChangeListener) {
        this.mOnValueChangeListener = onValueChangeListener;
    }

    public void setSelectorColor(int i) {
        this.mSelectionDivider.setColor(i);
    }

    public void setTextColor(int i) {
        this.mInputText.setTextColor(i);
        this.mSelectorWheelPaint.setColor(i);
    }

    public void setTextOffset(int i) {
        this.textOffset = i;
        invalidate();
    }

    public void setValue(int i) {
        setValueInternal(i, false);
    }

    public final void setValueInternal(int i, boolean z) {
        OnScrollListener onScrollListener;
        OnValueChangeListener onValueChangeListener;
        if (this.mValue == i) {
            return;
        }
        int wrappedSelectorIndex = this.mWrapSelectorWheel ? getWrappedSelectorIndex(i) : Math.min(Math.max(i, this.mMinValue), this.mMaxValue);
        int i2 = this.mValue;
        this.mFantomValue = wrappedSelectorIndex;
        this.mValue = wrappedSelectorIndex;
        updateInputTextView();
        if (Math.abs(i2 - wrappedSelectorIndex) > 0.9f) {
            AndroidUtilities.vibrateCursor(this);
        }
        if (z && (onValueChangeListener = this.mOnValueChangeListener) != null) {
            onValueChangeListener.onValueChange(this, this.mValue);
        }
        initializeSelectorWheelIndices();
        invalidate();
        if (this.mScrollState != 0 || (onScrollListener = this.mOnScrollListener) == null) {
            return;
        }
        onScrollListener.onScrollStateChange(0);
    }

    public void setWrapSelectorWheel(boolean z) {
        boolean z2;
        Integer num;
        if (!this.mMaxValueSet || !this.mMinValueSet || ((num = this.allItemsCount) != null && (this.mMaxValue - this.mMinValue) + 1 >= num.intValue())) {
            this.mWrapSelectorWheelSetting = z;
            z2 = z;
        }
        this.mWrapSelectorWheel = z2;
    }

    public final void tryComputeMaxWidth() {
        int i;
        int i2 = 0;
        if (this.mComputeMaxWidth) {
            String[] strArr = this.mDisplayedValues;
            Paint paint = this.mSelectorWheelPaint;
            if (strArr == null) {
                float f = 0.0f;
                for (int i3 = 0; i3 <= 9; i3++) {
                    float fMeasureText = paint.measureText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i3)));
                    if (fMeasureText > f) {
                        f = fMeasureText;
                    }
                }
                for (int i4 = this.mMaxValue; i4 > 0; i4 /= 10) {
                    i2++;
                }
                i = (int) (i2 * f);
            } else {
                int length = strArr.length;
                int i5 = 0;
                while (i2 < length) {
                    float fMeasureText2 = paint.measureText(strArr[i2]);
                    if (fMeasureText2 > i5) {
                        i5 = (int) fMeasureText2;
                    }
                    i2++;
                }
                i = i5;
            }
            TextView textView = this.mInputText;
            int paddingRight = textView.getPaddingRight() + textView.getPaddingLeft() + i;
            if (this.mMaxWidth != paddingRight) {
                int i6 = this.mMinWidth;
                if (paddingRight > i6) {
                    this.mMaxWidth = paddingRight;
                } else {
                    this.mMaxWidth = i6;
                }
                invalidate();
            }
        }
    }

    public final void updateInputTextView() {
        String str;
        String[] strArr = this.mDisplayedValues;
        if (strArr == null) {
            int i = this.mValue;
            Formatter formatter = this.mFormatter;
            str = formatter != null ? formatter.format(i) : String.format(Locale.getDefault(), "%d", Integer.valueOf(i));
        } else {
            str = strArr[this.mValue - this.mMinValue];
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TextView textView = this.mInputText;
        if (str.equals(textView.getText().toString())) {
            return;
        }
        textView.setText(str);
    }

    public NumberPicker(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.SELECTOR_WHEEL_ITEM_COUNT = 3;
        this.SELECTOR_MIDDLE_ITEM_INDEX = 1;
        this.mLongPressUpdateInterval = 300L;
        this.mSelectorIndexToStringCache = new SparseArray();
        this.mSelectorIndices = new int[this.SELECTOR_WHEEL_ITEM_COUNT];
        this.mInitialScrollOffset = Integer.MIN_VALUE;
        this.mScrollState = 0;
        this.mLastHandledDownDpadKeyCode = -1;
        this.drawDividers = true;
        int iDp = AndroidUtilities.dp(i);
        this.mTextSize = iDp;
        Paint paint = new Paint();
        this.mSelectionDivider = paint;
        paint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider));
        this.mSelectionDividerHeight = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.mMinHeight = -1;
        this.mMaxHeight = (int) TypedValue.applyDimension(1, 180.0f, getResources().getDisplayMetrics());
        this.mMinWidth = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.mMaxWidth = -1;
        this.mComputeMaxWidth = true;
        this.mPressedStateHelper = new EmojiAnimationsOverlay.AnonymousClass1(this);
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.mInputText = textView;
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        textView.setBackgroundResource(0);
        float f = iDp;
        textView.setTextSize(0, f);
        textView.setVisibility(4);
        addView(textView, new LinearLayout.LayoutParams(-1, -2));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f);
        paint2.setTypeface(textView.getTypeface());
        paint2.setColor(textView.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.mSelectorWheelPaint = paint2;
        this.mFlingScroller = new Scroller(getContext(), null);
        this.mAdjustScroller = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        updateInputTextView();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new SeekBarAccessibilityDelegate() {
            @Override
            public final boolean canScrollBackward() {
                return true;
            }

            @Override
            public final boolean canScrollForward() {
                return true;
            }

            @Override
            public final void doScroll(boolean z) {
                NumberPicker.this.changeValueByOne(!z);
            }

            @Override
            public final CharSequence getContentDescription() {
                NumberPicker numberPicker = NumberPicker.this;
                Utilities.CallbackReturn callbackReturn = numberPicker.contentDescriptionCallback;
                return callbackReturn != null ? (CharSequence) callbackReturn.run(Integer.valueOf(numberPicker.mValue)) : numberPicker.getContentDescription(numberPicker.mValue);
            }
        });
    }
}
