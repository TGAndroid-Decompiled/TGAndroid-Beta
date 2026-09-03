package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class k90 extends ReplacementSpan {
    public final int f26235a;
    public View f26236b;
    public final j90 f26237c;
    public final int d;
    public float e;
    public float f26238f;
    public float h;
    public boolean f26239n;

    public k90(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        j90 j90Var = this.f26237c;
        j90Var.f25915o = valueOf;
        j90Var.f25916p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z4 = this.f26239n;
        int i15 = this.f26235a;
        if (z4 && (view = this.f26236b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f26236b.getMeasuredWidth() - this.f26236b.getPaddingLeft()) - this.f26236b.getPaddingRight()) - i15;
        }
        float f11 = this.f26238f;
        j90 j90Var = this.f26237c;
        if (f11 > 0.0f) {
            float f12 = (i12 + i14) / 2.0f;
            int i16 = (int) f10;
            float f13 = f11 / 2.0f;
            j90Var.setBounds(i16, (int) (f12 - f13), i15 + i16, (int) (f13 + f12));
        } else {
            int i17 = (int) f10;
            float w10 = e2.c.w(1.0f, this.e, org.telegram.messenger.y3.B(2.0f, i14, i12) / 2.0f, i12);
            float f14 = this.d;
            j90Var.setBounds(i17, (int) (w10 + f14), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.y3.B(2.0f, i14, i12) / 2.0f))) + f14));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        j90Var.setAlpha((int) (alpha * this.h));
        j90Var.draw(canvas);
        View view2 = this.f26236b;
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
        j90 j90Var = this.f26237c;
        if (j90Var.f25915o == null && j90Var.f25916p == null) {
            j90Var.e(org.telegram.ui.ActionBar.j6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.j6.l1(0.25f, paint.getColor()));
        }
        boolean z4 = this.f26239n;
        int i12 = this.f26235a;
        if (z4 && (view = this.f26236b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f26236b.getMeasuredWidth() - this.f26236b.getPaddingLeft()) - this.f26236b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public k90(View view, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = 1.0f;
        this.f26238f = -1.0f;
        this.h = 1.0f;
        this.f26239n = false;
        this.f26236b = view;
        this.f26235a = i10;
        this.d = i11;
        j90 j90Var = new j90(f6Var);
        this.f26237c = j90Var;
        j90Var.j(4.0f);
    }
}
