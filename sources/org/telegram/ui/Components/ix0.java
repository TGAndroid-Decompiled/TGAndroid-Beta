package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class ix0 {
    public kx0 f35747a;
    public hx0 f35748b;
    public TL_iv.pageTableCell f35749c;
    public final int d;
    public int f35750e;
    public int f35751f;
    public int f35752g;
    public int h;
    public int f35753i;
    public int f35754j;
    public int f35755k;
    public int f35756l;
    public int f35757m;
    public int f35758n;
    public int f35759o;
    public int f35760p;
    public int f35761q;
    public int f35762r = -1;
    public final px0 f35763s;

    public ix0(px0 px0Var, int i7) {
        this.f35763s = px0Var;
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
        org.telegram.ui.Cells.h9 h9Var;
        Canvas canvas2 = canvas;
        if (this.f35749c != null) {
            int i17 = this.f35760p + this.f35755k;
            px0 px0Var = this.f35763s;
            int i18 = px0Var.E;
            Path path = px0Var.M;
            ox0 ox0Var = px0Var.P;
            float[] fArr = px0Var.O;
            RectF rectF2 = px0Var.N;
            if (i17 == i18) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f35761q + this.f35756l == px0Var.F) {
                z12 = true;
            } else {
                z12 = false;
            }
            int L = org.telegram.messenger.g0.L(8.0f);
            boolean z15 = this.f35749c.header;
            if (z15 || (px0Var.I && this.f35747a.f36636a.f37402b.f36188a % 2 == 0)) {
                int i19 = this.f35760p;
                if (i19 == 0 && this.f35761q == 0) {
                    float f14 = L;
                    fArr[1] = f14;
                    fArr[0] = f14;
                    z13 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    z13 = false;
                }
                if (z11 && this.f35761q == 0) {
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
                    rectF2.set(i19, this.f35761q, i19 + this.f35755k, i11 + this.f35756l);
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.f35749c.header) {
                        canvas2.drawPath(path, ox0Var.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, ox0Var.getStripPaint());
                    }
                } else if (z15) {
                    canvas2.drawRect(i19, this.f35761q, i19 + this.f35755k, i10 + this.f35756l, ox0Var.getHeaderPaint());
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i19, this.f35761q, this.f35755k + i19, i7 + this.f35756l, ox0Var.getStripPaint());
                }
            }
            if (z10 && this.f35748b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.f35762r >= 0 && (h9Var = px0Var.f38423a) != null) {
                    h9Var.Z(canvas2, (org.telegram.ui.Cells.g9) px0Var.getParent().getParent(), this.f35762r);
                }
                this.f35748b.d(canvas2, view);
                canvas2.restore();
            }
            if (px0Var.H) {
                Paint linePaint = ox0Var.getLinePaint();
                Paint linePaint2 = ox0Var.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i20 = this.f35760p;
                if (i20 == 0) {
                    int i21 = this.f35761q;
                    float f18 = i21;
                    float f19 = this.f35756l + i21;
                    if (i21 == 0) {
                        f18 += L;
                    }
                    float f20 = f18;
                    if (f19 == px0Var.F) {
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
                    canvas.drawLine(f22, this.f35761q, f22, i12 + this.f35756l, paint2);
                }
                int i22 = this.f35761q;
                if (i22 == 0) {
                    int i23 = this.f35760p;
                    float f23 = i23;
                    float f24 = this.f35755k + i23;
                    if (i23 == 0) {
                        f23 += L;
                    }
                    float f25 = f23;
                    if (f24 == px0Var.E) {
                        f24 -= L;
                    }
                    float f26 = i22 + strokeWidth;
                    canvas.drawLine(f25, f26, f24, f26, paint);
                } else {
                    float f27 = i22 - strokeWidth2;
                    canvas.drawLine(this.f35760p, f27, i13 + this.f35755k, f27, paint2);
                }
                if (z11 && (i16 = this.f35761q) == 0) {
                    f10 = i16 + L;
                } else {
                    f10 = this.f35761q - strokeWidth;
                }
                float f28 = f10;
                if (z11 && z12) {
                    f11 = (this.f35761q + this.f35756l) - L;
                } else {
                    f11 = (this.f35761q + this.f35756l) - strokeWidth;
                }
                float f29 = (this.f35760p + this.f35755k) - strokeWidth;
                Paint paint3 = paint;
                canvas.drawLine(f29, f28, f29, f11, paint3);
                int i24 = this.f35760p;
                if (i24 == 0 && z12) {
                    f12 = i24 + L;
                } else {
                    f12 = i24 - strokeWidth;
                }
                if (z11 && z12) {
                    f13 = (i24 + this.f35755k) - L;
                } else {
                    f13 = (i24 + this.f35755k) - strokeWidth;
                }
                float f30 = (this.f35761q + this.f35756l) - strokeWidth;
                canvas.drawLine(f12, f30, f13, f30, paint3);
                int i25 = this.f35760p;
                if (i25 == 0 && (i15 = this.f35761q) == 0) {
                    float f31 = i25 + strokeWidth;
                    float f32 = i15 + strokeWidth;
                    float f33 = L * 2;
                    rectF2.set(f31, f32, f31 + f33, f33 + f32);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
                } else {
                    rectF = rectF2;
                }
                if (z11 && (i14 = this.f35761q) == 0) {
                    float f34 = (this.f35760p + this.f35755k) - strokeWidth;
                    float f35 = L * 2;
                    float f36 = i14 + strokeWidth;
                    rectF.set(f34 - f35, f36, f34, f35 + f36);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
                }
                int i26 = this.f35760p;
                if (i26 == 0 && z12) {
                    float f37 = i26 + strokeWidth;
                    float f38 = (this.f35761q + this.f35756l) - strokeWidth;
                    float f39 = L * 2;
                    rectF.set(f37, f38 - f39, f39 + f37, f38);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
                }
                if (z11 && z12) {
                    float f40 = (this.f35760p + this.f35755k) - strokeWidth;
                    float f41 = L * 2;
                    float f42 = (this.f35761q + this.f35756l) - strokeWidth;
                    rectF.set(f40 - f41, f42 - f41, f40, f42);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
                }
            }
        }
    }

    public final int b() {
        return this.f35760p + this.f35752g;
    }

    public final int c() {
        return this.f35761q + this.h;
    }

    public final void d(int r3, int r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ix0.d(int, int, boolean):void");
    }

    public final void e(hx0 hx0Var) {
        Layout layout;
        int min;
        this.f35748b = hx0Var;
        if (hx0Var != null) {
            layout = hx0Var.a();
        } else {
            layout = null;
        }
        if (layout != null) {
            this.f35750e = 0;
            this.f35753i = 0;
            int lineCount = layout.getLineCount();
            for (int i7 = 0; i7 < lineCount; i7++) {
                float lineLeft = layout.getLineLeft(i7);
                if (i7 == 0) {
                    min = (int) Math.ceil(lineLeft);
                } else {
                    min = Math.min(this.f35753i, (int) Math.ceil(lineLeft));
                }
                this.f35753i = min;
                this.f35750e = (int) Math.ceil(Math.max(layout.getLineWidth(i7), this.f35750e));
            }
            this.f35751f = layout.getHeight();
            return;
        }
        this.f35753i = 0;
        this.f35750e = 0;
        this.f35751f = 0;
    }

    public final void f() {
        int i7 = -this.f35753i;
        this.f35752g = i7;
        TL_iv.pageTableCell pagetablecell = this.f35749c;
        boolean z10 = pagetablecell.align_right;
        px0 px0Var = this.f35763s;
        if (z10) {
            this.f35752g = ((this.f35755k - this.f35750e) - px0Var.f38431w) + i7;
        } else if (pagetablecell.align_center) {
            this.f35752g = Math.round((this.f35755k - this.f35750e) / 2.0f) + i7;
        } else {
            this.f35752g = i7 + px0Var.f38431w;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.f35749c;
        if (pagetablecell.valign_middle) {
            this.h = (this.f35756l - this.f35751f) / 2;
            return;
        }
        boolean z10 = pagetablecell.valign_bottom;
        px0 px0Var = this.f35763s;
        if (z10) {
            this.h = (this.f35756l - this.f35751f) - px0Var.f38430s;
        } else {
            this.h = px0Var.f38429r;
        }
    }
}
