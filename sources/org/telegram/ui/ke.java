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
public final class ke extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 f34340a;
    public final org.telegram.ui.Components.x5 f34341b;
    public final TextView f34342c;
    public final TextView d;
    public final DecimalFormat e;
    public boolean f34343f;

    public ke(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f34340a = f6Var;
        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
        addView(f7, w7.a6.d(-1, -2.0f, 119, 17.0f, 9.0f, 130.0f, 9.0f));
        TextView textView = new TextView(context);
        this.f34342c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        TextView g10 = com.google.android.gms.internal.vision.e2.g(f7, textView, w7.a6.n(-1, -2), context);
        this.d = g10;
        g10.setTextSize(1, 13.0f);
        g10.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18306y6, f6Var));
        f7.addView(g10, w7.a6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.f34341b = x5Var;
        x5Var.setTypeface(AndroidUtilities.bold());
        x5Var.setTextSize(1, 13.0f);
        addView(x5Var, w7.a6.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.e = decimalFormat;
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
        if (this.f34343f) {
            org.telegram.ui.ActionBar.f6 f6Var = this.f34340a;
            if (f6Var != null) {
                paint = f6Var.F("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.j6.f18049k0;
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
