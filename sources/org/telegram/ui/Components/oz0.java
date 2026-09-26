package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class oz0 {
    public qz0 f27153a;
    public nz0 f27154b;
    public TL_iv.pageTableCell f27155c;
    public final int d;
    public int e;
    public int f27156f;
    public int f27157g;
    public int h;
    public int f27158i;
    public int f27159j;
    public int f27160k;
    public int f27161l;
    public int f27162m;
    public int f27163n;
    public int f27164o;
    public int f27165p;
    public int f27166q;
    public int f27167r = -1;
    public final vz0 f27168s;

    public oz0(vz0 vz0Var, int i10) {
        this.f27168s = vz0Var;
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
        if (this.f27155c != null) {
            int i18 = this.f27165p + this.f27160k;
            vz0 vz0Var = this.f27168s;
            int i19 = vz0Var.f29805y;
            Path path = vz0Var.L;
            uz0 uz0Var = vz0Var.O;
            float[] fArr = vz0Var.N;
            RectF rectF2 = vz0Var.M;
            if (i18 == i19) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f27166q + this.f27161l == vz0Var.E) {
                z12 = true;
            } else {
                z12 = false;
            }
            int dp = AndroidUtilities.dp(8.0f);
            boolean z15 = this.f27155c.header;
            if (z15 || (vz0Var.H && this.f27153a.f27789a.f28387b.f27524a % 2 == 0)) {
                int i20 = this.f27165p;
                if (i20 == 0 && this.f27166q == 0) {
                    float f13 = dp;
                    fArr[1] = f13;
                    fArr[0] = f13;
                    z13 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    z13 = false;
                }
                if (z11 && this.f27166q == 0) {
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
                    rectF2.set(i20, this.f27166q, i20 + this.f27160k, i12 + this.f27161l);
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.f27155c.header) {
                        canvas2.drawPath(path, uz0Var.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, uz0Var.getStripPaint());
                    }
                } else if (z15) {
                    canvas2.drawRect(i20, this.f27166q, i20 + this.f27160k, i11 + this.f27161l, uz0Var.getHeaderPaint());
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i20, this.f27166q, this.f27160k + i20, i10 + this.f27161l, uz0Var.getStripPaint());
                }
            }
            if (z10 && this.f27154b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.f27167r >= 0 && (q9Var = vz0Var.f29796a) != null) {
                    q9Var.a0(canvas2, (org.telegram.ui.Cells.p9) vz0Var.getParent().getParent(), this.f27167r);
                }
                this.f27154b.draw(canvas2, view);
                canvas2.restore();
            }
            if (vz0Var.G) {
                Paint linePaint = uz0Var.getLinePaint();
                Paint linePaint2 = uz0Var.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i21 = this.f27165p;
                if (i21 == 0) {
                    int i22 = this.f27166q;
                    float f17 = i22;
                    float f18 = this.f27161l + i22;
                    if (i22 == 0) {
                        f17 += dp;
                    }
                    float f19 = f17;
                    if (f18 == vz0Var.E) {
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
                    canvas.drawLine(f21, this.f27166q, f21, i13 + this.f27161l, paint2);
                }
                int i23 = this.f27166q;
                if (i23 == 0) {
                    int i24 = this.f27165p;
                    float f22 = i24;
                    float f23 = this.f27160k + i24;
                    if (i24 == 0) {
                        f22 += dp;
                    }
                    float f24 = f22;
                    if (f23 == vz0Var.f29805y) {
                        f23 -= dp;
                    }
                    float f25 = i23 + strokeWidth;
                    canvas.drawLine(f24, f25, f23, f25, paint);
                } else {
                    float f26 = i23 - strokeWidth2;
                    canvas.drawLine(this.f27165p, f26, i14 + this.f27160k, f26, paint2);
                }
                if (z11 && (i17 = this.f27166q) == 0) {
                    f7 = i17 + dp;
                } else {
                    f7 = this.f27166q - strokeWidth;
                }
                float f27 = f7;
                if (z11 && z12) {
                    f10 = (this.f27166q + this.f27161l) - dp;
                } else {
                    f10 = (this.f27166q + this.f27161l) - strokeWidth;
                }
                float f28 = (this.f27165p + this.f27160k) - strokeWidth;
                Paint paint3 = paint;
                canvas.drawLine(f28, f27, f28, f10, paint3);
                int i25 = this.f27165p;
                if (i25 == 0 && z12) {
                    f11 = i25 + dp;
                } else {
                    f11 = i25 - strokeWidth;
                }
                if (z11 && z12) {
                    f12 = (i25 + this.f27160k) - dp;
                } else {
                    f12 = (i25 + this.f27160k) - strokeWidth;
                }
                float f29 = (this.f27166q + this.f27161l) - strokeWidth;
                canvas.drawLine(f11, f29, f12, f29, paint3);
                int i26 = this.f27165p;
                if (i26 == 0 && (i16 = this.f27166q) == 0) {
                    float f30 = i26 + strokeWidth;
                    float f31 = i16 + strokeWidth;
                    float f32 = dp * 2;
                    rectF2.set(f30, f31, f30 + f32, f32 + f31);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
                } else {
                    rectF = rectF2;
                }
                if (z11 && (i15 = this.f27166q) == 0) {
                    float f33 = (this.f27165p + this.f27160k) - strokeWidth;
                    float f34 = dp * 2;
                    float f35 = i15 + strokeWidth;
                    rectF.set(f33 - f34, f35, f33, f34 + f35);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
                }
                int i27 = this.f27165p;
                if (i27 == 0 && z12) {
                    float f36 = i27 + strokeWidth;
                    float f37 = (this.f27166q + this.f27161l) - strokeWidth;
                    float f38 = dp * 2;
                    rectF.set(f36, f37 - f38, f38 + f36, f37);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
                }
                if (z11 && z12) {
                    float f39 = (this.f27165p + this.f27160k) - strokeWidth;
                    float f40 = dp * 2;
                    float f41 = (this.f27166q + this.f27161l) - strokeWidth;
                    rectF.set(f39 - f40, f41 - f40, f39, f41);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
                }
            }
        }
    }

    public final int b() {
        return this.f27165p + this.f27157g;
    }

    public final int c() {
        return this.f27166q + this.h;
    }

    public final void d(int r3, int r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oz0.d(int, int, boolean):void");
    }

    public final void e(nz0 nz0Var) {
        Layout layout;
        int min;
        this.f27154b = nz0Var;
        if (nz0Var != null) {
            layout = nz0Var.getLayout();
        } else {
            layout = null;
        }
        if (layout != null) {
            this.e = 0;
            this.f27158i = 0;
            int lineCount = layout.getLineCount();
            for (int i10 = 0; i10 < lineCount; i10++) {
                float lineLeft = layout.getLineLeft(i10);
                if (i10 == 0) {
                    min = (int) Math.ceil(lineLeft);
                } else {
                    min = Math.min(this.f27158i, (int) Math.ceil(lineLeft));
                }
                this.f27158i = min;
                this.e = (int) Math.ceil(Math.max(layout.getLineWidth(i10), this.e));
            }
            this.f27156f = layout.getHeight();
            return;
        }
        this.f27158i = 0;
        this.e = 0;
        this.f27156f = 0;
    }

    public final void f() {
        int i10 = -this.f27158i;
        this.f27157g = i10;
        TL_iv.pageTableCell pagetablecell = this.f27155c;
        boolean z10 = pagetablecell.align_right;
        vz0 vz0Var = this.f27168s;
        if (z10) {
            this.f27157g = ((this.f27160k - this.e) - vz0Var.v) + i10;
        } else if (pagetablecell.align_center) {
            this.f27157g = Math.round((this.f27160k - this.e) / 2.0f) + i10;
        } else {
            this.f27157g = i10 + vz0Var.v;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.f27155c;
        if (pagetablecell.valign_middle) {
            this.h = (this.f27161l - this.f27156f) / 2;
            return;
        }
        boolean z10 = pagetablecell.valign_bottom;
        vz0 vz0Var = this.f27168s;
        if (z10) {
            this.h = (this.f27161l - this.f27156f) - vz0Var.f29802s;
        } else {
            this.h = vz0Var.f29801r;
        }
    }
}
