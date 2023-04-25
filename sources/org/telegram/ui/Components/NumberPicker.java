package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
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
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.Theme;
public class NumberPicker extends LinearLayout {
    private static final CubicBezierInterpolator interpolator = new CubicBezierInterpolator(0.0f, 0.5f, 0.5f, 1.0f);
    private int SELECTOR_MIDDLE_ITEM_INDEX;
    private int SELECTOR_WHEEL_ITEM_COUNT;
    private Integer allItemsCount;
    private boolean drawDividers;
    private Scroller mAdjustScroller;
    private int mBottomSelectionDividerBottom;
    private ChangeCurrentByOneFromLongPressCommand mChangeCurrentByOneFromLongPressCommand;
    private boolean mComputeMaxWidth;
    private int mCurrentScrollOffset;
    private boolean mDecrementVirtualButtonPressed;
    private String[] mDisplayedValues;
    private int mFantomValue;
    private Scroller mFlingScroller;
    private Formatter mFormatter;
    private boolean mIncrementVirtualButtonPressed;
    private boolean mIngonreMoveEvents;
    private int mInitialScrollOffset;
    private TextView mInputText;
    private long mLastDownEventTime;
    private float mLastDownEventY;
    private float mLastDownOrMoveEventY;
    private int mLastHandledDownDpadKeyCode;
    private long mLongPressUpdateInterval;
    private int mMaxHeight;
    private int mMaxValue;
    private boolean mMaxValueSet;
    private int mMaxWidth;
    private int mMaximumFlingVelocity;
    private int mMinHeight;
    private int mMinValue;
    private boolean mMinValueSet;
    private int mMinWidth;
    private int mMinimumFlingVelocity;
    private OnScrollListener mOnScrollListener;
    private OnValueChangeListener mOnValueChangeListener;
    private PressedStateHelper mPressedStateHelper;
    private int mPreviousScrollerY;
    private int mScrollState;
    private Paint mSelectionDivider;
    private int mSelectionDividerHeight;
    private int mSelectorElementHeight;
    private final SparseArray<String> mSelectorIndexToStringCache;
    private int[] mSelectorIndices;
    private int mSelectorTextGapHeight;
    private Paint mSelectorWheelPaint;
    private int mSolidColor;
    private int mTextSize;
    private int mTopSelectionDividerTop;
    private int mTouchSlop;
    private int mValue;
    private VelocityTracker mVelocityTracker;
    private boolean mWrapSelectorWheel;
    private boolean mWrapSelectorWheelSetting;
    private final Theme.ResourcesProvider resourcesProvider;
    private int textOffset;

    public interface Formatter {
        String format(int i);
    }

    public interface OnScrollListener {
        void onScrollStateChange(NumberPicker numberPicker, int i);
    }

    public interface OnValueChangeListener {
        void onValueChange(NumberPicker numberPicker, int i, int i2);
    }

    @Override
    protected float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    @Override
    protected float getTopFadingEdgeStrength() {
        return 0.9f;
    }

    static boolean access$280(NumberPicker numberPicker, int i) {
        ?? r2 = (byte) (i ^ (numberPicker.mIncrementVirtualButtonPressed ? 1 : 0));
        numberPicker.mIncrementVirtualButtonPressed = r2;
        return r2;
    }

    static boolean access$480(NumberPicker numberPicker, int i) {
        ?? r2 = (byte) (i ^ (numberPicker.mDecrementVirtualButtonPressed ? 1 : 0));
        numberPicker.mDecrementVirtualButtonPressed = r2;
        return r2;
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

    public int getItemsCount() {
        return this.SELECTOR_WHEEL_ITEM_COUNT;
    }

    private void init() {
        this.mSolidColor = 0;
        Paint paint = new Paint();
        this.mSelectionDivider = paint;
        paint.setColor(getThemedColor(Theme.key_dialogButton));
        this.mSelectionDividerHeight = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.mMinHeight = -1;
        int applyDimension = (int) TypedValue.applyDimension(1, 180.0f, getResources().getDisplayMetrics());
        this.mMaxHeight = applyDimension;
        int i = this.mMinHeight;
        if (i != -1 && applyDimension != -1 && i > applyDimension) {
            throw new IllegalArgumentException("minHeight > maxHeight");
        }
        this.mMinWidth = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.mMaxWidth = -1;
        this.mComputeMaxWidth = true;
        this.mPressedStateHelper = new PressedStateHelper();
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.mInputText = textView;
        textView.setGravity(17);
        this.mInputText.setSingleLine(true);
        this.mInputText.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
        this.mInputText.setBackgroundResource(0);
        this.mInputText.setTextSize(0, this.mTextSize);
        this.mInputText.setVisibility(4);
        addView(this.mInputText, new LinearLayout.LayoutParams(-1, -2));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(this.mTextSize);
        paint2.setTypeface(this.mInputText.getTypeface());
        paint2.setColor(this.mInputText.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.mSelectorWheelPaint = paint2;
        this.mFlingScroller = new Scroller(getContext(), null, true);
        this.mAdjustScroller = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        updateInputTextView();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new SeekBarAccessibilityDelegate() {
            @Override
            protected boolean canScrollBackward(View view) {
                return true;
            }

            @Override
            protected boolean canScrollForward(View view) {
                return true;
            }

            @Override
            protected void doScroll(View view, boolean z) {
                NumberPicker.this.changeValueByOne(!z);
            }

            @Override
            public CharSequence getContentDescription(View view) {
                NumberPicker numberPicker = NumberPicker.this;
                return numberPicker.getContentDescription(numberPicker.mValue);
            }
        });
    }

    protected CharSequence getContentDescription(int i) {
        return this.mInputText.getText();
    }

    public void setTextColor(int i) {
        this.mInputText.setTextColor(i);
        this.mSelectorWheelPaint.setColor(i);
    }

    public void setSelectorColor(int i) {
        this.mSelectionDivider.setColor(i);
    }

    public NumberPicker(Context context) {
        this(context, (Theme.ResourcesProvider) null);
    }

    public NumberPicker(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, 18, resourcesProvider);
    }

    public NumberPicker(Context context, int i) {
        this(context, i, null);
    }

    public NumberPicker(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.SELECTOR_WHEEL_ITEM_COUNT = 3;
        this.SELECTOR_MIDDLE_ITEM_INDEX = 3 / 2;
        this.mLongPressUpdateInterval = 300L;
        this.mSelectorIndexToStringCache = new SparseArray<>();
        this.mSelectorIndices = new int[this.SELECTOR_WHEEL_ITEM_COUNT];
        this.mInitialScrollOffset = Integer.MIN_VALUE;
        this.mScrollState = 0;
        this.mLastHandledDownDpadKeyCode = -1;
        this.drawDividers = true;
        this.resourcesProvider = resourcesProvider;
        this.mTextSize = AndroidUtilities.dp(i);
        init();
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.mInputText.getMeasuredWidth();
        int measuredHeight2 = this.mInputText.getMeasuredHeight();
        int i5 = (measuredWidth - measuredWidth2) / 2;
        int i6 = (measuredHeight - measuredHeight2) / 2;
        this.mInputText.layout(i5, i6, measuredWidth2 + i5, measuredHeight2 + i6);
        if (z) {
            initializeSelectorWheel();
            initializeFadingEdges();
            this.mTopSelectionDividerTop = ((getHeight() - this.mTextSize) - this.mSelectorTextGapHeight) / 2;
            this.mBottomSelectionDividerBottom = ((getHeight() + this.mTextSize) + this.mSelectorTextGapHeight) / 2;
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(makeMeasureSpec(i, this.mMaxWidth), makeMeasureSpec(i2, this.mMaxHeight));
        setMeasuredDimension(resolveSizeAndStateRespectingMinSize(this.mMinWidth, getMeasuredWidth(), i), resolveSizeAndStateRespectingMinSize(this.mMinHeight, getMeasuredHeight(), i2));
    }

    private boolean moveToFinalScrollerPosition(Scroller scroller) {
        scroller.forceFinished(true);
        int finalY = scroller.getFinalY() - scroller.getCurrY();
        int i = this.mInitialScrollOffset - ((this.mCurrentScrollOffset + finalY) % this.mSelectorElementHeight);
        if (i != 0) {
            int abs = Math.abs(i);
            int i2 = this.mSelectorElementHeight;
            if (abs > i2 / 2) {
                i = i > 0 ? i - i2 : i + i2;
            }
            scrollBy(0, finalY + i);
            return true;
        }
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && motionEvent.getActionMasked() == 0) {
            removeAllCallbacks();
            this.mInputText.setVisibility(4);
            float y = motionEvent.getY();
            this.mLastDownEventY = y;
            this.mLastDownOrMoveEventY = y;
            this.mLastDownEventTime = motionEvent.getEventTime();
            this.mIngonreMoveEvents = false;
            float f = this.mLastDownEventY;
            if (f < this.mTopSelectionDividerTop) {
                if (this.mScrollState == 0) {
                    this.mPressedStateHelper.buttonPressDelayed(2);
                }
            } else if (f > this.mBottomSelectionDividerBottom && this.mScrollState == 0) {
                this.mPressedStateHelper.buttonPressDelayed(1);
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!this.mFlingScroller.isFinished()) {
                this.mFlingScroller.forceFinished(true);
                this.mAdjustScroller.forceFinished(true);
                onScrollStateChange(0);
            } else if (!this.mAdjustScroller.isFinished()) {
                this.mFlingScroller.forceFinished(true);
                this.mAdjustScroller.forceFinished(true);
            } else {
                float f2 = this.mLastDownEventY;
                if (f2 < this.mTopSelectionDividerTop) {
                    postChangeCurrentByOneFromLongPress(false, ViewConfiguration.getLongPressTimeout());
                } else if (f2 > this.mBottomSelectionDividerBottom) {
                    postChangeCurrentByOneFromLongPress(true, ViewConfiguration.getLongPressTimeout());
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 1) {
                if (actionMasked == 2 && !this.mIngonreMoveEvents) {
                    float y = motionEvent.getY();
                    if (this.mScrollState != 1) {
                        if (((int) Math.abs(y - this.mLastDownEventY)) > this.mTouchSlop) {
                            removeAllCallbacks();
                            onScrollStateChange(1);
                        }
                    } else {
                        scrollBy(0, (int) (y - this.mLastDownOrMoveEventY));
                        invalidate();
                    }
                    this.mLastDownOrMoveEventY = y;
                }
            } else {
                removeChangeCurrentByOneFromLongPress();
                this.mPressedStateHelper.cancel();
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumFlingVelocity);
                int yVelocity = (int) velocityTracker.getYVelocity();
                if (Math.abs(yVelocity) > this.mMinimumFlingVelocity) {
                    fling(yVelocity);
                    onScrollStateChange(2);
                } else {
                    int y2 = (int) motionEvent.getY();
                    int abs = (int) Math.abs(y2 - this.mLastDownEventY);
                    long eventTime = motionEvent.getEventTime() - this.mLastDownEventTime;
                    if (abs <= this.mTouchSlop && eventTime < ViewConfiguration.getTapTimeout()) {
                        int i = (y2 / this.mSelectorElementHeight) - this.SELECTOR_MIDDLE_ITEM_INDEX;
                        if (i > 0) {
                            changeValueByOne(true);
                            this.mPressedStateHelper.buttonTapped(1);
                        } else if (i < 0) {
                            changeValueByOne(false);
                            this.mPressedStateHelper.buttonTapped(2);
                        }
                    } else {
                        ensureScrollWheelAdjusted();
                    }
                    onScrollStateChange(0);
                }
                this.mVelocityTracker.recycle();
                this.mVelocityTracker = null;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            removeAllCallbacks();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.NumberPicker.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            removeAllCallbacks();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override
    public void computeScroll() {
        Scroller scroller = this.mFlingScroller;
        if (scroller.isFinished()) {
            scroller = this.mAdjustScroller;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        if (this.mPreviousScrollerY == 0) {
            this.mPreviousScrollerY = scroller.getStartY();
        }
        scrollBy(0, currY - this.mPreviousScrollerY);
        this.mPreviousScrollerY = currY;
        if (scroller.isFinished()) {
            onScrollerFinished(scroller);
        } else {
            invalidate();
        }
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.mInputText.setEnabled(z);
    }

    @Override
    public void scrollBy(int i, int i2) {
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
            decrementSelectorIndices(iArr);
            if (!this.mWrapSelectorWheel && iArr[this.SELECTOR_MIDDLE_ITEM_INDEX] <= this.mMinValue) {
                int i8 = this.mCurrentScrollOffset;
                int i9 = this.mInitialScrollOffset;
                if (i8 > i9) {
                    this.mCurrentScrollOffset = i9;
                }
            }
        }
        while (true) {
            int i10 = this.mCurrentScrollOffset;
            if (i10 - this.mInitialScrollOffset < (-this.mSelectorTextGapHeight)) {
                this.mCurrentScrollOffset = i10 + this.mSelectorElementHeight;
                incrementSelectorIndices(iArr);
                if (!this.mWrapSelectorWheel && iArr[this.SELECTOR_MIDDLE_ITEM_INDEX] >= this.mMaxValue) {
                    int i11 = this.mCurrentScrollOffset;
                    int i12 = this.mInitialScrollOffset;
                    if (i11 < i12) {
                        this.mCurrentScrollOffset = i12;
                    }
                }
            } else {
                setValueInternal(iArr[this.SELECTOR_MIDDLE_ITEM_INDEX], true);
                return;
            }
        }
    }

    @Override
    protected int computeVerticalScrollOffset() {
        return this.mCurrentScrollOffset;
    }

    @Override
    protected int computeVerticalScrollRange() {
        return ((this.mMaxValue - this.mMinValue) + 1) * this.mSelectorElementHeight;
    }

    @Override
    protected int computeVerticalScrollExtent() {
        return getHeight();
    }

    @Override
    public int getSolidColor() {
        return this.mSolidColor;
    }

    public void setOnValueChangedListener(OnValueChangeListener onValueChangeListener) {
        this.mOnValueChangeListener = onValueChangeListener;
    }

    public void setOnScrollListener(OnScrollListener onScrollListener) {
        this.mOnScrollListener = onScrollListener;
    }

    public void setFormatter(Formatter formatter) {
        if (formatter == this.mFormatter) {
            return;
        }
        this.mFormatter = formatter;
        initializeSelectorWheelIndices();
        updateInputTextView();
    }

    public void setValue(int i) {
        setValueInternal(i, false);
    }

    public void setTextOffset(int i) {
        this.textOffset = i;
        invalidate();
    }

    private void tryComputeMaxWidth() {
        int i;
        if (this.mComputeMaxWidth) {
            String[] strArr = this.mDisplayedValues;
            int i2 = 0;
            if (strArr == null) {
                float f = 0.0f;
                for (int i3 = 0; i3 <= 9; i3++) {
                    float measureText = this.mSelectorWheelPaint.measureText(formatNumberWithLocale(i3));
                    if (measureText > f) {
                        f = measureText;
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
                    float measureText2 = this.mSelectorWheelPaint.measureText(strArr[i2]);
                    if (measureText2 > i5) {
                        i5 = (int) measureText2;
                    }
                    i2++;
                }
                i = i5;
            }
            int paddingLeft = i + this.mInputText.getPaddingLeft() + this.mInputText.getPaddingRight();
            if (this.mMaxWidth != paddingLeft) {
                int i6 = this.mMinWidth;
                if (paddingLeft > i6) {
                    this.mMaxWidth = paddingLeft;
                } else {
                    this.mMaxWidth = i6;
                }
                invalidate();
            }
        }
    }

    public boolean getWrapSelectorWheel() {
        return this.mWrapSelectorWheel;
    }

    public void setWrapSelectorWheel(boolean z) {
        Integer num;
        boolean z2 = false;
        if ((this.mMaxValueSet && this.mMinValueSet && ((num = this.allItemsCount) == null || (this.mMaxValue - this.mMinValue) + 1 < num.intValue())) ? false : true) {
            this.mWrapSelectorWheelSetting = z;
            if (z) {
                z2 = true;
            }
        }
        this.mWrapSelectorWheel = z2;
    }

    public void setAllItemsCount(int i) {
        this.allItemsCount = Integer.valueOf(i);
        setWrapSelectorWheel(this.mWrapSelectorWheelSetting);
    }

    public void setOnLongPressUpdateInterval(long j) {
        this.mLongPressUpdateInterval = j;
    }

    public int getValue() {
        return this.mValue;
    }

    public int getMinValue() {
        return this.mMinValue;
    }

    public void setMinValue(int i) {
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
    }

    public int getMaxValue() {
        return this.mMaxValue;
    }

    public void setMaxValue(int i) {
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
    }

    public String[] getDisplayedValues() {
        return this.mDisplayedValues;
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

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllCallbacks();
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        float measuredHeight;
        boolean z;
        int i3;
        float right = ((getRight() - getLeft()) / 2) + this.textOffset;
        float f = this.mCurrentScrollOffset;
        int[] iArr = this.mSelectorIndices;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            String str = this.mSelectorIndexToStringCache.get(iArr[i4]);
            if (str != null && (i4 != this.SELECTOR_MIDDLE_ITEM_INDEX || this.mInputText.getVisibility() != 0)) {
                if (this.SELECTOR_WHEEL_ITEM_COUNT > 3) {
                    float measuredHeight2 = getMeasuredHeight() * 0.5f;
                    float textSize = f - (this.mSelectorWheelPaint.getTextSize() / 2.0f);
                    if (textSize < getMeasuredHeight() / 2.0f) {
                        measuredHeight = textSize / measuredHeight2;
                        z = true;
                    } else {
                        measuredHeight = (getMeasuredHeight() - textSize) / measuredHeight2;
                        z = false;
                    }
                    float interpolation = interpolator.getInterpolation(Utilities.clamp(measuredHeight, 1.0f, 0.0f));
                    float textSize2 = (1.0f - interpolation) * this.mSelectorWheelPaint.getTextSize();
                    if (!z) {
                        textSize2 = -textSize2;
                    }
                    canvas.save();
                    canvas.translate(0.0f, textSize2);
                    canvas.scale((0.2f * interpolation) + 0.8f, interpolation, right, textSize);
                    if (interpolation < 0.1f) {
                        i3 = this.mSelectorWheelPaint.getAlpha();
                        this.mSelectorWheelPaint.setAlpha((int) ((i3 * interpolation) / 0.1f));
                    } else {
                        i3 = -1;
                    }
                    canvas.drawText(str, right, f, this.mSelectorWheelPaint);
                    canvas.restore();
                    if (i3 != -1) {
                        this.mSelectorWheelPaint.setAlpha(i3);
                    }
                } else {
                    canvas.drawText(str, right, f, this.mSelectorWheelPaint);
                }
            }
            f += this.mSelectorElementHeight;
        }
        if (this.drawDividers) {
            canvas.drawRect(0.0f, this.mTopSelectionDividerTop, getRight(), this.mSelectionDividerHeight + i, this.mSelectionDivider);
            canvas.drawRect(0.0f, i2 - this.mSelectionDividerHeight, getRight(), this.mBottomSelectionDividerBottom, this.mSelectionDivider);
        }
    }

    private int makeMeasureSpec(int i, int i2) {
        if (i2 == -1) {
            return i;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return i;
                }
                throw new IllegalArgumentException("Unknown measure mode: " + mode);
            }
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i2), 1073741824);
    }

    private int resolveSizeAndStateRespectingMinSize(int i, int i2, int i3) {
        return i != -1 ? resolveSizeAndState(Math.max(i, i2), i3, 0) : i2;
    }

    public static int resolveSizeAndState(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                i = size;
            }
        } else if (size < i) {
            i = 16777216 | size;
        }
        return i | ((-16777216) & i3);
    }

    private void initializeSelectorWheelIndices() {
        this.mSelectorIndexToStringCache.clear();
        int[] iArr = this.mSelectorIndices;
        int value = getValue();
        for (int i = 0; i < this.mSelectorIndices.length; i++) {
            int i2 = (i - this.SELECTOR_MIDDLE_ITEM_INDEX) + value;
            if (this.mWrapSelectorWheel) {
                i2 = getWrappedSelectorIndex(i2);
            }
            iArr[i] = i2;
            ensureCachedScrollSelectorValue(iArr[i]);
        }
    }

    private void setValueInternal(int i, boolean z) {
        int min;
        if (this.mValue == i) {
            return;
        }
        if (this.mWrapSelectorWheel) {
            min = getWrappedSelectorIndex(i);
        } else {
            min = Math.min(Math.max(i, this.mMinValue), this.mMaxValue);
        }
        int i2 = this.mValue;
        this.mFantomValue = min;
        this.mValue = min;
        updateInputTextView();
        if (Math.abs(i2 - min) > 0.9f && Build.VERSION.SDK_INT >= 27) {
            try {
                performHapticFeedback(9, 1);
            } catch (Exception unused) {
            }
        }
        if (z) {
            notifyChange(i2, min);
        }
        initializeSelectorWheelIndices();
        invalidate();
    }

    public void changeValueByOne(boolean z) {
        this.mInputText.setVisibility(4);
        if (!moveToFinalScrollerPosition(this.mFlingScroller)) {
            moveToFinalScrollerPosition(this.mAdjustScroller);
        }
        this.mPreviousScrollerY = 0;
        if (z) {
            this.mFlingScroller.startScroll(0, 0, 0, -this.mSelectorElementHeight, 300);
        } else {
            this.mFlingScroller.startScroll(0, 0, 0, this.mSelectorElementHeight, 300);
        }
        invalidate();
    }

    private void initializeSelectorWheel() {
        initializeSelectorWheelIndices();
        int[] iArr = this.mSelectorIndices;
        int length = iArr.length * this.mTextSize;
        int bottom = getBottom() - getTop();
        int i = this.mTextSize;
        int length2 = (int) ((((bottom + i) - length) / iArr.length) + 0.5f);
        this.mSelectorTextGapHeight = length2;
        this.mSelectorElementHeight = i + length2;
        int baseline = (this.mInputText.getBaseline() + this.mInputText.getTop()) - (this.mSelectorElementHeight * this.SELECTOR_MIDDLE_ITEM_INDEX);
        this.mInitialScrollOffset = baseline;
        this.mCurrentScrollOffset = baseline;
        updateInputTextView();
    }

    private void initializeFadingEdges() {
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(((getBottom() - getTop()) - this.mTextSize) / 2);
    }

    private void onScrollerFinished(Scroller scroller) {
        if (scroller == this.mFlingScroller) {
            if (!ensureScrollWheelAdjusted()) {
                updateInputTextView();
            }
            onScrollStateChange(0);
        } else if (this.mScrollState != 1) {
            updateInputTextView();
        }
    }

    private void onScrollStateChange(int i) {
        if (this.mScrollState == i) {
            return;
        }
        this.mScrollState = i;
        OnScrollListener onScrollListener = this.mOnScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChange(this, i);
        }
        if (i == 0) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
            if (accessibilityManager.isTouchExplorationEnabled()) {
                String[] strArr = this.mDisplayedValues;
                String formatNumber = strArr == null ? formatNumber(this.mValue) : strArr[this.mValue - this.mMinValue];
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM);
                obtain.getText().add(formatNumber);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }

    private void fling(int i) {
        this.mPreviousScrollerY = 0;
        if (i > 0) {
            this.mFlingScroller.fling(0, 0, 0, i, 0, 0, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        } else {
            this.mFlingScroller.fling(0, ConnectionsManager.DEFAULT_DATACENTER_ID, 0, i, 0, 0, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
        invalidate();
    }

    private int getWrappedSelectorIndex(int i) {
        int i2;
        int i3;
        if (this.mMaxValueSet && i > (i3 = this.mMaxValue)) {
            int i4 = this.mMinValue;
            if (i3 - i4 != 0) {
                return (i4 + ((i - i3) % (i3 - i4))) - 1;
            }
        }
        if (this.mMinValueSet && i < (i2 = this.mMinValue)) {
            int i5 = this.mMaxValue;
            if (i5 - i2 != 0) {
                return (i5 - ((i2 - i) % (i5 - i2))) + 1;
            }
        }
        return i;
    }

    private void incrementSelectorIndices(int[] iArr) {
        System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
        int i = iArr[iArr.length - 2] + 1;
        if (this.mWrapSelectorWheel && i > this.mMaxValue) {
            i = this.mMinValue;
        }
        iArr[iArr.length - 1] = i;
        ensureCachedScrollSelectorValue(i);
    }

    private void decrementSelectorIndices(int[] iArr) {
        System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
        int i = iArr[1] - 1;
        if (this.mWrapSelectorWheel && i < this.mMinValue) {
            i = this.mMaxValue;
        }
        iArr[0] = i;
        ensureCachedScrollSelectorValue(i);
    }

    private void ensureCachedScrollSelectorValue(int i) {
        String str;
        SparseArray<String> sparseArray = this.mSelectorIndexToStringCache;
        if (sparseArray.get(i) != null) {
            return;
        }
        int i2 = this.mMinValue;
        if (i < i2 || i > this.mMaxValue) {
            str = BuildConfig.APP_CENTER_HASH;
        } else {
            String[] strArr = this.mDisplayedValues;
            if (strArr != null) {
                str = strArr[i - i2];
            } else {
                str = formatNumber(i);
            }
        }
        sparseArray.put(i, str);
    }

    private String formatNumber(int i) {
        Formatter formatter = this.mFormatter;
        return formatter != null ? formatter.format(i) : formatNumberWithLocale(i);
    }

    private boolean updateInputTextView() {
        String[] strArr = this.mDisplayedValues;
        String formatNumber = strArr == null ? formatNumber(this.mValue) : strArr[this.mValue - this.mMinValue];
        if (TextUtils.isEmpty(formatNumber) || formatNumber.equals(this.mInputText.getText().toString())) {
            return false;
        }
        this.mInputText.setText(formatNumber);
        return true;
    }

    private void notifyChange(int i, int i2) {
        OnValueChangeListener onValueChangeListener = this.mOnValueChangeListener;
        if (onValueChangeListener != null) {
            onValueChangeListener.onValueChange(this, i, this.mValue);
        }
    }

    private void postChangeCurrentByOneFromLongPress(boolean z, long j) {
        ChangeCurrentByOneFromLongPressCommand changeCurrentByOneFromLongPressCommand = this.mChangeCurrentByOneFromLongPressCommand;
        if (changeCurrentByOneFromLongPressCommand == null) {
            this.mChangeCurrentByOneFromLongPressCommand = new ChangeCurrentByOneFromLongPressCommand();
        } else {
            removeCallbacks(changeCurrentByOneFromLongPressCommand);
        }
        this.mChangeCurrentByOneFromLongPressCommand.setStep(z);
        postDelayed(this.mChangeCurrentByOneFromLongPressCommand, j);
    }

    private void removeChangeCurrentByOneFromLongPress() {
        ChangeCurrentByOneFromLongPressCommand changeCurrentByOneFromLongPressCommand = this.mChangeCurrentByOneFromLongPressCommand;
        if (changeCurrentByOneFromLongPressCommand != null) {
            removeCallbacks(changeCurrentByOneFromLongPressCommand);
        }
    }

    private void removeAllCallbacks() {
        ChangeCurrentByOneFromLongPressCommand changeCurrentByOneFromLongPressCommand = this.mChangeCurrentByOneFromLongPressCommand;
        if (changeCurrentByOneFromLongPressCommand != null) {
            removeCallbacks(changeCurrentByOneFromLongPressCommand);
        }
        this.mPressedStateHelper.cancel();
    }

    private boolean ensureScrollWheelAdjusted() {
        int i = this.mInitialScrollOffset - this.mCurrentScrollOffset;
        if (i != 0) {
            this.mPreviousScrollerY = 0;
            int abs = Math.abs(i);
            int i2 = this.mSelectorElementHeight;
            if (abs > i2 / 2) {
                if (i > 0) {
                    i2 = -i2;
                }
                i += i2;
            }
            this.mAdjustScroller.startScroll(0, 0, 0, i, 800);
            invalidate();
            return true;
        }
        return false;
    }

    public class PressedStateHelper implements Runnable {
        private int mManagedButton;
        private int mMode;

        PressedStateHelper() {
        }

        public void cancel() {
            this.mMode = 0;
            this.mManagedButton = 0;
            NumberPicker.this.removeCallbacks(this);
            if (NumberPicker.this.mIncrementVirtualButtonPressed) {
                NumberPicker.this.mIncrementVirtualButtonPressed = false;
                NumberPicker numberPicker = NumberPicker.this;
                numberPicker.invalidate(0, numberPicker.mBottomSelectionDividerBottom, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
            }
            NumberPicker.this.mDecrementVirtualButtonPressed = false;
            if (NumberPicker.this.mDecrementVirtualButtonPressed) {
                NumberPicker numberPicker2 = NumberPicker.this;
                numberPicker2.invalidate(0, 0, numberPicker2.getRight(), NumberPicker.this.mTopSelectionDividerTop);
            }
        }

        public void buttonPressDelayed(int i) {
            cancel();
            this.mMode = 1;
            this.mManagedButton = i;
            NumberPicker.this.postDelayed(this, ViewConfiguration.getTapTimeout());
        }

        public void buttonTapped(int i) {
            cancel();
            this.mMode = 2;
            this.mManagedButton = i;
            NumberPicker.this.post(this);
        }

        @Override
        public void run() {
            int i = this.mMode;
            if (i == 1) {
                int i2 = this.mManagedButton;
                if (i2 == 1) {
                    NumberPicker.this.mIncrementVirtualButtonPressed = true;
                    NumberPicker numberPicker = NumberPicker.this;
                    numberPicker.invalidate(0, numberPicker.mBottomSelectionDividerBottom, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                } else if (i2 != 2) {
                } else {
                    NumberPicker.this.mDecrementVirtualButtonPressed = true;
                    NumberPicker numberPicker2 = NumberPicker.this;
                    numberPicker2.invalidate(0, 0, numberPicker2.getRight(), NumberPicker.this.mTopSelectionDividerTop);
                }
            } else if (i != 2) {
            } else {
                int i3 = this.mManagedButton;
                if (i3 == 1) {
                    if (!NumberPicker.this.mIncrementVirtualButtonPressed) {
                        NumberPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                    }
                    NumberPicker.access$280(NumberPicker.this, 1);
                    NumberPicker numberPicker3 = NumberPicker.this;
                    numberPicker3.invalidate(0, numberPicker3.mBottomSelectionDividerBottom, NumberPicker.this.getRight(), NumberPicker.this.getBottom());
                } else if (i3 != 2) {
                } else {
                    if (!NumberPicker.this.mDecrementVirtualButtonPressed) {
                        NumberPicker.this.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                    }
                    NumberPicker.access$480(NumberPicker.this, 1);
                    NumberPicker numberPicker4 = NumberPicker.this;
                    numberPicker4.invalidate(0, 0, numberPicker4.getRight(), NumberPicker.this.mTopSelectionDividerTop);
                }
            }
        }
    }

    public class ChangeCurrentByOneFromLongPressCommand implements Runnable {
        private boolean mIncrement;

        ChangeCurrentByOneFromLongPressCommand() {
        }

        public void setStep(boolean z) {
            this.mIncrement = z;
        }

        @Override
        public void run() {
            NumberPicker.this.changeValueByOne(this.mIncrement);
            NumberPicker numberPicker = NumberPicker.this;
            numberPicker.postDelayed(this, numberPicker.mLongPressUpdateInterval);
        }
    }

    private static String formatNumberWithLocale(int i) {
        return String.format(Locale.getDefault(), "%d", Integer.valueOf(i));
    }

    public void setDrawDividers(boolean z) {
        this.drawDividers = z;
        invalidate();
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
