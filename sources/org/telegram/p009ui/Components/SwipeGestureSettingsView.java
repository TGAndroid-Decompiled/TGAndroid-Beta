package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.NumberPicker;

public class SwipeGestureSettingsView extends FrameLayout {
    String[] backgroundKeys;
    float colorProgress;
    String currentColorKey;
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
        this.backgroundKeys = new String[6];
        this.icons = new RLottieDrawable[6];
        this.iconViews = new RLottieImageView[2];
        this.colorProgress = 1.0f;
        strArr[0] = LocaleController.getString("SwipeSettingsPin", C1072R.string.SwipeSettingsPin);
        this.strings[1] = LocaleController.getString("SwipeSettingsRead", C1072R.string.SwipeSettingsRead);
        this.strings[2] = LocaleController.getString("SwipeSettingsArchive", C1072R.string.SwipeSettingsArchive);
        this.strings[3] = LocaleController.getString("SwipeSettingsMute", C1072R.string.SwipeSettingsMute);
        this.strings[4] = LocaleController.getString("SwipeSettingsDelete", C1072R.string.SwipeSettingsDelete);
        this.strings[5] = LocaleController.getString("SwipeSettingsFolders", C1072R.string.SwipeSettingsFolders);
        String[] strArr2 = this.backgroundKeys;
        strArr2[0] = "chats_archiveBackground";
        strArr2[1] = "chats_archiveBackground";
        strArr2[2] = "chats_archiveBackground";
        strArr2[3] = "chats_archiveBackground";
        strArr2[4] = "dialogSwipeRemove";
        strArr2[5] = "chats_archivePinBackground";
        this.outlinePaint.setStyle(Paint.Style.STROKE);
        this.outlinePaint.setStrokeWidth(AndroidUtilities.m35dp(1.0f));
        this.linePaint.setStyle(Paint.Style.STROKE);
        this.linePaint.setStrokeCap(Paint.Cap.ROUND);
        this.linePaint.setStrokeWidth(AndroidUtilities.m35dp(5.0f));
        this.pickerDividersPaint.setStyle(Paint.Style.STROKE);
        this.pickerDividersPaint.setStrokeCap(Paint.Cap.ROUND);
        this.pickerDividersPaint.setStrokeWidth(AndroidUtilities.m35dp(2.0f));
        NumberPicker numberPicker = new NumberPicker(context, 13) {
            @Override
            public void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                float m35dp = AndroidUtilities.m35dp(31.0f);
                SwipeGestureSettingsView.this.pickerDividersPaint.setColor(Theme.getColor("radioBackgroundChecked"));
                canvas.drawLine(AndroidUtilities.m35dp(2.0f), m35dp, getMeasuredWidth() - AndroidUtilities.m35dp(2.0f), m35dp, SwipeGestureSettingsView.this.pickerDividersPaint);
                float measuredHeight = getMeasuredHeight() - AndroidUtilities.m35dp(31.0f);
                canvas.drawLine(AndroidUtilities.m35dp(2.0f), measuredHeight, getMeasuredWidth() - AndroidUtilities.m35dp(2.0f), measuredHeight, SwipeGestureSettingsView.this.pickerDividersPaint);
            }
        };
        this.picker = numberPicker;
        numberPicker.setMinValue(0);
        this.picker.setDrawDividers(false);
        boolean z = !MessagesController.getInstance(i).dialogFilters.isEmpty();
        this.hasTabs = z;
        this.picker.setMaxValue(z ? this.strings.length - 1 : this.strings.length - 2);
        this.picker.setAllItemsCount(this.hasTabs ? this.strings.length : this.strings.length - 1);
        this.picker.setWrapSelectorWheel(true);
        this.picker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public final String format(int i2) {
                String lambda$new$0;
                lambda$new$0 = SwipeGestureSettingsView.this.lambda$new$0(i2);
                return lambda$new$0;
            }
        });
        this.picker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public final void onValueChange(NumberPicker numberPicker2, int i2, int i3) {
                SwipeGestureSettingsView.this.lambda$new$1(numberPicker2, i2, i3);
            }
        });
        this.picker.setImportantForAccessibility(2);
        this.picker.setValue(SharedConfig.getChatSwipeAction(i));
        addView(this.picker, LayoutHelper.createFrame(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.currentIconIndex = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            this.iconViews[i2] = new RLottieImageView(context);
            addView(this.iconViews[i2], LayoutHelper.createFrame(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
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
        numberPicker.performHapticFeedback(3, 2);
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
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    SwipeGestureSettingsView.this.lambda$swapIcons$2();
                }
            };
            this.swapIconRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, 150L);
        }
    }

    public void lambda$swapIcons$2() {
        this.swapIconRunnable = null;
        swapIcons();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(102.0f), 1073741824));
    }

    @Override
    protected void onDraw(android.graphics.Canvas r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.SwipeGestureSettingsView.onDraw(android.graphics.Canvas):void");
    }

    public RLottieDrawable getIcon(int i) {
        int i2;
        RLottieDrawable[] rLottieDrawableArr = this.icons;
        if (rLottieDrawableArr[i] == null) {
            if (i == 1) {
                i2 = C1072R.raw.swipe_read;
            } else if (i == 2) {
                i2 = C1072R.raw.chats_archive;
            } else if (i == 3) {
                i2 = C1072R.raw.swipe_mute;
            } else if (i == 4) {
                i2 = C1072R.raw.swipe_delete;
            } else if (i != 5) {
                i2 = C1072R.raw.swipe_pin;
            } else {
                i2 = C1072R.raw.swipe_disabled;
            }
            int i3 = i2;
            rLottieDrawableArr[i] = new RLottieDrawable(i3, "" + i3, AndroidUtilities.m35dp(28.0f), AndroidUtilities.m35dp(28.0f), true, null);
            updateIconColor(i);
        }
        return this.icons[i];
    }

    public void updateIconColor(int i) {
        if (this.icons[i] != null) {
            int blendARGB = ColorUtils.blendARGB(Theme.getColor("windowBackgroundWhite"), Theme.getColor("chats_archiveBackground"), 0.9f);
            int color = Theme.getColor("chats_archiveIcon");
            if (i == 2) {
                this.icons[i].setLayerColor("Arrow.**", blendARGB);
                this.icons[i].setLayerColor("Box2.**", color);
                this.icons[i].setLayerColor("Box1.**", color);
                return;
            }
            this.icons[i].setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
        }
    }

    public void updateColors() {
        for (int i = 0; i < this.icons.length; i++) {
            updateIconColor(i);
        }
    }

    @Override
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        updateColors();
        this.picker.setTextColor(Theme.getColor("dialogTextBlack"));
        this.picker.invalidate();
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.strings[this.picker.getValue()]);
        if (Build.VERSION.SDK_INT >= 21) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
        }
    }

    @Override
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = this.picker.getValue() + 1;
            setContentDescription(this.strings[(value > this.picker.getMaxValue() || value < 0) ? 0 : 0]);
            this.picker.changeValueByOne(true);
        }
    }
}
