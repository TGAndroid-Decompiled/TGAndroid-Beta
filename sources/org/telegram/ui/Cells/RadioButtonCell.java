package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadioButton;

public final class RadioButtonCell extends FrameLayout {
    public boolean needDivider;
    public final RadioButton radioButton;
    public final TextView textView;
    public final TextView valueTextView;

    public RadioButtonCell(Context context, boolean z) {
        super(context);
        RadioButton radioButton = new RadioButton(context);
        this.radioButton = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        if (z) {
            int color = Theme.getColor(null, Theme.key_dialogRadioBackground, false);
            int color2 = Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false);
            radioButton.color = color;
            radioButton.checkedColor = color2;
            radioButton.invalidate();
        } else {
            int color3 = Theme.getColor(null, Theme.key_radioBackground, false);
            int color4 = Theme.getColor(null, Theme.key_radioBackgroundChecked, false);
            radioButton.color = color3;
            radioButton.checkedColor = color4;
            radioButton.invalidate();
        }
        boolean z2 = LocaleController.isRTL;
        addView(radioButton, LayoutHelper.createFrame(22, 22.0f, (z2 ? 5 : 3) | 48, z2 ? 0 : 20, 10.0f, z2 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.textView = textView;
        if (z) {
            textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        } else {
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        }
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z3 = LocaleController.isRTL;
        addView(textView, LayoutHelper.createFrame(-2, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 23 : 61, 10.0f, z3 ? 61 : 23, 0.0f));
        TextView textView2 = new TextView(context);
        this.valueTextView = textView2;
        if (z) {
            textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextGray2, false));
        } else {
            textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false));
        }
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
        boolean z4 = LocaleController.isRTL;
        addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 17 : 61, 35.0f, z4 ? 61 : 17, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 60.0f), getHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 60.0f : 0.0f), getHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.radioButton.isChecked);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void setTextAndValue(String str, String str2, boolean z, boolean z2) {
        this.textView.setText(str);
        this.valueTextView.setText(str2);
        this.radioButton.setChecked(z2, false);
        this.needDivider = z;
    }
}
