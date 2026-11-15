package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
public final class e80 extends ReplacementSpan {
    public final int f34240a;
    public View f34241b;
    public final d80 f34242c;
    public final int d;
    public float f34243e;
    public float f34244f;
    public float h;
    public boolean f34245n;
    public boolean f34246r;

    public e80(int i7, View view) {
        this(view, i7, org.telegram.messenger.g0.L(2.0f), null);
    }

    public final void a(int i7, int i10) {
        this.f34246r = false;
        Integer valueOf = Integer.valueOf(i7);
        d80 d80Var = this.f34242c;
        d80Var.f33878o = valueOf;
        d80Var.f33879p = Integer.valueOf(i10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f34245n;
        int i14 = this.f34240a;
        if (z10 && (view = this.f34241b) != null && view.getMeasuredWidth() > 0) {
            i14 = ((this.f34241b.getMeasuredWidth() - this.f34241b.getPaddingLeft()) - this.f34241b.getPaddingRight()) - i14;
        }
        float f11 = this.f34244f;
        int i15 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        d80 d80Var = this.f34242c;
        if (i15 > 0) {
            float f12 = (i11 + i13) / 2.0f;
            int i16 = (int) f10;
            float f13 = f11 / 2.0f;
            d80Var.setBounds(i16, (int) (f12 - f13), i14 + i16, (int) (f13 + f12));
        } else {
            int i17 = (int) f10;
            float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f34243e, org.telegram.messenger.k5.z(2.0f, i13, i11) / 2.0f, i11);
            float f14 = this.d;
            d80Var.setBounds(i17, (int) (z11 + f14), i14 + i17, (int) (((i13 - org.telegram.messenger.g0.L(2.0f)) - ((1.0f - this.f34243e) * (org.telegram.messenger.k5.z(2.0f, i13, i11) / 2.0f))) + f14));
        }
        if (this.f34246r && paint != null) {
            int color = paint.getColor();
            d80Var.f(org.telegram.ui.ActionBar.j6.r1(0.1f, color), org.telegram.ui.ActionBar.j6.r1(0.25f, color));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        d80Var.setAlpha((int) (alpha * this.h));
        d80Var.draw(canvas);
        View view2 = this.f34241b;
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
        boolean z10 = this.f34246r;
        d80 d80Var = this.f34242c;
        if (z10 || (d80Var.f33878o == null && d80Var.f33879p == null)) {
            this.f34246r = true;
            int color = paint.getColor();
            d80Var.f(org.telegram.ui.ActionBar.j6.r1(0.1f, color), org.telegram.ui.ActionBar.j6.r1(0.25f, color));
        }
        boolean z11 = this.f34245n;
        int i11 = this.f34240a;
        if (z11 && (view = this.f34241b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f34241b.getMeasuredWidth() - this.f34241b.getPaddingLeft()) - this.f34241b.getPaddingRight()) - i11;
        }
        return i11;
    }

    public e80(View view, int i7, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f34243e = 1.0f;
        this.f34244f = -1.0f;
        this.h = 1.0f;
        this.f34245n = false;
        this.f34241b = view;
        this.f34240a = i7;
        this.d = i10;
        d80 d80Var = new d80(e6Var);
        this.f34242c = d80Var;
        d80Var.k(4.0f);
    }
}
