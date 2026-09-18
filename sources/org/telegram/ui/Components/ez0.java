package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class ez0 {
    public gz0 f23704a;
    public dz0 f23705b;
    public TL_iv.pageTableCell f23706c;
    public final int d;
    public int e;
    public int f23707f;
    public int f23708g;
    public int h;
    public int f23709i;
    public int f23710j;
    public int f23711k;
    public int f23712l;
    public int f23713m;
    public int f23714n;
    public int f23715o;
    public int f23716p;
    public int f23717q;
    public int f23718r = -1;
    public final lz0 f23719s;

    public ez0(lz0 lz0Var, int i10) {
        this.f23719s = lz0Var;
        this.d = i10;
    }

    public final void a(Canvas canvas, View view, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        int i12;
        Paint paint;
        int i13;
        Paint paint2;
        int i14;
        float f7;
        float f10;
        float f11;
        float f12;
        RectF rectF;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.Cells.q9 q9Var;
        Canvas canvas2 = canvas;
        if (this.f23706c != null) {
            int i18 = this.f23716p + this.f23711k;
            lz0 lz0Var = this.f23719s;
            int i19 = lz0Var.f25999y;
            Path path = lz0Var.L;
            kz0 kz0Var = lz0Var.O;
            float[] fArr = lz0Var.N;
            RectF rectF2 = lz0Var.M;
            if (i18 == i19) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f23717q + this.f23712l == lz0Var.E) {
                z12 = true;
            } else {
                z12 = false;
            }
            int dp = AndroidUtilities.dp(8.0f);
            boolean z15 = this.f23706c.header;
            if (z15 || (lz0Var.H && this.f23704a.f24430a.f25063b.f24042a % 2 == 0)) {
                int i20 = this.f23716p;
                if (i20 == 0 && this.f23717q == 0) {
                    float f13 = dp;
                    fArr[1] = f13;
                    fArr[0] = f13;
                    z13 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    z13 = false;
                }
                if (z11 && this.f23717q == 0) {
                    float f14 = dp;
                    fArr[3] = f14;
                    fArr[2] = f14;
                    z13 = true;
                } else {
                    fArr[3] = 0.0f;
                    fArr[2] = 0.0f;
                }
                if (z11 && z12) {
                    float f15 = dp;
                    fArr[5] = f15;
                    fArr[4] = f15;
                    z13 = true;
                } else {
                    fArr[5] = 0.0f;
                    fArr[4] = 0.0f;
                }
                if (i20 == 0 && z12) {
                    float f16 = dp;
                    fArr[7] = f16;
                    fArr[6] = f16;
                    z14 = true;
                } else {
                    fArr[7] = 0.0f;
                    fArr[6] = 0.0f;
                    z14 = z13;
                }
                if (z14) {
                    rectF2.set(i20, this.f23717q, i20 + this.f23711k, i12 + this.f23712l);
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.f23706c.header) {
                        canvas2.drawPath(path, kz0Var.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, kz0Var.getStripPaint());
                    }
                } else if (z15) {
                    canvas2.drawRect(i20, this.f23717q, i20 + this.f23711k, i11 + this.f23712l, kz0Var.getHeaderPaint());
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i20, this.f23717q, this.f23711k + i20, i10 + this.f23712l, kz0Var.getStripPaint());
                }
            }
            if (z10 && this.f23705b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.f23718r >= 0 && (q9Var = lz0Var.f25990a) != null) {
                    q9Var.a0(canvas2, (org.telegram.ui.Cells.p9) lz0Var.getParent().getParent(), this.f23718r);
                }
                this.f23705b.draw(canvas2, view);
                canvas2.restore();
            }
            if (lz0Var.G) {
                Paint linePaint = kz0Var.getLinePaint();
                Paint linePaint2 = kz0Var.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i21 = this.f23716p;
                if (i21 == 0) {
                    int i22 = this.f23717q;
                    float f17 = i22;
                    float f18 = this.f23712l + i22;
                    if (i22 == 0) {
                        f17 += dp;
                    }
                    float f19 = f17;
                    if (f18 == lz0Var.E) {
                        f18 -= dp;
                    }
                    float f20 = i21 + strokeWidth;
                    canvas2.drawLine(f20, f19, f20, f18, linePaint);
                    paint = linePaint;
                    paint2 = linePaint2;
                } else {
                    paint = linePaint;
                    float f21 = i21 - strokeWidth2;
                    paint2 = linePaint2;
                    canvas.drawLine(f21, this.f23717q, f21, i13 + this.f23712l, paint2);
                }
                int i23 = this.f23717q;
                if (i23 == 0) {
                    int i24 = this.f23716p;
                    float f22 = i24;
                    float f23 = this.f23711k + i24;
                    if (i24 == 0) {
                        f22 += dp;
                    }
                    float f24 = f22;
                    if (f23 == lz0Var.f25999y) {
                        f23 -= dp;
                    }
                    float f25 = i23 + strokeWidth;
                    canvas.drawLine(f24, f25, f23, f25, paint);
                } else {
                    float f26 = i23 - strokeWidth2;
                    canvas.drawLine(this.f23716p, f26, i14 + this.f23711k, f26, paint2);
                }
                if (z11 && (i17 = this.f23717q) == 0) {
                    f7 = i17 + dp;
                } else {
                    f7 = this.f23717q - strokeWidth;
                }
                float f27 = f7;
                if (z11 && z12) {
                    f10 = (this.f23717q + this.f23712l) - dp;
                } else {
                    f10 = (this.f23717q + this.f23712l) - strokeWidth;
                }
                float f28 = (this.f23716p + this.f23711k) - strokeWidth;
                Paint paint3 = paint;
                canvas.drawLine(f28, f27, f28, f10, paint3);
                int i25 = this.f23716p;
                if (i25 == 0 && z12) {
                    f11 = i25 + dp;
                } else {
                    f11 = i25 - strokeWidth;
                }
                if (z11 && z12) {
                    f12 = (i25 + this.f23711k) - dp;
                } else {
                    f12 = (i25 + this.f23711k) - strokeWidth;
                }
                float f29 = (this.f23717q + this.f23712l) - strokeWidth;
                canvas.drawLine(f11, f29, f12, f29, paint3);
                int i26 = this.f23716p;
                if (i26 == 0 && (i16 = this.f23717q) == 0) {
                    float f30 = i26 + strokeWidth;
                    float f31 = i16 + strokeWidth;
                    float f32 = dp * 2;
                    rectF2.set(f30, f31, f30 + f32, f32 + f31);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
                } else {
                    rectF = rectF2;
                }
                if (z11 && (i15 = this.f23717q) == 0) {
                    float f33 = (this.f23716p + this.f23711k) - strokeWidth;
                    float f34 = dp * 2;
                    float f35 = i15 + strokeWidth;
                    rectF.set(f33 - f34, f35, f33, f34 + f35);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
                }
                int i27 = this.f23716p;
                if (i27 == 0 && z12) {
                    float f36 = i27 + strokeWidth;
                    float f37 = (this.f23717q + this.f23712l) - strokeWidth;
                    float f38 = dp * 2;
                    rectF.set(f36, f37 - f38, f38 + f36, f37);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
                }
                if (z11 && z12) {
                    float f39 = (this.f23716p + this.f23711k) - strokeWidth;
                    float f40 = dp * 2;
                    float f41 = (this.f23717q + this.f23712l) - strokeWidth;
                    rectF.set(f39 - f40, f41 - f40, f39, f41);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
                }
            }
        }
    }

    public final int b() {
        return this.f23716p + this.f23708g;
    }

    public final int c() {
        return this.f23717q + this.h;
    }

    public final void d(int r3, int r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ez0.d(int, int, boolean):void");
    }

    public final void e(dz0 dz0Var) {
        Layout layout;
        int min;
        this.f23705b = dz0Var;
        if (dz0Var != null) {
            layout = dz0Var.getLayout();
        } else {
            layout = null;
        }
        if (layout != null) {
            this.e = 0;
            this.f23709i = 0;
            int lineCount = layout.getLineCount();
            for (int i10 = 0; i10 < lineCount; i10++) {
                float lineLeft = layout.getLineLeft(i10);
                if (i10 == 0) {
                    min = (int) Math.ceil(lineLeft);
                } else {
                    min = Math.min(this.f23709i, (int) Math.ceil(lineLeft));
                }
                this.f23709i = min;
                this.e = (int) Math.ceil(Math.max(layout.getLineWidth(i10), this.e));
            }
            this.f23707f = layout.getHeight();
            return;
        }
        this.f23709i = 0;
        this.e = 0;
        this.f23707f = 0;
    }

    public final void f() {
        int i10 = -this.f23709i;
        this.f23708g = i10;
        TL_iv.pageTableCell pagetablecell = this.f23706c;
        boolean z10 = pagetablecell.align_right;
        lz0 lz0Var = this.f23719s;
        if (z10) {
            this.f23708g = ((this.f23711k - this.e) - lz0Var.v) + i10;
        } else if (pagetablecell.align_center) {
            this.f23708g = Math.round((this.f23711k - this.e) / 2.0f) + i10;
        } else {
            this.f23708g = i10 + lz0Var.v;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.f23706c;
        if (pagetablecell.valign_middle) {
            this.h = (this.f23712l - this.f23707f) / 2;
            return;
        }
        boolean z10 = pagetablecell.valign_bottom;
        lz0 lz0Var = this.f23719s;
        if (z10) {
            this.h = (this.f23712l - this.f23707f) - lz0Var.f25996s;
        } else {
            this.h = lz0Var.f25995r;
        }
    }
}
