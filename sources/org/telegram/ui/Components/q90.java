package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q90 extends ReplacementSpan {
    public final int f27490a;
    public View f27491b;
    public final p90 f27492c;
    public final int d;
    public float e;
    public float f27493f;
    public float h;
    public boolean f27494n;

    public q90(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        p90 p90Var = this.f27492c;
        p90Var.f27150o = valueOf;
        p90Var.f27151p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f27494n;
        int i15 = this.f27490a;
        if (z10 && (view = this.f27491b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f27491b.getMeasuredWidth() - this.f27491b.getPaddingLeft()) - this.f27491b.getPaddingRight()) - i15;
        }
        float f10 = this.f27493f;
        p90 p90Var = this.f27492c;
        if (f10 > 0.0f) {
            float f11 = (i12 + i14) / 2.0f;
            int i16 = (int) f7;
            float f12 = f10 / 2.0f;
            p90Var.setBounds(i16, (int) (f11 - f12), i15 + i16, (int) (f12 + f11));
        } else {
            int i17 = (int) f7;
            float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, this.e, org.telegram.messenger.q.C(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            p90Var.setBounds(i17, (int) (z11 + f13), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.q.C(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        p90Var.setAlpha((int) (alpha * this.h));
        p90Var.draw(canvas);
        View view2 = this.f27491b;
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
        p90 p90Var = this.f27492c;
        if (p90Var.f27150o == null && p90Var.f27151p == null) {
            p90Var.e(org.telegram.ui.ActionBar.j6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.j6.l1(0.25f, paint.getColor()));
        }
        boolean z10 = this.f27494n;
        int i12 = this.f27490a;
        if (z10 && (view = this.f27491b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f27491b.getMeasuredWidth() - this.f27491b.getPaddingLeft()) - this.f27491b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public q90(View view, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = 1.0f;
        this.f27493f = -1.0f;
        this.h = 1.0f;
        this.f27494n = false;
        this.f27491b = view;
        this.f27490a = i10;
        this.d = i11;
        p90 p90Var = new p90(e6Var);
        this.f27492c = p90Var;
        p90Var.j(4.0f);
    }
}
