package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.LayoutHelper;

public final class TextCheckBoxCell extends FrameLayout {
    public final CheckBoxSquare checkBox;
    public boolean needDivider;
    public final TextView textView;

    public TextCheckBoxCell(Activity activity) {
        super(activity);
        boolean z = LocaleController.isRTL;
        TextView textView = new TextView(activity);
        this.textView = textView;
        ArticleViewer.IBlock.CC.m(textView, Theme.getColor(null, Theme.key_dialogTextBlack, false), 16.0f, 1, true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, LayoutHelper.createFrame(-1, -1.0f, (z ? 5 : 3) | 48, z ? 66.0f : 21.0f, 0.0f, z ? 21.0f : 66.0f, 0.0f));
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(activity, null, true);
        this.checkBox = checkBoxSquare;
        checkBoxSquare.setDuplicateParentStateEnabled(false);
        checkBoxSquare.setFocusable(false);
        checkBoxSquare.setFocusableInTouchMode(false);
        checkBoxSquare.setClickable(false);
        addView(checkBoxSquare, LayoutHelper.createFrame(18, 18.0f, (z ? 3 : 5) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.checkBox.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.checkBox.isChecked);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.needDivider ? 1 : 0), 1073741824));
    }

    public void setChecked(boolean z) {
        this.checkBox.setChecked(z, true);
    }
}
