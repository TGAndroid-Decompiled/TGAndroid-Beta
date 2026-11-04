package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
public final class yo extends ReplacementSpan {
    public final int f40795a;
    public final Object f40796b;

    public yo(Object obj, int i3) {
        this.f40795a = i3;
        this.f40796b = obj;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        switch (this.f40795a) {
            case 0:
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                int i14 = ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2) + i12;
                Drawable drawable = (Drawable) this.f40796b;
                int i15 = (int) f10;
                drawable.setBounds(i15, i14 - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(24.0f) + i15, org.telegram.messenger.g0.L(12.0f) + i14);
                drawable.setAlpha(paint.getAlpha());
                drawable.draw(canvas);
                return;
            case 1:
            case 2:
            case 3:
            default:
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f40795a) {
            case 0:
                if (fontMetricsInt != null) {
                    Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                    int i11 = fontMetricsInt2.ascent;
                    int i12 = (fontMetricsInt2.descent + i11) / 2;
                    int C = org.telegram.messenger.camera.q.C(12.0f, i12, i11);
                    fontMetricsInt.top = C;
                    fontMetricsInt.ascent = C;
                    int b10 = org.telegram.messenger.k5.b(12.0f, i12, fontMetricsInt2.descent);
                    fontMetricsInt.bottom = b10;
                    fontMetricsInt.descent = b10;
                }
                return org.telegram.messenger.g0.L(32.0f);
            case 1:
                return ((h90) this.f40796b).f34354y;
            case 2:
                return (int) ((org.telegram.ui.kg0) this.f40796b).f46929g2;
            case 3:
                return (int) ((xg.e1) this.f40796b).f58684m2;
            default:
                return ((org.telegram.messenger.f6) this.f40796b).getSize(paint, charSequence, i3, i10, fontMetricsInt);
        }
    }

    public yo(ch0 ch0Var) {
        this.f40795a = 0;
        this.f40796b = ch0Var;
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }

    private final void d(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }
}
