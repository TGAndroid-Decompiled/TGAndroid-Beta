package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
public final class dh0 {
    public final View f34440a;
    public final int f34441b;
    public final int f34442c;
    public final int d;
    public final hh0 f34443e;
    public final TextPaint f34444f;
    public RectF f34445g;

    public dh0(pt ptVar, Layout layout, Spanned spanned, hh0 hh0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        this.f34440a = ptVar;
        this.f34443e = hh0Var;
        this.f34444f = layout.getPaint();
        hh0Var.f35873c = spanned.getSpanStart(hh0Var);
        boolean z13 = hh0Var.f35871a;
        int spanEnd = spanned.getSpanEnd(hh0Var);
        hh0Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(hh0Var.d) != '\n' && spanned.charAt(hh0Var.d - 1) == '\n') {
            hh0Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(hh0Var.f35873c);
        int lineForOffset2 = layout.getLineForOffset(hh0Var.d);
        if (lineForOffset2 - lineForOffset < 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        hh0Var.f35875f = z10;
        if (lineForOffset <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        hh0Var.h = z11;
        if (lineForOffset2 + 1 >= layout.getLineCount()) {
            z12 = true;
        } else {
            z12 = false;
        }
        hh0Var.f35876n = z12;
        if (z13) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (hh0Var.f35875f) {
                i12 = 0;
            } else {
                if (hh0Var.h) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                i12 = i11 + 3;
            }
            this.f34441b = org.telegram.messenger.g0.L(3 - i12) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (hh0Var.f35875f) {
                i14 = 0;
            } else {
                if (hh0Var.f35876n) {
                    i13 = 2;
                } else {
                    i13 = 0;
                }
                i14 = i13 + 3;
            }
            this.f34442c = lineBottom - org.telegram.messenger.g0.L(2 - i14);
        } else {
            int lineTop2 = layout.getLineTop(lineForOffset);
            if (hh0Var.f35875f) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            this.f34441b = org.telegram.messenger.g0.L(3 - i7) + lineTop2;
            int lineBottom2 = layout.getLineBottom(lineForOffset2);
            if (hh0Var.f35875f) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f34442c = lineBottom2 - org.telegram.messenger.g0.L(2 - i10);
        }
        hh0Var.f35877r = false;
        float f10 = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            f10 = Math.max(f10, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                hh0Var.f35877r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(f10);
        if (z13 && ptVar != null && hh0Var.K == null) {
            hh0Var.K = new e0.g(ptVar);
        }
    }

    public final void a(Canvas canvas, int i7, int i10) {
        int L;
        int i11;
        RectF rectF;
        int i12;
        int i13;
        Path.Direction direction;
        hh0 hh0Var = this.f34443e;
        int i14 = hh0Var.J;
        float[] fArr = hh0Var.E;
        boolean z10 = hh0Var.f35871a;
        Paint paint = hh0Var.f35881y;
        Paint paint2 = hh0Var.G;
        Path path = hh0Var.I;
        float[] fArr2 = hh0Var.H;
        Path path2 = hh0Var.F;
        Drawable drawable = hh0Var.f35880x;
        if (i14 != i10) {
            hh0Var.J = i10;
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            paint2.setColor(i10);
            paint.setColor(i0.a.o(i10, 30));
        }
        if (z10) {
            L = i7;
        } else {
            L = org.telegram.messenger.g0.L(32.0f) + this.d;
        }
        if (L >= i7 * 0.95d) {
            i11 = i7;
        } else {
            i11 = L;
        }
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        RectF rectF2 = org.telegram.messenger.g0.P;
        int i15 = this.f34441b;
        float f10 = i15;
        float f11 = i11;
        int i16 = i11;
        int i17 = this.f34442c;
        float f12 = i17;
        rectF2.set(0.0f, f10, f11, f12);
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float L2 = org.telegram.messenger.g0.L(4.0f);
        fArr[5] = L2;
        fArr[4] = L2;
        fArr[3] = L2;
        fArr[2] = L2;
        path2.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path2.addRoundRect(rectF2, fArr, direction2);
        canvas.drawPath(path2, paint);
        if (z10 && this.f34440a != null && hh0Var.K != null) {
            if (this.f34445g == null) {
                this.f34445g = new RectF();
            }
            int L3 = org.telegram.messenger.g0.L(3.333f);
            i12 = i15;
            i13 = i17;
            direction = direction2;
            rectF = rectF2;
            hh0Var.K.d(canvas, this.f34445g, i16 - L3, i17 - L3, i10, hh0Var.f35874e, b());
        } else {
            rectF = rectF2;
            i12 = i15;
            i13 = i17;
            direction = direction2;
        }
        rectF.set(-org.telegram.messenger.g0.L(3.0f), f10, 0.0f, f12);
        float L4 = org.telegram.messenger.g0.L(4.0f);
        fArr2[7] = L4;
        fArr2[6] = L4;
        fArr2[1] = L4;
        fArr2[0] = L4;
        fArr2[5] = 0.0f;
        fArr2[4] = 0.0f;
        fArr2[3] = 0.0f;
        fArr2[2] = 0.0f;
        path.rewind();
        path.addRoundRect(rectF, fArr2, direction);
        canvas.drawPath(path, paint2);
        if (!hh0Var.f35877r) {
            int intrinsicHeight = (int) (((i12 + i13) - drawable.getIntrinsicHeight()) / 2.0f);
            if (intrinsicHeight > org.telegram.messenger.g0.L(8.0f) + i12) {
                intrinsicHeight = org.telegram.messenger.g0.L(4.0f) + i12;
            }
            drawable.setBounds((i16 - drawable.getIntrinsicWidth()) - org.telegram.messenger.g0.L(4.0f), intrinsicHeight, i16 - org.telegram.messenger.g0.L(4.0f), drawable.getIntrinsicHeight() + intrinsicHeight);
            drawable.setAlpha((int) 255.0f);
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean b() {
        if (this.f34443e.f35871a && this.f34442c - this.f34441b > this.f34444f.getTextSize() * 1.3f * 3) {
            return true;
        }
        return false;
    }
}
