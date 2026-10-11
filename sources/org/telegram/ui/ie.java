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
public final class ie extends FrameLayout {
    public final org.telegram.ui.ActionBar.d6 f38699a;
    public final org.telegram.ui.Components.a6 f38700b;
    public final TextView f38701c;
    public final TextView d;
    public final DecimalFormat f38702e;
    public boolean f38703f;

    public ie(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f38699a = d6Var;
        LinearLayout e7 = org.telegram.messenger.ai.e(context, 1);
        addView(e7, w7.x5.a(-2.0f, 17.0f, 9.0f, 130.0f, 9.0f, -1, 119));
        TextView textView = new TextView(context);
        this.f38701c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        TextView h = com.google.android.gms.internal.vision.e2.h(e7, textView, w7.x5.n(-1, -2), context);
        this.d = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21207y6, d6Var));
        e7.addView(h, w7.x5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.a6 a6Var = new org.telegram.ui.Components.a6(context);
        this.f38700b = a6Var;
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setTextSize(1, 13.0f);
        addView(a6Var, w7.x5.a(-2.0f, 0.0f, 0.0f, 18.0f, 0.0f, -2, 21));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f38702e = decimalFormat;
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
        if (this.f38703f) {
            org.telegram.ui.ActionBar.d6 d6Var = this.f38699a;
            if (d6Var != null) {
                paint = d6Var.F("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.h6.f20944k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (LocaleController.isRTL) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(17.0f);
                }
                float f7 = dp;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(17.0f);
                } else {
                    i10 = 0;
                }
                canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
