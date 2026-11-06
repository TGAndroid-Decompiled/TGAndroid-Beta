package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
public final class b80 extends ReplacementSpan {
    public final int f32069a;
    public View f32070b;
    public final a80 f32071c;
    public final int d;
    public float f32072e;
    public float f32073f;
    public float h;
    public boolean f32074n;
    public boolean f32075r;

    public b80(int i7, View view) {
        this(view, i7, org.telegram.messenger.g0.L(2.0f), null);
    }

    public final void a(int i7, int i10) {
        this.f32075r = false;
        Integer valueOf = Integer.valueOf(i7);
        a80 a80Var = this.f32071c;
        a80Var.f31738o = valueOf;
        a80Var.f31739p = Integer.valueOf(i10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int alpha;
        View view;
        boolean z9 = this.f32074n;
        int i14 = this.f32069a;
        if (z9 && (view = this.f32070b) != null && view.getMeasuredWidth() > 0) {
            i14 = ((this.f32070b.getMeasuredWidth() - this.f32070b.getPaddingLeft()) - this.f32070b.getPaddingRight()) - i14;
        }
        float f11 = this.f32073f;
        int i15 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        a80 a80Var = this.f32071c;
        if (i15 > 0) {
            float f12 = (i11 + i13) / 2.0f;
            int i16 = (int) f10;
            float f13 = f11 / 2.0f;
            a80Var.setBounds(i16, (int) (f12 - f13), i14 + i16, (int) (f13 + f12));
        } else {
            int i17 = (int) f10;
            float z10 = com.google.android.recaptcha.internal.a.z(1.0f, this.f32072e, org.telegram.messenger.k5.z(2.0f, i13, i11) / 2.0f, i11);
            float f14 = this.d;
            a80Var.setBounds(i17, (int) (z10 + f14), i14 + i17, (int) (((i13 - org.telegram.messenger.g0.L(2.0f)) - ((1.0f - this.f32072e) * (org.telegram.messenger.k5.z(2.0f, i13, i11) / 2.0f))) + f14));
        }
        if (this.f32075r && paint != null) {
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
        View view2 = this.f32070b;
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
        boolean z9 = this.f32075r;
        a80 a80Var = this.f32071c;
        if (z9 || (a80Var.f31738o == null && a80Var.f31739p == null)) {
            this.f32075r = true;
            int color = paint.getColor();
            a80Var.f(org.telegram.ui.ActionBar.k6.r1(0.1f, color), org.telegram.ui.ActionBar.k6.r1(0.25f, color));
        }
        boolean z10 = this.f32074n;
        int i11 = this.f32069a;
        if (z10 && (view = this.f32070b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f32070b.getMeasuredWidth() - this.f32070b.getPaddingLeft()) - this.f32070b.getPaddingRight()) - i11;
        }
        return i11;
    }

    public b80(View view, int i7, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f32072e = 1.0f;
        this.f32073f = -1.0f;
        this.h = 1.0f;
        this.f32074n = false;
        this.f32070b = view;
        this.f32069a = i7;
        this.d = i10;
        a80 a80Var = new a80(f6Var);
        this.f32071c = a80Var;
        a80Var.k(4.0f);
    }
}
