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
public final class l8 extends View {
    public final r8 f44508a;

    public l8(r8 r8Var, Context context) {
        super(context);
        this.f44508a = r8Var;
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
        r8 r8Var;
        Path path;
        x6 x6Var;
        float f16;
        r8 r8Var2 = this.f44508a;
        RectF rectF7 = r8Var2.G1;
        Path path2 = r8Var2.J;
        x6 x6Var2 = r8Var2.f44899c;
        Matrix matrix = r8Var2.f44894a0;
        Paint paint2 = r8Var2.G;
        RectF rectF8 = r8Var2.I;
        Paint paint3 = r8Var2.f44948y;
        Path path3 = r8Var2.U;
        if (r8Var2.Z0 > 0.0f) {
            paint3.setShader(null);
            paint3.setColorFilter(null);
            ArrayList arrayList = r8Var2.T;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                int i13 = i12 + 1;
                o8 o8Var = (o8) obj;
                float f17 = o8Var.h / o8Var.f44733f;
                if (f17 < 0.1f) {
                    f16 = f17 / 0.1f;
                } else {
                    float f18 = 1.0f - ((f17 - 0.1f) / 0.9f);
                    f16 = f18 * f18;
                }
                ArrayList arrayList2 = arrayList;
                float B = com.google.android.gms.internal.vision.e2.B(f16, 0.4f, 0.6f, o8Var.f44732e);
                paint3.setColor(-1);
                paint3.setAlpha((int) (Utilities.l(f16) * 130.0f));
                canvas.save();
                canvas.translate(o8Var.f44729a, o8Var.f44730b);
                canvas.rotate(o8Var.f44734g);
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
            ArrayList arrayList3 = r8Var2.f44922n;
            int size2 = arrayList3.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList3.get(i14);
                i14++;
                n8 n8Var = (n8) obj2;
                float l10 = f24 - Utilities.l(n8Var.f44670c / 0.42f);
                float z10 = org.telegram.ui.Cells.c0.z(l10, l10, l10, f24);
                paint2.setColor(-1);
                paint2.setAlpha((int) (l10 * 90.0f));
                paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.4f) * l10);
                canvas.drawCircle(n8Var.f44668a, n8Var.f44669b, com.google.android.gms.internal.vision.e2.B(z10, 0.43f, 0.42f, r8Var2.U()), paint2);
                arrayList3 = arrayList3;
                size2 = size2;
                f24 = 1.0f;
            }
            Paint paint4 = r8Var2.f44937t1;
            Path path4 = r8Var2.f44941v1;
            Paint paint5 = r8Var2.f44935s1;
            float l11 = Utilities.l(r8Var2.f44932r1.f44805a);
            if (l11 < 0.01f || !r8Var2.C()) {
                i7 = 1;
            } else {
                paint4.setAlpha((int) (22.0f * l11));
                canvas.drawPath(path4, paint4);
                float L = org.telegram.messenger.g0.L(6.0f);
                float L2 = org.telegram.messenger.g0.L(4.5f);
                float f25 = L + L2;
                i7 = 1;
                paint5.setPathEffect(new DashPathEffect(new float[]{L, L2}, f25 - ((r8Var2.f44925o1 * org.telegram.messenger.g0.L(18.0f)) % f25)));
                paint5.setStrokeWidth(org.telegram.messenger.g0.L(3.2f));
                paint5.setColor(Color.argb((int) (40.0f * l11), 0, 18, 48));
                canvas.drawPath(path4, paint5);
                paint5.setStrokeWidth(org.telegram.messenger.g0.L(1.8f));
                paint5.setColor(Color.argb((int) (l11 * 180.0f), 255, 255, 255));
                canvas.drawPath(path4, paint5);
            }
            float y10 = com.google.android.gms.internal.vision.e2.y(r8Var2.f44897b0, 0.6f, r8Var2.f44900c0, 10.0f);
            matrix.setScale(r8Var2.Z0 * 1.5f, 1.0f);
            matrix.postRotate(-24.0f);
            float f26 = r8Var2.Z0;
            matrix.postTranslate(com.google.android.gms.internal.vision.e2.x(y10, f26, 0.45f, (-f26) * 0.25f), 0.0f);
            r8Var2.W.setLocalMatrix(matrix);
            ArrayList<RectF> stickerObstacles = x6Var2.getStickerObstacles();
            RectF rectF9 = stickerObstacles.get(0);
            RectF rectF10 = stickerObstacles.get(i7);
            RectF rectF11 = stickerObstacles.get(2);
            RectF rectF12 = stickerObstacles.get(3);
            RectF rectF13 = stickerObstacles.get(4);
            RectF rectF14 = stickerObstacles.get(5);
            ArrayList G = r8Var2.G();
            Path path5 = path2;
            int size3 = G.size();
            int i15 = 0;
            Paint paint6 = paint3;
            x6 x6Var3 = x6Var2;
            float f27 = 0.0f;
            float f28 = 0.0f;
            float f29 = 0.0f;
            float f30 = 0.0f;
            while (i15 < size3) {
                int i16 = i15 + 1;
                q8 q8Var = (q8) G.get(i15);
                int i17 = q8Var.H;
                int i18 = size3;
                p8 p8Var = q8Var.f44846i;
                ArrayList arrayList4 = G;
                p8 p8Var2 = q8Var.f44844f;
                p8 p8Var3 = q8Var.f44843e;
                RectF rectF15 = rectF11;
                p8 p8Var4 = q8Var.f44847j;
                float f31 = f29;
                p8 p8Var5 = q8Var.f44848k;
                RectF rectF16 = rectF14;
                p8 p8Var6 = q8Var.f44853p;
                float f32 = f27;
                if (i17 != 2 && (i17 != 1 || (q8Var.O && p8Var4.f44805a > 0.3f))) {
                    rectF4 = rectF9;
                    rectF2 = rectF10;
                    rectF6 = rectF12;
                    rectF5 = rectF13;
                    max = f28;
                    rectF = rectF7;
                    path = path5;
                    x6Var = x6Var3;
                    paint = paint6;
                    rectF3 = rectF16;
                    r8Var = r8Var2;
                    path5 = path;
                    r8Var2 = r8Var;
                    paint6 = paint;
                    x6Var3 = x6Var;
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
                Bitmap a10 = q8Var.a();
                float f33 = q8Var.f44849l.f44805a;
                float l12 = Utilities.l(q8Var.f44855r.f44805a);
                RectF rectF17 = rectF10;
                float f34 = f28;
                float B2 = com.google.android.gms.internal.vision.e2.B(l12, 0.2f, 0.8f, (((1.0f - (q8Var.f44854q.f44805a * 0.9f)) * 0.04f * f33) + 1.0f) * r8Var2.U() * q8Var.f44845g.f44805a * q8Var.h.f44805a);
                if (a10 != null && B2 >= 1.0f) {
                    float max2 = Math.max(p8Var4.f44805a, 0.7f * f33);
                    float L3 = (org.telegram.messenger.g0.L(9.0f) * max2) + org.telegram.messenger.g0.L(1.5f);
                    float sin = ((float) Math.sin(Math.toRadians(r8Var2.f44900c0))) * L3 * 2.2f;
                    float sin2 = ((float) Math.sin(Math.toRadians(r8Var2.f44897b0))) * L3 * 2.2f;
                    r8 r8Var3 = r8Var2;
                    float f35 = p8Var3.f44805a + q8Var.f44851n.f44805a + sin;
                    float L4 = ((p8Var2.f44805a + q8Var.f44852o.f44805a) + sin2) - (org.telegram.messenger.g0.L(4.0f) * max2);
                    float f36 = p8Var3.f44805a - (sin * 0.3f);
                    float f37 = (L3 * 0.22f) + (p8Var2.f44805a - (sin2 * 0.3f));
                    float l13 = Utilities.l((f33 * 1.5f) + (3.0f * max2) + p8Var6.f44805a + p8Var5.f44805a);
                    rectF7.set(Math.min(f35, f36) - B2, Math.min(L4, f37) - B2, Math.max(f35, f36) + B2, Math.max(L4, f37) + B2);
                    boolean intersects = RectF.intersects(rectF7, rectF12);
                    float f38 = B2 * 0.4f;
                    rectF8.set(f35 - f38, L4 - f38, f35 + f38, L4 + f38);
                    max = Math.max(f34, Math.max(r8.n(rectF8, rectF9), r8.n(rectF8, rectF13)) * l12);
                    f32 = Math.max(f32, r8.n(rectF8, rectF17) * l12);
                    f31 = Math.max(f31, r8.n(rectF8, rectF16) * l12);
                    RectF rectF18 = rectF12;
                    f30 = Math.max(f30, r8.n(rectF8, rectF15) * l12);
                    if (intersects) {
                        rectF = rectF7;
                        i10 = canvas.saveLayer(rectF7, null);
                    } else {
                        rectF = rectF7;
                        i10 = -1;
                    }
                    canvas.save();
                    canvas.rotate(p8Var.f44805a, f36, f37);
                    rectF2 = rectF17;
                    rectF3 = rectF16;
                    rectF4 = rectF9;
                    rectF5 = rectF13;
                    rectF6 = rectF18;
                    rectF15 = rectF15;
                    r8Var3.t(canvas, q8Var, f36, f37, com.google.android.gms.internal.vision.e2.B(p8Var6.f44805a, 0.07f, (0.08f * max2) + 0.97f, B2), Math.max(max2, p8Var5.f44805a * 0.5f), p8Var6.f44805a, l13 * l12);
                    canvas.restore();
                    float f39 = f35 - B2;
                    float f40 = L4 - B2;
                    float f41 = f35 + B2;
                    float f42 = L4 + B2;
                    int saveLayer = canvas.saveLayer(f39, f40, f41, f42, null);
                    Paint paint7 = paint6;
                    paint7.setAlpha((int) (l12 * 255.0f));
                    float f43 = p8Var5.f44805a;
                    if (f43 > 0.004f) {
                        r8Var3.r(canvas, a10, f35, L4, B2, f43, 1.0f, p8Var.f44805a, q8Var.U, q8Var.V);
                        r8Var = r8Var3;
                        canvas2 = canvas;
                        i11 = saveLayer;
                        paint = paint7;
                    } else {
                        canvas2 = canvas;
                        paint = paint7;
                        i11 = saveLayer;
                        r8Var = r8Var3;
                        canvas2.save();
                        canvas2.rotate(p8Var.f44805a, f35, L4);
                        float f44 = B2 / 2.0f;
                        rectF8.set(f35 - f44, L4 - f44, f35 + f44, L4 + f44);
                        canvas2.drawBitmap(a10, (Rect) null, rectF8, paint);
                        canvas2.restore();
                    }
                    paint.setAlpha(255);
                    canvas2.drawRect(f39, f40, f41, f42, r8Var.V);
                    canvas2.restoreToCount(i11);
                    if (intersects) {
                        if (intersects) {
                            path = path5;
                            x6Var = x6Var3;
                            x6Var.h(path, r8Var.Z0, r8Var.f44895a1);
                            canvas2.drawPath(path, r8Var.H1);
                        } else {
                            path = path5;
                            x6Var = x6Var3;
                        }
                        canvas2.restoreToCount(i10);
                    } else {
                        path = path5;
                        x6Var = x6Var3;
                    }
                    path5 = path;
                    r8Var2 = r8Var;
                    paint6 = paint;
                    x6Var3 = x6Var;
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
                    x6Var3 = x6Var3;
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
                    r8Var2 = r8Var2;
                    rectF13 = rectF13;
                    G = arrayList4;
                }
            }
            r8 r8Var4 = r8Var2;
            float f45 = f27;
            float f46 = f28;
            float f47 = f29;
            x6 x6Var4 = x6Var3;
            float f48 = f30;
            Paint paint8 = r8Var4.f44920l0;
            Paint paint9 = r8Var4.m0;
            Paint paint10 = r8Var4.f44918k0;
            q8 q8Var2 = r8Var4.f44914i0;
            if (q8Var2 == null || q8Var2.H != 2) {
                f10 = f46;
                f11 = f45;
                f12 = f47;
                f13 = f48;
            } else {
                float f49 = q8Var2.f44851n.f44805a + q8Var2.f44843e.f44805a;
                float f50 = q8Var2.f44852o.f44805a + q8Var2.f44844f.f44805a;
                float P = (r8Var4.P(q8Var2) * 0.5f) + org.telegram.messenger.g0.L(9.0f);
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
                canvas.rotate(q8Var2.f44846i.f44805a, f49, f50);
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
            v6 v6Var = x6Var4.O;
            float round = Math.round(f13 * 20.0f) / 20.0f;
            if (round != x6Var4.K) {
                x6Var4.K = round;
                x6Var4.I.invalidate();
            }
            if (Math.max(f12, f10) > 0.0f) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            if (f14 != x6Var4.h) {
                x6Var4.h = f14;
                v6Var.invalidate();
            }
            float round2 = Math.round(f10 * 20.0f) / 20.0f;
            float round3 = Math.round(f11 * 20.0f) / 20.0f;
            if (round2 != x6Var4.f45274e0) {
                x6Var4.f45274e0 = round2;
                v6Var.invalidate();
                x6Var4.P.invalidate();
            }
            if (round3 != x6Var4.f45276f0) {
                x6Var4.f45276f0 = round3;
                x6Var4.H.invalidate();
            }
        }
    }
}
