package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.yi;
public final class v5 extends Drawable {
    public final int f29759a;
    public final Paint f29760b;
    public final RectF f29761c;
    public final int d;
    public final Object f29762e;
    public final View f29763f;

    public v5(View view, View view2, int i7, Paint paint) {
        this.f29759a = 0;
        this.f29762e = view;
        this.f29763f = view2;
        this.d = i7;
        this.f29760b = paint;
        this.f29761c = new RectF();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f29759a) {
            case 0:
                Rect bounds = getBounds();
                RectF rectF = this.f29761c;
                rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                j6.t((View) this.f29762e, this.f29763f, null);
                float f10 = this.d;
                Paint paint = this.f29760b;
                if (paint == null) {
                    paint = j6.V0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, f10, f10, paint);
                if (j6.d1()) {
                    canvas.drawRoundRect(rectF, f10, f10, j6.V0("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                e();
                canvas.drawPath((Path) this.f29762e, this.f29760b);
                return;
        }
    }

    public void e() {
        float f10;
        boolean z10;
        yi yiVar;
        org.telegram.ui.Cells.w1 w1Var;
        int i7;
        int i10;
        Rect bounds = getBounds();
        RectF rectF = this.f29761c;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        Path path = (Path) this.f29762e;
        path.rewind();
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f29763f;
        int[] iArr = q1Var.L2;
        int i11 = this.d;
        int i12 = iArr[i11];
        if (i12 != 3 && i12 != 4) {
            float f11 = 0.0f;
            if (i12 == 2) {
                gj gjVar = q1Var.Q5;
                if (gjVar != null && gjVar.P3()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                for (int i13 = 0; i13 < 4; i13++) {
                    if (!q1Var.E2) {
                        if (z10) {
                            i7 = 3;
                        } else {
                            i7 = 2;
                        }
                        if (i13 == i7) {
                            float[] fArr = org.telegram.ui.Cells.q1.f30899wd;
                            int i14 = i13 * 2;
                            float L = org.telegram.messenger.g0.L(gz.Y0);
                            fArr[i14 + 1] = L;
                            fArr[i14] = L;
                        } else if (((q1Var.C6 && q1Var.M == null) || q1Var.G) && (i13 == 2 || i13 == 3)) {
                            float[] fArr2 = org.telegram.ui.Cells.q1.f30899wd;
                            int i15 = i13 * 2;
                            int i16 = i15 + 1;
                            if (q1Var.G) {
                                i10 = Math.min(5, gz.Y0);
                            } else {
                                i10 = gz.Y0;
                            }
                            float L2 = org.telegram.messenger.g0.L(i10);
                            fArr2[i16] = L2;
                            fArr2[i15] = L2;
                        }
                    }
                    float[] fArr3 = org.telegram.ui.Cells.q1.f30899wd;
                    int i17 = i13 * 2;
                    fArr3[i17 + 1] = 0.0f;
                    fArr3[i17] = 0.0f;
                }
                if (!z10 && !q1Var.K && (yiVar = q1Var.M) == null && (yiVar == null || ((w1Var = q1Var.f31211x2) != null && w1Var.f31852b))) {
                    path.moveTo(rectF.left + org.telegram.messenger.g0.L(6.0f), rectF.top);
                    path.lineTo(rectF.left + org.telegram.messenger.g0.L(6.0f), (rectF.bottom - org.telegram.messenger.g0.L(6.0f)) - org.telegram.messenger.g0.L(5.0f));
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(rectF.left + org.telegram.messenger.g0.L(-7.0f), rectF.bottom - org.telegram.messenger.g0.L(23.0f), rectF.left + org.telegram.messenger.g0.L(6.0f), rectF.bottom);
                    path.arcTo(rectF2, 0.0f, 83.0f, false);
                    float f12 = rectF.right;
                    float[] fArr4 = org.telegram.ui.Cells.q1.f30899wd;
                    float f13 = rectF.bottom;
                    rectF2.set(f12 - (fArr4[4] * 2.0f), f13 - (fArr4[5] * 2.0f), f12, f13);
                    path.arcTo(rectF2, 90.0f, -90.0f, false);
                    path.lineTo(rectF.right, rectF.top);
                    path.close();
                } else {
                    path.addRoundRect(rectF, org.telegram.ui.Cells.q1.f30899wd, Path.Direction.CW);
                }
                path.close();
                return;
            }
            if (i12 == 0) {
                f11 = org.telegram.messenger.g0.L(6.0f);
            }
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
            return;
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        if (iArr[i11] == 3) {
            f10 = 16.0f;
        } else {
            f10 = 20.0f;
        }
        path.addCircle(centerX, centerY, org.telegram.messenger.g0.L(f10), Path.Direction.CW);
    }

    @Override
    public final int getOpacity() {
        switch (this.f29759a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        int i10 = this.f29759a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.f29759a;
    }

    public v5(org.telegram.ui.Cells.q1 q1Var, int i7) {
        this.f29759a = 1;
        this.f29763f = q1Var;
        this.d = i7;
        Paint paint = new Paint(1);
        this.f29760b = paint;
        paint.setColor(-1);
        this.f29761c = new RectF();
        this.f29762e = new Path();
    }

    private final void a(int i7) {
    }

    private final void b(int i7) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
