package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class gz0 {
    public iz0 f25257a;
    public fz0 f25258b;
    public TL_iv.pageTableCell f25259c;
    public final int d;
    public int e;
    public int f25260f;
    public int f25261g;
    public int h;
    public int f25262i;
    public int f25263j;
    public int f25264k;
    public int f25265l;
    public int f25266m;
    public int f25267n;
    public int f25268o;
    public int f25269p;
    public int f25270q;
    public int f25271r = -1;
    public final nz0 f25272s;

    public gz0(nz0 nz0Var, int i10) {
        this.f25272s = nz0Var;
        this.d = i10;
    }

    public final void a(Canvas canvas, View view, boolean z4) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        int i12;
        Paint paint;
        int i13;
        Paint paint2;
        int i14;
        float f10;
        float f11;
        float f12;
        float f13;
        RectF rectF;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.Cells.l9 l9Var;
        Canvas canvas2 = canvas;
        if (this.f25259c != null) {
            int i18 = this.f25269p + this.f25264k;
            nz0 nz0Var = this.f25272s;
            int i19 = nz0Var.f27411y;
            Path path = nz0Var.I;
            mz0 mz0Var = nz0Var.L;
            float[] fArr = nz0Var.K;
            RectF rectF2 = nz0Var.J;
            if (i18 == i19) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f25270q + this.f25265l == nz0Var.B) {
                z11 = true;
            } else {
                z11 = false;
            }
            int dp = AndroidUtilities.dp(8.0f);
            boolean z14 = this.f25259c.header;
            if (z14 || (nz0Var.E && this.f25257a.f25794a.f26507b.f25525a % 2 == 0)) {
                int i20 = this.f25269p;
                if (i20 == 0 && this.f25270q == 0) {
                    float f14 = dp;
                    fArr[1] = f14;
                    fArr[0] = f14;
                    z12 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    z12 = false;
                }
                if (z10 && this.f25270q == 0) {
                    float f15 = dp;
                    fArr[3] = f15;
                    fArr[2] = f15;
                    z12 = true;
                } else {
                    fArr[3] = 0.0f;
                    fArr[2] = 0.0f;
                }
                if (z10 && z11) {
                    float f16 = dp;
                    fArr[5] = f16;
                    fArr[4] = f16;
                    z12 = true;
                } else {
                    fArr[5] = 0.0f;
                    fArr[4] = 0.0f;
                }
                if (i20 == 0 && z11) {
                    float f17 = dp;
                    fArr[7] = f17;
                    fArr[6] = f17;
                    z13 = true;
                } else {
                    fArr[7] = 0.0f;
                    fArr[6] = 0.0f;
                    z13 = z12;
                }
                if (z13) {
                    rectF2.set(i20, this.f25270q, i20 + this.f25264k, i12 + this.f25265l);
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.f25259c.header) {
                        canvas2.drawPath(path, mz0Var.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, mz0Var.getStripPaint());
                    }
                } else if (z14) {
                    canvas2.drawRect(i20, this.f25270q, i20 + this.f25264k, i11 + this.f25265l, mz0Var.getHeaderPaint());
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i20, this.f25270q, this.f25264k + i20, i10 + this.f25265l, mz0Var.getStripPaint());
                }
            }
            if (z4 && this.f25258b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.f25271r >= 0 && (l9Var = nz0Var.f27402a) != null) {
                    l9Var.a0(canvas2, (org.telegram.ui.Cells.k9) nz0Var.getParent().getParent(), this.f25271r);
                }
                this.f25258b.draw(canvas2, view);
                canvas2.restore();
            }
            if (nz0Var.D) {
                Paint linePaint = mz0Var.getLinePaint();
                Paint linePaint2 = mz0Var.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i21 = this.f25269p;
                if (i21 == 0) {
                    int i22 = this.f25270q;
                    float f18 = i22;
                    float f19 = this.f25265l + i22;
                    if (i22 == 0) {
                        f18 += dp;
                    }
                    float f20 = f18;
                    if (f19 == nz0Var.B) {
                        f19 -= dp;
                    }
                    float f21 = i21 + strokeWidth;
                    canvas2.drawLine(f21, f20, f21, f19, linePaint);
                    paint = linePaint;
                    paint2 = linePaint2;
                } else {
                    paint = linePaint;
                    float f22 = i21 - strokeWidth2;
                    paint2 = linePaint2;
                    canvas.drawLine(f22, this.f25270q, f22, i13 + this.f25265l, paint2);
                }
                int i23 = this.f25270q;
                if (i23 == 0) {
                    int i24 = this.f25269p;
                    float f23 = i24;
                    float f24 = this.f25264k + i24;
                    if (i24 == 0) {
                        f23 += dp;
                    }
                    float f25 = f23;
                    if (f24 == nz0Var.f27411y) {
                        f24 -= dp;
                    }
                    float f26 = i23 + strokeWidth;
                    canvas.drawLine(f25, f26, f24, f26, paint);
                } else {
                    float f27 = i23 - strokeWidth2;
                    canvas.drawLine(this.f25269p, f27, i14 + this.f25264k, f27, paint2);
                }
                if (z10 && (i17 = this.f25270q) == 0) {
                    f10 = i17 + dp;
                } else {
                    f10 = this.f25270q - strokeWidth;
                }
                float f28 = f10;
                if (z10 && z11) {
                    f11 = (this.f25270q + this.f25265l) - dp;
                } else {
                    f11 = (this.f25270q + this.f25265l) - strokeWidth;
                }
                float f29 = (this.f25269p + this.f25264k) - strokeWidth;
                Paint paint3 = paint;
                canvas.drawLine(f29, f28, f29, f11, paint3);
                int i25 = this.f25269p;
                if (i25 == 0 && z11) {
                    f12 = i25 + dp;
                } else {
                    f12 = i25 - strokeWidth;
                }
                if (z10 && z11) {
                    f13 = (i25 + this.f25264k) - dp;
                } else {
                    f13 = (i25 + this.f25264k) - strokeWidth;
                }
                float f30 = (this.f25270q + this.f25265l) - strokeWidth;
                canvas.drawLine(f12, f30, f13, f30, paint3);
                int i26 = this.f25269p;
                if (i26 == 0 && (i16 = this.f25270q) == 0) {
                    float f31 = i26 + strokeWidth;
                    float f32 = i16 + strokeWidth;
                    float f33 = dp * 2;
                    rectF2.set(f31, f32, f31 + f33, f33 + f32);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
                } else {
                    rectF = rectF2;
                }
                if (z10 && (i15 = this.f25270q) == 0) {
                    float f34 = (this.f25269p + this.f25264k) - strokeWidth;
                    float f35 = dp * 2;
                    float f36 = i15 + strokeWidth;
                    rectF.set(f34 - f35, f36, f34, f35 + f36);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
                }
                int i27 = this.f25269p;
                if (i27 == 0 && z11) {
                    float f37 = i27 + strokeWidth;
                    float f38 = (this.f25270q + this.f25265l) - strokeWidth;
                    float f39 = dp * 2;
                    rectF.set(f37, f38 - f39, f39 + f37, f38);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
                }
                if (z10 && z11) {
                    float f40 = (this.f25269p + this.f25264k) - strokeWidth;
                    float f41 = dp * 2;
                    float f42 = (this.f25270q + this.f25265l) - strokeWidth;
                    rectF.set(f40 - f41, f42 - f41, f40, f42);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
                }
            }
        }
    }

    public final int b() {
        return this.f25269p + this.f25261g;
    }

    public final int c() {
        return this.f25270q + this.h;
    }

    public final void d(int r3, int r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gz0.d(int, int, boolean):void");
    }

    public final void e(fz0 fz0Var) {
        Layout layout;
        int min;
        this.f25258b = fz0Var;
        if (fz0Var != null) {
            layout = fz0Var.getLayout();
        } else {
            layout = null;
        }
        if (layout != null) {
            this.e = 0;
            this.f25262i = 0;
            int lineCount = layout.getLineCount();
            for (int i10 = 0; i10 < lineCount; i10++) {
                float lineLeft = layout.getLineLeft(i10);
                if (i10 == 0) {
                    min = (int) Math.ceil(lineLeft);
                } else {
                    min = Math.min(this.f25262i, (int) Math.ceil(lineLeft));
                }
                this.f25262i = min;
                this.e = (int) Math.ceil(Math.max(layout.getLineWidth(i10), this.e));
            }
            this.f25260f = layout.getHeight();
            return;
        }
        this.f25262i = 0;
        this.e = 0;
        this.f25260f = 0;
    }

    public final void f() {
        int i10 = -this.f25262i;
        this.f25261g = i10;
        TL_iv.pageTableCell pagetablecell = this.f25259c;
        boolean z4 = pagetablecell.align_right;
        nz0 nz0Var = this.f25272s;
        if (z4) {
            this.f25261g = ((this.f25264k - this.e) - nz0Var.v) + i10;
        } else if (pagetablecell.align_center) {
            this.f25261g = Math.round((this.f25264k - this.e) / 2.0f) + i10;
        } else {
            this.f25261g = i10 + nz0Var.v;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.f25259c;
        if (pagetablecell.valign_middle) {
            this.h = (this.f25265l - this.f25260f) / 2;
            return;
        }
        boolean z4 = pagetablecell.valign_bottom;
        nz0 nz0Var = this.f25272s;
        if (z4) {
            this.h = (this.f25265l - this.f25260f) - nz0Var.f27408s;
        } else {
            this.h = nz0Var.f27407r;
        }
    }
}
