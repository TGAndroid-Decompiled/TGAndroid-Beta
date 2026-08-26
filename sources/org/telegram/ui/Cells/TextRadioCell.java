package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BlurSettingsBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadioButton;

public final class TextRadioCell extends FrameLayout {
    public float animationProgress;
    public int height;
    public boolean isRTL;
    public float lastTouchX;
    public boolean needDivider;
    public final int padding;
    public final RadioButton radioButton;
    public final TextView textView;
    public final TextView valueTextView;

    public final class AnonymousClass1 extends AnimationProperties.FloatProperty {
        @Override
        public final Float get(Object obj) {
            return Float.valueOf(((TextRadioCell) obj).animationProgress);
        }

        @Override
        public final void setValue(Object obj, float f) {
            TextRadioCell textRadioCell = (TextRadioCell) obj;
            textRadioCell.setAnimationProgress(f);
            textRadioCell.invalidate();
        }
    }

    static {
        new AnonymousClass1("animationProgress");
    }

    public TextRadioCell(Context context) {
        super(context);
        this.height = 50;
        this.padding = 21;
        TextView textView = new TextView(context);
        this.textView = textView;
        BlurSettingsBottomSheet$$ExternalSyntheticOutline0.m(textView, Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z = LocaleController.isRTL;
        addView(textView, LayoutHelper.createFrame(-1, -1.0f, (z ? 5 : 3) | 48, z ? 21 : 64.0f, 0.0f, z ? 64.0f : 21, 0.0f));
        TextView textView2 = new TextView(context);
        this.valueTextView = textView2;
        textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false));
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z2 = LocaleController.isRTL;
        addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 64.0f, 36.0f, z2 ? 64.0f : 21, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.radioButton = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.setColor(Theme.getColor(null, Theme.key_radioBackground, false), Theme.getColor(null, Theme.key_radioBackgroundChecked, false));
        addView(radioButton, LayoutHelper.createFrame(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        this.isRTL = LocaleController.isRTL;
        setClipChildren(false);
    }

    public void setAnimationProgress(float f) {
        this.animationProgress = f;
        Math.max(this.lastTouchX, getMeasuredWidth() - this.lastTouchX);
        AndroidUtilities.dp(40.0f);
        getMeasuredHeight();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(64.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        RadioButton radioButton = this.radioButton;
        accessibilityNodeInfo.setChecked(radioButton.isChecked());
        accessibilityNodeInfo.setContentDescription(LocaleController.getString(radioButton.isChecked() ? R.string.NotificationsOn : R.string.NotificationsOff));
        StringBuilder sb = new StringBuilder();
        sb.append(this.textView.getText());
        TextView textView = this.valueTextView;
        if (!TextUtils.isEmpty(textView.getText())) {
            sb.append("\n");
            sb.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.valueTextView.getVisibility() == 0 ? 64.0f : this.height) + (this.needDivider ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.lastTouchX = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i) {
        clearAnimation();
        super.setBackgroundColor(i);
    }

    public void setChecked(boolean z) {
        this.radioButton.setChecked(z, true);
    }

    public void setHeight(int i) {
        this.height = i;
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
    }

    public final void setTextAndValueAndCheck(String str, String str2, boolean z) {
        TextView textView = this.textView;
        textView.setText(str);
        TextView textView2 = this.valueTextView;
        textView2.setText(str2);
        this.radioButton.setChecked(false, false);
        this.needDivider = z;
        textView2.setVisibility(0);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setPadding(0, 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = AndroidUtilities.dp(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z);
    }

    public void setTypeface(Typeface typeface) {
        this.textView.setTypeface(typeface);
    }

    public final void updateRTL() {
        boolean z = this.isRTL;
        boolean z2 = LocaleController.isRTL;
        if (z == z2) {
            return;
        }
        this.isRTL = z2;
        TextView textView = this.textView;
        textView.setGravity((z2 ? 5 : 3) | 16);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        boolean z3 = LocaleController.isRTL;
        layoutParams.gravity = (z3 ? 5 : 3) | 48;
        int i = this.padding;
        layoutParams.leftMargin = AndroidUtilities.dp(z3 ? i : 64.0f);
        layoutParams.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 64.0f : i);
        textView.setLayoutParams(layoutParams);
        TextView textView2 = this.valueTextView;
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        boolean z4 = LocaleController.isRTL;
        layoutParams2.gravity = (z4 ? 5 : 3) | 48;
        layoutParams2.leftMargin = AndroidUtilities.dp(z4 ? i : 64.0f);
        layoutParams2.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 64.0f : i);
        textView2.setLayoutParams(layoutParams2);
        RadioButton radioButton = this.radioButton;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        layoutParams3.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
        radioButton.setLayoutParams(layoutParams3);
    }
}
