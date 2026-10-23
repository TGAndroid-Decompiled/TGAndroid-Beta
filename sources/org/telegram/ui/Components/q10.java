package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import android.text.StaticLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class q10 {
    public static float f29458i;
    public static float f29459j;
    public int f29460a;
    public final Object f29461b;
    public final Object f29462c;
    public final Object d;
    public final Object e;
    public final Object f29463f;
    public Object f29464g;
    public Object h;

    public q10(org.telegram.ui.Cells.u1 u1Var) {
        this.f29462c = new Path();
        this.d = new Rect();
        this.f29463f = new RectF();
        this.f29461b = u1Var;
        this.e = new yc(u1Var, 0.8f, 1.4f);
    }

    public void a(Canvas canvas, RectF rectF, float f7, int i10, float f10) {
        float f11;
        int i11;
        float f12;
        float f13;
        int i12;
        Path path;
        Path path2 = (Path) this.f29462c;
        SweepGradient[] sweepGradientArr = (SweepGradient[]) this.e;
        Matrix matrix = (Matrix) this.f29464g;
        RectF rectF2 = (RectF) this.h;
        Paint paint = (Paint) this.d;
        Paint paint2 = (Paint) this.f29461b;
        RectF rectF3 = (RectF) this.f29463f;
        if (f10 > 0.004f && !zh.t.a(canvas, rectF, f7, i10, f10)) {
            int i13 = this.f29460a;
            float[][] fArr = zh.d1.f51974a;
            int i14 = 4;
            int i15 = 1;
            if (i13 != 1) {
                this.f29460a = 1;
                int i16 = 0;
                while (i16 < i14) {
                    float[] fArr2 = fArr[i16];
                    int i17 = i14;
                    int[] iArr = new int[73];
                    int i18 = i15;
                    float[] fArr3 = new float[73];
                    int i19 = 0;
                    for (int i20 = 73; i19 < i20; i20 = 73) {
                        int i21 = i16;
                        float[][] fArr4 = fArr;
                        double radians = Math.toRadians(i19 * 5);
                        Path path3 = path2;
                        SweepGradient[] sweepGradientArr2 = sweepGradientArr;
                        float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr2[6]);
                        if (((float) Math.sin(radians)) < 0.0f) {
                            f11 = fArr2[11];
                        } else {
                            f11 = fArr2[12];
                        }
                        float f14 = f11 / 100.0f;
                        iArr[i19] = ((int) ((Math.max(0.0f, Math.min(1.0f, (((fArr2[5] / 100.0f) - f14) * pow) + f14)) * 255.0f) + 0.5f)) << 24;
                        fArr3[i19] = i19 / 72.0f;
                        i19++;
                        fArr = fArr4;
                        i16 = i21;
                        path2 = path3;
                        sweepGradientArr = sweepGradientArr2;
                    }
                    SweepGradient[] sweepGradientArr3 = sweepGradientArr;
                    int i22 = i16;
                    sweepGradientArr3[i22] = new SweepGradient(0.0f, 0.0f, iArr, fArr3);
                    i16 = i22 + 1;
                    i14 = i17;
                    i15 = i18;
                    path2 = path2;
                    sweepGradientArr = sweepGradientArr3;
                }
            }
            Path path4 = path2;
            SweepGradient[] sweepGradientArr4 = sweepGradientArr;
            int i23 = i15;
            int i24 = i14;
            int i25 = 0;
            float[] fArr5 = fArr[i10];
            float f15 = f29458i;
            float f16 = f29459j;
            float dpf2 = AndroidUtilities.dpf2(fArr5[8]);
            rectF3.set(rectF);
            rectF3.inset(dpf2, dpf2);
            float max = Math.max(0.0f, f7 - dpf2);
            matrix.setRotate(f15);
            matrix.postScale(rectF3.width() / Math.max(1.0f, rectF3.height()), 1.0f);
            matrix.postTranslate(rectF3.centerX(), rectF3.centerY());
            float dpf22 = AndroidUtilities.dpf2(fArr5[i24]);
            if (dpf22 > 0.05f) {
                sweepGradientArr4[i10].setLocalMatrix(matrix);
                paint.setShader(sweepGradientArr4[i10]);
                paint.setColor(-1);
                paint.setAlpha((int) (f10 * 255.0f));
                paint.setStrokeWidth(dpf22);
                rectF2.set(rectF3);
                float f17 = (-dpf22) / 2.0f;
                rectF2.inset(f17, f17);
                float f18 = (dpf22 / 2.0f) + max;
                canvas.drawRoundRect(rectF2, f18, f18, paint);
                paint.setShader(null);
            }
            double radians2 = Math.toRadians(f15);
            float f19 = (float) (-Math.sin(radians2));
            float cos = (float) Math.cos(radians2);
            float dpf23 = AndroidUtilities.dpf2(fArr5[0]);
            float dpf24 = AndroidUtilities.dpf2(fArr5[2]);
            float min = Math.min(1.0f, (f16 + 1.0f) * (fArr5[i23] / 100.0f));
            float min2 = Math.min(1.0f, (1.0f - f16) * (fArr5[3] / 100.0f));
            if (Build.VERSION.SDK_INT >= 29) {
                i11 = i23;
            } else {
                i11 = 0;
            }
            float min3 = Math.min(max, Math.min(rectF3.width(), rectF3.height()) / 2.0f);
            int i26 = 0;
            for (int i27 = 2; i26 < i27; i27 = 2) {
                if (i26 == 0) {
                    f12 = min;
                } else {
                    f12 = min2;
                }
                if (i26 == 0) {
                    f13 = dpf23;
                } else {
                    f13 = -dpf24;
                }
                if (f12 <= 0.004f || Math.abs(f13) < 0.1f) {
                    i12 = i25;
                    path = path4;
                } else {
                    rectF2.set(rectF3);
                    rectF2.offset(f19 * f13, f13 * cos);
                    path4.rewind();
                    path = path4;
                    path.addRoundRect(rectF2, min3, min3, Path.Direction.CW);
                    canvas.save();
                    zh.u.b(canvas, path);
                    if (i11 != 0) {
                        int round = Math.round(Math.min(1.0f, f12) * 255.0f);
                        paint2.setColor((round << 16) | (-16777216) | (round << 8) | round);
                        paint2.setAlpha((int) (f10 * 255.0f));
                        zh.u.i(paint2, i23);
                    } else {
                        paint2.setColor(-1);
                        paint2.setAlpha((int) (f12 * 255.0f * f10));
                    }
                    canvas.drawRoundRect(rectF3, min3, min3, paint2);
                    i12 = i25;
                    if (i11 != 0) {
                        zh.u.i(paint2, i12);
                    }
                    canvas.restore();
                }
                i26++;
                path4 = path;
                i25 = i12;
            }
        }
    }

    public void b(Canvas canvas, boolean z10) {
        Rect rect = (Rect) this.d;
        canvas.save();
        Path path = (Path) this.f29462c;
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f29464g;
        if (zVar != null) {
            zVar.setBounds(rect);
            ((org.telegram.ui.Cells.z) this.f29464g).draw(canvas);
        }
        if (z10) {
            ba0 ba0Var = (ba0) this.h;
            if (ba0Var == null) {
                ba0 ba0Var2 = new ba0();
                this.h = ba0Var2;
                ba0Var2.D = true;
            } else if (ba0Var.c() || ((ba0) this.h).d()) {
                ba0 ba0Var3 = (ba0) this.h;
                ba0Var3.f24862b = -1L;
                ba0Var3.f24863c = -1L;
            }
        } else {
            ba0 ba0Var4 = (ba0) this.h;
            if (ba0Var4 != null && !ba0Var4.d() && !((ba0) this.h).c()) {
                ((ba0) this.h).a();
            }
        }
        canvas.restore();
        ba0 ba0Var5 = (ba0) this.h;
        if (ba0Var5 != null && !ba0Var5.c()) {
            ba0 ba0Var6 = (ba0) this.h;
            ba0Var6.f24881y = path;
            ba0Var6.g(org.telegram.ui.ActionBar.h6.m1(0.7f, this.f29460a), org.telegram.ui.ActionBar.h6.m1(1.3f, this.f29460a), org.telegram.ui.ActionBar.h6.m1(1.5f, this.f29460a), org.telegram.ui.ActionBar.h6.m1(2.0f, this.f29460a));
            ((ba0) this.h).setBounds(rect);
            canvas.save();
            ((ba0) this.h).draw(canvas);
            canvas.restore();
            ((org.telegram.ui.Cells.u1) this.f29461b).invalidate();
        }
    }

    public void c(StaticLayout[] staticLayoutArr, boolean z10) {
        float d;
        float f7;
        float dp;
        RectF rectF = (RectF) this.f29463f;
        int textSize = (((int) org.telegram.ui.ActionBar.h6.X2.getTextSize()) * 2) + AndroidUtilities.dp(4.0f);
        float max = Math.max(0, Math.min(6, SharedConfig.bubbleRadius) - 1);
        float min = Math.min(9, SharedConfig.bubbleRadius);
        float min2 = Math.min(3, SharedConfig.bubbleRadius);
        float f10 = -AndroidUtilities.dp(a1.g.d(min, 9.0f, 2.66f, 4.0f));
        float f11 = -AndroidUtilities.dp(3.0f);
        float dp2 = AndroidUtilities.dp(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + AndroidUtilities.dp(d);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + AndroidUtilities.dp(d);
        Path path = (Path) this.f29462c;
        path.rewind();
        if (!z10) {
            max = SharedConfig.bubbleRadius / 2.0f;
        }
        float dp3 = AndroidUtilities.dp(max) * 2;
        rectF.set(f10, f11, f10 + dp3, dp3 + f11);
        path.arcTo(rectF, 180.0f, 90.0f);
        float f12 = lineWidth - lineWidth2;
        float f13 = min2 + min;
        if (Math.abs(f12) < AndroidUtilities.dp(f13)) {
            f7 = Math.max(lineWidth, lineWidth2);
        } else {
            f7 = lineWidth;
        }
        if (Math.abs(f12) > AndroidUtilities.dp(f13)) {
            float dp4 = AndroidUtilities.dp(min2) * 2;
            if (lineWidth < lineWidth2) {
                float y3 = com.google.android.gms.internal.play_billing.k3.y(dp2, f11, 0.45f, f11);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(f7 - dp, f11, f7, f11 + dp);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, y3 - dp4, dp4 + lineWidth, y3);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f14 = lineWidth2 - (dp2 - y3);
                rectF.set(f14, y3, lineWidth2, dp2);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f14, y3, lineWidth2, dp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float y10 = com.google.android.gms.internal.play_billing.k3.y(dp2, f11, 0.55f, f11);
                float f15 = y10 - f11;
                rectF.set(f7 - f15, f11, f7, y10);
                path.arcTo(rectF, 270.0f, 90.0f);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(lineWidth - f15, f11, lineWidth, y10);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, y10, lineWidth2 + dp4, dp4 + y10);
                path.arcTo(rectF, 270.0f, -90.0f);
                rectF.set(lineWidth2 - dp, dp2 - dp, lineWidth2, dp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            }
        } else {
            dp = AndroidUtilities.dp(min) * 2;
            float f16 = f7 - dp;
            rectF.set(f16, f11, f7, f11 + dp);
            path.arcTo(rectF, 270.0f, 90.0f);
            rectF.set(f16, dp2 - dp, f7, dp2);
            path.arcTo(rectF, 0.0f, 90.0f);
        }
        rectF.set(f10, dp2 - dp, dp + f10, dp2);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.close();
        ((Rect) this.d).set((int) f10, (int) f11, (int) Math.max(lineWidth, lineWidth2), (int) dp2);
    }

    public void d(int i10) {
        if (this.f29460a != i10) {
            org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f29464g;
            if (zVar == null) {
                this.f29464g = org.telegram.ui.ActionBar.h6.g0(i10, 2, -1);
            } else {
                org.telegram.ui.ActionBar.h6.C1(zVar, i10, true);
            }
            ((org.telegram.ui.Cells.z) this.f29464g).setCallback((org.telegram.ui.Cells.u1) this.f29461b);
            this.f29460a = i10;
        }
    }

    public void e(boolean z10) {
        org.telegram.ui.Cells.z zVar;
        Rect rect = (Rect) this.d;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((yc) this.e).c(z10);
        if (z10 && (zVar = (org.telegram.ui.Cells.z) this.f29464g) != null) {
            zVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.z zVar2 = (org.telegram.ui.Cells.z) this.f29464g;
        if (zVar2 != null) {
            zVar2.setState(z10 ? new int[]{16842910, 16842919} : new int[0]);
        }
        ((org.telegram.ui.Cells.u1) this.f29461b).invalidate();
    }

    public q10(int i10) {
        switch (i10) {
            case 2:
                this.f29461b = new Paint(1);
                Paint paint = new Paint(1);
                this.d = paint;
                this.e = new SweepGradient[4];
                this.f29460a = -1;
                this.f29464g = new Matrix();
                this.f29462c = new Path();
                this.f29463f = new RectF();
                this.h = new RectF();
                paint.setStyle(Paint.Style.STROKE);
                return;
            default:
                Paint paint2 = new Paint();
                this.f29461b = paint2;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f29462c = new ad0(tileMode);
                this.d = new ad0(tileMode);
                this.e = new ad0(Shader.TileMode.REPEAT);
                this.f29463f = new Object();
                this.f29464g = new Object();
                this.h = new float[4];
                paint2.setFilterBitmap(true);
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                return;
        }
    }
}
