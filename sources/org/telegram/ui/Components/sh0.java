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
public final class sh0 {
    public final View f30242a;
    public final int f30243b;
    public final int f30244c;
    public final int d;
    public final wh0 e;
    public final TextPaint f30245f;
    public RectF f30246g;

    public sh0(qt qtVar, Layout layout, Spanned spanned, wh0 wh0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f30242a = qtVar;
        this.e = wh0Var;
        this.f30245f = layout.getPaint();
        wh0Var.f32186c = spanned.getSpanStart(wh0Var);
        boolean z13 = wh0Var.f32184a;
        int spanEnd = spanned.getSpanEnd(wh0Var);
        wh0Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(wh0Var.d) != '\n' && spanned.charAt(wh0Var.d - 1) == '\n') {
            wh0Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(wh0Var.f32186c);
        int lineForOffset2 = layout.getLineForOffset(wh0Var.d);
        if (lineForOffset2 - lineForOffset < 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        wh0Var.f32187f = z10;
        if (lineForOffset <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        wh0Var.h = z11;
        if (lineForOffset2 + 1 >= layout.getLineCount()) {
            z12 = true;
        } else {
            z12 = false;
        }
        wh0Var.f32188n = z12;
        if (z13) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (wh0Var.f32187f) {
                i13 = 0;
            } else {
                if (wh0Var.h) {
                    i12 = 2;
                } else {
                    i12 = 0;
                }
                i13 = i12 + 3;
            }
            this.f30243b = org.telegram.messenger.i0.L(3 - i13) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (wh0Var.f32187f) {
                i15 = 0;
            } else {
                if (wh0Var.f32188n) {
                    i14 = 2;
                } else {
                    i14 = 0;
                }
                i15 = i14 + 3;
            }
            this.f30244c = lineBottom - org.telegram.messenger.i0.L(2 - i15);
        } else {
            int lineTop2 = layout.getLineTop(lineForOffset);
            if (wh0Var.f32187f) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f30243b = org.telegram.messenger.i0.L(3 - i10) + lineTop2;
            int lineBottom2 = layout.getLineBottom(lineForOffset2);
            if (wh0Var.f32187f) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f30244c = lineBottom2 - org.telegram.messenger.i0.L(2 - i11);
        }
        wh0Var.f32189r = false;
        float f7 = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            f7 = Math.max(f7, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                wh0Var.f32189r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(f7);
        if (z13 && qtVar != null && wh0Var.J == null) {
            wh0Var.J = new e0.h(qtVar);
        }
    }

    public final void a(Canvas canvas, int i10, int i11) {
        int L;
        int i12;
        RectF rectF;
        int i13;
        int i14;
        Path.Direction direction;
        wh0 wh0Var = this.e;
        int i15 = wh0Var.I;
        float[] fArr = wh0Var.D;
        boolean z10 = wh0Var.f32184a;
        Paint paint = wh0Var.f32193y;
        Paint paint2 = wh0Var.F;
        Path path = wh0Var.H;
        float[] fArr2 = wh0Var.G;
        Path path2 = wh0Var.E;
        Drawable drawable = wh0Var.f32192x;
        if (i15 != i11) {
            wh0Var.I = i11;
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
            paint2.setColor(i11);
            paint.setColor(i0.b.o(i11, 30));
        }
        if (z10) {
            L = i10;
        } else {
            L = org.telegram.messenger.i0.L(32.0f) + this.d;
        }
        if (L >= i10 * 0.95d) {
            i12 = i10;
        } else {
            i12 = L;
        }
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        RectF rectF2 = org.telegram.messenger.i0.P;
        int i16 = this.f30243b;
        float f7 = i16;
        float f10 = i12;
        int i17 = i12;
        int i18 = this.f30244c;
        float f11 = i18;
        rectF2.set(0.0f, f7, f10, f11);
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float L2 = org.telegram.messenger.i0.L(4.0f);
        fArr[5] = L2;
        fArr[4] = L2;
        fArr[3] = L2;
        fArr[2] = L2;
        path2.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path2.addRoundRect(rectF2, fArr, direction2);
        canvas.drawPath(path2, paint);
        if (z10 && this.f30242a != null && wh0Var.J != null) {
            if (this.f30246g == null) {
                this.f30246g = new RectF();
            }
            int L3 = org.telegram.messenger.i0.L(3.333f);
            i13 = i16;
            i14 = i18;
            direction = direction2;
            rectF = rectF2;
            wh0Var.J.d(canvas, this.f30246g, i17 - L3, i18 - L3, i11, wh0Var.e, b());
        } else {
            rectF = rectF2;
            i13 = i16;
            i14 = i18;
            direction = direction2;
        }
        rectF.set(-org.telegram.messenger.i0.L(3.0f), f7, 0.0f, f11);
        float L4 = org.telegram.messenger.i0.L(4.0f);
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
        if (!wh0Var.f32189r) {
            int intrinsicHeight = (int) (((i13 + i14) - drawable.getIntrinsicHeight()) / 2.0f);
            if (intrinsicHeight > org.telegram.messenger.i0.L(8.0f) + i13) {
                intrinsicHeight = org.telegram.messenger.i0.L(4.0f) + i13;
            }
            drawable.setBounds((i17 - drawable.getIntrinsicWidth()) - org.telegram.messenger.i0.L(4.0f), intrinsicHeight, i17 - org.telegram.messenger.i0.L(4.0f), drawable.getIntrinsicHeight() + intrinsicHeight);
            drawable.setAlpha((int) 255.0f);
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean b() {
        if (this.e.f32184a && this.f30244c - this.f30243b > this.f30245f.getTextSize() * 1.3f * 3) {
            return true;
        }
        return false;
    }
}
