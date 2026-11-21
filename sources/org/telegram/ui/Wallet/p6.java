package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.LruCache;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.jw0;
public final class p6 {
    public static volatile boolean f44792j0;
    public static Bitmap[] m0;
    public static Bitmap[][] f44795n0;
    public PorterDuffColorFilter A;
    public int B;
    public PorterDuffColorFilter C;
    public final RectF M;
    public Bitmap Q;
    public final Context R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public float X;
    public float Z;
    public final Runnable f44798a;
    public float f44799a0;
    public SweepGradient f44803c0;
    public final SweepGradient f44804d0;
    public final ComposeShader f44806e0;
    public int f44808f0;
    public boolean f44813i0;
    public float f44821q;
    public boolean f44822r;
    public final SweepGradient v;
    public final SweepGradient f44826w;
    public final ComposeShader f44828y;
    public int f44829z;
    public static final AtomicBoolean f44793k0 = new AtomicBoolean();
    public static final org.telegram.messenger.r5 f44794l0 = new org.telegram.messenger.r5("walletCardAssets", 10);
    public static final int[] f44796o0 = {-16748837, -16747809, -16746781, -16745754, -16744728, -16743955, -16743183, -16742412, -16741643};
    public static final LruCache f44797p0 = new LruCache(2);
    public final Paint f44800b = new Paint(3);
    public final Paint f44802c = new Paint(3);
    public final Paint d = new Paint(1);
    public final Matrix f44805e = new Matrix();
    public final RectF f44807f = new RectF(0.0f, 0.0f, 336.0f, 205.0f);
    public final RectF f44809g = new RectF();
    public final RectF h = new RectF(-42.0f, -107.5f, 378.0f, 312.5f);
    public final float[] f44812i = new float[152];
    public final float[] f44814j = new float[152];
    public final float[] f44815k = new float[152];
    public final float[] f44816l = new float[152];
    public final float[] f44817m = new float[76];
    public final float[] f44818n = new float[76];
    public final int[] f44819o = new int[76];
    public final Path f44820p = new Path();
    public final Path f44823s = new Path();
    public final Path f44824t = new Path();
    public final Path f44825u = new Path();
    public final Shader[] f44827x = new Shader[2];
    public final int[] D = new int[2];
    public final Shader[] E = new Shader[2];
    public final SweepGradient[] F = new SweepGradient[2];
    public final boolean[] G = new boolean[2];
    public final int[][] H = new int[2];
    public final PorterDuffColorFilter[][] I = (PorterDuffColorFilter[][]) Array.newInstance(PorterDuffColorFilter.class, 2, 8);
    public final int[] J = {0, 0};
    public final int[] K = {0, 0};
    public final float[][] L = (float[][]) Array.newInstance(Float.TYPE, 22, 6);
    public final int[] N = new int[65];
    public final Bitmap[] O = new Bitmap[8];
    public final Bitmap[] P = new Bitmap[8];
    public float Y = 1.0f;
    public float f44801b0 = 1.0f;
    public int f44810g0 = -14456619;
    public int f44811h0 = -14184457;

    public p6(Context context, int i7, int i10, Runnable runnable) {
        double d;
        int i11;
        boolean z10;
        float f10;
        int i12;
        double d2;
        float f11;
        int i13;
        float f12;
        int i14 = 3;
        boolean z11 = true;
        float f13 = 336.0f;
        float f14 = 205.0f;
        int i15 = 2;
        int i16 = 8;
        int i17 = 0;
        char c10 = 6;
        float f15 = 1.0f;
        this.f44798a = runnable;
        this.R = context;
        int i18 = 0;
        while (i18 < 4) {
            if (i18 < i15) {
                f11 = 310.8f;
            } else {
                f11 = 25.2f;
            }
            int i19 = i17;
            if (i18 != 0 && i18 != i14) {
                i13 = i14;
                f12 = 179.63126f;
            } else {
                i13 = i14;
                f12 = 25.368736f;
            }
            char c11 = c10;
            float f16 = f15;
            int i20 = i19;
            while (i20 <= 18) {
                double radians = Math.toRadians((i20 * 5) + ((i18 * 90) - 90));
                int i21 = i15;
                int i22 = i16;
                float cos = (float) Math.cos(radians);
                float sin = (float) Math.sin(radians);
                float[] fArr = this.f44812i;
                int i23 = ((i18 * 19) + i20) * 2;
                fArr[i23] = com.google.android.gms.internal.vision.e2.y(cos, 25.2f, f11, 336.0f);
                int i24 = i23 + 1;
                fArr[i24] = com.google.android.gms.internal.vision.e2.y(25.368736f, sin, f12, 205.0f);
                float[] fArr2 = this.f44814j;
                fArr2[i23] = cos;
                fArr2[i24] = sin;
                i20++;
                i15 = i21;
                i16 = i22;
            }
            i18++;
            i17 = i19;
            i14 = i13;
            c10 = c11;
            f15 = f16;
        }
        int i25 = i14;
        int i26 = i15;
        int i27 = i16;
        int i28 = i17;
        char c12 = c10;
        float f17 = f15;
        float f18 = 336.0f - i10;
        this.M = new RectF(f18 - 48.0f, 74.0f, f18, 110.0f);
        if (m0 == null) {
            String[] strArr = {"finish_light", "finish_dark", "groove_along", "groove_across", "qr_brush_light", "qr_brush_dark", "grain"};
            m0 = new Bitmap[7];
            for (int i29 = i28; i29 < 7; i29++) {
                try {
                    InputStream open = context.getAssets().open("wallet_card_2d/" + strArr[i29] + ".webp");
                    m0[i29] = BitmapFactory.decodeStream(open);
                    Bitmap bitmap = m0[i29];
                    if (bitmap != null) {
                        bitmap.prepareToDraw();
                    }
                    if (open != null) {
                        open.close();
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        if (f44795n0 == null) {
            int[] iArr = new int[i26];
            iArr[1] = i27;
            iArr[i28] = i26;
            Bitmap[][] bitmapArr = (Bitmap[][]) Array.newInstance(Bitmap.class, iArr);
            int i30 = i28;
            while (i30 < i26) {
                int i31 = i27;
                for (int i32 = i28; i32 < i31; i32++) {
                    try {
                        InputStream open2 = context.getAssets().open("wallet_card_2d/face_" + i30 + "_" + i32 + ".webp");
                        bitmapArr[i30][i32] = BitmapFactory.decodeStream(open2);
                        Bitmap bitmap2 = bitmapArr[i30][i32];
                        if (bitmap2 != null) {
                            bitmap2.prepareToDraw();
                        }
                        if (open2 != null) {
                            open2.close();
                        }
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                i30++;
                i27 = i31;
                i26 = 2;
            }
            f44795n0 = bitmapArr;
        }
        int[] iArr2 = new int[129];
        int[] iArr3 = new int[129];
        int i33 = i28;
        while (true) {
            d = 128.0d;
            i11 = 128;
            z10 = z11;
            if (i33 > 128) {
                break;
            }
            float f19 = f13;
            double d10 = ((i33 * 3.141592653589793d) * 2.0d) / 128.0d;
            iArr2[i33] = Color.argb(Math.round(((float) Math.pow(Math.pow(Math.sin(d10) / 0.64d, 2.0d) + 1.0d, -2.0d)) * 64.0f), 255, 255, 255);
            iArr3[i33] = Color.argb(Math.round(l(0.18f, 0.88f, (float) Math.abs(Math.cos(Math.atan2(Math.sin(d10) / 2.0d, Math.cos(d10))))) * 255.0f), 255, 255, 255);
            i33++;
            z11 = z10 ? 1 : 0;
            f13 = f19;
            f14 = f14;
        }
        float f20 = f13;
        float f21 = f14;
        this.v = new SweepGradient(168.0f, 102.5f, iArr2, (float[]) null);
        SweepGradient sweepGradient = new SweepGradient(168.0f, 102.5f, iArr3, (float[]) null);
        this.f44826w = sweepGradient;
        if (m0[c12] != null) {
            Bitmap bitmap3 = m0[c12];
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
            f10 = 0.88f;
            this.f44805e.setScale(f20 / m0[c12].getWidth(), f21 / m0[c12].getHeight());
            bitmapShader.setLocalMatrix(this.f44805e);
            this.f44828y = new ComposeShader(bitmapShader, sweepGradient, PorterDuff.Mode.DST_IN);
        } else {
            f10 = 0.88f;
        }
        int i34 = i28;
        while (i34 < 2) {
            if (m0[i34] != null) {
                Bitmap bitmap4 = m0[i34];
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                d2 = d;
                this.f44805e.setScale(f20 / m0[i34].getWidth(), f21 / m0[i34].getHeight());
                bitmapShader2.setLocalMatrix(this.f44805e);
                this.f44827x[i34] = new ComposeShader(bitmapShader2, this.f44826w, PorterDuff.Mode.DST_IN);
            } else {
                d2 = d;
            }
            int i35 = i34 + 2;
            if (m0[i35] != null) {
                Bitmap bitmap5 = m0[i35];
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader3 = new BitmapShader(bitmap5, tileMode3, tileMode3);
                this.f44805e.setScale(f20 / m0[i35].getWidth(), f21 / m0[i35].getHeight());
                bitmapShader3.setLocalMatrix(this.f44805e);
                int[] iArr4 = new int[129];
                int i36 = i28;
                while (i36 <= i11) {
                    double d11 = ((i36 * 3.141592653589793d) * 2.0d) / d2;
                    float abs = (float) Math.abs(Math.cos(Math.atan2(Math.sin(d11) / 2.0d, Math.cos(d11))));
                    float l10 = l((float) Math.cos(1.350884841043611d), (float) Math.cos(0.3782477554922111d), abs);
                    float f22 = abs * abs;
                    if (i34 != 0) {
                        f22 = f17 - f22;
                    }
                    iArr4[i36] = a(l10 * f22, -1);
                    i36++;
                    i11 = 128;
                }
                this.F[i34] = new SweepGradient(168.0f, 102.5f, iArr4, (float[]) null);
                this.E[i34] = new ComposeShader(bitmapShader3, this.F[i34], PorterDuff.Mode.DST_IN);
            }
            i34++;
            d = d2;
            i11 = 128;
        }
        this.f44802c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        this.d.setStyle(Paint.Style.STROKE);
        Random random = new Random(24560118926758988L);
        for (int i37 = i28; i37 < this.L.length; i37++) {
            float f23 = -1.0f;
            int i38 = i28;
            while (true) {
                if (i37 == 0) {
                    i12 = z10 ? 1 : 0;
                } else {
                    i12 = 32;
                }
                if (i38 < i12) {
                    float nextFloat = random.nextFloat() * f20;
                    float nextFloat2 = random.nextFloat() * f21;
                    float f24 = Float.MAX_VALUE;
                    for (int i39 = i28; i39 < i37; i39++) {
                        float abs2 = Math.abs(nextFloat - this.L[i39][i28]);
                        float abs3 = Math.abs(nextFloat2 - this.L[i39][z10 ? 1 : 0]);
                        float min = Math.min(abs2, f20 - abs2);
                        float min2 = Math.min(abs3, f21 - abs3);
                        f24 = Math.min(f24, (min2 * min2) + (min * min));
                    }
                    if (f24 > f23) {
                        float[] fArr3 = this.L[i37];
                        fArr3[i28] = nextFloat;
                        fArr3[z10 ? 1 : 0] = nextFloat2;
                        f23 = f24;
                    }
                    i38++;
                }
            }
            this.L[i37][2] = (((random.nextFloat() * 6.0f) + f17) * f20) / 512.0f;
            double nextFloat3 = random.nextFloat() * 3.141592653589793d * 2.0d;
            float h = org.telegram.ui.Cells.c0.h(random, 0.45f, 0.05f);
            float sqrt = f17 / ((float) Math.sqrt((h * h) + f17));
            this.L[i37][i25] = ((float) Math.cos(nextFloat3)) * h * sqrt;
            this.L[i37][4] = ((float) Math.sin(nextFloat3)) * h * sqrt;
            this.L[i37][5] = sqrt;
        }
        int[] iArr5 = new int[65];
        for (int i40 = i28; i40 <= 64; i40++) {
            iArr5[i40] = a((((float) Math.pow(Math.abs(Math.cos(((i40 * 3.141592653589793d) * 2.0d) / 64.0d)), 8.0d)) * f10) + 0.12f, -1);
        }
        SweepGradient sweepGradient2 = new SweepGradient(this.M.centerX(), this.M.centerY(), iArr5, (float[]) null);
        this.f44804d0 = sweepGradient2;
        if (m0[4] != null) {
            Bitmap bitmap6 = m0[4];
            Shader.TileMode tileMode4 = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader4 = new BitmapShader(bitmap6, tileMode4, tileMode4);
            this.f44805e.setScale(this.M.width() / m0[4].getWidth(), this.M.height() / m0[4].getHeight());
            Matrix matrix = this.f44805e;
            RectF rectF = this.M;
            matrix.postTranslate(rectF.left, rectF.top);
            bitmapShader4.setLocalMatrix(this.f44805e);
            this.f44806e0 = new ComposeShader(bitmapShader4, sweepGradient2, PorterDuff.Mode.DST_IN);
        }
        f(h(context, i7));
        this.f44808f0 = i7;
        k(0.0f, 0.0f);
        f44792j0 = z10;
    }

    public static int a(float f10, int i7) {
        return i0.a.o(i7, Math.round(c(f10) * 255.0f));
    }

    public static float c(float f10) {
        return Math.max(0.0f, Math.min(1.0f, f10));
    }

    public static int d(float f10, float f11, float f12, int i7, int i10) {
        float f13 = f12 * 255.0f;
        return Color.rgb(Math.min(255, Math.round((Color.red(i10) * f11) + (Color.red(i7) * f10) + f13)), Math.min(255, Math.round((Color.green(i10) * f11) + (Color.green(i7) * f10) + f13)), Math.min(255, Math.round((Color.blue(i10) * f11) + (Color.blue(i7) * f10) + f13)));
    }

    public static float g(int i7) {
        float f10 = i7 / 255.0f;
        if (f10 <= 0.04045f) {
            return f10 / 12.92f;
        }
        return (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4d);
    }

    public static Bitmap[] h(Context context, int i7) {
        String str;
        StringBuilder sb2;
        int i10;
        String sb3;
        Integer valueOf = Integer.valueOf(i7);
        LruCache lruCache = f44797p0;
        Bitmap[] bitmapArr = (Bitmap[]) lruCache.get(valueOf);
        if (bitmapArr != null) {
            return bitmapArr;
        }
        if (i7 == 2131232813) {
            str = "qr";
        } else if (i7 == 2131232812) {
            str = "info";
        } else {
            throw new IllegalArgumentException(i5.c.i(i7, "Missing packaged wallet icon: "));
        }
        Bitmap[] bitmapArr2 = new Bitmap[17];
        for (int i11 = 0; i11 < 17; i11++) {
            if (i11 == 0) {
                sb3 = "mask";
            } else {
                if (i11 <= 8) {
                    sb2 = new StringBuilder("light_");
                    i10 = i11 - 1;
                } else {
                    sb2 = new StringBuilder("dark_");
                    i10 = i11 - 9;
                }
                sb2.append(i10);
                sb3 = sb2.toString();
            }
            try {
                InputStream open = context.getAssets().open("wallet_card_2d/icon_" + str + "_" + sb3 + ".webp");
                Bitmap decodeStream = BitmapFactory.decodeStream(open);
                bitmapArr2[i11] = decodeStream;
                if (decodeStream != null) {
                    decodeStream.prepareToDraw();
                    if (open != null) {
                        open.close();
                    }
                } else {
                    throw new IllegalStateException("Invalid wallet icon texture");
                }
            } catch (IOException e10) {
                throw new IllegalStateException("Missing wallet icon texture", e10);
            }
        }
        lruCache.put(Integer.valueOf(i7), bitmapArr2);
        return bitmapArr2;
    }

    public static float i(float f10, float f11, float f12) {
        return com.google.android.gms.internal.vision.e2.z(f11, f10, f12, f10);
    }

    public static float l(float f10, float f11, float f12) {
        float c10 = c((f12 - f10) / (f11 - f10));
        return com.google.android.gms.internal.vision.e2.C(c10, 2.0f, 3.0f, c10 * c10);
    }

    public final void b(Canvas canvas, Bitmap bitmap, RectF rectF, int i7) {
        if (bitmap == null) {
            return;
        }
        Paint paint = this.f44800b;
        paint.setAlpha(i7);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
        paint.setAlpha(255);
    }

    public final void e(android.graphics.Canvas r35, float[] r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.p6.e(android.graphics.Canvas, float[]):void");
    }

    public final void f(Bitmap[] bitmapArr) {
        this.Q = bitmapArr[0];
        System.arraycopy(bitmapArr, 1, this.O, 0, 8);
        System.arraycopy(bitmapArr, 9, this.P, 0, 8);
    }

    public final void j(int i7) {
        if (i7 == this.f44808f0) {
            return;
        }
        this.f44808f0 = i7;
        Bitmap[] bitmapArr = (Bitmap[]) f44797p0.get(Integer.valueOf(i7));
        if (bitmapArr != null) {
            f(bitmapArr);
            return;
        }
        f44794l0.postRunnable(new jw0(this, i7, 7));
    }

    public final void k(float f10, float f11) {
        float f12;
        float f13;
        SweepGradient[] sweepGradientArr;
        if (this.f44813i0 && this.S == f10 && this.T == f11) {
            return;
        }
        this.f44813i0 = true;
        this.S = f10;
        this.T = f11;
        double d = f10;
        double radians = Math.toRadians(d);
        double radians2 = Math.toRadians(f11);
        float sin = (float) (Math.sin(radians2) * Math.cos(radians));
        float sin2 = (float) Math.sin(radians);
        float cos = (float) (Math.cos(radians2) * Math.cos(radians));
        this.W = (float) ((sin * 0.83d) + (Math.cos(radians2) * 0.175d));
        this.X = 0.83f * sin2;
        float sin3 = (float) ((cos * 0.83d) + (Math.sin(radians2) * (-0.175d)));
        this.Y = sin3;
        float f14 = this.W;
        float f15 = this.X;
        float f16 = sin3 * sin3;
        float sqrt = (float) Math.sqrt(f16 + (f15 * f15) + (f14 * f14));
        float f17 = this.W / sqrt;
        this.W = f17;
        float f18 = this.X / sqrt;
        this.X = f18;
        float f19 = this.Y / sqrt;
        this.Y = f19;
        this.Z = f17 + sin;
        this.f44799a0 = f18 + sin2;
        float f20 = f19 + cos;
        this.f44801b0 = f20;
        float f21 = f20 * f20;
        float sqrt2 = (float) Math.sqrt(f21 + (f13 * f13) + (f12 * f12));
        this.Z /= sqrt2;
        this.f44799a0 /= sqrt2;
        this.f44801b0 /= sqrt2;
        this.U = (float) Math.toRadians(((f11 * 2.0f) + 1.72d) - (d * 1.25d));
        float f22 = (this.f44799a0 * 4.0f) + ((this.Z - 0.103713065f) * (-2.0f));
        this.V = f22;
        Matrix matrix = this.f44805e;
        matrix.setRotate((float) Math.toDegrees(f22), 168.0f, 102.5f);
        this.v.setLocalMatrix(matrix);
        this.f44826w.setLocalMatrix(matrix);
        for (SweepGradient sweepGradient : this.F) {
            if (sweepGradient != null) {
                sweepGradient.setLocalMatrix(matrix);
            }
        }
        float cos2 = (float) Math.cos(radians);
        float sin4 = (float) Math.sin(radians);
        float cos3 = (float) Math.cos(radians2);
        float f23 = -((float) Math.sin(radians2));
        float f24 = (f23 * cos) + ((-cos3) * sin);
        float z10 = org.telegram.ui.Cells.c0.z(sin4, cos3, cos, (((-sin4) * f23) * sin) - (cos2 * sin2));
        float x10 = com.google.android.gms.internal.vision.e2.x(cos2, cos3, cos, ((f23 * cos2) * sin) - (sin4 * sin2));
        double d2 = z10;
        double d10 = x10;
        float c10 = c((((((float) Math.pow(Math.max(0.0d, (d10 * 0.68d) + ((0.12d * d2) + (f24 * 0.72d))), 31.15d)) * 0.7832f) + ((((float) Math.pow(Math.max(0.0d, (d10 * 0.72d) + ((0.46d * d2) + ((-f24) * 0.52d))), 16.55d)) * 2.5191f) + ((((float) Math.pow(Math.max(0.0d, (0.571d * d10) + (d2 * 0.821d)), 4.65d)) * 0.1133f) + ((((float) Math.pow(Math.max(0.0d, (0.9757d * d10) + (0.2191d * d2)), 3.365d)) * 0.2556f) + i(0.061f, 0.356f, l(-0.45f, 0.72f, z10)))))) - 0.12f) / 1.8f);
        float i7 = i(0.25f, 2.2f, c10);
        float i10 = i(0.9f, 1.2f, c10) * 0.35f;
        int i11 = 0;
        while (true) {
            int[] iArr = this.N;
            if (i11 < iArr.length) {
                double abs = Math.abs(Math.cos(((i11 * 3.141592653589793d) * 2.0d) / 64.0d));
                double d11 = abs * 0.65d * abs;
                double c11 = ((c(this.Y) * 0.35d) + 0.65d) * ((Math.pow(abs, 22.0d) * 13.0d) + d11 + (((0.4d * abs * abs) + 0.72d) * i7)) * 6.0d;
                float i12 = i(i10, 1.0f, (float) Math.pow(c11 / (1.0d + c11), 0.9545454545454545d));
                iArr[i11] = Color.rgb(Math.round(0.992f * i12 * 255.0f), Math.round(0.996f * i12 * 255.0f), Math.round(i12 * 255.0f));
                i11++;
            } else {
                RectF rectF = this.M;
                this.f44803c0 = new SweepGradient(rectF.centerX(), rectF.centerY(), iArr, (float[]) null);
                matrix.setRotate((float) Math.toDegrees(this.V), rectF.centerX(), rectF.centerY());
                this.f44803c0.setLocalMatrix(matrix);
                this.f44804d0.setLocalMatrix(matrix);
                return;
            }
        }
    }
}
