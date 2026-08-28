package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class ky0 {
    public my0 f30264a;
    public jy0 f30265b;
    public TL_iv.pageTableCell f30266c;
    public final int d;
    public int f30267e;
    public int f30268f;
    public int f30269g;
    public int h;
    public int f30270i;
    public int f30271j;
    public int f30272k;
    public int f30273l;
    public int f30274m;
    public int f30275n;
    public int f30276o;
    public int f30277p;
    public int f30278q;
    public int f30279r = -1;
    public final ry0 f30280s;

    public ky0(ry0 ry0Var, int i9) {
        this.f30280s = ry0Var;
        this.d = i9;
    }

    public final void a(Canvas canvas, View view, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i9;
        int i10;
        int i11;
        Paint paint;
        int i12;
        Paint paint2;
        int i13;
        float f10;
        float f11;
        float f12;
        float f13;
        RectF rectF;
        int i14;
        int i15;
        int i16;
        org.telegram.ui.Cells.n9 n9Var;
        Canvas canvas2 = canvas;
        if (this.f30266c != null) {
            int i17 = this.f30277p + this.f30272k;
            ry0 ry0Var = this.f30280s;
            int i18 = ry0Var.f32320y;
            Path path = ry0Var.H;
            qy0 qy0Var = ry0Var.K;
            float[] fArr = ry0Var.J;
            RectF rectF2 = ry0Var.I;
            if (i17 == i18) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f30278q + this.f30273l == ry0Var.A) {
                z12 = true;
            } else {
                z12 = false;
            }
            int dp = AndroidUtilities.dp(8.0f);
            boolean z15 = this.f30266c.header;
            if (z15 || (ry0Var.D && this.f30264a.f30947a.f31476b.f30584a % 2 == 0)) {
                int i19 = this.f30277p;
                if (i19 == 0 && this.f30278q == 0) {
                    float f14 = dp;
                    fArr[1] = f14;
                    fArr[0] = f14;
                    z13 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    z13 = false;
                }
                if (z11 && this.f30278q == 0) {
                    float f15 = dp;
                    fArr[3] = f15;
                    fArr[2] = f15;
                    z13 = true;
                } else {
                    fArr[3] = 0.0f;
                    fArr[2] = 0.0f;
                }
                if (z11 && z12) {
                    float f16 = dp;
                    fArr[5] = f16;
                    fArr[4] = f16;
                    z13 = true;
                } else {
                    fArr[5] = 0.0f;
                    fArr[4] = 0.0f;
                }
                if (i19 == 0 && z12) {
                    float f17 = dp;
                    fArr[7] = f17;
                    fArr[6] = f17;
                    z14 = true;
                } else {
                    fArr[7] = 0.0f;
                    fArr[6] = 0.0f;
                    z14 = z13;
                }
                if (z14) {
                    rectF2.set(i19, this.f30278q, i19 + this.f30272k, i11 + this.f30273l);
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.f30266c.header) {
                        canvas2.drawPath(path, qy0Var.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, qy0Var.getStripPaint());
                    }
                } else if (z15) {
                    canvas2.drawRect(i19, this.f30278q, i19 + this.f30272k, i10 + this.f30273l, qy0Var.getHeaderPaint());
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i19, this.f30278q, this.f30272k + i19, i9 + this.f30273l, qy0Var.getStripPaint());
                }
            }
            if (z10 && this.f30265b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.f30279r >= 0 && (n9Var = ry0Var.f32310a) != null) {
                    n9Var.a0(canvas2, (org.telegram.ui.Cells.m9) ry0Var.getParent().getParent(), this.f30279r);
                }
                this.f30265b.draw(canvas2, view);
                canvas2.restore();
            }
            if (ry0Var.C) {
                Paint linePaint = qy0Var.getLinePaint();
                Paint linePaint2 = qy0Var.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i20 = this.f30277p;
                if (i20 == 0) {
                    int i21 = this.f30278q;
                    float f18 = i21;
                    float f19 = this.f30273l + i21;
                    if (i21 == 0) {
                        f18 += dp;
                    }
                    float f20 = f18;
                    if (f19 == ry0Var.A) {
                        f19 -= dp;
                    }
                    float f21 = i20 + strokeWidth;
                    canvas2.drawLine(f21, f20, f21, f19, linePaint);
                    paint = linePaint;
                    paint2 = linePaint2;
                } else {
                    paint = linePaint;
                    float f22 = i20 - strokeWidth2;
                    paint2 = linePaint2;
                    canvas.drawLine(f22, this.f30278q, f22, i12 + this.f30273l, paint2);
                }
                int i22 = this.f30278q;
                if (i22 == 0) {
                    int i23 = this.f30277p;
                    float f23 = i23;
                    float f24 = this.f30272k + i23;
                    if (i23 == 0) {
                        f23 += dp;
                    }
                    float f25 = f23;
                    if (f24 == ry0Var.f32320y) {
                        f24 -= dp;
                    }
                    float f26 = i22 + strokeWidth;
                    canvas.drawLine(f25, f26, f24, f26, paint);
                } else {
                    float f27 = i22 - strokeWidth2;
                    canvas.drawLine(this.f30277p, f27, i13 + this.f30272k, f27, paint2);
                }
                if (z11 && (i16 = this.f30278q) == 0) {
                    f10 = i16 + dp;
                } else {
                    f10 = this.f30278q - strokeWidth;
                }
                float f28 = f10;
                if (z11 && z12) {
                    f11 = (this.f30278q + this.f30273l) - dp;
                } else {
                    f11 = (this.f30278q + this.f30273l) - strokeWidth;
                }
                float f29 = (this.f30277p + this.f30272k) - strokeWidth;
                Paint paint3 = paint;
                canvas.drawLine(f29, f28, f29, f11, paint3);
                int i24 = this.f30277p;
                if (i24 == 0 && z12) {
                    f12 = i24 + dp;
                } else {
                    f12 = i24 - strokeWidth;
                }
                if (z11 && z12) {
                    f13 = (i24 + this.f30272k) - dp;
                } else {
                    f13 = (i24 + this.f30272k) - strokeWidth;
                }
                float f30 = (this.f30278q + this.f30273l) - strokeWidth;
                canvas.drawLine(f12, f30, f13, f30, paint3);
                int i25 = this.f30277p;
                if (i25 == 0 && (i15 = this.f30278q) == 0) {
                    float f31 = i25 + strokeWidth;
                    float f32 = i15 + strokeWidth;
                    float f33 = dp * 2;
                    rectF2.set(f31, f32, f31 + f33, f33 + f32);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
                } else {
                    rectF = rectF2;
                }
                if (z11 && (i14 = this.f30278q) == 0) {
                    float f34 = (this.f30277p + this.f30272k) - strokeWidth;
                    float f35 = dp * 2;
                    float f36 = i14 + strokeWidth;
                    rectF.set(f34 - f35, f36, f34, f35 + f36);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
                }
                int i26 = this.f30277p;
                if (i26 == 0 && z12) {
                    float f37 = i26 + strokeWidth;
                    float f38 = (this.f30278q + this.f30273l) - strokeWidth;
                    float f39 = dp * 2;
                    rectF.set(f37, f38 - f39, f39 + f37, f38);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
                }
                if (z11 && z12) {
                    float f40 = (this.f30277p + this.f30272k) - strokeWidth;
                    float f41 = dp * 2;
                    float f42 = (this.f30278q + this.f30273l) - strokeWidth;
                    rectF.set(f40 - f41, f42 - f41, f40, f42);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
                }
            }
        }
    }

    public final int b() {
        return this.f30277p + this.f30269g;
    }

    public final int c() {
        return this.f30278q + this.h;
    }

    public final void d(int r3, int r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ky0.d(int, int, boolean):void");
    }

    public final void e(jy0 jy0Var) {
        Layout layout;
        int min;
        this.f30265b = jy0Var;
        if (jy0Var != null) {
            layout = jy0Var.getLayout();
        } else {
            layout = null;
        }
        if (layout != null) {
            this.f30267e = 0;
            this.f30270i = 0;
            int lineCount = layout.getLineCount();
            for (int i9 = 0; i9 < lineCount; i9++) {
                float lineLeft = layout.getLineLeft(i9);
                if (i9 == 0) {
                    min = (int) Math.ceil(lineLeft);
                } else {
                    min = Math.min(this.f30270i, (int) Math.ceil(lineLeft));
                }
                this.f30270i = min;
                this.f30267e = (int) Math.ceil(Math.max(layout.getLineWidth(i9), this.f30267e));
            }
            this.f30268f = layout.getHeight();
            return;
        }
        this.f30270i = 0;
        this.f30267e = 0;
        this.f30268f = 0;
    }

    public final void f() {
        int i9 = -this.f30270i;
        this.f30269g = i9;
        TL_iv.pageTableCell pagetablecell = this.f30266c;
        boolean z10 = pagetablecell.align_right;
        ry0 ry0Var = this.f30280s;
        if (z10) {
            this.f30269g = ((this.f30272k - this.f30267e) - ry0Var.v) + i9;
        } else if (pagetablecell.align_center) {
            this.f30269g = Math.round((this.f30272k - this.f30267e) / 2.0f) + i9;
        } else {
            this.f30269g = i9 + ry0Var.v;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.f30266c;
        if (pagetablecell.valign_middle) {
            this.h = (this.f30273l - this.f30268f) / 2;
            return;
        }
        boolean z10 = pagetablecell.valign_bottom;
        ry0 ry0Var = this.f30280s;
        if (z10) {
            this.h = (this.f30273l - this.f30268f) - ry0Var.f32317s;
        } else {
            this.h = ry0Var.f32316r;
        }
    }
}
