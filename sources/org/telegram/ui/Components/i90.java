package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class i90 extends ReplacementSpan {
    public final int f27076a;
    public View f27077b;
    public final h90 f27078c;
    public final int d;
    public float f27079e;
    public float f27080f;
    public float h;
    public boolean f27081n;

    public i90(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        h90 h90Var = this.f27078c;
        h90Var.f26711o = valueOf;
        h90Var.f26712p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f27081n;
        int i15 = this.f27076a;
        if (z10 && (view = this.f27077b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f27077b.getMeasuredWidth() - this.f27077b.getPaddingLeft()) - this.f27077b.getPaddingRight()) - i15;
        }
        float f10 = this.f27080f;
        h90 h90Var = this.f27078c;
        if (f10 > 0.0f) {
            float f11 = (i12 + i14) / 2.0f;
            int i16 = (int) f7;
            float f12 = f10 / 2.0f;
            h90Var.setBounds(i16, (int) (f11 - f12), i15 + i16, (int) (f12 + f11));
        } else {
            int i17 = (int) f7;
            float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f27079e, org.telegram.messenger.w1.B(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            h90Var.setBounds(i17, (int) (z11 + f13), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.f27079e) * (org.telegram.messenger.w1.B(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        h90Var.setAlpha((int) (alpha * this.h));
        h90Var.draw(canvas);
        View view2 = this.f27077b;
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
        h90 h90Var = this.f27078c;
        if (h90Var.f26711o == null && h90Var.f26712p == null) {
            h90Var.e(org.telegram.ui.ActionBar.j6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.j6.l1(0.25f, paint.getColor()));
        }
        boolean z10 = this.f27081n;
        int i12 = this.f27076a;
        if (z10 && (view = this.f27077b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f27077b.getMeasuredWidth() - this.f27077b.getPaddingLeft()) - this.f27077b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public i90(View view, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f27079e = 1.0f;
        this.f27080f = -1.0f;
        this.h = 1.0f;
        this.f27081n = false;
        this.f27077b = view;
        this.f27076a = i10;
        this.d = i11;
        h90 h90Var = new h90(f6Var);
        this.f27078c = h90Var;
        h90Var.j(4.0f);
    }
}
