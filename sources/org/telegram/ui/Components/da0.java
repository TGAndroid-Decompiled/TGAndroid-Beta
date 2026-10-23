package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class da0 extends ReplacementSpan {
    public final int f25544a;
    public View f25545b;
    public final ca0 f25546c;
    public final int d;
    public float e;
    public float f25547f;
    public float h;
    public boolean f25548n;
    public boolean f25549r;

    public da0(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        this.f25549r = false;
        Integer valueOf = Integer.valueOf(i10);
        ca0 ca0Var = this.f25546c;
        ca0Var.f25289o = valueOf;
        ca0Var.f25290p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f25548n;
        int i15 = this.f25544a;
        if (z10 && (view = this.f25545b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f25545b.getMeasuredWidth() - this.f25545b.getPaddingLeft()) - this.f25545b.getPaddingRight()) - i15;
        }
        float f10 = this.f25547f;
        int i16 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        ca0 ca0Var = this.f25546c;
        if (i16 > 0) {
            float f11 = (i12 + i14) / 2.0f;
            int i17 = (int) f7;
            float f12 = f10 / 2.0f;
            ca0Var.setBounds(i17, (int) (f11 - f12), i15 + i17, (int) (f12 + f11));
        } else {
            int i18 = (int) f7;
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.e, org.telegram.messenger.v0.B(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            ca0Var.setBounds(i18, (int) (y3 + f13), i15 + i18, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.v0.B(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (this.f25549r && paint != null) {
            int color = paint.getColor();
            ca0Var.f(org.telegram.ui.ActionBar.k6.o1(0.1f, color), org.telegram.ui.ActionBar.k6.o1(0.25f, color));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        ca0Var.setAlpha((int) (alpha * this.h));
        ca0Var.draw(canvas);
        View view2 = this.f25545b;
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
        boolean z10 = this.f25549r;
        ca0 ca0Var = this.f25546c;
        if (z10 || (ca0Var.f25289o == null && ca0Var.f25290p == null)) {
            this.f25549r = true;
            int color = paint.getColor();
            ca0Var.f(org.telegram.ui.ActionBar.k6.o1(0.1f, color), org.telegram.ui.ActionBar.k6.o1(0.25f, color));
        }
        boolean z11 = this.f25548n;
        int i12 = this.f25544a;
        if (z11 && (view = this.f25545b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f25545b.getMeasuredWidth() - this.f25545b.getPaddingLeft()) - this.f25545b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public da0(View view, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = 1.0f;
        this.f25547f = -1.0f;
        this.h = 1.0f;
        this.f25548n = false;
        this.f25545b = view;
        this.f25544a = i10;
        this.d = i11;
        ca0 ca0Var = new ca0(g6Var);
        this.f25546c = ca0Var;
        ca0Var.k(4.0f);
    }
}
