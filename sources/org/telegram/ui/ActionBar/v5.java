package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.az;
import org.telegram.messenger.ri;
import org.telegram.messenger.zi;
public final class v5 extends Drawable {
    public final int f28744a;
    public final Paint f28745b;
    public final RectF f28746c;
    public final int d;
    public final Object f28747e;
    public final View f28748f;

    public v5(View view, View view2, int i3, Paint paint) {
        this.f28744a = 0;
        this.f28747e = view;
        this.f28748f = view2;
        this.d = i3;
        this.f28745b = paint;
        this.f28746c = new RectF();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f28744a) {
            case 0:
                Rect bounds = getBounds();
                RectF rectF = this.f28746c;
                rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                k6.t((View) this.f28747e, this.f28748f, null);
                float f10 = this.d;
                Paint paint = this.f28745b;
                if (paint == null) {
                    paint = k6.V0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, f10, f10, paint);
                if (k6.d1()) {
                    canvas.drawRoundRect(rectF, f10, f10, k6.V0("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                e();
                canvas.drawPath((Path) this.f28747e, this.f28745b);
                return;
        }
    }

    public void e() {
        float f10;
        boolean z10;
        ri riVar;
        org.telegram.ui.Cells.w1 w1Var;
        int i3;
        int i10;
        Rect bounds = getBounds();
        RectF rectF = this.f28746c;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        Path path = (Path) this.f28747e;
        path.rewind();
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f28748f;
        int[] iArr = q1Var.K2;
        int i11 = this.d;
        int i12 = iArr[i11];
        if (i12 != 3 && i12 != 4) {
            float f11 = 0.0f;
            if (i12 == 2) {
                zi ziVar = q1Var.P5;
                if (ziVar != null && ziVar.Q3()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                for (int i13 = 0; i13 < 4; i13++) {
                    if (!q1Var.D2) {
                        if (z10) {
                            i3 = 3;
                        } else {
                            i3 = 2;
                        }
                        if (i13 == i3) {
                            float[] fArr = org.telegram.ui.Cells.q1.f29838hd;
                            int i14 = i13 * 2;
                            float L = org.telegram.messenger.g0.L(az.Y0);
                            fArr[i14 + 1] = L;
                            fArr[i14] = L;
                        } else if (((q1Var.B6 && q1Var.M == null) || q1Var.G) && (i13 == 2 || i13 == 3)) {
                            float[] fArr2 = org.telegram.ui.Cells.q1.f29838hd;
                            int i15 = i13 * 2;
                            int i16 = i15 + 1;
                            if (q1Var.G) {
                                i10 = Math.min(5, az.Y0);
                            } else {
                                i10 = az.Y0;
                            }
                            float L2 = org.telegram.messenger.g0.L(i10);
                            fArr2[i16] = L2;
                            fArr2[i15] = L2;
                        }
                    }
                    float[] fArr3 = org.telegram.ui.Cells.q1.f29838hd;
                    int i17 = i13 * 2;
                    fArr3[i17 + 1] = 0.0f;
                    fArr3[i17] = 0.0f;
                }
                if (!z10 && !q1Var.K && (riVar = q1Var.M) == null && (riVar == null || ((w1Var = q1Var.f30122w2) != null && w1Var.f30776b))) {
                    path.moveTo(rectF.left + org.telegram.messenger.g0.L(6.0f), rectF.top);
                    path.lineTo(rectF.left + org.telegram.messenger.g0.L(6.0f), (rectF.bottom - org.telegram.messenger.g0.L(6.0f)) - org.telegram.messenger.g0.L(5.0f));
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(rectF.left + org.telegram.messenger.g0.L(-7.0f), rectF.bottom - org.telegram.messenger.g0.L(23.0f), rectF.left + org.telegram.messenger.g0.L(6.0f), rectF.bottom);
                    path.arcTo(rectF2, 0.0f, 83.0f, false);
                    float f12 = rectF.right;
                    float[] fArr4 = org.telegram.ui.Cells.q1.f29838hd;
                    float f13 = rectF.bottom;
                    rectF2.set(f12 - (fArr4[4] * 2.0f), f13 - (fArr4[5] * 2.0f), f12, f13);
                    path.arcTo(rectF2, 90.0f, -90.0f, false);
                    path.lineTo(rectF.right, rectF.top);
                    path.close();
                } else {
                    path.addRoundRect(rectF, org.telegram.ui.Cells.q1.f29838hd, Path.Direction.CW);
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
        switch (this.f28744a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i3) {
        int i10 = this.f28744a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i3 = this.f28744a;
    }

    public v5(org.telegram.ui.Cells.q1 q1Var, int i3) {
        this.f28744a = 1;
        this.f28748f = q1Var;
        this.d = i3;
        Paint paint = new Paint(1);
        this.f28745b = paint;
        paint.setColor(-1);
        this.f28746c = new RectF();
        this.f28747e = new Path();
    }

    private final void a(int i3) {
    }

    private final void b(int i3) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
