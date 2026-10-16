package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ia0 extends ReplacementSpan {
    public final int f25616a;
    public View f25617b;
    public final ha0 f25618c;
    public final int d;
    public float e;
    public float f25619f;
    public float h;
    public boolean f25620n;

    public ia0(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        ha0 ha0Var = this.f25618c;
        ha0Var.f25258o = valueOf;
        ha0Var.f25259p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f25620n;
        int i15 = this.f25616a;
        if (z10 && (view = this.f25617b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f25617b.getMeasuredWidth() - this.f25617b.getPaddingLeft()) - this.f25617b.getPaddingRight()) - i15;
        }
        float f10 = this.f25619f;
        int i16 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        ha0 ha0Var = this.f25618c;
        if (i16 > 0) {
            float f11 = (i12 + i14) / 2.0f;
            int i17 = (int) f7;
            float f12 = f10 / 2.0f;
            ha0Var.setBounds(i17, (int) (f11 - f12), i15 + i17, (int) (f12 + f11));
        } else {
            int i18 = (int) f7;
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.e, org.telegram.messenger.g0.B(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            ha0Var.setBounds(i18, (int) (y3 + f13), i15 + i18, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.g0.B(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        ha0Var.setAlpha((int) (alpha * this.h));
        ha0Var.draw(canvas);
        View view2 = this.f25617b;
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
        ha0 ha0Var = this.f25618c;
        if (ha0Var.f25258o == null && ha0Var.f25259p == null) {
            ha0Var.f(org.telegram.ui.ActionBar.g6.m1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.g6.m1(0.25f, paint.getColor()));
        }
        boolean z10 = this.f25620n;
        int i12 = this.f25616a;
        if (z10 && (view = this.f25617b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f25617b.getMeasuredWidth() - this.f25617b.getPaddingLeft()) - this.f25617b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public ia0(View view, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = 1.0f;
        this.f25619f = -1.0f;
        this.h = 1.0f;
        this.f25620n = false;
        this.f25617b = view;
        this.f25616a = i10;
        this.d = i11;
        ha0 ha0Var = new ha0(c6Var);
        this.f25618c = ha0Var;
        ha0Var.k(4.0f);
    }
}
