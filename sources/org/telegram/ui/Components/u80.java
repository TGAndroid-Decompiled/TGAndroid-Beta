package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
public final class u80 extends ReplacementSpan {
    public final int f30866a;
    public View f30867b;
    public final t80 f30868c;
    public final int d;
    public float e;
    public float f30869f;
    public float h;
    public boolean f30870n;
    public boolean f30871r;

    public u80(int i10, View view) {
        this(view, i10, org.telegram.messenger.i0.L(2.0f), null);
    }

    public final void a(int i10, int i11) {
        this.f30871r = false;
        Integer valueOf = Integer.valueOf(i10);
        t80 t80Var = this.f30868c;
        t80Var.f30512o = valueOf;
        t80Var.f30513p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f30870n;
        int i15 = this.f30866a;
        if (z10 && (view = this.f30867b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f30867b.getMeasuredWidth() - this.f30867b.getPaddingLeft()) - this.f30867b.getPaddingRight()) - i15;
        }
        float f10 = this.f30869f;
        int i16 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        t80 t80Var = this.f30868c;
        if (i16 > 0) {
            float f11 = (i12 + i14) / 2.0f;
            int i17 = (int) f7;
            float f12 = f10 / 2.0f;
            t80Var.setBounds(i17, (int) (f11 - f12), i15 + i17, (int) (f12 + f11));
        } else {
            int i18 = (int) f7;
            float z11 = c3.i0.z(1.0f, this.e, org.telegram.messenger.m5.z(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            t80Var.setBounds(i18, (int) (z11 + f13), i15 + i18, (int) (((i14 - org.telegram.messenger.i0.L(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.m5.z(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (this.f30871r && paint != null) {
            int color = paint.getColor();
            t80Var.f(org.telegram.ui.ActionBar.t6.r1(0.1f, color), org.telegram.ui.ActionBar.t6.r1(0.25f, color));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        t80Var.setAlpha((int) (alpha * this.h));
        t80Var.draw(canvas);
        View view2 = this.f30867b;
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
        boolean z10 = this.f30871r;
        t80 t80Var = this.f30868c;
        if (z10 || (t80Var.f30512o == null && t80Var.f30513p == null)) {
            this.f30871r = true;
            int color = paint.getColor();
            t80Var.f(org.telegram.ui.ActionBar.t6.r1(0.1f, color), org.telegram.ui.ActionBar.t6.r1(0.25f, color));
        }
        boolean z11 = this.f30870n;
        int i12 = this.f30866a;
        if (z11 && (view = this.f30867b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f30867b.getMeasuredWidth() - this.f30867b.getPaddingLeft()) - this.f30867b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public u80(View view, int i10, int i11, org.telegram.ui.ActionBar.p6 p6Var) {
        this.e = 1.0f;
        this.f30869f = -1.0f;
        this.h = 1.0f;
        this.f30870n = false;
        this.f30867b = view;
        this.f30866a = i10;
        this.d = i11;
        t80 t80Var = new t80(p6Var);
        this.f30868c = t80Var;
        t80Var.k(4.0f);
    }
}
