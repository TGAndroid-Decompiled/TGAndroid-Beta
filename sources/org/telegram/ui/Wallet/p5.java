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
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class p5 {
    public static volatile boolean f34699j0;
    public static Bitmap[] m0;
    public static Bitmap[][] f34702n0;
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
    public final Runnable f34705a;
    public float f34706a0;
    public SweepGradient f34710c0;
    public final SweepGradient f34711d0;
    public final ComposeShader f34712e0;
    public int f34714f0;
    public boolean f34719i0;
    public float f34727q;
    public boolean f34728r;
    public final SweepGradient v;
    public final SweepGradient f34732w;
    public final ComposeShader f34734y;
    public int f34735z;
    public static final AtomicBoolean f34700k0 = new AtomicBoolean();
    public static final DispatchQueue f34701l0 = new DispatchQueue("walletCardAssets", true, 10);
    public static final int[] f34703o0 = {-16748837, -16747809, -16746781, -16745754, -16744728, -16743955, -16743183, -16742412, -16741643};
    public static final LruCache f34704p0 = new LruCache(2);
    public final Paint f34707b = new Paint(3);
    public final Paint f34709c = new Paint(3);
    public final Paint d = new Paint(1);
    public final Matrix e = new Matrix();
    public final RectF f34713f = new RectF(0.0f, 0.0f, 336.0f, 205.0f);
    public final RectF f34715g = new RectF();
    public final RectF h = new RectF(-42.0f, -107.5f, 378.0f, 312.5f);
    public final float[] f34718i = new float[152];
    public final float[] f34720j = new float[152];
    public final float[] f34721k = new float[152];
    public final float[] f34722l = new float[152];
    public final float[] f34723m = new float[76];
    public final float[] f34724n = new float[76];
    public final int[] f34725o = new int[76];
    public final Path f34726p = new Path();
    public final Path f34729s = new Path();
    public final Path f34730t = new Path();
    public final Path f34731u = new Path();
    public final Shader[] f34733x = new Shader[2];
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
    public float f34708b0 = 1.0f;
    public int f34716g0 = -14456619;
    public int f34717h0 = -14184457;

    public p5(Context context, int i10, int i11, Runnable runnable) {
        char c10;
        int i12;
        float f7;
        float f10;
        int i13;
        int i14;
        float f11;
        int i15;
        float f12;
        int i16 = 3;
        boolean z10 = true;
        float f13 = 336.0f;
        float f14 = 205.0f;
        int i17 = 2;
        int i18 = 8;
        int i19 = 0;
        char c11 = 6;
        float f15 = 1.0f;
        this.f34705a = runnable;
        this.R = context;
        int i20 = 0;
        while (true) {
            c10 = 4;
            if (i20 >= 4) {
                break;
            }
            if (i20 < 2) {
                f11 = 310.8f;
            } else {
                f11 = 25.2f;
            }
            boolean z11 = z10;
            if (i20 != 0 && i20 != i16) {
                i15 = i16;
                f12 = 179.63126f;
            } else {
                i15 = i16;
                f12 = 25.368736f;
            }
            int i21 = i19;
            char c12 = c11;
            while (i19 <= 18) {
                int i22 = (i20 * 19) + i19;
                float f16 = f15;
                double radians = Math.toRadians((i19 * 5) + ((i20 * 90) - 90));
                int i23 = i18;
                int i24 = i19;
                float cos = (float) Math.cos(radians);
                float sin = (float) Math.sin(radians);
                float[] fArr = this.f34718i;
                int i25 = i22 * 2;
                fArr[i25] = com.google.android.gms.internal.play_billing.k3.w(cos, 25.2f, f11, 336.0f);
                int i26 = i25 + 1;
                fArr[i26] = com.google.android.gms.internal.play_billing.k3.w(25.368736f, sin, f12, 205.0f);
                float[] fArr2 = this.f34720j;
                fArr2[i25] = cos;
                fArr2[i26] = sin;
                i19 = i24 + 1;
                i18 = i23;
                f15 = f16;
            }
            i20++;
            z10 = z11;
            i16 = i15;
            i19 = i21;
            c11 = c12;
        }
        int i27 = i16;
        boolean z12 = z10;
        int i28 = i18;
        int i29 = i19;
        char c13 = c11;
        float f17 = f15;
        float f18 = 336.0f - i11;
        this.M = new RectF(f18 - 48.0f, 74.0f, f18, 110.0f);
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
                    FileLog.e(e);
                }
            }
        }
        if (f34702n0 == null) {
            int[] iArr = new int[2];
            iArr[z12 ? 1 : 0] = i28;
            iArr[i29] = 2;
            Bitmap[][] bitmapArr = (Bitmap[][]) Array.newInstance(Bitmap.class, iArr);
            int i31 = i29;
            while (i31 < 2) {
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
                        FileLog.e(e7);
                    }
                }
                i31++;
                i28 = i32;
            }
            f34702n0 = bitmapArr;
        }
        int[] iArr2 = new int[129];
        int[] iArr3 = new int[129];
        int i34 = i29;
        while (true) {
            i12 = 128;
            f7 = f13;
            f10 = f14;
            if (i34 > 128) {
                break;
            }
            double d = ((i34 * 3.141592653589793d) * 2.0d) / 128.0d;
            iArr2[i34] = Color.argb(Math.round(((float) Math.pow(Math.pow(Math.sin(d) / 0.64d, 2.0d) + 1.0d, -2.0d)) * 64.0f), 255, 255, 255);
            iArr3[i34] = Color.argb(Math.round(l(0.18f, 0.88f, (float) Math.abs(Math.cos(Math.atan2(Math.sin(d) / 2.0d, Math.cos(d))))) * 255.0f), 255, 255, 255);
            i34++;
            f14 = f10;
            c10 = c10;
            f13 = f7;
        }
        char c14 = c10;
        this.v = new SweepGradient(168.0f, 102.5f, iArr2, (float[]) null);
        SweepGradient sweepGradient = new SweepGradient(168.0f, 102.5f, iArr3, (float[]) null);
        this.f34732w = sweepGradient;
        if (m0[c13] != null) {
            Bitmap bitmap3 = m0[c13];
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
            this.e.setScale(f7 / m0[c13].getWidth(), f10 / m0[c13].getHeight());
            bitmapShader.setLocalMatrix(this.e);
            this.f34734y = new ComposeShader(bitmapShader, sweepGradient, PorterDuff.Mode.DST_IN);
        }
        int i35 = i29;
        while (i35 < i17) {
            if (m0[i35] != null) {
                Bitmap bitmap4 = m0[i35];
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                this.e.setScale(f7 / m0[i35].getWidth(), f10 / m0[i35].getHeight());
                bitmapShader2.setLocalMatrix(this.e);
                i14 = i17;
                this.f34733x[i35] = new ComposeShader(bitmapShader2, this.f34732w, PorterDuff.Mode.DST_IN);
            } else {
                i14 = i17;
            }
            int i36 = i35 + 2;
            if (m0[i36] != null) {
                Bitmap bitmap5 = m0[i36];
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader3 = new BitmapShader(bitmap5, tileMode3, tileMode3);
                this.e.setScale(f7 / m0[i36].getWidth(), f10 / m0[i36].getHeight());
                bitmapShader3.setLocalMatrix(this.e);
                int[] iArr4 = new int[129];
                int i37 = i29;
                while (i37 <= i12) {
                    double d10 = ((i37 * 3.141592653589793d) * 2.0d) / 128.0d;
                    float abs = (float) Math.abs(Math.cos(Math.atan2(Math.sin(d10) / 2.0d, Math.cos(d10))));
                    float l4 = l((float) Math.cos(1.350884841043611d), (float) Math.cos(0.3782477554922111d), abs);
                    float f19 = abs * abs;
                    if (i35 != 0) {
                        f19 = f17 - f19;
                    }
                    iArr4[i37] = a(l4 * f19, -1);
                    i37++;
                    i12 = 128;
                }
                this.F[i35] = new SweepGradient(168.0f, 102.5f, iArr4, (float[]) null);
                this.E[i35] = new ComposeShader(bitmapShader3, this.F[i35], PorterDuff.Mode.DST_IN);
            }
            i35++;
            i17 = i14;
            i12 = 128;
        }
        int i38 = i17;
        this.f34709c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        this.d.setStyle(Paint.Style.STROKE);
        Random random = new Random(24560118926758988L);
        for (int i39 = i29; i39 < this.L.length; i39++) {
            float f20 = -1.0f;
            int i40 = i29;
            while (true) {
                if (i39 == 0) {
                    i13 = z12 ? 1 : 0;
                } else {
                    i13 = 32;
                }
                if (i40 < i13) {
                    float nextFloat = random.nextFloat() * f7;
                    float nextFloat2 = random.nextFloat() * f10;
                    float f21 = Float.MAX_VALUE;
                    for (int i41 = i29; i41 < i39; i41++) {
                        float abs2 = Math.abs(nextFloat - this.L[i41][i29]);
                        float abs3 = Math.abs(nextFloat2 - this.L[i41][z12 ? 1 : 0]);
                        float min = Math.min(abs2, f7 - abs2);
                        float min2 = Math.min(abs3, f10 - abs3);
                        f21 = Math.min(f21, (min2 * min2) + (min * min));
                    }
                    if (f21 > f20) {
                        float[] fArr3 = this.L[i39];
                        fArr3[i29] = nextFloat;
                        fArr3[z12 ? 1 : 0] = nextFloat2;
                        f20 = f21;
                    }
                    i40++;
                }
            }
            this.L[i39][i38] = (((random.nextFloat() * 6.0f) + f17) * f7) / 512.0f;
            double nextFloat3 = random.nextFloat() * 3.141592653589793d * 2.0d;
            float d11 = org.telegram.ui.Cells.c1.d(random, 0.45f, 0.05f);
            float sqrt = f17 / ((float) Math.sqrt((d11 * d11) + f17));
            this.L[i39][i27] = ((float) Math.cos(nextFloat3)) * d11 * sqrt;
            this.L[i39][c14] = ((float) Math.sin(nextFloat3)) * d11 * sqrt;
            this.L[i39][5] = sqrt;
        }
        int[] iArr5 = new int[65];
        for (int i42 = i29; i42 <= 64; i42++) {
            iArr5[i42] = a((((float) Math.pow(Math.abs(Math.cos(((i42 * 3.141592653589793d) * 2.0d) / 64.0d)), 8.0d)) * 0.88f) + 0.12f, -1);
        }
        SweepGradient sweepGradient2 = new SweepGradient(this.M.centerX(), this.M.centerY(), iArr5, (float[]) null);
        this.f34711d0 = sweepGradient2;
        if (m0[c14] != null) {
            Bitmap bitmap6 = m0[c14];
            Shader.TileMode tileMode4 = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader4 = new BitmapShader(bitmap6, tileMode4, tileMode4);
            this.e.setScale(this.M.width() / m0[c14].getWidth(), this.M.height() / m0[c14].getHeight());
            Matrix matrix = this.e;
            RectF rectF = this.M;
            matrix.postTranslate(rectF.left, rectF.top);
            bitmapShader4.setLocalMatrix(this.e);
            this.f34712e0 = new ComposeShader(bitmapShader4, sweepGradient2, PorterDuff.Mode.DST_IN);
        }
        f(h(context, i10));
        this.f34714f0 = i10;
        k(0.0f, 0.0f);
        f34699j0 = z12;
    }

    public static int a(float f7, int i10) {
        return i0.a.o(i10, Math.round(c(f7) * 255.0f));
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
        LruCache lruCache = f34704p0;
        Bitmap[] bitmapArr = (Bitmap[]) lruCache.get(valueOf);
        if (bitmapArr != null) {
            return bitmapArr;
        }
        if (i10 == R.drawable.wallet_card_qr) {
            str = "qr";
        } else if (i10 == R.drawable.wallet_card_info) {
            str = "info";
        } else {
            throw new IllegalArgumentException(i2.e.j(i10, "Missing packaged wallet icon: "));
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
        return com.google.android.gms.internal.play_billing.k3.y(f10, f7, f11, f7);
    }

    public static float l(float f7, float f10, float f11) {
        float c10 = c((f11 - f7) / (f10 - f7));
        return com.google.android.gms.internal.play_billing.k3.B(c10, 2.0f, 3.0f, c10 * c10);
    }

    public final void b(Canvas canvas, Bitmap bitmap, RectF rectF, int i10) {
        if (bitmap == null) {
            return;
        }
        Paint paint = this.f34707b;
        paint.setAlpha(i10);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
        paint.setAlpha(255);
    }

    public final void e(android.graphics.Canvas r35, float[] r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.p5.e(android.graphics.Canvas, float[]):void");
    }

    public final void f(Bitmap[] bitmapArr) {
        this.Q = bitmapArr[0];
        System.arraycopy(bitmapArr, 1, this.O, 0, 8);
        System.arraycopy(bitmapArr, 9, this.P, 0, 8);
    }

    public final void j(int i10) {
        if (i10 == this.f34714f0) {
            return;
        }
        this.f34714f0 = i10;
        Bitmap[] bitmapArr = (Bitmap[]) f34704p0.get(Integer.valueOf(i10));
        if (bitmapArr != null) {
            f(bitmapArr);
            return;
        }
        f34701l0.postRunnable(new j(this, i10, 2));
    }

    public final void k(float f7, float f10) {
        float f11;
        float f12;
        SweepGradient[] sweepGradientArr;
        if (this.f34719i0 && this.S == f7 && this.T == f10) {
            return;
        }
        this.f34719i0 = true;
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
        this.f34706a0 = f17 + sin2;
        float f19 = f18 + cos;
        this.f34708b0 = f19;
        float f20 = f19 * f19;
        float sqrt2 = (float) Math.sqrt(f20 + (f12 * f12) + (f11 * f11));
        this.Z /= sqrt2;
        this.f34706a0 /= sqrt2;
        this.f34708b0 /= sqrt2;
        this.U = (float) Math.toRadians(((f10 * 2.0f) + 1.72d) - (d * 1.25d));
        float f21 = (this.f34706a0 * 4.0f) + ((this.Z - 0.103713065f) * (-2.0f));
        this.V = f21;
        Matrix matrix = this.e;
        matrix.setRotate((float) Math.toDegrees(f21), 168.0f, 102.5f);
        this.v.setLocalMatrix(matrix);
        this.f34732w.setLocalMatrix(matrix);
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
        float z10 = org.telegram.ui.Cells.c1.z(sin4, cos3, cos, (((-sin4) * f22) * sin) - (cos2 * sin2));
        float t10 = com.google.android.gms.internal.play_billing.k3.t(cos2, cos3, cos, ((f22 * cos2) * sin) - (sin4 * sin2));
        double d10 = z10;
        double d11 = t10;
        float c10 = c((((((float) Math.pow(Math.max(0.0d, (d11 * 0.68d) + ((0.12d * d10) + (f23 * 0.72d))), 31.15d)) * 0.7832f) + ((((float) Math.pow(Math.max(0.0d, (d11 * 0.72d) + ((0.46d * d10) + ((-f23) * 0.52d))), 16.55d)) * 2.5191f) + ((((float) Math.pow(Math.max(0.0d, (0.571d * d11) + (d10 * 0.821d)), 4.65d)) * 0.1133f) + ((((float) Math.pow(Math.max(0.0d, (0.9757d * d11) + (0.2191d * d10)), 3.365d)) * 0.2556f) + i(0.061f, 0.356f, l(-0.45f, 0.72f, z10)))))) - 0.12f) / 1.8f);
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
                this.f34710c0 = new SweepGradient(rectF.centerX(), rectF.centerY(), iArr, (float[]) null);
                matrix.setRotate((float) Math.toDegrees(this.V), rectF.centerX(), rectF.centerY());
                this.f34710c0.setLocalMatrix(matrix);
                this.f34711d0.setLocalMatrix(matrix);
                return;
            }
        }
    }
}
