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
public final class bi0 {
    public final View f27216a;
    public final int f27217b;
    public final int f27218c;
    public final int d;
    public final fi0 f27219e;
    public final TextPaint f27220f;
    public RectF f27221g;

    public bi0(ot otVar, Layout layout, Spanned spanned, fi0 fi0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        this.f27216a = otVar;
        this.f27219e = fi0Var;
        this.f27220f = layout.getPaint();
        fi0Var.f28438c = spanned.getSpanStart(fi0Var);
        boolean z13 = fi0Var.f28436a;
        int spanEnd = spanned.getSpanEnd(fi0Var);
        fi0Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(fi0Var.d) != '\n' && spanned.charAt(fi0Var.d - 1) == '\n') {
            fi0Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(fi0Var.f28438c);
        int lineForOffset2 = layout.getLineForOffset(fi0Var.d);
        if (lineForOffset2 - lineForOffset < 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        fi0Var.f28440f = z10;
        if (lineForOffset <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        fi0Var.h = z11;
        if (lineForOffset2 + 1 >= layout.getLineCount()) {
            z12 = true;
        } else {
            z12 = false;
        }
        fi0Var.f28441n = z12;
        if (z13) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (fi0Var.f28440f) {
                i12 = 0;
            } else {
                if (fi0Var.h) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                i12 = i11 + 3;
            }
            this.f27217b = AndroidUtilities.dp(3 - i12) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (fi0Var.f28440f) {
                i14 = 0;
            } else {
                if (fi0Var.f28441n) {
                    i13 = 2;
                } else {
                    i13 = 0;
                }
                i14 = i13 + 3;
            }
            this.f27218c = lineBottom - AndroidUtilities.dp(2 - i14);
        } else {
            int lineTop2 = layout.getLineTop(lineForOffset);
            if (fi0Var.f28440f) {
                i9 = 1;
            } else {
                i9 = 2;
            }
            this.f27217b = AndroidUtilities.dp(3 - i9) + lineTop2;
            int lineBottom2 = layout.getLineBottom(lineForOffset2);
            if (fi0Var.f28440f) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f27218c = lineBottom2 - AndroidUtilities.dp(2 - i10);
        }
        fi0Var.f28442r = false;
        float f10 = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            f10 = Math.max(f10, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                fi0Var.f28442r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(f10);
        if (z13 && otVar != null && fi0Var.F == null) {
            fi0Var.F = new xh0(otVar);
        }
    }

    public final void a(Canvas canvas, int i9, int i10) {
        int dp;
        int i11;
        RectF rectF;
        int i12;
        int i13;
        Path.Direction direction;
        fi0 fi0Var = this.f27219e;
        int i14 = fi0Var.E;
        float[] fArr = fi0Var.f28446y;
        boolean z10 = fi0Var.f28436a;
        Paint paint = fi0Var.f28445x;
        Paint paint2 = fi0Var.B;
        Path path = fi0Var.D;
        float[] fArr2 = fi0Var.C;
        Path path2 = fi0Var.A;
        Drawable drawable = fi0Var.f28444w;
        if (i14 != i10) {
            fi0Var.E = i10;
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            paint2.setColor(i10);
            paint.setColor(i0.a.k(i10, 30));
        }
        if (z10) {
            dp = i9;
        } else {
            dp = AndroidUtilities.dp(32.0f) + this.d;
        }
        if (dp >= i9 * 0.95d) {
            i11 = i9;
        } else {
            i11 = dp;
        }
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        RectF rectF2 = AndroidUtilities.rectTmp;
        int i15 = this.f27217b;
        float f10 = i15;
        float f11 = i11;
        int i16 = i11;
        int i17 = this.f27218c;
        float f12 = i17;
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
        if (z10 && this.f27216a != null && fi0Var.F != null) {
            if (this.f27221g == null) {
                this.f27221g = new RectF();
            }
            int dp3 = AndroidUtilities.dp(3.333f);
            i12 = i15;
            i13 = i17;
            direction = direction2;
            rectF = rectF2;
            fi0Var.F.a(canvas, this.f27221g, i16 - dp3, i17 - dp3, i10, fi0Var.f28439e, b());
        } else {
            rectF = rectF2;
            i12 = i15;
            i13 = i17;
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
        if (!fi0Var.f28442r) {
            int intrinsicHeight = (int) (((i12 + i13) - drawable.getIntrinsicHeight()) / 2.0f);
            if (intrinsicHeight > AndroidUtilities.dp(8.0f) + i12) {
                intrinsicHeight = AndroidUtilities.dp(4.0f) + i12;
            }
            drawable.setBounds((i16 - drawable.getIntrinsicWidth()) - AndroidUtilities.dp(4.0f), intrinsicHeight, i16 - AndroidUtilities.dp(4.0f), drawable.getIntrinsicHeight() + intrinsicHeight);
            drawable.setAlpha((int) 255.0f);
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean b() {
        if (this.f27219e.f28436a && this.f27218c - this.f27217b > this.f27220f.getTextSize() * 1.3f * 3) {
            return true;
        }
        return false;
    }
}
