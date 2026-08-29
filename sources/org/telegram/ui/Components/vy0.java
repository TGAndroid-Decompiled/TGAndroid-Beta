package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class vy0 {
    public xy0 f34227a;
    public uy0 f34228b;
    public TL_iv.pageTableCell f34229c;
    public final int d;
    public int f34230e;
    public int f34231f;
    public int f34232g;
    public int h;
    public int f34233i;
    public int f34234j;
    public int f34235k;
    public int f34236l;
    public int f34237m;
    public int f34238n;
    public int f34239o;
    public int f34240p;
    public int f34241q;
    public int f34242r = -1;
    public final cz0 f34243s;

    public vy0(cz0 cz0Var, int i10) {
        this.f34243s = cz0Var;
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
        float f9;
        float f10;
        float f11;
        float f12;
        RectF rectF;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.Cells.k9 k9Var;
        Canvas canvas2 = canvas;
        if (this.f34229c != null) {
            int i18 = this.f34240p + this.f34235k;
            cz0 cz0Var = this.f34243s;
            int i19 = cz0Var.f27598y;
            Path path = cz0Var.H;
            bz0 bz0Var = cz0Var.K;
            float[] fArr = cz0Var.J;
            RectF rectF2 = cz0Var.I;
            if (i18 == i19) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f34241q + this.f34236l == cz0Var.A) {
                z12 = true;
            } else {
                z12 = false;
            }
            int dp = AndroidUtilities.dp(8.0f);
            boolean z15 = this.f34229c.header;
            if (z15 || (cz0Var.D && this.f34227a.f34854a.f35456b.f34515a % 2 == 0)) {
                int i20 = this.f34240p;
                if (i20 == 0 && this.f34241q == 0) {
                    float f13 = dp;
                    fArr[1] = f13;
                    fArr[0] = f13;
                    z13 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    z13 = false;
                }
                if (z11 && this.f34241q == 0) {
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
                    rectF2.set(i20, this.f34241q, i20 + this.f34235k, i12 + this.f34236l);
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.f34229c.header) {
                        canvas2.drawPath(path, bz0Var.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, bz0Var.getStripPaint());
                    }
                } else if (z15) {
                    canvas2.drawRect(i20, this.f34241q, i20 + this.f34235k, i11 + this.f34236l, bz0Var.getHeaderPaint());
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i20, this.f34241q, this.f34235k + i20, i10 + this.f34236l, bz0Var.getStripPaint());
                }
            }
            if (z10 && this.f34228b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.f34242r >= 0 && (k9Var = cz0Var.f27588a) != null) {
                    k9Var.a0(canvas2, (org.telegram.ui.Cells.j9) cz0Var.getParent().getParent(), this.f34242r);
                }
                this.f34228b.draw(canvas2, view);
                canvas2.restore();
            }
            if (cz0Var.C) {
                Paint linePaint = bz0Var.getLinePaint();
                Paint linePaint2 = bz0Var.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i21 = this.f34240p;
                if (i21 == 0) {
                    int i22 = this.f34241q;
                    float f17 = i22;
                    float f18 = this.f34236l + i22;
                    if (i22 == 0) {
                        f17 += dp;
                    }
                    float f19 = f17;
                    if (f18 == cz0Var.A) {
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
                    canvas.drawLine(f21, this.f34241q, f21, i13 + this.f34236l, paint2);
                }
                int i23 = this.f34241q;
                if (i23 == 0) {
                    int i24 = this.f34240p;
                    float f22 = i24;
                    float f23 = this.f34235k + i24;
                    if (i24 == 0) {
                        f22 += dp;
                    }
                    float f24 = f22;
                    if (f23 == cz0Var.f27598y) {
                        f23 -= dp;
                    }
                    float f25 = i23 + strokeWidth;
                    canvas.drawLine(f24, f25, f23, f25, paint);
                } else {
                    float f26 = i23 - strokeWidth2;
                    canvas.drawLine(this.f34240p, f26, i14 + this.f34235k, f26, paint2);
                }
                if (z11 && (i17 = this.f34241q) == 0) {
                    f9 = i17 + dp;
                } else {
                    f9 = this.f34241q - strokeWidth;
                }
                float f27 = f9;
                if (z11 && z12) {
                    f10 = (this.f34241q + this.f34236l) - dp;
                } else {
                    f10 = (this.f34241q + this.f34236l) - strokeWidth;
                }
                float f28 = (this.f34240p + this.f34235k) - strokeWidth;
                Paint paint3 = paint;
                canvas.drawLine(f28, f27, f28, f10, paint3);
                int i25 = this.f34240p;
                if (i25 == 0 && z12) {
                    f11 = i25 + dp;
                } else {
                    f11 = i25 - strokeWidth;
                }
                if (z11 && z12) {
                    f12 = (i25 + this.f34235k) - dp;
                } else {
                    f12 = (i25 + this.f34235k) - strokeWidth;
                }
                float f29 = (this.f34241q + this.f34236l) - strokeWidth;
                canvas.drawLine(f11, f29, f12, f29, paint3);
                int i26 = this.f34240p;
                if (i26 == 0 && (i16 = this.f34241q) == 0) {
                    float f30 = i26 + strokeWidth;
                    float f31 = i16 + strokeWidth;
                    float f32 = dp * 2;
                    rectF2.set(f30, f31, f30 + f32, f32 + f31);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
                } else {
                    rectF = rectF2;
                }
                if (z11 && (i15 = this.f34241q) == 0) {
                    float f33 = (this.f34240p + this.f34235k) - strokeWidth;
                    float f34 = dp * 2;
                    float f35 = i15 + strokeWidth;
                    rectF.set(f33 - f34, f35, f33, f34 + f35);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
                }
                int i27 = this.f34240p;
                if (i27 == 0 && z12) {
                    float f36 = i27 + strokeWidth;
                    float f37 = (this.f34241q + this.f34236l) - strokeWidth;
                    float f38 = dp * 2;
                    rectF.set(f36, f37 - f38, f38 + f36, f37);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
                }
                if (z11 && z12) {
                    float f39 = (this.f34240p + this.f34235k) - strokeWidth;
                    float f40 = dp * 2;
                    float f41 = (this.f34241q + this.f34236l) - strokeWidth;
                    rectF.set(f39 - f40, f41 - f40, f39, f41);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
                }
            }
        }
    }

    public final int b() {
        return this.f34240p + this.f34232g;
    }

    public final int c() {
        return this.f34241q + this.h;
    }

    public final void d(int r3, int r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vy0.d(int, int, boolean):void");
    }

    public final void e(uy0 uy0Var) {
        Layout layout;
        int min;
        this.f34228b = uy0Var;
        if (uy0Var != null) {
            layout = uy0Var.getLayout();
        } else {
            layout = null;
        }
        if (layout != null) {
            this.f34230e = 0;
            this.f34233i = 0;
            int lineCount = layout.getLineCount();
            for (int i10 = 0; i10 < lineCount; i10++) {
                float lineLeft = layout.getLineLeft(i10);
                if (i10 == 0) {
                    min = (int) Math.ceil(lineLeft);
                } else {
                    min = Math.min(this.f34233i, (int) Math.ceil(lineLeft));
                }
                this.f34233i = min;
                this.f34230e = (int) Math.ceil(Math.max(layout.getLineWidth(i10), this.f34230e));
            }
            this.f34231f = layout.getHeight();
            return;
        }
        this.f34233i = 0;
        this.f34230e = 0;
        this.f34231f = 0;
    }

    public final void f() {
        int i10 = -this.f34233i;
        this.f34232g = i10;
        TL_iv.pageTableCell pagetablecell = this.f34229c;
        boolean z10 = pagetablecell.align_right;
        cz0 cz0Var = this.f34243s;
        if (z10) {
            this.f34232g = ((this.f34235k - this.f34230e) - cz0Var.v) + i10;
        } else if (pagetablecell.align_center) {
            this.f34232g = Math.round((this.f34235k - this.f34230e) / 2.0f) + i10;
        } else {
            this.f34232g = i10 + cz0Var.v;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.f34229c;
        if (pagetablecell.valign_middle) {
            this.h = (this.f34236l - this.f34231f) / 2;
            return;
        }
        boolean z10 = pagetablecell.valign_bottom;
        cz0 cz0Var = this.f34243s;
        if (z10) {
            this.h = (this.f34236l - this.f34231f) - cz0Var.f27595s;
        } else {
            this.h = cz0Var.f27594r;
        }
    }
}
