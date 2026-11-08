package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
public final class b80 extends ReplacementSpan {
    public final int f32124a;
    public View f32125b;
    public final a80 f32126c;
    public final int d;
    public float f32127e;
    public float f32128f;
    public float h;
    public boolean f32129n;
    public boolean f32130r;

    public b80(int i7, View view) {
        this(view, i7, org.telegram.messenger.g0.L(2.0f), null);
    }

    public final void a(int i7, int i10) {
        this.f32130r = false;
        Integer valueOf = Integer.valueOf(i7);
        a80 a80Var = this.f32126c;
        a80Var.f31743o = valueOf;
        a80Var.f31744p = Integer.valueOf(i10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int alpha;
        View view;
        boolean z9 = this.f32129n;
        int i14 = this.f32124a;
        if (z9 && (view = this.f32125b) != null && view.getMeasuredWidth() > 0) {
            i14 = ((this.f32125b.getMeasuredWidth() - this.f32125b.getPaddingLeft()) - this.f32125b.getPaddingRight()) - i14;
        }
        float f11 = this.f32128f;
        int i15 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        a80 a80Var = this.f32126c;
        if (i15 > 0) {
            float f12 = (i11 + i13) / 2.0f;
            int i16 = (int) f10;
            float f13 = f11 / 2.0f;
            a80Var.setBounds(i16, (int) (f12 - f13), i14 + i16, (int) (f13 + f12));
        } else {
            int i17 = (int) f10;
            float z10 = com.google.android.recaptcha.internal.a.z(1.0f, this.f32127e, org.telegram.messenger.k5.z(2.0f, i13, i11) / 2.0f, i11);
            float f14 = this.d;
            a80Var.setBounds(i17, (int) (z10 + f14), i14 + i17, (int) (((i13 - org.telegram.messenger.g0.L(2.0f)) - ((1.0f - this.f32127e) * (org.telegram.messenger.k5.z(2.0f, i13, i11) / 2.0f))) + f14));
        }
        if (this.f32130r && paint != null) {
            int color = paint.getColor();
            a80Var.f(org.telegram.ui.ActionBar.k6.r1(0.1f, color), org.telegram.ui.ActionBar.k6.r1(0.25f, color));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        a80Var.setAlpha((int) (alpha * this.h));
        a80Var.draw(canvas);
        View view2 = this.f32125b;
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
        boolean z9 = this.f32130r;
        a80 a80Var = this.f32126c;
        if (z9 || (a80Var.f31743o == null && a80Var.f31744p == null)) {
            this.f32130r = true;
            int color = paint.getColor();
            a80Var.f(org.telegram.ui.ActionBar.k6.r1(0.1f, color), org.telegram.ui.ActionBar.k6.r1(0.25f, color));
        }
        boolean z10 = this.f32129n;
        int i11 = this.f32124a;
        if (z10 && (view = this.f32125b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f32125b.getMeasuredWidth() - this.f32125b.getPaddingLeft()) - this.f32125b.getPaddingRight()) - i11;
        }
        return i11;
    }

    public b80(View view, int i7, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f32127e = 1.0f;
        this.f32128f = -1.0f;
        this.h = 1.0f;
        this.f32129n = false;
        this.f32125b = view;
        this.f32124a = i7;
        this.d = i10;
        a80 a80Var = new a80(f6Var);
        this.f32126c = a80Var;
        a80Var.k(4.0f);
    }
}
