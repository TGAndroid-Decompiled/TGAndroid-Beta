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
public final class ke extends FrameLayout {
    public final org.telegram.ui.ActionBar.p6 f38853a;
    public final org.telegram.ui.Components.n5 f38854b;
    public final TextView f38855c;
    public final TextView d;
    public final DecimalFormat e;
    public boolean f38856f;

    public ke(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f38853a = p6Var;
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        addView(f7, w7.b6.d(-1, -2.0f, 119, 17.0f, 9.0f, 130.0f, 9.0f));
        TextView textView = new TextView(context);
        this.f38855c = textView;
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        f7.addView(textView, w7.b6.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21312y6, p6Var);
        f7.addView(textView2, w7.b6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(context);
        this.f38854b = n5Var;
        n5Var.setTypeface(org.telegram.messenger.i0.o());
        n5Var.setTextSize(1, 13.0f);
        addView(n5Var, w7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
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
        float L;
        int i10;
        super.onDraw(canvas);
        if (this.f38856f) {
            org.telegram.ui.ActionBar.p6 p6Var = this.f38853a;
            if (p6Var != null) {
                paint = p6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.t6.f21053k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (org.telegram.messenger.dd.X) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.i0.L(17.0f);
                }
                float f7 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (org.telegram.messenger.dd.X) {
                    i10 = org.telegram.messenger.i0.L(17.0f);
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
