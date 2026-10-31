package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class iy0 {
    public ky0 f27132a;
    public hy0 f27133b;
    public TL_iv.pageTableCell f27134c;
    public final int d;
    public int e;
    public int f27135f;
    public int f27136g;
    public int h;
    public int f27137i;
    public int f27138j;
    public int f27139k;
    public int f27140l;
    public int f27141m;
    public int f27142n;
    public int f27143o;
    public int f27144p;
    public int f27145q;
    public int f27146r = -1;
    public final py0 f27147s;

    public iy0(py0 py0Var, int i10) {
        this.f27147s = py0Var;
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
        org.telegram.ui.Cells.k9 k9Var;
        Canvas canvas2 = canvas;
        if (this.f27134c != null) {
            int i18 = this.f27144p + this.f27139k;
            py0 py0Var = this.f27147s;
            int i19 = py0Var.D;
            Path path = py0Var.L;
            oy0 oy0Var = py0Var.O;
            float[] fArr = py0Var.N;
            RectF rectF2 = py0Var.M;
            if (i18 == i19) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f27145q + this.f27140l == py0Var.E) {
                z12 = true;
            } else {
                z12 = false;
            }
            int L = org.telegram.messenger.i0.L(8.0f);
            boolean z15 = this.f27134c.header;
            if (z15 || (py0Var.H && this.f27132a.f27940a.f28635b.f27520a % 2 == 0)) {
                int i20 = this.f27144p;
                if (i20 == 0 && this.f27145q == 0) {
                    float f13 = L;
                    fArr[1] = f13;
                    fArr[0] = f13;
                    z13 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    z13 = false;
                }
                if (z11 && this.f27145q == 0) {
                    float f14 = L;
                    fArr[3] = f14;
                    fArr[2] = f14;
                    z13 = true;
                } else {
                    fArr[3] = 0.0f;
                    fArr[2] = 0.0f;
                }
                if (z11 && z12) {
                    float f15 = L;
                    fArr[5] = f15;
                    fArr[4] = f15;
                    z13 = true;
                } else {
                    fArr[5] = 0.0f;
                    fArr[4] = 0.0f;
                }
                if (i20 == 0 && z12) {
                    float f16 = L;
                    fArr[7] = f16;
                    fArr[6] = f16;
                    z14 = true;
                } else {
                    fArr[7] = 0.0f;
                    fArr[6] = 0.0f;
                    z14 = z13;
                }
                if (z14) {
                    rectF2.set(i20, this.f27145q, i20 + this.f27139k, i12 + this.f27140l);
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.f27134c.header) {
                        canvas2.drawPath(path, oy0Var.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, oy0Var.getStripPaint());
                    }
                } else if (z15) {
                    canvas2.drawRect(i20, this.f27145q, i20 + this.f27139k, i11 + this.f27140l, oy0Var.getHeaderPaint());
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i20, this.f27145q, this.f27139k + i20, i10 + this.f27140l, oy0Var.getStripPaint());
                }
            }
            if (z10 && this.f27133b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.f27146r >= 0 && (k9Var = py0Var.f29461a) != null) {
                    k9Var.Z(canvas2, (org.telegram.ui.Cells.j9) py0Var.getParent().getParent(), this.f27146r);
                }
                this.f27133b.d(canvas2, view);
                canvas2.restore();
            }
            if (py0Var.G) {
                Paint linePaint = oy0Var.getLinePaint();
                Paint linePaint2 = oy0Var.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i21 = this.f27144p;
                if (i21 == 0) {
                    int i22 = this.f27145q;
                    float f17 = i22;
                    float f18 = this.f27140l + i22;
                    if (i22 == 0) {
                        f17 += L;
                    }
                    float f19 = f17;
                    if (f18 == py0Var.E) {
                        f18 -= L;
                    }
                    float f20 = i21 + strokeWidth;
                    canvas2.drawLine(f20, f19, f20, f18, linePaint);
                    paint = linePaint;
                    paint2 = linePaint2;
                } else {
                    paint = linePaint;
                    float f21 = i21 - strokeWidth2;
                    paint2 = linePaint2;
                    canvas.drawLine(f21, this.f27145q, f21, i13 + this.f27140l, paint2);
                }
                int i23 = this.f27145q;
                if (i23 == 0) {
                    int i24 = this.f27144p;
                    float f22 = i24;
                    float f23 = this.f27139k + i24;
                    if (i24 == 0) {
                        f22 += L;
                    }
                    float f24 = f22;
                    if (f23 == py0Var.D) {
                        f23 -= L;
                    }
                    float f25 = i23 + strokeWidth;
                    canvas.drawLine(f24, f25, f23, f25, paint);
                } else {
                    float f26 = i23 - strokeWidth2;
                    canvas.drawLine(this.f27144p, f26, i14 + this.f27139k, f26, paint2);
                }
                if (z11 && (i17 = this.f27145q) == 0) {
                    f7 = i17 + L;
                } else {
                    f7 = this.f27145q - strokeWidth;
                }
                float f27 = f7;
                if (z11 && z12) {
                    f10 = (this.f27145q + this.f27140l) - L;
                } else {
                    f10 = (this.f27145q + this.f27140l) - strokeWidth;
                }
                float f28 = (this.f27144p + this.f27139k) - strokeWidth;
                Paint paint3 = paint;
                canvas.drawLine(f28, f27, f28, f10, paint3);
                int i25 = this.f27144p;
                if (i25 == 0 && z12) {
                    f11 = i25 + L;
                } else {
                    f11 = i25 - strokeWidth;
                }
                if (z11 && z12) {
                    f12 = (i25 + this.f27139k) - L;
                } else {
                    f12 = (i25 + this.f27139k) - strokeWidth;
                }
                float f29 = (this.f27145q + this.f27140l) - strokeWidth;
                canvas.drawLine(f11, f29, f12, f29, paint3);
                int i26 = this.f27144p;
                if (i26 == 0 && (i16 = this.f27145q) == 0) {
                    float f30 = i26 + strokeWidth;
                    float f31 = i16 + strokeWidth;
                    float f32 = L * 2;
                    rectF2.set(f30, f31, f30 + f32, f32 + f31);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
                } else {
                    rectF = rectF2;
                }
                if (z11 && (i15 = this.f27145q) == 0) {
                    float f33 = (this.f27144p + this.f27139k) - strokeWidth;
                    float f34 = L * 2;
                    float f35 = i15 + strokeWidth;
                    rectF.set(f33 - f34, f35, f33, f34 + f35);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
                }
                int i27 = this.f27144p;
                if (i27 == 0 && z12) {
                    float f36 = i27 + strokeWidth;
                    float f37 = (this.f27145q + this.f27140l) - strokeWidth;
                    float f38 = L * 2;
                    rectF.set(f36, f37 - f38, f38 + f36, f37);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
                }
                if (z11 && z12) {
                    float f39 = (this.f27144p + this.f27139k) - strokeWidth;
                    float f40 = L * 2;
                    float f41 = (this.f27145q + this.f27140l) - strokeWidth;
                    rectF.set(f39 - f40, f41 - f40, f39, f41);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
                }
            }
        }
    }

    public final int b() {
        return this.f27144p + this.f27136g;
    }

    public final int c() {
        return this.f27145q + this.h;
    }

    public final void d(int r3, int r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iy0.d(int, int, boolean):void");
    }

    public final void e(hy0 hy0Var) {
        Layout layout;
        int min;
        this.f27133b = hy0Var;
        if (hy0Var != null) {
            layout = hy0Var.a();
        } else {
            layout = null;
        }
        if (layout != null) {
            this.e = 0;
            this.f27137i = 0;
            int lineCount = layout.getLineCount();
            for (int i10 = 0; i10 < lineCount; i10++) {
                float lineLeft = layout.getLineLeft(i10);
                if (i10 == 0) {
                    min = (int) Math.ceil(lineLeft);
                } else {
                    min = Math.min(this.f27137i, (int) Math.ceil(lineLeft));
                }
                this.f27137i = min;
                this.e = (int) Math.ceil(Math.max(layout.getLineWidth(i10), this.e));
            }
            this.f27135f = layout.getHeight();
            return;
        }
        this.f27137i = 0;
        this.e = 0;
        this.f27135f = 0;
    }

    public final void f() {
        int i10 = -this.f27137i;
        this.f27136g = i10;
        TL_iv.pageTableCell pagetablecell = this.f27134c;
        boolean z10 = pagetablecell.align_right;
        py0 py0Var = this.f27147s;
        if (z10) {
            this.f27136g = ((this.f27139k - this.e) - py0Var.f29468w) + i10;
        } else if (pagetablecell.align_center) {
            this.f27136g = Math.round((this.f27139k - this.e) / 2.0f) + i10;
        } else {
            this.f27136g = i10 + py0Var.f29468w;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.f27134c;
        if (pagetablecell.valign_middle) {
            this.h = (this.f27140l - this.f27135f) / 2;
            return;
        }
        boolean z10 = pagetablecell.valign_bottom;
        py0 py0Var = this.f27147s;
        if (z10) {
            this.h = (this.f27140l - this.f27135f) - py0Var.f29467s;
        } else {
            this.h = py0Var.f29466r;
        }
    }
}
