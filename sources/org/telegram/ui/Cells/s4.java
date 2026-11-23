package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.RadioButton;
public final class s4 extends FrameLayout {
    public final RadioButton f31844a;
    public final TextView f31845b;
    public final TextView f31846c;
    public boolean d;
    public cd f31847e;
    public final int f31848f;

    public s4(Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        int i13;
        float f12;
        float f13;
        this.f31848f = 62;
        if (org.telegram.ui.ActionBar.n6.f29574k0 == null) {
            org.telegram.ui.ActionBar.n6.R(context);
        }
        setWillNotDraw(false);
        RadioButton radioButton = new RadioButton(context);
        this.f31844a = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.u6.O(radioButton, org.telegram.ui.ActionBar.n6.D5, org.telegram.ui.ActionBar.n6.E5, null);
        boolean z10 = gd.f24314a0;
        if (z10) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i14 = i7 | 16;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 20;
        }
        addView(radioButton, c8.na.d(22, 22.0f, i14, i10, 0.0f, z10 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.f31845b = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, null);
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (gd.f24314a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        boolean z11 = gd.f24314a0;
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
        addView(textView, c8.na.d(-1, -1.0f, i15, f14, 0.0f, f11, 17.0f));
        TextView textView2 = new TextView(context);
        this.f31846c = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29709r5, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        if (gd.f24314a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView2.setGravity(i13 | 16);
        boolean z12 = gd.f24314a0;
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
        addView(textView2, c8.na.d(-1, -1.0f, i16, f15, 20.0f, f13, 0.0f));
    }

    public cd getCurrentLocale() {
        return this.f31847e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.d) {
            boolean z10 = gd.f24314a0;
            int i10 = this.f31848f;
            if (z10) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(i10 - 3);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (gd.f24314a0) {
                i7 = org.telegram.messenger.g0.L(i10 - 3);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29574k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f) + (this.d ? 1 : 0), 1073741824));
    }
}
