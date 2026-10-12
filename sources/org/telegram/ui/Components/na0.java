package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class na0 extends ReplacementSpan {
    public final int f28765a;
    public View f28766b;
    public final ma0 f28767c;
    public final int d;
    public float f28768e;
    public float f28769f;
    public float h;
    public boolean f28770n;

    public na0(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        ma0 ma0Var = this.f28767c;
        ma0Var.f28478o = valueOf;
        ma0Var.f28479p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f28770n;
        int i15 = this.f28765a;
        if (z10 && (view = this.f28766b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f28766b.getMeasuredWidth() - this.f28766b.getPaddingLeft()) - this.f28766b.getPaddingRight()) - i15;
        }
        float f10 = this.f28769f;
        int i16 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        ma0 ma0Var = this.f28767c;
        if (i16 > 0) {
            float f11 = (i12 + i14) / 2.0f;
            int i17 = (int) f7;
            float f12 = f10 / 2.0f;
            ma0Var.setBounds(i17, (int) (f11 - f12), i15 + i17, (int) (f12 + f11));
        } else {
            int i18 = (int) f7;
            float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, this.f28768e, org.telegram.messenger.v0.B(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            ma0Var.setBounds(i18, (int) (y3 + f13), i15 + i18, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.f28768e) * (org.telegram.messenger.v0.B(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        ma0Var.setAlpha((int) (alpha * this.h));
        ma0Var.draw(canvas);
        View view2 = this.f28766b;
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
        ma0 ma0Var = this.f28767c;
        if (ma0Var.f28478o == null && ma0Var.f28479p == null) {
            ma0Var.f(org.telegram.ui.ActionBar.h6.m1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.h6.m1(0.25f, paint.getColor()));
        }
        boolean z10 = this.f28770n;
        int i12 = this.f28765a;
        if (z10 && (view = this.f28766b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f28766b.getMeasuredWidth() - this.f28766b.getPaddingLeft()) - this.f28766b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public na0(View view, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f28768e = 1.0f;
        this.f28769f = -1.0f;
        this.h = 1.0f;
        this.f28770n = false;
        this.f28766b = view;
        this.f28765a = i10;
        this.d = i11;
        ma0 ma0Var = new ma0(c6Var);
        this.f28767c = ma0Var;
        ma0Var.k(4.0f);
    }
}
