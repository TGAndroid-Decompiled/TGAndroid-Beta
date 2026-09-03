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
public final class wi0 {
    public final View f30296a;
    public final int f30297b;
    public final int f30298c;
    public final int d;
    public final aj0 e;
    public final TextPaint f30299f;
    public RectF f30300g;

    public wi0(wt wtVar, Layout layout, Spanned spanned, aj0 aj0Var) {
        boolean z4;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f30296a = wtVar;
        this.e = aj0Var;
        this.f30299f = layout.getPaint();
        aj0Var.f23385c = spanned.getSpanStart(aj0Var);
        boolean z12 = aj0Var.f23383a;
        int spanEnd = spanned.getSpanEnd(aj0Var);
        aj0Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(aj0Var.d) != '\n' && spanned.charAt(aj0Var.d - 1) == '\n') {
            aj0Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(aj0Var.f23385c);
        int lineForOffset2 = layout.getLineForOffset(aj0Var.d);
        if (lineForOffset2 - lineForOffset < 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        aj0Var.f23386f = z4;
        if (lineForOffset <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aj0Var.h = z10;
        if (lineForOffset2 + 1 >= layout.getLineCount()) {
            z11 = true;
        } else {
            z11 = false;
        }
        aj0Var.f23387n = z11;
        if (z12) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (aj0Var.f23386f) {
                i13 = 0;
            } else {
                if (aj0Var.h) {
                    i12 = 2;
                } else {
                    i12 = 0;
                }
                i13 = i12 + 3;
            }
            this.f30297b = AndroidUtilities.dp(3 - i13) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (aj0Var.f23386f) {
                i15 = 0;
            } else {
                if (aj0Var.f23387n) {
                    i14 = 2;
                } else {
                    i14 = 0;
                }
                i15 = i14 + 3;
            }
            this.f30298c = lineBottom - AndroidUtilities.dp(2 - i15);
        } else {
            int lineTop2 = layout.getLineTop(lineForOffset);
            if (aj0Var.f23386f) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f30297b = AndroidUtilities.dp(3 - i10) + lineTop2;
            int lineBottom2 = layout.getLineBottom(lineForOffset2);
            if (aj0Var.f23386f) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f30298c = lineBottom2 - AndroidUtilities.dp(2 - i11);
        }
        aj0Var.f23388r = false;
        float f10 = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            f10 = Math.max(f10, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                aj0Var.f23388r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(f10);
        if (z12 && wtVar != null && aj0Var.G == null) {
            aj0Var.G = new si0(wtVar);
        }
    }

    public final void a(Canvas canvas, int i10, int i11) {
        int dp;
        int i12;
        RectF rectF;
        int i13;
        int i14;
        Path.Direction direction;
        aj0 aj0Var = this.e;
        int i15 = aj0Var.F;
        float[] fArr = aj0Var.f23392y;
        boolean z4 = aj0Var.f23383a;
        Paint paint = aj0Var.f23391x;
        Paint paint2 = aj0Var.C;
        Path path = aj0Var.E;
        float[] fArr2 = aj0Var.D;
        Path path2 = aj0Var.B;
        Drawable drawable = aj0Var.f23390w;
        if (i15 != i11) {
            aj0Var.F = i11;
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
        int i16 = this.f30297b;
        float f10 = i16;
        float f11 = i12;
        int i17 = i12;
        int i18 = this.f30298c;
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
        if (z4 && this.f30296a != null && aj0Var.G != null) {
            if (this.f30300g == null) {
                this.f30300g = new RectF();
            }
            int dp3 = AndroidUtilities.dp(3.333f);
            i13 = i16;
            i14 = i18;
            direction = direction2;
            rectF = rectF2;
            aj0Var.G.a(canvas, this.f30300g, i17 - dp3, i18 - dp3, i11, aj0Var.e, b());
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
        if (!aj0Var.f23388r) {
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
        if (this.e.f23383a && this.f30298c - this.f30297b > this.f30299f.getTextSize() * 1.3f * 3) {
            return true;
        }
        return false;
    }
}
