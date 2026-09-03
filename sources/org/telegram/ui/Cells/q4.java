package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.RadioButton;
public final class q4 extends FrameLayout {
    public final RadioButton f23363a;
    public final TextView f23364b;
    public final TextView f23365c;
    public boolean d;
    public LocaleController.LocaleInfo f23366e;
    public final int f23367f;

    public q4(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        float f10;
        float f11;
        int i14;
        float f12;
        float f13;
        this.f23367f = 62;
        if (org.telegram.ui.ActionBar.k6.f21781k0 == null) {
            org.telegram.ui.ActionBar.k6.P(context);
        }
        setWillNotDraw(false);
        RadioButton radioButton = new RadioButton(context);
        this.f23363a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.D5, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E5, false));
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i15 = i10 | 16;
        if (z4) {
            i11 = 0;
        } else {
            i11 = 20;
        }
        addView(radioButton, k7.c6.d(22, 22.0f, i15, i11, 0.0f, z4 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.f23364b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21768j5, false));
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i16 = i13 | 48;
        if (z10) {
            f10 = 23;
        } else {
            f10 = 62;
        }
        float f14 = f10;
        if (z10) {
            f11 = 62;
        } else {
            f11 = 23;
        }
        addView(textView, k7.c6.d(-1, -1.0f, i16, f14, 0.0f, f11, 17.0f));
        TextView textView2 = new TextView(context);
        this.f23365c = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21913r5, false));
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        textView2.setGravity(i14 | 16);
        boolean z11 = LocaleController.isRTL;
        int i17 = (z11 ? 5 : 3) | 48;
        if (z11) {
            f12 = 23;
        } else {
            f12 = 62;
        }
        float f15 = f12;
        if (z11) {
            f13 = 62;
        } else {
            f13 = 23;
        }
        addView(textView2, k7.c6.d(-1, -1.0f, i17, f15, 20.0f, f13, 0.0f));
    }

    public LocaleController.LocaleInfo getCurrentLocale() {
        return this.f23366e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.d) {
            boolean z4 = LocaleController.isRTL;
            int i11 = this.f23367f;
            if (z4) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(i11 - 3);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(i11 - 3);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21781k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.d ? 1 : 0), 1073741824));
    }
}
