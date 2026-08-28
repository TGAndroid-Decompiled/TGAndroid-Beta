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
public final class l40 {
    public final int f30323a;
    public final int f30324b;
    public final FloatBuffer f30328g;
    public final FloatBuffer h;
    public final int[] f30331k;
    public final k40 f30325c = new k40(R.raw.round_blur_stage_0_frag);
    public final k40 d = new k40(R.raw.round_blur_stage_3_frag);
    public final i40 f30326e = new i40();
    public final j40 f30327f = new j40();
    public int f30329i = 0;
    public final int[] f30330j = new int[1];

    public l40(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        Canvas canvas;
        int i15;
        Bitmap bitmap;
        int i16;
        Object obj;
        int[] iArr = new int[5];
        this.f30331k = iArr;
        this.f30323a = i9;
        this.f30324b = i10;
        float[] fArr = new float[232];
        c(fArr, 0, 0.0f, 1.0f, 1.0f, 0.0f);
        c(fArr, 8, 0.0f, 0.0f, 1.0f, 1.0f);
        float[] fArr2 = new float[36];
        d(fArr2, 0, -1.0f, 1.0f, 1.0f);
        GLES20.glGenTextures(5, iArr, 0);
        int i17 = 0;
        for (int i18 = 5; i17 < i18; i18 = 5) {
            GLES20.glBindTexture(3553, this.f30331k[i17]);
            if (i17 < 2) {
                i11 = 9729;
            } else {
                i11 = 9728;
            }
            GLES20.glTexParameteri(3553, 10241, i11);
            GLES20.glTexParameteri(3553, 10240, i17 < 2 ? 9729 : 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            int i19 = 4;
            if (i17 == 4) {
                int round = Math.round(i9 * 0.2f);
                int round2 = Math.round((i9 * 28) / 1536.0f);
                int i20 = (round - round2) - round2;
                Object obj2 = null;
                RLottieNative b10 = RLottieNative.b(AndroidUtilities.readRes(R.raw.plane_logo_plain), "logo_plane", null, null, null);
                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ARGB_8888);
                Bitmap createBitmap2 = Bitmap.createBitmap(i20 * 8, i20 * 4, Bitmap.Config.ALPHA_8);
                Canvas canvas2 = new Canvas(createBitmap2);
                int i21 = 0;
                while (i21 < 8) {
                    int i22 = 0;
                    while (i22 < i19) {
                        int i23 = (i22 * 8) + i21;
                        if (i23 >= 27) {
                            canvas = canvas2;
                            i15 = i20;
                            i14 = i21;
                            obj = obj2;
                            i16 = i22;
                            bitmap = createBitmap;
                        } else {
                            int i24 = (i23 * 8) + 16;
                            i14 = i21;
                            canvas = canvas2;
                            i15 = i20;
                            bitmap = createBitmap;
                            i16 = i22;
                            c(fArr, i24, i21 / 8.0f, i22 / 4.0f, (i21 + 1) / 8.0f, (i22 + 1) / 4.0f);
                            b10.c(i23 * 2, bitmap, true);
                            obj = null;
                            canvas.drawBitmap(bitmap, (i15 * i14) - round2, (i15 * i16) - round2, (Paint) null);
                        }
                        i20 = i15;
                        i22 = i16 + 1;
                        canvas2 = canvas;
                        createBitmap = bitmap;
                        i21 = i14;
                        obj2 = obj;
                        i19 = 4;
                    }
                    i21++;
                    obj2 = obj2;
                    i19 = 4;
                }
                float b11 = org.telegram.ui.Cells.j2.b(i20, this.f30323a, 2.0f, -1.0f);
                d(fArr2, 24, -1.0f, b11, b11);
                GLUtils.texImage2D(3553, 0, createBitmap2, 0);
                createBitmap2.recycle();
                createBitmap.recycle();
                b10.d();
            } else if (i17 == 3) {
                int round3 = Math.round((i9 * 372.0f) / 1536.0f);
                float f10 = (round3 / this.f30323a) * 2.0f;
                d(fArr2, 12, 1.0f - f10, f10 - 1.0f, 1.0f);
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
                if (i17 == 0) {
                    i12 = this.f30323a;
                } else {
                    i12 = 48;
                }
                if (i17 == 0) {
                    i13 = this.f30324b;
                } else {
                    i13 = 48;
                }
                GLES20.glTexImage2D(3553, 0, 6408, i12, i13, 0, 6408, 5121, null);
            }
            i17++;
        }
        GLES20.glBindTexture(3553, 0);
        GLES20.glGenFramebuffers(1, this.f30330j, 0);
        FloatBuffer h = org.telegram.messenger.ll.h(ByteBuffer.allocateDirect(144));
        this.f30328g = h;
        h.put(fArr2).position(0);
        FloatBuffer h10 = org.telegram.messenger.ll.h(ByteBuffer.allocateDirect(928));
        this.h = h10;
        h10.put(fArr).position(0);
    }

    public static int a(int i9, int i10) {
        int glCreateShader = GLES20.glCreateShader(i9);
        if (glCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, AndroidUtilities.readRes(i10));
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

    public static void c(float[] fArr, int i9, float f10, float f11, float f12, float f13) {
        fArr[i9] = f10;
        fArr[i9 + 1] = f13;
        fArr[i9 + 2] = f12;
        fArr[i9 + 3] = f13;
        fArr[i9 + 4] = f10;
        fArr[i9 + 5] = f11;
        fArr[i9 + 6] = f12;
        fArr[i9 + 7] = f11;
    }

    public static void d(float[] fArr, int i9, float f10, float f11, float f12) {
        fArr[i9] = f10;
        fArr[i9 + 1] = -1.0f;
        fArr[i9 + 2] = 0.0f;
        fArr[i9 + 3] = f12;
        fArr[i9 + 4] = -1.0f;
        fArr[i9 + 5] = 0.0f;
        fArr[i9 + 6] = f10;
        fArr[i9 + 7] = f11;
        fArr[i9 + 8] = 0.0f;
        fArr[i9 + 9] = f12;
        fArr[i9 + 10] = f11;
        fArr[i9 + 11] = 0.0f;
    }

    public final void b() {
        this.f30325c.a();
        this.f30326e.a();
        this.f30327f.a();
        this.d.a();
        GLES20.glDeleteTextures(5, this.f30331k, 0);
        GLES20.glDeleteFramebuffers(1, this.f30330j, 0);
    }
}
