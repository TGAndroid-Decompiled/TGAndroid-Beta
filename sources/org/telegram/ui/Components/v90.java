package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v90 extends ReplacementSpan {
    public final int f31608a;
    public View f31609b;
    public final u90 f31610c;
    public final int d;
    public float f31611e;
    public float f31612f;
    public float h;
    public boolean f31613n;

    public v90(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        u90 u90Var = this.f31610c;
        u90Var.f31338o = valueOf;
        u90Var.f31339p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f31613n;
        int i15 = this.f31608a;
        if (z10 && (view = this.f31609b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f31609b.getMeasuredWidth() - this.f31609b.getPaddingLeft()) - this.f31609b.getPaddingRight()) - i15;
        }
        float f10 = this.f31612f;
        u90 u90Var = this.f31610c;
        if (f10 > 0.0f) {
            float f11 = (i12 + i14) / 2.0f;
            int i16 = (int) f7;
            float f12 = f10 / 2.0f;
            u90Var.setBounds(i16, (int) (f11 - f12), i15 + i16, (int) (f12 + f11));
        } else {
            int i17 = (int) f7;
            float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f31611e, org.telegram.messenger.f0.B(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            u90Var.setBounds(i17, (int) (z11 + f13), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.f31611e) * (org.telegram.messenger.f0.B(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        u90Var.setAlpha((int) (alpha * this.h));
        u90Var.draw(canvas);
        View view2 = this.f31609b;
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
        u90 u90Var = this.f31610c;
        if (u90Var.f31338o == null && u90Var.f31339p == null) {
            u90Var.e(org.telegram.ui.ActionBar.i6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.i6.l1(0.25f, paint.getColor()));
        }
        boolean z10 = this.f31613n;
        int i12 = this.f31608a;
        if (z10 && (view = this.f31609b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f31609b.getMeasuredWidth() - this.f31609b.getPaddingLeft()) - this.f31609b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public v90(View view, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f31611e = 1.0f;
        this.f31612f = -1.0f;
        this.h = 1.0f;
        this.f31613n = false;
        this.f31609b = view;
        this.f31608a = i10;
        this.d = i11;
        u90 u90Var = new u90(d6Var);
        this.f31610c = u90Var;
        u90Var.j(4.0f);
    }
}
