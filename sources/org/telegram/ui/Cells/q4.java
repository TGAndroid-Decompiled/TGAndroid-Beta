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
    public final RadioButton f24900a;
    public final TextView f24901b;
    public final TextView f24902c;
    public boolean d;
    public LocaleController.LocaleInfo f24903e;
    public final int f24904f;

    public q4(Context context) {
        super(context);
        int i9;
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        int i13;
        float f12;
        float f13;
        this.f24904f = 62;
        if (org.telegram.ui.ActionBar.f6.f23121k0 == null) {
            org.telegram.ui.ActionBar.f6.P(context);
        }
        setWillNotDraw(false);
        RadioButton radioButton = new RadioButton(context);
        this.f24900a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.D5, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E5, false));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        int i14 = i9 | 16;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 20;
        }
        addView(radioButton, g7.e6.d(22, 22.0f, i14, i10, 0.0f, z10 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.f24901b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i15 = i12 | 48;
        if (z11) {
            f10 = 23;
        } else {
            f10 = 62;
        }
        float f14 = f10;
        if (z11) {
            f11 = 62;
        } else {
            f11 = 23;
        }
        addView(textView, g7.e6.d(-1, -1.0f, i15, f14, 0.0f, f11, 17.0f));
        TextView textView2 = new TextView(context);
        this.f24902c = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23247r5, false));
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView2.setGravity(i13 | 16);
        boolean z12 = LocaleController.isRTL;
        int i16 = (z12 ? 5 : 3) | 48;
        if (z12) {
            f12 = 23;
        } else {
            f12 = 62;
        }
        float f15 = f12;
        if (z12) {
            f13 = 62;
        } else {
            f13 = 23;
        }
        addView(textView2, g7.e6.d(-1, -1.0f, i16, f15, 20.0f, f13, 0.0f));
    }

    public LocaleController.LocaleInfo getCurrentLocale() {
        return this.f24903e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i9;
        if (this.d) {
            boolean z10 = LocaleController.isRTL;
            int i10 = this.f24904f;
            if (z10) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(i10 - 3);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(i10 - 3);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.d ? 1 : 0), 1073741824));
    }
}
