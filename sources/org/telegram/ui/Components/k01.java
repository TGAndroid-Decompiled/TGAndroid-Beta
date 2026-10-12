package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class k01 {
    public m01 f27691a;
    public j01 f27692b;
    public TL_iv.pageTableCell f27693c;
    public final int d;
    public int f27694e;
    public int f27695f;
    public int f27696g;
    public int h;
    public int f27697i;
    public int f27698j;
    public int f27699k;
    public int f27700l;
    public int f27701m;
    public int f27702n;
    public int f27703o;
    public int f27704p;
    public int f27705q;
    public int f27706r = -1;
    public final r01 f27707s;

    public k01(r01 r01Var, int i10) {
        this.f27707s = r01Var;
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
        if (this.f27693c != null) {
            int i18 = this.f27704p + this.f27699k;
            r01 r01Var = this.f27707s;
            int i19 = r01Var.f29972y;
            Path path = r01Var.L;
            q01 q01Var = r01Var.O;
            float[] fArr = r01Var.N;
            RectF rectF2 = r01Var.M;
            if (i18 == i19) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f27705q + this.f27700l == r01Var.E) {
                z12 = true;
            } else {
                z12 = false;
            }
            int dp = AndroidUtilities.dp(8.0f);
            boolean z15 = this.f27693c.header;
            if (z15 || (r01Var.H && this.f27691a.f28339a.f29014b.f27984a % 2 == 0)) {
                int i20 = this.f27704p;
                if (i20 == 0 && this.f27705q == 0) {
                    float f13 = dp;
                    fArr[1] = f13;
                    fArr[0] = f13;
                    z13 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    z13 = false;
                }
                if (z11 && this.f27705q == 0) {
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
                    rectF2.set(i20, this.f27705q, i20 + this.f27699k, i12 + this.f27700l);
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.f27693c.header) {
                        canvas2.drawPath(path, q01Var.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, q01Var.getStripPaint());
                    }
                } else if (z15) {
                    canvas2.drawRect(i20, this.f27705q, i20 + this.f27699k, i11 + this.f27700l, q01Var.getHeaderPaint());
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i20, this.f27705q, this.f27699k + i20, i10 + this.f27700l, q01Var.getStripPaint());
                }
            }
            if (z10 && this.f27692b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.f27706r >= 0 && (o9Var = r01Var.f29962a) != null) {
                    o9Var.Z(canvas2, (org.telegram.ui.Cells.n9) r01Var.getParent().getParent(), this.f27706r);
                }
                this.f27692b.draw(canvas2, view);
                canvas2.restore();
            }
            if (r01Var.G) {
                Paint linePaint = q01Var.getLinePaint();
                Paint linePaint2 = q01Var.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i21 = this.f27704p;
                if (i21 == 0) {
                    int i22 = this.f27705q;
                    float f17 = i22;
                    float f18 = this.f27700l + i22;
                    if (i22 == 0) {
                        f17 += dp;
                    }
                    float f19 = f17;
                    if (f18 == r01Var.E) {
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
                    canvas.drawLine(f21, this.f27705q, f21, i13 + this.f27700l, paint2);
                }
                int i23 = this.f27705q;
                if (i23 == 0) {
                    int i24 = this.f27704p;
                    float f22 = i24;
                    float f23 = this.f27699k + i24;
                    if (i24 == 0) {
                        f22 += dp;
                    }
                    float f24 = f22;
                    if (f23 == r01Var.f29972y) {
                        f23 -= dp;
                    }
                    float f25 = i23 + strokeWidth;
                    canvas.drawLine(f24, f25, f23, f25, paint);
                } else {
                    float f26 = i23 - strokeWidth2;
                    canvas.drawLine(this.f27704p, f26, i14 + this.f27699k, f26, paint2);
                }
                if (z11 && (i17 = this.f27705q) == 0) {
                    f7 = i17 + dp;
                } else {
                    f7 = this.f27705q - strokeWidth;
                }
                float f27 = f7;
                if (z11 && z12) {
                    f10 = (this.f27705q + this.f27700l) - dp;
                } else {
                    f10 = (this.f27705q + this.f27700l) - strokeWidth;
                }
                float f28 = (this.f27704p + this.f27699k) - strokeWidth;
                Paint paint3 = paint;
                canvas.drawLine(f28, f27, f28, f10, paint3);
                int i25 = this.f27704p;
                if (i25 == 0 && z12) {
                    f11 = i25 + dp;
                } else {
                    f11 = i25 - strokeWidth;
                }
                if (z11 && z12) {
                    f12 = (i25 + this.f27699k) - dp;
                } else {
                    f12 = (i25 + this.f27699k) - strokeWidth;
                }
                float f29 = (this.f27705q + this.f27700l) - strokeWidth;
                canvas.drawLine(f11, f29, f12, f29, paint3);
                int i26 = this.f27704p;
                if (i26 == 0 && (i16 = this.f27705q) == 0) {
                    float f30 = i26 + strokeWidth;
                    float f31 = i16 + strokeWidth;
                    float f32 = dp * 2;
                    rectF2.set(f30, f31, f30 + f32, f32 + f31);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
                } else {
                    rectF = rectF2;
                }
                if (z11 && (i15 = this.f27705q) == 0) {
                    float f33 = (this.f27704p + this.f27699k) - strokeWidth;
                    float f34 = dp * 2;
                    float f35 = i15 + strokeWidth;
                    rectF.set(f33 - f34, f35, f33, f34 + f35);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
                }
                int i27 = this.f27704p;
                if (i27 == 0 && z12) {
                    float f36 = i27 + strokeWidth;
                    float f37 = (this.f27705q + this.f27700l) - strokeWidth;
                    float f38 = dp * 2;
                    rectF.set(f36, f37 - f38, f38 + f36, f37);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
                }
                if (z11 && z12) {
                    float f39 = (this.f27704p + this.f27699k) - strokeWidth;
                    float f40 = dp * 2;
                    float f41 = (this.f27705q + this.f27700l) - strokeWidth;
                    rectF.set(f39 - f40, f41 - f40, f39, f41);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
                }
            }
        }
    }

    public final int b() {
        return this.f27704p + this.f27696g;
    }

    public final int c() {
        return this.f27705q + this.h;
    }

    public final void d(int r3, int r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k01.d(int, int, boolean):void");
    }

    public final void e(j01 j01Var) {
        Layout layout;
        int min;
        this.f27692b = j01Var;
        if (j01Var != null) {
            layout = j01Var.getLayout();
        } else {
            layout = null;
        }
        if (layout != null) {
            this.f27694e = 0;
            this.f27697i = 0;
            int lineCount = layout.getLineCount();
            for (int i10 = 0; i10 < lineCount; i10++) {
                float lineLeft = layout.getLineLeft(i10);
                if (i10 == 0) {
                    min = (int) Math.ceil(lineLeft);
                } else {
                    min = Math.min(this.f27697i, (int) Math.ceil(lineLeft));
                }
                this.f27697i = min;
                this.f27694e = (int) Math.ceil(Math.max(layout.getLineWidth(i10), this.f27694e));
            }
            this.f27695f = layout.getHeight();
            return;
        }
        this.f27697i = 0;
        this.f27694e = 0;
        this.f27695f = 0;
    }

    public final void f() {
        int i10 = -this.f27697i;
        this.f27696g = i10;
        TL_iv.pageTableCell pagetablecell = this.f27693c;
        boolean z10 = pagetablecell.align_right;
        r01 r01Var = this.f27707s;
        if (z10) {
            this.f27696g = ((this.f27699k - this.f27694e) - r01Var.v) + i10;
        } else if (pagetablecell.align_center) {
            this.f27696g = Math.round((this.f27699k - this.f27694e) / 2.0f) + i10;
        } else {
            this.f27696g = i10 + r01Var.v;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.f27693c;
        if (pagetablecell.valign_middle) {
            this.h = (this.f27700l - this.f27695f) / 2;
            return;
        }
        boolean z10 = pagetablecell.valign_bottom;
        r01 r01Var = this.f27707s;
        if (z10) {
            this.h = (this.f27700l - this.f27695f) - r01Var.f29969s;
        } else {
            this.h = r01Var.f29968r;
        }
    }
}
