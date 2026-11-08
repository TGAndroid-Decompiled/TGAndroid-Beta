package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.fd;
import org.telegram.messenger.id;
import org.telegram.ui.Components.RadioButton;
public final class r4 extends FrameLayout {
    public final RadioButton f30184a;
    public final TextView f30185b;
    public final TextView f30186c;
    public boolean d;
    public fd f30187e;
    public final int f30188f;

    public r4(Context context) {
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
        this.f30188f = 62;
        if (org.telegram.ui.ActionBar.k6.f27975k0 == null) {
            org.telegram.ui.ActionBar.k6.R(context);
        }
        setWillNotDraw(false);
        RadioButton radioButton = new RadioButton(context);
        this.f30184a = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.r6.P(radioButton, org.telegram.ui.ActionBar.k6.D5, org.telegram.ui.ActionBar.k6.E5, null);
        boolean z9 = id.f23157a0;
        if (z9) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i14 = i7 | 16;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 20;
        }
        addView(radioButton, c8.ha.d(22, 22.0f, i14, i10, 0.0f, z9 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.f30185b = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27960j5, null);
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (id.f23157a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        boolean z10 = id.f23157a0;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i15 = i12 | 48;
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
        addView(textView, c8.ha.d(-1, -1.0f, i15, f14, 0.0f, f11, 17.0f));
        TextView textView2 = new TextView(context);
        this.f30186c = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28110r5, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        if (id.f23157a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView2.setGravity(i13 | 16);
        boolean z11 = id.f23157a0;
        int i16 = (z11 ? 5 : 3) | 48;
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
        addView(textView2, c8.ha.d(-1, -1.0f, i16, f15, 20.0f, f13, 0.0f));
    }

    public fd getCurrentLocale() {
        return this.f30187e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.d) {
            boolean z9 = id.f23157a0;
            int i10 = this.f30188f;
            if (z9) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(i10 - 3);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (id.f23157a0) {
                i7 = org.telegram.messenger.g0.L(i10 - 3);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27975k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f) + (this.d ? 1 : 0), 1073741824));
    }
}
