package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class r90 extends ReplacementSpan {
    public final int f26635a;
    public View f26636b;
    public final q90 f26637c;
    public final int d;
    public float e;
    public float f26638f;
    public float h;
    public boolean f26639n;

    public r90(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        q90 q90Var = this.f26637c;
        q90Var.f26356o = valueOf;
        q90Var.f26357p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f26639n;
        int i15 = this.f26635a;
        if (z10 && (view = this.f26636b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f26636b.getMeasuredWidth() - this.f26636b.getPaddingLeft()) - this.f26636b.getPaddingRight()) - i15;
        }
        float f10 = this.f26638f;
        q90 q90Var = this.f26637c;
        if (f10 > 0.0f) {
            float f11 = (i12 + i14) / 2.0f;
            int i16 = (int) f7;
            float f12 = f10 / 2.0f;
            q90Var.setBounds(i16, (int) (f11 - f12), i15 + i16, (int) (f12 + f11));
        } else {
            int i17 = (int) f7;
            float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, this.e, org.telegram.messenger.a2.B(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            q90Var.setBounds(i17, (int) (z11 + f13), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.a2.B(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        q90Var.setAlpha((int) (alpha * this.h));
        q90Var.draw(canvas);
        View view2 = this.f26636b;
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
        q90 q90Var = this.f26637c;
        if (q90Var.f26356o == null && q90Var.f26357p == null) {
            q90Var.e(org.telegram.ui.ActionBar.j6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.j6.l1(0.25f, paint.getColor()));
        }
        boolean z10 = this.f26639n;
        int i12 = this.f26635a;
        if (z10 && (view = this.f26636b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f26636b.getMeasuredWidth() - this.f26636b.getPaddingLeft()) - this.f26636b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public r90(View view, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = 1.0f;
        this.f26638f = -1.0f;
        this.h = 1.0f;
        this.f26639n = false;
        this.f26636b = view;
        this.f26635a = i10;
        this.d = i11;
        q90 q90Var = new q90(f6Var);
        this.f26637c = q90Var;
        q90Var.j(4.0f);
    }
}
