package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class j01 {
    public l01 f29418a;
    public i01 f29419b;
    public TL_iv.pageTableCell f29420c;
    public final int d;
    public int e;
    public int f29421f;
    public int f29422g;
    public int h;
    public int f29423i;
    public int f29424j;
    public int f29425k;
    public int f29426l;
    public int f29427m;
    public int f29428n;
    public int f29429o;
    public int f29430p;
    public int f29431q;
    public int f29432r = -1;
    public final q01 f29433s;

    public j01(q01 q01Var, int i10) {
        this.f29433s = q01Var;
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
        org.telegram.ui.Cells.s9 s9Var;
        Canvas canvas2 = canvas;
        if (this.f29420c != null) {
            int i18 = this.f29430p + this.f29425k;
            q01 q01Var = this.f29433s;
            int i19 = q01Var.f31785y;
            Path path = q01Var.L;
            p01 p01Var = q01Var.O;
            float[] fArr = q01Var.N;
            RectF rectF2 = q01Var.M;
            if (i18 == i19) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f29431q + this.f29426l == q01Var.E) {
                z12 = true;
            } else {
                z12 = false;
            }
            int dp = AndroidUtilities.dp(8.0f);
            boolean z15 = this.f29420c.header;
            if (z15 || (q01Var.H && this.f29418a.f30012a.f30792b.f29767a % 2 == 0)) {
                int i20 = this.f29430p;
                if (i20 == 0 && this.f29431q == 0) {
                    float f13 = dp;
                    fArr[1] = f13;
                    fArr[0] = f13;
                    z13 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    z13 = false;
                }
                if (z11 && this.f29431q == 0) {
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
                    rectF2.set(i20, this.f29431q, i20 + this.f29425k, i12 + this.f29426l);
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.f29420c.header) {
                        canvas2.drawPath(path, p01Var.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, p01Var.getStripPaint());
                    }
                } else if (z15) {
                    canvas2.drawRect(i20, this.f29431q, i20 + this.f29425k, i11 + this.f29426l, p01Var.getHeaderPaint());
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i20, this.f29431q, this.f29425k + i20, i10 + this.f29426l, p01Var.getStripPaint());
                }
            }
            if (z10 && this.f29419b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.f29432r >= 0 && (s9Var = q01Var.f31776a) != null) {
                    s9Var.Z(canvas2, (org.telegram.ui.Cells.r9) q01Var.getParent().getParent(), this.f29432r);
                }
                this.f29419b.draw(canvas2, view);
                canvas2.restore();
            }
            if (q01Var.G) {
                Paint linePaint = p01Var.getLinePaint();
                Paint linePaint2 = p01Var.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i21 = this.f29430p;
                if (i21 == 0) {
                    int i22 = this.f29431q;
                    float f17 = i22;
                    float f18 = this.f29426l + i22;
                    if (i22 == 0) {
                        f17 += dp;
                    }
                    float f19 = f17;
                    if (f18 == q01Var.E) {
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
                    canvas.drawLine(f21, this.f29431q, f21, i13 + this.f29426l, paint2);
                }
                int i23 = this.f29431q;
                if (i23 == 0) {
                    int i24 = this.f29430p;
                    float f22 = i24;
                    float f23 = this.f29425k + i24;
                    if (i24 == 0) {
                        f22 += dp;
                    }
                    float f24 = f22;
                    if (f23 == q01Var.f31785y) {
                        f23 -= dp;
                    }
                    float f25 = i23 + strokeWidth;
                    canvas.drawLine(f24, f25, f23, f25, paint);
                } else {
                    float f26 = i23 - strokeWidth2;
                    canvas.drawLine(this.f29430p, f26, i14 + this.f29425k, f26, paint2);
                }
                if (z11 && (i17 = this.f29431q) == 0) {
                    f7 = i17 + dp;
                } else {
                    f7 = this.f29431q - strokeWidth;
                }
                float f27 = f7;
                if (z11 && z12) {
                    f10 = (this.f29431q + this.f29426l) - dp;
                } else {
                    f10 = (this.f29431q + this.f29426l) - strokeWidth;
                }
                float f28 = (this.f29430p + this.f29425k) - strokeWidth;
                Paint paint3 = paint;
                canvas.drawLine(f28, f27, f28, f10, paint3);
                int i25 = this.f29430p;
                if (i25 == 0 && z12) {
                    f11 = i25 + dp;
                } else {
                    f11 = i25 - strokeWidth;
                }
                if (z11 && z12) {
                    f12 = (i25 + this.f29425k) - dp;
                } else {
                    f12 = (i25 + this.f29425k) - strokeWidth;
                }
                float f29 = (this.f29431q + this.f29426l) - strokeWidth;
                canvas.drawLine(f11, f29, f12, f29, paint3);
                int i26 = this.f29430p;
                if (i26 == 0 && (i16 = this.f29431q) == 0) {
                    float f30 = i26 + strokeWidth;
                    float f31 = i16 + strokeWidth;
                    float f32 = dp * 2;
                    rectF2.set(f30, f31, f30 + f32, f32 + f31);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
                } else {
                    rectF = rectF2;
                }
                if (z11 && (i15 = this.f29431q) == 0) {
                    float f33 = (this.f29430p + this.f29425k) - strokeWidth;
                    float f34 = dp * 2;
                    float f35 = i15 + strokeWidth;
                    rectF.set(f33 - f34, f35, f33, f34 + f35);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
                }
                int i27 = this.f29430p;
                if (i27 == 0 && z12) {
                    float f36 = i27 + strokeWidth;
                    float f37 = (this.f29431q + this.f29426l) - strokeWidth;
                    float f38 = dp * 2;
                    rectF.set(f36, f37 - f38, f38 + f36, f37);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
                }
                if (z11 && z12) {
                    float f39 = (this.f29430p + this.f29425k) - strokeWidth;
                    float f40 = dp * 2;
                    float f41 = (this.f29431q + this.f29426l) - strokeWidth;
                    rectF.set(f39 - f40, f41 - f40, f39, f41);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
                }
            }
        }
    }

    public final int b() {
        return this.f29430p + this.f29422g;
    }

    public final int c() {
        return this.f29431q + this.h;
    }

    public final void d(int r3, int r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j01.d(int, int, boolean):void");
    }

    public final void e(i01 i01Var) {
        Layout layout;
        int min;
        this.f29419b = i01Var;
        if (i01Var != null) {
            layout = i01Var.getLayout();
        } else {
            layout = null;
        }
        if (layout != null) {
            this.e = 0;
            this.f29423i = 0;
            int lineCount = layout.getLineCount();
            for (int i10 = 0; i10 < lineCount; i10++) {
                float lineLeft = layout.getLineLeft(i10);
                if (i10 == 0) {
                    min = (int) Math.ceil(lineLeft);
                } else {
                    min = Math.min(this.f29423i, (int) Math.ceil(lineLeft));
                }
                this.f29423i = min;
                this.e = (int) Math.ceil(Math.max(layout.getLineWidth(i10), this.e));
            }
            this.f29421f = layout.getHeight();
            return;
        }
        this.f29423i = 0;
        this.e = 0;
        this.f29421f = 0;
    }

    public final void f() {
        int i10 = -this.f29423i;
        this.f29422g = i10;
        TL_iv.pageTableCell pagetablecell = this.f29420c;
        boolean z10 = pagetablecell.align_right;
        q01 q01Var = this.f29433s;
        if (z10) {
            this.f29422g = ((this.f29425k - this.e) - q01Var.v) + i10;
        } else if (pagetablecell.align_center) {
            this.f29422g = Math.round((this.f29425k - this.e) / 2.0f) + i10;
        } else {
            this.f29422g = i10 + q01Var.v;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.f29420c;
        if (pagetablecell.valign_middle) {
            this.h = (this.f29426l - this.f29421f) / 2;
            return;
        }
        boolean z10 = pagetablecell.valign_bottom;
        q01 q01Var = this.f29433s;
        if (z10) {
            this.h = (this.f29426l - this.f29421f) - q01Var.f31782s;
        } else {
            this.h = q01Var.f31781r;
        }
    }
}
