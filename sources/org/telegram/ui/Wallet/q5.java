package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q5 extends View {
    public final Paint f34748a;
    public final Paint f34749b;
    public final RectF f34750c;
    public Bitmap d;
    public final s5 e;

    public q5(s5 s5Var, Context context) {
        super(context);
        this.e = s5Var;
        Paint paint = new Paint(3);
        this.f34748a = paint;
        Paint paint2 = new Paint(3);
        this.f34749b = paint2;
        this.f34750c = new RectF();
        int b10 = h7.b(null);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        paint.setColorFilter(new PorterDuffColorFilter(b10, mode));
        paint2.setColorFilter(new PorterDuffColorFilter(Color.argb(15, 255, 255, 255), mode));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f11;
        int i15;
        float f12;
        float f13;
        float f14;
        Bitmap bitmap;
        double d;
        int i16;
        o5 o5Var;
        super.onDraw(canvas);
        int save = canvas.save();
        canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
        s5 s5Var = this.e;
        o5 o5Var2 = s5Var.f34818b;
        if (o5Var2 != null) {
            Path path = o5Var2.f34678t;
            f7 = 168.0f;
            Paint paint = o5Var2.f34655b;
            paint.setShader(null);
            paint.setColor(-1);
            f10 = 102.5f;
            float[][] fArr = o5Var2.L;
            i10 = 5;
            int length = fArr.length;
            int i17 = 0;
            while (i17 < length) {
                float[] fArr2 = fArr[i17];
                if (o5Var2.M.contains(fArr2[0], fArr2[1])) {
                    i16 = length;
                    o5Var = o5Var2;
                } else {
                    double atan2 = Math.atan2(fArr2[1] - 102.5f, fArr2[0] - 168.0f);
                    double cos = Math.cos(atan2 - o5Var2.U);
                    double abs = Math.abs(cos);
                    if (cos >= 0.0d) {
                        d = 3.081664098613251d;
                    } else {
                        d = 5.0d;
                    }
                    float l4 = o5.l(0.25f, 0.85f, (float) Math.pow(abs, d));
                    i16 = length;
                    o5Var = o5Var2;
                    paint.setAlpha(Math.round(o5.i(0.16f, 0.96f, Math.max(0.0f, (fArr2[5] * o5Var2.Y) + (fArr2[4] * o5Var2.X) + (fArr2[3] * o5Var2.W)) * ((float) Math.pow(Math.max(0.0f, (fArr2[5] * o5Var2.f34656b0) + (fArr2[4] * o5Var2.f34654a0) + (fArr2[3] * o5Var2.Z)), 10.0d))) * (1.0f - ((1.0f - o5.l(0.12f, 0.85f, (float) Math.pow(Math.pow(Math.sin(atan2 - o5Var2.V) / 0.64d, 2.0d) + 1.0d, -2.0d))) * (1.0f - l4))) * 255.0f));
                    float f15 = fArr2[0];
                    float f16 = fArr2[1];
                    float f17 = fArr2[2];
                    float f18 = 0.15f * f17;
                    path.rewind();
                    path.moveTo(f15 - f17, f16);
                    float f19 = f15 - f18;
                    float f20 = f16 - f18;
                    path.lineTo(f19, f20);
                    path.lineTo(f15, f16 - f17);
                    float f21 = f15 + f18;
                    path.lineTo(f21, f20);
                    path.lineTo(f15 + f17, f16);
                    float f22 = f18 + f16;
                    path.lineTo(f21, f22);
                    path.lineTo(f15, f16 + f17);
                    path.lineTo(f19, f22);
                    path.close();
                    canvas.drawPath(path, paint);
                }
                i17++;
                o5Var2 = o5Var;
                length = i16;
            }
            i11 = 1;
            i12 = 3;
            i13 = 2;
            paint.setAlpha(255);
        } else {
            f7 = 168.0f;
            f10 = 102.5f;
            i10 = 5;
            i11 = 1;
            i12 = 3;
            i13 = 2;
        }
        canvas.restoreToCount(save);
        RectF rectF = this.f34750c;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        if (!s5Var.f34816a && (bitmap = this.d) != null && !bitmap.isRecycled()) {
            int save2 = canvas.save();
            canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
            canvas.drawBitmap(this.d, (Rect) null, rectF, this.f34749b);
            canvas.restoreToCount(save2);
            canvas.drawBitmap(this.d, (Rect) null, rectF, this.f34748a);
        }
        int save3 = canvas.save();
        canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
        o5 o5Var3 = s5Var.f34818b;
        if (o5Var3 != null && !s5Var.f34816a) {
            RectF rectF2 = o5Var3.f34663g;
            Paint paint2 = o5Var3.d;
            int save4 = canvas.save();
            Path path2 = o5Var3.f34677s;
            path2.rewind();
            RectF rectF3 = o5Var3.M;
            path2.addRoundRect(rectF3, 8.0f, 8.0f, Path.Direction.CW);
            canvas.clipPath(path2);
            Paint paint3 = o5Var3.f34655b;
            paint3.setShader(o5Var3.f34658c0);
            canvas.drawRect(rectF3, paint3);
            paint3.setShader(null);
            o5Var3.b(canvas, o5.m0[4], rectF3, 55);
            o5Var3.b(canvas, o5.m0[i10], rectF3, 95);
            ComposeShader composeShader = o5Var3.f34660e0;
            if (composeShader != null) {
                paint3.setShader(composeShader);
                paint3.setAlpha(95);
                canvas.drawRect(rectF3, paint3);
                paint3.setShader(null);
                paint3.setAlpha(255);
            }
            if (o5Var3.Q != null) {
                paint3.setColorFilter(new PorterDuffColorFilter(-14405316, PorterDuff.Mode.SRC_IN));
                o5Var3.b(canvas, o5Var3.Q, rectF3, Math.round(((((o5.l(0.05f, 0.42f, -((float) Math.sin(Math.toRadians(o5Var3.S)))) * 0.65f) + 0.35f) * 0.495f) + 0.1f) * 255.0f));
                paint3.setColorFilter(null);
                float f23 = (float) (((((o5Var3.V / 6.283185307179586d) % 1.0d) + 1.0d) % 1.0d) * 8.0d);
                int i18 = (int) f23;
                float f24 = f23 - i18;
                int i19 = 0;
                for (int i20 = i13; i19 < i20; i20 = 2) {
                    if (i19 == 0) {
                        f14 = 1.0f - f24;
                    } else {
                        f14 = f24;
                    }
                    int i21 = (i18 + i19) % 8;
                    o5Var3.b(canvas, o5Var3.P[i21], rectF3, Math.round(204.0f * f14));
                    o5Var3.b(canvas, o5Var3.O[i21], rectF3, Math.round(f14 * 248.0f));
                    i19++;
                }
            }
            float cos2 = ((float) Math.cos(o5Var3.V - 0.7d)) * 24.0f;
            float sin = ((float) Math.sin(o5Var3.V - 0.7d)) * 18.0f;
            float[] fArr3 = new float[i12];
            
            fArr3[0] = 0.0f;
            fArr3[1] = 0.45f;
            fArr3[2] = 1.0f;
            paint2.setShader(new LinearGradient(rectF3.centerX() - cos2, rectF3.centerY() - sin, rectF3.centerX() + cos2, rectF3.centerY() + sin, new int[]{1812994342, 268435455, -1493172225}, fArr3, Shader.TileMode.CLAMP));
            paint2.setStrokeWidth(0.7f);
            rectF2.set(rectF3);
            rectF2.inset(0.35f, 0.35f);
            canvas.drawRoundRect(rectF2, 7.65f, 7.65f, paint2);
            canvas.restoreToCount(save4);
        }
        o5 o5Var4 = s5Var.f34818b;
        if (o5Var4 != null) {
            RectF rectF4 = o5Var4.f34663g;
            Paint paint4 = o5Var4.d;
            double radians = Math.toRadians((o5Var4.T * 3.6d) - (o5Var4.S * 3.2d)) - 2.0420352248333655d;
            float cos3 = (float) Math.cos(radians);
            float sin2 = (float) Math.sin(radians);
            float abs2 = ((Math.abs(sin2) * 205.0f) + (Math.abs(cos3) * 336.0f)) * 0.5f;
            int i22 = 0;
            while (true) {
                float f25 = 0.8f;
                if (i22 >= 3) {
                    break;
                }
                if (i22 == 0) {
                    f25 = 0.66f;
                    i14 = i11;
                } else {
                    i14 = i11;
                    if (i22 != i14) {
                        f25 = 0.92f;
                    }
                }
                if (i22 == 0) {
                    f11 = 0.4f;
                } else if (i22 == i14) {
                    f11 = 0.24f;
                } else {
                    f11 = 0.1f;
                }
                int rgb = Color.rgb(Math.round(Color.red(o5Var4.f34664g0) * f25), Math.round(Color.green(o5Var4.f34664g0) * f25), Math.round(Color.blue(o5Var4.f34664g0) * f25));
                int f26 = i0.a.f(0.45f, o5Var4.f34664g0, o5Var4.f34665h0);
                int f27 = i0.a.f(f11, o5Var4.f34665h0, -1);
                float f28 = cos3 * abs2;
                float f29 = sin2 * abs2;
                int[] iArr = {rgb, rgb, f26, f27, f27};
                int i23 = i10;
                float[] fArr4 = new float[i23];
                
                fArr4[0] = 0.0f;
                fArr4[1] = 0.32f;
                fArr4[2] = 0.53f;
                fArr4[3] = 0.76f;
                fArr4[4] = 1.0f;
                paint4.setShader(new LinearGradient(f7 - f28, f10 - f29, f28 + f7, f29 + f10, iArr, fArr4, Shader.TileMode.CLAMP));
                if (i22 == 0) {
                    f12 = 0.3f;
                    i15 = 1;
                } else {
                    i15 = 1;
                    if (i22 == 1) {
                        f12 = 0.88f;
                    } else {
                        f12 = 1.47f;
                    }
                }
                if (i22 == 0) {
                    f13 = 0.6f;
                } else if (i22 == i15) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.43f;
                }
                paint4.setStrokeWidth(f13);
                rectF4.set(f12, f12, 336.0f - f12, 205.0f - f12);
                float f30 = 25.2f - f12;
                canvas.drawRoundRect(rectF4, f30, f30, paint4);
                i22++;
                i10 = i23;
                i11 = i15;
            }
            float c10 = o5.c(((float) Math.sin(Math.toRadians(o5Var4.T))) * 1.7f);
            float c11 = o5.c((-((float) Math.sin(Math.toRadians(o5Var4.T)))) * 1.7f);
            int f31 = i0.a.f(0.38f, o5Var4.f34665h0, -1);
            paint4.setShader(new LinearGradient(0.0f, 102.5f, 336.0f, 102.5f, new int[]{o5.a(c11 * 0.8f, f31), o5.a(c11 * 0.38f, f31), o5.a(0.0f, f31), o5.a(0.0f, f31), o5.a(0.38f * c10, f31), o5.a(c10 * 0.8f, f31)}, new float[]{0.0f, 0.15f, 0.34f, 0.66f, 0.85f, 1.0f}, Shader.TileMode.CLAMP));
            paint4.setStrokeWidth(1.05f);
            rectF4.set(0.95f, 0.95f, 335.05f, 204.05f);
            canvas.drawRoundRect(rectF4, 24.25f, 24.25f, paint4);
            paint4.setShader(null);
        }
        canvas.restoreToCount(save3);
    }
}
