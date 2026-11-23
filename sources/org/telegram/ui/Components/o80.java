package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
public final class o80 extends ReplacementSpan {
    public final int f38062a;
    public View f38063b;
    public final n80 f38064c;
    public final int d;
    public float f38065e;
    public float f38066f;
    public float h;
    public boolean f38067n;
    public boolean f38068r;

    public o80(int i7, View view) {
        this(view, i7, org.telegram.messenger.g0.L(2.0f), null);
    }

    public final void a(int i7, int i10) {
        this.f38068r = false;
        Integer valueOf = Integer.valueOf(i7);
        n80 n80Var = this.f38064c;
        n80Var.f37721o = valueOf;
        n80Var.f37722p = Integer.valueOf(i10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f38067n;
        int i14 = this.f38062a;
        if (z10 && (view = this.f38063b) != null && view.getMeasuredWidth() > 0) {
            i14 = ((this.f38063b.getMeasuredWidth() - this.f38063b.getPaddingLeft()) - this.f38063b.getPaddingRight()) - i14;
        }
        float f11 = this.f38066f;
        int i15 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        n80 n80Var = this.f38064c;
        if (i15 > 0) {
            float f12 = (i11 + i13) / 2.0f;
            int i16 = (int) f10;
            float f13 = f11 / 2.0f;
            n80Var.setBounds(i16, (int) (f12 - f13), i14 + i16, (int) (f13 + f12));
        } else {
            int i17 = (int) f10;
            float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f38065e, org.telegram.messenger.f3.z(2.0f, i13, i11) / 2.0f, i11);
            float f14 = this.d;
            n80Var.setBounds(i17, (int) (z11 + f14), i14 + i17, (int) (((i13 - org.telegram.messenger.g0.L(2.0f)) - ((1.0f - this.f38065e) * (org.telegram.messenger.f3.z(2.0f, i13, i11) / 2.0f))) + f14));
        }
        if (this.f38068r && paint != null) {
            int color = paint.getColor();
            n80Var.f(org.telegram.ui.ActionBar.n6.r1(0.1f, color), org.telegram.ui.ActionBar.n6.r1(0.25f, color));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        n80Var.setAlpha((int) (alpha * this.h));
        n80Var.draw(canvas);
        View view2 = this.f38063b;
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
        boolean z10 = this.f38068r;
        n80 n80Var = this.f38064c;
        if (z10 || (n80Var.f37721o == null && n80Var.f37722p == null)) {
            this.f38068r = true;
            int color = paint.getColor();
            n80Var.f(org.telegram.ui.ActionBar.n6.r1(0.1f, color), org.telegram.ui.ActionBar.n6.r1(0.25f, color));
        }
        boolean z11 = this.f38067n;
        int i11 = this.f38062a;
        if (z11 && (view = this.f38063b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f38063b.getMeasuredWidth() - this.f38063b.getPaddingLeft()) - this.f38063b.getPaddingRight()) - i11;
        }
        return i11;
    }

    public o80(View view, int i7, int i10, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f38065e = 1.0f;
        this.f38066f = -1.0f;
        this.h = 1.0f;
        this.f38067n = false;
        this.f38063b = view;
        this.f38062a = i7;
        this.d = i10;
        n80 n80Var = new n80(i6Var);
        this.f38064c = n80Var;
        n80Var.k(4.0f);
    }
}
