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

public final class q40 {

    public final int f31781a;

    public final int f31782b;

    public final FloatBuffer f31786g;
    public final FloatBuffer h;

    public final int[] f31789k;

    public final p40 f31783c = new p40(R.raw.round_blur_stage_0_frag);
    public final p40 d = new p40(R.raw.round_blur_stage_3_frag);

    public final n40 f31784e = new n40();

    public final o40 f31785f = new o40();

    public int f31787i = 0;

    public final int[] f31788j = new int[1];

    public q40(int i10, int i11) {
        int i12;
        Canvas canvas;
        int i13;
        Bitmap bitmap;
        int i14;
        Object obj;
        int[] iArr = new int[5];
        this.f31789k = iArr;
        this.f31781a = i10;
        this.f31782b = i11;
        float[] fArr = new float[232];
        c(fArr, 0, 0.0f, 1.0f, 1.0f, 0.0f);
        c(fArr, 8, 0.0f, 0.0f, 1.0f, 1.0f);
        float[] fArr2 = new float[36];
        d(fArr2, 0, -1.0f, 1.0f, 1.0f);
        GLES20.glGenTextures(5, iArr, 0);
        int i15 = 0;
        for (int i16 = 5; i15 < i16; i16 = 5) {
            GLES20.glBindTexture(3553, this.f31789k[i15]);
            GLES20.glTexParameteri(3553, 10241, i15 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10240, i15 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            int i17 = 4;
            if (i15 == 4) {
                int iRound = Math.round(i10 * 0.2f);
                int iRound2 = Math.round((i10 * 28) / 1536.0f);
                int i18 = (iRound - iRound2) - iRound2;
                Object obj2 = null;
                RLottieNative rLottieNativeB = RLottieNative.b(AndroidUtilities.readRes(R.raw.plane_logo_plain), "logo_plane", null, null, null);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound, Bitmap.Config.ARGB_8888);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i18 * 8, i18 * 4, Bitmap.Config.ALPHA_8);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                int i19 = 0;
                while (i19 < 8) {
                    int i20 = 0;
                    while (i20 < i17) {
                        int i21 = (i20 * 8) + i19;
                        if (i21 >= 27) {
                            canvas = canvas2;
                            i13 = i18;
                            i12 = i19;
                            obj = obj2;
                            i14 = i20;
                            bitmap = bitmapCreateBitmap;
                        } else {
                            int i22 = (i21 * 8) + 16;
                            i12 = i19;
                            canvas = canvas2;
                            i13 = i18;
                            bitmap = bitmapCreateBitmap;
                            i14 = i20;
                            c(fArr, i22, i19 / 8.0f, i20 / 4.0f, (i19 + 1) / 8.0f, (i20 + 1) / 4.0f);
                            rLottieNativeB.c(i21 * 2, bitmap, true);
                            obj = null;
                            canvas.drawBitmap(bitmap, (i13 * i12) - iRound2, (i13 * i14) - iRound2, (Paint) null);
                        }
                        i18 = i13;
                        i20 = i14 + 1;
                        canvas2 = canvas;
                        bitmapCreateBitmap = bitmap;
                        i19 = i12;
                        obj2 = obj;
                        i17 = 4;
                    }
                    i19++;
                    obj2 = obj2;
                    i17 = 4;
                }
                float fC = s3.c.c(i18, this.f31781a, 2.0f, -1.0f);
                d(fArr2, 24, -1.0f, fC, fC);
                GLUtils.texImage2D(3553, 0, bitmapCreateBitmap2, 0);
                bitmapCreateBitmap2.recycle();
                bitmapCreateBitmap.recycle();
                rLottieNativeB.d();
            } else if (i15 == 3) {
                int iRound3 = Math.round((i10 * 372.0f) / 1536.0f);
                float f10 = (iRound3 / this.f31781a) * 2.0f;
                d(fArr2, 12, 1.0f - f10, f10 - 1.0f, 1.0f);
                Bitmap bitmapFromRaw = AndroidUtilities.getBitmapFromRaw(R.raw.round_blur_overlay_text);
                if (bitmapFromRaw != null) {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapFromRaw, iRound3, iRound3, true);
                    Bitmap bitmapExtractAlpha = bitmapCreateScaledBitmap.extractAlpha();
                    GLUtils.texImage2D(3553, 0, bitmapExtractAlpha, 0);
                    bitmapExtractAlpha.recycle();
                    bitmapCreateScaledBitmap.recycle();
                    bitmapFromRaw.recycle();
                }
            } else {
                GLES20.glTexImage2D(3553, 0, 6408, i15 == 0 ? this.f31781a : 48, i15 == 0 ? this.f31782b : 48, 0, 6408, 5121, null);
            }
            i15++;
        }
        GLES20.glBindTexture(3553, 0);
        GLES20.glGenFramebuffers(1, this.f31788j, 0);
        FloatBuffer floatBufferF = org.telegram.messenger.rl.f(ByteBuffer.allocateDirect(144));
        this.f31786g = floatBufferF;
        floatBufferF.put(fArr2).position(0);
        FloatBuffer floatBufferF2 = org.telegram.messenger.rl.f(ByteBuffer.allocateDirect(928));
        this.h = floatBufferF2;
        floatBufferF2.put(fArr).position(0);
    }

    public static int a(int i10, int i11) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        if (iGlCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(iGlCreateShader, AndroidUtilities.readRes(i11));
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        FileLog.e("GlUtils: compile shader error: " + GLES20.glGetShaderInfoLog(iGlCreateShader));
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public static void c(float[] fArr, int i10, float f10, float f11, float f12, float f13) {
        fArr[i10] = f10;
        fArr[i10 + 1] = f13;
        fArr[i10 + 2] = f12;
        fArr[i10 + 3] = f13;
        fArr[i10 + 4] = f10;
        fArr[i10 + 5] = f11;
        fArr[i10 + 6] = f12;
        fArr[i10 + 7] = f11;
    }

    public static void d(float[] fArr, int i10, float f10, float f11, float f12) {
        fArr[i10] = f10;
        fArr[i10 + 1] = -1.0f;
        fArr[i10 + 2] = 0.0f;
        fArr[i10 + 3] = f12;
        fArr[i10 + 4] = -1.0f;
        fArr[i10 + 5] = 0.0f;
        fArr[i10 + 6] = f10;
        fArr[i10 + 7] = f11;
        fArr[i10 + 8] = 0.0f;
        fArr[i10 + 9] = f12;
        fArr[i10 + 10] = f11;
        fArr[i10 + 11] = 0.0f;
    }

    public final void b() {
        this.f31783c.a();
        this.f31784e.a();
        this.f31785f.a();
        this.d.a();
        GLES20.glDeleteTextures(5, this.f31789k, 0);
        GLES20.glDeleteFramebuffers(1, this.f31788j, 0);
    }
}
