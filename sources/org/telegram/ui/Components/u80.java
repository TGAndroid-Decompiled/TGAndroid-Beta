package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class u80 extends ReplacementSpan {

    public final int f33013a;

    public View f33014b;

    public final t80 f33015c;
    public final int d;

    public float f33016e;

    public float f33017f;
    public float h;

    public boolean f33018n;

    public u80(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer numValueOf = Integer.valueOf(i10);
        t80 t80Var = this.f33015c;
        t80Var.f32703o = numValueOf;
        t80Var.f32704p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        View view;
        boolean z10 = this.f33018n;
        int measuredWidth = this.f33013a;
        if (z10 && (view = this.f33014b) != null && view.getMeasuredWidth() > 0) {
            measuredWidth = ((this.f33014b.getMeasuredWidth() - this.f33014b.getPaddingLeft()) - this.f33014b.getPaddingRight()) - measuredWidth;
        }
        float f11 = this.f33017f;
        t80 t80Var = this.f33015c;
        if (f11 > 0.0f) {
            float f12 = (i12 + i14) / 2.0f;
            int i15 = (int) f10;
            float f13 = f11 / 2.0f;
            t80Var.setBounds(i15, (int) (f12 - f13), measuredWidth + i15, (int) (f13 + f12));
        } else {
            int i16 = (int) f10;
            float fZ = com.google.android.recaptcha.internal.a.z(1.0f, this.f33016e, org.telegram.messenger.y1.B(2.0f, i14, i12) / 2.0f, i12);
            float f14 = this.d;
            t80Var.setBounds(i16, (int) (fZ + f14), measuredWidth + i16, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.f33016e) * (org.telegram.messenger.y1.B(2.0f, i14, i12) / 2.0f))) + f14));
        }
        t80Var.setAlpha((int) ((paint == null ? 255 : paint.getAlpha()) * this.h));
        t80Var.draw(canvas);
        View view2 = this.f33014b;
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
        t80 t80Var = this.f33015c;
        if (t80Var.f32703o == null && t80Var.f32704p == null) {
            t80Var.e(org.telegram.ui.ActionBar.g6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.g6.l1(0.25f, paint.getColor()));
        }
        boolean z10 = this.f33018n;
        int i12 = this.f33013a;
        return (!z10 || (view = this.f33014b) == null || view.getMeasuredWidth() <= 0) ? i12 : ((this.f33014b.getMeasuredWidth() - this.f33014b.getPaddingLeft()) - this.f33014b.getPaddingRight()) - i12;
    }

    public u80(View view, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f33016e = 1.0f;
        this.f33017f = -1.0f;
        this.h = 1.0f;
        this.f33018n = false;
        this.f33014b = view;
        this.f33013a = i10;
        this.d = i11;
        t80 t80Var = new t80(c6Var);
        this.f33015c = t80Var;
        t80Var.j(4.0f);
    }
}
