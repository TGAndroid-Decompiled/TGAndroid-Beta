package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u90 extends ReplacementSpan {
    public final int f28789a;
    public View f28790b;
    public final t90 f28791c;
    public final int d;
    public float e;
    public float f28792f;
    public float h;
    public boolean f28793n;

    public u90(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        t90 t90Var = this.f28791c;
        t90Var.f28512o = valueOf;
        t90Var.f28513p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f28793n;
        int i15 = this.f28789a;
        if (z10 && (view = this.f28790b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f28790b.getMeasuredWidth() - this.f28790b.getPaddingLeft()) - this.f28790b.getPaddingRight()) - i15;
        }
        float f10 = this.f28792f;
        t90 t90Var = this.f28791c;
        if (f10 > 0.0f) {
            float f11 = (i12 + i14) / 2.0f;
            int i16 = (int) f7;
            float f12 = f10 / 2.0f;
            t90Var.setBounds(i16, (int) (f11 - f12), i15 + i16, (int) (f12 + f11));
        } else {
            int i17 = (int) f7;
            float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, this.e, org.telegram.messenger.f0.B(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            t90Var.setBounds(i17, (int) (z11 + f13), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.f0.B(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        t90Var.setAlpha((int) (alpha * this.h));
        t90Var.draw(canvas);
        View view2 = this.f28790b;
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        View view;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = (int) fontMetrics.ascent;
            fontMetricsInt.bottom = (int) fontMetrics.bottom;
            fontMetricsInt.descent = (int) fontMetrics.descent;
            fontMetricsInt.leading = (int) fontMetrics.leading;
            fontMetricsInt.top = (int) fontMetrics.top;
        }
        t90 t90Var = this.f28791c;
        if (t90Var.f28512o == null && t90Var.f28513p == null) {
            t90Var.e(org.telegram.ui.ActionBar.h6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.h6.l1(0.25f, paint.getColor()));
        }
        boolean z10 = this.f28793n;
        int i12 = this.f28789a;
        if (z10 && (view = this.f28790b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f28790b.getMeasuredWidth() - this.f28790b.getPaddingLeft()) - this.f28790b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public u90(View view, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = 1.0f;
        this.f28792f = -1.0f;
        this.h = 1.0f;
        this.f28793n = false;
        this.f28790b = view;
        this.f28789a = i10;
        this.d = i11;
        t90 t90Var = new t90(d6Var);
        this.f28791c = t90Var;
        t90Var.j(4.0f);
    }
}
