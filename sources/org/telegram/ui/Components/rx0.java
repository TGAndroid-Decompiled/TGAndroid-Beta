package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class rx0 {
    public tx0 f39324a;
    public qx0 f39325b;
    public TL_iv.pageTableCell f39326c;
    public final int d;
    public int f39327e;
    public int f39328f;
    public int f39329g;
    public int h;
    public int f39330i;
    public int f39331j;
    public int f39332k;
    public int f39333l;
    public int f39334m;
    public int f39335n;
    public int f39336o;
    public int f39337p;
    public int f39338q;
    public int f39339r = -1;
    public final yx0 f39340s;

    public rx0(yx0 yx0Var, int i7) {
        this.f39340s = yx0Var;
        this.d = i7;
    }

    public final void a(Canvas canvas, View view, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i7;
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
        org.telegram.ui.Cells.j9 j9Var;
        Canvas canvas2 = canvas;
        if (this.f39326c != null) {
            int i17 = this.f39337p + this.f39332k;
            yx0 yx0Var = this.f39340s;
            int i18 = yx0Var.E;
            Path path = yx0Var.M;
            xx0 xx0Var = yx0Var.P;
            float[] fArr = yx0Var.O;
            RectF rectF2 = yx0Var.N;
            if (i17 == i18) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f39338q + this.f39333l == yx0Var.F) {
                z12 = true;
            } else {
                z12 = false;
            }
            int L = org.telegram.messenger.g0.L(8.0f);
            boolean z15 = this.f39326c.header;
            if (z15 || (yx0Var.I && this.f39324a.f40059a.f41559b.f39673a % 2 == 0)) {
                int i19 = this.f39337p;
                if (i19 == 0 && this.f39338q == 0) {
                    float f14 = L;
                    fArr[1] = f14;
                    fArr[0] = f14;
                    z13 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    z13 = false;
                }
                if (z11 && this.f39338q == 0) {
                    float f15 = L;
                    fArr[3] = f15;
                    fArr[2] = f15;
                    z13 = true;
                } else {
                    fArr[3] = 0.0f;
                    fArr[2] = 0.0f;
                }
                if (z11 && z12) {
                    float f16 = L;
                    fArr[5] = f16;
                    fArr[4] = f16;
                    z13 = true;
                } else {
                    fArr[5] = 0.0f;
                    fArr[4] = 0.0f;
                }
                if (i19 == 0 && z12) {
                    float f17 = L;
                    fArr[7] = f17;
                    fArr[6] = f17;
                    z14 = true;
                } else {
                    fArr[7] = 0.0f;
                    fArr[6] = 0.0f;
                    z14 = z13;
                }
                if (z14) {
                    rectF2.set(i19, this.f39338q, i19 + this.f39332k, i11 + this.f39333l);
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.f39326c.header) {
                        canvas2.drawPath(path, xx0Var.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, xx0Var.getStripPaint());
                    }
                } else if (z15) {
                    canvas2.drawRect(i19, this.f39338q, i19 + this.f39332k, i10 + this.f39333l, xx0Var.getHeaderPaint());
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i19, this.f39338q, this.f39332k + i19, i7 + this.f39333l, xx0Var.getStripPaint());
                }
            }
            if (z10 && this.f39325b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.f39339r >= 0 && (j9Var = yx0Var.f42538a) != null) {
                    j9Var.Z(canvas2, (org.telegram.ui.Cells.i9) yx0Var.getParent().getParent(), this.f39339r);
                }
                this.f39325b.d(canvas2, view);
                canvas2.restore();
            }
            if (yx0Var.H) {
                Paint linePaint = xx0Var.getLinePaint();
                Paint linePaint2 = xx0Var.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i20 = this.f39337p;
                if (i20 == 0) {
                    int i21 = this.f39338q;
                    float f18 = i21;
                    float f19 = this.f39333l + i21;
                    if (i21 == 0) {
                        f18 += L;
                    }
                    float f20 = f18;
                    if (f19 == yx0Var.F) {
                        f19 -= L;
                    }
                    float f21 = i20 + strokeWidth;
                    canvas2.drawLine(f21, f20, f21, f19, linePaint);
                    paint = linePaint;
                    paint2 = linePaint2;
                } else {
                    paint = linePaint;
                    float f22 = i20 - strokeWidth2;
                    paint2 = linePaint2;
                    canvas.drawLine(f22, this.f39338q, f22, i12 + this.f39333l, paint2);
                }
                int i22 = this.f39338q;
                if (i22 == 0) {
                    int i23 = this.f39337p;
                    float f23 = i23;
                    float f24 = this.f39332k + i23;
                    if (i23 == 0) {
                        f23 += L;
                    }
                    float f25 = f23;
                    if (f24 == yx0Var.E) {
                        f24 -= L;
                    }
                    float f26 = i22 + strokeWidth;
                    canvas.drawLine(f25, f26, f24, f26, paint);
                } else {
                    float f27 = i22 - strokeWidth2;
                    canvas.drawLine(this.f39337p, f27, i13 + this.f39332k, f27, paint2);
                }
                if (z11 && (i16 = this.f39338q) == 0) {
                    f10 = i16 + L;
                } else {
                    f10 = this.f39338q - strokeWidth;
                }
                float f28 = f10;
                if (z11 && z12) {
                    f11 = (this.f39338q + this.f39333l) - L;
                } else {
                    f11 = (this.f39338q + this.f39333l) - strokeWidth;
                }
                float f29 = (this.f39337p + this.f39332k) - strokeWidth;
                Paint paint3 = paint;
                canvas.drawLine(f29, f28, f29, f11, paint3);
                int i24 = this.f39337p;
                if (i24 == 0 && z12) {
                    f12 = i24 + L;
                } else {
                    f12 = i24 - strokeWidth;
                }
                if (z11 && z12) {
                    f13 = (i24 + this.f39332k) - L;
                } else {
                    f13 = (i24 + this.f39332k) - strokeWidth;
                }
                float f30 = (this.f39338q + this.f39333l) - strokeWidth;
                canvas.drawLine(f12, f30, f13, f30, paint3);
                int i25 = this.f39337p;
                if (i25 == 0 && (i15 = this.f39338q) == 0) {
                    float f31 = i25 + strokeWidth;
                    float f32 = i15 + strokeWidth;
                    float f33 = L * 2;
                    rectF2.set(f31, f32, f31 + f33, f33 + f32);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
                } else {
                    rectF = rectF2;
                }
                if (z11 && (i14 = this.f39338q) == 0) {
                    float f34 = (this.f39337p + this.f39332k) - strokeWidth;
                    float f35 = L * 2;
                    float f36 = i14 + strokeWidth;
                    rectF.set(f34 - f35, f36, f34, f35 + f36);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
                }
                int i26 = this.f39337p;
                if (i26 == 0 && z12) {
                    float f37 = i26 + strokeWidth;
                    float f38 = (this.f39338q + this.f39333l) - strokeWidth;
                    float f39 = L * 2;
                    rectF.set(f37, f38 - f39, f39 + f37, f38);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
                }
                if (z11 && z12) {
                    float f40 = (this.f39337p + this.f39332k) - strokeWidth;
                    float f41 = L * 2;
                    float f42 = (this.f39338q + this.f39333l) - strokeWidth;
                    rectF.set(f40 - f41, f42 - f41, f40, f42);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
                }
            }
        }
    }

    public final int b() {
        return this.f39337p + this.f39329g;
    }

    public final int c() {
        return this.f39338q + this.h;
    }

    public final void d(int r3, int r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rx0.d(int, int, boolean):void");
    }

    public final void e(qx0 qx0Var) {
        Layout layout;
        int min;
        this.f39325b = qx0Var;
        if (qx0Var != null) {
            layout = qx0Var.a();
        } else {
            layout = null;
        }
        if (layout != null) {
            this.f39327e = 0;
            this.f39330i = 0;
            int lineCount = layout.getLineCount();
            for (int i7 = 0; i7 < lineCount; i7++) {
                float lineLeft = layout.getLineLeft(i7);
                if (i7 == 0) {
                    min = (int) Math.ceil(lineLeft);
                } else {
                    min = Math.min(this.f39330i, (int) Math.ceil(lineLeft));
                }
                this.f39330i = min;
                this.f39327e = (int) Math.ceil(Math.max(layout.getLineWidth(i7), this.f39327e));
            }
            this.f39328f = layout.getHeight();
            return;
        }
        this.f39330i = 0;
        this.f39327e = 0;
        this.f39328f = 0;
    }

    public final void f() {
        int i7 = -this.f39330i;
        this.f39329g = i7;
        TL_iv.pageTableCell pagetablecell = this.f39326c;
        boolean z10 = pagetablecell.align_right;
        yx0 yx0Var = this.f39340s;
        if (z10) {
            this.f39329g = ((this.f39332k - this.f39327e) - yx0Var.f42546w) + i7;
        } else if (pagetablecell.align_center) {
            this.f39329g = Math.round((this.f39332k - this.f39327e) / 2.0f) + i7;
        } else {
            this.f39329g = i7 + yx0Var.f42546w;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.f39326c;
        if (pagetablecell.valign_middle) {
            this.h = (this.f39333l - this.f39328f) / 2;
            return;
        }
        boolean z10 = pagetablecell.valign_bottom;
        yx0 yx0Var = this.f39340s;
        if (z10) {
            this.h = (this.f39333l - this.f39328f) - yx0Var.f42545s;
        } else {
            this.h = yx0Var.f42544r;
        }
    }
}
