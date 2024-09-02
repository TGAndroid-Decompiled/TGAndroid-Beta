package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public class SlideChooseView extends View {
    private final SeekBarAccessibilityDelegate accessibilityDelegate;
    private Callback callback;
    private int circleSize;
    private int dashedFrom;
    private int gapSize;
    private int lastDash;
    private Drawable[] leftDrawables;
    private Paint linePaint;
    private int lineSize;
    private boolean moving;
    private AnimatedFloat movingAnimatedHolder;
    private int[] optionsSizes;
    private String[] optionsStr;
    private Paint paint;
    private final Theme.ResourcesProvider resourcesProvider;
    private int selectedIndex;
    private AnimatedFloat selectedIndexAnimatedHolder;
    private float selectedIndexTouch;
    private int sideSide;
    private boolean startMoving;
    private int startMovingPreset;
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
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        this.selectedIndexAnimatedHolder = new AnimatedFloat(this, 120L, cubicBezierInterpolator);
        this.movingAnimatedHolder = new AnimatedFloat(this, 150L, cubicBezierInterpolator);
        this.resourcesProvider = resourcesProvider;
        this.paint = new Paint(1);
        this.textPaint = new TextPaint(1);
        Paint paint = new Paint(1);
        this.linePaint = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.linePaint.setStrokeCap(Paint.Cap.ROUND);
        this.textPaint.setTextSize(AndroidUtilities.dp(13.0f));
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
        setOptions(i, null, strArr);
    }

    public void setOptions(int i, Drawable[] drawableArr, String... strArr) {
        this.optionsStr = strArr;
        this.leftDrawables = drawableArr;
        this.selectedIndex = i;
        this.optionsSizes = new int[strArr.length];
        int i2 = 0;
        while (true) {
            if (i2 >= this.optionsStr.length) {
                break;
            }
            this.optionsSizes[i2] = (int) Math.ceil(this.textPaint.measureText(r7[i2]));
            i2++;
        }
        Drawable[] drawableArr2 = this.leftDrawables;
        if (drawableArr2 != null) {
            for (Drawable drawable : drawableArr2) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
        }
        requestLayout();
    }

    public void setDashedFrom(int i) {
        this.dashedFrom = i;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float clamp = MathUtils.clamp(((x - this.sideSide) + (this.circleSize / 2.0f)) / ((this.lineSize + (this.gapSize * 2)) + r3), 0.0f, this.optionsStr.length - 1);
        boolean z = Math.abs(clamp - ((float) Math.round(clamp))) < 0.35f;
        if (z) {
            clamp = Math.round(clamp);
        }
        if (motionEvent.getAction() == 0) {
            this.xTouchDown = x;
            this.yTouchDown = y;
            this.selectedIndexTouch = clamp;
            this.startMovingPreset = this.selectedIndex;
            this.startMoving = true;
            invalidate();
        } else if (motionEvent.getAction() == 2) {
            if (!this.moving && Math.abs(this.xTouchDown - x) > Math.abs(this.yTouchDown - y)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.startMoving && Math.abs(this.xTouchDown - x) >= AndroidUtilities.touchSlop) {
                this.moving = true;
                this.startMoving = false;
            }
            if (this.moving) {
                this.selectedIndexTouch = clamp;
                invalidate();
                if (Math.round(this.selectedIndexTouch) != this.selectedIndex && z) {
                    setOption(Math.round(this.selectedIndexTouch));
                }
            }
            invalidate();
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (!this.moving) {
                this.selectedIndexTouch = clamp;
                if (motionEvent.getAction() == 1 && Math.round(this.selectedIndexTouch) != this.selectedIndex) {
                    setOption(Math.round(this.selectedIndexTouch));
                }
            } else {
                int i = this.selectedIndex;
                if (i != this.startMovingPreset) {
                    setOption(i);
                }
            }
            Callback callback = this.callback;
            if (callback != null) {
                callback.onTouchEnd();
            }
            this.startMoving = false;
            this.moving = false;
            invalidate();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }

    public void setOption(int i) {
        if (this.selectedIndex != i) {
            AndroidUtilities.vibrateCursor(this);
        }
        this.selectedIndex = i;
        Callback callback = this.callback;
        if (callback != null) {
            callback.onOptionSelected(i);
        }
        invalidate();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(74.0f), 1073741824));
        this.circleSize = AndroidUtilities.dp(6.0f);
        this.gapSize = AndroidUtilities.dp(2.0f);
        this.sideSide = AndroidUtilities.dp(22.0f);
        this.lineSize = (((getMeasuredWidth() - (this.circleSize * this.optionsStr.length)) - ((this.gapSize * 2) * (r0.length - 1))) - (this.sideSide * 2)) / (r0.length - 1);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float f;
        int i;
        float f2;
        float f3 = this.selectedIndexAnimatedHolder.set(this.selectedIndex);
        float f4 = 0.0f;
        float f5 = 1.0f;
        float f6 = this.movingAnimatedHolder.set(this.moving ? 1.0f : 0.0f);
        int i2 = 2;
        int measuredHeight = (getMeasuredHeight() / 2) + AndroidUtilities.dp(11.0f);
        int i3 = 0;
        while (i3 < this.optionsStr.length) {
            int i4 = this.sideSide;
            int i5 = this.lineSize + (this.gapSize * 2);
            int i6 = this.circleSize;
            int i7 = i4 + ((i5 + i6) * i3) + (i6 / i2);
            float f7 = i3;
            float f8 = f7 - f3;
            float max = Math.max(f4, f5 - Math.abs(f8));
            int blendARGB = ColorUtils.blendARGB(getThemedColor(Theme.key_switchTrack), getThemedColor(Theme.key_switchTrackChecked), MathUtils.clamp((f3 - f7) + f5, f4, f5));
            this.paint.setColor(blendARGB);
            this.linePaint.setColor(blendARGB);
            float f9 = measuredHeight;
            canvas.drawCircle(i7, f9, AndroidUtilities.lerp(this.circleSize / i2, AndroidUtilities.dp(6.0f), max), this.paint);
            float f10 = 3.0f;
            if (i3 != 0) {
                int i8 = (i7 - (this.circleSize / i2)) - this.gapSize;
                int i9 = this.lineSize;
                int i10 = i8 - i9;
                int i11 = this.dashedFrom;
                if (i11 != -1 && i3 - 1 >= i11) {
                    int dp = i10 + AndroidUtilities.dp(3.0f);
                    int dp2 = (i9 - AndroidUtilities.dp(3.0f)) / AndroidUtilities.dp(13.0f);
                    if (this.lastDash != dp2) {
                        Paint paint = this.linePaint;
                        f2 = max;
                        float[] fArr = new float[i2];
                        fArr[0] = AndroidUtilities.dp(6.0f);
                        fArr[1] = (r4 - (AndroidUtilities.dp(8.0f) * dp2)) / (dp2 - 1);
                        paint.setPathEffect(new DashPathEffect(fArr, 0.0f));
                        this.lastDash = dp2;
                    } else {
                        f2 = max;
                    }
                    f = f2;
                    i = i7;
                    canvas.drawLine(AndroidUtilities.dp(1.0f) + dp, f9, (dp + r4) - AndroidUtilities.dp(1.0f), f9, this.linePaint);
                    f10 = 3.0f;
                } else {
                    f = max;
                    i = i7;
                    float f11 = f8 - 1.0f;
                    float clamp = MathUtils.clamp(1.0f - Math.abs(f11), 0.0f, 1.0f);
                    f10 = 3.0f;
                    int dp3 = (int) (i9 - (AndroidUtilities.dp(3.0f) * MathUtils.clamp(1.0f - Math.min(Math.abs(f8), Math.abs(f11)), 0.0f, 1.0f)));
                    canvas.drawRect((int) (i10 + (AndroidUtilities.dp(3.0f) * clamp)), measuredHeight - AndroidUtilities.dp(1.0f), r1 + dp3, AndroidUtilities.dp(1.0f) + measuredHeight, this.paint);
                }
            } else {
                f = max;
                i = i7;
            }
            int i12 = this.optionsSizes[i3];
            String str = this.optionsStr[i3];
            this.textPaint.setColor(ColorUtils.blendARGB(getThemedColor(Theme.key_windowBackgroundWhiteGrayText), getThemedColor(Theme.key_windowBackgroundWhiteBlueText), f));
            if (this.leftDrawables != null) {
                canvas.save();
                if (i3 == 0) {
                    canvas.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(15.5f));
                } else if (i3 == this.optionsStr.length - 1) {
                    canvas.translate(((getMeasuredWidth() - i12) - AndroidUtilities.dp(22.0f)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                } else {
                    canvas.translate((i - (i12 / 2)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                }
                this.leftDrawables[i3].setColorFilter(this.textPaint.getColor(), PorterDuff.Mode.MULTIPLY);
                this.leftDrawables[i3].draw(canvas);
                canvas.restore();
                canvas.save();
                float intrinsicWidth = this.leftDrawables[i3].getIntrinsicWidth() / 2.0f;
                if (i3 != 0) {
                    f10 = 2.0f;
                }
                canvas.translate(intrinsicWidth - AndroidUtilities.dp(f10), 0.0f);
            }
            if (i3 == 0) {
                canvas.drawText(str, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), this.textPaint);
            } else if (i3 == this.optionsStr.length - 1) {
                canvas.drawText(str, (getMeasuredWidth() - i12) - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), this.textPaint);
            } else {
                canvas.drawText(str, i - (i12 / 2), AndroidUtilities.dp(28.0f), this.textPaint);
            }
            if (this.leftDrawables != null) {
                canvas.restore();
            }
            i3++;
            f4 = 0.0f;
            f5 = 1.0f;
            i2 = 2;
        }
        float f12 = this.sideSide;
        int i13 = this.lineSize + (this.gapSize * 2);
        int i14 = this.circleSize;
        float f13 = f12 + ((i13 + i14) * f3) + (i14 / 2);
        Paint paint2 = this.paint;
        int i15 = Theme.key_switchTrackChecked;
        paint2.setColor(ColorUtils.setAlphaComponent(getThemedColor(i15), 80));
        float f14 = measuredHeight;
        canvas.drawCircle(f13, f14, AndroidUtilities.dp(f6 * 12.0f), this.paint);
        this.paint.setColor(getThemedColor(i15));
        canvas.drawCircle(f13, f14, AndroidUtilities.dp(6.0f), this.paint);
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

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
