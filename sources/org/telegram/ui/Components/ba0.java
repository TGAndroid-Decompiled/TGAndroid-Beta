package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ba0 extends ReplacementSpan {
    public final int f24952a;
    public View f24953b;
    public final aa0 f24954c;
    public final int d;
    public float e;
    public float f24955f;
    public float h;
    public boolean f24956n;
    public boolean f24957r;

    public ba0(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        this.f24957r = false;
        Integer valueOf = Integer.valueOf(i10);
        aa0 aa0Var = this.f24954c;
        aa0Var.f24695o = valueOf;
        aa0Var.f24696p = Integer.valueOf(i11);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int alpha;
        View view;
        boolean z10 = this.f24956n;
        int i15 = this.f24952a;
        if (z10 && (view = this.f24953b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.f24953b.getMeasuredWidth() - this.f24953b.getPaddingLeft()) - this.f24953b.getPaddingRight()) - i15;
        }
        float f10 = this.f24955f;
        int i16 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        aa0 aa0Var = this.f24954c;
        if (i16 > 0) {
            float f11 = (i12 + i14) / 2.0f;
            int i17 = (int) f7;
            float f12 = f10 / 2.0f;
            aa0Var.setBounds(i17, (int) (f11 - f12), i15 + i17, (int) (f12 + f11));
        } else {
            int i18 = (int) f7;
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.e, org.telegram.messenger.v0.B(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            aa0Var.setBounds(i18, (int) (y3 + f13), i15 + i18, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.v0.B(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (this.f24957r && paint != null) {
            int color = paint.getColor();
            aa0Var.f(org.telegram.ui.ActionBar.k6.o1(0.1f, color), org.telegram.ui.ActionBar.k6.o1(0.25f, color));
        }
        if (paint == null) {
            alpha = 255;
        } else {
            alpha = paint.getAlpha();
        }
        aa0Var.setAlpha((int) (alpha * this.h));
        aa0Var.draw(canvas);
        View view2 = this.f24953b;
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
        boolean z10 = this.f24957r;
        aa0 aa0Var = this.f24954c;
        if (z10 || (aa0Var.f24695o == null && aa0Var.f24696p == null)) {
            this.f24957r = true;
            int color = paint.getColor();
            aa0Var.f(org.telegram.ui.ActionBar.k6.o1(0.1f, color), org.telegram.ui.ActionBar.k6.o1(0.25f, color));
        }
        boolean z11 = this.f24956n;
        int i12 = this.f24952a;
        if (z11 && (view = this.f24953b) != null && view.getMeasuredWidth() > 0) {
            return ((this.f24953b.getMeasuredWidth() - this.f24953b.getPaddingLeft()) - this.f24953b.getPaddingRight()) - i12;
        }
        return i12;
    }

    public ba0(View view, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = 1.0f;
        this.f24955f = -1.0f;
        this.h = 1.0f;
        this.f24956n = false;
        this.f24953b = view;
        this.f24952a = i10;
        this.d = i11;
        aa0 aa0Var = new aa0(g6Var);
        this.f24954c = aa0Var;
        aa0Var.k(4.0f);
    }
}
