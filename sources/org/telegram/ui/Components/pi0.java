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
public final class pi0 {
    public final View f27051a;
    public final int f27052b;
    public final int f27053c;
    public final int d;
    public final ti0 e;
    public final TextPaint f27054f;
    public RectF f27055g;

    public pi0(du duVar, Layout layout, Spanned spanned, ti0 ti0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f27051a = duVar;
        this.e = ti0Var;
        this.f27054f = layout.getPaint();
        ti0Var.f28106c = spanned.getSpanStart(ti0Var);
        boolean z13 = ti0Var.f28104a;
        int spanEnd = spanned.getSpanEnd(ti0Var);
        ti0Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(ti0Var.d) != '\n' && spanned.charAt(ti0Var.d - 1) == '\n') {
            ti0Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(ti0Var.f28106c);
        int lineForOffset2 = layout.getLineForOffset(ti0Var.d);
        if (lineForOffset2 - lineForOffset < 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        ti0Var.f28107f = z10;
        if (lineForOffset <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ti0Var.h = z11;
        if (lineForOffset2 + 1 >= layout.getLineCount()) {
            z12 = true;
        } else {
            z12 = false;
        }
        ti0Var.f28108n = z12;
        if (z13) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (ti0Var.f28107f) {
                i13 = 0;
            } else {
                if (ti0Var.h) {
                    i12 = 2;
                } else {
                    i12 = 0;
                }
                i13 = i12 + 3;
            }
            this.f27052b = AndroidUtilities.dp(3 - i13) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (ti0Var.f28107f) {
                i15 = 0;
            } else {
                if (ti0Var.f28108n) {
                    i14 = 2;
                } else {
                    i14 = 0;
                }
                i15 = i14 + 3;
            }
            this.f27053c = lineBottom - AndroidUtilities.dp(2 - i15);
        } else {
            int lineTop2 = layout.getLineTop(lineForOffset);
            if (ti0Var.f28107f) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f27052b = AndroidUtilities.dp(3 - i10) + lineTop2;
            int lineBottom2 = layout.getLineBottom(lineForOffset2);
            if (ti0Var.f28107f) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f27053c = lineBottom2 - AndroidUtilities.dp(2 - i11);
        }
        ti0Var.f28109r = false;
        float f7 = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            f7 = Math.max(f7, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                ti0Var.f28109r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(f7);
        if (z13 && duVar != null && ti0Var.J == null) {
            ti0Var.J = new li0(duVar);
        }
    }

    public final void a(Canvas canvas, int i10, int i11) {
        int dp;
        int i12;
        RectF rectF;
        int i13;
        int i14;
        Path.Direction direction;
        ti0 ti0Var = this.e;
        int i15 = ti0Var.I;
        float[] fArr = ti0Var.f28113y;
        boolean z10 = ti0Var.f28104a;
        Paint paint = ti0Var.f28112x;
        Paint paint2 = ti0Var.F;
        Path path = ti0Var.H;
        float[] fArr2 = ti0Var.G;
        Path path2 = ti0Var.E;
        Drawable drawable = ti0Var.f28111w;
        if (i15 != i11) {
            ti0Var.I = i11;
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
        int i16 = this.f27052b;
        float f7 = i16;
        float f10 = i12;
        int i17 = i12;
        int i18 = this.f27053c;
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
        if (z10 && this.f27051a != null && ti0Var.J != null) {
            if (this.f27055g == null) {
                this.f27055g = new RectF();
            }
            int dp3 = AndroidUtilities.dp(3.333f);
            i13 = i16;
            i14 = i18;
            direction = direction2;
            rectF = rectF2;
            ti0Var.J.a(canvas, this.f27055g, i17 - dp3, i18 - dp3, i11, ti0Var.e, b());
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
        if (!ti0Var.f28109r) {
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
        if (this.e.f28104a && this.f27053c - this.f27052b > this.f27054f.getTextSize() * 1.3f * 3) {
            return true;
        }
        return false;
    }
}
