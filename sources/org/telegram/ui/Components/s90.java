package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s90 extends ReplacementSpan {
    public final int f28209a;
    public View f28210b;
    public final r90 f28211c;
    public final int d;
    public float e;
    public float f28212f;
    public float h;
    public boolean f28213n;

    public s90(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        r90 r90Var = this.f28211c;
        r90Var.f27923o = valueOf;
        r90Var.f27924p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f28213n;
        int i15 = this.f28209a;
        if (z10 && (view = this.f28210b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f28210b.getMeasuredWidth() - this.f28210b.getPaddingLeft()) - this.f28210b.getPaddingRight()) - i15;
        }
        float f10 = this.f28212f;
        r90 r90Var = this.f28211c;
        if (f10 > 0.0f) {
            float f11 = (i12 + i14) / 2.0f;
            int i16 = (int) f7;
            float f12 = f10 / 2.0f;
            r90Var.setBounds(i16, (int) (f11 - f12), i15 + i16, (int) (f12 + f11));
        } else {
            int i17 = (int) f7;
            float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, this.e, org.telegram.messenger.f0.B(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            r90Var.setBounds(i17, (int) (z11 + f13), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.f0.B(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        r90Var.setAlpha((int) (alpha * this.h));
        r90Var.draw(canvas);
        View view2 = this.f28210b;
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
        r90 r90Var = this.f28211c;
        if (r90Var.f27923o == null && r90Var.f27924p == null) {
            r90Var.e(org.telegram.ui.ActionBar.h6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.h6.l1(0.25f, paint.getColor()));
        }
        boolean z10 = this.f28213n;
        int i12 = this.f28209a;
        if (z10 && (view = this.f28210b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f28210b.getMeasuredWidth() - this.f28210b.getPaddingLeft()) - this.f28210b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public s90(View view, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = 1.0f;
        this.f28212f = -1.0f;
        this.h = 1.0f;
        this.f28213n = false;
        this.f28210b = view;
        this.f28209a = i10;
        this.d = i11;
        r90 r90Var = new r90(d6Var);
        this.f28211c = r90Var;
        r90Var.j(4.0f);
    }
}
