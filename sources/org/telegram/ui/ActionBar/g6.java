package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.bj;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
public final class g6 extends Drawable {
    public final int f20346a;
    public final Paint f20347b;
    public final RectF f20348c;
    public final int d;
    public final Object e;
    public final View f20349f;

    public g6(View view, View view2, int i10, Paint paint) {
        this.f20346a = 0;
        this.e = view;
        this.f20349f = view2;
        this.d = i10;
        this.f20347b = paint;
        this.f20348c = new RectF();
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f20346a) {
            case 0:
                Rect bounds = getBounds();
                RectF rectF = this.f20348c;
                rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                t6.t((View) this.e, this.f20349f, null);
                float f7 = this.d;
                Paint paint = this.f20347b;
                if (paint == null) {
                    paint = t6.V0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, f7, f7, paint);
                if (t6.d1()) {
                    canvas.drawRoundRect(rectF, f7, f7, t6.V0("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                e();
                canvas.drawPath((Path) this.e, this.f20347b);
                return;
        }
    }

    public void e() {
        float f7;
        boolean z10;
        bj bjVar;
        org.telegram.ui.Cells.w1 w1Var;
        int i10;
        int i11;
        Rect bounds = getBounds();
        RectF rectF = this.f20348c;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        Path path = (Path) this.e;
        path.rewind();
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f20349f;
        int[] iArr = q1Var.J2;
        int i12 = this.d;
        int i13 = iArr[i12];
        if (i13 != 3 && i13 != 4) {
            float f10 = 0.0f;
            if (i13 == 2) {
                jj jjVar = q1Var.O5;
                if (jjVar != null && jjVar.P3()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                for (int i14 = 0; i14 < 4; i14++) {
                    if (!q1Var.C2) {
                        if (z10) {
                            i10 = 3;
                        } else {
                            i10 = 2;
                        }
                        if (i14 == i10) {
                            float[] fArr = org.telegram.ui.Cells.q1.f22482ed;
                            int i15 = i14 * 2;
                            float L = org.telegram.messenger.i0.L(tz.Y0);
                            fArr[i15 + 1] = L;
                            fArr[i15] = L;
                        } else if (((q1Var.A6 && q1Var.L == null) || q1Var.F) && (i14 == 2 || i14 == 3)) {
                            float[] fArr2 = org.telegram.ui.Cells.q1.f22482ed;
                            int i16 = i14 * 2;
                            int i17 = i16 + 1;
                            if (q1Var.F) {
                                i11 = Math.min(5, tz.Y0);
                            } else {
                                i11 = tz.Y0;
                            }
                            float L2 = org.telegram.messenger.i0.L(i11);
                            fArr2[i17] = L2;
                            fArr2[i16] = L2;
                        }
                    }
                    float[] fArr3 = org.telegram.ui.Cells.q1.f22482ed;
                    int i18 = i14 * 2;
                    fArr3[i18 + 1] = 0.0f;
                    fArr3[i18] = 0.0f;
                }
                if (!z10 && !q1Var.J && (bjVar = q1Var.L) == null && (bjVar == null || ((w1Var = q1Var.f22751v2) != null && w1Var.f23353b))) {
                    path.moveTo(rectF.left + org.telegram.messenger.i0.L(6.0f), rectF.top);
                    path.lineTo(rectF.left + org.telegram.messenger.i0.L(6.0f), (rectF.bottom - org.telegram.messenger.i0.L(6.0f)) - org.telegram.messenger.i0.L(5.0f));
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    rectF2.set(rectF.left + org.telegram.messenger.i0.L(-7.0f), rectF.bottom - org.telegram.messenger.i0.L(23.0f), rectF.left + org.telegram.messenger.i0.L(6.0f), rectF.bottom);
                    path.arcTo(rectF2, 0.0f, 83.0f, false);
                    float f11 = rectF.right;
                    float[] fArr4 = org.telegram.ui.Cells.q1.f22482ed;
                    float f12 = rectF.bottom;
                    rectF2.set(f11 - (fArr4[4] * 2.0f), f12 - (fArr4[5] * 2.0f), f11, f12);
                    path.arcTo(rectF2, 90.0f, -90.0f, false);
                    path.lineTo(rectF.right, rectF.top);
                    path.close();
                } else {
                    path.addRoundRect(rectF, org.telegram.ui.Cells.q1.f22482ed, Path.Direction.CW);
                }
                path.close();
                return;
            }
            if (i13 == 0) {
                f10 = org.telegram.messenger.i0.L(6.0f);
            }
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            return;
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        if (iArr[i12] == 3) {
            f7 = 16.0f;
        } else {
            f7 = 20.0f;
        }
        path.addCircle(centerX, centerY, org.telegram.messenger.i0.L(f7), Path.Direction.CW);
    }

    @Override
    public final int getOpacity() {
        switch (this.f20346a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f20346a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f20346a;
    }

    public g6(org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.f20346a = 1;
        this.f20349f = q1Var;
        this.d = i10;
        Paint paint = new Paint(1);
        this.f20347b = paint;
        paint.setColor(-1);
        this.f20348c = new RectF();
        this.e = new Path();
    }

    private final void a(int i10) {
    }

    private final void b(int i10) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
