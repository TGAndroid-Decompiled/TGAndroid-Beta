package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ee extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 f37914a;
    public final org.telegram.ui.Components.s5 f37915b;
    public final TextView f37916c;
    public final TextView d;
    public final DecimalFormat f37917e;
    public boolean f37918f;

    public ee(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f37914a = b6Var;
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        addView(f10, g7.e6.d(-1, -2.0f, 119, 17.0f, 9.0f, 130.0f, 9.0f));
        TextView textView = new TextView(context);
        this.f37916c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        TextView h = j3.r0.h(f10, textView, g7.e6.n(-1, -2), context);
        this.d = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, b6Var));
        f10.addView(h, g7.e6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(context);
        this.f37915b = s5Var;
        s5Var.setTypeface(AndroidUtilities.bold());
        s5Var.setTextSize(1, 13.0f);
        addView(s5Var, g7.e6.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f37917e = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float dp;
        int i9;
        super.onDraw(canvas);
        if (this.f37918f) {
            org.telegram.ui.ActionBar.b6 b6Var = this.f37914a;
            if (b6Var != null) {
                paint = b6Var.O("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.f6.f23121k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (LocaleController.isRTL) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(17.0f);
                }
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (LocaleController.isRTL) {
                    i9 = AndroidUtilities.dp(17.0f);
                } else {
                    i9 = 0;
                }
                canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
    }
}
