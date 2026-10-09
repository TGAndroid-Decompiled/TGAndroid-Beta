package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ja0 extends ReplacementSpan {
    public final int f27669a;
    public View f27670b;
    public final ia0 f27671c;
    public final int d;
    public float f27672e;
    public float f27673f;
    public float h;
    public boolean f27674n;

    public ja0(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        ia0 ia0Var = this.f27671c;
        ia0Var.f27332o = valueOf;
        ia0Var.f27333p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f27674n;
        int i15 = this.f27669a;
        if (z10 && (view = this.f27670b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f27670b.getMeasuredWidth() - this.f27670b.getPaddingLeft()) - this.f27670b.getPaddingRight()) - i15;
        }
        float f10 = this.f27673f;
        int i16 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        ia0 ia0Var = this.f27671c;
        if (i16 > 0) {
            float f11 = (i12 + i14) / 2.0f;
            int i17 = (int) f7;
            float f12 = f10 / 2.0f;
            ia0Var.setBounds(i17, (int) (f11 - f12), i15 + i17, (int) (f12 + f11));
        } else {
            int i18 = (int) f7;
            float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, this.f27672e, org.telegram.messenger.q.B(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            ia0Var.setBounds(i18, (int) (y3 + f13), i15 + i18, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.f27672e) * (org.telegram.messenger.q.B(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        ia0Var.setAlpha((int) (alpha * this.h));
        ia0Var.draw(canvas);
        View view2 = this.f27670b;
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
        ia0 ia0Var = this.f27671c;
        if (ia0Var.f27332o == null && ia0Var.f27333p == null) {
            ia0Var.f(org.telegram.ui.ActionBar.i6.m1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.i6.m1(0.25f, paint.getColor()));
        }
        boolean z10 = this.f27674n;
        int i12 = this.f27669a;
        if (z10 && (view = this.f27670b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f27670b.getMeasuredWidth() - this.f27670b.getPaddingLeft()) - this.f27670b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public ja0(View view, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f27672e = 1.0f;
        this.f27673f = -1.0f;
        this.h = 1.0f;
        this.f27674n = false;
        this.f27670b = view;
        this.f27669a = i10;
        this.d = i11;
        ia0 ia0Var = new ia0(e6Var);
        this.f27671c = ia0Var;
        ia0Var.k(4.0f);
    }
}
