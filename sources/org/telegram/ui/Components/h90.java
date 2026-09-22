package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h90 extends ReplacementSpan {
    public final int f24640a;
    public View f24641b;
    public final g90 f24642c;
    public final int d;
    public float e;
    public float f24643f;
    public float h;
    public boolean f24644n;

    public h90(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        g90 g90Var = this.f24642c;
        g90Var.f24269o = valueOf;
        g90Var.f24270p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f24644n;
        int i15 = this.f24640a;
        if (z10 && (view = this.f24641b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f24641b.getMeasuredWidth() - this.f24641b.getPaddingLeft()) - this.f24641b.getPaddingRight()) - i15;
        }
        float f10 = this.f24643f;
        g90 g90Var = this.f24642c;
        if (f10 > 0.0f) {
            float f11 = (i12 + i14) / 2.0f;
            int i16 = (int) f7;
            float f12 = f10 / 2.0f;
            g90Var.setBounds(i16, (int) (f11 - f12), i15 + i16, (int) (f12 + f11));
        } else {
            int i17 = (int) f7;
            float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, this.e, org.telegram.messenger.y0.B(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            g90Var.setBounds(i17, (int) (z11 + f13), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.y0.B(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        g90Var.setAlpha((int) (alpha * this.h));
        g90Var.draw(canvas);
        View view2 = this.f24641b;
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
        g90 g90Var = this.f24642c;
        if (g90Var.f24269o == null && g90Var.f24270p == null) {
            g90Var.e(org.telegram.ui.ActionBar.i6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.i6.l1(0.25f, paint.getColor()));
        }
        boolean z10 = this.f24644n;
        int i12 = this.f24640a;
        if (z10 && (view = this.f24641b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f24641b.getMeasuredWidth() - this.f24641b.getPaddingLeft()) - this.f24641b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public h90(View view, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = 1.0f;
        this.f24643f = -1.0f;
        this.h = 1.0f;
        this.f24644n = false;
        this.f24641b = view;
        this.f24640a = i10;
        this.d = i11;
        g90 g90Var = new g90(e6Var);
        this.f24642c = g90Var;
        g90Var.j(4.0f);
    }
}
