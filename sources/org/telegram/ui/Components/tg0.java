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
public final class tg0 {
    public final View f39696a;
    public final int f39697b;
    public final int f39698c;
    public final int d;
    public final xg0 f39699e;
    public final TextPaint f39700f;
    public RectF f39701g;

    public tg0(kt ktVar, Layout layout, Spanned spanned, xg0 xg0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        this.f39696a = ktVar;
        this.f39699e = xg0Var;
        this.f39700f = layout.getPaint();
        xg0Var.f41686c = spanned.getSpanStart(xg0Var);
        boolean z13 = xg0Var.f41684a;
        int spanEnd = spanned.getSpanEnd(xg0Var);
        xg0Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(xg0Var.d) != '\n' && spanned.charAt(xg0Var.d - 1) == '\n') {
            xg0Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(xg0Var.f41686c);
        int lineForOffset2 = layout.getLineForOffset(xg0Var.d);
        if (lineForOffset2 - lineForOffset < 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        xg0Var.f41688f = z10;
        if (lineForOffset <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        xg0Var.h = z11;
        if (lineForOffset2 + 1 >= layout.getLineCount()) {
            z12 = true;
        } else {
            z12 = false;
        }
        xg0Var.f41689n = z12;
        if (z13) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (xg0Var.f41688f) {
                i12 = 0;
            } else {
                if (xg0Var.h) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                i12 = i11 + 3;
            }
            this.f39697b = org.telegram.messenger.g0.L(3 - i12) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (xg0Var.f41688f) {
                i14 = 0;
            } else {
                if (xg0Var.f41689n) {
                    i13 = 2;
                } else {
                    i13 = 0;
                }
                i14 = i13 + 3;
            }
            this.f39698c = lineBottom - org.telegram.messenger.g0.L(2 - i14);
        } else {
            int lineTop2 = layout.getLineTop(lineForOffset);
            if (xg0Var.f41688f) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            this.f39697b = org.telegram.messenger.g0.L(3 - i7) + lineTop2;
            int lineBottom2 = layout.getLineBottom(lineForOffset2);
            if (xg0Var.f41688f) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f39698c = lineBottom2 - org.telegram.messenger.g0.L(2 - i10);
        }
        xg0Var.f41690r = false;
        float f10 = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            f10 = Math.max(f10, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                xg0Var.f41690r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(f10);
        if (z13 && ktVar != null && xg0Var.K == null) {
            xg0Var.K = new e0.g(ktVar);
        }
    }

    public final void a(Canvas canvas, int i7, int i10) {
        int L;
        int i11;
        RectF rectF;
        int i12;
        int i13;
        Path.Direction direction;
        xg0 xg0Var = this.f39699e;
        int i14 = xg0Var.J;
        float[] fArr = xg0Var.E;
        boolean z10 = xg0Var.f41684a;
        Paint paint = xg0Var.f41694y;
        Paint paint2 = xg0Var.G;
        Path path = xg0Var.I;
        float[] fArr2 = xg0Var.H;
        Path path2 = xg0Var.F;
        Drawable drawable = xg0Var.f41693x;
        if (i14 != i10) {
            xg0Var.J = i10;
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
        int i15 = this.f39697b;
        float f10 = i15;
        float f11 = i11;
        int i16 = i11;
        int i17 = this.f39698c;
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
        if (z10 && this.f39696a != null && xg0Var.K != null) {
            if (this.f39701g == null) {
                this.f39701g = new RectF();
            }
            int L3 = org.telegram.messenger.g0.L(3.333f);
            i12 = i15;
            i13 = i17;
            direction = direction2;
            rectF = rectF2;
            xg0Var.K.d(canvas, this.f39701g, i16 - L3, i17 - L3, i10, xg0Var.f41687e, b());
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
        if (!xg0Var.f41690r) {
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
        if (this.f39699e.f41684a && this.f39698c - this.f39697b > this.f39700f.getTextSize() * 1.3f * 3) {
            return true;
        }
        return false;
    }
}
