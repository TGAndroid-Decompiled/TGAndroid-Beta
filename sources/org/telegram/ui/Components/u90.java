package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u90 extends ReplacementSpan {
    public final int f28790a;
    public View f28791b;
    public final t90 f28792c;
    public final int d;
    public float e;
    public float f28793f;
    public float h;
    public boolean f28794n;

    public u90(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        t90 t90Var = this.f28792c;
        t90Var.f28513o = valueOf;
        t90Var.f28514p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f28794n;
        int i15 = this.f28790a;
        if (z10 && (view = this.f28791b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f28791b.getMeasuredWidth() - this.f28791b.getPaddingLeft()) - this.f28791b.getPaddingRight()) - i15;
        }
        float f10 = this.f28793f;
        t90 t90Var = this.f28792c;
        if (f10 > 0.0f) {
            float f11 = (i12 + i14) / 2.0f;
            int i16 = (int) f7;
            float f12 = f10 / 2.0f;
            t90Var.setBounds(i16, (int) (f11 - f12), i15 + i16, (int) (f12 + f11));
        } else {
            int i17 = (int) f7;
            float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, this.e, org.telegram.messenger.f0.B(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            t90Var.setBounds(i17, (int) (z11 + f13), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.f0.B(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        t90Var.setAlpha((int) (alpha * this.h));
        t90Var.draw(canvas);
        View view2 = this.f28791b;
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
        t90 t90Var = this.f28792c;
        if (t90Var.f28513o == null && t90Var.f28514p == null) {
            t90Var.e(org.telegram.ui.ActionBar.h6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.h6.l1(0.25f, paint.getColor()));
        }
        boolean z10 = this.f28794n;
        int i12 = this.f28790a;
        if (z10 && (view = this.f28791b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f28791b.getMeasuredWidth() - this.f28791b.getPaddingLeft()) - this.f28791b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public u90(View view, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = 1.0f;
        this.f28793f = -1.0f;
        this.h = 1.0f;
        this.f28794n = false;
        this.f28791b = view;
        this.f28790a = i10;
        this.d = i11;
        t90 t90Var = new t90(d6Var);
        this.f28792c = t90Var;
        t90Var.j(4.0f);
    }
}
