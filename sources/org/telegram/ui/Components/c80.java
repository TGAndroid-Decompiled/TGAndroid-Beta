package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
public final class c80 extends ReplacementSpan {
    public final int f32583a;
    public View f32584b;
    public final b80 f32585c;
    public final int d;
    public float f32586e;
    public float f32587f;
    public float h;
    public boolean f32588n;
    public boolean f32589r;

    public c80(int i7, View view) {
        this(view, i7, org.telegram.messenger.g0.L(2.0f), null);
    }

    public final void a(int i7, int i10) {
        this.f32589r = false;
        Integer valueOf = Integer.valueOf(i7);
        b80 b80Var = this.f32585c;
        b80Var.f32178o = valueOf;
        b80Var.f32179p = Integer.valueOf(i10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int alpha;
        View view;
        boolean z9 = this.f32588n;
        int i14 = this.f32583a;
        if (z9 && (view = this.f32584b) != null && view.getMeasuredWidth() > 0) {
            i14 = ((this.f32584b.getMeasuredWidth() - this.f32584b.getPaddingLeft()) - this.f32584b.getPaddingRight()) - i14;
        }
        float f11 = this.f32587f;
        int i15 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        b80 b80Var = this.f32585c;
        if (i15 > 0) {
            float f12 = (i11 + i13) / 2.0f;
            int i16 = (int) f10;
            float f13 = f11 / 2.0f;
            b80Var.setBounds(i16, (int) (f12 - f13), i14 + i16, (int) (f13 + f12));
        } else {
            int i17 = (int) f10;
            float z10 = com.google.android.recaptcha.internal.a.z(1.0f, this.f32586e, org.telegram.messenger.k5.z(2.0f, i13, i11) / 2.0f, i11);
            float f14 = this.d;
            b80Var.setBounds(i17, (int) (z10 + f14), i14 + i17, (int) (((i13 - org.telegram.messenger.g0.L(2.0f)) - ((1.0f - this.f32586e) * (org.telegram.messenger.k5.z(2.0f, i13, i11) / 2.0f))) + f14));
        }
        if (this.f32589r && paint != null) {
            int color = paint.getColor();
            b80Var.f(org.telegram.ui.ActionBar.l6.r1(0.1f, color), org.telegram.ui.ActionBar.l6.r1(0.25f, color));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        b80Var.setAlpha((int) (alpha * this.h));
        b80Var.draw(canvas);
        View view2 = this.f32584b;
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        View view;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = (int) fontMetrics.ascent;
            fontMetricsInt.bottom = (int) fontMetrics.bottom;
            fontMetricsInt.descent = (int) fontMetrics.descent;
            fontMetricsInt.leading = (int) fontMetrics.leading;
            fontMetricsInt.top = (int) fontMetrics.top;
        }
        boolean z9 = this.f32589r;
        b80 b80Var = this.f32585c;
        if (z9 || (b80Var.f32178o == null && b80Var.f32179p == null)) {
            this.f32589r = true;
            int color = paint.getColor();
            b80Var.f(org.telegram.ui.ActionBar.l6.r1(0.1f, color), org.telegram.ui.ActionBar.l6.r1(0.25f, color));
        }
        boolean z10 = this.f32588n;
        int i11 = this.f32583a;
        if (z10 && (view = this.f32584b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f32584b.getMeasuredWidth() - this.f32584b.getPaddingLeft()) - this.f32584b.getPaddingRight()) - i11;
        }
        return i11;
    }

    public c80(View view, int i7, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f32586e = 1.0f;
        this.f32587f = -1.0f;
        this.h = 1.0f;
        this.f32588n = false;
        this.f32584b = view;
        this.f32583a = i7;
        this.d = i10;
        b80 b80Var = new b80(g6Var);
        this.f32585c = b80Var;
        b80Var.k(4.0f);
    }
}
