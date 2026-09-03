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
    public iz0 f27300a;
    public fz0 f27301b;
    public TL_iv.pageTableCell f27302c;
    public final int d;
    public int f27303e;
    public int f27304f;
    public int f27305g;
    public int h;
    public int f27306i;
    public int f27307j;
    public int f27308k;
    public int f27309l;
    public int f27310m;
    public int f27311n;
    public int f27312o;
    public int f27313p;
    public int f27314q;
    public int f27315r = -1;
    public final nz0 f27316s;

    public gz0(nz0 nz0Var, int i10) {
        this.f27316s = nz0Var;
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
        org.telegram.ui.Cells.m9 m9Var;
        Canvas canvas2 = canvas;
        if (this.f27302c != null) {
            int i18 = this.f27313p + this.f27308k;
            nz0 nz0Var = this.f27316s;
            int i19 = nz0Var.f29616y;
            Path path = nz0Var.I;
            mz0 mz0Var = nz0Var.L;
            float[] fArr = nz0Var.K;
            RectF rectF2 = nz0Var.J;
            if (i18 == i19) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f27314q + this.f27309l == nz0Var.B) {
                z11 = true;
            } else {
                z11 = false;
            }
            int dp = AndroidUtilities.dp(8.0f);
            boolean z14 = this.f27302c.header;
            if (z14 || (nz0Var.E && this.f27300a.f27920a.f28528b.f27669a % 2 == 0)) {
                int i20 = this.f27313p;
                if (i20 == 0 && this.f27314q == 0) {
                    float f14 = dp;
                    fArr[1] = f14;
                    fArr[0] = f14;
                    z12 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    z12 = false;
                }
                if (z10 && this.f27314q == 0) {
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
                    rectF2.set(i20, this.f27314q, i20 + this.f27308k, i12 + this.f27309l);
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.f27302c.header) {
                        canvas2.drawPath(path, mz0Var.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, mz0Var.getStripPaint());
                    }
                } else if (z14) {
                    canvas2.drawRect(i20, this.f27314q, i20 + this.f27308k, i11 + this.f27309l, mz0Var.getHeaderPaint());
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i20, this.f27314q, this.f27308k + i20, i10 + this.f27309l, mz0Var.getStripPaint());
                }
            }
            if (z4 && this.f27301b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.f27315r >= 0 && (m9Var = nz0Var.f29606a) != null) {
                    m9Var.a0(canvas2, (org.telegram.ui.Cells.l9) nz0Var.getParent().getParent(), this.f27315r);
                }
                this.f27301b.draw(canvas2, view);
                canvas2.restore();
            }
            if (nz0Var.D) {
                Paint linePaint = mz0Var.getLinePaint();
                Paint linePaint2 = mz0Var.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i21 = this.f27313p;
                if (i21 == 0) {
                    int i22 = this.f27314q;
                    float f18 = i22;
                    float f19 = this.f27309l + i22;
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
                    canvas.drawLine(f22, this.f27314q, f22, i13 + this.f27309l, paint2);
                }
                int i23 = this.f27314q;
                if (i23 == 0) {
                    int i24 = this.f27313p;
                    float f23 = i24;
                    float f24 = this.f27308k + i24;
                    if (i24 == 0) {
                        f23 += dp;
                    }
                    float f25 = f23;
                    if (f24 == nz0Var.f29616y) {
                        f24 -= dp;
                    }
                    float f26 = i23 + strokeWidth;
                    canvas.drawLine(f25, f26, f24, f26, paint);
                } else {
                    float f27 = i23 - strokeWidth2;
                    canvas.drawLine(this.f27313p, f27, i14 + this.f27308k, f27, paint2);
                }
                if (z10 && (i17 = this.f27314q) == 0) {
                    f10 = i17 + dp;
                } else {
                    f10 = this.f27314q - strokeWidth;
                }
                float f28 = f10;
                if (z10 && z11) {
                    f11 = (this.f27314q + this.f27309l) - dp;
                } else {
                    f11 = (this.f27314q + this.f27309l) - strokeWidth;
                }
                float f29 = (this.f27313p + this.f27308k) - strokeWidth;
                Paint paint3 = paint;
                canvas.drawLine(f29, f28, f29, f11, paint3);
                int i25 = this.f27313p;
                if (i25 == 0 && z11) {
                    f12 = i25 + dp;
                } else {
                    f12 = i25 - strokeWidth;
                }
                if (z10 && z11) {
                    f13 = (i25 + this.f27308k) - dp;
                } else {
                    f13 = (i25 + this.f27308k) - strokeWidth;
                }
                float f30 = (this.f27314q + this.f27309l) - strokeWidth;
                canvas.drawLine(f12, f30, f13, f30, paint3);
                int i26 = this.f27313p;
                if (i26 == 0 && (i16 = this.f27314q) == 0) {
                    float f31 = i26 + strokeWidth;
                    float f32 = i16 + strokeWidth;
                    float f33 = dp * 2;
                    rectF2.set(f31, f32, f31 + f33, f33 + f32);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
                } else {
                    rectF = rectF2;
                }
                if (z10 && (i15 = this.f27314q) == 0) {
                    float f34 = (this.f27313p + this.f27308k) - strokeWidth;
                    float f35 = dp * 2;
                    float f36 = i15 + strokeWidth;
                    rectF.set(f34 - f35, f36, f34, f35 + f36);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
                }
                int i27 = this.f27313p;
                if (i27 == 0 && z11) {
                    float f37 = i27 + strokeWidth;
                    float f38 = (this.f27314q + this.f27309l) - strokeWidth;
                    float f39 = dp * 2;
                    rectF.set(f37, f38 - f39, f39 + f37, f38);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
                }
                if (z10 && z11) {
                    float f40 = (this.f27313p + this.f27308k) - strokeWidth;
                    float f41 = dp * 2;
                    float f42 = (this.f27314q + this.f27309l) - strokeWidth;
                    rectF.set(f40 - f41, f42 - f41, f40, f42);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
                }
            }
        }
    }

    public final int b() {
        return this.f27313p + this.f27305g;
    }

    public final int c() {
        return this.f27314q + this.h;
    }

    public final void d(int r3, int r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gz0.d(int, int, boolean):void");
    }

    public final void e(fz0 fz0Var) {
        Layout layout;
        int min;
        this.f27301b = fz0Var;
        if (fz0Var != null) {
            layout = fz0Var.getLayout();
        } else {
            layout = null;
        }
        if (layout != null) {
            this.f27303e = 0;
            this.f27306i = 0;
            int lineCount = layout.getLineCount();
            for (int i10 = 0; i10 < lineCount; i10++) {
                float lineLeft = layout.getLineLeft(i10);
                if (i10 == 0) {
                    min = (int) Math.ceil(lineLeft);
                } else {
                    min = Math.min(this.f27306i, (int) Math.ceil(lineLeft));
                }
                this.f27306i = min;
                this.f27303e = (int) Math.ceil(Math.max(layout.getLineWidth(i10), this.f27303e));
            }
            this.f27304f = layout.getHeight();
            return;
        }
        this.f27306i = 0;
        this.f27303e = 0;
        this.f27304f = 0;
    }

    public final void f() {
        int i10 = -this.f27306i;
        this.f27305g = i10;
        TL_iv.pageTableCell pagetablecell = this.f27302c;
        boolean z4 = pagetablecell.align_right;
        nz0 nz0Var = this.f27316s;
        if (z4) {
            this.f27305g = ((this.f27308k - this.f27303e) - nz0Var.v) + i10;
        } else if (pagetablecell.align_center) {
            this.f27305g = Math.round((this.f27308k - this.f27303e) / 2.0f) + i10;
        } else {
            this.f27305g = i10 + nz0Var.v;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.f27302c;
        if (pagetablecell.valign_middle) {
            this.h = (this.f27309l - this.f27304f) / 2;
            return;
        }
        boolean z4 = pagetablecell.valign_bottom;
        nz0 nz0Var = this.f27316s;
        if (z4) {
            this.h = (this.f27309l - this.f27304f) - nz0Var.f29613s;
        } else {
            this.h = nz0Var.f29612r;
        }
    }
}
