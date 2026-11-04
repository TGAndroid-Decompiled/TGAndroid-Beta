package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class ex0 {
    public gx0 f33500a;
    public dx0 f33501b;
    public TL_iv.pageTableCell f33502c;
    public final int d;
    public int f33503e;
    public int f33504f;
    public int f33505g;
    public int h;
    public int f33506i;
    public int f33507j;
    public int f33508k;
    public int f33509l;
    public int f33510m;
    public int f33511n;
    public int f33512o;
    public int f33513p;
    public int f33514q;
    public int f33515r = -1;
    public final lx0 f33516s;

    public ex0(lx0 lx0Var, int i3) {
        this.f33516s = lx0Var;
        this.d = i3;
    }

    public final void a(Canvas canvas, View view, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i3;
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
        org.telegram.ui.Cells.h9 h9Var;
        Canvas canvas2 = canvas;
        if (this.f33502c != null) {
            int i17 = this.f33513p + this.f33508k;
            lx0 lx0Var = this.f33516s;
            int i18 = lx0Var.E;
            Path path = lx0Var.M;
            kx0 kx0Var = lx0Var.P;
            float[] fArr = lx0Var.O;
            RectF rectF2 = lx0Var.N;
            if (i17 == i18) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f33514q + this.f33509l == lx0Var.F) {
                z12 = true;
            } else {
                z12 = false;
            }
            int L = org.telegram.messenger.g0.L(8.0f);
            boolean z15 = this.f33502c.header;
            if (z15 || (lx0Var.I && this.f33500a.f34223a.f34856b.f33880a % 2 == 0)) {
                int i19 = this.f33513p;
                if (i19 == 0 && this.f33514q == 0) {
                    float f14 = L;
                    fArr[1] = f14;
                    fArr[0] = f14;
                    z13 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    z13 = false;
                }
                if (z11 && this.f33514q == 0) {
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
                    rectF2.set(i19, this.f33514q, i19 + this.f33508k, i11 + this.f33509l);
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.f33502c.header) {
                        canvas2.drawPath(path, kx0Var.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, kx0Var.getStripPaint());
                    }
                } else if (z15) {
                    canvas2.drawRect(i19, this.f33514q, i19 + this.f33508k, i10 + this.f33509l, kx0Var.getHeaderPaint());
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i19, this.f33514q, this.f33508k + i19, i3 + this.f33509l, kx0Var.getStripPaint());
                }
            }
            if (z10 && this.f33501b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.f33515r >= 0 && (h9Var = lx0Var.f35902a) != null) {
                    h9Var.Z(canvas2, (org.telegram.ui.Cells.g9) lx0Var.getParent().getParent(), this.f33515r);
                }
                this.f33501b.d(canvas2, view);
                canvas2.restore();
            }
            if (lx0Var.H) {
                Paint linePaint = kx0Var.getLinePaint();
                Paint linePaint2 = kx0Var.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i20 = this.f33513p;
                if (i20 == 0) {
                    int i21 = this.f33514q;
                    float f18 = i21;
                    float f19 = this.f33509l + i21;
                    if (i21 == 0) {
                        f18 += L;
                    }
                    float f20 = f18;
                    if (f19 == lx0Var.F) {
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
                    canvas.drawLine(f22, this.f33514q, f22, i12 + this.f33509l, paint2);
                }
                int i22 = this.f33514q;
                if (i22 == 0) {
                    int i23 = this.f33513p;
                    float f23 = i23;
                    float f24 = this.f33508k + i23;
                    if (i23 == 0) {
                        f23 += L;
                    }
                    float f25 = f23;
                    if (f24 == lx0Var.E) {
                        f24 -= L;
                    }
                    float f26 = i22 + strokeWidth;
                    canvas.drawLine(f25, f26, f24, f26, paint);
                } else {
                    float f27 = i22 - strokeWidth2;
                    canvas.drawLine(this.f33513p, f27, i13 + this.f33508k, f27, paint2);
                }
                if (z11 && (i16 = this.f33514q) == 0) {
                    f10 = i16 + L;
                } else {
                    f10 = this.f33514q - strokeWidth;
                }
                float f28 = f10;
                if (z11 && z12) {
                    f11 = (this.f33514q + this.f33509l) - L;
                } else {
                    f11 = (this.f33514q + this.f33509l) - strokeWidth;
                }
                float f29 = (this.f33513p + this.f33508k) - strokeWidth;
                Paint paint3 = paint;
                canvas.drawLine(f29, f28, f29, f11, paint3);
                int i24 = this.f33513p;
                if (i24 == 0 && z12) {
                    f12 = i24 + L;
                } else {
                    f12 = i24 - strokeWidth;
                }
                if (z11 && z12) {
                    f13 = (i24 + this.f33508k) - L;
                } else {
                    f13 = (i24 + this.f33508k) - strokeWidth;
                }
                float f30 = (this.f33514q + this.f33509l) - strokeWidth;
                canvas.drawLine(f12, f30, f13, f30, paint3);
                int i25 = this.f33513p;
                if (i25 == 0 && (i15 = this.f33514q) == 0) {
                    float f31 = i25 + strokeWidth;
                    float f32 = i15 + strokeWidth;
                    float f33 = L * 2;
                    rectF2.set(f31, f32, f31 + f33, f33 + f32);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
                } else {
                    rectF = rectF2;
                }
                if (z11 && (i14 = this.f33514q) == 0) {
                    float f34 = (this.f33513p + this.f33508k) - strokeWidth;
                    float f35 = L * 2;
                    float f36 = i14 + strokeWidth;
                    rectF.set(f34 - f35, f36, f34, f35 + f36);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
                }
                int i26 = this.f33513p;
                if (i26 == 0 && z12) {
                    float f37 = i26 + strokeWidth;
                    float f38 = (this.f33514q + this.f33509l) - strokeWidth;
                    float f39 = L * 2;
                    rectF.set(f37, f38 - f39, f39 + f37, f38);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
                }
                if (z11 && z12) {
                    float f40 = (this.f33513p + this.f33508k) - strokeWidth;
                    float f41 = L * 2;
                    float f42 = (this.f33514q + this.f33509l) - strokeWidth;
                    rectF.set(f40 - f41, f42 - f41, f40, f42);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
                }
            }
        }
    }

    public final int b() {
        return this.f33513p + this.f33505g;
    }

    public final int c() {
        return this.f33514q + this.h;
    }

    public final void d(int r3, int r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ex0.d(int, int, boolean):void");
    }

    public final void e(dx0 dx0Var) {
        Layout layout;
        int min;
        this.f33501b = dx0Var;
        if (dx0Var != null) {
            layout = dx0Var.a();
        } else {
            layout = null;
        }
        if (layout != null) {
            this.f33503e = 0;
            this.f33506i = 0;
            int lineCount = layout.getLineCount();
            for (int i3 = 0; i3 < lineCount; i3++) {
                float lineLeft = layout.getLineLeft(i3);
                if (i3 == 0) {
                    min = (int) Math.ceil(lineLeft);
                } else {
                    min = Math.min(this.f33506i, (int) Math.ceil(lineLeft));
                }
                this.f33506i = min;
                this.f33503e = (int) Math.ceil(Math.max(layout.getLineWidth(i3), this.f33503e));
            }
            this.f33504f = layout.getHeight();
            return;
        }
        this.f33506i = 0;
        this.f33503e = 0;
        this.f33504f = 0;
    }

    public final void f() {
        int i3 = -this.f33506i;
        this.f33505g = i3;
        TL_iv.pageTableCell pagetablecell = this.f33502c;
        boolean z10 = pagetablecell.align_right;
        lx0 lx0Var = this.f33516s;
        if (z10) {
            this.f33505g = ((this.f33508k - this.f33503e) - lx0Var.f35910w) + i3;
        } else if (pagetablecell.align_center) {
            this.f33505g = Math.round((this.f33508k - this.f33503e) / 2.0f) + i3;
        } else {
            this.f33505g = i3 + lx0Var.f35910w;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.f33502c;
        if (pagetablecell.valign_middle) {
            this.h = (this.f33509l - this.f33504f) / 2;
            return;
        }
        boolean z10 = pagetablecell.valign_bottom;
        lx0 lx0Var = this.f33516s;
        if (z10) {
            this.h = (this.f33509l - this.f33504f) - lx0Var.f35909s;
        } else {
            this.h = lx0Var.f35908r;
        }
    }
}
