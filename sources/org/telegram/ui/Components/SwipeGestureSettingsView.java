package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.NumberPicker;

public class SwipeGestureSettingsView extends FrameLayout {
    String currentColorKey;
    int currentIconIndex;
    int currentIconValue;
    int fromColor;
    boolean hasTabs;
    private NumberPicker picker;
    float progressToSwipeFolders;
    String[] strings;
    Runnable swapIconRunnable;
    Paint outlinePaint = new Paint(1);
    Paint filledPaint = new Paint(1);
    Paint linePaint = new Paint(1);
    Paint pickerDividersPaint = new Paint(1);
    RectF rect = new RectF();
    String[] backgroundKeys = new String[6];
    RLottieDrawable[] icons = new RLottieDrawable[6];
    RLottieImageView[] iconViews = new RLottieImageView[2];
    float colorProgress = 1.0f;

    public SwipeGestureSettingsView(Context context, int i) {
        super(context);
        String[] strArr = new String[6];
        this.strings = strArr;
        float f = 1.0f;
        strArr[0] = LocaleController.getString("SwipeSettingsPin", R.string.SwipeSettingsPin);
        this.strings[1] = LocaleController.getString("SwipeSettingsRead", R.string.SwipeSettingsRead);
        this.strings[2] = LocaleController.getString("SwipeSettingsArchive", R.string.SwipeSettingsArchive);
        this.strings[3] = LocaleController.getString("SwipeSettingsMute", R.string.SwipeSettingsMute);
        this.strings[4] = LocaleController.getString("SwipeSettingsDelete", R.string.SwipeSettingsDelete);
        this.strings[5] = LocaleController.getString("SwipeSettingsFolders", R.string.SwipeSettingsFolders);
        String[] strArr2 = this.backgroundKeys;
        strArr2[0] = "chats_archiveBackground";
        strArr2[1] = "chats_archiveBackground";
        strArr2[2] = "chats_archiveBackground";
        strArr2[3] = "chats_archiveBackground";
        strArr2[4] = "dialogSwipeRemove";
        strArr2[5] = "chats_archivePinBackground";
        this.outlinePaint.setStyle(Paint.Style.STROKE);
        this.outlinePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.linePaint.setStyle(Paint.Style.STROKE);
        this.linePaint.setStrokeCap(Paint.Cap.ROUND);
        this.linePaint.setStrokeWidth(AndroidUtilities.dp(5.0f));
        this.pickerDividersPaint.setStyle(Paint.Style.STROKE);
        this.pickerDividersPaint.setStrokeCap(Paint.Cap.ROUND);
        this.pickerDividersPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        NumberPicker numberPicker = new NumberPicker(context, 13) {
            @Override
            public void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                float dp = AndroidUtilities.dp(31.0f);
                SwipeGestureSettingsView.this.pickerDividersPaint.setColor(Theme.getColor("radioBackgroundChecked"));
                canvas.drawLine(AndroidUtilities.dp(2.0f), dp, getMeasuredWidth() - AndroidUtilities.dp(2.0f), dp, SwipeGestureSettingsView.this.pickerDividersPaint);
                float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(31.0f);
                canvas.drawLine(AndroidUtilities.dp(2.0f), measuredHeight, getMeasuredWidth() - AndroidUtilities.dp(2.0f), measuredHeight, SwipeGestureSettingsView.this.pickerDividersPaint);
            }
        };
        this.picker = numberPicker;
        numberPicker.setMinValue(0);
        this.picker.setDrawDividers(false);
        boolean z = !MessagesController.getInstance(i).dialogFilters.isEmpty();
        this.hasTabs = z;
        this.picker.setMaxValue(z ? this.strings.length - 1 : this.strings.length - 2);
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
        this.progressToSwipeFolders = this.picker.getValue() != 5 ? 0.0f : f;
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
            Runnable swipeGestureSettingsView$$ExternalSyntheticLambda0 = new Runnable() {
                @Override
                public final void run() {
                    SwipeGestureSettingsView.this.lambda$swapIcons$2();
                }
            };
            this.swapIconRunnable = swipeGestureSettingsView$$ExternalSyntheticLambda0;
            AndroidUtilities.runOnUIThread(swipeGestureSettingsView$$ExternalSyntheticLambda0, 150L);
        }
    }

    public void lambda$swapIcons$2() {
        this.swapIconRunnable = null;
        swapIcons();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), 1073741824));
    }

    @Override
    protected void onDraw(android.graphics.Canvas r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SwipeGestureSettingsView.onDraw(android.graphics.Canvas):void");
    }

    public RLottieDrawable getIcon(int i) {
        RLottieDrawable[] rLottieDrawableArr = this.icons;
        if (rLottieDrawableArr[i] == null) {
            int i2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? R.raw.swipe_pin : R.raw.swipe_disabled : R.raw.swipe_delete : R.raw.swipe_mute : R.raw.chats_archive : R.raw.swipe_read;
            rLottieDrawableArr[i] = new RLottieDrawable(i2, "" + i2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
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
}
