package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.ActionBar.Theme;

public class SlideChooseView extends View {
    private final SeekBarAccessibilityDelegate accessibilityDelegate;
    private Callback callback;
    private int circleSize;
    private int dashedFrom;
    private int gapSize;
    private int lastDash;
    private Paint linePaint;
    private int lineSize;
    private boolean moving;
    private int[] optionsSizes;
    private String[] optionsStr;
    private Paint paint;
    private final Theme.ResourcesProvider resourcesProvider;
    private int selectedIndex;
    private int sideSide;
    private boolean startMoving;
    private int startMovingPreset;
    private float startX;
    private TextPaint textPaint;
    private float xTouchDown;
    private float yTouchDown;

    public interface Callback {

        public final class CC {
            public static void $default$onTouchEnd(Callback callback) {
            }
        }

        void onOptionSelected(int i);

        void onTouchEnd();
    }

    public SlideChooseView(Context context) {
        this(context, null);
    }

    public SlideChooseView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.dashedFrom = -1;
        this.resourcesProvider = resourcesProvider;
        this.paint = new Paint(1);
        this.textPaint = new TextPaint(1);
        Paint paint = new Paint(1);
        this.linePaint = paint;
        paint.setStrokeWidth(AndroidUtilities.m34dp(2.0f));
        this.linePaint.setStrokeCap(Paint.Cap.ROUND);
        this.textPaint.setTextSize(AndroidUtilities.m34dp(13.0f));
        this.accessibilityDelegate = new IntSeekBarAccessibilityDelegate() {
            @Override
            protected int getProgress() {
                return SlideChooseView.this.selectedIndex;
            }

            @Override
            protected void setProgress(int i) {
                SlideChooseView.this.setOption(i);
            }

            @Override
            protected int getMaxValue() {
                return SlideChooseView.this.optionsStr.length - 1;
            }

            @Override
            protected CharSequence getContentDescription(View view) {
                if (SlideChooseView.this.selectedIndex < SlideChooseView.this.optionsStr.length) {
                    return SlideChooseView.this.optionsStr[SlideChooseView.this.selectedIndex];
                }
                return null;
            }
        };
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void setOptions(int i, String... strArr) {
        this.optionsStr = strArr;
        this.selectedIndex = i;
        this.optionsSizes = new int[strArr.length];
        int i2 = 0;
        while (true) {
            String[] strArr2 = this.optionsStr;
            if (i2 < strArr2.length) {
                this.optionsSizes[i2] = (int) Math.ceil(this.textPaint.measureText(strArr2[i2]));
                i2++;
            } else {
                requestLayout();
                return;
            }
        }
    }

    public void setDashedFrom(int i) {
        this.dashedFrom = i;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int i = 0;
        boolean z = false;
        if (motionEvent.getAction() == 0) {
            this.xTouchDown = x;
            this.yTouchDown = y;
            int i2 = 0;
            while (true) {
                if (i2 >= this.optionsStr.length) {
                    break;
                }
                int i3 = this.sideSide;
                int i4 = this.lineSize + (this.gapSize * 2);
                int i5 = this.circleSize;
                int i6 = i3 + ((i4 + i5) * i2) + (i5 / 2);
                if (x <= i6 - AndroidUtilities.m34dp(15.0f) || x >= i6 + AndroidUtilities.m34dp(15.0f)) {
                    i2++;
                } else {
                    int i7 = this.selectedIndex;
                    if (i2 == i7) {
                        z = true;
                    }
                    this.startMoving = z;
                    this.startX = x;
                    this.startMovingPreset = i7;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!this.moving && Math.abs(this.xTouchDown - x) > Math.abs(this.yTouchDown - y)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.startMoving) {
                if (Math.abs(this.startX - x) >= AndroidUtilities.getPixelsInCM(0.5f, true)) {
                    this.moving = true;
                    this.startMoving = false;
                }
            } else if (this.moving) {
                while (true) {
                    if (i >= this.optionsStr.length) {
                        break;
                    }
                    int i8 = this.sideSide;
                    int i9 = this.lineSize;
                    int i10 = this.gapSize;
                    int i11 = this.circleSize;
                    int i12 = i8 + (((i10 * 2) + i9 + i11) * i) + (i11 / 2);
                    int i13 = (i9 / 2) + (i11 / 2) + i10;
                    if (x <= i12 - i13 || x >= i12 + i13) {
                        i++;
                    } else if (this.selectedIndex != i) {
                        setOption(i);
                    }
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (!this.moving) {
                int i14 = 0;
                while (true) {
                    if (i14 >= 5) {
                        break;
                    }
                    int i15 = this.sideSide;
                    int i16 = this.lineSize + (this.gapSize * 2);
                    int i17 = this.circleSize;
                    int i18 = i15 + ((i16 + i17) * i14) + (i17 / 2);
                    if (x <= i18 - AndroidUtilities.m34dp(15.0f) || x >= i18 + AndroidUtilities.m34dp(15.0f)) {
                        i14++;
                    } else if (this.selectedIndex != i14) {
                        setOption(i14);
                    }
                }
            } else {
                int i19 = this.selectedIndex;
                if (i19 != this.startMovingPreset) {
                    setOption(i19);
                }
            }
            Callback callback = this.callback;
            if (callback != null) {
                callback.onTouchEnd();
            }
            this.startMoving = false;
            this.moving = false;
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }

    public void setOption(int i) {
        this.selectedIndex = i;
        Callback callback = this.callback;
        if (callback != null) {
            callback.onOptionSelected(i);
        }
        invalidate();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(74.0f), 1073741824));
        this.circleSize = AndroidUtilities.m34dp(6.0f);
        this.gapSize = AndroidUtilities.m34dp(2.0f);
        this.sideSide = AndroidUtilities.m34dp(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i3 = this.circleSize;
        String[] strArr = this.optionsStr;
        this.lineSize = (((measuredWidth - (i3 * strArr.length)) - ((this.gapSize * 2) * (strArr.length - 1))) - (this.sideSide * 2)) / (strArr.length - 1);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int dp;
        this.textPaint.setColor(getThemedColor("windowBackgroundWhiteGrayText"));
        int measuredHeight = (getMeasuredHeight() / 2) + AndroidUtilities.m34dp(11.0f);
        int i = 0;
        while (i < this.optionsStr.length) {
            int i2 = this.sideSide;
            int i3 = this.lineSize + (this.gapSize * 2);
            int i4 = this.circleSize;
            int i5 = i2 + ((i3 + i4) * i) + (i4 / 2);
            int themedColor = getThemedColor(i <= this.selectedIndex ? "switchTrackChecked" : "switchTrack");
            this.paint.setColor(themedColor);
            this.linePaint.setColor(themedColor);
            float f = measuredHeight;
            canvas.drawCircle(i5, f, i == this.selectedIndex ? AndroidUtilities.m34dp(6.0f) : this.circleSize / 2, this.paint);
            if (i != 0) {
                int i6 = (i5 - (this.circleSize / 2)) - this.gapSize;
                int i7 = this.lineSize;
                int i8 = i6 - i7;
                int i9 = this.dashedFrom;
                if (i9 == -1 || i - 1 < i9) {
                    int i10 = this.selectedIndex;
                    if (i == i10 || i == i10 + 1) {
                        i7 -= AndroidUtilities.m34dp(3.0f);
                    }
                    if (i == this.selectedIndex + 1) {
                        i8 += AndroidUtilities.m34dp(3.0f);
                    }
                    canvas.drawRect(i8, measuredHeight - AndroidUtilities.m34dp(1.0f), i8 + i7, AndroidUtilities.m34dp(1.0f) + measuredHeight, this.paint);
                } else {
                    int dp2 = i8 + AndroidUtilities.m34dp(3.0f);
                    int dp3 = (i7 - AndroidUtilities.m34dp(3.0f)) / AndroidUtilities.m34dp(13.0f);
                    if (this.lastDash != dp3) {
                        this.linePaint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.m34dp(6.0f), (dp - (AndroidUtilities.m34dp(8.0f) * dp3)) / (dp3 - 1)}, 0.0f));
                        this.lastDash = dp3;
                    }
                    canvas.drawLine(AndroidUtilities.m34dp(1.0f) + dp2, f, (dp2 + dp) - AndroidUtilities.m34dp(1.0f), f, this.linePaint);
                }
            }
            int i11 = this.optionsSizes[i];
            String[] strArr = this.optionsStr;
            String str = strArr[i];
            if (i == 0) {
                canvas.drawText(str, AndroidUtilities.m34dp(22.0f), AndroidUtilities.m34dp(28.0f), this.textPaint);
            } else if (i == strArr.length - 1) {
                canvas.drawText(str, (getMeasuredWidth() - i11) - AndroidUtilities.m34dp(22.0f), AndroidUtilities.m34dp(28.0f), this.textPaint);
            } else {
                canvas.drawText(str, i5 - (i11 / 2), AndroidUtilities.m34dp(28.0f), this.textPaint);
            }
            i++;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.accessibilityDelegate.onInitializeAccessibilityNodeInfoInternal(this, accessibilityNodeInfo);
    }

    @Override
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return super.performAccessibilityAction(i, bundle) || this.accessibilityDelegate.performAccessibilityActionInternal(this, i, bundle);
    }

    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
