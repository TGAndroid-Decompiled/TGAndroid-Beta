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
public final class qg0 {
    public final View f37320a;
    public final int f37321b;
    public final int f37322c;
    public final int d;
    public final ug0 f37323e;
    public final TextPaint f37324f;
    public RectF f37325g;

    public qg0(dt dtVar, Layout layout, Spanned spanned, ug0 ug0Var) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        this.f37320a = dtVar;
        this.f37323e = ug0Var;
        this.f37324f = layout.getPaint();
        ug0Var.f38637c = spanned.getSpanStart(ug0Var);
        boolean z12 = ug0Var.f38635a;
        int spanEnd = spanned.getSpanEnd(ug0Var);
        ug0Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(ug0Var.d) != '\n' && spanned.charAt(ug0Var.d - 1) == '\n') {
            ug0Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(ug0Var.f38637c);
        int lineForOffset2 = layout.getLineForOffset(ug0Var.d);
        if (lineForOffset2 - lineForOffset < 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        ug0Var.f38639f = z9;
        if (lineForOffset <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ug0Var.h = z10;
        if (lineForOffset2 + 1 >= layout.getLineCount()) {
            z11 = true;
        } else {
            z11 = false;
        }
        ug0Var.f38640n = z11;
        if (z12) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (ug0Var.f38639f) {
                i12 = 0;
            } else {
                if (ug0Var.h) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                i12 = i11 + 3;
            }
            this.f37321b = org.telegram.messenger.g0.L(3 - i12) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (ug0Var.f38639f) {
                i14 = 0;
            } else {
                if (ug0Var.f38640n) {
                    i13 = 2;
                } else {
                    i13 = 0;
                }
                i14 = i13 + 3;
            }
            this.f37322c = lineBottom - org.telegram.messenger.g0.L(2 - i14);
        } else {
            int lineTop2 = layout.getLineTop(lineForOffset);
            if (ug0Var.f38639f) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            this.f37321b = org.telegram.messenger.g0.L(3 - i7) + lineTop2;
            int lineBottom2 = layout.getLineBottom(lineForOffset2);
            if (ug0Var.f38639f) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f37322c = lineBottom2 - org.telegram.messenger.g0.L(2 - i10);
        }
        ug0Var.f38641r = false;
        float f10 = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            f10 = Math.max(f10, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                ug0Var.f38641r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(f10);
        if (z12 && dtVar != null && ug0Var.J == null) {
            ug0Var.J = new e0.g(dtVar);
        }
    }

    public final void a(Canvas canvas, int i7, int i10) {
        int L;
        int i11;
        RectF rectF;
        int i12;
        int i13;
        Path.Direction direction;
        ug0 ug0Var = this.f37323e;
        int i14 = ug0Var.I;
        float[] fArr = ug0Var.D;
        boolean z9 = ug0Var.f38635a;
        Paint paint = ug0Var.f38645y;
        Paint paint2 = ug0Var.F;
        Path path = ug0Var.H;
        float[] fArr2 = ug0Var.G;
        Path path2 = ug0Var.E;
        Drawable drawable = ug0Var.f38644x;
        if (i14 != i10) {
            ug0Var.I = i10;
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            paint2.setColor(i10);
            paint.setColor(i0.a.o(i10, 30));
        }
        if (z9) {
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
        int i15 = this.f37321b;
        float f10 = i15;
        float f11 = i11;
        int i16 = i11;
        int i17 = this.f37322c;
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
        if (z9 && this.f37320a != null && ug0Var.J != null) {
            if (this.f37325g == null) {
                this.f37325g = new RectF();
            }
            int L3 = org.telegram.messenger.g0.L(3.333f);
            i12 = i15;
            i13 = i17;
            direction = direction2;
            rectF = rectF2;
            ug0Var.J.d(canvas, this.f37325g, i16 - L3, i17 - L3, i10, ug0Var.f38638e, b());
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
        if (!ug0Var.f38641r) {
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
        if (this.f37323e.f38635a && this.f37322c - this.f37321b > this.f37324f.getTextSize() * 1.3f * 3) {
            return true;
        }
        return false;
    }
}
