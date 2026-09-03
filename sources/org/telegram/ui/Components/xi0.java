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
import org.telegram.messenger.AndroidUtilities;
public final class xi0 {
    public final View f33114a;
    public final int f33115b;
    public final int f33116c;
    public final int d;
    public final bj0 f33117e;
    public final TextPaint f33118f;
    public RectF f33119g;

    public xi0(zt ztVar, Layout layout, Spanned spanned, bj0 bj0Var) {
        boolean z4;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f33114a = ztVar;
        this.f33117e = bj0Var;
        this.f33118f = layout.getPaint();
        bj0Var.f25619c = spanned.getSpanStart(bj0Var);
        boolean z12 = bj0Var.f25617a;
        int spanEnd = spanned.getSpanEnd(bj0Var);
        bj0Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(bj0Var.d) != '\n' && spanned.charAt(bj0Var.d - 1) == '\n') {
            bj0Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(bj0Var.f25619c);
        int lineForOffset2 = layout.getLineForOffset(bj0Var.d);
        if (lineForOffset2 - lineForOffset < 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        bj0Var.f25621f = z4;
        if (lineForOffset <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bj0Var.h = z10;
        if (lineForOffset2 + 1 >= layout.getLineCount()) {
            z11 = true;
        } else {
            z11 = false;
        }
        bj0Var.f25622n = z11;
        if (z12) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (bj0Var.f25621f) {
                i13 = 0;
            } else {
                if (bj0Var.h) {
                    i12 = 2;
                } else {
                    i12 = 0;
                }
                i13 = i12 + 3;
            }
            this.f33115b = AndroidUtilities.dp(3 - i13) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (bj0Var.f25621f) {
                i15 = 0;
            } else {
                if (bj0Var.f25622n) {
                    i14 = 2;
                } else {
                    i14 = 0;
                }
                i15 = i14 + 3;
            }
            this.f33116c = lineBottom - AndroidUtilities.dp(2 - i15);
        } else {
            int lineTop2 = layout.getLineTop(lineForOffset);
            if (bj0Var.f25621f) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f33115b = AndroidUtilities.dp(3 - i10) + lineTop2;
            int lineBottom2 = layout.getLineBottom(lineForOffset2);
            if (bj0Var.f25621f) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f33116c = lineBottom2 - AndroidUtilities.dp(2 - i11);
        }
        bj0Var.f25623r = false;
        float f10 = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            f10 = Math.max(f10, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                bj0Var.f25623r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(f10);
        if (z12 && ztVar != null && bj0Var.G == null) {
            bj0Var.G = new ti0(ztVar);
        }
    }

    public final void a(Canvas canvas, int i10, int i11) {
        int dp;
        int i12;
        RectF rectF;
        int i13;
        int i14;
        Path.Direction direction;
        bj0 bj0Var = this.f33117e;
        int i15 = bj0Var.F;
        float[] fArr = bj0Var.f25627y;
        boolean z4 = bj0Var.f25617a;
        Paint paint = bj0Var.f25626x;
        Paint paint2 = bj0Var.C;
        Path path = bj0Var.E;
        float[] fArr2 = bj0Var.D;
        Path path2 = bj0Var.B;
        Drawable drawable = bj0Var.f25625w;
        if (i15 != i11) {
            bj0Var.F = i11;
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
            paint2.setColor(i11);
            paint.setColor(i0.a.k(i11, 30));
        }
        if (z4) {
            dp = i10;
        } else {
            dp = AndroidUtilities.dp(32.0f) + this.d;
        }
        if (dp >= i10 * 0.95d) {
            i12 = i10;
        } else {
            i12 = dp;
        }
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        RectF rectF2 = AndroidUtilities.rectTmp;
        int i16 = this.f33115b;
        float f10 = i16;
        float f11 = i12;
        int i17 = i12;
        int i18 = this.f33116c;
        float f12 = i18;
        rectF2.set(0.0f, f10, f11, f12);
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float dp2 = AndroidUtilities.dp(4.0f);
        fArr[5] = dp2;
        fArr[4] = dp2;
        fArr[3] = dp2;
        fArr[2] = dp2;
        path2.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path2.addRoundRect(rectF2, fArr, direction2);
        canvas.drawPath(path2, paint);
        if (z4 && this.f33114a != null && bj0Var.G != null) {
            if (this.f33119g == null) {
                this.f33119g = new RectF();
            }
            int dp3 = AndroidUtilities.dp(3.333f);
            i13 = i16;
            i14 = i18;
            direction = direction2;
            rectF = rectF2;
            bj0Var.G.a(canvas, this.f33119g, i17 - dp3, i18 - dp3, i11, bj0Var.f25620e, b());
        } else {
            rectF = rectF2;
            i13 = i16;
            i14 = i18;
            direction = direction2;
        }
        rectF.set(-AndroidUtilities.dp(3.0f), f10, 0.0f, f12);
        float dp4 = AndroidUtilities.dp(4.0f);
        fArr2[7] = dp4;
        fArr2[6] = dp4;
        fArr2[1] = dp4;
        fArr2[0] = dp4;
        fArr2[5] = 0.0f;
        fArr2[4] = 0.0f;
        fArr2[3] = 0.0f;
        fArr2[2] = 0.0f;
        path.rewind();
        path.addRoundRect(rectF, fArr2, direction);
        canvas.drawPath(path, paint2);
        if (!bj0Var.f25623r) {
            int intrinsicHeight = (int) (((i13 + i14) - drawable.getIntrinsicHeight()) / 2.0f);
            if (intrinsicHeight > AndroidUtilities.dp(8.0f) + i13) {
                intrinsicHeight = AndroidUtilities.dp(4.0f) + i13;
            }
            drawable.setBounds((i17 - drawable.getIntrinsicWidth()) - AndroidUtilities.dp(4.0f), intrinsicHeight, i17 - AndroidUtilities.dp(4.0f), drawable.getIntrinsicHeight() + intrinsicHeight);
            drawable.setAlpha((int) 255.0f);
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean b() {
        if (this.f33117e.f25617a && this.f33116c - this.f33115b > this.f33118f.getTextSize() * 1.3f * 3) {
            return true;
        }
        return false;
    }
}
