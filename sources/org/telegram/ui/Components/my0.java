package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

public final class my0 {

    public oy0 f30778a;

    public ly0 f30779b;

    public TL_iv.pageTableCell f30780c;
    public final int d;

    public int f30781e;

    public int f30782f;

    public int f30783g;
    public int h;

    public int f30784i;

    public int f30785j;

    public int f30786k;

    public int f30787l;

    public int f30788m;

    public int f30789n;

    public int f30790o;

    public int f30791p;

    public int f30792q;

    public int f30793r = -1;

    public final ty0 f30794s;

    public my0(ty0 ty0Var, int i10) {
        this.f30794s = ty0Var;
        this.d = i10;
    }

    public final void a(Canvas canvas, View view, boolean z10) {
        boolean z11;
        boolean z12;
        Paint paint;
        RectF rectF;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Cells.j9 j9Var;
        Canvas canvas2 = canvas;
        if (this.f30780c == null) {
            return;
        }
        int i13 = this.f30791p + this.f30786k;
        ty0 ty0Var = this.f30794s;
        int i14 = ty0Var.f32925y;
        Path path = ty0Var.H;
        sy0 sy0Var = ty0Var.K;
        float[] fArr = ty0Var.J;
        RectF rectF2 = ty0Var.I;
        boolean z13 = i13 == i14;
        boolean z14 = this.f30792q + this.f30787l == ty0Var.A;
        int iDp = AndroidUtilities.dp(8.0f);
        boolean z15 = this.f30780c.header;
        if (z15 || (ty0Var.D && this.f30778a.f31445a.f32006b.f31061a % 2 == 0)) {
            int i15 = this.f30791p;
            if (i15 == 0 && this.f30792q == 0) {
                float f10 = iDp;
                fArr[1] = f10;
                fArr[0] = f10;
                z11 = true;
            } else {
                fArr[1] = 0.0f;
                fArr[0] = 0.0f;
                z11 = false;
            }
            if (z13 && this.f30792q == 0) {
                float f11 = iDp;
                fArr[3] = f11;
                fArr[2] = f11;
                z11 = true;
            } else {
                fArr[3] = 0.0f;
                fArr[2] = 0.0f;
            }
            if (z13 && z14) {
                float f12 = iDp;
                fArr[5] = f12;
                fArr[4] = f12;
                z11 = true;
            } else {
                fArr[5] = 0.0f;
                fArr[4] = 0.0f;
            }
            if (i15 == 0 && z14) {
                float f13 = iDp;
                fArr[7] = f13;
                fArr[6] = f13;
                z12 = true;
            } else {
                fArr[7] = 0.0f;
                fArr[6] = 0.0f;
                z12 = z11;
            }
            if (z12) {
                int i16 = this.f30792q;
                rectF2.set(i15, i16, i15 + this.f30786k, i16 + this.f30787l);
                path.reset();
                path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                if (this.f30780c.header) {
                    canvas2.drawPath(path, sy0Var.getHeaderPaint());
                } else {
                    canvas2.drawPath(path, sy0Var.getStripPaint());
                }
            } else if (z15) {
                int i17 = this.f30792q;
                canvas2.drawRect(i15, i17, i15 + this.f30786k, i17 + this.f30787l, sy0Var.getHeaderPaint());
                canvas2 = canvas;
            } else {
                int i18 = this.f30792q;
                canvas2 = canvas;
                canvas2.drawRect(i15, i18, this.f30786k + i15, i18 + this.f30787l, sy0Var.getStripPaint());
            }
        }
        if (z10 && this.f30779b != null) {
            canvas2.save();
            canvas2.translate(b(), c());
            if (this.f30793r >= 0 && (j9Var = ty0Var.f32915a) != null) {
                j9Var.a0(canvas2, (org.telegram.ui.Cells.i9) ty0Var.getParent().getParent(), this.f30793r);
            }
            this.f30779b.draw(canvas2, view);
            canvas2.restore();
        }
        if (ty0Var.C) {
            Paint linePaint = sy0Var.getLinePaint();
            Paint linePaint2 = sy0Var.getLinePaint();
            float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
            float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
            int i19 = this.f30791p;
            if (i19 == 0) {
                int i20 = this.f30792q;
                float f14 = i20;
                float f15 = this.f30787l + i20;
                if (i20 == 0) {
                    f14 += iDp;
                }
                float f16 = f14;
                if (f15 == ty0Var.A) {
                    f15 -= iDp;
                }
                float f17 = i19 + strokeWidth;
                canvas2.drawLine(f17, f16, f17, f15, linePaint);
                paint = linePaint2;
            } else {
                float f18 = i19 - strokeWidth2;
                int i21 = this.f30792q;
                paint = linePaint2;
                canvas.drawLine(f18, i21, f18, i21 + this.f30787l, paint);
            }
            int i22 = this.f30792q;
            if (i22 == 0) {
                int i23 = this.f30791p;
                float f19 = i23;
                float f20 = this.f30786k + i23;
                if (i23 == 0) {
                    f19 += iDp;
                }
                float f21 = f19;
                if (f20 == ty0Var.f32925y) {
                    f20 -= iDp;
                }
                float f22 = i22 + strokeWidth;
                canvas.drawLine(f21, f22, f20, f22, linePaint);
            } else {
                int i24 = this.f30791p;
                float f23 = i22 - strokeWidth2;
                canvas.drawLine(i24, f23, i24 + this.f30786k, f23, paint);
            }
            float f24 = (z13 && (i12 = this.f30792q) == 0) ? i12 + iDp : this.f30792q - strokeWidth;
            float f25 = (z13 && z14) ? (this.f30792q + this.f30787l) - iDp : (this.f30792q + this.f30787l) - strokeWidth;
            float f26 = (this.f30791p + this.f30786k) - strokeWidth;
            canvas.drawLine(f26, f24, f26, f25, linePaint);
            int i25 = this.f30791p;
            float f27 = (i25 == 0 && z14) ? i25 + iDp : i25 - strokeWidth;
            float f28 = (z13 && z14) ? (i25 + this.f30786k) - iDp : (i25 + this.f30786k) - strokeWidth;
            float f29 = (this.f30792q + this.f30787l) - strokeWidth;
            canvas.drawLine(f27, f29, f28, f29, linePaint);
            int i26 = this.f30791p;
            if (i26 == 0 && (i11 = this.f30792q) == 0) {
                float f30 = i26 + strokeWidth;
                float f31 = i11 + strokeWidth;
                float f32 = iDp * 2;
                rectF2.set(f30, f31, f30 + f32, f32 + f31);
                rectF = rectF2;
                canvas.drawArc(rectF, -180.0f, 90.0f, false, linePaint);
            } else {
                rectF = rectF2;
            }
            if (z13 && (i10 = this.f30792q) == 0) {
                float f33 = (this.f30791p + this.f30786k) - strokeWidth;
                float f34 = iDp * 2;
                float f35 = i10 + strokeWidth;
                rectF.set(f33 - f34, f35, f33, f34 + f35);
                canvas.drawArc(rectF, 0.0f, -90.0f, false, linePaint);
            }
            int i27 = this.f30791p;
            if (i27 == 0 && z14) {
                float f36 = i27 + strokeWidth;
                float f37 = (this.f30792q + this.f30787l) - strokeWidth;
                float f38 = iDp * 2;
                rectF.set(f36, f37 - f38, f38 + f36, f37);
                canvas.drawArc(rectF, 180.0f, -90.0f, false, linePaint);
            }
            if (z13 && z14) {
                float f39 = (this.f30791p + this.f30786k) - strokeWidth;
                float f40 = iDp * 2;
                float f41 = (this.f30792q + this.f30787l) - strokeWidth;
                rectF.set(f39 - f40, f41 - f40, f39, f41);
                canvas.drawArc(rectF, 0.0f, 90.0f, false, linePaint);
            }
        }
    }

    public final int b() {
        return this.f30791p + this.f30783g;
    }

    public final int c() {
        return this.f30792q + this.h;
    }

    public final void d(int i10, int i11, boolean z10) {
        this.f30786k = i10;
        this.f30787l = i11;
        if (z10) {
            this.f30788m = i11;
        }
        if (this.f30780c != null) {
            ly0 ly0Var = this.f30779b;
            if (ly0Var != null) {
                Layout layout = ly0Var.getLayout();
                int lineCount = layout != null ? layout.getLineCount() : 0;
                if (!z10) {
                    if (lineCount > 1) {
                        ty0 ty0Var = this.f30794s;
                        e(ty0Var.K.createTextLayout(this.f30780c, this.f30786k - (ty0Var.v * 2)));
                        this.f30788m = this.f30782f + ty0Var.f32921r + ty0Var.f32922s;
                    } else if (lineCount > 0) {
                        TL_iv.pageTableCell pagetablecell = this.f30780c;
                        if (pagetablecell.align_center || pagetablecell.align_right) {
                            ty0 ty0Var2 = this.f30794s;
                            e(ty0Var2.K.createTextLayout(this.f30780c, this.f30786k - (ty0Var2.v * 2)));
                            this.f30788m = this.f30782f + ty0Var2.f32921r + ty0Var2.f32922s;
                        }
                    }
                }
                f();
            }
            g();
        }
    }

    public final void e(ly0 ly0Var) {
        this.f30779b = ly0Var;
        Layout layout = ly0Var != null ? ly0Var.getLayout() : null;
        int i10 = 0;
        if (layout == null) {
            this.f30784i = 0;
            this.f30781e = 0;
            this.f30782f = 0;
            return;
        }
        this.f30781e = 0;
        this.f30784i = 0;
        int lineCount = layout.getLineCount();
        while (i10 < lineCount) {
            float lineLeft = layout.getLineLeft(i10);
            this.f30784i = i10 == 0 ? (int) Math.ceil(lineLeft) : Math.min(this.f30784i, (int) Math.ceil(lineLeft));
            this.f30781e = (int) Math.ceil(Math.max(layout.getLineWidth(i10), this.f30781e));
            i10++;
        }
        this.f30782f = layout.getHeight();
    }

    public final void f() {
        int i10 = -this.f30784i;
        this.f30783g = i10;
        TL_iv.pageTableCell pagetablecell = this.f30780c;
        boolean z10 = pagetablecell.align_right;
        ty0 ty0Var = this.f30794s;
        if (z10) {
            this.f30783g = ((this.f30786k - this.f30781e) - ty0Var.v) + i10;
        } else if (pagetablecell.align_center) {
            this.f30783g = Math.round((this.f30786k - this.f30781e) / 2.0f) + i10;
        } else {
            this.f30783g = i10 + ty0Var.v;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.f30780c;
        if (pagetablecell.valign_middle) {
            this.h = (this.f30787l - this.f30782f) / 2;
            return;
        }
        boolean z10 = pagetablecell.valign_bottom;
        ty0 ty0Var = this.f30794s;
        if (z10) {
            this.h = (this.f30787l - this.f30782f) - ty0Var.f32922s;
        } else {
            this.h = ty0Var.f32921r;
        }
    }
}
