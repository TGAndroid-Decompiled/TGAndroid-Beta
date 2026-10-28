package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fa0 extends ReplacementSpan {
    public final int f28083a;
    public View f28084b;
    public final ea0 f28085c;
    public final int d;
    public float e;
    public float f28086f;
    public float h;
    public boolean f28087n;
    public boolean f28088r;

    public fa0(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        this.f28088r = false;
        Integer valueOf = Integer.valueOf(i10);
        ea0 ea0Var = this.f28085c;
        ea0Var.f27797o = valueOf;
        ea0Var.f27798p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f28087n;
        int i15 = this.f28083a;
        if (z10 && (view = this.f28084b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f28084b.getMeasuredWidth() - this.f28084b.getPaddingLeft()) - this.f28084b.getPaddingRight()) - i15;
        }
        float f10 = this.f28086f;
        int i16 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        ea0 ea0Var = this.f28085c;
        if (i16 > 0) {
            float f11 = (i12 + i14) / 2.0f;
            int i17 = (int) f7;
            float f12 = f10 / 2.0f;
            ea0Var.setBounds(i17, (int) (f11 - f12), i15 + i17, (int) (f12 + f11));
        } else {
            int i18 = (int) f7;
            float z11 = c3.h0.z(1.0f, this.e, org.telegram.messenger.t.C(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            ea0Var.setBounds(i18, (int) (z11 + f13), i15 + i18, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.t.C(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (this.f28088r && paint != null) {
            int color = paint.getColor();
            ea0Var.f(org.telegram.ui.ActionBar.y6.o1(0.1f, color), org.telegram.ui.ActionBar.y6.o1(0.25f, color));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        ea0Var.setAlpha((int) (alpha * this.h));
        ea0Var.draw(canvas);
        View view2 = this.f28084b;
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
        boolean z10 = this.f28088r;
        ea0 ea0Var = this.f28085c;
        if (z10 || (ea0Var.f27797o == null && ea0Var.f27798p == null)) {
            this.f28088r = true;
            int color = paint.getColor();
            ea0Var.f(org.telegram.ui.ActionBar.y6.o1(0.1f, color), org.telegram.ui.ActionBar.y6.o1(0.25f, color));
        }
        boolean z11 = this.f28087n;
        int i12 = this.f28083a;
        if (z11 && (view = this.f28084b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f28084b.getMeasuredWidth() - this.f28084b.getPaddingLeft()) - this.f28084b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public fa0(View view, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        this.e = 1.0f;
        this.f28086f = -1.0f;
        this.h = 1.0f;
        this.f28087n = false;
        this.f28084b = view;
        this.f28083a = i10;
        this.d = i11;
        ea0 ea0Var = new ea0(u6Var);
        this.f28085c = ea0Var;
        ea0Var.k(4.0f);
    }
}
