package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class px0 {
    public rx0 f38592a;
    public ox0 f38593b;
    public TL_iv.pageTableCell f38594c;
    public final int d;
    public int f38595e;
    public int f38596f;
    public int f38597g;
    public int h;
    public int f38598i;
    public int f38599j;
    public int f38600k;
    public int f38601l;
    public int f38602m;
    public int f38603n;
    public int f38604o;
    public int f38605p;
    public int f38606q;
    public int f38607r = -1;
    public final wx0 f38608s;

    public px0(wx0 wx0Var, int i7) {
        this.f38608s = wx0Var;
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
        org.telegram.ui.Cells.i9 i9Var;
        Canvas canvas2 = canvas;
        if (this.f38594c != null) {
            int i17 = this.f38605p + this.f38600k;
            wx0 wx0Var = this.f38608s;
            int i18 = wx0Var.E;
            Path path = wx0Var.M;
            vx0 vx0Var = wx0Var.P;
            float[] fArr = wx0Var.O;
            RectF rectF2 = wx0Var.N;
            if (i17 == i18) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f38606q + this.f38601l == wx0Var.F) {
                z12 = true;
            } else {
                z12 = false;
            }
            int L = org.telegram.messenger.g0.L(8.0f);
            boolean z15 = this.f38594c.header;
            if (z15 || (wx0Var.I && this.f38592a.f39330a.f40132b.f38934a % 2 == 0)) {
                int i19 = this.f38605p;
                if (i19 == 0 && this.f38606q == 0) {
                    float f14 = L;
                    fArr[1] = f14;
                    fArr[0] = f14;
                    z13 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    z13 = false;
                }
                if (z11 && this.f38606q == 0) {
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
                    rectF2.set(i19, this.f38606q, i19 + this.f38600k, i11 + this.f38601l);
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.f38594c.header) {
                        canvas2.drawPath(path, vx0Var.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, vx0Var.getStripPaint());
                    }
                } else if (z15) {
                    canvas2.drawRect(i19, this.f38606q, i19 + this.f38600k, i10 + this.f38601l, vx0Var.getHeaderPaint());
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i19, this.f38606q, this.f38600k + i19, i7 + this.f38601l, vx0Var.getStripPaint());
                }
            }
            if (z10 && this.f38593b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.f38607r >= 0 && (i9Var = wx0Var.f41804a) != null) {
                    i9Var.Z(canvas2, (org.telegram.ui.Cells.h9) wx0Var.getParent().getParent(), this.f38607r);
                }
                this.f38593b.d(canvas2, view);
                canvas2.restore();
            }
            if (wx0Var.H) {
                Paint linePaint = vx0Var.getLinePaint();
                Paint linePaint2 = vx0Var.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i20 = this.f38605p;
                if (i20 == 0) {
                    int i21 = this.f38606q;
                    float f18 = i21;
                    float f19 = this.f38601l + i21;
                    if (i21 == 0) {
                        f18 += L;
                    }
                    float f20 = f18;
                    if (f19 == wx0Var.F) {
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
                    canvas.drawLine(f22, this.f38606q, f22, i12 + this.f38601l, paint2);
                }
                int i22 = this.f38606q;
                if (i22 == 0) {
                    int i23 = this.f38605p;
                    float f23 = i23;
                    float f24 = this.f38600k + i23;
                    if (i23 == 0) {
                        f23 += L;
                    }
                    float f25 = f23;
                    if (f24 == wx0Var.E) {
                        f24 -= L;
                    }
                    float f26 = i22 + strokeWidth;
                    canvas.drawLine(f25, f26, f24, f26, paint);
                } else {
                    float f27 = i22 - strokeWidth2;
                    canvas.drawLine(this.f38605p, f27, i13 + this.f38600k, f27, paint2);
                }
                if (z11 && (i16 = this.f38606q) == 0) {
                    f10 = i16 + L;
                } else {
                    f10 = this.f38606q - strokeWidth;
                }
                float f28 = f10;
                if (z11 && z12) {
                    f11 = (this.f38606q + this.f38601l) - L;
                } else {
                    f11 = (this.f38606q + this.f38601l) - strokeWidth;
                }
                float f29 = (this.f38605p + this.f38600k) - strokeWidth;
                Paint paint3 = paint;
                canvas.drawLine(f29, f28, f29, f11, paint3);
                int i24 = this.f38605p;
                if (i24 == 0 && z12) {
                    f12 = i24 + L;
                } else {
                    f12 = i24 - strokeWidth;
                }
                if (z11 && z12) {
                    f13 = (i24 + this.f38600k) - L;
                } else {
                    f13 = (i24 + this.f38600k) - strokeWidth;
                }
                float f30 = (this.f38606q + this.f38601l) - strokeWidth;
                canvas.drawLine(f12, f30, f13, f30, paint3);
                int i25 = this.f38605p;
                if (i25 == 0 && (i15 = this.f38606q) == 0) {
                    float f31 = i25 + strokeWidth;
                    float f32 = i15 + strokeWidth;
                    float f33 = L * 2;
                    rectF2.set(f31, f32, f31 + f33, f33 + f32);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
                } else {
                    rectF = rectF2;
                }
                if (z11 && (i14 = this.f38606q) == 0) {
                    float f34 = (this.f38605p + this.f38600k) - strokeWidth;
                    float f35 = L * 2;
                    float f36 = i14 + strokeWidth;
                    rectF.set(f34 - f35, f36, f34, f35 + f36);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
                }
                int i26 = this.f38605p;
                if (i26 == 0 && z12) {
                    float f37 = i26 + strokeWidth;
                    float f38 = (this.f38606q + this.f38601l) - strokeWidth;
                    float f39 = L * 2;
                    rectF.set(f37, f38 - f39, f39 + f37, f38);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
                }
                if (z11 && z12) {
                    float f40 = (this.f38605p + this.f38600k) - strokeWidth;
                    float f41 = L * 2;
                    float f42 = (this.f38606q + this.f38601l) - strokeWidth;
                    rectF.set(f40 - f41, f42 - f41, f40, f42);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
                }
            }
        }
    }

    public final int b() {
        return this.f38605p + this.f38597g;
    }

    public final int c() {
        return this.f38606q + this.h;
    }

    public final void d(int r3, int r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.px0.d(int, int, boolean):void");
    }

    public final void e(ox0 ox0Var) {
        Layout layout;
        int min;
        this.f38593b = ox0Var;
        if (ox0Var != null) {
            layout = ox0Var.a();
        } else {
            layout = null;
        }
        if (layout != null) {
            this.f38595e = 0;
            this.f38598i = 0;
            int lineCount = layout.getLineCount();
            for (int i7 = 0; i7 < lineCount; i7++) {
                float lineLeft = layout.getLineLeft(i7);
                if (i7 == 0) {
                    min = (int) Math.ceil(lineLeft);
                } else {
                    min = Math.min(this.f38598i, (int) Math.ceil(lineLeft));
                }
                this.f38598i = min;
                this.f38595e = (int) Math.ceil(Math.max(layout.getLineWidth(i7), this.f38595e));
            }
            this.f38596f = layout.getHeight();
            return;
        }
        this.f38598i = 0;
        this.f38595e = 0;
        this.f38596f = 0;
    }

    public final void f() {
        int i7 = -this.f38598i;
        this.f38597g = i7;
        TL_iv.pageTableCell pagetablecell = this.f38594c;
        boolean z10 = pagetablecell.align_right;
        wx0 wx0Var = this.f38608s;
        if (z10) {
            this.f38597g = ((this.f38600k - this.f38595e) - wx0Var.f41812w) + i7;
        } else if (pagetablecell.align_center) {
            this.f38597g = Math.round((this.f38600k - this.f38595e) / 2.0f) + i7;
        } else {
            this.f38597g = i7 + wx0Var.f41812w;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.f38594c;
        if (pagetablecell.valign_middle) {
            this.h = (this.f38601l - this.f38596f) / 2;
            return;
        }
        boolean z10 = pagetablecell.valign_bottom;
        wx0 wx0Var = this.f38608s;
        if (z10) {
            this.h = (this.f38601l - this.f38596f) - wx0Var.f41811s;
        } else {
            this.h = wx0Var.f41810r;
        }
    }
}
