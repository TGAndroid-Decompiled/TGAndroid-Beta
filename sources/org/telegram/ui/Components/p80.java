package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
public final class p80 extends ReplacementSpan {
    public final int f38315a;
    public View f38316b;
    public final o80 f38317c;
    public final int d;
    public float f38318e;
    public float f38319f;
    public float h;
    public boolean f38320n;
    public boolean f38321r;

    public p80(int i7, View view) {
        this(view, i7, org.telegram.messenger.g0.L(2.0f), null);
    }

    public final void a(int i7, int i10) {
        this.f38321r = false;
        Integer valueOf = Integer.valueOf(i7);
        o80 o80Var = this.f38317c;
        o80Var.f38024o = valueOf;
        o80Var.f38025p = Integer.valueOf(i10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f38320n;
        int i14 = this.f38315a;
        if (z10 && (view = this.f38316b) != null && view.getMeasuredWidth() > 0) {
            i14 = ((this.f38316b.getMeasuredWidth() - this.f38316b.getPaddingLeft()) - this.f38316b.getPaddingRight()) - i14;
        }
        float f11 = this.f38319f;
        int i15 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        o80 o80Var = this.f38317c;
        if (i15 > 0) {
            float f12 = (i11 + i13) / 2.0f;
            int i16 = (int) f10;
            float f13 = f11 / 2.0f;
            o80Var.setBounds(i16, (int) (f12 - f13), i14 + i16, (int) (f13 + f12));
        } else {
            int i17 = (int) f10;
            float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f38318e, org.telegram.messenger.f3.z(2.0f, i13, i11) / 2.0f, i11);
            float f14 = this.d;
            o80Var.setBounds(i17, (int) (z11 + f14), i14 + i17, (int) (((i13 - org.telegram.messenger.g0.L(2.0f)) - ((1.0f - this.f38318e) * (org.telegram.messenger.f3.z(2.0f, i13, i11) / 2.0f))) + f14));
        }
        if (this.f38321r && paint != null) {
            int color = paint.getColor();
            o80Var.f(org.telegram.ui.ActionBar.n6.r1(0.1f, color), org.telegram.ui.ActionBar.n6.r1(0.25f, color));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        o80Var.setAlpha((int) (alpha * this.h));
        o80Var.draw(canvas);
        View view2 = this.f38316b;
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
        boolean z10 = this.f38321r;
        o80 o80Var = this.f38317c;
        if (z10 || (o80Var.f38024o == null && o80Var.f38025p == null)) {
            this.f38321r = true;
            int color = paint.getColor();
            o80Var.f(org.telegram.ui.ActionBar.n6.r1(0.1f, color), org.telegram.ui.ActionBar.n6.r1(0.25f, color));
        }
        boolean z11 = this.f38320n;
        int i11 = this.f38315a;
        if (z11 && (view = this.f38316b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f38316b.getMeasuredWidth() - this.f38316b.getPaddingLeft()) - this.f38316b.getPaddingRight()) - i11;
        }
        return i11;
    }

    public p80(View view, int i7, int i10, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f38318e = 1.0f;
        this.f38319f = -1.0f;
        this.h = 1.0f;
        this.f38320n = false;
        this.f38316b = view;
        this.f38315a = i7;
        this.d = i10;
        o80 o80Var = new o80(i6Var);
        this.f38317c = o80Var;
        o80Var.k(4.0f);
    }
}
