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
public final class p4 extends FrameLayout {
    public final RadioButton f22484a;
    public final TextView f22485b;
    public final TextView f22486c;
    public boolean d;
    public LocaleController.LocaleInfo f22487e;
    public final int f22488f;

    public p4(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        float f11;
        float f12;
        this.f22488f = 62;
        if (org.telegram.ui.ActionBar.j6.f20812k0 == null) {
            org.telegram.ui.ActionBar.j6.P(context);
        }
        setWillNotDraw(false);
        RadioButton radioButton = new RadioButton(context);
        this.f22484a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i15 = i10 | 16;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 20;
        }
        addView(radioButton, w7.x5.d(22, 22.0f, i15, i11, 0.0f, z10 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.f22485b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20797j5, false));
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
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i16 = i13 | 48;
        if (z11) {
            f7 = 23;
        } else {
            f7 = 62;
        }
        float f13 = f7;
        if (z11) {
            f10 = 62;
        } else {
            f10 = 23;
        }
        addView(textView, w7.x5.d(-1, -1.0f, i16, f13, 0.0f, f10, 17.0f));
        TextView textView2 = new TextView(context);
        this.f22486c = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20942r5, false));
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        textView2.setGravity(i14 | 16);
        boolean z12 = LocaleController.isRTL;
        int i17 = (z12 ? 5 : 3) | 48;
        if (z12) {
            f11 = 23;
        } else {
            f11 = 62;
        }
        float f14 = f11;
        if (z12) {
            f12 = 62;
        } else {
            f12 = 23;
        }
        addView(textView2, w7.x5.d(-1, -1.0f, i17, f14, 20.0f, f12, 0.0f));
    }

    public LocaleController.LocaleInfo getCurrentLocale() {
        return this.f22487e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.d) {
            boolean z10 = LocaleController.isRTL;
            int i11 = this.f22488f;
            if (z10) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20812k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.d ? 1 : 0), 1073741824));
    }
}
