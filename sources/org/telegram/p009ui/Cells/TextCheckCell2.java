package org.telegram.p009ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.Switch;

public class TextCheckCell2 extends FrameLayout {
    private Switch checkBox;
    private boolean isMultiline;
    private boolean needDivider;
    private TextView textView;
    private TextView valueTextView;

    public TextCheckCell2(Context context) {
        this(context, null);
    }

    public TextCheckCell2(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText", resourcesProvider));
        this.textView.setTextSize(1, 16.0f);
        this.textView.setLines(1);
        this.textView.setMaxLines(1);
        this.textView.setSingleLine(true);
        this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.textView.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView2 = this.textView;
        boolean z = LocaleController.isRTL;
        addView(textView2, LayoutHelper.createFrame(-1, -1.0f, (z ? 5 : 3) | 48, z ? 64.0f : 21.0f, 0.0f, z ? 21.0f : 64.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.valueTextView = textView3;
        textView3.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText2", resourcesProvider));
        this.valueTextView.setTextSize(1, 13.0f);
        this.valueTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        this.valueTextView.setLines(1);
        this.valueTextView.setMaxLines(1);
        this.valueTextView.setSingleLine(true);
        this.valueTextView.setPadding(0, 0, 0, 0);
        this.valueTextView.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView4 = this.valueTextView;
        boolean z2 = LocaleController.isRTL;
        addView(textView4, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 64.0f : 21.0f, 35.0f, z2 ? 21.0f : 64.0f, 0.0f));
        Switch r2 = new Switch(context);
        this.checkBox = r2;
        r2.setDrawIconType(1);
        addView(this.checkBox, LayoutHelper.createFrame(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (this.isMultiline) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(this.valueTextView.getVisibility() == 0 ? 64.0f : 50.0f) + (this.needDivider ? 1 : 0), 1073741824));
        }
    }

    public void setTextAndCheck(String str, boolean z, boolean z2) {
        this.textView.setText(str);
        this.isMultiline = false;
        this.checkBox.setChecked(z, false);
        this.needDivider = z2;
        this.valueTextView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        this.textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z2);
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.textView.clearAnimation();
        this.valueTextView.clearAnimation();
        this.checkBox.clearAnimation();
        if (z) {
            this.textView.setAlpha(1.0f);
            this.valueTextView.setAlpha(1.0f);
            this.checkBox.setAlpha(1.0f);
            return;
        }
        this.checkBox.setAlpha(0.5f);
        this.textView.setAlpha(0.5f);
        this.valueTextView.setAlpha(0.5f);
    }

    public void setEnabled(boolean z, boolean z2) {
        super.setEnabled(z);
        if (z2) {
            this.textView.clearAnimation();
            this.valueTextView.clearAnimation();
            this.checkBox.clearAnimation();
            this.textView.animate().alpha(z ? 1.0f : 0.5f).start();
            this.valueTextView.animate().alpha(z ? 1.0f : 0.5f).start();
            this.checkBox.animate().alpha(z ? 1.0f : 0.5f).start();
        } else if (z) {
            this.textView.setAlpha(1.0f);
            this.valueTextView.setAlpha(1.0f);
            this.checkBox.setAlpha(1.0f);
        } else {
            this.checkBox.setAlpha(0.5f);
            this.textView.setAlpha(0.5f);
            this.valueTextView.setAlpha(0.5f);
        }
    }

    public void setChecked(boolean z) {
        this.checkBox.setChecked(z, true);
    }

    public void setIcon(int i) {
        this.checkBox.setIcon(i);
    }

    public boolean hasIcon() {
        return this.checkBox.hasIcon();
    }

    public boolean isChecked() {
        return this.checkBox.isChecked();
    }

    public Switch getCheckBox() {
        return this.checkBox;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.m35dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.m35dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.checkBox.isChecked());
    }
}
