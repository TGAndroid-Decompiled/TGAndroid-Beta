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
import org.telegram.ui.Components.qq;
public final class c6 {
    public static volatile boolean f34319j0;
    public static Bitmap[] m0;
    public static Bitmap[][] f34322n0;
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
    public final Runnable f34325a;
    public float f34326a0;
    public SweepGradient f34330c0;
    public final SweepGradient f34331d0;
    public final ComposeShader f34332e0;
    public int f34334f0;
    public boolean f34339i0;
    public float f34347q;
    public boolean f34348r;
    public final SweepGradient v;
    public final SweepGradient f34352w;
    public final ComposeShader f34354y;
    public int f34355z;
    public static final AtomicBoolean f34320k0 = new AtomicBoolean();
    public static final org.telegram.messenger.s5 f34321l0 = new org.telegram.messenger.s5("walletCardAssets", 10);
    public static final int[] f34323o0 = {-16748837, -16747809, -16746781, -16745754, -16744728, -16743955, -16743183, -16742412, -16741643};
    public static final LruCache f34324p0 = new LruCache(2);
    public final Paint f34327b = new Paint(3);
    public final Paint f34329c = new Paint(3);
    public final Paint d = new Paint(1);
    public final Matrix e = new Matrix();
    public final RectF f34333f = new RectF(0.0f, 0.0f, 336.0f, 205.0f);
    public final RectF f34335g = new RectF();
    public final RectF h = new RectF(-42.0f, -107.5f, 378.0f, 312.5f);
    public final float[] f34338i = new float[152];
    public final float[] f34340j = new float[152];
    public final float[] f34341k = new float[152];
    public final float[] f34342l = new float[152];
    public final float[] f34343m = new float[76];
    public final float[] f34344n = new float[76];
    public final int[] f34345o = new int[76];
    public final Path f34346p = new Path();
    public final Path f34349s = new Path();
    public final Path f34350t = new Path();
    public final Path f34351u = new Path();
    public final Shader[] f34353x = new Shader[2];
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
    public float f34328b0 = 1.0f;
    public int f34336g0 = -14456619;
    public int f34337h0 = -14184457;

    public c6(Context context, int i10, int i11, Runnable runnable) {
        double d;
        int i12;
        boolean z10;
        float f7;
        int i13;
        double d10;
        float f10;
        int i14;
        float f11;
        int i15 = 3;
        boolean z11 = true;
        float f12 = 336.0f;
        float f13 = 205.0f;
        int i16 = 2;
        int i17 = 8;
        int i18 = 0;
        char c10 = 6;
        float f14 = 1.0f;
        this.f34325a = runnable;
        this.R = context;
        int i19 = 0;
        while (i19 < 4) {
            if (i19 < i16) {
                f10 = 310.8f;
            } else {
                f10 = 25.2f;
            }
            int i20 = i18;
            if (i19 != 0 && i19 != i15) {
                i14 = i15;
                f11 = 179.63126f;
            } else {
                i14 = i15;
                f11 = 25.368736f;
            }
            char c11 = c10;
            float f15 = f14;
            int i21 = i20;
            while (i21 <= 18) {
                double radians = Math.toRadians((i21 * 5) + ((i19 * 90) - 90));
                int i22 = i16;
                int i23 = i17;
                float cos = (float) Math.cos(radians);
                float sin = (float) Math.sin(radians);
                float[] fArr = this.f34338i;
                int i24 = ((i19 * 19) + i21) * 2;
                fArr[i24] = c3.i0.x(cos, 25.2f, f10, 336.0f);
                int i25 = i24 + 1;
                fArr[i25] = c3.i0.x(25.368736f, sin, f11, 205.0f);
                float[] fArr2 = this.f34340j;
                fArr2[i24] = cos;
                fArr2[i25] = sin;
                i21++;
                i16 = i22;
                i17 = i23;
            }
            i19++;
            i18 = i20;
            i15 = i14;
            c10 = c11;
            f14 = f15;
        }
        int i26 = i15;
        int i27 = i16;
        int i28 = i17;
        int i29 = i18;
        char c12 = c10;
        float f16 = f14;
        float f17 = 336.0f - i11;
        this.M = new RectF(f17 - 48.0f, 74.0f, f17, 110.0f);
        if (m0 == null) {
            String[] strArr = {"finish_light", "finish_dark", "groove_along", "groove_across", "qr_brush_light", "qr_brush_dark", "grain"};
            m0 = new Bitmap[7];
            for (int i30 = i29; i30 < 7; i30++) {
                try {
                    InputStream open = context.getAssets().open("wallet_card_2d/" + strArr[i30] + ".webp");
                    m0[i30] = BitmapFactory.decodeStream(open);
                    Bitmap bitmap = m0[i30];
                    if (bitmap != null) {
                        bitmap.prepareToDraw();
                    }
                    if (open != null) {
                        open.close();
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        }
        if (f34322n0 == null) {
            int[] iArr = new int[i27];
            iArr[1] = i28;
            iArr[i29] = i27;
            Bitmap[][] bitmapArr = (Bitmap[][]) Array.newInstance(Bitmap.class, iArr);
            int i31 = i29;
            while (i31 < i27) {
                int i32 = i28;
                for (int i33 = i29; i33 < i32; i33++) {
                    try {
                        InputStream open2 = context.getAssets().open("wallet_card_2d/face_" + i31 + "_" + i33 + ".webp");
                        bitmapArr[i31][i33] = BitmapFactory.decodeStream(open2);
                        Bitmap bitmap2 = bitmapArr[i31][i33];
                        if (bitmap2 != null) {
                            bitmap2.prepareToDraw();
                        }
                        if (open2 != null) {
                            open2.close();
                        }
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                    }
                }
                i31++;
                i28 = i32;
                i27 = 2;
            }
            f34322n0 = bitmapArr;
        }
        int[] iArr2 = new int[129];
        int[] iArr3 = new int[129];
        int i34 = i29;
        while (true) {
            d = 128.0d;
            i12 = 128;
            z10 = z11;
            if (i34 > 128) {
                break;
            }
            float f18 = f12;
            double d11 = ((i34 * 3.141592653589793d) * 2.0d) / 128.0d;
            iArr2[i34] = Color.argb(Math.round(((float) Math.pow(Math.pow(Math.sin(d11) / 0.64d, 2.0d) + 1.0d, -2.0d)) * 64.0f), 255, 255, 255);
            iArr3[i34] = Color.argb(Math.round(l(0.18f, 0.88f, (float) Math.abs(Math.cos(Math.atan2(Math.sin(d11) / 2.0d, Math.cos(d11))))) * 255.0f), 255, 255, 255);
            i34++;
            z11 = z10 ? 1 : 0;
            f12 = f18;
            f13 = f13;
        }
        float f19 = f12;
        float f20 = f13;
        this.v = new SweepGradient(168.0f, 102.5f, iArr2, (float[]) null);
        SweepGradient sweepGradient = new SweepGradient(168.0f, 102.5f, iArr3, (float[]) null);
        this.f34352w = sweepGradient;
        if (m0[c12] != null) {
            Bitmap bitmap3 = m0[c12];
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
            f7 = 0.88f;
            this.e.setScale(f19 / m0[c12].getWidth(), f20 / m0[c12].getHeight());
            bitmapShader.setLocalMatrix(this.e);
            this.f34354y = new ComposeShader(bitmapShader, sweepGradient, PorterDuff.Mode.DST_IN);
        } else {
            f7 = 0.88f;
        }
        int i35 = i29;
        while (i35 < 2) {
            if (m0[i35] != null) {
                Bitmap bitmap4 = m0[i35];
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                d10 = d;
                this.e.setScale(f19 / m0[i35].getWidth(), f20 / m0[i35].getHeight());
                bitmapShader2.setLocalMatrix(this.e);
                this.f34353x[i35] = new ComposeShader(bitmapShader2, this.f34352w, PorterDuff.Mode.DST_IN);
            } else {
                d10 = d;
            }
            int i36 = i35 + 2;
            if (m0[i36] != null) {
                Bitmap bitmap5 = m0[i36];
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader3 = new BitmapShader(bitmap5, tileMode3, tileMode3);
                this.e.setScale(f19 / m0[i36].getWidth(), f20 / m0[i36].getHeight());
                bitmapShader3.setLocalMatrix(this.e);
                int[] iArr4 = new int[129];
                int i37 = i29;
                while (i37 <= i12) {
                    double d12 = ((i37 * 3.141592653589793d) * 2.0d) / d10;
                    float abs = (float) Math.abs(Math.cos(Math.atan2(Math.sin(d12) / 2.0d, Math.cos(d12))));
                    float l4 = l((float) Math.cos(1.350884841043611d), (float) Math.cos(0.3782477554922111d), abs);
                    float f21 = abs * abs;
                    if (i35 != 0) {
                        f21 = f16 - f21;
                    }
                    iArr4[i37] = a(l4 * f21, -1);
                    i37++;
                    i12 = 128;
                }
                this.F[i35] = new SweepGradient(168.0f, 102.5f, iArr4, (float[]) null);
                this.E[i35] = new ComposeShader(bitmapShader3, this.F[i35], PorterDuff.Mode.DST_IN);
            }
            i35++;
            d = d10;
            i12 = 128;
        }
        this.f34329c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        this.d.setStyle(Paint.Style.STROKE);
        Random random = new Random(24560118926758988L);
        for (int i38 = i29; i38 < this.L.length; i38++) {
            float f22 = -1.0f;
            int i39 = i29;
            while (true) {
                if (i38 == 0) {
                    i13 = z10 ? 1 : 0;
                } else {
                    i13 = 32;
                }
                if (i39 < i13) {
                    float nextFloat = random.nextFloat() * f19;
                    float nextFloat2 = random.nextFloat() * f20;
                    float f23 = Float.MAX_VALUE;
                    for (int i40 = i29; i40 < i38; i40++) {
                        float abs2 = Math.abs(nextFloat - this.L[i40][i29]);
                        float abs3 = Math.abs(nextFloat2 - this.L[i40][z10 ? 1 : 0]);
                        float min = Math.min(abs2, f19 - abs2);
                        float min2 = Math.min(abs3, f20 - abs3);
                        f23 = Math.min(f23, (min2 * min2) + (min * min));
                    }
                    if (f23 > f22) {
                        float[] fArr3 = this.L[i38];
                        fArr3[i29] = nextFloat;
                        fArr3[z10 ? 1 : 0] = nextFloat2;
                        f22 = f23;
                    }
                    i39++;
                }
            }
            this.L[i38][2] = (((random.nextFloat() * 6.0f) + f16) * f19) / 512.0f;
            double nextFloat3 = random.nextFloat() * 3.141592653589793d * 2.0d;
            float nextFloat4 = (random.nextFloat() * 0.45f) + 0.05f;
            float sqrt = f16 / ((float) Math.sqrt((nextFloat4 * nextFloat4) + f16));
            this.L[i38][i26] = ((float) Math.cos(nextFloat3)) * nextFloat4 * sqrt;
            this.L[i38][4] = ((float) Math.sin(nextFloat3)) * nextFloat4 * sqrt;
            this.L[i38][5] = sqrt;
        }
        int[] iArr5 = new int[65];
        for (int i41 = i29; i41 <= 64; i41++) {
            iArr5[i41] = a((((float) Math.pow(Math.abs(Math.cos(((i41 * 3.141592653589793d) * 2.0d) / 64.0d)), 8.0d)) * f7) + 0.12f, -1);
        }
        SweepGradient sweepGradient2 = new SweepGradient(this.M.centerX(), this.M.centerY(), iArr5, (float[]) null);
        this.f34331d0 = sweepGradient2;
        if (m0[4] != null) {
            Bitmap bitmap6 = m0[4];
            Shader.TileMode tileMode4 = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader4 = new BitmapShader(bitmap6, tileMode4, tileMode4);
            this.e.setScale(this.M.width() / m0[4].getWidth(), this.M.height() / m0[4].getHeight());
            Matrix matrix = this.e;
            RectF rectF = this.M;
            matrix.postTranslate(rectF.left, rectF.top);
            bitmapShader4.setLocalMatrix(this.e);
            this.f34332e0 = new ComposeShader(bitmapShader4, sweepGradient2, PorterDuff.Mode.DST_IN);
        }
        f(h(context, i10));
        this.f34334f0 = i10;
        k(0.0f, 0.0f);
        f34319j0 = z10;
    }

    public static int a(float f7, int i10) {
        return i0.b.o(i10, Math.round(c(f7) * 255.0f));
    }

    public static float c(float f7) {
        return Math.max(0.0f, Math.min(1.0f, f7));
    }

    public static int d(float f7, float f10, float f11, int i10, int i11) {
        float f12 = f11 * 255.0f;
        return Color.rgb(Math.min(255, Math.round((Color.red(i11) * f10) + (Color.red(i10) * f7) + f12)), Math.min(255, Math.round((Color.green(i11) * f10) + (Color.green(i10) * f7) + f12)), Math.min(255, Math.round((Color.blue(i11) * f10) + (Color.blue(i10) * f7) + f12)));
    }

    public static float g(int i10) {
        float f7 = i10 / 255.0f;
        if (f7 <= 0.04045f) {
            return f7 / 12.92f;
        }
        return (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4d);
    }

    public static Bitmap[] h(Context context, int i10) {
        String str;
        StringBuilder sb2;
        int i11;
        String sb3;
        Integer valueOf = Integer.valueOf(i10);
        LruCache lruCache = f34324p0;
        Bitmap[] bitmapArr = (Bitmap[]) lruCache.get(valueOf);
        if (bitmapArr != null) {
            return bitmapArr;
        }
        if (i10 == 2131232808) {
            str = "qr";
        } else if (i10 == 2131232807) {
            str = "info";
        } else {
            throw new IllegalArgumentException(i0.a.i(i10, "Missing packaged wallet icon: "));
        }
        Bitmap[] bitmapArr2 = new Bitmap[17];
        for (int i12 = 0; i12 < 17; i12++) {
            if (i12 == 0) {
                sb3 = "mask";
            } else {
                if (i12 <= 8) {
                    sb2 = new StringBuilder("light_");
                    i11 = i12 - 1;
                } else {
                    sb2 = new StringBuilder("dark_");
                    i11 = i12 - 9;
                }
                sb2.append(i11);
                sb3 = sb2.toString();
            }
            try {
                InputStream open = context.getAssets().open("wallet_card_2d/icon_" + str + "_" + sb3 + ".webp");
                Bitmap decodeStream = BitmapFactory.decodeStream(open);
                bitmapArr2[i12] = decodeStream;
                if (decodeStream != null) {
                    decodeStream.prepareToDraw();
                    if (open != null) {
                        open.close();
                    }
                } else {
                    throw new IllegalStateException("Invalid wallet icon texture");
                }
            } catch (IOException e) {
                throw new IllegalStateException("Missing wallet icon texture", e);
            }
        }
        lruCache.put(Integer.valueOf(i10), bitmapArr2);
        return bitmapArr2;
    }

    public static float i(float f7, float f10, float f11) {
        return c3.i0.z(f10, f7, f11, f7);
    }

    public static float l(float f7, float f10, float f11) {
        float c10 = c((f11 - f7) / (f10 - f7));
        return c3.i0.D(c10, 2.0f, 3.0f, c10 * c10);
    }

    public final void b(Canvas canvas, Bitmap bitmap, RectF rectF, int i10) {
        if (bitmap == null) {
            return;
        }
        Paint paint = this.f34327b;
        paint.setAlpha(i10);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
        paint.setAlpha(255);
    }

    public final void e(android.graphics.Canvas r35, float[] r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.c6.e(android.graphics.Canvas, float[]):void");
    }

    public final void f(Bitmap[] bitmapArr) {
        this.Q = bitmapArr[0];
        System.arraycopy(bitmapArr, 1, this.O, 0, 8);
        System.arraycopy(bitmapArr, 9, this.P, 0, 8);
    }

    public final void j(int i10) {
        if (i10 == this.f34334f0) {
            return;
        }
        this.f34334f0 = i10;
        Bitmap[] bitmapArr = (Bitmap[]) f34324p0.get(Integer.valueOf(i10));
        if (bitmapArr != null) {
            f(bitmapArr);
            return;
        }
        f34321l0.postRunnable(new qq(this, i10, 26));
    }

    public final void k(float f7, float f10) {
        float f11;
        float f12;
        SweepGradient[] sweepGradientArr;
        if (this.f34339i0 && this.S == f7 && this.T == f10) {
            return;
        }
        this.f34339i0 = true;
        this.S = f7;
        this.T = f10;
        double d = f7;
        double radians = Math.toRadians(d);
        double radians2 = Math.toRadians(f10);
        float sin = (float) (Math.sin(radians2) * Math.cos(radians));
        float sin2 = (float) Math.sin(radians);
        float cos = (float) (Math.cos(radians2) * Math.cos(radians));
        this.W = (float) ((sin * 0.83d) + (Math.cos(radians2) * 0.175d));
        this.X = 0.83f * sin2;
        float sin3 = (float) ((cos * 0.83d) + (Math.sin(radians2) * (-0.175d)));
        this.Y = sin3;
        float f13 = this.W;
        float f14 = this.X;
        float f15 = sin3 * sin3;
        float sqrt = (float) Math.sqrt(f15 + (f14 * f14) + (f13 * f13));
        float f16 = this.W / sqrt;
        this.W = f16;
        float f17 = this.X / sqrt;
        this.X = f17;
        float f18 = this.Y / sqrt;
        this.Y = f18;
        this.Z = f16 + sin;
        this.f34326a0 = f17 + sin2;
        float f19 = f18 + cos;
        this.f34328b0 = f19;
        float f20 = f19 * f19;
        float sqrt2 = (float) Math.sqrt(f20 + (f12 * f12) + (f11 * f11));
        this.Z /= sqrt2;
        this.f34326a0 /= sqrt2;
        this.f34328b0 /= sqrt2;
        this.U = (float) Math.toRadians(((f10 * 2.0f) + 1.72d) - (d * 1.25d));
        float f21 = (this.f34326a0 * 4.0f) + ((this.Z - 0.103713065f) * (-2.0f));
        this.V = f21;
        Matrix matrix = this.e;
        matrix.setRotate((float) Math.toDegrees(f21), 168.0f, 102.5f);
        this.v.setLocalMatrix(matrix);
        this.f34352w.setLocalMatrix(matrix);
        for (SweepGradient sweepGradient : this.F) {
            if (sweepGradient != null) {
                sweepGradient.setLocalMatrix(matrix);
            }
        }
        float cos2 = (float) Math.cos(radians);
        float sin4 = (float) Math.sin(radians);
        float cos3 = (float) Math.cos(radians2);
        float f22 = -((float) Math.sin(radians2));
        float f23 = (f22 * cos) + ((-cos3) * sin);
        float x10 = org.telegram.ui.Cells.f1.x(sin4, cos3, cos, (((-sin4) * f22) * sin) - (cos2 * sin2));
        float u10 = c3.i0.u(cos2, cos3, cos, ((f22 * cos2) * sin) - (sin4 * sin2));
        double d10 = x10;
        double d11 = u10;
        float c10 = c((((((float) Math.pow(Math.max(0.0d, (d11 * 0.68d) + ((0.12d * d10) + (f23 * 0.72d))), 31.15d)) * 0.7832f) + ((((float) Math.pow(Math.max(0.0d, (d11 * 0.72d) + ((0.46d * d10) + ((-f23) * 0.52d))), 16.55d)) * 2.5191f) + ((((float) Math.pow(Math.max(0.0d, (0.571d * d11) + (d10 * 0.821d)), 4.65d)) * 0.1133f) + ((((float) Math.pow(Math.max(0.0d, (0.9757d * d11) + (0.2191d * d10)), 3.365d)) * 0.2556f) + i(0.061f, 0.356f, l(-0.45f, 0.72f, x10)))))) - 0.12f) / 1.8f);
        float i10 = i(0.25f, 2.2f, c10);
        float i11 = i(0.9f, 1.2f, c10) * 0.35f;
        int i12 = 0;
        while (true) {
            int[] iArr = this.N;
            if (i12 < iArr.length) {
                double abs = Math.abs(Math.cos(((i12 * 3.141592653589793d) * 2.0d) / 64.0d));
                double d12 = abs * 0.65d * abs;
                double c11 = ((c(this.Y) * 0.35d) + 0.65d) * ((Math.pow(abs, 22.0d) * 13.0d) + d12 + (((0.4d * abs * abs) + 0.72d) * i10)) * 6.0d;
                float i13 = i(i11, 1.0f, (float) Math.pow(c11 / (1.0d + c11), 0.9545454545454545d));
                iArr[i12] = Color.rgb(Math.round(0.992f * i13 * 255.0f), Math.round(0.996f * i13 * 255.0f), Math.round(i13 * 255.0f));
                i12++;
            } else {
                RectF rectF = this.M;
                this.f34330c0 = new SweepGradient(rectF.centerX(), rectF.centerY(), iArr, (float[]) null);
                matrix.setRotate((float) Math.toDegrees(this.V), rectF.centerX(), rectF.centerY());
                this.f34330c0.setLocalMatrix(matrix);
                this.f34331d0.setLocalMatrix(matrix);
                return;
            }
        }
    }
}
