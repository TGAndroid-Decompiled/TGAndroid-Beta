package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
public final class r80 extends ReplacementSpan {
    public final int f39114a;
    public View f39115b;
    public final q80 f39116c;
    public final int d;
    public float f39117e;
    public float f39118f;
    public float h;
    public boolean f39119n;
    public boolean f39120r;

    public r80(int i7, View view) {
        this(view, i7, org.telegram.messenger.g0.L(2.0f), null);
    }

    public final void a(int i7, int i10) {
        this.f39120r = false;
        Integer valueOf = Integer.valueOf(i7);
        q80 q80Var = this.f39116c;
        q80Var.f38824o = valueOf;
        q80Var.f38825p = Integer.valueOf(i10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f39119n;
        int i14 = this.f39114a;
        if (z10 && (view = this.f39115b) != null && view.getMeasuredWidth() > 0) {
            i14 = ((this.f39115b.getMeasuredWidth() - this.f39115b.getPaddingLeft()) - this.f39115b.getPaddingRight()) - i14;
        }
        float f11 = this.f39118f;
        int i15 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        q80 q80Var = this.f39116c;
        if (i15 > 0) {
            float f12 = (i11 + i13) / 2.0f;
            int i16 = (int) f10;
            float f13 = f11 / 2.0f;
            q80Var.setBounds(i16, (int) (f12 - f13), i14 + i16, (int) (f13 + f12));
        } else {
            int i17 = (int) f10;
            float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f39117e, org.telegram.messenger.f3.z(2.0f, i13, i11) / 2.0f, i11);
            float f14 = this.d;
            q80Var.setBounds(i17, (int) (z11 + f14), i14 + i17, (int) (((i13 - org.telegram.messenger.g0.L(2.0f)) - ((1.0f - this.f39117e) * (org.telegram.messenger.f3.z(2.0f, i13, i11) / 2.0f))) + f14));
        }
        if (this.f39120r && paint != null) {
            int color = paint.getColor();
            q80Var.f(org.telegram.ui.ActionBar.m6.r1(0.1f, color), org.telegram.ui.ActionBar.m6.r1(0.25f, color));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        q80Var.setAlpha((int) (alpha * this.h));
        q80Var.draw(canvas);
        View view2 = this.f39115b;
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
        boolean z10 = this.f39120r;
        q80 q80Var = this.f39116c;
        if (z10 || (q80Var.f38824o == null && q80Var.f38825p == null)) {
            this.f39120r = true;
            int color = paint.getColor();
            q80Var.f(org.telegram.ui.ActionBar.m6.r1(0.1f, color), org.telegram.ui.ActionBar.m6.r1(0.25f, color));
        }
        boolean z11 = this.f39119n;
        int i11 = this.f39114a;
        if (z11 && (view = this.f39115b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f39115b.getMeasuredWidth() - this.f39115b.getPaddingLeft()) - this.f39115b.getPaddingRight()) - i11;
        }
        return i11;
    }

    public r80(View view, int i7, int i10, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f39117e = 1.0f;
        this.f39118f = -1.0f;
        this.h = 1.0f;
        this.f39119n = false;
        this.f39115b = view;
        this.f39114a = i7;
        this.d = i10;
        q80 q80Var = new q80(h6Var);
        this.f39116c = q80Var;
        q80Var.k(4.0f);
    }
}
