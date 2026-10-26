package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ea0 extends ReplacementSpan {
    public final int f27789a;
    public View f27790b;
    public final da0 f27791c;
    public final int d;
    public float e;
    public float f27792f;
    public float h;
    public boolean f27793n;
    public boolean f27794r;

    public ea0(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        this.f27794r = false;
        Integer valueOf = Integer.valueOf(i10);
        da0 da0Var = this.f27791c;
        da0Var.f27472o = valueOf;
        da0Var.f27473p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f27793n;
        int i15 = this.f27789a;
        if (z10 && (view = this.f27790b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f27790b.getMeasuredWidth() - this.f27790b.getPaddingLeft()) - this.f27790b.getPaddingRight()) - i15;
        }
        float f10 = this.f27792f;
        int i16 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        da0 da0Var = this.f27791c;
        if (i16 > 0) {
            float f11 = (i12 + i14) / 2.0f;
            int i17 = (int) f7;
            float f12 = f10 / 2.0f;
            da0Var.setBounds(i17, (int) (f11 - f12), i15 + i17, (int) (f12 + f11));
        } else {
            int i18 = (int) f7;
            float z11 = c3.h0.z(1.0f, this.e, org.telegram.messenger.t.C(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            da0Var.setBounds(i18, (int) (z11 + f13), i15 + i18, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.t.C(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (this.f27794r && paint != null) {
            int color = paint.getColor();
            da0Var.f(org.telegram.ui.ActionBar.y6.o1(0.1f, color), org.telegram.ui.ActionBar.y6.o1(0.25f, color));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        da0Var.setAlpha((int) (alpha * this.h));
        da0Var.draw(canvas);
        View view2 = this.f27790b;
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
        boolean z10 = this.f27794r;
        da0 da0Var = this.f27791c;
        if (z10 || (da0Var.f27472o == null && da0Var.f27473p == null)) {
            this.f27794r = true;
            int color = paint.getColor();
            da0Var.f(org.telegram.ui.ActionBar.y6.o1(0.1f, color), org.telegram.ui.ActionBar.y6.o1(0.25f, color));
        }
        boolean z11 = this.f27793n;
        int i12 = this.f27789a;
        if (z11 && (view = this.f27790b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f27790b.getMeasuredWidth() - this.f27790b.getPaddingLeft()) - this.f27790b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public ea0(View view, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        this.e = 1.0f;
        this.f27792f = -1.0f;
        this.h = 1.0f;
        this.f27793n = false;
        this.f27790b = view;
        this.f27789a = i10;
        this.d = i11;
        da0 da0Var = new da0(u6Var);
        this.f27791c = da0Var;
        da0Var.k(4.0f);
    }
}
