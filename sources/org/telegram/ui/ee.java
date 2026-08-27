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

    public final org.telegram.ui.ActionBar.c6 f37737a;

    public final org.telegram.ui.Components.s5 f37738b;

    public final TextView f37739c;
    public final TextView d;

    public final DecimalFormat f37740e;

    public boolean f37741f;

    public ee(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f37737a = c6Var;
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        addView(linearLayoutG, h7.z5.d(-1, -2.0f, 119, 17.0f, 9.0f, 130.0f, 9.0f));
        TextView textView = new TextView(context);
        this.f37739c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayoutG, textView, h7.z5.n(-1, -2), context);
        this.d = textViewI;
        textViewI.setTextSize(1, 13.0f);
        textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var));
        linearLayoutG.addView(textViewI, h7.z5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(context);
        this.f37738b = s5Var;
        s5Var.setTypeface(AndroidUtilities.bold());
        s5Var.setTextSize(1, 13.0f);
        addView(s5Var, h7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f37740e = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f37741f) {
            org.telegram.ui.ActionBar.c6 c6Var = this.f37737a;
            Paint paintN = c6Var != null ? c6Var.N("paintDivider") : org.telegram.ui.ActionBar.g6.f23175k0;
            if (paintN != null) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(17.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(17.0f) : 0), getMeasuredHeight() - 1, paintN);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
