package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j90 extends ReplacementSpan {
    public final int f25937a;
    public View f25938b;
    public final i90 f25939c;
    public final int d;
    public float e;
    public float f25940f;
    public float h;
    public boolean f25941n;

    public j90(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        i90 i90Var = this.f25939c;
        i90Var.f25643o = valueOf;
        i90Var.f25644p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z4 = this.f25941n;
        int i15 = this.f25937a;
        if (z4 && (view = this.f25938b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f25938b.getMeasuredWidth() - this.f25938b.getPaddingLeft()) - this.f25938b.getPaddingRight()) - i15;
        }
        float f11 = this.f25940f;
        i90 i90Var = this.f25939c;
        if (f11 > 0.0f) {
            float f12 = (i12 + i14) / 2.0f;
            int i16 = (int) f10;
            float f13 = f11 / 2.0f;
            i90Var.setBounds(i16, (int) (f12 - f13), i15 + i16, (int) (f13 + f12));
        } else {
            int i17 = (int) f10;
            float w10 = e2.c.w(1.0f, this.e, org.telegram.messenger.y3.B(2.0f, i14, i12) / 2.0f, i12);
            float f14 = this.d;
            i90Var.setBounds(i17, (int) (w10 + f14), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.y3.B(2.0f, i14, i12) / 2.0f))) + f14));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        i90Var.setAlpha((int) (alpha * this.h));
        i90Var.draw(canvas);
        View view2 = this.f25938b;
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
        i90 i90Var = this.f25939c;
        if (i90Var.f25643o == null && i90Var.f25644p == null) {
            i90Var.e(org.telegram.ui.ActionBar.j6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.j6.l1(0.25f, paint.getColor()));
        }
        boolean z4 = this.f25941n;
        int i12 = this.f25937a;
        if (z4 && (view = this.f25938b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f25938b.getMeasuredWidth() - this.f25938b.getPaddingLeft()) - this.f25938b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public j90(View view, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = 1.0f;
        this.f25940f = -1.0f;
        this.h = 1.0f;
        this.f25941n = false;
        this.f25938b = view;
        this.f25937a = i10;
        this.d = i11;
        i90 i90Var = new i90(f6Var);
        this.f25939c = i90Var;
        i90Var.j(4.0f);
    }
}
