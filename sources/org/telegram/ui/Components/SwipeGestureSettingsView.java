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

public class SwipeGestureSettingsView extends FrameLayout {
    public static final int SWIPE_GESTURE_ARCHIVE = 2;
    public static final int SWIPE_GESTURE_DELETE = 4;
    public static final int SWIPE_GESTURE_FOLDERS = 5;
    public static final int SWIPE_GESTURE_MUTE = 3;
    public static final int SWIPE_GESTURE_PIN = 0;
    public static final int SWIPE_GESTURE_READ = 1;
    int[] backgroundKeys;
    float colorProgress;
    int currentColorKey;
    int currentIconIndex;
    int currentIconValue;
    Paint filledPaint;
    int fromColor;
    boolean hasTabs;
    RLottieImageView[] iconViews;
    RLottieDrawable[] icons;
    Paint linePaint;
    Paint outlinePaint;
    private NumberPicker picker;
    Paint pickerDividersPaint;
    float progressToSwipeFolders;
    RectF rect;
    String[] strings;
    Runnable swapIconRunnable;

    public SwipeGestureSettingsView(Context context, int i) {
        super(context);
        this.outlinePaint = new Paint(1);
        this.filledPaint = new Paint(1);
        this.linePaint = new Paint(1);
        this.pickerDividersPaint = new Paint(1);
        this.rect = new RectF();
        String[] strArr = new String[6];
        this.strings = strArr;
        this.backgroundKeys = new int[6];
        this.icons = new RLottieDrawable[6];
        this.iconViews = new RLottieImageView[2];
        this.colorProgress = 1.0f;
        strArr[0] = LocaleController.getString(R.string.SwipeSettingsPin);
        this.strings[1] = LocaleController.getString(R.string.SwipeSettingsRead);
        this.strings[2] = LocaleController.getString(R.string.SwipeSettingsArchive);
        this.strings[3] = LocaleController.getString(R.string.SwipeSettingsMute);
        this.strings[4] = LocaleController.getString(R.string.SwipeSettingsDelete);
        this.strings[5] = LocaleController.getString(R.string.SwipeSettingsFolders);
        int[] iArr = this.backgroundKeys;
        int i2 = Theme.key_chats_archiveBackground;
        iArr[0] = i2;
        iArr[1] = i2;
        iArr[2] = i2;
        iArr[3] = i2;
        iArr[4] = Theme.key_dialogSwipeRemove;
        iArr[5] = Theme.key_chats_archivePinBackground;
        Paint paint = this.outlinePaint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.outlinePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.linePaint.setStyle(style);
        Paint paint2 = this.linePaint;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.linePaint.setStrokeWidth(AndroidUtilities.dp(5.0f));
        this.pickerDividersPaint.setStyle(style);
        this.pickerDividersPaint.setStrokeCap(cap);
        this.pickerDividersPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        NumberPicker numberPicker = new NumberPicker(context, 13) {
            @Override
            public void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                float fDp = AndroidUtilities.dp(31.0f);
                SwipeGestureSettingsView.this.pickerDividersPaint.setColor(Theme.getColor(null, Theme.key_radioBackgroundChecked, false));
                canvas.drawLine(AndroidUtilities.dp(2.0f), fDp, getMeasuredWidth() - AndroidUtilities.dp(2.0f), fDp, SwipeGestureSettingsView.this.pickerDividersPaint);
                float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(31.0f);
                canvas.drawLine(AndroidUtilities.dp(2.0f), measuredHeight, getMeasuredWidth() - AndroidUtilities.dp(2.0f), measuredHeight, SwipeGestureSettingsView.this.pickerDividersPaint);
            }
        };
        this.picker = numberPicker;
        numberPicker.setMinValue(0);
        this.picker.setDrawDividers(false);
        boolean zIsEmpty = MessagesController.getInstance(i).dialogFilters.isEmpty();
        this.hasTabs = !zIsEmpty;
        this.picker.setMaxValue(!zIsEmpty ? this.strings.length - 1 : this.strings.length - 2);
        this.picker.setAllItemsCount(this.hasTabs ? this.strings.length : this.strings.length - 1);
        this.picker.setWrapSelectorWheel(true);
        this.picker.setFormatter(new SwipeGestureSettingsView$$ExternalSyntheticLambda0(this));
        this.picker.setOnValueChangedListener(new SwipeGestureSettingsView$$ExternalSyntheticLambda0(this));
        this.picker.setImportantForAccessibility(2);
        this.picker.setValue(SharedConfig.getChatSwipeAction(i));
        addView(this.picker, LayoutHelper.createFrame(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.currentIconIndex = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            this.iconViews[i3] = new RLottieImageView(context);
            addView(this.iconViews[i3], LayoutHelper.createFrame(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        RLottieDrawable icon = getIcon(this.picker.getValue());
        if (icon != null) {
            this.iconViews[0].setImageDrawable(icon);
            icon.setCurrentFrame(icon.getFramesCount() - 1);
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.iconViews[0], true, 0.5f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.iconViews[1], false, 0.5f, false);
        this.progressToSwipeFolders = this.picker.getValue() != 5 ? 0.0f : 1.0f;
        this.currentIconValue = this.picker.getValue();
    }

    public String lambda$new$0(int i) {
        return this.strings[i];
    }

    public void lambda$new$1(NumberPicker numberPicker, int i, int i2) {
        swapIcons();
        SharedConfig.updateChatListSwipeSetting(i2);
        invalidate();
        try {
            numberPicker.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public void lambda$swapIcons$2() {
        this.swapIconRunnable = null;
        swapIcons();
    }

    private void swapIcons() {
        int value;
        if (this.swapIconRunnable == null && this.currentIconValue != (value = this.picker.getValue())) {
            this.currentIconValue = value;
            int i = (this.currentIconIndex + 1) % 2;
            RLottieDrawable icon = getIcon(value);
            if (icon != null) {
                if (this.iconViews[i].getVisibility() != 0) {
                    icon.setCurrentFrame(0, false);
                }
                this.iconViews[i].setAnimation(icon);
                this.iconViews[i].playAnimation();
            } else {
                this.iconViews[i].clearAnimationDrawable();
            }
            AndroidUtilities.updateViewVisibilityAnimated(this.iconViews[this.currentIconIndex], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(this.iconViews[i], true, 0.5f, true);
            this.currentIconIndex = i;
            Tooltip$$ExternalSyntheticLambda0 tooltip$$ExternalSyntheticLambda0 = new Tooltip$$ExternalSyntheticLambda0(this, 20);
            this.swapIconRunnable = tooltip$$ExternalSyntheticLambda0;
            AndroidUtilities.runOnUIThread(tooltip$$ExternalSyntheticLambda0, 150L);
        }
    }

    public RLottieDrawable getIcon(int i) {
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
        return this.icons[i];
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        boolean z = this.picker.getValue() == 5;
        if (z) {
            float f3 = this.progressToSwipeFolders;
            if (f3 != 1.0f) {
                float f4 = f3 + 0.053333335f;
                this.progressToSwipeFolders = f4;
                if (f4 > 1.0f) {
                    this.progressToSwipeFolders = 1.0f;
                } else {
                    this.iconViews[0].invalidate();
                    this.iconViews[1].invalidate();
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
                        this.iconViews[0].invalidate();
                        this.iconViews[1].invalidate();
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
                    this.iconViews[0].invalidate();
                    this.iconViews[1].invalidate();
                    invalidate();
                }
            }
        }
        Paint paint = this.outlinePaint;
        int i = Theme.key_switchTrack;
        paint.setColor(Theme.getColor(null, i, false));
        this.linePaint.setColor(Theme.getColor(null, i, false));
        int iM$1 = OKLCH.m$1(16.0f, AndroidUtilities.dp(21.0f) + AndroidUtilities.dp(132.0f), getMeasuredWidth());
        int iDp = AndroidUtilities.dp(21.0f);
        int iM$2 = OKLCH.m$2(48.0f, getMeasuredHeight(), 2);
        float f5 = iDp;
        float f6 = iM$2;
        this.rect.set(f5, f6, iM$1, getMeasuredHeight() - iM$2);
        if (this.currentColorKey < 0) {
            this.currentColorKey = this.backgroundKeys[this.picker.getValue()];
            this.colorProgress = 1.0f;
            this.fromColor = ColorUtils.blendARGB(0.9f, Theme.getColor(null, Theme.key_windowBackgroundWhite, false), Theme.getColor(null, this.currentColorKey, false));
        } else if (this.backgroundKeys[this.picker.getValue()] != this.currentColorKey) {
            this.fromColor = ColorUtils.blendARGB(this.colorProgress, this.fromColor, ColorUtils.blendARGB(0.9f, Theme.getColor(null, Theme.key_windowBackgroundWhite, false), Theme.getColor(null, this.currentColorKey, false)));
            this.colorProgress = 0.0f;
            this.currentColorKey = this.backgroundKeys[this.picker.getValue()];
        }
        float f7 = this.colorProgress;
        if (f7 != 1.0f) {
            float f8 = f7 + 0.16f;
            this.colorProgress = f8;
            if (f8 > 1.0f) {
                this.colorProgress = 1.0f;
            } else {
                invalidate();
            }
        }
        int i2 = this.fromColor;
        int i3 = Theme.key_windowBackgroundWhite;
        this.filledPaint.setColor(ColorUtils.blendARGB(this.colorProgress, i2, ColorUtils.blendARGB(0.9f, Theme.getColor(null, i3, false), Theme.getColor(null, this.currentColorKey, false))));
        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.filledPaint);
        this.filledPaint.setColor(Theme.getColor(null, i3, false));
        this.filledPaint.setAlpha(255);
        this.rect.set(f5, f6, iM$1 - AndroidUtilities.dp(58.0f), getMeasuredHeight() - iM$2);
        this.rect.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.filledPaint);
        this.outlinePaint.setAlpha(31);
        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.outlinePaint);
        canvas.save();
        canvas.clipRect(this.rect);
        this.filledPaint.setColor(Theme.getColor(null, i, false));
        this.filledPaint.setAlpha(60);
        RectF rectF = this.rect;
        canvas.drawCircle(rectF.left + 0.0f, rectF.centerY(), AndroidUtilities.dp(15.0f), this.filledPaint);
        float fCenterY = this.rect.centerY() - AndroidUtilities.dp(6.0f);
        this.linePaint.setAlpha(57);
        canvas.drawLine(this.rect.left + AndroidUtilities.dp(23.0f) + 0.0f, fCenterY, this.rect.right - AndroidUtilities.dp(68.0f), fCenterY, this.linePaint);
        float fCenterY2 = this.rect.centerY() + AndroidUtilities.dp(6.0f);
        canvas.drawLine(this.rect.left + AndroidUtilities.dp(23.0f) + 0.0f, fCenterY2, this.rect.right - AndroidUtilities.dp(23.0f), fCenterY2, this.linePaint);
        canvas.restore();
    }

    @Override
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = this.picker.getValue() + 1;
            if (value > this.picker.getMaxValue() || value < 0) {
                value = 0;
            }
            setContentDescription(this.strings[value]);
            this.picker.changeValueByOne(true);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.strings[this.picker.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        updateColors();
        this.picker.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        this.picker.invalidate();
    }

    public void updateColors() {
        for (int i = 0; i < this.icons.length; i++) {
            updateIconColor(i);
        }
    }

    public void updateIconColor(int i) {
        if (this.icons[i] != null) {
            int iBlendARGB = ColorUtils.blendARGB(0.9f, Theme.getColor(null, Theme.key_windowBackgroundWhite, false), Theme.getColor(null, Theme.key_chats_archiveBackground, false));
            int color = Theme.getColor(null, Theme.key_chats_archiveIcon, false);
            if (i != 2) {
                this.icons[i].setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                return;
            }
            this.icons[i].setLayerColor("Arrow", iBlendARGB);
            this.icons[i].setLayerColor("Box2", color);
            this.icons[i].setLayerColor("Box1", color);
        }
    }
}
