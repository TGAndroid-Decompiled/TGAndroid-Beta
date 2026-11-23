package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.cz;
import org.telegram.messenger.gj;
import org.telegram.messenger.yi;
public final class x5 extends Drawable {
    public final int f30277a;
    public final Paint f30278b;
    public final RectF f30279c;
    public final int d;
    public final Object f30280e;
    public final View f30281f;

    public x5(View view, View view2, int i7, Paint paint) {
        this.f30277a = 0;
        this.f30280e = view;
        this.f30281f = view2;
        this.d = i7;
        this.f30278b = paint;
        this.f30279c = new RectF();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f30277a) {
            case 0:
                Rect bounds = getBounds();
                RectF rectF = this.f30279c;
                rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                m6.t((View) this.f30280e, this.f30281f, null);
                float f10 = this.d;
                Paint paint = this.f30278b;
                if (paint == null) {
                    paint = m6.V0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, f10, f10, paint);
                if (m6.d1()) {
                    canvas.drawRoundRect(rectF, f10, f10, m6.V0("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                e();
                canvas.drawPath((Path) this.f30280e, this.f30278b);
                return;
        }
    }

    public void e() {
        float f10;
        boolean z10;
        yi yiVar;
        org.telegram.ui.Cells.x1 x1Var;
        int i7;
        int i10;
        Rect bounds = getBounds();
        RectF rectF = this.f30279c;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        Path path = (Path) this.f30280e;
        path.rewind();
        org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f30281f;
        int[] iArr = r1Var.L2;
        int i11 = this.d;
        int i12 = iArr[i11];
        if (i12 != 3 && i12 != 4) {
            float f11 = 0.0f;
            if (i12 == 2) {
                gj gjVar = r1Var.Q5;
                if (gjVar != null && gjVar.P3()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                for (int i13 = 0; i13 < 4; i13++) {
                    if (!r1Var.E2) {
                        if (z10) {
                            i7 = 3;
                        } else {
                            i7 = 2;
                        }
                        if (i13 == i7) {
                            float[] fArr = org.telegram.ui.Cells.r1.f31352wd;
                            int i14 = i13 * 2;
                            float L = org.telegram.messenger.g0.L(cz.Y0);
                            fArr[i14 + 1] = L;
                            fArr[i14] = L;
                        } else if (((r1Var.C6 && r1Var.M == null) || r1Var.G) && (i13 == 2 || i13 == 3)) {
                            float[] fArr2 = org.telegram.ui.Cells.r1.f31352wd;
                            int i15 = i13 * 2;
                            int i16 = i15 + 1;
                            if (r1Var.G) {
                                i10 = Math.min(5, cz.Y0);
                            } else {
                                i10 = cz.Y0;
                            }
                            float L2 = org.telegram.messenger.g0.L(i10);
                            fArr2[i16] = L2;
                            fArr2[i15] = L2;
                        }
                    }
                    float[] fArr3 = org.telegram.ui.Cells.r1.f31352wd;
                    int i17 = i13 * 2;
                    fArr3[i17 + 1] = 0.0f;
                    fArr3[i17] = 0.0f;
                }
                if (!z10 && !r1Var.K && (yiVar = r1Var.M) == null && (yiVar == null || ((x1Var = r1Var.f31664x2) != null && x1Var.f32316b))) {
                    path.moveTo(rectF.left + org.telegram.messenger.g0.L(6.0f), rectF.top);
                    path.lineTo(rectF.left + org.telegram.messenger.g0.L(6.0f), (rectF.bottom - org.telegram.messenger.g0.L(6.0f)) - org.telegram.messenger.g0.L(5.0f));
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(rectF.left + org.telegram.messenger.g0.L(-7.0f), rectF.bottom - org.telegram.messenger.g0.L(23.0f), rectF.left + org.telegram.messenger.g0.L(6.0f), rectF.bottom);
                    path.arcTo(rectF2, 0.0f, 83.0f, false);
                    float f12 = rectF.right;
                    float[] fArr4 = org.telegram.ui.Cells.r1.f31352wd;
                    float f13 = rectF.bottom;
                    rectF2.set(f12 - (fArr4[4] * 2.0f), f13 - (fArr4[5] * 2.0f), f12, f13);
                    path.arcTo(rectF2, 90.0f, -90.0f, false);
                    path.lineTo(rectF.right, rectF.top);
                    path.close();
                } else {
                    path.addRoundRect(rectF, org.telegram.ui.Cells.r1.f31352wd, Path.Direction.CW);
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
        switch (this.f30277a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        int i10 = this.f30277a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.f30277a;
    }

    public x5(org.telegram.ui.Cells.r1 r1Var, int i7) {
        this.f30277a = 1;
        this.f30281f = r1Var;
        this.d = i7;
        Paint paint = new Paint(1);
        this.f30278b = paint;
        paint.setColor(-1);
        this.f30279c = new RectF();
        this.f30280e = new Path();
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
