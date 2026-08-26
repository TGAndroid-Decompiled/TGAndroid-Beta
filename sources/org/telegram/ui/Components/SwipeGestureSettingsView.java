package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;

public final class SwipeGestureSettingsView extends FrameLayout {
    public final int[] backgroundKeys;
    public float colorProgress;
    public int currentColorKey;
    public int currentIconIndex;
    public int currentIconValue;
    public final Paint filledPaint;
    public int fromColor;
    public final RLottieImageView[] iconViews;
    public final RLottieDrawable[] icons;
    public final Paint linePaint;
    public final Paint outlinePaint;
    public final AnonymousClass1 picker;
    public final Paint pickerDividersPaint;
    public float progressToSwipeFolders;
    public final RectF rect;
    public final String[] strings;
    public SeekBarView$$ExternalSyntheticLambda1 swapIconRunnable;

    public SwipeGestureSettingsView(Context context, int i) {
        super(context);
        Paint paint = new Paint(1);
        this.outlinePaint = paint;
        this.filledPaint = new Paint(1);
        Paint paint2 = new Paint(1);
        this.linePaint = paint2;
        Paint paint3 = new Paint(1);
        this.pickerDividersPaint = paint3;
        this.rect = new RectF();
        this.strings = new String[]{LocaleController.getString(R.string.SwipeSettingsPin), LocaleController.getString(R.string.SwipeSettingsRead), LocaleController.getString(R.string.SwipeSettingsArchive), LocaleController.getString(R.string.SwipeSettingsMute), LocaleController.getString(R.string.SwipeSettingsDelete), LocaleController.getString(R.string.SwipeSettingsFolders)};
        this.backgroundKeys = new int[]{i, i, i, i, Theme.key_dialogSwipeRemove, Theme.key_chats_archivePinBackground};
        this.icons = new RLottieDrawable[6];
        this.iconViews = new RLottieImageView[2];
        this.colorProgress = 1.0f;
        int i2 = Theme.key_chats_archiveBackground;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint2.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(5.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        ?? r2 = new NumberPicker(context) {
            @Override
            public final void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                float fDp = AndroidUtilities.dp(31.0f);
                SwipeGestureSettingsView swipeGestureSettingsView = SwipeGestureSettingsView.this;
                swipeGestureSettingsView.pickerDividersPaint.setColor(Theme.getColor(null, Theme.key_radioBackgroundChecked, false));
                canvas.drawLine(AndroidUtilities.dp(2.0f), fDp, getMeasuredWidth() - AndroidUtilities.dp(2.0f), fDp, swipeGestureSettingsView.pickerDividersPaint);
                float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(31.0f);
                canvas.drawLine(AndroidUtilities.dp(2.0f), measuredHeight, getMeasuredWidth() - AndroidUtilities.dp(2.0f), measuredHeight, swipeGestureSettingsView.pickerDividersPaint);
            }
        };
        this.picker = r2;
        r2.setMinValue(0);
        r2.setDrawDividers(false);
        boolean zIsEmpty = MessagesController.getInstance(i).dialogFilters.isEmpty();
        r2.setMaxValue(zIsEmpty ? 4 : 5);
        r2.setAllItemsCount(zIsEmpty ? 5 : 6);
        r2.setWrapSelectorWheel(true);
        r2.setFormatter(new SwipeGestureSettingsView$$ExternalSyntheticLambda0(this));
        r2.setOnValueChangedListener(new SwipeGestureSettingsView$$ExternalSyntheticLambda0(this));
        r2.setImportantForAccessibility(2);
        r2.setValue(SharedConfig.getChatSwipeAction(i));
        addView((View) r2, LayoutHelper.createFrame(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.currentIconIndex = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            this.iconViews[i3] = new RLottieImageView(context);
            addView(this.iconViews[i3], LayoutHelper.createFrame(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        RLottieDrawable icon = getIcon(getValue());
        if (icon != null) {
            this.iconViews[0].setImageDrawable(icon);
            icon.setCurrentFrame(icon.metaData[0] - 1, true, false);
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.iconViews[0], true, 0.5f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.iconViews[1], false, 0.5f, false);
        this.progressToSwipeFolders = getValue() != 5 ? 0.0f : 1.0f;
        this.currentIconValue = getValue();
    }

    public final RLottieDrawable getIcon(int i) {
        int i2;
        RLottieDrawable[] rLottieDrawableArr = this.icons;
        if (rLottieDrawableArr[i] == null) {
            if (i == 1) {
                i2 = R.raw.swipe_read;
            } else if (i == 2) {
                i2 = R.raw.chats_archive;
            } else if (i == 3) {
                i2 = R.raw.swipe_mute;
            } else if (i != 4) {
                i2 = i != 5 ? R.raw.swipe_pin : R.raw.swipe_disabled;
            } else {
                i2 = R.raw.swipe_delete;
            }
            int i3 = i2;
            rLottieDrawableArr[i] = new RLottieDrawable(i3, DiffUtil.m(i3, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            updateIconColor(i);
        }
        return rLottieDrawableArr[i];
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        AnonymousClass1 anonymousClass1 = this.picker;
        boolean z = anonymousClass1.getValue() == 5;
        RLottieImageView[] rLottieImageViewArr = this.iconViews;
        if (z) {
            float f4 = this.progressToSwipeFolders;
            if (f4 != 1.0f) {
                float f5 = f4 + 0.053333335f;
                this.progressToSwipeFolders = f5;
                if (f5 > 1.0f) {
                    this.progressToSwipeFolders = 1.0f;
                } else {
                    rLottieImageViewArr[0].invalidate();
                    rLottieImageViewArr[1].invalidate();
                    invalidate();
                }
            } else if (!z) {
                f = this.progressToSwipeFolders;
                if (f != 0.0f) {
                    f2 = f - 0.053333335f;
                    this.progressToSwipeFolders = f2;
                    if (f2 < 0.0f) {
                        this.progressToSwipeFolders = 0.0f;
                    } else {
                        rLottieImageViewArr[0].invalidate();
                        rLottieImageViewArr[1].invalidate();
                        invalidate();
                    }
                }
            }
        } else if (!z) {
            f = this.progressToSwipeFolders;
            if (f != 0.0f) {
                f2 = f - 0.053333335f;
                this.progressToSwipeFolders = f2;
                if (f2 < 0.0f) {
                    this.progressToSwipeFolders = 0.0f;
                } else {
                    rLottieImageViewArr[0].invalidate();
                    rLottieImageViewArr[1].invalidate();
                    invalidate();
                }
            }
        }
        Paint paint = this.outlinePaint;
        int i = Theme.key_switchTrack;
        paint.setColor(Theme.getColor(null, i, false));
        Paint paint2 = this.linePaint;
        paint2.setColor(Theme.getColor(null, i, false));
        int iM$1 = OKLCH.m$1(16.0f, AndroidUtilities.dp(21.0f) + AndroidUtilities.dp(132.0f), getMeasuredWidth());
        int iDp = AndroidUtilities.dp(21.0f);
        int iM$2 = OKLCH.m$2(48.0f, getMeasuredHeight(), 2);
        RectF rectF = this.rect;
        float f6 = iDp;
        float f7 = iM$2;
        rectF.set(f6, f7, iM$1, getMeasuredHeight() - iM$2);
        int i2 = this.currentColorKey;
        int[] iArr = this.backgroundKeys;
        if (i2 < 0) {
            this.currentColorKey = iArr[anonymousClass1.getValue()];
            this.colorProgress = 1.0f;
            this.fromColor = ColorUtils.blendARGB(0.9f, Theme.getColor(null, Theme.key_windowBackgroundWhite, false), Theme.getColor(null, this.currentColorKey, false));
            f3 = 1.0f;
        } else {
            f3 = 1.0f;
            if (iArr[anonymousClass1.getValue()] != this.currentColorKey) {
                this.fromColor = ColorUtils.blendARGB(this.colorProgress, this.fromColor, ColorUtils.blendARGB(0.9f, Theme.getColor(null, Theme.key_windowBackgroundWhite, false), Theme.getColor(null, this.currentColorKey, false)));
                this.colorProgress = 0.0f;
                this.currentColorKey = iArr[anonymousClass1.getValue()];
            }
        }
        float f8 = this.colorProgress;
        if (f8 != f3) {
            float f9 = f8 + 0.16f;
            this.colorProgress = f9;
            if (f9 > f3) {
                this.colorProgress = 1.0f;
            } else {
                invalidate();
            }
        }
        int i3 = this.fromColor;
        int i4 = Theme.key_windowBackgroundWhite;
        int iBlendARGB = ColorUtils.blendARGB(this.colorProgress, i3, ColorUtils.blendARGB(0.9f, Theme.getColor(null, i4, false), Theme.getColor(null, this.currentColorKey, false)));
        Paint paint3 = this.filledPaint;
        paint3.setColor(iBlendARGB);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
        paint3.setColor(Theme.getColor(null, i4, false));
        paint3.setAlpha(255);
        rectF.set(f6, f7, iM$1 - AndroidUtilities.dp(58.0f), getMeasuredHeight() - iM$2);
        rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
        paint.setAlpha(31);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        canvas.save();
        canvas.clipRect(rectF);
        paint3.setColor(Theme.getColor(null, i, false));
        paint3.setAlpha(60);
        canvas.drawCircle(rectF.left + 0.0f, rectF.centerY(), AndroidUtilities.dp(15.0f), paint3);
        float fCenterY = rectF.centerY() - AndroidUtilities.dp(6.0f);
        paint2.setAlpha(57);
        canvas.drawLine(rectF.left + AndroidUtilities.dp(23.0f) + 0.0f, fCenterY, rectF.right - AndroidUtilities.dp(68.0f), fCenterY, paint2);
        float fCenterY2 = rectF.centerY() + AndroidUtilities.dp(6.0f);
        canvas.drawLine(rectF.left + AndroidUtilities.dp(23.0f) + 0.0f, fCenterY2, rectF.right - AndroidUtilities.dp(23.0f), fCenterY2, paint2);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            AnonymousClass1 anonymousClass1 = this.picker;
            int value = anonymousClass1.getValue() + 1;
            if (value > anonymousClass1.getMaxValue() || value < 0) {
                value = 0;
            }
            setContentDescription(this.strings[value]);
            anonymousClass1.changeValueByOne(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.strings[getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        for (int i2 = 0; i2 < this.icons.length; i2++) {
            updateIconColor(i2);
        }
        int color = Theme.getColor(null, Theme.key_dialogTextBlack, false);
        AnonymousClass1 anonymousClass1 = this.picker;
        anonymousClass1.setTextColor(color);
        anonymousClass1.invalidate();
    }

    public final void swapIcons() {
        int value;
        if (this.swapIconRunnable == null && this.currentIconValue != (value = getValue())) {
            this.currentIconValue = value;
            int i = (this.currentIconIndex + 1) % 2;
            RLottieDrawable icon = getIcon(value);
            RLottieImageView[] rLottieImageViewArr = this.iconViews;
            if (icon != null) {
                if (rLottieImageViewArr[i].getVisibility() != 0) {
                    icon.setCurrentFrame(0, false, false);
                }
                rLottieImageViewArr[i].setAnimation(icon);
                rLottieImageViewArr[i].playAnimation();
            } else {
                rLottieImageViewArr[i].clearAnimationDrawable();
            }
            AndroidUtilities.updateViewVisibilityAnimated(rLottieImageViewArr[this.currentIconIndex], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(rLottieImageViewArr[i], true, 0.5f, true);
            this.currentIconIndex = i;
            SeekBarView$$ExternalSyntheticLambda1 seekBarView$$ExternalSyntheticLambda1 = new SeekBarView$$ExternalSyntheticLambda1(this, 27);
            this.swapIconRunnable = seekBarView$$ExternalSyntheticLambda1;
            AndroidUtilities.runOnUIThread(seekBarView$$ExternalSyntheticLambda1, 150L);
        }
    }

    public final void updateIconColor(int i) {
        RLottieDrawable[] rLottieDrawableArr = this.icons;
        if (rLottieDrawableArr[i] != null) {
            int iBlendARGB = ColorUtils.blendARGB(0.9f, Theme.getColor(null, Theme.key_windowBackgroundWhite, false), Theme.getColor(null, Theme.key_chats_archiveBackground, false));
            int color = Theme.getColor(null, Theme.key_chats_archiveIcon, false);
            if (i != 2) {
                rLottieDrawableArr[i].setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                return;
            }
            RLottieDrawable rLottieDrawable = rLottieDrawableArr[i];
            OKLCH.m(iBlendARGB, rLottieDrawable.newColorUpdates, "Arrow", rLottieDrawable);
            RLottieDrawable rLottieDrawable2 = rLottieDrawableArr[i];
            OKLCH.m(color, rLottieDrawable2.newColorUpdates, "Box2", rLottieDrawable2);
            RLottieDrawable rLottieDrawable3 = rLottieDrawableArr[i];
            OKLCH.m(color, rLottieDrawable3.newColorUpdates, "Box1", rLottieDrawable3);
        }
    }
}
