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
import org.telegram.p009ui.Components.CheckBox2;
import org.telegram.p009ui.Components.CheckBoxSquare;
import org.telegram.p009ui.Components.LayoutHelper;

public class CheckBoxCell extends FrameLayout {
    private View checkBox;
    private CheckBox2 checkBoxRound;
    private int checkBoxSize;
    private CheckBoxSquare checkBoxSquare;
    private int currentType;
    private boolean isMultiline;
    private boolean needDivider;
    private final Theme.ResourcesProvider resourcesProvider;
    private TextView textView;
    private TextView valueTextView;

    public CheckBoxCell(Context context, int i) {
        this(context, i, 17, null);
    }

    public CheckBoxCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        this(context, i, 17, resourcesProvider);
    }

    public CheckBoxCell(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.checkBoxSize = 18;
        this.resourcesProvider = resourcesProvider;
        this.currentType = i;
        TextView textView = new TextView(context);
        this.textView = textView;
        int i3 = 5;
        boolean z = true;
        textView.setTag(Integer.valueOf(getThemedColor((i == 1 || i == 5) ? "dialogTextBlack" : "windowBackgroundWhiteBlackText")));
        this.textView.setTextSize(1, 16.0f);
        this.textView.setLines(1);
        this.textView.setMaxLines(1);
        this.textView.setSingleLine(true);
        this.textView.setEllipsize(TextUtils.TruncateAt.END);
        int i4 = 0;
        if (i == 3) {
            this.textView.setGravity(19);
            addView(this.textView, LayoutHelper.createFrame(-1, -1.0f, 51, 29.0f, 0.0f, 0.0f, 0.0f));
            this.textView.setPadding(0, 0, 0, AndroidUtilities.m34dp(3.0f));
        } else {
            this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            if (i == 2) {
                View view = this.textView;
                boolean z2 = LocaleController.isRTL;
                addView(view, LayoutHelper.createFrame(-1, -1.0f, (z2 ? 5 : 3) | 48, z2 ? 0 : 29, 0.0f, z2 ? 29 : 0, 0.0f));
            } else {
                int i5 = i == 4 ? 56 : 46;
                View view2 = this.textView;
                boolean z3 = LocaleController.isRTL;
                addView(view2, LayoutHelper.createFrame(-1, -1.0f, (z3 ? 5 : 3) | 48, z3 ? i2 : i5 + (i2 - 17), 0.0f, z3 ? i5 + (i2 - 17) : i2, 0.0f));
            }
        }
        TextView textView2 = new TextView(context);
        this.valueTextView = textView2;
        textView2.setTag((i == 1 || i == 5) ? "dialogTextBlue" : "windowBackgroundWhiteValueText");
        this.valueTextView.setTextSize(1, 16.0f);
        this.valueTextView.setLines(1);
        this.valueTextView.setMaxLines(1);
        this.valueTextView.setSingleLine(true);
        this.valueTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.valueTextView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        float f = i2;
        addView(this.valueTextView, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f, 0.0f, f, 0.0f));
        if (i == 4) {
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBoxRound = checkBox2;
            this.checkBox = checkBox2;
            checkBox2.setDrawUnchecked(true);
            this.checkBoxRound.setChecked(true, false);
            this.checkBoxRound.setDrawBackgroundAsArc(10);
            this.checkBoxSize = 21;
            View view3 = this.checkBox;
            float f2 = 21;
            boolean z4 = LocaleController.isRTL;
            addView(view3, LayoutHelper.createFrame(21, f2, (!z4 ? 3 : i3) | 48, z4 ? 0 : i2, 16.0f, z4 ? i2 : i4, 0.0f));
        } else {
            if (!(i == 1 || i == 5)) {
                z = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, z, resourcesProvider);
            this.checkBoxSquare = checkBoxSquare;
            this.checkBox = checkBoxSquare;
            this.checkBoxSize = 18;
            if (i == 5) {
                float f3 = 18;
                boolean z5 = LocaleController.isRTL;
                addView(checkBoxSquare, LayoutHelper.createFrame(18, f3, (!z5 ? 3 : i3) | 16, z5 ? 0 : i2, 0.0f, z5 ? i2 : i4, 0.0f));
            } else if (i == 3) {
                addView(checkBoxSquare, LayoutHelper.createFrame(18, 18, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else if (i == 2) {
                addView(checkBoxSquare, LayoutHelper.createFrame(18, 18, (!LocaleController.isRTL ? 3 : i3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                float f4 = 18;
                boolean z6 = LocaleController.isRTL;
                addView(checkBoxSquare, LayoutHelper.createFrame(18, f4, (!z6 ? 3 : i3) | 48, z6 ? 0 : i2, 16.0f, z6 ? i2 : i4, 0.0f));
            }
        }
        updateTextColor();
    }

    public void updateTextColor() {
        TextView textView = this.textView;
        int i = this.currentType;
        textView.setTextColor(getThemedColor((i == 1 || i == 5) ? "dialogTextBlack" : "windowBackgroundWhiteBlackText"));
        TextView textView2 = this.textView;
        int i2 = this.currentType;
        textView2.setLinkTextColor(getThemedColor((i2 == 1 || i2 == 5) ? "dialogTextLink" : "windowBackgroundWhiteLinkText"));
        TextView textView3 = this.valueTextView;
        int i3 = this.currentType;
        textView3.setTextColor(getThemedColor((i3 == 1 || i3 == 5) ? "dialogTextBlue" : "windowBackgroundWhiteValueText"));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (this.currentType == 3) {
            int size = View.MeasureSpec.getSize(i);
            this.valueTextView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(10.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(50.0f), 1073741824));
            this.textView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.m34dp(34.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(50.0f), 1073741824));
            this.checkBox.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(this.checkBoxSize), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(this.checkBoxSize), 1073741824));
            setMeasuredDimension(this.textView.getMeasuredWidth() + AndroidUtilities.m34dp(29.0f), AndroidUtilities.m34dp(50.0f));
        } else if (this.isMultiline) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.m34dp(50.0f) + (this.needDivider ? 1 : 0));
            int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.m34dp(34.0f);
            this.valueTextView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth / 2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            this.textView.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - this.valueTextView.getMeasuredWidth()) - AndroidUtilities.m34dp(8.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            this.checkBox.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(this.checkBoxSize), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(this.checkBoxSize), 1073741824));
        }
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public void setText(CharSequence charSequence, String str, boolean z, boolean z2) {
        this.textView.setText(charSequence);
        CheckBox2 checkBox2 = this.checkBoxRound;
        if (checkBox2 != null) {
            checkBox2.setChecked(z, false);
        } else {
            this.checkBoxSquare.setChecked(z, false);
        }
        this.valueTextView.setText(str);
        this.needDivider = z2;
        setWillNotDraw(!z2);
    }

    public void setNeedDivider(boolean z) {
        this.needDivider = z;
    }

    public void setMultiline(boolean z) {
        this.isMultiline = z;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.textView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.checkBox.getLayoutParams();
        if (this.isMultiline) {
            this.textView.setLines(0);
            this.textView.setMaxLines(0);
            this.textView.setSingleLine(false);
            this.textView.setEllipsize(null);
            if (this.currentType != 5) {
                this.textView.setPadding(0, 0, 0, AndroidUtilities.m34dp(5.0f));
                layoutParams.height = -2;
                layoutParams.topMargin = AndroidUtilities.m34dp(10.0f);
                layoutParams2.topMargin = AndroidUtilities.m34dp(12.0f);
            }
        } else {
            this.textView.setLines(1);
            this.textView.setMaxLines(1);
            this.textView.setSingleLine(true);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setPadding(0, 0, 0, 0);
            layoutParams.height = -1;
            layoutParams.topMargin = 0;
            layoutParams2.topMargin = AndroidUtilities.m34dp(15.0f);
        }
        this.textView.setLayoutParams(layoutParams);
        this.checkBox.setLayoutParams(layoutParams2);
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        float f = 1.0f;
        this.textView.setAlpha(z ? 1.0f : 0.5f);
        this.valueTextView.setAlpha(z ? 1.0f : 0.5f);
        View view = this.checkBox;
        if (!z) {
            f = 0.5f;
        }
        view.setAlpha(f);
    }

    public void setChecked(boolean z, boolean z2) {
        CheckBox2 checkBox2 = this.checkBoxRound;
        if (checkBox2 != null) {
            checkBox2.setChecked(z, z2);
        } else {
            this.checkBoxSquare.setChecked(z, z2);
        }
    }

    public boolean isChecked() {
        CheckBox2 checkBox2 = this.checkBoxRound;
        if (checkBox2 != null) {
            return checkBox2.isChecked();
        }
        return this.checkBoxSquare.isChecked();
    }

    public TextView getTextView() {
        return this.textView;
    }

    public TextView getValueTextView() {
        return this.valueTextView;
    }

    public View getCheckBoxView() {
        return this.checkBox;
    }

    public void setCheckBoxColor(String str, String str2, String str3) {
        CheckBox2 checkBox2 = this.checkBoxRound;
        if (checkBox2 != null) {
            checkBox2.setColor(str, str, str3);
        }
    }

    public void setSquareCheckBoxColor(String str, String str2, String str3) {
        CheckBoxSquare checkBoxSquare = this.checkBoxSquare;
        if (checkBoxSquare != null) {
            checkBoxSquare.setColors(str, str2, str3);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.needDivider) {
            int i = this.currentType == 4 ? 50 : 20;
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.m34dp(i), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.m34dp(i) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(isChecked());
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
