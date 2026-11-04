package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
public final class x70 extends ReplacementSpan {
    public final int f40259a;
    public View f40260b;
    public final w70 f40261c;
    public final int d;
    public float f40262e;
    public float f40263f;
    public float h;
    public boolean f40264n;
    public boolean f40265r;

    public x70(int i3, View view) {
        this(view, i3, org.telegram.messenger.g0.L(2.0f), null);
    }

    public final void a(int i3, int i10) {
        this.f40265r = false;
        Integer valueOf = Integer.valueOf(i3);
        w70 w70Var = this.f40261c;
        w70Var.f39936o = valueOf;
        w70Var.f39937p = Integer.valueOf(i10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f40264n;
        int i14 = this.f40259a;
        if (z10 && (view = this.f40260b) != null && view.getMeasuredWidth() > 0) {
            i14 = ((this.f40260b.getMeasuredWidth() - this.f40260b.getPaddingLeft()) - this.f40260b.getPaddingRight()) - i14;
        }
        float f11 = this.f40263f;
        int i15 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        w70 w70Var = this.f40261c;
        if (i15 > 0) {
            float f12 = (i11 + i13) / 2.0f;
            int i16 = (int) f10;
            float f13 = f11 / 2.0f;
            w70Var.setBounds(i16, (int) (f12 - f13), i14 + i16, (int) (f13 + f12));
        } else {
            int i17 = (int) f10;
            float y9 = com.google.android.recaptcha.internal.a.y(1.0f, this.f40262e, org.telegram.messenger.k5.z(2.0f, i13, i11) / 2.0f, i11);
            float f14 = this.d;
            w70Var.setBounds(i17, (int) (y9 + f14), i14 + i17, (int) (((i13 - org.telegram.messenger.g0.L(2.0f)) - ((1.0f - this.f40262e) * (org.telegram.messenger.k5.z(2.0f, i13, i11) / 2.0f))) + f14));
        }
        if (this.f40265r && paint != null) {
            int color = paint.getColor();
            w70Var.f(org.telegram.ui.ActionBar.k6.r1(0.1f, color), org.telegram.ui.ActionBar.k6.r1(0.25f, color));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        w70Var.setAlpha((int) (alpha * this.h));
        w70Var.draw(canvas);
        View view2 = this.f40260b;
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        View view;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = (int) fontMetrics.ascent;
            fontMetricsInt.bottom = (int) fontMetrics.bottom;
            fontMetricsInt.descent = (int) fontMetrics.descent;
            fontMetricsInt.leading = (int) fontMetrics.leading;
            fontMetricsInt.top = (int) fontMetrics.top;
        }
        boolean z10 = this.f40265r;
        w70 w70Var = this.f40261c;
        if (z10 || (w70Var.f39936o == null && w70Var.f39937p == null)) {
            this.f40265r = true;
            int color = paint.getColor();
            w70Var.f(org.telegram.ui.ActionBar.k6.r1(0.1f, color), org.telegram.ui.ActionBar.k6.r1(0.25f, color));
        }
        boolean z11 = this.f40264n;
        int i11 = this.f40259a;
        if (z11 && (view = this.f40260b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f40260b.getMeasuredWidth() - this.f40260b.getPaddingLeft()) - this.f40260b.getPaddingRight()) - i11;
        }
        return i11;
    }

    public x70(View view, int i3, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f40262e = 1.0f;
        this.f40263f = -1.0f;
        this.h = 1.0f;
        this.f40264n = false;
        this.f40260b = view;
        this.f40259a = i3;
        this.d = i10;
        w70 w70Var = new w70(e6Var);
        this.f40261c = w70Var;
        w70Var.k(4.0f);
    }
}
