package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadioButton;

public final class DialogRadioCell extends FrameLayout {
    public int itemId;
    public boolean needDivider;
    public final RadioButton radioButton;
    public final TextView textView;
    public final TextView valueTextView;

    public DialogRadioCell(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.textView = textView;
        ArticleViewer.IBlock.CC.m(textView, Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), 16.0f, 1, true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z = LocaleController.isRTL;
        addView(textView, LayoutHelper.createFrame(-1, -1.0f, (z ? 5 : 3) | 48, z ? 61.0f : 23.0f, 0.0f, z ? 23.0f : 61.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.valueTextView = textView2;
        ArticleViewer.IBlock.CC.m(textView2, Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false), 16.0f, 1, true);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        textView2.setVisibility(8);
        addView(textView2, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 23.0f, 0.0f, 23.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.radioButton = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        int color = Theme.getColor(null, Theme.key_radioBackground, false);
        int color2 = Theme.getColor(null, Theme.key_radioBackgroundChecked, false);
        radioButton.color = color;
        radioButton.checkedColor = color2;
        radioButton.invalidate();
        addView(radioButton, LayoutHelper.createFrame(22, 22.0f, (LocaleController.isRTL ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f));
        updateLayout();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 23.0f), getHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 23.0f : 0.0f), getHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(50.0f) + (this.needDivider ? 1 : 0));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        TextView textView = this.valueTextView;
        int iDp = measuredWidth - AndroidUtilities.dp((textView.getVisibility() == 0 ? 12 : 0) + 84);
        this.radioButton.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824));
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            iDp = OKLCH.m$1(12.0f, textView.getMeasuredWidth(), iDp);
        }
        this.textView.measure(View.MeasureSpec.makeMeasureSpec(iDp, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public final void setEnabled(boolean z, boolean z2) {
        setEnabled(z);
        RadioButton radioButton = this.radioButton;
        TextView textView = this.valueTextView;
        TextView textView2 = this.textView;
        if (z2) {
            textView2.animate().alpha(z ? 1.0f : 0.5f).start();
            textView.animate().alpha(z ? 1.0f : 0.5f).start();
            radioButton.animate().alpha(z ? 1.0f : 0.5f).start();
        } else {
            textView2.setAlpha(z ? 1.0f : 0.5f);
            textView.setAlpha(z ? 1.0f : 0.5f);
            radioButton.setAlpha(z ? 1.0f : 0.5f);
        }
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public final void updateLayout() {
        FrameLayout.LayoutParams layoutParamsCreateFrame;
        FrameLayout.LayoutParams layoutParamsCreateFrame2;
        TextView textView = this.valueTextView;
        if (textView.getVisibility() == 0) {
            boolean z = LocaleController.isRTL;
            layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -1.0f, (z ? 5 : 3) | 48, z ? 23.0f : 61.0f, 0.0f, z ? 61.0f : 23.0f, 0.0f);
        } else {
            boolean z2 = LocaleController.isRTL;
            layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -1.0f, (z2 ? 5 : 3) | 48, z2 ? 61.0f : 23.0f, 0.0f, z2 ? 23.0f : 61.0f, 0.0f);
        }
        this.textView.setLayoutParams(layoutParamsCreateFrame);
        if (textView.getVisibility() == 0) {
            layoutParamsCreateFrame2 = LayoutHelper.createFrame(22, 22.0f, (LocaleController.isRTL ? 5 : 3) | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        } else {
            layoutParamsCreateFrame2 = LayoutHelper.createFrame(22, 22.0f, (LocaleController.isRTL ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        }
        this.radioButton.setLayoutParams(layoutParamsCreateFrame2);
    }
}
