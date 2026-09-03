package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l90 extends ReplacementSpan {
    public final int f28697a;
    public View f28698b;
    public final k90 f28699c;
    public final int d;
    public float f28700e;
    public float f28701f;
    public float h;
    public boolean f28702n;

    public l90(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        k90 k90Var = this.f28699c;
        k90Var.f28362o = valueOf;
        k90Var.f28363p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z4 = this.f28702n;
        int i15 = this.f28697a;
        if (z4 && (view = this.f28698b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f28698b.getMeasuredWidth() - this.f28698b.getPaddingLeft()) - this.f28698b.getPaddingRight()) - i15;
        }
        float f11 = this.f28701f;
        k90 k90Var = this.f28699c;
        if (f11 > 0.0f) {
            float f12 = (i12 + i14) / 2.0f;
            int i16 = (int) f10;
            float f13 = f11 / 2.0f;
            k90Var.setBounds(i16, (int) (f12 - f13), i15 + i16, (int) (f13 + f12));
        } else {
            int i17 = (int) f10;
            float w10 = e2.c.w(1.0f, this.f28700e, org.telegram.messenger.y3.B(2.0f, i14, i12) / 2.0f, i12);
            float f14 = this.d;
            k90Var.setBounds(i17, (int) (w10 + f14), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.f28700e) * (org.telegram.messenger.y3.B(2.0f, i14, i12) / 2.0f))) + f14));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        k90Var.setAlpha((int) (alpha * this.h));
        k90Var.draw(canvas);
        View view2 = this.f28698b;
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
        k90 k90Var = this.f28699c;
        if (k90Var.f28362o == null && k90Var.f28363p == null) {
            k90Var.e(org.telegram.ui.ActionBar.k6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.k6.l1(0.25f, paint.getColor()));
        }
        boolean z4 = this.f28702n;
        int i12 = this.f28697a;
        if (z4 && (view = this.f28698b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f28698b.getMeasuredWidth() - this.f28698b.getPaddingLeft()) - this.f28698b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public l90(View view, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f28700e = 1.0f;
        this.f28701f = -1.0f;
        this.h = 1.0f;
        this.f28702n = false;
        this.f28698b = view;
        this.f28697a = i10;
        this.d = i11;
        k90 k90Var = new k90(g6Var);
        this.f28699c = k90Var;
        k90Var.j(4.0f);
    }
}
