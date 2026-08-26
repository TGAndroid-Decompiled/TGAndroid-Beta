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
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;

public final class SlideChooseView extends View {
    public final AnonymousClass1 accessibilityDelegate;
    public Callback callback;
    public int circleSize;
    public int dashedFrom;
    public int gapSize;
    public int lastDash;
    public Drawable[] leftDrawables;
    public final Paint linePaint;
    public int lineSize;
    public int minIndex;
    public boolean moving;
    public final AnimatedFloat movingAnimatedHolder;
    public int[] optionsSizes;
    public String[] optionsStr;
    public final Paint paint;
    public final Theme.ResourcesProvider resourcesProvider;
    public int selectedIndex;
    public final AnimatedFloat selectedIndexAnimatedHolder;
    public float selectedIndexTouch;
    public int sideSide;
    public boolean startMoving;
    public int startMovingPreset;
    public final TextPaint textPaint;
    public float xTouchDown;
    public float yTouchDown;

    public interface Callback {
        void onOptionSelected(int i);

        void onTouchEnd();
    }

    public SlideChooseView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.dashedFrom = -1;
        this.minIndex = Integer.MIN_VALUE;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        this.selectedIndexAnimatedHolder = new AnimatedFloat(120L, this, cubicBezierInterpolator);
        this.movingAnimatedHolder = new AnimatedFloat(150L, this, cubicBezierInterpolator);
        this.resourcesProvider = resourcesProvider;
        this.paint = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        Paint paint = new Paint(1);
        this.linePaint = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.accessibilityDelegate = new IntSeekBarAccessibilityDelegate() {
            @Override
            public final CharSequence getContentDescription() {
                SlideChooseView slideChooseView = SlideChooseView.this;
                int i = slideChooseView.selectedIndex;
                String[] strArr = slideChooseView.optionsStr;
                if (i < strArr.length) {
                    return strArr[i];
                }
                return null;
            }

            @Override
            public final int getMaxValue() {
                return SlideChooseView.this.optionsStr.length - 1;
            }

            @Override
            public final int getProgress() {
                return SlideChooseView.this.selectedIndex;
            }

            @Override
            public final void setProgress(int i) {
                SlideChooseView.this.setOption(i);
            }
        };
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

    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        int i = 2;
        float f = this.selectedIndexAnimatedHolder.set(this.selectedIndex, false);
        float f2 = 0.0f;
        float f3 = 1.0f;
        float f4 = this.movingAnimatedHolder.set(this.moving ? 1.0f : 0.0f, false);
        int iDp = AndroidUtilities.dp(11.0f) + (getMeasuredHeight() / 2);
        int i2 = 0;
        while (true) {
            int length = this.optionsStr.length;
            Paint paint = this.paint;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (i2 >= length) {
                float f5 = this.sideSide;
                int i3 = (this.gapSize * 2) + this.lineSize;
                int i4 = this.circleSize;
                float f6 = ((i3 + i4) * f) + f5 + (i4 / 2);
                int i5 = Theme.key_switchTrackChecked;
                paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(i5, resourcesProvider), 80));
                float f7 = iDp;
                canvas2.drawCircle(f6, f7, AndroidUtilities.dp(f4 * 12.0f), paint);
                paint.setColor(Theme.getColor(i5, resourcesProvider));
                canvas2.drawCircle(f6, f7, AndroidUtilities.dp(6.0f), paint);
                return;
            }
            int i6 = this.sideSide;
            int i7 = (this.gapSize * 2) + this.lineSize;
            int i8 = this.circleSize;
            int i9 = (i8 / i) + ((i7 + i8) * i2) + i6;
            float f8 = i2;
            float f9 = f8 - f;
            float fMax = Math.max(f2, f3 - Math.abs(f9));
            float fClamp = MathUtils.clamp((f - f8) + f3, f2, f3);
            int color = Theme.getColor(Theme.key_switchTrack, resourcesProvider);
            int color2 = Theme.getColor(Theme.key_switchTrackChecked, resourcesProvider);
            int i10 = this.minIndex;
            int iBlendARGB = ColorUtils.blendARGB(fClamp, color, Theme.multAlpha((i10 == Integer.MIN_VALUE || i2 > i10) ? 1.0f : 0.5f, color2));
            paint.setColor(iBlendARGB);
            Paint paint2 = this.linePaint;
            paint2.setColor(iBlendARGB);
            float f10 = iDp;
            canvas2.drawCircle(i9, f10, AndroidUtilities.lerp(this.circleSize / 2, AndroidUtilities.dp(6.0f), fMax), paint);
            if (i2 != 0) {
                int i11 = (i9 - (this.circleSize / 2)) - this.gapSize;
                int i12 = this.lineSize;
                int i13 = i11 - i12;
                int i14 = this.dashedFrom;
                if (i14 == -1 || i2 - 1 < i14) {
                    i9 = i9;
                    float f11 = f9 - 1.0f;
                    float fClamp2 = MathUtils.clamp(1.0f - Math.abs(f11), 0.0f, 1.0f);
                    int iDp2 = (int) (i12 - (AndroidUtilities.dp(3.0f) * MathUtils.clamp(1.0f - Math.min(Math.abs(f9), Math.abs(f11)), 0.0f, 1.0f)));
                    int iDp3 = (int) ((AndroidUtilities.dp(3.0f) * fClamp2) + i13);
                    canvas2 = canvas;
                    canvas2.drawRect(iDp3, iDp - AndroidUtilities.dp(1.0f), iDp2 + iDp3, AndroidUtilities.dp(1.0f) + iDp, paint);
                } else {
                    int iDp4 = AndroidUtilities.dp(3.0f) + i13;
                    int iDp5 = i12 - AndroidUtilities.dp(3.0f);
                    int iDp6 = iDp5 / AndroidUtilities.dp(13.0f);
                    if (this.lastDash != iDp6) {
                        paint2.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(6.0f), OKLCH.m$3(8.0f, iDp6, iDp5) / (iDp6 - 1)}, 0.0f));
                        this.lastDash = iDp6;
                    }
                    float fDp = AndroidUtilities.dp(1.0f) + iDp4;
                    float fDp2 = (iDp4 + iDp5) - AndroidUtilities.dp(1.0f);
                    canvas2 = canvas;
                    canvas2.drawLine(fDp, f10, fDp2, f10, paint2);
                }
            } else {
                i9 = i9;
            }
            int i15 = this.optionsSizes[i2];
            String str = this.optionsStr[i2];
            TextPaint textPaint = this.textPaint;
            textPaint.setColor(ColorUtils.blendARGB(fMax, Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider)));
            if (this.leftDrawables != null) {
                canvas2.save();
                if (i2 == 0) {
                    canvas2.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(15.5f));
                } else if (i2 == this.optionsStr.length - 1) {
                    canvas2.translate(((getMeasuredWidth() - i15) - AndroidUtilities.dp(22.0f)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                } else {
                    canvas2.translate((i9 - (i15 / 2)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                }
                this.leftDrawables[i2].setColorFilter(textPaint.getColor(), PorterDuff.Mode.MULTIPLY);
                this.leftDrawables[i2].draw(canvas2);
                canvas2.restore();
                canvas2.save();
                canvas2.translate((this.leftDrawables[i2].getIntrinsicWidth() / 2.0f) - AndroidUtilities.dp(i2 == 0 ? 3.0f : 2.0f), 0.0f);
            }
            if (i2 == 0) {
                canvas2.drawText(str, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), textPaint);
            } else if (i2 == this.optionsStr.length - 1) {
                canvas2.drawText(str, (getMeasuredWidth() - i15) - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), textPaint);
            } else {
                canvas2.drawText(str, i9 - (i15 / 2), AndroidUtilities.dp(28.0f), textPaint);
            }
            if (this.leftDrawables != null) {
                canvas2.restore();
            }
            i2++;
            i = 2;
            f2 = 0.0f;
            f3 = 1.0f;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        onInitializeAccessibilityNodeInfoInternal(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(74.0f), 1073741824));
        this.circleSize = AndroidUtilities.dp(6.0f);
        this.gapSize = AndroidUtilities.dp(2.0f);
        this.sideSide = AndroidUtilities.dp(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i3 = this.circleSize;
        String[] strArr = this.optionsStr;
        this.lineSize = (((measuredWidth - (i3 * strArr.length)) - ((strArr.length - 1) * (this.gapSize * 2))) - (this.sideSide * 2)) / Math.max(1, strArr.length - 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float f = x - this.sideSide;
        int i = this.circleSize;
        float fClamp = MathUtils.clamp(((i / 2.0f) + f) / (((this.gapSize * 2) + this.lineSize) + i), 0.0f, this.optionsStr.length - 1);
        boolean z = Math.abs(fClamp - ((float) Math.round(fClamp))) < 0.35f;
        if (z) {
            fClamp = Math.round(fClamp);
        }
        int i2 = this.minIndex;
        if (i2 != Integer.MIN_VALUE) {
            fClamp = Math.max(fClamp, i2);
        }
        if (motionEvent.getAction() == 0) {
            this.xTouchDown = x;
            this.yTouchDown = y;
            this.selectedIndexTouch = fClamp;
            this.startMovingPreset = this.selectedIndex;
            this.startMoving = true;
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 2) {
            if (!this.moving && Math.abs(this.xTouchDown - x) > Math.abs(this.yTouchDown - y)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.startMoving && Math.abs(this.xTouchDown - x) >= AndroidUtilities.touchSlop) {
                this.moving = true;
                this.startMoving = false;
            }
            if (this.moving) {
                this.selectedIndexTouch = fClamp;
                invalidate();
                if (Math.round(this.selectedIndexTouch) != this.selectedIndex && z) {
                    setOption(Math.round(this.selectedIndexTouch));
                }
            }
            invalidate();
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        }
        if (this.moving) {
            int i3 = this.selectedIndex;
            if (i3 != this.startMovingPreset) {
                setOption(i3);
            }
        } else {
            this.selectedIndexTouch = fClamp;
            if (motionEvent.getAction() == 1 && Math.round(this.selectedIndexTouch) != this.selectedIndex) {
                setOption(Math.round(this.selectedIndexTouch));
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
        return true;
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        return super.performAccessibilityAction(i, bundle) || performAccessibilityActionInternal(this, i, bundle);
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void setDashedFrom(int i) {
        this.dashedFrom = i;
    }

    public void setMinAllowedIndex(int i) {
        String[] strArr;
        if (i != -1 && (strArr = this.optionsStr) != null) {
            i = Math.min(i, strArr.length - 1);
        }
        if (this.minIndex != i) {
            this.minIndex = i;
            if (this.selectedIndex < i) {
                this.selectedIndex = i;
            }
            invalidate();
        }
    }

    public final void setOptions(int i, Drawable[] drawableArr, String... strArr) {
        this.optionsStr = strArr;
        this.leftDrawables = drawableArr;
        this.selectedIndex = i;
        this.optionsSizes = new int[strArr.length];
        int i2 = 0;
        while (true) {
            String[] strArr2 = this.optionsStr;
            if (i2 >= strArr2.length) {
                break;
            }
            this.optionsSizes[i2] = (int) Math.ceil(this.textPaint.measureText(strArr2[i2]));
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
}
