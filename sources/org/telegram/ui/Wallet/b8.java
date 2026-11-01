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
public final class b8 extends View {
    public final h8 f34278a;

    public b8(h8 h8Var, Context context) {
        super(context);
        this.f34278a = h8Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float max;
        RectF rectF;
        int i11;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        RectF rectF5;
        RectF rectF6;
        Canvas canvas2;
        Paint paint;
        int i12;
        h8 h8Var;
        Path path;
        l6 l6Var;
        float f15;
        h8 h8Var2 = this.f34278a;
        RectF rectF7 = h8Var2.D1;
        Path path2 = h8Var2.I;
        l6 l6Var2 = h8Var2.f34639c;
        Matrix matrix = h8Var2.W;
        Paint paint2 = h8Var2.F;
        RectF rectF8 = h8Var2.H;
        Paint paint3 = h8Var2.f34688y;
        Path path3 = h8Var2.T;
        if (h8Var2.Y0 > 0.0f) {
            paint3.setShader(null);
            paint3.setColorFilter(null);
            ArrayList arrayList = h8Var2.S;
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                int i14 = i13 + 1;
                e8 e8Var = (e8) obj;
                float f16 = e8Var.h / e8Var.f34466f;
                if (f16 < 0.1f) {
                    f15 = f16 / 0.1f;
                } else {
                    float f17 = 1.0f - ((f16 - 0.1f) / 0.9f);
                    f15 = f17 * f17;
                }
                ArrayList arrayList2 = arrayList;
                float C = c3.i0.C(f15, 0.4f, 0.6f, e8Var.e);
                paint3.setColor(-1);
                paint3.setAlpha((int) (Utilities.l(f15) * 130.0f));
                canvas.save();
                canvas.translate(e8Var.f34463a, e8Var.f34464b);
                canvas.rotate(e8Var.f34467g);
                path3.rewind();
                float f18 = -C;
                float f19 = f18 * 2.0f;
                path3.moveTo(0.0f, f19);
                float f20 = C * 0.35f;
                float f21 = f18 * 0.35f;
                path3.lineTo(f20, f21);
                float f22 = C * 2.0f;
                path3.lineTo(f22, 0.0f);
                path3.lineTo(f20, f20);
                path3.lineTo(0.0f, f22);
                path3.lineTo(f21, f20);
                path3.lineTo(f19, 0.0f);
                path3.lineTo(f21, f21);
                path3.close();
                canvas.drawPath(path3, paint3);
                canvas.restore();
                i13 = i14;
                arrayList = arrayList2;
            }
            float f23 = 1.0f;
            paint3.setAlpha(255);
            ArrayList arrayList3 = h8Var2.f34661n;
            int size2 = arrayList3.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList3.get(i15);
                i15++;
                d8 d8Var = (d8) obj2;
                float l4 = f23 - Utilities.l(d8Var.f34436c / 0.42f);
                float x10 = org.telegram.ui.Cells.f1.x(l4, l4, l4, f23);
                paint2.setColor(-1);
                paint2.setAlpha((int) (l4 * 90.0f));
                paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.4f) * l4);
                canvas.drawCircle(d8Var.f34434a, d8Var.f34435b, c3.i0.C(x10, 0.43f, 0.42f, h8Var2.U()), paint2);
                arrayList3 = arrayList3;
                size2 = size2;
                f23 = 1.0f;
            }
            Paint paint4 = h8Var2.f34675s1;
            Path path4 = h8Var2.f34679u1;
            Paint paint5 = h8Var2.f34672r1;
            float l10 = Utilities.l(h8Var2.f34669q1.f34506a);
            if (l10 < 0.01f || !h8Var2.C()) {
                i10 = 1;
            } else {
                paint4.setAlpha((int) (22.0f * l10));
                canvas.drawPath(path4, paint4);
                float L = org.telegram.messenger.i0.L(6.0f);
                float L2 = org.telegram.messenger.i0.L(4.5f);
                float f24 = L + L2;
                i10 = 1;
                paint5.setPathEffect(new DashPathEffect(new float[]{L, L2}, f24 - ((h8Var2.f34663n1 * org.telegram.messenger.i0.L(18.0f)) % f24)));
                paint5.setStrokeWidth(org.telegram.messenger.i0.L(3.2f));
                paint5.setColor(Color.argb((int) (40.0f * l10), 0, 18, 48));
                canvas.drawPath(path4, paint5);
                paint5.setStrokeWidth(org.telegram.messenger.i0.L(1.8f));
                paint5.setColor(Color.argb((int) (l10 * 180.0f), 255, 255, 255));
                canvas.drawPath(path4, paint5);
            }
            float x11 = c3.i0.x(h8Var2.f34634a0, 0.6f, h8Var2.f34637b0, 10.0f);
            matrix.setScale(h8Var2.Y0 * 1.5f, 1.0f);
            matrix.postRotate(-24.0f);
            float f25 = h8Var2.Y0;
            matrix.postTranslate(c3.i0.u(x11, f25, 0.45f, (-f25) * 0.25f), 0.0f);
            h8Var2.V.setLocalMatrix(matrix);
            ArrayList<RectF> stickerObstacles = l6Var2.getStickerObstacles();
            RectF rectF9 = stickerObstacles.get(0);
            RectF rectF10 = stickerObstacles.get(i10);
            RectF rectF11 = stickerObstacles.get(2);
            RectF rectF12 = stickerObstacles.get(3);
            RectF rectF13 = stickerObstacles.get(4);
            RectF rectF14 = stickerObstacles.get(5);
            ArrayList G = h8Var2.G();
            Path path5 = path2;
            int size3 = G.size();
            int i16 = 0;
            Paint paint6 = paint3;
            l6 l6Var3 = l6Var2;
            float f26 = 0.0f;
            float f27 = 0.0f;
            float f28 = 0.0f;
            float f29 = 0.0f;
            while (i16 < size3) {
                int i17 = i16 + 1;
                g8 g8Var = (g8) G.get(i16);
                int i18 = g8Var.H;
                int i19 = size3;
                f8 f8Var = g8Var.f34591i;
                ArrayList arrayList4 = G;
                f8 f8Var2 = g8Var.f34589f;
                f8 f8Var3 = g8Var.e;
                RectF rectF15 = rectF11;
                f8 f8Var4 = g8Var.f34592j;
                float f30 = f28;
                f8 f8Var5 = g8Var.f34593k;
                RectF rectF16 = rectF14;
                f8 f8Var6 = g8Var.f34598p;
                float f31 = f26;
                if (i18 != 2 && (i18 != 1 || (g8Var.O && f8Var4.f34506a > 0.3f))) {
                    rectF4 = rectF9;
                    rectF2 = rectF10;
                    rectF6 = rectF12;
                    rectF5 = rectF13;
                    max = f27;
                    rectF = rectF7;
                    path = path5;
                    l6Var = l6Var3;
                    paint = paint6;
                    rectF3 = rectF16;
                    h8Var = h8Var2;
                    path5 = path;
                    h8Var2 = h8Var;
                    paint6 = paint;
                    l6Var3 = l6Var;
                    rectF7 = rectF;
                    rectF9 = rectF4;
                    rectF12 = rectF6;
                    rectF13 = rectF5;
                    f27 = max;
                    i16 = i17;
                    size3 = i19;
                    G = arrayList4;
                    rectF11 = rectF15;
                    f28 = f30;
                    f26 = f31;
                    rectF10 = rectF2;
                    rectF14 = rectF3;
                }
                Bitmap a2 = g8Var.a();
                float f32 = g8Var.f34594l.f34506a;
                float l11 = Utilities.l(g8Var.f34600r.f34506a);
                RectF rectF17 = rectF10;
                float f33 = f27;
                float C2 = c3.i0.C(l11, 0.2f, 0.8f, (((1.0f - (g8Var.f34599q.f34506a * 0.9f)) * 0.04f * f32) + 1.0f) * h8Var2.U() * g8Var.f34590g.f34506a * g8Var.h.f34506a);
                if (a2 != null && C2 >= 1.0f) {
                    float max2 = Math.max(f8Var4.f34506a, 0.7f * f32);
                    float L3 = (org.telegram.messenger.i0.L(9.0f) * max2) + org.telegram.messenger.i0.L(1.5f);
                    float sin = ((float) Math.sin(Math.toRadians(h8Var2.f34637b0))) * L3 * 2.2f;
                    float sin2 = ((float) Math.sin(Math.toRadians(h8Var2.f34634a0))) * L3 * 2.2f;
                    h8 h8Var3 = h8Var2;
                    float f34 = f8Var3.f34506a + g8Var.f34596n.f34506a + sin;
                    float L4 = ((f8Var2.f34506a + g8Var.f34597o.f34506a) + sin2) - (org.telegram.messenger.i0.L(4.0f) * max2);
                    float f35 = f8Var3.f34506a - (sin * 0.3f);
                    float f36 = (L3 * 0.22f) + (f8Var2.f34506a - (sin2 * 0.3f));
                    float l12 = Utilities.l((f32 * 1.5f) + (3.0f * max2) + f8Var6.f34506a + f8Var5.f34506a);
                    rectF7.set(Math.min(f34, f35) - C2, Math.min(L4, f36) - C2, Math.max(f34, f35) + C2, Math.max(L4, f36) + C2);
                    boolean intersects = RectF.intersects(rectF7, rectF12);
                    float f37 = C2 * 0.4f;
                    rectF8.set(f34 - f37, L4 - f37, f34 + f37, L4 + f37);
                    max = Math.max(f33, Math.max(h8.n(rectF8, rectF9), h8.n(rectF8, rectF13)) * l11);
                    f31 = Math.max(f31, h8.n(rectF8, rectF17) * l11);
                    f30 = Math.max(f30, h8.n(rectF8, rectF16) * l11);
                    RectF rectF18 = rectF12;
                    f29 = Math.max(f29, h8.n(rectF8, rectF15) * l11);
                    if (intersects) {
                        rectF = rectF7;
                        i11 = canvas.saveLayer(rectF7, null);
                    } else {
                        rectF = rectF7;
                        i11 = -1;
                    }
                    canvas.save();
                    canvas.rotate(f8Var.f34506a, f35, f36);
                    rectF2 = rectF17;
                    rectF3 = rectF16;
                    rectF4 = rectF9;
                    rectF5 = rectF13;
                    rectF6 = rectF18;
                    rectF15 = rectF15;
                    h8Var3.t(canvas, g8Var, f35, f36, c3.i0.C(f8Var6.f34506a, 0.07f, (0.08f * max2) + 0.97f, C2), Math.max(max2, f8Var5.f34506a * 0.5f), f8Var6.f34506a, l12 * l11);
                    canvas.restore();
                    float f38 = f34 - C2;
                    float f39 = L4 - C2;
                    float f40 = f34 + C2;
                    float f41 = L4 + C2;
                    int saveLayer = canvas.saveLayer(f38, f39, f40, f41, null);
                    Paint paint7 = paint6;
                    paint7.setAlpha((int) (l11 * 255.0f));
                    float f42 = f8Var5.f34506a;
                    if (f42 > 0.004f) {
                        h8Var3.r(canvas, a2, f34, L4, C2, f42, 1.0f, f8Var.f34506a, g8Var.U, g8Var.V);
                        h8Var = h8Var3;
                        canvas2 = canvas;
                        i12 = saveLayer;
                        paint = paint7;
                    } else {
                        canvas2 = canvas;
                        paint = paint7;
                        i12 = saveLayer;
                        h8Var = h8Var3;
                        canvas2.save();
                        canvas2.rotate(f8Var.f34506a, f34, L4);
                        float f43 = C2 / 2.0f;
                        rectF8.set(f34 - f43, L4 - f43, f34 + f43, L4 + f43);
                        canvas2.drawBitmap(a2, (Rect) null, rectF8, paint);
                        canvas2.restore();
                    }
                    paint.setAlpha(255);
                    canvas2.drawRect(f38, f39, f40, f41, h8Var.U);
                    canvas2.restoreToCount(i12);
                    if (intersects) {
                        if (intersects) {
                            path = path5;
                            l6Var = l6Var3;
                            l6Var.h(path, h8Var.Y0, h8Var.Z0);
                            canvas2.drawPath(path, h8Var.E1);
                        } else {
                            path = path5;
                            l6Var = l6Var3;
                        }
                        canvas2.restoreToCount(i11);
                    } else {
                        path = path5;
                        l6Var = l6Var3;
                    }
                    path5 = path;
                    h8Var2 = h8Var;
                    paint6 = paint;
                    l6Var3 = l6Var;
                    rectF7 = rectF;
                    rectF9 = rectF4;
                    rectF12 = rectF6;
                    rectF13 = rectF5;
                    f27 = max;
                    i16 = i17;
                    size3 = i19;
                    G = arrayList4;
                    rectF11 = rectF15;
                    f28 = f30;
                    f26 = f31;
                    rectF10 = rectF2;
                    rectF14 = rectF3;
                } else {
                    f28 = f30;
                    path5 = path5;
                    f29 = f29;
                    paint6 = paint6;
                    l6Var3 = l6Var3;
                    rectF7 = rectF7;
                    rectF9 = rectF9;
                    rectF12 = rectF12;
                    i16 = i17;
                    size3 = i19;
                    rectF11 = rectF15;
                    rectF10 = rectF17;
                    rectF14 = rectF16;
                    f27 = f33;
                    f26 = f31;
                    h8Var2 = h8Var2;
                    rectF13 = rectF13;
                    G = arrayList4;
                }
            }
            h8 h8Var4 = h8Var2;
            float f44 = f26;
            float f45 = f27;
            float f46 = f28;
            l6 l6Var4 = l6Var3;
            float f47 = f29;
            Paint paint8 = h8Var4.f34657k0;
            Paint paint9 = h8Var4.f34659l0;
            Paint paint10 = h8Var4.f34655j0;
            g8 g8Var2 = h8Var4.f34651h0;
            if (g8Var2 == null || g8Var2.H != 2) {
                f7 = f45;
                f10 = f44;
                f11 = f46;
                f12 = f47;
            } else {
                float f48 = g8Var2.f34596n.f34506a + g8Var2.e.f34506a;
                float f49 = g8Var2.f34597o.f34506a + g8Var2.f34589f.f34506a;
                float P = (h8Var4.P(g8Var2) * 0.5f) + org.telegram.messenger.i0.L(9.0f);
                paint10.setColor(-1);
                Paint.Style style = Paint.Style.STROKE;
                paint10.setStyle(style);
                paint10.setStrokeCap(Paint.Cap.ROUND);
                paint10.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
                if (paint10.getPathEffect() == null) {
                    f14 = f45;
                    paint10.setPathEffect(new DashPathEffect(new float[]{org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f)}, 0.5f));
                } else {
                    f14 = f45;
                }
                paint10.setShadowLayer(org.telegram.messenger.i0.L(0.75f), 0.0f, 0.0f, 1342177280);
                paint9.setColor(-1);
                paint9.setStyle(style);
                paint9.setStrokeWidth(org.telegram.messenger.i0.L(2.66f));
                paint9.setShadowLayer(org.telegram.messenger.i0.L(0.75f), 0.0f, 0.0f, 1342177280);
                paint8.setColor(-15033089);
                canvas.save();
                canvas.rotate(g8Var2.f34591i.f34506a, f48, f49);
                float f50 = f48 - P;
                float f51 = f49 - P;
                f10 = f44;
                float f52 = f48 + P;
                float f53 = f49 + P;
                f12 = f47;
                f11 = f46;
                f7 = f14;
                canvas.drawArc(f50, f51, f52, f53, 0.0f, 180.0f, false, paint10);
                canvas.drawArc(f50, f51, f52, f53, 180.0f, 180.0f, false, paint10);
                for (int i20 = -1; i20 <= 1; i20 += 2) {
                    float f54 = (i20 * P) + f48;
                    canvas.drawCircle(f54, f49, org.telegram.messenger.i0.L(5.66f), paint9);
                    canvas.drawCircle(f54, f49, org.telegram.messenger.i0.L(4.66f), paint8);
                }
                canvas.restore();
            }
            j6 j6Var = l6Var4.N;
            float round = Math.round(f12 * 20.0f) / 20.0f;
            if (round != l6Var4.J) {
                l6Var4.J = round;
                l6Var4.H.invalidate();
            }
            if (Math.max(f11, f7) > 0.0f) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            if (f13 != l6Var4.h) {
                l6Var4.h = f13;
                j6Var.invalidate();
            }
            float round2 = Math.round(f7 * 20.0f) / 20.0f;
            float round3 = Math.round(f10 * 20.0f) / 20.0f;
            if (round2 != l6Var4.f34854d0) {
                l6Var4.f34854d0 = round2;
                j6Var.invalidate();
                l6Var4.O.invalidate();
            }
            if (round3 != l6Var4.f34855e0) {
                l6Var4.f34855e0 = round3;
                l6Var4.G.invalidate();
            }
        }
    }
}
