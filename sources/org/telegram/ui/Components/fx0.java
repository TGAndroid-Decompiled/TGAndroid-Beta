package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class fx0 {
    public hx0 f33664a;
    public ex0 f33665b;
    public TL_iv.pageTableCell f33666c;
    public final int d;
    public int f33667e;
    public int f33668f;
    public int f33669g;
    public int h;
    public int f33670i;
    public int f33671j;
    public int f33672k;
    public int f33673l;
    public int f33674m;
    public int f33675n;
    public int f33676o;
    public int f33677p;
    public int f33678q;
    public int f33679r = -1;
    public final mx0 f33680s;

    public fx0(mx0 mx0Var, int i7) {
        this.f33680s = mx0Var;
        this.d = i7;
    }

    public final void a(Canvas canvas, View view, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
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
        org.telegram.ui.Cells.i9 i9Var;
        Canvas canvas2 = canvas;
        if (this.f33666c != null) {
            int i17 = this.f33677p + this.f33672k;
            mx0 mx0Var = this.f33680s;
            int i18 = mx0Var.D;
            Path path = mx0Var.L;
            lx0 lx0Var = mx0Var.O;
            float[] fArr = mx0Var.N;
            RectF rectF2 = mx0Var.M;
            if (i17 == i18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f33678q + this.f33673l == mx0Var.E) {
                z11 = true;
            } else {
                z11 = false;
            }
            int L = org.telegram.messenger.g0.L(8.0f);
            boolean z14 = this.f33666c.header;
            if (z14 || (mx0Var.H && this.f33664a.f34478a.f35103b.f34004a % 2 == 0)) {
                int i19 = this.f33677p;
                if (i19 == 0 && this.f33678q == 0) {
                    float f14 = L;
                    fArr[1] = f14;
                    fArr[0] = f14;
                    z12 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    z12 = false;
                }
                if (z10 && this.f33678q == 0) {
                    float f15 = L;
                    fArr[3] = f15;
                    fArr[2] = f15;
                    z12 = true;
                } else {
                    fArr[3] = 0.0f;
                    fArr[2] = 0.0f;
                }
                if (z10 && z11) {
                    float f16 = L;
                    fArr[5] = f16;
                    fArr[4] = f16;
                    z12 = true;
                } else {
                    fArr[5] = 0.0f;
                    fArr[4] = 0.0f;
                }
                if (i19 == 0 && z11) {
                    float f17 = L;
                    fArr[7] = f17;
                    fArr[6] = f17;
                    z13 = true;
                } else {
                    fArr[7] = 0.0f;
                    fArr[6] = 0.0f;
                    z13 = z12;
                }
                if (z13) {
                    rectF2.set(i19, this.f33678q, i19 + this.f33672k, i11 + this.f33673l);
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.f33666c.header) {
                        canvas2.drawPath(path, lx0Var.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, lx0Var.getStripPaint());
                    }
                } else if (z14) {
                    canvas2.drawRect(i19, this.f33678q, i19 + this.f33672k, i10 + this.f33673l, lx0Var.getHeaderPaint());
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i19, this.f33678q, this.f33672k + i19, i7 + this.f33673l, lx0Var.getStripPaint());
                }
            }
            if (z9 && this.f33665b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.f33679r >= 0 && (i9Var = mx0Var.f36112a) != null) {
                    i9Var.Z(canvas2, (org.telegram.ui.Cells.h9) mx0Var.getParent().getParent(), this.f33679r);
                }
                this.f33665b.d(canvas2, view);
                canvas2.restore();
            }
            if (mx0Var.G) {
                Paint linePaint = lx0Var.getLinePaint();
                Paint linePaint2 = lx0Var.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i20 = this.f33677p;
                if (i20 == 0) {
                    int i21 = this.f33678q;
                    float f18 = i21;
                    float f19 = this.f33673l + i21;
                    if (i21 == 0) {
                        f18 += L;
                    }
                    float f20 = f18;
                    if (f19 == mx0Var.E) {
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
                    canvas.drawLine(f22, this.f33678q, f22, i12 + this.f33673l, paint2);
                }
                int i22 = this.f33678q;
                if (i22 == 0) {
                    int i23 = this.f33677p;
                    float f23 = i23;
                    float f24 = this.f33672k + i23;
                    if (i23 == 0) {
                        f23 += L;
                    }
                    float f25 = f23;
                    if (f24 == mx0Var.D) {
                        f24 -= L;
                    }
                    float f26 = i22 + strokeWidth;
                    canvas.drawLine(f25, f26, f24, f26, paint);
                } else {
                    float f27 = i22 - strokeWidth2;
                    canvas.drawLine(this.f33677p, f27, i13 + this.f33672k, f27, paint2);
                }
                if (z10 && (i16 = this.f33678q) == 0) {
                    f10 = i16 + L;
                } else {
                    f10 = this.f33678q - strokeWidth;
                }
                float f28 = f10;
                if (z10 && z11) {
                    f11 = (this.f33678q + this.f33673l) - L;
                } else {
                    f11 = (this.f33678q + this.f33673l) - strokeWidth;
                }
                float f29 = (this.f33677p + this.f33672k) - strokeWidth;
                Paint paint3 = paint;
                canvas.drawLine(f29, f28, f29, f11, paint3);
                int i24 = this.f33677p;
                if (i24 == 0 && z11) {
                    f12 = i24 + L;
                } else {
                    f12 = i24 - strokeWidth;
                }
                if (z10 && z11) {
                    f13 = (i24 + this.f33672k) - L;
                } else {
                    f13 = (i24 + this.f33672k) - strokeWidth;
                }
                float f30 = (this.f33678q + this.f33673l) - strokeWidth;
                canvas.drawLine(f12, f30, f13, f30, paint3);
                int i25 = this.f33677p;
                if (i25 == 0 && (i15 = this.f33678q) == 0) {
                    float f31 = i25 + strokeWidth;
                    float f32 = i15 + strokeWidth;
                    float f33 = L * 2;
                    rectF2.set(f31, f32, f31 + f33, f33 + f32);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
                } else {
                    rectF = rectF2;
                }
                if (z10 && (i14 = this.f33678q) == 0) {
                    float f34 = (this.f33677p + this.f33672k) - strokeWidth;
                    float f35 = L * 2;
                    float f36 = i14 + strokeWidth;
                    rectF.set(f34 - f35, f36, f34, f35 + f36);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
                }
                int i26 = this.f33677p;
                if (i26 == 0 && z11) {
                    float f37 = i26 + strokeWidth;
                    float f38 = (this.f33678q + this.f33673l) - strokeWidth;
                    float f39 = L * 2;
                    rectF.set(f37, f38 - f39, f39 + f37, f38);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
                }
                if (z10 && z11) {
                    float f40 = (this.f33677p + this.f33672k) - strokeWidth;
                    float f41 = L * 2;
                    float f42 = (this.f33678q + this.f33673l) - strokeWidth;
                    rectF.set(f40 - f41, f42 - f41, f40, f42);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
                }
            }
        }
    }

    public final int b() {
        return this.f33677p + this.f33669g;
    }

    public final int c() {
        return this.f33678q + this.h;
    }

    public final void d(int r3, int r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fx0.d(int, int, boolean):void");
    }

    public final void e(ex0 ex0Var) {
        Layout layout;
        int min;
        this.f33665b = ex0Var;
        if (ex0Var != null) {
            layout = ex0Var.a();
        } else {
            layout = null;
        }
        if (layout != null) {
            this.f33667e = 0;
            this.f33670i = 0;
            int lineCount = layout.getLineCount();
            for (int i7 = 0; i7 < lineCount; i7++) {
                float lineLeft = layout.getLineLeft(i7);
                if (i7 == 0) {
                    min = (int) Math.ceil(lineLeft);
                } else {
                    min = Math.min(this.f33670i, (int) Math.ceil(lineLeft));
                }
                this.f33670i = min;
                this.f33667e = (int) Math.ceil(Math.max(layout.getLineWidth(i7), this.f33667e));
            }
            this.f33668f = layout.getHeight();
            return;
        }
        this.f33670i = 0;
        this.f33667e = 0;
        this.f33668f = 0;
    }

    public final void f() {
        int i7 = -this.f33670i;
        this.f33669g = i7;
        TL_iv.pageTableCell pagetablecell = this.f33666c;
        boolean z9 = pagetablecell.align_right;
        mx0 mx0Var = this.f33680s;
        if (z9) {
            this.f33669g = ((this.f33672k - this.f33667e) - mx0Var.f36120w) + i7;
        } else if (pagetablecell.align_center) {
            this.f33669g = Math.round((this.f33672k - this.f33667e) / 2.0f) + i7;
        } else {
            this.f33669g = i7 + mx0Var.f36120w;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.f33666c;
        if (pagetablecell.valign_middle) {
            this.h = (this.f33673l - this.f33668f) / 2;
            return;
        }
        boolean z9 = pagetablecell.valign_bottom;
        mx0 mx0Var = this.f33680s;
        if (z9) {
            this.h = (this.f33673l - this.f33668f) - mx0Var.f36119s;
        } else {
            this.h = mx0Var.f36118r;
        }
    }
}
