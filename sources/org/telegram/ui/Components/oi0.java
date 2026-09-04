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
public final class oi0 {
    public final View f29076a;
    public final int f29077b;
    public final int f29078c;
    public final int d;
    public final si0 f29079e;
    public final TextPaint f29080f;
    public RectF f29081g;

    public oi0(bu buVar, Layout layout, Spanned spanned, si0 si0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f29076a = buVar;
        this.f29079e = si0Var;
        this.f29080f = layout.getPaint();
        si0Var.f30310c = spanned.getSpanStart(si0Var);
        boolean z13 = si0Var.f30308a;
        int spanEnd = spanned.getSpanEnd(si0Var);
        si0Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(si0Var.d) != '\n' && spanned.charAt(si0Var.d - 1) == '\n') {
            si0Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(si0Var.f30310c);
        int lineForOffset2 = layout.getLineForOffset(si0Var.d);
        if (lineForOffset2 - lineForOffset < 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        si0Var.f30312f = z10;
        if (lineForOffset <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        si0Var.h = z11;
        if (lineForOffset2 + 1 >= layout.getLineCount()) {
            z12 = true;
        } else {
            z12 = false;
        }
        si0Var.f30313n = z12;
        if (z13) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (si0Var.f30312f) {
                i13 = 0;
            } else {
                if (si0Var.h) {
                    i12 = 2;
                } else {
                    i12 = 0;
                }
                i13 = i12 + 3;
            }
            this.f29077b = AndroidUtilities.dp(3 - i13) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (si0Var.f30312f) {
                i15 = 0;
            } else {
                if (si0Var.f30313n) {
                    i14 = 2;
                } else {
                    i14 = 0;
                }
                i15 = i14 + 3;
            }
            this.f29078c = lineBottom - AndroidUtilities.dp(2 - i15);
        } else {
            int lineTop2 = layout.getLineTop(lineForOffset);
            if (si0Var.f30312f) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f29077b = AndroidUtilities.dp(3 - i10) + lineTop2;
            int lineBottom2 = layout.getLineBottom(lineForOffset2);
            if (si0Var.f30312f) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f29078c = lineBottom2 - AndroidUtilities.dp(2 - i11);
        }
        si0Var.f30314r = false;
        float f7 = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            f7 = Math.max(f7, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                si0Var.f30314r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(f7);
        if (z13 && buVar != null && si0Var.J == null) {
            si0Var.J = new ki0(buVar);
        }
    }

    public final void a(Canvas canvas, int i10, int i11) {
        int dp;
        int i12;
        RectF rectF;
        int i13;
        int i14;
        Path.Direction direction;
        si0 si0Var = this.f29079e;
        int i15 = si0Var.I;
        float[] fArr = si0Var.f30318y;
        boolean z10 = si0Var.f30308a;
        Paint paint = si0Var.f30317x;
        Paint paint2 = si0Var.F;
        Path path = si0Var.H;
        float[] fArr2 = si0Var.G;
        Path path2 = si0Var.E;
        Drawable drawable = si0Var.f30316w;
        if (i15 != i11) {
            si0Var.I = i11;
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
            paint2.setColor(i11);
            paint.setColor(i0.a.k(i11, 30));
        }
        if (z10) {
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
        int i16 = this.f29077b;
        float f7 = i16;
        float f10 = i12;
        int i17 = i12;
        int i18 = this.f29078c;
        float f11 = i18;
        rectF2.set(0.0f, f7, f10, f11);
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
        if (z10 && this.f29076a != null && si0Var.J != null) {
            if (this.f29081g == null) {
                this.f29081g = new RectF();
            }
            int dp3 = AndroidUtilities.dp(3.333f);
            i13 = i16;
            i14 = i18;
            direction = direction2;
            rectF = rectF2;
            si0Var.J.a(canvas, this.f29081g, i17 - dp3, i18 - dp3, i11, si0Var.f30311e, b());
        } else {
            rectF = rectF2;
            i13 = i16;
            i14 = i18;
            direction = direction2;
        }
        rectF.set(-AndroidUtilities.dp(3.0f), f7, 0.0f, f11);
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
        if (!si0Var.f30314r) {
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
        if (this.f29079e.f30308a && this.f29078c - this.f29077b > this.f29080f.getTextSize() * 1.3f * 3) {
            return true;
        }
        return false;
    }
}
