package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q80 extends ReplacementSpan {
    public final int f31859a;
    public View f31860b;
    public final p80 f31861c;
    public final int d;
    public float f31862e;
    public float f31863f;
    public float h;
    public boolean f31864n;

    public q80(int i9, View view) {
        this(view, i9, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i9, int i10) {
        Integer valueOf = Integer.valueOf(i9);
        p80 p80Var = this.f31861c;
        p80Var.f31583o = valueOf;
        p80Var.f31584p = Integer.valueOf(i10);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f31864n;
        int i14 = this.f31859a;
        if (z10 && (view = this.f31860b) != null && view.getMeasuredWidth() > 0) {
            i14 = ((this.f31860b.getMeasuredWidth() - this.f31860b.getPaddingLeft()) - this.f31860b.getPaddingRight()) - i14;
        }
        float f11 = this.f31863f;
        p80 p80Var = this.f31861c;
        if (f11 > 0.0f) {
            float f12 = (i11 + i13) / 2.0f;
            int i15 = (int) f10;
            float f13 = f11 / 2.0f;
            p80Var.setBounds(i15, (int) (f12 - f13), i14 + i15, (int) (f13 + f12));
        } else {
            int i16 = (int) f10;
            float z11 = e2.c.z(1.0f, this.f31862e, org.telegram.messenger.l0.B(2.0f, i13, i11) / 2.0f, i11);
            float f14 = this.d;
            p80Var.setBounds(i16, (int) (z11 + f14), i14 + i16, (int) (((i13 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.f31862e) * (org.telegram.messenger.l0.B(2.0f, i13, i11) / 2.0f))) + f14));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        p80Var.setAlpha((int) (alpha * this.h));
        p80Var.draw(canvas);
        View view2 = this.f31860b;
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        View view;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = (int) fontMetrics.ascent;
            fontMetricsInt.bottom = (int) fontMetrics.bottom;
            fontMetricsInt.descent = (int) fontMetrics.descent;
            fontMetricsInt.leading = (int) fontMetrics.leading;
            fontMetricsInt.top = (int) fontMetrics.top;
        }
        p80 p80Var = this.f31861c;
        if (p80Var.f31583o == null && p80Var.f31584p == null) {
            p80Var.e(org.telegram.ui.ActionBar.f6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.f6.l1(0.25f, paint.getColor()));
        }
        boolean z10 = this.f31864n;
        int i11 = this.f31859a;
        if (z10 && (view = this.f31860b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f31860b.getMeasuredWidth() - this.f31860b.getPaddingLeft()) - this.f31860b.getPaddingRight()) - i11;
        }
        return i11;
    }

    public q80(View view, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f31862e = 1.0f;
        this.f31863f = -1.0f;
        this.h = 1.0f;
        this.f31864n = false;
        this.f31860b = view;
        this.f31859a = i9;
        this.d = i10;
        p80 p80Var = new p80(b6Var);
        this.f31861c = p80Var;
        p80Var.j(4.0f);
    }
}
