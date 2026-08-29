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
public final class mi0 {
    public final View f30707a;
    public final int f30708b;
    public final int f30709c;
    public final int d;
    public final qi0 f30710e;
    public final TextPaint f30711f;
    public RectF f30712g;

    public mi0(ut utVar, Layout layout, Spanned spanned, qi0 qi0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f30707a = utVar;
        this.f30710e = qi0Var;
        this.f30711f = layout.getPaint();
        qi0Var.f31958c = spanned.getSpanStart(qi0Var);
        boolean z13 = qi0Var.f31956a;
        int spanEnd = spanned.getSpanEnd(qi0Var);
        qi0Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(qi0Var.d) != '\n' && spanned.charAt(qi0Var.d - 1) == '\n') {
            qi0Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(qi0Var.f31958c);
        int lineForOffset2 = layout.getLineForOffset(qi0Var.d);
        if (lineForOffset2 - lineForOffset < 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        qi0Var.f31960f = z10;
        if (lineForOffset <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        qi0Var.h = z11;
        if (lineForOffset2 + 1 >= layout.getLineCount()) {
            z12 = true;
        } else {
            z12 = false;
        }
        qi0Var.f31961n = z12;
        if (z13) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (qi0Var.f31960f) {
                i13 = 0;
            } else {
                if (qi0Var.h) {
                    i12 = 2;
                } else {
                    i12 = 0;
                }
                i13 = i12 + 3;
            }
            this.f30708b = AndroidUtilities.dp(3 - i13) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (qi0Var.f31960f) {
                i15 = 0;
            } else {
                if (qi0Var.f31961n) {
                    i14 = 2;
                } else {
                    i14 = 0;
                }
                i15 = i14 + 3;
            }
            this.f30709c = lineBottom - AndroidUtilities.dp(2 - i15);
        } else {
            int lineTop2 = layout.getLineTop(lineForOffset);
            if (qi0Var.f31960f) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f30708b = AndroidUtilities.dp(3 - i10) + lineTop2;
            int lineBottom2 = layout.getLineBottom(lineForOffset2);
            if (qi0Var.f31960f) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f30709c = lineBottom2 - AndroidUtilities.dp(2 - i11);
        }
        qi0Var.f31962r = false;
        float f9 = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            f9 = Math.max(f9, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                qi0Var.f31962r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(f9);
        if (z13 && utVar != null && qi0Var.F == null) {
            qi0Var.F = new hi0(utVar);
        }
    }

    public final void a(Canvas canvas, int i10, int i11) {
        int dp;
        int i12;
        RectF rectF;
        int i13;
        int i14;
        Path.Direction direction;
        qi0 qi0Var = this.f30710e;
        int i15 = qi0Var.E;
        float[] fArr = qi0Var.f31966y;
        boolean z10 = qi0Var.f31956a;
        Paint paint = qi0Var.f31965x;
        Paint paint2 = qi0Var.B;
        Path path = qi0Var.D;
        float[] fArr2 = qi0Var.C;
        Path path2 = qi0Var.A;
        Drawable drawable = qi0Var.f31964w;
        if (i15 != i11) {
            qi0Var.E = i11;
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
        int i16 = this.f30708b;
        float f9 = i16;
        float f10 = i12;
        int i17 = i12;
        int i18 = this.f30709c;
        float f11 = i18;
        rectF2.set(0.0f, f9, f10, f11);
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
        if (z10 && this.f30707a != null && qi0Var.F != null) {
            if (this.f30712g == null) {
                this.f30712g = new RectF();
            }
            int dp3 = AndroidUtilities.dp(3.333f);
            i13 = i16;
            i14 = i18;
            direction = direction2;
            rectF = rectF2;
            qi0Var.F.a(canvas, this.f30712g, i17 - dp3, i18 - dp3, i11, qi0Var.f31959e, b());
        } else {
            rectF = rectF2;
            i13 = i16;
            i14 = i18;
            direction = direction2;
        }
        rectF.set(-AndroidUtilities.dp(3.0f), f9, 0.0f, f11);
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
        if (!qi0Var.f31962r) {
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
        if (this.f30710e.f31956a && this.f30709c - this.f30708b > this.f30711f.getTextSize() * 1.3f * 3) {
            return true;
        }
        return false;
    }
}
