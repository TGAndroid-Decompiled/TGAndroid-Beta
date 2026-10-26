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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class n7 extends View {
    public final t7 f37030a;

    public n7(t7 t7Var, Context context) {
        super(context);
        this.f37030a = t7Var;
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
        t7 t7Var;
        Path path;
        w5 w5Var;
        float f15;
        t7 t7Var2 = this.f37030a;
        RectF rectF7 = t7Var2.D1;
        Path path2 = t7Var2.I;
        w5 w5Var2 = t7Var2.f37281c;
        Matrix matrix = t7Var2.W;
        Paint paint2 = t7Var2.F;
        RectF rectF8 = t7Var2.H;
        Paint paint3 = t7Var2.f37327x;
        Path path3 = t7Var2.T;
        if (t7Var2.Y0 > 0.0f) {
            paint3.setShader(null);
            paint3.setColorFilter(null);
            ArrayList arrayList = t7Var2.S;
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                int i14 = i13 + 1;
                q7 q7Var = (q7) obj;
                float f16 = q7Var.h / q7Var.f37140f;
                if (f16 < 0.1f) {
                    f15 = f16 / 0.1f;
                } else {
                    float f17 = 1.0f - ((f16 - 0.1f) / 0.9f);
                    f15 = f17 * f17;
                }
                ArrayList arrayList2 = arrayList;
                float C = c3.h0.C(f15, 0.4f, 0.6f, q7Var.e);
                paint3.setColor(-1);
                paint3.setAlpha((int) (Utilities.clamp01(f15) * 130.0f));
                canvas.save();
                canvas.translate(q7Var.f37137a, q7Var.f37138b);
                canvas.rotate(q7Var.f37141g);
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
            ArrayList arrayList3 = t7Var2.f37303n;
            int size2 = arrayList3.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList3.get(i15);
                i15++;
                p7 p7Var = (p7) obj2;
                float clamp01 = f23 - Utilities.clamp01(p7Var.f37105c / 0.42f);
                float A = org.telegram.ui.d3.A(clamp01, clamp01, clamp01, f23);
                paint2.setColor(-1);
                paint2.setAlpha((int) (clamp01 * 90.0f));
                paint2.setStrokeWidth(AndroidUtilities.dp(2.4f) * clamp01);
                canvas.drawCircle(p7Var.f37103a, p7Var.f37104b, c3.h0.C(A, 0.43f, 0.42f, t7Var2.U()), paint2);
                arrayList3 = arrayList3;
                size2 = size2;
                f23 = 1.0f;
            }
            Paint paint4 = t7Var2.f37317s1;
            Path path4 = t7Var2.f37321u1;
            Paint paint5 = t7Var2.f37314r1;
            float clamp012 = Utilities.clamp01(t7Var2.f37311q1.f37191a);
            if (clamp012 < 0.01f || !t7Var2.C()) {
                i10 = 1;
            } else {
                paint4.setAlpha((int) (22.0f * clamp012));
                canvas.drawPath(path4, paint4);
                float dp = AndroidUtilities.dp(6.0f);
                float dp2 = AndroidUtilities.dp(4.5f);
                float f24 = dp + dp2;
                i10 = 1;
                paint5.setPathEffect(new DashPathEffect(new float[]{dp, dp2}, f24 - ((t7Var2.f37305n1 * AndroidUtilities.dp(18.0f)) % f24)));
                paint5.setStrokeWidth(AndroidUtilities.dp(3.2f));
                paint5.setColor(Color.argb((int) (40.0f * clamp012), 0, 18, 48));
                canvas.drawPath(path4, paint5);
                paint5.setStrokeWidth(AndroidUtilities.dp(1.8f));
                paint5.setColor(Color.argb((int) (clamp012 * 180.0f), 255, 255, 255));
                canvas.drawPath(path4, paint5);
            }
            float x9 = c3.h0.x(t7Var2.f37276a0, 0.6f, t7Var2.f37279b0, 10.0f);
            matrix.setScale(t7Var2.Y0 * 1.5f, 1.0f);
            matrix.postRotate(-24.0f);
            float f25 = t7Var2.Y0;
            matrix.postTranslate(c3.h0.u(x9, f25, 0.45f, (-f25) * 0.25f), 0.0f);
            t7Var2.V.setLocalMatrix(matrix);
            ArrayList<RectF> stickerObstacles = w5Var2.getStickerObstacles();
            RectF rectF9 = stickerObstacles.get(0);
            RectF rectF10 = stickerObstacles.get(i10);
            RectF rectF11 = stickerObstacles.get(2);
            RectF rectF12 = stickerObstacles.get(3);
            RectF rectF13 = stickerObstacles.get(4);
            RectF rectF14 = stickerObstacles.get(5);
            ArrayList G = t7Var2.G();
            Path path5 = path2;
            int size3 = G.size();
            int i16 = 0;
            Paint paint6 = paint3;
            w5 w5Var3 = w5Var2;
            float f26 = 0.0f;
            float f27 = 0.0f;
            float f28 = 0.0f;
            float f29 = 0.0f;
            while (i16 < size3) {
                int i17 = i16 + 1;
                s7 s7Var = (s7) G.get(i16);
                int i18 = s7Var.H;
                int i19 = size3;
                r7 r7Var = s7Var.f37233i;
                ArrayList arrayList4 = G;
                r7 r7Var2 = s7Var.f37231f;
                r7 r7Var3 = s7Var.e;
                RectF rectF15 = rectF11;
                r7 r7Var4 = s7Var.f37234j;
                float f30 = f28;
                r7 r7Var5 = s7Var.f37235k;
                RectF rectF16 = rectF14;
                r7 r7Var6 = s7Var.f37240p;
                float f31 = f26;
                if (i18 != 2 && (i18 != 1 || (s7Var.O && r7Var4.f37191a > 0.3f))) {
                    rectF4 = rectF9;
                    rectF2 = rectF10;
                    rectF6 = rectF12;
                    rectF5 = rectF13;
                    max = f27;
                    rectF = rectF7;
                    path = path5;
                    w5Var = w5Var3;
                    paint = paint6;
                    rectF3 = rectF16;
                    t7Var = t7Var2;
                    path5 = path;
                    t7Var2 = t7Var;
                    paint6 = paint;
                    w5Var3 = w5Var;
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
                Bitmap a2 = s7Var.a();
                float f32 = s7Var.f37236l.f37191a;
                float clamp013 = Utilities.clamp01(s7Var.f37242r.f37191a);
                RectF rectF17 = rectF10;
                float f33 = f27;
                float C2 = c3.h0.C(clamp013, 0.2f, 0.8f, (((1.0f - (s7Var.f37241q.f37191a * 0.9f)) * 0.04f * f32) + 1.0f) * t7Var2.U() * s7Var.f37232g.f37191a * s7Var.h.f37191a);
                if (a2 != null && C2 >= 1.0f) {
                    float max2 = Math.max(r7Var4.f37191a, 0.7f * f32);
                    float dp3 = (AndroidUtilities.dp(9.0f) * max2) + AndroidUtilities.dp(1.5f);
                    float sin = ((float) Math.sin(Math.toRadians(t7Var2.f37279b0))) * dp3 * 2.2f;
                    float sin2 = ((float) Math.sin(Math.toRadians(t7Var2.f37276a0))) * dp3 * 2.2f;
                    t7 t7Var3 = t7Var2;
                    float f34 = r7Var3.f37191a + s7Var.f37238n.f37191a + sin;
                    float dp4 = ((r7Var2.f37191a + s7Var.f37239o.f37191a) + sin2) - (AndroidUtilities.dp(4.0f) * max2);
                    float f35 = r7Var3.f37191a - (sin * 0.3f);
                    float f36 = (dp3 * 0.22f) + (r7Var2.f37191a - (sin2 * 0.3f));
                    float clamp014 = Utilities.clamp01((f32 * 1.5f) + (3.0f * max2) + r7Var6.f37191a + r7Var5.f37191a);
                    rectF7.set(Math.min(f34, f35) - C2, Math.min(dp4, f36) - C2, Math.max(f34, f35) + C2, Math.max(dp4, f36) + C2);
                    boolean intersects = RectF.intersects(rectF7, rectF12);
                    float f37 = C2 * 0.4f;
                    rectF8.set(f34 - f37, dp4 - f37, f34 + f37, dp4 + f37);
                    max = Math.max(f33, Math.max(t7.n(rectF8, rectF9), t7.n(rectF8, rectF13)) * clamp013);
                    f31 = Math.max(f31, t7.n(rectF8, rectF17) * clamp013);
                    f30 = Math.max(f30, t7.n(rectF8, rectF16) * clamp013);
                    RectF rectF18 = rectF12;
                    f29 = Math.max(f29, t7.n(rectF8, rectF15) * clamp013);
                    if (intersects) {
                        rectF = rectF7;
                        i11 = canvas.saveLayer(rectF7, null);
                    } else {
                        rectF = rectF7;
                        i11 = -1;
                    }
                    canvas.save();
                    canvas.rotate(r7Var.f37191a, f35, f36);
                    rectF2 = rectF17;
                    rectF3 = rectF16;
                    rectF4 = rectF9;
                    rectF5 = rectF13;
                    rectF6 = rectF18;
                    rectF15 = rectF15;
                    t7Var3.t(canvas, s7Var, f35, f36, c3.h0.C(r7Var6.f37191a, 0.07f, (0.08f * max2) + 0.97f, C2), Math.max(max2, r7Var5.f37191a * 0.5f), r7Var6.f37191a, clamp014 * clamp013);
                    canvas.restore();
                    float f38 = f34 - C2;
                    float f39 = dp4 - C2;
                    float f40 = f34 + C2;
                    float f41 = dp4 + C2;
                    int saveLayer = canvas.saveLayer(f38, f39, f40, f41, null);
                    Paint paint7 = paint6;
                    paint7.setAlpha((int) (clamp013 * 255.0f));
                    float f42 = r7Var5.f37191a;
                    if (f42 > 0.004f) {
                        t7Var3.r(canvas, a2, f34, dp4, C2, f42, 1.0f, r7Var.f37191a, s7Var.U, s7Var.V);
                        t7Var = t7Var3;
                        canvas2 = canvas;
                        i12 = saveLayer;
                        paint = paint7;
                    } else {
                        canvas2 = canvas;
                        paint = paint7;
                        i12 = saveLayer;
                        t7Var = t7Var3;
                        canvas2.save();
                        canvas2.rotate(r7Var.f37191a, f34, dp4);
                        float f43 = C2 / 2.0f;
                        rectF8.set(f34 - f43, dp4 - f43, f34 + f43, dp4 + f43);
                        canvas2.drawBitmap(a2, (Rect) null, rectF8, paint);
                        canvas2.restore();
                    }
                    paint.setAlpha(255);
                    canvas2.drawRect(f38, f39, f40, f41, t7Var.U);
                    canvas2.restoreToCount(i12);
                    if (intersects) {
                        if (intersects) {
                            path = path5;
                            w5Var = w5Var3;
                            w5Var.h(path, t7Var.Y0, t7Var.Z0);
                            canvas2.drawPath(path, t7Var.E1);
                        } else {
                            path = path5;
                            w5Var = w5Var3;
                        }
                        canvas2.restoreToCount(i11);
                    } else {
                        path = path5;
                        w5Var = w5Var3;
                    }
                    path5 = path;
                    t7Var2 = t7Var;
                    paint6 = paint;
                    w5Var3 = w5Var;
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
                    w5Var3 = w5Var3;
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
                    t7Var2 = t7Var2;
                    rectF13 = rectF13;
                    G = arrayList4;
                }
            }
            t7 t7Var4 = t7Var2;
            float f44 = f26;
            float f45 = f27;
            float f46 = f28;
            w5 w5Var4 = w5Var3;
            float f47 = f29;
            Paint paint8 = t7Var4.f37299k0;
            Paint paint9 = t7Var4.f37301l0;
            Paint paint10 = t7Var4.f37297j0;
            s7 s7Var2 = t7Var4.f37293h0;
            if (s7Var2 == null || s7Var2.H != 2) {
                f7 = f45;
                f10 = f44;
                f11 = f46;
                f12 = f47;
            } else {
                float f48 = s7Var2.f37238n.f37191a + s7Var2.e.f37191a;
                float f49 = s7Var2.f37239o.f37191a + s7Var2.f37231f.f37191a;
                float P = (t7Var4.P(s7Var2) * 0.5f) + AndroidUtilities.dp(9.0f);
                paint10.setColor(-1);
                Paint.Style style = Paint.Style.STROKE;
                paint10.setStyle(style);
                paint10.setStrokeCap(Paint.Cap.ROUND);
                paint10.setStrokeWidth(AndroidUtilities.dp(2.0f));
                if (paint10.getPathEffect() == null) {
                    f14 = f45;
                    paint10.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f)}, 0.5f));
                } else {
                    f14 = f45;
                }
                paint10.setShadowLayer(AndroidUtilities.dp(0.75f), 0.0f, 0.0f, 1342177280);
                paint9.setColor(-1);
                paint9.setStyle(style);
                paint9.setStrokeWidth(AndroidUtilities.dp(2.66f));
                paint9.setShadowLayer(AndroidUtilities.dp(0.75f), 0.0f, 0.0f, 1342177280);
                paint8.setColor(-15033089);
                canvas.save();
                canvas.rotate(s7Var2.f37233i.f37191a, f48, f49);
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
                    canvas.drawCircle(f54, f49, AndroidUtilities.dp(5.66f), paint9);
                    canvas.drawCircle(f54, f49, AndroidUtilities.dp(4.66f), paint8);
                }
                canvas.restore();
            }
            u5 u5Var = w5Var4.N;
            float round = Math.round(f12 * 20.0f) / 20.0f;
            if (round != w5Var4.J) {
                w5Var4.J = round;
                w5Var4.H.invalidate();
            }
            if (Math.max(f11, f7) > 0.0f) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            if (f13 != w5Var4.h) {
                w5Var4.h = f13;
                u5Var.invalidate();
            }
            float round2 = Math.round(f7 * 20.0f) / 20.0f;
            float round3 = Math.round(f10 * 20.0f) / 20.0f;
            if (round2 != w5Var4.f37426d0) {
                w5Var4.f37426d0 = round2;
                u5Var.invalidate();
                w5Var4.O.invalidate();
            }
            if (round3 != w5Var4.f37427e0) {
                w5Var4.f37427e0 = round3;
                w5Var4.G.invalidate();
            }
        }
    }
}
