package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ca0 extends ReplacementSpan {
    public final int f25164a;
    public View f25165b;
    public final ba0 f25166c;
    public final int d;
    public float e;
    public float f25167f;
    public float h;
    public boolean f25168n;
    public boolean f25169r;

    public ca0(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        this.f25169r = false;
        Integer valueOf = Integer.valueOf(i10);
        ba0 ba0Var = this.f25166c;
        ba0Var.f24872o = valueOf;
        ba0Var.f24873p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f25168n;
        int i15 = this.f25164a;
        if (z10 && (view = this.f25165b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f25165b.getMeasuredWidth() - this.f25165b.getPaddingLeft()) - this.f25165b.getPaddingRight()) - i15;
        }
        float f10 = this.f25167f;
        int i16 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        ba0 ba0Var = this.f25166c;
        if (i16 > 0) {
            float f11 = (i12 + i14) / 2.0f;
            int i17 = (int) f7;
            float f12 = f10 / 2.0f;
            ba0Var.setBounds(i17, (int) (f11 - f12), i15 + i17, (int) (f12 + f11));
        } else {
            int i18 = (int) f7;
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.e, org.telegram.messenger.g0.B(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            ba0Var.setBounds(i18, (int) (y3 + f13), i15 + i18, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.g0.B(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (this.f25169r && paint != null) {
            int color = paint.getColor();
            ba0Var.f(org.telegram.ui.ActionBar.h6.m1(0.1f, color), org.telegram.ui.ActionBar.h6.m1(0.25f, color));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        ba0Var.setAlpha((int) (alpha * this.h));
        ba0Var.draw(canvas);
        View view2 = this.f25165b;
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
        boolean z10 = this.f25169r;
        ba0 ba0Var = this.f25166c;
        if (z10 || (ba0Var.f24872o == null && ba0Var.f24873p == null)) {
            this.f25169r = true;
            int color = paint.getColor();
            ba0Var.f(org.telegram.ui.ActionBar.h6.m1(0.1f, color), org.telegram.ui.ActionBar.h6.m1(0.25f, color));
        }
        boolean z11 = this.f25168n;
        int i12 = this.f25164a;
        if (z11 && (view = this.f25165b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f25165b.getMeasuredWidth() - this.f25165b.getPaddingLeft()) - this.f25165b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public ca0(View view, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = 1.0f;
        this.f25167f = -1.0f;
        this.h = 1.0f;
        this.f25168n = false;
        this.f25165b = view;
        this.f25164a = i10;
        this.d = i11;
        ba0 ba0Var = new ba0(d6Var);
        this.f25166c = ba0Var;
        ba0Var.k(4.0f);
    }
}
