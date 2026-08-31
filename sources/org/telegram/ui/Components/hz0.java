package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class hz0 {
    public jz0 f27612a;
    public gz0 f27613b;
    public TL_iv.pageTableCell f27614c;
    public final int d;
    public int f27615e;
    public int f27616f;
    public int f27617g;
    public int h;
    public int f27618i;
    public int f27619j;
    public int f27620k;
    public int f27621l;
    public int f27622m;
    public int f27623n;
    public int f27624o;
    public int f27625p;
    public int f27626q;
    public int f27627r = -1;
    public final oz0 f27628s;

    public hz0(oz0 oz0Var, int i10) {
        this.f27628s = oz0Var;
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
        if (this.f27614c != null) {
            int i18 = this.f27625p + this.f27620k;
            oz0 oz0Var = this.f27628s;
            int i19 = oz0Var.f29905y;
            Path path = oz0Var.I;
            nz0 nz0Var = oz0Var.L;
            float[] fArr = oz0Var.K;
            RectF rectF2 = oz0Var.J;
            if (i18 == i19) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f27626q + this.f27621l == oz0Var.B) {
                z11 = true;
            } else {
                z11 = false;
            }
            int dp = AndroidUtilities.dp(8.0f);
            boolean z14 = this.f27614c.header;
            if (z14 || (oz0Var.E && this.f27612a.f28234a.f28867b.f27934a % 2 == 0)) {
                int i20 = this.f27625p;
                if (i20 == 0 && this.f27626q == 0) {
                    float f14 = dp;
                    fArr[1] = f14;
                    fArr[0] = f14;
                    z12 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    z12 = false;
                }
                if (z10 && this.f27626q == 0) {
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
                    rectF2.set(i20, this.f27626q, i20 + this.f27620k, i12 + this.f27621l);
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.f27614c.header) {
                        canvas2.drawPath(path, nz0Var.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, nz0Var.getStripPaint());
                    }
                } else if (z14) {
                    canvas2.drawRect(i20, this.f27626q, i20 + this.f27620k, i11 + this.f27621l, nz0Var.getHeaderPaint());
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i20, this.f27626q, this.f27620k + i20, i10 + this.f27621l, nz0Var.getStripPaint());
                }
            }
            if (z4 && this.f27613b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.f27627r >= 0 && (m9Var = oz0Var.f29895a) != null) {
                    m9Var.a0(canvas2, (org.telegram.ui.Cells.l9) oz0Var.getParent().getParent(), this.f27627r);
                }
                this.f27613b.draw(canvas2, view);
                canvas2.restore();
            }
            if (oz0Var.D) {
                Paint linePaint = nz0Var.getLinePaint();
                Paint linePaint2 = nz0Var.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i21 = this.f27625p;
                if (i21 == 0) {
                    int i22 = this.f27626q;
                    float f18 = i22;
                    float f19 = this.f27621l + i22;
                    if (i22 == 0) {
                        f18 += dp;
                    }
                    float f20 = f18;
                    if (f19 == oz0Var.B) {
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
                    canvas.drawLine(f22, this.f27626q, f22, i13 + this.f27621l, paint2);
                }
                int i23 = this.f27626q;
                if (i23 == 0) {
                    int i24 = this.f27625p;
                    float f23 = i24;
                    float f24 = this.f27620k + i24;
                    if (i24 == 0) {
                        f23 += dp;
                    }
                    float f25 = f23;
                    if (f24 == oz0Var.f29905y) {
                        f24 -= dp;
                    }
                    float f26 = i23 + strokeWidth;
                    canvas.drawLine(f25, f26, f24, f26, paint);
                } else {
                    float f27 = i23 - strokeWidth2;
                    canvas.drawLine(this.f27625p, f27, i14 + this.f27620k, f27, paint2);
                }
                if (z10 && (i17 = this.f27626q) == 0) {
                    f10 = i17 + dp;
                } else {
                    f10 = this.f27626q - strokeWidth;
                }
                float f28 = f10;
                if (z10 && z11) {
                    f11 = (this.f27626q + this.f27621l) - dp;
                } else {
                    f11 = (this.f27626q + this.f27621l) - strokeWidth;
                }
                float f29 = (this.f27625p + this.f27620k) - strokeWidth;
                Paint paint3 = paint;
                canvas.drawLine(f29, f28, f29, f11, paint3);
                int i25 = this.f27625p;
                if (i25 == 0 && z11) {
                    f12 = i25 + dp;
                } else {
                    f12 = i25 - strokeWidth;
                }
                if (z10 && z11) {
                    f13 = (i25 + this.f27620k) - dp;
                } else {
                    f13 = (i25 + this.f27620k) - strokeWidth;
                }
                float f30 = (this.f27626q + this.f27621l) - strokeWidth;
                canvas.drawLine(f12, f30, f13, f30, paint3);
                int i26 = this.f27625p;
                if (i26 == 0 && (i16 = this.f27626q) == 0) {
                    float f31 = i26 + strokeWidth;
                    float f32 = i16 + strokeWidth;
                    float f33 = dp * 2;
                    rectF2.set(f31, f32, f31 + f33, f33 + f32);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
                } else {
                    rectF = rectF2;
                }
                if (z10 && (i15 = this.f27626q) == 0) {
                    float f34 = (this.f27625p + this.f27620k) - strokeWidth;
                    float f35 = dp * 2;
                    float f36 = i15 + strokeWidth;
                    rectF.set(f34 - f35, f36, f34, f35 + f36);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
                }
                int i27 = this.f27625p;
                if (i27 == 0 && z11) {
                    float f37 = i27 + strokeWidth;
                    float f38 = (this.f27626q + this.f27621l) - strokeWidth;
                    float f39 = dp * 2;
                    rectF.set(f37, f38 - f39, f39 + f37, f38);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
                }
                if (z10 && z11) {
                    float f40 = (this.f27625p + this.f27620k) - strokeWidth;
                    float f41 = dp * 2;
                    float f42 = (this.f27626q + this.f27621l) - strokeWidth;
                    rectF.set(f40 - f41, f42 - f41, f40, f42);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
                }
            }
        }
    }

    public final int b() {
        return this.f27625p + this.f27617g;
    }

    public final int c() {
        return this.f27626q + this.h;
    }

    public final void d(int r3, int r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hz0.d(int, int, boolean):void");
    }

    public final void e(gz0 gz0Var) {
        Layout layout;
        int min;
        this.f27613b = gz0Var;
        if (gz0Var != null) {
            layout = gz0Var.getLayout();
        } else {
            layout = null;
        }
        if (layout != null) {
            this.f27615e = 0;
            this.f27618i = 0;
            int lineCount = layout.getLineCount();
            for (int i10 = 0; i10 < lineCount; i10++) {
                float lineLeft = layout.getLineLeft(i10);
                if (i10 == 0) {
                    min = (int) Math.ceil(lineLeft);
                } else {
                    min = Math.min(this.f27618i, (int) Math.ceil(lineLeft));
                }
                this.f27618i = min;
                this.f27615e = (int) Math.ceil(Math.max(layout.getLineWidth(i10), this.f27615e));
            }
            this.f27616f = layout.getHeight();
            return;
        }
        this.f27618i = 0;
        this.f27615e = 0;
        this.f27616f = 0;
    }

    public final void f() {
        int i10 = -this.f27618i;
        this.f27617g = i10;
        TL_iv.pageTableCell pagetablecell = this.f27614c;
        boolean z4 = pagetablecell.align_right;
        oz0 oz0Var = this.f27628s;
        if (z4) {
            this.f27617g = ((this.f27620k - this.f27615e) - oz0Var.v) + i10;
        } else if (pagetablecell.align_center) {
            this.f27617g = Math.round((this.f27620k - this.f27615e) / 2.0f) + i10;
        } else {
            this.f27617g = i10 + oz0Var.v;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.f27614c;
        if (pagetablecell.valign_middle) {
            this.h = (this.f27621l - this.f27616f) / 2;
            return;
        }
        boolean z4 = pagetablecell.valign_bottom;
        oz0 oz0Var = this.f27628s;
        if (z4) {
            this.h = (this.f27621l - this.f27616f) - oz0Var.f29902s;
        } else {
            this.h = oz0Var.f29901r;
        }
    }
}
