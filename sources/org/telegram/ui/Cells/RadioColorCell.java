package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadioButton;

public final class RadioColorCell extends FrameLayout {
    public int heightDp;
    public final RadioButton radioButton;
    public final TextView text2View;
    public final TextView textView;

    public RadioColorCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.heightDp = 50;
        RadioButton radioButton = new RadioButton(context);
        this.radioButton = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        int color = Theme.getColor(Theme.key_dialogRadioBackground, resourcesProvider);
        int color2 = Theme.getColor(Theme.key_dialogRadioBackgroundChecked, resourcesProvider);
        radioButton.color = color;
        radioButton.checkedColor = color2;
        radioButton.invalidate();
        boolean z = LocaleController.isRTL;
        addView(radioButton, LayoutHelper.createFrame(22, 22.0f, (z ? 5 : 3) | 48, z ? 0 : 18, 14.0f, z ? 18 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.textView = textView;
        OKLCH.m(Theme.key_dialogTextBlack, resourcesProvider, textView, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z2 = LocaleController.isRTL;
        addView(textView, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 51, 13.0f, z2 ? 51 : 21, 0.0f));
        TextView textView2 = new TextView(context);
        this.text2View = textView2;
        OKLCH.m(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider, textView2, 14.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setVisibility(8);
        boolean z3 = LocaleController.isRTL;
        addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 21 : 51, 37.0f, z3 ? 51 : 21, 0.0f));
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
        int measuredHeight;
        TextView textView = this.text2View;
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - AndroidUtilities.dp(72.0f), 1073741824), i2);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        int iDp = AndroidUtilities.dp(this.heightDp);
        if (textView.getVisibility() == 0) {
            measuredHeight = textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        } else {
            measuredHeight = 0;
        }
        super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(iDp + measuredHeight, 1073741824));
    }

    public final void setCheckColor(int i, int i2) {
        RadioButton radioButton = this.radioButton;
        radioButton.color = i;
        radioButton.checkedColor = i2;
        radioButton.invalidate();
    }

    public final void setTextAndValue(CharSequence charSequence, boolean z) {
        this.textView.setText(charSequence);
        this.text2View.setVisibility(8);
        this.radioButton.setChecked(z, false);
    }
}
