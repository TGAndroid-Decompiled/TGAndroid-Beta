package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class b01 {
    public d01 f23335a;
    public a01 f23336b;
    public TL_iv.pageTableCell f23337c;
    public final int d;
    public int e;
    public int f23338f;
    public int f23339g;
    public int h;
    public int f23340i;
    public int f23341j;
    public int f23342k;
    public int f23343l;
    public int f23344m;
    public int f23345n;
    public int f23346o;
    public int f23347p;
    public int f23348q;
    public int f23349r = -1;
    public final i01 f23350s;

    public b01(i01 i01Var, int i10) {
        this.f23350s = i01Var;
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
        org.telegram.ui.Cells.o9 o9Var;
        Canvas canvas2 = canvas;
        if (this.f23337c != null) {
            int i18 = this.f23347p + this.f23342k;
            i01 i01Var = this.f23350s;
            int i19 = i01Var.f25449y;
            Path path = i01Var.L;
            h01 h01Var = i01Var.O;
            float[] fArr = i01Var.N;
            RectF rectF2 = i01Var.M;
            if (i18 == i19) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f23348q + this.f23343l == i01Var.E) {
                z12 = true;
            } else {
                z12 = false;
            }
            int dp = AndroidUtilities.dp(8.0f);
            boolean z15 = this.f23337c.header;
            if (z15 || (i01Var.H && this.f23335a.f23926a.f24538b.f23601a % 2 == 0)) {
                int i20 = this.f23347p;
                if (i20 == 0 && this.f23348q == 0) {
                    float f13 = dp;
                    fArr[1] = f13;
                    fArr[0] = f13;
                    z13 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    z13 = false;
                }
                if (z11 && this.f23348q == 0) {
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
                    rectF2.set(i20, this.f23348q, i20 + this.f23342k, i12 + this.f23343l);
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.f23337c.header) {
                        canvas2.drawPath(path, h01Var.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, h01Var.getStripPaint());
                    }
                } else if (z15) {
                    canvas2.drawRect(i20, this.f23348q, i20 + this.f23342k, i11 + this.f23343l, h01Var.getHeaderPaint());
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i20, this.f23348q, this.f23342k + i20, i10 + this.f23343l, h01Var.getStripPaint());
                }
            }
            if (z10 && this.f23336b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.f23349r >= 0 && (o9Var = i01Var.f25440a) != null) {
                    o9Var.Z(canvas2, (org.telegram.ui.Cells.n9) i01Var.getParent().getParent(), this.f23349r);
                }
                this.f23336b.draw(canvas2, view);
                canvas2.restore();
            }
            if (i01Var.G) {
                Paint linePaint = h01Var.getLinePaint();
                Paint linePaint2 = h01Var.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i21 = this.f23347p;
                if (i21 == 0) {
                    int i22 = this.f23348q;
                    float f17 = i22;
                    float f18 = this.f23343l + i22;
                    if (i22 == 0) {
                        f17 += dp;
                    }
                    float f19 = f17;
                    if (f18 == i01Var.E) {
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
                    canvas.drawLine(f21, this.f23348q, f21, i13 + this.f23343l, paint2);
                }
                int i23 = this.f23348q;
                if (i23 == 0) {
                    int i24 = this.f23347p;
                    float f22 = i24;
                    float f23 = this.f23342k + i24;
                    if (i24 == 0) {
                        f22 += dp;
                    }
                    float f24 = f22;
                    if (f23 == i01Var.f25449y) {
                        f23 -= dp;
                    }
                    float f25 = i23 + strokeWidth;
                    canvas.drawLine(f24, f25, f23, f25, paint);
                } else {
                    float f26 = i23 - strokeWidth2;
                    canvas.drawLine(this.f23347p, f26, i14 + this.f23342k, f26, paint2);
                }
                if (z11 && (i17 = this.f23348q) == 0) {
                    f7 = i17 + dp;
                } else {
                    f7 = this.f23348q - strokeWidth;
                }
                float f27 = f7;
                if (z11 && z12) {
                    f10 = (this.f23348q + this.f23343l) - dp;
                } else {
                    f10 = (this.f23348q + this.f23343l) - strokeWidth;
                }
                float f28 = (this.f23347p + this.f23342k) - strokeWidth;
                Paint paint3 = paint;
                canvas.drawLine(f28, f27, f28, f10, paint3);
                int i25 = this.f23347p;
                if (i25 == 0 && z12) {
                    f11 = i25 + dp;
                } else {
                    f11 = i25 - strokeWidth;
                }
                if (z11 && z12) {
                    f12 = (i25 + this.f23342k) - dp;
                } else {
                    f12 = (i25 + this.f23342k) - strokeWidth;
                }
                float f29 = (this.f23348q + this.f23343l) - strokeWidth;
                canvas.drawLine(f11, f29, f12, f29, paint3);
                int i26 = this.f23347p;
                if (i26 == 0 && (i16 = this.f23348q) == 0) {
                    float f30 = i26 + strokeWidth;
                    float f31 = i16 + strokeWidth;
                    float f32 = dp * 2;
                    rectF2.set(f30, f31, f30 + f32, f32 + f31);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
                } else {
                    rectF = rectF2;
                }
                if (z11 && (i15 = this.f23348q) == 0) {
                    float f33 = (this.f23347p + this.f23342k) - strokeWidth;
                    float f34 = dp * 2;
                    float f35 = i15 + strokeWidth;
                    rectF.set(f33 - f34, f35, f33, f34 + f35);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
                }
                int i27 = this.f23347p;
                if (i27 == 0 && z12) {
                    float f36 = i27 + strokeWidth;
                    float f37 = (this.f23348q + this.f23343l) - strokeWidth;
                    float f38 = dp * 2;
                    rectF.set(f36, f37 - f38, f38 + f36, f37);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
                }
                if (z11 && z12) {
                    float f39 = (this.f23347p + this.f23342k) - strokeWidth;
                    float f40 = dp * 2;
                    float f41 = (this.f23348q + this.f23343l) - strokeWidth;
                    rectF.set(f39 - f40, f41 - f40, f39, f41);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
                }
            }
        }
    }

    public final int b() {
        return this.f23347p + this.f23339g;
    }

    public final int c() {
        return this.f23348q + this.h;
    }

    public final void d(int r3, int r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b01.d(int, int, boolean):void");
    }

    public final void e(a01 a01Var) {
        Layout layout;
        int min;
        this.f23336b = a01Var;
        if (a01Var != null) {
            layout = a01Var.getLayout();
        } else {
            layout = null;
        }
        if (layout != null) {
            this.e = 0;
            this.f23340i = 0;
            int lineCount = layout.getLineCount();
            for (int i10 = 0; i10 < lineCount; i10++) {
                float lineLeft = layout.getLineLeft(i10);
                if (i10 == 0) {
                    min = (int) Math.ceil(lineLeft);
                } else {
                    min = Math.min(this.f23340i, (int) Math.ceil(lineLeft));
                }
                this.f23340i = min;
                this.e = (int) Math.ceil(Math.max(layout.getLineWidth(i10), this.e));
            }
            this.f23338f = layout.getHeight();
            return;
        }
        this.f23340i = 0;
        this.e = 0;
        this.f23338f = 0;
    }

    public final void f() {
        int i10 = -this.f23340i;
        this.f23339g = i10;
        TL_iv.pageTableCell pagetablecell = this.f23337c;
        boolean z10 = pagetablecell.align_right;
        i01 i01Var = this.f23350s;
        if (z10) {
            this.f23339g = ((this.f23342k - this.e) - i01Var.v) + i10;
        } else if (pagetablecell.align_center) {
            this.f23339g = Math.round((this.f23342k - this.e) / 2.0f) + i10;
        } else {
            this.f23339g = i10 + i01Var.v;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.f23337c;
        if (pagetablecell.valign_middle) {
            this.h = (this.f23343l - this.f23338f) / 2;
            return;
        }
        boolean z10 = pagetablecell.valign_bottom;
        i01 i01Var = this.f23350s;
        if (z10) {
            this.h = (this.f23343l - this.f23338f) - i01Var.f25446s;
        } else {
            this.h = i01Var.f25445r;
        }
    }
}
