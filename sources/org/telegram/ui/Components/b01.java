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
    public d01 f24898a;
    public a01 f24899b;
    public TL_iv.pageTableCell f24900c;
    public final int d;
    public int e;
    public int f24901f;
    public int f24902g;
    public int h;
    public int f24903i;
    public int f24904j;
    public int f24905k;
    public int f24906l;
    public int f24907m;
    public int f24908n;
    public int f24909o;
    public int f24910p;
    public int f24911q;
    public int f24912r = -1;
    public final i01 f24913s;

    public b01(i01 i01Var, int i10) {
        this.f24913s = i01Var;
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
        if (this.f24900c != null) {
            int i18 = this.f24910p + this.f24905k;
            i01 i01Var = this.f24913s;
            int i19 = i01Var.f27148y;
            Path path = i01Var.L;
            h01 h01Var = i01Var.O;
            float[] fArr = i01Var.N;
            RectF rectF2 = i01Var.M;
            if (i18 == i19) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f24911q + this.f24906l == i01Var.E) {
                z12 = true;
            } else {
                z12 = false;
            }
            int dp = AndroidUtilities.dp(8.0f);
            boolean z15 = this.f24900c.header;
            if (z15 || (i01Var.H && this.f24898a.f25476a.f26119b.f25190a % 2 == 0)) {
                int i20 = this.f24910p;
                if (i20 == 0 && this.f24911q == 0) {
                    float f13 = dp;
                    fArr[1] = f13;
                    fArr[0] = f13;
                    z13 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    z13 = false;
                }
                if (z11 && this.f24911q == 0) {
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
                    rectF2.set(i20, this.f24911q, i20 + this.f24905k, i12 + this.f24906l);
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.f24900c.header) {
                        canvas2.drawPath(path, h01Var.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, h01Var.getStripPaint());
                    }
                } else if (z15) {
                    canvas2.drawRect(i20, this.f24911q, i20 + this.f24905k, i11 + this.f24906l, h01Var.getHeaderPaint());
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i20, this.f24911q, this.f24905k + i20, i10 + this.f24906l, h01Var.getStripPaint());
                }
            }
            if (z10 && this.f24899b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.f24912r >= 0 && (o9Var = i01Var.f27139a) != null) {
                    o9Var.Z(canvas2, (org.telegram.ui.Cells.n9) i01Var.getParent().getParent(), this.f24912r);
                }
                this.f24899b.draw(canvas2, view);
                canvas2.restore();
            }
            if (i01Var.G) {
                Paint linePaint = h01Var.getLinePaint();
                Paint linePaint2 = h01Var.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i21 = this.f24910p;
                if (i21 == 0) {
                    int i22 = this.f24911q;
                    float f17 = i22;
                    float f18 = this.f24906l + i22;
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
                    canvas.drawLine(f21, this.f24911q, f21, i13 + this.f24906l, paint2);
                }
                int i23 = this.f24911q;
                if (i23 == 0) {
                    int i24 = this.f24910p;
                    float f22 = i24;
                    float f23 = this.f24905k + i24;
                    if (i24 == 0) {
                        f22 += dp;
                    }
                    float f24 = f22;
                    if (f23 == i01Var.f27148y) {
                        f23 -= dp;
                    }
                    float f25 = i23 + strokeWidth;
                    canvas.drawLine(f24, f25, f23, f25, paint);
                } else {
                    float f26 = i23 - strokeWidth2;
                    canvas.drawLine(this.f24910p, f26, i14 + this.f24905k, f26, paint2);
                }
                if (z11 && (i17 = this.f24911q) == 0) {
                    f7 = i17 + dp;
                } else {
                    f7 = this.f24911q - strokeWidth;
                }
                float f27 = f7;
                if (z11 && z12) {
                    f10 = (this.f24911q + this.f24906l) - dp;
                } else {
                    f10 = (this.f24911q + this.f24906l) - strokeWidth;
                }
                float f28 = (this.f24910p + this.f24905k) - strokeWidth;
                Paint paint3 = paint;
                canvas.drawLine(f28, f27, f28, f10, paint3);
                int i25 = this.f24910p;
                if (i25 == 0 && z12) {
                    f11 = i25 + dp;
                } else {
                    f11 = i25 - strokeWidth;
                }
                if (z11 && z12) {
                    f12 = (i25 + this.f24905k) - dp;
                } else {
                    f12 = (i25 + this.f24905k) - strokeWidth;
                }
                float f29 = (this.f24911q + this.f24906l) - strokeWidth;
                canvas.drawLine(f11, f29, f12, f29, paint3);
                int i26 = this.f24910p;
                if (i26 == 0 && (i16 = this.f24911q) == 0) {
                    float f30 = i26 + strokeWidth;
                    float f31 = i16 + strokeWidth;
                    float f32 = dp * 2;
                    rectF2.set(f30, f31, f30 + f32, f32 + f31);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
                } else {
                    rectF = rectF2;
                }
                if (z11 && (i15 = this.f24911q) == 0) {
                    float f33 = (this.f24910p + this.f24905k) - strokeWidth;
                    float f34 = dp * 2;
                    float f35 = i15 + strokeWidth;
                    rectF.set(f33 - f34, f35, f33, f34 + f35);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
                }
                int i27 = this.f24910p;
                if (i27 == 0 && z12) {
                    float f36 = i27 + strokeWidth;
                    float f37 = (this.f24911q + this.f24906l) - strokeWidth;
                    float f38 = dp * 2;
                    rectF.set(f36, f37 - f38, f38 + f36, f37);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
                }
                if (z11 && z12) {
                    float f39 = (this.f24910p + this.f24905k) - strokeWidth;
                    float f40 = dp * 2;
                    float f41 = (this.f24911q + this.f24906l) - strokeWidth;
                    rectF.set(f39 - f40, f41 - f40, f39, f41);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
                }
            }
        }
    }

    public final int b() {
        return this.f24910p + this.f24902g;
    }

    public final int c() {
        return this.f24911q + this.h;
    }

    public final void d(int r3, int r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b01.d(int, int, boolean):void");
    }

    public final void e(a01 a01Var) {
        Layout layout;
        int min;
        this.f24899b = a01Var;
        if (a01Var != null) {
            layout = a01Var.getLayout();
        } else {
            layout = null;
        }
        if (layout != null) {
            this.e = 0;
            this.f24903i = 0;
            int lineCount = layout.getLineCount();
            for (int i10 = 0; i10 < lineCount; i10++) {
                float lineLeft = layout.getLineLeft(i10);
                if (i10 == 0) {
                    min = (int) Math.ceil(lineLeft);
                } else {
                    min = Math.min(this.f24903i, (int) Math.ceil(lineLeft));
                }
                this.f24903i = min;
                this.e = (int) Math.ceil(Math.max(layout.getLineWidth(i10), this.e));
            }
            this.f24901f = layout.getHeight();
            return;
        }
        this.f24903i = 0;
        this.e = 0;
        this.f24901f = 0;
    }

    public final void f() {
        int i10 = -this.f24903i;
        this.f24902g = i10;
        TL_iv.pageTableCell pagetablecell = this.f24900c;
        boolean z10 = pagetablecell.align_right;
        i01 i01Var = this.f24913s;
        if (z10) {
            this.f24902g = ((this.f24905k - this.e) - i01Var.v) + i10;
        } else if (pagetablecell.align_center) {
            this.f24902g = Math.round((this.f24905k - this.e) / 2.0f) + i10;
        } else {
            this.f24902g = i10 + i01Var.v;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.f24900c;
        if (pagetablecell.valign_middle) {
            this.h = (this.f24906l - this.f24901f) / 2;
            return;
        }
        boolean z10 = pagetablecell.valign_bottom;
        i01 i01Var = this.f24913s;
        if (z10) {
            this.h = (this.f24906l - this.f24901f) - i01Var.f27145s;
        } else {
            this.h = i01Var.f27144r;
        }
    }
}
