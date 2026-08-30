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
public final class je extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 f35327a;
    public final org.telegram.ui.Components.t5 f35328b;
    public final TextView f35329c;
    public final TextView d;
    public final DecimalFormat e;
    public boolean f35330f;

    public je(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f35327a = f6Var;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        addView(f10, k7.b6.d(-1, -2.0f, 119, 17.0f, 9.0f, 130.0f, 9.0f));
        TextView textView = new TextView(context);
        this.f35329c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        TextView j10 = yh.j(f10, textView, k7.b6.n(-1, -2), context);
        this.d = j10;
        j10.setTextSize(1, 13.0f);
        j10.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20281y6, f6Var));
        f10.addView(j10, k7.b6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(context);
        this.f35328b = t5Var;
        t5Var.setTypeface(AndroidUtilities.bold());
        t5Var.setTextSize(1, 13.0f);
        addView(t5Var, k7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
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
        if (this.f35330f) {
            org.telegram.ui.ActionBar.f6 f6Var = this.f35327a;
            if (f6Var != null) {
                paint = f6Var.G("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.j6.f20025k0;
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
