package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
public final class q30 {
    public final int f37185a;
    public final int f37186b;
    public final FloatBuffer f37190g;
    public final FloatBuffer h;
    public final int[] f37193k;
    public final e4.b f37187c = new e4.b(2131624180);
    public final e4.b d = new e4.b(2131624183);
    public final o30 f37188e = new o30();
    public final p30 f37189f = new p30();
    public int f37191i = 0;
    public final int[] f37192j = new int[1];

    public q30(int i7, int i10) {
        int i11;
        float f10;
        char c10;
        int i12;
        int i13;
        RLottieNative rLottieNative;
        int i14;
        Bitmap bitmap;
        int i15;
        int i16;
        Object obj;
        int i17 = 0;
        int[] iArr = new int[5];
        this.f37193k = iArr;
        this.f37185a = i7;
        this.f37186b = i10;
        float[] fArr = new float[232];
        c(fArr, 0, 0.0f, 1.0f, 1.0f, 0.0f);
        c(fArr, 8, 0.0f, 0.0f, 1.0f, 1.0f);
        float[] fArr2 = new float[36];
        float f11 = 1.0f;
        d(fArr2, 0, -1.0f, 1.0f, 1.0f);
        GLES20.glGenTextures(5, iArr, 0);
        int i18 = 0;
        for (int i19 = 5; i18 < i19; i19 = 5) {
            GLES20.glBindTexture(3553, this.f37193k[i18]);
            if (i18 < 2) {
                i11 = 9729;
            } else {
                i11 = 9728;
            }
            GLES20.glTexParameteri(3553, 10241, i11);
            GLES20.glTexParameteri(3553, 10240, i18 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            int i20 = 4;
            if (i18 == 4) {
                int round = Math.round(i7 * 0.2f);
                int round2 = Math.round((i7 * 28) / 1536.0f);
                int i21 = (round - round2) - round2;
                Object obj2 = null;
                RLottieNative b10 = RLottieNative.b(org.telegram.messenger.g0.y2(null, 2131624136), null, null, null);
                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ARGB_8888);
                float f12 = f11;
                Bitmap createBitmap2 = Bitmap.createBitmap(i21 * 8, i21 * 4, Bitmap.Config.ALPHA_8);
                Canvas canvas = new Canvas(createBitmap2);
                int i22 = 0;
                while (i22 < 8) {
                    int i23 = 0;
                    while (i23 < i20) {
                        int i24 = (i23 * 8) + i22;
                        if (i24 >= 27) {
                            obj = obj2;
                            bitmap = createBitmap;
                            i13 = i21;
                            i14 = i22;
                            rLottieNative = b10;
                            i15 = i23;
                            i16 = 4;
                        } else {
                            int i25 = (i24 * 8) + 16;
                            i13 = i21;
                            rLottieNative = b10;
                            i14 = i22;
                            bitmap = createBitmap;
                            i15 = i23;
                            i16 = 4;
                            c(fArr, i25, i22 / 8.0f, i23 / 4.0f, (i22 + 1) / 8.0f, (i23 + 1) / 4.0f);
                            rLottieNative.c(i24 * 2, bitmap, true);
                            obj = null;
                            canvas.drawBitmap(bitmap, (i13 * i14) - round2, (i13 * i15) - round2, (Paint) null);
                        }
                        i21 = i13;
                        b10 = rLottieNative;
                        i23 = i15 + 1;
                        obj2 = obj;
                        createBitmap = bitmap;
                        i22 = i14;
                        i20 = i16;
                    }
                    i22++;
                    obj2 = obj2;
                    i20 = i20;
                }
                float c11 = com.google.android.recaptcha.internal.a.c(i21, this.f37185a, 2.0f, -1.0f);
                d(fArr2, 24, -1.0f, c11, c11);
                GLUtils.texImage2D(3553, 0, createBitmap2, 0);
                createBitmap2.recycle();
                createBitmap.recycle();
                b10.d();
                f10 = f12;
                c10 = 0;
            } else {
                float f13 = f11;
                if (i18 == 3) {
                    int round3 = Math.round((i7 * 372.0f) / 1536.0f);
                    float f14 = (round3 / this.f37185a) * 2.0f;
                    c10 = 0;
                    f10 = f13;
                    d(fArr2, 12, f13 - f14, f14 - 1.0f, f10);
                    Bitmap x02 = org.telegram.messenger.g0.x0();
                    if (x02 != null) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(x02, round3, round3, true);
                        Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                        GLUtils.texImage2D(3553, 0, extractAlpha, 0);
                        extractAlpha.recycle();
                        createScaledBitmap.recycle();
                        x02.recycle();
                    }
                } else {
                    f10 = f13;
                    c10 = 0;
                    if (i18 == 0) {
                        i12 = this.f37185a;
                    } else {
                        i12 = 48;
                    }
                    GLES20.glTexImage2D(3553, 0, 6408, i12, i18 == 0 ? this.f37186b : 48, 0, 6408, 5121, null);
                }
            }
            i18++;
            f11 = f10;
            i17 = 0;
        }
        int i26 = i17;
        GLES20.glBindTexture(3553, i26);
        GLES20.glGenFramebuffers(1, this.f37192j, i26);
        FloatBuffer g10 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(144));
        this.f37190g = g10;
        g10.put(fArr2).position(i26);
        FloatBuffer g11 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(928));
        this.h = g11;
        g11.put(fArr).position(i26);
    }

    public static int a(int i7, int i10) {
        int glCreateShader = GLES20.glCreateShader(i7);
        if (glCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, org.telegram.messenger.g0.y2(null, i10));
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            org.telegram.messenger.a8.d("GlUtils: compile shader error: " + glGetShaderInfoLog);
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public static void c(float[] fArr, int i7, float f10, float f11, float f12, float f13) {
        fArr[i7] = f10;
        fArr[i7 + 1] = f13;
        fArr[i7 + 2] = f12;
        fArr[i7 + 3] = f13;
        fArr[i7 + 4] = f10;
        fArr[i7 + 5] = f11;
        fArr[i7 + 6] = f12;
        fArr[i7 + 7] = f11;
    }

    public static void d(float[] fArr, int i7, float f10, float f11, float f12) {
        fArr[i7] = f10;
        fArr[i7 + 1] = -1.0f;
        fArr[i7 + 2] = 0.0f;
        fArr[i7 + 3] = f12;
        fArr[i7 + 4] = -1.0f;
        fArr[i7 + 5] = 0.0f;
        fArr[i7 + 6] = f10;
        fArr[i7 + 7] = f11;
        fArr[i7 + 8] = 0.0f;
        fArr[i7 + 9] = f12;
        fArr[i7 + 10] = f11;
        fArr[i7 + 11] = 0.0f;
    }

    public final void b() {
        this.f37187c.a();
        this.f37188e.a();
        this.f37189f.a();
        this.d.a();
        GLES20.glDeleteTextures(5, this.f37193k, 0);
        GLES20.glDeleteFramebuffers(1, this.f37192j, 0);
    }
}
