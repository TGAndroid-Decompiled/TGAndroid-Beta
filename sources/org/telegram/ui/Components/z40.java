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
public final class z40 {
    public final int f35203a;
    public final int f35204b;
    public final FloatBuffer f35208g;
    public final FloatBuffer h;
    public final int[] f35211k;
    public final y40 f35205c = new y40(R.raw.round_blur_stage_0_frag);
    public final y40 d = new y40(R.raw.round_blur_stage_3_frag);
    public final w40 f35206e = new w40();
    public final x40 f35207f = new x40();
    public int f35209i = 0;
    public final int[] f35210j = new int[1];

    public z40(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        Canvas canvas;
        int i16;
        Bitmap bitmap;
        int i17;
        Object obj;
        int[] iArr = new int[5];
        this.f35211k = iArr;
        this.f35203a = i10;
        this.f35204b = i11;
        float[] fArr = new float[232];
        c(fArr, 0, 0.0f, 1.0f, 1.0f, 0.0f);
        c(fArr, 8, 0.0f, 0.0f, 1.0f, 1.0f);
        float[] fArr2 = new float[36];
        d(fArr2, 0, -1.0f, 1.0f, 1.0f);
        GLES20.glGenTextures(5, iArr, 0);
        int i18 = 0;
        for (int i19 = 5; i18 < i19; i19 = 5) {
            GLES20.glBindTexture(3553, this.f35211k[i18]);
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
                RLottieNative b10 = RLottieNative.b(AndroidUtilities.readRes(R.raw.plane_logo_plain), "logo_plane", null, null, null);
                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ARGB_8888);
                Bitmap createBitmap2 = Bitmap.createBitmap(i21 * 8, i21 * 4, Bitmap.Config.ALPHA_8);
                Canvas canvas2 = new Canvas(createBitmap2);
                int i22 = 0;
                while (i22 < 8) {
                    int i23 = 0;
                    while (i23 < i20) {
                        int i24 = (i23 * 8) + i22;
                        if (i24 >= 27) {
                            canvas = canvas2;
                            i16 = i21;
                            i15 = i22;
                            obj = obj2;
                            i17 = i23;
                            bitmap = createBitmap;
                        } else {
                            int i25 = (i24 * 8) + 16;
                            i15 = i22;
                            canvas = canvas2;
                            i16 = i21;
                            bitmap = createBitmap;
                            i17 = i23;
                            c(fArr, i25, i22 / 8.0f, i23 / 4.0f, (i22 + 1) / 8.0f, (i23 + 1) / 4.0f);
                            b10.c(i24 * 2, bitmap, true);
                            obj = null;
                            canvas.drawBitmap(bitmap, (i16 * i15) - round2, (i16 * i17) - round2, (Paint) null);
                        }
                        i21 = i16;
                        i23 = i17 + 1;
                        canvas2 = canvas;
                        createBitmap = bitmap;
                        i22 = i15;
                        obj2 = obj;
                        i20 = 4;
                    }
                    i22++;
                    obj2 = obj2;
                    i20 = 4;
                }
                float c3 = u3.c.c(i21, this.f35203a, 2.0f, -1.0f);
                d(fArr2, 24, -1.0f, c3, c3);
                GLUtils.texImage2D(3553, 0, createBitmap2, 0);
                createBitmap2.recycle();
                createBitmap.recycle();
                b10.d();
            } else if (i18 == 3) {
                int round3 = Math.round((i10 * 372.0f) / 1536.0f);
                float f9 = (round3 / this.f35203a) * 2.0f;
                d(fArr2, 12, 1.0f - f9, f9 - 1.0f, 1.0f);
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
                    i13 = this.f35203a;
                } else {
                    i13 = 48;
                }
                if (i18 == 0) {
                    i14 = this.f35204b;
                } else {
                    i14 = 48;
                }
                GLES20.glTexImage2D(3553, 0, 6408, i13, i14, 0, 6408, 5121, null);
            }
            i18++;
        }
        GLES20.glBindTexture(3553, 0);
        GLES20.glGenFramebuffers(1, this.f35210j, 0);
        FloatBuffer l10 = org.telegram.messenger.x3.l(ByteBuffer.allocateDirect(144));
        this.f35208g = l10;
        l10.put(fArr2).position(0);
        FloatBuffer l11 = org.telegram.messenger.x3.l(ByteBuffer.allocateDirect(928));
        this.h = l11;
        l11.put(fArr).position(0);
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

    public static void c(float[] fArr, int i10, float f9, float f10, float f11, float f12) {
        fArr[i10] = f9;
        fArr[i10 + 1] = f12;
        fArr[i10 + 2] = f11;
        fArr[i10 + 3] = f12;
        fArr[i10 + 4] = f9;
        fArr[i10 + 5] = f10;
        fArr[i10 + 6] = f11;
        fArr[i10 + 7] = f10;
    }

    public static void d(float[] fArr, int i10, float f9, float f10, float f11) {
        fArr[i10] = f9;
        fArr[i10 + 1] = -1.0f;
        fArr[i10 + 2] = 0.0f;
        fArr[i10 + 3] = f11;
        fArr[i10 + 4] = -1.0f;
        fArr[i10 + 5] = 0.0f;
        fArr[i10 + 6] = f9;
        fArr[i10 + 7] = f10;
        fArr[i10 + 8] = 0.0f;
        fArr[i10 + 9] = f11;
        fArr[i10 + 10] = f10;
        fArr[i10 + 11] = 0.0f;
    }

    public final void b() {
        this.f35205c.a();
        this.f35206e.a();
        this.f35207f.a();
        this.d.a();
        GLES20.glDeleteTextures(5, this.f35211k, 0);
        GLES20.glDeleteFramebuffers(1, this.f35210j, 0);
    }
}
