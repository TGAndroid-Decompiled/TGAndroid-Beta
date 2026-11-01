package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ad;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.RadioButton;
public final class t4 extends FrameLayout {
    public final RadioButton f23087a;
    public final TextView f23088b;
    public final TextView f23089c;
    public boolean d;
    public ad e;
    public final int f23090f;

    public t4(Context context) {
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
        this.f23090f = 62;
        if (org.telegram.ui.ActionBar.t6.f21053k0 == null) {
            org.telegram.ui.ActionBar.t6.R(context);
        }
        setWillNotDraw(false);
        RadioButton radioButton = new RadioButton(context);
        this.f23087a = radioButton;
        radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
        org.telegram.ui.ActionBar.a7.P(radioButton, org.telegram.ui.ActionBar.t6.D5, org.telegram.ui.ActionBar.t6.E5, null);
        boolean z10 = dd.X;
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
        addView(radioButton, w7.b6.d(22, 22.0f, i15, i11, 0.0f, z10 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.f23088b = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21038j5, null);
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (dd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        boolean z11 = dd.X;
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
        addView(textView, w7.b6.d(-1, -1.0f, i16, f13, 0.0f, f10, 17.0f));
        TextView textView2 = new TextView(context);
        this.f23089c = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21186r5, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        if (dd.X) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        textView2.setGravity(i14 | 16);
        boolean z12 = dd.X;
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
        addView(textView2, w7.b6.d(-1, -1.0f, i17, f14, 20.0f, f12, 0.0f));
    }

    public ad getCurrentLocale() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        if (this.d) {
            boolean z10 = dd.X;
            int i11 = this.f23090f;
            if (z10) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(i11 - 3);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (dd.X) {
                i10 = org.telegram.messenger.i0.L(i11 - 3);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f) + (this.d ? 1 : 0), 1073741824));
    }
}
