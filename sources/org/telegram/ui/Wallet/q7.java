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
public final class q7 extends View {
    public final w7 f34806a;

    public q7(w7 w7Var, Context context) {
        super(context);
        this.f34806a = w7Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        RectF rectF;
        float max;
        RectF rectF2;
        int i11;
        RectF rectF3;
        RectF rectF4;
        Canvas canvas2;
        int i12;
        RectF rectF5;
        u7 u7Var;
        w7 w7Var;
        float f10;
        float f11;
        Paint paint;
        RectF rectF6;
        Path path;
        v5 v5Var;
        v5 v5Var2;
        Paint paint2;
        float f12;
        float f13;
        w7 w7Var2 = this.f34806a;
        RectF rectF7 = w7Var2.f35099y1;
        Path path2 = w7Var2.I;
        v5 v5Var3 = w7Var2.f35048c;
        Matrix matrix = w7Var2.W;
        Paint paint3 = w7Var2.F;
        RectF rectF8 = w7Var2.H;
        Paint paint4 = w7Var2.f35094x;
        Path path3 = w7Var2.T;
        if (w7Var2.T0 > 0.0f) {
            paint4.setShader(null);
            paint4.setColorFilter(null);
            ArrayList arrayList = w7Var2.S;
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                int i14 = i13 + 1;
                t7 t7Var = (t7) obj;
                float f14 = t7Var.h / t7Var.f34905f;
                if (f14 < 0.1f) {
                    f13 = f14 / 0.1f;
                } else {
                    float f15 = 1.0f - ((f14 - 0.1f) / 0.9f);
                    f13 = f15 * f15;
                }
                float A = com.google.android.gms.internal.cast.a6.A(f13, 0.4f, 0.6f, t7Var.e);
                paint4.setColor(-1);
                paint4.setAlpha((int) (Utilities.clamp01(f13) * 130.0f));
                canvas.save();
                canvas.translate(t7Var.f34902a, t7Var.f34903b);
                canvas.rotate(t7Var.f34906g);
                path3.rewind();
                float f16 = -A;
                float f17 = f16 * 2.0f;
                path3.moveTo(0.0f, f17);
                float f18 = A * 0.35f;
                float f19 = f16 * 0.35f;
                path3.lineTo(f18, f19);
                float f20 = A * 2.0f;
                path3.lineTo(f20, 0.0f);
                path3.lineTo(f18, f18);
                path3.lineTo(0.0f, f20);
                path3.lineTo(f19, f18);
                path3.lineTo(f17, 0.0f);
                path3.lineTo(f19, f19);
                path3.close();
                canvas.drawPath(path3, paint4);
                canvas.restore();
                i13 = i14;
                arrayList = arrayList;
            }
            float f21 = 1.0f;
            paint4.setAlpha(255);
            ArrayList arrayList2 = w7Var2.f35070n;
            int size2 = arrayList2.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList2.get(i15);
                i15++;
                s7 s7Var = (s7) obj2;
                float clamp01 = f21 - Utilities.clamp01(s7Var.f34876c / 0.42f);
                float z10 = org.telegram.ui.Cells.t0.z(clamp01, clamp01, clamp01, f21);
                paint3.setColor(-1);
                paint3.setAlpha((int) (clamp01 * 90.0f));
                paint3.setStrokeWidth(AndroidUtilities.dp(2.4f) * clamp01);
                canvas.drawCircle(s7Var.f34874a, s7Var.f34875b, com.google.android.gms.internal.cast.a6.A(z10, 0.43f, 0.42f, w7Var2.W()), paint3);
                arrayList2 = arrayList2;
                size2 = size2;
                f21 = 1.0f;
            }
            Paint paint5 = w7Var2.f35072n1;
            Path path4 = w7Var2.f35076p1;
            Paint paint6 = w7Var2.f35069m1;
            float clamp012 = Utilities.clamp01(w7Var2.l1.f34937a);
            if (clamp012 < 0.01f || !w7Var2.E()) {
                i10 = 1;
            } else {
                paint5.setAlpha((int) (22.0f * clamp012));
                canvas.drawPath(path4, paint5);
                float dp = AndroidUtilities.dp(6.0f);
                float dp2 = AndroidUtilities.dp(4.5f);
                float f22 = dp + dp2;
                i10 = 1;
                paint6.setPathEffect(new DashPathEffect(new float[]{dp, dp2}, f22 - ((w7Var2.f35063i1 * AndroidUtilities.dp(18.0f)) % f22)));
                paint6.setStrokeWidth(AndroidUtilities.dp(3.2f));
                paint6.setColor(Color.argb((int) (40.0f * clamp012), 0, 18, 48));
                canvas.drawPath(path4, paint6);
                paint6.setStrokeWidth(AndroidUtilities.dp(1.8f));
                paint6.setColor(Color.argb((int) (clamp012 * 180.0f), 255, 255, 255));
                canvas.drawPath(path4, paint6);
            }
            float v = com.google.android.gms.internal.cast.a6.v(w7Var2.f35043a0, 0.6f, w7Var2.f35046b0, 10.0f);
            matrix.setScale(w7Var2.T0 * 1.5f, 1.0f);
            matrix.postRotate(-24.0f);
            float f23 = w7Var2.T0;
            matrix.postTranslate(com.google.android.gms.internal.cast.a6.t(v, f23, 0.45f, (-f23) * 0.25f), 0.0f);
            w7Var2.V.setLocalMatrix(matrix);
            ArrayList<RectF> stickerObstacles = v5Var3.getStickerObstacles();
            RectF rectF9 = stickerObstacles.get(0);
            RectF rectF10 = stickerObstacles.get(i10);
            RectF rectF11 = stickerObstacles.get(2);
            RectF rectF12 = stickerObstacles.get(3);
            RectF rectF13 = stickerObstacles.get(4);
            RectF rectF14 = stickerObstacles.get(5);
            ArrayList K = w7Var2.K();
            Paint paint7 = paint3;
            int size3 = K.size();
            int i16 = 0;
            Paint paint8 = paint4;
            Path path5 = path2;
            v5 v5Var4 = v5Var3;
            float f24 = 0.0f;
            float f25 = 0.0f;
            float f26 = 0.0f;
            float f27 = 0.0f;
            while (i16 < size3) {
                int i17 = i16 + 1;
                v7 v7Var = (v7) K.get(i16);
                ArrayList arrayList3 = K;
                int i18 = v7Var.H;
                int i19 = size3;
                u7 u7Var2 = v7Var.f35002i;
                u7 u7Var3 = v7Var.f35000f;
                float f28 = f25;
                u7 u7Var4 = v7Var.e;
                RectF rectF15 = rectF11;
                u7 u7Var5 = v7Var.f35005l;
                float f29 = f27;
                u7 u7Var6 = v7Var.f35003j;
                RectF rectF16 = rectF14;
                u7 u7Var7 = v7Var.f35004k;
                float f30 = f26;
                u7 u7Var8 = v7Var.f35009p;
                RectF rectF17 = rectF10;
                if (i18 != 2 && (i18 != 1 || (v7Var.O && u7Var6.f34937a > 0.3f))) {
                    rectF3 = rectF9;
                    rectF = rectF13;
                    rectF4 = rectF12;
                    max = f24;
                    rectF5 = rectF8;
                    rectF2 = rectF7;
                    paint2 = paint7;
                    path = path5;
                    v5Var2 = v5Var4;
                    paint = paint8;
                    rectF6 = rectF16;
                    w7Var = w7Var2;
                    f27 = f29;
                    rectF8 = rectF5;
                    paint7 = paint2;
                    v5Var4 = v5Var2;
                    w7Var2 = w7Var;
                    path5 = path;
                    paint8 = paint;
                    rectF7 = rectF2;
                    rectF12 = rectF4;
                    rectF9 = rectF3;
                    rectF14 = rectF6;
                    K = arrayList3;
                    i16 = i17;
                    size3 = i19;
                    f25 = f28;
                    rectF11 = rectF15;
                    f26 = f30;
                    f24 = max;
                    rectF10 = rectF17;
                    rectF13 = rectF;
                }
                Bitmap a2 = v7Var.a();
                float f31 = u7Var5.f34937a;
                float clamp013 = Utilities.clamp01(v7Var.f35011r.f34937a);
                float f32 = 0.7f * f31;
                float f33 = f24;
                rectF = rectF13;
                float A2 = com.google.android.gms.internal.cast.a6.A(clamp013, 0.2f, 0.8f, (((1.0f - (v7Var.f35010q.f34937a * 0.9f)) * f32) + 1.0f) * w7Var2.W() * v7Var.f35001g.f34937a * v7Var.h.f34937a);
                if (a2 != null && A2 >= 1.0f) {
                    float max2 = Math.max(u7Var6.f34937a, f32);
                    float dp3 = (AndroidUtilities.dp(9.0f) * max2) + AndroidUtilities.dp(1.5f);
                    float sin = ((float) Math.sin(Math.toRadians(w7Var2.f35046b0))) * dp3 * 2.2f;
                    float sin2 = ((float) Math.sin(Math.toRadians(w7Var2.f35043a0))) * dp3 * 2.2f;
                    w7 w7Var3 = w7Var2;
                    float f34 = u7Var4.f34937a + v7Var.f35007n.f34937a + sin;
                    float dp4 = ((u7Var3.f34937a + v7Var.f35008o.f34937a) + sin2) - (AndroidUtilities.dp(4.0f) * max2);
                    float f35 = u7Var4.f34937a - (sin * 0.3f);
                    float f36 = (dp3 * 0.22f) + (u7Var3.f34937a - (sin2 * 0.3f));
                    float clamp014 = Utilities.clamp01((f31 * 1.5f) + (3.0f * max2) + u7Var8.f34937a + u7Var7.f34937a);
                    rectF7.set(Math.min(f34, f35) - A2, Math.min(dp4, f36) - A2, Math.max(f34, f35) + A2, Math.max(dp4, f36) + A2);
                    boolean intersects = RectF.intersects(rectF7, rectF12);
                    float f37 = A2 * 0.4f;
                    rectF8.set(f34 - f37, dp4 - f37, f34 + f37, dp4 + f37);
                    max = Math.max(f33, Math.max(w7.n(rectF8, rectF9), w7.n(rectF8, rectF)) * clamp013);
                    f30 = Math.max(f30, w7.n(rectF8, rectF17) * clamp013);
                    f29 = Math.max(f29, w7.n(rectF8, rectF16) * clamp013);
                    f28 = Math.max(f28, w7.n(rectF8, rectF15) * clamp013);
                    if (intersects) {
                        rectF2 = rectF7;
                        i11 = canvas.saveLayer(rectF7, null);
                    } else {
                        rectF2 = rectF7;
                        i11 = -1;
                    }
                    canvas.save();
                    canvas.rotate(u7Var2.f34937a, f35, f36);
                    rectF15 = rectF15;
                    rectF3 = rectF9;
                    rectF4 = rectF12;
                    w7Var3.t(canvas, v7Var, f35, f36, com.google.android.gms.internal.cast.a6.A(u7Var8.f34937a, 0.07f, (0.08f * max2) + 0.97f, A2), Math.max(max2, u7Var7.f34937a * 0.5f), u7Var8.f34937a, clamp014 * clamp013);
                    canvas.restore();
                    float f38 = f34 - A2;
                    float f39 = dp4 - A2;
                    float f40 = f34 + A2;
                    float f41 = dp4 + A2;
                    int saveLayer = canvas.saveLayer(f38, f39, f40, f41, null);
                    Paint paint9 = paint8;
                    paint9.setAlpha((int) (clamp013 * 255.0f));
                    float f42 = u7Var7.f34937a;
                    if (f42 > 0.004f) {
                        rectF6 = rectF16;
                        rectF5 = rectF8;
                        i12 = saveLayer;
                        u7Var = u7Var5;
                        paint = paint9;
                        w7Var3.r(canvas, a2, f34, dp4, A2, f42, 1.0f, u7Var2.f34937a, v7Var.U, v7Var.V);
                        w7Var = w7Var3;
                        canvas2 = canvas;
                        f10 = f34;
                        f11 = dp4;
                    } else {
                        canvas2 = canvas;
                        i12 = saveLayer;
                        rectF5 = rectF8;
                        u7Var = u7Var5;
                        w7Var = w7Var3;
                        f10 = f34;
                        f11 = dp4;
                        paint = paint9;
                        rectF6 = rectF16;
                        canvas2.save();
                        canvas2.rotate(u7Var2.f34937a, f10, f11);
                        float f43 = A2 / 2.0f;
                        rectF5.set(f10 - f43, f11 - f43, f10 + f43, f43 + f11);
                        canvas2.drawBitmap(a2, (Rect) null, rectF5, paint);
                        canvas2.restore();
                    }
                    paint.setAlpha(255);
                    canvas2.drawRect(f38, f39, f40, f41, w7Var.U);
                    canvas2.restoreToCount(i12);
                    if (intersects) {
                        if (intersects) {
                            path = path5;
                            v5Var = v5Var4;
                            v5Var.j(path, w7Var.T0, w7Var.U0);
                            canvas2.drawPath(path, w7Var.f35101z1);
                        } else {
                            path = path5;
                            v5Var = v5Var4;
                        }
                        canvas2.restoreToCount(i11);
                    } else {
                        path = path5;
                        v5Var = v5Var4;
                    }
                    if (f31 > 0.02f) {
                        float f44 = A2 * 0.6f;
                        paint2 = paint7;
                        char c10 = 65535;
                        paint2.setColor(-1);
                        paint2.setAlpha((int) (Utilities.clamp01(u7Var.f34937a) * 110.0f));
                        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
                        canvas2.drawCircle(f10, f11, f44, paint2);
                        canvas2.save();
                        canvas2.rotate(u7Var2.f34937a, f10, f11);
                        int i20 = 0;
                        while (i20 < 24) {
                            float f45 = f11 - f44;
                            if (i20 == 0) {
                                f12 = 7.0f;
                            } else if (i20 % 6 == 0) {
                                f12 = 4.5f;
                            } else {
                                f12 = 2.5f;
                            }
                            char c11 = c10;
                            float f46 = f10;
                            canvas2.drawLine(f46, f45, f10, AndroidUtilities.dp(f12) + f45, paint2);
                            Canvas canvas3 = canvas2;
                            canvas3.rotate(15.0f, f46, f11);
                            i20++;
                            canvas2 = canvas3;
                            v5Var = v5Var;
                            f10 = f46;
                            c10 = c11;
                        }
                        v5Var2 = v5Var;
                        canvas2.restore();
                    } else {
                        v5Var2 = v5Var;
                        paint2 = paint7;
                    }
                    f27 = f29;
                    rectF8 = rectF5;
                    paint7 = paint2;
                    v5Var4 = v5Var2;
                    w7Var2 = w7Var;
                    path5 = path;
                    paint8 = paint;
                    rectF7 = rectF2;
                    rectF12 = rectF4;
                    rectF9 = rectF3;
                    rectF14 = rectF6;
                    K = arrayList3;
                    i16 = i17;
                    size3 = i19;
                    f25 = f28;
                    rectF11 = rectF15;
                    f26 = f30;
                    f24 = max;
                    rectF10 = rectF17;
                    rectF13 = rectF;
                } else {
                    rectF8 = rectF8;
                    f27 = f29;
                    paint7 = paint7;
                    v5Var4 = v5Var4;
                    paint8 = paint8;
                    rectF7 = rectF7;
                    rectF12 = rectF12;
                    rectF9 = rectF9;
                    rectF14 = rectF16;
                    K = arrayList3;
                    i16 = i17;
                    size3 = i19;
                    rectF11 = rectF15;
                    rectF13 = rectF;
                    f26 = f30;
                    f25 = f28;
                    w7Var2 = w7Var2;
                    f24 = f33;
                    rectF10 = rectF17;
                }
            }
            float f47 = f24;
            float f48 = f25;
            float f49 = f26;
            float f50 = f27;
            v5 v5Var5 = v5Var4;
            t5 t5Var = v5Var5.R;
            float round = Math.round(f48 * 20.0f) / 20.0f;
            if (round != v5Var5.N) {
                v5Var5.N = round;
                v5Var5.L.invalidate();
            }
            if (Math.max(f50, f47) > 0.0f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (f7 != v5Var5.f34983n) {
                v5Var5.f34983n = f7;
                t5Var.invalidate();
            }
            float round2 = Math.round(f47 * 20.0f) / 20.0f;
            float round3 = Math.round(f49 * 20.0f) / 20.0f;
            if (round2 != v5Var5.f34978h0) {
                v5Var5.f34978h0 = round2;
                t5Var.invalidate();
                v5Var5.S.invalidate();
            }
            if (round3 != v5Var5.f34979i0) {
                v5Var5.f34979i0 = round3;
                v5Var5.K.invalidate();
            }
        }
    }
}
