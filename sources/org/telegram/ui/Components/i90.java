package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class i90 extends ReplacementSpan {
    public final int f24918a;
    public View f24919b;
    public final h90 f24920c;
    public final int d;
    public float e;
    public float f24921f;
    public float h;
    public boolean f24922n;

    public i90(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        h90 h90Var = this.f24920c;
        h90Var.f24611o = valueOf;
        h90Var.f24612p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f24922n;
        int i15 = this.f24918a;
        if (z10 && (view = this.f24919b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f24919b.getMeasuredWidth() - this.f24919b.getPaddingLeft()) - this.f24919b.getPaddingRight()) - i15;
        }
        float f10 = this.f24921f;
        h90 h90Var = this.f24920c;
        if (f10 > 0.0f) {
            float f11 = (i12 + i14) / 2.0f;
            int i16 = (int) f7;
            float f12 = f10 / 2.0f;
            h90Var.setBounds(i16, (int) (f11 - f12), i15 + i16, (int) (f12 + f11));
        } else {
            int i17 = (int) f7;
            float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, this.e, org.telegram.messenger.z0.B(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            h90Var.setBounds(i17, (int) (z11 + f13), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.z0.B(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        h90Var.setAlpha((int) (alpha * this.h));
        h90Var.draw(canvas);
        View view2 = this.f24919b;
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
        h90 h90Var = this.f24920c;
        if (h90Var.f24611o == null && h90Var.f24612p == null) {
            h90Var.e(org.telegram.ui.ActionBar.h6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.h6.l1(0.25f, paint.getColor()));
        }
        boolean z10 = this.f24922n;
        int i12 = this.f24918a;
        if (z10 && (view = this.f24919b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f24919b.getMeasuredWidth() - this.f24919b.getPaddingLeft()) - this.f24919b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public i90(View view, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = 1.0f;
        this.f24921f = -1.0f;
        this.h = 1.0f;
        this.f24922n = false;
        this.f24919b = view;
        this.f24918a = i10;
        this.d = i11;
        h90 h90Var = new h90(d6Var);
        this.f24920c = h90Var;
        h90Var.j(4.0f);
    }
}
