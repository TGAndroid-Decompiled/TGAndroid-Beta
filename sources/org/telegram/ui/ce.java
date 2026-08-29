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
public final class ce extends FrameLayout {
    public final org.telegram.ui.ActionBar.c6 f37083a;
    public final org.telegram.ui.Components.x5 f37084b;
    public final TextView f37085c;
    public final TextView d;
    public final DecimalFormat f37086e;
    public boolean f37087f;

    public ce(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f37083a = c6Var;
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        addView(g10, i7.f6.d(-1, -2.0f, 119, 17.0f, 9.0f, 130.0f, 9.0f));
        TextView textView = new TextView(context);
        this.f37085c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        TextView i10 = th.i(g10, textView, i7.f6.n(-1, -2), context);
        this.d = i10;
        i10.setTextSize(1, 13.0f);
        i10.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, c6Var));
        g10.addView(i10, i7.f6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.f37084b = x5Var;
        x5Var.setTypeface(AndroidUtilities.bold());
        x5Var.setTextSize(1, 13.0f);
        addView(x5Var, i7.f6.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f37086e = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f37087f) {
            org.telegram.ui.ActionBar.c6 c6Var = this.f37083a;
            if (c6Var != null) {
                paint = c6Var.G("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.g6.f23183k0;
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
                    i10 = AndroidUtilities.dp(17.0f);
                } else {
                    i10 = 0;
                }
                canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
