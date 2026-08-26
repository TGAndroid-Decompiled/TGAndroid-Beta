package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadioButton;

public final class LanguageCell extends FrameLayout {
    public LocaleController.LocaleInfo currentLocale;
    public final int marginStartDp;
    public boolean needDivider;
    public final RadioButton radioButton;
    public final TextView textView;
    public final TextView textView2;

    public LanguageCell(Context context) {
        super(context);
        this.marginStartDp = 62;
        if (Theme.dividerPaint == null) {
            Theme.createCommonResources(context);
        }
        setWillNotDraw(false);
        RadioButton radioButton = new RadioButton(context);
        this.radioButton = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        int color = Theme.getColor(null, Theme.key_dialogRadioBackground, false);
        int color2 = Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false);
        radioButton.color = color;
        radioButton.checkedColor = color2;
        radioButton.invalidate();
        boolean z = LocaleController.isRTL;
        addView(radioButton, LayoutHelper.createFrame(22, 22.0f, (z ? 5 : 3) | 16, z ? 0 : 20, 0.0f, z ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z2 = LocaleController.isRTL;
        addView(textView, LayoutHelper.createFrame(-1, -1.0f, (z2 ? 5 : 3) | 48, z2 ? 23 : 62, 0.0f, z2 ? 62 : 23, 17.0f));
        TextView textView2 = new TextView(context);
        this.textView2 = textView2;
        textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextGray3, false));
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z3 = LocaleController.isRTL;
        addView(textView2, LayoutHelper.createFrame(-1, -1.0f, (z3 ? 5 : 3) | 48, z3 ? 23 : 62, 20.0f, z3 ? 62 : 23, 0.0f));
    }

    public LocaleController.LocaleInfo getCurrentLocale() {
        return this.currentLocale;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.needDivider) {
            boolean z = LocaleController.isRTL;
            int i = this.marginStartDp;
            canvas.drawLine(z ? 0.0f : AndroidUtilities.dp(i - 3), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(i - 3) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.needDivider ? 1 : 0), 1073741824));
    }
}
