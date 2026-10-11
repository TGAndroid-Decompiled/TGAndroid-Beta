package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class u50 {
    public final int f31235a;
    public final int f31236b;
    public final FloatBuffer f31240g;
    public final FloatBuffer h;
    public final int[] f31243k;
    public final t50 f31237c = new t50(R.raw.round_blur_stage_0_frag);
    public final t50 d = new t50(R.raw.round_blur_stage_3_frag);
    public final r50 f31238e = new r50();
    public final s50 f31239f = new s50();
    public int f31241i = 0;
    public final int[] f31242j = new int[1];

    public u50(int i10, int i11) {
        int i12;
        float f7;
        char c10;
        int i13;
        int i14;
        RLottieNative rLottieNative;
        int i15;
        Bitmap bitmap;
        int i16;
        int i17;
        Object obj;
        int i18 = 0;
        int[] iArr = new int[5];
        this.f31243k = iArr;
        this.f31235a = i10;
        this.f31236b = i11;
        float[] fArr = new float[232];
        c(fArr, 0, 0.0f, 1.0f, 1.0f, 0.0f);
        c(fArr, 8, 0.0f, 0.0f, 1.0f, 1.0f);
        float[] fArr2 = new float[36];
        float f10 = 1.0f;
        d(fArr2, 0, -1.0f, 1.0f, 1.0f);
        GLES20.glGenTextures(5, iArr, 0);
        int i19 = 0;
        for (int i20 = 5; i19 < i20; i20 = 5) {
            GLES20.glBindTexture(3553, this.f31243k[i19]);
            if (i19 < 2) {
                i12 = 9729;
            } else {
                i12 = 9728;
            }
            GLES20.glTexParameteri(3553, 10241, i12);
            GLES20.glTexParameteri(3553, 10240, i19 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            int i21 = 4;
            if (i19 == 4) {
                int round = Math.round(i10 * 0.2f);
                int round2 = Math.round((i10 * 28) / 1536.0f);
                int i22 = (round - round2) - round2;
                Object obj2 = null;
                RLottieNative b10 = RLottieNative.b(AndroidUtilities.readRes(R.raw.plane_logo_plain), null, null, null);
                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ARGB_8888);
                float f11 = f10;
                Bitmap createBitmap2 = Bitmap.createBitmap(i22 * 8, i22 * 4, Bitmap.Config.ALPHA_8);
                Canvas canvas = new Canvas(createBitmap2);
                int i23 = 0;
                while (i23 < 8) {
                    int i24 = 0;
                    while (i24 < i21) {
                        int i25 = (i24 * 8) + i23;
                        if (i25 >= 27) {
                            obj = obj2;
                            bitmap = createBitmap;
                            i14 = i22;
                            i15 = i23;
                            rLottieNative = b10;
                            i16 = i24;
                            i17 = 4;
                        } else {
                            int i26 = (i25 * 8) + 16;
                            i14 = i22;
                            rLottieNative = b10;
                            i15 = i23;
                            bitmap = createBitmap;
                            i16 = i24;
                            i17 = 4;
                            c(fArr, i26, i23 / 8.0f, i24 / 4.0f, (i23 + 1) / 8.0f, (i24 + 1) / 4.0f);
                            rLottieNative.c(i25 * 2, bitmap, true);
                            obj = null;
                            canvas.drawBitmap(bitmap, (i14 * i15) - round2, (i14 * i16) - round2, (Paint) null);
                        }
                        i22 = i14;
                        b10 = rLottieNative;
                        i24 = i16 + 1;
                        obj2 = obj;
                        createBitmap = bitmap;
                        i23 = i15;
                        i21 = i17;
                    }
                    i23++;
                    obj2 = obj2;
                    i21 = i21;
                }
                float e7 = a1.g.e(i22, this.f31235a, 2.0f, -1.0f);
                d(fArr2, 24, -1.0f, e7, e7);
                GLUtils.texImage2D(3553, 0, createBitmap2, 0);
                createBitmap2.recycle();
                createBitmap.recycle();
                b10.d();
                f7 = f11;
                c10 = 0;
            } else {
                float f12 = f10;
                if (i19 == 3) {
                    int round3 = Math.round((i10 * 372.0f) / 1536.0f);
                    float f13 = (round3 / this.f31235a) * 2.0f;
                    c10 = 0;
                    f7 = f12;
                    d(fArr2, 12, f12 - f13, f13 - 1.0f, f7);
                    Bitmap bitmapFromRaw = AndroidUtilities.getBitmapFromRaw(R.raw.round_blur_overlay_text);
                    if (bitmapFromRaw != null) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapFromRaw, round3, round3, true);
                        Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                        GLUtils.texImage2D(3553, 0, extractAlpha, 0);
                        extractAlpha.recycle();
                        createScaledBitmap.recycle();
                        bitmapFromRaw.recycle();
                    }
                } else {
                    f7 = f12;
                    c10 = 0;
                    if (i19 == 0) {
                        i13 = this.f31235a;
                    } else {
                        i13 = 48;
                    }
                    GLES20.glTexImage2D(3553, 0, 6408, i13, i19 == 0 ? this.f31236b : 48, 0, 6408, 5121, null);
                }
            }
            i19++;
            f10 = f7;
            i18 = 0;
        }
        int i27 = i18;
        GLES20.glBindTexture(3553, i27);
        GLES20.glGenFramebuffers(1, this.f31242j, i27);
        FloatBuffer h = org.telegram.messenger.ai.h(ByteBuffer.allocateDirect(144));
        this.f31240g = h;
        h.put(fArr2).position(i27);
        FloatBuffer h10 = org.telegram.messenger.ai.h(ByteBuffer.allocateDirect(928));
        this.h = h10;
        h10.put(fArr).position(i27);
    }

    public static int a(int i10, int i11) {
        int glCreateShader = GLES20.glCreateShader(i10);
        if (glCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, AndroidUtilities.readRes(i11));
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            FileLog.e("GlUtils: compile shader error: " + glGetShaderInfoLog);
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public static void c(float[] fArr, int i10, float f7, float f10, float f11, float f12) {
        fArr[i10] = f7;
        fArr[i10 + 1] = f12;
        fArr[i10 + 2] = f11;
        fArr[i10 + 3] = f12;
        fArr[i10 + 4] = f7;
        fArr[i10 + 5] = f10;
        fArr[i10 + 6] = f11;
        fArr[i10 + 7] = f10;
    }

    public static void d(float[] fArr, int i10, float f7, float f10, float f11) {
        fArr[i10] = f7;
        fArr[i10 + 1] = -1.0f;
        fArr[i10 + 2] = 0.0f;
        fArr[i10 + 3] = f11;
        fArr[i10 + 4] = -1.0f;
        fArr[i10 + 5] = 0.0f;
        fArr[i10 + 6] = f7;
        fArr[i10 + 7] = f10;
        fArr[i10 + 8] = 0.0f;
        fArr[i10 + 9] = f11;
        fArr[i10 + 10] = f10;
        fArr[i10 + 11] = 0.0f;
    }

    public final void b() {
        this.f31237c.a();
        this.f31238e.a();
        this.f31239f.a();
        this.d.a();
        GLES20.glDeleteTextures(5, this.f31243k, 0);
        GLES20.glDeleteFramebuffers(1, this.f31242j, 0);
    }
}
