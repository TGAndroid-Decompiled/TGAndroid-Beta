package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v90 extends ReplacementSpan {
    public final int f31615a;
    public View f31616b;
    public final u90 f31617c;
    public final int d;
    public float f31618e;
    public float f31619f;
    public float h;
    public boolean f31620n;

    public v90(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        u90 u90Var = this.f31617c;
        u90Var.f31345o = valueOf;
        u90Var.f31346p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f31620n;
        int i15 = this.f31615a;
        if (z10 && (view = this.f31616b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f31616b.getMeasuredWidth() - this.f31616b.getPaddingLeft()) - this.f31616b.getPaddingRight()) - i15;
        }
        float f10 = this.f31619f;
        u90 u90Var = this.f31617c;
        if (f10 > 0.0f) {
            float f11 = (i12 + i14) / 2.0f;
            int i16 = (int) f7;
            float f12 = f10 / 2.0f;
            u90Var.setBounds(i16, (int) (f11 - f12), i15 + i16, (int) (f12 + f11));
        } else {
            int i17 = (int) f7;
            float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f31618e, org.telegram.messenger.q.B(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            u90Var.setBounds(i17, (int) (z11 + f13), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.f31618e) * (org.telegram.messenger.q.B(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        u90Var.setAlpha((int) (alpha * this.h));
        u90Var.draw(canvas);
        View view2 = this.f31616b;
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
        u90 u90Var = this.f31617c;
        if (u90Var.f31345o == null && u90Var.f31346p == null) {
            u90Var.e(org.telegram.ui.ActionBar.i6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.i6.l1(0.25f, paint.getColor()));
        }
        boolean z10 = this.f31620n;
        int i12 = this.f31615a;
        if (z10 && (view = this.f31616b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f31616b.getMeasuredWidth() - this.f31616b.getPaddingLeft()) - this.f31616b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public v90(View view, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f31618e = 1.0f;
        this.f31619f = -1.0f;
        this.h = 1.0f;
        this.f31620n = false;
        this.f31616b = view;
        this.f31615a = i10;
        this.d = i11;
        u90 u90Var = new u90(d6Var);
        this.f31617c = u90Var;
        u90Var.j(4.0f);
    }
}
