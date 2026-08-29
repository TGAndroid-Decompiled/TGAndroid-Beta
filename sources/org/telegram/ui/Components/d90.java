package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d90 extends ReplacementSpan {
    public final int f27717a;
    public View f27718b;
    public final c90 f27719c;
    public final int d;
    public float f27720e;
    public float f27721f;
    public float h;
    public boolean f27722n;

    public d90(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        c90 c90Var = this.f27719c;
        c90Var.f27392o = valueOf;
        c90Var.f27393p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f27722n;
        int i15 = this.f27717a;
        if (z10 && (view = this.f27718b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f27718b.getMeasuredWidth() - this.f27718b.getPaddingLeft()) - this.f27718b.getPaddingRight()) - i15;
        }
        float f10 = this.f27721f;
        c90 c90Var = this.f27719c;
        if (f10 > 0.0f) {
            float f11 = (i12 + i14) / 2.0f;
            int i16 = (int) f9;
            float f12 = f10 / 2.0f;
            c90Var.setBounds(i16, (int) (f11 - f12), i15 + i16, (int) (f12 + f11));
        } else {
            int i17 = (int) f9;
            float z11 = com.google.android.recaptcha.internal.a.z(1.0f, this.f27720e, org.telegram.messenger.x3.B(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            c90Var.setBounds(i17, (int) (z11 + f13), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.f27720e) * (org.telegram.messenger.x3.B(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        c90Var.setAlpha((int) (alpha * this.h));
        c90Var.draw(canvas);
        View view2 = this.f27718b;
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
        c90 c90Var = this.f27719c;
        if (c90Var.f27392o == null && c90Var.f27393p == null) {
            c90Var.e(org.telegram.ui.ActionBar.g6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.g6.l1(0.25f, paint.getColor()));
        }
        boolean z10 = this.f27722n;
        int i12 = this.f27717a;
        if (z10 && (view = this.f27718b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f27718b.getMeasuredWidth() - this.f27718b.getPaddingLeft()) - this.f27718b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public d90(View view, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f27720e = 1.0f;
        this.f27721f = -1.0f;
        this.h = 1.0f;
        this.f27722n = false;
        this.f27718b = view;
        this.f27717a = i10;
        this.d = i11;
        c90 c90Var = new c90(c6Var);
        this.f27719c = c90Var;
        c90Var.j(4.0f);
    }
}
