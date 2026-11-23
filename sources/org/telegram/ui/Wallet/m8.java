package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class m8 extends View {
    public final s8 f44669a;

    public m8(s8 s8Var, Context context) {
        super(context);
        this.f44669a = s8Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float max;
        RectF rectF;
        int i10;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        RectF rectF5;
        RectF rectF6;
        Canvas canvas2;
        Paint paint;
        int i11;
        s8 s8Var;
        Path path;
        y6 y6Var;
        float f16;
        s8 s8Var2 = this.f44669a;
        RectF rectF7 = s8Var2.G1;
        Path path2 = s8Var2.J;
        y6 y6Var2 = s8Var2.f45061c;
        Matrix matrix = s8Var2.f45056a0;
        Paint paint2 = s8Var2.G;
        RectF rectF8 = s8Var2.I;
        Paint paint3 = s8Var2.f45110y;
        Path path3 = s8Var2.U;
        if (s8Var2.Z0 > 0.0f) {
            paint3.setShader(null);
            paint3.setColorFilter(null);
            ArrayList arrayList = s8Var2.T;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                int i13 = i12 + 1;
                p8 p8Var = (p8) obj;
                float f17 = p8Var.h / p8Var.f44895f;
                if (f17 < 0.1f) {
                    f16 = f17 / 0.1f;
                } else {
                    float f18 = 1.0f - ((f17 - 0.1f) / 0.9f);
                    f16 = f18 * f18;
                }
                ArrayList arrayList2 = arrayList;
                float B = com.google.android.gms.internal.vision.e2.B(f16, 0.4f, 0.6f, p8Var.f44894e);
                paint3.setColor(-1);
                paint3.setAlpha((int) (Utilities.l(f16) * 130.0f));
                canvas.save();
                canvas.translate(p8Var.f44891a, p8Var.f44892b);
                canvas.rotate(p8Var.f44896g);
                path3.rewind();
                float f19 = -B;
                float f20 = f19 * 2.0f;
                path3.moveTo(0.0f, f20);
                float f21 = B * 0.35f;
                float f22 = f19 * 0.35f;
                path3.lineTo(f21, f22);
                float f23 = B * 2.0f;
                path3.lineTo(f23, 0.0f);
                path3.lineTo(f21, f21);
                path3.lineTo(0.0f, f23);
                path3.lineTo(f22, f21);
                path3.lineTo(f20, 0.0f);
                path3.lineTo(f22, f22);
                path3.close();
                canvas.drawPath(path3, paint3);
                canvas.restore();
                i12 = i13;
                arrayList = arrayList2;
            }
            float f24 = 1.0f;
            paint3.setAlpha(255);
            ArrayList arrayList3 = s8Var2.f45084n;
            int size2 = arrayList3.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList3.get(i14);
                i14++;
                o8 o8Var = (o8) obj2;
                float l10 = f24 - Utilities.l(o8Var.f44832c / 0.42f);
                float z10 = org.telegram.ui.Cells.c0.z(l10, l10, l10, f24);
                paint2.setColor(-1);
                paint2.setAlpha((int) (l10 * 90.0f));
                paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.4f) * l10);
                canvas.drawCircle(o8Var.f44830a, o8Var.f44831b, com.google.android.gms.internal.vision.e2.B(z10, 0.43f, 0.42f, s8Var2.U()), paint2);
                arrayList3 = arrayList3;
                size2 = size2;
                f24 = 1.0f;
            }
            Paint paint4 = s8Var2.f45099t1;
            Path path4 = s8Var2.f45103v1;
            Paint paint5 = s8Var2.f45097s1;
            float l11 = Utilities.l(s8Var2.f45094r1.f44967a);
            if (l11 < 0.01f || !s8Var2.C()) {
                i7 = 1;
            } else {
                paint4.setAlpha((int) (22.0f * l11));
                canvas.drawPath(path4, paint4);
                float L = org.telegram.messenger.g0.L(6.0f);
                float L2 = org.telegram.messenger.g0.L(4.5f);
                float f25 = L + L2;
                i7 = 1;
                paint5.setPathEffect(new DashPathEffect(new float[]{L, L2}, f25 - ((s8Var2.f45087o1 * org.telegram.messenger.g0.L(18.0f)) % f25)));
                paint5.setStrokeWidth(org.telegram.messenger.g0.L(3.2f));
                paint5.setColor(Color.argb((int) (40.0f * l11), 0, 18, 48));
                canvas.drawPath(path4, paint5);
                paint5.setStrokeWidth(org.telegram.messenger.g0.L(1.8f));
                paint5.setColor(Color.argb((int) (l11 * 180.0f), 255, 255, 255));
                canvas.drawPath(path4, paint5);
            }
            float y10 = com.google.android.gms.internal.vision.e2.y(s8Var2.f45059b0, 0.6f, s8Var2.f45062c0, 10.0f);
            matrix.setScale(s8Var2.Z0 * 1.5f, 1.0f);
            matrix.postRotate(-24.0f);
            float f26 = s8Var2.Z0;
            matrix.postTranslate(com.google.android.gms.internal.vision.e2.x(y10, f26, 0.45f, (-f26) * 0.25f), 0.0f);
            s8Var2.W.setLocalMatrix(matrix);
            ArrayList<RectF> stickerObstacles = y6Var2.getStickerObstacles();
            RectF rectF9 = stickerObstacles.get(0);
            RectF rectF10 = stickerObstacles.get(i7);
            RectF rectF11 = stickerObstacles.get(2);
            RectF rectF12 = stickerObstacles.get(3);
            RectF rectF13 = stickerObstacles.get(4);
            RectF rectF14 = stickerObstacles.get(5);
            ArrayList G = s8Var2.G();
            Path path5 = path2;
            int size3 = G.size();
            int i15 = 0;
            Paint paint6 = paint3;
            y6 y6Var3 = y6Var2;
            float f27 = 0.0f;
            float f28 = 0.0f;
            float f29 = 0.0f;
            float f30 = 0.0f;
            while (i15 < size3) {
                int i16 = i15 + 1;
                r8 r8Var = (r8) G.get(i15);
                int i17 = r8Var.H;
                int i18 = size3;
                q8 q8Var = r8Var.f45008i;
                ArrayList arrayList4 = G;
                q8 q8Var2 = r8Var.f45006f;
                q8 q8Var3 = r8Var.f45005e;
                RectF rectF15 = rectF11;
                q8 q8Var4 = r8Var.f45009j;
                float f31 = f29;
                q8 q8Var5 = r8Var.f45010k;
                RectF rectF16 = rectF14;
                q8 q8Var6 = r8Var.f45015p;
                float f32 = f27;
                if (i17 != 2 && (i17 != 1 || (r8Var.O && q8Var4.f44967a > 0.3f))) {
                    rectF4 = rectF9;
                    rectF2 = rectF10;
                    rectF6 = rectF12;
                    rectF5 = rectF13;
                    max = f28;
                    rectF = rectF7;
                    path = path5;
                    y6Var = y6Var3;
                    paint = paint6;
                    rectF3 = rectF16;
                    s8Var = s8Var2;
                    path5 = path;
                    s8Var2 = s8Var;
                    paint6 = paint;
                    y6Var3 = y6Var;
                    rectF7 = rectF;
                    rectF9 = rectF4;
                    rectF12 = rectF6;
                    rectF13 = rectF5;
                    f28 = max;
                    i15 = i16;
                    size3 = i18;
                    G = arrayList4;
                    rectF11 = rectF15;
                    f29 = f31;
                    f27 = f32;
                    rectF10 = rectF2;
                    rectF14 = rectF3;
                }
                Bitmap a10 = r8Var.a();
                float f33 = r8Var.f45011l.f44967a;
                float l12 = Utilities.l(r8Var.f45017r.f44967a);
                RectF rectF17 = rectF10;
                float f34 = f28;
                float B2 = com.google.android.gms.internal.vision.e2.B(l12, 0.2f, 0.8f, (((1.0f - (r8Var.f45016q.f44967a * 0.9f)) * 0.04f * f33) + 1.0f) * s8Var2.U() * r8Var.f45007g.f44967a * r8Var.h.f44967a);
                if (a10 != null && B2 >= 1.0f) {
                    float max2 = Math.max(q8Var4.f44967a, 0.7f * f33);
                    float L3 = (org.telegram.messenger.g0.L(9.0f) * max2) + org.telegram.messenger.g0.L(1.5f);
                    float sin = ((float) Math.sin(Math.toRadians(s8Var2.f45062c0))) * L3 * 2.2f;
                    float sin2 = ((float) Math.sin(Math.toRadians(s8Var2.f45059b0))) * L3 * 2.2f;
                    s8 s8Var3 = s8Var2;
                    float f35 = q8Var3.f44967a + r8Var.f45013n.f44967a + sin;
                    float L4 = ((q8Var2.f44967a + r8Var.f45014o.f44967a) + sin2) - (org.telegram.messenger.g0.L(4.0f) * max2);
                    float f36 = q8Var3.f44967a - (sin * 0.3f);
                    float f37 = (L3 * 0.22f) + (q8Var2.f44967a - (sin2 * 0.3f));
                    float l13 = Utilities.l((f33 * 1.5f) + (3.0f * max2) + q8Var6.f44967a + q8Var5.f44967a);
                    rectF7.set(Math.min(f35, f36) - B2, Math.min(L4, f37) - B2, Math.max(f35, f36) + B2, Math.max(L4, f37) + B2);
                    boolean intersects = RectF.intersects(rectF7, rectF12);
                    float f38 = B2 * 0.4f;
                    rectF8.set(f35 - f38, L4 - f38, f35 + f38, L4 + f38);
                    max = Math.max(f34, Math.max(s8.n(rectF8, rectF9), s8.n(rectF8, rectF13)) * l12);
                    f32 = Math.max(f32, s8.n(rectF8, rectF17) * l12);
                    f31 = Math.max(f31, s8.n(rectF8, rectF16) * l12);
                    RectF rectF18 = rectF12;
                    f30 = Math.max(f30, s8.n(rectF8, rectF15) * l12);
                    if (intersects) {
                        rectF = rectF7;
                        i10 = canvas.saveLayer(rectF7, null);
                    } else {
                        rectF = rectF7;
                        i10 = -1;
                    }
                    canvas.save();
                    canvas.rotate(q8Var.f44967a, f36, f37);
                    rectF2 = rectF17;
                    rectF3 = rectF16;
                    rectF4 = rectF9;
                    rectF5 = rectF13;
                    rectF6 = rectF18;
                    rectF15 = rectF15;
                    s8Var3.t(canvas, r8Var, f36, f37, com.google.android.gms.internal.vision.e2.B(q8Var6.f44967a, 0.07f, (0.08f * max2) + 0.97f, B2), Math.max(max2, q8Var5.f44967a * 0.5f), q8Var6.f44967a, l13 * l12);
                    canvas.restore();
                    float f39 = f35 - B2;
                    float f40 = L4 - B2;
                    float f41 = f35 + B2;
                    float f42 = L4 + B2;
                    int saveLayer = canvas.saveLayer(f39, f40, f41, f42, null);
                    Paint paint7 = paint6;
                    paint7.setAlpha((int) (l12 * 255.0f));
                    float f43 = q8Var5.f44967a;
                    if (f43 > 0.004f) {
                        s8Var3.r(canvas, a10, f35, L4, B2, f43, 1.0f, q8Var.f44967a, r8Var.U, r8Var.V);
                        s8Var = s8Var3;
                        canvas2 = canvas;
                        i11 = saveLayer;
                        paint = paint7;
                    } else {
                        canvas2 = canvas;
                        paint = paint7;
                        i11 = saveLayer;
                        s8Var = s8Var3;
                        canvas2.save();
                        canvas2.rotate(q8Var.f44967a, f35, L4);
                        float f44 = B2 / 2.0f;
                        rectF8.set(f35 - f44, L4 - f44, f35 + f44, L4 + f44);
                        canvas2.drawBitmap(a10, (Rect) null, rectF8, paint);
                        canvas2.restore();
                    }
                    paint.setAlpha(255);
                    canvas2.drawRect(f39, f40, f41, f42, s8Var.V);
                    canvas2.restoreToCount(i11);
                    if (intersects) {
                        if (intersects) {
                            path = path5;
                            y6Var = y6Var3;
                            y6Var.h(path, s8Var.Z0, s8Var.f45057a1);
                            canvas2.drawPath(path, s8Var.H1);
                        } else {
                            path = path5;
                            y6Var = y6Var3;
                        }
                        canvas2.restoreToCount(i10);
                    } else {
                        path = path5;
                        y6Var = y6Var3;
                    }
                    path5 = path;
                    s8Var2 = s8Var;
                    paint6 = paint;
                    y6Var3 = y6Var;
                    rectF7 = rectF;
                    rectF9 = rectF4;
                    rectF12 = rectF6;
                    rectF13 = rectF5;
                    f28 = max;
                    i15 = i16;
                    size3 = i18;
                    G = arrayList4;
                    rectF11 = rectF15;
                    f29 = f31;
                    f27 = f32;
                    rectF10 = rectF2;
                    rectF14 = rectF3;
                } else {
                    f29 = f31;
                    path5 = path5;
                    f30 = f30;
                    paint6 = paint6;
                    y6Var3 = y6Var3;
                    rectF7 = rectF7;
                    rectF9 = rectF9;
                    rectF12 = rectF12;
                    i15 = i16;
                    size3 = i18;
                    rectF11 = rectF15;
                    rectF10 = rectF17;
                    rectF14 = rectF16;
                    f28 = f34;
                    f27 = f32;
                    s8Var2 = s8Var2;
                    rectF13 = rectF13;
                    G = arrayList4;
                }
            }
            s8 s8Var4 = s8Var2;
            float f45 = f27;
            float f46 = f28;
            float f47 = f29;
            y6 y6Var4 = y6Var3;
            float f48 = f30;
            Paint paint8 = s8Var4.f45082l0;
            Paint paint9 = s8Var4.m0;
            Paint paint10 = s8Var4.f45080k0;
            r8 r8Var2 = s8Var4.f45076i0;
            if (r8Var2 == null || r8Var2.H != 2) {
                f10 = f46;
                f11 = f45;
                f12 = f47;
                f13 = f48;
            } else {
                float f49 = r8Var2.f45013n.f44967a + r8Var2.f45005e.f44967a;
                float f50 = r8Var2.f45014o.f44967a + r8Var2.f45006f.f44967a;
                float P = (s8Var4.P(r8Var2) * 0.5f) + org.telegram.messenger.g0.L(9.0f);
                paint10.setColor(-1);
                Paint.Style style = Paint.Style.STROKE;
                paint10.setStyle(style);
                paint10.setStrokeCap(Paint.Cap.ROUND);
                paint10.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                if (paint10.getPathEffect() == null) {
                    f15 = f46;
                    paint10.setPathEffect(new DashPathEffect(new float[]{org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f)}, 0.5f));
                } else {
                    f15 = f46;
                }
                paint10.setShadowLayer(org.telegram.messenger.g0.L(0.75f), 0.0f, 0.0f, 1342177280);
                paint9.setColor(-1);
                paint9.setStyle(style);
                paint9.setStrokeWidth(org.telegram.messenger.g0.L(2.66f));
                paint9.setShadowLayer(org.telegram.messenger.g0.L(0.75f), 0.0f, 0.0f, 1342177280);
                paint8.setColor(-15033089);
                canvas.save();
                canvas.rotate(r8Var2.f45008i.f44967a, f49, f50);
                float f51 = f49 - P;
                float f52 = f50 - P;
                f11 = f45;
                float f53 = f49 + P;
                float f54 = f50 + P;
                f13 = f48;
                f12 = f47;
                f10 = f15;
                canvas.drawArc(f51, f52, f53, f54, 0.0f, 180.0f, false, paint10);
                canvas.drawArc(f51, f52, f53, f54, 180.0f, 180.0f, false, paint10);
                for (int i19 = -1; i19 <= 1; i19 += 2) {
                    float f55 = (i19 * P) + f49;
                    canvas.drawCircle(f55, f50, org.telegram.messenger.g0.L(5.66f), paint9);
                    canvas.drawCircle(f55, f50, org.telegram.messenger.g0.L(4.66f), paint8);
                }
                canvas.restore();
            }
            w6 w6Var = y6Var4.O;
            float round = Math.round(f13 * 20.0f) / 20.0f;
            if (round != y6Var4.K) {
                y6Var4.K = round;
                y6Var4.I.invalidate();
            }
            if (Math.max(f12, f10) > 0.0f) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            if (f14 != y6Var4.h) {
                y6Var4.h = f14;
                w6Var.invalidate();
            }
            float round2 = Math.round(f10 * 20.0f) / 20.0f;
            float round3 = Math.round(f11 * 20.0f) / 20.0f;
            if (round2 != y6Var4.f45436e0) {
                y6Var4.f45436e0 = round2;
                w6Var.invalidate();
                y6Var4.P.invalidate();
            }
            if (round3 != y6Var4.f45438f0) {
                y6Var4.f45438f0 = round3;
                y6Var4.H.invalidate();
            }
        }
    }
}
