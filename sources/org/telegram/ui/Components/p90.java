package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class p90 extends ReplacementSpan {
    public final int f27192a;
    public View f27193b;
    public final o90 f27194c;
    public final int d;
    public float e;
    public float f27195f;
    public float h;
    public boolean f27196n;

    public p90(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        o90 o90Var = this.f27194c;
        o90Var.f26853o = valueOf;
        o90Var.f26854p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f27196n;
        int i15 = this.f27192a;
        if (z10 && (view = this.f27193b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f27193b.getMeasuredWidth() - this.f27193b.getPaddingLeft()) - this.f27193b.getPaddingRight()) - i15;
        }
        float f10 = this.f27195f;
        o90 o90Var = this.f27194c;
        if (f10 > 0.0f) {
            float f11 = (i12 + i14) / 2.0f;
            int i16 = (int) f7;
            float f12 = f10 / 2.0f;
            o90Var.setBounds(i16, (int) (f11 - f12), i15 + i16, (int) (f12 + f11));
        } else {
            int i17 = (int) f7;
            float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, this.e, org.telegram.messenger.l0.B(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            o90Var.setBounds(i17, (int) (z11 + f13), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.l0.B(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        o90Var.setAlpha((int) (alpha * this.h));
        o90Var.draw(canvas);
        View view2 = this.f27193b;
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
        o90 o90Var = this.f27194c;
        if (o90Var.f26853o == null && o90Var.f26854p == null) {
            o90Var.e(org.telegram.ui.ActionBar.j6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.j6.l1(0.25f, paint.getColor()));
        }
        boolean z10 = this.f27196n;
        int i12 = this.f27192a;
        if (z10 && (view = this.f27193b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f27193b.getMeasuredWidth() - this.f27193b.getPaddingLeft()) - this.f27193b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public p90(View view, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = 1.0f;
        this.f27195f = -1.0f;
        this.h = 1.0f;
        this.f27196n = false;
        this.f27193b = view;
        this.f27192a = i10;
        this.d = i11;
        o90 o90Var = new o90(f6Var);
        this.f27194c = o90Var;
        o90Var.j(4.0f);
    }
}
