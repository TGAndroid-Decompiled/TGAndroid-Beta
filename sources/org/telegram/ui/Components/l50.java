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
public final class l50 {
    public final int f24879a;
    public final int f24880b;
    public final FloatBuffer f24883g;
    public final FloatBuffer h;
    public final int[] f24886k;
    public final k50 f24881c = new k50(R.raw.round_blur_stage_0_frag);
    public final k50 d = new k50(R.raw.round_blur_stage_3_frag);
    public final i50 e = new i50();
    public final j50 f24882f = new j50();
    public int f24884i = 0;
    public final int[] f24885j = new int[1];

    public l50(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        RLottieNative rLottieNative;
        int i16;
        Bitmap bitmap;
        int i17;
        Object obj;
        int[] iArr = new int[5];
        this.f24886k = iArr;
        this.f24879a = i10;
        this.f24880b = i11;
        float[] fArr = new float[232];
        c(fArr, 0, 0.0f, 1.0f, 1.0f, 0.0f);
        c(fArr, 8, 0.0f, 0.0f, 1.0f, 1.0f);
        float[] fArr2 = new float[36];
        d(fArr2, 0, -1.0f, 1.0f, 1.0f);
        GLES20.glGenTextures(5, iArr, 0);
        int i18 = 0;
        for (int i19 = 5; i18 < i19; i19 = 5) {
            GLES20.glBindTexture(3553, this.f24886k[i18]);
            if (i18 < 2) {
                i12 = 9729;
            } else {
                i12 = 9728;
            }
            GLES20.glTexParameteri(3553, 10241, i12);
            GLES20.glTexParameteri(3553, 10240, i18 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            int i20 = 4;
            if (i18 == 4) {
                int round = Math.round(i10 * 0.2f);
                int round2 = Math.round((i10 * 28) / 1536.0f);
                int i21 = (round - round2) - round2;
                Object obj2 = null;
                RLottieNative b10 = RLottieNative.b(AndroidUtilities.readRes(R.raw.plane_logo_plain), null, null, null);
                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ARGB_8888);
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
                            i15 = i21;
                            i16 = i22;
                            rLottieNative = b10;
                            i17 = i23;
                        } else {
                            int i25 = (i24 * 8) + 16;
                            i15 = i21;
                            rLottieNative = b10;
                            i16 = i22;
                            bitmap = createBitmap;
                            i17 = i23;
                            c(fArr, i25, i22 / 8.0f, i23 / 4.0f, (i22 + 1) / 8.0f, (i23 + 1) / 4.0f);
                            rLottieNative.c(i24 * 2, bitmap, true);
                            obj = null;
                            canvas.drawBitmap(bitmap, (i15 * i16) - round2, (i15 * i17) - round2, (Paint) null);
                        }
                        i21 = i15;
                        b10 = rLottieNative;
                        i23 = i17 + 1;
                        obj2 = obj;
                        createBitmap = bitmap;
                        i22 = i16;
                        i20 = 4;
                    }
                    i22++;
                    obj2 = obj2;
                    i20 = 4;
                }
                float e = a4.a.e(i21, this.f24879a, 2.0f, -1.0f);
                d(fArr2, 24, -1.0f, e, e);
                GLUtils.texImage2D(3553, 0, createBitmap2, 0);
                createBitmap2.recycle();
                createBitmap.recycle();
                b10.d();
            } else if (i18 == 3) {
                int round3 = Math.round((i10 * 372.0f) / 1536.0f);
                float f7 = (round3 / this.f24879a) * 2.0f;
                d(fArr2, 12, 1.0f - f7, f7 - 1.0f, 1.0f);
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
                if (i18 == 0) {
                    i13 = this.f24879a;
                } else {
                    i13 = 48;
                }
                if (i18 == 0) {
                    i14 = this.f24880b;
                } else {
                    i14 = 48;
                }
                GLES20.glTexImage2D(3553, 0, 6408, i13, i14, 0, 6408, 5121, null);
            }
            i18++;
        }
        GLES20.glBindTexture(3553, 0);
        GLES20.glGenFramebuffers(1, this.f24885j, 0);
        FloatBuffer h = org.telegram.messenger.em.h(ByteBuffer.allocateDirect(144));
        this.f24883g = h;
        h.put(fArr2).position(0);
        FloatBuffer h10 = org.telegram.messenger.em.h(ByteBuffer.allocateDirect(928));
        this.h = h10;
        h10.put(fArr).position(0);
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
        this.f24881c.a();
        this.e.a();
        this.f24882f.a();
        this.d.a();
        GLES20.glDeleteTextures(5, this.f24886k, 0);
        GLES20.glDeleteFramebuffers(1, this.f24885j, 0);
    }
}
